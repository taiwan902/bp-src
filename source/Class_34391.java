/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_34391 {
    private static Map Field_34392;
    private static Map Field_34393;
    private static final Logger Field_34394;
    private static Map Field_34395;
    private static Map Field_34396;

    private static void Method_34397(Class class_, String string) {
        Field_34393.put(string, class_);
        Field_34395.put(class_, string);
    }

    public static String Method_34398(Class_13400 class_13400) {
        return (String)Field_34396.get(class_13400.getClass());
    }

    private void Method_34399() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String Method_34400(Class_18019 class_18019) {
        return (String)Field_34395.get(class_18019.getClass());
    }

    private static String Method_34401(String string) {
        int n = 10281;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34391.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_34402(String string) {
        int n = 17878;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34391.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_34403(String string) {
        int n = 24074;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34391.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_34404(String string) {
        int n = 27036;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34391.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_13400 Method_34405(Class_1699 class_1699, Class_283 class_283) {
        Class_13400 class_13400 = null;
        try {
            Class class_ = (Class)Field_34392.get(class_1699.Method_1708("id"));
            if (class_ != null) {
                class_13400 = (Class_13400)class_.newInstance();
            }
        }
        catch (Exception exception) {
            Field_34394.warn("Failed Piece with id " + class_1699.Method_1708("id"));
            exception.printStackTrace();
        }
        if (class_13400 != null) {
            class_13400.Method_13422(class_283, class_1699);
        } else {
            Field_34394.warn("Skipping Piece with id " + class_1699.Method_1708("id"));
        }
        return class_13400;
    }

    static void Method_34406(Class class_, String string) {
        Field_34392.put(string, class_);
        Field_34396.put(class_, string);
    }

    static {
        Field_34394 = LogManager.getLogger();
        Field_34393 = Maps.newHashMap();
        Field_34395 = Maps.newHashMap();
        Field_34392 = Maps.newHashMap();
        Field_34396 = Maps.newHashMap();
        Class_34391.Method_34397(Class_22818.class, Class_34391.Method_34401("\u2920\u2904\u2902\u290a\u290c\u2904\u290e\u290a\u2900"));
        Class_34391.Method_34397(Class_26307.class, Class_34391.Method_34404("\u5012\u5001\u5000\u5000\u5001\u5003\u5001"));
        Class_34391.Method_34397(Class_29857.class, Class_34391.Method_34402("\u0450\u0479\u0464\u0461\u0460\u0475\u0460\u0461"));
        Class_34391.Method_34397(Class_25916.class, Class_34391.Method_34408("\u4185\u4180\u4186\u4183\u4184\u4185\u4182\u4187\u4180\u4180"));
        Class_34391.Method_34397(Class_28327.class, Class_34391.Method_34409("\u0220\u0210\u0212\u0202\u0214\u0214"));
        Class_34391.Method_34397(Class_31345.class, Class_34391.Method_34403("\u2600\u2601\u2603\u2613\u2604\u2605\u2607\u2616"));
        Class_26253.Method_26256();
        Class_7234.Method_7240();
        Class_9675.Method_9680();
        Class_8238.Method_8246();
        Class_17045.Method_17046();
        Class_33031.Method_33033();
    }

    public static Class_18019 Method_34407(Class_1699 class_1699, Class_283 class_283) {
        Class_18019 class_18019 = null;
        try {
            Class class_ = (Class)Field_34393.get(class_1699.Method_1708("id"));
            if (class_ != null) {
                class_18019 = (Class_18019)class_.newInstance();
            }
        }
        catch (Exception exception) {
            Field_34394.warn("Failed Start with id " + class_1699.Method_1708("id"));
            exception.printStackTrace();
        }
        if (class_18019 != null) {
            class_18019.Method_18038(class_283, class_1699);
        } else {
            Field_34394.warn("Skipping Structure with id " + class_1699.Method_1708("id"));
        }
        return class_18019;
    }

    private static String Method_34408(String string) {
        int n = 16291;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34391.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_34409(String string) {
        int n = 15457;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34391.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

