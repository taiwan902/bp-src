/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_28790
implements Class_1486 {
    public byte[] Field_28791;

    private static String Method_28792(String string) {
        int n = 20270;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28790.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_28793(String string) {
        int n = 18040;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28790.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_28794() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_28790.Method_28792("\u0180\u0181\u0182\u0183\u0180\u0181\u0182\u0183\u0180\u0181\u0182\u0183\u0180\u0181"));
    }

    public void Method_28795(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_28790.Method_28793("\u7080\u7081\u7088\u7080\u7088\u7081\u7080\u7089\u7081\u7080\u7080\u7081\u7089\u7089\u7081\u7080\u7089\u7080\u7088\u7080")));
    }

    public void Method_28796(Class_29900 class_29900) {
        this.Field_28791 = new byte[class_29900.Method_30014()];
        class_29900.Method_29904(this.Field_28791);
    }

    public void Method_28797(Class_19025 class_19025) {
        class_19025.Method_19071(this);
    }

    public void Method_28798(Class_10954 class_10954) {
        this.Method_28797((Class_19025)class_10954);
    }
}

