/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_24761 {
    private static final Class_6113 Field_24762 = Class_10201.Method_10203(Class_24761.class);

    private void Method_24763() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Object Method_24764(Object object) {
        if (object instanceof Class_21482) {
            return ((Class_21482)object).Method_21485();
        }
        return object;
    }

    public static boolean Method_24765(Object object) {
        if (object instanceof Class_21482) {
            return ((Class_21482)object).Method_21483();
        }
        return (25600 & 154) != 0;
    }

    private Class_24761() {
    }

    public static void Method_24766(Object object) {
        try {
            Class_24761.Method_24765(object);
        }
        catch (Throwable throwable) {
            Field_24762.Method_6123("Failed to release a message: {}", object, throwable);
        }
    }
}

