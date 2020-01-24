/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_11672 {
    private final Throwable Field_11673;
    private final String Field_11674;
    private final Object[] Field_11675;
    static final Class_11672 Field_11676 = new Class_11672(null);

    Class_11672(String string, Object[] arrobject, Throwable throwable) {
        this.Field_11674 = string;
        this.Field_11673 = throwable;
        this.Field_11675 = throwable == null ? arrobject : Class_11672.Method_11678(arrobject);
    }

    public String Method_11677() {
        return this.Field_11674;
    }

    static Object[] Method_11678(Object[] arrobject) {
        if (arrobject == null || arrobject.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int n = arrobject.length - (17 & -14143);
        Object[] arrobject2 = new Object[n];
        System.arraycopy(arrobject, 16 & 45, arrobject2, 12544 & 20101, n);
        return arrobject2;
    }

    Class_11672(String string) {
        this(string, null, null);
    }

    private void Method_11679() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Throwable Method_11680() {
        return this.Field_11673;
    }
}

