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
import java.util.List;
import java.util.Map;

public class Class_12264 {
    private static final Map Field_12265;
    private static final String[] Field_12266;
    private static final Map Field_12267;
    private static final Map Field_12268;
    public static final String Field_12269;

    private static String Method_12270(String string) {
        int n = 20822;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 54);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12271(String string) {
        int n = 2937;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12272(String string) {
        int n = 28700;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 50);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12273(String string) {
        int n = 27087;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12274(String string) {
        int n = 25918;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 45);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_12275(int n, boolean bl) {
        Integer n2 = Class_27914.Method_27916(n);
        if (!bl) {
            if (Field_12267.containsKey(n2)) {
                return (Integer)Field_12267.get(n2);
            }
            int n3 = Class_12264.Method_12314(Class_12264.Method_12316(n2, (-24048 & 1188) != 0));
            Field_12267.put(n2, n3);
            return n3;
        }
        return Class_12264.Method_12314(Class_12264.Method_12316(n2, (3 & 10817) != 0));
    }

    private static String Method_12276(String string) {
        int n = 21785;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12277(String string) {
        int n = 21460;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_12278(int n) {
        int n2 = 14597 & 1072;
        while (n > 0) {
            n &= n - (-24455 & 4741);
            ++n2;
        }
        return n2;
    }

    private static int Method_12279(int n, int n2) {
        return Class_12264.Method_12286(n, n2) ? -21499 & 131 : 246 & 4352;
    }

    private static String Method_12280(String string) {
        int n = 12346;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 42);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12281(String string) {
        int n = 6237;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12282(String string) {
        int n = 4148;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 52);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12283(String string) {
        int n = 26554;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12284(String string) {
        int n = 24248;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12285(String string) {
        int n = 12749;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_12286(int n, int n2) {
        return ((n & (1543 & -32639) << n2) != 0 ? -30591 & 533 : 8841 & 16498) != 0;
    }

    private static String Method_12287(String string) {
        int n = 18202;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12288(String string) {
        int n = 23599;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 39);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_12289(Collection collection) {
        for (Class_25240 class_25240 : collection) {
            if (class_25240.Method_25265()) continue;
            return (-32224 & 2077) != 0;
        }
        return (4401 & 69) != 0;
    }

    public static int Method_12290(int n, int n2, int n3, int n4, int n5, int n6) {
        return (Class_12264.Method_12286(n, n2) ? 3102 & -20208 : -6136 & 5252) | (Class_12264.Method_12286(n, n3) ? 17099 & -23512 : 2352 & -3899) | (Class_12264.Method_12286(n, n4) ? 24596 & 166 : 6184 & -7021) | (Class_12264.Method_12286(n, n5) ? 8550 & 10 : 16384 & 9280) | (Class_12264.Method_12286(n, n6) ? 12433 & 2569 : 64 & 6202);
    }

    private static String Method_12291(String string) {
        int n = 12704;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 49);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12292(String string) {
        int n = 28399;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12293(String string) {
        int n = 20647;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12294(String string) {
        int n = 428;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 40);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_12269 = null;
        Field_12265 = Maps.newHashMap();
        Field_12268 = Maps.newHashMap();
        Field_12267 = Maps.newHashMap();
        String[] arrstring = new String[416 & 2156];
        arrstring[1317 & 18560] = Class_12264.Method_12273("\u02b8\u02a1\u02b8\u02a1\u02a4\u02a5\u02a4\u02bd\u02b0\u02a1\u02a0\u02a9\u02bc\u02ad\u02ac\u02b5\u02a0\u02a9\u02a8\u02a1\u02ac");
        arrstring[2127 & 1169] = Class_12264.Method_12305("\u0140\u0144\u0146\u0142\u0145\u0145\u0106\u0143\u0140\u0144\u0146\u0142\u0140\u0105\u0147\u0147\u0151\u0155\u0156\u0156\u0150\u0154\u0153\u0157\u0151\u0155\u0157");
        arrstring[20722 & 519] = Class_12264.Method_12287("\u0e38\u0e26\u0e3e\u0e22\u0e27\u0e27\u0e24\u0e3b\u0e3a\u0e2c\u0e2c\u0e22\u0e30\u0e27\u0e28\u0e27\u0e29\u0e27\u0e2e");
        arrstring[26163 & 3] = Class_12264.Method_12295("\u2820\u2820\u2822\u2822\u2820\u2820\u2822\u2822\u2820\u2820\u2822\u2822\u2820\u2820\u2822\u2822\u2830\u2830\u2832");
        arrstring[-32228 & 25604] = Class_12264.Method_12277("\u545c\u5441\u545a\u5447\u5444\u5445\u5406\u545b\u545c\u5449\u544a\u5447\u5450\u5405\u5446\u5443\u5440\u5445\u5456");
        arrstring[-18875 & 16525] = Class_12264.Method_12322("\u15e3\u15e0\u15e3\u15e2\u15e0\u15e1\u15a1\u15e3\u15e9\u15ea\u15e9\u15ea\u15eb\u15a9\u15eb\u15ea\u15e1\u15e1\u15e2\u15e0\u15e2");
        arrstring[38 & 16966] = Class_12264.Method_12285("\u0017\u0000\u0011\u0004\u0004\u0005\u0007\u0011\u0015\u0002\u0003\u0004\u0013\u0005\u0000\u0013\u0003\u0013\u0010\u0006\u0000");
        arrstring[535 & -16345] = Class_12264.Method_12318("\ue000\ue008\ue002\ue00a\ue009\ue009\ue00a\ue003\ue000\ue000\ue002\ue00a\ue008\ue009\ue002\ue00b\ue009\ue009");
        arrstring[23276 & 24] = Class_12264.Method_12337("\u2901\u2904\u2907\u2902\u2900\u2901\u2903\u2907\u2901\u2904\u2907\u2902\u2905\u2901\u2906\u2902\u2910\u2914\u2912\u2913\u2911");
        arrstring[22557 & -31671] = Class_12264.Method_12283("\u0449\u0443\u044b\u0443\u0446\u0446\u0405\u044e\u044b\u0449\u0449\u0443\u0445\u0406\u044d\u0446\u0448\u0448");
        arrstring[714 & -18418] = Class_12264.Method_12328("\u2293\u2288\u2291\u2288\u228c\u228d\u22cf\u2295\u2299\u228a\u228b\u2280\u2297\u22c5\u228f\u229c\u229b\u2298\u2288");
        arrstring[2123 & 779] = Class_12264.Method_12311("\u40cc\u40c1\u40c8\u40c5\u40c1\u40c0\u4080\u40cc\u40c4\u40c1\u40c0\u40cd\u40cc\u4088\u40c4\u40c1\u40c0\u40c9\u40c0\u40c5\u40c0\u40c9");
        arrstring[142 & 9292] = Class_12264.Method_12331("\ub200\ub212\ub200\ub210\ub216\ub216\ub216\ub204\ub202\ub210\ub212\ub210\ub204\ub216\ub216\ub204\ub210\ub210\ub200\ub212\ub204\ub204");
        arrstring[557 & -14259] = Class_12264.Method_12276("\u400f\u4001\u4009\u4005\u4004\u4004\u4047\u4008\u400d\u400b\u400b\u4005\u4003\u4044\u400a\u4005\u4000\u4001\u4009\u4004");
        arrstring[16463 & -24018] = Class_12264.Method_12308("\u0920\u0932\u0920\u0930\u0932\u0932\u0932\u0920\u0922\u0930\u0932\u0930\u0920\u0932\u0922\u0920\u0930\u0922\u0930");
        arrstring[-32721 & 4815] = Class_12264.Method_12320("\u4122\u4130\u4122\u4132\u4130\u4130\u4130\u4122\u4128\u413a\u4138\u413a\u412a\u4138\u413a\u413a\u4130\u4130\u4130\u4132\u4132\u4120");
        arrstring[-31143 & 12566] = Class_12264.Method_12304("\u120f\u1211\u1209\u1215\u1210\u1210\u1213\u120c\u120d\u121b\u121b\u1215\u1207\u1210\u1209\u1214\u1216\u121d\u1216");
        arrstring[6161 & 16433] = Class_12264.Method_12327("\u0181\u0192\u0181\u0190\u0196\u0197\u0197\u0185\u018b\u0198\u019b\u0198\u018d\u019f\u019c\u019d\u0190\u0192\u0190\u0193\u0185");
        arrstring[5714 & 2102] = Class_12264.Method_12300("\u3802\u3814\u3806\u3812\u3814\u3814\u3814\u3802\u3808\u381e\u381c\u381a\u380a\u381c\u381c\u381a\u3814\u3810\u3802");
        arrstring[-20585 & 27] = Class_12264.Method_12281("\u0c81\u0c84\u0c87\u0c82\u0c80\u0c81\u0cc3\u0c87\u0c89\u0c8c\u0c8f\u0c8a\u0c8d\u0cc9\u0c8e\u0c8f\u0c90\u0c91\u0c96\u0c92\u0c91\u0c90");
        arrstring[12948 & -15012] = Class_12264.Method_12271("\u2204\u2210\u2202\u2216\u2211\u2211\u2252\u2207\u2204\u2210\u2212\u2216\u2204\u2251\u2212\u2216\u2215\u2205\u2207\u2203\u2201");
        arrstring[5141 & 16599] = Class_12264.Method_12303("\u4002\u4008\u4000\u4008\u400c\u400c\u404e\u4004\u4008\u400a\u400a\u4000\u4006\u4044\u400e\u400c\u4000\u400a\u400a\u4000\u4006");
        arrstring[1183 & 18966] = Class_12264.Method_12292("\u3160\u3160\u3162\u3162\u3160\u3160\u3122\u3162\u3160\u3160\u3162\u3162\u3160\u3120\u3162\u3162\u3170\u3170\u3172\u3172\u3170");
        arrstring[-12009 & 2071] = Class_12264.Method_12284("\u2100\u2104\u2106\u2102\u2104\u2104\u2106\u2102\u2100\u2104\u2106\u2102\u2100\u2104\u2102\u2102\u2100\u2100\u2102\u2106\u2100\u2104\u2106");
        arrstring[20859 & -32740] = Class_12264.Method_12317("\u008b\u0082\u008b\u008b\u008a\u0088\u0082\u008a\u0089\u0088\u0083\u0082\u008a\u0081\u0090\u0091\u0098\u0092");
        arrstring[2905 & -3937] = Class_12264.Method_12325("\u5410\u5406\u5414\u5400\u5402\u5402\u5402\u5414\u541a\u540c\u540e\u5408\u541c\u540a\u540a\u540a\u5404\u5414");
        arrstring[3134 & -24102] = Class_12264.Method_12293("\u8af4\u8ae3\u8af0\u8ae5\u8ae2\u8ae3\u8aa2\u8af5\u8af6\u8ae1\u8ae2\u8ae5\u8af4\u8aa3\u8ae2\u8ae1\u8ae2\u8af7\u8ae0\u8ae1\u8af6\u8af7");
        arrstring[-15845 & 12507] = Class_12264.Method_12323("\uc020\uc030\uc020\uc030\uc030\uc030\uc070\uc020\uc020\uc030\uc030\uc030\uc020\uc070\uc020\uc030\uc020\uc020");
        arrstring[3103 & 156] = Class_12264.Method_12299("\u8121\u8129\u8123\u812b\u812c\u812c\u816f\u8126\u8121\u8121\u8123\u812b\u812d\u816c\u812f\u8127\u8121\u8121\u812b");
        arrstring[13373 & 925] = Class_12264.Method_12334("\u8db0\u8da1\u8db2\u8da3\u8da5\u8da4\u8da6\u8db6\u8db8\u8da9\u8daa\u8dab\u8dbc\u8dac\u8daf\u8daf\u8db0\u8da1\u8da2");
        arrstring[6174 & 8478] = Class_12264.Method_12329("\ua230\ua228\ua232\ua22a\ua22d\ua22d\ua26e\ua237\ua230\ua220\ua222\ua22a\ua23c\ua26d\ua227\ua237\ua229\ua230\ua233");
        arrstring[2207 & -31713] = Class_12264.Method_12306("\u2000\u2015\u2006\u2013\u2011\u2010\u2052\u2006\u2008\u201d\u201e\u201b\u200c\u2058\u200f\u200a\u2011\u2014\u2013\u2003");
        Field_12266 = arrstring;
        Field_12265.put(Class_8338.Field_8348.Method_8450(), Class_12264.Method_12301("\u01c0\u01c1\u01c2\u01c1\u01c4\u01c5\u01c4\u01c7\u01c8\u01c9\u01ca\u01c9\u01ce\u01cd\u01cc\u01cf\u01c0\u01c3\u01c0\u01c1\u01ce\u01c7"));
        Field_12265.put(Class_8338.Field_8361.Method_8450(), Class_12264.Method_12310("\u88a0\u88a1\u88a0\u88a5\u88a0\u88a1\u88a0\u88a5\u88a0\u88a1\u88a0\u88a1\u88a4\u88a1\u88a0\u88a1\u88b0\u88b5\u88b0\u88b1\u88b0\u88b5"));
        Field_12265.put(Class_8338.Field_8366.Method_8450(), Class_12264.Method_12326(" 002 0020\"2000 2\" 2 2"));
        Field_12265.put(Class_8338.Field_8359.Method_8450(), Class_12264.Method_12298("\u102c\u102d\u102a\u102f\u1028\u1029\u102a\u102f\u102c\u102d\u102e\u102b\u1028\u1029\u102a"));
        Field_12265.put(Class_8338.Field_8367.Method_8450(), Class_12264.Method_12302("\u40ac\u40bd\u40ae\u40ab\u40ac\u40ad\u40be\u40af\u40a8\u40ad\u40be\u40af\u40a8\u40ad\u40ae\u40bf\u40bc\u40b9\u40be\u40af\u40b4\u40a9"));
        Field_12265.put(Class_8338.Field_8368.Method_8450(), Class_12264.Method_12336("\u0011\u0000\u0012\u0012\u0010\u0011\u0003\u0012\u0018\u0018\u001b\n\u0018\u0018\u001a\u000b\u0000\u0000\u0002\u0013\u0001\u0010"));
        Field_12265.put(Class_8338.Field_8345.Method_8450(), Class_12264.Method_12288("\u84a3\u84a2\u84a2\u84a0\u84a2\u84a3\u84a3\u84a2\u84a0\u84a2\u84a0\u84a2\u84a0\u84a2\u84a1"));
        Field_12265.put(Class_8338.Field_8357.Method_8450(), Class_12264.Method_12294("\u0163\u0172\u0160\u0166\u0162\u0173\u0160\u0166\u0162\u0163\u0172\u0160\u0164\u0162\u0173\u0160\u0164\u0162\u0173\u016b\u0174"));
        Field_12265.put(Class_8338.Field_8349.Method_8450(), Class_12264.Method_12319("\ua240\ua251\ua250\ua253\ua255\ua244\ua256\ua255\ua250\ua250\ua240\ua253\ua256\ua255\ua245\ua257\ua252\ua251\ua241\ua250\ua246"));
        Field_12265.put(Class_8338.Field_8356.Method_8450(), Class_12264.Method_12280("\u0311\u0300\u0312\u0312\u0314\u0305\u0316\u0316\u0318\u0308\u031a\u031a\u031c\u031d\u030f\u031e\u0300\u0300\u0312\u030b\u0314"));
        Field_12265.put(Class_8338.Field_8362.Method_8450(), Class_12264.Method_12330("\u4182\u4183\u4182\u4181\u4182\u4183\u4182\u4181\u418a\u4189\u418a\u4189\u418a\u4189\u418a\u4189\u4182\u4181\u4180\u4181"));
        Field_12265.put(Class_8338.Field_8376.Method_8450(), Class_12264.Method_12309("\u3203\u3203\u3207\u3201\u3202\u3202\u3201\u3207\u3203\u3201\u3201\u3207\u3203\u3200\u3201\u3207\u3203\u3201\u3202\u3207"));
        Field_12265.put(Class_8338.Field_8374.Method_8450(), Class_12264.Method_12274("\ufe91\ufe81\ufe81\ufe83\ufe94\ufe85\ufe85\ufe87\ufe88\ufe9b\ufe8b\ufe89\ufe8d\ufe9e\ufe8f\ufe8d\ufe81\ufe92\ufe80\ufe91"));
        Field_12268.put(Class_8338.Field_8361.Method_8450(), Class_12264.Method_12315("\ua864"));
        Field_12268.put(Class_8338.Field_8342.Method_8450(), Class_12264.Method_12333("!"));
        Field_12268.put(Class_8338.Field_8349.Method_8450(), Class_12264.Method_12332("\u9244"));
        Field_12268.put(Class_8338.Field_8348.Method_8450(), Class_12264.Method_12291("\u702c"));
        Field_12268.put(Class_8338.Field_8345.Method_8450(), Class_12264.Method_12272("\u44c0"));
        Field_12268.put(Class_8338.Field_8359.Method_8450(), Class_12264.Method_12312("\u0504"));
        Field_12268.put(Class_8338.Field_8358.Method_8450(), Class_12264.Method_12282("\u3008"));
        Field_12268.put(Class_8338.Field_8367.Method_8450(), Class_12264.Method_12335("\ud060"));
        Field_12268.put(Class_8338.Field_8374.Method_8450(), Class_12264.Method_12270("\u0520"));
    }

    private static String Method_12295(String string) {
        int n = 22954;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_12296(int n) {
        return Class_12264.Method_12290(n, 69 & -32347, 16404 & -20220, 6187 & 8647, 834 & -32590, 4225 & 1549);
    }

    public static String Method_12297(int n) {
        int n2 = Class_12264.Method_12296(n);
        return Field_12266[n2];
    }

    private static String Method_12298(String string) {
        int n = 21475;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 36);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12299(String string) {
        int n = 26847;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12300(String string) {
        int n = 3194;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12301(String string) {
        int n = 25929;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 33);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12302(String string) {
        int n = 11064;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 37);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12303(String string) {
        int n = 2377;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12304(String string) {
        int n = 11095;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12305(String string) {
        int n = 13596;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12306(String string) {
        int n = 22400;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 32);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_12307(String string, int n, int n2, int n3) {
        if (n < string.length() && n2 >= 0 && n < n2) {
            int n4 = string.indexOf(8572 & 2684, n);
            if (n4 >= 0 && n4 < n2) {
                int n5 = Class_12264.Method_12307(string, n, n4 - (-19839 & 18705), n3);
                if (n5 > 0) {
                    return n5;
                }
                int n6 = Class_12264.Method_12307(string, n4 + (9259 & -28351), n2, n3);
                return n6 > 0 ? n6 : 2569 & 5376;
            }
            int n7 = string.indexOf(295 & 2150, n);
            if (n7 >= 0 && n7 < n2) {
                int n8 = Class_12264.Method_12307(string, n, n7 - (7193 & 8289), n3);
                if (n8 <= 0) {
                    return 5120 & 196;
                }
                int n9 = Class_12264.Method_12307(string, n7 + (16391 & 9273), n2, n3);
                return n9 <= 0 ? 11538 & 4329 : (n8 > n9 ? n8 : n9);
            }
            int n10 = 4652 & -31744;
            int n11 = 15394 & 4;
            int n12 = 4240 & 24648;
            int n13 = -17136 & 128;
            int n14 = 17410 & 4168;
            int n15 = -1 & -1;
            int n16 = 8304 & 16643;
            int n17 = 24961 & 4202;
            int n18 = 4384 & 17039;
            for (int i = n; i < n2; ++i) {
                char c = string.charAt(i);
                if (c >= (48 & -720) && c <= (13629 & 57)) {
                    if (n10 != 0) {
                        n17 = c - (433 & 2160);
                        n11 = 16467 & -20351;
                        continue;
                    }
                    n16 *= 10255 & -32518;
                    n16 += c - (5490 & 24624);
                    n12 = 19 & 20485;
                    continue;
                }
                if (c == (19258 & -31509)) {
                    n10 = -32623 & 2631;
                    continue;
                }
                if (c == (105 & 22833)) {
                    if (n12 != 0) {
                        n18 += Class_12264.Method_12313(n13 != 0, n11 != 0, n14 != 0, n15, n16, n17, n3);
                        n13 = 8321 & 6976;
                        n14 = 8227 & 16448;
                        n10 = 1034 & 129;
                        n11 = 288 & 4625;
                        n12 = 1826 & 24713;
                        n17 = 0 & -27276;
                        n16 = 568 & 14465;
                        n15 = -1 & -1;
                    }
                    n13 = -22379 & 4865;
                    continue;
                }
                if (c == (175 & -15827)) {
                    if (n12 != 0) {
                        n18 += Class_12264.Method_12313(n13 != 0, n11 != 0, n14 != 0, n15, n16, n17, n3);
                        n13 = 5328 & -7377;
                        n14 = 28680 & -32416;
                        n10 = 1024 & 24666;
                        n11 = 1088 & 2836;
                        n12 = -32511 & 40;
                        n17 = 2662 & 129;
                        n16 = 3650 & 20512;
                        n15 = -1 & -1;
                    }
                    n14 = 3073 & -15961;
                    continue;
                }
                if (c != (573 & -19139) && c != (-32452 & 63) && c != (2815 & 1342)) {
                    if (c != (43 & 12587) || n12 == 0) continue;
                    n18 += Class_12264.Method_12313(n13 != 0, n11 != 0, n14 != 0, n15, n16, n17, n3);
                    n13 = 13 & 21552;
                    n14 = 4149 & 1024;
                    n10 = 518 & 496;
                    n11 = 1152 & 4625;
                    n12 = 17040 & -25568;
                    n17 = -30682 & 17920;
                    n16 = 18496 & 128;
                    n15 = -1 & -1;
                    continue;
                }
                if (n12 != 0) {
                    n18 += Class_12264.Method_12313(n13 != 0, n11 != 0, n14 != 0, n15, n16, n17, n3);
                    n13 = -24415 & 5126;
                    n14 = 354 & 17408;
                    n10 = 8448 & 1136;
                    n11 = 9218 & -16379;
                    n12 = 188 & -15805;
                    n17 = 330 & 528;
                    n16 = 1346 & 8360;
                    n15 = -1 & -1;
                }
                if (c == (-28419 & 573)) {
                    n15 = 24837 & -30640;
                    continue;
                }
                if (c == (-24514 & 2621)) {
                    n15 = 2 & -29166;
                    continue;
                }
                if (c != (4670 & -22466)) continue;
                n15 = -32495 & 12297;
            }
            if (n12 != 0) {
                n18 += Class_12264.Method_12313(n13 != 0, n11 != 0, n14 != 0, n15, n16, n17, n3);
            }
            return n18;
        }
        return 16400 & -27352;
    }

    private static String Method_12308(String string) {
        int n = 8252;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12309(String string) {
        int n = 29330;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 44);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12310(String string) {
        int n = 16580;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 34);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12311(String string) {
        int n = 5958;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12312(String string) {
        int n = 6808;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 51);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_12313(boolean bl, boolean bl2, boolean bl3, int n, int n2, int n3, int n4) {
        int n5 = 15873 & -32570;
        if (bl) {
            n5 = Class_12264.Method_12324(n4, n2);
        } else if (n != (-1 & -1)) {
            if (n == 0 && Class_12264.Method_12278(n4) == n2) {
                n5 = 13321 & 897;
            } else if (n == (-32573 & 2837) && Class_12264.Method_12278(n4) > n2) {
                n5 = -30691 & 513;
            } else if (n == (7234 & 25130) && Class_12264.Method_12278(n4) < n2) {
                n5 = -8185 & 5281;
            }
        } else {
            n5 = Class_12264.Method_12279(n4, n2);
        }
        if (bl2) {
            n5 *= n3;
        }
        if (bl3) {
            n5 *= -1 & -1;
        }
        return n5;
    }

    public static int Method_12314(Collection collection) {
        int n = 3760110 & 738090454;
        if (collection != null && !collection.isEmpty()) {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (Class_25240 class_25240 : collection) {
                if (!class_25240.Method_25256()) continue;
                int n2 = Class_8338.Field_8341[class_25240.Method_25253()].Method_8390();
                if (Class_19426.Method_19499()) {
                    n2 = Class_10433.Method_10488(class_25240.Method_25253(), n2);
                }
                for (int i = 1088 & -20471; i <= class_25240.Method_25257(); ++i) {
                    f += (float)(n2 >> (4112 & -24300) & (1535 & -3841)) / (204.53125f * 1.2467532f);
                    f2 += (float)(n2 >> (21192 & -23494) & (15103 & -31233)) / (180.0f * 1.4166666f);
                    f3 += (float)(n2 >> (3296 & -28411) & (-27393 & 511)) / (245.72728f * 1.0377358f);
                    f4 += 1.0f;
                }
            }
            if (f4 == 0.0f) {
                return -32494 & 29184;
            }
            f = f / f4 * (0.41666666f * 612.0f);
            f2 = f2 / f4 * (1.0f * 255.0f);
            f3 = f3 / f4 * (0.47826087f * 533.1818f);
            return (int)f << (11280 & -32620) | (int)f2 << (4382 & -32727) | (int)f3;
        }
        if (Class_19426.Method_19499()) {
            n = Class_10433.Method_10488(14976 & 348, n);
        }
        return n;
    }

    private static String Method_12315(String string) {
        int n = 20088;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 46);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static List Method_12316(int n, boolean bl) {
        ArrayList arrayList = null;
        Class_8338[] arrclass_8338 = Class_8338.Field_8341;
        int n2 = arrclass_8338.length;
        for (int i = 2336 & 13448; i < n2; ++i) {
            int n3;
            String string;
            Class_8338 class_8338 = arrclass_8338[i];
            if (class_8338 == null || class_8338.Method_8410() && !bl || (string = (String)Field_12265.get(class_8338.Method_8450())) == null || (n3 = Class_12264.Method_12307(string, 625 & 29826, string.length(), n)) <= 0) continue;
            int n4 = 1028 & 16449;
            String string2 = (String)Field_12268.get(class_8338.Method_8450());
            if (string2 != null && (n4 = Class_12264.Method_12307(string2, -29684 & 16480, string2.length(), n)) < 0) {
                n4 = 27688 & -28159;
            }
            if (class_8338.Method_8420()) {
                n3 = 4761 & -24569;
            } else {
                n3 = (17584 & -29199) * (n3 * (1043 & 4387) + (n3 - (-32767 & 8595)) * (7054 & 16482));
                n3 >>= n4;
                n3 = (int)Math.round((double)n3 * class_8338.Method_8389());
                if ((n & (-10013 & 16392)) != 0) {
                    n3 = (int)Math.round((double)n3 * (0.7302631578947368 * 1.027027027027027) + 1.875 * 0.26666666666666666);
                }
            }
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            Class_25240 class_25240 = new Class_25240(class_8338.Method_8450(), n3, n4);
            if ((n & (17493 & 16424)) != 0) {
                class_25240.Method_25267((9245 & 259) != 0);
            }
            arrayList.add(class_25240);
        }
        return arrayList;
    }

    private static String Method_12317(String string) {
        int n = 9530;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12318(String string) {
        int n = 32742;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12319(String string) {
        int n = 30797;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 41);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12320(String string) {
        int n = 20243;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_12321() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_12322(String string) {
        int n = 3290;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12323(String string) {
        int n = 13190;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_12324(int n, int n2) {
        return Class_12264.Method_12286(n, n2) ? 581 & -13152 : -8063 & 1801;
    }

    private static String Method_12325(String string) {
        int n = 14623;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12326(String string) {
        int n = 12533;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 35);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12327(String string) {
        int n = 4308;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12328(String string) {
        int n = 13127;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12329(String string) {
        int n = 12162;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 31);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12330(String string) {
        int n = 22079;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 43);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12331(String string) {
        int n = 5044;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12332(String string) {
        int n = 11491;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 48);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12333(String string) {
        int n = 1599;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 47);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12334(String string) {
        int n = 21829;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 30);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12335(String string) {
        int n = 20251;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 53);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12336(String string) {
        int n = 4415;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 38);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12337(String string) {
        int n = 545;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12264.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_12338(int n, String string) {
        int n2 = -3988 & 0;
        int n3 = string.length();
        int n4 = 1040 & 4460;
        int n5 = 17441 & -30072;
        int n6 = 400 & -32766;
        int n7 = 579 & -11128;
        int n8 = -27640 & 2048;
        for (int i = n2; i < n3; ++i) {
            char c = string.charAt(i);
            if (c >= (-8016 & 6706) && c <= (-12231 & 57)) {
                n8 *= 29355 & -32694;
                n8 += c - (58 & -32588);
                n4 = 6145 & 547;
                continue;
            }
            if (c == (-32721 & 1825)) {
                if (n4 != 0) {
                    n = Class_12264.Method_12339(n, n8, n6 != 0, n5 != 0, n7 != 0);
                    n7 = 281 & -29534;
                    n5 = -15710 & 8264;
                    n6 = 12296 & 19477;
                    n4 = 17793 & -32216;
                    n8 = 1280 & 27;
                }
                n5 = 20737 & 8401;
                continue;
            }
            if (c == (6189 & 16557)) {
                if (n4 != 0) {
                    n = Class_12264.Method_12339(n, n8, n6 != 0, n5 != 0, n7 != 0);
                    n7 = 198 & 23088;
                    n5 = 8227 & 19460;
                    n6 = 4100 & 12184;
                    n4 = 8708 & -30703;
                    n8 = 8200 & 20998;
                }
                n6 = 18251 & 6305;
                continue;
            }
            if (c == (22591 & 555)) {
                if (n4 == 0) continue;
                n = Class_12264.Method_12339(n, n8, n6 != 0, n5 != 0, n7 != 0);
                n7 = 645 & 23914;
                n5 = -4542 & 173;
                n6 = 21522 & 2048;
                n4 = 8202 & 16384;
                n8 = 8963 & -32704;
                continue;
            }
            if (c != (-16282 & 8230)) continue;
            if (n4 != 0) {
                n = Class_12264.Method_12339(n, n8, n6 != 0, n5 != 0, n7 != 0);
                n7 = 4244 & 72;
                n5 = 16 & 23854;
                n6 = -16351 & 1668;
                n4 = 28678 & -29951;
                n8 = 1026 & 19417;
            }
            n7 = 1057 & 2245;
        }
        if (n4 != 0) {
            n = Class_12264.Method_12339(n, n8, n6 != 0, n5 != 0, n7 != 0);
        }
        return n & (-1 & 32767);
    }

    private static int Method_12339(int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        if (bl3) {
            if (!Class_12264.Method_12286(n, n2)) {
                return 8321 & -26360;
            }
        } else {
            n = bl ? (n &= (3843 & 8361) << n2 ^ -1 & -1) : (bl2 ? ((n & (2053 & 545) << n2) == 0 ? (n |= (259 & 4317) << n2) : (n &= (8579 & 5125) << n2 ^ -1 & -1)) : (n |= (129 & 1) << n2));
        }
        return n;
    }
}

