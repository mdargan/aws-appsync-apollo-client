package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated("Apollo GraphQL")
public final class TableIDFilterInput implements InputType {
  private final Input<String> ne;

  private final Input<String> eq;

  private final Input<String> le;

  private final Input<String> lt;

  private final Input<String> ge;

  private final Input<String> gt;

  private final Input<String> contains;

  private final Input<String> notContains;

  private final Input<List<String>> between;

  private final Input<String> beginsWith;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  TableIDFilterInput(Input<String> ne, Input<String> eq, Input<String> le, Input<String> lt,
      Input<String> ge, Input<String> gt, Input<String> contains, Input<String> notContains,
      Input<List<String>> between, Input<String> beginsWith) {
    this.ne = ne;
    this.eq = eq;
    this.le = le;
    this.lt = lt;
    this.ge = ge;
    this.gt = gt;
    this.contains = contains;
    this.notContains = notContains;
    this.between = between;
    this.beginsWith = beginsWith;
  }

  public @Nullable String ne() {
    return this.ne.value;
  }

  public @Nullable String eq() {
    return this.eq.value;
  }

  public @Nullable String le() {
    return this.le.value;
  }

  public @Nullable String lt() {
    return this.lt.value;
  }

  public @Nullable String ge() {
    return this.ge.value;
  }

  public @Nullable String gt() {
    return this.gt.value;
  }

  public @Nullable String contains() {
    return this.contains.value;
  }

  public @Nullable String notContains() {
    return this.notContains.value;
  }

  public @Nullable List<String> between() {
    return this.between.value;
  }

  public @Nullable String beginsWith() {
    return this.beginsWith.value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        if (ne.defined) {
          writer.writeCustom("ne", type.CustomType.ID, ne.value != null ? ne.value : null);
        }
        if (eq.defined) {
          writer.writeCustom("eq", type.CustomType.ID, eq.value != null ? eq.value : null);
        }
        if (le.defined) {
          writer.writeCustom("le", type.CustomType.ID, le.value != null ? le.value : null);
        }
        if (lt.defined) {
          writer.writeCustom("lt", type.CustomType.ID, lt.value != null ? lt.value : null);
        }
        if (ge.defined) {
          writer.writeCustom("ge", type.CustomType.ID, ge.value != null ? ge.value : null);
        }
        if (gt.defined) {
          writer.writeCustom("gt", type.CustomType.ID, gt.value != null ? gt.value : null);
        }
        if (contains.defined) {
          writer.writeCustom("contains", type.CustomType.ID, contains.value != null ? contains.value : null);
        }
        if (notContains.defined) {
          writer.writeCustom("notContains", type.CustomType.ID, notContains.value != null ? notContains.value : null);
        }
        if (between.defined) {
          writer.writeList("between", between.value != null ? new InputFieldWriter.ListWriter() {
            @Override
            public void write(InputFieldWriter.ListItemWriter listItemWriter) throws IOException {
              for (final String $item : between.value) {
                listItemWriter.writeCustom(CustomType.ID, $item);
              }
            }
          } : null);
        }
        if (beginsWith.defined) {
          writer.writeCustom("beginsWith", type.CustomType.ID, beginsWith.value != null ? beginsWith.value : null);
        }
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= ne.hashCode();
      h *= 1000003;
      h ^= eq.hashCode();
      h *= 1000003;
      h ^= le.hashCode();
      h *= 1000003;
      h ^= lt.hashCode();
      h *= 1000003;
      h ^= ge.hashCode();
      h *= 1000003;
      h ^= gt.hashCode();
      h *= 1000003;
      h ^= contains.hashCode();
      h *= 1000003;
      h ^= notContains.hashCode();
      h *= 1000003;
      h ^= between.hashCode();
      h *= 1000003;
      h ^= beginsWith.hashCode();
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
    if (o instanceof TableIDFilterInput) {
      TableIDFilterInput that = (TableIDFilterInput) o;
      return this.ne.equals(that.ne)
       && this.eq.equals(that.eq)
       && this.le.equals(that.le)
       && this.lt.equals(that.lt)
       && this.ge.equals(that.ge)
       && this.gt.equals(that.gt)
       && this.contains.equals(that.contains)
       && this.notContains.equals(that.notContains)
       && this.between.equals(that.between)
       && this.beginsWith.equals(that.beginsWith);
    }
    return false;
  }

