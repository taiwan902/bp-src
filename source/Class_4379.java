/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_4379
extends Class_4286 {
    private static final Class_3436 Field_4380;
    private static final Class_3436 Field_4381;

    private void Method_4382(Class_283 class_283, Class_4751 class_4751) {
        this.\u0000strictfp(class_283, class_4751, Field_4381);
    }

    static {
        Field_4381 = Class_9265.Field_9447.Method_3293().Method_3685(Class_10020.Field_10021, (Comparable)((Object)Class_4231.Field_4243));
        Field_4380 = Class_9265.Field_9440.\u0000strictfp().Method_3685(Class_30767.Field_30768, (Comparable)((Object)Class_4231.Field_4243)).Method_3437(Class_4720.Field_4725, Boolean.valueOf((2276 & 16400) != 0));
    }

    private void Method_4383() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_4384(Class_283 class_283, Class_4751 class_4751) {
        Class_3713 class_3713 = class_283.Method_375(class_4751).Method_3442().Method_3373();
        if (class_3713 == Class_3713.Field_3718 || class_3713 == Class_3713.Field_3729) {
            this.\u0000strictfp(class_283, class_4751, Field_4380);
        }
    }

    public Class_4379(boolean bl) {
        super(bl);
    }

    public boolean Method_4385(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n = random.nextInt(-30461 & 4107) + random.nextInt(-6141 & 5651) + (71 & 1797);
        int n2 = 5739 & 16385;
        if (class_4751.\u0000, `() >= (-31487 & 24597) && class_4751.\u0000, `() + n + (31315 & 1065) <= (-28396 & 11147)) {
            int n3;
            int n4;
            for (int i = class_4751.\u0000, `(); i <= class_4751.\u0000, `() + (12545 & 2115) + n; ++i) {
                int n5 = -22111 & 16913;
                if (i == class_4751.\u0000, `()) {
                    n5 = 784 & -27580;
                }
                if (i >= class_4751.\u0000, `() + (-15859 & 2483) + n - (8194 & 4215)) {
                    n5 = 10530 & 530;
                }
                Class_4810 class_4810 = new Class_4810();
                for (n4 = class_4751.\u0000= final() - n5; n4 <= class_4751.\u0000= final() + n5 && n2 != 0; ++n4) {
                    for (n3 = class_4751.\u0000strictfp() - n5; n3 <= class_4751.\u0000strictfp() + n5 && n2 != 0; ++n3) {
                        if (i >= 0 && i < (8548 & 904)) {
                            if (this.\u0000strictfp(class_283.Method_375(class_4810.Method_4814(n4, i, n3)).Method_3442())) continue;
                            n2 = 8357 & 16464;
                            continue;
                        }
                        n2 = 8385 & 1556;
                    }
                }
            }
            if (n2 == 0) {
                return (-31952 & 4105) != 0;
            }
            Class_3238 class_3238 = class_283.Method_375(class_4751.Method_4782()).Method_3442();
            if ((class_3238 == Class_9265.Field_9319 || class_3238 == Class_9265.Field_9272) && class_4751.\u0000, `() < (272 & -29440) - n - (2577 & 20513)) {
                int n6;
                this.\u0000strictfp(class_283, class_4751.Method_4782());
                Class_4595 class_4595 = Class_4662.Field_4663.Method_4668(random);
                int n7 = n - random.nextInt(718 & 20516) - (-27611 & 9025);
                n4 = (171 & 18435) - random.nextInt(-15869 & 12391);
                n3 = class_4751.\u0000= final();
                int n8 = class_4751.\u0000strictfp();
                int n9 = 17 & -28672;
                for (int i = 16656 & -27574; i < n; ++i) {
                    Class_4751 class_47512;
                    Class_3713 class_3713;
                    n6 = class_4751.\u0000, `() + i;
                    if (i >= n7 && n4 > 0) {
                        n3 += class_4595.Method_4654();
                        n8 += class_4595.Method_4656();
                        --n4;
                    }
                    if ((class_3713 = class_283.Method_375(class_47512 = new Class_4751(n3, n6, n8)).Method_3442().Method_3373()) != Class_3713.Field_3718 && class_3713 != Class_3713.Field_3729) continue;
                    this.Method_4382(class_283, class_47512);
                    n9 = n6;
                }
                Class_4751 class_47513 = new Class_4751(n3, n9, n8);
                for (n6 = -1 & -3; n6 <= (8587 & -28669); ++n6) {
                    for (int i = -3 & -3; i <= (8883 & -26617); ++i) {
                        if (Math.abs(n6) == (-14293 & 67) && Math.abs(i) == (403 & -28593)) continue;
                        this.Method_4384(class_283, class_47513.Method_4791(n6, 21795 & 8832, i));
                    }
                }
                class_47513 = class_47513.Method_4769();
                for (n6 = -1 & -1; n6 <= (-16093 & 3605); ++n6) {
                    for (int i = -1 & -1; i <= (-32535 & 22789); ++i) {
                        this.Method_4384(class_283, class_47513.Method_4791(n6, 1296 & -13823, i));
                    }
                }
                this.Method_4384(class_283, class_47513.Method_4783(15154 & 1090));
                this.Method_4384(class_283, class_47513.Method_4781(18454 & 9738));
                this.Method_4384(class_283, class_47513.Method_4772(-3582 & 103));
                this.Method_4384(class_283, class_47513.Method_4788(-32066 & 67));
                n3 = class_4751.\u0000= final();
                n8 = class_4751.\u0000strictfp();
                Class_4595 class_45952 = Class_4662.Field_4663.Method_4668(random);
                if (class_45952 != class_4595) {
                    int n10;
                    int n11 = n7 - random.nextInt(4866 & 17587) - (21 & 20777);
                    int n12 = (5 & 17633) + random.nextInt(2051 & 263);
                    n9 = 16 & 17506;
                    for (int i = n11; i < n && n12 > 0; ++i, --n12) {
                        if (i < (5253 & 2089)) continue;
                        n10 = class_4751.\u0000, `() + i;
                        Class_4751 class_47514 = new Class_4751(n3 += class_45952.Method_4654(), n10, n8 += class_45952.Method_4656());
                        Class_3713 class_3713 = class_283.Method_375(class_47514).Method_3442().Method_3373();
                        if (class_3713 != Class_3713.Field_3718 && class_3713 != Class_3713.Field_3729) continue;
                        this.Method_4382(class_283, class_47514);
                        n9 = n10;
                    }
                    if (n9 > 0) {
                        Class_4751 class_47515 = new Class_4751(n3, n9, n8);
                        for (n10 = -2 & -2; n10 <= (24714 & -31737); ++n10) {
                            for (int i = -1 & -2; i <= (-30637 & 25602); ++i) {
                                if (Math.abs(n10) == (20522 & 9859) && Math.abs(i) == (16438 & -23285)) continue;
                                this.Method_4384(class_283, class_47515.Method_4791(n10, -30208 & 84, i));
                            }
                        }
                        class_47515 = class_47515.Method_4769();
                        for (n10 = -1 & -1; n10 <= (6225 & 8239); ++n10) {
                            for (int i = -1 & -1; i <= (81 & 16937); ++i) {
                                this.Method_4384(class_283, class_47515.Method_4791(n10, 18459 & 4384, i));
                            }
                        }
                    }
                }
                return (-32063 & 3073) != 0;
            }
            return (389 & 12834) != 0;
        }
        return (-15742 & 0) != 0;
    }
}

