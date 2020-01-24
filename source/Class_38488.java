/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_38488
implements Class_1486 {
    public void Method_38489(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_38488.Method_38495("HH@\tDLLDA\u0001@@MLEEA\t@I")));
    }

    private static String Method_38490(String string) {
        int n = 14543;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38488.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_38491(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_38488.Method_38492("\u08c4\u08c5\u08c2\u0883\u08c0\u08c1\u08c6\u08c7\u08cc\u0889\u08ca\u08cb\u08cc\u08cd\u08ca\u08cb\u08d0\u0891\u08d2\u08d7")));
    }

    private static String Method_38492(String string) {
        int n = 11610;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38488.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38493(String string) {
        int n = 9432;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38488.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_38494() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_38488.Method_38493("\u9888\u9880\u989b\u9883\u988d\u9884\u989f\u988e\u9889\u9880\u9893\u9882\u9884\u988c"));
    }

    private static String Method_38495(String string) {
        int n = 30360;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38488.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_38496(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_38488.Method_38490("\u5042\u5043\u5040\u5003\u5046\u5047\u5044\u5047\u504a\u500b\u504a\u504b\u504c\u504f\u504e\u504f\u5042\u5003\u5042\u5043")));
    }

    public void Method_38497(Class_10954 class_10954) {
        this.Method_38489((Class_19025)class_10954);
    }
}

