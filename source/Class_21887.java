/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21887
implements Class_1486 {
    public void Method_21888(Class_29900 class_29900) {
    }

    private static String Method_21889(String string) {
        int n = 13811;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21887.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_21890() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_21887.Method_21889("\u03ac\u03a0\u038f\u03a3\u038d\u0380\u038b\u038a\u0385\u038c\u03ab\u038a\u0388\u0380"));
    }

    public void Method_21891(Class_19025 class_19025) {
        class_19025.Method_19058(this);
    }

    public void Method_21892(Class_29900 class_29900) {
    }

    public void Method_21893(Class_10954 class_10954) {
        this.Method_21891((Class_19025)class_10954);
    }
}

