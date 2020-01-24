/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;

public class Class_16183 {
    private static final SSLContext Field_16184;

    private static String Method_16185(String string) {
        int n = 28801;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16183.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        try {
            Field_16184 = SSLContext.getInstance(Class_16183.Method_16187("\u40c0\u40c8\u40c1"));
            KeyManager[] arrkeyManager = new KeyManager[1025 & -32439];
            arrkeyManager[22660 & -32759] = new Class_21395();
            TrustManager[] arrtrustManager = new TrustManager[16453 & 6155];
            arrtrustManager[337 & 16520] = new Class_13653();
            Field_16184.init(arrkeyManager, arrtrustManager, new SecureRandom());
        }
        catch (Throwable throwable) {
            throw new RuntimeException();
        }
    }

    private static String Method_16186(String string) {
        int n = 25969;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16183.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16187(String string) {
        int n = 2109;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16183.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_16188() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_16183.Method_16186("\u8490\u8491\u8480\u8491\u8490\u8491\u8480\u8491\u8498\u8499\u8488\u8499\u8498\u8499"));
    }

    public static SSLEngine Method_16189() {
        SSLEngine sSLEngine = Field_16184.createSSLEngine(Class_16183.Method_16185("\ua030\ua036\ua030\ua022\ua036\ua030\ua032\ua024\ua032\ua030\ua032\ua036\ua026\ua032"), 12347 & 15417);
        sSLEngine.setUseClientMode((-23487 & 4229) != 0);
        sSLEngine.setNeedClientAuth((17649 & 12299) != 0);
        sSLEngine.setEnabledCipherSuites(sSLEngine.getSupportedCipherSuites());
        sSLEngine.beginHandshake();
        return sSLEngine;
    }
}

