/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class Class_20094
implements Comparable {
    private final String Field_20095;
    private static final AtomicInteger Field_20096 = new AtomicInteger();
    private final int Field_20097;

    public String Method_20098() {
        return this.Method_20106();
    }

    public int Method_20099(Class_20094 class_20094) {
        if (this == class_20094) {
            return 9352 & -28415;
        }
        int n = this.Field_20095.compareTo(class_20094.Field_20095);
        if (n != 0) {
            return n;
        }
        return Integer.valueOf(this.Field_20097).compareTo(class_20094.Field_20097);
    }

    public final int Method_20100() {
        return this.Field_20097;
    }

    public final int Method_20101() {
        return super.hashCode();
    }

    protected void Method_20102(Object ... arrobject) {
    }

    private void Method_20103() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_20104(Object object) {
        return this.Method_20099((Class_20094)object);
    }

    public Class_20094(ConcurrentMap concurrentMap, String string, Object ... arrobject) {
        if (concurrentMap == null) {
            throw new NullPointerException("map");
        }
        if (string == null) {
            throw new NullPointerException("name");
        }
        if (arrobject != null && arrobject.length > 0) {
            this.Method_20102(arrobject);
        }
        if (concurrentMap.putIfAbsent(string, Boolean.TRUE) != null) {
            Object[] arrobject2 = new Object[15747 & -32759];
            arrobject2[1033 & 4288] = string;
            throw new IllegalArgumentException(String.format("'%s' is already in use", arrobject2));
        }
        this.Field_20097 = Field_20096.incrementAndGet();
        this.Field_20095 = string;
    }

    public final boolean Method_20105(Object object) {
        return super.equals(object);
    }

    public final String Method_20106() {
        return this.Field_20095;
    }
}

