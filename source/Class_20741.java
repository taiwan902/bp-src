/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_20741
implements Class_1486 {
    public byte[] Field_20742;

    private static String Method_20743(String string) {
        int n = 12210;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20741.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_20744(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_20741.Method_20748("DE@\u0000@ADEE\u0000@AEEA@A\u0000@D")));
    }

    public void Method_20745(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_20741.Method_20743("\uc01a\uc00b\uc012\uc049\uc002\uc01b\uc00a\uc001\uc00a\uc04b\uc018\uc009\uc000\uc003\uc008\uc019\uc012\uc04b\uc010\uc009")));
    }

    public Class_20741(byte[] arrby) {
        this.Field_20742 = arrby;
    }

    public void Method_20746(Class_29900 class_29900) {
        class_29900.Method_29946(this.Field_20742);
    }

    private void Method_20747() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_20741.Method_20749("\u5e30\u5e31\u5e00\u5e31\u5e14\u5e15\u5e04\u5e15\u5e18\u5e19\u5e28\u5e19\u5e1c\u5e1d"));
    }

    private static String Method_20748(String string) {
        int n = 4772;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20741.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20749(String string) {
        int n = 8176;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20741.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_20750(Class_10954 class_10954) {
        this.Method_20744((Class_19025)class_10954);
    }

    public Class_20741() {
    }
}

