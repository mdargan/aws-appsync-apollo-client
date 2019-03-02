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
public final class DeleteAuctionItemInput implements InputType {
  private final @NotNull String id;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  DeleteAuctionItemInput(@NotNull String id) {
    this.id = id;
  }

  public @NotNull String id() {
    return this.id;
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
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= id.hashCode();
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
    if (o instanceof DeleteAuctionItemInput) {
      DeleteAuctionItemInput that = (DeleteAuctionItemInput) o;
      return this.id.equals(that.id);
    }
    return false;
  }

  public static final class Builder {
    private @NotNull String id;

    Builder() {
    }

    public Builder id(@NotNull String id) {
      this.id = id;
      return this;
    }

    public DeleteAuctionItemInput build() {
      Utils.checkNotNull(id, "id == null");
      return new DeleteAuctionItemInput(id);
    }
  }
}
