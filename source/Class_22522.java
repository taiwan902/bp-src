/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_22522
extends Class_4286 {
    private static final Class_3436 Field_22523 = Class_9265.Field_9383.Method_3293().Method_3685(Class_4544.Field_4545, (Comparable)((Object)Class_4231.Field_4238));
    private static final Class_3436 Field_22524 = Class_9265.Field_9421.\u0000strictfp().Method_3685(Class_4704.Field_4705, (Comparable)((Object)Class_4231.Field_4238)).Method_3437(Class_4704.\u0000strictfp, Boolean.valueOf((4305 & 16384) != 0));

    public boolean Method_22525(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n = random.nextInt(2084 & -19820) + (1829 & 14341);
        while (class_283.Method_375(class_4751.Method_4782()).Method_3442().Method_3373() == Class_3713.Field_3734) {
            class_4751 = class_4751.Method_4782();
        }
        int n2 = 309 & -14269;
        if (class_4751.\u0000, `() >= (5281 & 24641) && class_4751.\u0000, `() + n + (7211 & -32623) <= (12630 & 16768)) {
            Object object;
            int n3;
            int n4;
            Class_3238 class_3238;
            int n5;
            for (int i = class_4751.\u0000, `(); i <= class_4751.\u0000, `() + (23299 & -32691) + n; ++i) {
                n4 = 24781 & -31999;
                if (i == class_4751.\u0000, `()) {
                    n4 = -6142 & 5652;
                }
                if (i >= class_4751.\u0000, `() + (6149 & 25089) + n - (5282 & -16377)) {
                    n4 = 10267 & 16451;
                }
                object = new Class_4810();
                for (n5 = class_4751.\u0000= final() - n4; n5 <= class_4751.\u0000= final() + n4 && n2 != 0; ++n5) {
                    for (n3 = class_4751.\u0000strictfp() - n4; n3 <= class_4751.\u0000strictfp() + n4 && n2 != 0; ++n3) {
                        if (i >= 0 && i < (-32498 & 16705)) {
                            class_3238 = class_283.Method_375(((Class_4810)object).Method_4814(n5, i, n3)).Method_3442();
                            if (class_3238.Method_3373() == Class_3713.Field_3718 || class_3238.Method_3373() == Class_3713.Field_3729) continue;
                            if (class_3238 != Class_9265.Field_9286 && class_3238 != Class_9265.Field_9281) {
                                n2 = -25340 & 16386;
                                continue;
                            }
                            if (i <= class_4751.\u0000, `()) continue;
                            n2 = 649 & 304;
                            continue;
                        }
                        n2 = 9233 & 2818;
                    }
                }
            }
            if (n2 == 0) {
                return (-31134 & 6160) != 0;
            }
            Class_3238 class_32382 = class_283.Method_375(class_4751.Method_4782()).Method_3442();
            if ((class_32382 == Class_9265.Field_9319 || class_32382 == Class_9265.Field_9272) && class_4751.\u0000, `() < (19204 & 4352) - n - (18497 & 5797)) {
                Object object2;
                int n6;
                Class_4751 class_47512;
                this.\u0000strictfp(class_283, class_4751.Method_4782());
                for (n4 = class_4751.\u0000, `() - (83 & -30429) + n; n4 <= class_4751.\u0000, `() + n; ++n4) {
                    int n7 = n4 - (class_4751.\u0000, `() + n);
                    n5 = (3206 & 13114) - n7 / (8402 & -29426);
                    for (n3 = class_4751.\u0000= final() - n5; n3 <= class_4751.\u0000= final() + n5; ++n3) {
                        class_3238 = (Class_3238)(n3 - class_4751.\u0000= final());
                        for (n6 = class_4751.\u0000strictfp() - n5; n6 <= class_4751.\u0000strictfp() + n5; ++n6) {
                            object2 = n6 - class_4751.\u0000strictfp();
                            if (Math.abs((int)class_3238) == n5 && Math.abs(object2) == n5 && (random.nextInt(4099 & 8710) == 0 || n7 == 0) || class_283.Method_375(class_47512 = new Class_4751(n3, n4, n6)).Method_3442().Method_3381()) continue;
                            this.\u0000strictfp(class_283, class_47512, Field_22524);
                        }
                    }
                }
                for (n4 = -32633 & 7168; n4 < n; ++n4) {
                    object = class_283.Method_375(class_4751.Method_4766(n4)).Method_3442();
                    if (((Class_3238)object).Method_3373() != Class_3713.Field_3718 && ((Class_3238)object).Method_3373() != Class_3713.Field_3729 && object != Class_9265.Field_9281 && object != Class_9265.Field_9286) continue;
                    this.\u0000strictfp(class_283, class_4751.Method_4766(n4), Field_22523);
                }
                for (n4 = class_4751.\u0000, `() - (6211 & 16523) + n; n4 <= class_4751.\u0000, `() + n; ++n4) {
                    int n8 = n4 - (class_4751.\u0000, `() + n);
                    n5 = (9666 & -32718) - n8 / (6147 & -31666);
                    Class_4810 class_4810 = new Class_4810();
                    for (class_3238 = (Class_3238)(class_4751.\u0000= final() - n5); class_3238 <= class_4751.\u0000= final() + n5; ++class_3238) {
                        for (n6 = class_4751.\u0000strictfp() - n5; n6 <= class_4751.\u0000strictfp() + n5; ++n6) {
                            class_4810.Method_4814((int)class_3238, n4, n6);
                            if (class_283.Method_375(class_4810).Method_3442().Method_3373() != Class_3713.Field_3729) continue;
                            object2 = class_4810.\u0000
                            ();
                            class_47512 = class_4810.\u0000= final();
                            Class_4751 class_47513 = class_4810.\u0000, for();
                            Class_4751 class_47514 = class_4810.\u0000, `();
                            if (random.nextInt(356 & -24572) == 0 && class_283.Method_375((Class_4751)object2).Method_3442().Method_3373() == Class_3713.Field_3718) {
                                this.Method_22527(class_283, (Class_4751)object2, Class_11563.Field_11564);
                            }
                            if (random.nextInt(18438 & 453) == 0 && class_283.Method_375(class_47512).Method_3442().Method_3373() == Class_3713.Field_3718) {
                                this.Method_22527(class_283, class_47512, Class_11563.Field_11566);
                            }
                            if (random.nextInt(12356 & 16644) == 0 && class_283.Method_375(class_47513).Method_3442().Method_3373() == Class_3713.Field_3718) {
                                this.Method_22527(class_283, class_47513, Class_11563.Field_11568);
                            }
                            if (random.nextInt(8805 & -8956) != 0 || class_283.Method_375(class_47514).Method_3442().Method_3373() != Class_3713.Field_3718) continue;
                            this.Method_22527(class_283, class_47514, Class_11563.Field_11569);
                        }
                    }
                }
                return (10561 & 3) != 0;
            }
            return (19104 & 9536) != 0;
        }
        return (-32752 & 15238) != 0;
    }

    public Class_22522() {
        super((1216 & -32747) != 0);
    }

    private void Method_22526() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_22527(Class_283 class_283, Class_4751 class_4751, Class_4173 class_4173) {
        Class_3436 class_3436 = Class_9265.Field_9323.Method_3293().Method_3685(class_4173, Boolean.valueOf((-31079 & 10245) != 0));
        this.\u0000strictfp(class_283, class_4751, class_3436);
        class_4751 = class_4751.Method_4782();
        for (int i = 4100 & -13763; class_283.Method_375(class_4751).Method_3442().Method_3373() == Class_3713.Field_3718 && i > 0; --i) {
            this.\u0000strictfp(class_283, class_4751, class_3436);
            class_4751 = class_4751.Method_4782();
        }
    }
}

