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
import type.CreateAuctionItemInput;
import type.CustomType;

@Generated("Apollo GraphQL")
public final class CreateAuctionItemMutation implements Mutation<CreateAuctionItemMutation.Data, CreateAuctionItemMutation.Data, CreateAuctionItemMutation.Variables> {
  public static final String OPERATION_ID = "6ab7bab256381ae33090db6ccb9e3fdb370a317efcbaa355f4d37952d0656bcc";

  public static final String QUERY_DOCUMENT = "mutation CreateAuctionItem($input: CreateAuctionItemInput!) {\n"
      + "  createAuctionItem(input: $input) {\n"
      + "    __typename\n"
      + "    id\n"
      + "    title\n"
      + "    currentPrice\n"
      + "  }\n"
      + "}";

  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "CreateAuctionItem";
    }
  };

  private final CreateAuctionItemMutation.Variables variables;

  public CreateAuctionItemMutation(@NotNull CreateAuctionItemInput input) {
    Utils.checkNotNull(input, "input == null");
    variables = new CreateAuctionItemMutation.Variables(input);
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
  public CreateAuctionItemMutation.Data wrapData(CreateAuctionItemMutation.Data data) {
    return data;
  }

  @Override
  public CreateAuctionItemMutation.Variables variables() {
    return variables;
  }

  @Override
  public ResponseFieldMapper<CreateAuctionItemMutation.Data> responseFieldMapper() {
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
    private @NotNull CreateAuctionItemInput input;

    Builder() {
    }

    public Builder input(@NotNull CreateAuctionItemInput input) {
      this.input = input;
      return this;
    }

    public CreateAuctionItemMutation build() {
      Utils.checkNotNull(input, "input == null");
      return new CreateAuctionItemMutation(input);
    }
  }

  public static final class Variables extends Operation.Variables {
    private final @NotNull CreateAuctionItemInput input;

    private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

    Variables(@NotNull CreateAuctionItemInput input) {
      this.input = input;
      this.valueMap.put("input", input);
    }

    public @NotNull CreateAuctionItemInput input() {
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
      ResponseField.forObject("createAuctionItem", "createAuctionItem", new UnmodifiableMapBuilder<String, Object>(1)
      .put("input", new UnmodifiableMapBuilder<String, Object>(2)
        .put("kind", "Variable")
        .put("variableName", "input")
        .build())
      .build(), true, Collections.<ResponseField.Condition>emptyList())
    };

    final @Nullable CreateAuctionItem createAuctionItem;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@Nullable CreateAuctionItem createAuctionItem) {
      this.createAuctionItem = createAuctionItem;
    }

    public @Nullable CreateAuctionItem createAuctionItem() {
      return this.createAuctionItem;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], createAuctionItem != null ? createAuctionItem.marshaller() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "createAuctionItem=" + createAuctionItem
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
        return ((this.createAuctionItem == null) ? (that.createAuctionItem == null) : this.createAuctionItem.equals(that.createAuctionItem));
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= (createAuctionItem == null) ? 0 : createAuctionItem.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final CreateAuctionItem.Mapper createAuctionItemFieldMapper = new CreateAuctionItem.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final CreateAuctionItem createAuctionItem = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<CreateAuctionItem>() {
          @Override
          public CreateAuctionItem read(ResponseReader reader) {
            return createAuctionItemFieldMapper.map(reader);
          }
        });
        return new Data(createAuctionItem);
      }
    }
  }

  public static class CreateAuctionItem {
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

    public CreateAuctionItem(@NotNull String __typename, @NotNull String id, @NotNull String title,
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
        $toString = "CreateAuctionItem{"
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
      if (o instanceof CreateAuctionItem) {
        CreateAuctionItem that = (CreateAuctionItem) o;
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

    public static final class Mapper implements ResponseFieldMapper<CreateAuctionItem> {
      @Override
      public CreateAuctionItem map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String id = reader.readCustomType((ResponseField.CustomTypeField) $responseFields[1]);
        final String title = reader.readString($responseFields[2]);
        final int currentPrice = reader.readInt($responseFields[3]);
        return new CreateAuctionItem(__typename, id, title, currentPrice);
      }
    }
  }
}
