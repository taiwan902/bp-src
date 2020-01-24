/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_27380 {
    private static final Class_2080 Field_27381 = new Class_2080(Class_27380.Method_27393("\uc745\uc754\uc741\uc745\uc744\uc743\uc754\uc742\uc71e\uc75c\uc758\uc74a\uc75a\uc71e\uc74a\uc759\uc740\uc745\uc746\uc756\uc707\uc751\uc747\uc746"));
    protected final Class_8491 Field_27382;
    protected float Field_27383;
    protected float Field_27384 = 1.0f;
    private static Class_3839 Field_27385;
    private static Class_3839 Field_27386;

    public static void Method_27387(Class_10997 class_10997, double d, double d2, double d3) {
        Class_16867.Method_16922();
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        class_22385.Method_22444(d, d2, d3);
        class_22385.Method_22417(21047 & 3407, Class_29585.Field_29599);
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11001).Method_22446(0.0f, 0.0f, -0.13131313f * 7.6153846f).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11001).Method_22446(0.0f, 0.0f, -0.3829787f * 2.6111112f).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11001).Method_22446(0.0f, 0.0f, 1.3f * -0.7692308f).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11001).Method_22446(0.0f, 0.0f, -0.8924731f * 1.120482f).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11003).Method_22446(0.0f, 0.0f, 1.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11003).Method_22446(0.0f, 0.0f, 1.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11003).Method_22446(0.0f, 0.0f, 1.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11003).Method_22446(0.0f, 0.0f, 1.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11001).Method_22446(0.0f, 1.0909091f * -0.9166666f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11001).Method_22446(0.0f, 0.14285715f * -6.9999995f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11003).Method_22446(0.0f, 11.0f * -0.09090909f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11003).Method_22446(0.0f, 1.2820513f * -0.78f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11003).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11003).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11001).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11001).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11003).Method_22446(2.0697675f * -0.48314607f, 0.0f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11003).Method_22446(-1.2105263f * 0.82608694f, 0.0f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_10998, class_10997.Field_11001).Method_22446(0.8730159f * -1.1454545f, 0.0f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11001).Method_22446(-2.0f * 0.5f, 0.0f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11001).Method_22446(1.0f, 0.0f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11001).Method_22446(1.0f, 0.0f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11003).Method_22446(1.0f, 0.0f, 0.0f).Method_22451();
        class_22385.Method_22443(class_10997.Field_11002, class_10997.Field_11000, class_10997.Field_11003).Method_22446(1.0f, 0.0f, 0.0f).Method_22451();
        class_7644.Method_7647();
        class_22385.Method_22444(0.0, 0.0, 0.0);
        Class_16867.Method_16965();
    }

    public boolean Method_27388(Class_1061 class_1061, Class_23708 class_23708, double d, double d2, double d3) {
        Class_10997 class_10997 = class_1061.Method_1315();
        if (class_10997.Method_11020() || class_10997.Method_11025() == 0.0) {
            class_10997 = new Class_10997(class_1061.Field_1130 - 1.3103448275862069 * 1.5263157894736843, class_1061.Method_1324() - 5.166666666666667 * 0.3870967741935484, class_1061.Field_1106 - 2.207792207792208 * 0.9058823529411765, class_1061.Field_1130 + 13.25 * 0.1509433962264151, class_1061.Method_1324() + 2.4814814814814814 * 0.8059701492537313, class_1061.Field_1106 + 2.933333333333333 * 0.6818181818181819);
        }
        return (class_1061.Method_1209(d, d2, d3) && (class_1061.Field_1104 || class_23708.Method_23709(class_10997)) ? -23795 & 16385 : 22594 & 677) != 0;
    }

    public Class_27380(Class_8491 class_8491) {
        this.Field_27382 = class_8491;
    }

    public void Method_27389(Class_2080 class_2080) {
        this.Field_27382.Field_8506.Method_34707(class_2080);
    }

    public void Method_27390(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        if (this.Field_27382.Field_8501 != null) {
            double d4;
            float f3;
            if (this.Field_27382.Field_8501.Field_39714 && this.Field_27383 > 0.0f && !class_1061.Method_1358() && this.Field_27382.Method_8529() && (f3 = (float)((1.0 - (d4 = this.Field_27382.Method_8518(class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106)) / (1.2758620689655173 * 200.64864864864865)) * (double)this.Field_27384)) > 0.0f) {
                this.Method_27391(class_1061, d, d2, d3, f3, f2);
            }
            if (!(!class_1061.Method_1343() || class_1061 instanceof Class_626 && ((Class_626)class_1061).Method_752())) {
                this.Method_27399(class_1061, d, d2, d3, f2);
            }
        }
    }

    static {
        Field_27386 = new Class_3839(Class_2263.Method_2295(), Class_2205.Field_2230);
        Field_27385 = new Class_3839(Class_2263.Method_2290(), Class_2205.Field_2257);
    }

    private void Method_27391(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        if (!Class_19426.Method_19570() || !Class_12440.Field_12530) {
            Class_16867.Method_16947();
            Class_16867.Method_16951(2914 & -31994, -31961 & 20435);
            this.Field_27382.Field_8506.Method_34707(Field_27381);
            Class_283 class_283 = this.Method_27397();
            Class_16867.Method_16930((2050 & 5456) != 0);
            float f3 = this.Field_27383;
            if (class_1061 instanceof Class_34093) {
                Class_34093 class_34093 = (Class_34093)class_1061;
                f3 *= class_34093.Method_34136();
                if (class_34093.\u0000, for()) {
                    f3 *= 0.055555556f * 9.0f;
                }
            }
            double d4 = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * (double)f2;
            double d5 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f2;
            double d6 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * (double)f2;
            int n = Class_13337.Method_13371(d4 - (double)f3);
            int n2 = Class_13337.Method_13371(d4 + (double)f3);
            int n3 = Class_13337.Method_13371(d5 - (double)f3);
            int n4 = Class_13337.Method_13371(d5);
            int n5 = Class_13337.Method_13371(d6 - (double)f3);
            int n6 = Class_13337.Method_13371(d6 + (double)f3);
            double d7 = d - d4;
            double d8 = d2 - d5;
            double d9 = d3 - d6;
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            class_22385.Method_22417(-26585 & 1751, Class_29585.Field_29586);
            for (Class_4810 class_4810 : Class_4751.Method_4789(new Class_4751(n, n3, n5), new Class_4751(n2, n4, n6))) {
                Class_3238 class_3238 = class_283.Method_375(class_4810.\u0000strictfp()).Method_3442();
                if (class_3238.Method_3316() == (-1 & -1) || class_283.Method_451(class_4810) <= (1571 & 16595)) continue;
                this.Method_27405(class_3238, d, d2, d3, class_4810, f, f3, d7, d8, d9);
            }
            class_7644.Method_7647();
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16952();
            Class_16867.Method_16930((265 & 151) != 0);
        }
    }

    protected void Method_27392(Class_1061 class_1061, String string, double d, double d2, double d3, int n) {
        if (Class_19426.Method_19570() && Class_12440.Field_12441) {
            return;
        }
        double d4 = class_1061.Method_1356(this.Field_27382.Field_8510);
        if (d4 <= (double)(n * n) && !Class_18.Field_89.Field_84.Field_39731) {
            Class_28636 class_28636 = this.Method_27404();
            float f = Field_27385.Method_3850();
            float f2 = Field_27386.Method_3850() * f;
            Class_16867.Method_16961();
            Class_16867.Method_16943((float)d + 0.0f, (float)d2 + class_1061.Method_1287() + 0.36842108f * 1.3571428f, (float)d3);
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            float f3 = this.Field_27382.Field_8492;
            float f4 = this.Field_27382.Field_8499;
            if (Class_18.Field_89.Field_84.Field_39802 == (-12238 & 3466)) {
                f4 = -f4;
            }
            Class_16867.Method_16940(-f3, 0.0f, 1.0f, 0.0f);
            Class_16867.Method_16940(f4, 1.0f, 0.0f, 0.0f);
            Class_16867.Method_16973(-f2, -f2, f2);
            Class_16867.Method_16931();
            Class_16867.Method_16930((-3550 & 1345) != 0);
            Class_16867.Method_16944();
            Class_16867.Method_16947();
            Class_16867.Method_16984(3914 & 9094, -31865 & 9027, 7309 & 24593, 1312 & -32768);
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            int n2 = 576 & 2208;
            int n3 = class_28636.Method_28715(string) / (5131 & 2050);
            if (((Boolean)Class_18.Field_89.Field_84.Field_39732.Field_8861.\u0000strictfp()).booleanValue() && !Class_19426.Method_19570()) {
                Class_16867.Method_16922();
                class_22385.Method_22417(-12265 & 263, Class_29585.Field_29601);
                class_22385.Method_22443(-n3 - (33 & 10651), (-1 & -1) + n2, 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.28688526f * 0.87142855f).Method_22451();
                class_22385.Method_22443(-n3 - (-20205 & 1217), (-8116 & 1304) + n2, 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.16129032f * 1.5500001f).Method_22451();
                class_22385.Method_22443(n3 + (-28287 & 563), (-31480 & 553) + n2, 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.39215687f * 0.6375f).Method_22451();
                class_22385.Method_22443(n3 + (18537 & 13191), (-1 & -1) + n2, 0.0).Method_22427(0.0f, 0.0f, 0.0f, 9.75f * 0.025641026f).Method_22451();
                class_7644.Method_7647();
                Class_16867.Method_16965();
            }
            Class_28636 class_286362 = Class_18.Field_89.Field_27;
            class_286362.Method_28692(string, -class_28636.Method_28715(string) / (-29306 & 594), n2, 603979775 & 553648127);
            Class_16867.Method_16927();
            Class_16867.Method_16930((-32695 & 7813) != 0);
            class_286362.Method_28692(string, -class_28636.Method_28715(string) / (770 & 8198), n2, -1 & -1);
            Class_16867.Method_16918();
            Class_16867.Method_16952();
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16945();
        }
    }

    private static String Method_27393(String string) {
        int n = 1540;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27380.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_8491 Method_27394() {
        return this.Field_27382;
    }

    protected boolean Method_27395(Class_1061 class_1061) {
        Class_2080 class_2080 = this.Method_27398(class_1061);
        if (class_2080 == null) {
            return (2049 & 4630) != 0;
        }
        this.Method_27389(class_2080);
        return (9881 & 18689) != 0;
    }

    protected void Method_27396(Class_1061 class_1061, double d, double d2, double d3) {
        if (this.Method_27400(class_1061)) {
            this.Method_27392(class_1061, class_1061.Method_1202(), d, d2, d3, 16480 & 1104);
        }
    }

    private Class_283 Method_27397() {
        return this.Field_27382.Field_8502;
    }

    protected abstract Class_2080 Method_27398(Class_1061 var1);

    private void Method_27399(Class_1061 class_1061, double d, double d2, double d3, float f) {
        Class_16867.Method_16931();
        Class_24069 class_24069 = Class_18.Field_89.Method_189();
        Class_11372 class_11372 = class_24069.Method_24109("minecraft:blocks/fire_layer_0");
        Class_11372 class_113722 = class_24069.Method_24109("minecraft:blocks/fire_layer_1");
        Class_16867.Method_16961();
        Class_16867.Method_16943((float)d, (float)d2, (float)d3);
        float f2 = class_1061.Method_1266() * (0.118421055f * 11.822222f);
        Class_16867.Method_16973(f2, f2, f2);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        float f3 = 0.38541666f * 1.2972974f;
        float f4 = 0.0f;
        float f5 = class_1061.Method_1287() / f2;
        float f6 = (float)(class_1061.Method_1324() - class_1061.Method_1315().Field_11000);
        Class_16867.Method_16940(-this.Field_27382.Field_8492, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16943(0.0f, 0.0f, -0.18658537f * 1.6078432f + (float)((int)f5) * (0.9883721f * 0.020235294f));
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        float f7 = 0.0f;
        int n = 256 & 13376;
        class_22385.Method_22417(4399 & -24057, Class_29585.Field_29598);
        while (f5 > 0.0f) {
            Class_11372 class_113723 = n % (1795 & 20482) == 0 ? class_11372 : class_113722;
            this.Method_27389(Class_24069.Field_24084);
            float f8 = class_113723.Method_11420();
            float f9 = class_113723.Method_11437();
            float f10 = class_113723.Method_11444();
            float f11 = class_113723.Method_11429();
            if (n / (6 & 1186) % (1066 & 12370) == 0) {
                float f12 = f10;
                f10 = f8;
                f8 = f12;
            }
            class_22385.Method_22443(f3 - f4, 0.0f - f6, f7).Method_22433(f10, f11).Method_22451();
            class_22385.Method_22443(-f3 - f4, 0.0f - f6, f7).Method_22433(f8, f11).Method_22451();
            class_22385.Method_22443(-f3 - f4, 3.6666667f * 0.38181818f - f6, f7).Method_22433(f8, f9).Method_22451();
            class_22385.Method_22443(f3 - f4, 2.5083332f * 0.55813956f - f6, f7).Method_22433(f10, f9).Method_22451();
            f5 -= 3.142857f * 0.14318182f;
            f6 -= 0.9f * 0.5f;
            f3 *= 2.1272726f * 0.42307693f;
            f7 += 0.5955056f * 0.050377358f;
            ++n;
        }
        class_7644.Method_7647();
        Class_16867.Method_16945();
        Class_16867.Method_16918();
    }

    protected boolean Method_27400(Class_1061 class_1061) {
        return (class_1061.Method_1313() && class_1061.Method_1260() ? 2083 & 8705 : -8184 & 517) != 0;
    }

    private void Method_27401() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_27402(Class_1061 class_1061, double d, double d2, double d3, String string, float f, double d4) {
        this.Method_27392(class_1061, string, d, d2, d3, 20568 & -29088);
    }

    public void Method_27403(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_27396(class_1061, d, d2, d3);
    }

    public Class_28636 Method_27404() {
        return this.Field_27382.Method_8526();
    }

    private void Method_27405(Class_3238 class_3238, double d, double d2, double d3, Class_4751 class_4751, float f, float f2, double d4, double d5, double d6) {
        if (class_3238.Method_3319()) {
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            double d7 = ((double)f - (d2 - ((double)class_4751.\u0000, `() + d5)) / (0.3055555555555555 * 6.545454545454546)) * (0.6626506024096386 * 0.7545454545454545) * (double)this.Method_27397().Method_397(class_4751);
            if (d7 >= 0.0) {
                if (d7 > 1.0) {
                    d7 = 1.0;
                }
                double d8 = (double)class_4751.\u0000= final() + class_3238.Method_3352() + d4;
                double d9 = (double)class_4751.\u0000= final() + class_3238.Method_3379() + d4;
                double d10 = (double)class_4751.\u0000, `() + class_3238.Method_3324() + d5 + 35.5 * 4.4014084507042255E-4;
                double d11 = (double)class_4751.\u0000strictfp() + class_3238.Method_3315() + d6;
                double d12 = (double)class_4751.\u0000strictfp() + class_3238.Method_3291() + d6;
                float f3 = (float)((d - d8) / (1.4098360655737705 * 1.4186046511627908) / (double)f2 + 3.2857142857142856 * 0.15217391304347827);
                float f4 = (float)((d - d9) / (0.2235294117647059 * 8.947368421052632) / (double)f2 + 0.17808219178082194 * 2.8076923076923075);
                float f5 = (float)((d3 - d11) / (0.8571428571428571 * 2.3333333333333335) / (double)f2 + 0.3 * 1.6666666666666667);
                float f6 = (float)((d3 - d12) / (2.4705882352941178 * 0.8095238095238095) / (double)f2 + 0.525 * 0.9523809523809523);
                class_22385.Method_22443(d8, d10, d11).Method_22433(f3, f5).Method_22427(1.0f, 1.0f, 1.0f, (float)d7).Method_22451();
                class_22385.Method_22443(d8, d10, d12).Method_22433(f3, f6).Method_22427(1.0f, 1.0f, 1.0f, (float)d7).Method_22451();
                class_22385.Method_22443(d9, d10, d12).Method_22433(f4, f6).Method_22427(1.0f, 1.0f, 1.0f, (float)d7).Method_22451();
                class_22385.Method_22443(d9, d10, d11).Method_22433(f4, f5).Method_22427(1.0f, 1.0f, 1.0f, (float)d7).Method_22451();
            }
        }
    }
}

