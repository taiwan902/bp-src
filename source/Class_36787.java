/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  \u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized
 *  com.google.common.base.Function
 *  com.google.common.base.Functions
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.primitives.Doubles
 */
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class Class_36787
implements Class_26550 {
    private static Class_3052 Field_36788;

    public static int Method_36789(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            Object[] arrobject = new Object[265 & 625];
            arrobject[25664 & 4864] = string;
            throw new Class_30032("commands.generic.num.invalid", arrobject);
        }
    }

    public static Class_1061 Method_36790(Class_1367 class_1367, String string) {
        return Class_36787.Method_36809(class_1367, string, Class_1061.class);
    }

    public static List Method_36791(String[] arrstring, String ... arrstring2) {
        return Class_36787.Method_36808(arrstring, Arrays.asList(arrstring2));
    }

    public static boolean Method_36792(String string) {
        if (!string.equals("true") && !string.equals("1")) {
            if (!string.equals("false") && !string.equals("0")) {
                Object[] arrobject = new Object[4617 & -22495];
                arrobject[8 & 401] = string;
                throw new Class_30034("commands.generic.boolean.invalid", arrobject);
            }
            return (16518 & 11336) != 0;
        }
        return (-6907 & 35) != 0;
    }

    public static Class_1782 Method_36793(List list) {
        Class_2840 class_2840 = new Class_2840("");
        for (int i = -29948 & 21584; i < list.size(); ++i) {
            if (i > 0) {
                if (i == list.size() - (1989 & -8159)) {
                    class_2840.Method_1785(" and ");
                } else if (i > 0) {
                    class_2840.Method_1785(", ");
                }
            }
            class_2840.Method_1787((Class_1782)list.get(i));
        }
        return class_2840;
    }

    public static Class_4751 Method_36794(Class_1367 class_1367, String[] arrstring, int n, boolean bl) {
        Class_4751 class_4751 = class_1367.Method_1372();
        return new Class_4751(Class_36787.Method_36814(class_4751.\u0000= final(), arrstring[n], -21545739 & -29459072, -1983261814 & 365938577, bl), Class_36787.Method_36814(class_4751.\u0000, `(), arrstring[n + (1 & -15199)], -12084 & 11522, 14603 & 17792, (-31228 & 10250) != 0), Class_36787.Method_36814(class_4751.\u0000strictfp(), arrstring[n + (16931 & -31742)], -12616304 & -21611392, 634252166 & 64607209, bl));
    }

    public static double Method_36795(String string, double d) {
        return Class_36787.Method_36826(string, d, 5.0588235294117645 * 3.5535794526348103E307);
    }

    public boolean Method_36796(Class_1367 class_1367) {
        return class_1367.Method_1376(this.Method_36797(), this.\u0000strictfp());
    }

    public int Method_36797() {
        return 276 & -24498;
    }

    public static String Method_36798(Class_1367 class_1367, String string) {
        try {
            return Class_36787.Method_36832(class_1367, string).\u0000, `();
        }
        catch (Class_31939 class_31939) {
            if (Class_16350.Method_16388(string)) {
                throw class_31939;
            }
            return string;
        }
    }

    public static String Method_36799(Object[] arrobject) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1152 & -9723; i < arrobject.length; ++i) {
            String string = arrobject[i].toString();
            if (i > 0) {
                if (i == arrobject.length - (8335 & 19025)) {
                    stringBuilder.append(" and ");
                } else {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static List Method_36800(String[] arrstring, int n, Class_4751 class_4751) {
        String string;
        if (class_4751 == null) {
            return null;
        }
        int n2 = arrstring.length - (5121 & 13);
        if (n2 == n) {
            string = Integer.toString(class_4751.\u0000= final());
        } else if (n2 == n + (25121 & 5185)) {
            string = Integer.toString(class_4751.\u0000, `());
        } else {
            if (n2 != n + (1154 & -22498)) {
                return null;
            }
            string = Integer.toString(class_4751.\u0000strictfp());
        }
        Object[] arrobject = new String[2069 & -31605];
        arrobject[5 & -15678] = string;
        return Lists.newArrayList((Object[])arrobject);
    }

    public static \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true Method_36801(Class_1367 class_1367) {
        if (class_1367 instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true) {
            return (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_1367;
        }
        throw new Class_31939("You must specify which player you wish to perform this action on.", new Object[-15869 & 1168]);
    }

    private void Method_36802() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_1782 Method_36803(Class_1367 class_1367, String[] arrstring, int n) {
        return Class_36787.Method_36816(class_1367, arrstring, n, (-32238 & 8453) != 0);
    }

    public static Class_3238 Method_36804(Class_1367 class_1367, String string) {
        Class_2080 class_2080 = new Class_2080(string);
        if (!Class_3238.Field_3271.\u0000strictfp((Object)class_2080)) {
            Object[] arrobject = new Object[5125 & 2115];
            arrobject[4704 & -30708] = class_2080;
            throw new Class_30032("commands.give.block.notFound", arrobject);
        }
        Class_3238 class_3238 = (Class_3238)Class_3238.Field_3271.Method_3639(class_2080);
        if (class_3238 == null) {
            Object[] arrobject = new Object[26817 & -28415];
            arrobject[3202 & 16449] = class_2080;
            throw new Class_30032("commands.give.block.notFound", arrobject);
        }
        return class_3238;
    }

    public static double Method_36805(String string) {
        try {
            double d = Double.parseDouble(string);
            if (!Doubles.isFinite((double)d)) {
                Object[] arrobject = new Object[9299 & 2081];
                arrobject[19463 & 384] = string;
                throw new Class_30032("commands.generic.num.invalid", arrobject);
            }
            return d;
        }
        catch (NumberFormatException numberFormatException) {
            Object[] arrobject = new Object[129 & -31675];
            arrobject[46 & 16720] = string;
            throw new Class_30032("commands.generic.num.invalid", arrobject);
        }
    }

    public static List Method_36806(String[] arrstring, int n, Class_4751 class_4751) {
        String string;
        if (class_4751 == null) {
            return null;
        }
        int n2 = arrstring.length - (133 & 26659);
        if (n2 == n) {
            string = Integer.toString(class_4751.\u0000= final());
        } else {
            if (n2 != n + (20577 & 8981)) {
                return null;
            }
            string = Integer.toString(class_4751.\u0000strictfp());
        }
        Object[] arrobject = new String[4129 & 3097];
        arrobject[16512 & -32192] = string;
        return Lists.newArrayList((Object[])arrobject);
    }

    public static double Method_36807(double d, String string, boolean bl) {
        return Class_36787.Method_36814(d, string, -25772840 & -29917792, -2117343327 & 31310726, bl);
    }

    public static List Method_36808(String[] arrstring, Collection collection) {
        String string = arrstring[arrstring.length - (1441 & 4629)];
        ArrayList arrayList = Lists.newArrayList();
        if (!collection.isEmpty()) {
            for (Object object : Iterables.transform((Iterable)collection, (Function)Functions.toStringFunction())) {
                if (!Class_36787.Method_36813(string, (String)object)) continue;
                arrayList.add(object);
            }
            if (arrayList.isEmpty()) {
                for (Object object : collection) {
                    if (!(object instanceof Class_2080) || !Class_36787.Method_36813(string, ((Class_2080)object).Method_2084())) continue;
                    arrayList.add(String.valueOf(object));
                }
            }
        }
        return arrayList;
    }

    public static Class_1061 Method_36809(Class_1367 class_1367, String string, Class class_) {
        Class_1061 class_1061 = Class_16350.Method_16361(class_1367, string, class_);
        Class_2457 class_2457 = Class_2457.Method_2530();
        if (class_1061 == null) {
            class_1061 = class_2457.Method_2616().Method_3155(string);
        }
        if (class_1061 == null) {
            try {
                UUID uUID = UUID.fromString(string);
                class_1061 = class_2457.Method_2555(uUID);
                if (class_1061 == null) {
                    class_1061 = class_2457.Method_2616().Method_3112(uUID);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new \u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized("commands.generic.entity.invalidUuid", new Object[2628 & 9225]);
            }
        }
        if (class_1061 != null && class_.isAssignableFrom(class_1061.getClass())) {
            return class_1061;
        }
        throw new \u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized();
    }

    public static long Method_36810(String string, long l, long l2) {
        long l3 = Class_36787.Method_36821(string);
        if (l3 < l) {
            Object[] arrobject = new Object[-32701 & 8210];
            arrobject[-22014 & 168] = l3;
            arrobject[12481 & 1541] = l;
            throw new Class_30032("commands.generic.num.tooSmall", arrobject);
        }
        if (l3 > l2) {
            Object[] arrobject = new Object[-32734 & 8523];
            arrobject[1026 & 21060] = l3;
            arrobject[-26341 & 9733] = l2;
            throw new Class_30032("commands.generic.num.tooBig", arrobject);
        }
        return l3;
    }

    public static Class_24921 Method_36811(double d, String string, boolean bl) {
        return Class_36787.Method_36817(d, string, -29999656 & -12632960, 32236483 & 332256164, bl);
    }

    public static void Method_36812(Class_1367 class_1367, Class_26550 class_26550, String string, Object ... arrobject) {
        Class_36787.Method_36829(class_1367, class_26550, 6196 & 257, string, arrobject);
    }

    public static boolean Method_36813(String string, String string2) {
        return string2.regionMatches((-27631 & 2825) != 0, 946 & 6208, string, 8273 & 2304, string.length());
    }

    public static double Method_36814(double d, String string, int n, int n2, boolean bl) {
        double d2;
        boolean bl2 = string.startsWith("~");
        if (bl2 && Double.isNaN(d)) {
            Object[] arrobject = new Object[2065 & -15325];
            arrobject[19040 & 8471] = d;
            throw new Class_30032("commands.generic.num.invalid", arrobject);
        }
        double d3 = d2 = bl2 ? d : 0.0;
        if (!bl2 || string.length() > (917 & 6177)) {
            boolean bl3 = string.contains(".");
            if (bl2) {
                string = string.substring(10329 & -16127);
            }
            d2 += Class_36787.Method_36805(string);
            if (!bl3 && !bl2 && bl) {
                d2 += 2.0 * 0.25;
            }
        }
        if (n != 0 || n2 != 0) {
            if (d2 < (double)n) {
                Object[] arrobject = new Object[18499 & 1062];
                arrobject[40 & 30290] = d2;
                arrobject[25089 & 267] = n;
                throw new Class_30032("commands.generic.double.tooSmall", arrobject);
            }
            if (d2 > (double)n2) {
                Object[] arrobject = new Object[3634 & 14];
                arrobject[17412 & 6432] = d2;
                arrobject[1813 & 75] = n2;
                throw new Class_30032("commands.generic.double.tooBig", arrobject);
            }
        }
        return d2;
    }

    public boolean Method_36815(String[] arrstring, int n) {
        return (6408 & -32128) != 0;
    }

    public static Class_1782 Method_36816(Class_1367 class_1367, String[] arrstring, int n, boolean bl) {
        Class_2840 class_2840 = new Class_2840("");
        for (int i = n; i < arrstring.length; ++i) {
            if (i > n) {
                class_2840.Method_1785(" ");
            }
            Class_1782 class_1782 = new Class_2840(arrstring[i]);
            if (bl) {
                Class_1782 class_17822 = Class_16350.Method_16387(class_1367, arrstring[i]);
                if (class_17822 == null) {
                    if (Class_16350.Method_16388(arrstring[i])) {
                        throw new Class_31939();
                    }
                } else {
                    class_1782 = class_17822;
                }
            }
            class_2840.Method_1787(class_1782);
        }
        return class_2840;
    }

    public static Class_24921 Method_36817(double d, String string, int n, int n2, boolean bl) {
        boolean bl2 = string.startsWith("~");
        if (bl2 && Double.isNaN(d)) {
            Object[] arrobject = new Object[4121 & -30619];
            arrobject[-24318 & 7168] = d;
            throw new Class_30032("commands.generic.num.invalid", arrobject);
        }
        double d2 = 0.0;
        if (!bl2 || string.length() > (2065 & -10619)) {
            boolean bl3 = string.contains(".");
            if (bl2) {
                string = string.substring(16595 & 1025);
            }
            d2 += Class_36787.Method_36805(string);
            if (!bl3 && !bl2 && bl) {
                d2 += 0.9649122807017544 * 0.5181818181818182;
            }
        }
        if (n != 0 || n2 != 0) {
            if (d2 < (double)n) {
                Object[] arrobject = new Object[1090 & -24277];
                arrobject[3242 & 28673] = d2;
                arrobject[33 & 137] = n;
                throw new Class_30032("commands.generic.double.tooSmall", arrobject);
            }
            if (d2 > (double)n2) {
                Object[] arrobject = new Object[99 & 1026];
                arrobject[-32511 & 2672] = d2;
                arrobject[2581 & -7839] = n2;
                throw new Class_30032("commands.generic.double.tooBig", arrobject);
            }
        }
        return new Class_24921(d2 + (bl2 ? d : 0.0), d2, bl2);
    }

    public int Method_36818(Class_26550 class_26550) {
        return this.\u0000strictfp().compareTo(class_26550.Method_26556());
    }

    public static int Method_36819(String string, int n) {
        return Class_36787.Method_36824(string, n, Integer.MAX_VALUE & -1);
    }

    public int Method_36820(Object object) {
        return this.Method_36818((Class_26550)object);
    }

    public static long Method_36821(String string) {
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            Object[] arrobject = new Object[8221 & 6785];
            arrobject[17 & 2564] = string;
            throw new Class_30032("commands.generic.num.invalid", arrobject);
        }
    }

    public static String Method_36822(String[] arrstring, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < arrstring.length; ++i) {
            if (i > n) {
                stringBuilder.append(" ");
            }
            String string = arrstring[i];
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static String Method_36823(Collection collection) {
        return Class_36787.Method_36799(collection.toArray(new String[collection.size()]));
    }

    public static int Method_36824(String string, int n, int n2) {
        int n3 = Class_36787.Method_36789(string);
        if (n3 < n) {
            Object[] arrobject = new Object[-4086 & 1394];
            arrobject[16720 & 160] = n3;
            arrobject[16385 & -30563] = n;
            throw new Class_30032("commands.generic.num.tooSmall", arrobject);
        }
        if (n3 > n2) {
            Object[] arrobject = new Object[10243 & -31534];
            arrobject[1 & 32322] = n3;
            arrobject[16769 & 579] = n2;
            throw new Class_30032("commands.generic.num.tooBig", arrobject);
        }
        return n3;
    }

    public List Method_36825() {
        return Collections.emptyList();
    }

    public static double Method_36826(String string, double d, double d2) {
        double d3 = Class_36787.Method_36805(string);
        if (d3 < d) {
            Object[] arrobject = new Object[1298 & -20446];
            arrobject[512 & -26464] = d3;
            arrobject[21321 & -31739] = d;
            throw new Class_30032("commands.generic.double.tooSmall", arrobject);
        }
        if (d3 > d2) {
            Object[] arrobject = new Object[-29950 & 21651];
            arrobject[22161 & -32736] = d3;
            arrobject[2115 & 1669] = d2;
            throw new Class_30032("commands.generic.double.tooBig", arrobject);
        }
        return d3;
    }

    public static List Method_36827(Class_1367 class_1367, String string) {
        List list;
        if (Class_16350.Method_16388(string)) {
            list = Class_16350.Method_16386(class_1367, string, Class_1061.class);
        } else {
            Object[] arrobject = new Class_1061[-30719 & 12419];
            arrobject[256 & -22364] = Class_36787.Method_36790(class_1367, string);
            list = Lists.newArrayList((Object[])arrobject);
        }
        return list;
    }

    public List Method_36828(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return null;
    }

    public static void Method_36829(Class_1367 class_1367, Class_26550 class_26550, int n, String string, Object ... arrobject) {
        if (Field_36788 != null) {
            Field_36788.Method_3053(class_1367, class_26550, n, string, arrobject);
        }
    }

    public static String Method_36830(Class_1367 class_1367, String string) {
        try {
            return Class_36787.Method_36832(class_1367, string).\u0000, `();
        }
        catch (Class_31939 class_31939) {
            try {
                return Class_36787.Method_36790(class_1367, string).Method_1194().toString();
            }
            catch (\u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized \u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized2) {
                if (Class_16350.Method_16388(string)) {
                    throw \u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized2;
                }
                return string;
            }
        }
    }

    public static void Method_36831(Class_3052 class_3052) {
        Field_36788 = class_3052;
    }

    public static \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true Method_36832(Class_1367 class_1367, String string) {
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = Class_16350.Method_16356(class_1367, string);
        if (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 == null) {
            try {
                \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = Class_2457.Method_2530().Method_2616().Method_3112(UUID.fromString(string));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        if (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 == null) {
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = Class_2457.Method_2530().Method_2616().Method_3155(string);
        }
        if (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 == null) {
            throw new Class_31939();
        }
        return \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2;
    }

    public static Class_1956 Method_36833(Class_1367 class_1367, String string) {
        Class_2080 class_2080 = new Class_2080(string);
        Class_1956 class_1956 = (Class_1956)Class_1956.Field_1961.Method_3650(class_2080);
        if (class_1956 == null) {
            Object[] arrobject = new Object[3089 & 8193];
            arrobject[3284 & 4354] = class_2080;
            throw new Class_30032("commands.give.item.notFound", arrobject);
        }
        return class_1956;
    }
}

