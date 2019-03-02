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
import java.util.List;
import javax.annotation.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated("Apollo GraphQL")
public final class TableIntFilterInput implements InputType {
  private final Input<Integer> ne;

  private final Input<Integer> eq;

  private final Input<Integer> le;

  private final Input<Integer> lt;

  private final Input<Integer> ge;

  private final Input<Integer> gt;

  private final Input<Integer> contains;

  private final Input<Integer> notContains;

  private final Input<List<Integer>> between;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  TableIntFilterInput(Input<Integer> ne, Input<Integer> eq, Input<Integer> le, Input<Integer> lt,
      Input<Integer> ge, Input<Integer> gt, Input<Integer> contains, Input<Integer> notContains,
      Input<List<Integer>> between) {
    this.ne = ne;
    this.eq = eq;
    this.le = le;
    this.lt = lt;
    this.ge = ge;
    this.gt = gt;
    this.contains = contains;
    this.notContains = notContains;
    this.between = between;
  }

  public @Nullable Integer ne() {
    return this.ne.value;
  }

  public @Nullable Integer eq() {
    return this.eq.value;
  }

  public @Nullable Integer le() {
    return this.le.value;
  }

  public @Nullable Integer lt() {
    return this.lt.value;
  }

  public @Nullable Integer ge() {
    return this.ge.value;
  }

  public @Nullable Integer gt() {
    return this.gt.value;
  }

  public @Nullable Integer contains() {
    return this.contains.value;
  }

  public @Nullable Integer notContains() {
    return this.notContains.value;
  }

  public @Nullable List<Integer> between() {
    return this.between.value;
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
          writer.writeInt("ne", ne.value);
        }
        if (eq.defined) {
          writer.writeInt("eq", eq.value);
        }
        if (le.defined) {
          writer.writeInt("le", le.value);
        }
        if (lt.defined) {
          writer.writeInt("lt", lt.value);
        }
        if (ge.defined) {
          writer.writeInt("ge", ge.value);
        }
        if (gt.defined) {
          writer.writeInt("gt", gt.value);
        }
        if (contains.defined) {
          writer.writeInt("contains", contains.value);
        }
        if (notContains.defined) {
          writer.writeInt("notContains", notContains.value);
        }
        if (between.defined) {
          writer.writeList("between", between.value != null ? new InputFieldWriter.ListWriter() {
            @Override
            public void write(InputFieldWriter.ListItemWriter listItemWriter) throws IOException {
              for (final Integer $item : between.value) {
                listItemWriter.writeInt($item);
              }
            }
          } : null);
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
    if (o instanceof TableIntFilterInput) {
      TableIntFilterInput that = (TableIntFilterInput) o;
      return this.ne.equals(that.ne)
       && this.eq.equals(that.eq)
       && this.le.equals(that.le)
       && this.lt.equals(that.lt)
       && this.ge.equals(that.ge)
       && this.gt.equals(that.gt)
       && this.contains.equals(that.contains)
       && this.notContains.equals(that.notContains)
       && this.between.equals(that.between);
    }
    return false;
  }

  public static final class Builder {
    private Input<Integer> ne = Input.absent();

    private Input<Integer> eq = Input.absent();

    private Input<Integer> le = Input.absent();

    private Input<Integer> lt = Input.absent();

    private Input<Integer> ge = Input.absent();

    private Input<Integer> gt = Input.absent();

    private Input<Integer> contains = Input.absent();

    private Input<Integer> notContains = Input.absent();

    private Input<List<Integer>> between = Input.absent();

    Builder() {
    }

    public Builder ne(@Nullable Integer ne) {
      this.ne = Input.fromNullable(ne);
      return this;
    }

    public Builder eq(@Nullable Integer eq) {
      this.eq = Input.fromNullable(eq);
      return this;
    }

    public Builder le(@Nullable Integer le) {
      this.le = Input.fromNullable(le);
      return this;
    }

    public Builder lt(@Nullable Integer lt) {
      this.lt = Input.fromNullable(lt);
      return this;
    }

    public Builder ge(@Nullable Integer ge) {
      this.ge = Input.fromNullable(ge);
      return this;
    }

    public Builder gt(@Nullable Integer gt) {
      this.gt = Input.fromNullable(gt);
      return this;
    }

    public Builder contains(@Nullable Integer contains) {
      this.contains = Input.fromNullable(contains);
      return this;
    }

    public Builder notContains(@Nullable Integer notContains) {
      this.notContains = Input.fromNullable(notContains);
      return this;
    }

    public Builder between(@Nullable List<Integer> between) {
      this.between = Input.fromNullable(between);
      return this;
    }

    public Builder neInput(@NotNull Input<Integer> ne) {
      this.ne = Utils.checkNotNull(ne, "ne == null");
      return this;
    }

    public Builder eqInput(@NotNull Input<Integer> eq) {
      this.eq = Utils.checkNotNull(eq, "eq == null");
      return this;
    }

    public Builder leInput(@NotNull Input<Integer> le) {
      this.le = Utils.checkNotNull(le, "le == null");
      return this;
    }

    public Builder ltInput(@NotNull Input<Integer> lt) {
      this.lt = Utils.checkNotNull(lt, "lt == null");
      return this;
    }

    public Builder geInput(@NotNull Input<Integer> ge) {
      this.ge = Utils.checkNotNull(ge, "ge == null");
      return this;
    }

    public Builder gtInput(@NotNull Input<Integer> gt) {
      this.gt = Utils.checkNotNull(gt, "gt == null");
      return this;
    }

    public Builder containsInput(@NotNull Input<Integer> contains) {
      this.contains = Utils.checkNotNull(contains, "contains == null");
      return this;
    }

    public Builder notContainsInput(@NotNull Input<Integer> notContains) {
      this.notContains = Utils.checkNotNull(notContains, "notContains == null");
      return this;
    }

    public Builder betweenInput(@NotNull Input<List<Integer>> between) {
      this.between = Utils.checkNotNull(between, "between == null");
      return this;
    }

    public TableIntFilterInput build() {
      return new TableIntFilterInput(ne, eq, le, lt, ge, gt, contains, notContains, between);
    }
  }
}
