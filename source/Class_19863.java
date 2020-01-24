/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class_19863 {
    public static Class_13017 Field_19864;
    public static Class_13017 Field_19865;
    public static Class_13017 Field_19866;
    public static Class_13017 Field_19867;
    public static Class_13017 Field_19868;
    public static Class_13017 Field_19869;
    public static Class_13017 Field_19870;
    public static Class_13017 Field_19871;
    public static Class_13017 Field_19872;
    public static Class_13017 Field_19873;
    public static Class_13017 Field_19874;
    public static Class_13017 Field_19875;
    public static Class_13017 Field_19876;
    public static Class_13017 Field_19877;
    public static Class_13017 Field_19878;
    public static Class_13017 Field_19879;
    public static List Field_19880;
    public static Class_13017 Field_19881;
    public static Class_13017 Field_19882;
    public static Class_13017 Field_19883;
    public static Class_13017 Field_19884;
    public static final Class_13017[] Field_19885;
    public static List Field_19886;
    protected static Map Field_19887;
    public static Class_13017 Field_19888;
    public static Class_13017 Field_19889;
    public static Class_13017 Field_19890;
    public static final Class_13017[] Field_19891;
    public static Class_13017 Field_19892;
    public static Class_13017 Field_19893;
    public static Class_13017 Field_19894;
    public static Class_13017 Field_19895;
    public static Class_13017 Field_19896;
    public static Class_13017 Field_19897;
    public static Class_13017 Field_19898;
    public static List Field_19899;
    public static final Class_13017[] Field_19900;
    public static List Field_19901;
    public static Class_13017 Field_19902;
    public static Class_13017 Field_19903;
    public static Class_13017 Field_19904;
    public static Class_13017 Field_19905;
    public static Class_13017 Field_19906;
    public static Class_13017 Field_19907;
    public static Class_13017 Field_19908;
    public static Class_13017 Field_19909;
    public static Class_13017 Field_19910;
    public static Class_13017 Field_19911;
    public static Class_13017 Field_19912;
    public static Class_13017 Field_19913;
    public static Class_13017 Field_19914;
    public static Class_13017 Field_19915;
    public static Class_13017 Field_19916;
    public static final Class_13017[] Field_19917;
    public static Class_13017 Field_19918;
    public static Class_13017 Field_19919;
    public static Class_13017 Field_19920;

    private static String Method_19921(String string) {
        int n = 14917;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 72);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19922(String string) {
        int n = 23392;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 49);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19923(String string) {
        int n = 370;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 84);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_13017 Method_19924(Class_7898 class_7898) {
        Class_13017 class_13017;
        String string = Class_15516.Method_15571(class_7898.Field_7899);
        if (string == null) {
            class_13017 = null;
        } else {
            Object[] arrobject = new Object[-32683 & 28707];
            arrobject[-29963 & 1288] = new Class_2849("entity." + string + ".name", new Object[-31616 & 2071]);
            class_13017 = new Class_13017("stat.entityKilledBy." + string, new Class_2849("stat.entityKilledBy", arrobject)).Method_13045();
        }
        return class_13017;
    }

    private static String Method_19925(String string) {
        int n = 3755;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 81);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19926(String string) {
        int n = 6562;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19927(String string) {
        int n = 28252;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19928(String string) {
        int n = 8382;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 59);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19929(String string) {
        int n = 26497;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19930(String string) {
        int n = 1165;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 90);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19931(String string) {
        int n = 25114;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 56);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19932(String string) {
        int n = 8468;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 60);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_13017 Method_19933(Class_7898 class_7898) {
        Class_13017 class_13017;
        String string = Class_15516.Method_15571(class_7898.Field_7899);
        if (string == null) {
            class_13017 = null;
        } else {
            Object[] arrobject = new Object[7715 & 8197];
            arrobject[1665 & -24572] = new Class_2849("entity." + string + ".name", new Object[2089 & 1296]);
            class_13017 = new Class_13017("stat.killEntity." + string, new Class_2849("stat.entityKill", arrobject)).Method_13045();
        }
        return class_13017;
    }

    private static String Method_19934(String string) {
        int n = 22098;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19935(String string) {
        int n = 6385;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 36);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19936(String string) {
        int n = 24542;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 70);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19937(String string) {
        int n = 2741;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 68);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19938(String string) {
        int n = 26867;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 58);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19939(String string) {
        int n = 7147;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 44);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_19940() {
        Iterator iterator = Class_1956.Field_1961.Method_3651();
        while (iterator.hasNext()) {
            Class_1956 class_1956 = (Class_1956)iterator.next();
            if (class_1956 == null) continue;
            int n = Class_1956.Method_1986(class_1956);
            String string = Class_19863.Method_19965(class_1956);
            if (string == null || !class_1956.Method_1984()) continue;
            Object[] arrobject = new Object[4835 & 8193];
            arrobject[-28670 & 8292] = new Class_23823(class_1956).Method_23900();
            Class_19863.Field_19900[n] = new Class_22538("stat.breakItem.", string, new Class_2849("stat.breakItem", arrobject), class_1956).\u0000strictfp();
        }
        Class_19863.Method_19993(Field_19900);
    }

    private static String Method_19941(String string) {
        int n = 4172;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 45);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19942(String string) {
        int n = 18387;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 52);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19943(String string) {
        int n = 30274;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19944(String string) {
        int n = 10455;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19945(String string) {
        int n = 4634;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 54);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19946(String string) {
        int n = 17361;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 50);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19947(String string) {
        int n = 19921;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19948(String string) {
        int n = 11524;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 92);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19949(String string) {
        int n = 2279;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 65);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19950(String string) {
        int n = 8232;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 30);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19951(String string) {
        int n = 15347;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 91);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19952(String string) {
        int n = 3889;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_19953(Class_13017[] arrclass_13017, Class_3238 class_3238, Class_3238 class_32382) {
        int n = Class_3238.Method_3435(class_3238);
        int n2 = Class_3238.Method_3435(class_32382);
        if (arrclass_13017[n] != null && arrclass_13017[n2] == null) {
            arrclass_13017[n2] = arrclass_13017[n];
        } else {
            Field_19886.remove(arrclass_13017[n]);
            Field_19880.remove(arrclass_13017[n]);
            Field_19901.remove(arrclass_13017[n]);
            arrclass_13017[n] = arrclass_13017[n2];
        }
    }

    private static String Method_19954(String string) {
        int n = 30833;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 33);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19955(String string) {
        int n = 29315;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 78);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19956(String string) {
        int n = 6997;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 89);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19957(String string) {
        int n = 15814;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19958(String string) {
        int n = 6866;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 42);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19959(String string) {
        int n = 32657;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 57);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_19887 = Maps.newHashMap();
        Field_19886 = Lists.newArrayList();
        Field_19901 = Lists.newArrayList();
        Field_19899 = Lists.newArrayList();
        Field_19880 = Lists.newArrayList();
        Field_19918 = new Class_31696(Class_19863.Method_19944("\u2020\u2023\u2032\u2023\u2031\u2033\u2032\u2032\u2029\u203a\u2018\u203a\u203a\u203a"), new Class_2849(Class_19863.Method_19929("\u0422\u0420\u0430\u0420\u0436\u0434\u0434\u0434\u042a\u0438\u041a\u0438\u043c\u043c"), new Object[25712 & 2176])).\u0000, `().Method_13045();
        Field_19909 = new Class_31696(Class_19863.Method_19927("\u4000\u4004\u4000\u4004\u4048\u4004\u4008\u4004\u4000\u4004\u4004\u400c\u4000\u4004\u4000\u4008\u4014\u4014"), new Class_2849(Class_19863.Method_19943("\u8140\u8143\u8142\u8143\u8101\u8143\u8143\u8142\u8142\u8140\u8141\u8142\u8142\u8142\u8141\u8142\u8153\u8152"), new Object[64 & 8368]), Class_13017.Field_13025).\u0000, `().Method_13045();
        Field_19873 = new Class_31696(Class_19863.Method_20017("\u0490\u0497\u0480\u0495\u0480\u0493\u0484\u0481\u048e\u0499\u0488\u048f\u048c\u048b\u0488\u0489\u0492\u0487\u0490"), new Class_2849(Class_19863.Method_20016("\u4246\u4240\u4254\u4240\u4212\u4240\u4254\u4250\u4250\u4246\u4254\u4252\u4256\u4250\u4250\u4250\u4244\u4250\u4244"), new Object[18449 & 164]), Class_13017.Field_13025).\u0000, `().Method_13045();
        Field_19864 = new Class_31696(Class_19863.Method_19973("\u0440\u0445\u0440\u0445\u0404\u0445\u0440\u0445\u0448\u044d\u044c\u044d\u0448\u044d"), new Class_2849(Class_19863.Method_19947("\u4800\u4800\u4810\u4800\u4818\u4800\u4810\u4818\u4810\u4830\u4810\u4818\u4838\u4810"), new Object[-28480 & 16387]), Class_13017.Field_13018).\u0000, `().Method_13045();
        Field_19871 = new Class_31696(Class_19863.Method_19984("\u1402\u1401\u1400\u1401\u1403\u1402\u1403\u1402\u1408\u140a\u1409\u142a\u140b\u1408\u142a\u1408"), new Class_2849(Class_19863.Method_20024("\u5391\u5390\u5383\u5392\u5384\u5385\u5396\u5387\u5391\u5381\u5382\u5383\u5384\u5385\u5387\u5387"), new Object[17030 & 12568]), Class_13017.Field_13018).\u0000, `().Method_13045();
        Field_19872 = new Class_31696(Class_19863.Method_20021("\u0000\u0000\u0010\u0000\u0018\u0000\u0000\u0000\u0010\u0010\b0\u0010\u00188\u0010"), new Class_2849(Class_19863.Method_20001("\u9060\u9060\u9072\u9062\u903c\u9064\u9066\u9066\u9078\u9078\u9062\u905a\u907c\u9074\u9056\u907e"), new Object[5747 & 2052]), Class_13017.Field_13018).\u0000, `().Method_13045();
        Field_19897 = new Class_31696(Class_19863.Method_20007("\u1100\u1100\u1102\u1102\u1104\u1104\u1106\u1106\u1108\u1108\u110a\u110a\u110c\u110c"), new Class_2849(Class_19863.Method_19926("\u5662\u5660\u5672\u5662\u5637\u5667\u5664\u5677\u5678\u565b\u5679\u567b\u565e\u567d"), new Object[1056 & 6927]), Class_13017.Field_13018).\u0000, `().Method_13045();
        Field_19889 = new Class_31696(Class_19863.Method_19975("\u3804\u3803\u3816\u3803\u3855\u3815\u3812\u3817\u381b\u3838\u3819\u381a\u3838\u381e"), new Class_2849(Class_19863.Method_19934("\u0c04\u0c02\u0c14\u0c00\u0c10\u0c10\u0c14\u0c10\u0c1a\u0c38\u0c1a\u0c18\u0c3c\u0c1a"), new Object[-30444 & 21514]), Class_13017.Field_13018).\u0000, `().Method_13045();
        Field_19882 = new Class_31696(Class_19863.Method_19986("\u9825\u9820\u9825\u9820\u9824\u9821\u9824\u9821\u9829\u982c\u9809\u9828\u982d\u9809\u982d"), new Class_2849(Class_19863.Method_19957("\u00b0\u00b7\u00a0\u00b5\u00e4\u00a1\u00a4\u00a1\u00a6\u00a1\u0086\u00a7\u00a6\u0081\u00a4"), new Object[18528 & -18932]), Class_13017.Field_13018).\u0000, `().Method_13045();
        Field_19904 = new Class_31696(Class_19863.Method_20028("\u0104\u0102\u0116\u0102\u0110\u0110\u0112\u0106\u0110\u0110\u0112\u0114\u0112"), new Class_2849(Class_19863.Method_19976("\u9044\u9040\u9044\u9040\u9001\u9040\u9041\u9045\u9040\u9040\u9040\u9045\u9040"), new Object[11072 & -11230]), Class_13017.Field_13018).\u0000, `().Method_13045();
        Field_19892 = new Class_31696(Class_19863.Method_19970("\u2001\u2001\u2003\u2003\u2004\u2005\u2007\u2007\u2001\u2000\u2002\u2002\u2005\u2004"), new Class_2849(Class_19863.Method_19952("\u2190\u2191\u2182\u2193\u21c1\u2181\u2182\u2193\u2188\u2188\u218b\u218a\u2188\u2188"), new Object[-16172 & 8449]), Class_13017.Field_13018).\u0000, `().Method_13045();
        Field_19908 = new Class_31696(Class_19863.Method_19989("\u2020\u2020\u2020\u2020\u2028\u2028\u2028\u2028\u2028\u2028\u2028\u2028\u2028\u2000\u2020\u2028\u2000\u2028"), new Class_2849(Class_19863.Method_19998("\u4021\u4020\u4023\u4022\u4020\u4021\u4023\u4022\u4029\u4029\u402b\u402a\u4028\u4009\u402a\u402b\u4001\u4021"), new Object[18432 & -20384]), Class_13017.Field_13018).\u0000, `().Method_13045();
        Field_19893 = new Class_31696(Class_19863.Method_19994("\u7001\u7003\u7003\u7003\u704c\u7005\u700d\u7006\u700a\u7000\u7000\u700a\u700d\u7006"), new Class_2849(Class_19863.Method_19967("\u62b0\u62b5\u62a0\u62b5\u62e5\u62a1\u62a4\u62a0\u62bd\u628c\u62ad\u62ac\u6288\u62ac"), new Object[-32256 & 14468]), Class_13017.Field_13018).\u0000, `().Method_13045();
        Field_19902 = new Class_31696(Class_19863.Method_19977("\u6809\u680d\u6809\u680d\u6800\u680d\u6805\u6808\u6805\u6805\u680d\u6808\u6801"), new Class_2849(Class_19863.Method_19995("\u0100\u0107\u0102\u0107\u0148\u0107\u010e\u0101\u010c\u010d\u0106\u0101\u010a"), new Object[0 & 6733]), Class_13017.Field_13018).\u0000, `().Method_13045();
        Field_19876 = new Class_31696(Class_19863.Method_19996("\u260c\u260a\u261c\u2608\u2650\u2616\u2612\u260e\u260c\u261a\u2612\u2612\u261a\u261c\u2610"), new Class_2849(Class_19863.Method_19950("QPCR\bHKRYIcBIiC"), new Object[2048 & 24816]), Class_13017.Field_13018).\u0000, `().Method_13045();
        Field_19906 = new Class_31696(Class_19863.Method_20009("\u07b0\u07b1\u07a2\u07b3\u07a4\u07a5\u07b6\u07a7\u07b8"), new Class_2849(Class_19863.Method_19962("\u4188\u418d\u418a\u418f\u4181\u4185\u418a\u4182\u4181"), new Object[3136 & 20493])).\u0000, `().Method_13045();
        Field_19878 = new Class_31696(Class_19863.Method_19954("\u408a\u4089\u4098\u4089\u4093\u4099\u408b\u4092\u4089"), new Class_2849(Class_19863.Method_20011("\u6820\u6823\u6832\u6823\u683d\u6837\u6825\u683c\u6823"), new Object[2048 & 9522])).\u0000, `().Method_13045();
        Field_19911 = new Class_31696(Class_19863.Method_19980("\u1200\u1200\u1202\u1202\u1204\u1204\u1206\u1206\u1200\u1200\u1202\u1202\u1204\u1204\u1206\u1206"), new Class_2849(Class_19863.Method_19935("\u0680\u0681\u0680\u0681\u06cd\u0685\u0684\u068c\u0680\u0680\u0680\u06a1\u0684\u0684\u068d\u0685"), new Object[12801 & 132]), Class_13017.Field_13019).Method_31698();
        Field_19910 = new Class_31696(Class_19863.Method_19999("\u0082\u0081\u0082\u0083\u008e\u0085\u0086\u008f\u0088\u008b\u008a\u008b\u008c\u0087\u008e\u0085"), new Class_2849(Class_19863.Method_19961("\u02c4\u02c3\u02c4\u02c1\u0280\u02c3\u02c4\u02c1\u02c6\u02c1\u02c0\u02c1\u02c6\u02c5\u02c0\u02c3"), new Object[-26616 & 705]), Class_13017.Field_13019).Method_31698();
        Field_19874 = new Class_31696(Class_19863.Method_20006("\u5007\u5001\u5007\u5003\u5042\u5001\u5003\u5006\u5008\u500d\u500d"), new Class_2849(Class_19863.Method_19997("\u9520\u9521\u9522\u9523\u9529\u9521\u9522\u9522\u9521\u9529\u9522"), new Object[1556 & 8257])).Method_31698();
        Field_19903 = new Class_31696(Class_19863.Method_20002("\ua000\ua006\ua002\ua006\ua000\ua002\ua000\ua004\ua028\ua00a\ua00e\ua00e\ua00c"), new Class_2849(Class_19863.Method_19958("\u0526\u0521\u0534\u0521\u0537\u0534\u0536\u0533\u051e\u053c\u0539\u0539\u052a"), new Object[7297 & -24576])).Method_31698();
        Field_19877 = new Class_31696(Class_19863.Method_20020("\uc448\uc449\uc448\uc449\uc401\uc448\uc441\uc440\uc440\uc448\uc441\uc448\uc449\uc449\uc448\uc449"), new Class_2849(Class_19863.Method_19939("\u02b0\u02b1\u02a0\u02b1\u02e5\u02a4\u02a5\u02a4\u02a0\u02a0\u02a1\u02b0\u0285\u02b5\u02a4\u02a5"), new Object[3156 & -11895])).Method_31698();
        Field_19879 = new Class_31696(Class_19863.Method_19941("\u4201\u4200\u4201\u4200\u4204\u4204\u4204\u4205\u4201\u4201\u4200\u4201\u4205\u4204\u4204\u4205"), new Class_2849(Class_19863.Method_19966("\u4254\u4250\u4244\u4250\u4208\u4254\u4248\u4244\u4254\u4248\u425c\u4244\u4244\u4240\u4240\u425c"), new Object[25126 & -30463])).Method_31698();
        Field_19895 = new Class_31696(Class_19863.Method_19971("\u12b0\u12b3\u12a0\u12b1\u12a5\u12a5\u12a4\u12b6\u12a3\u1280\u12a0\u12b0\u12a4\u12a7\u12b5"), new Class_2849(Class_19863.Method_20013("\u6600\u6602\u6610\u6600\u665c\u6614\u661c\u6606\u661a\u6610\u6610\u6600\u6614\u661e\u6604"), new Object[-32766 & 6176])).Method_31698();
        Field_19866 = new Class_31696(Class_19863.Method_19922("\"   b\" \"\"\u0002 \"   "), new Class_2849(Class_19863.Method_19946("\u0b11\u0b11\u0b03\u0b13\u0b44\u0b05\u0b17\u0b07\u0b09\u0b29\u0b0b\u0b1a\u0b0c\u0b0c\u0b0e"), new Object[20756 & 11264])).Method_31698();
        Field_19875 = new Class_31696(Class_19863.Method_19982("\uc414\uc413\uc404\uc411\uc404\uc417\uc412\uc405\uc40e\uc41d\uc418\uc41f\uc40e\uc40d\uc408\uc41b\uc406\uc403\uc400"), new Class_2849(Class_19863.Method_19942("\u1024\u1020\u1036\u1022\u1034\u1024\u1022\u1036\u1034\u1024\u1022\u1026\u1034\u1014\u1032\u1022\u1024\u1020\u1022"), new Object[-15870 & 101])).Method_31698();
        Field_19865 = new Class_31696(Class_19863.Method_20018("\u5230\u5233\u5220\u5231\u5264\u5237\u5224\u5225\u5220\u5223\u5220\u5211\u5224\u5215\u5224\u5225\u5222\u5223\u5222\u5221\u5234"), new Class_2849(Class_19863.Method_19945("\u5442\u5440\u5442\u5442\u5402\u5440\u5442\u5442\u544a\u5448\u544a\u544a\u544a\u544a\u544a\u544a\u5440\u5440\u5440\u5442\u5442"), new Object[-31677 & 16644])).Method_31698();
        Field_19868 = new Class_31696(Class_19863.Method_20005("\f\u000b\f\t\u0004\u000f\n\t\u0002\u0003\u0000\u0003\n\u0007\b\u0007\u0016\u0013\u0010\u001d\u001c\u001f\u001a"), new Class_2849(Class_19863.Method_19931("\u2280\u2281\u2280\u2281\u22c4\u2285\u2284\u2285\u2288\u2289\u2288\u22a9\u228c\u228d\u228c\u22ad\u2280\u2281\u2280\u2281\u2284\u2285\u2284"), new Object[9221 & -15542])).Method_31698();
        Field_19912 = new Class_31696(Class_19863.Method_19959("\u4002\u4000\u4010\u4000\u401e\u4016\u4014\u401e\u4010\u4002\u4018\u4018\u4016\u4014\u4006\u4014\u4000\u4010\u4000\u400a"), new Class_2849(Class_19863.Method_19938("\u0a86\u0a81\u0a86\u0a83\u0acb\u0a86\u0a86\u0a8c\u0a88\u0a8e\u0a83\u0a86\u0a8e\u0a88\u0a8c\u0a8a\u0a94\u0a91\u0a92\u0a99"), new Object[20612 & 10337])).Method_31698();
        Field_19881 = new Class_31696(Class_19863.Method_19928("\u1093\u1094\u1083\u1096\u10ce\u1083\u1083\u1097\u1084\u108c\u1098\u1085\u1086\u108e\u1083\u1086\u108c\u1085\u1086"), new Class_2849(Class_19863.Method_19932("\u8123\u8125\u8131\u8125\u813a\u8136\u8135\u8120\u813c\u8135\u8122\u813e\u813a\u8113\u813d\u8139\u812c\u8124\u8124"), new Object[12480 & -30404])).Method_31698();
        Field_19916 = new Class_31696(Class_19863.Method_19988("\u8998\u899d\u898a\u899f\u8985\u8988\u898a\u899e\u898d\u8985\u8993\u898e\u898d\u89b4\u8992\u8986\u898d"), new Class_2849(Class_19863.Method_19968("\u1a25\u1a23\u1a25\u1a21\u1a20\u1a24\u1a25\u1a20\u1a2a\u1a2b\u1a2e\u1a2a\u1a28\u1a0a\u1a2f\u1a28\u1a32"), new Object[2848 & -15216])).Method_31698();
        Field_19870 = new Class_31696(Class_19863.Method_20026("\u1005\u1000\u1015\u1000\u1014\u1011\u1000\u1015\u1011\u1004\u1015\u1010\u1015\u1011\u1014\u1015\u1000"), new Class_2849(Class_19863.Method_20015("\u241b\u2419\u2409\u2419\u2406\u240c\u241e\u2404\u2403\u241b\u242b\u2401\u240d\u240c\u2406\u240c\u2408"), new Object[-19380 & 16385])).Method_31698();
        Field_19869 = new Class_31696(Class_19863.Method_19949("\u07a2\u07a5\u07a0\u07a5\u07a7\u07a3\u07a0\u07a7\u07af\u07ac\u07ab\u078a\u07ad\u07ac\u07a8\u07af\u07b4\u07b5"), new Class_2849(Class_19863.Method_20003("\u0003\u0001\u0003\u0003\u0002\u0003\u0003\u0001\u0002\u0000\u0000 \u0000\u0000\u0003\u0001\u0011\u0011"), new Object[16384 & 6670])).Method_31698();
        Field_19920 = new Class_31696(Class_19863.Method_20012("\u4860\u4863\u4860\u4861\u4825\u4865\u4867\u4864\u4860\u4862\u4863\u4862\u4864\u4867\u4864\u4867\u4873\u4852\u4873\u4871\u4876\u4875\u4874\u4876\u4873\u4872\u4872\u4873"), new Class_2849(Class_19863.Method_19937("\u9c85\u9c80\u9c95\u9c80\u9c90\u9c94\u9c84\u9c91\u9c89\u9c9d\u9c98\u9c99\u9c8d\u9c88\u9c9d\u9c98\u9c90\u9c95\u9c90\u9c80\u9c91\u9c84\u9c95\u9c95\u9c88\u9c9d\u9c99\u9c98"), new Object[-28540 & 8200])).Method_31698();
        Field_19905 = new Class_31696(Class_19863.Method_19978("\u2400\u2405\u2410\u2405\u2411\u2415\u2410\u2414\u2418\u241c\u241d\u2418\u2419\u2409\u2418\u240d\u2410\u2410\u2405\u2410\u2410\u2411"), new Class_2849(Class_19863.Method_19936("\u1486\u1481\u1486\u1483\u14c3\u1487\u1482\u1486\u148e\u148a\u1489\u148e\u148b\u1489\u148a\u148d\u1494\u1496\u1493\u1496\u1492\u1493"), new Object[8320 & 20513])).Method_31698();
        Field_19915 = new Class_31696(Class_19863.Method_19990("\u0c80\u0c81\u0c80\u0c81\u0c88\u0c81\u0c80\u0c89\u0c80\u0c81\u0c80\u0c81\u0ca8\u0c89\u0c80\u0c81\u0c90\u0c91\u0c90\u0c91\u0c90"), new Class_2849(Class_19863.Method_19921("\ub920\ub921\ub932\ub923\ub930\ub931\ub922\ub933\ub920\ub921\ub932\ub923\ub910\ub931\ub922\ub923\ub930\ub931\ub922\ub933\ub930"), new Object[4430 & 3072])).Method_31698();
        Field_19919 = new Class_31696(Class_19863.Method_19992("\u2240\u2243\u2242\u2243\u2204\u2247\u2244\u2247\u2242\u2243\u2240\u2243\u2244\u2245\u2246\u2247\u2250\u2253\u2252\u2253"), new Class_2849(Class_19863.Method_19991("\u00ee\u00e9\u00ee\u00eb\u00a3\u00e5\u00e0\u00ef\u00ed\u00e8\u00ed\u00c6\u00e3\u00ee\u00ef\u00ea\u00fe\u00f9\u00fa\u00fb"), new Object[192 & -30688])).Method_31698();
        Field_19884 = new Class_31696(Class_19863.Method_20004("\u0820\u0821\u0822\u0823\u0821\u0821\u0822\u0822\u0821\u0820\u0823\u0822\u0820\u0821\u0802\u0823\u0830\u0831\u0832\u0832\u0831\u0830\u0833"), new Class_2849(Class_19863.Method_19985("\u2030\u2030\u2022\u2032\u2060\u2020\u2022\u2032\u2030\u2020\u2022\u2032\u2020\u2030\u2002\u2022\u2020\u2020\u2032\u2032\u2020\u2030\u2032"), new Object[-16380 & 291])).Method_31698();
        Field_19894 = new Class_31696(Class_19863.Method_19963("\u4004\u4000\u4004\u4000\u4005\u4004\u4004\u4004\u4000\u4004\u4001\u4001\u4000\u4001\u4001\u4004\u4004\u4005\u4000\u4000"), new Class_2849(Class_19863.Method_19955("\u0886\u0881\u0886\u0883\u088e\u088f\u088c\u0887\u0888\u088f\u0882\u0881\u088a\u0883\u088a\u0887\u0894\u089d\u0892\u0893"), new Object[3106 & -24044])).Method_31698();
        Field_19896 = new Class_31696(Class_19863.Method_20022("\b\b\u0018\b\u0014\u0014\u0014\f\u0018\u0018\u0010\u0010\u001c\u0014\f\f\u0000\b\b"), new Class_2849(Class_19863.Method_20019("\u4300\u4304\u4312\u4306\u4354\u4314\u4316\u4306\u4314\u4310\u4316\u4316\u4310\u4310\u4306\u4306\u4304\u4304\u4306"), new Object[4888 & -16255])).Method_31698();
        Field_19888 = new Class_31696(Class_19863.Method_19925("\u9060\u9063\u9062\u9063\u9025\u9065\u9067\u9064\u9068\u906a\u9069\u904b\u906c\u906f\u906f\u906e\u9063"), new Class_2849(Class_19863.Method_19960("\u00a0\u00a3\u00a0\u00a1\u00a8\u00a1\u00a8\u00ab\u00a8\u00ab\u00aa\u0089\u00a0\u00ab\u00a8\u00a9\u00a2"), new Object[17548 & 4688])).Method_31698();
        Field_19883 = new Class_31696(Class_19863.Method_19969("\u0c04\u0c00\u0c14\u0c00\u0c11\u0c00\u0c05\u0c15\u0c0d\u0c0c\u0c18\u0c18\u0c1c\u0c1c\u0c18\u0c0d\u0c01\u0c00\u0c05\u0c15\u0c10\u0c11\u0c10\u0c04\u0c18\u0c18"), new Class_2849(Class_19863.Method_19923("\u0890\u0891\u0880\u0891\u0888\u0891\u0890\u0881\u0890\u0891\u0880\u0881\u0880\u0889\u0880\u0891\u0890\u0891\u0890\u0889\u0880\u0881\u0880\u0891\u0880\u0881"), new Object[29256 & 135])).Method_31698();
        Field_19867 = new Class_31696(Class_19863.Method_20027("\u058f\u0588\u059d\u0588\u0596\u059d\u0596\u059c\u0599\u058e\u059f\u0594\u059d\u058b\u058c\u0597\u059c\u0589\u0582\u0589\u058c"), new Class_2849(Class_19863.Method_20010("\ubc08\ubc08\ubc08\ubc08\ubc00\ubc08\ubc00\ubc08\ubc08\ubc08\ubc08\ubc00\ubc08\ubc08\ubc08\ubc00\ubc18\ubc18\ubc10\ubc18\ubc18"), new Object[11266 & 4700])).Method_31698();
        Field_19913 = new Class_31696(Class_19863.Method_20000("\u447a\u4478\u446a\u447a\u4422\u4460\u447a\u446a\u4460\u4448\u4460\u4468\u4460\u4468\u4460\u447a\u4478\u4478"), new Class_2849(Class_19863.Method_19979("\u4006\u4000\u4014\u4000\u4056\u4010\u4004\u4014\u4010\u4010\u4012\u4016\u4010\u4010\u4016\u4004\u4010\u4010"), new Object[5253 & 8192])).Method_31698();
        Field_19914 = new Class_31696(Class_19863.Method_19956("\u5860\u5860\u5870\u5860\u5830\u5860\u5870\u5870\u5878\u5868\u5878\u5848\u5878\u5878\u5868\u5878\u5870"), new Class_2849(Class_19863.Method_19930("\u2200\u2202\u2210\u2200\u225c\u2204\u2214\u2216\u2210\u2208\u2218\u2208\u2216\u221e\u2204\u221c\u2202"), new Object[4168 & 8336])).Method_31698();
        Field_19898 = new Class_31696(Class_19863.Method_19951("\u4308\u4308\u430a\u430a\u4345\u430c\u430e\u430e\u4309\u4301\u4302\u4303\u432c\u430c\u4307\u4307\u4309\u4309\u430a\u430a\u4304\u4305\u4307"), new Class_2849(Class_19863.Method_19948("\u2040\u2040\u2040\u2040\u2004\u2044\u2044\u2044\u2040\u2040\u2040\u2040\u2064\u2044\u2044\u2044\u2050\u2050\u2050\u2050\u2054\u2054\u2054"), new Object[16640 & 51])).Method_31698();
        Field_19890 = new Class_31696(Class_19863.Method_19974("\u0801\u0806\u0813\u0806\u0854\u0811\u0800\u0813\u0814\u0806\u0813\u0814\u0815\u0806\u0813\u0810\u0816\u0817\u0813\u0814\u0806\u0817\u0800\u0813\u0811\u0806\u0813\u0815\u0814"), new Class_2849(Class_19863.Method_19964("\u2088\u2089\u2088\u2089\u2081\u2088\u2080\u2089\u2088\u2081\u2080\u2089\u2080\u2089\u2088\u2089\u2099\u2098\u2099\u2098\u2098\u2099\u2090\u2090\u2099"), new Object[-22231 & 194])).Method_31698();
        Field_19907 = new Class_31696(Class_19863.Method_19983("\u2884\u2881\u2884\u2881\u28c4\u2881\u2880\u2885\u288c\u2889\u2888\u288d\u288c\u288d\u288c\u288d"), new Class_2849(Class_19863.Method_20023("\u6a84\u6a81\u6a94\u6a81\u6a98\u6a95\u6a9c\u6a91\u6a8c\u6a89\u6a90\u6a8d\u6a98\u6a91\u6a98\u6a99"), new Object[-30702 & 4096])).Method_31698();
        Field_19891 = new Class_13017[-18424 & 4674];
        Field_19885 = new Class_13017[-727 & 32004];
        Field_19917 = new Class_13017[32001 & 32066];
        Field_19900 = new Class_13017[32026 & 32033];
    }

    private static String Method_19960(String string) {
        int n = 13162;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 82);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19961(String string) {
        int n = 24263;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 38);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19962(String string) {
        int n = 14831;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 32);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19963(String string) {
        int n = 18832;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 77);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19964(String string) {
        int n = 7557;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 94);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19965(Class_1956 class_1956) {
        Class_2080 class_2080 = (Class_2080)Class_1956.Field_1961.Method_3648(class_1956);
        return class_2080 != null ? class_2080.Method_2086().replace((char)(-18502 & 2107), (char)(1086 & -30354)) : null;
    }

    private static String Method_19966(String string) {
        int n = 5256;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 46);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19967(String string) {
        int n = 21123;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19968(String string) {
        int n = 9910;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 62);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19969(String string) {
        int n = 19899;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 83);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19970(String string) {
        int n = 29508;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19971(String string) {
        int n = 5526;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 47);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_19972() {
        for (Class_3238 class_3238 : Class_3238.Field_3271) {
            Class_1956 class_1956 = Class_1956.Method_1981(class_3238);
            if (class_1956 == null) continue;
            int n = Class_3238.Method_3435(class_3238);
            String string = Class_19863.Method_19965(class_1956);
            if (string == null || !class_3238.Method_3303()) continue;
            Object[] arrobject = new Object[1075 & 4357];
            arrobject[20768 & -32255] = new Class_23823(class_3238).Method_23900();
            Class_19863.Field_19891[n] = new Class_22538("stat.mineBlock.", string, new Class_2849("stat.mineBlock", arrobject), class_1956).\u0000strictfp();
            Field_19880.add((Class_22538)Field_19891[n]);
        }
        Class_19863.Method_19993(Field_19891);
    }

    private static String Method_19973(String string) {
        int n = 20614;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19974(String string) {
        int n = 32567;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 93);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19975(String string) {
        int n = 15528;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19976(String string) {
        int n = 24818;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19977(String string) {
        int n = 7245;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19978(String string) {
        int n = 8893;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 69);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19979(String string) {
        int n = 26891;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 88);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19980(String string) {
        int n = 26311;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 35);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_19981() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_19982(String string) {
        int n = 21714;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 51);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19983(String string) {
        int n = 23916;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 95);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19984(String string) {
        int n = 16110;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19985(String string) {
        int n = 5764;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 76);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19986(String string) {
        int n = 27404;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_19987() {
        Class_19863.Method_19972();
        Class_19863.Method_20008();
        Class_19863.Method_19940();
        Class_19863.Method_20014();
        Class_21905.Method_21945();
        Class_15516.Method_15593();
    }

    private static String Method_19988(String string) {
        int n = 18968;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 61);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19989(String string) {
        int n = 23400;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19990(String string) {
        int n = 31193;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 71);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19991(String string) {
        int n = 24612;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 74);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19992(String string) {
        int n = 12248;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 73);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_19993(Class_13017[] arrclass_13017) {
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9286, Class_9265.Field_9281);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9358, Class_9265.Field_9403);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9284, Class_9265.Field_9337);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9425, Class_9265.Field_9354);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9452, Class_9265.Field_9305);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9391, Class_9265.Field_9374);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9310, Class_9265.Field_9435);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9273, Class_9265.Field_9461);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9355, Class_9265.Field_9316);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9392, Class_9265.Field_9430);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9301, Class_9265.Field_9460);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9362, Class_9265.Field_9463);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9319, Class_9265.Field_9272);
        Class_19863.Method_19953(arrclass_13017, Class_9265.Field_9356, Class_9265.Field_9272);
    }

    private static String Method_19994(String string) {
        int n = 22761;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19995(String string) {
        int n = 25604;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19996(String string) {
        int n = 3258;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19997(String string) {
        int n = 24026;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 40);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19998(String string) {
        int n = 17364;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_19999(String string) {
        int n = 19204;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 37);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20000(String string) {
        int n = 1200;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 87);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20001(String string) {
        int n = 99;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20002(String string) {
        int n = 25372;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 41);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20003(String string) {
        int n = 12820;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 66);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20004(String string) {
        int n = 31639;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 75);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20005(String string) {
        int n = 28292;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 55);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20006(String string) {
        int n = 6758;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 39);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20007(String string) {
        int n = 4718;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_20008() {
        Iterator iterator = Class_1956.Field_1961.Method_3651();
        while (iterator.hasNext()) {
            Class_1956 class_1956 = (Class_1956)iterator.next();
            if (class_1956 == null) continue;
            int n = Class_1956.Method_1986(class_1956);
            String string = Class_19863.Method_19965(class_1956);
            if (string == null) continue;
            Object[] arrobject = new Object[2215 & 8721];
            arrobject[5250 & 8817] = new Class_23823(class_1956).Method_23900();
            Class_19863.Field_19917[n] = new Class_22538("stat.useItem.", string, new Class_2849("stat.useItem", arrobject), class_1956).\u0000strictfp();
            if (class_1956 instanceof Class_41056) continue;
            Field_19899.add((Class_22538)Field_19917[n]);
        }
        Class_19863.Method_19993(Field_19917);
    }

    private static String Method_20009(String string) {
        int n = 4731;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 31);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20010(String string) {
        int n = 28286;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 86);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20011(String string) {
        int n = 27375;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 34);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20012(String string) {
        int n = 10880;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 67);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20013(String string) {
        int n = 3578;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 48);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_20014() {
        HashSet hashSet = Sets.newHashSet();
        for (Object object : Class_22497.Method_22506().Method_22505()) {
            if (object.Method_19221() == null) continue;
            hashSet.add(object.Method_19221().Method_23844());
        }
        for (Object object : Class_30396.Method_30400().Method_30407().values()) {
            hashSet.add(((Class_23823)object).Method_23844());
        }
        for (Object object : hashSet) {
            if (object == null) continue;
            int n = Class_1956.Method_1986((Class_1956)object);
            String string = Class_19863.Method_19965((Class_1956)object);
            if (string == null) continue;
            Object[] arrobject = new Object[1033 & -19951];
            arrobject[2145 & 13442] = new Class_23823((Class_1956)object).Method_23900();
            Class_19863.Field_19885[n] = new Class_22538("stat.craftItem.", string, new Class_2849("stat.craftItem", arrobject), (Class_1956)object).\u0000strictfp();
        }
        Class_19863.Method_19993(Field_19885);
    }

    private static String Method_20015(String string) {
        int n = 25925;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 64);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20016(String string) {
        int n = 23275;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20017(String string) {
        int n = 159;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20018(String string) {
        int n = 18097;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 53);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20019(String string) {
        int n = 7108;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 80);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20020(String string) {
        int n = 1000;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 43);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20021(String string) {
        int n = 26206;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20022(String string) {
        int n = 3832;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 79);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20023(String string) {
        int n = 12416;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 96);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20024(String string) {
        int n = 16930;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_13017 Method_20025(String string) {
        return (Class_13017)Field_19887.get(string);
    }

    private static String Method_20026(String string) {
        int n = 17899;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 63);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20027(String string) {
        int n = 28483;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 85);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20028(String string) {
        int n = 8281;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19863.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

