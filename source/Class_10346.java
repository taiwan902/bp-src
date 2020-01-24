/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Locale;

public final class Class_10346 {
    private static final int Field_10347;
    static final Class_22837 Field_10348;
    private static final Class_6113 Field_10349;
    private static final char[] Field_10350;

    public static boolean Method_10351(Class_22553 class_22553, Class_22553 class_225532) {
        int n;
        int n2 = class_22553.Method_22564();
        if (n2 != class_225532.Method_22564()) {
            return (-26588 & 83) != 0;
        }
        int n3 = n2 >>> (8579 & -16381);
        int n4 = n2 & (18591 & -32665);
        int n5 = class_22553.Method_22582();
        int n6 = class_225532.Method_22582();
        if (class_22553.Method_22649() == class_225532.Method_22649()) {
            for (n = n3; n > 0; --n) {
                if (class_22553.Method_22571(n5) != class_225532.Method_22571(n6)) {
                    return (-32730 & 2576) != 0;
                }
                n5 += 8;
                n6 += 8;
            }
        } else {
            for (n = n3; n > 0; --n) {
                if (class_22553.Method_22571(n5) != Class_10346.Method_10358(class_225532.Method_22571(n6))) {
                    return (4104 & 16454) != 0;
                }
                n5 += 8;
                n6 += 8;
            }
        }
        for (n = n4; n > 0; --n) {
            if (class_22553.Method_22558(n5) != class_225532.Method_22558(n6)) {
                return (288 & -12091) != 0;
            }
            ++n5;
            ++n6;
        }
        return (12323 & 833) != 0;
    }

    static Class_22553 Method_10352(Class_22837 class_22837, boolean bl, CharBuffer charBuffer, Charset charset) {
        CharsetEncoder charsetEncoder = Class_7203.Method_7217(charset);
        int n = (int)((double)charBuffer.remaining() * (double)charsetEncoder.maxBytesPerChar());
        int n2 = 24897 & 5255;
        Class_22553 class_22553 = bl ? class_22837.Method_22847(n) : class_22837.Method_22841(n);
        try {
            ByteBuffer byteBuffer = class_22553.Method_22588(4131 & 24, n);
            int n3 = byteBuffer.position();
            CoderResult coderResult = charsetEncoder.encode(charBuffer, byteBuffer, (-31993 & 33) != 0);
            if (!coderResult.isUnderflow()) {
                coderResult.throwException();
            }
            if (!(coderResult = charsetEncoder.flush(byteBuffer)).isUnderflow()) {
                coderResult.throwException();
            }
            class_22553.Method_22609(class_22553.Method_22620() + byteBuffer.position() - n3);
            n2 = 689 & -7932;
            Class_22553 class_225532 = class_22553;
            return class_225532;
        }
        catch (CharacterCodingException characterCodingException) {
            throw new IllegalStateException(characterCodingException);
        }
        finally {
            if (n2 != 0) {
                class_22553.release();
            }
        }
    }

    private Class_10346() {
    }

    private void Method_10353() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String Method_10354(Class_22553 class_22553) {
        return Class_10346.Method_10374(class_22553, class_22553.Method_22582(), class_22553.Method_22564());
    }

