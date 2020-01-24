/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_15363
extends Class_8295 {
    public int Field_15364;
    public Class_4961 Field_15365 = new Class_47784(this, "Enchant", (16417 & 4619) != 0, -31730 & 4898);
    public int[] Field_15366 = new int[199 & 18947];
    private Class_4751 Field_15367;
    public int[] Field_15368;
    private Class_283 Field_15369;
    private Random Field_15370 = new Random();

    public Class_15363(Class_37781 class_37781, Class_283 class_283, Class_4751 class_4751) {
        int n;
        int[] arrn = new int[-31989 & 20483];
        arrn[0 & 2600] = -1 & -1;
        arrn[8521 & 39] = -1 & -1;
        arrn[4610 & -23326] = -1 & -1;
        this.Field_15368 = arrn;
        this.Field_15369 = class_283;
        this.Field_15367 = class_4751;
        this.Field_15364 = class_37781.Field_37786.Method_718();
        this.\u0000strictfp((Class_26421)new Class_37485(this, this.Field_15365, 17103 & 48, 3599 & 12447, 4271 & -24529));
        this.\u0000strictfp((Class_26421)new Class_34574(this, this.Field_15365, -30719 & 16993, 12771 & -13253, 4143 & 2159));
        for (n = 96 & 1169; n < (8451 & 159); ++n) {
            for (int i = 8965 & -28512; i < (651 & -7911); ++i) {
                this.\u0000strictfp(new Class_26421(class_37781, i + n * (-31463 & 12297) + (25 & -31729), (19593 & 8986) + i * (83 & 14482), (9814 & 4444) + n * (5146 & 18738)));
            }
        }
        for (n = 10515 & -28668; n < (-30423 & 8777); ++n) {
            this.\u0000strictfp(new Class_26421(class_37781, n, (8270 & 5033) + n * (-20326 & 2066), 8334 & -28530));
        }
    }

    private void Method_15371() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_15372(int n, int n2) {
        if (n >= 0 && n <= (2562 & 1158)) {
            this.Field_15366[n] = n2;
        } else if (n == (25795 & 287)) {
            this.Field_15364 = n2;
        } else if (n >= (8598 & -16380) && n <= (-31418 & 6791)) {
            this.Field_15368[n - (16900 & -24306)] = n2;
        } else {
            super.Method_8311(n, n2);
        }
    }

    public boolean Method_15373(Class_626 class_626, int n) {
        Class_23823 class_23823 = this.Field_15365.Method_4964(20612 & 11776);
        Class_23823 class_238232 = this.Field_15365.Method_4964(14393 & -31035);
        int n2 = n + (4611 & -16315);
        if (!(class_238232 != null && class_238232.Field_23826 >= n2 || class_626.Field_694.Method_18094())) {
            return (9230 & -32592) != 0;
        }
        if (this.Field_15366[n] > 0 && class_23823 != null && (class_626.Field_668 >= n2 && class_626.Field_668 >= this.Field_15366[n] || class_626.Field_694.Method_18094())) {
            if (!this.Field_15369.Field_306) {
                int n3;
                List list = this.Method_15376(class_23823, n, this.Field_15366[n]);
                int n4 = n3 = class_23823.Method_23844() == Class_10527.Field_10629 ? 13 & -28669 : 406 & 2561;
                if (list != null) {
                    class_626.Method_777(n2);
                    if (n3 != 0) {
                        class_23823.Method_23882(Class_10527.Field_10625);
                    }
                    for (int i = -32624 & 17408; i < list.size(); ++i) {
                        Class_38800 class_38800 = (Class_38800)list.get(i);
                        if (n3 != 0) {
                            Class_10527.Field_10625.Method_21686(class_23823, class_38800);
                            continue;
                        }
                        class_23823.Method_23835(class_38800.Field_38802, class_38800.Field_38801);
                    }
                    if (!class_626.Field_694.Method_18094()) {
                        class_238232.Field_23826 -= n2;
                        if (class_238232.Field_23826 <= 0) {
                            this.Field_15365.Method_4963(13507 & -32715, null);
                        }
                    }
                    class_626.Method_750(Class_19863.Field_19913);
                    this.Field_15365.Method_4966();
                    this.Field_15364 = class_626.Method_718();
                    this.Method_15377(this.Field_15365);
                }
            }
            return (3523 & 533) != 0;
        }
        return (-26592 & 1856) != 0;
    }

    public Class_15363(Class_37781 class_37781, Class_283 class_283) {
        this(class_37781, class_283, Class_4751.Field_4760);
    }

    public void Method_15374(Class_626 class_626) {
        super.Method_8320(class_626);
        if (!this.Field_15369.Field_306) {
            for (int i = 16388 & 4129; i < this.Field_15365.Method_4968(); ++i) {
                Class_23823 class_23823 = this.Field_15365.Method_4976(i);
                if (class_23823 == null) continue;
                class_626.Method_733(class_23823, (928 & -15355) != 0);
            }
        }
    }

    public boolean Method_15375(Class_626 class_626) {
        return (this.Field_15369.Method_375(this.Field_15367).Method_3442() != Class_9265.Field_9455 ? 7232 & 384 : (class_626.\u0000strictfp((double)this.Field_15367.\u0000= final() + 0.8717948717948718 * 0.5735294117647058, (double)this.Field_15367.\u0000, `() + 0.08536585365853659 * 5.857142857142857, (double)this.Field_15367.\u0000strictfp() + 3.0 * 0.16666666666666666) <= 0.9444444444444444 * 67.76470588235294 ? 1793 & -20407 : 3 & -29336)) != 0;
    }

    private List Method_15376(Class_23823 class_23823, int n, int n2) {
        this.Field_15370.setSeed(this.Field_15364 + n);
        List list = Class_29642.Method_29661(this.Field_15370, class_23823, n2);
        if (class_23823.Method_23844() == Class_10527.Field_10629 && list != null && list.size() > (13337 & 515)) {
            list.remove(this.Field_15370.nextInt(list.size()));
        }
        return list;
    }

    public void Method_15377(Class_4961 class_4961) {
        if (class_4961 == this.Field_15365) {
            Class_23823 class_23823 = class_4961.Method_4964(8641 & -14288);
            if (class_23823 != null && class_23823.Method_23866()) {
                if (!this.Field_15369.Field_306) {
                    int n;
                    int n2 = 16520 & -26028;
                    for (n = -1 & -1; n <= (-20123 & 19089); ++n) {
                        for (int i = -1 & -1; i <= (-31743 & 21377); ++i) {
                            if (n == 0 && i == 0 || !this.Field_15369.Method_507(this.Field_15367.Method_4791(i, 547 & 15632, n)) || !this.Field_15369.Method_507(this.Field_15367.Method_4791(i, 25617 & -32469, n))) continue;
                            if (this.Field_15369.Method_375(this.Field_15367.Method_4791(i * (-28670 & 16534), 25112 & 1057, n * (8450 & -30185))).Method_3442() == Class_9265.Field_9339) {
                                ++n2;
                            }
                            if (this.Field_15369.Method_375(this.Field_15367.Method_4791(i * (531 & 17482), -32319 & 17417, n * (-15354 & 3))).Method_3442() == Class_9265.Field_9339) {
                                ++n2;
                            }
                            if (i == 0 || n == 0) continue;
                            if (this.Field_15369.Method_375(this.Field_15367.Method_4791(i * (539 & -21118), 3269 & -24550, n)).Method_3442() == Class_9265.Field_9339) {
                                ++n2;
                            }
                            if (this.Field_15369.Method_375(this.Field_15367.Method_4791(i * (82 & -32125), 2577 & 9, n)).Method_3442() == Class_9265.Field_9339) {
                                ++n2;
                            }
                            if (this.Field_15369.Method_375(this.Field_15367.Method_4791(i, 9472 & -16368, n * (1038 & 2882))).Method_3442() == Class_9265.Field_9339) {
                                ++n2;
                            }
                            if (this.Field_15369.Method_375(this.Field_15367.Method_4791(i, 10241 & 16929, n * (9226 & -30621))).Method_3442() != Class_9265.Field_9339) continue;
                            ++n2;
                        }
                    }
                    this.Field_15370.setSeed(this.Field_15364);
                    for (n = 528 & 8236; n < (17419 & 131); ++n) {
                        this.Field_15366[n] = Class_29642.Method_29649(this.Field_15370, n, n2, class_23823);
                        this.Field_15368[n] = -1 & -1;
                        if (this.Field_15366[n] >= n + (17 & 2567)) continue;
                        this.Field_15366[n] = 2056 & 25601;
                    }
                    for (n = -28531 & 8240; n < (787 & -30709); ++n) {
                        List list;
                        if (this.Field_15366[n] <= 0 || (list = this.Method_15376(class_23823, n, this.Field_15366[n])) == null || list.isEmpty()) continue;
                        Class_38800 class_38800 = (Class_38800)list.get(this.Field_15370.nextInt(list.size()));
                        this.Field_15368[n] = class_38800.Field_38802.Field_30638 | class_38800.Field_38801 << (22042 & 8456);
                    }
                    this.Method_15380();
                }
            } else {
                for (int i = 1076 & -22526; i < (-30685 & 8215); ++i) {
                    this.Field_15366[i] = 15369 & -32640;
                    this.Field_15368[i] = -1 & -1;
                }
            }
        }
    }

    public int Method_15378() {
        Class_23823 class_23823 = this.Field_15365.Method_4964(1541 & 22921);
        return class_23823 == null ? 4642 & 21 : class_23823.Field_23826;
    }

    public void Method_15379(Class_37497 class_37497) {
        super.Method_8306(class_37497);
        class_37497.Method_37499(this, -24512 & 5, this.Field_15366[18530 & -24448]);
        class_37497.Method_37499(this, 1705 & 18433, this.Field_15366[2061 & 321]);
        class_37497.Method_37499(this, -32762 & 17538, this.Field_15366[1091 & -31870]);
        class_37497.Method_37499(this, 6171 & -16381, this.Field_15364 & (-12 & -8));
        class_37497.Method_37499(this, 14861 & -32684, this.Field_15368[16421 & -32240]);
        class_37497.Method_37499(this, 2629 & 1159, this.Field_15368[12497 & 35]);
        class_37497.Method_37499(this, 24846 & -25449, this.Field_15368[4230 & -15806]);
    }

    public void Method_15380() {
        super.Method_8322();
        for (int i = 4708 & 17408; i < this.\u0000= final.size(); ++i) {
            Class_37497 class_37497 = (Class_37497)this.\u0000= final.get(i);
            class_37497.Method_37499(this, 10304 & 1580, this.Field_15366[20769 & -32098]);
            class_37497.Method_37499(this, 8261 & 385, this.Field_15366[-32185 & 2321]);
            class_37497.Method_37499(this, 4502 & -16382, this.Field_15366[-6142 & 1547]);
            class_37497.Method_37499(this, 2051 & 115, this.Field_15364 & (-10 & -15));
            class_37497.Method_37499(this, -28668 & 8396, this.Field_15368[825 & 20674]);
            class_37497.Method_37499(this, 9509 & 4173, this.Field_15368[1 & -29565]);
            class_37497.Method_37499(this, 18566 & -24570, this.Field_15368[22791 & 8730]);
        }
    }

    public Class_23823 Method_15381(Class_626 class_626, int n) {
        Class_23823 class_23823 = null;
        Class_26421 class_26421 = (Class_26421)this.\u0000, `.get(n);
        if (class_26421 != null && class_26421.Method_26439()) {
            Class_23823 class_238232 = class_26421.Method_26430();
            class_23823 = class_238232.Method_23850();
            if (n == 0) {
                if (!this.\u0000strictfp(class_238232, 8778 & 17443, 8254 & 742, (35 & -29483) != 0)) {
                    return null;
                }
            } else if (n == (5189 & 18945)) {
                if (!this.\u0000strictfp(class_238232, 16770 & 10342, 2166 & 9007, (2117 & 25865) != 0)) {
                    return null;
                }
            } else if (class_238232.Method_23844() == Class_10527.Field_10623 && Class_5393.Method_5448(class_238232.Method_23843()) == Class_5393.Field_5406) {
                if (!this.\u0000strictfp(class_238232, 18953 & -32475, 578 & 12322, (-26751 & 2099) != 0)) {
                    return null;
                }
            } else {
                if (((Class_26421)this.\u0000, `.get(554 & 6149)).Method_26439() || !((Class_26421)this.\u0000, `.get(20614 & 817)).Method_26435(class_238232)) {
                    return null;
                }
                if (class_238232.Method_23842() && class_238232.Field_23826 == (20773 & -23541)) {
                    ((Class_26421)this.\u0000, `.get(24834 & -32252)).Method_26437(class_238232.Method_23850());
                    class_238232.Field_23826 = 8456 & 17;
                } else if (class_238232.Field_23826 >= (5675 & -24559)) {
                    ((Class_26421)this.\u0000, `.get(4370 & 1060)).Method_26437(new Class_23823(class_238232.Method_23844(), 2951 & 17433, class_238232.Method_23843()));
                    class_238232.Field_23826 -= -32627 & 18787;
                }
            }
            if (class_238232.Field_23826 == 0) {
                class_26421.Method_26437(null);
            } else {
                class_26421.Method_26431();
            }
            if (class_238232.Field_23826 == class_23823.Field_23826) {
                return null;
            }
            class_26421.Method_26441(class_626, class_238232);
        }
        return class_23823;
    }
}

