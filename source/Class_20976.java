/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Class_20976 {
    private final Map Field_20977 = Maps.newHashMap();
    private final Map Field_20978 = Maps.newHashMap();
    private final Map Field_20979 = Maps.newHashMap();
    private final Map Field_20980 = Maps.newHashMap();
    private final Map Field_20981 = Maps.newHashMap();
    private final Class_7873[] Field_20982 = new Class_7873[16415 & -30285];
    private static String[] Field_20983 = null;

    public void Method_20984(Class_7873 class_7873) {
    }

    public static int Method_20985(String string) {
        String string2;
        Class_5478 class_5478;
        if (string.equalsIgnoreCase("list")) {
            return 384 & -20400;
        }
        if (string.equalsIgnoreCase("sidebar")) {
            return 8459 & 7249;
        }
        if (string.equalsIgnoreCase("belowName")) {
            return 16391 & -31070;
        }
        if (string.startsWith("sidebar.team.") && (class_5478 = Class_5478.Method_5527(string2 = string.substring("sidebar.team.".length()))) != null && class_5478.Method_5548() >= 0) {
            return class_5478.Method_5548() + (-4765 & 4243);
        }
        return -1 & -1;
    }

    public Map Method_20986(String string) {
        Map map = (Map)this.Field_20979.get(string);
        if (map == null) {
            map = Maps.newHashMap();
        }
        return map;
    }

    public Class_22057 Method_20987(String string) {
        return (Class_22057)this.Field_20977.get(string);
    }

    public Collection Method_20988() {
        return this.Field_20979.keySet();
    }

    public void Method_20989(String string, Class_7873 class_7873) {
    }

    public static String[] Method_20990() {
        if (Field_20983 == null) {
            Field_20983 = new String[5303 & -16365];
            for (int i = 16000 & -16112; i < (187 & 1555); ++i) {
                Class_20976.Field_20983[i] = Class_20976.Method_20992(i);
            }
        }
        return Field_20983;
    }

    public void Method_20991(Class_22057 class_22057) {
    }

    public static String Method_20992(int n) {
        Class_5478 class_5478;
        switch (n) {
            case 0: {
                return "list";
            }
            case 1: {
                return "sidebar";
            }
            case 2: {
                return "belowName";
            }
        }
        if (n >= (10759 & 1427) && n <= (24858 & -25966) && (class_5478 = Class_5478.Method_5549(n - (-28409 & 11363))) != null && class_5478 != Class_5478.Field_5507) {
            return "sidebar.team." + class_5478.Method_5563();
        }
        return null;
    }

    public Class_21696 Method_20993(String string, Class_7873 class_7873) {
        Class_21696 class_21696;
        if (string.length() > (-31444 & 20538)) {
            throw new IllegalArgumentException("The player name '" + string + "' is too long!");
        }
        Map map = (Map)this.Field_20979.get(string);
        if (map == null) {
            map = Maps.newHashMap();
            this.Field_20979.put(string, map);
        }
        if ((class_21696 = (Class_21696)map.get(class_7873)) == null) {
            class_21696 = new Class_21696(this, class_7873, string);
            map.put(class_7873, class_21696);
        }
        return class_21696;
    }

    public Collection Method_20994() {
        return this.Field_20980.values();
    }

    public void Method_20995(String string) {
    }

    public Collection Method_20996() {
        return this.Field_20978.values();
    }

    public Class_7873 Method_20997(int n) {
        return this.Field_20982[n];
    }

    public boolean Method_20998(String string, String string2) {
        if (string.length() > (1129 & 954)) {
            throw new IllegalArgumentException("The player name '" + string + "' is too long!");
        }
        if (!this.Field_20980.containsKey(string2)) {
            return (11648 & -16276) != 0;
        }
        Class_22057 class_22057 = this.Method_21018(string2);
        if (this.Method_20987(string) != null) {
            this.Method_21002(string);
        }
        this.Field_20977.put(string, class_22057);
        class_22057.Method_22087().add(string);
        return (865 & 29715) != 0;
    }

    public void Method_20999(int n, Class_7873 class_7873) {
        this.Field_20982[n] = class_7873;
    }

    public Class_7873 Method_21000(String string, Class_27930 class_27930) {
        if (string.length() > Class_12340.Field_12341) {
            throw new IllegalArgumentException("The objective name '" + string + "' is too long!");
        }
        Class_7873 class_7873 = this.Method_21003(string);
        if (class_7873 != null) {
            throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
        }
        class_7873 = new Class_7873(this, string, class_27930);
        List list = (List)this.Field_20981.get(class_27930);
        if (list == null) {
            list = Lists.newArrayList();
            this.Field_20981.put(class_27930, list);
        }
        list.add(class_7873);
        this.Field_20978.put(string, class_7873);
        this.Method_21007(class_7873);
        return class_7873;
    }

    public void Method_21001(Class_21696 class_21696) {
    }

    public boolean Method_21002(String string) {
        Class_22057 class_22057 = this.Method_20987(string);
        if (class_22057 != null) {
            this.Method_21017(string, class_22057);
            return (1089 & 4281) != 0;
        }
        return (5124 & 697) != 0;
    }

    public Class_7873 Method_21003(String string) {
        return (Class_7873)this.Field_20978.get(string);
    }

    public Collection Method_21004(Class_27930 class_27930) {
        Collection collection = (Collection)this.Field_20981.get(class_27930);
        return collection == null ? Lists.newArrayList() : Lists.newArrayList((Iterable)collection);
    }

    public void Method_21005(Class_7873 class_7873) {
    }

    public void Method_21006(String string, Class_7873 class_7873) {
        if (class_7873 == null) {
            Map map = (Map)this.Field_20979.remove(string);
            if (map != null) {
                this.Method_20995(string);
            }
        } else {
            Map map = (Map)this.Field_20979.get(string);
            if (map != null) {
                Class_21696 class_21696 = (Class_21696)map.remove(class_7873);
                if (map.size() < (1 & 12293)) {
                    Map map2 = (Map)this.Field_20979.remove(string);
                    if (map2 != null) {
                        this.Method_20995(string);
                    }
                } else if (class_21696 != null) {
                    this.Method_20989(string, class_7873);
                }
            }
        }
    }

    public void Method_21007(Class_7873 class_7873) {
    }

    public Class_22057 Method_21008(String string) {
        if (string.length() > Class_12340.Field_12341) {
            throw new IllegalArgumentException("The team name '" + string + "' is too long!");
        }
        Class_22057 class_22057 = this.Method_21018(string);
        if (class_22057 != null) {
            throw new IllegalArgumentException("A team with the name '" + string + "' already exists!");
        }
        class_22057 = new Class_22057(this, string);
        this.Field_20980.put(string, class_22057);
        this.Method_21016(class_22057);
        return class_22057;
    }

    public Collection Method_21009(Class_7873 class_7873) {
        ArrayList arrayList = Lists.newArrayList();
        for (Map map : this.Field_20979.values()) {
            Class_21696 class_21696 = (Class_21696)map.get(class_7873);
            if (class_21696 == null) continue;
            arrayList.add(class_21696);
        }
        Collections.sort(arrayList, Class_21696.Field_21697);
        return arrayList;
    }

    public Collection Method_21010() {
        return this.Field_20980.keySet();
    }

    public boolean Method_21011(String string, Class_7873 class_7873) {
        Map map = (Map)this.Field_20979.get(string);
        if (map == null) {
            return (163 & 16404) != 0;
        }
        Class_21696 class_21696 = (Class_21696)map.get(class_7873);
        return (class_21696 != null ? 2625 & 1 : 416 & 1091) != 0;
    }

    public void Method_21012(Class_22057 class_22057) {
        if (class_22057 == null || class_22057.Method_22075() == null || !this.Field_20980.containsKey(class_22057.Method_22075())) {
            return;
        }
        this.Field_20980.remove(class_22057.Method_22075());
        for (String string : class_22057.Method_22087()) {
            this.Field_20977.remove(string);
        }
        this.Method_21014(class_22057);
    }

    public void Method_21013(Class_7873 class_7873) {
        this.Field_20978.remove(class_7873.Method_7881());
        for (int i = 258 & 536; i < (20827 & 8243); ++i) {
            if (this.Method_20997(i) != class_7873) continue;
            this.Method_20999(i, null);
        }
        List list = (List)this.Field_20981.get(class_7873.Method_7883());
        if (list != null) {
            list.remove(class_7873);
        }
        for (Map map : this.Field_20979.values()) {
            map.remove(class_7873);
        }
        this.Method_20984(class_7873);
    }

    public void Method_21014(Class_22057 class_22057) {
    }

    public Collection Method_21015() {
        Collection collection = this.Field_20979.values();
        ArrayList arrayList = Lists.newArrayList();
        for (Map map : collection) {
            arrayList.addAll(map.values());
        }
        return arrayList;
    }

    public void Method_21016(Class_22057 class_22057) {
    }

    public void Method_21017(String string, Class_22057 class_22057) {
        if (this.Method_20987(string) != class_22057) {
            throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + class_22057.Method_22075() + "'.");
        }
        this.Field_20977.remove(string);
        class_22057.Method_22087().remove(string);
    }

    public Class_22057 Method_21018(String string) {
        return (Class_22057)this.Field_20980.get(string);
    }

    public void Method_21019(Class_1061 class_1061) {
        if (class_1061 != null && !(class_1061 instanceof Class_626) && !class_1061.Method_1285()) {
            String string = class_1061.Method_1194().toString();
            this.Method_21006(string, null);
            this.Method_21002(string);
        }
    }

    private void Method_21020() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

