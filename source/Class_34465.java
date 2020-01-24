/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34465
extends Class_11681 {
    private Class_33882 Field_34466 = new Class_33882();
    private static final Class_2080 Field_34467 = new Class_2080(Class_34465.Method_34471("\u20ba\u20ab\u20b0\u20b9\u20be\u20bd\u20ac\u20bf\u20e0\u20ab\u20a2\u20b9\u20a6\u20bf\u20b4\u20e7\u20a8\u20a3\u20a8\u20bb\u20be\u20e5\u20ac\u20a7\u20aa\u20ab\u20ba\u20e3\u20be\u20a5\u20ae"));

    public void Method_34468(Class_4879 class_4879, double d, double d2, double d3, float f, int n) {
        this.Method_34469((Class_39196)class_4879, d, d2, d3, f, n);
    }

    public void Method_34469(Class_39196 class_39196, double d, double d2, double d3, float f, int n) {
        int n2 = 12802 & 16517;
        if (class_39196.\u0000= final()) {
            n2 = class_39196.\u0000, `();
        }
        if (n >= 0) {
            this.\u0000strictfp(\u0000strictfp[n]);
            Class_16867.Method_16934(14298 & 5927);
            Class_16867.Method_16961();
            Class_16867.Method_16973(0.27118644f * 14.75f, 7.0f * 0.5714286f, 1.0f);
            Class_16867.Method_16943(0.09090909f * 0.6875f, 32.666668f * 0.0019132652f, 0.75342464f * 0.08295455f);
            Class_16867.Method_16934(14201 & 6018);
        } else {
            this.\u0000strictfp(Field_34467);
        }
        Class_16867.Method_16961();
        Class_16867.Method_16957();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16943((float)d, (float)d2 + 1.0f, (float)d3 + 1.0f);
        Class_16867.Method_16973(1.0f, -22.0f * 0.045454547f, -0.4f * 2.5f);
        Class_16867.Method_16943(4.285714f * 0.11666667f, 7.8749995f * 0.06349207f, 1.7872341f * 0.2797619f);
        int n3 = 11288 & -32124;
        if (n2 == (-30206 & 28803)) {
            n3 = -23620 & 245;
        }
        if (n2 == (9383 & 18435)) {
            n3 = -24276 & 5187;
        }
        if (n2 == (780 & 1028)) {
            n3 = -16166 & 2398;
        }
        if (n2 == (7509 & 135)) {
            n3 = -66 & -90;
        }
        Class_16867.Method_16940(n3, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16943(-0.69298244f * 0.721519f, 1.1388888f * -0.43902442f, 0.65384614f * -0.7647059f);
        float f2 = class_39196.Field_39198 + (class_39196.Field_39197 - class_39196.Field_39198) * f;
        f2 = 1.0f - f2;
        f2 = 1.0f - f2 * f2 * f2;
        this.Field_34466.Field_33883.Field_31984 = -(f2 * (0.7419355f * 4.2343206f) / 2.0f);
        this.Field_34466.Method_33887();
        Class_16867.Method_16942();
        Class_16867.Method_16945();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        if (n >= 0) {
            Class_16867.Method_16934(6074 & -18622);
            Class_16867.Method_16945();
            Class_16867.Method_16934(-8440 & 6048);
        }
    }

    private void Method_34470() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_34471(String string) {
        int n = 28826;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34465.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

