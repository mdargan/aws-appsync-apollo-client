package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated("Apollo GraphQL")
public final class TableAuctionItemFilterInput implements InputType {
  private final Input<TableIDFilterInput> id;

  private final Input<TableStringFilterInput> title;

  private final Input<TableIntFilterInput> currentPrice;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  TableAuctionItemFilterInput(Input<TableIDFilterInput> id, Input<TableStringFilterInput> title,
      Input<TableIntFilterInput> currentPrice) {
    this.id = id;
    this.title = title;
    this.currentPrice = currentPrice;
  }

  public @Nullable TableIDFilterInput id() {
    return this.id.value;
  }

  public @Nullable TableStringFilterInput title() {
    return this.title.value;
  }

  public @Nullable TableIntFilterInput currentPrice() {
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
        if (id.defined) {
          writer.writeObject("id", id.value != null ? id.value.marshaller() : null);
        }
        if (title.defined) {
          writer.writeObject("title", title.value != null ? title.value.marshaller() : null);
        }
        if (currentPrice.defined) {
          writer.writeObject("currentPrice", currentPrice.value != null ? currentPrice.value.marshaller() : null);
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
    if (o instanceof TableAuctionItemFilterInput) {
      TableAuctionItemFilterInput that = (TableAuctionItemFilterInput) o;
      return this.id.equals(that.id)
       && this.title.equals(that.title)
       && this.currentPrice.equals(that.currentPrice);
    }
    return false;
  }

  public static final class Builder {
    private Input<TableIDFilterInput> id = Input.absent();

    private Input<TableStringFilterInput> title = Input.absent();

    private Input<TableIntFilterInput> currentPrice = Input.absent();

    Builder() {
    }

    public Builder id(@Nullable TableIDFilterInput id) {
      this.id = Input.fromNullable(id);
      return this;
    }

    public Builder title(@Nullable TableStringFilterInput title) {
      this.title = Input.fromNullable(title);
      return this;
    }

    public Builder currentPrice(@Nullable TableIntFilterInput currentPrice) {
      this.currentPrice = Input.fromNullable(currentPrice);
      return this;
    }

    public Builder idInput(@NotNull Input<TableIDFilterInput> id) {
      this.id = Utils.checkNotNull(id, "id == null");
      return this;
    }

    public Builder titleInput(@NotNull Input<TableStringFilterInput> title) {
      this.title = Utils.checkNotNull(title, "title == null");
      return this;
    }

    public Builder currentPriceInput(@NotNull Input<TableIntFilterInput> currentPrice) {
      this.currentPrice = Utils.checkNotNull(currentPrice, "currentPrice == null");
      return this;
    }

    public TableAuctionItemFilterInput build() {
      return new TableAuctionItemFilterInput(id, title, currentPrice);
    }
  }
}
