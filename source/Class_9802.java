/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_9802 {
    private static Class_15291 Field_9803;

    public static Map Method_9804() {
        return Class_9802.Field_9803.Field_15292;
    }

    private void Method_9805() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String Method_9806(String string, Object ... arrobject) {
        return Field_9803.Method_15302(string, arrobject);
    }

    static void Method_9807(Class_15291 class_15291) {
        Field_9803 = class_15291;
    }
}

