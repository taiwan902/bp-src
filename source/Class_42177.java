/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42177
extends Class_40019 {
    protected Class_36335 Field_42178;
    private static final Class_2080 Field_42179;
    private static final Class_2080 Field_42180;
    private static final Class_2080 Field_42181;

    private static String Method_42182(String string) {
        int n = 13193;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42177.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_42183(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_42187((Class_34590)class_1061, d, d2, d3, f, f2);
    }

    private void Method_42184() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_2080 Method_42185(Class_1061 class_1061) {
        return this.Method_42191((Class_34590)class_1061);
    }

    public void Method_42186(Class_859 class_859, double d, double d2, double d3, float f, float f2) {
        this.Method_42187((Class_34590)class_859, d, d2, d3, f, f2);
    }

    public void Method_42187(Class_34590 class_34590, double d, double d2, double d3, float f, float f2) {
        Class_14453.Method_14460(class_34590, (8192 & -28276) != 0);
        super.Method_40029(class_34590, d, d2, d3, f, f2);
        if (class_34590.Field_34601 != null) {
            this.Method_42192(class_34590, d, d2, d3, f2);
        }
    }

    public void Method_42188(Class_34093 class_34093, double d, double d2, double d3, float f, float f2) {
        this.Method_42187((Class_34590)class_34093, d, d2, d3, f, f2);
    }

    static {
        Field_42180 = new Class_2080(Class_42177.Method_42189("\u1242\u1243\u124a\u1242\u1247\u1244\u1247\u1245\u1201\u124b\u1240\u124a\u1247\u124e\u1247\u1205\u1243\u1248\u1242\u1243\u1244\u1245\u1244\u124f\u1249\u124a\u124b\u1242\u1205\u124f\u1244\u124e\u1263\u1260\u1261\u1260\u126f\u1265\u1266\u1267\u1262\u1261\u1268\u126b\u126f\u1267\u1224\u126e\u1268\u1261"));
        Field_42181 = new Class_2080(Class_42177.Method_42194("\u4c8a\u4c8b\u4c80\u4c89\u4c8a\u4c89\u4c88\u4c8b\u4c80\u4c8b\u4c82\u4c89\u4c82\u4c8b\u4c80\u4c83\u4c9a\u4c91\u4c98\u4c99\u4c98\u4c9b\u4c9a\u4c99\u4c98\u4c91\u4c92\u4c93\u4c9a\u4c99\u4c98\u4c9b\u4ca0\u4ca1\u4ca2\u4ca9\u4ca2\u4cab\u4ca0\u4ca3\u4caa\u4ca3\u4ca2\u4cab\u4ca0\u4cab\u4ca2\u4cab"));
        Field_42179 = new Class_2080(Class_42177.Method_42182("\u0006\u0007\n\u0007\u0002\u0005\u0002\u0005L\u0007\f\u0007\u000e\u0003\u000eI\u0006\r\u0006\u0007\u0004\u0003\u0004\u0007\u0004\r\fM\u0002\u0005\u0006\u0001\f\rL\u0003\b\u0001"));
    }

    public Class_42177(Class_8491 class_8491) {
        super(class_8491, new Class_36335(0.0f), 0.055555556f * 9.0f);
        this.Field_42178 = (Class_36335)this.\u0000strictfp;
        this.\u0000strictfp((Class_7380)new Class_15690(this));
        this.\u0000strictfp((Class_7380)new Class_32045());
    }

    private static String Method_42189(String string) {
        int n = 32733;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42177.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_42190(Class_859 class_859, float f, float f2, float f3) {
        this.Method_42195((Class_34590)class_859, f, f2, f3);
    }

    protected Class_2080 Method_42191(Class_34590 class_34590) {
        return Field_42179;
    }

    protected void Method_42192(Class_34590 class_34590, double d, double d2, double d3, float f) {
        float f2 = (float)class_34590.Field_34601.Field_14847 + f;
        float f3 = Class_13337.Method_13370(f2 * (0.18681319f * 1.0705882f)) / 2.0f + 0.40449437f * 1.2361112f;
        f3 = (f3 * f3 + f3) * (0.71276593f * 0.28059703f);
        float f4 = (float)(class_34590.Field_34601.\u0000= package - class_34590.\u0000= package - (class_34590.\u0000%() - class_34590.\u0000= package) * (double)(1.0f - f));
        float f5 = (float)((double)f3 + class_34590.Field_34601.\u0000, for() - 1.0 - class_34590.\u0000, for() - (class_34590.\u0000= final() - class_34590.\u0000, for()) * (double)(1.0f - f));
        float f6 = (float)(class_34590.Field_34601.\u0000= switch - class_34590.\u0000= switch - (class_34590.\u0000
        () - class_34590.\u0000= switch) * (double)(1.0f - f));
        float f7 = Class_13337.Method_13388(f4 * f4 + f6 * f6);
        float f8 = Class_13337.Method_13388(f4 * f4 + f5 * f5 + f6 * f6);
        Class_16867.Method_16961();
        Class_16867.Method_16943((float)d, (float)d2 + 2.0f, (float)d3);
        Class_16867.Method_16940((float)(-Math.atan2(f6, f4)) * (3.5384614f * 50.869568f) / (0.62068963f * 5.0614552f) - 0.37931034f * 237.27274f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940((float)(-Math.atan2(f7, f5)) * (164.51613f * 1.0941176f) / (0.82608694f * 3.8029807f) - 72.58064f * 1.24f, 1.0f, 0.0f, 0.0f);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        Class_39477.Method_39484();
        Class_16867.Method_16969();
        this.\u0000strictfp(Field_42180);
        Class_16867.Method_16972(7427 & -25307);
        float f9 = 0.0f - ((float)class_34590.\u0000= package + f) * (1.4615384f * 0.006842105f);
        float f10 = Class_13337.Method_13388(f4 * f4 + f5 * f5 + f6 * f6) / (0.28723404f * 111.40741f) - ((float)class_34590.\u0000= package + f) * (0.597561f * 0.016734693f);
        class_22385.Method_22417(-23515 & 2645, Class_29585.Field_29586);
        int n = 9500 & 202;
        for (int i = 1732 & -8192; i <= (8236 & 21000); ++i) {
            float f11 = Class_13337.Method_13370((float)(i % (16474 & -20472)) * (0.028571429f * 109.95574f) * 2.0f / (0.041666668f * 192.0f)) * (0.97727275f * 0.76744187f);
            float f12 = Class_13337.Method_13350((float)(i % (-32727 & 16408)) * (6.198278f * 0.5068493f) * 2.0f / (0.8305085f * 9.632653f)) * (0.8854167f * 0.84705883f);
            float f13 = (float)(i % (8777 & 270)) * 1.0f / (0.71794873f * 11.142857f);
            class_22385.Method_22443(f11 * (0.3846154f * 0.52f), f12 * (2.3f * 0.08695652f), 0.0).Method_22433(f13, f10).Method_22424(-32443 & 10274, 4355 & -21360, 16786 & -26623, -31489 & 511).Method_22451();
            class_22385.Method_22443(f11, f12, f8).Method_22433(f13, f9).Method_22424(-29953 & 16639, -32257 & 13055, 255 & -6657, 2303 & 14079).Method_22451();
        }
        class_7644.Method_7647();
        Class_16867.Method_16979();
        Class_16867.Method_16972(23872 & -25208);
        Class_39477.Method_39482();
        Class_16867.Method_16945();
    }

    protected void Method_42193(Class_34590 class_34590, float f, float f2, float f3, float f4, float f5, float f6) {
        if (class_34590.Field_34596 > 0) {
            float f7 = (float)class_34590.Field_34596 / (0.93333334f * 214.28572f);
            Class_16867.Method_16936(1803 & 4759);
            Class_16867.Method_16913();
            Class_16867.Method_16967(-6651 & 604, f7);
            this.\u0000strictfp(Field_42181);
            this.\u0000strictfp.Method_33794(class_34590, f, f2, f3, f4, f5, f6);
            Class_16867.Method_16967(646 & -19619, 0.104166664f * 0.96000004f);
            Class_16867.Method_16936(2626 & 9754);
        }
        this.\u0000, `((Class_1061)class_34590);
        this.\u0000strictfp.Method_33794(class_34590, f, f2, f3, f4, f5, f6);
        if (class_34590.\u0000= " > 0) {
            Class_16867.Method_16936(546 & 2002);
            Class_16867.Method_16922();
            Class_16867.Method_16947();
            Class_16867.Method_16951(4879 & 19218, 815 & 17299);
            Class_16867.Method_16924(1.0f, 0.0f, 0.0f, 1.2698413f * 0.39374998f);
            this.\u0000strictfp.Method_33794(class_34590, f, f2, f3, f4, f5, f6);
            Class_16867.Method_16965();
            Class_16867.Method_16952();
            Class_16867.Method_16936(-31037 & 2575);
        }
    }

    private static String Method_42194(String string) {
        int n = 3602;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42177.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_42195(Class_34590 class_34590, float f, float f2, float f3) {
        float f4 = (float)class_34590.Method_34616(807 & 1223, f3)[4428 & -8032];
        float f5 = (float)(class_34590.Method_34616(8197 & -31283, f3)[16903 & 10249] - class_34590.Method_34616(-8182 & 90, f3)[25 & -14299]);
        Class_16867.Method_16940(-f4, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(f5 * (1.0f * 10.0f), 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16943(0.0f, 0.0f, 1.0f);
        if (class_34590.\u0000= static > 0) {
            float f6 = ((float)class_34590.\u0000= static + f3 - 1.0f) / (2.090909f * 9.565218f) * (2.637838f * 0.60655737f);
            if ((f6 = Class_13337.Method_13388(f6)) > 1.0f) {
                f6 = 1.0f;
            }
            Class_16867.Method_16940(f6 * this.\u0000strictfp((Class_859)class_34590), 0.0f, 0.0f, 1.0f);
        }
    }

    protected void Method_42196(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_42193((Class_34590)class_859, f, f2, f3, f4, f5, f6);
    }
}

