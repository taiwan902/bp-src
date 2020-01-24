/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_14347 {
    private Class_37748 Field_14348;
    private static final Class_32390 Field_14349 = new Class_35620();
    private long Field_14350;
    private Class_14347 Field_14351;
    private Object Field_14352;
    private final Class_22999 Field_14353;

    private Class_14347(Class_22999 class_22999) {
        this.Field_14353 = class_22999;
    }

    static Object Method_14354(Class_14347 class_14347) {
        return class_14347.Field_14352;
    }

    static Class_14347 Method_14355(Object object, int n, Class_37748 class_37748) {
        Class_14347 class_14347 = (Class_14347)Field_14349.Method_32408();
        class_14347.Field_14350 = n;
        class_14347.Field_14352 = object;
        class_14347.Field_14348 = class_37748;
        return class_14347;
    }

    static Class_14347 Method_14356(Class_14347 class_14347) {
        return class_14347.Field_14351;
    }

    Class_14347(Class_22999 class_22999, Class_5979 class_5979) {
        this(class_22999);
    }

    static Class_14347 Method_14357(Class_14347 class_14347, Class_14347 class_143472) {
        class_14347.Field_14351 = class_143472;
        return class_14347.Field_14351;
    }

    private void Method_14358() {
        this.Field_14350 = -1913064648085587952L & 1090651276L;
        this.Field_14351 = null;
        this.Field_14352 = null;
        this.Field_14348 = null;
        Field_14349.Method_32402(this, this.Field_14353);
    }

    static long Method_14359(Class_14347 class_14347) {
        return class_14347.Field_14350;
    }

    static Class_37748 Method_14360(Class_14347 class_14347) {
        return class_14347.Field_14348;
    }

    static void Method_14361(Class_14347 class_14347) {
        class_14347.Method_14358();
    }

    private void Method_14362() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

