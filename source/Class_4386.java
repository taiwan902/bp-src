/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_4386
extends Class_4286 {
    private static final Class_3436 Field_4387;
    private static final Class_3436 Field_4388;

    public boolean Method_4389(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n = random.nextInt(8451 & -30629) + random.nextInt(-32750 & 9890) + (2638 & -32618);
        int n2 = class_4751.\u0000= final();
        int n3 = class_4751.\u0000, `();
        int n4 = class_4751.\u0000strictfp();
        if (n3 >= (4355 & -30555) && n3 + n + (14401 & 129) < (1315 & 26904)) {
            int n5;
            int n6;
            Class_4751 class_47512 = class_4751.Method_4782();
            Class_3238 class_3238 = class_283.Method_375(class_47512).Method_3442();
            if (class_3238 != Class_9265.Field_9319 && class_3238 != Class_9265.Field_9272) {
                return (69 & -14830) != 0;
            }
            if (!this.Method_4390(class_283, class_4751, n)) {
                return (6208 & -15575) != 0;
            }
            this.\u0000strictfp(class_283, class_47512);
            this.\u0000strictfp(class_283, class_47512.Method_4770());
            this.\u0000strictfp(class_283, class_47512.Method_4784());
            this.\u0000strictfp(class_283, class_47512.Method_4784().Method_4770());
            Class_4595 class_4595 = Class_4662.Field_4663.Method_4668(random);
            int n7 = n - random.nextInt(-24153 & 16916);
            int n8 = (10250 & -32698) - random.nextInt(1347 & -8181);
            int n9 = n2;
            int n10 = n4;
            int n11 = n3 + n - (-25579 & 8193);
            for (n5 = -30553 & 17408; n5 < n; ++n5) {
                Class_4751 class_47513;
                Class_3713 class_3713;
                if (n5 >= n7 && n8 > 0) {
                    n9 += class_4595.Method_4654();
                    n10 += class_4595.Method_4656();
                    --n8;
                }
                if ((class_3713 = class_283.Method_375(class_47513 = new Class_4751(n9, n6 = n3 + n5, n10)).Method_3442().Method_3373()) != Class_3713.Field_3718 && class_3713 != Class_3713.Field_3729) continue;
                this.Method_4393(class_283, class_47513);
                this.Method_4393(class_283, class_47513.Method_4770());
                this.Method_4393(class_283, class_47513.Method_4784());
                this.Method_4393(class_283, class_47513.Method_4770().Method_4784());
            }
            for (n5 = -2 & -1; n5 <= 0; ++n5) {
                for (n6 = -2 & -2; n6 <= 0; ++n6) {
                    int n12 = -1 & -1;
                    this.Method_4392(class_283, n9 + n5, n11 + n12, n10 + n6);
                    this.Method_4392(class_283, (21025 & 3) + n9 - n5, n11 + n12, n10 + n6);
                    this.Method_4392(class_283, n9 + n5, n11 + n12, (-31205 & 8673) + n10 - n6);
                    this.Method_4392(class_283, (-32383 & 17939) + n9 - n5, n11 + n12, (-32381 & 30725) + n10 - n6);
                    if (n5 <= (-2 & -1) && n6 <= (-1 & -1) || n5 == (-1 & -1) && n6 == (-1 & -2)) continue;
                    n12 = -15231 & 375;
                    this.Method_4392(class_283, n9 + n5, n11 + n12, n10 + n6);
                    this.Method_4392(class_283, (-11755 & 2145) + n9 - n5, n11 + n12, n10 + n6);
                    this.Method_4392(class_283, n9 + n5, n11 + n12, (28673 & -31863) + n10 - n6);
                    this.Method_4392(class_283, (17189 & 14401) + n9 - n5, n11 + n12, (9299 & -30687) + n10 - n6);
                }
            }
            if (random.nextBoolean()) {
                this.Method_4392(class_283, n9, n11 + (530 & -20058), n10);
                this.Method_4392(class_283, n9 + (2451 & 1029), n11 + (775 & 1186), n10);
                this.Method_4392(class_283, n9 + (21779 & 545), n11 + (8226 & 326), n10 + (16405 & -28223));
                this.Method_4392(class_283, n9, n11 + (9034 & -10106), n10 + (393 & 12323));
            }
            for (n5 = -1 & -3; n5 <= (1084 & 12292); ++n5) {
                for (n6 = -3 & -3; n6 <= (5228 & 2180); ++n6) {
                    if (n5 == (-1 & -3) && n6 == (-1 & -3) || n5 == (-3 & -1) && n6 == (16582 & -29916) || n5 == (78 & -28380) && n6 == (-3 & -3) || n5 == (-6052 & 1924) && n6 == (-32083 & 1030) || Math.abs(n5) >= (13335 & -15573) && Math.abs(n6) >= (-31477 & 20679)) continue;
                    this.Method_4392(class_283, n9 + n5, n11, n10 + n6);
                }
            }
            for (n5 = -1 & -1; n5 <= (-14334 & 8195); ++n5) {
                for (n6 = -1 & -1; n6 <= (1026 & 4995); ++n6) {
                    int n13;
                    int n14;
                    if (n5 >= 0 && n5 <= (-32703 & 49) && n6 >= 0 && n6 <= (18117 & -22271) || random.nextInt(131 & 17171) > 0) continue;
                    int n15 = random.nextInt(9099 & -32685) + (274 & -32734);
                    for (n14 = 18178 & -30720; n14 < n15; ++n14) {
                        this.Method_4393(class_283, new Class_4751(n2 + n5, n11 - n14 - (-31231 & 18475), n4 + n6));
                    }
                    for (n14 = -1 & -1; n14 <= (65 & 6157); ++n14) {
                        for (n13 = -1 & -1; n13 <= (-19959 & 18497); ++n13) {
                            this.Method_4392(class_283, n9 + n5 + n14, n11, n10 + n6 + n13);
                        }
                    }
                    for (n14 = -2 & -2; n14 <= (18 & 5155); ++n14) {
                        for (n13 = -2 & -1; n13 <= (3586 & -32734); ++n13) {
                            if (Math.abs(n14) == (-14330 & 9282) && Math.abs(n13) == (726 & 8450)) continue;
                            this.Method_4392(class_283, n9 + n5 + n14, n11 - (-26617 & 25265), n10 + n6 + n13);
                        }
                    }
                }
            }
            return (-31855 & 6179) != 0;
        }
        return (5824 & -22493) != 0;
    }

    public Class_4386(boolean bl) {
        super(bl);
    }

    private boolean Method_4390(Class_283 class_283, Class_4751 class_4751, int n) {
        int n2 = class_4751.\u0000= final();
        int n3 = class_4751.\u0000, `();
        int n4 = class_4751.\u0000strictfp();
        Class_4810 class_4810 = new Class_4810();
        for (int i = 5504 & 91; i <= n + (-9965 & 8193); ++i) {
            int n5 = 2067 & 16717;
            if (i == 0) {
                n5 = 136 & -27566;
            }
            if (i >= n - (3139 & -12115)) {
                n5 = -7358 & 1035;
            }
            for (int j = -n5; j <= n5; ++j) {
                for (int k = -n5; k <= n5; ++k) {
                    if (this.\u0000strictfp(class_283.Method_375(class_4810.Method_4814(n2 + j, n3 + i, n4 + k)).Method_3442())) continue;
                    return (134 & -6399) != 0;
                }
            }
        }
        return (4357 & -14767) != 0;
    }

    private void Method_4391() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_4388 = Class_9265.Field_9447.Method_3293().Method_3685(Class_10020.Field_10021, (Comparable)((Object)Class_4231.Field_4233));
        Field_4387 = Class_9265.Field_9440.\u0000strictfp().Method_3685(Class_30767.Field_30768, (Comparable)((Object)Class_4231.Field_4233)).Method_3437(Class_4720.Field_4725, Boolean.valueOf((810 & 7317) != 0));
    }

    private void Method_4392(Class_283 class_283, int n, int n2, int n3) {
        Class_4751 class_4751 = new Class_4751(n, n2, n3);
        Class_3238 class_3238 = class_283.Method_375(class_4751).Method_3442();
        if (class_3238.Method_3373() == Class_3713.Field_3718) {
            this.\u0000strictfp(class_283, class_4751, Field_4387);
        }
    }

    private void Method_4393(Class_283 class_283, Class_4751 class_4751) {
        if (this.\u0000strictfp(class_283.Method_375(class_4751).Method_3442())) {
            this.\u0000strictfp(class_283, class_4751, Field_4388);
        }
    }
}

