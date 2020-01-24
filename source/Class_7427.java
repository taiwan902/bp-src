/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;

public final class Class_7427 {
    public static final Class_28885 Field_7428;
    public static final Object[] Field_7429;
    public static final Object[] Field_7430;

    public static Object[] Method_7431(Object[] arrobject, int n, int n2) {
        Object[] arrobject2 = Class_7427.Method_7432(arrobject, n);
        System.arraycopy(arrobject, 576 & -1887, arrobject2, 2176 & 1024, n2);
        return arrobject2;
    }

    private static Object[] Method_7432(Object[] arrobject, int n) {
        Class<?> class_ = arrobject.getClass();
        if (class_ == Object[].class) {
            return n == 0 ? Field_7430 : new Object[n];
        }
        return (Object[])Array.newInstance(class_.getComponentType(), n);
    }

    static {
        Field_7430 = new Object[17458 & 6988];
        Field_7429 = new Object[16734 & 15488];
        Field_7428 = new Class_28959(null);
    }

    private void Method_7433() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

