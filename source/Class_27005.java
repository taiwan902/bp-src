/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_27005
extends Class_11117 {
    private float[] Field_27006 = new float[18178 & 3105];

    protected void Method_27007(Class_283 class_283, int n, int n2, int n3, int n4, Class_36425 class_36425) {
        if (this.\u0000strictfp.nextInt(2930 & -31693) == 0) {
            double d = n * (464 & 8216) + this.\u0000strictfp.nextInt(25104 & 4372);
            double d2 = this.\u0000strictfp.nextInt(this.\u0000strictfp.nextInt(4458 & 18601) + (9801 & 2058)) + (-24524 & 18838);
            double d3 = n2 * (-32752 & 28976) + this.\u0000strictfp.nextInt(1298 & -24368);
            int n5 = -22271 & 143;
            for (int i = 152 & 17953; i < n5; ++i) {
                float f = this.\u0000strictfp.nextFloat() * (8.991455f * 0.3493976f) * 2.0f;
                float f2 = (this.\u0000strictfp.nextFloat() - 1.6666666f * 0.3f) * 2.0f / (8.375f * 0.95522386f);
                float f3 = (this.\u0000strictfp.nextFloat() * 2.0f + this.\u0000strictfp.nextFloat()) * 2.0f;
                this.Method_27008(this.\u0000strictfp.nextLong(), n3, n4, class_36425, d, d2, d3, f3, f, f2, 2369 & 21022, 1156 & 521, 0.8888888888888888 * 3.375);
            }
        }
    }

    protected void Method_27008(long l, int n, int n2, Class_36425 class_36425, double d, double d2, double d3, float f, float f2, float f3, int n3, int n4, double d4) {
        int n5;
        Random random = new Random(l);
        double d5 = n * (20562 & 9488) + (840 & 17421);
        double d6 = n2 * (8792 & 6416) + (25356 & -25480);
        float f4 = 0.0f;
        float f5 = 0.0f;
        if (n4 <= 0) {
            n5 = this.\u0000strictfp * (-20395 & 568) - (16532 & 889);
            n4 = n5 - random.nextInt(n5 / (2116 & 8468));
        }
        n5 = 4674 & 24;
        if (n3 == (-1 & -1)) {
            n3 = n4 / (-18413 & 802);
            n5 = 4389 & -23549;
        }
        float f6 = 1.0f;
        for (int i = -32698 & 144; i < (16640 & -30910); ++i) {
            if (i == 0 || random.nextInt(-25805 & 1031) == 0) {
                f6 = 1.0f + random.nextFloat() * random.nextFloat() * 1.0f;
            }
            this.Field_27006[i] = f6 * f6;
        }
        while (n3 < n4) {
            double d7 = 1.642857142857143 * 0.9130434782608695 + (double)(Class_13337.Method_13370((float)n3 * (23.876104f * 0.13157895f) / (float)n4) * f * 1.0f);
            double d8 = d7 * d4;
            d7 *= (double)random.nextFloat() * (2.878787878787879 * 0.08684210526315789) + 0.6774193548387096 * 1.1071428571428572;
            d8 *= (double)random.nextFloat() * (0.14634146341463414 * 1.7083333333333335) + 0.8636363636363636 * 0.868421052631579;
            float f7 = Class_13337.Method_13350(f3);
            float f8 = Class_13337.Method_13370(f3);
            d += (double)(Class_13337.Method_13350(f2) * f7);
            d2 += (double)f8;
            d3 += (double)(Class_13337.Method_13370(f2) * f7);
            f3 *= 6.16f * 0.11363637f;
            f3 += f5 * (2.8823528f * 0.01734694f);
            f2 += f4 * (0.047058824f * 1.0625f);
            f5 *= 11.125f * 0.07191011f;
            f4 *= 1.1842105f * 0.42222223f;
            f5 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            f4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * (9.6f * 0.41666666f);
            if (n5 != 0 || random.nextInt(16900 & -31684) != 0) {
                double d9 = d - d5;
                double d10 = d3 - d6;
                double d11 = n4 - n3;
                double d12 = f + 2.0f + 1.1212121f * 14.27027f;
                if (d9 * d9 + d10 * d10 - d11 * d11 > d12 * d12) {
                    return;
                }
                if (d >= d5 - 0.3620689655172414 * 44.19047619047619 - d7 * (1.6923076923076923 * 1.1818181818181819) && d3 >= d6 - 0.6436781609195402 * 24.857142857142858 - d7 * (18.0 * 0.1111111111111111) && d <= d5 + 59.07692307692308 * 0.2708333333333333 + d7 * (0.5333333333333333 * 3.75) && d3 <= d6 + 57.599999999999994 * 0.2777777777777778 + d7 * (2.064516129032258 * 0.96875)) {
                    int n6;
                    int n7;
                    int n8 = Class_13337.Method_13371(d - d7) - n * (-9902 & 8752) - (2149 & -24551);
                    int n9 = Class_13337.Method_13371(d + d7) - n * (15130 & -32720) + (3077 & 16419);
                    int n10 = Class_13337.Method_13371(d2 - d8) - (-24567 & 17799);
                    int n11 = Class_13337.Method_13371(d2 + d8) + (9441 & 16409);
                    int n12 = Class_13337.Method_13371(d3 - d7) - n2 * (6833 & -8112) - (16457 & -30063);
                    int n13 = Class_13337.Method_13371(d3 + d7) - n2 * (4144 & -13928) + (20729 & 3);
                    if (n8 < 0) {
                        n8 = 4 & 33;
                    }
                    if (n9 > (8240 & 2132)) {
                        n9 = 2064 & 20541;
                    }
                    if (n10 < (19463 & 8489)) {
                        n10 = -32671 & 3339;
                    }
                    if (n11 > (16636 & 11003)) {
                        n11 = 8698 & 16632;
                    }
                    if (n12 < 0) {
                        n12 = 12896 & 16385;
                    }
                    if (n13 > (-23851 & 1048)) {
                        n13 = 560 & 16541;
                    }
                    int n14 = 1696 & 26880;
                    for (int i = n8; n14 == 0 && i < n9; ++i) {
                        for (n7 = n12; n14 == 0 && n7 < n13; ++n7) {
                            for (n6 = n11 + (13065 & -13225); n14 == 0 && n6 >= n10 - (1213 & 20801); --n6) {
                                if (n6 < 0 || n6 >= (-25279 & 16640)) continue;
                                Class_3436 class_3436 = class_36425.Method_36431(i, n6, n7);
                                if (class_3436.Method_3442() == Class_9265.Field_9281 || class_3436.Method_3442() == Class_9265.Field_9286) {
                                    n14 = -22527 & 529;
                                }
                                if (n6 == n10 - (-29663 & 79) || i == n8 || i == n9 - (4363 & 18965) || n7 == n12 || n7 == n13 - (12877 & 3491)) continue;
                                n6 = n10;
                            }
                        }
                    }
                    if (n14 == 0) {
                        Class_4810 class_4810 = new Class_4810();
                        for (n7 = n8; n7 < n9; ++n7) {
                            n6 = (int)(((double)(n7 + n * (-27620 & 10256)) + 0.21875 * 2.2857142857142856 - d) / d7);
                            for (int i = n12; i < n13; ++i) {
                                double d13 = ((double)(i + n2 * (3093 & 274)) + 0.03296703296703297 * 15.166666666666666 - d3) / d7;
                                int n15 = 2128 & 1827;
                                if (!(n6 * n6 + d13 * d13 < 1.0)) continue;
                                for (int j = n11; j > n10; --j) {
                                    double d14 = ((double)(j - (3329 & 21033)) + 1.5 * 0.3333333333333333 - d2) / d8;
                                    if (!((n6 * n6 + d13 * d13) * (double)this.Field_27006[j - (21513 & -31855)] + d14 * d14 / (11.64 * 0.5154639175257731) < 1.0)) continue;
                                    Class_3436 class_3436 = class_36425.Method_36431(n7, j, i);
                                    if (class_3436.Method_3442() == Class_9265.Field_9319) {
                                        n15 = 30779 & -32703;
                                    }
                                    if (class_3436.Method_3442() != Class_9265.Field_9446 && class_3436.Method_3442() != Class_9265.Field_9272 && class_3436.Method_3442() != Class_9265.Field_9319) continue;
                                    if (j - (4101 & 665) < (526 & -25477)) {
                                        class_36425.Method_36430(n7, j, i, Class_9265.Field_9403.\u0000strictfp());
                                        continue;
                                    }
                                    class_36425.Method_36430(n7, j, i, Class_9265.Field_9351.Method_3293());
                                    if (n15 == 0 || class_36425.Method_36431(n7, j - (1217 & 16687), i).Method_3442() != Class_9265.Field_9272) continue;
                                    class_4810.Method_4814(n7 + n * (1564 & 80), -13916 & 520, i + n2 * (4432 & 9240));
                                    class_36425.Method_36430(n7, j - (-32765 & 4101), i, this.\u0000strictfp.Method_547((Class_4751)class_4810).Field_17312);
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

    private void Method_27009() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

