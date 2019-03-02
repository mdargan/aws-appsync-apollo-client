package com.amazonaws.amplify.generated.graphql;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import java.io.IOException;
import java.lang.Integer;
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
public final class OnDeleteAuctionItemSubscription implements Subscription<OnDeleteAuctionItemSubscription.Data, OnDeleteAuctionItemSubscription.Data, OnDeleteAuctionItemSubscription.Variables> {
  public static final String OPERATION_ID = "dc0054aef78906e48008f17b4ae51449d0459c9ea47d3f1367c2433a0156f6ab";

  public static final String QUERY_DOCUMENT = "subscription OnDeleteAuctionItem($id: ID, $title: String, $currentPrice: Int) {\n"
      + "  onDeleteAuctionItem(id: $id, title: $title, currentPrice: $currentPrice) {\n"
      + "    __typename\n"
      + "    id\n"
      + "    title\n"
      + "    currentPrice\n"
      + "  }\n"
      + "}";

  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "OnDeleteAuctionItem";
    }
  };

  private final OnDeleteAuctionItemSubscription.Variables variables;

  public OnDeleteAuctionItemSubscription(@NotNull Input<String> id, @NotNull Input<String> title,
      @NotNull Input<Integer> currentPrice) {
    Utils.checkNotNull(id, "id == null");
    Utils.checkNotNull(title, "title == null");
    Utils.checkNotNull(currentPrice, "currentPrice == null");
    variables = new OnDeleteAuctionItemSubscription.Variables(id, title, currentPrice);
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
  public OnDeleteAuctionItemSubscription.Data wrapData(OnDeleteAuctionItemSubscription.Data data) {
    return data;
  }

  @Override
  public OnDeleteAuctionItemSubscription.Variables variables() {
    return variables;
  }

  @Override
  public ResponseFieldMapper<OnDeleteAuctionItemSubscription.Data> responseFieldMapper() {
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
    private Input<String> id = Input.absent();

    private Input<String> title = Input.absent();

    private Input<Integer> currentPrice = Input.absent();

    Builder() {
    }

    public Builder id(@Nullable String id) {
      this.id = Input.fromNullable(id);
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

    public Builder idInput(@NotNull Input<String> id) {
      this.id = Utils.checkNotNull(id, "id == null");
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

    public OnDeleteAuctionItemSubscription build() {
      return new OnDeleteAuctionItemSubscription(id, title, currentPrice);
    }
  }

  public static final class Variables extends Operation.Variables {
    private final Input<String> id;

    private final Input<String> title;

    private final Input<Integer> currentPrice;

    private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

    Variables(Input<String> id, Input<String> title, Input<Integer> currentPrice) {
      this.id = id;
      this.title = title;
      this.currentPrice = currentPrice;
      if (id.defined) {
        this.valueMap.put("id", id.value);
      }
      if (title.defined) {
        this.valueMap.put("title", title.value);
      }
      if (currentPrice.defined) {
        this.valueMap.put("currentPrice", currentPrice.value);
      }
    }

    public Input<String> id() {
      return id;
    }

    public Input<String> title() {
      return title;
    }

    public Input<Integer> currentPrice() {
      return currentPrice;
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
          if (id.defined) {
            writer.writeCustom("id", type.CustomType.ID, id.value != null ? id.value : null);
          }
          if (title.defined) {
            writer.writeString("title", title.value);
          }
          if (currentPrice.defined) {
            writer.writeInt("currentPrice", currentPrice.value);
          }
        }
      };
    }
  }

  public static class Data implements Operation.Data {
    static final ResponseField[] $responseFields = {
      ResponseField.forObject("onDeleteAuctionItem", "onDeleteAuctionItem", new UnmodifiableMapBuilder<String, Object>(3)
      .put("id", new UnmodifiableMapBuilder<String, Object>(2)
        .put("kind", "Variable")
        .put("variableName", "id")
        .build())
      .put("title", new UnmodifiableMapBuilder<String, Object>(2)
        .put("kind", "Variable")
        .put("variableName", "title")
        .build())
      .put("currentPrice", new UnmodifiableMapBuilder<String, Object>(2)
        .put("kind", "Variable")
        .put("variableName", "currentPrice")
        .build())
      .build(), true, Collections.<ResponseField.Condition>emptyList())
    };

    final @Nullable OnDeleteAuctionItem onDeleteAuctionItem;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@Nullable OnDeleteAuctionItem onDeleteAuctionItem) {
      this.onDeleteAuctionItem = onDeleteAuctionItem;
    }

    public @Nullable OnDeleteAuctionItem onDeleteAuctionItem() {
      return this.onDeleteAuctionItem;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], onDeleteAuctionItem != null ? onDeleteAuctionItem.marshaller() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "onDeleteAuctionItem=" + onDeleteAuctionItem
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
        return ((this.onDeleteAuctionItem == null) ? (that.onDeleteAuctionItem == null) : this.onDeleteAuctionItem.equals(that.onDeleteAuctionItem));
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= (onDeleteAuctionItem == null) ? 0 : onDeleteAuctionItem.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final OnDeleteAuctionItem.Mapper onDeleteAuctionItemFieldMapper = new OnDeleteAuctionItem.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final OnDeleteAuctionItem onDeleteAuctionItem = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<OnDeleteAuctionItem>() {
          @Override
          public OnDeleteAuctionItem read(ResponseReader reader) {
            return onDeleteAuctionItemFieldMapper.map(reader);
          }
        });
        return new Data(onDeleteAuctionItem);
      }
    }
  }

  public static class OnDeleteAuctionItem {
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

    public OnDeleteAuctionItem(@NotNull String __typename, @NotNull String id,
        @NotNull String title, int currentPrice) {
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
        $toString = "OnDeleteAuctionItem{"
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
      if (o instanceof OnDeleteAuctionItem) {
        OnDeleteAuctionItem that = (OnDeleteAuctionItem) o;
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

    public static final class Mapper implements ResponseFieldMapper<OnDeleteAuctionItem> {
      @Override
      public OnDeleteAuctionItem map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String id = reader.readCustomType((ResponseField.CustomTypeField) $responseFields[1]);
        final String title = reader.readString($responseFields[2]);
        final int currentPrice = reader.readInt($responseFields[3]);
        return new OnDeleteAuctionItem(__typename, id, title, currentPrice);
      }
    }
  }
}
