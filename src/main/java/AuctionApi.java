import com.amazonaws.amplify.generated.graphql.CreateAuctionItemMutation;
import com.amazonaws.amplify.generated.graphql.ListAuctionItemsQuery;
import com.amazonaws.amplify.generated.graphql.UpdateAuctionItemMutation;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.subscription.WebSocketSubscriptionTransport;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import type.CreateAuctionItemInput;
import type.UpdateAuctionItemInput;

/**
 * Auction API implementation based on AWS Appsync
 */
public class AuctionApi {

    private static final String APPSYNC_API_URL = "https://***REMOVED***.appsync-api.us-east-1.amazonaws.com/graphql";

    private static final String AWS_REGION = "us-east-1";

    private static final String AWS_SERVICE = "appsync";

    private static final String AWS_ACCESS_KEY_ID = "***REMOVED***";

    private static final String AWS_SECRET_KEY = "***REMOVED***";

    private static ApolloClient apolloClient;

    private static AuctionApi instance;

    public static AuctionApi instance() {
        if (instance == null) {
            instance = new AuctionApi();
        }
        return instance;
    }

    private AuctionApi() {
        AwsSigningIAMInterceptor authIAMInterceptor = new AwsSigningIAMInterceptor(
                AWS_REGION, AWS_SERVICE, AWS_ACCESS_KEY_ID, AWS_SECRET_KEY
        );

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.NONE);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(authIAMInterceptor)
                .addInterceptor(logging)
                .build();

        apolloClient = ApolloClient.builder()
                .serverUrl(APPSYNC_API_URL)
                .okHttpClient(okHttpClient)
                .build();
    }

    public void fetchItems(
            @NotNull ApolloCall.Callback<ListAuctionItemsQuery.Data> callback, int limit) {

        final ListAuctionItemsQuery listQuery = ListAuctionItemsQuery.builder()
                .limit(limit)
                .build();

        apolloClient.query(listQuery).enqueue(callback);
    }

    public void createItem(String itemName, int startPrice,
                           ApolloCall.Callback<CreateAuctionItemMutation.Data> callback) {
        final CreateAuctionItemMutation createAuctionItem = CreateAuctionItemMutation.builder()
                .input(CreateAuctionItemInput.builder()
                        .title(itemName)
                        .currentPrice(startPrice)
                        .build())
                .build();

        apolloClient.mutate(createAuctionItem).enqueue(callback);
    }

    public void setBid(String itemId, int newBid, @NotNull ApolloCall.Callback<UpdateAuctionItemMutation.Data> callback) {
        final UpdateAuctionItemMutation updateAuctionItem = UpdateAuctionItemMutation.builder()
                .input(UpdateAuctionItemInput.builder()
                        .id(itemId)
                        .currentPrice(newBid)
                        .build())
                .build();
        apolloClient.mutate(updateAuctionItem).enqueue(callback);
    }
}
