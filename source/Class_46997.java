/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public class Class_46997
extends Class_1551 {
    private final Class_18 Field_46998;
    private Class_1782 Field_46999;
    private final Class_45406 Field_47000;
    private long Field_47001;
    public boolean Field_47002;
    private static final Ordering Field_47003 = Ordering.from((Comparator)new Class_6753(null));
    private Class_1782 Field_47004;

    private void Method_47005() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_47006(Class_1782 class_1782) {
        this.Field_47004 = class_1782;
    }

    public void Method_47007(Class_1782 class_1782) {
        this.Field_46999 = class_1782;
    }

    public void Method_47008() {
        this.Field_47004 = null;
        this.Field_46999 = null;
    }

    protected void Method_47009(int n, int n2, int n3, Class_9738 class_9738) {
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.Field_46998.Method_253().Method_34707(\u0000= final);
        int n4 = 19459 & 788;
        int n5 = -23678 & 19468;
        n5 = class_9738.Method_9756() < 0 ? 8261 & 3085 : (class_9738.Method_9756() < (17046 & 6302) ? -32768 & 10646 : (class_9738.Method_9756() < (20796 & 1836) ? 20485 & 9473 : (class_9738.Method_9756() < (858 & 1656) ? -23222 & 7 : (class_9738.Method_9756() < (1000 & 29679) ? 25623 & 4099 : 13573 & 2188))));
        this.\u0000strictfp += 0.102564104f * 975.0f;
        this.\u0000strictfp(n2 + n - (-30673 & 5131), n3, (8192 & -8333) + n4 * (-20118 & 1050), (20656 & 2236) + n5 * (6200 & 16393), 3566 & 523, -24567 & 7116);
        this.\u0000strictfp -= 164.44444f * 0.6081081f;
    }

    public void Method_47010(int n, Class_20976 class_20976, Class_7873 class_7873) {
        int n2;
        int n3;
        int n4;
        Class_20165 class_20165 = this.Field_46998.Field_48.Field_1390;
        List list = Field_47003.sortedCopy((Iterable)class_20165.Method_20246());
        int n5 = 280 & 25732;
        int n6 = 2128 & 17443;
        for (Class_9738 class_9738 : list) {
            n2 = this.Field_46998.Field_27.Method_28715(this.Method_47013(class_9738));
            n5 = Math.max(n5, n2);
            if (class_7873 == null || class_7873.Method_7880() == Class_43298.Field_43302) continue;
            n2 = this.Field_46998.Field_27.Method_28715(" " + class_20976.Method_20993(class_9738.Method_9758().getName(), class_7873).Method_21706());
            n6 = Math.max(n6, n2);
        }
        list = list.subList(-28623 & 28160, Math.min(list.size(), -30608 & 16848));
        int n7 = n4 = list.size();
        n2 = 19521 & 4915;
        while (n7 > (17524 & 2325)) {
            n7 = (n4 + ++n2 - (2081 & 17921)) / n2;
        }
        int n8 = this.Field_46998.Method_251() || this.Field_46998.Method_271().Method_20230().Method_44624() ? 2725 & -32501 : 8452 & -31101;
        switch (this.Field_46998.Method_271().Field_20171) {
            case 1: {
                n8 = 10289 & 17417;
                break;
            }
            case 2: {
                n8 = 6404 & 17562;
            }
        }
        int n9 = class_7873 != null ? (class_7873.Method_7880() == Class_43298.Field_43302 ? 4186 & -32514 : n6) : 8572 & 4096;
        int n10 = Math.min(n2 * ((n8 != 0 ? 24651 & 521 : 1160 & 4704) + n5 + n9 + (1181 & -26611)), n - (62 & 10547)) / n2;
        int n11 = n / (16970 & -28378) - (n10 * n2 + (n2 - (-30519 & 13059)) * (1125 & 19087)) / (24642 & 3079);
        int n12 = 10314 & 21931;
        int n13 = n10 * n2 + (n2 - (3905 & 7)) * (9261 & -26345);
        List list2 = null;
        List list3 = null;
        if (this.Field_47004 != null) {
            list2 = this.Field_46998.Field_27.Method_28733(this.Field_47004.Method_1783(), n - (634 & 1203));
            for (String string : list2) {
                n13 = Math.max(n13, this.Field_46998.Field_27.Method_28715(string));
            }
        }
        if (this.Field_46999 != null) {
            list3 = this.Field_46998.Field_27.Method_28733(this.Field_46999.Method_1783(), n - (19387 & 8242));
            for (String string : list3) {
                n13 = Math.max(n13, this.Field_46998.Field_27.Method_28715(string));
            }
        }
        if (list2 != null) {
            Class_46997.\u0000, `((int)(n / (690 & 16710) - n13 / (1570 & -32446) - (1113 & 6273)), (int)(n12 - (301 & 23107)), (int)(n / (483 & 4126) + n13 / (-32442 & 42) + (-31215 & 79)), (int)(n12 + list2.size() * (16411 & 4937)), (int)(-2136790782 & -1912290272));
            for (String string : list2) {
                n3 = this.Field_46998.Field_27.Method_28715(string);
                this.Field_46998.Field_27.Method_28729(string, n / (2179 & -32414) - n3 / (2730 & 67), n12, -1 & -1);
                n12 += 24585 & -28257;
            }
            ++n12;
        }
        Class_46997.\u0000, `((int)(n / (3842 & -28601) - n13 / (6674 & 1227) - (21309 & -29695)), (int)(n12 - (2049 & 8977)), (int)(n / (-32750 & 3402) + n13 / (17415 & 546) + (3 & 6273)), (int)(n12 + n7 * (-32487 & 23273)), (int)(-1861132268 & -960102238));
        for (int i = 16912 & 193; i < n4; ++i) {
            int n14;
            int n15;
            int n16 = i / n7;
            n3 = i % n7;
            int n17 = n11 + n16 * n10 + n16 * (517 & 25037);
            int n18 = n12 + n3 * (9357 & -15863);
            Class_46997.\u0000, `((int)n17, (int)n18, (int)(n17 + n10), (int)(n18 + (8 & 4396)), (int)(570425343 & 721420287));
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16913();
            Class_16867.Method_16947();
            Class_16867.Method_16984(2882 & -15582, 5907 & -15549, -32571 & 17459, 512 & 18871);
            if (i >= list.size()) continue;
            Class_9738 class_9738 = (Class_9738)list.get(i);
            String string = this.Method_47013(class_9738);
            GameProfile gameProfile = class_9738.Method_9758();
            if (n8 != 0) {
                Class_626 class_626 = this.Field_46998.Field_72.\u0000strictfp(gameProfile.getId());
                n15 = class_626 != null && class_626.Method_847(Class_21361.Field_21363) && (gameProfile.getName().equals("Dinnerbone") || gameProfile.getName().equals("Grumm")) ? 33 & 6339 : 8210 & 5129;
                this.Field_46998.Method_253().Method_34707(class_9738.Method_9776());
                int n19 = (-30312 & 4204) + (n15 != 0 ? 27978 & 56 : 2186 & 12292);
                int n20 = (-16232 & 3082) * (n15 != 0 ? -1 & -1 : 1 & -13031);
                Class_1551.Method_1560(n17, n18, 9.302325f * 0.86f, n19, 8664 & 1034, n20, 20767 & 1160, -12982 & 8728, 138.0f * 0.46376812f, 0.6857143f * 93.33333f);
                if (class_626 != null && class_626.Method_847(Class_21361.Field_21372)) {
                    int n21 = (5641 & 8424) + (n15 != 0 ? 22536 & 1034 : 263 & 22568);
                    int n22 = (12298 & 18153) * (n15 != 0 ? -1 & -1 : 6273 & -24473);
                    Class_1551.Method_1560(n17, n18, 10.704226f * 3.7368422f, n21, 4126 & 16649, n22, 16520 & 552, 41 & 1416, 1.7647059f * 36.266666f, 5.4f * 11.851851f);
                }
                n17 += 9;
            }
            if (class_9738.Method_9754() == Class_35650.Field_35654) {
                string = (Object)((Object)Class_5478.Field_5495) + string;
                this.Field_46998.Field_27.Method_28729(string, n17, n18, -1795162113 & -1862270977);
            } else {
                this.Field_46998.Field_27.Method_28729(string, n17, n18, -1 & -1);
            }
            if (class_7873 != null && class_9738.Method_9754() != Class_35650.Field_35654 && (n15 = (n14 = n17 + n5 + (12553 & 16993)) + n9) - n14 > (-32563 & 1063)) {
                this.Method_47011(class_7873, n18, gameProfile.getName(), n14, n15, class_9738);
            }
            if (this.Field_46998.Method_271() == null || !this.Field_46998.Method_271().Field_20175) continue;
            this.Method_47009(n10, n17 - (n8 != 0 ? 265 & 5789 : -32768 & 14548), n18, class_9738);
        }
        if (list3 != null) {
            n12 = n12 + n7 * (585 & 18475) + (16473 & -25471);
            Class_46997.\u0000, `((int)(n / (-21946 & 5163) - n13 / (16915 & 4322) - (2083 & 13445)), (int)(n12 - (18953 & -32731)), (int)(n / (21546 & 3015) + n13 / (-32509 & 22054) + (-32687 & 6277)), (int)(n12 + list3.size() * (713 & -23509)), (int)(-1743911644 & -2080312703));
            for (String string : list3) {
                n3 = this.Field_46998.Field_27.Method_28715(string);
                this.Field_46998.Field_27.Method_28729(string, n / (-32766 & 28754) - n3 / (24626 & 2374), n12, -1 & -1);
                n12 += 4207 & -24567;
            }
        }
    }

    private void Method_47011(Class_7873 class_7873, int n, String string, int n2, int n3, Class_9738 class_9738) {
        int n4 = class_7873.Method_7884().Method_20993(string, class_7873).Method_21706();
        if (class_7873.Method_7880() == Class_43298.Field_43302) {
            int n5;
            this.Field_46998.Method_253().Method_34707(\u0000= final);
            if (this.Field_47001 == class_9738.Method_9777()) {
                if (n4 < class_9738.Method_9760()) {
                    class_9738.Method_9778(Class_18.Method_207());
                    class_9738.Method_9772(this.Field_47000.Method_45448() + (10780 & 16532));
                } else if (n4 > class_9738.Method_9760()) {
                    class_9738.Method_9778(Class_18.Method_207());
                    class_9738.Method_9772(this.Field_47000.Method_45448() + (1162 & -30162));
                }
            }
            if (Class_18.Method_207() - class_9738.Method_9771() > (-5362955188262587416L & 5362955188023886842L) || this.Field_47001 != class_9738.Method_9777()) {
                class_9738.Method_9759(n4);
                class_9738.Method_9768(n4);
                class_9738.Method_9778(Class_18.Method_207());
            }
            class_9738.Method_9761(this.Field_47001);
            class_9738.Method_9759(n4);
            int n6 = Class_13337.Method_13362((float)Math.max(n4, class_9738.Method_9774()) / 2.0f);
            int n7 = Math.max(Class_13337.Method_13362(n4 / (8226 & 522)), Math.max(Class_13337.Method_13362(class_9738.Method_9774() / (-13305 & 130)), -32085 & 20510));
            int n8 = n5 = class_9738.Method_9769() > (long)this.Field_47000.Method_45448() && (class_9738.Method_9769() - (long)this.Field_47000.Method_45448()) / (6589326370220017863L & -6589326370646360061L) % (6270587806729932866L & 1447191986L) == (1079184513L & -7699135295248379831L) ? 321 & -17919 : -15259 & 10248;
            if (n6 > 0) {
                float f = Math.min((float)(n3 - n2 - (396 & 2068)) / (float)n7, 0.34042552f * 26.4375f);
                if (f > 3.88f * 0.77319586f) {
                    int n9;
                    for (n9 = n6; n9 < n7; ++n9) {
                        this.\u0000strictfp((float)n2 + (float)n9 * f, (float)n, n5 != 0 ? -24291 & 25 : 18463 & 16, -32767 & 17866, -23283 & 6345, 10765 & 16425);
                    }
                    for (n9 = 2050 & -11135; n9 < n6; ++n9) {
                        this.\u0000strictfp((float)n2 + (float)n9 * f, (float)n, n5 != 0 ? -30691 & 8761 : 17 & -16272, -21871 & 1388, -5623 & 313, -30641 & 21513);
                        if (n5 != 0) {
                            if (n9 * (16642 & 4614) + (16385 & 6815) < class_9738.Method_9774()) {
                                this.\u0000strictfp((float)n2 + (float)n9 * f, (float)n, 26726 & 838, 24608 & 2824, 12825 & 105, -22131 & 1097);
                            }
                            if (n9 * (-32506 & 2) + (4737 & 1293) == class_9738.Method_9774()) {
                                this.\u0000strictfp((float)n2 + (float)n9 * f, (float)n, 223 & 16719, 0 & 8193, 3119 & 24601, 17227 & 7197);
                            }
                        }
                        if (n9 * (6146 & 270) + (-24495 & 6177) < n4) {
                            this.\u0000strictfp((float)n2 + (float)n9 * f, (float)n, n9 >= (-15954 & 4619) ? 424 & 225 : 2556 & 566, -31602 & 0, 713 & -20471, -30711 & 59);
                        }
                        if (n9 * (17026 & 4146) + (-31735 & 5) != n4) continue;
                        this.\u0000strictfp((float)n2 + (float)n9 * f, (float)n, n9 >= (25050 & 1034) ? 681 & 24825 : 16445 & 9917, -30592 & 9493, 25929 & -30563, -7921 & 5273);
                    }
                } else {
                    float f2 = Class_13337.Method_13360((float)n4 / (0.3f * 66.666664f), 0.0f, 1.0f);
                    int n10 = (int)((1.0f - f2) * (0.425f * 600.0f)) << (20625 & 116) | (int)(f2 * (0.16666667f * 1530.0f)) << (24893 & 5832);
                    String string2 = "" + (float)n4 / 2.0f;
                    if (n3 - this.Field_46998.Field_27.Method_28715(string2 + "hp") >= n2) {
                        string2 = string2 + "hp";
                    }
                    this.Field_46998.Field_27.Method_28729(string2, (n3 + n2) / (263 & 24738) - this.Field_46998.Field_27.Method_28715(string2) / (-12082 & 8706), n, n10);
                }
            }
        } else {
            String string3 = (Object)((Object)Class_5478.Field_5485) + "" + n4;
            this.Field_46998.Field_27.Method_28729(string3, n3 - this.Field_46998.Field_27.Method_28715(string3), n, 33554431 & 654311423);
        }
    }

    public Class_46997(Class_18 class_18, Class_45406 class_45406) {
        this.Field_46998 = class_18;
        this.Field_47000 = class_45406;
    }

    public void Method_47012(boolean bl) {
        if (bl && !this.Field_47002) {
            this.Field_47001 = Class_18.Method_207();
        }
        this.Field_47002 = bl;
    }

    public String Method_47013(Class_9738 class_9738) {
        return class_9738.Method_9766() != null ? class_9738.Method_9766().Method_1783() : Class_22057.Method_22082(class_9738.Method_9755(), class_9738.Method_9758().getName());
    }
}

