/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Class_16147
implements Class_7380 {
    private static final Map Field_16148;
    protected Class_33781 Field_16149;
    private float Field_16150 = 1.0f;
    private float Field_16151 = 1.0f;
    protected static final Class_2080 Field_16152;
    protected Class_33781 Field_16153;
    private final Class_28538 Field_16154;
    private float Field_16155 = 1.0f;
    private float Field_16156 = 1.0f;
    Random Field_16157 = new Random();
    public static Class_7536 Field_16158;
    private boolean Field_16159;

    public Class_16147(Class_28538 class_28538) {
        this.Field_16154 = class_28538;
        this.Method_16174();
    }

    static float Method_16160(long l, long l2) {
        double d = (double)(l %= (long)((double)l2 * (3.2163924786752647 * 0.9767441860465116) * (0.8676470588235294 * 2.305084745762712))) / (double)l2;
        return (float)(0.8241758241758241 * 0.6066666666666667 * (1.0 + Math.sin(d)));
    }

    private Class_2080 Method_16161(Class_37716 class_37716, boolean bl, String string) {
        StringBuilder stringBuilder = new StringBuilder("textures/models/armor/");
        stringBuilder.append(class_37716.Method_37726().Method_18645()).append("_layer_").append(bl ? -32634 & 9226 : 105 & -10095);
        if (string != null) {
            stringBuilder.append((char)(895 & -10145));
            stringBuilder.append(string);
        }
        stringBuilder.append(".png");
        String string2 = stringBuilder.toString();
        Class_2080 class_2080 = (Class_2080)Field_16148.get(string2);
        if (class_2080 == null) {
            class_2080 = new Class_2080(string2);
            Field_16148.put(string2, class_2080);
        }
        return class_2080;
    }

    private Class_2080 Method_16162(Class_37716 class_37716, boolean bl) {
        return this.Method_16161(class_37716, bl, null);
    }

    private static double[] Method_16163(double d, double d2, double d3) {
        double d4 = 0.0;
        double d5 = 0.0;
        double d6 = 0.0;
        double[] arrd = new double[-31865 & 17411];
        if (d3 == 0.0) {
            d4 = 0.0;
            d5 = 0.0;
            d6 = 0.0;
        } else {
            double d7 = Math.floor(d /= 57.66233766233766 * 1.0405405405405406);
            double d8 = d - d7;
            double d9 = d3 * (1.0 - d2);
            double d10 = d3 * (1.0 - d2 * d8);
            double d11 = d3 * (1.0 - d2 * (1.0 - d8));
            if (d7 == 0.0) {
                d4 = d3;
                d5 = d11;
                d6 = d9;
            } else if (d7 == 1.0) {
                d4 = d10;
                d5 = d3;
                d6 = d9;
            } else if (d7 == 4.722222222222222 * 0.4235294117647059) {
                d4 = d9;
                d5 = d3;
                d6 = d11;
            } else if (d7 == 1.6666666666666665 * 1.8) {
                d4 = d9;
                d5 = d10;
                d6 = d3;
            } else if (d7 == 1.92 * 2.0833333333333335) {
                d4 = d11;
                d5 = d9;
                d6 = d3;
            } else if (d7 == 0.6756756756756757 * 7.4) {
                d4 = d3;
                d5 = d9;
                d6 = d10;
            }
        }
        arrd[128 & -16260] = d4;
        arrd[19509 & 12611] = d5;
        arrd[-32702 & 6667] = d6;
        return arrd;
    }

    private void Method_16164() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_16165(Class_859 class_859, Class_33781 class_33781, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!(Class_19426.Method_19570() && Class_12440.Field_12441 || !((Boolean)this.Field_16154.\u0000strictfp().Method_8526().Field_28646.Field_39732.Field_8841.\u0000strictfp()).booleanValue())) {
            float f8 = (float)class_859.\u0000= package + f3;
            this.Field_16154.\u0000strictfp(Field_16152);
            if (Class_19426.Method_19570()) {
                Class_25377.Method_25391();
            }
            Class_16867.Method_16947();
            Class_16867.Method_16936(19219 & -31070);
            Class_16867.Method_16930((3733 & -20214) != 0);
            float f9 = 0.027027028f * 18.5f;
            Class_16867.Method_16924(f9, f9, f9, 1.0f);
            for (int i = 25861 & -32536; i < (1814 & 8419); ++i) {
                Class_16867.Method_16931();
                Class_16867.Method_16951(2897 & 896, 20481 & 17);
                float f10 = 3.8422222f * 0.1978022f;
                Class_16867.Method_16924(21.25f * 0.023529412f * f10, 1.75f * 0.14285715f * f10, 5.2727275f * 0.15172413f * f10, 1.0f);
                Class_16867.Method_16934(-10462 & 5890);
                Class_16867.Method_16962();
                float f11 = 0.9166667f * 0.36363637f;
                Class_16867.Method_16973(f11, f11, f11);
                Class_16867.Method_16940(0.53061223f * 56.538464f - (float)i * (217.5f * 0.27586207f), 0.0f, 0.0f, 1.0f);
                Class_16867.Method_16943(0.0f, f8 * (1.3188406f * 7.5824175E-4f + (float)i * (0.0042115385f * 0.7123288f)) * (13.333333f * 1.5f), 0.0f);
                Class_16867.Method_16934(5888 & -248);
                class_33781.Method_33794(class_859, f, f2, f4, f5, f6, f7);
            }
            Class_16867.Method_16934(5895 & -24694);
            Class_16867.Method_16962();
            Class_16867.Method_16934(22288 & -26872);
            Class_16867.Method_16918();
            Class_16867.Method_16930((4215 & 16513) != 0);
            Class_16867.Method_16936(931 & 8711);
            Class_16867.Method_16952();
            if (Class_19426.Method_19570()) {
                Class_25377.Method_25385();
            }
        }
    }

    static float Method_16166(long l, long l2) {
        double d = (double)(l %= (long)((double)l2 * (3.040250955086896 * 1.0333333333333334) * (0.38271604938271603 * 5.225806451612904))) / (double)l2;
        return (float)(1.0 * 0.5 * (1.0 + Math.cos(d)));
    }

    private boolean Method_16167(int n) {
        return (n == (24626 & 450) ? 2575 & 177 : 2068 & -10496) != 0;
    }

    public Class_23823 Method_16168(Class_859 class_859, int n) {
        return class_859.Method_1048(n - (-15367 & 14337));
    }

    public boolean Method_16169() {
        return (23049 & -32464) != 0;
    }

    public void Method_16170(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Method_16172(class_859, f, f2, f3, f4, f5, f6, f7, 2701 & 4);
        this.Method_16172(class_859, f, f2, f3, f4, f5, f6, f7, 35 & 26907);
        this.Method_16172(class_859, f, f2, f3, f4, f5, f6, f7, 11050 & 22);
        this.Method_16172(class_859, f, f2, f3, f4, f5, f6, f7, 2161 & 21377);
    }

    private static String Method_16171(String string) {
        int n = 20553;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16147.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_16172(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7, int n) {
        Class_23823 class_23823 = this.Method_16168(class_859, n);
        if (class_23823 != null && class_23823.Method_23844() instanceof Class_37716) {
            Class_37716 class_37716 = (Class_37716)class_23823.Method_23844();
            Class_33781 class_33781 = this.Method_16175(n);
            Class_33781 class_337812 = this.Field_16154.Method_28550();
            class_33781.Method_33792(class_337812);
            class_33781.Method_33790(class_859, f, f2, f3);
            this.Method_16173(class_33781, n);
            boolean bl = this.Method_16167(n);
            this.Field_16154.\u0000strictfp(this.Method_16162(class_37716, bl));
            switch (Class_13557.Field_13558[class_37716.Method_37726().ordinal()]) {
                case 1: {
                    int n2 = class_37716.Method_37729(class_23823);
                    float f8 = (float)(n2 >> (10801 & 21970) & (511 & 255)) / (1.65625f * 153.96227f);
                    float f9 = (float)(n2 >> (168 & -18417) & (-27393 & 767)) / (236.52174f * 1.078125f);
                    float f10 = (float)(n2 & (767 & -28417)) / (1.531915f * 166.45833f);
                    if ((n2 >> (-8104 & 410) & (21247 & 10495)) == (343 & 12493)) {
                        int n3 = n2 & (3327 & -24321);
                        int n4 = n2 >> (23057 & 22) & (8703 & -32001);
                        long l = System.nanoTime();
                        l += (long)n4 * (-8021661992989307184L & 1006291489L);
                        if (n3 == (-12223 & 2049)) {
                            f9 = f8 = Class_16147.Method_16160(l + (long)n * (194234180L & 5916188367209602825L), 4713286812841267712L & -4713286812709435758L);
                            f10 = f8;
                        } else if (n3 == (42 & 15555)) {
                            Field_16158.Method_7576(n4 * (3389 & -6855));
                            float f11 = (float)((22510 & 11240) * n4) + Class_16147.Method_16160(l, 21393033348L & 20067114289L) * (206666.67f * 0.048387095f);
                            float f12 = Class_16147.Method_16166(l, -6220184953022316880L & 20033554434L) * (12222.223f * 0.8181818f);
                            f8 = 1.0921053f * 0.45783132f * (Field_16158.Method_7578(f11, f12) + 1.0f);
                            f9 = 0.2886598f * 1.7321428f * (Field_16158.Method_7578(f11, f12 + 34.482758f * 29.0f) + 1.0f);
                            f10 = 0.43617022f * 1.1463414f * (Field_16158.Method_7578(f11, f12 + 1851.064f * 1.0804597f) + 1.0f);
                        } else if (n3 == (3099 & -31997)) {
                            Field_16158.Method_7576(n4 * (-31429 & 20409) + n * (31595 & -1431));
                            float f13 = (float)((7146 & 18424) * n4) + Class_16147.Method_16160(l, 21075847252L & 20277353345L) * (5.5625f * 1797.7528f);
                            float f14 = Class_16147.Method_16166(l, 594703432244251917L & 20270540864L) * (1.0204082f * 9800.0f);
                            f8 = 0.31730768f * 1.5757576f * (Field_16158.Method_7578((float)(n * (4332 & -29084)) + f13, f14) + 1.0f);
                            f9 = 0.55813956f * 0.8958333f * (Field_16158.Method_7578((float)(n * (9589 & 2148)) + f13, f14 + 234.04254f * 4.2727275f) + 1.0f);
                            f10 = 0.029761907f * 16.8f * (Field_16158.Method_7578((float)(n * (30838 & -31643)) + f13, f14 + 0.90909094f * 2200.0f) + 1.0f);
                        } else if (n3 == (1316 & 132)) {
                            f8 = Class_16147.Method_16160(l, 737931778L & 1542177476L);
                            f9 = 0.0f;
                            f10 = Class_16147.Method_16160(l + (-4175013837700897950L & 628318538L), 6212704036394354189L & 737923858L);
                        } else if (n3 == (4261 & 16965)) {
                            f8 = 0.0f + Class_16147.Method_16160(l, -1946699988314267712L & 1946699987597740736L) * (7.7272725f * 0.03538603f);
                            f9 = 22.161459f * 0.04054054f + Class_16147.Method_16160(l, 733606678300142474L & -733606677920799804L) * (1.3333334f * 0.0703125f);
                            f10 = 0.9285714f * 0.8203125f + Class_16147.Method_16160(l, 8626295089797265872L & 916416961L) * (0.03439832f * 6.7f);
                        } else if (n3 == (26142 & 2055)) {
                            double d = (double)(l %= -8399535951718279655L & 8399535953579725856L) / (2.6575342465753427E9 * 0.7525773195876289);
                            double[] arrd = Class_16147.Method_16163(d *= 7.428571428571429 * 48.46153846153846, 0.74 * 1.0810810810810811, 1.0181818181818183 * 0.7857142857142857);
                            f8 = (float)arrd[-7424 & 4110];
                            f9 = (float)arrd[-32493 & 16481];
                            f10 = (float)arrd[2 & 21059];
                        } else {
                            long l2 = -827415254723204290L & 1549517358L;
                            long l3 = 2139077588L & 524016510L;
                            long l4 = -2727731920510475502L & 2079990674L;
                            f8 = Class_16147.Method_16160(l, l2);
                            f9 = Class_16147.Method_16160(l, l3);
                            f10 = Class_16147.Method_16160(l, l4);
                        }
                    }
                    Class_16867.Method_16924(this.Field_16151 * f8, this.Field_16155 * f9, this.Field_16156 * f10, this.Field_16150);
                    class_33781.Method_33794(class_859, f, f2, f4, f5, f6, f7);
                    this.Field_16154.\u0000strictfp(this.Method_16161(class_37716, bl, "overlay"));
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: {
                    Class_16867.Method_16924(this.Field_16151, this.Field_16155, this.Field_16156, this.Field_16150);
                    class_33781.Method_33794(class_859, f, f2, f4, f5, f6, f7);
                }
            }
            if (!this.Field_16159 && class_23823.Method_23885()) {
                this.Method_16165(class_859, class_33781, f, f2, f3, f4, f5, f6, f7);
            }
        }
    }

    protected abstract void Method_16173(Class_33781 var1, int var2);

    protected abstract void Method_16174();

    public Class_33781 Method_16175(int n) {
        return this.Method_16167(n) ? this.Field_16149 : this.Field_16153;
    }

    static {
        Field_16152 = new Class_2080(Class_16147.Method_16171("\u0a00\u0a10\u0a08\u0a01\u0a05\u0a05\u0a15\u0a04\u0a51\u0a10\u0a11\u0a08\u0a1d\u0a54\u0a1d\u0a15\u0a11\u0a19\u0a11\u0a19\u0a04\u0a14\u0a14\u0a0c\u0a11\u0a09\u0a19\u0a10\u0a05\u0a1c\u0a14\u0a14\u0a18\u0a01\u0a58\u0a01\u0a1c\u0a14"));
        Field_16148 = new HashMap<K, V>();
        Field_16158 = new Class_7536();
    }
}

