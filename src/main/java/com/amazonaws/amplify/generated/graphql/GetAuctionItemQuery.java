package com.amazonaws.amplify.generated.graphql;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
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

@Generated("Apollo GraphQL")
public final class GetAuctionItemQuery implements Query<GetAuctionItemQuery.Data, GetAuctionItemQuery.Data, GetAuctionItemQuery.Variables> {
  public static final String OPERATION_ID = "37b6b9dea75c3cd3f040bd9ca5c6e9655f4e49e1f5dd5b0870135007e1461dee";

  public static final String QUERY_DOCUMENT = "query GetAuctionItem($id: ID!) {\n"
      + "  getAuctionItem(id: $id) {\n"
      + "    __typename\n"
      + "    id\n"
      + "    title\n"
      + "    currentPrice\n"
      + "  }\n"
      + "}";

  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "GetAuctionItem";
    }
  };

  private final GetAuctionItemQuery.Variables variables;

  public GetAuctionItemQuery(@NotNull String id) {
    Utils.checkNotNull(id, "id == null");
    variables = new GetAuctionItemQuery.Variables(id);
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
  public GetAuctionItemQuery.Data wrapData(GetAuctionItemQuery.Data data) {
    return data;
  }

  @Override
  public GetAuctionItemQuery.Variables variables() {
    return variables;
  }

  @Override
  public ResponseFieldMapper<GetAuctionItemQuery.Data> responseFieldMapper() {
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
    private @NotNull String id;

    Builder() {
    }

    public Builder id(@NotNull String id) {
      this.id = id;
      return this;
    }

    public GetAuctionItemQuery build() {
      Utils.checkNotNull(id, "id == null");
      return new GetAuctionItemQuery(id);
    }
  }

  public static final class Variables extends Operation.Variables {
    private final @NotNull String id;

    private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

    Variables(@NotNull String id) {
      this.id = id;
      this.valueMap.put("id", id);
    }

    public @NotNull String id() {
      return id;
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
          writer.writeCustom("id", type.CustomType.ID, id);
        }
      };
    }
  }

  public static class Data implements Operation.Data {
    static final ResponseField[] $responseFields = {
      ResponseField.forObject("getAuctionItem", "getAuctionItem", new UnmodifiableMapBuilder<String, Object>(1)
      .put("id", new UnmodifiableMapBuilder<String, Object>(2)
        .put("kind", "Variable")
        .put("variableName", "id")
        .build())
      .build(), true, Collections.<ResponseField.Condition>emptyList())
    };

    final @Nullable GetAuctionItem getAuctionItem;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@Nullable GetAuctionItem getAuctionItem) {
      this.getAuctionItem = getAuctionItem;
    }

    public @Nullable GetAuctionItem getAuctionItem() {
      return this.getAuctionItem;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], getAuctionItem != null ? getAuctionItem.marshaller() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "getAuctionItem=" + getAuctionItem
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
        return ((this.getAuctionItem == null) ? (that.getAuctionItem == null) : this.getAuctionItem.equals(that.getAuctionItem));
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= (getAuctionItem == null) ? 0 : getAuctionItem.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final GetAuctionItem.Mapper getAuctionItemFieldMapper = new GetAuctionItem.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final GetAuctionItem getAuctionItem = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<GetAuctionItem>() {
          @Override
          public GetAuctionItem read(ResponseReader reader) {
            return getAuctionItemFieldMapper.map(reader);
          }
        });
        return new Data(getAuctionItem);
      }
    }
  }

  public static class GetAuctionItem {
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

    public GetAuctionItem(@NotNull String __typename, @NotNull String id, @NotNull String title,
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
        $toString = "GetAuctionItem{"
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
      if (o instanceof GetAuctionItem) {
        GetAuctionItem that = (GetAuctionItem) o;
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

    public static final class Mapper implements ResponseFieldMapper<GetAuctionItem> {
      @Override
      public GetAuctionItem map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String id = reader.readCustomType((ResponseField.CustomTypeField) $responseFields[1]);
        final String title = reader.readString($responseFields[2]);
        final int currentPrice = reader.readInt($responseFields[3]);
        return new GetAuctionItem(__typename, id, title, currentPrice);
      }
    }
  }
}