    private static String Method_10355(String string) {
        int n = 18922;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10346.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_10356(String string) {
        int n = 13525;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10346.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_10357(String string) {
        int n = 30546;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10346.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static long Method_10358(long l) {
        return Long.reverseBytes(l);
    }

    public static int Method_10359(int n) {
        return Integer.reverseBytes(n);
    }

    public static short Method_10360(short s) {
        return Short.reverseBytes(s);
    }

    static int Method_10361() {
        return Field_10347;
    }

    public static int Method_10362(Class_22553 class_22553) {
        int n;
        int n2 = class_22553.Method_22564();
        int n3 = n2 >>> (4130 & 1298);
        int n4 = n2 & (4227 & 51);
        int n5 = 12419 & 16437;
        int n6 = class_22553.Method_22582();
        if (class_22553.Method_22649() == ByteOrder.BIG_ENDIAN) {
            for (n = n3; n > 0; --n) {
                n5 = (2111 & 12319) * n5 + class_22553.Method_22581(n6);
                n6 += 4;
            }
        } else {
            for (n = n3; n > 0; --n) {
                n5 = (351 & 4159) * n5 + Class_10346.Method_10359(class_22553.Method_22581(n6));
                n6 += 4;
            }
        }
        for (n = n4; n > 0; --n) {
            n5 = (-24289 & 4127) * n5 + class_22553.Method_22558(n6++);
        }
        if (n5 == 0) {
            n5 = 8193 & 21861;
        }
        return n5;
    }

    private static String Method_10363(String string) {
        int n = 27348;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10346.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Class_36583 class_36583;
        Field_10349 = Class_10201.Method_10203(Class_10346.class);
        Field_10350 = new char[5937 & 19464];
        char[] arrc = Class_10346.Method_10364("\u6410\u6410\u6410\u6410\u6414\u6414\u6414\u6414\u6418\u6418\u6408\u6408\u640c\u640c\u640c\u640c").toCharArray();
        for (int i = 17185 & -30718; i < (23818 & 8576); ++i) {
            Class_10346.Field_10350[i << (-32203 & 1)] = arrc[i >>> (-16378 & 2572) & (16671 & 2575)];
            Class_10346.Field_10350[(i << (-12223 & 2051)) + (4113 & 389)] = arrc[i & (9007 & -30577)];
        }
        String string = Class_16591.Method_16596(Class_10346.Method_10357("\u0000\u0003\u0001\u0000\u0007\u0007\u0004\u0005\u000b\b\n\u000b\u000f\f\r\r\u0010\u0013\u0010\u0011\u0015\u0016\u0016\u0014\u0019\u001a\u001b\u001b\u001d\u001c\u001d\u001c"), Class_10346.Method_10370("\uc488\uc481\uc489\uc480\uc480\uc481\uc488\uc489")).toLowerCase(Locale.US).trim();
        if (Class_10346.Method_10366("\u1200\u1209\u1201\u1208\u120c\u120d\u1204\u1205").equals(string)) {
            class_36583 = Class_39614.Field_39615;
            Field_10349.Method_6114(Class_10346.Method_10365("\ue648\ue620\ue608\ue608\ue605\ue605\ue605\ue60c\ue600\ue608\ue649\ue609\ue60c\ue64c\ue60d\ue605\ue601\ue600\ue608\ue648\ue604\ue60c\ue60d\ue60d\ue600\ue601\ue601\ue609\ue605\ue64c\ue605\ue60d\ue601\ue601\ue649\ue640\ue60c\ue60d"), string);
        } else if (Class_10346.Method_10355("\u0118\u0100\u0103\u0103\u0109\u0109").equals(string)) {
            class_36583 = Class_39208.Field_39212;
            Field_10349.Method_6114(Class_10346.Method_10371("\u00ad\u00c4\u00e9\u00ec\u00f0\u00e1\u00f4\u00e8\u00e9\u00e4\u00a4\u00e1\u00e1\u00a0\u00e0\u00e9\u00e4\u00e4\u00e9\u00bc\u00f5\u00f8\u00f8\u00f9\u00f9\u00f9\u00ec\u00f5\u00ec\u00b0\u00e8\u00e5\u00d0\u00c5\u0098\u00dd\u00d9"), string);
        } else {
            class_36583 = Class_39614.Field_39615;
            Field_10349.Method_6114(Class_10346.Method_10356("\u2656\u2636\u2612\u2614\u2606\u2616\u2600\u2614\u261a\u261e\u265c\u261a\u261c\u265c\u261c\u261e\u2606\u2606\u2602\u2654\u2612\u2616\u2616\u2614\u2618\u261a\u260e\u261c\u2608\u265c\u260e\u260a\u2622\u2636\u2660\u2672\u2626\u2634\u2622\u2634\u263c\u263e\u263e\u263e\u267a\u267a\u262e\u263c\u2630\u2634\u2634\u2624\u2634\u2660\u2672\u2620\u262e\u267a"), string);
        }
        Field_10348 = class_36583;
        Field_10347 = Class_16591.Method_16601(Class_10346.Method_10368("\u00c6\u00c1\u00d2\u00c3\u00d4\u00c1\u00c6\u00c3\u0088\u00cf\u00c8\u0089\u00c8\u00cb\u00da\u00db\u00c6\u0091\u00c2\u00d7\u00c4\u00d3\u00d6\u00d3\u00da\u00d9\u00dc\u00df\u00da\u00db\u00de\u00cd\u00c2\u00c5\u00d2\u00c5\u00d2\u00c1\u00c0\u00c3\u00dc\u00dd\u00ce\u00dd\u00ca"), 16847987 & -2132680704);
        Field_10349.Method_6114(Class_10346.Method_10363("\u313c\u3154\u317a\u317e\u3164\u3174\u3162\u317e\u3178\u3174\u3136\u3172\u3174\u3134\u3176\u317e\u3164\u3164\u316a\u313e\u3164\u3178\u3162\u3176\u3178\u317c\u3156\u3176\u3178\u3178\u3176\u315e\u3178\u3160\u3176\u3172\u3164\u3150\u3166\u3176\u317c\u317c\u316a\u314a\u3170\u3160\u317e\u3122\u3130\u3168\u316e"), Field_10347);
    }

    private static String Method_10364(String string) {
        int n = 7712;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10346.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_10365(String string) {
        int n = 28221;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10346.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_10366(String string) {
        int n = 23580;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10346.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static String Method_10367(ByteBuffer byteBuffer, Charset charset) {
        CharsetDecoder charsetDecoder = Class_7203.Method_7211(charset);
        CharBuffer charBuffer = CharBuffer.allocate((int)((double)byteBuffer.remaining() * (double)charsetDecoder.maxCharsPerByte()));
        try {
            CoderResult coderResult = charsetDecoder.decode(byteBuffer, charBuffer, (6145 & 9301) != 0);
            if (!coderResult.isUnderflow()) {
                coderResult.throwException();
            }
            if (!(coderResult = charsetDecoder.flush(charBuffer)).isUnderflow()) {
                coderResult.throwException();
            }
        }
        catch (CharacterCodingException characterCodingException) {
            throw new IllegalStateException(characterCodingException);
        }
        return charBuffer.flip().toString();
    }

    private static String Method_10368(String string) {
        int n = 24694;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10346.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_22553 Method_10369() {
        if (Field_10347 <= 0) {
            return null;
        }
        if (Class_7799.Method_7858()) {
            return Class_40873.Method_40876();
        }
        return Class_44852.Method_44856();
    }

    private static String Method_10370(String string) {
        int n = 26401;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10346.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_10371(String string) {
        int n = 18603;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10346.class, 7);
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
    public static Class_22553 Method_10372(Class_22837 class_22837, Class_22553 class_22553, int n) {
        int n2 = 257 & 193;
        Class_22553 class_225532 = class_22837.Method_22841(n);
        try {
            class_22553.Method_22605(class_225532);
            n2 = 2056 & 16899;
            Class_22553 class_225533 = class_225532;
            return class_225533;
        }
        finally {
            if (n2 != 0) {
                class_225532.release();
            }
        }
    }

    public static int Method_10373(Class_22553 class_22553, Class_22553 class_225532) {
        long l;
        long l2;
        int n;
        int n2 = class_22553.Method_22564();
        int n3 = class_225532.Method_22564();
        int n4 = Math.min(n2, n3);
        int n5 = n4 >>> (5250 & -24022);
        int n6 = n4 & (3107 & 8259);
        int n7 = class_22553.Method_22582();
        int n8 = class_225532.Method_22582();
        if (class_22553.Method_22649() == class_225532.Method_22649()) {
            for (n = n5; n > 0; --n) {
                l2 = class_22553.Method_22595(n7);
                if (l2 > (l = class_225532.Method_22595(n8))) {
                    return 16393 & -28601;
                }
                if (l2 < l) {
                    return -1 & -1;
                }
                n7 += 4;
                n8 += 4;
            }
        } else {
            for (n = n5; n > 0; --n) {
                l2 = class_22553.Method_22595(n7);
                if (l2 > (l = (long)Class_10346.Method_10359(class_225532.Method_22581(n8)) & (-4577581972347420673L & 0xFFFFFFFFL))) {
                    return 17413 & 2337;
                }
                if (l2 < l) {
                    return -1 & -1;
                }
                n7 += 4;
                n8 += 4;
            }
        }
        for (n = n6; n > 0; --n) {
            short s;
            short s2 = class_22553.Method_22607(n7);
            if (s2 > (s = class_225532.Method_22607(n8))) {
                return 4933 & 25609;
            }
            if (s2 < s) {
                return -1 & -1;
            }
            ++n7;
            ++n8;
        }
        return n2 - n3;
    }

    public static String Method_10374(Class_22553 class_22553, int n, int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("length: " + n2);
        }
        if (n2 == 0) {
            return "";
        }
        int n3 = n + n2;
        char[] arrc = new char[n2 << (-32119 & 1349)];
        int n4 = n;
        int n5 = 158 & 9280;
        while (n4 < n3) {
            System.arraycopy(Field_10350, class_22553.Method_22607(n4) << (-18399 & 1045), arrc, n5, 4642 & 10246);
            ++n4;
            n5 += 2;
        }
        return new String(arrc);
    }
}

