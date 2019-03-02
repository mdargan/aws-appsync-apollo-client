package com.amazonaws.amplify.generated.graphql;

import com.apollographql.apollo.api.Input;
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
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import type.CustomType;
import type.TableAuctionItemFilterInput;

@Generated("Apollo GraphQL")
public final class ListAuctionItemsQuery implements Query<ListAuctionItemsQuery.Data, ListAuctionItemsQuery.Data, ListAuctionItemsQuery.Variables> {
  public static final String OPERATION_ID = "f41bb654693f9f0b7f453507752aa0f8a90f74e69ebb7b15761191c0db0ddf04";

  public static final String QUERY_DOCUMENT = "query ListAuctionItems($filter: TableAuctionItemFilterInput, $limit: Int, $nextToken: String) {\n"
      + "  listAuctionItems(filter: $filter, limit: $limit, nextToken: $nextToken) {\n"
      + "    __typename\n"
      + "    items {\n"
      + "      __typename\n"
      + "      id\n"
      + "      title\n"
      + "      currentPrice\n"
      + "    }\n"
      + "    nextToken\n"
      + "  }\n"
      + "}";

  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "ListAuctionItems";
    }
  };

  private final ListAuctionItemsQuery.Variables variables;

  public ListAuctionItemsQuery(@NotNull Input<TableAuctionItemFilterInput> filter,
      @NotNull Input<Integer> limit, @NotNull Input<String> nextToken) {
    Utils.checkNotNull(filter, "filter == null");
    Utils.checkNotNull(limit, "limit == null");
    Utils.checkNotNull(nextToken, "nextToken == null");
    variables = new ListAuctionItemsQuery.Variables(filter, limit, nextToken);
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
  public ListAuctionItemsQuery.Data wrapData(ListAuctionItemsQuery.Data data) {
    return data;
  }

  @Override
  public ListAuctionItemsQuery.Variables variables() {
    return variables;
  }

  @Override
  public ResponseFieldMapper<ListAuctionItemsQuery.Data> responseFieldMapper() {
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
    private Input<TableAuctionItemFilterInput> filter = Input.absent();

    private Input<Integer> limit = Input.absent();

    private Input<String> nextToken = Input.absent();

    Builder() {
    }

    public Builder filter(@Nullable TableAuctionItemFilterInput filter) {
      this.filter = Input.fromNullable(filter);
      return this;
    }

    public Builder limit(@Nullable Integer limit) {
      this.limit = Input.fromNullable(limit);
      return this;
    }

    public Builder nextToken(@Nullable String nextToken) {
      this.nextToken = Input.fromNullable(nextToken);
      return this;
    }

    public Builder filterInput(@NotNull Input<TableAuctionItemFilterInput> filter) {
      this.filter = Utils.checkNotNull(filter, "filter == null");
      return this;
    }

    public Builder limitInput(@NotNull Input<Integer> limit) {
      this.limit = Utils.checkNotNull(limit, "limit == null");
      return this;
    }

    public Builder nextTokenInput(@NotNull Input<String> nextToken) {
      this.nextToken = Utils.checkNotNull(nextToken, "nextToken == null");
      return this;
    }

    public ListAuctionItemsQuery build() {
      return new ListAuctionItemsQuery(filter, limit, nextToken);
    }
  }

  public static final class Variables extends Operation.Variables {
    private final Input<TableAuctionItemFilterInput> filter;

    private final Input<Integer> limit;

    private final Input<String> nextToken;

    private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

    Variables(Input<TableAuctionItemFilterInput> filter, Input<Integer> limit,
        Input<String> nextToken) {
      this.filter = filter;
      this.limit = limit;
      this.nextToken = nextToken;
      if (filter.defined) {
        this.valueMap.put("filter", filter.value);
      }
      if (limit.defined) {
        this.valueMap.put("limit", limit.value);
      }
      if (nextToken.defined) {
        this.valueMap.put("nextToken", nextToken.value);
      }
    }

    public Input<TableAuctionItemFilterInput> filter() {
      return filter;
    }

    public Input<Integer> limit() {
      return limit;
    }

    public Input<String> nextToken() {
      return nextToken;
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
          if (filter.defined) {
            writer.writeObject("filter", filter.value != null ? filter.value.marshaller() : null);
          }
          if (limit.defined) {
            writer.writeInt("limit", limit.value);
          }
          if (nextToken.defined) {
            writer.writeString("nextToken", nextToken.value);
          }
        }
      };
    }
  }

  public static class Data implements Operation.Data {
    static final ResponseField[] $responseFields = {
      ResponseField.forObject("listAuctionItems", "listAuctionItems", new UnmodifiableMapBuilder<String, Object>(3)
      .put("filter", new UnmodifiableMapBuilder<String, Object>(2)
        .put("kind", "Variable")
        .put("variableName", "filter")
        .build())
      .put("limit", new UnmodifiableMapBuilder<String, Object>(2)
        .put("kind", "Variable")
        .put("variableName", "limit")
        .build())
      .put("nextToken", new UnmodifiableMapBuilder<String, Object>(2)
        .put("kind", "Variable")
        .put("variableName", "nextToken")
        .build())
      .build(), true, Collections.<ResponseField.Condition>emptyList())
    };

    final @Nullable ListAuctionItems listAuctionItems;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@Nullable ListAuctionItems listAuctionItems) {
      this.listAuctionItems = listAuctionItems;
    }

    public @Nullable ListAuctionItems listAuctionItems() {
      return this.listAuctionItems;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], listAuctionItems != null ? listAuctionItems.marshaller() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "listAuctionItems=" + listAuctionItems
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
        return ((this.listAuctionItems == null) ? (that.listAuctionItems == null) : this.listAuctionItems.equals(that.listAuctionItems));
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= (listAuctionItems == null) ? 0 : listAuctionItems.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final ListAuctionItems.Mapper listAuctionItemsFieldMapper = new ListAuctionItems.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final ListAuctionItems listAuctionItems = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<ListAuctionItems>() {
          @Override
          public ListAuctionItems read(ResponseReader reader) {
            return listAuctionItemsFieldMapper.map(reader);
          }
        });
        return new Data(listAuctionItems);
      }
    }
  }

  public static class ListAuctionItems {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forList("items", "items", null, true, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("nextToken", "nextToken", null, true, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final @Nullable List<Item> items;

    final @Nullable String nextToken;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public ListAuctionItems(@NotNull String __typename, @Nullable List<Item> items,
        @Nullable String nextToken) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.items = items;
      this.nextToken = nextToken;
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    public @Nullable List<Item> items() {
      return this.items;
    }

    public @Nullable String nextToken() {
      return this.nextToken;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeList($responseFields[1], items, new ResponseWriter.ListWriter() {
            @Override
            public void write(List items, ResponseWriter.ListItemWriter listItemWriter) {
              for (Object item : items) {
                listItemWriter.writeObject(((Item) item).marshaller());
              }
            }
          });
          writer.writeString($responseFields[2], nextToken);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "ListAuctionItems{"
          + "__typename=" + __typename + ", "
          + "items=" + items + ", "
          + "nextToken=" + nextToken
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof ListAuctionItems) {
        ListAuctionItems that = (ListAuctionItems) o;
        return this.__typename.equals(that.__typename)
         && ((this.items == null) ? (that.items == null) : this.items.equals(that.items))
         && ((this.nextToken == null) ? (that.nextToken == null) : this.nextToken.equals(that.nextToken));
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
        h ^= (items == null) ? 0 : items.hashCode();
        h *= 1000003;
        h ^= (nextToken == null) ? 0 : nextToken.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<ListAuctionItems> {
      final Item.Mapper itemFieldMapper = new Item.Mapper();

      @Override
      public ListAuctionItems map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final List<Item> items = reader.readList($responseFields[1], new ResponseReader.ListReader<Item>() {
          @Override
          public Item read(ResponseReader.ListItemReader listItemReader) {
            return listItemReader.readObject(new ResponseReader.ObjectReader<Item>() {
              @Override
              public Item read(ResponseReader reader) {
                return itemFieldMapper.map(reader);
              }
            });
          }
        });
        final String nextToken = reader.readString($responseFields[2]);
        return new ListAuctionItems(__typename, items, nextToken);
      }
    }
  }

  public static class Item {
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

    public Item(@NotNull String __typename, @NotNull String id, @NotNull String title,
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
        $toString = "Item{"
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
      if (o instanceof Item) {
        Item that = (Item) o;
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

    public static final class Mapper implements ResponseFieldMapper<Item> {
      @Override
      public Item map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String id = reader.readCustomType((ResponseField.CustomTypeField) $responseFields[1]);
        final String title = reader.readString($responseFields[2]);
        final int currentPrice = reader.readInt($responseFields[3]);
        return new Item(__typename, id, title, currentPrice);
      }
    }
  }
}
