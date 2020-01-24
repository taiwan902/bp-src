/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;
import sun.security.util.DerValue;
import sun.security.util.ObjectIdentifier;
import sun.security.x509.AVA;
import sun.security.x509.CertificateExtensions;
import sun.security.x509.RDN;
import sun.security.x509.X500Name;
import sun.security.x509.X509CertImpl;
import sun.security.x509.X509CertInfo;

public class Class_21395
extends X509ExtendedKeyManager {
    public X509Certificate[] Field_21396;
    public static HashMap Field_21397 = new HashMap();

    private static String Method_21398(String string) {
        int n = 19796;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_21399(String[] arrstring, Principal[] arrprincipal, Socket socket) {
        return Class_21395.Method_21413("\u2888\u2889\u2888\u2889\u2880");
    }

    private static String Method_21400(String string) {
        int n = 27505;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21401(String string) {
        int n = 15697;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21402(String string) {
        int n = 28163;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_21403(String[] arrstring, Principal[] arrprincipal, SSLEngine sSLEngine) {
        return Class_21395.Method_21415("\u8200\u8210\u8201\u8201\u8205");
    }

    public X509Certificate[] Method_21404(String string) {
        if (string.equals(Class_21395.Method_21421("\u9850\u9840\u9852\u9852\u9854"))) {
            return this.Field_21396;
        }
        return null;
    }

    private static String Method_21405(String string) {
        int n = 18059;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21406(String string) {
        int n = 4660;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public PrivateKey Method_21407(String string) {
        if (string.equals(Class_21395.Method_21398("\u8418\u8408\u841a\u841a\u8410"))) {
            return new Class_23794();
        }
        return null;
    }

    private static String Method_21408(String string) {
        int n = 28641;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21409(String string) {
        int n = 15089;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21410(String string) {
        int n = 16611;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21411(String string) {
        int n = 1076;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21412(String string) {
        int n = 20761;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21413(String string) {
        int n = 17426;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_21395() {
        X509CertImpl x509CertImpl = new X509CertImpl(Base64.getDecoder().decode(Class_21395.Method_21410("\u0000\u0004\u0006\u0002$ \u0002\u0002\u0004 \u0002\"\u0000$\u0002\u0002\u0004 \u0006\u0002\u0004\u0000\u0002\u0006$\u0000\u0006\u0002\u0000$\"\"\u0004\u0004\u0006\"\u0000\u0004\u0002\"$$\u0006\" $\"\u0002 $\u0006\u0002  \"& $&\"$\u0004\"&\u0004$\u0002\u0002\u0004\u0000\u0006\u0006\u0004$\u0002\u0002\u0000\u0000\u0006\u0006\u0000\u0000\"\"\u0000\u0004\u0006\"\u0004\u0000\u0006&\u0000\u0000\u0002\" $&\u0002$ \"& $&&$\u0004\u0002&\u0004 \u0002\u0002 \u0000\"\u0002$\u0000&\"\u0000 \"\u0006\u0084\u0086\u00a2\u0084\u00a4\u0082\u0086\u0084\u0086\u0086\u0084\u00a4\u00a6\u0082\u00a4\u0082\u00a2\u00a0\u0084\u00a6\u00a6\u0084\u00a4\u00a6\u00a6\u0084\u0086\u0086\u00a0\u00a4\u00a6\u00a2\u00a0\u00a6\u00a6\u00a4\u0084\u00a2\u00a2\u00a0\u0084\u0082\u0082\u0082\u0082\u00a0\u00a6\u0086\u00a4\u00a0\u00a2\u0086\u00a4\u00a4\u00a2\u00a2\u0084\u00a0\u0082\u0082\u0086\u0086\u0084\u00a4\u0086\u00a6\u00a2\u00a2\u00a4\u00a0\u00a2\u0086\u0084\u0086\u00a2\u0084\u00a2\u0086\u0084\u0084\u0086\u00a6\u00a0\u00a0\u00a2\u0086\u00a4\u00a4\u00a6\u0086\u00a0\u0084\u00a6\u0086\u00a4\u00a4\u0086\u00a2\u00a0\u00a0\u00a2\u0082\u00a4\u00a4\u00a6\u0082\u00a0\u00a0\u00a2\u0082\u00a4\u00a2\u0082\u0100\u0100\u0122\u0122\u0124\u0120\u0106\u0106\u0100\u0104\u0126\u0102\u0100\u0120\u0106\u0106\u0104\u0124\u0102\u0106\u0104\u0104\u0106\u0122\u0100\u0100\u0106\u0102\u0100\u0124\u0106\u0106\u0124\u0124\u0102\u0122\u0124\u0124\u0102\u0102\u0104\u0100\u0122\u0106\u0100\u0104\u0126\u0106\u0100\u0120\u0122\u0106\u0100\u0100\u0126\u0126\u0120\u0124\u0126\u0122\u0120\u0100\u0126\u0126\u0104\u0124\u0102\u0102\u0104\u0104\u0126\u0126\u0104\u0100\u0102\u0126\u0100\u0104\u0102\u0122\u0104\u0124\u0122\u0126\u0124\u0104\u0106\u0106\u0100\u0104\u0106\u0102\u0100\u0120\u0106\u0106\u0124\u0104\u0122\u0122\u0120\u0104\u0102\u0102\u0100\u0100\u0102\u0102\u0120\u0100\u0126\u0106\u0124\u0120\u0122\u0106\u0124\u0124\u0122\u0122\u0124\u0100\u0122\u0122\u0120\u0120\u0102\u0126\u0184\u01a4\u0186\u01a6\u0180\u0180\u01a2\u01a2\u01a4\u01a0\u01a2\u0182\u01a0\u01a0\u0182\u01a6\u0180\u0184\u0186\u01a2\u0184\u01a4\u0182\u0186\u0180\u0184\u0186\u0182\u0184\u01a4\u01a6\u0182\u0184\u01a0\u01a2\u0182\u0180\u01a4\u0186\u0186\u01a0\u01a0\u01a2\u0186\u0180\u0180\u01a2\u01a2\u01a4\u01a4\u01a6\u0182\u01a4\u01a0\u01a2\u01a2\u01a4\u0180\u01a6\u01a6\u0180\u0184\u0182\u01a6\u0184\u0184\u0182\u0186\u0180\u0180\u0182\u0186\u01a0\u01a0\u0182\u0186\u0180\u0184\u0182\u0182\u0184\u0184\u01a2\u0186\u01a4\u01a4\u0186\u0182\u0184\u0180\u01a6\u01a6\u01a4\u0180\u01a6\u01a2\u01a4\u0180\u0186\u01a2\u01a0\u0184\u0186\u01a2\u0184\u0180\u0186\u01a6\u0184\u0180\u01a6\u0182\u01a4\u01a4\u0186\u01a2\u0180\u0180\u0182\u0182\u01a4\u01a4\u01a6\u0182\u0180\u0180\u01a2\u01a6$$\u0002&$ \"&$ &&$$\u0006\u0002$ &\"\u0004\u0004\u0002&\u0000$\"&$ \u0006\u0002\u0000\u0004\"& \u0004\u0002\"$\u0004&\u0006\u0000\u0000\u0002&\u0004\u0000\u0006&\u0004\u0000\u0002\u0002\u0000 \"&\u0004 \u0006&$\u0004\u0006\u0006\u0004 \u0006\"\u0004\u0004\u0002\u0006 \u0000\u0006\"$\u0000\"&\u0000 &\u0006\u0000\u0000\u0002\"\u0004$\u0006\"\u0004$&\u0006 \u0000\u0002\u0002\u0000\u0000\u0006\" $\"\u0002 \u0004\u0006\"$\u0004\u0002\"\u0004\u0004\u0002\u0006\u0004\u0004\u0006\u0006\u0084\u00a4\u00a2\u00a2\u00a4\u00a0\u00a6\u00a6\u00a0\u0084\u00a2\u00a2\u00a4\u00a2\u00a2\u00a4\u0086\u00a2\u0084\u00a2\u0086\u00a4\u00a0\u00a6\u0082\u00a0\u0084\u00a6\u00a2\u0084\u00a2\u0086\u00a0\u00a4\u00a2\u0082\u00a4\u00a6\u0082\u0084\u00a4\u00a6\u0082\u00a0\u0086\u0082\u0084\u00a2\u00a6\u0084\u0084\u0086\u0082\u0084\u00a0\u0086\u0086\u00a0\u00a4\u00a6\u00a2\u00a0\u0086\u0082\u00a0\u00a6\u0082\u00a0\u00a0\u0086\u00a6\u0084\u00a0\u00a6\u00a2\u00a4\u00a0\u00a6\u00a6\u0084\u00a4\u00a6\u0086\u00a0\u00a4\u0086\u00a6\u0084\u0084\u0082\u00a2\u00a0\u00a0\u0086\u00a6\u00a4\u00a2\u0082\u00a4\u00a2\u00a6\u0084\u00a4\u00a2\u0086\u0084\u00a6\u0082\u0084\u0084\u0086\u0086\u00a0\u0086\u0082\u0104\u0100\u0102\u0122\u0100\u0120\u0122\u0102\u0124\u0120\u0106\u0102\u0120\u0100\u0126\u0126\u0120\u0124\u0106\u0126\u0120\u0120\u0122\u0122\u0120\u0124\u0126\u0126\u0100\u0124\u0122\u0126\u0124\u0120\u0102\u0106\u0124\u0120\u0126\u0122\u0120\u0100\u0126\u0106\u0124\u0124\u0102\u0122\u0124\u0100\u0122\u0126\u0120\u0100\u0126\u0102\u0120\u0124\u0106\u0102\u0120\u0120\u0122\u0126\u0100\u0104\u0126\u0102\u0100\u0100\u0102\u0106\u0100\u0100\u0106\u0126\u0100\u0120\u0122\u0126\u0124\u0104\u0126\u0102\u0120\u0120\u0122\u0126\u0124\u0124\u0126\u0126\u0124\u0100\u0102\u0102\u0120\u0120\u0102\u0126\u0124\u0120\u0102\u0126\u0124\u0124\u0106\u0122\u0120\u0120\u0102\u0102\u0120\u0124\u0122\u0126\u0120\u0104\u0126\u0122\u0124\u0100\u0126\u0126\u0120\u0120\u0122\u0126\u01a0\u0180\u0186\u0182\u01a4\u01a0\u01a6\u0182\u0180\u01a0\u01a6\u01a2\u01a0\u01a4\u01a6\u0182\u01a0\u01a4\u0186\u01a6\u01a0\u01a0\u0182\u01a2\u01a0\u01a4\u01a6\u0182\u01a0\u0180\u01a2\u0186\u0180\u0180\u01a2\u0182\u0180\u01a4\u0186\u0182\u01a4\u0184\u0182\u0182\u0180\u0180\u01a2\u0182\u0184\u01a4\u0186\u01a2\u01a4\u0180\u01a2\u0186\u0184\u0184\u01a6\u0186\u01a0\u0184\u0182\u0186\u01a4\u01a4\u0182\u01a6\u0184\u01a0\u0186\u01a2\u01a0\u0180\u01a6\u0186\u0184\u01a0\u01a2\u01a6\u01a0\u01a4\u01a6\u0182\u01a0\u01a4\u01a2\u0186\u01a0\u0180\u0182\u01a6\u01a4\u0184\u0182\u01a6\u0184\u01a4\u01a2\u01a6\u0180\u01a0\u01a6\u01a2\u01a0\u01a0\u01a6\u01a6\u0180\u01a4\u0182\u01a6\u0180\u0180\u0186\u01a6\u0184\u0180\u01a6\u0186\u0184\u0184\u01a6\u0182\u0180\u0184\u01a2\u01a6\u0004\u0000\"\"\u0004$&\"$ &&\u0000\u0000&\u0002$$\"& \u0000\u0006&\u0004\u0000\u0006\u0006\u0000\u0004\u0006\u0002\u0000\u0000\u0006\u0006\u0004\u0004\u0002\"  \"&\u0000$\u0006\"\u0000\u0000\"&\u0000\u0004\u0002\u0006$\u0004\u0002\u0006 $\"\"$ \"\u0002 $&\" \u0000\u0006\u0006 $&&$\u0000\u0006\u0006 $\u0002\"\u0000$&\"\u0004$\u0002& \u0004\u0002\u0006\u0004 \"\u0006$\u0004\u0006\u0002\u0000\u0000\u0006\u0006  \u0006\u0002\u0000\u0004\u0002&$$\u0006\"\u0000\u0000\u0006\u0006\u00a0\u00a6\u0082\u00a0\u00a4\u0086\u00a6\u0084\u0084\u00a2\u00a6\u00a4\u00a0\u0086\u00a2\u00a4\u00a0\u00a2\u0086\u00a0\u0084\u00a2\u0082\u00a4\u0086\u0082\u00a0\u0084\u0082\u0082\u0084\u00a2\u00a6\u0084\u0086\u00a2\u00a0\u00a4\u0086\u0082\u00a4\u0084\u0082\u0086\u00a4\u0084\u00a2\u0082\u0084\u0082\u0082\u00a4\u0086\u0086\u0084\u0084\u0082\u00a6\u00a0\u0086\u0086\u00a0\u0082\u0082\u00a0\u0084\u00a6\u00a2\u0084\u00a0\u0086\u0082\u00a0\u00a2\u0086")));
        X509CertInfo x509CertInfo = (X509CertInfo)x509CertImpl.get(Class_21395.Method_21406("\u0a00\u0a01\u0a02\u0a03\u0a06\u0a05\u0a04\u0a05\u0a02"));
        CertificateExtensions certificateExtensions = (CertificateExtensions)x509CertInfo.get(Class_21395.Method_21401("\u9897\u9882\u9884\u9895\u9894\u9881\u9891\u9897\u9894\u9881"));
        x509CertInfo.set(Class_21395.Method_21408("\u0200\u0210\u0213\u0203\u0205\u0215\u0206\u0207\u0209\u0219"), certificateExtensions);
        X500Name x500Name = (X500Name)x509CertInfo.get(Class_21395.Method_21412("\u241a\u241d\u2409\u2400\u240c\u240b\u241f"));
        ArrayList<RDN> arrayList = new ArrayList<RDN>(x500Name.rdns());
        Field_21397.put(8256 & -32238, Class_18.Field_89 != null ? Class_18.Field_89.Method_265().Method_2116() : Class_21395.Method_21402("\u0802\u081e\u0810\u0808\u0812\u0804\u080c\u080c\u080a"));
        Field_21397.put(16547 & 14337, Class_18.Field_89 != null ? Class_48006.Field_48009 : Class_21395.Method_21409("\u200a\u200b\u200a\u200b\u200a\u200b\u2002\u2003\u2008\u2009\u2008\u2009\u2008\u2009\u2008"));
        Field_21397.put(-28661 & 27654, Long.toString(System.currentTimeMillis()));
        Field_21397.put(3 & 2823, Long.toString(System.nanoTime()));
        Field_21397.put(20724 & 9222, Class_21395.Method_21405("\u0012\u0010"));
        Field_21397.put(4661 & -8179, Class_21395.Method_21411("\u84d1\u84d3\u84d0\u84d3"));
        for (Map.Entry object2 : Field_21397.entrySet()) {
            int[] arrn = new int[25671 & -27859];
            arrn[7684 & 16433] = 4849 & 16385;
            arrn[8521 & 16421] = 9222 & 2178;
            arrn[9547 & -32718] = -28597 & 3;
            arrn[16395 & 6259] = -31761 & 18423;
            arrn[10246 & 16916] = (Integer)object2.getKey();
            arrayList.add(new RDN(new AVA(ObjectIdentifier.newInternal(arrn), new DerValue((String)object2.getValue()))));
        }
        RDN[] arrrDN = arrayList.toArray(new RDN[512 & 1076]);
        x509CertInfo.set(Class_21395.Method_21414("yzjcol|"), new X500Name(arrrDN));
        X509CertImpl x509CertImpl2 = new X509CertImpl(x509CertInfo);
        x509CertImpl2.sign(new Class_23794(), x509CertImpl.getSigAlgName());
        X509CertImpl x509CertImpl3 = new X509CertImpl(x509CertImpl2.getEncoded());
        x509CertImpl3.verify(x509CertImpl.getPublicKey());
        X509Certificate[] arrx509Certificate = new X509Certificate[1025 & 31075];
        arrx509Certificate[20993 & 9580] = x509CertImpl3;
        this.Field_21396 = arrx509Certificate;
    }

    private static String Method_21414(String string) {
        int n = 26938;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21415(String string) {
        int n = 2810;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String[] Method_21416(String string, Principal[] arrprincipal) {
        return null;
    }

    private void Method_21417() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_21395.Method_21419("\uc820\uc82d\uc810\uc82d\uc800\uc80d\uc814\uc805\uc800\uc809\uc83c\uc80d\uc80c\uc805"));
    }

    public String[] Method_21418(String string, Principal[] arrprincipal) {
        String[] arrstring = new String[16417 & 519];
        arrstring[17632 & 14849] = Class_21395.Method_21400("0\"020");
        return arrstring;
    }

    private static String Method_21419(String string) {
        int n = 32326;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_21420(String string, Principal[] arrprincipal, SSLEngine sSLEngine) {
        return null;
    }

    private static String Method_21421(String string) {
        int n = 32103;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21395.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_21422(String string, Principal[] arrprincipal, Socket socket) {
        return null;
    }
}

