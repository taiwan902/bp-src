/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.vector.Vector3f
 */
import internal.org.lwjgl.util.vector.Vector3f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.Callable;

public class Class_44252
implements Class_2045 {
    private boolean Field_44253 = -25511 & 8197;
    private boolean Field_44254;
    public Class_39372 Field_44255;
    private static final Class_2080 Field_44256 = new Class_2080(Class_44252.Method_44264("\uc80c\uc80c\uc802\uc80e\uc808\uc80e\uc80a\uc80c\uc806\uc804\uc802\uc808\uc80e\uc802\uc80a\uc800\uc81a\uc810\uc81a\uc814\uc818\uc818\uc81a\uc810\uc810\uc81c\uc81e\uc816\uc812\uc81a\uc812\uc816\uc826\uc82c\uc824\uc82a\uc822\uc82a"));
    private final Class_34695 Field_44257;
    private final Class_24013 Field_44258;
    public float Field_44259;

    private void Method_44260(Class_23823 class_23823) {
        Class_31211 class_31211 = this.Field_44258.Method_24024(class_23823);
        Class_1956 class_1956 = class_23823.Method_23844();
        if (class_1956 != null) {
            boolean bl = class_31211.Method_31212();
            if (!bl) {
                Class_16867.Method_16973(2.0f, 2.0f, 2.0f);
            }
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public void Method_44261(boolean bl) {
        this.Field_44253 = bl;
    }

    public void Method_44262(Class_23823 class_23823, Class_31211 class_31211) {
        if (class_23823 != null) {
            Class_16867.Method_16961();
            Class_16867.Method_16973(0.3192771f * 1.5660378f, 0.022222223f * 22.5f, 0.15f * 3.3333333f);
            if (class_31211.Method_31217()) {
                Class_16867.Method_16940(5.2777777f * 34.105263f, 0.0f, 1.0f, 0.0f);
                Class_16867.Method_16943(0.2777778f * -1.8f, -3.125f * 0.16f, 1.3714286f * -0.3645833f);
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
                Class_16867.Method_16957();
                Class_33257.Field_33259.Method_33264(class_23823);
            } else {
                Class_16867.Method_16943(0.25287357f * -1.9772726f, -0.3736842f * 1.3380282f, -0.75555557f * 0.6617647f);
                this.Method_44277(class_31211, class_23823);
                if (class_23823.Method_23874()) {
                    this.Method_44263(class_31211);
                }
            }
            Class_16867.Method_16945();
        }
    }

    private void Method_44263(Class_31211 class_31211) {
        if (!Class_19426.Method_19570() || !Class_12440.Field_12441) {
            Class_16867.Method_16930((-30672 & 28680) != 0);
            Class_16867.Method_16936(-13405 & 542);
            Class_16867.Method_16931();
            Class_16867.Method_16951(770 & 25500, 2065 & 24577);
            this.Field_44257.Method_34707(Field_44256);
            if (Class_19426.Method_19570() && !this.Field_44254) {
                Class_25377.Method_25391();
            }
            Class_16867.Method_16934(7938 & 14143);
            Class_16867.Method_16961();
            Class_16867.Method_16973(12.721312f * 0.62886596f, 1.5849056f * 5.0476193f, 3.3461537f * 2.3908048f);
            float f = (float)(Class_18.Method_207() % (-6793777096626791431L & 6793777095661259704L)) / (2.2777777f * 1317.0732f) / (0.025974026f * 308.0f);
            Class_16867.Method_16943(f, 0.0f, 0.0f);
            Class_16867.Method_16940(-39.84375f * 1.254902f, 0.0f, 0.0f, 1.0f);
            this.Method_44279(class_31211, -8108819 & -8204082);
            Class_16867.Method_16945();
            Class_16867.Method_16961();
            Class_16867.Method_16973(0.31111112f * 25.714285f, 9.5f * 0.84210527f, 5.4634147f * 1.4642857f);
            float f2 = (float)(Class_18.Method_207() % (1367356235L & 4373087013577235353L)) / (0.8333333f * 5847.6f) / (5.1666665f * 1.5483872f);
            Class_16867.Method_16943(-f2, 0.0f, 0.0f);
            Class_16867.Method_16940(4.8f * 2.0833333f, 0.0f, 0.0f, 1.0f);
            this.Method_44279(class_31211, -6209332 & -2592052);
            Class_16867.Method_16945();
            Class_16867.Method_16934(5898 & 16176);
            Class_16867.Method_16951(2918 & 9107, -14581 & 13187);
            Class_16867.Method_16918();
            Class_16867.Method_16936(10883 & 5991);
            Class_16867.Method_16930((8451 & 20549) != 0);
            this.Field_44257.Method_34707(Class_24069.Field_24084);
            if (Class_19426.Method_19570() && !this.Field_44254) {
                Class_25377.Method_25385();
            }
        }
    }

    private static String Method_44264(String string) {
        int n = 8951;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_44252.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_44265(Class_31211 class_31211, int n, Class_23823 class_23823) {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(14439 & -32761, Class_29585.Field_29600);
        Class_4595[] arrclass_4595 = Class_4595.Method_4630();
        int n2 = arrclass_4595.length;
        for (int i = -32175 & 9252; i < n2; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            this.Method_44273(class_22385, class_31211.Method_31218(class_4595), n, class_23823);
        }
        this.Method_44273(class_22385, class_31211.Method_31214(), n, class_23823);
        class_7644.Method_7647();
    }

    public void Method_44266(Class_279 class_279) {
        this.Field_44258.Method_24019();
    }

    protected void Method_44267(Class_1956 class_1956, int n, String string) {
        this.Field_44258.Method_24026(class_1956, n, new Class_41302(string, "inventory"));
    }

    protected void Method_44268(Class_23823 class_23823, Class_31211 class_31211, Class_7673 class_7673) {
        this.Field_44257.Method_34707(Class_24069.Field_24084);
        this.Field_44257.Method_34709(Class_24069.Field_24084).Method_2065((16901 & 5248) != 0, (-8184 & 4358) != 0);
        this.Method_44260(class_23823);
        Class_16867.Method_16957();
        Class_16867.Method_16967(16964 & 6028, 1.1428572f * 0.0875f);
        Class_16867.Method_16947();
        Class_16867.Method_16984(922 & 13059, 1795 & 9039, -14447 & 10243, 1094 & 544);
        Class_16867.Method_16961();
        Class_15852 class_15852 = class_31211.Method_31215();
        class_15852.Method_15872(class_7673);
        if (this.Method_44282(class_15852.Method_15870(class_7673))) {
            Class_16867.Method_16908(9292 & 22038);
        }
        this.Method_44262(class_23823, class_31211);
        Class_16867.Method_16908(-31675 & 21541);
        Class_16867.Method_16945();
        Class_16867.Method_16942();
        Class_16867.Method_16952();
        this.Field_44257.Method_34707(Class_24069.Field_24084);
        this.Field_44257.Method_34709(Class_24069.Field_24084).Method_2067();
    }

    private void Method_44269(Class_22385 class_22385, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        class_22385.Method_22417(3207 & 16423, Class_29585.Field_29601);
        class_22385.Method_22443(n + (276 & 32), n2 + (17444 & 4368), 0.0).Method_22424(n5, n6, n7, n8).Method_22451();
        class_22385.Method_22443(n + (896 & 0), n2 + n4, 0.0).Method_22424(n5, n6, n7, n8).Method_22451();
        class_22385.Method_22443(n + n3, n2 + n4, 0.0).Method_22424(n5, n6, n7, n8).Method_22451();
        class_22385.Method_22443(n + n3, n2 + (16820 & 1096), 0.0).Method_22424(n5, n6, n7, n8).Method_22451();
        Class_7644.Method_7649().Method_7647();
    }

    public void Method_44270(Class_23823 class_23823, Class_859 class_859, Class_7673 class_7673) {
        if (class_23823 != null && class_859 != null) {
            Class_31211 class_31211 = this.Field_44258.Method_24024(class_23823);
            if (class_859 instanceof Class_626) {
                Class_626 class_626 = (Class_626)class_859;
                Class_1956 class_1956 = class_23823.Method_23844();
                Class_41302 class_41302 = null;
                if (class_1956 == Class_10527.Field_10609 && class_626.Field_659 != null) {
                    class_41302 = new Class_41302("fishing_rod_cast", "inventory");
                } else if (class_1956 == Class_10527.Field_10690 && class_626.Method_846() != null) {
                    int n = class_23823.Method_23861() - class_626.Method_849();
                    if (n >= (16438 & 787)) {
                        class_41302 = new Class_41302("bow_pulling_2", "inventory");
                    } else if (n > (2061 & -11217)) {
                        class_41302 = new Class_41302("bow_pulling_1", "inventory");
                    } else if (n > 0) {
                        class_41302 = new Class_41302("bow_pulling_0", "inventory");
                    }
                }
                if (class_41302 != null) {
                    class_31211 = this.Field_44258.Method_24021().Method_39380(class_41302);
                }
            }
            this.Method_44268(class_23823, class_31211, class_7673);
        }
    }

    public void Method_44271(Class_28636 class_28636, Class_23823 class_23823, int n, int n2, String string) {
        if (class_23823 != null) {
            if (class_23823.Field_23826 != (-12575 & 4355) || string != null) {
                String string2;
                String string3 = string2 = string == null ? String.valueOf(class_23823.Field_23826) : string;
                if (string == null && class_23823.Field_23826 < (-7551 & 1381)) {
                    string2 = (Object)((Object)Class_5478.Field_5505) + String.valueOf(class_23823.Field_23826);
                }
                Class_16867.Method_16931();
                Class_16867.Method_16944();
                Class_16867.Method_16952();
                class_28636.Method_28729(string2, n + (11699 & 23) - (4194 & 1050) - class_28636.Method_28715(string2), n2 + (-30834 & 4102) + (26627 & 1483), 352321535 & 16777215);
                Class_16867.Method_16918();
                Class_16867.Method_16927();
            }
            if (class_23823.Method_23878()) {
                int n3 = (int)Math.round(5.28125 * 2.4615384615384617 - (double)class_23823.Method_23853() * (1.7647058823529411 * 7.366666666666667) / (double)class_23823.Method_23859());
                int n4 = (int)Math.round(1147.5 * 0.2222222222222222 - (double)class_23823.Method_23853() * (156.12244897959184 * 1.6333333333333333) / (double)class_23823.Method_23859());
                Class_16867.Method_16931();
                Class_16867.Method_16944();
                Class_16867.Method_16922();
                Class_16867.Method_16985();
                Class_16867.Method_16952();
                Class_7644 class_7644 = Class_7644.Method_7649();
                Class_22385 class_22385 = class_7644.Method_7648();
                this.Method_44269(class_22385, n + (-14773 & 4114), n2 + (-28387 & 3215), 205 & -15329, 27202 & -31465, 388 & 1544, 146 & -17920, 4241 & 3074, 8447 & -11009);
                this.Method_44269(class_22385, n + (17286 & 10275), n2 + (-32419 & 16399), 16606 & 8716, 55 & -30583, ((1023 & -30465) - n4) / (29188 & -32561), 212 & 10818, 16386 & 14400, 4863 & 17663);
                this.Method_44269(class_22385, n + (10274 & -27958), n2 + (2109 & 16911), n3, 8225 & -29671, (13055 & 19711) - n4, n4, 2048 & 4634, -2817 & 3071);
                Class_16867.Method_16947();
                Class_16867.Method_16913();
                Class_16867.Method_16965();
                Class_16867.Method_16918();
                Class_16867.Method_16927();
            }
        }
    }

    protected void Method_44272(Class_3238 class_3238, int n, String string) {
        this.Method_44267(Class_1956.Method_1981(class_3238), n, string);
    }

    private void Method_44273(Class_22385 class_22385, List list, int n, Class_23823 class_23823) {
        int n2 = n == (-1 & -1) && class_23823 != null ? 4505 & 3619 : 21536 & 134;
        int n3 = list.size();
        for (int i = -30956 & 30890; i < n3; ++i) {
            Class_14461 class_14461 = (Class_14461)list.get(i);
            int n4 = n;
            if (n2 != 0 && class_14461.Method_14474()) {
                n4 = class_23823.Method_23844().Method_1993(class_23823, class_14461.Method_14467());
                if (Class_22849.Field_22873) {
                    n4 = Class_18695.Method_18719(n4);
                }
                n4 |= -16768728 & -5635584;
            }
            this.Method_44276(class_22385, class_14461, n4);
        }
    }

    private void Method_44274(Class_3238 class_3238, String string) {
        this.Method_44272(class_3238, 10 & 4129, string);
    }

    private void Method_44275() {
        this.Method_44274(Class_9265.Field_9376, "anvil_intact");
        this.Method_44272(Class_9265.Field_9376, 18433 & -23825, "anvil_slightly_damaged");
        this.Method_44272(Class_9265.Field_9376, 16654 & 163, "anvil_very_damaged");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5404.Method_5419(), "black_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5406.Method_5419(), "blue_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5397.Method_5419(), "brown_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5408.Method_5419(), "cyan_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5407.Method_5419(), "gray_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5401.Method_5419(), "green_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5396.Method_5419(), "light_blue_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5402.Method_5419(), "lime_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5413.Method_5419(), "magenta_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5394.Method_5419(), "orange_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5417.Method_5419(), "pink_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5415.Method_5419(), "purple_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5418.Method_5419(), "red_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5409.Method_5419(), "silver_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5398.Method_5419(), "white_carpet");
        this.Method_44272(Class_9265.Field_9357, Class_5393.Field_5405.Method_5419(), "yellow_carpet");
        this.Method_44272(Class_9265.Field_9320, Class_31377.Field_31384.Method_31387(), "mossy_cobblestone_wall");
        this.Method_44272(Class_9265.Field_9320, Class_31377.Field_31381.Method_31387(), "cobblestone_wall");
        this.Method_44272(Class_9265.Field_9272, Class_4194.Field_4203.Method_4206(), "coarse_dirt");
        this.Method_44272(Class_9265.Field_9272, Class_4194.Field_4202.Method_4206(), "dirt");
        this.Method_44272(Class_9265.Field_9272, Class_4194.Field_4199.Method_4206(), "podzol");
        this.Method_44272(Class_9265.Field_9399, Class_37289.Field_37295.Method_37307(), "double_fern");
        this.Method_44272(Class_9265.Field_9399, Class_37289.Field_37300.Method_37307(), "double_grass");
        this.Method_44272(Class_9265.Field_9399, Class_37289.Field_37291.Method_37307(), "paeonia");
        this.Method_44272(Class_9265.Field_9399, Class_37289.Field_37292.Method_37307(), "double_rose");
        this.Method_44272(Class_9265.Field_9399, Class_37289.Field_37297.Method_37307(), "sunflower");
        this.Method_44272(Class_9265.Field_9399, Class_37289.Field_37293.Method_37307(), "syringa");
        this.Method_44272(Class_9265.Field_9421, Class_4231.Field_4242.Method_4247(), "birch_leaves");
        this.Method_44272(Class_9265.Field_9421, Class_4231.Field_4235.Method_4247(), "jungle_leaves");
        this.Method_44272(Class_9265.Field_9421, Class_4231.Field_4238.Method_4247(), "oak_leaves");
        this.Method_44272(Class_9265.Field_9421, Class_4231.Field_4236.Method_4247(), "spruce_leaves");
        this.Method_44272(Class_9265.Field_9440, Class_4231.Field_4243.Method_4247() - (-31833 & 4), "acacia_leaves");
        this.Method_44272(Class_9265.Field_9440, Class_4231.Field_4233.Method_4247() - (4100 & 2279), "dark_oak_leaves");
        this.Method_44272(Class_9265.Field_9383, Class_4231.Field_4242.Method_4247(), "birch_log");
        this.Method_44272(Class_9265.Field_9383, Class_4231.Field_4235.Method_4247(), "jungle_log");
        this.Method_44272(Class_9265.Field_9383, Class_4231.Field_4238.Method_4247(), "oak_log");
        this.Method_44272(Class_9265.Field_9383, Class_4231.Field_4236.Method_4247(), "spruce_log");
        this.Method_44272(Class_9265.Field_9447, Class_4231.Field_4243.Method_4247() - (13 & -4060), "acacia_log");
        this.Method_44272(Class_9265.Field_9447, Class_4231.Field_4233.Method_4247() - (26125 & 276), "dark_oak_log");
        this.Method_44272(Class_9265.Field_9384, Class_30961.Field_30971.Method_30999(), "chiseled_brick_monster_egg");
        this.Method_44272(Class_9265.Field_9384, Class_30961.Field_30967.Method_30999(), "cobblestone_monster_egg");
        this.Method_44272(Class_9265.Field_9384, Class_30961.Field_30969.Method_30999(), "cracked_brick_monster_egg");
        this.Method_44272(Class_9265.Field_9384, Class_30961.Field_30962.Method_30999(), "mossy_brick_monster_egg");
        this.Method_44272(Class_9265.Field_9384, Class_30961.Field_30965.Method_30999(), "stone_monster_egg");
        this.Method_44272(Class_9265.Field_9384, Class_30961.Field_30963.Method_30999(), "stone_brick_monster_egg");
        this.Method_44272(Class_9265.Field_9379, Class_4231.Field_4243.Method_4247(), "acacia_planks");
        this.Method_44272(Class_9265.Field_9379, Class_4231.Field_4242.Method_4247(), "birch_planks");
        this.Method_44272(Class_9265.Field_9379, Class_4231.Field_4233.Method_4247(), "dark_oak_planks");
        this.Method_44272(Class_9265.Field_9379, Class_4231.Field_4235.Method_4247(), "jungle_planks");
        this.Method_44272(Class_9265.Field_9379, Class_4231.Field_4238.Method_4247(), "oak_planks");
        this.Method_44272(Class_9265.Field_9379, Class_4231.Field_4236.Method_4247(), "spruce_planks");
        this.Method_44272(Class_9265.Field_9424, Class_40915.Field_40921.Method_40937(), "prismarine_bricks");
        this.Method_44272(Class_9265.Field_9424, Class_40915.Field_40920.Method_40937(), "dark_prismarine");
        this.Method_44272(Class_9265.Field_9424, Class_40915.Field_40922.Method_40937(), "prismarine");
        this.Method_44272(Class_9265.Field_9290, Class_33895.Field_33898.Method_33913(), "chiseled_quartz_block");
        this.Method_44272(Class_9265.Field_9290, Class_33895.Field_33899.Method_33913(), "quartz_block");
        this.Method_44272(Class_9265.Field_9290, Class_33895.Field_33902.Method_33913(), "quartz_column");
        this.Method_44272(Class_9265.Field_9402, Class_5607.Field_5623.Method_5652(), "allium");
        this.Method_44272(Class_9265.Field_9402, Class_5607.Field_5621.Method_5652(), "blue_orchid");
        this.Method_44272(Class_9265.Field_9402, Class_5607.Field_5617.Method_5652(), "houstonia");
        this.Method_44272(Class_9265.Field_9402, Class_5607.Field_5622.Method_5652(), "orange_tulip");
        this.Method_44272(Class_9265.Field_9402, Class_5607.Field_5614.Method_5652(), "oxeye_daisy");
        this.Method_44272(Class_9265.Field_9402, Class_5607.Field_5616.Method_5652(), "pink_tulip");
        this.Method_44272(Class_9265.Field_9402, Class_5607.Field_5613.Method_5652(), "poppy");
        this.Method_44272(Class_9265.Field_9402, Class_5607.Field_5609.Method_5652(), "red_tulip");
        this.Method_44272(Class_9265.Field_9402, Class_5607.Field_5618.Method_5652(), "white_tulip");
        this.Method_44272(Class_9265.Field_9394, Class_4508.Field_4512.Method_4525(), "red_sand");
        this.Method_44272(Class_9265.Field_9394, Class_4508.Field_4510.Method_4525(), "sand");
        this.Method_44272(Class_9265.Field_9366, Class_5059.Field_5063.Method_5081(), "chiseled_sandstone");
        this.Method_44272(Class_9265.Field_9366, Class_5059.Field_5064.Method_5081(), "sandstone");
        this.Method_44272(Class_9265.Field_9366, Class_5059.Field_5061.Method_5081(), "smooth_sandstone");
        this.Method_44272(Class_9265.Field_9330, Class_32154.Field_32162.Method_32178(), "chiseled_red_sandstone");
        this.Method_44272(Class_9265.Field_9330, Class_32154.Field_32156.Method_32178(), "red_sandstone");
        this.Method_44272(Class_9265.Field_9330, Class_32154.Field_32161.Method_32178(), "smooth_red_sandstone");
        this.Method_44272(Class_9265.Field_9389, Class_4231.Field_4243.Method_4247(), "acacia_sapling");
        this.Method_44272(Class_9265.Field_9389, Class_4231.Field_4242.Method_4247(), "birch_sapling");
        this.Method_44272(Class_9265.Field_9389, Class_4231.Field_4233.Method_4247(), "dark_oak_sapling");
        this.Method_44272(Class_9265.Field_9389, Class_4231.Field_4235.Method_4247(), "jungle_sapling");
        this.Method_44272(Class_9265.Field_9389, Class_4231.Field_4238.Method_4247(), "oak_sapling");
        this.Method_44272(Class_9265.Field_9389, Class_4231.Field_4236.Method_4247(), "spruce_sapling");
        this.Method_44272(Class_9265.Field_9453, 22544 & 64, "sponge");
        this.Method_44272(Class_9265.Field_9453, 16519 & 8569, "sponge_wet");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5404.Method_5419(), "black_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5406.Method_5419(), "blue_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5397.Method_5419(), "brown_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5408.Method_5419(), "cyan_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5407.Method_5419(), "gray_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5401.Method_5419(), "green_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5396.Method_5419(), "light_blue_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5402.Method_5419(), "lime_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5413.Method_5419(), "magenta_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5394.Method_5419(), "orange_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5417.Method_5419(), "pink_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5415.Method_5419(), "purple_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5418.Method_5419(), "red_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5409.Method_5419(), "silver_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5398.Method_5419(), "white_stained_glass");
        this.Method_44272(Class_9265.Field_9344, Class_5393.Field_5405.Method_5419(), "yellow_stained_glass");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5404.Method_5419(), "black_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5406.Method_5419(), "blue_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5397.Method_5419(), "brown_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5408.Method_5419(), "cyan_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5407.Method_5419(), "gray_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5401.Method_5419(), "green_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5396.Method_5419(), "light_blue_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5402.Method_5419(), "lime_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5413.Method_5419(), "magenta_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5394.Method_5419(), "orange_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5417.Method_5419(), "pink_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5415.Method_5419(), "purple_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5418.Method_5419(), "red_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5409.Method_5419(), "silver_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5398.Method_5419(), "white_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9309, Class_5393.Field_5405.Method_5419(), "yellow_stained_glass_pane");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5404.Method_5419(), "black_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5406.Method_5419(), "blue_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5397.Method_5419(), "brown_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5408.Method_5419(), "cyan_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5407.Method_5419(), "gray_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5401.Method_5419(), "green_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5396.Method_5419(), "light_blue_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5402.Method_5419(), "lime_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5413.Method_5419(), "magenta_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5394.Method_5419(), "orange_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5417.Method_5419(), "pink_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5415.Method_5419(), "purple_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5418.Method_5419(), "red_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5409.Method_5419(), "silver_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5398.Method_5419(), "white_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9274, Class_5393.Field_5405.Method_5419(), "yellow_stained_hardened_clay");
        this.Method_44272(Class_9265.Field_9446, Class_3915.Field_3924.Method_3947(), "andesite");
        this.Method_44272(Class_9265.Field_9446, Class_3915.Field_3923.Method_3947(), "andesite_smooth");
        this.Method_44272(Class_9265.Field_9446, Class_3915.Field_3916.Method_3947(), "diorite");
        this.Method_44272(Class_9265.Field_9446, Class_3915.Field_3926.Method_3947(), "diorite_smooth");
        this.Method_44272(Class_9265.Field_9446, Class_3915.Field_3925.Method_3947(), "granite");
        this.Method_44272(Class_9265.Field_9446, Class_3915.Field_3922.Method_3947(), "granite_smooth");
        this.Method_44272(Class_9265.Field_9446, Class_3915.Field_3921.Method_3947(), "stone");
        this.Method_44272(Class_9265.Field_9300, Class_39537.Field_39545.Method_39554(), "cracked_stonebrick");
        this.Method_44272(Class_9265.Field_9300, Class_39537.Field_39546.Method_39554(), "stonebrick");
        this.Method_44272(Class_9265.Field_9300, Class_39537.Field_39539.Method_39554(), "chiseled_stonebrick");
        this.Method_44272(Class_9265.Field_9300, Class_39537.Field_39541.Method_39554(), "mossy_stonebrick");
        this.Method_44272(Class_9265.Field_9430, Class_5750.Field_5751.Method_5768(), "brick_slab");
        this.Method_44272(Class_9265.Field_9430, Class_5750.Field_5758.Method_5768(), "cobblestone_slab");
        this.Method_44272(Class_9265.Field_9430, Class_5750.Field_5763.Method_5768(), "old_wood_slab");
        this.Method_44272(Class_9265.Field_9430, Class_5750.Field_5754.Method_5768(), "nether_brick_slab");
        this.Method_44272(Class_9265.Field_9430, Class_5750.Field_5761.Method_5768(), "quartz_slab");
        this.Method_44272(Class_9265.Field_9430, Class_5750.Field_5764.Method_5768(), "sandstone_slab");
        this.Method_44272(Class_9265.Field_9430, Class_5750.Field_5753.Method_5768(), "stone_brick_slab");
        this.Method_44272(Class_9265.Field_9430, Class_5750.Field_5755.Method_5768(), "stone_slab");
        this.Method_44272(Class_9265.Field_9463, Class_34956.Field_34960.Method_34972(), "red_sandstone_slab");
        this.Method_44272(Class_9265.Field_9278, Class_5341.Field_5346.Method_5356(), "dead_bush");
        this.Method_44272(Class_9265.Field_9278, Class_5341.Field_5348.Method_5356(), "fern");
        this.Method_44272(Class_9265.Field_9278, Class_5341.Field_5345.Method_5356(), "tall_grass");
        this.Method_44272(Class_9265.Field_9460, Class_4231.Field_4243.Method_4247(), "acacia_slab");
        this.Method_44272(Class_9265.Field_9460, Class_4231.Field_4242.Method_4247(), "birch_slab");
        this.Method_44272(Class_9265.Field_9460, Class_4231.Field_4233.Method_4247(), "dark_oak_slab");
        this.Method_44272(Class_9265.Field_9460, Class_4231.Field_4235.Method_4247(), "jungle_slab");
        this.Method_44272(Class_9265.Field_9460, Class_4231.Field_4238.Method_4247(), "oak_slab");
        this.Method_44272(Class_9265.Field_9460, Class_4231.Field_4236.Method_4247(), "spruce_slab");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5404.Method_5419(), "black_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5406.Method_5419(), "blue_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5397.Method_5419(), "brown_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5408.Method_5419(), "cyan_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5407.Method_5419(), "gray_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5401.Method_5419(), "green_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5396.Method_5419(), "light_blue_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5402.Method_5419(), "lime_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5413.Method_5419(), "magenta_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5394.Method_5419(), "orange_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5417.Method_5419(), "pink_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5415.Method_5419(), "purple_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5418.Method_5419(), "red_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5409.Method_5419(), "silver_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5398.Method_5419(), "white_wool");
        this.Method_44272(Class_9265.Field_9326, Class_5393.Field_5405.Method_5419(), "yellow_wool");
        this.Method_44274(Class_9265.Field_9349, "acacia_stairs");
        this.Method_44274(Class_9265.Field_9375, "activator_rail");
        this.Method_44274(Class_9265.Field_9336, "beacon");
        this.Method_44274(Class_9265.Field_9414, "bedrock");
        this.Method_44274(Class_9265.Field_9369, "birch_stairs");
        this.Method_44274(Class_9265.Field_9339, "bookshelf");
        this.Method_44274(Class_9265.Field_9377, "brick_block");
        this.Method_44274(Class_9265.Field_9377, "brick_block");
        this.Method_44274(Class_9265.Field_9427, "brick_stairs");
        this.Method_44274(Class_9265.Field_9312, "brown_mushroom");
        this.Method_44274(Class_9265.Field_9405, "cactus");
        this.Method_44274(Class_9265.Field_9385, "clay");
        this.Method_44274(Class_9265.Field_9387, "coal_block");
        this.Method_44274(Class_9265.Field_9268, "coal_ore");
        this.Method_44274(Class_9265.Field_9373, "cobblestone");
        this.Method_44274(Class_9265.Field_9433, "crafting_table");
        this.Method_44274(Class_9265.Field_9315, "dark_oak_stairs");
        this.Method_44274(Class_9265.Field_9393, "daylight_detector");
        this.Method_44274(Class_9265.Field_9397, "dead_bush");
        this.Method_44274(Class_9265.Field_9396, "detector_rail");
        this.Method_44274(Class_9265.Field_9388, "diamond_block");
        this.Method_44274(Class_9265.Field_9287, "diamond_ore");
        this.Method_44274(Class_9265.Field_9338, "dispenser");
        this.Method_44274(Class_9265.Field_9280, "dropper");
        this.Method_44274(Class_9265.Field_9304, "emerald_block");
        this.Method_44274(Class_9265.Field_9327, "emerald_ore");
        this.Method_44274(Class_9265.Field_9455, "enchanting_table");
        this.Method_44274(Class_9265.Field_9456, "end_portal_frame");
        this.Method_44274(Class_9265.Field_9275, "end_stone");
        this.Method_44274(Class_9265.Field_9437, "oak_fence");
        this.Method_44274(Class_9265.Field_9267, "spruce_fence");
        this.Method_44274(Class_9265.Field_9407, "birch_fence");
        this.Method_44274(Class_9265.Field_9317, "jungle_fence");
        this.Method_44274(Class_9265.Field_9449, "dark_oak_fence");
        this.Method_44274(Class_9265.Field_9340, "acacia_fence");
        this.Method_44274(Class_9265.Field_9426, "oak_fence_gate");
        this.Method_44274(Class_9265.Field_9371, "spruce_fence_gate");
        this.Method_44274(Class_9265.Field_9359, "birch_fence_gate");
        this.Method_44274(Class_9265.Field_9422, "jungle_fence_gate");
        this.Method_44274(Class_9265.Field_9306, "dark_oak_fence_gate");
        this.Method_44274(Class_9265.Field_9318, "acacia_fence_gate");
        this.Method_44274(Class_9265.Field_9354, "furnace");
        this.Method_44274(Class_9265.Field_9345, "glass");
        this.Method_44274(Class_9265.Field_9419, "glass_pane");
        this.Method_44274(Class_9265.Field_9334, "glowstone");
        this.Method_44274(Class_9265.Field_9335, "golden_rail");
        this.Method_44274(Class_9265.Field_9283, "gold_block");
        this.Method_44274(Class_9265.Field_9444, "gold_ore");
        this.Method_44274(Class_9265.Field_9319, "grass");
        this.Method_44274(Class_9265.Field_9360, "gravel");
        this.Method_44274(Class_9265.Field_9411, "hardened_clay");
        this.Method_44274(Class_9265.Field_9431, "hay_block");
        this.Method_44274(Class_9265.Field_9269, "heavy_weighted_pressure_plate");
        this.Method_44274(Class_9265.Field_9432, "hopper");
        this.Method_44274(Class_9265.Field_9298, "ice");
        this.Method_44274(Class_9265.Field_9331, "iron_bars");
        this.Method_44274(Class_9265.Field_9348, "iron_block");
        this.Method_44274(Class_9265.Field_9333, "iron_ore");
        this.Method_44274(Class_9265.Field_9417, "iron_trapdoor");
        this.Method_44274(Class_9265.Field_9442, "jukebox");
        this.Method_44274(Class_9265.Field_9299, "jungle_stairs");
        this.Method_44274(Class_9265.Field_9350, "ladder");
        this.Method_44274(Class_9265.Field_9321, "lapis_block");
        this.Method_44274(Class_9265.Field_9332, "lapis_ore");
        this.Method_44274(Class_9265.Field_9325, "lever");
        this.Method_44274(Class_9265.Field_9288, "light_weighted_pressure_plate");
        this.Method_44274(Class_9265.Field_9284, "lit_pumpkin");
        this.Method_44274(Class_9265.Field_9459, "melon_block");
        this.Method_44274(Class_9265.Field_9410, "mossy_cobblestone");
        this.Method_44274(Class_9265.Field_9436, "mycelium");
        this.Method_44274(Class_9265.Field_9368, "netherrack");
        this.Method_44274(Class_9265.Field_9450, "nether_brick");
        this.Method_44274(Class_9265.Field_9428, "nether_brick_fence");
        this.Method_44274(Class_9265.Field_9438, "nether_brick_stairs");
        this.Method_44274(Class_9265.Field_9454, "noteblock");
        this.Method_44274(Class_9265.Field_9302, "oak_stairs");
        this.Method_44274(Class_9265.Field_9445, "obsidian");
        this.Method_44274(Class_9265.Field_9297, "packed_ice");
        this.Method_44274(Class_9265.Field_9270, "piston");
        this.Method_44274(Class_9265.Field_9337, "pumpkin");
        this.Method_44274(Class_9265.Field_9448, "quartz_ore");
        this.Method_44274(Class_9265.Field_9400, "quartz_stairs");
        this.Method_44274(Class_9265.Field_9401, "rail");
        this.Method_44274(Class_9265.Field_9329, "redstone_block");
        this.Method_44274(Class_9265.Field_9316, "redstone_lamp");
        this.Method_44274(Class_9265.Field_9305, "redstone_ore");
        this.Method_44274(Class_9265.Field_9273, "redstone_torch");
        this.Method_44274(Class_9265.Field_9429, "red_mushroom");
        this.Method_44274(Class_9265.Field_9416, "sandstone_stairs");
        this.Method_44274(Class_9265.Field_9361, "red_sandstone_stairs");
        this.Method_44274(Class_9265.Field_9324, "sea_lantern");
        this.Method_44274(Class_9265.Field_9406, "slime");
        this.Method_44274(Class_9265.Field_9413, "snow");
        this.Method_44274(Class_9265.Field_9458, "snow_layer");
        this.Method_44274(Class_9265.Field_9363, "soul_sand");
        this.Method_44274(Class_9265.Field_9343, "spruce_stairs");
        this.Method_44274(Class_9265.Field_9341, "sticky_piston");
        this.Method_44274(Class_9265.Field_9307, "stone_brick_stairs");
        this.Method_44274(Class_9265.Field_9386, "stone_button");
        this.Method_44274(Class_9265.Field_9408, "stone_pressure_plate");
        this.Method_44274(Class_9265.Field_9390, "stone_stairs");
        this.Method_44274(Class_9265.Field_9462, "tnt");
        this.Method_44274(Class_9265.Field_9293, "torch");
        this.Method_44274(Class_9265.Field_9296, "trapdoor");
        this.Method_44274(Class_9265.Field_9266, "tripwire_hook");
        this.Method_44274(Class_9265.Field_9323, "vine");
        this.Method_44274(Class_9265.Field_9303, "waterlily");
        this.Method_44274(Class_9265.Field_9415, "web");
        this.Method_44274(Class_9265.Field_9378, "wooden_button");
        this.Method_44274(Class_9265.Field_9395, "wooden_pressure_plate");
        this.Method_44272(Class_9265.Field_9353, Class_5607.Field_5615.Method_5652(), "dandelion");
        this.Method_44274(Class_9265.Field_9420, "chest");
        this.Method_44274(Class_9265.Field_9294, "trapped_chest");
        this.Method_44274(Class_9265.Field_9372, "ender_chest");
        this.Method_44280(Class_10527.Field_10591, "iron_shovel");
        this.Method_44280(Class_10527.Field_10552, "iron_pickaxe");
        this.Method_44280(Class_10527.Field_10555, "iron_axe");
        this.Method_44280(Class_10527.Field_10615, "flint_and_steel");
        this.Method_44280(Class_10527.Field_10676, "apple");
        this.Method_44267(Class_10527.Field_10690, 2332 & 4320, "bow");
        this.Method_44267(Class_10527.Field_10690, 29017 & 515, "bow_pulling_0");
        this.Method_44267(Class_10527.Field_10690, 67 & 30470, "bow_pulling_1");
        this.Method_44267(Class_10527.Field_10690, 4323 & -7661, "bow_pulling_2");
        this.Method_44280(Class_10527.Field_10568, "arrow");
        this.Method_44267(Class_10527.Field_10698, -16208 & 8196, "coal");
        this.Method_44267(Class_10527.Field_10698, 2049 & -16023, "charcoal");
        this.Method_44280(Class_10527.Field_10673, "diamond");
        this.Method_44280(Class_10527.Field_10565, "iron_ingot");
        this.Method_44280(Class_10527.Field_10705, "gold_ingot");
        this.Method_44280(Class_10527.Field_10708, "iron_sword");
        this.Method_44280(Class_10527.Field_10543, "wooden_sword");
        this.Method_44280(Class_10527.Field_10652, "wooden_shovel");
        this.Method_44280(Class_10527.Field_10571, "wooden_pickaxe");
        this.Method_44280(Class_10527.Field_10608, "wooden_axe");
        this.Method_44280(Class_10527.Field_10566, "stone_sword");
        this.Method_44280(Class_10527.Field_10590, "stone_shovel");
        this.Method_44280(Class_10527.Field_10592, "stone_pickaxe");
        this.Method_44280(Class_10527.Field_10685, "stone_axe");
        this.Method_44280(Class_10527.Field_10618, "diamond_sword");
        this.Method_44280(Class_10527.Field_10654, "diamond_shovel");
        this.Method_44280(Class_10527.Field_10710, "diamond_pickaxe");
        this.Method_44280(Class_10527.Field_10674, "diamond_axe");
        this.Method_44280(Class_10527.Field_10616, "stick");
        this.Method_44280(Class_10527.Field_10559, "bowl");
        this.Method_44280(Class_10527.Field_10563, "mushroom_stew");
        this.Method_44280(Class_10527.Field_10642, "golden_sword");
        this.Method_44280(Class_10527.Field_10548, "golden_shovel");
        this.Method_44280(Class_10527.Field_10655, "golden_pickaxe");
        this.Method_44280(Class_10527.Field_10586, "golden_axe");
        this.Method_44280(Class_10527.Field_10624, "string");
        this.Method_44280(Class_10527.Field_10658, "feather");
        this.Method_44280(Class_10527.Field_10579, "gunpowder");
        this.Method_44280(Class_10527.Field_10709, "wooden_hoe");
        this.Method_44280(Class_10527.Field_10637, "stone_hoe");
        this.Method_44280(Class_10527.Field_10597, "iron_hoe");
        this.Method_44280(Class_10527.Field_10582, "diamond_hoe");
        this.Method_44280(Class_10527.Field_10653, "golden_hoe");
        this.Method_44280(Class_10527.Field_10622, "wheat_seeds");
        this.Method_44280(Class_10527.Field_10621, "wheat");
        this.Method_44280(Class_10527.Field_10630, "bread");
        this.Method_44280(Class_10527.Field_10547, "leather_helmet");
        this.Method_44280(Class_10527.Field_10619, "leather_chestplate");
        this.Method_44280(Class_10527.Field_10549, "leather_leggings");
        this.Method_44280(Class_10527.Field_10640, "leather_boots");
        this.Method_44280(Class_10527.Field_10544, "chainmail_helmet");
        this.Method_44280(Class_10527.Field_10693, "chainmail_chestplate");
        this.Method_44280(Class_10527.Field_10601, "chainmail_leggings");
        this.Method_44280(Class_10527.Field_10613, "chainmail_boots");
        this.Method_44280(Class_10527.Field_10667, "iron_helmet");
        this.Method_44280(Class_10527.Field_10600, "iron_chestplate");
        this.Method_44280(Class_10527.Field_10628, "iron_leggings");
        this.Method_44280(Class_10527.Field_10686, "iron_boots");
        this.Method_44280(Class_10527.Field_10599, "diamond_helmet");
        this.Method_44280(Class_10527.Field_10714, "diamond_chestplate");
        this.Method_44280(Class_10527.Field_10672, "diamond_leggings");
        this.Method_44280(Class_10527.Field_10529, "diamond_boots");
        this.Method_44280(Class_10527.Field_10596, "golden_helmet");
        this.Method_44280(Class_10527.Field_10683, "golden_chestplate");
        this.Method_44280(Class_10527.Field_10636, "golden_leggings");
        this.Method_44280(Class_10527.Field_10635, "golden_boots");
        this.Method_44280(Class_10527.Field_10567, "flint");
        this.Method_44280(Class_10527.Field_10587, "porkchop");
        this.Method_44280(Class_10527.Field_10598, "cooked_porkchop");
        this.Method_44280(Class_10527.Field_10531, "painting");
        this.Method_44280(Class_10527.Field_10669, "golden_apple");
        this.Method_44267(Class_10527.Field_10669, -26871 & 129, "golden_apple");
        this.Method_44280(Class_10527.Field_10602, "sign");
        this.Method_44280(Class_10527.Field_10670, "oak_door");
        this.Method_44280(Class_10527.Field_10697, "spruce_door");
        this.Method_44280(Class_10527.Field_10593, "birch_door");
        this.Method_44280(Class_10527.Field_10569, "jungle_door");
        this.Method_44280(Class_10527.Field_10664, "acacia_door");
        this.Method_44280(Class_10527.Field_10556, "dark_oak_door");
        this.Method_44280(Class_10527.Field_10639, "bucket");
        this.Method_44280(Class_10527.Field_10695, "water_bucket");
        this.Method_44280(Class_10527.Field_10572, "lava_bucket");
        this.Method_44280(Class_10527.Field_10528, "minecart");
        this.Method_44280(Class_10527.Field_10594, "saddle");
        this.Method_44280(Class_10527.Field_10656, "iron_door");
        this.Method_44280(Class_10527.Field_10564, "redstone");
        this.Method_44280(Class_10527.Field_10561, "snowball");
        this.Method_44280(Class_10527.Field_10696, "boat");
        this.Method_44280(Class_10527.Field_10620, "leather");
        this.Method_44280(Class_10527.Field_10612, "milk_bucket");
        this.Method_44280(Class_10527.Field_10638, "brick");
        this.Method_44280(Class_10527.Field_10611, "clay_ball");
        this.Method_44280(Class_10527.Field_10634, "reeds");
        this.Method_44280(Class_10527.Field_10703, "paper");
        this.Method_44280(Class_10527.Field_10629, "book");
        this.Method_44280(Class_10527.Field_10632, "slime_ball");
        this.Method_44280(Class_10527.Field_10706, "chest_minecart");
        this.Method_44280(Class_10527.Field_10704, "furnace_minecart");
        this.Method_44280(Class_10527.Field_10545, "egg");
        this.Method_44280(Class_10527.Field_10633, "compass");
        this.Method_44280(Class_10527.Field_10609, "fishing_rod");
        this.Method_44267(Class_10527.Field_10609, -32431 & 16385, "fishing_rod_cast");
        this.Method_44280(Class_10527.Field_10534, "clock");
        this.Method_44280(Class_10527.Field_10712, "glowstone_dust");
        this.Method_44267(Class_10527.Field_10689, Class_18525.Field_18528.Method_18548(), "cod");
        this.Method_44267(Class_10527.Field_10689, Class_18525.Field_18526.Method_18548(), "salmon");
        this.Method_44267(Class_10527.Field_10689, Class_18525.Field_18533.Method_18548(), "clownfish");
        this.Method_44267(Class_10527.Field_10689, Class_18525.Field_18527.Method_18548(), "pufferfish");
        this.Method_44267(Class_10527.Field_10614, Class_18525.Field_18528.Method_18548(), "cooked_cod");
        this.Method_44267(Class_10527.Field_10614, Class_18525.Field_18526.Method_18548(), "cooked_salmon");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5404.Method_5436(), "dye_black");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5418.Method_5436(), "dye_red");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5401.Method_5436(), "dye_green");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5397.Method_5436(), "dye_brown");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5406.Method_5436(), "dye_blue");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5415.Method_5436(), "dye_purple");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5408.Method_5436(), "dye_cyan");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5409.Method_5436(), "dye_silver");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5407.Method_5436(), "dye_gray");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5417.Method_5436(), "dye_pink");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5402.Method_5436(), "dye_lime");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5405.Method_5436(), "dye_yellow");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5396.Method_5436(), "dye_light_blue");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5413.Method_5436(), "dye_magenta");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5394.Method_5436(), "dye_orange");
        this.Method_44267(Class_10527.Field_10623, Class_5393.Field_5398.Method_5436(), "dye_white");
        this.Method_44280(Class_10527.Field_10603, "bone");
        this.Method_44280(Class_10527.Field_10577, "sugar");
        this.Method_44280(Class_10527.Field_10679, "cake");
        this.Method_44280(Class_10527.Field_10604, "bed");
        this.Method_44280(Class_10527.Field_10691, "repeater");
        this.Method_44280(Class_10527.Field_10688, "cookie");
        this.Method_44280(Class_10527.Field_10606, "shears");
        this.Method_44280(Class_10527.Field_10541, "melon");
        this.Method_44280(Class_10527.Field_10578, "pumpkin_seeds");
        this.Method_44280(Class_10527.Field_10576, "melon_seeds");
        this.Method_44280(Class_10527.Field_10684, "beef");
        this.Method_44280(Class_10527.Field_10589, "cooked_beef");
        this.Method_44280(Class_10527.Field_10551, "chicken");
        this.Method_44280(Class_10527.Field_10646, "cooked_chicken");
        this.Method_44280(Class_10527.Field_10560, "rabbit");
        this.Method_44280(Class_10527.Field_10558, "cooked_rabbit");
        this.Method_44280(Class_10527.Field_10537, "mutton");
        this.Method_44280(Class_10527.Field_10626, "cooked_mutton");
        this.Method_44280(Class_10527.Field_10694, "rabbit_foot");
        this.Method_44280(Class_10527.Field_10649, "rabbit_hide");
        this.Method_44280(Class_10527.Field_10557, "rabbit_stew");
        this.Method_44280(Class_10527.Field_10574, "rotten_flesh");
        this.Method_44280(Class_10527.Field_10644, "ender_pearl");
        this.Method_44280(Class_10527.Field_10682, "blaze_rod");
        this.Method_44280(Class_10527.Field_10663, "ghast_tear");
        this.Method_44280(Class_10527.Field_10581, "gold_nugget");
        this.Method_44280(Class_10527.Field_10675, "nether_wart");
        this.Field_44258.Method_24022(Class_10527.Field_10687, new Class_17552(this));
        this.Method_44280(Class_10527.Field_10666, "glass_bottle");
        this.Method_44280(Class_10527.Field_10680, "spider_eye");
        this.Method_44280(Class_10527.Field_10661, "fermented_spider_eye");
        this.Method_44280(Class_10527.Field_10533, "blaze_powder");
        this.Method_44280(Class_10527.Field_10657, "magma_cream");
        this.Method_44280(Class_10527.Field_10580, "brewing_stand");
        this.Method_44280(Class_10527.Field_10617, "cauldron");
        this.Method_44280(Class_10527.Field_10660, "ender_eye");
        this.Method_44280(Class_10527.Field_10570, "speckled_melon");
        this.Field_44258.Method_24022(Class_10527.Field_10573, new Class_18207(this));
        this.Method_44280(Class_10527.Field_10643, "experience_bottle");
        this.Method_44280(Class_10527.Field_10627, "fire_charge");
        this.Method_44280(Class_10527.Field_10662, "writable_book");
        this.Method_44280(Class_10527.Field_10707, "emerald");
        this.Method_44280(Class_10527.Field_10588, "item_frame");
        this.Method_44280(Class_10527.Field_10665, "flower_pot");
        this.Method_44280(Class_10527.Field_10713, "carrot");
        this.Method_44280(Class_10527.Field_10584, "potato");
        this.Method_44280(Class_10527.Field_10699, "baked_potato");
        this.Method_44280(Class_10527.Field_10540, "poisonous_potato");
        this.Method_44280(Class_10527.Field_10641, "map");
        this.Method_44280(Class_10527.Field_10681, "golden_carrot");
        this.Method_44267(Class_10527.Field_10702, 272 & 21184, "skull_skeleton");
        this.Method_44267(Class_10527.Field_10702, 16643 & 569, "skull_wither");
        this.Method_44267(Class_10527.Field_10702, -24250 & 562, "skull_zombie");
        this.Method_44267(Class_10527.Field_10702, 4259 & -21945, "skull_char");
        this.Method_44267(Class_10527.Field_10702, -11508 & 68, "skull_creeper");
        this.Method_44280(Class_10527.Field_10553, "carrot_on_a_stick");
        this.Method_44280(Class_10527.Field_10678, "nether_star");
        this.Method_44280(Class_10527.Field_10546, "pumpkin_pie");
        this.Method_44280(Class_10527.Field_10535, "firework_charge");
        this.Method_44280(Class_10527.Field_10538, "comparator");
        this.Method_44280(Class_10527.Field_10530, "netherbrick");
        this.Method_44280(Class_10527.Field_10532, "quartz");
        this.Method_44280(Class_10527.Field_10645, "tnt_minecart");
        this.Method_44280(Class_10527.Field_10610, "hopper_minecart");
        this.Method_44280(Class_10527.Field_10651, "armor_stand");
        this.Method_44280(Class_10527.Field_10562, "iron_horse_armor");
        this.Method_44280(Class_10527.Field_10647, "golden_horse_armor");
        this.Method_44280(Class_10527.Field_10542, "diamond_horse_armor");
        this.Method_44280(Class_10527.Field_10536, "lead");
        this.Method_44280(Class_10527.Field_10668, "name_tag");
        this.Field_44258.Method_24022(Class_10527.Field_10711, new Class_14056(this));
        this.Method_44280(Class_10527.Field_10650, "record_13");
        this.Method_44280(Class_10527.Field_10700, "record_cat");
        this.Method_44280(Class_10527.Field_10659, "record_blocks");
        this.Method_44280(Class_10527.Field_10595, "record_chirp");
        this.Method_44280(Class_10527.Field_10605, "record_far");
        this.Method_44280(Class_10527.Field_10677, "record_mall");
        this.Method_44280(Class_10527.Field_10607, "record_mellohi");
        this.Method_44280(Class_10527.Field_10554, "record_stal");
        this.Method_44280(Class_10527.Field_10575, "record_strad");
        this.Method_44280(Class_10527.Field_10539, "record_ward");
        this.Method_44280(Class_10527.Field_10585, "record_11");
        this.Method_44280(Class_10527.Field_10648, "record_wait");
        this.Method_44280(Class_10527.Field_10692, "prismarine_shard");
        this.Method_44280(Class_10527.Field_10550, "prismarine_crystals");
        this.Field_44258.Method_24022(Class_10527.Field_10625, new Class_14513(this));
        this.Field_44258.Method_24022(Class_10527.Field_10701, new Class_27677(this));
        this.Method_44274(Class_9265.Field_9365, "command_block");
        this.Method_44280(Class_10527.Field_10583, "fireworks");
        this.Method_44280(Class_10527.Field_10631, "command_block_minecart");
        this.Method_44274(Class_9265.Field_9412, "barrier");
        this.Method_44274(Class_9265.Field_9279, "mob_spawner");
        this.Method_44280(Class_10527.Field_10671, "written_book");
        this.Method_44272(Class_9265.Field_9292, Class_47151.Field_47167.Method_47187(), "brown_mushroom_block");
        this.Method_44272(Class_9265.Field_9322, Class_47151.Field_47167.Method_47187(), "red_mushroom_block");
        this.Method_44274(Class_9265.Field_9418, "dragon_egg");
    }

    private void Method_44276(Class_22385 class_22385, Class_14461 class_14461, int n) {
        class_22385.Method_22414(class_14461.Method_14478());
        class_22385.Method_22439(n);
        this.Method_44286(class_22385, class_14461);
    }

    private void Method_44277(Class_31211 class_31211, Class_23823 class_23823) {
        this.Method_44265(class_31211, -1 & -1, class_23823);
    }

    public Class_44252(Class_34695 class_34695, Class_39372 class_39372) {
        this.Field_44257 = class_34695;
        this.Field_44255 = class_39372;
        this.Field_44258 = new Class_24013(class_39372);
        this.Method_44275();
    }

    private void Method_44278() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_44279(Class_31211 class_31211, int n) {
        this.Method_44265(class_31211, n, null);
    }

    private void Method_44280(Class_1956 class_1956, String string) {
        this.Method_44267(class_1956, -16286 & 280, string);
    }

    public void Method_44281(Class_23823 class_23823, Class_7673 class_7673) {
        if (class_23823 != null) {
            Class_31211 class_31211 = this.Field_44258.Method_24024(class_23823);
            this.Method_44268(class_23823, class_31211, class_7673);
        }
    }

    private boolean Method_44282(Class_12058 class_12058) {
        return ((class_12058.Field_12059.x < 0.0f ? -31573 & 4865 : -29596 & 4097) ^ (class_12058.Field_12059.y < 0.0f ? 4099 & -32751 : -28416 & 8240) ^ (class_12058.Field_12059.z < 0.0f ? 8449 & 7321 : -32752 & 10241)) != 0;
    }

    public Class_24013 Method_44283() {
        return this.Field_44258;
    }

    public void Method_44284(Class_28636 class_28636, Class_23823 class_23823, int n, int n2) {
        this.Method_44271(class_28636, class_23823, n, n2, null);
    }

    public boolean Method_44285(Class_23823 class_23823) {
        Class_31211 class_31211 = this.Field_44258.Method_24024(class_23823);
        return (class_31211 == null ? 5265 & 576 : class_31211.Method_31212()) != 0;
    }

    private void Method_44286(Class_22385 class_22385, Class_14461 class_14461) {
        Class_4792 class_4792 = class_14461.Method_14475().Method_4624();
        class_22385.Method_22422(class_4792.Method_4807(), class_4792.Method_4806(), class_4792.Method_4809());
    }

    public void Method_44287(Class_23823 class_23823, int n, int n2) {
        if (class_23823 != null && class_23823.Method_23844() != null) {
            this.Field_44259 += 0.33333334f * 150.0f;
            try {
                this.Method_44289(class_23823, n, n2);
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Rendering item");
                Class_13220 class_13220 = class_13268.Method_13280("Item being rendered");
                class_13220.Method_13232("Item Type", new Class_26529(this, class_23823));
                class_13220.Method_13232("Item Aux", new Class_40067(this, class_23823));
                class_13220.Method_13232("Item NBT", new Class_23256(this, class_23823));
                class_13220.Method_13232("Item Foil", new Class_18181(this, class_23823));
                throw new Class_1809(class_13268);
            }
            this.Field_44259 -= 650.0f * 0.07692308f;
        }
    }

    private void Method_44288(int n, int n2, boolean bl) {
        Class_16867.Method_16943(n, n2, 0.59615386f * 167.74193f + this.Field_44259);
        Class_16867.Method_16943(52.923077f * 0.15116279f, 2.8421054f * 2.8148148f, 0.0f);
        Class_16867.Method_16973(1.0f, 1.0f, 0.775f * -1.2903227f);
        Class_16867.Method_16973(1.0f * 0.5f, 0.62068963f * 0.8055556f, 1.0888889f * 0.45918366f);
        if (bl) {
            Class_16867.Method_16973(165.7143f * 0.2413793f, 132.85713f * 0.30107528f, 52.727272f * 0.7586207f);
            Class_16867.Method_16940(0.779661f * 269.34784f, 1.0f, 0.0f, 0.0f);
            Class_16867.Method_16940(3.2857144f * -41.086956f, 0.0f, 1.0f, 0.0f);
            Class_16867.Method_16918();
        } else {
            Class_16867.Method_16973(5.142857f * 12.444445f, 0.14606741f * 438.15387f, 3.6923077f * 17.333334f);
            Class_16867.Method_16940(0.40816328f * 441.0f, 1.0f, 0.0f, 0.0f);
            Class_16867.Method_16931();
        }
    }

    public void Method_44289(Class_23823 class_23823, int n, int n2) {
        this.Field_44254 = 4689 & -30549;
        Class_31211 class_31211 = this.Field_44258.Method_24024(class_23823);
        Class_16867.Method_16961();
        this.Field_44257.Method_34707(Class_24069.Field_24084);
        this.Field_44257.Method_34709(Class_24069.Field_24084).Method_2065((16384 & 11942) != 0, (2586 & 1093) != 0);
        Class_16867.Method_16957();
        Class_16867.Method_16913();
        Class_16867.Method_16967(8996 & -27068, 0.30869564f * 0.32394367f);
        Class_16867.Method_16947();
        Class_16867.Method_16951(21258 & -31790, -29885 & 8999);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.Method_44288(n, n2, class_31211.Method_31212());
        class_31211.Method_31215().Method_15872(Class_7673.Field_7677);
        this.Method_44262(class_23823, class_31211);
        Class_16867.Method_16985();
        Class_16867.Method_16942();
        Class_16867.Method_16931();
        Class_16867.Method_16945();
        this.Field_44257.Method_34707(Class_24069.Field_24084);
        this.Field_44257.Method_34709(Class_24069.Field_24084).Method_2067();
        this.Field_44254 = 1800 & 0;
    }
}

