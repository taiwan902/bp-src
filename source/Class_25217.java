/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_25217
implements Class_1486 {
    private long Field_25218;

    public Class_25217(long l) {
        this.Field_25218 = l;
    }

    public void Method_25219(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_25217.Method_25220("\u0808\u0808\u0804\u080c\u0804\u080c\u0808\u0800\u0808\u080c\u080c\u080c\u0800\u0800\u080c\u080c\u0814\u081c\u0814\u0818")));
    }

    private static String Method_25220(String string) {
        int n = 26261;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25217.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_25221(Class_10954 class_10954) {
        this.Method_25219((Class_19025)class_10954);
    }

    private static String Method_25222(String string) {
        int n = 16354;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25217.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_25217() {
    }

    public void Method_25223(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_25217.Method_25224("\u0467\u0477\u0463\u0430\u0473\u0463\u0477\u0475\u047e\u043a\u0469\u0479\u047c\u047f\u0478\u0468\u0472\u0422\u0471\u0464")));
    }

    private static String Method_25224(String string) {
        int n = 26781;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25217.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_25225() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_25217.Method_25222("\u83a1\u83a9\u8382\u83aa\u8384\u838d\u8386\u8387\u8388\u8381\u83a2\u8383\u8385\u838d"));
    }

    public void Method_25226(Class_29900 class_29900) {
        class_29900.Method_29957(System.currentTimeMillis());
        class_29900.Method_29957(System.nanoTime());
        class_29900.Method_29957(this.Field_25218);
        class_29900.Method_29957(Class_18.Field_24);
    }

    public void Method_25227(long l) {
        this.Field_25218 = l;
    }
}

