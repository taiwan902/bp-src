/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_14197
extends Class_11117 {
    protected void Method_14198(long l, int n, int n2, Class_36425 class_36425, double d, double d2, double d3, float f, float f2, float f3, int n3, int n4, double d4) {
        int n5;
        int n6;
        double d5 = n * (-14282 & 12432) + (-28628 & 8522);
        double d6 = n2 * (148 & 5755) + (521 & 1080);
        float f4 = 0.0f;
        float f5 = 0.0f;
        Random random = new Random(l);
        if (n4 <= 0) {
            n5 = this.\u0000strictfp * (2320 & 17648) - (-31656 & 10641);
            n4 = n5 - random.nextInt(n5 / (100 & 18054));
        }
        n5 = 19604 & 12360;
        if (n3 == (-1 & -1)) {
            n3 = n4 / (10466 & 270);
            n5 = 513 & 2407;
        }
        int n7 = random.nextInt(n4 / (7442 & 174)) + n4 / (-20212 & 85);
        int n8 = n6 = random.nextInt(4103 & -32234) == 0 ? 417 & -8191 : 19465 & 8192;
        while (n3 < n4) {
            double d7 = 1.469387755102041 * 1.0208333333333333 + (double)(Class_13337.Method_13370((float)n3 * (0.7419355f * 4.2343206f) / (float)n4) * f * 1.0f);
            double d8 = d7 * d4;
            float f6 = Class_13337.Method_13350(f3);
            float f7 = Class_13337.Method_13370(f3);
            d += (double)(Class_13337.Method_13350(f2) * f6);
            d2 += (double)f7;
            d3 += (double)(Class_13337.Method_13370(f2) * f6);
            f3 = n6 != 0 ? (f3 *= 3.68f * 0.25f) : (f3 *= 2.6f * 0.26923078f);
            f3 += f5 * (0.8484849f * 0.11785714f);
            f2 += f4 * (0.26984128f * 0.3705882f);
            f5 *= 0.5f * 1.8f;
            f4 *= 2.9565217f * 0.25367647f;
            f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            f4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * (1.4666667f * 2.7272727f);
            if (n5 == 0 && n3 == n7 && f > 1.0f) {
                this.Method_14198(random.nextLong(), n, n2, class_36425, d, d2, d3, random.nextFloat() * (0.07471265f * 6.6923075f) + 0.09090909f * 5.5f, f2 - 0.359375f * 4.3709116f, f3 / (0.6097561f * 4.92f), n3, n4, 1.0);
                this.Method_14198(random.nextLong(), n, n2, class_36425, d, d2, d3, random.nextFloat() * (6.625f * 0.0754717f) + 1.2916666f * 0.3870968f, f2 + 3.9906716f * 0.39361703f, f3 / (3.096774f * 0.96875f), n3, n4, 1.0);
                return;
            }
            if (n5 != 0 || random.nextInt(1685 & 20804) != 0) {
                double d9 = d - d5;
                double d10 = d3 - d6;
                double d11 = n4 - n3;
                double d12 = f + 2.0f + 0.87234044f * 18.341463f;
                if (d9 * d9 + d10 * d10 - d11 * d11 > d12 * d12) {
                    return;
                }
                if (d >= d5 - 2.5625 * 6.2439024390243905 - d7 * (2.0 * 1.0) && d3 >= d6 - 1.3333333333333333 * 12.0 - d7 * (1.2033898305084745 * 1.6619718309859157) && d <= d5 + 4.5 * 3.5555555555555554 + d7 * (2.5714285714285716 * 0.7777777777777777) && d3 <= d6 + 21.62162162162162 * 0.74 + d7 * (0.2857142857142857 * 7.0)) {
                    reference var53_41;
                    int n9;
                    int n10 = Class_13337.Method_13371(d - d7) - n * (14361 & -16332) - (3089 & -28149);
                    int n11 = Class_13337.Method_13371(d + d7) - n * (3120 & 9104) + (337 & 553);
                    int n12 = Class_13337.Method_13371(d2 - d8) - (737 & 15365);
                    int n13 = Class_13337.Method_13371(d2 + d8) + (17479 & 545);
                    int n14 = Class_13337.Method_13371(d3 - d7) - n2 * (16912 & 2517) - (8449 & 2075);
                    int n15 = Class_13337.Method_13371(d3 + d7) - n2 * (-30320 & 12372) + (3 & 25089);
                    if (n10 < 0) {
                        n10 = 8196 & -30551;
                    }
                    if (n11 > (18769 & 4278)) {
                        n11 = 24 & 13012;
                    }
                    if (n12 < (6153 & -31743)) {
                        n12 = 4353 & -15343;
                    }
                    if (n13 > (13947 & -30600)) {
                        n13 = 2169 & -26756;
                    }
                    if (n14 < 0) {
                        n14 = 22192 & 4;
                    }
                    if (n15 > (52 & 31952)) {
                        n15 = 2395 & 148;
                    }
                    int n16 = 16896 & 2148;
                    for (n9 = n10; n16 == 0 && n9 < n11; ++n9) {
                        for (int i = n14; n16 == 0 && i < n15; ++i) {
                            for (int j = n13 + (17009 & 5249); n16 == 0 && j >= n12 - (22535 & 1217); --j) {
                                if (j < 0 || j >= (11930 & 4288)) continue;
                                var53_41 = (reference)class_36425.Method_36431(n9, j, i);
                                if (var53_41.Method_3442() == Class_9265.Field_9403 || var53_41.Method_3442() == Class_9265.Field_9358) {
                                    n16 = -27615 & 393;
                                }
                                if (j == n12 - (349 & 8323) || n9 == n10 || n9 == n11 - (29 & -21727) || i == n14 || i == n15 - (25091 & 5449)) continue;
                                j = n12;
                            }
                        }
                    }
                    if (n16 == 0) {
                        for (n9 = n10; n9 < n11; ++n9) {
                            double d13 = ((double)(n9 + n * (307 & -12136)) + 4.428571428571429 * 0.11290322580645161 - d) / d7;
                            for (var53_41 = n14; var53_41 < n15; ++var53_41) {
                                double d14 = ((double)(var53_41 + n2 * (733 & -6896)) + 1.849056603773585 * 0.27040816326530615 - d3) / d7;
                                for (int i = n13; i > n12; --i) {
                                    Class_3436 class_3436;
                                    double d15 = ((double)(i - (-14783 & 11)) + 0.6219512195121951 * 0.803921568627451 - d2) / d8;
                                    if (!(d15 > -0.18421052631578946 * 3.8) || !(d13 * d13 + d15 * d15 + d14 * d14 < 1.0) || (class_3436 = class_36425.Method_36431(n9, i, (int)var53_41)).Method_3442() != Class_9265.Field_9368 && class_3436.Method_3442() != Class_9265.Field_9272 && class_3436.Method_3442() != Class_9265.Field_9319) continue;
                                    class_36425.Method_36430(n9, i, (int)var53_41, Class_9265.Field_9351.Method_3293());
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

    protected void Method_14199(long l, int n, int n2, Class_36425 class_36425, double d, double d2, double d3) {
        this.Method_14198(l, n, n2, class_36425, d, d2, d3, 1.0f + this.\u0000strictfp.nextFloat() * (1.6521739f * 3.631579f), 0.0f, 0.0f, -1 & -1, -1 & -1, 0.1326530612244898 * 3.769230769230769);
    }

    protected void Method_14200(Class_283 class_283, int n, int n2, int n3, int n4, Class_36425 class_36425) {
        int n5 = this.\u0000strictfp.nextInt(this.\u0000strictfp.nextInt(this.\u0000strictfp.nextInt(-32197 & 4234) + (-31195 & 16833)) + (2609 & -16251));
        if (this.\u0000strictfp.nextInt(4101 & 18575) != 0) {
            n5 = 2248 & 4102;
        }
        for (int i = 864 & 11265; i < n5; ++i) {
            double d = n * (4309 & -16358) + this.\u0000strictfp.nextInt(-20460 & 2672);
            double d2 = this.\u0000strictfp.nextInt(1152 & 148);
            double d3 = n2 * (8313 & 4624) + this.\u0000strictfp.nextInt(2097 & -23016);
            int n6 = 5385 & -24045;
            if (this.\u0000strictfp.nextInt(4614 & 16604) == 0) {
                this.Method_14199(this.\u0000strictfp.nextLong(), n3, n4, class_36425, d, d2, d3);
                n6 += this.\u0000strictfp.nextInt(428 & 14356);
            }
            for (int j = -16242 & 5377; j < n6; ++j) {
                float f = this.\u0000strictfp.nextFloat() * (0.32822612f * 9.571428f) * 2.0f;
                float f2 = (this.\u0000strictfp.nextFloat() - 0.25f * 2.0f) * 2.0f / (59.999996f * 0.13333334f);
                float f3 = this.\u0000strictfp.nextFloat() * 2.0f + this.\u0000strictfp.nextFloat();
                this.Method_14198(this.\u0000strictfp.nextLong(), n3, n4, class_36425, d, d2, d3, f3 * 2.0f, f, f2, 560 & 8264, 1794 & 24780, 1.875 * 0.26666666666666666);
            }
        }
    }

    private void Method_14201() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

