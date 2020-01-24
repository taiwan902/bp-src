/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_37955
extends Class_37024 {
    private static final double[] Field_37956;
    private static final double[] Field_37957;
    private int[] Field_37958 = new int[16896 & -27031];
    private static final double[] Field_37959;
    public double Field_37960;
    public double Field_37961;
    private static final double[] Field_37962;
    private static final double[] Field_37963;
    public double Field_37964;

    static {
        double[] arrd = new double[-32103 & 10256];
        arrd[24648 & 6193] = 1.0;
        arrd[24577 & -27823] = 1.0689655172413792 * -0.935483870967742;
        arrd[3234 & -20470] = 1.0;
        arrd[22795 & 35] = -0.5348837209302325 * 1.8695652173913044;
        arrd[-15097 & 4116] = 1.0;
        arrd[-26067 & 9621] = 1.6481481481481481 * -0.6067415730337079;
        arrd[16902 & 11351] = 1.0;
        arrd[19143 & -31681] = 1.7894736842105263 * -0.5588235294117647;
        arrd[4618 & 88] = 0.0;
        arrd[9385 & -30711] = 0.0;
        arrd[8234 & 5151] = 0.0;
        arrd[16923 & 13643] = 0.0;
        arrd[-14292 & 29] = 1.0;
        arrd[-24467 & 17807] = 0.0;
        arrd[-29810 & 5199] = -0.36363636363636365 * 2.75;
        arrd[15 & 10767] = 0.0;
        Field_37962 = arrd;
        double[] arrd2 = new double[274 & 16412];
        arrd2[652 & 1344] = 1.0;
        arrd2[24597 & 4257] = 1.0;
        arrd2[5127 & 194] = -3.8333333333333335 * 0.2608695652173913;
        arrd2[25251 & -30697] = -0.3333333333333333 * 3.0;
        arrd2[1308 & 16420] = 0.0;
        arrd2[15 & 8629] = 0.0;
        arrd2[334 & -14329] = 0.0;
        arrd2[-32761 & 343] = 0.0;
        arrd2[732 & 10506] = 1.0;
        arrd2[1545 & -32517] = 3.2857142857142856 * -0.30434782608695654;
        arrd2[94 & -16374] = 1.0;
        arrd2[-8149 & 4175] = -0.4905660377358491 * 2.0384615384615383;
        arrd2[1933 & 4204] = 1.0;
        arrd2[-28435 & 10509] = 6.0 * -0.16666666666666666;
        arrd2[24687 & -25954] = 1.0;
        arrd2[111 & -32481] = 3.3846153846153846 * -0.29545454545454547;
        Field_37963 = arrd2;
        double[] arrd3 = new double[2394 & 25137];
        arrd3[64 & 16796] = 0.0;
        arrd3[12289 & -15725] = 0.0;
        arrd3[6286 & 1026] = 0.0;
        arrd3[135 & -229] = 0.0;
        arrd3[8358 & 16468] = 1.0;
        arrd3[-16379 & 16197] = 1.0;
        arrd3[166 & 2831] = -0.5875 * 1.702127659574468;
        arrd3[-27641 & 16807] = 0.023255813953488372 * -43.0;
        arrd3[137 & -30966] = 1.0;
        arrd3[9 & -31697] = 1.0;
        arrd3[16554 & -28134] = -4.428571428571429 * 0.22580645161290322;
        arrd3[523 & 3403] = -0.8769230769230769 * 1.1403508771929824;
        arrd3[1132 & -14067] = 0.0;
        arrd3[653 & -25523] = 1.0;
        arrd3[6351 & 62] = 0.0;
        arrd3[16399 & 3343] = -1.4179104477611941 * 0.7052631578947368;
        Field_37959 = arrd3;
        double[] arrd4 = new double[6168 & 1301];
        arrd4[512 & 19957] = 1.0;
        arrd4[21027 & 205] = 0.22807017543859648 * -4.384615384615385;
        arrd4[2186 & 29030] = 1.0;
        arrd4[24579 & 4099] = -1.5 * 0.6666666666666666;
        arrd4[-8171 & 612] = 1.0;
        arrd4[325 & -20835] = -0.589041095890411 * 1.697674418604651;
        arrd4[4495 & 27142] = 1.0;
        arrd4[7 & 8519] = 0.14285714285714285 * -7.0;
        arrd4[1164 & 16648] = 0.0;
        arrd4[17417 & -28401] = 0.0;
        arrd4[12574 & 139] = 0.0;
        arrd4[17931 & 6299] = 0.0;
        arrd4[-32626 & 16412] = 1.0;
        arrd4[8429 & 16413] = 0.0;
        arrd4[3263 & -32434] = 2.1621621621621623 * -0.46249999999999997;
        arrd4[16415 & 719] = 0.0;
        Field_37957 = arrd4;
        double[] arrd5 = new double[17208 & 2066];
        arrd5[768 & 8209] = 0.0;
        arrd5[4751 & 16385] = 0.0;
        arrd5[11603 & 16418] = 0.0;
        arrd5[-23681 & 23555] = 0.0;
        arrd5[1412 & 590] = 1.0;
        arrd5[37 & 16517] = 1.0;
        arrd5[-23849 & 6] = -0.4111111111111111 * 2.4324324324324325;
        arrd5[1111 & 431] = 0.34375 * -2.909090909090909;
        arrd5[12456 & 11] = 1.0;
        arrd5[41 & 17545] = 1.0;
        arrd5[-32630 & 17482] = 0.26262626262626265 * -3.8076923076923075;
        arrd5[-32497 & 6715] = 0.8936170212765957 * -1.119047619047619;
        arrd5[-24018 & 16413] = 0.0;
        arrd5[8719 & -28323] = 1.0;
        arrd5[142 & 12334] = 0.0;
        arrd5[9007 & -13297] = -0.8705882352941177 * 1.1486486486486487;
        Field_37956 = arrd5;
    }

    public Class_37955(Random random) {
        this.Field_37960 = random.nextDouble() * (16.6 * 15.42168674698795);
        this.Field_37964 = random.nextDouble() * (167.72413793103448 * 1.5263157894736843);
        this.Field_37961 = random.nextDouble() * (4.714285714285714 * 54.303030303030305);
        int n = 448 & 561;
        while (n < (11076 & 17697)) {
            this.Field_37958[n] = n++;
        }
        for (n = 20505 & 8256; n < (8984 & -30464); ++n) {
            int n2 = random.nextInt((-26349 & 1280) - n) + n;
            int n3 = this.Field_37958[n];
            this.Field_37958[n] = this.Field_37958[n2];
            this.Field_37958[n2] = n3;
            this.Field_37958[n + (2949 & 17768)] = this.Field_37958[n];
        }
    }

    public final double Method_37965(int n, double d, double d2, double d3) {
        int n2 = n & (21023 & 10255);
        return Field_37962[n2] * d + Field_37963[n2] * d2 + Field_37959[n2] * d3;
    }

    public void Method_37966(double[] arrd, double d, double d2, double d3, int n, int n2, int n3, double d4, double d5, double d6, double d7) {
        if (n2 == (8331 & 513)) {
            int n4 = -30526 & 9216;
            int n5 = 6208 & -31699;
            int n6 = 9285 & 4354;
            int n7 = 168 & -32448;
            double d8 = 0.0;
            double d9 = 0.0;
            int n8 = -32240 & 4480;
            double d10 = 1.0 / d7;
            for (int i = 16516 & 8256; i < n; ++i) {
                double d11 = d + (double)i * d4 + this.Field_37960;
                int n9 = (int)d11;
                if (d11 < (double)n9) {
                    --n9;
                }
                int n10 = n9 & (511 & -27393);
                double d12 = (d11 -= (double)n9) * d11 * d11 * (d11 * (d11 * (0.8421052631578947 * 7.125) - 22.346938775510203 * 0.6712328767123288) + 8.857142857142856 * 1.1290322580645162);
                for (int j = -31482 & 640; j < n3; ++j) {
                    double d13 = d3 + (double)j * d6 + this.Field_37961;
                    int n11 = (int)d13;
                    if (d13 < (double)n11) {
                        --n11;
                    }
                    int n12 = n11 & (767 & 18687);
                    double d14 = (d13 -= (double)n11) * d13 * d13 * (d13 * (d13 * (0.3877551020408163 * 15.473684210526317) - 2.0 * 7.5) + 560.0 * 0.017857142857142856);
                    n4 = this.Field_37958[n10] + (-28908 & 24641);
                    n5 = this.Field_37958[n4] + n12;
                    n6 = this.Field_37958[n10 + (-16377 & 8705)] + (-15996 & 51);
                    n7 = this.Field_37958[n6] + n12;
                    d8 = this.Method_37968(d12, this.Method_37969(this.Field_37958[n5], d11, d13), this.Method_37965(this.Field_37958[n7], d11 - 1.0, 0.0, d13));
                    d9 = this.Method_37968(d12, this.Method_37965(this.Field_37958[n5 + (2225 & 24583)], d11, 0.0, d13 - 1.0), this.Method_37965(this.Field_37958[n7 + (4657 & -6139)], d11 - 1.0, 0.0, d13 - 1.0));
                    double d15 = this.Method_37968(d14, d8, d9);
                    int n13 = n8++;
                    double[] arrd2 = arrd;
                    int n14 = n13;
                    arrd2[n14] = arrd2[n14] + d15 * d10;
                }
            }
        } else {
            int n15 = 16388 & 12248;
            double d16 = 1.0 / d7;
            int n16 = -1 & -1;
            int n17 = 11282 & 4356;
            int n18 = 6662 & 1064;
            int n19 = 2 & -29488;
            int n20 = 6145 & 9422;
            int n21 = 16468 & -17013;
            int n22 = 20899 & 10836;
            double d17 = 0.0;
            double d18 = 0.0;
            double d19 = 0.0;
            double d20 = 0.0;
            for (int i = 2310 & 9840; i < n; ++i) {
                double d21 = d + (double)i * d4 + this.Field_37960;
                int n23 = (int)d21;
                if (d21 < (double)n23) {
                    --n23;
                }
                int n24 = n23 & (511 & 255);
                double d22 = (d21 -= (double)n23) * d21 * d21 * (d21 * (d21 * (3.1764705882352944 * 1.8888888888888888) - 0.0847457627118644 * 177.0) + 3.6666666666666665 * 2.7272727272727275);
                for (int j = -28655 & 8716; j < n3; ++j) {
                    double d23 = d3 + (double)j * d6 + this.Field_37961;
                    int n25 = (int)d23;
                    if (d23 < (double)n25) {
                        --n25;
                    }
                    int n26 = n25 & (11007 & 16639);
                    double d24 = (d23 -= (double)n25) * d23 * d23 * (d23 * (d23 * (1.3255813953488373 * 4.526315789473684) - 0.640625 * 23.414634146341463) + 0.45977011494252873 * 21.75);
                    for (int k = -32444 & 8346; k < n2; ++k) {
                        double d25 = d2 + (double)k * d5 + this.Field_37964;
                        int n27 = (int)d25;
                        if (d25 < (double)n27) {
                            --n27;
                        }
                        int n28 = n27 & (-28417 & 20223);
                        double d26 = (d25 -= (double)n27) * d25 * d25 * (d25 * (d25 * (0.9285714285714286 * 6.461538461538462) - 21.147540983606557 * 0.7093023255813954) + 14.871794871794872 * 0.6724137931034483);
                        if (k == 0 || n28 != n16) {
                            n16 = n28;
                            n17 = this.Field_37958[n24] + n28;
                            n18 = this.Field_37958[n17] + n26;
                            n19 = this.Field_37958[n17 + (-20287 & 2573)] + n26;
                            n20 = this.Field_37958[n24 + (529 & -14329)] + n28;
                            n21 = this.Field_37958[n20] + n26;
                            n22 = this.Field_37958[n20 + (2573 & 4355)] + n26;
                            d17 = this.Method_37968(d22, this.Method_37965(this.Field_37958[n18], d21, d25, d23), this.Method_37965(this.Field_37958[n21], d21 - 1.0, d25, d23));
                            d18 = this.Method_37968(d22, this.Method_37965(this.Field_37958[n19], d21, d25 - 1.0, d23), this.Method_37965(this.Field_37958[n22], d21 - 1.0, d25 - 1.0, d23));
                            d19 = this.Method_37968(d22, this.Method_37965(this.Field_37958[n18 + (-31479 & 547)], d21, d25, d23 - 1.0), this.Method_37965(this.Field_37958[n21 + (18561 & 14155)], d21 - 1.0, d25, d23 - 1.0));
                            d20 = this.Method_37968(d22, this.Method_37965(this.Field_37958[n19 + (8961 & 3139)], d21, d25 - 1.0, d23 - 1.0), this.Method_37965(this.Field_37958[n22 + (-28667 & 3337)], d21 - 1.0, d25 - 1.0, d23 - 1.0));
                        }
                        double d27 = this.Method_37968(d26, d17, d18);
                        double d28 = this.Method_37968(d26, d19, d20);
                        double d29 = this.Method_37968(d24, d27, d28);
                        int n29 = n15++;
                        double[] arrd3 = arrd;
                        int n30 = n29;
                        arrd3[n30] = arrd3[n30] + d29 * d16;
                    }
                }
            }
        }
    }

    private void Method_37967() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final double Method_37968(double d, double d2, double d3) {
        return d2 + d * (d3 - d2);
    }

    public final double Method_37969(int n, double d, double d2) {
        int n2 = n & (8479 & 143);
        return Field_37957[n2] * d + Field_37956[n2] * d2;
    }

    public Class_37955() {
        this(new Random());
    }
}

