/*
 * Decompiled with CFR 0.145.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.CodeSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.ProtectionDomain;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Class_2263 {
    public static ArrayList Field_2264 = new ArrayList();
    private static String[] Field_2265;
    private static String[] Field_2266;
    private static String Field_2267;
    private static final SecureRandom Field_2268;
    private static String[] Field_2269;

    private static String Method_2270(String string) {
        int n = 30940;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 84);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2271(String string) {
        int n = 5541;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 36);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2272(String string) {
        int n = 3530;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2273() {
        return Float.parseFloat(Class_2263.Method_2367("\u0369\u0371\u0362"));
    }

    private static String Method_2274(String string) {
        int n = 6801;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Double Method_2275() {
        return Double.parseDouble(Class_2263.Method_2335("\u4053\u4044\u4054\u4050\u4057\u4056\u4056\u4055\u4051\u4051\u4051"));
    }

    public static String Method_2276() {
        if (Class_2263.Method_2294()) {
            try {
                Process process = Runtime.getRuntime().exec(Field_2266);
                process.getOutputStream().close();
                Scanner scanner = new Scanner(process.getInputStream());
                scanner.next();
                String string = scanner.next();
                scanner.close();
                return string;
            }
            catch (Exception exception) {
                return Class_2263.Method_2376("\u8242\u8251\u8246\u8241\u8246\u8247\u8252\u8247\u8242\u8253\u8250");
            }
        }
        return Class_2263.Method_2363("\u01a1\u01b2\u01a3\u01a1\u01a4\u01a4\u01b7\u01a6\u01a0\u01b1\u01b0");
    }

    private static String Method_2277(String string) {
        int n = 14142;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2278() {
        return Float.parseFloat(Class_2263.Method_2411("\u080c\u080d\u080d\u0803\u080d"));
    }

    public static Float Method_2279() {
        return Float.valueOf(Float.parseFloat(Class_2263.Method_2406("\u0800\u0800\u0800\u0800")));
    }

    private static String Method_2280(String string) {
        int n = 15726;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 93);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2281(String string) {
        int n = 17080;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2282(String string) {
        int n = 11991;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 69);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2283() {
        return Float.parseFloat(Class_2263.Method_2345("\u4348\u4351\u434b"));
    }

    private static String Method_2284(String string) {
        int n = 19004;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 38);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static double Method_2285() {
        return Double.parseDouble(Class_2263.Method_2382("\u8c00\u8c14\u8c00"));
    }

    public static float Method_2286() {
        return Float.parseFloat(Class_2263.Method_2336("PJ"));
    }

    private static String Method_2287(String string) {
        int n = 19324;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 89);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2288(String string) {
        int n = 2641;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 80);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_2289(int n, byte[] arrby) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Class_2263.Method_2422("\ub862\ub868\ub862\ub80a\ub804"));
            messageDigest.update(Class_18.Field_89.Method_265().Method_2116().getBytes());
            messageDigest.update(Class_18.Field_89.Method_265().Method_2115().getBytes());
            messageDigest.update((byte)System.currentTimeMillis());
            String string = Class_2263.Method_2346(messageDigest.digest());
            string = Class_2263.Method_2413("\u0100\u0150\u0116\u0116") + string + Class_2263.Method_2392("\u800c\u8005\u800a\u800a") + n;
            byte[] arrby2 = string.getBytes(StandardCharsets.UTF_8);
            System.arraycopy(arrby2, 17928 & 8608, arrby, 256 & 4097, Math.min(-28283 & 9844, arrby2.length));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static float Method_2290() {
        return Float.parseFloat(Class_2263.Method_2399("\u4a90\u4a81\u4a93"));
    }

    private static String Method_2291(String string) {
        int n = 10770;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2292(String string) {
        int n = 17846;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 60);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Double Method_2293() {
        return Double.parseDouble(Class_2263.Method_2325("\u0000\u0014\u0004\u0005\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000"));
    }

    private static boolean Method_2294() {
        return (Field_2267.indexOf(Class_2263.Method_2272("\u8820\u882c\u882b")) >= 0 ? 3203 & -32251 : 1026 & 8964) != 0;
    }

    public static float Method_2295() {
        return Float.parseFloat(Class_2263.Method_2302("\uc800\uc811\uc800\uc801\uc804\uc805\uc804\uc805\uc800\uc801\uc800"));
    }

    private static String Method_2296(String string) {
        int n = 22252;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 41);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2297() {
        return Float.parseFloat(Class_2263.Method_2395("\u6958\u6940\u6953"));
    }

    private static String Method_2298(String string) {
        int n = 14393;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 39);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2299(String string) {
        int n = 5072;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2300(String string) {
        int n = 4140;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 88);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2301() {
        return Float.parseFloat(Class_2263.Method_2333("\u0401\u0405\u0400"));
    }

    private static String Method_2302(String string) {
        int n = 15192;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 40);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2303(String string) {
        int n = 22289;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 75);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static double Method_2304() {
        return Double.parseDouble(Class_2263.Method_2374("\u8322\u8324\u8322\u8322"));
    }

    public static float Method_2305() {
        return Float.parseFloat(Class_2263.Method_2291("\u0006\u0001\u0007\u0006"));
    }

    private static String Method_2306(String string) {
        int n = 22779;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 61);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2307(String string) {
        int n = 29707;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 63);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2308(String string) {
        int n = 22120;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 37);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2309() {
        return Float.parseFloat(Class_2263.Method_2299("\u4010\u400d\u4016"));
    }

    private static String Method_2310(String string) {
        int n = 1163;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 77);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2311(String string) {
        int n = 8439;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 35);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static String Method_2312() {
        if (Class_2263.Method_2294()) {
            try {
                Process process = Runtime.getRuntime().exec(Field_2269);
                process.getOutputStream().close();
                Scanner scanner = new Scanner(process.getInputStream());
                scanner.next();
                String string = scanner.next();
                scanner.close();
                return string;
            }
            catch (Exception exception) {
                return Class_2263.Method_2388("\u8204\u8204\u8200\u8204\u8200\u8200\u8204\u8200\u820c\u820c\u820c");
            }
        }
        return Class_2263.Method_2344("\u01c2\u01d1\u01c0\u01c2\u01c3\u01c3\u01d0\u01c1\u01c3\u01d2\u01d3");
    }

    private static String Method_2313(String string) {
        int n = 29383;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 52);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static double Method_2314() {
        return Double.parseDouble(Class_2263.Method_2405("\u25c5\u25c5\u25c7\u25c7\u25c1\u25c5"));
    }

    private static String Method_2315(String string) {
        int n = 13917;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 94);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2316(String string) {
        int n = 14372;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 83);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2317(String string) {
        int n = 7738;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 68);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_2318(int n, byte[] arrby) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Class_2263.Method_2316("\u0d00\u0d08\u0d02\u0d0a\u0d00"));
            messageDigest.update(Class_18.Field_89.Method_265().Method_2116().getBytes());
            messageDigest.update(Class_18.Field_89.Method_265().Method_2115().getBytes());
            messageDigest.update((byte)System.currentTimeMillis());
            String string = Class_2263.Method_2346(messageDigest.digest());
            string = Class_2263.Method_2270("\u8519\u8521\u8529\u8528") + string + Class_2263.Method_2381("\u9454\u9405\u9440\u9440") + n;
            byte[] arrby2 = string.getBytes(StandardCharsets.UTF_8);
            System.arraycopy(arrby2, 1290 & 2048, arrby, 10160 & 4097, Math.min(-27564 & 2052, arrby2.length));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static float Method_2319() {
        return Float.parseFloat(Class_2263.Method_2330("\u1402\u1401\u1402"));
    }

    private static String Method_2320(String string) {
        int n = 163;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2321() {
        return Float.parseFloat(Class_2263.Method_2280("\u8448\u8441\u844a\u844a"));
    }

    private static String Method_2322(String string) {
        int n = 13509;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 96);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2323() {
        return Float.parseFloat(Class_2263.Method_2311("\ud100\ud11a\ud102"));
    }

    public static float Method_2324() {
        return Float.parseFloat(Class_2263.Method_2387("\u2209\u2212\u2202\u2202"));
    }

    private static String Method_2325(String string) {
        int n = 23959;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 44);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2326(String string) {
        int n = 9405;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2327(String string) {
        int n = 3217;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2328(String string) {
        int n = 4013;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Integer Method_2329() {
        return Integer.parseInt(Class_2263.Method_2300("\u9104\u9104\u9106\u9106"));
    }

    private static String Method_2330(String string) {
        int n = 5926;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_2331(double d) {
        return (d <= 0.29411764705882354 * 10.30625 ? -31229 & 30789 : 6912 & -31680) != 0;
    }

    public static double Method_2332() {
        return Double.parseDouble(Class_2263.Method_2360("\u0851\u084d\u0853\u0853\u0850"));
    }

    private static String Method_2333(String string) {
        int n = 6715;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 32);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2334(String string) {
        int n = 19766;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2335(String string) {
        int n = 31567;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 91);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2336(String string) {
        int n = 11766;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 34);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static String Method_2337() {
        if (Class_2263.Method_2294()) {
            try {
                Process process = Runtime.getRuntime().exec(Field_2265);
                process.getOutputStream().close();
                Scanner scanner = new Scanner(process.getInputStream());
                scanner.next();
                String string = scanner.next();
                scanner.close();
                return string;
            }
            catch (Exception exception) {
                return Class_2263.Method_2284("\u1400\u140a\u1406\u1400\u1404\u1404\u140a\u1406\u1400\u1400\u1400");
            }
        }
        return Class_2263.Method_2298("\u6808\u6800\u680c\u6808\u6808\u6808\u6804\u6808\u6800\u6800\u6800");
    }

    private static String Method_2338(String string) {
        int n = 22884;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 74);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2339(String string) {
        int n = 30270;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2340() {
        return Float.parseFloat(Class_2263.Method_2418("\u836e\u8364\u836e"));
    }

    private static String Method_2341(String string) {
        int n = 12833;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 76);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2342(String string) {
        int n = 22986;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 86);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_2343(byte[] arrby) {
        Class_2263.Method_2346(arrby);
    }

    private static String Method_2344(String string) {
        int n = 16480;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2345(String string) {
        int n = 18035;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static String Method_2346(byte[] arrby) {
        String string = "";
        for (int i = 2641 & 12290; i < arrby.length; ++i) {
            string = string + Integer.toString((arrby[i] & (767 & -7681)) + (2821 & 386), -24523 & 7056).substring(1089 & 18713);
        }
        return string;
    }

    public static double Method_2347() {
        return Double.parseDouble(Class_2263.Method_2315("\u5852\u5841\u5852\u5850\u5853\u5852\u5853\u5852\u585b\u585a\u585b\u585a\u585a\u585a\u585b\u5858\u5852\u5850\u5851"));
    }

    private static String Method_2348(String string) {
        int n = 4959;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2349() {
        return Float.parseFloat(Class_2263.Method_2352("\u4200\u4202\u4206\u4200"));
    }

    private void Method_2350() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_2263.Method_2322("\u482e\u4820\u480e\u4820\u480a\u4806\u480c\u480e\u480c\u4804\u4822\u4802\u4804\u480c"));
    }

    private static String Method_2351(String string) {
        int n = 16727;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2352(String string) {
        int n = 6127;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2353(String string) {
        int n = 17168;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2354(String string) {
        int n = 31085;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 79);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2355(String string) {
        int n = 7379;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 59);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2356(String string) {
        int n = 12014;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 95);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2357(String string) {
        int n = 11914;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 78);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_2358(byte[] arrby) {
        ((byte[])arrby.clone()).hashCode();
    }

    private static String Method_2359(String string) {
        int n = 31686;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 62);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2360(String string) {
        int n = 29867;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 43);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_2361() {
        return (21312 & -31586) != 0;
    }

    private static String Method_2362(String string) {
        int n = 25108;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 53);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2363(String string) {
        int n = 25047;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 82);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2364() {
        return Float.parseFloat(Class_2263.Method_2287("\ue1b0\ue1a0\ue1b2"));
    }

    public void Method_2365() {
    }

    private static String Method_2366(String string) {
        int n = 13623;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 65);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2367(String string) {
        int n = 27069;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 50);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Float Method_2368() {
        return Float.valueOf(Float.parseFloat(Class_2263.Method_2271("\u1000\u100c\u1004\u1000")));
    }

    private static String Method_2369(String string) {
        int n = 6934;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 71);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int[] Method_2370() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Class_2263.Method_2390("\u2cc1\u2cc8\u2cc3\u2c8b\u2c85"));
            messageDigest.update(Class_2263.Method_2337().getBytes(StandardCharsets.UTF_8));
            byte[] arrby = messageDigest.digest();
            int[] arrn = new int[-15860 & 8];
            arrn[1030 & -28512] = arrby[8260 & -9926];
            arrn[-17769 & 16449] = arrby[10245 & -32127];
            arrn[6142 & 16386] = arrby[8338 & -28665];
            arrn[8243 & 4931] = arrby[10243 & 16971];
            arrn[4140 & 19719] = arrby[7 & -32436];
            arrn[4613 & 21] = arrby[16679 & -19451];
            arrn[262 & 10438] = arrby[-28922 & 135];
            arrn[23 & -24753] = arrby[1311 & 679];
            return arrn;
        }
        catch (Exception exception) {
            return new int[285 & 9768];
        }
    }

    private static String Method_2371(String string) {
        int n = 10632;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 64);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2372(String string) {
        int n = 23535;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 56);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2373(String string) {
        int n = 11237;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2374(String string) {
        int n = 26194;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 45);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static double Method_2375() {
        return Double.parseDouble(Class_2263.Method_2308("\u00a5\u00a0\u00a4\u00a0\u00a0"));
    }

    private static String Method_2376(String string) {
        int n = 5413;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 81);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_2377(Class_20165 class_20165, byte[] arrby) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(Integer.valueOf(Class_2263.Method_2373("\u0232\u0230")));
        byteBuffer.putLong(System.currentTimeMillis());
        Class_22553 class_22553 = Class_16620.Method_16632(byteBuffer.array());
        class_20165.Method_20245(new Class_28799(Class_2263.Method_2353("\u4061\u4061\u4042\u4063\u4061\u4060\u4063\u4063\u4061\u4061\u4062\u4062\u4061\u4001\u4002\u4002\u4000\u4061\u4063\u4002"), new Class_29900(class_22553)));
    }

    private static String Method_2378(String string) {
        int n = 18664;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2379(String string) {
        int n = 11176;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 73);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2380(String string) {
        int n = 32614;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2381(String string) {
        int n = 10422;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 85);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2382(String string) {
        int n = 28508;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 90);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2383(String string) {
        int n = 7792;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 55);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2384(String string) {
        int n = 10271;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 54);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static double Method_2385() {
        return Double.parseDouble(Class_2263.Method_2386("\u040f\u0400\u040c\u040c\u040f\u040e\u040d\u040c\u040f\u040e\u040c\u0408\u0406\u040e\u040c\u040d\u0409\u040f\u040f"));
    }

    private static String Method_2386(String string) {
        int n = 17968;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 30);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2387(String string) {
        int n = 24339;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 51);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2388(String string) {
        int n = 2744;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_2389(Class_20165 class_20165, byte[] arrby) {
        byte[] arrby2;
        ByteBuffer byteBuffer = ByteBuffer.allocate(Integer.valueOf(Class_2263.Method_2313("\ub600\ub602\ub609")));
        byteBuffer.put(Class_18.Field_89.Method_265().Method_2116().getBytes());
        byte[] arrby3 = new byte[1091 & 561];
        arrby3[2066 & 9248] = 3324 & 8572;
        byteBuffer.put(arrby3);
        byteBuffer.put(Class_18.Field_89.Method_265().Method_2115().getBytes());
        byte[] arrby4 = new byte[6661 & 33];
        arrby4[17476 & -29784] = 382 & 16508;
        byteBuffer.put(arrby4);
        String string = Class_2263.Method_2276();
        String string2 = Class_2263.Method_2337();
        String string3 = Class_2263.Method_2312();
        byteBuffer.put(string.getBytes());
        byte[] arrby5 = new byte[-32703 & 5635];
        arrby5[18176 & 4100] = 19836 & -20227;
        byteBuffer.put(arrby5);
        byteBuffer.put(string2.getBytes());
        byte[] arrby6 = new byte[7169 & 273];
        arrby6[-30719 & 0] = -32643 & 638;
        byteBuffer.put(arrby6);
        byteBuffer.put(string3.getBytes());
        byte[] arrby7 = new byte[-28911 & 16513];
        arrby7[-22496 & 17285] = 24317 & -24450;
        byteBuffer.put(arrby7);
        try {
            int n;
            arrby2 = MessageDigest.getInstance(Class_2263.Method_2362("\u891a\u8900\u8908\u8900\u8918"));
            Path path = Paths.get(Class_18.class.getProtectionDomain().getCodeSource().getLocation().toURI());
            File file = path.toFile();
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] arrby8 = new byte[6144 & -27061];
            while ((n = fileInputStream.read(arrby8)) != (-1 & -1)) {
                arrby2.update(arrby8, Integer.valueOf(Class_2263.Method_2384("\u21c9")), n);
            }
            fileInputStream.close();
            Class_2263.Method_2346(arrby2.digest());
            byte[] arrby9 = new byte[20609 & 337];
            arrby9[8473 & 32] = -3844 & 2174;
            byteBuffer.put(arrby9);
        }
        catch (URISyntaxException uRISyntaxException) {
            byteBuffer.put(Class_2263.Method_2383("\u0704\u0717\u0702\u0705\u0700\u0701\u0716\u0703\u070c\u071d\u071c\u070d").getBytes());
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (IOException iOException) {
            byteBuffer.put(Class_2263.Method_2372("\u1080\u1099\u1082\u1083\u1084\u1085\u109e\u1087\u1080\u1091\u1092\u108b").getBytes());
        }
        arrby2 = byteBuffer.array();
        int n = Integer.valueOf(Class_2263.Method_2394("\u2391\u2393"));
        int n2 = Integer.valueOf(Class_2263.Method_2403("\u8204\u8205"));
        for (int i = Integer.valueOf((String)Class_2263.Method_2355((String)"\u200a")).intValue(); i < arrby2.length; ++i) {
            arrby2[i] = (byte)(arrby2[i] ^ n + (i & n2));
        }
        byte[] arrby10 = Class_2263.Method_2292("\u904e\u9040\u904e\u904a\u9044\u9004\u900a\u904a\u9042\u904e\u9040\u9048\u9044\u9000\u9040\u904a\u904c\u9008\u9044\u900a\u9046\u9040\u904e\u9044\u9042\u9042\u904a\u904c\u9044\u904a\u9046\u904c\u9060\u906c\u902a\u906a\u9068\u906a\u9060\u9060\u9068\u902e\u9028\u9028\u9062\u906a\u906a\u9066\u9060\u9028\u906e\u9064\u9028\u9064\u9062\u9064\u9064\u9062\u9060\u9062\u9066\u9064\u9062\u9022\u900a\u9000\u9006\u9002\u9048\u9002\u900a\u900c\u9002\u900a\u9006\u904c\u9040\u9002\u9002\u9042\u900a\u900c\u9008\u900c\u900c\u900a\u9002\u904a\u900e\u9000\u9042\u9008\u9004\u900e\u9000\u900a\u902a\u9020\u906a\u902c\u9028\u9022\u9024\u902a\u9060\u9022\u9028\u9026\u9022\u9022\u902a\u9022\u9068\u902a\u9024\u9020\u902e\u902a\u9022\u902c\u902a\u9028\u9062\u9028\u9024\u9022\u9026\u9062\u90ce\u90c4\u90ca\u90c8\u90c6\u90c0\u90ce\u908a\u90c2\u90ca\u90ca\u90c6\u90ce\u90c6\u90c2\u90cc\u90c0\u90cc\u9084\u9080\u90c8\u90c8\u90c8\u90c0\u90ca\u90c0\u9082\u90c6\u90ce\u9080\u90ce\u90c0\u90a8\u90e2\u90ee\u90e8\u90ec\u90a8\u90e0\u90ea\u90ea\u90a0\u90e8\u90e0\u90e0\u90e6\u90ea\u90e6\u90e6\u90e0\u90ee\u90aa\u90a4\u90a8\u90ec\u90e8\u90e0\u90e2\u90e8\u90e6\u90ac\u90a0\u90e8\u90e6\u9086\u908a\u9080\u9082\u90c8\u908a\u908a\u90ca\u908a\u9086\u908c\u908e\u9084\u908e\u908c\u908a\u9082\u9088\u9086\u9082\u90c8\u908a\u9080\u9082\u9082\u9084\u9086\u9088\u90c0\u9086\u9080\u908a\u90e8\u90a4\u90a4\u90ac\u90a8\u90e8\u90aa\u90a4\u90a2\u90aa\u90a6\u90a0\u90ec\u90e0\u90a8\u90a6\u90e8\u90aa\u90aa\u90ea\u90a6\u90a8\u90ea\u90a8\u90ae\u90a6\u90ac\u90aa\u90e0\u90aa\u90e2\u90aa\u9146\u9146\u9142\u9146\u9140\u9106\u9100\u914e\u914c\u9140\u9146\u9146\u9146\u914e\u9102\u9144\u9140\u914c\u9148\u910a\u914a\u914c\u914e\u914e\u9100\u9144\u914c\u9148\u9146\u914e\u914c\u914c\u9160\u916c\u912a\u916c\u916c\u9162\u9162\u916e\u9162\u916a\u916c\u916a\u9120\u916a\u9166\u9168\u916c\u9164\u9162\u912a\u9162\u9166\u9168\u916e\u9160\u9166\u916a\u9160\u916a\u9120\u916c\u9162\u910a\u9102\u914a\u910a\u910a\u9106\u9100\u910e\u910a\u9104\u9142\u9104\u9140\u9102\u9102\u910c\u9102\u9106\u9100\u910e\u9148\u9100\u914a\u9100\u9100\u910a\u910e\u910a\u9104\u9102\u9108\u9142\u912a\u9120\u912e\u916a\u912a\u9126\u9128\u9122\u9124\u912e\u912a\u9126\u912c\u9160\u9120\u9128\u912c\u912e\u9124\u9128\u9168\u9128\u9128\u9124\u9124\u9124\u9128\u9126\u9128\u9126\u912c\u9126\u91ce\u91c6\u9184\u9180\u91cc\u91c2\u91c2\u91ce\u91ca\u91c4\u91c8\u91c6\u918e").getBytes();
        for (int i = Integer.valueOf((String)Class_2263.Method_2306((String)"\u1910")).intValue(); i < arrby2.length; i += Integer.valueOf((String)Class_2263.Method_2357((String)"\u2530\u2531")).intValue()) {
            byte[] arrby11 = arrby2;
            int n3 = i;
            arrby11[n3] = (byte)(arrby11[n3] ^ (arrby10[19525 & -24192] ^ arrby[5377 & 2080] ^ Integer.valueOf(Class_2263.Method_2359("\u2001\u2001"))));
            byte[] arrby12 = arrby2;
            int n4 = i + (-16033 & 3073);
            arrby12[n4] = (byte)(arrby12[n4] ^ (arrby10[-7133 & 785] ^ arrby[129 & -23759] ^ Integer.valueOf(Class_2263.Method_2307("\ue91c\ue91d"))));
            byte[] arrby13 = arrby2;
            int n5 = i + (1670 & 20826);
            arrby13[n5] = (byte)(arrby13[n5] ^ (arrby10[-31101 & 4102] ^ arrby[8230 & -32686] ^ Integer.valueOf(Class_2263.Method_2371("\u1000\u1001\u1003"))));
            byte[] arrby14 = arrby2;
            int n6 = i + (-24273 & 16915);
            arrby14[n6] = (byte)(arrby14[n6] ^ (arrby10[24579 & 1315] ^ arrby[-16381 & 531] ^ Integer.valueOf(Class_2263.Method_2366("\u0403\u0400\u0406"))));
            byte[] arrby15 = arrby2;
            int n7 = i + (-28644 & 6);
            arrby15[n7] = (byte)(arrby15[n7] ^ (arrby10[-32506 & 11276] ^ arrby[4 & 1028] ^ Integer.valueOf(Class_2263.Method_2400("\uc010\uc013"))));
            byte[] arrby16 = arrby2;
            int n8 = i + (19503 & -24571);
            arrby16[n8] = (byte)(arrby16[n8] ^ (arrby10[8197 & 19461] ^ arrby[311 & -16307] ^ Integer.valueOf(Class_2263.Method_2416("\u01b4\u01a7\u01a4"))));
            byte[] arrby17 = arrby2;
            int n9 = i + (8198 & -26985);
            arrby17[n9] = (byte)(arrby17[n9] ^ (arrby10[4118 & 2087] ^ arrby[6 & -30138] ^ Integer.valueOf(Class_2263.Method_2317("\u0587"))));
            byte[] arrby18 = arrby2;
            int n10 = i + (18703 & 135);
            arrby18[n10] = (byte)(arrby18[n10] ^ (arrby10[-32761 & 2631] ^ arrby[20519 & 1559] ^ Integer.valueOf(Class_2263.Method_2282("\u42f8\u42f9"))));
            byte[] arrby19 = arrby2;
            int n11 = i + (572 & 14346);
            arrby19[n11] = (byte)(arrby19[n11] ^ (arrby10[283 & -8056] ^ arrby[16456 & 2586] ^ Integer.valueOf(Class_2263.Method_2401("\ua5a2\ua5a3\ua5a2"))));
            byte[] arrby20 = arrby2;
            int n12 = i + (537 & 6157);
            arrby20[n12] = (byte)(arrby20[n12] ^ (arrby10[-16375 & 3787] ^ arrby[2057 & 18205] ^ Integer.valueOf(Class_2263.Method_2369("\u41d0\u41d1"))));
            byte[] arrby21 = arrby2;
            int n13 = i + (-32657 & 2058);
            arrby21[n13] = (byte)(arrby21[n13] ^ (arrby10[-30642 & 8730] ^ arrby[21963 & 10250] ^ Integer.valueOf(Class_2263.Method_2415("\u0430\u0421\u0421"))));
            byte[] arrby22 = arrby2;
            int n14 = i + (-26385 & 16651);
            arrby22[n14] = (byte)(arrby22[n14] ^ (arrby10[283 & 12299] ^ arrby[2447 & 16507] ^ Integer.valueOf(Class_2263.Method_2379("FF"))));
            byte[] arrby23 = arrby2;
            int n15 = i + (-23540 & 2575);
            arrby23[n15] = (byte)(arrby23[n15] ^ (arrby10[-32756 & 17693] ^ arrby[13 & 12972] ^ Integer.valueOf(Class_2263.Method_2338("\u8a0f\u8a0b"))));
            byte[] arrby24 = arrby2;
            int n16 = i + (16781 & 1103);
            arrby24[n16] = (byte)(arrby24[n16] ^ (arrby10[8589 & 591] ^ arrby[45 & -16035] ^ Integer.valueOf(Class_2263.Method_2303("\u00ea\u00e1\u00e3"))));
            byte[] arrby25 = arrby2;
            int n17 = i + (25358 & 2302);
            arrby25[n17] = (byte)(arrby25[n17] ^ (arrby10[-19058 & 30] ^ arrby[1086 & -16370] ^ Integer.valueOf(Class_2263.Method_2341("\u00d6\u00d5"))));
            byte[] arrby26 = arrby2;
            int n18 = i + (1695 & -14257);
            arrby26[n18] = (byte)(arrby26[n18] ^ (arrby10[24975 & -27121] ^ arrby[2127 & 4399] ^ Integer.valueOf(Class_2263.Method_2310("\u0201\u0210\u0212\u0213"))));
        }
        Class_22553 class_22553 = Class_16620.Method_16632(arrby2);
        class_20165.Method_20245(new Class_28799(Class_2263.Method_2354("\u0084\u0081\u0084\u0081\u0084\u0081\u0084\u0085\u0084"), new Class_29900(class_22553)));
    }

    private static String Method_2390(String string) {
        int n = 4797;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 31);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2391(String string) {
        int n = 6868;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_2268 = new SecureRandom();
        Field_2267 = System.getProperty(Class_2263.Method_2351("\u1210\u1201\u1213\u1212\u1216\u1217\u1214")).toLowerCase();
        String[] arrstring = new String[3621 & 148];
        arrstring[4176 & 8320] = Class_2263.Method_2414("\u1400\u1403\u1404\u1407");
        arrstring[-32595 & 10513] = Class_2263.Method_2402("\u8182\u8189\u818b\u8183");
        arrstring[326 & 17418] = Class_2263.Method_2281("\u5086\u5085\u5084");
        arrstring[295 & 6675] = Class_2263.Method_2380("\uc094\uc081\uc094\uc085\uc084\uc081\uc080\uc091\uc088\uc08d\uc088\uc09d");
        Field_2265 = arrstring;
        String[] arrstring2 = new String[16428 & 4];
        arrstring2[8200 & -26112] = Class_2263.Method_2277("\u5e04\u5e0d\u5e08\u5e01");
        arrstring2[1557 & -26623] = Class_2263.Method_2378("\u4060\u4063\u4062");
        arrstring2[22678 & -32701] = Class_2263.Method_2339("\u0810\u0811\u0801");
        arrstring2[1091 & -13509] = Class_2263.Method_2348(" \u0001\u001b\u0012\u0015\u0004\u0007\u001e\b0\u001a");
        Field_2266 = arrstring2;
        String[] arrstring3 = new String[2076 & -3836];
        arrstring3[-3456 & 38] = Class_2263.Method_2274("\u4001\u4019\u401b\u4013");
        arrstring3[133 & 27] = Class_2263.Method_2391("\u0002\u0002\u0002\u0002\u0002\u0000\u0000\u0002\u0002");
        arrstring3[7207 & 24602] = Class_2263.Method_2320("\u8440\u8441\u8443");
        arrstring3[5679 & 24979] = Class_2263.Method_2328("\u1408\u140a\u140a\u1400\u140a\u1402\u1402\u1408\u1402\u1408\u1408\u140a");
        Field_2269 = arrstring3;
    }

    private static String Method_2392(String string) {
        int n = 5600;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 49);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2393() {
        return Float.parseFloat(Class_2263.Method_2296("\u200c\u2003\u200b"));
    }

    private static String Method_2394(String string) {
        int n = 15013;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 57);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2395(String string) {
        int n = 26603;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_2396() {
    }

    public static float Method_2397() {
        return Float.parseFloat(Class_2263.Method_2410("\u9102\u9101\u9106\u9101"));
    }

    public long Method_2398() {
        return System.currentTimeMillis();
    }

    private static String Method_2399(String string) {
        int n = 5645;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 42);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2400(String string) {
        int n = 14914;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 66);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2401(String string) {
        int n = 2002;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 70);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2402(String string) {
        int n = 8445;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2403(String string) {
        int n = 19577;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 58);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2404() {
        return Float.parseFloat(Class_2263.Method_2342("\u2000\u2010\u2001"));
    }

    private static String Method_2405(String string) {
        int n = 9516;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2406(String string) {
        int n = 4739;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 33);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static double Method_2407() {
        return Double.parseDouble(Class_2263.Method_2334("\u140c\u1401\u140a"));
    }

    public static float Method_2408() {
        return Float.parseFloat(Class_2263.Method_2326("\u07a0\u07a7\u07a0\u07a3"));
    }

    public static Float Method_2409() {
        return Float.valueOf(Float.parseFloat(Class_2263.Method_2327("\u8048\u8044\u804a")));
    }

    private static String Method_2410(String string) {
        int n = 1034;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 46);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2411(String string) {
        int n = 10576;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 87);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Float Method_2412() {
        return Float.valueOf(Float.parseFloat(Class_2263.Method_2419("\uf150\uf146\uf150\uf150")));
    }

    private static String Method_2413(String string) {
        int n = 860;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 48);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2414(String string) {
        int n = 16282;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2415(String string) {
        int n = 3438;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 72);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2416(String string) {
        int n = 11101;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 67);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_2417() {
        return Float.parseFloat(Class_2263.Method_2356("\ua0d8\ua0c1\ua0da"));
    }

    private static String Method_2418(String string) {
        int n = 5530;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_2419(String string) {
        int n = 24838;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 92);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static double Method_2420() {
        return Double.parseDouble(Class_2263.Method_2288("\u880d\u8801\u8804\u8805\u880d\u880d\u880d\u880d\u880d\u880c\u8804\u880d\u8808\u880c\u8809\u8805\u8819\u881c"));
    }

    public int Method_2421(long l, int n) {
        return -1 & -1;
    }

    private static String Method_2422(String string) {
        int n = 9627;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2263.class, 47);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

