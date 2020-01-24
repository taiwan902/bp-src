/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26384
implements Class_1486 {
    public long Field_26385;

    public void Method_26386(Class_29900 class_29900) {
    }

    public void Method_26387(Class_19025 class_19025) {
        class_19025.Method_19066(this);
    }

    public void Method_26388(Class_10954 class_10954) {
        this.Method_26387((Class_19025)class_10954);
    }

    private void Method_26389() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_26384.Method_26390(" \"\u0002 \u0004\u0004\u0004\u0006\u0002\u0002\"\u0002\u0006\u0006"));
    }

    private static String Method_26390(String string) {
        int n = 12244;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_26384.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_26391(Class_29900 class_29900) {
        this.Field_26385 = class_29900.Method_30001();
    }
}

