/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Base64;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;

public class Class_13653
extends X509ExtendedTrustManager {
    private static final byte[] Field_13654 = Base64.getDecoder().decode(Class_13653.Method_13659("\u0005\u0000\u0001\u0001\u0005\u0005\u0005\u0001\u0000\u0004\u0001\u0010\u0004\u0004\u0005\u0000A\u0004@\u0011\u0015\u0004\u0011\u0011\u0011\u0010\u0015\u0010\u0015\u0004D\u0014\u0005\u0000\u0001\u0001\u0005\u0000\u0005\u0004\u0001\u0010\u0005\u0000\u0001Q\u0015@\u0000\u0014\u0014\u0015\u0004\u0001\u0005\u0005\u0005\u0014\u0000\u0010\u0014\u0000E\u0010\u0005D\u0015EA\u0004\u0001DEEA\u0011AUED\u0000@UAQU\u0005PAAAPDEUTA\u0010P@DUTD@@DDPQ@EUAA@EQPTPQPEDEUT\u00d0\u0081\u00c5\u0084\u0091\u0091\u0085\u00d1\u00d4\u0085\u0081\u0091\u0084\u00c0\u0084\u00c0\u0084\u0094\u0090\u0090\u00c4\u0084\u00c5\u0090\u0081\u0081\u0085\u0081\u0081\u0095\u0094\u0091\u0091\u0091\u0090\u0084\u0094\u0095\u0090\u00d0\u00d4\u0090\u0081\u0094\u0095\u0091\u0094\u00c5\u00c1\u0084\u00c5\u0090\u0090\u0091\u0084\u0085\u0091\u0095\u0094\u00d0\u00c1\u00d1\u00d1\u00c5\u00d4\u0081\u0091\u00d0\u0095\u00c1\u0094\u00d4\u00c0\u00c1\u00d5\u0085\u00c1\u00c5\u00d5\u00d4\u0091\u00d1\u00d1\u00d5\u00c4\u00d1\u00c0\u00c5\u00c1\u00c0\u00c4\u0094\u00c5\u00d5\u00d0\u00c4\u00c0\u00d0\u0095\u0090\u00c0\u0095\u00c5\u00d5\u00d4\u00d5\u00c0\u00d5\u00c4\u00c0\u00d4\u00d5\u00c0\u00d0\u00d1\u0095\u00d1\u0110\u0110\u0111\u0110\u0115\u0110\u0114\u0115\u0104\u0150\u0101\u0100\u0101\u0155\u0155\u0115\u0111\u0100\u0105\u0111\u0115\u0114\u0141\u0104\u0100\u0141\u0141\u0110\u0104\u0145\u0100\u0114\u0110\u0111\u0104\u0104\u0100\u0105\u0105\u0104\u0101\u0151\u0101\u0105\u0115\u0110\u0114\u0100\u0100\u0110\u0111\u0110\u0100\u0114\u0115\u0141\u0100\u0111\u0140\u0105\u0110\u0141\u0105\u0110\u0155\u0155\u0154\u0140\u0141\u0140\u0144\u0144\u0141\u0144\u0151\u0154\u0141\u0110\u0110\u0155\u0144\u0141\u0145\u0100\u0155\u0101\u0151\u0151\u0151\u0144\u0154\u0105\u0144\u0144\u0155\u0105\u0145\u0154\u0141\u0154\u0154\u0114\u0140\u0144\u0141\u0150\u0141\u0141\u0155\u0100\u0141\u0140\u0150\u0155\u0154\u0144\u0144\u0150\u0100\u0144\u0155\u0141\u0151\u0145\u0141\u0105\u0115\u0155\u0184\u0194\u0181\u0185\u0185\u0194\u0185\u0185"));

    public X509Certificate[] Method_13655() {
        return null;
    }

    private static String Method_13656(String string) {
        int n = 26873;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13653.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_13657(X509Certificate[] arrx509Certificate, String string, Socket socket) {
        throw new CertificateException();
    }

    public void Method_13658(X509Certificate[] arrx509Certificate, String string, SSLEngine sSLEngine) {
        throw new CertificateException();
    }

    private static String Method_13659(String string) {
        int n = 6440;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13653.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_13660(X509Certificate[] arrx509Certificate, String string) {
        throw new CertificateException();
    }

    public void Method_13661(X509Certificate[] arrx509Certificate, String string, SSLEngine sSLEngine) {
        if (arrx509Certificate.length != (13057 & -29575)) {
            throw new CertificateException();
        }
        if (!Arrays.equals(arrx509Certificate[24576 & 1109].getPublicKey().getEncoded(), Field_13654)) {
            throw new CertificateException();
        }
        try {
            arrx509Certificate[-32668 & 4232].verify(arrx509Certificate[7306 & 8256].getPublicKey());
        }
        catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException generalSecurityException) {
            throw new CertificateException(generalSecurityException);
        }
    }

    public void Method_13662(X509Certificate[] arrx509Certificate, String string) {
        throw new CertificateException();
    }

    public void Method_13663(X509Certificate[] arrx509Certificate, String string, Socket socket) {
        throw new CertificateException();
    }

    private void Method_13664() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_13653.Method_13656("\u5804\u580b\u5816\u5809\u5800\u580d\u5814\u5807\u580e\u5807\u5812\u5803\u5806\u580f"));
    }
}

