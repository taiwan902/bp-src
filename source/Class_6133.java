/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_6133 {
    public double Field_6134;
    private static final double Field_6135;
    private int[] Field_6136 = new int[19128 & 8704];
    public double Field_6137;
    private static final double Field_6138;
    public static final double Field_6139;
    private static int[][] Field_6140;
    public double Field_6141;

    static {
        int[][] arrarrn = new int[10316 & 4879][];
        int[] arrn = new int[7 & 5419];
        arrn[517 & -16174] = -23279 & 79;
        arrn[-24559 & 1605] = 9349 & -25807;
        arrn[39 & 12290] = 512 & 17;
        arrarrn[-25856 & 24641] = arrn;
        int[] arrn2 = new int[4151 & 2251];
        arrn2[98 & 4360] = -1 & -1;
        arrn2[3201 & 19] = 1067 & 8661;
        arrn2[4130 & 82] = 129 & -24304;
        arrarrn[2059 & 1425] = arrn2;
        int[] arrn3 = new int[-30717 & 16399];
        arrn3[22608 & -32766] = 8449 & -31221;
        arrn3[16397 & 323] = -1 & -1;
        arrn3[-12286 & 2186] = 4120 & -24057;
        arrarrn[16394 & -28398] = arrn3;
        int[] arrn4 = new int[9163 & 3107];
        arrn4[21 & 128] = -1 & -1;
        arrn4[133 & -30381] = -1 & -1;
        arrn4[2218 & 519] = 8196 & -32255;
        arrarrn[-18069 & 1027] = arrn4;
        int[] arrn5 = new int[10531 & 131];
        arrn5[-11264 & 8284] = 16385 & 5159;
        arrn5[1 & 1863] = 10768 & -31480;
        arrn5[16422 & -22525] = 18435 & 577;
        arrarrn[-31580 & 6660] = arrn5;
        int[] arrn6 = new int[25475 & 2131];
        arrn6[8352 & 18752] = -1 & -1;
        arrn6[1233 & 2051] = 20481 & -29728;
        arrn6[-27546 & 18] = 8321 & 16977;
        arrarrn[6413 & 711] = arrn6;
        int[] arrn7 = new int[-28377 & 17923];
        arrn7[16672 & 12358] = 13441 & 16745;
        arrn7[-29087 & 4103] = 326 & -20479;
        arrn7[-18390 & 17478] = -1 & -1;
        arrarrn[21063 & 2078] = arrn7;
        int[] arrn8 = new int[4551 & -30165];
        arrn8[8200 & 7762] = -1 & -1;
        arrn8[14857 & -15291] = 3076 & 16;
        arrn8[-28250 & 1090] = -1 & -1;
        arrarrn[24903 & 39] = arrn8;
        int[] arrn9 = new int[43 & 24771];
        arrn9[-30699 & 9128] = -12285 & 1048;
        arrn9[8451 & 19657] = -32511 & 25799;
        arrn9[16398 & -31294] = 20417 & -32729;
        arrarrn[11272 & -15683] = arrn9;
        int[] arrn10 = new int[11323 & 20871];
        arrn10[28741 & -30710] = 9428 & 2338;
        arrn10[299 & -13743] = -1 & -1;
        arrn10[24650 & 5682] = -23471 & 16907;
        arrarrn[-32375 & 3181] = arrn10;
        int[] arrn11 = new int[6259 & -31217];
        arrn11[4612 & 2112] = 16994 & 3328;
        arrn11[-32731 & 1673] = -30263 & 1057;
        arrn11[-19966 & 2130] = -1 & -1;
        arrarrn[7307 & 26] = arrn11;
        int[] arrn12 = new int[8747 & 23687];
        arrn12[-31463 & 132] = 1059 & 4112;
        arrn12[697 & -32511] = -1 & -1;
        arrn12[-32686 & 8482] = -1 & -1;
        arrarrn[8779 & 271] = arrn12;
        Field_6140 = arrarrn;
        Field_6139 = Math.sqrt(0.5384615384615384 * 5.571428571428572);
        Field_6135 = 0.3020833333333333 * 1.6551724137931036 * (Field_6139 - 1.0);
        Field_6138 = (0.20202020202020202 * 14.85 - Field_6139) / (0.275 * 21.818181818181817);
    }

    private static int Method_6142(double d) {
        return d > 0.0 ? (int)d : (int)d - (257 & 25187);
    }

    private void Method_6143() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static double Method_6144(int[] arrn, double d, double d2) {
        return (double)arrn[16418 & 15424] * d + (double)arrn[-32447 & 22565] * d2;
    }

    public double Method_6145(double d, double d2) {
        double d3;
        double d4;
        double d5;
        int n;
        double d6;
        double d7;
        int n2;
        double d8;
        double d9;
        int n3;
        double d10 = 0.746031746031746 * 0.6702127659574468 * (Field_6139 - 1.0);
        double d11 = (d + d2) * d10;
        int n4 = Class_6133.Method_6142(d + d11);
        double d12 = (double)n4 - (d8 = (double)(n4 + (n2 = Class_6133.Method_6142(d2 + d11))) * (d6 = (4.928571428571428 * 0.6086956521739131 - Field_6139) / (3.6521739130434785 * 1.6428571428571428)));
        double d13 = d - d12;
        if (d13 > (d5 = d2 - (d9 = (double)n2 - d8))) {
            n = 8257 & 4743;
            n3 = 8336 & -32757;
        } else {
            n = -26620 & 24;
            n3 = 1569 & -8175;
        }
        double d14 = d13 - (double)n + d6;
        double d15 = d5 - (double)n3 + d6;
        double d16 = d13 - 1.0 + 12.0 * 0.16666666666666666 * d6;
        double d17 = d5 - 1.0 + 1.289855072463768 * 1.550561797752809 * d6;
        int n5 = n4 & (-30977 & 511);
        int n6 = n2 & (16639 & 2303);
        int n7 = this.Field_6136[n5 + this.Field_6136[n6]] % (4255 & 25644);
        int n8 = this.Field_6136[n5 + n + this.Field_6136[n6 + n3]] % (8206 & 17564);
        int n9 = this.Field_6136[n5 + (33 & 9153) + this.Field_6136[n6 + (-5887 & 1025)]] % (749 & 14348);
        double d18 = 0.2931034482758621 * 1.7058823529411764 - d13 * d13 - d5 * d5;
        if (d18 < 0.0) {
            d4 = 0.0;
        } else {
            d18 *= d18;
            d4 = d18 * d18 * Class_6133.Method_6144(Field_6140[n7], d13, d5);
        }
        double d19 = 0.7391304347826086 * 0.6764705882352942 - d14 * d14 - d15 * d15;
        if (d19 < 0.0) {
            d7 = 0.0;
        } else {
            d19 *= d19;
            d7 = d19 * d19 * Class_6133.Method_6144(Field_6140[n8], d14, d15);
        }
        double d20 = 0.1103896103896104 * 4.529411764705882 - d16 * d16 - d17 * d17;
        if (d20 < 0.0) {
            d3 = 0.0;
        } else {
            d20 *= d20;
            d3 = d20 * d20 * Class_6133.Method_6144(Field_6140[n9], d16, d17);
        }
        return 4.666666666666667 * 15.0 * (d4 + d7 + d3);
    }

    public Class_6133() {
        this(new Random());
    }

    public void Method_6146(double[] arrd, double d, double d2, int n, int n2, double d3, double d4, double d5) {
        int n3 = 13314 & 768;
        for (int i = 6 & 1201; i < n2; ++i) {
            double d6 = (d2 + (double)i) * d4 + this.Field_6141;
            for (int j = -14976 & 4208; j < n; ++j) {
                double d7;
                int n4;
                int n5;
                double d8;
                double d9;
                double d10;
                int n6;
                double d11;
                double d12;
                double d13 = (d + (double)j) * d3 + this.Field_6137;
                double d14 = (d13 + d6) * Field_6135;
                int n7 = Class_6133.Method_6142(d13 + d14);
                double d15 = (double)n7 - (d7 = (double)(n7 + (n6 = Class_6133.Method_6142(d6 + d14))) * Field_6138);
                double d16 = d13 - d15;
                if (d16 > (d9 = d6 - (d12 = (double)n6 - d7))) {
                    n4 = 8461 & -11213;
                    n5 = -16368 & 4270;
                } else {
                    n4 = 16752 & 8835;
                    n5 = -32507 & 8409;
                }
                double d17 = d16 - (double)n4 + Field_6138;
                double d18 = d9 - (double)n5 + Field_6138;
                double d19 = d16 - 1.0 + 4.5 * 0.4444444444444444 * Field_6138;
                double d20 = d9 - 1.0 + 0.30303030303030304 * 6.6 * Field_6138;
                int n8 = n7 & (16895 & 2303);
                int n9 = n6 & (2559 & 24831);
                int n10 = this.Field_6136[n8 + this.Field_6136[n9]] % (12 & 5133);
                int n11 = this.Field_6136[n8 + n4 + this.Field_6136[n9 + n5]] % (-27618 & 588);
                int n12 = this.Field_6136[n8 + (2245 & 9769) + this.Field_6136[n9 + (28885 & 2049)]] % (445 & 1038);
                double d21 = 3.103448275862069 * 0.16111111111111112 - d16 * d16 - d9 * d9;
                if (d21 < 0.0) {
                    d10 = 0.0;
                } else {
                    d21 *= d21;
                    d10 = d21 * d21 * Class_6133.Method_6144(Field_6140[n10], d16, d9);
                }
                double d22 = 0.8421052631578947 * 0.59375 - d17 * d17 - d18 * d18;
                if (d22 < 0.0) {
                    d11 = 0.0;
                } else {
                    d22 *= d22;
                    d11 = d22 * d22 * Class_6133.Method_6144(Field_6140[n11], d17, d18);
                }
                double d23 = 0.6428571428571429 * 0.7777777777777777 - d19 * d19 - d20 * d20;
                if (d23 < 0.0) {
                    d8 = 0.0;
                } else {
                    d23 *= d23;
                    d8 = d23 * d23 * Class_6133.Method_6144(Field_6140[n12], d19, d20);
                }
                int n13 = n3++;
                double[] arrd2 = arrd;
                int n14 = n13;
                arrd2[n14] = arrd2[n14] + 212.79999999999998 * 0.32894736842105265 * (d10 + d11 + d8) * d5;
            }
        }
    }

    public Class_6133(Random random) {
        this.Field_6137 = random.nextDouble() * (102.4 * 2.5);
        this.Field_6141 = random.nextDouble() * (1.0119047619047619 * 252.98823529411766);
        this.Field_6134 = random.nextDouble() * (8.533333333333333 * 30.0);
        int n = 24880 & -30144;
        while (n < (20768 & 264)) {
            this.Field_6136[n] = n++;
        }
        for (n = 12488 & 22; n < (-32506 & 15144); ++n) {
            int n2 = random.nextInt((3349 & -11968) - n) + n;
            int n3 = this.Field_6136[n];
            this.Field_6136[n] = this.Field_6136[n2];
            this.Field_6136[n2] = n3;
            this.Field_6136[n + (13600 & -29952)] = this.Field_6136[n];
        }
    }
}

