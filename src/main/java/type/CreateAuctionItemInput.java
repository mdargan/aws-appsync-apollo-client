package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.jetbrains.annotations.NotNull;

@Generated("Apollo GraphQL")
public final class CreateAuctionItemInput implements InputType {
  private final @NotNull String title;

  private final int currentPrice;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  CreateAuctionItemInput(@NotNull String title, int currentPrice) {
    this.title = title;
    this.currentPrice = currentPrice;
  }

  public @NotNull String title() {
    return this.title;
  }

  public int currentPrice() {
    return this.currentPrice;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        writer.writeString("title", title);
        writer.writeInt("currentPrice", currentPrice);
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= title.hashCode();
      h *= 1000003;
      h ^= currentPrice;
      $hashCode = h;
      $hashCodeMemoized = true;
    }
    return $hashCode;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateAuctionItemInput) {
      CreateAuctionItemInput that = (CreateAuctionItemInput) o;
      return this.title.equals(that.title)
       && this.currentPrice == that.currentPrice;
    }
    return false;
  }

  public static final class Builder {
    private @NotNull String title;

    private int currentPrice;

    Builder() {
    }

    public Builder title(@NotNull String title) {
      this.title = title;
      return this;
    }

    public Builder currentPrice(int currentPrice) {
      this.currentPrice = currentPrice;
      return this;
    }

    public CreateAuctionItemInput build() {
      Utils.checkNotNull(title, "title == null");
      return new CreateAuctionItemInput(title, currentPrice);
    }
  }
}
