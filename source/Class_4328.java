/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Random;

public class Class_4328
extends Class_4286 {
    private static final Class_3436 Field_4329 = Class_9265.Field_9383.Method_3293().Method_3685(Class_4544.Field_4545, (Comparable)((Object)Class_4231.Field_4238));
    private final int Field_4330;
    private final Class_3436 Field_4331;
    private final boolean Field_4332;
    private static final Class_3436 Field_4333 = Class_9265.Field_9421.\u0000strictfp().Method_3685(Class_4704.Field_4705, (Comparable)((Object)Class_4231.Field_4238)).Method_3437(Class_4720.Field_4725, Boolean.valueOf((9304 & -11898) != 0));
    private final Class_3436 Field_4334;

    private void Method_4335() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4328(boolean bl, int n, Class_3436 class_3436, Class_3436 class_34362, boolean bl2) {
        super(bl);
        this.Field_4330 = n;
        this.Field_4331 = class_3436;
        this.Field_4334 = class_34362;
        this.Field_4332 = bl2;
    }

    public Class_4328(boolean bl) {
        this(bl, 11788 & -32572, Field_4329, Field_4333, (16545 & 512) != 0);
    }

    public boolean Method_4336(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n = random.nextInt(-17661 & 16547) + this.Field_4330;
        int n2 = 19097 & 13313;
        if (class_4751.\u0000, `() >= (-32693 & 17) && class_4751.\u0000, `() + n + (321 & 5169) <= (259 & 10584)) {
            int n3;
            int n4;
            int n5;
            for (int i = class_4751.\u0000, `(); i <= class_4751.\u0000, `() + (1 & 9735) + n; ++i) {
                n3 = -32665 & 1537;
                if (i == class_4751.\u0000, `()) {
                    n3 = -32476 & 2752;
                }
                if (i >= class_4751.\u0000, `() + (-32467 & 2177) + n - (2 & 17426)) {
                    n3 = 12562 & -29534;
                }
                Class_4810 class_4810 = new Class_4810();
                for (n5 = class_4751.\u0000= final() - n3; n5 <= class_4751.\u0000= final() + n3 && n2 != 0; ++n5) {
                    for (n4 = class_4751.\u0000strictfp() - n3; n4 <= class_4751.\u0000strictfp() + n3 && n2 != 0; ++n4) {
                        if (i >= 0 && i < (-11973 & 2308)) {
                            if (this.\u0000strictfp(class_283.Method_375(class_4810.Method_4814(n5, i, n4)).Method_3442())) continue;
                            n2 = 520 & 16388;
                            continue;
                        }
                        n2 = -27984 & 10248;
                    }
                }
            }
            if (n2 == 0) {
                return (5661 & -24320) != 0;
            }
            Class_3238 class_3238 = class_283.Method_375(class_4751.Method_4782()).Method_3442();
            if ((class_3238 == Class_9265.Field_9319 || class_3238 == Class_9265.Field_9272 || class_3238 == Class_9265.Field_9356) && class_4751.\u0000, `() < (9072 & -29432) - n - (-13691 & 8291)) {
                int n6;
                int n7;
                Object object;
                Class_4751 class_47512;
                Object object2;
                int n8;
                this.\u0000strictfp(class_283, class_4751.Method_4782());
                n3 = -30509 & 1287;
                int n9 = -30204 & 449;
                for (n5 = class_4751.\u0000, `() - n3 + n; n5 <= class_4751.\u0000, `() + n; ++n5) {
                    n4 = n5 - (class_4751.\u0000, `() + n);
                    n8 = n9 + (-31871 & 15387) - n4 / (130 & 103);
                    for (int i = class_4751.\u0000= final() - n8; i <= class_4751.\u0000= final() + n8; ++i) {
                        n7 = i - class_4751.\u0000= final();
                        for (n6 = class_4751.\u0000strictfp() - n8; n6 <= class_4751.\u0000strictfp() + n8; ++n6) {
                            object = n6 - class_4751.\u0000strictfp();
                            if (Math.abs(n7) == n8 && Math.abs(object) == n8 && (random.nextInt(8839 & 26) == 0 || n4 == 0) || ((Class_3238)(object2 = class_283.Method_375(class_47512 = new Class_4751(i, n5, n6)).Method_3442())).Method_3373() != Class_3713.Field_3718 && ((Class_3238)object2).Method_3373() != Class_3713.Field_3729 && ((Class_3238)object2).Method_3373() != Class_3713.Field_3725) continue;
                            this.\u0000strictfp(class_283, class_47512, this.Field_4334);
                        }
                    }
                }
                for (n5 = 18084 & 2113; n5 < n; ++n5) {
                    Class_3238 class_32382 = class_283.Method_375(class_4751.Method_4766(n5)).Method_3442();
                    if (class_32382.Method_3373() != Class_3713.Field_3718 && class_32382.Method_3373() != Class_3713.Field_3729 && class_32382.Method_3373() != Class_3713.Field_3725) continue;
                    this.\u0000strictfp(class_283, class_4751.Method_4766(n5), this.Field_4331);
                    if (!this.Field_4332 || n5 <= 0) continue;
                    if (random.nextInt(3587 & -20341) > 0 && class_283.Method_507(class_4751.Method_4791(-1 & -1, n5, -31420 & 25))) {
                        this.Method_4338(class_283, class_4751.Method_4791(-1 & -1, n5, 6162 & 576), Class_11563.Field_11564);
                    }
                    if (random.nextInt(24719 & -26365) > 0 && class_283.Method_507(class_4751.Method_4791(-32171 & 2083, n5, -24568 & 258))) {
                        this.Method_4338(class_283, class_4751.Method_4791(-16061 & 2053, n5, 30 & 12961), Class_11563.Field_11566);
                    }
                    if (random.nextInt(9563 & -16377) > 0 && class_283.Method_507(class_4751.Method_4791(16384 & 20, n5, -1 & -1))) {
                        this.Method_4338(class_283, class_4751.Method_4791(-28571 & 2184, n5, -1 & -1), Class_11563.Field_11568);
                    }
                    if (random.nextInt(6275 & 8195) <= 0 || !class_283.Method_507(class_4751.Method_4791(129 & 1336, n5, 20489 & 1457))) continue;
                    this.Method_4338(class_283, class_4751.Method_4791(-32255 & 5144, n5, -12215 & 513), Class_11563.Field_11569);
                }
                if (this.Field_4332) {
                    for (n5 = class_4751.\u0000, `() - (-30621 & 25607) + n; n5 <= class_4751.\u0000, `() + n; ++n5) {
                        int n10 = n5 - (class_4751.\u0000, `() + n);
                        n8 = (2566 & 24658) - n10 / (4162 & 790);
                        Class_4810 class_4810 = new Class_4810();
                        for (n7 = class_4751.\u0000= final() - n8; n7 <= class_4751.\u0000= final() + n8; ++n7) {
                            for (n6 = class_4751.\u0000strictfp() - n8; n6 <= class_4751.\u0000strictfp() + n8; ++n6) {
                                class_4810.Method_4814(n7, n5, n6);
                                if (class_283.Method_375(class_4810).Method_3442().Method_3373() != Class_3713.Field_3729) continue;
                                object = class_4810.\u0000
                                ();
                                class_47512 = class_4810.\u0000= final();
                                object2 = class_4810.\u0000, for();
                                Class_4751 class_47513 = class_4810.\u0000, `();
                                if (random.nextInt(-28508 & 78) == 0 && class_283.Method_375((Class_4751)object).Method_3442().Method_3373() == Class_3713.Field_3718) {
                                    this.Method_4339(class_283, (Class_4751)object, Class_11563.Field_11564);
                                }
                                if (random.nextInt(-32635 & 13334) == 0 && class_283.Method_375(class_47512).Method_3442().Method_3373() == Class_3713.Field_3718) {
                                    this.Method_4339(class_283, class_47512, Class_11563.Field_11566);
                                }
                                if (random.nextInt(38 & 11340) == 0 && class_283.Method_375((Class_4751)object2).Method_3442().Method_3373() == Class_3713.Field_3718) {
                                    this.Method_4339(class_283, (Class_4751)object2, Class_11563.Field_11568);
                                }
                                if (random.nextInt(17421 & 13140) != 0 || class_283.Method_375(class_47513).Method_3442().Method_3373() != Class_3713.Field_3718) continue;
                                this.Method_4339(class_283, class_47513, Class_11563.Field_11569);
                            }
                        }
                    }
                    if (random.nextInt(4173 & 17413) == 0 && n > (-32755 & 25733)) {
                        for (n5 = 20486 & -23903; n5 < (16451 & 5634); ++n5) {
                            Iterator iterator = Class_4662.Field_4663.Method_4672();
                            while (iterator.hasNext()) {
                                Object e = iterator.next();
                                Class_4595 class_4595 = (Class_4595)e;
                                if (random.nextInt((10244 & 16655) - n5) != 0) continue;
                                Class_4595 class_45952 = class_4595.Method_4660();
                                this.Method_4337(class_283, random.nextInt(31 & -18045), class_4751.Method_4791(class_45952.Method_4654(), n - (1221 & -18409) + n5, class_45952.Method_4656()), class_4595);
                            }
                        }
                    }
                }
                return (5649 & 18693) != 0;
            }
            return (9076 & -16246) != 0;
        }
        return (-27518 & 8192) != 0;
    }

    private void Method_4337(Class_283 class_283, int n, Class_4751 class_4751, Class_4595 class_4595) {
        this.\u0000strictfp(class_283, class_4751, Class_9265.Field_9364.Method_3293().Method_3685(Class_30815.Field_30816, Integer.valueOf(n)).Method_3437(Class_30815.\u0000strictfp, (Comparable)((Object)class_4595)));
    }

    private void Method_4338(Class_283 class_283, Class_4751 class_4751, Class_4173 class_4173) {
        this.\u0000strictfp(class_283, class_4751, Class_9265.Field_9323.Method_3293().Method_3685(class_4173, Boolean.valueOf((8217 & 3715) != 0)));
    }

    private void Method_4339(Class_283 class_283, Class_4751 class_4751, Class_4173 class_4173) {
        this.Method_4338(class_283, class_4751, class_4173);
        class_4751 = class_4751.Method_4782();
        for (int i = 16453 & 13870; class_283.Method_375(class_4751).Method_3442().Method_3373() == Class_3713.Field_3718 && i > 0; --i) {
            this.Method_4338(class_283, class_4751, class_4173);
            class_4751 = class_4751.Method_4782();
        }
    }
}

