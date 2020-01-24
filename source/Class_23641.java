/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23641
implements Class_1486 {
    private static String Method_23642(String string) {
        int n = 5853;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23641.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23643(String string) {
        int n = 17122;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23641.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23644(String string) {
        int n = 5039;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23641.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23645(String string) {
        int n = 21262;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23641.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_23646(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_23641.Method_23642("\u5cbf\u5cae\u5cb3\u5ca9\u5ca3\u5cba\u5caf\u5ca4\u5cae\u5cab\u5cb9\u5ca8\u5ca4\u5ca6\u5ca8\u5cb9\u5cb2\u5cab\u5cb1\u5cad")));
    }

    public void Method_23647(Class_10954 class_10954) {
        this.Method_23649((Class_19025)class_10954);
    }

    public void Method_23648(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_23641.Method_23644("\u0194\u0185\u0192\u0181\u0180\u0191\u0186\u0185\u0184\u0181\u0190\u0181\u0186\u0185\u0180\u0191\u0180\u0191\u0180\u0195")));
    }

    public void Method_23649(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_23641.Method_23643("\uacb7\uaca6\uacb3\uaca1\uaca3\uacb2\uaca7\uaca4\uacae\uacab\uacb9\uaca8\uacac\uacae\uaca8\uacb9\uacb2\uaca3\uacb1\uaca5")));
    }

    private void Method_23650() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_23641.Method_23645("\uc080\uc085\uc0a2\uc087\uc0a4\uc0a1\uc0a2\uc0a3\uc0a8\uc0a9\uc08e\uc0af\uc0a8\uc0a9"));
    }
}