  public static final class Builder {
    private Input<String> ne = Input.absent();

    private Input<String> eq = Input.absent();

    private Input<String> le = Input.absent();

    private Input<String> lt = Input.absent();

    private Input<String> ge = Input.absent();

    private Input<String> gt = Input.absent();

    private Input<String> contains = Input.absent();

    private Input<String> notContains = Input.absent();

    private Input<List<String>> between = Input.absent();

    private Input<String> beginsWith = Input.absent();

    Builder() {
    }

    public Builder ne(@Nullable String ne) {
      this.ne = Input.fromNullable(ne);
      return this;
    }

    public Builder eq(@Nullable String eq) {
      this.eq = Input.fromNullable(eq);
      return this;
    }

    public Builder le(@Nullable String le) {
      this.le = Input.fromNullable(le);
      return this;
    }

    public Builder lt(@Nullable String lt) {
      this.lt = Input.fromNullable(lt);
      return this;
    }

    public Builder ge(@Nullable String ge) {
      this.ge = Input.fromNullable(ge);
      return this;
    }

    public Builder gt(@Nullable String gt) {
      this.gt = Input.fromNullable(gt);
      return this;
    }

    public Builder contains(@Nullable String contains) {
      this.contains = Input.fromNullable(contains);
      return this;
    }

    public Builder notContains(@Nullable String notContains) {
      this.notContains = Input.fromNullable(notContains);
      return this;
    }

    public Builder between(@Nullable List<String> between) {
      this.between = Input.fromNullable(between);
      return this;
    }

    public Builder beginsWith(@Nullable String beginsWith) {
      this.beginsWith = Input.fromNullable(beginsWith);
      return this;
    }

    public Builder neInput(@NotNull Input<String> ne) {
      this.ne = Utils.checkNotNull(ne, "ne == null");
      return this;
    }

    public Builder eqInput(@NotNull Input<String> eq) {
      this.eq = Utils.checkNotNull(eq, "eq == null");
      return this;
    }

    public Builder leInput(@NotNull Input<String> le) {
      this.le = Utils.checkNotNull(le, "le == null");
      return this;
    }

    public Builder ltInput(@NotNull Input<String> lt) {
      this.lt = Utils.checkNotNull(lt, "lt == null");
      return this;
    }

    public Builder geInput(@NotNull Input<String> ge) {
      this.ge = Utils.checkNotNull(ge, "ge == null");
      return this;
    }

    public Builder gtInput(@NotNull Input<String> gt) {
      this.gt = Utils.checkNotNull(gt, "gt == null");
      return this;
    }

    public Builder containsInput(@NotNull Input<String> contains) {
      this.contains = Utils.checkNotNull(contains, "contains == null");
      return this;
    }

    public Builder notContainsInput(@NotNull Input<String> notContains) {
      this.notContains = Utils.checkNotNull(notContains, "notContains == null");
      return this;
    }

    public Builder betweenInput(@NotNull Input<List<String>> between) {
      this.between = Utils.checkNotNull(between, "between == null");
      return this;
    }

    public Builder beginsWithInput(@NotNull Input<String> beginsWith) {
      this.beginsWith = Utils.checkNotNull(beginsWith, "beginsWith == null");
      return this;
    }

    public TableIDFilterInput build() {
      return new TableIDFilterInput(ne, eq, le, lt, ge, gt, contains, notContains, between, beginsWith);
    }
  }
}
