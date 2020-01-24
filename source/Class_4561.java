/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_4561
extends Class_3238 {
    public static final Class_3957 Field_4562 = Class_3957.Method_3963(Class_4561.Method_4564("\u0082\u008b\u008a\u0081"), Class_4565.class);

    protected Class_4561(Class_3713 class_3713, Class_3779 class_3779) {
        super(class_3713, class_3779);
    }

    protected Class_4561(Class_3713 class_3713) {
        super(class_3713, class_3713.Method_3760());
    }

    private void Method_4563() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_4564(String string) {
        int n = 7659;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4561.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

