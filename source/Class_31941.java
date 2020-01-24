/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31941
extends Class_24929 {
    private String Field_31942;

    public void Method_31943(Class_10954 class_10954) {
        this.Method_31950((Class_19025)class_10954);
    }

    public void Method_31944(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_31941.Method_31948("\u0002\u0012\f\u0016\u001e\u0006\u0010\u001a\u001a\u001e\u000e\u001e\u0010\u0012\u001e\u000e\u001e\u0006\u001e\u0002")));
    }

    public void Method_31945(Class_29900 class_29900) {
        class_29900.Method_29960(this.Field_31942);
    }

    private static String Method_31946(String string) {
        int n = 23649;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31941.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_31941(String string) {
        this.Field_31942 = string;
    }

    public Class_31941() {
    }

    private static String Method_31947(String string) {
        int n = 32029;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31941.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_31948(String string) {
        int n = 5459;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31941.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_31949() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_31941.Method_31946("\u228d\u2283\u228c\u2282\u228c\u2281\u228a\u2289\u2286\u228f\u2288\u2289\u228b\u2283"));
    }

    public void Method_31950(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_31941.Method_31947("\u0821\u0820\u0827\u0867\u0821\u0820\u0827\u0826\u0828\u086d\u082f\u082e\u082c\u082c\u082a\u082b\u0834\u0875\u0837\u0833")));
    }
}

