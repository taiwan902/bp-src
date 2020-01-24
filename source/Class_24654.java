/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24654
implements Class_1486 {
    public int Field_24655;

    private void Method_24656() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_24654.Method_24659("\u2420\u2428\u2412\u242a\u2400\u2408\u2412\u2402\u2400\u2408\u243a\u240a\u2408\u2400"));
    }

    public void Method_24657(Class_19025 class_19025) {
        class_19025.Method_19053(this);
    }

    public void Method_24658(Class_10954 class_10954) {
        this.Method_24657((Class_19025)class_10954);
    }

    private static String Method_24659(String string) {
        int n = 15752;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24654.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24660(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_24654.Method_24661("\u0580\u0581\u0582\u0582\u0580\u0581\u0582\u0583\u0589\u0588\u058a\u058b\u0589\u0589\u058b\u058a\u0591\u0590\u0592\u0592")));
    }

    private static String Method_24661(String string) {
        int n = 20281;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24654.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24662(Class_29900 class_29900) {
        this.Field_24655 = class_29900.Method_29914();
    }
}

