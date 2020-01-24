/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_39604
implements Class_1486 {
    public byte Field_39605;
    public Class_1782 Field_39606;

    public void Method_39607(Class_10954 class_10954) {
        this.Method_39610((Class_19025)class_10954);
    }

    private static String Method_39608(String string) {
        int n = 27787;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39604.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_39609(Class_29900 class_29900) {
        this.Field_39606 = class_29900.Method_30020();
        this.Field_39605 = class_29900.Method_29944();
    }

    public void Method_39610(Class_19025 class_19025) {
        class_19025.Method_19047(this);
    }

    private static String Method_39611(String string) {
        int n = 29287;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39604.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_39612(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_39604.Method_39608("\u40c0\u40c1\u40cc\u4085\u40cc\u40c5\u40c0\u40c9\u40c8\u408d\u40cc\u40cd\u40c0\u40c1\u40cc\u40cd\u40dc\u4095\u40dc\u40d1")));
    }

    private void Method_39613() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_39604.Method_39611("\u8121\u8123\u8110\u8122\u8104\u8105\u8116\u8105\u810a\u810b\u8138\u8109\u810f\u810f"));
    }
}

