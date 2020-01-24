/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40113
extends Class_40019 {
    private static final Class_2080 Field_40114 = new Class_2080(Class_40113.Method_40118("\u022c\u022c\u0222\u022e\u022c\u022a\u022e\u0228\u0226\u022c\u0224\u022e\u0220\u022c\u0222\u0224\u022a\u0228\u022e\u0224\u0228\u0226\u022c"));

    protected void Method_40115(Class_47097 class_47097, float f) {
        Class_16867.Method_16973(0.52807015f * 0.6627907f, 0.7f * 0.5f, 31.333334f * 0.011170212f);
    }

    protected Class_2080 Method_40116(Class_47097 class_47097) {
        return Field_40114;
    }

    public Class_40113(Class_8491 class_8491) {
        super(class_8491, new Class_34365(), 2.0f * 0.125f);
    }

    protected Class_2080 Method_40117(Class_1061 class_1061) {
        return this.Method_40116((Class_47097)class_1061);
    }

    private static String Method_40118(String string) {
        int n = 3907;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40113.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_40119(Class_859 class_859, float f, float f2, float f3) {
        this.Method_40122((Class_47097)class_859, f, f2, f3);
    }

    private void Method_40120() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_40121(Class_859 class_859, float f) {
        this.Method_40115((Class_47097)class_859, f);
    }

    protected void Method_40122(Class_47097 class_47097, float f, float f2, float f3) {
        if (!class_47097.Method_47105()) {
            Class_16867.Method_16943(0.0f, Class_13337.Method_13350(f * (0.051515155f * 5.8235292f)) * (0.3783784f * 0.2642857f), 0.0f);
        } else {
            Class_16867.Method_16943(0.0f, -0.024528304f * 4.076923f, 0.0f);
        }
        super.\u0000strictfp((Class_859)class_47097, f, f2, f3);
    }
}

