/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33999
implements Class_1486 {
    private byte[] Field_34000;

    public void Method_34001(Class_29900 class_29900) {
        this.Field_34000 = class_29900.Method_29950();
    }

    public void Method_34002(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_33999.Method_34005("\u20e0\u20e1\u20ec\u20a5\u20e8\u20e1\u20e4\u20ed\u20e8\u20ad\u20ec\u20ed\u20e4\u20e5\u20e8\u20e9\u20fc\u20b5\u20fc\u20f1")));
    }

    public byte[] Method_34003() {
        return this.Field_34000;
    }

    private void Method_34004() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_33999.Method_34007("\u800e\u8001\u802f\u8000\u802b\u8027\u802d\u802f\u8025\u802d\u800b\u802b\u802c\u8025"));
    }

    private static String Method_34005(String string) {
        int n = 27348;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33999.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_34006(Class_10954 class_10954) {
        this.Method_34008((Class_19025)class_10954);
    }

    private static String Method_34007(String string) {
        int n = 24666;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33999.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_34008(Class_19025 class_19025) {
        class_19025.Method_19072(this);
    }
}

