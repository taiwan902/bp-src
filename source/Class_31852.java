/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_31852 {
    private static final Logger Field_31853 = LogManager.getLogger();

    public static SecretKey Method_31854() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(12420 & 17313);
            return keyGenerator.generateKey();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new Error(noSuchAlgorithmException);
        }
    }

    public static byte[] Method_31855(Key key, byte[] arrby) {
        return Class_31852.Method_31859(18507 & 4865, key, arrby);
    }

    public static KeyPair Method_31856() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(-10489 & 1184);
            return keyPairGenerator.generateKeyPair();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            Field_31853.error("Key pair generation failed!");
            return null;
        }
    }

    private void Method_31857() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static byte[] Method_31858(String string, PublicKey publicKey, SecretKey secretKey) {
        try {
            byte[][] arrarrby = new byte[-20317 & 16707][];
            arrarrby[3072 & 8236] = string.getBytes("ISO_8859_1");
            arrarrby[3089 & 8329] = secretKey.getEncoded();
            arrarrby[14 & -19134] = publicKey.getEncoded();
            return Class_31852.Method_31861("SHA-1", arrarrby);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            return null;
        }
    }

    private static byte[] Method_31859(int n, Key key, byte[] arrby) {
        try {
            return Class_31852.Method_31863(n, key.getAlgorithm(), key).doFinal(arrby);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            illegalBlockSizeException.printStackTrace();
        }
        catch (BadPaddingException badPaddingException) {
            badPaddingException.printStackTrace();
        }
        Field_31853.error("Cipher data failed!");
        return null;
    }

    public static Cipher Method_31860(int n, Key key) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding");
            cipher.init(n, key, new IvParameterSpec(key.getEncoded()));
            return cipher;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new RuntimeException(generalSecurityException);
        }
    }

    private static byte[] Method_31861(String string, byte[] ... arrby) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(string);
            byte[][] arrby2 = arrby;
            int n = arrby2.length;
            for (int i = 560 & 11534; i < n; ++i) {
                byte[] arrby3 = arrby2[i];
                messageDigest.update(arrby3);
            }
            return messageDigest.digest();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return null;
        }
    }

    public static byte[] Method_31862(Key key, byte[] arrby) {
        return Class_31852.Method_31859(-7166 & 6415, key, arrby);
    }

    private static Cipher Method_31863(int n, String string, Key key) {
        try {
            Cipher cipher = Cipher.getInstance(string);
            cipher.init(n, key);
            return cipher;
        }
        catch (InvalidKeyException invalidKeyException) {
            invalidKeyException.printStackTrace();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            noSuchPaddingException.printStackTrace();
        }
        Field_31853.error("Cipher creation failed!");
        return null;
    }

    public static SecretKey Method_31864(PrivateKey privateKey, byte[] arrby) {
        return new SecretKeySpec(Class_31852.Method_31862(privateKey, arrby), "AES");
    }

    public static PublicKey Method_31865(byte[] arrby) {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(arrby);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return keyFactory.generatePublic(x509EncodedKeySpec);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            // empty catch block
        }
        Field_31853.error("Public key reconstitute failed!");
        return null;
    }
}

