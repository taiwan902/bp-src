/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000, implements + 5 6 break final void super super case class = 4 if goto short * ~ throw + strictfp 
 *  \u0000, implements + 5 6 break final void super super case class = 4 if goto short * ~ throw + strictfp $ & 2 } private 6 5 throws ] continue finally double double throws 4 2 ~ ? else boolean short interface true default byte 7 2 { ` boolean switch byte finally ? double
 *  com.google.common.collect.Lists
 *  internal.org.lwjgl.Sys
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.collect.Lists;
import internal.org.lwjgl.Sys;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.management.ManagementFactory;
import java.math.BigInteger;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.security.CodeSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.ProtectionDomain;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipEntry;
import org.apache.commons.io.IOUtils;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Class_48006
extends Class_2263
implements Class_13 {
    private static byte[] Field_48007;
    private static final PublicKey Field_48008;
    public static String Field_48009;
    private static final byte[] Field_48010;
    private static boolean Field_48011;
    private static boolean Field_48012;
    private static HashSet Field_48013;

    private static String Method_48014(String string) {
        int n = 16843;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 43);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static final boolean Method_48015() {
        String string = Class_48006.Method_48025("\u7040\u7040\u7052\u7042\u7020\u7040\u7042\u7042\u7028");
        URLClassLoader uRLClassLoader = (URLClassLoader)Class_18.class.getClassLoader();
        if (uRLClassLoader.getClass() != URLClassLoader.class) {
            return (1152 & -32472) != 0;
        }
        if (uRLClassLoader.getURLs().length != (-32765 & 329)) {
            return (16 & 1600) != 0;
        }
        URL uRL = uRLClassLoader.getURLs()[13094 & 16528];
        try {
            URL uRL2 = uRL.getProtocol().equalsIgnoreCase(Class_48006.Method_48041("\u2902\u2900\u2902")) ? uRL : new URL(Class_48006.Method_48056("\u4410\u4410\u4400\u4401") + uRL.toString() + Class_48006.Method_48014("\u0460\u0468"));
            JarURLConnection jarURLConnection = (JarURLConnection)uRL2.openConnection();
            jarURLConnection.setUseCaches((4276 & 258) != 0);
            Path path = Paths.get(Class_18.class.getProtectionDomain().getCodeSource().getLocation().toURI());
            if (!path.toFile().getPath().equals(jarURLConnection.getJarFile().getName())) {
                return (-8032 & 1284) != 0;
            }
            JarFile jarFile = jarURLConnection.getJarFile();
            Manifest manifest = jarFile.getManifest();
            if (manifest == null) {
                return (-10752 & 32) != 0;
            }
            byte[] arrby = new byte[10225 & 29499];
            Enumeration<JarEntry> enumeration = jarFile.entries();
            Certificate certificate = null;
            int n = 513 & -6774;
            while (enumeration.hasMoreElements()) {
                int n2;
                byte[] arrby2;
                Certificate[] arrcertificate;
                JarEntry jarEntry = enumeration.nextElement();
                if (jarEntry.isDirectory() || jarEntry.getName().equals(Class_48006.Method_48069("\u4080\u4083\u4082\u40c1\u4083\u4083\u4080\u4083\u4089\u4088\u408b\u4088\u408a\u40c9\u4089\u408b\u4082\u4083\u4082\u4082\u4083\u4082\u4083\u40c0\u4089\u408a\u408b\u4089\u4089"))) continue;
                InputStream inputStream = jarFile.getInputStream(jarEntry);
                long l = 845155392L & 6544749020517212172L;
                long l2 = 2694964810716561482L & -2694964812696639995L;
                while ((n2 = inputStream.read(arrby, -32224 & 10462, arrby.length)) != (-1 & -1)) {
                    l += (long)n2;
                }
                if (!jarEntry.getName().startsWith(string)) {
                    JarURLConnection jarURLConnection2;
                    inputStream = uRLClassLoader.getResourceAsStream(jarEntry.getName());
                    while ((n2 = inputStream.read(arrby, 2336 & 17560, arrby.length)) != (-1 & -1)) {
                        l2 += (long)n2;
                    }
                    if (l != l2) {
                        return (4176 & 18976) != 0;
                    }
                    arrby2 = uRLClassLoader.getResource(jarEntry.getName()).openConnection();
                    inputStream.close();
                    if (arrby2 instanceof JarURLConnection) {
                        jarURLConnection2 = (JarURLConnection)arrby2;
                        if (!jarURLConnection2.getJarFile().getName().equals(jarFile.getName()) && !jarURLConnection2.getJarFileURL().equals(\u0000, implements + 5 6 break final void super super case class = 4 if goto short * ~ throw + strictfp . & 2 } private 6 5 throws ] continue finally double double throws 4 2 ~ ? else boolean short interface true default byte 7 2 { ` boolean switch byte finally ? double.\u0000strictfp.toURI().toURL())) {
                            return (514 & 7181) != 0;
                        }
                    } else {
                        return (19200 & 180) != 0;
                    }
                    arrcertificate = jarURLConnection2.getCertificates();
                } else {
                    arrcertificate = jarEntry.getCertificates();
                }
                if (arrcertificate == null || arrcertificate.length == 0) {
                    if (jarEntry.getName().startsWith(Class_48006.Method_48024("\u030a\u0302\u0302\u0302\u032e\u030e\u030c\u0304"))) continue;
                    return (3973 & 16456) != 0;
                }
                if (arrcertificate.length != (4533 & 1091)) {
                    return (1025 & 2196) != 0;
                }
                if (certificate == null) {
                    try {
                        arrcertificate[3200 & 618].verify(Field_48008);
                        arrby2 = arrcertificate[672 & 27714].getPublicKey().getEncoded();
                        if (arrby2.length == Field_48010.length) {
                            int n3 = 2057 & 449;
                            for (int i = 2320 & 28738; i < arrby2.length; ++i) {
                                if (arrby2[i] == Field_48010[i]) continue;
                                n3 = 12288 & 350;
                            }
                            if (n3 != 0) {
                                ++n;
                                certificate = arrcertificate[516 & 194];
                                continue;
                            }
                            return (775 & -26624) != 0;
                        }
                        return (8202 & -28624) != 0;
                    }
                    catch (Throwable throwable) {
                        return (18652 & -32255) != 0;
                    }
                }
                if (!certificate.equals(arrcertificate[11960 & 4166])) {
                    return (18442 & 8208) != 0;
                }
                ++n;
            }
            jarFile.close();
            return (n > (-23962 & 18548) ? -31101 & 24617 : -13997 & 1664) != 0;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return (25897 & 4) != 0;
        }
        catch (URISyntaxException uRISyntaxException) {
            uRISyntaxException.printStackTrace();
            return (161 & -32766) != 0;
        }
    }

    private static String Method_48016(String string) {
        int n = 440;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 34);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48017(String string) {
        int n = 13520;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48018(String string) {
        int n = 32736;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 36);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48019(String string) {
        int n = 26273;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_48020() {
        Class_859.Field_905 = new Float(Float.parseFloat(Class_48006.Method_48060("\uc870\uc867\uc870\uc871")));
        Class_859.Field_878 = new Float(Float.parseFloat(Class_48006.Method_48076("\u1484\u1488\u1487\u1482\u1480\u1485\u1487\u1483\u1485\u1480"))).floatValue();
        Class_859.Field_917 = new Float(Float.parseFloat(Class_48006.Method_48047("\u1839\u1821\u1838"))).floatValue();
    }

    public static byte[] Method_48021(DataInputStream dataInputStream) {
        byte[] arrby = new byte[27027 & -16340];
        try {
            int n;
            MessageDigest messageDigest = MessageDigest.getInstance(Class_48006.Method_48046("\u1180\u1181\u11a2"));
            while ((n = dataInputStream.read(arrby)) != (-1 & -1)) {
                messageDigest.update(arrby, 352 & -28664, n);
            }
            return messageDigest.digest();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static void Method_48022(int n) {
        if (!Field_48011) {
            Field_48011 = 8777 & 20481;
            Class_47033.Method_47059(new Class_20760(Class_2205.Field_2240, n + ""));
        }
    }

    private static String Method_48023(String string) {
        int n = 26123;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48024(String string) {
        int n = 10275;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 45);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48025(String string) {
        int n = 27749;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 40);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48026(String string) {
        int n = 31879;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 49);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static String Method_48027(DataInputStream dataInputStream) {
        byte[] arrby = new byte[21506 & 16544];
        try {
            int n;
            MessageDigest messageDigest = MessageDigest.getInstance(Class_48006.Method_48037("\u0400\u0408\u0428"));
            while ((n = dataInputStream.read(arrby)) != (-1 & -1)) {
                messageDigest.update(arrby, 16401 & 7008, n);
            }
            String string = new BigInteger(8709 & 1289, messageDigest.digest()).toString(16913 & 4208);
            while (string.length() < (16416 & -31178)) {
                string = Class_48006.Method_48061("\u1082") + string;
            }
            return string;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    private static String Method_48028(String string) {
        int n = 871;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 31);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48029(String string) {
        int n = 20154;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48030(String string) {
        int n = 32285;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 30);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_48031(int n, String string) {
        if (!Field_48013.add((n + Class_48006.Method_48039("\u8180") + string).hashCode())) {
            return;
        }
        Class_48006.Method_48042(n, string);
        Class_47033.Method_47059(new Class_20760(n, string));
    }

    private static String Method_48032(String string) {
        int n = 24694;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public final native void \u0000\u0000\u0000(byte[] var1);

    private static String Method_48033(String string) {
        int n = 2513;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 37);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public final native void \u0000\u0000(int var1, byte[] var2);

    private void Method_48034() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_48006.Method_48026("\u0103\u0109\u0132\u0108\u0122\u012b\u0130\u0123\u0120\u0129\u011a\u012b\u0129\u0121"));
    }

    private static String Method_48035(String string) {
        int n = 238;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 48);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48036(String string) {
        int n = 1362;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48037(String string) {
        int n = 10729;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48038(String string) {
        int n = 9003;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48039(String string) {
        int n = 31594;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 33);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48040(String string) {
        int n = 27039;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48041(String string) {
        int n = 6066;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 41);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_48042(int n, String string) {
        if (n == (8877 & 16427) && string != null && !string.equals(Class_48006.Method_48070("\u0004\u0004")) && !string.equals(Class_48006.Method_48051("\u9380\u9387"))) {
            new Class_30877(new Throwable(Class_48006.Method_48035("\u1400\u1401\u1402\u1401") + string));
        }
    }

    public final native int[] \u0000();

    static {
        Object object;
        MessageDigest messageDigest;
        Object object2;
        Field_48009 = "dupae)YA,Q?8>yhE";
        if (Class_48006.Method_48038("\ua22a").equals(Class_48006.Method_48071("\u0005"))) {
            Field_48009 = Class_48006.Method_48032("\u4820");
            Class_48006.Method_48077();
        }
        try {
            messageDigest = MessageDigest.getInstance(Class_48006.Method_48036("\uc502\uc502\uc542"));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(Class_48006.Method_48017("\u2881\u2895\u2880\u2894\u288c\u2890"));
        }
        try {
            object = Paths.get(((URLClassLoader)Class_18.class.getClassLoader()).getURLs()[8545 & 6154].toURI());
            OpenOption[] arropenOption = new OpenOption[17433 & 899];
            arropenOption[2048 & -14506] = StandardOpenOption.READ;
            object2 = FileChannel.open((Path)object, arropenOption);
            MessageDigest messageDigest2 = MessageDigest.getInstance(Class_48006.Method_48040("\u4119\u4111\u4103"));
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(8752 & 10561);
            while (((FileChannel)object2).read(byteBuffer) != (-1 & -1)) {
                byteBuffer.flip();
                messageDigest2.update(byteBuffer);
                byteBuffer.clear();
            }
            Class_18.Field_89.Field_38 = messageDigest2.digest();
        }
        catch (Throwable throwable) {
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException)throwable;
            }
            throw new RuntimeException(Class_48006.Method_48045("\u0a04\u0a03\u0a0d\u0a1b\u0a07\u0a03\u0a0d\u0a1b\u0a18\u0a0c\u0a05"), throwable);
        }
        messageDigest.update(Class_18.Field_89.Field_38);
        messageDigest.update(Class_18.class.getProtectionDomain().getCodeSource().getCertificates()[-16064 & 12856].getPublicKey().getEncoded());
        Field_48007 = messageDigest.digest();
        object = null;
        object2 = null;
        try {
            object = new ObjectInputStream(new InflaterInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(Class_48006.Method_48055("\u8006\u800d\u8002\u8001\u800a\u8007\u8002\u8001\u800e\u8009\u8002\u8003\u800a\u8009\u800a\u8009\u8000\u8001\u800a\u8001\u8000\u8009\u8004\u8003\u800e\u8009\u800a\u8005\u8008\u800d\u8008\u8009\u8008\u8009\u8006\u8003\u800e\u800b\u800a\u8003\u8002\u8005\u8002\u800b\u8004\u8003\u800a\u800f\u8000\u8007\u800a\u8005\u800e\u8009\u8004\u8005\u8000\u800f\u8008\u800d\u8000\u800f\u800a\u8001\u8046\u8045\u804e\u804f\u804e\u8041\u8048\u804f\u804c\u8043\u8048\u8043\u804a\u8047\u8048\u804b\u8040\u804b\u804e\u8049\u8042\u8045\u8044\u8047\u8048\u804f\u8044\u8043\u8042\u8043\u8040\u804f\u804c\u804b\u804c\u804b\u8046\u804d\u804c\u8041\u8042\u804b\u8044\u8049\u804e\u804b\u8044\u8043\u804e\u8049\u8048\u8047\u8044\u8041\u8048\u804b\u804a\u804d\u8040\u8047\u8048\u8043\u8044\u8047\u8080\u808b\u808c\u8083\u8084\u8081\u808a\u808b\u808c\u808d\u8082\u8081\u8080\u808d\u808e\u8089\u8080\u808b\u808a\u8089\u808a\u8081\u8082\u808b\u8082\u808f\u8082\u808f\u808c\u808d\u808e\u8081\u8082\u8087\u8082\u8083\u8084\u808b\u8080\u8087\u8086\u808f\u808a\u8083\u8088\u808f\u808e\u808d\u8084\u808d\u8086\u808f\u8084\u8083\u808c\u8089\u8084\u808b\u8088\u8089\u8088\u8083\u808c\u808f\u80c8\u80c5\u80c2\u80c5\u80ca\u80c5\u80ca\u80c5\u80c8\u80c1\u80c2\u80cb\u80cc\u80c3\u80c0\u80cd\u80c8\u80c3\u80cc\u80c7\u80cc\u80c9\u80c4\u80c7\u80c4\u80c5\u80c0\u80c9\u80cc\u80cd\u80c2\u80c7\u80c8\u80cb\u80ca\u80c1\u80c6\u80cf\u80ca\u80cd\u80c0\u80cb\u80cc\u80c7\u80ca\u80c3\u80ce\u80cf\u80c2\u80cb\u80c8\u80c5\u80c0\u80cd\u80c0\u80c9\u80c2\u80cd\u80ce\u80c9\u80c2\u80c5\u80c8\u80c9\u8100\u8107\u810a\u8107\u810c\u8105\u810a\u810b\u8102\u8107\u8102\u810d\u810a\u8105\u810a\u810d\u8104\u8107\u8100\u8103\u810a\u8101\u8104\u8105\u8104\u8101\u810e\u810d\u8104\u8103\u810c\u810d\u8108\u8107\u8100\u810b\u8106\u8105\u8100\u8101\u810c\u810d\u8100\u8109\u8102\u810f\u8102\u810f\u8102\u8103\u8108\u8107\u810a\u810f\u8100\u8101\u8100\u8103\u810c\u8109\u810a\u8107\u810a\u8109\u8140\u814b\u814e\u8145\u8140\u8147\u8144\u814d\u8140\u8149\u814e\u8149\u8142\u814d\u814c\u8149\u814a\u8141\u8140\u8147\u8148\u814d\u8140\u8143\u814e\u814f\u814e\u8141\u8140\u8143\u814e\u8141\u8144\u8141\u814a\u814b\u8140\u8143\u8144\u8149\u8146\u814d\u814c\u8149\u814c\u8149\u8144\u8145\u8144\u8147\u8146\u8141\u8148\u8141\u814e\u8141\u814e\u8143\u8142\u8141\u814e\u814b\u8146\u814f\u8186\u8185\u818e\u8187\u8184\u8189\u8184\u818d\u8182\u8187\u818e\u8187\u8184\u818f\u8182\u8187\u8188\u8187\u8184\u8189\u818c\u818d\u8184\u8187\u818a\u8189\u8182\u8187\u818e\u8185\u8180\u8181\u8180\u8185\u8180\u8189\u8186\u8189\u818a\u8183\u818a\u8189\u8188\u8185\u8188\u818f\u818c\u8189\u8186\u8181\u8188\u8181\u8180\u818f\u818e\u818b\u818c\u818b\u8182\u8185\u818c\u818b\u8182\u8183\u81cc\u81c7\u81c8\u81c3\u81c2\u81c7\u81c4\u81cf\u81ce\u81cb\u81c4\u81cf\u81ce\u81cb\u81cc\u81c3\u81ca\u81cd\u81c6\u81cd\u81ca\u81c3\u81c6\u81c7\u81c8\u81c3\u81ce\u81cd\u81c2\u81c3\u81ce\u81cf\u81c6\u81c7\u81c8\u81c3\u81c8\u81c9\u81c8\u81c9\u81ca\u81c5\u81cc\u81c1\u81cc\u81cf\u81c8\u81c5\u81ce\u81c1\u81c4\u81c7\u81c2\u81cd\u81c2\u81c5\u81c6\u81c9\u81ce\u81cd\u81ca\u81cf\u81cc\u81c9\u8004\u8001\u8000\u800f\u8004\u8009\u8002\u8001\u8000\u8009\u800e\u8003\u8002\u800b\u8004\u800d\u8002\u8003\u8006\u8003\u8008\u8007\u800a\u800b\u800e\u8009\u8008\u800b\u8006\u8005\u800c\u8003\u8004\u8009\u8008\u8005\u8006\u8009\u800a\u8005\u8004\u800b\u8006\u800d\u800e\u8009\u8008\u800d\u8006\u800b\u8006\u800b\u8000\u800b\u800c\u8001\u8004\u8005\u8004\u8003\u800e\u800f\u8008\u8001\u8040\u8047\u8046\u804b\u804a\u804d\u8046\u8041\u804a\u804f\u8042\u8049\u804e\u8045\u8048\u8043\u8042\u804b\u804a\u804b\u8048\u8045\u8040\u8041\u8048\u8043\u804a\u804d\u8040\u804f\u8042\u8043\u804e\u8049\u804a\u8045\u804e\u8049\u8040\u8045\u8048\u804f\u8042\u8041\u804c\u8047\u8040\u804d\u8044\u8047\u8044\u804b\u804a\u804d\u8046\u8041\u8048\u804d\u804a\u8041\u804a\u8043\u804e\u804b\u808e\u8085\u808a\u808f\u8084\u8083\u8088\u8083\u808c\u8081\u8088\u8083\u808a\u808f\u808e\u808b\u8084\u8087\u8082\u808f\u808e\u8083\u808e\u808f\u808e\u8089\u808a\u808b\u808e\u8089\u8088\u808d\u8086\u8081\u8080\u8083\u808a\u8087\u8082\u808d\u8080\u808b\u8086\u8087")))));
            object2 = (PublicKey)((ObjectInputStream)object).readObject();
        }
        catch (Throwable throwable) {
            new Class_30877(throwable);
        }
        if (object != null) {
            try {
                ((ObjectInputStream)object).close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        Field_48008 = object2;
        Field_48010 = Field_48008.getEncoded();
        Class_48006.Method_48075();
        Field_48012 = 11560 & 530;
        Field_48011 = -28415 & 16416;
        Field_48013 = new HashSet<E>();
    }

    public final native void \u0000(Class_20165 var1, byte[] var2);

    private static String Method_48043(String string) {
        int n = 19452;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_48006() {
    }

    public static String Method_48044() {
        Class<Object> class_ = Object.class;
        URL uRL = class_.getResource((char)(4655 & -23505) + class_.getName().replace((char)(6191 & 17022), (char)(17455 & -24145)) + Class_48006.Method_48066("\u5520\u5568\u5562\u556a\u556c\u556c"));
        JarURLConnection jarURLConnection = (JarURLConnection)uRL.openConnection();
        JarFile jarFile = jarURLConnection.getJarFile();
        Enumeration<JarEntry> enumeration = jarFile.entries();
        long l = Long.MAX_VALUE & Long.MAX_VALUE;
        long l2 = -9223372036517898192L & -1731358998233341114L;
        while (enumeration.hasMoreElements()) {
            JarEntry jarEntry = enumeration.nextElement();
            long l3 = jarEntry.getTime();
            if (l3 == (-1L & -1L)) {
                return jarEntry.getName() + Class_48006.Method_48019("\u0200\u0200\u0202");
            }
            l = Math.min(l3, l);
            l2 = Math.max(l3, l2);
            FileTime fileTime = jarEntry.getLastModifiedTime();
            if (fileTime == null) {
                return jarEntry.getName() + Class_48006.Method_48043("\uf100\uf100\uf112");
            }
            long l4 = fileTime.toMillis();
            if (l4 - l3 != (-6366521956144462685L & 1073819912L)) {
                return jarEntry.getName() + Class_48006.Method_48067("\u0800\u0800\u0809\u0801") + l4 + Class_48006.Method_48072("\u300c\u3006") + l3 + Class_48006.Method_48052("\u2003\u2000\u2006\u2003\u2000\u2005\u2004\u2006") + Base64.getEncoder().encodeToString(IOUtils.toByteArray((InputStream)jarFile.getInputStream(jarEntry)));
            }
            if (l2 - l <= (-714235151301028208L & 714235150587238307L)) continue;
            return jarEntry.getName() + Class_48006.Method_48057("\u0188") + l3 + Class_48006.Method_48030("\u4020\u4020") + l + Class_48006.Method_48028("\u5242\u5250") + l2 + Class_48006.Method_48078("\u8818\u8802\u8841\u8841\u8857\u8847\u881f\u8804") + Base64.getEncoder().encodeToString(IOUtils.toByteArray((InputStream)jarFile.getInputStream(jarEntry)));
        }
        jarFile.close();
        return null;
    }

    private static String Method_48045(String string) {
        int n = 8390;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48046(String string) {
        int n = 31096;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 35);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48047(String string) {
        int n = 3476;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48048(String string) {
        int n = 2180;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_48049(byte[] arrby) {
        Class_47033.Method_47059(new Class_20741(arrby));
    }

    private static void Method_48050() {
        Object object;
        String string = ManagementFactory.getRuntimeMXBean().getBootClassPath();
        String[] arrstring = string.split(File.pathSeparator);
        ArrayList arrayList = Lists.newArrayList();
        Object object2 = arrstring;
        int n = ((String[])object2).length;
        for (int i = 2375 & 128; i < n; ++i) {
            object = object2[i];
            arrayList.add(object);
        }
        object2 = new ArrayList<E>();
        for (String string2 : arrayList) {
            object = new File(string2);
            if (!((File)object).exists()) continue;
            byte[] arrby = ((File)object).getName().getBytes(StandardCharsets.UTF_8);
            try {
                FileInputStream fileInputStream = new FileInputStream((File)object);
                byte[] arrby2 = Class_48006.Method_48021(new DataInputStream(fileInputStream));
                String string3 = new BigInteger(23713 & -31995, arrby2).toString(-13135 & 4378);
                while (string3.length() < (-31199 & 160)) {
                    string3 = Class_48006.Method_48018("\ua0e5") + string3;
                }
                byte[][] arrarrby = new byte[18634 & 774][];
                arrarrby[-7400 & 4101] = arrby;
                arrarrby[6167 & 16649] = arrby2;
                ((ArrayList)object2).add(arrarrby);
            }
            catch (FileNotFoundException fileNotFoundException) {
                byte[][] arrarrby = new byte[8203 & 4502][];
                arrarrby[256 & -23968] = arrby;
                arrarrby[1223 & -6143] = Class_48006.Method_48033("\u0e15\u0e14\u0e17\u0e16\u0e15\u0e14\u0e17\u0e16\u0e1d\u0e1c\u0e1f\u0e1e\u0e1d\u0e1c\u0e1f\u0e1e").getBytes();
                ((ArrayList)object2).add(arrarrby);
            }
        }
        Class_2263.Field_2264 = object2;
    }

    private static String Method_48051(String string) {
        int n = 32685;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 47);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48052(String string) {
        int n = 188;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48053(String string) {
        int n = 27508;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 38);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48054(String string) {
        int n = 29137;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48055(String string) {
        int n = 2712;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48056(String string) {
        int n = 28433;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 42);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public final native void \u0000\u0000(Class_20165 var1, byte[] var2);

    private static String Method_48057(String string) {
        int n = 14347;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48058(String string) {
        int n = 26430;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 39);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48059(String string) {
        int n = 3487;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public final native boolean \u0000(double var1);

    private static String Method_48060(String string) {
        int n = 13229;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48061(String string) {
        int n = 20060;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48062(String string) {
        int n = 30759;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_48063() {
        try {
            String string = Class_48006.Method_48044();
            if (string != null) {
                Class_47033.Method_47059(new Class_20760(Class_2205.Field_2229, string));
                new Class_30877(new Throwable(Class_48006.Method_48016("\u2724\u2730\u2726")));
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static String Method_48064(String string) {
        int n = 9670;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48065(String string) {
        int n = 17934;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public final native void \u0000(int var1, byte[] var2);

    private static String Method_48066(String string) {
        int n = 18146;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48067(String string) {
        int n = 7673;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public final native int \u0000(long var1, int var3);

    public long Method_48068() {
        return Sys.getTime() * (546770921L & 62524963517137916L) / Sys.getTimerResolution();
    }

    private static String Method_48069(String string) {
        int n = 28256;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 44);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48070(String string) {
        int n = 28468;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 46);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public final native boolean \u0000();

    private static String Method_48071(String string) {
        int n = 14764;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48072(String string) {
        int n = 13933;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_48073(String string) {
        int n = 4015;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public final native void \u0000(byte[] var1);

    public static String Method_48074(byte[] arrby) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Class_48006.Method_48053("\u025a\u0252\u0202"));
            messageDigest.update(arrby, 16520 & -19360, arrby.length);
            String string = new BigInteger(2147 & 5529, messageDigest.digest()).toString(4884 & 24);
            while (string.length() < (-30112 & 1329)) {
                string = Class_48006.Method_48058("\u3310") + string;
            }
            return string;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public static boolean Method_48075() {
        String[] arrstring = System.getProperty(Class_48006.Method_48023("\u6041\u6042\u6041\u6042\u6001\u6040\u6043\u6042\u6040\u6040\u6001\u6043\u6042\u6043\u6043")).split(File.pathSeparator);
        URL[] arruRL = ((URLClassLoader)Class_18.class.getClassLoader().getParent()).getURLs();
        URL uRL = Class_18.class.getProtectionDomain().getCodeSource().getLocation();
        int n = 18209 & 2114;
        URL[] arruRL2 = arruRL;
        int n2 = arruRL2.length;
        for (int i = 9440 & -32251; i < n2; ++i) {
            URL uRL2 = arruRL2[i];
            if (!uRL2.equals(uRL)) continue;
            n = -31469 & 2113;
            break;
        }
        String string = Class_48006.Method_48054("\u0148\u0101\u010a\u014b\u014a\u014b\u0148\u010b\u0140\u0109\u0102\u0141\u0108\u0141\u0102\u0103\u0118\u011b\u0158\u011b\u0158\u0119\u0110\u0119\u0150\u0153\u0150\u0153\u0112\u0151\u0150\u0119\u0102\u0109\u0108\u014b\u0100\u010b\u010a\u014b\u0102\u0141\u0140\u0103\u0100\u0103\u0100\u0141\u0118\u011b\u015a\u015b\u0118\u015b\u0118\u015b\u0150\u0151\u0150\u0151\u0110\u0111\u0112\u0113\u0140\u0143\u0148\u014b\u0148\u0109\u0108\u0149\u0142\u0103\u0148\u0143\u0102\u0143\u0148\u0143\u011a\u015b\u0118\u015b\u0158\u0151\u0158\u011b\u0150\u0113\u0152\u0153\u0112\u0153\u0150\u0111\u0148\u0141\u0142\u0141\u010a\u0149\u014a\u010b\u0142\u0149\u0140\u0103\u0142\u0149\u0100\u0101\u0150\u015b\u0118\u0119\u0158\u0159\u0118\u015b\u0158\u0151\u0112\u0151\u0152\u0151\u0152\u0151\u010a\u010b\u0108\u0103\u0148\u0101\u010a\u010b\u0140\u0103\u0100\u0143\u0142\u0103\u0142\u0101\u0158\u011b\u0110\u011b\u011a\u0119\u011a\u011b\u0112\u0151\u0152\u0151\u0112\u0111\u0110\u0113\u0148\u014b\u014a\u0101\u0102\u0101\u0100\u014b\u0142\u0103\u0100\u0103\u0102\u0143\u0142\u0141\u0110\u0111\u0158\u011b\u0118\u015b\u011a\u015b\u0112\u0153\u0150\u0153\u0152\u0153\u0112\u0113\u0148\u0149\u014a\u010b\u0148\u0143\u0140\u014b\u0100\u0103\u0140\u0101\u0100\u0103\u0102\u0141\u011a\u0159\u015a\u015b\u0150\u015b\u0118\u0119\u0150\u0153\u0110\u0151\u0150\u0113\u0150\u0159\u014a\u0109\u0148\u014b\u0148\u010b\u0142\u0109\u0100\u0143\u0100\u0143\u0140\u0101\u0102\u0101\u0158\u0119\u015a\u0159\u011a\u015b\u0118\u015b\u0150\u0151\u0152\u0113\u0110\u0111\u0112\u0159J\u0001\b\u000b\nK\b\u0003@\u0003@\u0001@C\bCZ\u001b\u0010\u0011X\u0019\u0018[\u0012S\u0010SR\u0011P\u0013JIJK\u0000I\bK\n\tBC\u0000A\u0000A\u0018\u0019\u001a\u0011\u001a\u0019\u0018[\u0018SP\u0013\u0018\u0013\u0010\u0011\nI\nKH\u000b\b\u000bBK\u0000\u0001\u0002ABA\u0018\u001b\u001a[\u001a[\u001aY\u0012S\u0010\u0011PQ\u0010SJKH\tHIHK\u0002IJABCB\u0003\u0018YP[Z\u001b\u001aY\u0010\u0013RQ\u0010S\u0010\u0013\n\u000b\n\tJ\u000b\b\t\u0000\u0001\u0000\u000b\u0000A\u0002\u0003\u001aY\u001aYZ\u0019\u001a\u001b\u0018S\u0010Q\u0012\u0013P\u0011\b\tH\u0001H\t\u0000\t\bA\u0000C\nC\u0002A\u0010\u001bZ\u001bX[\u0010\u0019\u0018\u0013P\u0011RQP\u0019J\tJ\tJIJK@C@ABKBAZ\u001bXY\u001aQ\u0018[\u0012QPSP\u0011\u0010QHK\nIH\tH\u000b\u0002C@\u0001@\u0003JIZ[ZY\u001a\u0019\u001a[\u0010SPSRS\u0012Q\u0148\u0109\u0108\u010b\u0108\u014b\u010a\u0149\u0102\u0141\u0100\u0143\u0102\u0109\u0140\u010b\u011a\u0159\u0110\u0159\u011a\u0159\u011a\u015b\u0110\u0113\u0112\u0153\u0150\u0153\u0112\u0111\u0100\u0101\u0108\u0109\u010a\u0109\u010a\u0101\u0100\u0141\u0102\u0101\u0102\u0103\u0140\u0103\u0112\u0159\u015a\u0119\u0158\u015b\u0118\u015b\u0110\u0113\u0150\u0151\u0152\u0153\u0118\u0119\u0148\u0149\u010a\u010b\u0108\u0109\u0140\u010b\u0102\u0103\u0142\u0101\u0102\u0143\u0140\u0143\u0158\u0153\u015a\u011b\u0158\u0159\u011a\u011b\u0152\u0113\u0110\u0153\u0110\u0113\u0158\u0113\u0148\u0149\u010a\u0149\u0108\u014b\u014a\u0109\u0140\u0141\u0100\u0143\u0100\u0103\u0142\u0143\u0158\u0159\u0152\u015b\u0158\u011b\u0158\u0151\u0110\u0153\u0112\u0153\u0110\u0151\u0112\u0151\u0148\u014b\u010a\u010b\u014a\u0149\u010a\u0109\u0100\u0103\u0100\u0101\u0142\u0109\u0142\u0103\u0118\u0111\u0118\u0113\u011a\u015b\u0110\u011b\u0118\u0111\u0110\u0151\u0152\u0111\u0110\u0153\u0108\u0109\u0100\u0149\u0108\u010b\u0108\u014b\u0140\u0141\u0100\u0101\u0142\u0101\u0140\u0109\u015a\u015b\u0110\u011b\u0112\u011b\u0118\u011b\u0110\u0111\u0112\u0111\u0112\u0113\u0110\u0111\u010a\u0141\u0148\u014b\u0140\u0149\u0148\u014b\u0100\u0101\u0148\u0101\u0142\u0101\u0102\u0143\u015a\u0119\u015a\u0159\u0150\u0153\u011a\u011b\u0150\u0153\u0110\u0153\u0152\u0151\u0112\u0153\u0140\u0109\u010a\u0149\u0108\u0109\u014a\u014b\u0142\u0149\u0100\u0141\u0140\u0141\u0140\u0101\u0118\u0159\u015a\u015b\u0158\u015b\u0152\u011b\u0152\u0151\u0158\u0153\u0152\u0113\u0150\u0159\n\u000b\bK\u0000\t\u0000K\u0000C\b\u0003\u0000\u0003\u0002\u0001\u0018\u0019X\u0011\u0010\u0011\u0018\u0013\u0012S\u0010\u0011RS\u0012\u0011\u0000\t\nI\bKHI\u0002\u0003\b\u0003\u0000\u0001\u0002AX\u0011ZYZ[\u001aY\u001a\u0019PS\u0010S\u0018Q\bI\nI\n\tH\t@\u0003HA@AH\u0003Z[Z[XQ\u0018YR[RQRQPYHIJIJK\bK@CHCH\u0001@CP[ZYX[P\u0019RSZQPS\u0010\u0013J\u000bJI\b\u0001\bIB\u0001BC\bA@\u0003\u0010Y\u001a\u0019\u001a\u001bX\u001b\u0018\u0011\u0010\u001b\u0012\u0011PQH\t\b\u0001\u0000\tH\u0001\u0002\u0003B\u0001\u0000C@\u0003X\u0019\u0018\u001bXYZ\u0019PQRS\u001a\u0013\u0012Q\b\u000bH\u000bHAHKBAHC\u0000A@A\u001a[Z[X\u001bZQP\u0013\u0010\u0013R[PQ\n\tH\u000b\n\u000b\nI@\u0003\u0002\u0001\u0002\u0003BCX\u001bZ\u0019\u0018[\u001aYPQP\u0013PSZQ\u010a\u014b\u010a\u0109\u010a\u0109\u0148\u0101\u0142\u0141\u0142\u0103\u0142\u0141\u0140\u0143\u0158\u011b\u015a\u0119\u0110\u0119\u0118\u011b\u0118\u0119\u0110\u0111\u0150\u0111\u0112\u011b\u0148\u0109\u0108\u010b\u0100\u0101\u014a\u0149\u0100\u0101\u0100\u0141\u0100\u0101\u0100\u0101\u0158\u0111\u0118\u011b\u0158\u011b\u011a\u0111\u0112\u0111\u0152\u0113\u0110\u0153\u0150\u0151\u0142\u014b\u0148\u0149\u014a\u0149\u010a\u014b\u0100\u0141\u0100\u0101\u0142\u0149\u0100\u0149\u0118\u0151\u0158\u0159\u0158\u0119\u011a\u0159\u0150\u0159\u0110\u0111\u0112\u0113\u0158\u0111\u0108\u0143\u0108\u0109\u014a\u0141\u0148\u014b\u0100\u0143\u0140\u0141\u0142\u0103\u0140\u0101\u015a\u0159\u015a\u0119\u015a\u011b\u0118\u015b\u0110\u0151\u0152\u0153\u0110\u0111\u0152\u0111\u0148\u0149\u0102\u010b\u0148\u0109\u0100\u010b\u0140\u0101\u0108\u0141\u0140\u0103\u0142\u0101\u015a\u0159\u015a\u0119\u0110\u015b\u011a\u0119\u0150\u0113\u0118\u0111\u0152\u0151\u0118\u0151\u0100\u014b\u010a\u0103\u0148\u0109\u0148\u0149\u0142\u0141\u0142\u0143\u0102\u0103\u0142\u0143\u0118\u0119\u0110\u015b\u015a\u0111\u015a\u015b\u0152\u0113\u0110\u0111\u0112\u0111\u0118\u0153\u014a\u0141\u0148\u014b\u0142\u0149\u014a\u014b\u0100\u0101\u0102\u0149\u0148\u0101\u0148\u0103\u011a\u015b\u0118\u015b\u0150\u0159\u0158\u0159\u0150\u0111\u0112\u0153\u0158\u0151\u0150\u0111\u014a\u014b\u010a\u0149\u0148\u0143\u0108\u0141\u0142\u0149\u0142\u0149\u0140\u0101\u0102\u0141\u0118\u0119\u0150\u0151\u0158\u0159\u011a\u0159\u0110\u0111\u0150\u0113\u0112\u0113\u0112\u0151HIJ\u000b\u0000\u000b\u0002KB\u0003\u0000AB\u0001B\u0003ZY\u001a\u001b\u001a\u0019\u0018\u0019\u0010\u0011RQP\u0019R\u0011H\tJ\u000bHK\b\u0003@C\bA@\t\u0002C\u001a\u0019Z\u001b\u001a\u0019\u001a\u001b\u0018SP\u0011\u0012\u0013\u0010\u0011HKHIJI\nKJAB\u0001@ABCX\u0019\u0018QX[Z[\u0010YP\u0011\u0012Q\u0012S\bKJ\u000bJ\t@A\u0002K\u0002A\u0000CB\u0001ZQX\u001bXYZ\u001bRQ\u0012S\u0012\u0011RQ\nI\u0000\u000b\u0000\tJ\tB\u0001\n\u0001\u0000A@\tZ\u0019X\u001b\u001a[\u0010[\u0010\u0013\u0010Q\u0018\u0013PSH\u0001\u0000\u000bH\u000bH\tB\u0003\u0000\u000b\u0002\t\u0000\u0001\u0018\u001b\u0010\u0011\u0018[ZYRQR\u0013\u0018S\u0010\u0019\b\u000b\bI\bIJIBCHAJ\u0003\u0002\u0003X\u001bPQX[\u001aY\u0010QRS\u0010Q\u0012Y\nKJ\u000b\bKJK\u0000\u0003BC@K@\u0003\u0018\u0019\u0018Y\u001a\u0019\u001a[P\u0013PSRS\u0010\u0011\u010a\u0101\u0108\u014b\u014a\u0109\u014a\u010b\u0102\u0103\u0140\u0101\u0142\u0143\u010a\u0141\u011a\u0119\u015a\u015b\u0118\u0111\u0118\u011b\u0150\u0113\u0150\u0119\u0150\u0111\u0118\u0113\u010a\u0109\u0108\u0101\u014a\u0149\u0108\u0109\u0108\u0143\u0100\u0103\u0142\u0109\u0100\u0101\u015a\u0111\u0110\u011b\u0158\u011b\u0158\u015b\u0110\u0151\u0150\u0113\u0110\u0151\u0118\u0113\u0148\u014b\u0148\u014b\u0148\u0149\u0140\u0149\u0102\u0149\u0140\u0101\u0142\u0143\u0140\u0141\u015a\u011b\u0158\u0119\u0150\u0159\u0158\u0151\u0112\u0153\u0158\u0151\u0110\u0111\u0150\u0151\u010a\u0109\u0140\u014b\u010a\u0141\u0148\u0149\u0140\u0141\u0100\u0101\u0100\u0141\u0140\u0103\u0158\u0159\u0158\u015b\u0118\u015b\u0118\u011b\u0152\u0111\u0150\u0153\u0150\u0153\u0150\u0159\u0148\u0109\u0148\u0101\u0108\u010b\u0108\u0101\u0142\u0141\u0140\u0141\u0140\u0103\u0142\u0101\u011a\u0119\u011a\u0119\u0158\u0119\u0110\u0159\u0112\u0119\u0152\u0111\u0112\u0153\u0118\u0113\u0108\u0109\u010a\u010b\u0100\u010b\u0108\u0109\u0102\u0141\u0108\u0141\u0102\u0103\u0102\u0101\u011a\u011b\u0118\u0111\u011a\u011b\u015a\u0159\u0112\u0153\u0150\u0113\u0112\u0111\u0112\u0151\u010a\u014b\u014a\u0149\u0140\u0109\u0108\u0141\u0102\u0143\u0148\u0141\u0142\u0103\u0142\u0149\u0150\u011b\u0118\u011b\u0150\u0159\u011a\u015b\u0110\u0111\u0112\u0111\u0158\u0113\u0150\u0151\u0108\u014b\u0148\u0109\u0108\u0149\u010a\u0109\u0140\u0101\u0148\u0103\u0140\u0141\u0140\u0143\u0158\u015b\u0150\u011b\u011a\u015b\u0158\u0119\u0152\u0151\u0150\u0159\u0110\u0113\u0110\u0153\u0000\u000b\n\u000b\b\t\b\t\b\u0001BABAB\u0001\u001a\u001bZ[ZY\u001a\u0019R\u0019\u0018\u0019\u0010\u0019RS\n\t\b\t\u0000KJ\u000b@A\u0000\u0003@A\u0002\u0003X\u0019\u0018YX[X\u0019RS\u0012\u0013\u0012\u0011RQ\n\u000b\b\u000b\nI\nKBI\u0002C\u0000CB\u0003X\u001bX[ZYPYR\u0013RQX\u0011P\u0013\n\tJ\tJ\t\bIB\u0001@ABC@\u0001\u0018\u0019ZY\u0018\u001bZQPSPSR\u0011R\u0011\u0000\tJ\u000bH\tJ\u000b@C\u0000A\u0002CBA\u0018\u0019\u001a\u0011\u0010[X\u0019\u0010\u0011P\u0011\u0010\u0011\u0010Q\u0000\t\nI\n\u000b\u0000\u000b\u0000C\u0002\u0001BA@AX\u001b\u0010\u0019\u001aY\u001a\u0019\u0010\u0013R\u0011P\u0013\u0010\u0013\bK\n\tJ\tHKB\u0001\u0000C\u0000\u0001\u0000C\u0018YP[\u0018YP\u0019\u0010S\u0012Q\u0012\u0011\u0012Q@\u000bJI\bK@I\u0002\u0001H\u0001H\u0003B\u0001X\u0019\u0018\u001b\u0018\u001b\u001a[R\u0013\u0012QPY\u0012\u0013\u0100\u014b\u014a\u014b\u010a\u0109\u0108\u010b\u0100\u0109\u0142\u0103\u0108\u0101\u0102\u0101\u011a\u011b\u0158\u0159\u015a\u0111\u0110\u0159\u0118\u0153\u0152\u0113\u0150\u0113\u0118\u0111\u0108\u0109\u0108\u0149\u014a\u010b\u0100\u0109\u0100\u0141\u0102\u0103\u0142\u0101\u0100\u0141\u0110\u011b\u0110\u011b\u0110\u0119\u0158\u015b\u0110\u0151\u0150\u0119\u0118\u0111\u0110\u0153\u0148\u0109\u0108\u0149\u010a\u010b\u010a\u010b\u0140\u0101\u0100\u0103\u0142\u0149\u0142\u0103\u011a\u015b\u0158\u0119\u011a\u0159\u011a\u015b\u0112\u0111\u0152\u0153\u0152\u0151\u0150\u0151\u0148\u0149\u010a\u0109\u0108\u0141\u010a\u0149\u0100\u0141\u0102\u0143\u0100\u0103\u0140\u0101\u011a\u0151\u0118\u0119\u0150\u015b\u011a\u015b\u0150\u0113\u0152\u0153\u0150\u0153\u0152\u0159\u014a\u0149\u0108\u010b\u010a\u0109\u0108\u0109\u0102\u0101\u0100\u0103\u0100\u0143\u0102\u0101\u011a\u0159\u0118\u0119\u011a\u011b\u0118\u0159\u0150\u0119\u0110\u0113\u0112\u0113\u0150\u0119\u0108\u0149\u014a\u0109\u014a\u010b\u0148\u010b\u0102\u0143\u0102\u0141\u0108\u0109\u0142\u0143\u0118\u0159\u011a\u011b\u0158\u011b\u0110\u0119\u0152\u0111\u0110\u0113\u0152\u0113\u0110\u0153\u014a\u010b\u0108\u014b\u0148\u014b\u0108\u0141\u0142\u0149\u0140\u0103\u0140\u0103\u0140\u0141\u0158\u0119\u0118\u0151\u011a\u0159\u0118\u015b\u0152\u0113\u0158\u0113\u0150\u0153\u0150\u0111\u0140\u014b\u0108\u010b\u0108\u0141\u0140\u014b\u0100\u0143\u0100\u0141\u0102\u0143\u0140\u0143\u0150\u0159\u0158\u0159\u015a\u0151\u0150\u0159\u0112\u0113\u0110\u0113\u0110\u0113\u0152\u0159J\t\u0000IJI\bI\u0000\u0003\u0000\u0003\u0002\t\u0000CZ[\u0018[\u0010\u0011\u0018\u001bR\u0011P\u0011\u0012\u0013P\u0011J\u0001J\u000b\nKH\u000b\u0002\u0003@C\u0002\u0003\u0000\u0001ZYXY\u0018[X[\u0012\u0011R\u0011\u0012\u0013\u0012Q\bK@I\n\u000bH\u000bBCB\u0001@\u0003\u0002\u0001P[\u001a\u001b\u001a\u0019Z\u0019XS\u0010Y\u0010SRQJ\tJ\tHAH\t\u0002\u0001\u0002C\u0000\u0001H");
        try {
            URL[] arruRL3 = arruRL;
            int n3 = arruRL3.length;
            for (int i = -30718 & 9400; i < n3; ++i) {
                URL uRL3 = arruRL3[i];
                if (uRL3 == uRL) continue;
                Path path = new File(uRL3.toURI().getPath().replace(Class_48006.Method_48064("\ub020\ub034\ub035"), "")).toPath();
                String string2 = Class_48006.Method_48074(Files.readAllBytes(path));
                int n4 = 2434 & 113;
                if (!string.contains(string2)) {
                    n4 = 17473 & 35;
                }
                if (n4 == 0) continue;
                byte[] arrby = path.toString().getBytes(StandardCharsets.UTF_8);
                byte[] arrby2 = new byte[82 & -12016];
                arrby2[7170 & -15479] = -16305 & 4685;
                arrby2[1913 & -28669] = -1 & -65;
                arrby2[4354 & -16310] = -33 & -97;
                arrby2[515 & 463] = -15285 & 10850;
                arrby2[-22842 & 6188] = -123 & -89;
                arrby2[397 & 517] = 16755 & -32541;
                arrby2[-16025 & 3230] = -3 & -2;
                arrby2[-30073 & 15] = -104 & -120;
                arrby2[1080 & 10569] = -27 & -92;
                arrby2[21001 & 2073] = -47 & -105;
                arrby2[14 & 25578] = 5247 & -32257;
                arrby2[13103 & -31605] = -69 & -71;
                arrby2[-24532 & 6556] = 26738 & 91;
                arrby2[159 & 4109] = -49 & -21;
                arrby2[1294 & -16305] = -14282 & 1974;
                arrby2[271 & 18671] = -115 & -120;
                byte[] arrby3 = arrby2;
                String string3 = Base64.getEncoder().encodeToString(new Class_11109(arrby3).Method_11114(arrby));
                System.out.println(Class_48006.Method_48073("\u1186\u1187\u1186\u1187\u119c") + string2 + Class_48006.Method_48062("\u2109") + string3);
                new Class_30877(new Throwable(Class_48006.Method_48059("\uc010\uc010\uc010\uc010\uc008") + string2 + Class_48006.Method_48029("\u2290") + string3));
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            int n5 = -8063 & 7754;
            new Class_30877(new Throwable(Class_48006.Method_48048("\u2485\u2485\u2485\u2485\u2489")));
            System.exit(4452 & -16247);
        }
        int n6 = -30951 & 133;
        Class_48006.Method_48050();
        return (8869 & 5121) != 0;
    }

    public native int \u0000strictfp(Class var1, int var2);

    private static String Method_48076(String string) {
        int n = 8406;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_48077() {
        if (!Field_48012) {
            Field_48012 = 18453 & 75;
            Class_47033.Method_47059(new Class_20760(Class_2205.Field_2222, Class_48006.Method_48065("*,(& 6&&")));
        }
    }

    private static String Method_48078(String string) {
        int n = 24993;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_48006.class, 32);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

