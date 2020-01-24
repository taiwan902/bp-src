/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_20760
implements Class_1486 {
    public String Field_20761;
    public int Field_20762;
    public transient long Field_20763;

    public void Method_20764(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_20762);
        class_29900.Method_29960(this.Field_20761);
    }

    private static String Method_20765(String string) {
        int n = 31879;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20760.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20766(String string) {
        int n = 5234;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20760.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_20760(int n, String string) {
        this.Field_20762 = n;
        this.Field_20761 = string;
        this.Field_20763 = System.currentTimeMillis();
    }

    public void Method_20767(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_20760.Method_20771("\u0ac4\u0ad5\u0ac0\u0a93\u0ad4\u0ac5\u0ad0\u0ad3\u0adc\u0a99\u0aca\u0adb\u0ada\u0ad9\u0ade\u0acf\u0ac0\u0a91\u0ac2\u0ad7")));
    }

    public void Method_20768(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_20760.Method_20766("P@Z\u0002HPBJH\bZJ@@JZX\u0000ZB")));
    }

    private void Method_20769() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_20760.Method_20765("\u0a04\u0a00\u0a06\u0a02\u0a04\u0a00\u0a02\u0a02\u0a04\u0a04\u0a02\u0a02\u0a00\u0a00"));
    }

    public Class_20760() {
    }

    public void Method_20770(Class_10954 class_10954) {
        this.Method_20767((Class_19025)class_10954);
    }

    private static String Method_20771(String string) {
        int n = 20520;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20760.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

