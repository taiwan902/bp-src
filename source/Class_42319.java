/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42319
extends Class_40019 {
    private static final Class_2080 Field_42320 = new Class_2080(Class_42319.Method_42326("\u9500\u9501\u950a\u9503\u9500\u9501\u9502\u9503\u9508\u9501\u950a\u9503\u9508\u9501\u950a\u950b\u9500\u9509\u950a\u9503\u9508\u9501\u950a\u950b\u9500\u9509\u9502\u950b\u9500"));
    private static final Class_2080 Field_42321 = new Class_2080(Class_42319.Method_42327("\u5131\u5120\u513d\u5131\u5134\u5133\u5124\u5132\u5122\u5128\u5123\u5139\u5120\u513d\u5130\u5126\u5122\u513a\u5139\u5133\u513e\u5126\u513e\u513d\u513b\u5102\u5129\u513c\u5134\u513c\u5137\u5129\u512b\u5122"));
    private static final Class_2080 Field_42322 = new Class_2080(Class_42319.Method_42334("\u00a4\u00a5\u00a2\u00a7\u00a0\u00a5\u00a2\u00a7\u00a4\u00a5\u00a6\u00a7\u00a4\u00a1\u00a6\u00a3\u00a4\u00a5\u00a6\u00a7\u00a0\u00a1\u00a2\u00a3\u00a4\u0085\u00a2\u00a7\u00a0\u00a5\u00a6\u00a3\u00a0\u00a5\u00a6"));

    protected Class_2080 Method_42323(Class_47526 class_47526) {
        return class_47526.\u0000= +() ? Field_42321 : (class_47526.Method_47558() ? Field_42322 : Field_42320);
    }

    private void Method_42324() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_42325(Class_859 class_859, double d, double d2, double d3, float f, float f2) {
        this.Method_42332((Class_47526)class_859, d, d2, d3, f, f2);
    }

    private static String Method_42326(String string) {
        int n = 21511;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42319.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_42327(String string) {
        int n = 27352;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42319.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_42328(Class_34093 class_34093, double d, double d2, double d3, float f, float f2) {
        this.Method_42332((Class_47526)class_34093, d, d2, d3, f, f2);
    }

    protected float Method_42329(Class_859 class_859, float f) {
        return this.Method_42330((Class_47526)class_859, f);
    }

    protected float Method_42330(Class_47526 class_47526, float f) {
        return class_47526.Method_47570();
    }

    public Class_42319(Class_8491 class_8491, Class_33781 class_33781, float f) {
        super(class_8491, class_33781, f);
        this.\u0000strictfp((Class_7380)new Class_40949(this));
    }

    protected Class_2080 Method_42331(Class_1061 class_1061) {
        return this.Method_42323((Class_47526)class_1061);
    }

    public void Method_42332(Class_47526 class_47526, double d, double d2, double d3, float f, float f2) {
        if (class_47526.Method_47546()) {
            float f3 = class_47526.\u0000strictfp(f2) * class_47526.Method_47561(f2);
            Class_16867.Method_16919(f3, f3, f3);
        }
        super.Method_40029(class_47526, d, d2, d3, f, f2);
    }

    public void Method_42333(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_42332((Class_47526)class_1061, d, d2, d3, f, f2);
    }

    private static String Method_42334(String string) {
        int n = 14231;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42319.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

