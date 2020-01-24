/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultiset
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Multiset
 *  com.google.common.collect.Multisets
 */
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_40864
extends Class_39399 {
    public void Method_40865(Class_23823 class_23823, Class_283 class_283, Class_1061 class_1061, int n, boolean bl) {
        if (!class_283.Field_306) {
            Class_33760 class_33760 = this.Method_40868(class_23823, class_283);
            if (class_1061 instanceof Class_626) {
                Class_626 class_626 = (Class_626)class_1061;
                class_33760.Method_33774(class_626, class_23823);
            }
            if (bl) {
                this.Method_40871(class_283, class_1061, class_33760);
            }
        }
    }

    protected Class_40864() {
        this.\u0000strictfp((-32247 & 4289) != 0);
    }

    public void Method_40866(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        if (class_23823.Method_23842() && class_23823.Method_23845().Method_1733("map_is_scaling")) {
            Class_33760 class_33760 = Class_10527.Field_10701.Method_40868(class_23823, class_283);
            class_23823.Method_23849(class_283.Method_460("map"));
            Class_33760 class_337602 = new Class_33760("map_" + class_23823.Method_23843());
            class_337602.Field_33767 = (byte)(class_33760.Field_33767 + (16417 & -29233));
            if (class_337602.Field_33767 > (-32676 & 29061)) {
                class_337602.Field_33767 = (byte)(516 & 6287);
            }
            class_337602.Method_33772(class_33760.Field_33764, class_33760.Field_33766, class_337602.Field_33767);
            class_337602.Field_33762 = class_33760.Field_33762;
            class_337602.\u0000, `();
            class_283.Method_557("map_" + class_23823.Method_23843(), class_337602);
        }
    }

    public void Method_40867(Class_23823 class_23823, Class_626 class_626, List list, boolean bl) {
        Class_33760 class_33760 = this.Method_40868(class_23823, class_626.\u0000strictfp);
        if (bl) {
            if (class_33760 == null) {
                list.add("Unknown map");
            } else {
                list.add("Scaling at 1:" + ((553 & -5743) << class_33760.Field_33767));
                list.add("(Level " + class_33760.Field_33767 + "/" + (2692 & -24498) + ")");
            }
        }
    }

    public Class_33760 Method_40868(Class_23823 class_23823, Class_283 class_283) {
        String string = "map_" + class_23823.Method_23843();
        Class_33760 class_33760 = (Class_33760)class_283.Method_492(Class_33760.class, string);
        if (class_33760 == null && !class_283.Field_306) {
            class_23823.Method_23849(class_283.Method_460("map"));
            string = "map_" + class_23823.Method_23843();
            class_33760 = new Class_33760(string);
            class_33760.Field_33767 = (byte)(9219 & 2171);
            class_33760.Method_33772(class_283.Method_386().Method_31787(), class_283.Method_386().Method_31763(), class_33760.Field_33767);
            class_33760.Field_33762 = (byte)class_283.Field_284.Method_18379();
            class_33760.\u0000, `();
            class_283.Method_557(string, class_33760);
        }
        return class_33760;
    }

    private void Method_40869() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_33760 Method_40870(int n, Class_283 class_283) {
        String string = "map_" + n;
        Class_33760 class_33760 = (Class_33760)class_283.Method_492(Class_33760.class, string);
        if (class_33760 == null) {
            class_33760 = new Class_33760(string);
            class_283.Method_557(string, class_33760);
        }
        return class_33760;
    }

    public void Method_40871(Class_283 class_283, Class_1061 class_1061, Class_33760 class_33760) {
        if (class_283.Field_284.Method_18379() == class_33760.Field_33762 && class_1061 instanceof Class_626) {
            int n = (-28151 & 19719) << class_33760.Field_33767;
            int n2 = class_33760.Field_33764;
            int n3 = class_33760.Field_33766;
            int n4 = Class_13337.Method_13371(class_1061.Field_1130 - (double)n2) / n + (4852 & 8256);
            int n5 = Class_13337.Method_13371(class_1061.Field_1106 - (double)n3) / n + (-16181 & 80);
            int n6 = (-23344 & 20612) / n;
            if (class_283.Field_284.Method_18370()) {
                n6 /= 17934 & 4195;
            }
            Class_26753 class_26753 = class_33760.Method_33777((Class_626)class_1061);
            class_26753.Field_26762 += 8465 & 2117;
            int n7 = -15325 & 0;
            for (int i = n4 - n6 + (4625 & 65); i < n4 + n6; ++i) {
                if ((i & (17695 & -22417)) != (class_26753.Field_26762 & (-24465 & 16543)) && n7 == 0) continue;
                n7 = -11904 & 38;
                double d = 0.0;
                for (int j = n5 - n6 - (25155 & 5297); j < n5 + n6; ++j) {
                    Object object;
                    int n8;
                    int n9;
                    Object object2;
                    if (i < 0 || j < (-1 & -1) || i >= (-32640 & 452) || j >= (18570 & 1493)) continue;
                    int n10 = i - n4;
                    int n11 = j - n5;
                    int n12 = n10 * n10 + n11 * n11 > (n6 - (12294 & -12477)) * (n6 - (-15294 & 2606)) ? -32701 & 20757 : 16704 & 11791;
                    int n13 = (n2 / n + i - (328 & 13408)) * n;
                    int n14 = (n3 / n + j - (-28088 & 9280)) * n;
                    HashMultiset hashMultiset = HashMultiset.create();
                    Class_17665 class_17665 = class_283.Method_385(new Class_4751(n13, -20216 & 672, n14));
                    if (class_17665.Method_17728()) continue;
                    int n15 = n13 & (5775 & 287);
                    int n16 = n14 & (31 & -28465);
                    int n17 = 16 & 10125;
                    double d2 = 0.0;
                    if (class_283.Field_284.Method_18370()) {
                        int n18 = n13 + n14 * (1076861375 & 511954367);
                        if (((n18 = n18 * n18 * (-2116196399 & 1675489107) + n18 * (8203 & 719)) >> (10708 & 29) & (33 & -32749)) == 0) {
                            hashMultiset.add((Object)Class_9265.Field_9272.Method_3306(Class_9265.Field_9272.Method_3293().Method_3685(Class_4180.Field_4181, (Comparable)((Object)Class_4194.Field_4202))), -28357 & 10);
                        } else {
                            hashMultiset.add((Object)Class_9265.Field_9446.Method_3306(Class_9265.Field_9446.Method_3293().Method_3685(Class_3903.Field_3904, (Comparable)((Object)Class_3915.Field_3921))), 6772 & -24476);
                        }
                        d2 = 2.3714285714285714 * 42.16867469879518;
                    } else {
                        Class_4810 class_4810 = new Class_4810();
                        for (int k = -29135 & 20864; k < n; ++k) {
                            for (n9 = 19528 & 801; n9 < n; ++n9) {
                                object2 = class_17665.Method_17719(k + n15, n9 + n16) + (1155 & 4609);
                                object = Class_9265.Field_9351.Method_3293();
                                if (object2 > (139 & 3397)) {
                                    while ((object = class_17665.Method_17709(class_4810.Method_4814(k + n15, (int)(--object2), n9 + n16))).Method_3442().Method_3306((Class_3436)object) == Class_3779.Field_3807 && object2 > 0) {
                                    }
                                    if (object2 > 0 && object.Method_3442().Method_3373().Method_3758()) {
                                        Class_3238 class_3238;
                                        n8 = object2 - (5509 & -32767);
                                        do {
                                            class_3238 = class_17665.Method_17749(k + n15, n8--, n9 + n16);
                                            ++n17;
                                        } while (n8 > 0 && class_3238.Method_3373().Method_3758());
                                    }
                                }
                                d2 += (double)object2 / (double)(n * n);
                                hashMultiset.add((Object)object.Method_3442().Method_3306((Class_3436)object));
                            }
                        }
                    }
                    n17 /= n * n;
                    double d3 = (d2 - d) * (6.2 * 0.6451612903225806) / (double)(n + (2854 & 1028)) + ((double)(i + j & (405 & -16887)) - 1.2162162162162162 * 0.4111111111111111) * (0.8333333333333334 * 0.48);
                    n9 = 8449 & 19459;
                    if (d3 > 0.45348837209302323 * 1.323076923076923) {
                        n9 = 1102 & 24835;
                    }
                    if (d3 < 1.0 * -0.6) {
                        n9 = 8206 & 18048;
                    }
                    if ((object2 = (Object)((Class_3779)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)hashMultiset), (Object)Class_3779.Field_3807))) == Class_3779.Field_3799) {
                        d3 = (double)n17 * (0.5108695652173914 * 0.19574468085106383) + (double)(i + j & (17705 & 14339)) * (0.1466666666666667 * 1.3636363636363635);
                        n9 = 8199 & 4961;
                        if (d3 < 0.8428571428571429 * 0.5932203389830508) {
                            n9 = 16898 & 7338;
                        }
                        if (d3 > 1.5106382978723405 * 0.5957746478873239) {
                            n9 = 4104 & 8772;
                        }
                    }
                    d = d2;
                    if (j < 0 || n10 * n10 + n11 * n11 >= n6 * n6 || n12 != 0 && (i + j & (65 & -32623)) == 0 || (object = (Object)class_33760.Field_33761[i + j * (151 & 10376)]) == (n8 = (int)((byte)(object2.Field_3793 * (1052 & 21255) + n9)))) continue;
                    class_33760.Field_33761[i + j * (5306 & 8384)] = n8;
                    class_33760.Method_33769(i, j);
                    n7 = 2567 & 425;
                }
            }
        }
    }

    public Class_1486 Method_40872(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        return this.Method_40868(class_23823, class_283).Method_33771(class_23823, class_283, class_626);
    }
}

