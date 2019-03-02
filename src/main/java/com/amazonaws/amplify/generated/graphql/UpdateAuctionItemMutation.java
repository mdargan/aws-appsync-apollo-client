package com.amazonaws.amplify.generated.graphql;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import type.CustomType;
import type.UpdateAuctionItemInput;

@Generated("Apollo GraphQL")
public final class UpdateAuctionItemMutation implements Mutation<UpdateAuctionItemMutation.Data, UpdateAuctionItemMutation.Data, UpdateAuctionItemMutation.Variables> {
  public static final String OPERATION_ID = "5982ddfce87dc72caade9d582cd650705b2c3916a44eb1e471a16f7d51c96ed5";

  public static final String QUERY_DOCUMENT = "mutation UpdateAuctionItem($input: UpdateAuctionItemInput!) {\n"
      + "  updateAuctionItem(input: $input) {\n"
      + "    __typename\n"
      + "    id\n"
      + "    title\n"
      + "    currentPrice\n"
      + "  }\n"
      + "}";

  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "UpdateAuctionItem";
    }
  };

  private final UpdateAuctionItemMutation.Variables variables;

  public UpdateAuctionItemMutation(@NotNull UpdateAuctionItemInput input) {
    Utils.checkNotNull(input, "input == null");
    variables = new UpdateAuctionItemMutation.Variables(input);
  }

  @Override
  public String operationId() {
    return OPERATION_ID;
  }

  @Override
  public String queryDocument() {
    return QUERY_DOCUMENT;
  }

  @Override
  public UpdateAuctionItemMutation.Data wrapData(UpdateAuctionItemMutation.Data data) {
    return data;
  }

  @Override
  public UpdateAuctionItemMutation.Variables variables() {
    return variables;
  }

  @Override
  public ResponseFieldMapper<UpdateAuctionItemMutation.Data> responseFieldMapper() {
    return new Data.Mapper();
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public OperationName name() {
    return OPERATION_NAME;
  }

  public static final class Builder {
    private @NotNull UpdateAuctionItemInput input;

    Builder() {
    }

    public Builder input(@NotNull UpdateAuctionItemInput input) {
      this.input = input;
      return this;
    }

    public UpdateAuctionItemMutation build() {
      Utils.checkNotNull(input, "input == null");
      return new UpdateAuctionItemMutation(input);
    }
  }

  public static final class Variables extends Operation.Variables {
    private final @NotNull UpdateAuctionItemInput input;

    private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

    Variables(@NotNull UpdateAuctionItemInput input) {
      this.input = input;
      this.valueMap.put("input", input);
    }

    public @NotNull UpdateAuctionItemInput input() {
      return input;
    }

    @Override
    public Map<String, Object> valueMap() {
      return Collections.unmodifiableMap(valueMap);
    }

    @Override
    public InputFieldMarshaller marshaller() {
      return new InputFieldMarshaller() {
        @Override
        public void marshal(InputFieldWriter writer) throws IOException {
          writer.writeObject("input", input.marshaller());
        }
      };
    }
  }

  public static class Data implements Operation.Data {
    static final ResponseField[] $responseFields = {
      ResponseField.forObject("updateAuctionItem", "updateAuctionItem", new UnmodifiableMapBuilder<String, Object>(1)
      .put("input", new UnmodifiableMapBuilder<String, Object>(2)
        .put("kind", "Variable")
        .put("variableName", "input")
        .build())
      .build(), true, Collections.<ResponseField.Condition>emptyList())
    };

    final @Nullable UpdateAuctionItem updateAuctionItem;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@Nullable UpdateAuctionItem updateAuctionItem) {
      this.updateAuctionItem = updateAuctionItem;
    }

    public @Nullable UpdateAuctionItem updateAuctionItem() {
      return this.updateAuctionItem;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], updateAuctionItem != null ? updateAuctionItem.marshaller() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "updateAuctionItem=" + updateAuctionItem
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Data) {
        Data that = (Data) o;
        return ((this.updateAuctionItem == null) ? (that.updateAuctionItem == null) : this.updateAuctionItem.equals(that.updateAuctionItem));
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= (updateAuctionItem == null) ? 0 : updateAuctionItem.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final UpdateAuctionItem.Mapper updateAuctionItemFieldMapper = new UpdateAuctionItem.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final UpdateAuctionItem updateAuctionItem = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<UpdateAuctionItem>() {
          @Override
          public UpdateAuctionItem read(ResponseReader reader) {
            return updateAuctionItemFieldMapper.map(reader);
          }
        });
        return new Data(updateAuctionItem);
      }
    }
  }

  public static class UpdateAuctionItem {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forCustomType("id", "id", null, false, CustomType.ID, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("title", "title", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forInt("currentPrice", "currentPrice", null, false, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final @NotNull String id;

    final @NotNull String title;

    final int currentPrice;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public UpdateAuctionItem(@NotNull String __typename, @NotNull String id, @NotNull String title,
        int currentPrice) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.id = Utils.checkNotNull(id, "id == null");
      this.title = Utils.checkNotNull(title, "title == null");
      this.currentPrice = currentPrice;
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    public @NotNull String id() {
      return this.id;
    }

    public @NotNull String title() {
      return this.title;
    }

    public int currentPrice() {
      return this.currentPrice;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeCustom((ResponseField.CustomTypeField) $responseFields[1], id);
          writer.writeString($responseFields[2], title);
          writer.writeInt($responseFields[3], currentPrice);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "UpdateAuctionItem{"
          + "__typename=" + __typename + ", "
          + "id=" + id + ", "
          + "title=" + title + ", "
          + "currentPrice=" + currentPrice
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof UpdateAuctionItem) {
        UpdateAuctionItem that = (UpdateAuctionItem) o;
        return this.__typename.equals(that.__typename)
         && this.id.equals(that.id)
         && this.title.equals(that.title)
         && this.currentPrice == that.currentPrice;
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= id.hashCode();
        h *= 1000003;
        h ^= title.hashCode();
        h *= 1000003;
        h ^= currentPrice;
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<UpdateAuctionItem> {
      @Override
      public UpdateAuctionItem map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String id = reader.readCustomType((ResponseField.CustomTypeField) $responseFields[1]);
        final String title = reader.readString($responseFields[2]);
        final int currentPrice = reader.readInt($responseFields[3]);
        return new UpdateAuctionItem(__typename, id, title, currentPrice);
      }
    }
  }
}
