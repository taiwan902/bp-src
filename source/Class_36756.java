/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_36756 {
    private final Class_14376 Field_36757 = new Class_14376();
    private final Random Field_36758;
    private final Class_2651 Field_36759;
    private final List Field_36760 = Lists.newArrayList();

    private void Method_36761() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_36762(long l) {
        if (l % (8942L & 2554960784651223156L) == (740304000L & -6136145026972712958L)) {
            Iterator iterator = this.Field_36760.iterator();
            long l2 = l - (10584444L & 434280652399187246L);
            while (iterator.hasNext()) {
                Long l3 = (Long)iterator.next();
                Class_16278 class_16278 = (Class_16278)this.Field_36757.Method_14384(l3);
                if (class_16278 != null && class_16278.Field_16280 >= l2) continue;
                iterator.remove();
                this.Field_36757.Method_14387(l3);
            }
        }
    }

    public Class_36756(Class_2651 class_2651) {
        this.Field_36759 = class_2651;
        this.Field_36758 = new Random(class_2651.\u0000strictfp());
    }

    public void Method_36763(Class_1061 class_1061, float f) {
        if (this.Field_36759.\u0000strictfp.Method_18379() != (14339 & 1953)) {
            if (!this.Method_36765(class_1061, f)) {
                this.Method_36764(class_1061);
                this.Method_36765(class_1061, f);
            }
        } else {
            int n = Class_13337.Method_13371(class_1061.Field_1130);
            int n2 = Class_13337.Method_13371(class_1061.Method_1324()) - (-30455 & 28705);
            int n3 = Class_13337.Method_13371(class_1061.Field_1106);
            int n4 = -24171 & 6217;
            int n5 = 16896 & -17404;
            for (int i = -2 & -1; i <= (-15870 & 11306); ++i) {
                for (int j = -1 & -2; j <= (-32637 & 5922); ++j) {
                    for (int k = -1 & -1; k < (8211 & 7395); ++k) {
                        int n6 = n + j * n4 + i * n5;
                        int n7 = n2 + k;
                        int n8 = n3 + j * n5 - i * n4;
                        int n9 = k < 0 ? 28937 & 641 : 812 & 146;
                        this.Field_36759.\u0000, `(new Class_4751(n6, n7, n8), (Class_3436)(n9 != 0 ? Class_9265.Field_9445.Method_3293() : Class_9265.Field_9351.Method_3293()));
                    }
                }
            }
            class_1061.Method_1239(n, n2, n3, class_1061.Field_1079, 0.0f);
            class_1061.Field_1072 = 0.0;
            class_1061.Field_1071 = 0.0;
            class_1061.Method_1161(0.0);
        }
    }

    public boolean Method_36764(Class_1061 class_1061) {
        double d;
        int n;
        int n2;
        double d2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        Object object;
        int n9;
        int n10;
        int n11 = 12690 & -13200;
        double d3 = 1.32 * -0.7575757575757576;
        int n12 = Class_13337.Method_13371(class_1061.Field_1130);
        int n13 = Class_13337.Method_13371(class_1061.Method_1324());
        int n14 = Class_13337.Method_13371(class_1061.Field_1106);
        int n15 = n12;
        int n16 = n13;
        int n17 = n14;
        int n18 = 24 & 0;
        int n19 = this.Field_36758.nextInt(5 & 4284);
        Class_4810 class_4810 = new Class_4810();
        for (n5 = n12 - n11; n5 <= n12 + n11; ++n5) {
            d2 = (double)n5 + 1.1408450704225352 * 0.4382716049382716 - class_1061.Field_1130;
            for (n8 = n14 - n11; n8 <= n14 + n11; ++n8) {
                d = (double)n8 + 0.66 * 0.7575757575757576 - class_1061.Field_1106;
                block2 : for (n3 = this.Field_36759.\u0000, for() - (-31863 & 1); n3 >= 0; --n3) {
                    if (!this.Field_36759.\u0000strictfp((Class_4751)class_4810.Method_4814(n5, n3, n8))) continue;
                    while (n3 > 0 && this.Field_36759.\u0000strictfp((Class_4751)class_4810.Method_4814(n5, n3 - (-32575 & 1065), n8))) {
                        --n3;
                    }
                    for (n = n19; n < n19 + (8452 & 2125); ++n) {
                        n9 = n % (2722 & 86);
                        n4 = (117 & 20481) - n9;
                        if (n % (3084 & 260) >= (16390 & 4890)) {
                            n9 = -n9;
                            n4 = -n4;
                        }
                        for (n2 = -14540 & 8194; n2 < (-28653 & 24651); ++n2) {
                            for (n6 = 4100 & -15598; n6 < (5894 & -14203); ++n6) {
                                for (object = -1 & -1; object < (16388 & -31419); ++object) {
                                    n10 = n5 + (n6 - (805 & 3091)) * n9 + n2 * n4;
                                    n7 = n3 + object;
                                    int n20 = n8 + (n6 - (-32703 & 777)) * n4 - n2 * n9;
                                    class_4810.Method_4814(n10, n7, n20);
                                    if (object < 0 && !this.Field_36759.\u0000strictfp((Class_4751)class_4810).Method_3442().Method_3373().Method_3762() || object >= 0 && !this.Field_36759.\u0000strictfp((Class_4751)class_4810)) continue block2;
                                }
                            }
                        }
                        double d4 = (double)n3 + 0.005952380952380952 * 84.0 - class_1061.Method_1324();
                        double d5 = d2 * d2 + d4 * d4 + d * d;
                        if (!(d3 < 0.0) && !(d5 < d3)) continue;
                        d3 = d5;
                        n15 = n5;
                        n16 = n3;
                        n17 = n8;
                        n18 = n % (-24404 & 86);
                    }
                }
            }
        }
        if (d3 < 0.0) {
            for (n5 = n12 - n11; n5 <= n12 + n11; ++n5) {
                d2 = (double)n5 + 0.4896907216494845 * 1.0210526315789474 - class_1061.Field_1130;
                for (n8 = n14 - n11; n8 <= n14 + n11; ++n8) {
                    d = (double)n8 + 4.7 * 0.10638297872340426 - class_1061.Field_1106;
                    block10 : for (n3 = this.Field_36759.\u0000, for() - (257 & 8357); n3 >= 0; --n3) {
                        if (!this.Field_36759.\u0000strictfp((Class_4751)class_4810.Method_4814(n5, n3, n8))) continue;
                        while (n3 > 0 && this.Field_36759.\u0000strictfp((Class_4751)class_4810.Method_4814(n5, n3 - (22569 & -32123), n8))) {
                            --n3;
                        }
                        for (n = n19; n < n19 + (8290 & 3078); ++n) {
                            n9 = n % (-15818 & 3210);
                            n4 = (12353 & 18615) - n9;
                            for (n2 = 22936 & 512; n2 < (-7674 & 420); ++n2) {
                                for (n6 = -1 & -1; n6 < (-23482 & 388); ++n6) {
                                    object = n5 + (n2 - (2053 & -24397)) * n9;
                                    n10 = n3 + n6;
                                    n7 = n8 + (n2 - (8771 & -15215)) * n4;
                                    class_4810.Method_4814((int)object, n10, n7);
                                    if (n6 < 0 && !this.Field_36759.\u0000strictfp((Class_4751)class_4810).Method_3442().Method_3373().Method_3762() || n6 >= 0 && !this.Field_36759.\u0000strictfp((Class_4751)class_4810)) continue block10;
                                }
                            }
                            double d6 = (double)n3 + 0.967032967032967 * 0.5170454545454546 - class_1061.Method_1324();
                            double d7 = d2 * d2 + d6 * d6 + d * d;
                            if (!(d3 < 0.0) && !(d7 < d3)) continue;
                            d3 = d7;
                            n15 = n5;
                            n16 = n3;
                            n17 = n8;
                            n18 = n % (16518 & -21166);
                        }
                    }
                }
            }
        }
        n5 = n15;
        int n21 = n16;
        int n22 = n17;
        n8 = n18 % (11267 & 4182);
        int n23 = (2563 & 1073) - n8;
        if (n18 % (4941 & 17590) >= (4899 & 6)) {
            n8 = -n8;
            n23 = -n23;
        }
        if (d3 < 0.0) {
            n21 = n16 = Class_13337.Method_13367(n16, -28602 & 3271, this.Field_36759.\u0000, for() - (3098 & -15510));
            for (int i = -1 & -1; i <= (1061 & 28737); ++i) {
                for (n3 = 4161 & -24047; n3 < (3 & 8227); ++n3) {
                    for (n = -1 & -1; n < (4499 & 9219); ++n) {
                        n9 = n5 + (n3 - (537 & -32571)) * n8 + i * n23;
                        n4 = n21 + n;
                        n2 = n22 + (n3 - (73 & -15087)) * n23 - i * n8;
                        n6 = n < 0 ? 5077 & 25603 : 3331 & 592;
                        this.Field_36759.\u0000, `(new Class_4751(n9, n4, n2), (Class_3436)(n6 != 0 ? Class_9265.Field_9445.Method_3293() : Class_9265.Field_9351.Method_3293()));
                    }
                }
            }
        }
        Class_3436 class_3436 = Class_9265.Field_9291.\u0000strictfp().Method_3685(Class_14263.Field_14264, (Comparable)((Object)(n8 != 0 ? Class_4565.Field_4566 : Class_4565.Field_4570)));
        for (n3 = 16712 & -29696; n3 < (-15228 & 68); ++n3) {
            for (n = 16384 & 2193; n < (-23356 & 4150); ++n) {
                for (n9 = -1 & -1; n9 < (16484 & 2580); ++n9) {
                    n4 = n5 + (n - (537 & 23013)) * n8;
                    n2 = n21 + n9;
                    n6 = n22 + (n - (20609 & -32223)) * n23;
                    object = n == 0 || n == (4107 & 9075) || n9 == (-1 & -1) || n9 == (-24057 & 20827) ? 9867 & 101 : 6276 & -31944;
                    this.Field_36759.\u0000strictfp(new Class_4751(n4, n2, n6), object != 0 ? Class_9265.Field_9445.Method_3293() : class_3436, 74 & -32510);
                }
            }
            for (n = -32424 & 9250; n < (1476 & 20487); ++n) {
                for (n9 = -1 & -1; n9 < (-16372 & 518); ++n9) {
                    n4 = n5 + (n - (-24315 & 17409)) * n8;
                    n2 = n21 + n9;
                    n6 = n22 + (n - (21841 & -24063)) * n23;
                    object = new Class_4751(n4, n2, n6);
                    this.Field_36759.\u0000, `((Class_4751)object, this.Field_36759.\u0000strictfp((Class_4751)object).Method_3442());
                }
            }
        }
        return (11329 & 5043) != 0;
    }

    public boolean Method_36765(Class_1061 class_1061, float f) {
        Class_4751 class_4751;
        int n = 16768 & -21850;
        double d = -9.375 * 0.10666666666666667;
        int n2 = Class_13337.Method_13371(class_1061.Field_1130);
        int n3 = Class_13337.Method_13371(class_1061.Field_1106);
        int n4 = 1313 & -8051;
        Class_4751 class_47512 = Class_4751.Field_4760;
        long l = Class_29480.Method_29490(n2, n3);
        if (this.Field_36757.Method_14394(l)) {
            class_4751 = (Class_16278)this.Field_36757.Method_14384(l);
            d = 0.0;
            class_47512 = class_4751;
            ((Class_16278)class_4751).Field_16280 = this.Field_36759.\u0000, `();
            n4 = 26761 & 804;
        } else {
            class_4751 = new Class_4751(class_1061);
            for (int i = -96 & -60; i <= (16516 & -26240); ++i) {
                for (int j = -40 & -127; j <= (17580 & 4992); ++j) {
                    Class_4751 class_47513 = class_4751.Method_4791(i, this.Field_36759.\u0000, for() - (233 & 7) - class_4751.\u0000, `(), j);
                    while (class_47513.\u0000, `() >= 0) {
                        Class_4751 class_47514 = class_47513.Method_4782();
                        if (this.Field_36759.\u0000strictfp(class_47513).Method_3442() == Class_9265.Field_9291) {
                            while (this.Field_36759.\u0000strictfp(class_47514 = class_47513.Method_4782()).Method_3442() == Class_9265.Field_9291) {
                                class_47513 = class_47514;
                            }
                            double d2 = class_47513.\u0000strictfp((Class_4792)class_4751);
                            if (d < 0.0 || d2 < d) {
                                d = d2;
                                class_47512 = class_47513;
                            }
                        }
                        class_47513 = class_47514;
                    }
                }
            }
        }
        if (d >= 0.0) {
            if (n4 != 0) {
                this.Field_36757.Method_14393(l, new Class_16278(this, class_47512, this.Field_36759.\u0000, `()));
                this.Field_36760.add(l);
            }
            double d3 = (double)class_47512.\u0000= final() + 0.3275862068965517 * 1.5263157894736843;
            double d4 = (double)class_47512.\u0000, `() + 0.22282608695652173 * 2.2439024390243905;
            double d5 = (double)class_47512.\u0000strictfp() + 0.02127659574468085 * 23.5;
            Class_9702 class_9702 = Class_9265.Field_9291.Method_14267(this.Field_36759, class_47512);
            int n5 = class_9702.Method_9712().Method_4620().Method_4647() == Class_5016.Field_5020 ? -14451 & 8193 : -23007 & 20754;
            double d6 = class_9702.Method_9712().Method_4640() == Class_4565.Field_4566 ? (double)class_9702.Method_9714().\u0000strictfp() : (double)class_9702.Method_9714().\u0000= final();
            d4 = (double)(class_9702.Method_9714().\u0000, `() + (2195 & -32767)) - class_1061.Method_1332().\u0000strictfp * (double)class_9702.Method_9711();
            if (n5 != 0) {
                d6 += 1.0;
            }
            if (class_9702.Method_9712().Method_4640() == Class_4565.Field_4566) {
                d5 = d6 + (1.0 - class_1061.Method_1332().\u0000= final) * (double)class_9702.Method_9713() * (double)class_9702.Method_9712().Method_4620().Method_4647().Method_5023();
            } else {
                d3 = d6 + (1.0 - class_1061.Method_1332().\u0000= final) * (double)class_9702.Method_9713() * (double)class_9702.Method_9712().Method_4620().Method_4647().Method_5023();
            }
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            if (class_9702.Method_9712().Method_4660() == class_1061.Method_1354()) {
                f2 = 1.0f;
                f3 = 1.0f;
            } else if (class_9702.Method_9712().Method_4660() == class_1061.Method_1354().Method_4660()) {
                f2 = -0.8139535f * 1.2285714f;
                f3 = -1.1774194f * 0.84931505f;
            } else if (class_9702.Method_9712().Method_4660() == class_1061.Method_1354().Method_4620()) {
                f4 = 1.0f;
                f5 = -1.2931035f * 0.7733333f;
            } else {
                f4 = 1.0123457f * -0.9878049f;
                f5 = 1.0f;
            }
            double d7 = class_1061.Field_1071;
            double d8 = class_1061.Field_1072;
            class_1061.Field_1071 = d7 * (double)f2 + d8 * (double)f5;
            class_1061.Field_1072 = d7 * (double)f4 + d8 * (double)f3;
            class_1061.Field_1079 = f - (float)(class_1061.Method_1354().Method_4660().Method_4619() * (-32166 & 8443)) + (float)(class_9702.Method_9712().Method_4619() * (9466 & -16038));
            class_1061.Method_1239(d3, d4, d5, class_1061.Field_1079, class_1061.Field_1093);
            return (-32655 & 22787) != 0;
        }
        return (1 & -31614) != 0;
    }
}

