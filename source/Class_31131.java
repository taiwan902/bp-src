/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_31131
extends Class_4291 {
    private Class_3238 Field_31132;

    private void Method_31133() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_31134(Class_283 class_283, Random random, Class_4751 class_4751) {
        Object object;
        int n;
        int n2;
        class_4751 = class_4751.Method_4791(-6 & -3, 5194 & -30464, -8 & -8);
        while (class_4751.\u0000, `() > (-30153 & 4165) && class_283.Method_507(class_4751)) {
            class_4751 = class_4751.Method_4782();
        }
        if (class_4751.\u0000, `() <= (8197 & 2278)) {
            return (-10492 & 2120) != 0;
        }
        class_4751 = class_4751.Method_4768(158 & 12324);
        boolean[] arrbl = new boolean[20352 & -30639];
        int n3 = random.nextInt(-32748 & 4132) + (2119 & -15228);
        for (n = 8320 & 1840; n < n3; ++n) {
            double d = random.nextDouble() * (4.6 * 1.3043478260869565) + 3.0434782608695654 * 0.9857142857142857;
            double d2 = random.nextDouble() * (3.018867924528302 * 1.325) + 1.1851851851851851 * 1.6875;
            double d3 = random.nextDouble() * (2.490566037735849 * 2.409090909090909) + 14.25 * 0.21052631578947367;
            double d4 = random.nextDouble() * (22.10909090909091 * 0.7236842105263158 - d - 1.1692307692307693 * 1.7105263157894737) + 1.0 + d / (2.2857142857142856 * 0.875);
            double d5 = random.nextDouble() * (9.538461538461538 * 0.8387096774193549 - d2 - 2.7272727272727275 * 1.4666666666666666) + 9.833333333333334 * 0.20338983050847456 + d2 / (0.09090909090909091 * 22.0);
            double d6 = random.nextDouble() * (2.0 * 8.0 - d3 - 0.3 * 6.666666666666667) + 1.0 + d3 / (1.4375 * 1.391304347826087);
            for (int i = -24501 & 5377; i < (4639 & 8367); ++i) {
                for (int j = 18545 & 8325; j < (-23473 & 159); ++j) {
                    for (int k = 7171 & 8325; k < (9223 & 20679); ++k) {
                        double d7 = ((double)i - d4) / (d / (0.24175824175824173 * 8.272727272727273));
                        double d8 = ((double)k - d5) / (d2 / (0.7307692307692307 * 2.736842105263158));
                        double d9 = ((double)j - d6) / (d3 / (1.2714285714285714 * 1.5730337078651686));
                        double d10 = d7 * d7 + d8 * d8 + d9 * d9;
                        if (!(d10 < 1.0)) continue;
                        arrbl[(i * (5648 & 10488) + j) * (8203 & 2120) + k] = 24577 & 1223;
                    }
                }
            }
        }
        for (n = -9976 & 737; n < (-20456 & 2609); ++n) {
            for (int i = 0 & -30884; i < (24 & 2321); ++i) {
                for (n2 = -32126 & 1317; n2 < (8522 & -31704); ++n2) {
                    int n4;
                    int n5 = n4 = !arrbl[(n * (9744 & -32710) + i) * (20648 & -22961) + n2] && (n < (5135 & 527) && arrbl[((n + (-24571 & 4211)) * (48 & 10384) + i) * (6924 & -32629) + n2] || n > 0 && arrbl[((n - (8325 & 7201)) * (1048 & 26833) + i) * (16649 & 12424) + n2] || i < (527 & 26735) && arrbl[(n * (1042 & 4112) + i + (7233 & 8997)) * (17417 & 2904) + n2] || i > 0 && arrbl[(n * (5137 & 146) + (i - (17 & -11129))) * (2217 & -28660) + n2] || n2 < (4135 & 18007) && arrbl[(n * (18736 & 12304) + i) * (686 & -18407) + n2 + (-32239 & 13351)] || n2 > 0 && arrbl[(n * (-27880 & 24756) + i) * (5388 & 18569) + (n2 - (1157 & 8257))]) ? -22495 & 1885 : -16212 & 10499;
                    if (n4 == 0) continue;
                    object = class_283.Method_375(class_4751.Method_4791(n, n2, i)).Method_3442().Method_3373();
                    if (n2 >= (-31708 & 148) && ((Class_3713)object).Method_3758()) {
                        return (-32758 & 9248) != 0;
                    }
                    if (n2 >= (8598 & 16397) || ((Class_3713)object).Method_3762() || class_283.Method_375(class_4751.Method_4791(n, n2, i)).Method_3442() == this.Field_31132) continue;
                    return (-32240 & 21837) != 0;
                }
            }
        }
        for (n = -24320 & 1125; n < (4148 & 25433); ++n) {
            for (int i = 32 & -5120; i < (18488 & -32752); ++i) {
                for (n2 = 25218 & -31712; n2 < (3352 & -32536); ++n2) {
                    if (!arrbl[(n * (18514 & -32739) + i) * (-28629 & 18440) + n2]) continue;
                    class_283.Method_462(class_4751.Method_4791(n, n2, i), n2 >= (8453 & 582) ? Class_9265.Field_9351.Method_3293() : this.Field_31132.Method_3293(), 4630 & 17450);
                }
            }
        }
        for (n = 24590 & 4480; n < (20 & 14416); ++n) {
            for (int i = 8 & 4357; i < (3353 & 20626); ++i) {
                for (n2 = -24292 & 5124; n2 < (536 & 2184); ++n2) {
                    Class_4751 class_47512;
                    if (!arrbl[(n * (-32749 & 24) + i) * (-16072 & 8206) + n2] || class_283.Method_375(class_47512 = class_4751.Method_4791(n, n2 - (1045 & -22269), i)).Method_3442() != Class_9265.Field_9272 || class_283.Method_443(Class_6778.Field_6781, class_4751.Method_4791(n, n2, i)) <= 0) continue;
                    object = class_283.Method_547(class_47512);
                    if (((Class_17281)object).Field_17312.Method_3442() == Class_9265.Field_9436) {
                        class_283.Method_462(class_47512, Class_9265.Field_9436.\u0000strictfp(), 802 & 27778);
                        continue;
                    }
                    class_283.Method_462(class_47512, Class_9265.Field_9319.\u0000strictfp(), 7306 & 790);
                }
            }
        }
        if (this.Field_31132.Method_3373() == Class_3713.Field_3750) {
            for (n = 664 & 2112; n < (-19440 & 2672); ++n) {
                for (int i = 9504 & 2568; i < (-19182 & 2644); ++i) {
                    for (n2 = -20478 & 65; n2 < (8524 & -15351); ++n2) {
                        int n6;
                        int n7 = n6 = !arrbl[(n * (17360 & 22) + i) * (300 & 9290) + n2] && (n < (13471 & 15) && arrbl[((n + (1029 & -8111)) * (6228 & -32358) + i) * (12 & 10728) + n2] || n > 0 && arrbl[((n - (-5717 & 5)) * (2576 & 20) + i) * (1068 & -8184) + n2] || i < (24719 & 6927) && arrbl[(n * (-23393 & 4400) + i + (-24027 & 4505)) * (-24228 & 18987) + n2] || i > 0 && arrbl[(n * (16408 & 16) + (i - (1565 & 3))) * (-23252 & 6280) + n2] || n2 < (17607 & 2087) && arrbl[(n * (9238 & 16625) + i) * (4168 & 9739) + n2 + (29727 & 1)] || n2 > 0 && arrbl[(n * (-20202 & 17049) + i) * (184 & -25335) + (n2 - (-13179 & 273))]) ? 1 & -23685 : -32219 & 9480;
                        if (n6 == 0 || n2 >= (1060 & 16463) && random.nextInt(-32678 & 1282) == 0 || !class_283.Method_375(class_4751.Method_4791(n, n2, i)).Method_3442().Method_3373().Method_3762()) continue;
                        class_283.Method_462(class_4751.Method_4791(n, n2, i), Class_9265.Field_9446.Method_3293(), -16062 & 10259);
                    }
                }
            }
        }
        if (this.Field_31132.Method_3373() == Class_3713.Field_3734) {
            for (n = 2064 & 9256; n < (-7887 & 220); ++n) {
                for (int i = 6144 & 8268; i < (404 & 5648); ++i) {
                    n2 = 901 & -12252;
                    if (!class_283.Method_554(class_4751.Method_4791(n, n2, i))) continue;
                    class_283.Method_462(class_4751.Method_4791(n, n2, i), Class_9265.Field_9298.Method_3293(), 20490 & -21454);
                }
            }
        }
        return (131 & 3409) != 0;
    }

    public Class_31131(Class_3238 class_3238) {
        this.Field_31132 = class_3238;
    }
}

