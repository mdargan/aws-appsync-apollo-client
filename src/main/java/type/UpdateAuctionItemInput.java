package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated("Apollo GraphQL")
public final class UpdateAuctionItemInput implements InputType {
  private final @NotNull String id;

  private final Input<String> title;

  private final Input<Integer> currentPrice;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  UpdateAuctionItemInput(@NotNull String id, Input<String> title, Input<Integer> currentPrice) {
    this.id = id;
    this.title = title;
    this.currentPrice = currentPrice;
  }

  public @NotNull String id() {
    return this.id;
  }

  public @Nullable String title() {
    return this.title.value;
  }

  public @Nullable Integer currentPrice() {
    return this.currentPrice.value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        writer.writeCustom("id", type.CustomType.ID, id);
        if (title.defined) {
          writer.writeString("title", title.value);
        }
        if (currentPrice.defined) {
          writer.writeInt("currentPrice", currentPrice.value);
        }
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= id.hashCode();
      h *= 1000003;
      h ^= title.hashCode();
      h *= 1000003;
      h ^= currentPrice.hashCode();
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
    if (o instanceof UpdateAuctionItemInput) {
      UpdateAuctionItemInput that = (UpdateAuctionItemInput) o;
      return this.id.equals(that.id)
       && this.title.equals(that.title)
       && this.currentPrice.equals(that.currentPrice);
    }
    return false;
  }

  public static final class Builder {
    private @NotNull String id;

    private Input<String> title = Input.absent();

    private Input<Integer> currentPrice = Input.absent();

    Builder() {
    }

    public Builder id(@NotNull String id) {
      this.id = id;
      return this;
    }

    public Builder title(@Nullable String title) {
      this.title = Input.fromNullable(title);
      return this;
    }

    public Builder currentPrice(@Nullable Integer currentPrice) {
      this.currentPrice = Input.fromNullable(currentPrice);
      return this;
    }

    public Builder titleInput(@NotNull Input<String> title) {
      this.title = Utils.checkNotNull(title, "title == null");
      return this;
    }

    public Builder currentPriceInput(@NotNull Input<Integer> currentPrice) {
      this.currentPrice = Utils.checkNotNull(currentPrice, "currentPrice == null");
      return this;
    }

    public UpdateAuctionItemInput build() {
      Utils.checkNotNull(id, "id == null");
      return new UpdateAuctionItemInput(id, title, currentPrice);
    }
  }
}
