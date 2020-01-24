/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Class_29642 {
    private static final Random Field_29643 = new Random();
    private static final Class_18412 Field_29644 = new Class_18412(null);
    private static final Class_35317 Field_29645;
    private static final Class_24706 Field_29646;
    private static final Class_33740 Field_29647;

    public static int Method_29648(Class_1061 class_1061) {
        return Class_29642.Method_29651(Class_30635.Field_30651.Field_30638, class_1061.Method_1165());
    }

    public static int Method_29649(Random random, int n, int n2, Class_23823 class_23823) {
        Class_1956 class_1956 = class_23823.Method_23844();
        int n3 = class_1956.Method_2002();
        if (n3 <= 0) {
            return 5760 & -16376;
        }
        if (n2 > (16447 & 527)) {
            n2 = -28337 & 16447;
        }
        int n4 = random.nextInt(17400 & 2060) + (8225 & 2257) + (n2 >> (4593 & -7671)) + random.nextInt(n2 + (5 & -8111));
        return n == 0 ? Math.max(n4 / (331 & 3111), 24641 & -29249) : (n == (841 & -32635) ? n4 * (450 & 16386) / (-32637 & 25615) + (-22447 & 5129) : Math.max(n4, n2 * (2066 & -32409)));
    }

    public static int Method_29650(Class_859 class_859) {
        return Class_29642.Method_29662(Class_30635.Field_30649.Field_30638, class_859.Method_1010());
    }

    public static int Method_29651(int n, Class_23823[] arrclass_23823) {
        if (arrclass_23823 == null) {
            return 8294 & -32368;
        }
        int n2 = 1 & -15776;
        Class_23823[] arrclass_238232 = arrclass_23823;
        int n3 = arrclass_238232.length;
        for (int i = -18296 & 550; i < n3; ++i) {
            Class_23823 class_23823 = arrclass_238232[i];
            int n4 = Class_29642.Method_29662(n, class_23823);
            if (n4 <= n2) continue;
            n2 = n4;
        }
        return n2;
    }

    public static int Method_29652(Class_859 class_859) {
        return Class_29642.Method_29662(Class_30635.Field_30642.Field_30638, class_859.Method_1010());
    }

    private static void Method_29653(Class_6961 class_6961, Class_23823 class_23823) {
        Class_1758 class_1758;
        if (class_23823 != null && (class_1758 = class_23823.Method_23863()) != null) {
            for (int i = -28640 & 8475; i < class_1758.Method_1772(); ++i) {
                short s = class_1758.Method_1768(i).Method_1726("id");
                short s2 = class_1758.Method_1768(i).Method_1726("lvl");
                if (Class_30635.Method_30685(s) == null) continue;
                class_6961.Method_6962(Class_30635.Method_30685(s), s2);
            }
        }
    }

    public static float Method_29654(Class_23823 class_23823, Class_40173 class_40173) {
        Class_29642.Field_29647.Field_33742 = 0.0f;
        Class_29642.Field_29647.Field_33741 = class_40173;
        Class_29642.Method_29653(Field_29647, class_23823);
        return Class_29642.Field_29647.Field_33742;
    }

    public static void Method_29655(Map map, Class_23823 class_23823) {
        Class_1758 class_1758 = new Class_1758();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            Class_30635 class_30635 = Class_30635.Method_30685(n);
            if (class_30635 == null) continue;
            Class_1699 class_1699 = new Class_1699();
            class_1699.Method_1731("id", (short)n);
            class_1699.Method_1731("lvl", (short)((Integer)map.get(n)).intValue());
            class_1758.Method_1781(class_1699);
            if (class_23823.Method_23844() != Class_10527.Field_10625) continue;
            Class_10527.Field_10625.Method_21686(class_23823, new Class_38800(class_30635, (Integer)map.get(n)));
        }
        if (class_1758.Method_1772() > 0) {
            if (class_23823.Method_23844() != Class_10527.Field_10625) {
                class_23823.Method_23879("ench", class_1758);
            }
        } else if (class_23823.Method_23842()) {
            class_23823.Method_23845().Method_1740("ench");
        }
    }

    public static void Method_29656(Class_859 class_859, Class_1061 class_1061) {
        Class_29642.Field_29646.Field_24707 = class_859;
        Class_29642.Field_29646.Field_24708 = class_1061;
        if (class_859 != null) {
            Class_29642.Method_29666(Field_29646, class_859.Method_972());
        }
        if (class_859 instanceof Class_626) {
            Class_29642.Method_29653(Field_29646, class_859.Method_1010());
        }
    }

    public static int Method_29657(Class_859 class_859) {
        return Class_29642.Method_29662(Class_30635.Field_30658.Field_30638, class_859.Method_1010());
    }

    public static int Method_29658(Class_859 class_859) {
        return Class_29642.Method_29662(Class_30635.Field_30659.Field_30638, class_859.Method_1010());
    }

    public static int Method_29659(Class_859 class_859) {
        return Class_29642.Method_29662(Class_30635.Field_30662.Field_30638, class_859.Method_1010());
    }

    private void Method_29660() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static List Method_29661(Random random, Class_23823 class_23823, int n) {
        ArrayList arrayList;
        Class_38800 class_38800;
        float f;
        Class_1956 class_1956 = class_23823.Method_23844();
        int n2 = class_1956.Method_2002();
        if (n2 <= 0) {
            return null;
        }
        n2 /= 90 & 3075;
        int n3 = (n2 = (1029 & -28023) + random.nextInt((n2 >> (16521 & 6241)) + (19485 & 8897)) + random.nextInt((n2 >> (4225 & -23223)) + (-16383 & 4705))) + n;
        int n4 = (int)((float)n3 * (1.0f + (f = (random.nextFloat() + random.nextFloat() - 1.0f) * (0.30714288f * 0.4883721f))) + 0.8148148f * 0.6136364f);
        if (n4 < (18609 & 8963)) {
            n4 = -15839 & 14741;
        }
        ArrayList arrayList2 = null;
        Map map = Class_29642.Method_29674(n4, class_23823);
        if (map != null && !map.isEmpty() && (class_38800 = (Class_38800)Class_27139.Method_27144(random, arrayList = new ArrayList(map.values()))) != null) {
            arrayList2 = Lists.newArrayList();
            arrayList2.add(class_38800);
            for (int i = n4; random.nextInt(5178 & 8818) <= i; i >>= 26753 & 5131) {
                Object object;
                Serializable serializable;
                Iterator iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                    serializable = (Integer)iterator.next();
                    object = 4951 & -22527;
                    for (Class_38800 class_388002 : arrayList2) {
                        if (class_388002.Field_38802.Method_30690(Class_30635.Method_30685((Integer)serializable))) continue;
                        object = 10788 & -32622;
                        break;
                    }
                    if (object != 0) continue;
                    iterator.remove();
                }
                if (map.isEmpty()) continue;
                serializable = new ArrayList(map.values());
                object = (Class_38800)Class_27139.Method_27144(random, arrayList);
                arrayList2.add(object);
            }
        }
        return arrayList2;
    }

    public static int Method_29662(int n, Class_23823 class_23823) {
        if (class_23823 == null) {
            return 617 & 10240;
        }
        Class_1758 class_1758 = class_23823.Method_23863();
        if (class_1758 == null) {
            return -6656 & 40;
        }
        for (int i = 8229 & -9590; i < class_1758.Method_1772(); ++i) {
            short s = class_1758.Method_1768(i).Method_1726("id");
            short s2 = class_1758.Method_1768(i).Method_1726("lvl");
            if (s != n) continue;
            return s2;
        }
        return 8513 & 20992;
    }

    public static boolean Method_29663(Class_859 class_859) {
        return (Class_29642.Method_29651(Class_30635.Field_30640.Field_30638, class_859.Method_972()) > 0 ? 33 & 4235 : 4096 & -30708) != 0;
    }

    public static int Method_29664(Class_859 class_859) {
        return Class_29642.Method_29662(Class_30635.Field_30655.Field_30638, class_859.Method_1010());
    }

    static {
        Field_29647 = new Class_33740(null);
        Field_29645 = new Class_35317(null);
        Field_29646 = new Class_24706(null);
    }

    public static Map Method_29665(Class_23823 class_23823) {
        Class_1758 class_1758;
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        Class_1758 class_17582 = class_1758 = class_23823.Method_23844() == Class_10527.Field_10625 ? Class_10527.Field_10625.Method_21691(class_23823) : class_23823.Method_23863();
        if (class_1758 != null) {
            for (int i = 2180 & 9025; i < class_1758.Method_1772(); ++i) {
                short s = class_1758.Method_1768(i).Method_1726("id");
                short s2 = class_1758.Method_1768(i).Method_1726("lvl");
                linkedHashMap.put(Integer.valueOf(s), Integer.valueOf(s2));
            }
        }
        return linkedHashMap;
    }

    private static void Method_29666(Class_6961 class_6961, Class_23823[] arrclass_23823) {
        Class_23823[] arrclass_238232 = arrclass_23823;
        int n = arrclass_238232.length;
        for (int i = 1126 & -24184; i < n; ++i) {
            Class_23823 class_23823 = arrclass_238232[i];
            Class_29642.Method_29653(class_6961, class_23823);
        }
    }

    public static void Method_29667(Class_859 class_859, Class_1061 class_1061) {
        Class_29642.Field_29645.Field_35318 = class_1061;
        Class_29642.Field_29645.Field_35319 = class_859;
        if (class_859 != null) {
            Class_29642.Method_29666(Field_29645, class_859.Method_972());
        }
        if (class_1061 instanceof Class_626) {
            Class_29642.Method_29653(Field_29645, class_859.Method_1010());
        }
    }

    public static Class_23823 Method_29668(Class_30635 class_30635, Class_859 class_859) {
        Class_23823[] arrclass_23823 = class_859.Method_972();
        int n = arrclass_23823.length;
        for (int i = -32762 & 641; i < n; ++i) {
            Class_23823 class_23823 = arrclass_23823[i];
            if (class_23823 == null || Class_29642.Method_29662(class_30635.Field_30638, class_23823) <= 0) continue;
            return class_23823;
        }
        return null;
    }

    public static boolean Method_29669(Class_859 class_859) {
        return (Class_29642.Method_29662(Class_30635.Field_30637.Field_30638, class_859.Method_1010()) > 0 ? 4259 & 321 : 8218 & 21056) != 0;
    }

    public static int Method_29670(Class_859 class_859) {
        return Class_29642.Method_29662(Class_30635.Field_30645.Field_30638, class_859.Method_1010());
    }

    public static int Method_29671(Class_1061 class_1061) {
        return Class_29642.Method_29651(Class_30635.Field_30660.Field_30638, class_1061.Method_1165());
    }

    public static int Method_29672(Class_23823[] arrclass_23823, Class_32797 class_32797) {
        Class_29642.Field_29644.Field_18413 = 10240 & 4385;
        Class_29642.Field_29644.Field_18414 = class_32797;
        Class_29642.Method_29666(Field_29644, arrclass_23823);
        if (Class_29642.Field_29644.Field_18413 > (601 & 24603)) {
            Class_29642.Field_29644.Field_18413 = -16353 & 921;
        } else if (Class_29642.Field_29644.Field_18413 < 0) {
            Class_29642.Field_29644.Field_18413 = -28646 & 1248;
        }
        return (Class_29642.Field_29644.Field_18413 + (35 & 7297) >> (10379 & -31135)) + Field_29643.nextInt((Class_29642.Field_29644.Field_18413 >> (339 & -29147)) + (289 & 8269));
    }

    public static Class_23823 Method_29673(Random random, Class_23823 class_23823, int n) {
        int n2;
        List list = Class_29642.Method_29661(random, class_23823, n);
        int n3 = n2 = class_23823.Method_23844() == Class_10527.Field_10629 ? 3331 & -32767 : 1117 & -27872;
        if (n2 != 0) {
            class_23823.Method_23882(Class_10527.Field_10625);
        }
        if (list != null) {
            for (Class_38800 class_38800 : list) {
                if (n2 != 0) {
                    Class_10527.Field_10625.Method_21686(class_23823, class_38800);
                    continue;
                }
                class_23823.Method_23835(class_38800.Field_38802, class_38800.Field_38801);
            }
        }
        return class_23823;
    }

    public static Map Method_29674(int n, Class_23823 class_23823) {
        Class_1956 class_1956 = class_23823.Method_23844();
        HashMap hashMap = null;
        int n2 = class_23823.Method_23844() == Class_10527.Field_10629 ? 3237 & 779 : 51 & 5188;
        Class_30635[] arrclass_30635 = Class_30635.Field_30648;
        int n3 = arrclass_30635.length;
        for (int i = 4800 & 1024; i < n3; ++i) {
            Class_30635 class_30635 = arrclass_30635[i];
            if (class_30635 == null || !class_30635.Field_30667.Method_4083(class_1956) && n2 == 0) continue;
            for (int j = class_30635.Method_30696(); j <= class_30635.Method_30672(); ++j) {
                if (n < class_30635.Method_30680(j) || n > class_30635.Method_30708(j)) continue;
                if (hashMap == null) {
                    hashMap = Maps.newHashMap();
                }
                hashMap.put(class_30635.Field_30638, new Class_38800(class_30635, j));
            }
        }
        return hashMap;
    }
}

