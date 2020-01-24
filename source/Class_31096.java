/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31096
extends Class_24929 {
    private void Method_31097() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_31096.Method_31100("qtBwPTFVXXn^]\\"));
    }

    public void Method_31098(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_31096.Method_31102("\u0221\u0231\u022b\u0232\u023d\u0225\u0237\u023f\u0238\u0238\u022b\u023b\u0234\u0235\u023e\u022e\u0228\u0230\u022b\u0232")));
    }

    public void Method_31099(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_31096.Method_31103("\u0106\u0107\u0100\u0103\u0106\u0107\u0100\u0103\u0106\u0103\u0102\u0103\u0100\u0103\u0106\u0107\u0102\u0103\u0102\u0107")));
    }

    private static String Method_31100(String string) {
        int n = 22893;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31096.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_31101(Class_10954 class_10954) {
        this.Method_31099((Class_19025)class_10954);
    }

    private static String Method_31102(String string) {
        int n = 12754;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31096.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_31103(String string) {
        int n = 29295;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31096.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_31104(Class_29900 class_29900) {
    }
}

