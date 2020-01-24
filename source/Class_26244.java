/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26244
implements Class_1486 {
    public void Method_26245(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_26244.Method_26252("\u57a0\u57b1\u57a2\u57f3\u57b4\u57a5\u57b6\u57b7\u57b8\u57f9\u57aa\u57bb\u57bc\u57bd\u57be\u57af\u57a0\u57f1\u57a2\u57b3")));
    }

    public void Method_26246(Class_10954 class_10954) {
        this.Method_26245((Class_19025)class_10954);
    }

    private void Method_26247() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_26244.Method_26248("\u5200\u5200\u5222\u5202\u5224\u5224\u5226\u5226\u5220\u5220\u5202\u5222\u5224\u5224"));
    }

    private static String Method_26248(String string) {
        int n = 1172;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_26244.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_26249(String string) {
        int n = 17751;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_26244.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_26250(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_26244.Method_26249("\u0942\u0942\u0940\u0903\u0942\u0942\u0940\u0942\u0943\u0903\u0942\u0942\u0941\u0942\u0943\u0943\u0953\u0913\u0952\u0953")));
    }

    public void Method_26251(Class_29900 class_29900) {
    }

    private static String Method_26252(String string) {
        int n = 4205;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_26244.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

