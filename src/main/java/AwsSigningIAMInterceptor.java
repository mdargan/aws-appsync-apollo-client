import com.amazonaws.DefaultRequest;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.VersionInfoUtils;
import okhttp3.*;
import okio.Buffer;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * Interceptor for OkHttp implementing AWS v4 signing algorithm
 *
 * @author Max Dargan
 */
public class AwsSigningIAMInterceptor implements Interceptor {

    private String accessKeyId;

    private String secretAccessKey;

    private String region;

    private String service;

    @SuppressWarnings("unused")
    private AwsSigningIAMInterceptor() {
        //Prevent default initialization
    }

    public AwsSigningIAMInterceptor(String region, String service,
                                    String accessKeyId, String secretAccessKey) {

        this.region = region;
        this.service = service;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();

        //Clone the request into a new DefaultRequest object and populate it with credentials
        DefaultRequest dr = new DefaultRequest(this.service);
        //set the endpoint
        dr.setEndpoint(request.url().uri());
        //copy all the headers
        for (String headerName : request.headers().names()) {
            dr.addHeader(headerName, request.header(headerName));
        }
        //set the http method
        dr.setHttpMethod(HttpMethodName.valueOf(request.method()));

        //Add User Agent
        dr.addHeader("User-Agent", VersionInfoUtils.getUserAgent());

        //write the body to a byte array stream.
        final Buffer buffer = new Buffer();
        request.body().writeTo(buffer);
        dr.setContent(buffer.inputStream());

        Buffer body = buffer.clone();

        try {
            //sign the request
            BasicAWSCredentials credentials = new BasicAWSCredentials(this.accessKeyId, this.secretAccessKey);
            new AppsyncV4Signer(this.region).sign(dr, credentials);
        } catch (Exception e) {
            throw new IOException("Failed to read credentials to sign the request.", e);
        }
        //Copy the signed/credentialed request back into an OKHTTP Request object.
        Request.Builder okReqBuilder = new Request.Builder();

        //set the headers from default request, since it contains the signed headers as well.
        for (Map.Entry<String, String> e : (Set<Map.Entry<String, String>>)dr.getHeaders().entrySet()) {
            okReqBuilder.addHeader(e.getKey(), e.getValue());
        }

        //Set the URL and Method
        okReqBuilder.url(request.url());
        okReqBuilder.method(request.method(), RequestBody.create(
                MediaType.get("application/json"), body.readByteArray()));

        //continue with chain.
        return chain.proceed(okReqBuilder.build());
    }
}
