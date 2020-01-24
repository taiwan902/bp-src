/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Map;

public final class Class_7203 {
    public static final Charset Field_7204;
    public static final Charset Field_7205;
    public static final Charset Field_7206;
    public static final Charset Field_7207;
    public static final Charset Field_7208;
    public static final Charset Field_7209;

    private static String Method_7210(String string) {
        int n = 26421;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7203.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static CharsetDecoder Method_7211(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        Map map = Class_32728.Method_32743().Method_32745();
        CharsetDecoder charsetDecoder = (CharsetDecoder)map.get(charset);
        if (charsetDecoder != null) {
            charsetDecoder.reset();
            charsetDecoder.onMalformedInput(CodingErrorAction.REPLACE);
            charsetDecoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
            return charsetDecoder;
        }
        charsetDecoder = charset.newDecoder();
        charsetDecoder.onMalformedInput(CodingErrorAction.REPLACE);
        charsetDecoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
        map.put(charset, charsetDecoder);
        return charsetDecoder;
    }

    static {
        Field_7209 = Charset.forName(Class_7203.Method_7213("\u401c\u401c\u400c\u4026\u4038\u403e"));
        Field_7208 = Charset.forName(Class_7203.Method_7216("\ue4e0\ue4e1\ue4e3\ue482\ue484\ue485\ue4e7\ue4e6"));
        Field_7205 = Charset.forName(Class_7203.Method_7214("\u82e8\u82e9\u82e9\u8280\u828c\u828d\u82e5\u82ec"));
        Field_7207 = Charset.forName(Class_7203.Method_7210("\u0208\u0209\u0208\u0261\u0264"));
        Field_7206 = Charset.forName(Class_7203.Method_7215("\u2058\u2042\u205c\u203e\u202c\u202c\u2022\u202e\u2034\u2028"));
        Field_7204 = Charset.forName(Class_7203.Method_7218("\uc018\uc01b\uc022\uc00b\uc01a\uc00b\uc002\uc003"));
    }

    private void Method_7212() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_7213(String string) {
        int n = 19109;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7203.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7214(String string) {
        int n = 25419;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7203.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7215(String string) {
        int n = 13783;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7203.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7216(String string) {
        int n = 5719;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7203.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static CharsetEncoder Method_7217(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        Map map = Class_32728.Method_32743().Method_32733();
        CharsetEncoder charsetEncoder = (CharsetEncoder)map.get(charset);
        if (charsetEncoder != null) {
            charsetEncoder.reset();
            charsetEncoder.onMalformedInput(CodingErrorAction.REPLACE);
            charsetEncoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
            return charsetEncoder;
        }
        charsetEncoder = charset.newEncoder();
        charsetEncoder.onMalformedInput(CodingErrorAction.REPLACE);
        charsetEncoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
        map.put(charset, charsetEncoder);
        return charsetEncoder;
    }

    private static String Method_7218(String string) {
        int n = 5224;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7203.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

