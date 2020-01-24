/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_5693
extends Class_4291 {
    private Class_3238 Field_5694;

    public Class_5693(Class_3238 class_3238) {
        super((8705 & 2081) != 0);
        this.Field_5694 = class_3238;
    }

    private void Method_5695() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_5696(Class_283 class_283, Random random, Class_4751 class_4751) {
        if (this.Field_5694 == null) {
            this.Field_5694 = random.nextBoolean() ? Class_9265.Field_9292 : Class_9265.Field_9322;
        }
        int n = random.nextInt(275 & 1187) + (524 & -24508);
        int n2 = 4201 & 25105;
        if (class_4751.\u0000, `() >= (-4095 & 43) && class_4751.\u0000, `() + n + (41 & 3393) < (23296 & 258)) {
            int n3;
            Object object;
            int n4;
            int n5;
            int n6;
            for (int i = class_4751.\u0000, `(); i <= class_4751.\u0000, `() + (-22515 & 20739) + n; ++i) {
                n3 = -28509 & 2375;
                if (i <= class_4751.\u0000, `() + (7 & 2091)) {
                    n3 = 24594 & 864;
                }
                Class_4810 class_4810 = new Class_4810();
                for (n6 = class_4751.\u0000= final() - n3; n6 <= class_4751.\u0000= final() + n3 && n2 != 0; ++n6) {
                    for (n5 = class_4751.\u0000strictfp() - n3; n5 <= class_4751.\u0000strictfp() + n3 && n2 != 0; ++n5) {
                        if (i >= 0 && i < (4935 & 9520)) {
                            object = class_283.Method_375(class_4810.Method_4814(n6, i, n5)).Method_3442();
                            if (((Class_3238)object).Method_3373() == Class_3713.Field_3718 || ((Class_3238)object).Method_3373() == Class_3713.Field_3729) continue;
                            n2 = -28670 & 2312;
                            continue;
                        }
                        n2 = 4108 & 9728;
                    }
                }
            }
            if (n2 == 0) {
                return (-27574 & 18736) != 0;
            }
            Class_3238 class_3238 = class_283.Method_375(class_4751.Method_4782()).Method_3442();
            if (class_3238 != Class_9265.Field_9272 && class_3238 != Class_9265.Field_9319 && class_3238 != Class_9265.Field_9436) {
                return (-32718 & 2760) != 0;
            }
            n3 = class_4751.\u0000, `() + n;
            if (this.Field_5694 == Class_9265.Field_9322) {
                n3 = class_4751.\u0000, `() + n - (9259 & -15997);
            }
            for (n4 = n3; n4 <= class_4751.\u0000, `() + n; ++n4) {
                n6 = 16385 & 2249;
                if (n4 < class_4751.\u0000, `() + n) {
                    ++n6;
                }
                if (this.Field_5694 == Class_9265.Field_9292) {
                    n6 = 8267 & -32605;
                }
                n5 = class_4751.\u0000= final() - n6;
                object = class_4751.\u0000= final() + n6;
                int n7 = class_4751.\u0000strictfp() - n6;
                int n8 = class_4751.\u0000strictfp() + n6;
                for (int i = n5; i <= object; ++i) {
                    for (int j = n7; j <= n8; ++j) {
                        Class_4751 class_47512;
                        int n9 = -27873 & 1093;
                        if (i == n5) {
                            --n9;
                        } else if (i == object) {
                            ++n9;
                        }
                        if (j == n7) {
                            n9 -= 3;
                        } else if (j == n8) {
                            n9 += 3;
                        }
                        Class_47151 class_47151 = Class_47151.Method_47189(n9);
                        if (this.Field_5694 == Class_9265.Field_9292 || n4 < class_4751.\u0000, `() + n) {
                            if ((i == n5 || i == object) && (j == n7 || j == n8)) continue;
                            if (i == class_4751.\u0000= final() - (n6 - (707 & -7899)) && j == n7) {
                                class_47151 = Class_47151.Field_47164;
                            }
                            if (i == n5 && j == class_4751.\u0000strictfp() - (n6 - (1057 & 2689))) {
                                class_47151 = Class_47151.Field_47164;
                            }
                            if (i == class_4751.\u0000= final() + (n6 - (5 & 977)) && j == n7) {
                                class_47151 = Class_47151.Field_47157;
                            }
                            if (i == object && j == class_4751.\u0000strictfp() - (n6 - (7 & 545))) {
                                class_47151 = Class_47151.Field_47157;
                            }
                            if (i == class_4751.\u0000= final() - (n6 - (513 & -12261)) && j == n8) {
                                class_47151 = Class_47151.Field_47160;
                            }
                            if (i == n5 && j == class_4751.\u0000strictfp() + (n6 - (-32697 & 17025))) {
                                class_47151 = Class_47151.Field_47160;
                            }
                            if (i == class_4751.\u0000= final() + (n6 - (25153 & -31711)) && j == n8) {
                                class_47151 = Class_47151.Field_47166;
                            }
                            if (i == object && j == class_4751.\u0000strictfp() + (n6 - (621 & -16383))) {
                                class_47151 = Class_47151.Field_47166;
                            }
                        }
                        if (class_47151 == Class_47151.Field_47152 && n4 < class_4751.\u0000, `() + n) {
                            class_47151 = Class_47151.Field_47167;
                        }
                        if (class_4751.\u0000, `() < class_4751.\u0000, `() + n - (16937 & -23231) && class_47151 == Class_47151.Field_47167 || class_283.Method_375(class_47512 = new Class_4751(i, n4, j)).Method_3442().Method_3381()) continue;
                        this.\u0000strictfp(class_283, class_47512, this.Field_5694.Method_3293().Method_3685(Class_13715.Field_13717, (Comparable)((Object)class_47151)));
                    }
                }
            }
            for (n4 = 20612 & 66; n4 < n; ++n4) {
                Class_3238 class_32382 = class_283.Method_375(class_4751.Method_4766(n4)).Method_3442();
                if (class_32382.Method_3381()) continue;
                this.\u0000strictfp(class_283, class_4751.Method_4766(n4), this.Field_5694.Method_3293().Method_3685(Class_13715.Field_13717, (Comparable)((Object)Class_47151.Field_47159)));
            }
            return (8233 & 7873) != 0;
        }
        return (192 & 28168) != 0;
    }

    public Class_5693() {
        super((-30715 & 1296) != 0);
    }
}

