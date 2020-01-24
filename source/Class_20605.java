/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.PublicKey;

public class Class_20605
implements Class_1486 {
    private PublicKey Field_20606;
    private String Field_20607;
    private byte[] Field_20608;

    private static String Method_20609(String string) {
        int n = 25945;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20605.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_20610(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_20605.Method_20609("HY@\u001bPIXSX\u0019J[RQZKP\tRK")));
    }

    public PublicKey Method_20611() {
        return this.Field_20606;
    }

    private static String Method_20612(String string) {
        int n = 16746;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20605.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public byte[] Method_20613() {
        return this.Field_20608;
    }

    public void Method_20614(Class_19025 class_19025) {
        class_19025.Method_19061(this);
    }

    public String Method_20615() {
        return this.Field_20607;
    }

    public void Method_20616(Class_29900 class_29900) {
        this.Field_20607 = class_29900.Method_29991(8212 & -26345);
        this.Field_20606 = Class_31852.Method_31865(class_29900.Method_29950());
        this.Field_20608 = class_29900.Method_29950();
    }

    public void Method_20617(Class_10954 class_10954) {
        this.Method_20614((Class_19025)class_10954);
    }

    private void Method_20618() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_20605.Method_20612("\u2814\u2810\u2825\u2811\u2835\u2830\u2821\u2830\u283d\u283c\u2809\u2838\u2838\u2838"));
    }
}

