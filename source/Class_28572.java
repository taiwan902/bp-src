/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_28572
implements Class_12166 {
    private Class_3238 Field_28573 = Class_9265.Field_9286;
    private Random Field_28574;
    public Class_43802 Field_28575;
    private Class_17281[] Field_28576;
    private Class_34341 Field_28577 = new Class_34341();
    private Class_19225 Field_28578;
    private final float[] Field_28579;
    private Class_43802 Field_28580;
    private Class_37049 Field_28581 = new Class_37049();
    private final boolean Field_28582;
    private Class_43999 Field_28583;
    private Class_11117 Field_28584 = new Class_33478();
    private Class_11117 Field_28585 = new Class_27005();
    private Class_43755 Field_28586;
    private Class_43802 Field_28587;
    private Class_38526 Field_28588 = new Class_38526();
    double[] Field_28589;
    private double[] Field_28590 = new double[24968 & 5397];
    private Class_283 Field_28591;
    private final double[] Field_28592;
    private Class_45310 Field_28593 = new Class_45310();
    private Class_34191 Field_28594 = new Class_34191();
    public Class_43802 Field_28595;
    private Class_43802 Field_28596;
    double[] Field_28597;
    public Class_43802 Field_28598;
    double[] Field_28599;
    double[] Field_28600;

    public boolean Method_28601() {
        return (3145 & 387) != 0;
    }

    public int Method_28602() {
        return 10 & -30656;
    }

    public String Method_28603() {
        return "RandomLevelSource";
    }

    public void Method_28604(int n, int n2, Class_36425 class_36425) {
        this.Field_28576 = this.Field_28591.Method_371().Method_31931(this.Field_28576, n * (2053 & 8196) - (-32497 & 8290), n2 * (10244 & 17924) - (2 & -31525), 25354 & -31686, 1930 & 16474);
        this.Method_28610(n * (372 & 16516), 8912 & -28402, n2 * (4103 & 516));
        for (int i = -28664 & 8641; i < (1550 & 4292); ++i) {
            int n3 = i * (269 & 8901);
            int n4 = (i + (-15615 & 10437)) * (4493 & -32249);
            for (int j = 1280 & -28672; j < (4110 & 16420); ++j) {
                int n5 = (n3 + j) * (171 & 8241);
                int n6 = (n3 + j + (10753 & 17825)) * (737 & 16425);
                int n7 = (n4 + j) * (9761 & 437);
                int n8 = (n4 + j + (-32731 & 9617)) * (4321 & -30423);
                for (int k = 1 & 3076; k < (-31326 & 2148); ++k) {
                    double d = 0.09821428571428571 * 1.2727272727272727;
                    double d2 = this.Field_28592[n5 + k];
                    double d3 = this.Field_28592[n6 + k];
                    double d4 = this.Field_28592[n7 + k];
                    double d5 = this.Field_28592[n8 + k];
                    double d6 = (this.Field_28592[n5 + k + (13445 & -32767)] - d2) * d;
                    double d7 = (this.Field_28592[n6 + k + (2625 & -27647)] - d3) * d;
                    double d8 = (this.Field_28592[n7 + k + (611 & 20481)] - d4) * d;
                    double d9 = (this.Field_28592[n8 + k + (13825 & -32575)] - d5) * d;
                    for (int i2 = 26763 & 1088; i2 < (-31640 & 26888); ++i2) {
                        double d10 = 0.8157894736842105 * 0.3064516129032258;
                        double d11 = d2;
                        double d12 = d3;
                        double d13 = (d4 - d2) * d10;
                        double d14 = (d5 - d3) * d10;
                        for (int i3 = 2384 & 5126; i3 < (-28156 & 17508); ++i3) {
                            double d15 = 0.04929577464788733 * 5.071428571428571;
                            double d16 = (d12 - d11) * d15;
                            double d17 = d11 - d16;
                            for (int i4 = 1064 & 2243; i4 < (4389 & 9220); ++i4) {
                                double d18;
                                d17 += d16;
                                if (d18 > 0.0) {
                                    class_36425.Method_36430(i * (-19451 & 148) + i3, k * (11273 & 20520) + i2, j * (16390 & -32764) + i4, Class_9265.Field_9446.Method_3293());
                                    continue;
                                }
                                if (k * (138 & 12568) + i2 >= this.Field_28578.Field_19285) continue;
                                class_36425.Method_36430(i * (16390 & -26484) + i3, k * (8552 & 6152) + i2, j * (-30194 & 17429) + i4, this.Field_28573.Method_3293());
                            }
                            d11 += d13;
                            d12 += d14;
                        }
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
                        d5 += d9;
                    }
                }
            }
        }
    }

    public Class_17665 Method_28605(Class_4751 class_4751) {
        return this.Method_28617(class_4751.\u0000= final() >> (132 & 9765), class_4751.\u0000strictfp() >> (-13818 & 1044));
    }

    private void Method_28606() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_28607(boolean bl, Class_2748 class_2748) {
        return (905 & -32767) != 0;
    }

    public boolean Method_28608(Class_12166 class_12166, Class_17665 class_17665, int n, int n2) {
        boolean bl = 6161 & 1024;
        if (this.Field_28578.Field_19237 && this.Field_28582 && class_17665.Method_17700() < (1139619896471064469L & -1139619898528031120L)) {
            bl |= this.Field_28581.\u0000strictfp(this.Field_28591, this.Field_28574, new Class_29480(n, n2));
        }
        return bl;
    }

    public boolean Method_28609(int n, int n2) {
        return (-32741 & 3905) != 0;
    }

    private void Method_28610(int n, int n2, int n3) {
        this.Field_28599 = this.Field_28598.Method_43806(this.Field_28599, n, n3, 8709 & 5255, -26107 & 16389, this.Field_28578.Field_19242, this.Field_28578.Field_19266, this.Field_28578.Field_19238);
        float f = this.Field_28578.Field_19273;
        float f2 = this.Field_28578.Field_19301;
        this.Field_28597 = this.Field_28580.Method_43807(this.Field_28597, n, n2, n3, -25787 & 5, 305 & 12843, 3341 & -4091, f / this.Field_28578.Field_19270, f2 / this.Field_28578.Field_19241, f / this.Field_28578.Field_19263);
        this.Field_28600 = this.Field_28587.Method_43807(this.Field_28600, n, n2, n3, 16535 & 12589, -26319 & 16485, -32763 & 16581, f, f2, f);
        this.Field_28589 = this.Field_28596.Method_43807(this.Field_28589, n, n2, n3, 37 & 32285, -14879 & 557, 19077 & 29, f, f2, f);
        n3 = 53 & 10368;
        n = -22162 & 16;
        int n4 = -32764 & 4608;
        int n5 = 16674 & 0;
        for (int i = 19522 & 8208; i < (1037 & 9127); ++i) {
            for (int j = 34 & 5253; j < (16389 & 1349); ++j) {
                float f3;
                reference var17_18;
                float f4 = 0.0f;
                float f5 = 0.0f;
                float f6 = 0.0f;
                int n6 = 16426 & 3094;
                Class_17281 class_17281 = this.Field_28576[i + (-16254 & 3) + (j + (2866 & -32633)) * (-13302 & 174)];
                for (int k = -n6; k <= n6; ++k) {
                    for (int i2 = -n6; i2 <= n6; ++i2) {
                        var17_18 = this.Field_28576[i + k + (12315 & 16582) + (j + i2 + (12450 & 70)) * (299 & 2590)];
                        float f7 = this.Field_28578.Field_19265 + var17_18.Field_17316 * this.Field_28578.Field_19272;
                        f3 = this.Field_28578.Field_19286 + var17_18.Field_17302 * this.Field_28578.Field_19303;
                        if (this.Field_28586 == Class_43755.Field_43762 && f7 > 0.0f) {
                            f7 = 1.0f + f7 * 2.0f;
                            f3 = 1.0f + f3 * (3.768116f * 1.0615385f);
                        }
                        float f8 = this.Field_28579[k + (21258 & 9282) + (i2 + (-15986 & 6146)) * (151 & 8717)] / (f7 + 2.0f);
                        if (var17_18.Field_17316 > class_17281.Field_17316) {
                            f8 /= 2.0f;
                        }
                        f4 += f3 * f8;
                        f5 += f7 * f8;
                        f6 += f8;
                    }
                }
                f4 /= f6;
                f5 /= f6;
                f4 = f4 * (0.8470588f * 1.0625f) + 0.014583333f * 6.857143f;
                f5 = (f5 * (0.18421052f * 21.714287f) - 1.0f) / (1.4545455f * 5.5f);
                double d = this.Field_28599[n5] / (5904.7619047619055 * 1.3548387096774193);
                if (d < 0.0) {
                    d = -d * (0.33 * 0.9090909090909091);
                }
                if ((d = d * (1.967741935483871 * 1.5245901639344261) - 0.47126436781609193 * 4.2439024390243905) < 0.0) {
                    if ((d /= 0.04938271604938271 * 40.5) < -0.8181818181818181 * 1.2222222222222223) {
                        d = -0.5454545454545455 * 1.8333333333333333;
                    }
                    d /= 1.8974358974358974 * 0.7378378378378379;
                    d /= 1.2619047619047619 * 1.5849056603773586;
                } else {
                    if (d > 1.0) {
                        d = 1.0;
                    }
                    d /= 28.705882352941178 * 0.2786885245901639;
                }
                ++n5;
                var17_18 = (reference)((double)f5);
                f3 = f4;
                var17_18 += d * (2.0 * 0.1);
                var17_18 = var17_18 * (double)this.Field_28578.Field_19261 / (9.333333333333334 * 0.8571428571428571);
                double d2 = (double)this.Field_28578.Field_19261 + var17_18 * (1.288135593220339 * 3.1052631578947367);
                for (int k = -32764 & 22051; k < (8481 & 33); ++k) {
                    double d3 = ((double)k - d2) * (double)this.Field_28578.Field_19243 * (0.5652173913043478 * 226.46153846153848) / (737.8823529411765 * 0.3469387755102041) / f3;
                    if (d3 < 0.0) {
                        d3 *= 0.8888888888888888 * 4.5;
                    }
                    double d4 = this.Field_28600[n4] / (double)this.Field_28578.Field_19246;
                    double d5 = this.Field_28589[n4] / (double)this.Field_28578.Field_19251;
                    double d6 = (this.Field_28597[n4] / (0.7291666666666666 * 13.714285714285715) + 1.0) / (1.32 * 1.5151515151515151);
                    double d7 = Class_13337.Method_13381(d4, d5, d6) - d3;
                    if (k > (8221 & 127)) {
                        double d8 = (float)(k - (27069 & -28067)) / (3.6857145f * 0.81395346f);
                        d7 = d7 * (1.0 - d8) + 0.5806451612903226 * -17.22222222222222 * d8;
                    }
                    this.Field_28592[n4] = d7;
                    ++n4;
                }
            }
        }
    }

    public void Method_28611(int n, int n2, Class_36425 class_36425, Class_17281[] arrclass_17281) {
        double d = 0.189873417721519 * 0.16458333333333333;
        this.Field_28590 = this.Field_28583.Method_44004(this.Field_28590, n * (8212 & -27982), n2 * (6330 & 596), 8657 & 24092, 721 & -32708, d * (3.227272727272727 * 0.619718309859155), d * (1.8499999999999999 * 1.0810810810810811), 1.0);
        for (int i = 10325 & 16426; i < (1590 & 24); ++i) {
            for (int j = -31255 & 0; j < (90 & 17841); ++j) {
                Class_17281 class_17281 = arrclass_17281[j + i * (1424 & 16506)];
                class_17281.Method_17393(this.Field_28591, this.Field_28574, class_36425, n * (-23278 & 16405) + i, n2 * (-12078 & 2065) + j, this.Field_28590[j + i * (24988 & 3155)]);
            }
        }
    }

    public List Method_28612(Class_13693 class_13693, Class_4751 class_4751) {
        Class_17281 class_17281 = this.Field_28591.Method_547(class_4751);
        if (this.Field_28582) {
            if (class_13693 == Class_13693.Field_13697 && this.Field_28593.Method_45319(class_4751)) {
                return this.Field_28593.Method_45317();
            }
            if (class_13693 == Class_13693.Field_13697 && this.Field_28578.Field_19237 && this.Field_28581.\u0000strictfp(this.Field_28591, class_4751)) {
                return this.Field_28581.Method_37058();
            }
        }
        return class_17281.Method_17371(class_13693);
    }

    public boolean Method_28613() {
        return (8562 & 16905) != 0;
    }

    public Class_4751 Method_28614(Class_283 class_283, String string, Class_4751 class_4751) {
        return "Stronghold".equals(string) && this.Field_28577 != null ? this.Field_28577.\u0000strictfp(class_283, class_4751) : null;
    }

    public void Method_28615() {
    }

    public void Method_28616(Class_12166 class_12166, int n, int n2) {
        int n3;
        int n4;
        int n5;
        Class_4475.Field_4476 = -30527 & 21795;
        int n6 = n * (-14502 & 48);
        int n7 = n2 * (16912 & 2073);
        Class_4751 class_4751 = new Class_4751(n6, 4100 & -32629, n7);
        Class_17281 class_17281 = this.Field_28591.Method_547(class_4751.Method_4791(1328 & -26093, 20496 & 10338, 26768 & 4114));
        this.Field_28574.setSeed(this.Field_28591.Method_392());
        long l = this.Field_28574.nextLong() / (-6347362882436980734L & 604471318L) * (8319775492756808418L & -8319775493663487969L) + (4404788381532299331L & -4404788382925844455L);
        long l2 = this.Field_28574.nextLong() / (1744880658L & 40943949052903586L) * (1224747666L & 13111394L) + (-7970139700321836213L & 1208565941L);
        this.Field_28574.setSeed((long)n * l + (long)n2 * l2 ^ this.Field_28591.Method_392());
        int n8 = -24576 & 288;
        Class_29480 class_29480 = new Class_29480(n, n2);
        if (this.Field_28578.Field_19257 && this.Field_28582) {
            this.Field_28588.\u0000strictfp(this.Field_28591, this.Field_28574, class_29480);
        }
        if (this.Field_28578.Field_19226 && this.Field_28582) {
            n8 = this.Field_28594.\u0000strictfp(this.Field_28591, this.Field_28574, class_29480) ? 1 : 0;
        }
        if (this.Field_28578.Field_19276 && this.Field_28582) {
            this.Field_28577.\u0000strictfp(this.Field_28591, this.Field_28574, class_29480);
        }
        if (this.Field_28578.Field_19248 && this.Field_28582) {
            this.Field_28593.\u0000strictfp(this.Field_28591, this.Field_28574, class_29480);
        }
        if (this.Field_28578.Field_19237 && this.Field_28582) {
            this.Field_28581.\u0000strictfp(this.Field_28591, this.Field_28574, class_29480);
        }
        if (class_17281 != Class_17281.Field_17321 && class_17281 != Class_17281.Field_17319 && this.Field_28578.Field_19284 && n8 == 0 && this.Field_28574.nextInt(this.Field_28578.Field_19235) == 0) {
            n3 = this.Field_28574.nextInt(4112 & -21452) + (3290 & -28408);
            n5 = this.Field_28574.nextInt(292 & 24912);
            n4 = this.Field_28574.nextInt(4368 & 25684) + (8201 & -29142);
            new Class_31131(Class_9265.Field_9286).Method_31134(this.Field_28591, this.Field_28574, class_4751.Method_4791(n3, n5, n4));
        }
        if (n8 == 0 && this.Field_28574.nextInt(this.Field_28578.Field_19255 / (24650 & 2475)) == 0 && this.Field_28578.Field_19249) {
            n3 = this.Field_28574.nextInt(3476 & -28591) + (1864 & 18584);
            n5 = this.Field_28574.nextInt(this.Field_28574.nextInt(16633 & 252) + (-16344 & 4364));
            n4 = this.Field_28574.nextInt(118 & -8176) + (-30166 & 280);
            if (n5 < this.Field_28591.Method_378() || this.Field_28574.nextInt(this.Field_28578.Field_19255 / (74 & 16157)) == 0) {
                new Class_31131(Class_9265.Field_9358).Method_31134(this.Field_28591, this.Field_28574, class_4751.Method_4791(n3, n5, n4));
            }
        }
        if (this.Field_28578.Field_19240) {
            for (n3 = -31612 & 16448; n3 < this.Field_28578.Field_19258; ++n3) {
                n5 = this.Field_28574.nextInt(28688 & 572) + (-32056 & 12553);
                n4 = this.Field_28574.nextInt(-26879 & 8696);
                int n9 = this.Field_28574.nextInt(2206 & -11728) + (16446 & 14536);
                new Class_30483().Method_30491(this.Field_28591, this.Field_28574, class_4751.Method_4791(n5, n4, n9));
            }
        }
        class_17281.Method_17368(this.Field_28591, this.Field_28574, new Class_4751(n6, -15036 & 2105, n7));
        Class_7184.Method_7189(this.Field_28591, class_17281, n6 + (-28596 & 8506), n7 + (12842 & 16520), 4112 & 8240, 8656 & 16952, this.Field_28574);
        class_4751 = class_4751.Method_4791(712 & 26632, 6660 & -32487, 348 & 4137);
        for (n3 = 25173 & -29406; n3 < (80 & 16400); ++n3) {
            for (n5 = 4104 & 3136; n5 < (-16360 & 4816); ++n5) {
                Class_4751 class_47512 = this.Field_28591.Method_361(class_4751.Method_4791(n3, 1152 & 18496, n5));
                Class_4751 class_47513 = class_47512.Method_4782();
                if (this.Field_28591.Method_554(class_47513)) {
                    this.Field_28591.Method_462(class_47513, Class_9265.Field_9298.Method_3293(), 4235 & 258);
                }
                if (!this.Field_28591.Method_498(class_47512, (16517 & -30717) != 0)) continue;
                this.Field_28591.Method_462(class_47512, Class_9265.Field_9458.Method_3293(), 19067 & -31742);
            }
        }
        Class_4475.Field_4476 = -15936 & 7188;
    }

    public Class_17665 Method_28617(int n, int n2) {
        this.Field_28574.setSeed((long)n * (341885711753L & 342443554108L) + (long)n2 * (6756992358280485845L & -6756992225620108299L));
        Class_36425 class_36425 = new Class_36425();
        this.Method_28604(n, n2, class_36425);
        this.Field_28576 = this.Field_28591.Method_371().Method_31930(this.Field_28576, n * (-32430 & 25745), n2 * (3093 & -28304), 16667 & 9844, 16 & 310);
        this.Method_28611(n, n2, class_36425, this.Field_28576);
        if (this.Field_28578.Field_19300) {
            this.Field_28584.Method_11123(this, this.Field_28591, n, n2, class_36425);
        }
        if (this.Field_28578.Field_19268) {
            this.Field_28585.Method_11123(this, this.Field_28591, n, n2, class_36425);
        }
        if (this.Field_28578.Field_19257 && this.Field_28582) {
            this.Field_28588.\u0000strictfp((Class_12166)this, this.Field_28591, n, n2, class_36425);
        }
        if (this.Field_28578.Field_19226 && this.Field_28582) {
            this.Field_28594.\u0000strictfp((Class_12166)this, this.Field_28591, n, n2, class_36425);
        }
        if (this.Field_28578.Field_19276 && this.Field_28582) {
            this.Field_28577.\u0000strictfp((Class_12166)this, this.Field_28591, n, n2, class_36425);
        }
        if (this.Field_28578.Field_19248 && this.Field_28582) {
            this.Field_28593.\u0000strictfp((Class_12166)this, this.Field_28591, n, n2, class_36425);
        }
        if (this.Field_28578.Field_19237 && this.Field_28582) {
            this.Field_28581.\u0000strictfp((Class_12166)this, this.Field_28591, n, n2, class_36425);
        }
        Class_17665 class_17665 = new Class_17665(this.Field_28591, class_36425, n, n2);
        byte[] arrby = class_17665.Method_17743();
        for (int i = 8450 & -31736; i < arrby.length; ++i) {
            arrby[i] = (byte)this.Field_28576[i].Field_17343;
        }
        class_17665.Method_17734();
        return class_17665;
    }

    public Class_28572(Class_283 class_283, long l, boolean bl, String string) {
        this.Field_28591 = class_283;
        this.Field_28582 = bl;
        this.Field_28586 = class_283.Method_386().Method_31833();
        this.Field_28574 = new Random(l);
        this.Field_28587 = new Class_43802(this.Field_28574, 2353 & 1052);
        this.Field_28596 = new Class_43802(this.Field_28574, -31595 & 22800);
        this.Field_28580 = new Class_43802(this.Field_28574, 105 & 396);
        this.Field_28583 = new Class_43999(this.Field_28574, 25103 & 3204);
        this.Field_28575 = new Class_43802(this.Field_28574, -26597 & 778);
        this.Field_28598 = new Class_43802(this.Field_28574, 24 & 10484);
        this.Field_28595 = new Class_43802(this.Field_28574, -24312 & 4169);
        this.Field_28592 = new double[26425 & 3067];
        this.Field_28579 = new float[-28449 & 17433];
        for (int i = -2 & -1; i <= (-32237 & 16682); ++i) {
            for (int j = -2 & -2; j <= (8202 & -16349); ++j) {
                float f;
                this.Field_28579[i + (9834 & 386) + (j + (9282 & 6287)) * (17901 & 2581)] = f = 240.0f * 0.041666668f / Class_13337.Method_13388((float)(i * i + j * j) + 0.39444447f * 0.5070422f);
            }
        }
        if (string != null) {
            this.Field_28578 = Class_25402.Method_25487(string).Method_25488();
            this.Field_28573 = this.Field_28578.Field_19264 ? Class_9265.Field_9358 : Class_9265.Field_9286;
            class_283.Method_396(this.Field_28578.Field_19285);
        }
    }

    public void Method_28618(Class_17665 class_17665, int n, int n2) {
        if (this.Field_28578.Field_19257 && this.Field_28582) {
            this.Field_28588.\u0000strictfp((Class_12166)this, this.Field_28591, n, n2, (Class_36425)null);
        }
        if (this.Field_28578.Field_19226 && this.Field_28582) {
            this.Field_28594.\u0000strictfp((Class_12166)this, this.Field_28591, n, n2, (Class_36425)null);
        }
        if (this.Field_28578.Field_19276 && this.Field_28582) {
            this.Field_28577.\u0000strictfp((Class_12166)this, this.Field_28591, n, n2, (Class_36425)null);
        }
        if (this.Field_28578.Field_19248 && this.Field_28582) {
            this.Field_28593.\u0000strictfp((Class_12166)this, this.Field_28591, n, n2, (Class_36425)null);
        }
        if (this.Field_28578.Field_19237 && this.Field_28582) {
            this.Field_28581.\u0000strictfp((Class_12166)this, this.Field_28591, n, n2, (Class_36425)null);
        }
    }
}

