import com.amazonaws.SignableRequest;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.util.BinaryUtils;

import java.io.InputStream;

public class AppsyncV4Signer extends AWS4Signer {

    private static final String SERVICE_NAME_SCOPE = "appsync";

    private static final String RESOURCE_PATH = "/graphql";

    public AppsyncV4Signer(String region) {
        super(true);
        setRegionName(region);
        setServiceName(SERVICE_NAME_SCOPE);
    }

    @Override
    protected String getCanonicalizedResourcePath(String resourcePath) {
        return RESOURCE_PATH;
    }

    @Override
    protected String getCanonicalizedResourcePath(String resourcePath, boolean urlEncode) {
        return RESOURCE_PATH;
    }

    @Override
    protected String calculateContentHash(SignableRequest<?> request) {
        final InputStream payloadStream = request.getContent();
        payloadStream.mark(-1);
        final String contentSha256 = BinaryUtils.toHex(hash(payloadStream));
        // We will not reset this as ok http does not allow reset of stream.
        return contentSha256;

    }
}
