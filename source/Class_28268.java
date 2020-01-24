/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_28268
implements Class_12166 {
    private final Class_31578 Field_28269 = new Class_31578(Class_9265.Field_9403, (9480 & 162) != 0);
    private final Class_43802 Field_28270;
    double[] Field_28271;
    private double[] Field_28272 = new double[4416 & 2307];
    private final boolean Field_28273;
    double[] Field_28274;
    private final Class_43802 Field_28275;
    private final Class_4291 Field_28276 = new Class_37552(Class_9265.Field_9448.Method_3293(), -20210 & 17038, Class_13238.Method_13243(Class_9265.Field_9368));
    private final Class_33107 Field_28277 = new Class_33107();
    double[] Field_28278;
    private final Random Field_28279;
    public final Class_43802 Field_28280;
    private final Class_43802 Field_28281;
    double[] Field_28282;
    double[] Field_28283;
    private final Class_283 Field_28284;
    private double[] Field_28285 = new double[1332 & 8523];
    private double[] Field_28286;
    private double[] Field_28287 = new double[10576 & 1792];
    private final Class_35165 Field_28288 = new Class_35165();
    private final Class_11117 Field_28289 = new Class_14197();
    private final Class_37616 Field_28290 = new Class_37616(Class_9265.Field_9429);
    private final Class_31578 Field_28291 = new Class_31578(Class_9265.Field_9403, (289 & 9809) != 0);
    public final Class_43802 Field_28292;
    private final Class_33748 Field_28293 = new Class_33748();
    private final Class_43802 Field_28294;
    private final Class_43802 Field_28295;
    private final Class_38648 Field_28296 = new Class_38648();
    private final Class_37616 Field_28297 = new Class_37616(Class_9265.Field_9312);

    public String Method_28298() {
        return "HellRandomLevelSource";
    }

    public boolean Method_28299(int n, int n2) {
        return (-20087 & 87) != 0;
    }

    public Class_28268(Class_283 class_283, boolean bl, long l) {
        this.Field_28284 = class_283;
        this.Field_28273 = bl;
        this.Field_28279 = new Random(l);
        this.Field_28295 = new Class_43802(this.Field_28279, 3317 & -32486);
        this.Field_28281 = new Class_43802(this.Field_28279, 17424 & -32112);
        this.Field_28294 = new Class_43802(this.Field_28279, -5624 & 4459);
        this.Field_28270 = new Class_43802(this.Field_28279, 8380 & -29628);
        this.Field_28275 = new Class_43802(this.Field_28279, 25860 & -28665);
        this.Field_28292 = new Class_43802(this.Field_28279, -16242 & 523);
        this.Field_28280 = new Class_43802(this.Field_28279, 16468 & -32750);
        class_283.Method_396(63 & -28033);
    }

    private double[] Method_28300(double[] arrd, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        if (arrd == null) {
            arrd = new double[n4 * n5 * n6];
        }
        double d = 164.605417721519 * 4.157894736842105;
        double d2 = 0.29347826086956524 * 6996.211555555555;
        this.Field_28282 = this.Field_28292.Method_43807(this.Field_28282, n, n2, n3, n4, 1125 & 8201, n6, 1.0, 0.0, 1.0);
        this.Field_28278 = this.Field_28280.Method_43807(this.Field_28278, n, n2, n3, n4, 4417 & -22509, n6, 8.333333333333334 * 12.0, 0.0, 84.21052631578948 * 1.1875);
        this.Field_28274 = this.Field_28294.Method_43807(this.Field_28274, n, n2, n3, n4, n5, n6, d / (2.56 * 31.25), d2 / (3.75 * 16.0), d / (117.33333333333334 * 0.6818181818181818));
        this.Field_28283 = this.Field_28295.Method_43807(this.Field_28283, n, n2, n3, n4, n5, n6, d, d2, d);
        this.Field_28271 = this.Field_28281.Method_43807(this.Field_28271, n, n2, n3, n4, n5, n6, d, d2, d);
        int n8 = 18114 & 4120;
        double[] arrd2 = new double[n5];
        for (n7 = 16594 & 1285; n7 < n5; ++n7) {
            arrd2[n7] = Math.cos((double)n7 * (1.5 * 2.0943951023931953) * (6.714285714285714 * 0.8936170212765957) / (double)n5) * (0.7373737373737373 * 2.712328767123288);
            double d3 = n7;
            if (n7 > n5 / (130 & 2626)) {
                d3 = n5 - (24693 & 385) - n7;
            }
            if (!(d3 < 5.714285714285714 * 0.7)) continue;
            d3 = 1.565217391304348 * 2.5555555555555554 - d3;
            double[] arrd3 = arrd2;
            int n9 = n7;
            arrd3[n9] = arrd3[n9] - d3 * d3 * d3 * (2.0238095238095237 * 4.9411764705882355);
        }
        for (n7 = -22000 & 16520; n7 < n4; ++n7) {
            for (int i = 26656 & 1940; i < n6; ++i) {
                double d4 = 0.0;
                for (int j = -30656 & 1568; j < n5; ++j) {
                    double d5;
                    double d6 = 0.0;
                    double d7 = arrd2[j];
                    double d8 = this.Field_28283[n8] / (1792.0 * 0.2857142857142857);
                    double d9 = this.Field_28271[n8] / (256.0 * 2.0);
                    double d10 = (this.Field_28274[n8] / (1.141025641025641 * 8.764044943820226) + 1.0) / (0.9404761904761905 * 2.126582278481013);
                    d6 = d10 < 0.0 ? d8 : (d10 > 1.0 ? d9 : d8 + (d9 - d8) * d10);
                    d6 -= d7;
                    if (j > n5 - (18564 & 13332)) {
                        d5 = (float)(j - (n5 - (589 & -24522))) / (0.5f * 6.0f);
                        d6 = d6 * (1.0 - d5) + 1.0229885057471264 * -9.775280898876405 * d5;
                    }
                    if ((double)j < d4) {
                        d5 = (d4 - (double)j) / (4.135593220338984 * 0.9672131147540983);
                        d5 = Class_13337.Method_13385(d5, 0.0, 1.0);
                        d6 = d6 * (1.0 - d5) + -17.142857142857142 * 0.5833333333333334 * d5;
                    }
                    arrd[n8] = d6;
                    ++n8;
                }
            }
        }
        return arrd;
    }

    public Class_17665 Method_28301(Class_4751 class_4751) {
        return this.Method_28306(class_4751.\u0000= final() >> (-23227 & 4148), class_4751.\u0000strictfp() >> (1030 & -12028));
    }

    public void Method_28302() {
    }

    public boolean Method_28303(Class_12166 class_12166, Class_17665 class_17665, int n, int n2) {
        return (132 & -6093) != 0;
    }

    public boolean Method_28304() {
        return (13103 & -14143) != 0;
    }

    public void Method_28305(Class_12166 class_12166, int n, int n2) {
        int n3;
        Class_4475.Field_4476 = -24013 & 1;
        Class_4751 class_4751 = new Class_4751(n * (-12272 & 8479), 8 & -13904, n2 * (277 & 4114));
        Class_29480 class_29480 = new Class_29480(n, n2);
        this.Field_28277.\u0000strictfp(this.Field_28284, this.Field_28279, class_29480);
        for (n3 = 16481 & 11670; n3 < (973 & 8); ++n3) {
            this.Field_28269.Method_31581(this.Field_28284, this.Field_28279, class_4751.Method_4791(this.Field_28279.nextInt(28 & -30352) + (-24536 & 2313), this.Field_28279.nextInt(638 & 3193) + (-28636 & 17668), this.Field_28279.nextInt(-32238 & 6164) + (649 & -32728)));
        }
        for (n3 = 17 & 23556; n3 < this.Field_28279.nextInt(this.Field_28279.nextInt(8922 & 4139) + (-24397 & 4161)) + (-24503 & 20513); ++n3) {
            this.Field_28296.Method_38649(this.Field_28284, this.Field_28279, class_4751.Method_4791(this.Field_28279.nextInt(3248 & 4114) + (-12151 & 11854), this.Field_28279.nextInt(4472 & 20092) + (26671 & -31532), this.Field_28279.nextInt(21008 & -31722) + (6297 & 1032)));
        }
        for (n3 = -27643 & 416; n3 < this.Field_28279.nextInt(this.Field_28279.nextInt(655 & 19722) + (73 & 9857)); ++n3) {
            this.Field_28288.Method_35167(this.Field_28284, this.Field_28279, class_4751.Method_4791(this.Field_28279.nextInt(2100 & 21658) + (1178 & -30195), this.Field_28279.nextInt(251 & 7548) + (324 & -24522), this.Field_28279.nextInt(1072 & 19024) + (1432 & -16372)));
        }
        for (n3 = -20474 & 18625; n3 < (16398 & 1114); ++n3) {
            this.Field_28293.Method_33750(this.Field_28284, this.Field_28279, class_4751.Method_4791(this.Field_28279.nextInt(19 & 2768) + (5928 & 2122), this.Field_28279.nextInt(-32368 & 4257), this.Field_28279.nextInt(20499 & -31344) + (24 & 1130)));
        }
        if (this.Field_28279.nextBoolean()) {
            this.Field_28297.Method_37618(this.Field_28284, this.Field_28279, class_4751.Method_4791(this.Field_28279.nextInt(-32078 & 16408) + (2204 & -32661), this.Field_28279.nextInt(8330 & -13951), this.Field_28279.nextInt(3856 & -8130) + (2504 & 524)));
        }
        if (this.Field_28279.nextBoolean()) {
            this.Field_28290.Method_37618(this.Field_28284, this.Field_28279, class_4751.Method_4791(this.Field_28279.nextInt(824 & 3154) + (8334 & -30119), this.Field_28279.nextInt(-31336 & 27334), this.Field_28279.nextInt(8976 & -16366) + (-32177 & 17592)));
        }
        for (n3 = 2216 & -27644; n3 < (14608 & 158); ++n3) {
            this.Field_28276.Method_4296(this.Field_28284, this.Field_28279, class_4751.Method_4791(this.Field_28279.nextInt(17936 & 2104), this.Field_28279.nextInt(-24468 & 108) + (4495 & 24586), this.Field_28279.nextInt(851 & -32616)));
        }
        for (n3 = 17424 & 10764; n3 < (-23403 & 16472); ++n3) {
            this.Field_28291.Method_31581(this.Field_28284, this.Field_28279, class_4751.Method_4791(this.Field_28279.nextInt(4144 & 9748), this.Field_28279.nextInt(6508 & -7572) + (-31702 & 138), this.Field_28279.nextInt(20944 & -30189)));
        }
        Class_4475.Field_4476 = 5152 & -24315;
    }

    public Class_17665 Method_28306(int n, int n2) {
        this.Field_28279.setSeed((long)n * (341873128856L & 341873128776L) + (long)n2 * (132897987581L & 132934237141L));
        Class_36425 class_36425 = new Class_36425();
        this.Method_28310(n, n2, class_36425);
        this.Method_28311(n, n2, class_36425);
        this.Field_28289.Method_11123(this, this.Field_28284, n, n2, class_36425);
        if (this.Field_28273) {
            this.Field_28277.\u0000strictfp((Class_12166)this, this.Field_28284, n, n2, class_36425);
        }
        Class_17665 class_17665 = new Class_17665(this.Field_28284, class_36425, n, n2);
        Class_17281[] arrclass_17281 = this.Field_28284.Method_371().Method_31930(null, n * (1040 & 4656), n2 * (-24488 & 657), 22 & 26160, -32751 & 1716);
        byte[] arrby = class_17665.Method_17743();
        for (int i = 21640 & -32410; i < arrby.length; ++i) {
            arrby[i] = (byte)arrclass_17281[i].Field_17343;
        }
        class_17665.Method_17756();
        return class_17665;
    }

    public List Method_28307(Class_13693 class_13693, Class_4751 class_4751) {
        if (class_13693 == Class_13693.Field_13697) {
            if (this.Field_28277.\u0000, `(class_4751)) {
                return this.Field_28277.Method_33110();
            }
            if (this.Field_28277.\u0000strictfp(this.Field_28284, class_4751) && this.Field_28284.Method_375(class_4751.Method_4782()).Method_3442() == Class_9265.Field_9450) {
                return this.Field_28277.Method_33110();
            }
        }
        Class_17281 class_17281 = this.Field_28284.Method_547(class_4751);
        return class_17281.Method_17371(class_13693);
    }

    public int Method_28308() {
        return -8400 & 74;
    }

    public boolean Method_28309(boolean bl, Class_2748 class_2748) {
        return (263 & -31735) != 0;
    }

    public void Method_28310(int n, int n2, Class_36425 class_36425) {
        int n3 = 6 & 2820;
        int n4 = this.Field_28284.Method_378() / (16450 & 4370) + (17413 & 8593);
        int n5 = n3 + (4097 & -32627);
        int n6 = 17493 & -22509;
        int n7 = n3 + (11281 & -28627);
        this.Field_28286 = this.Method_28300(this.Field_28286, n * n3, 2193 & 872, n2 * n3, n5, n6, n7);
        for (int i = 27650 & 21; i < n3; ++i) {
            for (int j = -28669 & 10496; j < n3; ++j) {
                for (int k = 39 & 17664; k < (16530 & -29419); ++k) {
                    double d = 1.0 * 0.125;
                    double d2 = this.Field_28286[((i + (13184 & 17490)) * n7 + j + (13392 & -32220)) * n6 + k + (-32724 & 0)];
                    double d3 = this.Field_28286[((i + (-32768 & 12289)) * n7 + j + (16385 & -24301)) * n6 + k + (96 & 16517)];
                    double d4 = this.Field_28286[((i + (-24527 & 6659)) * n7 + j + (16568 & -32445)) * n6 + k + (16676 & 4112)];
                    double d5 = this.Field_28286[((i + (18561 & 8461)) * n7 + j + (19585 & -32767)) * n6 + k + (4104 & -30192)];
                    double d6 = (this.Field_28286[((i + (24724 & 4097)) * n7 + j + (-27600 & 8263)) * n6 + k + (11337 & 16515)] - d2) * d;
                    double d7 = (this.Field_28286[((i + (-11516 & 138)) * n7 + j + (513 & -11183)) * n6 + k + (16387 & -32251)] - d3) * d;
                    double d8 = (this.Field_28286[((i + (3089 & 71)) * n7 + j + (9477 & 16448)) * n6 + k + (143 & 1537)] - d4) * d;
                    double d9 = (this.Field_28286[((i + (4609 & 3075)) * n7 + j + (2339 & 16529)) * n6 + k + (929 & 17)] - d5) * d;
                    for (int i2 = 12293 & -29366; i2 < (666 & 4360); ++i2) {
                        double d10 = 0.14814814814814814 * 1.6875;
                        double d11 = d2;
                        double d12 = d3;
                        double d13 = (d4 - d2) * d10;
                        double d14 = (d5 - d3) * d10;
                        for (int i3 = 9282 & -32623; i3 < (6180 & 8350); ++i3) {
                            double d15 = 0.24731182795698925 * 1.0108695652173914;
                            double d16 = d11;
                            double d17 = (d12 - d11) * d15;
                            for (int i4 = 9370 & 6176; i4 < (4109 & 3462); ++i4) {
                                Class_3677 class_3677 = null;
                                if (k * (568 & 25739) + i2 < n4) {
                                    class_3677 = Class_9265.Field_9358.\u0000strictfp();
                                }
                                if (d16 > 0.0) {
                                    class_3677 = Class_9265.Field_9368.Method_3293();
                                }
                                int n8 = i3 + i * (11653 & -15836);
                                int n9 = i2 + k * (8381 & 1546);
                                int n10 = i4 + j * (1350 & 23196);
                                class_36425.Method_36430(n8, n9, n10, class_3677);
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

    public void Method_28311(int n, int n2, Class_36425 class_36425) {
        int n3 = this.Field_28284.Method_378() + (545 & -20131);
        double d = 0.125 * 0.25;
        this.Field_28287 = this.Field_28270.Method_43807(this.Field_28287, n * (569 & -12268), n2 * (1560 & 20), 32 & 27143, 337 & -21872, 986 & 16401, 31115 & 549, d, d, 1.0);
        this.Field_28285 = this.Field_28270.Method_43807(this.Field_28285, n * (150 & 28432), 3197 & 16749, n2 * (8208 & 6203), 149 & 4152, 5899 & 26625, 12310 & 88, d, 1.0, d);
        this.Field_28272 = this.Field_28275.Method_43807(this.Field_28272, n * (16691 & 16), n2 * (1049 & -30698), 6752 & -24564, 16 & 6289, 8371 & 2064, -24443 & 16937, d * (1.4489795918367347 * 1.380281690140845), d * (0.4782608695652174 * 4.181818181818182), d * (0.978723404255319 * 2.0434782608695654));
        for (int i = 5248 & -23738; i < (792 & 3317); ++i) {
            for (int j = -30704 & 0; j < (5968 & -32612); ++j) {
                int n4 = this.Field_28287[i + j * (336 & -7534)] + this.Field_28279.nextDouble() * (0.1377049180327869 * 1.4523809523809523) > 0.0 ? -24571 & 169 : 545 & -16052;
                int n5 = this.Field_28285[i + j * (1104 & 785)] + this.Field_28279.nextDouble() * (0.2920634920634921 * 0.6847826086956522) > 0.0 ? 3843 & 16581 : -16304 & 15234;
                int n6 = (int)(this.Field_28272[i + j * (724 & -32752)] / (3.0 * 1.0) + 0.5714285714285714 * 5.25 + this.Field_28279.nextDouble() * (0.4166666666666667 * 0.6));
                int n7 = -1 & -1;
                Class_3677 class_3677 = Class_9265.Field_9368.Method_3293();
                Class_3677 class_36772 = Class_9265.Field_9368.Method_3293();
                for (int k = 6271 & 127; k >= 0; --k) {
                    if (k < (511 & 13439) - this.Field_28279.nextInt(22023 & -22491) && k > this.Field_28279.nextInt(10245 & -28651)) {
                        Class_3436 class_3436 = class_36425.Method_36431(j, k, i);
                        if (class_3436.Method_3442() != null && class_3436.Method_3442().Method_3373() != Class_3713.Field_3718) {
                            if (class_3436.Method_3442() != Class_9265.Field_9368) continue;
                            if (n7 == (-1 & -1)) {
                                if (n6 <= 0) {
                                    class_3677 = null;
                                    class_36772 = Class_9265.Field_9368.Method_3293();
                                } else if (k >= n3 - (13407 & 4) && k <= n3 + (-27133 & 133)) {
                                    class_3677 = Class_9265.Field_9368.Method_3293();
                                    class_36772 = Class_9265.Field_9368.Method_3293();
                                    if (n5 != 0) {
                                        class_3677 = Class_9265.Field_9360.Method_3293();
                                        class_36772 = Class_9265.Field_9368.Method_3293();
                                    }
                                    if (n4 != 0) {
                                        class_3677 = Class_9265.Field_9363.Method_3293();
                                        class_36772 = Class_9265.Field_9363.Method_3293();
                                    }
                                }
                                if (k < n3 && (class_3677 == null || class_3677.Method_3442().Method_3373() == Class_3713.Field_3718)) {
                                    class_3677 = Class_9265.Field_9358.\u0000strictfp();
                                }
                                n7 = n6;
                                if (k >= n3 - (8197 & 23361)) {
                                    class_36425.Method_36430(j, k, i, class_3677);
                                    continue;
                                }
                                class_36425.Method_36430(j, k, i, class_36772);
                                continue;
                            }
                            if (n7 <= 0) continue;
                            --n7;
                            class_36425.Method_36430(j, k, i, class_36772);
                            continue;
                        }
                        n7 = -1 & -1;
                        continue;
                    }
                    class_36425.Method_36430(j, k, i, Class_9265.Field_9414.Method_3293());
                }
            }
        }
    }

    private void Method_28312() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4751 Method_28313(Class_283 class_283, String string, Class_4751 class_4751) {
        return null;
    }

    public boolean Method_28314() {
        return (8360 & -9983) != 0;
    }

    public void Method_28315(Class_17665 class_17665, int n, int n2) {
        this.Field_28277.\u0000strictfp((Class_12166)this, this.Field_28284, n, n2, (Class_36425)null);
    }
}

