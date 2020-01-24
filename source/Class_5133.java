/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_5133
extends Class_3238 {
    public static final Class_5011 Field_5134 = Class_5011.Method_5012(Class_5133.Method_5135("\u4421\u4423\u4422\u4429\u442d\u4425"), Class_4662.Field_4663);

    private static String Method_5135(String string) {
        int n = 4517;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5133.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_5136() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_5133(Class_3713 class_3713, Class_3779 class_3779) {
        super(class_3713, class_3779);
    }

    protected Class_5133(Class_3713 class_3713) {
        super(class_3713);
    }
}

