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
import type.DeleteAuctionItemInput;

@Generated("Apollo GraphQL")
public final class DeleteAuctionItemMutation implements Mutation<DeleteAuctionItemMutation.Data, DeleteAuctionItemMutation.Data, DeleteAuctionItemMutation.Variables> {
  public static final String OPERATION_ID = "8ffbb32a2b8b64306c52f5a201bd5a6e940896d022393b6f7dadb5406301d74a";

  public static final String QUERY_DOCUMENT = "mutation DeleteAuctionItem($input: DeleteAuctionItemInput!) {\n"
      + "  deleteAuctionItem(input: $input) {\n"
      + "    __typename\n"
      + "    id\n"
      + "    title\n"
      + "    currentPrice\n"
      + "  }\n"
      + "}";

  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "DeleteAuctionItem";
    }
  };

  private final DeleteAuctionItemMutation.Variables variables;

  public DeleteAuctionItemMutation(@NotNull DeleteAuctionItemInput input) {
    Utils.checkNotNull(input, "input == null");
    variables = new DeleteAuctionItemMutation.Variables(input);
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
  public DeleteAuctionItemMutation.Data wrapData(DeleteAuctionItemMutation.Data data) {
    return data;
  }

  @Override
  public DeleteAuctionItemMutation.Variables variables() {
    return variables;
  }

  @Override
  public ResponseFieldMapper<DeleteAuctionItemMutation.Data> responseFieldMapper() {
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
    private @NotNull DeleteAuctionItemInput input;

    Builder() {
    }

    public Builder input(@NotNull DeleteAuctionItemInput input) {
      this.input = input;
      return this;
    }

    public DeleteAuctionItemMutation build() {
      Utils.checkNotNull(input, "input == null");
      return new DeleteAuctionItemMutation(input);
    }
  }

  public static final class Variables extends Operation.Variables {
    private final @NotNull DeleteAuctionItemInput input;

    private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

    Variables(@NotNull DeleteAuctionItemInput input) {
      this.input = input;
      this.valueMap.put("input", input);
    }

    public @NotNull DeleteAuctionItemInput input() {
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
      ResponseField.forObject("deleteAuctionItem", "deleteAuctionItem", new UnmodifiableMapBuilder<String, Object>(1)
      .put("input", new UnmodifiableMapBuilder<String, Object>(2)
        .put("kind", "Variable")
        .put("variableName", "input")
        .build())
      .build(), true, Collections.<ResponseField.Condition>emptyList())
    };

    final @Nullable DeleteAuctionItem deleteAuctionItem;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@Nullable DeleteAuctionItem deleteAuctionItem) {
      this.deleteAuctionItem = deleteAuctionItem;
    }

    public @Nullable DeleteAuctionItem deleteAuctionItem() {
      return this.deleteAuctionItem;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], deleteAuctionItem != null ? deleteAuctionItem.marshaller() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "deleteAuctionItem=" + deleteAuctionItem
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
        return ((this.deleteAuctionItem == null) ? (that.deleteAuctionItem == null) : this.deleteAuctionItem.equals(that.deleteAuctionItem));
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= (deleteAuctionItem == null) ? 0 : deleteAuctionItem.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final DeleteAuctionItem.Mapper deleteAuctionItemFieldMapper = new DeleteAuctionItem.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final DeleteAuctionItem deleteAuctionItem = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<DeleteAuctionItem>() {
          @Override
          public DeleteAuctionItem read(ResponseReader reader) {
            return deleteAuctionItemFieldMapper.map(reader);
          }
        });
        return new Data(deleteAuctionItem);
      }
    }
  }

  public static class DeleteAuctionItem {
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

    public DeleteAuctionItem(@NotNull String __typename, @NotNull String id, @NotNull String title,
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
        $toString = "DeleteAuctionItem{"
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
      if (o instanceof DeleteAuctionItem) {
        DeleteAuctionItem that = (DeleteAuctionItem) o;
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

    public static final class Mapper implements ResponseFieldMapper<DeleteAuctionItem> {
      @Override
      public DeleteAuctionItem map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String id = reader.readCustomType((ResponseField.CustomTypeField) $responseFields[1]);
        final String title = reader.readString($responseFields[2]);
        final int currentPrice = reader.readInt($responseFields[3]);
        return new DeleteAuctionItem(__typename, id, title, currentPrice);
      }
    }
  }
}
