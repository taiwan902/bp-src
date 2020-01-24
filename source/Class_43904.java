/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Class_43904
implements Class_1486 {
    public String Field_43905;

    public void Method_43906(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_43904.Method_43908("\u08c4\u08d5\u08c2\u0893\u08d0\u08c1\u08d6\u08d7\u08dc\u0899\u08ca\u08db\u08dc\u08dd\u08da\u08cb\u08c0\u0891\u08c2\u08d7")));
    }

    private static String Method_43907(String string) {
        int n = 10385;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43904.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_43908(String string) {
        int n = 4654;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43904.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_43909(Class_19025 class_19025) {
        class_19025.Method_19050(this);
    }

    public void Method_43910(Class_29900 class_29900) {
        byte[] arrby = new byte[class_29900.Method_30014()];
        class_29900.Method_29904(arrby);
        this.Field_43905 = new String(arrby, StandardCharsets.UTF_8);
    }

    public void Method_43911(Class_10954 class_10954) {
        this.Method_43909((Class_19025)class_10954);
    }

    private void Method_43912() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_43904.Method_43907("\u2338\u2330\u230a\u2332\u231c\u2314\u230e\u231e\u2310\u2318\u232a\u231a\u231c\u2314"));
    }
}

