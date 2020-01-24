/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_25817
implements Class_12166 {
    double[] Field_25818;
    double[] Field_25819;
    private double[] Field_25820;
    private Class_43802 Field_25821;
    public Class_43802 Field_25822;
    private Class_43802 Field_25823;
    private Class_17281[] Field_25824;
    private Class_283 Field_25825;
    private Random Field_25826;
    double[] Field_25827;
    double[] Field_25828;
    public Class_43802 Field_25829;
    private Class_43802 Field_25830;
    double[] Field_25831;

    public void Method_25832(Class_36425 class_36425) {
        for (int i = -14333 & 1108; i < (48 & 8784); ++i) {
            for (int j = 27940 & -28143; j < (28 & 17555); ++j) {
                int n = 24069 & 195;
                int n2 = -1 & -1;
                Class_3677 class_3677 = Class_9265.Field_9275.Method_3293();
                Class_3677 class_36772 = Class_9265.Field_9275.Method_3293();
                for (int k = -32641 & 12415; k >= 0; --k) {
                    Class_3436 class_3436 = class_36425.Method_36431(i, k, j);
                    if (class_3436.Method_3442().Method_3373() == Class_3713.Field_3718) {
                        n2 = -1 & -1;
                        continue;
                    }
                    if (class_3436.Method_3442() != Class_9265.Field_9446) continue;
                    if (n2 == (-1 & -1)) {
                        if (n <= 0) {
                            class_3677 = Class_9265.Field_9351.Method_3293();
                            class_36772 = Class_9265.Field_9275.Method_3293();
                        }
                        n2 = n;
                        if (k >= 0) {
                            class_36425.Method_36430(i, k, j, class_3677);
                            continue;
                        }
                        class_36425.Method_36430(i, k, j, class_36772);
                        continue;
                    }
                    if (n2 <= 0) continue;
                    --n2;
                    class_36425.Method_36430(i, k, j, class_36772);
                }
            }
        }
    }

    public Class_25817(Class_283 class_283, long l) {
        this.Field_25825 = class_283;
        this.Field_25826 = new Random(l);
        this.Field_25823 = new Class_43802(this.Field_25826, 8982 & -12112);
        this.Field_25821 = new Class_43802(this.Field_25826, 562 & -28591);
        this.Field_25830 = new Class_43802(this.Field_25826, 94 & 2952);
        this.Field_25829 = new Class_43802(this.Field_25826, -24433 & 58);
        this.Field_25822 = new Class_43802(this.Field_25826, 568 & 24848);
    }

    public void Method_25833(int n, int n2, Class_36425 class_36425) {
        int n3 = 17874 & 8711;
        int n4 = n3 + (295 & 8321);
        int n5 = -31951 & 4261;
        int n6 = n3 + (-32581 & 13125);
        this.Field_25820 = this.Method_25836(this.Field_25820, n * n3, 387 & 7232, n2 * n3, n4, n5, n6);
        for (int i = 8200 & -28347; i < n3; ++i) {
            for (int j = -29632 & 25000; j < n3; ++j) {
                for (int k = 16400 & 4616; k < (4132 & -32390); ++k) {
                    double d = 0.24590163934426232 * 1.0166666666666666;
                    double d2 = this.Field_25820[((i + (-30688 & 25412)) * n6 + j + (5125 & -30462)) * n5 + k + (16 & -22368)];
                    double d3 = this.Field_25820[((i + (18432 & -20448)) * n6 + j + (5153 & 659)) * n5 + k + (10880 & 8)];
                    double d4 = this.Field_25820[((i + (-28095 & 8329)) * n6 + j + (1800 & 212)) * n5 + k + (12 & 27954)];
                    double d5 = this.Field_25820[((i + (20497 & 2565)) * n6 + j + (1025 & 2725)) * n5 + k + (-28267 & 18440)];
                    double d6 = (this.Field_25820[((i + (-24312 & 1685)) * n6 + j + (29 & 16386)) * n5 + k + (4561 & 9257)] - d2) * d;
                    double d7 = (this.Field_25820[((i + (-16320 & 8832)) * n6 + j + (18955 & -24539)) * n5 + k + (2049 & -7519)] - d3) * d;
                    double d8 = (this.Field_25820[((i + (-26523 & 257)) * n6 + j + (-32640 & 22566)) * n5 + k + (12497 & 1539)] - d4) * d;
                    double d9 = (this.Field_25820[((i + (25217 & 2121)) * n6 + j + (13345 & 157)) * n5 + k + (16595 & 5381)] - d5) * d;
                    for (int i2 = -32712 & 11458; i2 < (6221 & 16388); ++i2) {
                        double d10 = 13.0 * 0.009615384615384616;
                        double d11 = d2;
                        double d12 = d3;
                        double d13 = (d4 - d2) * d10;
                        double d14 = (d5 - d3) * d10;
                        for (int i3 = 128 & 8218; i3 < (265 & -9080); ++i3) {
                            double d15 = 0.9770114942528736 * 0.12794117647058822;
                            double d16 = d11;
                            double d17 = (d12 - d11) * d15;
                            for (int i4 = 448 & 20494; i4 < (16426 & 1800); ++i4) {
                                Class_3677 class_3677 = null;
                                if (d16 > 0.0) {
                                    class_3677 = Class_9265.Field_9275.Method_3293();
                                }
                                int n7 = i3 + i * (28682 & 2441);
                                int n8 = i2 + k * (4148 & -32753);
                                int n9 = i4 + j * (-30680 & 536);
                                class_36425.Method_36430(n7, n8, n9, class_3677);
                                d16 += d17;
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

    public boolean Method_25834() {
        return (67 & 261) != 0;
    }

    public boolean Method_25835() {
        return (524 & -18416) != 0;
    }

    private double[] Method_25836(double[] arrd, int n, int n2, int n3, int n4, int n5, int n6) {
        if (arrd == null) {
            arrd = new double[n4 * n5 * n6];
        }
        double d = 1.6363636363636365 * 418.25177777777776;
        double d2 = 3353.6188 * 0.20408163265306123;
        this.Field_25831 = this.Field_25829.Method_43806(this.Field_25831, n, n3, n4, n6, 0.7706875 * 1.4545454545454546, 0.2586923076923077 * 4.333333333333333, 0.7023809523809523 * 0.7118644067796611);
        this.Field_25828 = this.Field_25822.Method_43806(this.Field_25828, n, n3, n4, n6, 235.48387096774195 * 0.8493150684931506, 0.8571428571428571 * 233.33333333333334, 1.053191489361702 * 0.4747474747474748);
        this.Field_25827 = this.Field_25830.Method_43807(this.Field_25827, n, n2, n3, n4, n5, n6, (d *= 4.166666666666667 * 0.48) / (0.35526315789473684 * 225.1851851851852), d2 / (119.27272727272727 * 1.3414634146341464), d / (0.8260869565217391 * 96.84210526315789));
        this.Field_25819 = this.Field_25823.Method_43807(this.Field_25819, n, n2, n3, n4, n5, n6, d, d2, d);
        this.Field_25818 = this.Field_25821.Method_43807(this.Field_25818, n, n2, n3, n4, n5, n6, d, d2, d);
        int n7 = 3713 & -32448;
        for (int i = 1608 & 6199; i < n4; ++i) {
            for (int j = 13393 & -32338; j < n6; ++j) {
                float f = (float)(i + n) / 1.0f;
                float f2 = (float)(j + n3) / 1.0f;
                float f3 = 0.27272728f * 366.66666f - Class_13337.Method_13388(f * f + f2 * f2) * (1.3333334f * 6.0f);
                if (f3 > 16.551723f * 4.8333335f) {
                    f3 = 0.43103448f * 185.6f;
                }
                if (f3 < 3.9444444f * -25.352114f) {
                    f3 = -102.1978f * 0.97849464f;
                }
                for (int k = 6193 & 9222; k < n5; ++k) {
                    double d3;
                    double d4 = 0.0;
                    double d5 = this.Field_25819[n7] / (1.161764705882353 * 440.70886075949363);
                    double d6 = this.Field_25818[n7] / (3925.3333333333335 * 0.13043478260869565);
                    double d7 = (this.Field_25827[n7] / (1.375 * 7.2727272727272725) + 1.0) / (16.0 * 0.125);
                    d4 = d7 < 0.0 ? d5 : (d7 > 1.0 ? d6 : d5 + (d6 - d5) * d7);
                    d4 -= 5.647058823529411 * 1.4166666666666667;
                    d4 += (double)f3;
                    int n8 = -30142 & 1042;
                    if (k > n5 / (-20286 & 515) - n8) {
                        d3 = (float)(k - (n5 / (1058 & 17158) - n8)) / (2.857143f * 22.4f);
                        d3 = Class_13337.Method_13385(d3, 0.0, 1.0);
                        d4 = d4 * (1.0 - d3) + 0.15306122448979592 * -19600.0 * d3;
                    }
                    if (k < (n8 = 5276 & -15608)) {
                        d3 = (float)(n8 - k) / ((float)n8 - 1.0f);
                        d4 = d4 * (1.0 - d3) + -14.383561643835616 * 2.085714285714286 * d3;
                    }
                    arrd[n7] = d4;
                    ++n7;
                }
            }
        }
        return arrd;
    }

    public Class_4751 Method_25837(Class_283 class_283, String string, Class_4751 class_4751) {
        return null;
    }

    public boolean Method_25838(boolean bl, Class_2748 class_2748) {
        return (-30717 & 28749) != 0;
    }

    public void Method_25839() {
    }

    public Class_17665 Method_25840(int n, int n2) {
        this.Field_25826.setSeed((long)n * (3406541489427838254L & -3406541148662137064L) + (long)n2 * (132897988597L & 132998683607L));
        Class_36425 class_36425 = new Class_36425();
        this.Field_25824 = this.Field_25825.Method_371().Method_31930(this.Field_25824, n * (2072 & 8496), n2 * (11280 & -31984), 16504 & 6294, -32560 & 2577);
        this.Method_25833(n, n2, class_36425);
        this.Method_25832(class_36425);
        Class_17665 class_17665 = new Class_17665(this.Field_25825, class_36425, n, n2);
        byte[] arrby = class_17665.Method_17743();
        for (int i = 22660 & 1282; i < arrby.length; ++i) {
            arrby[i] = (byte)this.Field_25824[i].Field_17343;
        }
        class_17665.Method_17734();
        return class_17665;
    }

    public void Method_25841(Class_17665 class_17665, int n, int n2) {
    }

    public boolean Method_25842(int n, int n2) {
        return (23877 & -32629) != 0;
    }

    public int Method_25843() {
        return -19455 & 18458;
    }

    public List Method_25844(Class_13693 class_13693, Class_4751 class_4751) {
        return this.Field_25825.Method_547(class_4751).Method_17371(class_13693);
    }

    public String Method_25845() {
        return "RandomLevelSource";
    }

    private void Method_25846() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_25847(Class_12166 class_12166, Class_17665 class_17665, int n, int n2) {
        return (1088 & -4090) != 0;
    }

    public void Method_25848(Class_12166 class_12166, int n, int n2) {
        Class_4475.Field_4476 = 5249 & 26965;
        Class_4751 class_4751 = new Class_4751(n * (56 & 7824), -16128 & 553, n2 * (2578 & 1232));
        this.Field_25825.Method_547(class_4751.Method_4791(84 & 8882, 5440 & 16400, 2195 & -19696)).Method_17368(this.Field_25825, this.Field_25825.Field_307, class_4751);
        Class_4475.Field_4476 = -30432 & 131;
    }

    public Class_17665 Method_25849(Class_4751 class_4751) {
        return this.Method_25840(class_4751.\u0000= final() >> (4101 & 1236), class_4751.\u0000strictfp() >> (1028 & -7675));
    }
}

