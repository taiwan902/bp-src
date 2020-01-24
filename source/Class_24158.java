/*
 * Decompiled with CFR 0.145.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;

public class Class_24158 {
    private static boolean Field_24159;
    private static Class_24997 Field_24160;
    private static Map Field_24161;
    private static Random Field_24162;
    private static final String[] Field_24163;
    private static boolean Field_24164;

    private static void Method_24165() {
        Field_24160 = Class_19426.Method_19470();
        if (Field_24160 != null) {
            Field_24159 = -16319 & 11153;
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("bat");
            arrayList.add("blaze");
            arrayList.add("cat/black");
            arrayList.add("cat/ocelot");
            arrayList.add("cat/red");
            arrayList.add("cat/siamese");
            arrayList.add("chicken");
            arrayList.add("cow/cow");
            arrayList.add("cow/mooshroom");
            arrayList.add("creeper/creeper");
            arrayList.add("enderman/enderman");
            arrayList.add("enderman/enderman_eyes");
            arrayList.add("ghast/ghast");
            arrayList.add("ghast/ghast_shooting");
            arrayList.add("iron_golem");
            arrayList.add("pig/pig");
            arrayList.add("sheep/sheep");
            arrayList.add("sheep/sheep_fur");
            arrayList.add("silverfish");
            arrayList.add("skeleton/skeleton");
            arrayList.add("skeleton/wither_skeleton");
            arrayList.add("slime/slime");
            arrayList.add("slime/magmacube");
            arrayList.add("snowman");
            arrayList.add("spider/cave_spider");
            arrayList.add("spider/spider");
            arrayList.add("spider_eyes");
            arrayList.add("squid");
            arrayList.add("villager/villager");
            arrayList.add("villager/butcher");
            arrayList.add("villager/farmer");
            arrayList.add("villager/librarian");
            arrayList.add("villager/priest");
            arrayList.add("villager/smith");
            arrayList.add("wither/wither");
            arrayList.add("wither/wither_armor");
            arrayList.add("wither/wither_invulnerable");
            arrayList.add("wolf/wolf");
            arrayList.add("wolf/wolf_angry");
            arrayList.add("wolf/wolf_collar");
            arrayList.add("wolf/wolf_tame");
            arrayList.add("zombie_pigman");
            arrayList.add("zombie/zombie");
            arrayList.add("zombie/zombie_villager");
            for (int i = 1120 & 8215; i < arrayList.size(); ++i) {
                String string = (String)arrayList.get(i);
                String string2 = "textures/entity/" + string + ".png";
                Class_2080 class_2080 = new Class_2080(string2);
                if (!Class_19426.Method_19594(class_2080)) {
                    Class_19426.Method_19610("Not found: " + class_2080);
                }
                Class_24158.Method_24166(class_2080);
            }
        }
    }

    private static Class_12145 Method_24166(Class_2080 class_2080) {
        String string = class_2080.Method_2084();
        Class_12145 class_12145 = (Class_12145)Field_24161.get(string);
        if (class_12145 == null) {
            class_12145 = Class_24158.Method_24173(class_2080);
            Field_24161.put(string, class_12145);
        }
        return class_12145;
    }

    private static String Method_24167(String string) {
        int n = 14602;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24158.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24168(String string) {
        int n = 23197;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24158.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24169(String string) {
        int n = 13585;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24158.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24170(String string) {
        int n = 2674;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24158.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_12145 Method_24171(Class_2080 class_2080, Class_2080 class_20802) {
        try {
            String string = class_2080.Method_2084();
            Class_19426.Method_19526("RandomMobs: " + class_20802.Method_2084() + ", variants: " + string);
            InputStream inputStream = Class_19426.Method_19493(class_2080);
            if (inputStream == null) {
                Class_19426.Method_19610("RandomMobs properties not found: " + string);
                return null;
            }
            Properties properties = new Properties();
            properties.load(inputStream);
            Class_12145 class_12145 = new Class_12145(properties, string, class_20802);
            return !class_12145.Method_12153(string) ? null : class_12145;
        }
        catch (FileNotFoundException fileNotFoundException) {
            Class_19426.Method_19610("RandomMobs file not found: " + class_20802.Method_2084());
            return null;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public static Class_2080 Method_24172(Class_2080 class_2080) {
        String string = class_2080.Method_2084();
        if (!string.startsWith("textures/entity/")) {
            return null;
        }
        String string2 = "mcpatcher/mob/" + string.substring("textures/entity/".length());
        return new Class_2080(class_2080.Method_2085(), string2);
    }

    private static Class_12145 Method_24173(Class_2080 class_2080) {
        Class_2080[] arrclass_2080;
        String string = class_2080.Method_2084();
        Class_2080 class_20802 = Class_24158.Method_24175(class_2080);
        if (class_20802 != null && (arrclass_2080 = Class_24158.Method_24171(class_20802, class_2080)) != null) {
            return arrclass_2080;
        }
        arrclass_2080 = Class_24158.Method_24179(class_2080);
        return new Class_12145(string, arrclass_2080);
    }

    private static String Method_24174(String string) {
        int n = 5313;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24158.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_2080 Method_24175(Class_2080 class_2080) {
        Class_2080 class_20802;
        String string;
        String string2;
        Class_2080 class_20803 = Class_24158.Method_24172(class_2080);
        if (class_20803 == null) {
            return null;
        }
        String string3 = class_20803.Method_2085();
        String string4 = string = class_20803.Method_2084();
        if (string.endsWith(".png")) {
            string4 = string.substring(-4032 & 16, string.length() - ".png".length());
        }
        if (Class_19426.Method_19594(class_20802 = new Class_2080(string3, string2 = string4 + ".properties"))) {
            return class_20802;
        }
        String string5 = Class_24158.Method_24183(string4);
        if (string5 == null) {
            return null;
        }
        Class_2080 class_20804 = new Class_2080(string3, string5 + ".properties");
        return Class_19426.Method_19594(class_20804) ? class_20804 : null;
    }

    private static String Method_24176(String string) {
        int n = 5227;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24158.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_24177(Class_1061 class_1061) {
        if (class_1061 instanceof Class_34093) {
            Class_1061 class_10612;
            Class_34093 class_34093 = (Class_34093)class_1061;
            Class_2651 class_2651 = Class_19426.Method_19581();
            if (class_2651 != null && (class_10612 = class_2651.\u0000strictfp(class_1061.Method_1311())) instanceof Class_34093) {
                int n;
                Class_34093 class_340932 = (Class_34093)class_10612;
                UUID uUID = class_340932.\u0000strictfp();
                long l = uUID.getLeastSignificantBits();
                class_34093.Field_34102 = n = (int)(l & (1036856649156919295L & Integer.MAX_VALUE));
                class_34093.Field_34109 = class_34093.\u0000strictfp();
                class_34093.Field_34095 = class_2651.\u0000strictfp(class_34093.Field_34109);
            }
        }
    }

    private static String Method_24178(String string) {
        int n = 18391;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24158.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_2080[] Method_24179(Class_2080 class_2080) {
        ArrayList<Class_2080> arrayList = new ArrayList<Class_2080>();
        arrayList.add(class_2080);
        Class_2080 class_20802 = Class_24158.Method_24172(class_2080);
        if (class_20802 == null) {
            return null;
        }
        for (int i = 16425 & -29369; i < arrayList.size() + (570 & 207); ++i) {
            int n = i + (8215 & 3873);
            Class_2080 class_20803 = Class_24158.Method_24185(class_20802, n);
            if (!Class_19426.Method_19594(class_20803)) continue;
            arrayList.add(class_20803);
        }
        if (arrayList.size() <= (45 & 24963)) {
            return null;
        }
        Class_2080[] arrclass_2080 = arrayList.toArray(new Class_2080[arrayList.size()]);
        Class_19426.Method_19526("RandomMobs: " + class_2080.Method_2084() + ", variants: " + arrclass_2080.length);
        return arrclass_2080;
    }

    private static String Method_24180(String string) {
        int n = 2664;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24158.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24181(String string) {
        int n = 15583;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24158.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Class_2080 Method_24182(Class_2080 class_2080) {
        block8 : {
            Class_34093 class_34093;
            Class_2080 class_20802;
            Class_12145 class_12145;
            block11 : {
                Class_2080 class_20803;
                block10 : {
                    Class_2080 class_20804;
                    Class_1061 class_1061;
                    block9 : {
                        Class_2080 class_20805;
                        if (Field_24164) {
                            return class_2080;
                        }
                        try {
                            Class_2080 class_20806;
                            Field_24164 = -22525 & 1569;
                            if (!Field_24159) {
                                Class_24158.Method_24165();
                            }
                            if (Field_24160 == null) break block8;
                            class_1061 = Class_24158.Field_24160.Field_25084;
                            if (class_1061 instanceof Class_34093) break block9;
                            class_20805 = class_20806 = class_2080;
                        }
                        catch (Throwable throwable) {
                            Field_24164 = 8 & -28656;
                            throw throwable;
                        }
                        Field_24164 = -28876 & 200;
                        return class_20805;
                    }
                    class_34093 = (Class_34093)class_1061;
                    String string = class_2080.Method_2084();
                    if (string.startsWith("textures/entity/")) break block10;
                    Class_2080 class_20807 = class_20804 = class_2080;
                    Field_24164 = 768 & 13447;
                    return class_20807;
                }
                class_12145 = Class_24158.Method_24166(class_2080);
                if (class_12145 != null) break block11;
                Class_2080 class_20808 = class_20803 = class_2080;
                Field_24164 = -29437 & 544;
                return class_20808;
            }
            Class_2080 class_20809 = class_20802 = class_12145.Method_12152(class_2080, class_34093);
            Field_24164 = 8264 & -31739;
            return class_20809;
        }
        Class_2080 class_208010 = class_2080;
        Field_24164 = -32743 & 23712;
        return class_208010;
    }

    private static String Method_24183(String string) {
        for (int i = -32600 & 17427; i < Field_24163.length; ++i) {
            String string2 = Field_24163[i];
            if (!string.endsWith(string2)) continue;
            String string3 = string.substring(2180 & 28738, string.length() - string2.length());
            return string3;
        }
        return null;
    }

    public static void Method_24184() {
        Field_24161.clear();
        if (Class_19426.Method_19492()) {
            Class_24158.Method_24165();
        }
    }

    public static Class_2080 Method_24185(Class_2080 class_2080, int n) {
        if (class_2080 == null) {
            return null;
        }
        String string = class_2080.Method_2084();
        int n2 = string.lastIndexOf(3119 & 46);
        if (n2 < 0) {
            return null;
        }
        String string2 = string.substring(28 & -27072, n2);
        String string3 = string.substring(n2);
        String string4 = string2 + n + string3;
        Class_2080 class_20802 = new Class_2080(class_2080.Method_2085(), string4);
        return class_20802;
    }

    static {
        Field_24161 = new HashMap();
        Field_24160 = null;
        Field_24159 = -23992 & 4391;
        Field_24162 = new Random();
        Field_24164 = 1792 & 24640;
        String[] arrstring = new String[6159 & -31414];
        arrstring[1153 & -7608] = Class_24158.Method_24170("\u1801\u1803\u1802\u1801\u1801\u1800");
        arrstring[25751 & 4161] = Class_24158.Method_24174("\u500d\u5024\u5029\u5024\u5025");
        arrstring[-31610 & 18978] = Class_24158.Method_24168("\u0501\u0528\u0522\u052b\u0520\u0520\u052a\u0522\u0520\u0528");
        arrstring[35 & 18499] = Class_24158.Method_24176("\u2120\u2109\u2102\u2101\u2104\u210f\u2106\u2105\u2108");
        arrstring[-32580 & 8198] = Class_24158.Method_24180("\u0206\u020f\u020e\u0209");
        arrstring[597 & 16397] = Class_24158.Method_24178("\u2130\u2102\u2112\u2102\u2114");
        arrstring[-24562 & 263] = Class_24158.Method_24181("\u0242\u0244\u0243\u0243\u0240\u0241\u0243\u0240\u024f\u024c\u024f\u0249\u0248");
        arrstring[17439 & 2055] = Class_24158.Method_24186("\u2449\u2460\u2468\u2460\u2460\u2468");
        arrstring[-32680 & 20490] = Class_24158.Method_24169("\u3524\u350f\u350a\u3507\u350a");
        arrstring[9 & -20423] = Class_24158.Method_24167("\u00b4\u0081\u0084\u0085\u0084\u0081\u0090");
        Field_24163 = arrstring;
    }

    private static String Method_24186(String string) {
        int n = 24806;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24158.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_24187(Class_283 class_283, Class_283 class_2832) {
        if (class_2832 != null) {
            List list = class_2832.Method_537();
            for (int i = 1 & 25602; i < list.size(); ++i) {
                Class_1061 class_1061 = (Class_1061)list.get(i);
                Class_24158.Method_24177(class_1061);
            }
        }
    }

    private void Method_24188() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

