/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23053
extends Class_11681 {
    private Class_36556 Field_23054 = new Class_36556();
    private static final Class_2080 Field_23055 = new Class_2080(Class_23053.Method_23056("\u0014\u0004\u0010\u0015\u0011\u0015\u0001\u0014\u0005\u0004\u0004\u0015\u0005\u0011\u0015\u0000\u0015\u0015\u0011\u0011\u0015\u0011\u0000\u0014\u0014\u0014\u0005\u0005\u0015\u0015\u0010\u0010\u0015\u0001\u0005\u0004\u0005\u0001\u0014\u0001\u0005"));

    private static String Method_23056(String string) {
        int n = 27159;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23053.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_23057() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_23058(Class_4879 class_4879, double d, double d2, double d3, float f, int n) {
        this.Method_23059((Class_33962)class_4879, d, d2, d3, f, n);
    }

    public void Method_23059(Class_33962 class_33962, double d, double d2, double d3, float f, int n) {
        float f2;
        Class_16867.Method_16961();
        Class_16867.Method_16943((float)d + 0.26190478f * 1.9090909f, (float)d2 + 0.39344263f * 1.90625f, (float)d3 + 0.18072289f * 2.7666667f);
        float f3 = (float)class_33962.Field_33973 + f;
        Class_16867.Method_16943(0.0f, 0.045161292f * 2.2142856f + Class_13337.Method_13370(f3 * (0.10434783f * 0.9583333f)) * (4.6511626E-4f * 21.5f), 0.0f);
        for (f2 = class_33962.Field_33968 - class_33962.Field_33963; f2 >= 1.8366234f * 1.7105263f; f2 -= 12.566371f * 0.5f) {
        }
        while (f2 < -0.31948403f * 9.833333f) {
            f2 += 19.25f * 0.32639924f;
        }
        float f4 = class_33962.Field_33963 + f2 * f;
        Class_16867.Method_16940(-f4 * (0.35849056f * 502.1053f) / (25.5f * 0.123199716f), 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(1.1052631f * 72.38096f, 0.0f, 0.0f, 1.0f);
        this.\u0000strictfp(Field_23055);
        float f5 = class_33962.Field_33971 + (class_33962.Field_33970 - class_33962.Field_33971) * f + 0.09375f * 2.6666667f;
        float f6 = class_33962.Field_33971 + (class_33962.Field_33970 - class_33962.Field_33971) * f + 0.9255319f * 0.8103448f;
        f5 = (f5 - (float)Class_13337.Method_13375(f5)) * (0.9591837f * 1.6680851f) - 1.6285715f * 0.18421052f;
        f6 = (f6 - (float)Class_13337.Method_13375(f6)) * (1.309091f * 1.2222222f) - 0.39166668f * 0.7659575f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f7 = class_33962.Field_33972 + (class_33962.Field_33965 - class_33962.Field_33972) * f;
        Class_16867.Method_16979();
        this.Field_23054.Method_36564(null, f3, f5, f6, f7, 0.0f, 1.265625f * 0.049382716f);
        Class_16867.Method_16945();
    }
}

