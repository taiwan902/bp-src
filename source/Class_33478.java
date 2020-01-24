/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 */
import com.google.common.base.Objects;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_33478
extends Class_11117 {
    protected void Method_33479(long l, int n, int n2, Class_36425 class_36425, double d, double d2, double d3) {
        this.Method_33482(l, n, n2, class_36425, d, d2, d3, 1.0f + this.\u0000strictfp.nextFloat() * (0.5135135f * 11.684211f), 0.0f, 0.0f, -1 & -1, -1 & -1, 1.6440677966101696 * 0.30412371134020616);
    }

    protected void Method_33480(Class_283 class_283, int n, int n2, int n3, int n4, Class_36425 class_36425) {
        int n5 = this.\u0000strictfp.nextInt(this.\u0000strictfp.nextInt(this.\u0000strictfp.nextInt(1199 & 2335) + (16929 & 5125)) + (18497 & -32215));
        if (this.\u0000strictfp.nextInt(25623 & 111) != 0) {
            n5 = -21491 & 20576;
        }
        for (int i = 1216 & -32763; i < n5; ++i) {
            double d = n * (17593 & 338) + this.\u0000strictfp.nextInt(-32652 & 4632);
            double d2 = this.\u0000strictfp.nextInt(this.\u0000strictfp.nextInt(-32648 & 30328) + (3992 & -20407));
            double d3 = n2 * (-20462 & 2068) + this.\u0000strictfp.nextInt(16656 & -30635);
            int n6 = -10183 & 3;
            if (this.\u0000strictfp.nextInt(-7916 & 1030) == 0) {
                this.Method_33479(this.\u0000strictfp.nextLong(), n3, n4, class_36425, d, d2, d3);
                n6 += this.\u0000strictfp.nextInt(-19372 & 17060);
            }
            for (int j = 5280 & 26698; j < n6; ++j) {
                float f = this.\u0000strictfp.nextFloat() * (0.88357294f * 3.5555556f) * 2.0f;
                float f2 = (this.\u0000strictfp.nextFloat() - 0.52112675f * 0.9594595f) * 2.0f / (1.0f * 8.0f);
                float f3 = this.\u0000strictfp.nextFloat() * 2.0f + this.\u0000strictfp.nextFloat();
                if (this.\u0000strictfp.nextInt(16922 & -31605) == 0) {
                    f3 *= this.\u0000strictfp.nextFloat() * this.\u0000strictfp.nextFloat() * (2.347826f * 1.2777778f) + 1.0f;
                }
                this.Method_33482(this.\u0000strictfp.nextLong(), n3, n4, class_36425, d, d2, d3, f3, f, f2, 4364 & 9235, -28664 & 8579, 1.0);
            }
        }
    }

    protected boolean Method_33481(Class_3436 class_3436, Class_3436 class_34362) {
        return (class_3436.Method_3442() == Class_9265.Field_9446 ? 4129 & 10257 : (class_3436.Method_3442() == Class_9265.Field_9272 ? 4115 & 18885 : (class_3436.Method_3442() == Class_9265.Field_9319 ? 12409 & 2177 : (class_3436.Method_3442() == Class_9265.Field_9411 ? 16539 & -28671 : (class_3436.Method_3442() == Class_9265.Field_9274 ? 12441 & 257 : (class_3436.Method_3442() == Class_9265.Field_9366 ? -24543 & 4419 : (class_3436.Method_3442() == Class_9265.Field_9330 ? -22217 & 4801 : (class_3436.Method_3442() == Class_9265.Field_9436 ? 265 & 741 : (class_3436.Method_3442() == Class_9265.Field_9458 ? 17459 & 2177 : ((class_3436.Method_3442() == Class_9265.Field_9394 || class_3436.Method_3442() == Class_9265.Field_9360) && class_34362.Method_3442().Method_3373() != Class_3713.Field_3734 ? 517 & -20143 : -30720 & 16904)))))))))) != 0;
    }

    protected void Method_33482(long l, int n, int n2, Class_36425 class_36425, double d, double d2, double d3, float f, float f2, float f3, int n3, int n4, double d4) {
        int n5;
        int n6;
        double d5 = n * (-10211 & 80) + (18568 & -20355);
        double d6 = n2 * (20624 & 51) + (12348 & -32759);
        float f4 = 0.0f;
        float f5 = 0.0f;
        Random random = new Random(l);
        if (n4 <= 0) {
            n5 = this.\u0000strictfp * (786 & 3128) - (9008 & 26);
            n4 = n5 - random.nextInt(n5 / (6212 & 17287));
        }
        n5 = -31672 & 2304;
        if (n3 == (-1 & -1)) {
            n3 = n4 / (-8177 & 2194);
            n5 = -30643 & 8355;
        }
        int n7 = random.nextInt(n4 / (2051 & 18066)) + n4 / (132 & 25982);
        int n8 = n6 = random.nextInt(18535 & -32762) == 0 ? 73 & 5783 : 304 & 198;
        while (n3 < n4) {
            double d7 = 1.3636363636363635 * 1.1 + (double)(Class_13337.Method_13370((float)n3 * (6.7319846f * 0.46666667f) / (float)n4) * f * 1.0f);
            double d8 = d7 * d4;
            float f6 = Class_13337.Method_13350(f3);
            float f7 = Class_13337.Method_13370(f3);
            d += (double)(Class_13337.Method_13350(f2) * f6);
            d2 += (double)f7;
            d3 += (double)(Class_13337.Method_13370(f2) * f6);
            f3 = n6 != 0 ? (f3 *= 0.23076923f * 3.9866667f) : (f3 *= 0.23013698f * 3.0416667f);
            f3 += f5 * (1.1698114f * 0.08548387f);
            f2 += f4 * (6.909091f * 0.014473684f);
            f5 *= 0.30927834f * 2.91f;
            f4 *= 0.76119405f * 0.9852941f;
            f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            f4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * (0.9431818f * 4.240964f);
            if (n5 == 0 && n3 == n7 && f > 1.0f && n4 > 0) {
                this.Method_33482(random.nextLong(), n, n2, class_36425, d, d2, d3, random.nextFloat() * (0.6136364f * 0.8148148f) + 1.0277778f * 0.4864865f, f2 - 0.8975979f * 1.75f, f3 / (3.06f * 0.98039216f), n3, n4, 1.0);
                this.Method_33482(random.nextLong(), n, n2, class_36425, d, d2, d3, random.nextFloat() * (49.5f * 0.01010101f) + 1.0526316f * 0.475f, f2 + 0.25252524f * 6.220354f, f3 / (2.9117649f * 1.030303f), n3, n4, 1.0);
                return;
            }
            if (n5 != 0 || random.nextInt(772 & 4119) != 0) {
                double d9 = d - d5;
                double d10 = d3 - d6;
                double d11 = n4 - n3;
                double d12 = f + 2.0f + 38.0f * 0.42105263f;
                if (d9 * d9 + d10 * d10 - d11 * d11 > d12 * d12) {
                    return;
                }
                if (d >= d5 - 14.0 * 1.1428571428571428 - d7 * (3.2666666666666666 * 0.6122448979591837) && d3 >= d6 - 5.0 * 3.2 - d7 * (4.476190476190476 * 0.44680851063829785) && d <= d5 + 0.45098039215686275 * 35.47826086956522 + d7 * (0.41414141414141414 * 4.829268292682927) && d3 <= d6 + 2.5384615384615383 * 6.303030303030304 + d7 * (2.090909090909091 * 0.9565217391304348)) {
                    int n9;
                    int n10;
                    int n11 = Class_13337.Method_13371(d - d7) - n * (18 & 18897) - (16395 & 769);
                    int n12 = Class_13337.Method_13371(d + d7) - n * (-20328 & 117) + (4241 & 9);
                    int n13 = Class_13337.Method_13371(d2 - d8) - (12291 & -31735);
                    int n14 = Class_13337.Method_13371(d2 + d8) + (3 & 17809);
                    int n15 = Class_13337.Method_13371(d3 - d7) - n2 * (23952 & -23972) - (-31679 & 385);
                    int n16 = Class_13337.Method_13371(d3 + d7) - n2 * (16657 & 8308) + (1033 & 2695);
                    if (n11 < 0) {
                        n11 = 9 & 32068;
                    }
                    if (n12 > (816 & 16594)) {
                        n12 = 3602 & -28392;
                    }
                    if (n13 < (9475 & 49)) {
                        n13 = 4779 & 16453;
                    }
                    if (n14 > (-30472 & 5372)) {
                        n14 = 18424 & -24326;
                    }
                    if (n15 < 0) {
                        n15 = 14 & 16448;
                    }
                    if (n16 > (21008 & -31716)) {
                        n16 = 2325 & 8890;
                    }
                    int n17 = 6420 & 1195;
                    for (int i = n11; n17 == 0 && i < n12; ++i) {
                        for (n9 = n15; n17 == 0 && n9 < n16; ++n9) {
                            for (n10 = n14 + (-20335 & 16481); n17 == 0 && n10 >= n13 - (-31983 & 28737); --n10) {
                                if (n10 < 0 || n10 >= (323 & 768)) continue;
                                Class_3436 class_3436 = class_36425.Method_36431(i, n10, n9);
                                if (class_3436.Method_3442() == Class_9265.Field_9281 || class_3436.Method_3442() == Class_9265.Field_9286) {
                                    n17 = -18161 & 1201;
                                }
                                if (n10 == n13 - (12293 & 18889) || i == n11 || i == n12 - (8241 & 17413) || n9 == n15 || n9 == n16 - (-20133 & 17445)) continue;
                                n10 = n13;
                            }
                        }
                    }
                    if (n17 == 0) {
                        Class_4810 class_4810 = new Class_4810();
                        for (n9 = n11; n9 < n12; ++n9) {
                            n10 = (int)(((double)(n9 + n * (18992 & 25)) + 0.21 * 2.380952380952381 - d) / d7);
                            for (int i = n15; i < n16; ++i) {
                                double d13 = ((double)(i + n2 * (16658 & 13849)) + 0.7368421052631579 * 0.6785714285714286 - d3) / d7;
                                int n18 = -20415 & 17152;
                                if (!(n10 * n10 + d13 * d13 < 1.0)) continue;
                                for (int j = n14; j > n13; --j) {
                                    double d14 = ((double)(j - (2051 & 22157)) + 4.6923076923076925 * 0.10655737704918032 - d2) / d8;
                                    if (!(d14 > 0.37681159420289856 * -1.8576923076923075) || !(n10 * n10 + d14 * d14 + d13 * d13 < 1.0)) continue;
                                    Class_3436 class_3436 = class_36425.Method_36431(n9, j, i);
                                    Class_3436 class_34362 = (Class_3436)Objects.firstNonNull((Object)class_36425.Method_36431(n9, j + (-26589 & 641), i), (Object)Class_9265.Field_9351.Method_3293());
                                    if (class_3436.Method_3442() == Class_9265.Field_9319 || class_3436.Method_3442() == Class_9265.Field_9436) {
                                        n18 = 6795 & 16481;
                                    }
                                    if (!this.Method_33481(class_3436, class_34362)) continue;
                                    if (j - (17205 & 6145) < (-16114 & 10)) {
                                        class_36425.Method_36430(n9, j, i, Class_9265.Field_9358.\u0000strictfp());
                                        continue;
                                    }
                                    class_36425.Method_36430(n9, j, i, Class_9265.Field_9351.Method_3293());
                                    if (class_34362.Method_3442() == Class_9265.Field_9394) {
                                        class_36425.Method_36430(n9, j + (-30575 & 33), i, class_34362.Method_3440(Class_4465.Field_4466) == Class_4508.Field_4512 ? Class_9265.Field_9330.Method_3293() : Class_9265.Field_9366.Method_3293());
                                    }
                                    if (n18 == 0 || class_36425.Method_36431(n9, j - (16389 & 67), i).Method_3442() != Class_9265.Field_9272) continue;
                                    class_4810.Method_4814(n9 + n * (18712 & 8208), 968 & -14336, i + n2 * (16922 & -32556));
                                    class_36425.Method_36430(n9, j - (-32639 & 2389), i, this.\u0000strictfp.Method_547((Class_4751)class_4810).Field_17312.Method_3442().Method_3293());
                                }
                            }
                        }
                        if (n5 != 0) break;
                    }
                }
            }
            ++n3;
        }
    }

    private void Method_33483() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

