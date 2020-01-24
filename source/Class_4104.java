/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Class_4104
extends Class_1956 {
    private static final Map Field_4105 = Maps.newLinkedHashMap();
    private Map Field_4106 = Maps.newHashMap();

    public int Method_4107(Class_23823 class_23823, int n) {
        return n > 0 ? 1358954495 & 234881023 : this.Method_4119(class_23823.Method_23843());
    }

    public boolean Method_4108(Class_23823 class_23823) {
        List list = this.Method_4110(class_23823);
        return (list != null && !list.isEmpty() ? 25627 & 5 : -32684 & 2186) != 0;
    }

    public Class_4104() {
        this.\u0000, `(2339 & -27639);
        this.\u0000strictfp((16713 & -32089) != 0);
        this.\u0000strictfp(-29952 & 1240);
        this.\u0000strictfp(Class_3987.Field_3990);
    }

    public String Method_4109(Class_23823 class_23823) {
        List list;
        if (class_23823.Method_23843() == 0) {
            return Class_7594.Method_7602("item.emptyPotion.name").trim();
        }
        String string = "";
        if (Class_4104.Method_4120(class_23823.Method_23843())) {
            string = Class_7594.Method_7602("potion.prefix.grenade").trim() + " ";
        }
        if ((list = Class_10527.Field_10687.Method_4110(class_23823)) != null && !list.isEmpty()) {
            String string2 = ((Class_25240)list.get(3088 & 37)).Method_25264();
            string2 = string2 + ".postfix";
            return string + Class_7594.Method_7602(string2).trim();
        }
        String string3 = Class_12264.Method_12297(class_23823.Method_23843());
        return Class_7594.Method_7602(string3).trim() + " " + super.Method_2030(class_23823);
    }

    public List Method_4110(Class_23823 class_23823) {
        if (class_23823.Method_23842() && class_23823.Method_23845().Method_1715("CustomPotionEffects", 7467 & 73)) {
            ArrayList arrayList = Lists.newArrayList();
            Class_1758 class_1758 = class_23823.Method_23845().Method_1735("CustomPotionEffects", 16394 & -32726);
            for (int i = 296 & -28986; i < class_1758.Method_1772(); ++i) {
                Class_1699 class_1699 = class_1758.Method_1768(i);
                Class_25240 class_25240 = Class_25240.Method_25266(class_1699);
                if (class_25240 == null) continue;
                arrayList.add(class_25240);
            }
            return arrayList;
        }
        List list = (List)this.Field_4106.get(class_23823.Method_23843());
        if (list == null) {
            list = Class_12264.Method_12316(class_23823.Method_23843(), (22528 & 8320) != 0);
            this.Field_4106.put(class_23823.Method_23843(), list);
        }
        return list;
    }

    private void Method_4111() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823 Method_4112(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        if (Class_4104.Method_4120(class_23823.Method_23843())) {
            if (!class_626.Field_694.Method_18094()) {
                class_23823.Field_23826 -= 5121 & 515;
            }
            class_283.Method_519(class_626, "random.bow", 0.8513513f * 0.5873016f, 0.5263158f * 0.76f / (\u0000strictfp.nextFloat() * (39.5f * 0.010126582f) + 1.0769231f * 0.7428571f));
            if (!class_283.Field_306) {
                class_283.Method_350(new Class_43663(class_283, (Class_859)class_626, class_23823));
            }
            class_626.Method_750(Class_19863.Field_19917[Class_1956.Method_1986(this)]);
            return class_23823;
        }
        class_626.Method_848(class_23823, this.Method_4121(class_23823));
        return class_23823;
    }

    public boolean Method_4113(int n) {
        List list = this.Method_4114(n);
        if (list != null && !list.isEmpty()) {
            for (Class_25240 class_25240 : list) {
                if (!Class_8338.Field_8341[class_25240.Method_25253()].Method_8420()) continue;
                return (-32617 & 9321) != 0;
            }
            return (24 & 128) != 0;
        }
        return (2147 & 4124) != 0;
    }

    public List Method_4114(int n) {
        List list = (List)this.Field_4106.get(n);
        if (list == null) {
            list = Class_12264.Method_12316(n, (7233 & 17186) != 0);
            this.Field_4106.put(n, list);
        }
        return list;
    }

    public void Method_4115(Class_1956 class_1956, Class_3987 class_3987, List list) {
        int n;
        super.Method_2016(class_1956, class_3987, list);
        if (Field_4105.isEmpty()) {
            for (int i = -29632 & 310; i <= (31 & 9199); ++i) {
                for (n = 2049 & 16578; n <= (8961 & 45); ++n) {
                    int n2 = n == 0 ? i | 31106 & 8209 : i | -7964 & 23568;
                    for (int j = 4290 & -29928; j <= (26754 & 2); ++j) {
                        List list2;
                        int n3 = n2;
                        if (j != 0) {
                            if (j == (-23543 & 4101)) {
                                n3 = n2 | 16992 & 2096;
                            } else if (j == (24898 & -25554)) {
                                n3 = n2 | 714 & 5445;
                            }
                        }
                        if ((list2 = Class_12264.Method_12316(n3, (264 & -22526) != 0)) == null || list2.isEmpty()) continue;
                        Field_4105.put(list2, n3);
                    }
                }
            }
        }
        Iterator iterator = Field_4105.values().iterator();
        while (iterator.hasNext()) {
            n = (Integer)iterator.next();
            list.add(new Class_23823(class_1956, 5 & -5367, n));
        }
    }

    public Class_23823 Method_4116(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        List list;
        if (!class_626.Field_694.Method_18094()) {
            class_23823.Field_23826 -= 2825 & -19455;
        }
        if (!class_283.Field_306 && (list = this.Method_4110(class_23823)) != null) {
            for (Class_25240 class_25240 : list) {
                class_626.\u0000, `(new Class_25240(class_25240));
            }
        }
        class_626.Method_750(Class_19863.Field_19917[Class_1956.Method_1986(this)]);
        if (!class_626.Field_694.Method_18094()) {
            if (class_23823.Field_23826 <= 0) {
                return new Class_23823(Class_10527.Field_10666);
            }
            class_626.Field_628.Method_37824(new Class_23823(Class_10527.Field_10666));
        }
        return class_23823;
    }

    public void Method_4117(Class_23823 class_23823, Class_626 class_626, List list, boolean bl) {
        if (class_23823.Method_23843() != 0) {
            Object object;
            List list2 = Class_10527.Field_10687.Method_4110(class_23823);
            HashMultimap hashMultimap = HashMultimap.create();
            if (list2 != null && !list2.isEmpty()) {
                for (Object object2 : list2) {
                    object = Class_7594.Method_7602(((Class_25240)object2).Method_25264()).trim();
                    Class_8338 class_8338 = Class_8338.Field_8341[((Class_25240)object2).Method_25253()];
                    Map map = class_8338.Method_8388();
                    if (map != null && map.size() > 0) {
                        for (Map.Entry entry : map.entrySet()) {
                            Class_10375 class_10375 = (Class_10375)entry.getValue();
                            Class_10375 class_103752 = new Class_10375(class_10375.Method_10388(), class_8338.Method_8423(((Class_25240)object2).Method_25257(), class_10375), class_10375.Method_10389());
                            hashMultimap.put((Object)((Class_22368)entry.getKey()).Method_22373(), (Object)class_103752);
                        }
                    }
                    if (((Class_25240)object2).Method_25257() > 0) {
                        int n = ((Class_25240)object2).Method_25257();
                        object = n >= (-14444 & 8271) || n < 0 ? (String)object + " " + n : (String)object + " " + Class_7594.Method_7602("potion.potency." + n).trim();
                    }
                    if (((Class_25240)object2).Method_25251() > (8348 & 1300)) {
                        object = (String)object + " (" + Class_8338.Method_8416((Class_25240)object2) + ")";
                    }
                    if (class_8338.Method_8398()) {
                        list.add((Object)((Object)Class_5478.Field_5505) + (String)object);
                        continue;
                    }
                    list.add((Object)((Object)Class_5478.Field_5480) + (String)object);
                }
            } else {
                Iterator iterator = Class_7594.Method_7602("potion.empty").trim();
                list.add((Object)((Object)Class_5478.Field_5480) + (String)((Object)iterator));
            }
            if (!hashMultimap.isEmpty()) {
                list.add("");
                list.add((Object)((Object)Class_5478.Field_5484) + Class_7594.Method_7602("potion.effects.whenDrank"));
                for (Object object2 : hashMultimap.entries()) {
                    object = (Class_10375)object2.getValue();
                    double d = ((Class_10375)object).Method_10382();
                    double d2 = ((Class_10375)object).Method_10389() != (13 & -27391) && ((Class_10375)object).Method_10389() != (2050 & -11206) ? ((Class_10375)object).Method_10382() : ((Class_10375)object).Method_10382() * (3.857142857142857 * 25.925925925925924);
                    if (d > 0.0) {
                        Object[] arrobject = new Object[10530 & 4302];
                        arrobject[-15667 & 306] = Class_23823.Field_23833.format(d2);
                        arrobject[-8117 & 2053] = Class_7594.Method_7602("attribute.name." + (String)object2.getKey());
                        list.add((Object)((Object)Class_5478.Field_5498) + Class_7594.Method_7597("attribute.modifier.plus." + ((Class_10375)object).Method_10389(), arrobject));
                        continue;
                    }
                    if (!(d < 0.0)) continue;
                    Object[] arrobject = new Object[23563 & 226];
                    arrobject[-10719 & 2122] = Class_23823.Field_23833.format(d2 *= -3.7058823529411766 * 0.2698412698412698);
                    arrobject[321 & 18979] = Class_7594.Method_7602("attribute.name." + (String)object2.getKey());
                    list.add((Object)((Object)Class_5478.Field_5505) + Class_7594.Method_7597("attribute.modifier.take." + ((Class_10375)object).Method_10389(), arrobject));
                }
            }
        }
    }

    public Class_25567 Method_4118(Class_23823 class_23823) {
        return Class_25567.Field_25570;
    }

    public int Method_4119(int n) {
        return Class_12264.Method_12275(n, (8332 & 20800) != 0);
    }

    public static boolean Method_4120(int n) {
        return ((n & (-4832 & 16457)) != 0 ? 8225 & 19 : 6720 & -16345) != 0;
    }

    public int Method_4121(Class_23823 class_23823) {
        return 610 & 27053;
    }
}

