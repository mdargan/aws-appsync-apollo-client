import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.ShellFactory;
import com.amazonaws.amplify.generated.graphql.CreateAuctionItemMutation;
import com.amazonaws.amplify.generated.graphql.ListAuctionItemsQuery;
import com.amazonaws.amplify.generated.graphql.UpdateAuctionItemMutation;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuctionApplication {

    List<ListAuctionItemsQuery.Item> currentItems = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ShellFactory.createConsoleShell("@", "auction", new AuctionApplication())
                    .commandLoop();
        } catch (IOException e) {
            System.out.println("Internal shell error");
        }
    }

    @Command(name = "list")
    @SuppressWarnings("unused")
    public String listItems() {

        final StringBuilder commandResult = new StringBuilder();
        AuctionApi.instance().fetchItems(new ApolloCall.Callback<ListAuctionItemsQuery.Data>() {

            @Override
            public void onResponse(Response<ListAuctionItemsQuery.Data> dataResponse) {

                if (dataResponse.errors().size() > 0) {
                    dataResponse.errors().forEach(e -> System.err.println(e.message()));
                    return;
                }

                currentItems = dataResponse.data().listAuctionItems().items();
                System.out.println();
                String leftAlignFormat = "| %-4d | %-17s | %-5d |%n";
                System.out.format("+------+-------------------+-------+%n");
                System.out.format("| ID   |  Item name        | Price |%n");
                System.out.format("+------+-------------------+-------+%n");

                for (int i = 0; i < currentItems.size(); i++) {
                    ListAuctionItemsQuery.Item current = currentItems.get(i);
                    System.out.format(leftAlignFormat, i, current.title(), current.currentPrice());
                }
                System.out.format("+------+-------------------+-------+%n");
            }

            @Override
            public void onFailure(ApolloException e) {

                System.err.println("Failure: " + e.getLocalizedMessage());
            }
        }, 100);
        return "fetching items...";
    }

    @Command(name = "new")
    public String createItem(
            @Param(name = "title", description = "Item title") String title,
            @Param(name = "price", description = "Item start price") int price) {

        if (price <= 0) {
            return "Item price should be higher than 0";
        }
        AuctionApi.instance().createItem(title, price,
                new ApolloCall.Callback<CreateAuctionItemMutation.Data>() {

                    @Override
                    public void onResponse(Response<CreateAuctionItemMutation.Data> dataResponse) {

                        if (dataResponse.errors().size() > 0) {
                            dataResponse.errors().forEach(e -> System.err.println(e.message()));
                            return;
                        }

                        System.out.println("Item created successfully");
                        System.out.println("Item name: " + dataResponse.data().createAuctionItem().title());
                        System.out.println("Item start price: " + dataResponse.data().createAuctionItem().currentPrice());
                    }

                    @Override
                    public void onFailure(ApolloException e) {
                        System.err.println("Failure: " + e.getLocalizedMessage());
                    }
                });
        return "creating new item...";
    }

    @Command(name = "bid", description = "Set new bid for auction item")
    public String setBid(
            @Param(name = "id", description = "Item identifier") int index,
            @Param(name = "price", description = "New bid price") int newBid) {

        if (index < 0 || index >= currentItems.size()) {
            return "Item ID is incorrect";
        }
        ListAuctionItemsQuery.Item bidItem = currentItems.get(index);

        if (newBid <= bidItem.currentPrice()) {
            return "Bid amount should be higher than current price";
        }

        AuctionApi.instance().setBid(bidItem.id(), newBid,
                new ApolloCall.Callback<UpdateAuctionItemMutation.Data>() {

                    @Override
                    public void onResponse(Response<UpdateAuctionItemMutation.Data> dataResponse) {

                        if (dataResponse.errors().size() > 0) {
                            dataResponse.errors().forEach(e -> System.err.println(e.message()));
                            return;
                        }

                        System.out.println("Bid posted  successfully. New amount is " + dataResponse.data()
                                .updateAuctionItem().currentPrice());
                    }

                    @Override
                    public void onFailure(ApolloException e) {
                        System.err.println("Failure: " + e.getLocalizedMessage());
                    }
                });

        return "setting new bid amount...";
    }
}
