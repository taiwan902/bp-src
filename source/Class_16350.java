/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_16350 {
    private static final Pattern Field_16351 = Pattern.compile(Class_16350.Method_16373("\u0448\u0452\u0418\u044b\u0442\u0453\u0442\u0451\u044b\u041b\u0418\u040b\u0408\u044a\u044b\u0418\u0459\u045a\u0453\u0419\u040a\u0403\u0409\u0459\u0408\u040b\u0458\u0459\u040b\u0419\u0400"));
    private static final Pattern Field_16352;
    private static final Set Field_16353;
    private static final Pattern Field_16354;

    private static List Method_16355(List arrayList, Map map, Class_1367 class_1367, Class class_, String string, Class_4751 class_4751) {
        Class_1061 class_1061;
        int n = Class_16350.Method_16385(map, "c", !string.equals("a") && !string.equals("e") ? 1227 & 14341 : 1649 & -26496);
        if (!(string.equals("p") || string.equals("a") || string.equals("e"))) {
            if (string.equals("r")) {
                Collections.shuffle(arrayList);
            }
        } else if (class_4751 != null) {
            Collections.sort(arrayList, new Class_8179(class_4751));
        }
        if ((class_1061 = class_1367.Method_1377()) != null && class_.isAssignableFrom(class_1061.getClass()) && n == (-29071 & 8327) && arrayList.contains(class_1061) && !"r".equals(string)) {
            Object[] arrobject = new Class_1061[10661 & -16383];
            arrobject[4256 & 0] = class_1061;
            arrayList = Lists.newArrayList((Object[])arrobject);
        }
        if (n != 0) {
            if (n < 0) {
                Collections.reverse(arrayList);
            }
            arrayList = arrayList.subList(19715 & -28512, Math.min(Math.abs(n), arrayList.size()));
        }
        return arrayList;
    }

    public static \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true Method_16356(Class_1367 class_1367, String string) {
        return (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)Class_16350.Method_16361(class_1367, string, \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true.class);
    }

    private static String Method_16357(Map map, String string) {
        return (String)map.get(string);
    }

    private static List Method_16358(Map map) {
        ArrayList arrayList = Lists.newArrayList();
        Map map2 = Class_16350.Method_16392(map);
        if (map2 != null && map2.size() > 0) {
            arrayList.add(new Class_34416(map2));
        }
        return arrayList;
    }

    private static String Method_16359(String string) {
        int n = 2176;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16350.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16360(String string) {
        int n = 13882;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16350.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_1061 Method_16361(Class_1367 class_1367, String string, Class class_) {
        List list = Class_16350.Method_16386(class_1367, string, class_);
        return list.size() == (273 & 31393) ? (Class_1061)list.get(9425 & 2824) : null;
    }

    private static List Method_16362(Class_1367 class_1367, Map map) {
        ArrayList arrayList = Lists.newArrayList();
        if (Class_16350.Method_16380(map)) {
            arrayList.add(class_1367.Method_1375());
        } else {
            Collections.addAll(arrayList, Class_2457.Method_2530().Field_2463);
        }
        return arrayList;
    }

    private static String Method_16363(String string) {
        int n = 7094;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16350.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_16364(int n) {
        if ((n %= -24216 & 1020) >= (4513 & 19118)) {
            n -= 360;
        }
        if (n < 0) {
            n += 360;
        }
        return n;
    }

    private static Class_4751 Method_16365(Map map, Class_4751 class_4751) {
        return new Class_4751(Class_16350.Method_16385(map, "x", class_4751.\u0000= final()), Class_16350.Method_16385(map, "y", class_4751.\u0000, `()), Class_16350.Method_16385(map, "z", class_4751.\u0000strictfp()));
    }

    private static String Method_16366(String string) {
        int n = 9563;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16350.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16367(String string) {
        int n = 21583;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16350.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_16368() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static boolean Method_16369(Class_1367 class_1367, Map map) {
        String string = Class_16350.Method_16357(map, "type");
        String string2 = string = string != null && string.startsWith("!") ? string.substring(129 & 25611) : string;
        if (string != null && !Class_15516.Method_15573(string)) {
            Object[] arrobject = new Object[-28525 & 2113];
            arrobject[6659 & 288] = string;
            Class_2849 class_2849 = new Class_2849("commands.generic.entity.invalidType", arrobject);
            class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5505);
            class_1367.Method_1373(class_2849);
            return (13328 & 2054) != 0;
        }
        return (-32735 & 16391) != 0;
    }

    private static String Method_16370(String string) {
        int n = 5073;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16350.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static List Method_16371(Map map, Class_4751 class_4751) {
        ArrayList arrayList = Lists.newArrayList();
        int n = Class_16350.Method_16385(map, "rm", -1 & -1);
        int n2 = Class_16350.Method_16385(map, "r", -1 & -1);
        if (class_4751 != null && (n >= 0 || n2 >= 0)) {
            int n3 = n * n;
            int n4 = n2 * n2;
            arrayList.add(new Class_33821(class_4751, n, n3, n2, n4));
        }
        return arrayList;
    }

    private static List Method_16372(Map map) {
        int n;
        ArrayList arrayList = Lists.newArrayList();
        String string = Class_16350.Method_16357(map, "name");
        int n2 = n = string != null && string.startsWith("!") ? -31197 & 20481 : 20498 & -32384;
        if (n != 0) {
            string = string.substring(4235 & -32495);
        }
        if (string != null) {
            String string2 = string;
            arrayList.add(new Class_13757(string2, n != 0));
        }
        return arrayList;
    }

    private static String Method_16373(String string) {
        int n = 25769;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16350.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_16354 = Pattern.compile(Class_16350.Method_16367("\ub089\ub080\ub0af\ub08e\ub0a8\ub0a4\ub08a\ub0aa\ub084\ub081\ub0aa\ub0a2\ub080\ub0a5\ub0a6\ub0a7\ub0a8\ub0ad\ub0a3\ub0ab\ub0a9\ub0ac"));
        Field_16352 = Pattern.compile(Class_16350.Method_16359("\u1302\u1310\u1332\u1302\u1324\u1334\u1336\u1326\u1332\u1300\u1332\u1332\u1306\u1324\u1304\u1306\u1330\u1322\u1312\u1320\u1326\u1326\u1334\u1334\u1322\u1332\u1322\u1322"));
        Object[] arrobject = new String[4110 & -31959];
        arrobject[81 & 5672] = Class_16350.Method_16382("\u3800");
        arrobject[17417 & -17867] = Class_16350.Method_16374("\u1732");
        arrobject[17010 & 4483] = Class_16350.Method_16370("\u1104");
        arrobject[16491 & 8215] = Class_16350.Method_16379("\ua881\ua881");
        arrobject[-32618 & 7492] = Class_16350.Method_16366("\u8200\u8200");
        arrobject[-30667 & 28813] = Class_16350.Method_16360("\f\u0001");
        arrobject[-16378 & 262] = Class_16350.Method_16363("\u6676\u6660");
        arrobject[12463 & 71] = Class_16350.Method_16383("\ue2c9");
        Field_16353 = Sets.newHashSet((Object[])arrobject);
    }

    private static String Method_16374(String string) {
        int n = 84;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16350.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static List Method_16375(Map map) {
        int n;
        ArrayList arrayList = Lists.newArrayList();
        String string = Class_16350.Method_16357(map, "team");
        int n2 = n = string != null && string.startsWith("!") ? 13 & -32415 : 25633 & 4180;
        if (n != 0) {
            string = string.substring(-32763 & 2179);
        }
        if (string != null) {
            String string2 = string;
            arrayList.add(new Class_20351(string2, n != 0));
        }
        return arrayList;
    }

    private static List Method_16376(Map map) {
        ArrayList arrayList = Lists.newArrayList();
        int n = Class_16350.Method_16385(map, "lm", -1 & -1);
        int n2 = Class_16350.Method_16385(map, "l", -1 & -1);
        if (n > (-1 & -1) || n2 > (-1 & -1)) {
            arrayList.add(new Class_18230(n, n2));
        }
        return arrayList;
    }

    private static Map Method_16377(String string) {
        HashMap hashMap = Maps.newHashMap();
        if (string == null) {
            return hashMap;
        }
        int n = 12320 & 18432;
        int n2 = -1 & -1;
        Matcher matcher = Field_16354.matcher(string);
        while (matcher.find()) {
            String string2 = null;
            switch (n++) {
                case 0: {
                    string2 = "x";
                    break;
                }
                case 1: {
                    string2 = "y";
                    break;
                }
                case 2: {
                    string2 = "z";
                    break;
                }
                case 3: {
                    string2 = "r";
                }
            }
            if (string2 != null && matcher.group(135 & -24543).length() > 0) {
                hashMap.put(string2, matcher.group(-31743 & 2501));
            }
            n2 = matcher.end();
        }
        if (n2 < string.length()) {
            matcher = Field_16352.matcher(n2 == (-1 & -1) ? string : string.substring(n2));
            while (matcher.find()) {
                hashMap.put(matcher.group(1581 & 20561), matcher.group(-29694 & 9098));
            }
        }
        return hashMap;
    }

    private static List Method_16378(Map map, Class class_, List list, String string, Class_283 class_283, Class_4751 class_4751) {
        ArrayList arrayList = Lists.newArrayList();
        String string2 = Class_16350.Method_16357(map, "type");
        string2 = string2 != null && string2.startsWith("!") ? string2.substring(30753 & 1043) : string2;
        int n = !string.equals("e") ? -32481 & 21089 : 20501 & -29984;
        int n2 = string.equals("r") && string2 != null ? 18567 & 57 : 10240 & 49;
        int n3 = Class_16350.Method_16385(map, "dx", 1601 & 28954);
        int n4 = Class_16350.Method_16385(map, "dy", 16520 & 3072);
        int n5 = Class_16350.Method_16385(map, "dz", 2056 & 1328);
        int n6 = Class_16350.Method_16385(map, "r", -1 & -1);
        Predicate predicate = Predicates.and((Iterable)list);
        Predicate predicate2 = Predicates.and((Predicate)Class_28857.Field_28859, (Predicate)predicate);
        if (class_4751 != null) {
            int n7;
            int n8;
            int n9 = class_283.Field_325.size();
            int n10 = n8 = n9 < (n7 = class_283.Field_305.size()) / (14352 & -32107) ? 465 & 7 : 23584 & -31983;
            if (!(map.containsKey("dx") || map.containsKey("dy") || map.containsKey("dz"))) {
                if (n6 >= 0) {
                    Class_10997 class_10997 = new Class_10997(class_4751.\u0000= final() - n6, class_4751.\u0000, `() - n6, class_4751.\u0000strictfp() - n6, class_4751.\u0000= final() + n6 + (2119 & 10001), class_4751.\u0000, `() + n6 + (-24415 & 6405), class_4751.\u0000strictfp() + n6 + (1 & 28241));
                    if (n != 0 && n8 != 0 && n2 == 0) {
                        arrayList.addAll(class_283.Method_448(class_, predicate2));
                    } else {
                        arrayList.addAll(class_283.Method_395(class_, class_10997, predicate2));
                    }
                } else if (string.equals("a")) {
                    arrayList.addAll(class_283.Method_448(class_, predicate));
                } else if (!(string.equals("p") || string.equals("r") && n2 == 0)) {
                    arrayList.addAll(class_283.Method_550(class_, predicate2));
                } else {
                    arrayList.addAll(class_283.Method_448(class_, predicate2));
                }
            } else {
                Class_10997 class_10997 = Class_16350.Method_16389(class_4751, n3, n4, n5);
                if (n != 0 && n8 != 0 && n2 == 0) {
                    Class_33321 class_33321 = new Class_33321(class_10997);
                    arrayList.addAll(class_283.Method_448(class_, Predicates.and((Predicate)predicate2, (Predicate)class_33321)));
                } else {
                    arrayList.addAll(class_283.Method_395(class_, class_10997, predicate2));
                }
            }
        } else if (string.equals("a")) {
            arrayList.addAll(class_283.Method_448(class_, predicate));
        } else if (!(string.equals("p") || string.equals("r") && n2 == 0)) {
            arrayList.addAll(class_283.Method_550(class_, predicate2));
        } else {
            arrayList.addAll(class_283.Method_448(class_, predicate2));
        }
        return arrayList;
    }

    private static String Method_16379(String string) {
        int n = 25085;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16350.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static boolean Method_16380(Map map) {
        for (String string : Field_16353) {
            if (!map.containsKey(string)) continue;
            return (-27625 & 25089) != 0;
        }
        return (5417 & -32188) != 0;
    }

    public static boolean Method_16381(String string) {
        Matcher matcher = Field_16351.matcher(string);
        if (!matcher.matches()) {
            return (0 & -29093) != 0;
        }
        Map map = Class_16350.Method_16377(matcher.group(12810 & 17570));
        String string2 = matcher.group(-30571 & 9481);
        int n = !"a".equals(string2) && !"e".equals(string2) ? 5529 & 2629 : 21066 & -32768;
        return (Class_16350.Method_16385(map, "c", n) != (16421 & -18669) ? 8245 & 1539 : 1064 & -32640) != 0;
    }

    private static String Method_16382(String string) {
        int n = 1668;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16350.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16383(String string) {
        int n = 18359;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16350.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static List Method_16384(Map map) {
        int n;
        int n2;
        ArrayList arrayList = Lists.newArrayList();
        if (map.containsKey("rym") || map.containsKey("ry")) {
            n2 = Class_16350.Method_16364(Class_16350.Method_16385(map, "rym", 5408 & 3));
            n = Class_16350.Method_16364(Class_16350.Method_16385(map, "ry", 2407 & 871));
            arrayList.add(new Class_14488(n2, n));
        }
        if (map.containsKey("rxm") || map.containsKey("rx")) {
            n2 = Class_16350.Method_16364(Class_16350.Method_16385(map, "rxm", 17610 & 6160));
            n = Class_16350.Method_16364(Class_16350.Method_16385(map, "rx", 383 & 7015));
            arrayList.add(new Class_8637(n2, n));
        }
        return arrayList;
    }

    private static int Method_16385(Map map, String string, int n) {
        return map.containsKey(string) ? Class_13337.Method_13372((String)map.get(string), n) : n;
    }

    public static List Method_16386(Class_1367 class_1367, String string, Class class_) {
        Matcher matcher = Field_16351.matcher(string);
        if (matcher.matches() && class_1367.Method_1376(67 & -31071, "@")) {
            Map map = Class_16350.Method_16377(matcher.group(-19966 & 18599));
            if (!Class_16350.Method_16369(class_1367, map)) {
                return Collections.emptyList();
            }
            String string2 = matcher.group(67 & 3849);
            Class_4751 class_4751 = Class_16350.Method_16365(map, class_1367.Method_1372());
            List list = Class_16350.Method_16362(class_1367, map);
            ArrayList arrayList = Lists.newArrayList();
            for (Class_283 class_283 : list) {
                if (class_283 == null) continue;
                ArrayList arrayList2 = Lists.newArrayList();
                arrayList2.addAll(Class_16350.Method_16391(map, string2));
                arrayList2.addAll(Class_16350.Method_16376(map));
                arrayList2.addAll(Class_16350.Method_16390(map));
                arrayList2.addAll(Class_16350.Method_16375(map));
                arrayList2.addAll(Class_16350.Method_16358(map));
                arrayList2.addAll(Class_16350.Method_16372(map));
                arrayList2.addAll(Class_16350.Method_16371(map, class_4751));
                arrayList2.addAll(Class_16350.Method_16384(map));
                arrayList.addAll(Class_16350.Method_16378(map, class_, arrayList2, string2, class_283, class_4751));
            }
            return Class_16350.Method_16355(arrayList, map, class_1367, class_, string2, class_4751);
        }
        return Collections.emptyList();
    }

    public static Class_1782 Method_16387(Class_1367 class_1367, String string) {
        List list = Class_16350.Method_16386(class_1367, string, Class_1061.class);
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = Lists.newArrayList();
        for (Class_1061 class_1061 : list) {
            arrayList.add(class_1061.Method_1232());
        }
        return Class_36787.Method_36793(arrayList);
    }

    public static boolean Method_16388(String string) {
        return Field_16351.matcher(string).matches();
    }

    private static Class_10997 Method_16389(Class_4751 class_4751, int n, int n2, int n3) {
        int n4 = n < 0 ? 567 & 9537 : -24348 & 2;
        int n5 = n2 < 0 ? 69 & 10497 : 12948 & 2336;
        int n6 = n3 < 0 ? 9 & 641 : 17952 & -32704;
        int n7 = class_4751.\u0000= final() + (n4 != 0 ? n : 40 & 2371);
        int n8 = class_4751.\u0000, `() + (n5 != 0 ? n2 : 22528 & 29);
        int n9 = class_4751.\u0000strictfp() + (n6 != 0 ? n3 : 18472 & -32560);
        int n10 = class_4751.\u0000= final() + (n4 != 0 ? 8202 & -8816 : n) + (-30203 & 16529);
        int n11 = class_4751.\u0000, `() + (n5 != 0 ? 17408 & -28544 : n2) + (8321 & 16421);
        int n12 = class_4751.\u0000strictfp() + (n6 != 0 ? -26103 & 6 : n3) + (-19349 & 16529);
        return new Class_10997(n7, n8, n9, n10, n11, n12);
    }

    private static List Method_16390(Map map) {
        ArrayList arrayList = Lists.newArrayList();
        int n = Class_16350.Method_16385(map, "m", Class_35650.Field_35655.Method_35660());
        if (n != Class_35650.Field_35655.Method_35660()) {
            arrayList.add(new Class_17971(n));
        }
        return arrayList;
    }

    private static List Method_16391(Map map, String string) {
        int n;
        int n2;
        ArrayList arrayList = Lists.newArrayList();
        String string2 = Class_16350.Method_16357(map, "type");
        int n3 = n2 = string2 != null && string2.startsWith("!") ? 20485 & 10521 : -32668 & 21251;
        if (n2 != 0) {
            string2 = string2.substring(17457 & -32759);
        }
        int n4 = !string.equals("e") ? 21537 & 11 : 260 & 20696;
        int n5 = n = string.equals("r") && string2 != null ? 9217 & 2117 : 5744 & -24568;
        if (!(string2 != null && string.equals("e") || n != 0)) {
            if (n4 != 0) {
                arrayList.add(new Class_25174());
            }
        } else {
            String string3 = string2;
            arrayList.add(new Class_6076(string3, n2 != 0));
        }
        return arrayList;
    }

    public static Map Method_16392(Map map) {
        HashMap hashMap = Maps.newHashMap();
        for (String string : map.keySet()) {
            if (!string.startsWith("score_") || string.length() <= "score_".length()) continue;
            hashMap.put(string.substring("score_".length()), Class_13337.Method_13372((String)map.get(string), 8601 & -13209));
        }
        return hashMap;
    }
}

