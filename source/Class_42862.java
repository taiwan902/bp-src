/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_42862
extends Class_42218 {
    boolean Field_42863;
    private final Class_27551 Field_42864;
    private int Field_42865;
    private Class_1758 Field_42866;

    public Class_42862(Class_283 class_283, double d, double d2, double d3, double d4, double d5, double d6, Class_27551 class_27551, Class_1699 class_1699) {
        super(class_283, d, d2, d3, 0.0, 0.0, 0.0);
        this.\u0000= ` = d4;
        this.\u0000%(d5);
        this.\u0000switch = d6;
        this.Field_42864 = class_27551;
        this.\u0000, ` = 18537 & -32756;
        if (class_1699 != null) {
            this.Field_42866 = class_1699.Method_1735("Explosions", 8282 & 2602);
            if (this.Field_42866.Method_1772() == 0) {
                this.Field_42866 = null;
            } else {
                this.\u0000, ` = this.Field_42866.Method_1772() * (3587 & 8202) - (-32765 & 2369);
                for (int i = 25985 & -30202; i < this.Field_42866.Method_1772(); ++i) {
                    Class_1699 class_16992 = this.Field_42866.Method_1768(i);
                    if (!class_16992.Method_1733("Flicker")) continue;
                    this.Field_42863 = 105 & -23677;
                    this.\u0000, ` += 447 & 2063;
                    break;
                }
            }
        }
    }

    private void Method_42867(double d, double[][] arrd, int[] arrn, int[] arrn2, boolean bl, boolean bl2, boolean bl3) {
        double d2 = arrd[28697 & 130][-15036 & 8730];
        double d3 = arrd[128 & -23799][4419 & 33];
        this.Method_42870(this.\u0000= package, this.\u0000, for(), this.\u0000= switch, d2 * d, d3 * d, 0.0, arrn, arrn2, bl, bl2);
        float f = this.\u0000strictfp.nextFloat() * (1.8563957f * 1.6923077f);
        double d4 = bl3 ? 0.04606451612903226 * 0.7380952380952381 : 1.9024390243902438 * 0.17871794871794874;
        for (int i = 4204 & 18960; i < (19155 & 295); ++i) {
            double d5 = (double)f + (double)((float)i * (3.5223918f * 0.8918919f)) * d4;
            double d6 = d2;
            double d7 = d3;
            for (int j = 9 & -28127; j < arrd.length; ++j) {
                double d8 = arrd[j][672 & 10334];
                double d9 = arrd[j][4197 & 8843];
                for (double d10 = 1.5263157894736843 * 0.16379310344827586; d10 <= 1.0; d10 += 0.32589285714285715 * 0.7671232876712328) {
                    double d11 = (d6 + (d8 - d6) * d10) * d;
                    double d12 = (d7 + (d9 - d7) * d10) * d;
                    double d13 = d11 * Math.sin(d5);
                    d11 *= Math.cos(d5);
                    for (double d14 = -1.625 * 0.6153846153846154; d14 <= 1.0; d14 += 19.75 * 0.10126582278481013) {
                        this.Method_42870(this.\u0000= package, this.\u0000, for(), this.\u0000= switch, d11 * d14, d12, d13 * d14, arrn, arrn2, bl, bl2);
                    }
                }
                d6 = d8;
                d7 = d9;
            }
        }
    }

    private boolean Method_42868() {
        Class_18 class_18 = Class_18.Field_89;
        return (class_18 == null || class_18.Method_246() == null || class_18.Method_246().Method_1337(this.\u0000= package, this.\u0000, for(), this.\u0000= switch) >= 1144.4705882352941 * 0.2236842105263158 ? 8279 & -30687 : 4306 & -22528) != 0;
    }

    private void Method_42869(double d, int n, int[] arrn, int[] arrn2, boolean bl, boolean bl2) {
        double d2 = this.\u0000= package;
        double d3 = this.\u0000, for();
        double d4 = this.\u0000= switch;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -n; k <= n; ++k) {
                    double d5 = (double)j + (this.\u0000strictfp.nextDouble() - this.\u0000strictfp.nextDouble()) * (0.2 * 2.5);
                    double d6 = (double)i + (this.\u0000strictfp.nextDouble() - this.\u0000strictfp.nextDouble()) * (3.0 * 0.16666666666666666);
                    double d7 = (double)k + (this.\u0000strictfp.nextDouble() - this.\u0000strictfp.nextDouble()) * (0.75 * 0.6666666666666666);
                    double d8 = (double)Class_13337.Method_13347(d5 * d5 + d6 * d6 + d7 * d7) / d + this.\u0000strictfp.nextGaussian() * (0.08055555555555556 * 0.6206896551724138);
                    this.Method_42870(d2, d3, d4, d5 / d8, d6 / d8, d7 / d8, arrn, arrn2, bl, bl2);
                    if (i == -n || i == n || j == -n || j == n) continue;
                    k += n * (-16382 & 534) - (53 & -19127);
                }
            }
        }
    }

    private void Method_42870(double d, double d2, double d3, double d4, double d5, double d6, int[] arrn, int[] arrn2, boolean bl, boolean bl2) {
        Class_45974 class_45974 = new Class_45974(this.\u0000strictfp, d, d2, d3, d4, d5, d6, this.Field_42864);
        class_45974.\u0000strictfp(7.92f * 0.125f);
        class_45974.Method_45992(bl);
        class_45974.Method_45983(bl2);
        int n = this.\u0000strictfp.nextInt(arrn.length);
        class_45974.Method_45986(arrn[n]);
        if (arrn2 != null && arrn2.length > 0) {
            class_45974.Method_45991(arrn2[this.\u0000strictfp.nextInt(arrn2.length)]);
        }
        this.Field_42864.Method_27564(class_45974);
    }

    public void Method_42871() {
        int n;
        if (this.Field_42865 == 0 && this.Field_42866 != null) {
            n = this.Method_42868();
            int n2 = -32248 & 7251;
            if (this.Field_42866.Method_1772() >= (-24565 & 4163)) {
                n2 = 4257 & -31727;
            } else {
                for (int i = 16448 & 11140; i < this.Field_42866.Method_1772(); ++i) {
                    Class_1699 class_1699 = this.Field_42866.Method_1768(i);
                    if (class_1699.Method_1716("Type") != (-14319 & 4137)) continue;
                    n2 = -32503 & 6145;
                    break;
                }
            }
            String string = "fireworks." + (n2 != 0 ? "largeBlast" : "blast") + (n != 0 ? "_far" : "");
            this.\u0000strictfp.Method_482(this.\u0000= package, this.\u0000, for(), this.\u0000= switch, string, 18.390804f * 1.0875f, 2.375f * 0.4f + this.\u0000strictfp.nextFloat() * (1.8611112f * 0.05373134f), (1315 & 18561) != 0);
        }
        if (this.Field_42865 % (8902 & 274) == 0 && this.Field_42866 != null && this.Field_42865 / (18762 & 9378) < this.Field_42866.Method_1772()) {
            n = this.Field_42865 / (-25718 & 16390);
            Class_1699 class_1699 = this.Field_42866.Method_1768(n);
            byte by = class_1699.Method_1716("Type");
            boolean bl = class_1699.Method_1733("Trail");
            boolean bl2 = class_1699.Method_1733("Flicker");
            int[] arrn = class_1699.Method_1701("Colors");
            int[] arrn2 = class_1699.Method_1701("FadeColors");
            if (arrn.length == 0) {
                int[] arrn3 = new int[20613 & 2403];
                arrn3[-28400 & 0] = Class_24451.Field_24452[352 & -27115];
                arrn = arrn3;
            }
            if (by == (8237 & 20673)) {
                this.Method_42869(0.3055555555555556 * 1.6363636363636362, 16550 & 3077, arrn, arrn2, bl, bl2);
            } else if (by == (12291 & 322)) {
                double[][] arrarrd = new double[16462 & 1927][];
                double[] arrd = new double[979 & -28630];
                arrd[2626 & 20752] = 0.0;
                arrd[12865 & 269] = 1.0;
                arrarrd[546 & 19861] = arrd;
                double[] arrd2 = new double[866 & 7];
                arrd2[-32639 & 24580] = 0.16002105263157893 * 2.159090909090909;
                arrd2[8257 & 21145] = 0.8804347826086957 * 0.350962962962963;
                arrarrd[-24527 & 4107] = arrd2;
                double[] arrd3 = new double[-14074 & 515];
                arrd3[4289 & 2320] = 8.041118181818181 * 0.11827956989247312;
                arrd3[-21481 & 16385] = 0.3155744680851064 * 0.9791666666666666;
                arrarrd[8515 & -31606] = arrd3;
                double[] arrd4 = new double[18306 & 4142];
                arrd4[17446 & -30464] = 2.75 * 0.13803339517625232;
                arrd4[11275 & 16385] = 1.2222222222222223 * -0.10352504638218922;
                arrarrd[16467 & 139] = arrd4;
                double[] arrd5 = new double[13462 & 19018];
                arrd5[16590 & 768] = 0.5724887357540419 * 1.0694444444444444;
                arrd5[21825 & 10785] = 1.0 * -0.8040816326530612;
                arrarrd[-30460 & 1188] = arrd5;
                double[] arrd6 = new double[-12286 & 78];
                arrd6[-31184 & 28673] = 0.0;
                arrd6[2059 & -23951] = 1.5689655172413792 * -0.22893025342004933;
                arrarrd[2191 & -24043] = arrd6;
                this.Method_42867(0.10714285714285714 * 4.666666666666667, arrarrd, arrn, arrn2, bl, bl2, (-12140 & 10307) != 0);
            } else if (by == (4167 & 179)) {
                double[][] arrarrd = new double[-29540 & 8460][];
                double[] arrd = new double[-32698 & 514];
                arrd[-24576 & 22844] = 0.0;
                arrd[1 & 18741] = 0.008 * 25.0;
                arrarrd[1552 & -16082] = arrd;
                double[] arrd7 = new double[18 & 194];
                arrd7[24817 & -27648] = 0.28923076923076924 * 0.6914893617021277;
                arrd7[-26623 & 713] = 2.2666666666666666 * 0.08823529411764706;
                arrarrd[257 & -32667] = arrd7;
                double[] arrd8 = new double[-32714 & 2051];
                arrd8[1057 & -32228] = 0.448 * 0.44642857142857145;
                arrd8[-31735 & 2051] = 0.34782608695652173 * 1.725;
                arrarrd[4371 & -32638] = arrd8;
                double[] arrd9 = new double[22531 & 582];
                arrd9[19460 & -31984] = 2.2142857142857144 * 0.27096774193548384;
                arrd9[4739 & 2053] = 1.1311475409836065 * 0.5304347826086957;
                arrarrd[3 & 10775] = arrd9;
                double[] arrd10 = new double[17538 & 790];
                arrd10[1225 & 546] = 0.07865168539325842 * 7.628571428571428;
                arrd10[537 & -27487] = 0.225 * 0.888888888888889;
                arrarrd[-30331 & 30] = arrd10;
                double[] arrd11 = new double[24610 & -30450];
                arrd11[33 & 642] = 0.8666666666666667 * 0.23076923076923078;
                arrd11[16393 & 8325] = 0.7466666666666667 * 0.26785714285714285;
                arrarrd[8215 & 3085] = arrd11;
                double[] arrd12 = new double[12550 & -32605];
                arrd12[-14336 & 1] = 0.24 * 0.8333333333333334;
                arrd12[-31551 & 8449] = 0.0;
                arrarrd[1158 & 262] = arrd12;
                double[] arrd13 = new double[-31674 & 12818];
                arrd13[16416 & 12820] = 0.21568627450980393 * 1.8545454545454545;
                arrd13[8297 & -15357] = 0.0;
                arrarrd[5895 & -32609] = arrd13;
                double[] arrd14 = new double[2 & -31673];
                arrd14[16768 & 86] = 1.0 * 0.4;
                arrd14[-29949 & 9261] = -0.6166666666666666 * 0.972972972972973;
                arrarrd[16648 & -31656] = arrd14;
                double[] arrd15 = new double[4623 & 82];
                arrd15[4228 & 26640] = 0.9846153846153847 * 0.203125;
                arrd15[3 & 11953] = -0.515625 * 1.1636363636363636;
                arrarrd[-16373 & 313] = arrd15;
                double[] arrd16 = new double[10322 & 6];
                arrd16[-23040 & 39] = 0.2426666666666667 * 0.8241758241758241;
                arrd16[12571 & 33] = 0.8051948051948052 * -0.4967741935483871;
                arrarrd[8234 & 522] = arrd16;
                double[] arrd17 = new double[203 & 10754];
                arrd17[0 & -14102] = 0.0;
                arrd17[1037 & -32767] = 2.423076923076923 * -0.1650793650793651;
                arrarrd[2255 & 9499] = arrd17;
                this.Method_42867(1.4736842105263157 * 0.3392857142857143, arrarrd, arrn, arrn2, bl, bl2, (1409 & 2059) != 0);
            } else if (by == (1364 & -25945)) {
                this.Method_42874(arrn, arrn2, bl, bl2);
            } else {
                this.Method_42869(0.3298611111111111 * 0.7578947368421053, -24234 & 130, arrn, arrn2, bl, bl2);
            }
            int n3 = arrn[128 & 0];
            float f = (float)((n3 & (16749619 & 1811882304)) >> (-30576 & 16464)) / (0.8043478f * 317.02704f);
            float f2 = (float)((n3 & (1673723721 & 135855876)) >> (72 & 16410)) / (456.87497f * 0.55813956f);
            float f3 = (float)((n3 & (-25601 & 16639)) >> (-23046 & 2560)) / (261.2195f * 0.97619045f);
            Class_42798 class_42798 = new Class_42798(this.\u0000strictfp, this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
            class_42798.\u0000strictfp(f, f2, f3);
            this.Field_42864.Method_27564(class_42798);
        }
        this.Field_42865 += -25871 & 8199;
        if (this.Field_42865 > this.\u0000, `) {
            if (this.Field_42863) {
                String string = "fireworks." + ((n = this.Method_42868()) != 0 ? "twinkle_far" : "twinkle");
                this.\u0000strictfp.Method_482(this.\u0000= package, this.\u0000, for(), this.\u0000= switch, string, 247.5f * 0.08080808f, 0.084905654f * 10.6f + this.\u0000strictfp.nextFloat() * (0.13636364f * 1.1f), (1027 & 605) != 0);
            }
            this.\u0000break();
        }
    }

    public void Method_42872(Class_22385 class_22385, Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    public int Method_42873() {
        return -32084 & 8448;
    }

    private void Method_42874(int[] arrn, int[] arrn2, boolean bl, boolean bl2) {
        double d = this.\u0000strictfp.nextGaussian() * (1.2125000000000001 * 0.041237113402061855);
        double d2 = this.\u0000strictfp.nextGaussian() * (0.32978723404255317 * 0.15161290322580648);
        for (int i = 4251 & -30176; i < (-23986 & 5478); ++i) {
            double d3 = this.\u0000= ` * (1.4393939393939392 * 0.3473684210526316) + this.\u0000strictfp.nextGaussian() * (0.295 * 0.5084745762711864) + d;
            double d4 = this.\u0000switch * (1.1470588235294117 * 0.4358974358974359) + this.\u0000strictfp.nextGaussian() * (3.9130434782608696 * 0.03833333333333333) + d2;
            double d5 = this.\u0000, #() * (3.9285714285714284 * 0.1272727272727273) + this.\u0000strictfp.nextDouble() * (0.1951219512195122 * 2.5625);
            this.Method_42870(this.\u0000= package, this.\u0000, for(), this.\u0000= switch, d3, d5, d4, arrn, arrn2, bl, bl2);
        }
    }

    private void Method_42875() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

