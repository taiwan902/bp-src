/*
 * Decompiled with CFR 0.145.
 */
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Class_25918 {
    private static final String[] Field_25919;
    private static Class_11372 Field_25920;
    public static final Class_3436 Field_25921;
    private static Class_30312[][] Field_25922;
    private static Map[] Field_25923;
    private static Class_30312[][] Field_25924;
    private static final int[] Field_25925;
    private static boolean Field_25926;

    private static Class_11372 Method_25927(Class_30312 class_30312, Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, int n, int n2, Class_11372 class_11372, int n3) {
        int n4 = 27926 & 4128;
        switch (n) {
            case 0: {
                if (n2 == (24237 & 65) || n2 == 0) {
                    return null;
                }
                n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769(), n2, class_11372, n3) ? 1 : 0;
                break;
            }
            case 1: {
                if (n2 == (547 & 16403) || n2 == (29954 & -32633)) {
                    return null;
                }
                n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4784(), n2, class_11372, n3) ? 1 : 0;
                break;
            }
            case 2: {
                if (n2 == (13 & 10887) || n2 == (-24524 & 1093)) {
                    return null;
                }
                n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770(), n2, class_11372, n3) ? 1 : 0;
            }
        }
        if (n4 != 0) {
            return class_30312.Field_30313[198 & 3345];
        }
        return null;
    }

    private static String Method_25928(String string) {
        int n = 32437;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_11372 Method_25929(Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, Class_4595 class_4595, Class_11372 class_11372, Class_29859 class_29859) {
        Class_11372 class_113722;
        Class_11372 class_113723 = Class_25918.Method_25943(class_561, class_3436, class_4751, class_4595, class_11372, (23073 & -31743) != 0, class_29859);
        if (!Field_25926) {
            return class_113723;
        }
        if (class_113723 == class_11372) {
            return class_113723;
        }
        Class_11372 class_113724 = class_113723;
        for (int i = -28670 & 11264; i < (-24541 & 95) && (class_113722 = Class_25918.Method_25943(class_561, class_3436, class_4751, class_4595, class_113724, (2054 & -28399) != 0, class_29859)) != class_113724; ++i) {
            class_113724 = class_113722;
        }
        return class_113724;
    }

    public static void Method_25930(Class_24069 class_24069, Class_2035 class_2035) {
        String[] arrstring = Class_15780.Method_15785(class_2035, "mcpatcher/ctm/", ".properties", Class_25918.Method_25952());
        Arrays.sort(arrstring);
        List list = Class_25918.Method_25972(Field_25924);
        List list2 = Class_25918.Method_25972(Field_25922);
        for (int i = 16418 & 9989; i < arrstring.length; ++i) {
            String string = arrstring[i];
            Class_19426.Method_19526("ConnectedTextures: " + string);
            try {
                Class_2080 class_2080 = new Class_2080(string);
                InputStream inputStream = class_2035.Method_2039(class_2080);
                if (inputStream == null) {
                    Class_19426.Method_19610("ConnectedTextures file not found: " + string);
                    continue;
                }
                Properties properties = new Properties();
                properties.load(inputStream);
                Class_30312 class_30312 = new Class_30312(properties, string);
                if (!class_30312.Method_30351(string)) continue;
                class_30312.Method_30352(class_24069);
                Class_25918.Method_25945(class_30312, list);
                Class_25918.Method_25937(class_30312, list2);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                Class_19426.Method_19610("ConnectedTextures file not found: " + string);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        Field_25922 = Class_25918.Method_25954(list2);
        Field_25924 = Class_25918.Method_25954(list);
        Field_25926 = Class_25918.Method_25942();
        Class_19426.Method_19526("Multipass connected textures: " + Field_25926);
    }

    private static String Method_25931(String string) {
        int n = 32047;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25932(String string) {
        int n = 19253;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25933(String string) {
        int n = 27796;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_11372 Method_25934(Class_30312 class_30312, Class_561 class_561, Class_3692 class_3692, Class_4751 class_4751, int n, Class_11372 class_11372, Class_29859 class_29859) {
        int n2;
        Class_17281 class_17281;
        int n3;
        int n4 = 16930 & 4488;
        int n5 = n2 = class_3692.Method_3701();
        Class_3238 class_3238 = class_3692.\u0000strictfp();
        if (class_3238 instanceof Class_4561) {
            n4 = Class_25918.Method_25949(n, n2);
            if (class_30312.Method_30353() <= (-28349 & 2731)) {
                n5 = n2 & (-32753 & 131);
            }
        }
        if (class_3238 instanceof Class_24146) {
            n4 = Class_25918.Method_25940(n, n2);
            if (class_30312.Method_30353() <= (-12061 & 2050) && n5 > (259 & 1090)) {
                n5 = -31470 & 4235;
            }
        }
        if (!class_30312.Method_30343(class_3692.Method_3702(), n5)) {
            return null;
        }
        if (n >= 0 && class_30312.Field_30334 != (127 & -14273)) {
            n3 = n;
            if (n4 != 0) {
                n3 = Class_25918.Method_25950(n, n4);
            }
            if (((537 & 25027) << n3 & class_30312.Field_30334) == 0) {
                return null;
            }
        }
        n3 = class_4751.\u0000, `();
        if (class_30312.Field_30317 != null && !class_30312.Field_30317.Method_27485(n3)) {
            return null;
        }
        if (class_30312.Field_30332 != null && !class_30312.Method_30363(class_17281 = class_561.Method_567(class_4751))) {
            return null;
        }
        switch (class_30312.Field_30333) {
            case 1: {
                return Class_25918.Method_25960(class_30312, class_561, class_3692, class_4751, n4, n, class_11372, n2, class_29859);
            }
            case 2: {
                return Class_25918.Method_25983(class_30312, class_561, class_3692, class_4751, n4, n, class_11372, n2);
            }
            case 3: {
                return Class_25918.Method_25927(class_30312, class_561, class_3692, class_4751, n4, n, class_11372, n2);
            }
            case 4: {
                return Class_25918.Method_25941(class_30312, class_561, class_3692, class_4751, n);
            }
            case 5: {
                return Class_25918.Method_25984(class_30312, class_4751, n);
            }
            case 6: {
                return Class_25918.Method_25981(class_30312, class_561, class_3692, class_4751, n4, n, class_11372, n2);
            }
            case 7: {
                return Class_25918.Method_25947(class_30312);
            }
            case 8: {
                return Class_25918.Method_25982(class_30312, class_561, class_3692, class_4751, n4, n, class_11372, n2);
            }
            case 9: {
                return Class_25918.Method_25957(class_30312, class_561, class_3692, class_4751, n4, n, class_11372, n2);
            }
        }
        return null;
    }

    private static String Method_25935(String string) {
        int n = 19303;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_14461 Method_25936(Class_14461 class_14461, Class_11372 class_11372) {
        int[] arrn = (int[])class_14461.Method_14478().clone();
        Class_11372 class_113722 = class_14461.Method_14476();
        for (int i = 23649 & 258; i < (260 & 11316); ++i) {
            Class_25918.Method_25961(arrn, i, class_113722, class_11372);
        }
        Class_14461 class_144612 = new Class_14461(arrn, class_14461.Method_14467(), class_14461.Method_14475(), class_11372);
        return class_144612;
    }

    private static void Method_25937(Class_30312 class_30312, List list) {
        if (class_30312.Field_30314 != null) {
            for (int i = 2297 & 8452; i < class_30312.Field_30314.length; ++i) {
                int n = class_30312.Field_30314[i].Method_30308();
                if (n < 0) {
                    Class_19426.Method_19610("Invalid block ID: " + n);
                    continue;
                }
                Class_25918.Method_25959(class_30312, list, n);
            }
        }
    }

    private static boolean Method_25938(Class_30312 class_30312, Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, int n, Class_11372 class_11372, int n2) {
        Class_3436 class_34362 = class_561.Method_568(class_4751);
        if (class_3436 == class_34362) {
            return (-32767 & 193) != 0;
        }
        if (class_30312.Field_30331 == (14402 & -30962)) {
            if (class_34362 == null) {
                return (16388 & 2) != 0;
            }
            if (class_34362 == Field_25921) {
                return (-32190 & 1068) != 0;
            }
            Class_11372 class_113722 = Class_25918.Method_25958(class_561, class_4751, class_34362, n);
            return (class_113722 == class_11372 ? 16385 & -28609 : -28624 & 384) != 0;
        }
        return (class_30312.Field_30331 == (387 & 25699) ? (class_34362 == null ? -32192 & 10 : (class_34362 == Field_25921 ? 1159 & 2568 : (class_34362.Method_3442().Method_3373() == class_3436.Method_3442().Method_3373() ? 8323 & 1 : 10246 & 1272))) : -30195 & 4546) != 0;
    }

    private static String Method_25939(String string) {
        int n = 24433;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_25940(int n, int n2) {
        switch (n2) {
            case 3: {
                return -24170 & 4138;
            }
            case 4: {
                return -25835 & 1217;
            }
        }
        return 28722 & -30647;
    }

    private static Class_11372 Method_25941(Class_30312 class_30312, Class_561 class_561, Class_3692 class_3692, Class_4751 class_4751, int n) {
        if (class_30312.Field_30313.length == (12289 & -15803)) {
            return class_30312.Field_30313[4164 & -30591];
        }
        int n2 = n / class_30312.Field_30320 * class_30312.Field_30320;
        if (class_30312.Field_30324) {
            Class_4751 class_47512 = class_4751.Method_4782();
            Class_3436 class_3436 = class_561.Method_568(class_47512);
            while (class_3436.Method_3442() == class_3692.\u0000strictfp()) {
                class_4751 = class_47512;
                if ((class_47512 = class_47512.Method_4782()).\u0000, `() < 0) break;
                class_3436 = class_561.Method_568(class_47512);
            }
        }
        int n3 = Class_19426.Method_19566(class_4751, n2) & (Integer.MAX_VALUE & Integer.MAX_VALUE);
        int n4 = 1413 & 30728;
        if (class_30312.Field_30321 == null) {
            n4 = n3 % class_30312.Field_30313.length;
        } else {
            int n5 = n3 % class_30312.Field_30322;
            int[] arrn = class_30312.Field_30319;
            for (int i = -14198 & 1025; i < arrn.length; ++i) {
                if (n5 >= arrn[i]) continue;
                n4 = i;
                break;
            }
        }
        return class_30312.Field_30313[n4];
    }

    private static boolean Method_25942() {
        int n;
        Object object;
        ArrayList<Class_30312> arrayList = new ArrayList<Class_30312>();
        for (n = 12576 & 16908; n < Field_25924.length; ++n) {
            object = Field_25924[n];
            if (object == null) continue;
            arrayList.addAll(Arrays.asList(object));
        }
        for (n = 14337 & 16392; n < Field_25922.length; ++n) {
            object = Field_25922[n];
            if (object == null) continue;
            arrayList.addAll(Arrays.asList(object));
        }
        Class_30312[] arrclass_30312 = arrayList.toArray(new Class_30312[arrayList.size()]);
        object = new HashSet();
        HashSet<Class_11372> hashSet = new HashSet<Class_11372>();
        for (int i = 3354 & 16545; i < arrclass_30312.length; ++i) {
            Class_30312 class_30312 = arrclass_30312[i];
            if (class_30312.Field_30327 != null) {
                object.addAll(Arrays.asList(class_30312.Field_30327));
            }
            if (class_30312.Field_30313 == null) continue;
            hashSet.addAll(Arrays.asList(class_30312.Field_30313));
        }
        object.retainAll(hashSet);
        return (!object.isEmpty() ? 9745 & 4099 : 21504 & 16) != 0;
    }

    public static Class_11372 Method_25943(Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, Class_4595 class_4595, Class_11372 class_11372, boolean bl, Class_29859 class_29859) {
        Class_30312 class_30312;
        Class_30312[] arrclass_30312;
        int n;
        Class_11372 class_113722;
        int n2;
        int n3;
        Class_3238 class_3238 = class_3436.Method_3442();
        if (!(class_3436 instanceof Class_3692)) {
            return class_11372;
        }
        Class_3692 class_3692 = (Class_3692)class_3436;
        if (Field_25924 != null && (n3 = class_11372.Method_11426()) >= 0 && n3 < Field_25924.length && (arrclass_30312 = Field_25924[n3]) != null) {
            n2 = Class_25918.Method_25956(class_4595);
            for (n = -21232 & 16544; n < arrclass_30312.length; ++n) {
                class_30312 = arrclass_30312[n];
                if (class_30312 == null || !class_30312.Method_30344(class_3692.Method_3702()) || (class_113722 = Class_25918.Method_25934(class_30312, class_561, class_3692, class_4751, n2, class_11372, class_29859)) == null) continue;
                return class_113722;
            }
        }
        if (Field_25922 != null && bl && (n3 = class_29859.Method_29874()) >= 0 && n3 < Field_25922.length && (arrclass_30312 = Field_25922[n3]) != null) {
            n2 = Class_25918.Method_25956(class_4595);
            for (n = -25695 & 9216; n < arrclass_30312.length; ++n) {
                class_30312 = arrclass_30312[n];
                if (class_30312 == null || !class_30312.Method_30361(class_11372) || (class_113722 = Class_25918.Method_25934(class_30312, class_561, class_3692, class_4751, n2, class_11372, class_29859)) == null) continue;
                return class_113722;
            }
        }
        return class_11372;
    }

    public static synchronized Class_14461 Method_25944(Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, Class_14461 class_14461, Class_29859 class_29859) {
        Object object;
        Class_11372 class_11372 = class_14461.Method_14476();
        if (class_11372 == null) {
            return class_14461;
        }
        Class_3238 class_3238 = class_3436.Method_3442();
        Class_4595 class_4595 = class_14461.Method_14475();
        if (class_3238 instanceof Class_13196 && class_11372.Method_11438().startsWith("minecraft:blocks/glass_pane_top") && (object = class_561.Method_568(class_4751.Method_4765(class_14461.Method_14475()))) == class_3436) {
            return Class_25918.Method_25978(Field_25920, class_3238, class_3436, class_14461);
        }
        object = Class_25918.Method_25929(class_561, class_3436, class_4751, class_4595, class_11372, class_29859);
        return object == class_11372 ? class_14461 : Class_25918.Method_25978((Class_11372)object, class_3238, class_3436, class_14461);
    }

    private static void Method_25945(Class_30312 class_30312, List list) {
        if (class_30312.Field_30327 != null) {
            for (int i = 7168 & 16642; i < class_30312.Field_30327.length; ++i) {
                Class_11372 class_11372 = class_30312.Field_30327[i];
                if (!(class_11372 instanceof Class_11372)) {
                    Class_19426.Method_19610("TextureAtlasSprite is not TextureAtlasSprite: " + class_11372 + ", name: " + class_11372.Method_11438());
                    continue;
                }
                int n = class_11372.Method_11426();
                if (n < 0) {
                    Class_19426.Method_19610("Invalid tile ID: " + n + ", icon: " + class_11372.Method_11438());
                    continue;
                }
                Class_25918.Method_25959(class_30312, list, n);
            }
        }
    }

    private static String Method_25946(String string) {
        int n = 27881;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_11372 Method_25947(Class_30312 class_30312) {
        return class_30312.Field_30313[536 & 12291];
    }

    private static String Method_25948(String string) {
        int n = 1269;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_25949(int n, int n2) {
        int n3 = (n2 & (2972 & 8268)) >> (25395 & 4098);
        switch (n3) {
            case 1: {
                return 155 & -25598;
            }
            case 2: {
                return -22463 & 4129;
            }
        }
        return 1 & -23070;
    }

    private static int Method_25950(int n, int n2) {
        switch (n2) {
            case 0: {
                return n;
            }
            case 1: {
                switch (n) {
                    case 0: {
                        return -14314 & 8387;
                    }
                    case 1: {
                        return 4623 & 9635;
                    }
                    case 2: {
                        return 17201 & 13377;
                    }
                    case 3: {
                        return 135 & -21696;
                    }
                }
                return n;
            }
            case 2: {
                switch (n) {
                    case 0: {
                        return 132 & -2764;
                    }
                    case 1: {
                        return 12397 & -14187;
                    }
                    default: {
                        return n;
                    }
                    case 4: {
                        return 12033 & -16351;
                    }
                    case 5: 
                }
                return -24518 & 192;
            }
        }
        return n;
    }

    private static String Method_25951(String string) {
        int n = 22610;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String[] Method_25952() {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = "mcpatcher/ctm/default/";
        if (Class_19426.Method_19501(new Class_2080("textures/blocks/glass.png"))) {
            arrayList.add(string + "glass.properties");
            arrayList.add(string + "glasspane.properties");
        }
        if (Class_19426.Method_19501(new Class_2080("textures/blocks/bookshelf.png"))) {
            arrayList.add(string + "bookshelf.properties");
        }
        if (Class_19426.Method_19501(new Class_2080("textures/blocks/sandstone_normal.png"))) {
            arrayList.add(string + "sandstone.properties");
        }
        String[] arrstring = new String[6197 & 18];
        arrstring[1056 & 2054] = "white";
        arrstring[9 & -30463] = "orange";
        arrstring[-24350 & 17942] = "magenta";
        arrstring[10423 & -32437] = "light_blue";
        arrstring[-31699 & 24580] = "yellow";
        arrstring[39 & 26181] = "lime";
        arrstring[16455 & 10662] = "pink";
        arrstring[12551 & 20079] = "gray";
        arrstring[-30500 & 4648] = "silver";
        arrstring[-16277 & 8477] = "cyan";
        arrstring[9370 & 20491] = "purple";
        arrstring[16555 & 9307] = "blue";
        arrstring[23052 & 8398] = "brown";
        arrstring[1053 & 4463] = "green";
        arrstring[590 & 15] = "red";
        arrstring[1055 & 783] = "black";
        String[] arrstring2 = arrstring;
        for (int i = 5124 & -5639; i < arrstring2.length; ++i) {
            String string2 = arrstring2[i];
            if (!Class_19426.Method_19501(new Class_2080("textures/blocks/glass_" + string2 + ".png"))) continue;
            arrayList.add(string + i + "_glass_" + string2 + "/glass_" + string2 + ".properties");
            arrayList.add(string + i + "_glass_" + string2 + "/glass_pane_" + string2 + ".properties");
        }
        String[] arrstring3 = arrayList.toArray(new String[arrayList.size()]);
        return arrstring3;
    }

    private void Method_25953() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static Class_30312[][] Method_25954(List list) {
        Class_30312[][] arrclass_30312 = new Class_30312[list.size()][];
        for (int i = 20481 & -31424; i < list.size(); ++i) {
            List list2 = (List)list.get(i);
            if (list2 == null) continue;
            Class_30312[] arrclass_303122 = list2.toArray(new Class_30312[list2.size()]);
            arrclass_30312[i] = arrclass_303122;
        }
        return arrclass_30312;
    }

    public static void Method_25955(Class_24069 class_24069) {
        Field_25922 = null;
        Field_25924 = null;
        Field_25923 = null;
        if (Class_19426.Method_19512()) {
            Class_2035[] arrclass_2035 = Class_19426.Method_19487();
            for (int i = arrclass_2035.length - (-30461 & 16385); i >= 0; --i) {
                Class_2035 class_2035 = arrclass_2035[i];
                Class_25918.Method_25930(class_24069, class_2035);
            }
            Class_25918.Method_25930(class_24069, Class_19426.Method_19576());
            Class_2080 class_2080 = new Class_2080("mcpatcher/ctm/default/empty");
            Field_25920 = class_24069.Method_24105(class_2080);
            Field_25923 = new Map[class_24069.Method_24120() + (4099 & 2573)];
            if (Field_25922.length <= 0) {
                Field_25922 = null;
            }
            if (Field_25924.length <= 0) {
                Field_25924 = null;
            }
        }
    }

    public static int Method_25956(Class_4595 class_4595) {
        if (class_4595 == null) {
            return -1 & -1;
        }
        switch (Class_11449.Field_11450[class_4595.ordinal()]) {
            case 1: {
                return 2180 & -19672;
            }
            case 2: {
                return 4161 & 9217;
            }
            case 3: {
                return 2223 & 8709;
            }
            case 4: {
                return 5229 & 16772;
            }
            case 5: {
                return -15858 & 4482;
            }
            case 6: {
                return 9291 & -28669;
            }
        }
        return -1 & -1;
    }

    private static Class_11372 Method_25957(Class_30312 class_30312, Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, int n, int n2, Class_11372 class_11372, int n3) {
        Class_11372[] arrclass_11372 = class_30312.Field_30313;
        Class_11372 class_113722 = Class_25918.Method_25981(class_30312, class_561, class_3436, class_4751, n, n2, class_11372, n3);
        if (class_113722 != null && class_113722 != class_11372 && class_113722 != arrclass_11372[22155 & -32445]) {
            return class_113722;
        }
        Class_11372 class_113723 = Class_25918.Method_25983(class_30312, class_561, class_3436, class_4751, n, n2, class_11372, n3);
        return class_113723 == arrclass_11372[516 & 24586] ? arrclass_11372[12382 & -30556] : (class_113723 == arrclass_11372[4899 & 81] ? arrclass_11372[-32713 & 18949] : (class_113723 == arrclass_11372[-8105 & 1154] ? arrclass_11372[4174 & 27175] : class_113723));
    }

    private static Class_11372 Method_25958(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, int n) {
        class_3436 = class_3436.Method_3442().Method_3333(class_3436, class_561, class_4751);
        Class_31211 class_31211 = Class_18.Field_89.Method_214().Method_36716().Method_36444(class_3436);
        if (class_31211 == null) {
            return null;
        }
        Class_4595 class_4595 = Class_25918.Method_25980(n);
        List list = class_31211.Method_31218(class_4595);
        if (list == null) {
            return null;
        }
        if (Class_19426.Method_19567()) {
            list = Class_24204.Method_24223(class_561, class_3436, class_4751, class_4595, list);
        }
        if (list.size() > 0) {
            Class_14461 class_14461 = (Class_14461)list.get(-24567 & 2432);
            return class_14461.Method_14476();
        }
        List list2 = class_31211.Method_31214();
        if (list2 == null) {
            return null;
        }
        for (int i = -32504 & 5764; i < list2.size(); ++i) {
            Class_14461 class_14461 = (Class_14461)list2.get(i);
            if (class_14461.Method_14475() != class_4595) continue;
            return class_14461.Method_14476();
        }
        return null;
    }

    static {
        Field_25923 = null;
        Field_25922 = null;
        Field_25924 = null;
        Field_25926 = -31744 & 10248;
        String[] arrstring = new String[2331 & -3045];
        arrstring[289 & 2056] = "";
        arrstring[16963 & 8225] = Class_25918.Method_25966("\u5814");
        arrstring[2886 & -12158] = Class_25918.Method_25975("\u285a");
        arrstring[-14077 & 167] = Class_25918.Method_25967("\ua080");
        arrstring[9284 & 18564] = Class_25918.Method_25969("\u220e");
        arrstring[5 & 2061] = Class_25918.Method_25976("\u4381");
        arrstring[71 & 3222] = Class_25918.Method_25931("\u1418");
        arrstring[2319 & 135] = Class_25918.Method_25979("\u202e");
        arrstring[16520 & 4104] = Class_25918.Method_25928("\u2022");
        arrstring[393 & -32151] = Class_25918.Method_25933("\u0800");
        arrstring[10 & 17419] = Class_25918.Method_25973("\u8420");
        arrstring[8475 & -31505] = Class_25918.Method_25935("\u2a80");
        arrstring[4239 & 1292] = Class_25918.Method_25939("\u4214");
        arrstring[397 & -12257] = Class_25918.Method_25963("\u81c1");
        arrstring[526 & -22113] = Class_25918.Method_25977("\u113a");
        arrstring[3087 & -32465] = Class_25918.Method_25946("\u0000");
        arrstring[144 & 5460] = Class_25918.Method_25951("\uc19c");
        arrstring[1553 & 10523] = Class_25918.Method_25932("\u4321");
        arrstring[-28046 & 16530] = Class_25918.Method_25971("\u5899");
        arrstring[20851 & 9235] = Class_25918.Method_25970("\u4072");
        arrstring[-31724 & 8597] = Class_25918.Method_25948("\u0015");
        arrstring[-13547 & 183] = Class_25918.Method_25974("\u5118");
        arrstring[13334 & -16170] = Class_25918.Method_25965("\u6082");
        arrstring[23 & -32513] = Class_25918.Method_25962("\ue4c0");
        arrstring[26 & 6744] = Class_25918.Method_25964("\u2580");
        arrstring[22587 & -32487] = Class_25918.Method_25968("\b");
        arrstring[2590 & -16261] = Class_25918.Method_25985("\u02c5");
        Field_25919 = arrstring;
        int[] arrn = new int[-28608 & 343];
        arrn[-15360 & 4217] = -19452 & 416;
        arrn[633 & 261] = 1553 & -24445;
        arrn[-26106 & 1131] = 14338 & 1346;
        arrn[27051 & -31145] = -28569 & 659;
        arrn[9199 & -31740] = 16532 & 12806;
        arrn[2053 & -32187] = 2085 & -24505;
        arrn[-12890 & 4183] = -32506 & 19078;
        arrn[-24153 & 1047] = 311 & 591;
        arrn[-31207 & 2190] = 3661 & 58;
        arrn[-32759 & 14345] = -12035 & 9739;
        arrn[171 & 17482] = 395 & -24454;
        arrn[11019 & 91] = 8267 & 18495;
        arrn[12 & -20195] = -13056 & 4629;
        arrn[-16211 & 527] = -2304 & 42;
        arrn[4622 & 17422] = 4108 & 193;
        arrn[2575 & 8399] = 21632 & 41;
        arrn[16 & 22940] = 5420 & -13604;
        arrn[8241 & 1305] = 207 & -23491;
        arrn[1106 & -32590] = 6158 & 16511;
        arrn[4339 & 24859] = -6129 & 1567;
        arrn[3230 & 16404] = 8208 & 17945;
        arrn[1813 & 6301] = 1681 & 2129;
        arrn[2686 & -11242] = -15534 & 12447;
        arrn[407 & 10871] = 20831 & 19;
        arrn[20765 & 90] = 24820 & 1052;
        arrn[-31591 & 28701] = 157 & 3605;
        arrn[4122 & 24895] = 11030 & -16354;
        arrn[6203 & 95] = 12311 & -30561;
        arrn[-7012 & 2140] = 4737 & 26724;
        arrn[61 & -31459] = 7457 & 216;
        arrn[-5954 & 4127] = -26046 & 25728;
        arrn[-16065 & 4639] = 8352 & 18511;
        arrn[15904 & -32328] = 56 & 15645;
        arrn[-24159 & 1131] = -32711 & 24093;
        arrn[-26010 & 8354] = 603 & 16410;
        arrn[115 & 10923] = 859 & -31681;
        arrn[-28636 & 116] = 6300 & -32483;
        arrn[25383 & 2093] = 253 & 4637;
        arrn[303 & -15322] = 18654 & 13342;
        arrn[4647 & 231] = 18463 & -32737;
        arrn[13368 & 2090] = 553 & 9574;
        arrn[6189 & -31959] = 4137 & -14751;
        arrn[9258 & -30422] = 566 & 5218;
        arrn[-23765 & 1067] = 227 & 17455;
        arrn[189 & -21204] = 192 & 769;
        arrn[-32723 & 9133] = 512 & 16390;
        arrn[18222 & 8366] = 4610 & 3312;
        arrn[8239 & 3967] = 3591 & 24704;
        arrn[-32719 & 1394] = 557 & 5414;
        arrn[2677 & 4401] = 18469 & -19587;
        arrn[2098 & 178] = 1638 & 8358;
        arrn[2231 & 24627] = 47 & 13495;
        arrn[-31628 & 8764] = 16760 & -23511;
        arrn[5565 & 17013] = 303 & 20521;
        arrn[8438 & 3126] = -32582 & 3179;
        arrn[4407 & -6913] = 24619 & 1707;
        arrn[1080 & -32711] = 3756 & -20115;
        arrn[-26567 & 1465] = -31697 & 8813;
        arrn[-12230 & 9215] = 6446 & -32066;
        arrn[17535 & 2363] = -32347 & 19474;
        arrn[829 & -3908] = -30684 & 66;
        arrn[-22401 & 61] = -16309 & 7424;
        arrn[10879 & -16322] = 16528 & -32755;
        arrn[10559 & 16447] = 30098 & -32728;
        Field_25925 = arrn;
        Field_25921 = Class_9265.Field_9351.Method_3293();
        Field_25920 = null;
    }

    private static void Method_25959(Class_30312 class_30312, List list, int n) {
        while (n >= list.size()) {
            list.add(null);
        }
        ArrayList<Class_30312> arrayList = (ArrayList<Class_30312>)list.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<Class_30312>();
            list.set(n, arrayList);
        }
        arrayList.add(class_30312);
    }

    private static Class_11372 Method_25960(Class_30312 class_30312, Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, int n, int n2, Class_11372 class_11372, int n3, Class_29859 class_29859) {
        boolean[] arrbl = class_29859.Method_29884();
        switch (n2) {
            case 0: {
                arrbl[3753 & 4102] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771(), n2, class_11372, n3);
                arrbl[513 & 25861] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770(), n2, class_11372, n3);
                arrbl[10262 & 843] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4778(), n2, class_11372, n3);
                arrbl[9047 & 4099] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4784(), n2, class_11372, n3);
                break;
            }
            case 1: {
                arrbl[3200 & 4913] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771(), n2, class_11372, n3);
                arrbl[4585 & -15359] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770(), n2, class_11372, n3);
                arrbl[18438 & -20477] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4784(), n2, class_11372, n3);
                arrbl[-32765 & 23555] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4778(), n2, class_11372, n3);
                break;
            }
            case 2: {
                arrbl[2112 & -32219] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770(), n2, class_11372, n3);
                arrbl[16685 & -30717] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771(), n2, class_11372, n3);
                arrbl[-28665 & 17394] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782(), n2, class_11372, n3);
                arrbl[603 & -16349] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769(), n2, class_11372, n3);
                break;
            }
            case 3: {
                arrbl[8940 & 0] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771(), n2, class_11372, n3);
                arrbl[9 & 12673] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770(), n2, class_11372, n3);
                arrbl[795 & 8322] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782(), n2, class_11372, n3);
                arrbl[-31485 & 16387] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769(), n2, class_11372, n3);
                break;
            }
            case 4: {
                arrbl[2049 & 144] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4778(), n2, class_11372, n3);
                arrbl[19159 & -31743] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4784(), n2, class_11372, n3);
                arrbl[-30522 & 17434] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782(), n2, class_11372, n3);
                arrbl[8967 & 211] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769(), n2, class_11372, n3);
                break;
            }
            case 5: {
                arrbl[-25599 & 88] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4784(), n2, class_11372, n3);
                arrbl[6281 & 295] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4778(), n2, class_11372, n3);
                arrbl[306 & 26630] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782(), n2, class_11372, n3);
                arrbl[-15101 & 8443] = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769(), n2, class_11372, n3);
            }
        }
        int n4 = 8720 & 4394;
        if ((arrbl[16576 & 6413] & (!arrbl[-28605 & 33] ? 4131 & -30703 : 4129 & 2384) & (!arrbl[2331 & -7614] ? 22913 & 1595 : 16640 & -30496) & (!arrbl[675 & 18443] ? -10737 & 449 : 6274 & 1361)) != 0) {
            n4 = 12291 & -16381;
        } else if (((!arrbl[4097 & -24488] ? 18849 & -24063 : 664 & 16706) & arrbl[133 & 7499] & (!arrbl[34 & -26614] ? 2377 & 17543 : 9 & -22810) & (!arrbl[4115 & 3595] ? 18757 & 13473 : -14839 & 8640)) != 0) {
            n4 = -28159 & 16819;
        } else if (((!arrbl[10304 & 274] ? -32119 & 18433 : 544 & 1091) & (!arrbl[2531 & 1] ? 333 & -30575 : 201 & -26874) & arrbl[2279 & 4106] & (!arrbl[-30649 & 4227] ? -22143 & 17417 : 136 & 3430)) != 0) {
            n4 = 16460 & -29428;
        } else if (((!arrbl[-31044 & 8448] ? 2127 & 9649 : 289 & -11582) & (!arrbl[21539 & 10633] ? 2051 & 8209 : 320 & -19936) & (!arrbl[5794 & -24574] ? 8289 & 641 : 20496 & 8192) & arrbl[-16317 & 6659]) != 0) {
            n4 = -30089 & 29732;
        } else if ((arrbl[-32319 & 1042] & arrbl[-28567 & 129] & (!arrbl[8194 & 4470] ? 1553 & -16125 : -16255 & 4734) & (!arrbl[17027 & 3] ? 16593 & 14123 : 13956 & 64)) != 0) {
            n4 = -32762 & 5250;
        } else if (((!arrbl[17472 & -32728] ? 12289 & 18597 : 898 & -4996) & (!arrbl[3073 & 16453] ? 18209 & 2129 : 24576 & 4931) & arrbl[24258 & -32718] & arrbl[-16125 & 7891]) != 0) {
            n4 = 3192 & 24600;
        } else if ((arrbl[17408 & -32456] & (!arrbl[16663 & 713] ? 10311 & 4609 : -16346 & 4496) & arrbl[-31678 & 4118] & (!arrbl[12035 & 99] ? 769 & 3173 : 138 & 25953)) != 0) {
            n4 = -32145 & 8351;
        } else if ((arrbl[129 & 26656] & (!arrbl[8257 & -27519] ? 9553 & -15739 : -24061 & 20752) & (!arrbl[-28670 & 24634] ? 10851 & -31735 : 514 & 11273) & arrbl[263 & 10307]) != 0) {
            n4 = 18983 & -24281;
        } else if (((!arrbl[256 & -28509] ? 16387 & -32635 : 10320 & 1422) & arrbl[-23479 & 16645] & arrbl[13322 & -29902] & (!arrbl[2947 & 28739] ? 9379 & 1 : -14330 & 240)) != 0) {
            n4 = 1037 & 27165;
        } else if (((!arrbl[16609 & 3868] ? 1171 & 16673 : 18498 & 1073) & arrbl[16681 & 7169] & (!arrbl[138 & -15549] ? 4321 & -20711 : 1217 & -29912) & arrbl[25491 & 3]) != 0) {
            n4 = 10341 & 567;
        } else if (((!arrbl[-32224 & 320] ? 18049 & 329 : 16754 & -24952) & arrbl[5525 & 1] & arrbl[1562 & 6498] & arrbl[2179 & 3]) != 0) {
            n4 = 16537 & 12377;
        } else if ((arrbl[4112 & 161] & (!arrbl[-31123 & 16385] ? 29187 & 3073 : 512 & 1297) & arrbl[4138 & 8710] & arrbl[9251 & 6147]) != 0) {
            n4 = -30433 & 1755;
        } else if ((arrbl[-32480 & 27212] & arrbl[16585 & 2851] & (!arrbl[258 & 9275] ? 597 & 22665 : 18037 & 8194) & arrbl[16399 & 2435]) != 0) {
            n4 = 1326 & -32730;
        } else if ((arrbl[193 & -24022] & arrbl[12289 & 20167] & arrbl[4618 & 16434] & (!arrbl[24627 & -30713] ? 12425 & 33 : 128 & 11336)) != 0) {
            n4 = 16686 & 1038;
        } else if (arrbl[9241 & 388] & arrbl[277 & 18467] & arrbl[-32250 & 2074] & arrbl[6147 & -32253]) {
            n4 = -13793 & 282;
        }
        if (n4 == 0) {
            return class_30312.Field_30313[n4];
        }
        if (!Class_19426.Method_19544()) {
            return class_30312.Field_30313[n4];
        }
        switch (n2) {
            case 0: {
                arrbl[-31488 & 6705] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770().Method_4778(), n2, class_11372, n3) ? 9513 & -16365 : 1062 & 29376;
                arrbl[6229 & -31455] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771().Method_4778(), n2, class_11372, n3) ? -13817 & 193 : -24443 & 20560;
                arrbl[15618 & 2] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770().Method_4784(), n2, class_11372, n3) ? 65 & 7475 : 2566 & 1184;
                arrbl[-32749 & 12579] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771().Method_4784(), n2, class_11372, n3) ? 1283 & 4305 : -32768 & 18506;
                break;
            }
            case 1: {
                arrbl[-32732 & 2368] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770().Method_4784(), n2, class_11372, n3) ? 81 & 9509 : -23736 & 34;
                arrbl[-15323 & 2257] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771().Method_4784(), n2, class_11372, n3) ? 18433 & 387 : 265 & 8706;
                arrbl[266 & 10818] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770().Method_4778(), n2, class_11372, n3) ? -22525 & 325 : -29300 & 2;
                arrbl[651 & 1047] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771().Method_4778(), n2, class_11372, n3) ? -31741 & 16413 : 22562 & -32623;
                break;
            }
            case 2: {
                arrbl[3264 & -15870] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771().Method_4782(), n2, class_11372, n3) ? 25859 & 197 : 2124 & 4098;
                arrbl[-14315 & 5761] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770().Method_4782(), n2, class_11372, n3) ? -13917 & 5193 : 65 & -31948;
                arrbl[2051 & -32254] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771().Method_4769(), n2, class_11372, n3) ? 11047 & -32695 : -20370 & 2064;
                arrbl[25091 & 115] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770().Method_4769(), n2, class_11372, n3) ? 10433 & -31449 : -28671 & 1280;
                break;
            }
            case 3: {
                arrbl[-12608 & 8] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770().Method_4782(), n2, class_11372, n3) ? -5115 & 83 : -30176 & 1306;
                arrbl[3215 & -32255] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771().Method_4782(), n2, class_11372, n3) ? 13313 & 2113 : 28674 & 117;
                arrbl[-8169 & 66] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770().Method_4769(), n2, class_11372, n3) ? 27189 & 1225 : -32192 & 12680;
                arrbl[-15285 & 2451] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771().Method_4769(), n2, class_11372, n3) ? 25095 & -29615 : 4260 & -30206;
                break;
            }
            case 4: {
                arrbl[4768 & -30720] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782().Method_4784(), n2, class_11372, n3) ? 15361 & -32251 : -31903 & 21644;
                arrbl[10389 & 17507] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782().Method_4778(), n2, class_11372, n3) ? 193 & 20505 : -23808 & 1073;
                arrbl[13714 & 2082] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769().Method_4784(), n2, class_11372, n3) ? 4225 & 2069 : 12904 & 1040;
                arrbl[11043 & 16403] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769().Method_4778(), n2, class_11372, n3) ? -8171 & 2275 : 2050 & 560;
                break;
            }
            case 5: {
                arrbl[26721 & 130] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782().Method_4778(), n2, class_11372, n3) ? 2337 & 12365 : 20560 & -32223;
                arrbl[515 & -10075] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782().Method_4784(), n2, class_11372, n3) ? 5665 & 8261 : 28836 & 1281;
                arrbl[17514 & 8594] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769().Method_4778(), n2, class_11372, n3) ? 16769 & 4639 : -32640 & 16482;
                arrbl[151 & 17923] = !Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769().Method_4784(), n2, class_11372, n3) ? 289 & 9 : 904 & 6;
            }
        }
        if (n4 == (269 & 17519) && arrbl[10757 & -32544]) {
            n4 = 1036 & -13738;
        } else if (n4 == (2319 & 17951) && arrbl[4521 & -32187]) {
            n4 = 11285 & 615;
        } else if (n4 == (293 & 1717) && arrbl[-32654 & 29326]) {
            n4 = 23828 & -32069;
        } else if (n4 == (16615 & 807) && arrbl[19 & 8395]) {
            n4 = -9327 & 125;
        } else if (n4 == (16398 & 1679) && arrbl[20739 & 11820] && arrbl[-28645 & 16385]) {
            n4 = -27049 & 24583;
        } else if (n4 == (-27431 & 25115) && arrbl[-31744 & 28784] && arrbl[17474 & 10263]) {
            n4 = -32730 & 18438;
        } else if (n4 == (251 & -32481) && arrbl[1435 & -16313] && arrbl[2329 & -3071]) {
            n4 = 25591 & 27;
        } else if (n4 == (-30426 & 8374) && arrbl[-32633 & 3] && arrbl[34 & 4634]) {
            n4 = 4766 & 9234;
        } else if (n4 == (-32738 & 19375) && !arrbl[19140 & -27647] && arrbl[9217 & -12217]) {
            n4 = 12575 & 127;
        } else if (n4 == (23131 & 9369) && arrbl[156 & -8158] && !arrbl[12354 & 18835]) {
            n4 = 158 & 8287;
        } else if (n4 == (-31649 & 25499) && !arrbl[535 & 323] && arrbl[5125 & 2641]) {
            n4 = 429 & -24453;
        } else if (n4 == (38 & 4262) && arrbl[12435 & -32253] && !arrbl[25862 & -32526]) {
            n4 = -7124 & 6394;
        } else if (n4 == (4175 & -7538) && arrbl[16 & 23304] && !arrbl[12841 & 16725]) {
            n4 = 11293 & 20637;
        } else if (n4 == (-27879 & 16507) && !arrbl[-22400 & 17186] && arrbl[8258 & 17027]) {
            n4 = 2076 & 16862;
        } else if (n4 == (2591 & -11109) && arrbl[599 & 16395] && !arrbl[24837 & 7179]) {
            n4 = -22421 & 443;
        } else if (n4 == (566 & 13423) && !arrbl[2067 & 12431] && arrbl[4194 & 25606]) {
            n4 = 110 & 9770;
        } else if (n4 == (-32706 & 8219) && arrbl[20576 & -29952] && arrbl[1 & 20609] && arrbl[34 & 20550] && arrbl[12291 & -32249]) {
            n4 = 2414 & 9262;
        } else if (n4 == (-30566 & 9307) && !arrbl[-18368 & 1066] && arrbl[8401 & 1803] && arrbl[6722 & 17418] && arrbl[263 & -31581]) {
            n4 = -28661 & 649;
        } else if (n4 == (8667 & 538) && arrbl[-28383 & 18632] && !arrbl[629 & 259] && arrbl[-32037 & 18466] && arrbl[-13245 & 4103]) {
            n4 = 2655 & -32491;
        } else if (n4 == (2458 & 29278) && arrbl[-28144 & 3206] && arrbl[8793 & 387] && !arrbl[21018 & -30589] && arrbl[67 & 19619]) {
            n4 = 8524 & 18072;
        } else if (n4 == (1050 & 8346) && arrbl[128 & 9833] && arrbl[16923 & 7653] && arrbl[8763 & 4546] && !arrbl[18435 & 8311]) {
            n4 = 9236 & 948;
        } else if (n4 == (16415 & -22502) && arrbl[22606 & 1056] && arrbl[-20441 & 17609] && !arrbl[398 & 18] && !arrbl[-32509 & 5131]) {
            n4 = 18507 & -28021;
        } else if (n4 == (-32550 & 30) && !arrbl[20 & 23584] && !arrbl[-32241 & 129] && arrbl[2194 & -32762] && arrbl[-26365 & 643]) {
            n4 = 4151 & 2902;
        } else if (n4 == (26 & 4187) && !arrbl[16965 & 14602] && arrbl[8721 & 19713] && !arrbl[1030 & -32126] && arrbl[595 & 5383]) {
            n4 = 21239 & 287;
        } else if (n4 == (1054 & 8283) && arrbl[0 & 18756] && !arrbl[14663 & 16385] && arrbl[-32765 & 2194] && !arrbl[20483 & 2083]) {
            n4 = 10 & -11894;
        } else if (n4 == (8986 & -28422) && arrbl[-32320 & 14354] && !arrbl[25225 & 67] && !arrbl[-32105 & 16386] && arrbl[-28669 & 2435]) {
            n4 = 16482 & 1726;
        } else if (n4 == (16507 & 12318) && !arrbl[1152 & -16370] && arrbl[65 & 29189] && arrbl[6530 & -32766] && !arrbl[18439 & 947]) {
            n4 = 99 & 171;
        } else if (n4 == (20506 & 122) && arrbl[72 & 20608] && !arrbl[12609 & 1043] && !arrbl[7 & -4014] && !arrbl[259 & 8371]) {
            n4 = 4704 & 34;
        } else if (n4 == (-29862 & 5147) && !arrbl[-28667 & 25152] && arrbl[4615 & -30479] && !arrbl[2115 & 5154] && !arrbl[99 & 1679]) {
            n4 = -25679 & 17443;
        } else if (n4 == (2366 & 8794) && !arrbl[-28588 & 18432] && !arrbl[8265 & 2049] && arrbl[20550 & 2195] && !arrbl[99 & 7951]) {
            n4 = 1598 & -6100;
        } else if (n4 == (26 & 155) && !arrbl[-30700 & 4160] && !arrbl[20481 & 9273] && !arrbl[1547 & -32574] && arrbl[15655 & -32117]) {
            n4 = 237 & -24275;
        }
        return class_30312.Field_30313[n4];
    }

    private static void Method_25961(int[] arrn, int n, Class_11372 class_11372, Class_11372 class_113722) {
        int n2 = arrn.length / (9221 & 4316);
        int n3 = n2 * n;
        float f = Float.intBitsToFloat(arrn[n3 + (4748 & 16406)]);
        float f2 = Float.intBitsToFloat(arrn[n3 + (16527 & -24044) + (19 & 30721)]);
        double d = class_11372.Method_11448(f);
        double d2 = class_11372.Method_11423(f2);
        arrn[n3 + (8708 & 260)] = Float.floatToRawIntBits(class_113722.Method_11446(d));
        arrn[n3 + (3340 & 16996) + (3619 & 1)] = Float.floatToRawIntBits(class_113722.Method_11435(d2));
    }

    private static String Method_25962(String string) {
        int n = 11166;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25963(String string) {
        int n = 9641;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25964(String string) {
        int n = 13275;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25965(String string) {
        int n = 1051;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25966(String string) {
        int n = 29163;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25967(String string) {
        int n = 9704;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25968(String string) {
        int n = 19531;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25969(String string) {
        int n = 20702;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25970(String string) {
        int n = 19037;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25971(String string) {
        int n = 15824;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static List Method_25972(Class_30312[][] arrclass_30312) {
        ArrayList<ArrayList<Class_30312>> arrayList = new ArrayList<ArrayList<Class_30312>>();
        if (arrclass_30312 != null) {
            for (int i = 132 & -20912; i < arrclass_30312.length; ++i) {
                Class_30312[] arrclass_303122 = arrclass_30312[i];
                ArrayList<Class_30312> arrayList2 = null;
                if (arrclass_303122 != null) {
                    arrayList2 = new ArrayList<Class_30312>(Arrays.asList(arrclass_303122));
                }
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    private static String Method_25973(String string) {
        int n = 32588;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25974(String string) {
        int n = 26862;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25975(String string) {
        int n = 32268;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25976(String string) {
        int n = 14633;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25977(String string) {
        int n = 293;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_14461 Method_25978(Class_11372 class_11372, Class_3238 class_3238, Class_3436 class_3436, Class_14461 class_14461) {
        if (Field_25923 == null) {
            return class_14461;
        }
        int n = class_11372.Method_11426();
        if (n >= 0 && n < Field_25923.length) {
            Class_14461 class_144612;
            IdentityHashMap<Class_14461, Class_14461> identityHashMap = Field_25923[n];
            if (identityHashMap == null) {
                Class_25918.Field_25923[n] = identityHashMap = new IdentityHashMap<Class_14461, Class_14461>(2541 & 17);
            }
            if ((class_144612 = (Class_14461)identityHashMap.get(class_14461)) == null) {
                class_144612 = Class_25918.Method_25936(class_14461, class_11372);
                identityHashMap.put(class_14461, class_144612);
            }
            return class_144612;
        }
        return class_14461;
    }

    private static String Method_25979(String string) {
        int n = 12993;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_4595 Method_25980(int n) {
        switch (n) {
            case 0: {
                return Class_4595.Field_4615;
            }
            case 1: {
                return Class_4595.Field_4601;
            }
            case 2: {
                return Class_4595.Field_4598;
            }
            case 3: {
                return Class_4595.Field_4613;
            }
            case 4: {
                return Class_4595.Field_4602;
            }
            case 5: {
                return Class_4595.Field_4603;
            }
        }
        return Class_4595.Field_4601;
    }

    private static Class_11372 Method_25981(Class_30312 class_30312, Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, int n, int n2, Class_11372 class_11372, int n3) {
        int n4 = 338 & 1664;
        int n5 = 256 & 1094;
        switch (n) {
            case 0: {
                if (n2 == (113 & 2059) || n2 == 0) {
                    return null;
                }
                n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782(), n2, class_11372, n3) ? 1 : 0;
                n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769(), n2, class_11372, n3) ? 1 : 0;
                break;
            }
            case 1: {
                if (n2 == (-22357 & 5123) || n2 == (10522 & 98)) {
                    return null;
                }
                n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4784(), n2, class_11372, n3) ? 1 : 0;
                n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4778(), n2, class_11372, n3) ? 1 : 0;
                break;
            }
            case 2: {
                if (n2 == (-6491 & 95) || n2 == (2276 & 516)) {
                    return null;
                }
                n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771(), n2, class_11372, n3) ? 1 : 0;
                n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770(), n2, class_11372, n3) ? 1 : 0;
            }
        }
        int n6 = 21255 & -24557;
        n6 = n4 != 0 ? (n5 != 0 ? 4185 & -32125 : 182 & 2115) : (n5 != 0 ? -30174 & 12288 : 10251 & 3);
        return class_30312.Field_30313[n6];
    }

    private static Class_11372 Method_25982(Class_30312 class_30312, Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, int n, int n2, Class_11372 class_11372, int n3) {
        Class_11372[] arrclass_11372 = class_30312.Field_30313;
        Class_11372 class_113722 = Class_25918.Method_25983(class_30312, class_561, class_3436, class_4751, n, n2, class_11372, n3);
        if (class_113722 != null && class_113722 != class_11372 && class_113722 != arrclass_11372[-5981 & 1091]) {
            return class_113722;
        }
        Class_11372 class_113723 = Class_25918.Method_25981(class_30312, class_561, class_3436, class_4751, n, n2, class_11372, n3);
        return class_113723 == arrclass_11372[10596 & 17409] ? arrclass_11372[-32619 & 21510] : (class_113723 == arrclass_11372[-10751 & 1] ? arrclass_11372[-29425 & 21] : (class_113723 == arrclass_11372[17162 & 4163] ? arrclass_11372[18670 & 775] : class_113723));
    }

    private static Class_11372 Method_25983(Class_30312 class_30312, Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, int n, int n2, Class_11372 class_11372, int n3) {
        int n4 = 17480 & 6832;
        int n5 = -30621 & 4100;
        block0 : switch (n) {
            case 0: {
                switch (n2) {
                    case 0: 
                    case 1: {
                        return null;
                    }
                    case 2: {
                        n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770(), n2, class_11372, n3) ? 1 : 0;
                        n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771(), n2, class_11372, n3) ? 1 : 0;
                        break block0;
                    }
                    case 3: {
                        n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771(), n2, class_11372, n3) ? 1 : 0;
                        n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770(), n2, class_11372, n3) ? 1 : 0;
                        break block0;
                    }
                    case 4: {
                        n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4778(), n2, class_11372, n3) ? 1 : 0;
                        n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4784(), n2, class_11372, n3) ? 1 : 0;
                        break block0;
                    }
                    case 5: {
                        n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4784(), n2, class_11372, n3) ? 1 : 0;
                        n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4778(), n2, class_11372, n3) ? 1 : 0;
                    }
                }
                break;
            }
            case 1: {
                switch (n2) {
                    case 0: {
                        n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771(), n2, class_11372, n3) ? 1 : 0;
                        n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770(), n2, class_11372, n3) ? 1 : 0;
                        break block0;
                    }
                    case 1: {
                        n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4771(), n2, class_11372, n3) ? 1 : 0;
                        n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4770(), n2, class_11372, n3) ? 1 : 0;
                        break block0;
                    }
                    case 2: 
                    case 3: {
                        return null;
                    }
                    case 4: {
                        n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782(), n2, class_11372, n3) ? 1 : 0;
                        n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769(), n2, class_11372, n3) ? 1 : 0;
                        break block0;
                    }
                    case 5: {
                        n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769(), n2, class_11372, n3) ? 1 : 0;
                        n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782(), n2, class_11372, n3) ? 1 : 0;
                    }
                }
                break;
            }
            case 2: {
                switch (n2) {
                    case 0: {
                        n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4778(), n2, class_11372, n3) ? 1 : 0;
                        n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4784(), n2, class_11372, n3) ? 1 : 0;
                        break block0;
                    }
                    case 1: {
                        n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4778(), n2, class_11372, n3) ? 1 : 0;
                        n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4784(), n2, class_11372, n3) ? 1 : 0;
                        break block0;
                    }
                    case 2: {
                        n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782(), n2, class_11372, n3) ? 1 : 0;
                        n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769(), n2, class_11372, n3) ? 1 : 0;
                        break block0;
                    }
                    case 3: {
                        n4 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4769(), n2, class_11372, n3) ? 1 : 0;
                        n5 = Class_25918.Method_25938(class_30312, class_561, class_3436, class_4751.Method_4782(), n2, class_11372, n3) ? 1 : 0;
                        break block0;
                    }
                    case 4: 
                    case 5: {
                        return null;
                    }
                }
            }
        }
        int n6 = 12931 & 291;
        n6 = n4 != 0 ? (n5 != 0 ? 25899 & 65 : 3091 & 262) : (n5 != 0 ? -22488 & 4225 : -31853 & 6243);
        return class_30312.Field_30313[n6];
    }

    private static Class_11372 Method_25984(Class_30312 class_30312, Class_4751 class_4751, int n) {
        if (class_30312.Field_30313.length == (2625 & 13441)) {
            return class_30312.Field_30313[-21247 & 192];
        }
        int n2 = class_4751.\u0000= final();
        int n3 = class_4751.\u0000, `();
        int n4 = class_4751.\u0000strictfp();
        int n5 = 2208 & -15594;
        int n6 = 8225 & 6416;
        switch (n) {
            case 0: {
                n5 = n2;
                n6 = n4;
                break;
            }
            case 1: {
                n5 = n2;
                n6 = n4;
                break;
            }
            case 2: {
                n5 = -n2 - (4109 & 25347);
                n6 = -n3;
                break;
            }
            case 3: {
                n5 = n2;
                n6 = -n3;
                break;
            }
            case 4: {
                n5 = n4;
                n6 = -n3;
                break;
            }
            case 5: {
                n5 = -n4 - (8449 & -32539);
                n6 = -n3;
            }
        }
        n6 %= class_30312.Field_30328;
        if ((n5 %= class_30312.Field_30326) < 0) {
            n5 += class_30312.Field_30326;
        }
        if (n6 < 0) {
            n6 += class_30312.Field_30328;
        }
        int n7 = n6 * class_30312.Field_30326 + n5;
        return class_30312.Field_30313[n7];
    }

    private static String Method_25985(String string) {
        int n = 3180;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25918.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

