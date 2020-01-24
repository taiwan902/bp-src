/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_15516 {
    private static final Map Field_15517;
    private static final Map Field_15518;
    private static final Map Field_15519;
    public static final Map Field_15520;
    private static final Map Field_15521;
    private static final Map Field_15522;
    private static final Logger Field_15523;

    private static String Method_15524(String string) {
        int n = 23556;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 46);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15525(String string) {
        int n = 4408;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15526(String string) {
        int n = 21911;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 54);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15527(String string) {
        int n = 4834;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 33);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15528(String string) {
        int n = 28757;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15529(String string) {
        int n = 426;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15530(String string) {
        int n = 27184;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 37);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15531(String string) {
        int n = 11083;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 31);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15532(String string) {
        int n = 12318;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15533(String string) {
        int n = 6726;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_1061 Method_15534(int n, Class_283 class_283) {
        Class_1061 class_1061 = null;
        try {
            Class class_ = Class_15516.Method_15590(n);
            if (class_ != null) {
                Class[] arrclass = new Class[-18379 & 17409];
                arrclass[-31710 & 15305] = Class_283.class;
                Object[] arrobject = new Object[4097 & -15483];
                arrobject[2689 & 25616] = class_283;
                class_1061 = (Class_1061)class_.getConstructor(arrclass).newInstance(arrobject);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (class_1061 == null) {
            Field_15523.warn("Skipping Entity with id " + n);
        }
        return class_1061;
    }

    private static String Method_15535(String string) {
        int n = 11704;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15536(String string) {
        int n = 25444;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_15537(String string) {
        Integer n = (Integer)Field_15518.get(string);
        return n == null ? 25818 & -32389 : n;
    }

    private static String Method_15538(String string) {
        int n = 23982;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15539(String string) {
        int n = 1502;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 49);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static String Method_15540(Class_1061 class_1061) {
        return (String)Field_15519.get(class_1061.getClass());
    }

    private static String Method_15541(String string) {
        int n = 31926;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 30);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15542(String string) {
        int n = 1602;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15543(String string) {
        int n = 31124;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 38);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_15544(Class_1061 class_1061, String string) {
        String string2 = Class_15516.Method_15540(class_1061);
        if (string2 == null && class_1061 instanceof Class_626) {
            string2 = "Player";
        } else if (string2 == null && class_1061 instanceof Class_27363) {
            string2 = "LightningBolt";
        }
        return string.equals(string2);
    }

    private static String Method_15545(String string) {
        int n = 5452;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 48);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15546(String string) {
        int n = 19632;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15547(String string) {
        int n = 7904;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15548(String string) {
        int n = 12936;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_15549(Class_1061 class_1061) {
        Integer n = (Integer)Field_15522.get(class_1061.getClass());
        return n == null ? 21234 & 11528 : n;
    }

    private static String Method_15550(String string) {
        int n = 29965;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static List Method_15551() {
        Set set = Field_15521.keySet();
        ArrayList arrayList = Lists.newArrayList();
        for (String string : set) {
            Class class_ = (Class)Field_15521.get(string);
            if ((class_.getModifiers() & (21540 & -23038)) == (1216 & 1536)) continue;
            arrayList.add(string);
        }
        arrayList.add("LightningBolt");
        return arrayList;
    }

    private static String Method_15552(String string) {
        int n = 1905;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 41);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15553(String string) {
        int n = 25558;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 51);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15554(String string) {
        int n = 29877;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15555(String string) {
        int n = 24254;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 53);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15556(String string) {
        int n = 8823;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 34);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15557(String string) {
        int n = 809;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15558(String string) {
        int n = 20071;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_1061 Method_15559(String string, Class_283 class_283) {
        Class_1061 class_1061 = null;
        try {
            Class class_ = (Class)Field_15521.get(string);
            if (class_ != null) {
                Class[] arrclass = new Class[8449 & -32009];
                arrclass[-20312 & 2052] = Class_283.class;
                Object[] arrobject = new Object[10565 & 16435];
                arrobject[10018 & 16576] = class_283;
                class_1061 = (Class_1061)class_.getConstructor(arrclass).newInstance(arrobject);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return class_1061;
    }

    private static String Method_15560(String string) {
        int n = 24049;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15561(String string) {
        int n = 23014;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15562(String string) {
        int n = 2647;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 47);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15563(String string) {
        int n = 14372;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 44);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15564(String string) {
        int n = 26296;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15565(String string) {
        int n = 24892;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 36);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_15523 = LogManager.getLogger();
        Field_15521 = Maps.newHashMap();
        Field_15519 = Maps.newHashMap();
        Field_15517 = Maps.newHashMap();
        Field_15522 = new HashMap();
        Field_15518 = Maps.newHashMap();
        Field_15520 = Maps.newLinkedHashMap();
        Class_15516.Method_15570(Class_3443.class, Class_15516.Method_15554("\u0259\u0260\u0273\u027b"), 11293 & -32639);
        Class_15516.Method_15570(Class_3481.class, Class_15516.Method_15564("\ue222\ue223\ue222\ue203\ue204"), 4614 & 211);
        Class_15516.Method_15570(Class_47588.class, Class_15516.Method_15533("\u8400\u8431\u8420\u8431\u8424\u8435\u8414\u8435\u8438"), 11271 & -32697);
        Class_15516.Method_15570(Class_32225.class, Class_15516.Method_15560("\u0185\u0184\u0182\u0182\u0185\u0184\u0183\u0182\u0185"), 152 & 29260);
        Class_15516.Method_15570(Class_30799.class, Class_15516.Method_15568("\u8262\u8243\u8248\u824b\u8246\u824f\u824e\u8247"), 73 & 539);
        Class_15516.Method_15570(Class_41498.class, Class_15516.Method_15591("\u82c3\u82c0\u82c0\u82cd\u82c5"), 14378 & 2011);
        Class_15516.Method_15570(Class_34918.class, Class_15516.Method_15547("\u0875\u0841\u0841\u0850\u0844\u0844\u0840\u0841"), 539 & -26545);
        Class_15516.Method_15570(Class_34950.class, Class_15516.Method_15546("\u0295\u02b0\u02a1\u02b4\u02b1\u02b0\u02b5\u02b5"), 1308 & 2092);
        Class_15516.Method_15570(Class_36739.class, Class_15516.Method_15589("\u2030\u2004\u2002\u2006\u2000\u2020\u2006\u2016\u2004\u2000\u2002\u2006\u2000"), 13 & -28451);
        Class_15516.Method_15570(Class_34203.class, Class_15516.Method_15576("\ua010\ua004\ua016\ua002\ua010\ua000\ua002\ua002\ua000\ua000\ua016\ua016\ua000\ua004\ua016\ua002"), 2078 & -27634);
        Class_15516.Method_15570(Class_25548.class, Class_15516.Method_15557("\ub000\ub010\ub002\ub000\ub002\ub000\ub000\ub002\ub000\ub012\ub010\ub002\ub002\ub002\ub002\ub002"), -13233 & 12431);
        Class_15516.Method_15570(Class_43663.class, Class_15516.Method_15525("\u8500\u8524\u8526\u8522\u8524\u8524\u8502\u8526\u8528\u852c\u852a\u852a"), -16044 & 1042);
        Class_15516.Method_15570(Class_35722.class, Class_15516.Method_15535("\ud0ee\ud0c3\ud0ca\ud0c7\ud0c8\ud0c1\ud0e8\ud0c5\ud0c2\ud0e1\ud0ce\ud0c5\ud0c2\ud0cb\ud0c0"), 337 & 13361);
        Class_15516.Method_15570(Class_36512.class, Class_15516.Method_15538("\u8000\u8028\u8028\u8021\u8009\u8028\u8028\u8021\u8028"), 21015 & 1106);
        Class_15516.Method_15570(Class_47728.class, Class_15516.Method_15585("\ua607\ua600\ua606\ua603\ua605\ua603\ua601\ua600\ua60d\ua60d\ua60e"), 4307 & 315);
        Class_15516.Method_15570(Class_5813.class, Class_15516.Method_15548("\u8182\u8180\u8193\u8193\u8193\u8192\u8182\u8190\u8182"), -15851 & 7454);
        Class_15516.Method_15570(Class_4486.class, Class_15516.Method_15529("\u0014367610\u0005256"), 20893 & 10293);
        Class_15516.Method_15570(Class_41709.class, Class_15516.Method_15558("@h```h`h`@h`h``@h`h`h"), 86 & -21226);
        Class_15516.Method_15570(Class_27288.class, Class_15516.Method_15586("\u8008\u803a\u8026\u8024\u803e\u801e\u803a\u802e\u8026\u802c"), 28703 & -30498);
        Class_15516.Method_15570(Class_25683.class, Class_15516.Method_15550("\u0000( 0"), 4137 & 17785);
        Class_15516.Method_15570(Class_30187.class, Class_15120.Field_15128.Method_15145(), 43 & 20206);
        Class_15516.Method_15570(Class_41439.class, Class_15120.Field_15129.Method_15145(), 1583 & -26453);
        Class_15516.Method_15570(Class_21239.class, Class_15120.Field_15130.Method_15145(), 19692 & 8748);
        Class_15516.Method_15570(Class_19785.class, Class_15120.Field_15126.Method_15145(), -30547 & 109);
        Class_15516.Method_15570(Class_44798.class, Class_15120.Field_15121.Method_15145(), -28434 & 8254);
        Class_15516.Method_15570(Class_33348.class, Class_15120.Field_15124.Method_15145(), 12335 & 1343);
        Class_15516.Method_15570(Class_21091.class, Class_15120.Field_15131.Method_15145(), -16327 & 2984);
        Class_15516.Method_15570(Class_34093.class, Class_15516.Method_15532("\u8900\u8901\u890f"), 6066 & -32708);
        Class_15516.Method_15570(Class_41880.class, Class_15516.Method_15528("\u9d09\u9d09\u9d0a\u9d07\u9d04\u9d05\u9d02"), 8249 & 3127);
        Class_15516.Method_15580(Class_43073.class, Class_15516.Method_15536("\u00011%$4 4"), -32646 & 27827, 135128875 & 1932377871, 13349 & 18512);
        Class_15516.Method_15580(Class_43151.class, Class_15516.Method_15561("\u2283\u2283\u2285\u2284\u2285\u2284\u2287\u2286"), -2829 & 563, 1355537857 & 146915787, 1615419721 & 6932973);
        Class_15516.Method_15580(Class_44290.class, Class_15516.Method_15592("\u1100\u1100\u1102\u1106\u1104\u1100"), 1334 & 4221, -998359769 & 146025895, -2085810498 & 1487544078);
        Class_15516.Method_15570(Class_43146.class, Class_15516.Method_15584("\u1099\u1091\u1099\u1090\u108c"), 18175 & 4405);
        Class_15516.Method_15580(Class_43566.class, Class_15516.Method_15542("\u1149\u1149\u114a\u1142\u1148\u1141"), -16073 & 8382, -2106544129 & 285454255, -897868699 & 553229551);
        Class_15516.Method_15580(Class_35570.class, Class_15516.Method_15572("\u8068\u8057\u8050\u8055\u805a"), 1087 & -22345, 47314110 & -1789286082, 1350500334 & -1468022914);
        Class_15516.Method_15580(Class_46703.class, Class_15516.Method_15567("\u7050\u7052\u7052\u7040\u7042"), 56 & 15929, 435812857 & 620493309, 1711062524 & 180141756);
        Class_15516.Method_15580(Class_46429.class, Class_15516.Method_15541(" \u0019\u0013*\u0019\u0019\u0012\u001b\u0019"), -24519 & 5305, 1743762323 & 16422867, -1043499591 & 474902889);
        Class_15516.Method_15580(Class_46025.class, Class_15516.Method_15531("\u4007\u400c\u4004\u4005\u4014\u400b\u4005\u400a"), 24762 & 4922, 1217812118 & 545166871, 2212 & 321);
        Class_15516.Method_15580(Class_45324.class, Class_15516.Method_15587("\u02a3\u0281\u0292\u0281\u02b7\u0294\u0285\u0284\u0281\u0292"), 18939 & 59, 55329374 & -669105330, -1850110386 & 111689646);
        Class_15516.Method_15580(Class_45373.class, Class_15516.Method_15527("\u0d43\u0d60\u0d60\u0d63\u0d65\u0d67\u0d66\u0d64\u0d6b\u0d69"), -32132 & 5436, 1090416494 & 862944878, 36844081 & -2047315910);
        Class_15516.Method_15580(Class_42260.class, Class_15516.Method_15556("\u0003,\"( "), 4605 & 575, -906038511 & 83278369, 587200638 & -2130707073);
        Class_15516.Method_15580(Class_36060.class, Class_15516.Method_15574("\uc006\uc002\uc006\uc000\uc004\uc002\uc004\uc000\uc00e"), 16830 & -32642, 1110742788 & 16124011, 16579616 & 1224539984);
        Class_15516.Method_15570(Class_34590.class, Class_15516.Method_15565("\u1921\u1908\u1902\u1903\u1914\u1924\u1916\u1907\u1909\u1901\u1902"), 2111 & -28609);
        Class_15516.Method_15570(Class_42901.class, Class_15516.Method_15530("\u0082\u0081\u0082\u0083\u0083\u0081\u0082\u0083"), 16592 & 72);
        Class_15516.Method_15580(Class_47097.class, Class_15516.Method_15543("\u4840\u4840\u4852"), 13377 & 19019, 1416380024 & 550305456, -736161937 & 539987855);
        Class_15516.Method_15580(Class_44826.class, Class_15516.Method_15566("\u0088\u00a5\u00a8\u00ad\u00a0"), -26558 & 24679, 867591268 & 70523025, 273916222 & 1129423039);
        Class_15516.Method_15580(Class_45994.class, Class_15516.Method_15588("\u8600\u8620\u8620\u8620\u8624\u8620\u8624\u8620\u8628"), 99 & 4815, 177643030 & -780265546, -1066504338 & 159383166);
        Class_15516.Method_15580(Class_44640.class, Class_15516.Method_15552("HYHXMELD"), -20027 & 16510, 49972978 & 1616808822, 1895006000 & -2131657420);
        Class_15516.Method_15580(Class_47600.class, Class_15516.Method_15569("\u1084\u1085\u1080"), 90 & 17242, 1357950374 & 586725346, 14412767 & -1527023777);
        Class_15516.Method_15580(Class_46658.class, Class_15516.Method_15583("\u440c\u4406\u4408\u4408\u440e"), 5499 & -24353, 820508647 & 66054119, 50329525 & 553629173);
        Class_15516.Method_15580(Class_43539.class, Class_15516.Method_15563("\u3196\u31b3\u31a2"), -23971 & 6364, 96876070 & -498731409, -2136366175 & 296198649);
        Class_15516.Method_15580(Class_46796.class, Class_15516.Method_15581("\u20a0\u2089\u208a\u2083\u2088\u2081\u208a"), -28419 & 1629, 149138849 & 44147105, -1325440957 & 83856016);
        Class_15516.Method_15580(Class_38719.class, Class_15516.Method_15524("\u1418\u1419\u1418\u1401\u1409"), 4190 & 2142, 237681485 & 539114319, 309455001 & 209356955);
        Class_15516.Method_15580(Class_47526.class, Class_15516.Method_15562("\u0520\u0519\u051b\u0510"), -21665 & 5215, 1675088859 & 83352531, 1624158110 & 147767190);
        Class_15516.Method_15580(Class_46942.class, Class_15516.Method_15545("\u000000 0   \u0000 0"), 24688 & 2532, 883306264 & -1063149679, -1829259329 & 12040119);
        Class_15516.Method_15570(Class_45531.class, Class_15516.Method_15539("\u3005\u3020\u3021\u3021\u3007\u3023\u3024"), -20383 & 99);
        Class_15516.Method_15580(Class_47883.class, Class_15516.Method_15575("\u4260\u4240\u4248\u4240\u4244\u424c"), 8299 & 5222, 1928322685 & -2130715009, 578208820 & 1347846076);
        Class_15516.Method_15570(Class_45624.class, Class_15516.Method_15553("\u0400\u0409\u0408\u0409\u0400\u0401\u0400\u0401\u0400\u0409\u0408\u0401\u0408"), 6883 & 1379);
        Class_15516.Method_15580(Class_46199.class, Class_15516.Method_15582("\u0000\b\u0001\t\u0001\t\t\t\u0001\u0001\u0000"), 19558 & 372, 1354800765 & -2115969411, 317712130 & 1827595648);
        Class_15516.Method_15580(Class_44525.class, Class_15516.Method_15555("\u4aa9\u4a8a\u4a8b\u4a8b\u4a86\u4a8f"), -32659 & 1893, 1083793344 & 14376788, 41142455 & 1366509937);
        Class_15516.Method_15580(Class_43334.class, Class_15516.Method_15526("\u0015#%$\"%$2"), -32129 & 20600, -428442573 & 6175927, 129862514 & -385897613);
        Class_15516.Method_15570(Class_14845.class, Class_15516.Method_15577("\u0c19\u0c31\u0c38\u0c38\u0c28\u0c18\u0c28\u0c20\u0c29\u0c29\u0c39\u0c31"), -32280 & 9418);
    }

    private static String Method_15566(String string) {
        int n = 24438;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 39);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15567(String string) {
        int n = 7758;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15568(String string) {
        int n = 2912;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15569(String string) {
        int n = 8685;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 42);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_15570(Class class_, String string, int n) {
        if (Field_15521.containsKey(string)) {
            throw new IllegalArgumentException("ID is already registered: " + string);
        }
        if (Field_15517.containsKey(n)) {
            throw new IllegalArgumentException("ID is already registered: " + n);
        }
        if (n == 0) {
            throw new IllegalArgumentException("Cannot register to reserved id: " + n);
        }
        if (class_ == null) {
            throw new IllegalArgumentException("Cannot register null clazz for id: " + n);
        }
        Field_15521.put(string, class_);
        Field_15519.put(class_, string);
        Field_15517.put(n, class_);
        Field_15522.put(class_, n);
        Field_15518.put(string, n);
    }

    public static String Method_15571(int n) {
        return (String)Field_15519.get(Class_15516.Method_15590(n));
    }

    private static String Method_15572(String string) {
        int n = 173;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_15573(String string) {
        return ("Player".equals(string) || Class_15516.Method_15551().contains(string) ? -19929 & 17 : 256 & -20416) != 0;
    }

    private static String Method_15574(String string) {
        int n = 17850;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 35);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15575(String string) {
        int n = 23745;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 50);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15576(String string) {
        int n = 1817;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15577(String string) {
        int n = 31096;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 55);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_1061 Method_15578(Class_1699 class_1699, Class_283 class_283) {
        Class_1061 class_1061 = null;
        if ("Minecart".equals(class_1699.Method_1708("id"))) {
            class_1699.Method_1702("id", Class_15120.Method_15150(class_1699.Method_1738("Type")).Method_15145());
            class_1699.Method_1740("Type");
        }
        try {
            Class class_ = (Class)Field_15521.get(class_1699.Method_1708("id"));
            if (class_ != null) {
                Class[] arrclass = new Class[3137 & -24295];
                arrclass[-29677 & 264] = Class_283.class;
                Object[] arrobject = new Object[1185 & 259];
                arrobject[24682 & 6417] = class_283;
                class_1061 = (Class_1061)class_.getConstructor(arrclass).newInstance(arrobject);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (class_1061 != null) {
            class_1061.Method_1318(class_1699);
        } else {
            Field_15523.warn("Skipping Entity with id " + class_1699.Method_1708("id"));
        }
        return class_1061;
    }

    private void Method_15579() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static void Method_15580(Class class_, String string, int n, int n2, int n3) {
        Class_15516.Method_15570(class_, string, n);
        Field_15520.put(n, new Class_7898(n, n2, n3));
    }

    private static String Method_15581(String string) {
        int n = 32302;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 45);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15582(String string) {
        int n = 25331;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 52);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15583(String string) {
        int n = 30982;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 43);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15584(String string) {
        int n = 21928;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15585(String string) {
        int n = 16634;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15586(String string) {
        int n = 10770;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15587(String string) {
        int n = 12653;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 32);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15588(String string) {
        int n = 22452;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 40);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15589(String string) {
        int n = 9180;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class Method_15590(int n) {
        return (Class)Field_15517.get(n);
    }

    private static String Method_15591(String string) {
        int n = 11252;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_15592(String string) {
        int n = 17359;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15516.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_15593() {
    }
}

