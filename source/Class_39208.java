/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_39208
extends Class_36583 {
    private final Class_14963[] Field_39209;
    private static final int Field_39210;
    private final int Field_39211;
    public static final Class_39208 Field_39212;
    private static final int Field_39213;
    private static final int Field_39214;
    private static final int Field_39215;
    private static final int Field_39216;
    private final Class_14963[] Field_39217;
    private static final Class_6113 Field_39218;
    private static final int Field_39219;
    private static final int Field_39220;
    private final int Field_39221;
    private static final int Field_39222;
    private final int Field_39223;
    private static final int Field_39224;
    final Class_39125 Field_39225 = new Class_39125(this);

    private static String Method_39226(String string) {
        int n = 17198;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39227(String string) {
        int n = 2357;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39228(String string) {
        int n = 24048;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39229(String string) {
        int n = 12039;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static int Method_39230(Class_39208 class_39208) {
        return class_39208.Field_39223;
    }

    private static String Method_39231(String string) {
        int n = 15608;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Class_14963[] Method_39232(Class_39208 class_39208) {
        return class_39208.Field_39209;
    }

    private static int Method_39233(int n) {
        if (n < (4292 & -2032)) {
            throw new IllegalArgumentException("pageSize: " + n + " (expected: " + (4132 & -28264) + "+)");
        }
        if ((n & n - (20481 & 8783)) != 0) {
            throw new IllegalArgumentException("pageSize: " + n + " (expected: power of 2)");
        }
        return (799 & 159) - Integer.numberOfLeadingZeros(n);
    }

    private static String Method_39234(String string) {
        int n = 27524;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_39208() {
        this((-32612 & 321) != 0);
    }

    protected Class_22553 Method_39235(int n, int n2) {
        Class_15420 class_15420 = (Class_15420)this.Field_39225.get();
        Class_14963 class_14963 = class_15420.Field_15430;
        Class_40553 class_40553 = class_14963 != null ? class_14963.Method_14998(class_15420, n, n2) : new Class_44337((Class_22837)this, n, n2);
        return Class_39208.toLeakAwareBuffer((Class_22553)class_40553);
    }

    private static String Method_39236(String string) {
        int n = 21357;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39237(String string) {
        int n = 9461;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_14963[] Method_39238(int n) {
        return new Class_14963[n];
    }

    static int Method_39239(Class_39208 class_39208) {
        return class_39208.Field_39221;
    }

    private static String Method_39240(String string) {
        int n = 24603;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39241(String string) {
        int n = 29111;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39242(String string) {
        int n = 15300;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_39243() {
        return (this.Field_39209 != null ? 26641 & 257 : -28400 & 169) != 0;
    }

    public Class_39208(boolean bl) {
        this(bl, Field_39224, Field_39215, Field_39210, Field_39220);
    }

    static Class_14963[] Method_39244(Class_39208 class_39208) {
        return class_39208.Field_39217;
    }

    private static String Method_39245(String string) {
        int n = 31381;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static int Method_39246(Class_39208 class_39208) {
        return class_39208.Field_39211;
    }

    private static String Method_39247(String string) {
        int n = 22073;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39248(String string) {
        int n = 4269;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static int Method_39249() {
        return Field_39219;
    }

    public Class_39208(boolean bl, int n, int n2, int n3, int n4) {
        this(bl, n, n2, n3, n4, Field_39213, Field_39222, Field_39214);
    }

    private static String Method_39250(String string) {
        int n = 20503;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39251(String string) {
        int n = 3575;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_39208(boolean bl, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        super(bl);
        int n8;
        this.Field_39221 = n5;
        this.Field_39223 = n6;
        this.Field_39211 = n7;
        int n9 = Class_39208.Method_39253(n3, n4);
        if (n < 0) {
            throw new IllegalArgumentException("nHeapArena: " + n + " (expected: >= 0)");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("nDirectArea: " + n2 + " (expected: >= 0)");
        }
        int n10 = Class_39208.Method_39233(n3);
        if (n > 0) {
            this.Field_39217 = Class_39208.Method_39238(n);
            for (n8 = 10754 & 16409; n8 < this.Field_39217.length; ++n8) {
                this.Field_39217[n8] = new Class_36010(this, n3, n4, n10, n9);
            }
        } else {
            this.Field_39217 = null;
        }
        if (n2 > 0) {
            this.Field_39209 = Class_39208.Method_39238(n2);
            for (n8 = 10280 & 4496; n8 < this.Field_39209.length; ++n8) {
                this.Field_39209[n8] = new Class_19701(this, n3, n4, n10, n9);
            }
        } else {
            this.Field_39209 = null;
        }
    }

    private static String Method_39252(String string) {
        int n = 28950;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_39253(int n, int n2) {
        if (n2 > (-32610 & 16398)) {
            throw new IllegalArgumentException("maxOrder: " + n2 + " (expected: 0-14)");
        }
        int n3 = n;
        for (int i = n2; i > 0; --i) {
            if (n3 > (1652556045 & -1339015006)) {
                Object[] arrobject = new Object[2195 & 4099];
                arrobject[1024 & 12586] = n;
                arrobject[4371 & -16319] = n2;
                arrobject[2322 & 8935] = 1082785808 & -67108534;
                throw new IllegalArgumentException(String.format("pageSize (%d) << maxOrder (%d) must not exceed %d", arrobject));
            }
            n3 <<= 2073 & 16641;
        }
        return n3;
    }

    private static String Method_39254(String string) {
        int n = 19439;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_39218 = Class_10201.Method_10203(Class_39208.class);
        int n = Class_16591.Method_16601(Class_39208.Method_39226("\u3400\u3402\u3408\u3408\u340e\u3406\u340c\u3404\u3402\u3400\u3402\u3402\u3406\u340c\u340c\u340c\u3400\u3402\u3408\u3400\u3404\u3406\u340e\u340c\u3408\u3402\u340a\u3402\u340c\u340c\u340e\u340c\u342a\u3420\u3422\u3428"), 8202 & -22140);
        Throwable throwable = null;
        try {
            Class_39208.Method_39233(n);
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            n = 8914 & 9217;
        }
        Field_39210 = n;
        int n2 = Class_16591.Method_16601(Class_39208.Method_39228("\u5000\u5001\u501a\u500b\u5018\u5001\u500a\u5003\u5000\u5001\u5002\u5003\u5000\u5009\u501a\u501b\u5000\u5011\u501a\u5013\u5010\u5011\u501a\u501b\u5008\u5011\u500a\u5013\u5010\u5019\u5002\u5033\u5018\u5009\u500a\u501b"), 17439 & 13003);
        Throwable throwable3 = null;
        try {
            Class_39208.Method_39253(Field_39210, n2);
        }
        catch (Throwable throwable4) {
            throwable3 = throwable4;
            n2 = 1039 & 4619;
        }
        Field_39220 = n2;
        Runtime runtime = Runtime.getRuntime();
        int n3 = Field_39210 << Field_39220;
        Field_39224 = Math.max(2054 & 1248, Class_16591.Method_16601(Class_39208.Method_39257("\uc148\uc148\uc142\uc142\uc140\uc148\uc142\uc14a\uc100\uc140\uc142\uc102\uc140\uc148\uc14a\uc14a\uc148\uc108\uc142\uc14a\uc148\uc148\uc142\uc142\uc148\uc140\uc14a\uc102\uc140\uc148\uc142\uc142\uc140\uc140\uc142\uc142\uc140\uc140\uc14a\uc142\uc148"), (int)Math.min((long)runtime.availableProcessors(), Runtime.getRuntime().maxMemory() / (long)n3 / (105382146L & 142606482L) / (39063603L & 2451833769511354435L))));
        Field_39215 = Math.max(17665 & 206, Class_16591.Method_16601(Class_39208.Method_39229("\u3083\u3084\u3094\u3085\u3094\u3080\u3085\u3080\u3084\u3083\u3087\u3086\u3080\u3083\u3090\u3090\u3093\u3084\u3081\u3084\u3082\u3081\u3087\u3085\u3096\u3085\u3092\u3086\u3080\u3093\u3081\u3080\u30a3\u30b0\u30a5\u30a3\u30b2\u30a7\u30b6\u30a1\u30a4\u30a3\u30b3"), (int)Math.min((long)runtime.availableProcessors(), Class_7799.Method_7829() / (long)n3 / (3816262009870516271L & -3816262011008233454L) / (4452146808393187467L & -4452146810012294813L))));
        Field_39213 = Class_16591.Method_16601(Class_39208.Method_39236("\u2248\u224d\u2244\u2245\u2240\u224d\u2240\u224d\u220c\u2249\u224c\u220d\u224c\u2245\u2244\u2245\u2258\u221d\u2250\u225d\u225c\u225d\u2250\u2251\u2254\u225d\u2250\u221d\u2254\u2259\u225c\u2259\u2240\u2241\u2240\u2249\u2244\u2241\u2248\u2249\u2244"), -20735 & 580);
        Field_39222 = Class_16591.Method_16601(Class_39208.Method_39242("\u4c85\u4c80\u4c92\u4c83\u4c90\u4c84\u4c83\u4c86\u4c88\u4c8d\u4c8b\u4c8a\u4c8c\u4c8d\u4c9e\u4c9e\u4c95\u4c80\u4c87\u4c82\u4c84\u4c85\u4c83\u4c83\u4c98\u4c89\u4c9e\u4c8a\u4c99\u4c8d\u4c8b\u4c8e\u4c80\u4c85\u4c87\u4c87\u4c80\u4c85\u4c93\u4c83\u4c9c\u4c89"), 18768 & 800);
        Field_39214 = Class_16591.Method_16601(Class_39208.Method_39250("\ud24c\ud24a\ud242\ud242\ud246\ud24a\ud246\ud24a\ud202\ud244\ud240\ud200\ud242\ud248\ud24a\ud24a\ud25c\ud21a\ud256\ud25a\ud258\ud25a\ud254\ud256\ud258\ud252\ud25c\ud210\ud252\ud252\ud25c\ud252\ud264\ud268\ud264\ud266\ud266\ud26c\ud262\ud264\ud264\ud266\ud26a"), 8280 & 359);
        Field_39219 = Class_16591.Method_16601(Class_39208.Method_39255("\ue655\ue650\ue640\ue651\ue644\ue650\ue655\ue650\ue618\ue65d\ue659\ue618\ue658\ue659\ue648\ue648\ue655\ue600\ue645\ue640\ue640\ue641\ue645\ue645\ue658\ue649\ue65c\ue608\ue649\ue64d\ue65c\ue64d\ue675\ue675\ue674\ue671\ue670\ue674\ue661\ue670\ue678\ue679\ue66c\ue67d\ue67d\ue66c\ue67d\ue67d\ue665\ue670\ue675"), 34373644 & 277905427);
        Field_39216 = Class_16591.Method_16601(Class_39208.Method_39237("\u0282\u0281\u0298\u0289\u029c\u0285\u028c\u0285\u0288\u028b\u028a\u028b\u028c\u0287\u0294\u0295\u0282\u0291\u0298\u0291\u0296\u0295\u029e\u029d\u0282\u0299\u0282\u029b\u0294\u0297\u0296\u029d\u028a\u029b\u029a\u0281\u0286\u0287\u0286\u029d\u0282\u0291\u0292\u0281\u028e"), -22525 & 8300);
        if (Field_39218.Method_6131()) {
            Field_39218.Method_6114(Class_39208.Method_39258("\u1930\u1918\u1934\u1932\u192d\u193d\u192b\u1936\u1934\u1938\u193b\u193d\u193e\u193e\u193f\u1935\u1929\u1928\u1924\u1932\u1938\u1934\u1935\u1937\u1936\u1935\u1921\u193b\u1923\u193e\u193f\u1925\u1930\u1914\u1938\u193d\u1929\u1919\u192b\u193d\u193b\u1935\u1926\u192e\u1931\u192b\u192c"), Field_39224);
            Field_39218.Method_6114(Class_39208.Method_39248("\u0375\u0315\u0333\u0337\u0324\u0334\u0322\u0337\u0339\u033d\u037e\u033a\u033d\u037d\u033e\u033e\u0334\u0335\u0333\u0367\u0321\u0325\u0326\u0326\u0329\u0328\u033e\u032e\u0338\u036d\u032e\u033e\u0315\u0335\u0313\u0303\u0315\u0310\u0306\u0332\u0308\u031c\u031e\u031a\u0309\u0349\u035a\u030a\u0315"), Field_39215);
            if (throwable == null) {
                Field_39218.Method_6114(Class_39208.Method_39247("\u226e\u2206\u2228\u222e\u2226\u2226\u2222\u222e\u222a\u2226\u2266\u2220\u2224\u2264\u2226\u222c\u2226\u2226\u2228\u226e\u2222\u222e\u222c\u222e\u2228\u222a\u222c\u2226\u2228\u2264\u2228\u2228\u2204\u2206\u2222\u2208\u2208\u2206\u224a\u2240\u2200\u2206"), Field_39210);
            } else {
                Field_39218.Method_6122(Class_39208.Method_39251("\u0090\u0091\u0090\u0093\u0081\u0090\u0083\u0093\u0090\u0091\u0093\u0090\u0092\u0093\u0093\u0090\u0091\u0091\u0090\u0083\u0081\u0081\u0082\u0082\u0091\u0082\u0093\u0083\u0091\u0092\u0090\u0082\u0090\u0083\u0090\u0083\u0091\u0082"), Field_39210, throwable);
            }
            if (throwable3 == null) {
                Field_39218.Method_6114(Class_39208.Method_39234("\u9055\u9014\u9013\u9016\u9004\u9015\u9002\u9016\u9011\u9014\u9056\u9013\u9015\u9054\u9016\u9017\u9014\u9014\u9013\u9046\u9001\u9004\u9006\u9007\u9001\u9001\u9016\u9007\u9010\u9044\u9007\u9003\u9020\u9035\u9022\u9036\u9035\u9020\u9062\u9072\u9021\u9025"), Field_39220);
            } else {
                Field_39218.Method_6122(Class_39208.Method_39254("\u9505\u950d\u9503\u9507\u9508\u9508\u950e\u9503\u9509\u9505\u9506\u9502\u9501\u9501\u9502\u950a\u950c\u950d\u9503\u9507\u950d\u9501\u9502\u9502\u9509\u9508\u950e\u9506\u950c\u9501\u9503\u950e\u9520\u9524\u952a\u952f\u9529\u952d\u9526\u952f\u9521\u9524"), Field_39220, throwable3);
            }
            Field_39218.Method_6114(Class_39208.Method_39252("\u16d0\u1691\u1690\u1691\u1684\u1695\u1684\u1695\u1698\u1699\u16d8\u1699\u169c\u16dd\u169c\u169d\u1690\u1691\u1690\u16c1\u1684\u1685\u1684\u1685\u1688\u1689\u1698\u1689\u169c\u16cd\u168c\u168d\u16a0\u16b1\u16b0\u16a1\u16b4\u16a5\u16b4\u16e5\u16f8\u16a9\u16a8"), Field_39210 << Field_39220);
            Field_39218.Method_6114(Class_39208.Method_39227("\u1131\u1110\u1137\u1132\u1124\u1135\u1122\u1136\u1135\u1130\u1132\u1137\u1135\u1134\u1136\u1137\u1130\u1130\u1137\u1122\u1121\u1124\u1126\u1127\u1125\u1125\u1132\u1123\u1130\u1124\u1136\u1123\u1130\u1125\u1117\u1137\u1131\u1130\u1137\u1103\u1135\u1124\u1133\u1126\u1130\u1121\u1127"), Field_39213);
            Field_39218.Method_6114(Class_39208.Method_39240("\u0000 \u0006\u0000\u0004\u0004\u0000\u0004\f\b\b\u000e\u000e\u000e\f\u000e\u0010\u0010\u0016\u0010\u0010\u0014\u0016\u0014\u001e\u001c\u001a\u0018\u001a\u001e\u0018\u001e$ \"\u0004 \"\"&\u000e,,**((."), Field_39222);
            Field_39218.Method_6114(Class_39208.Method_39241("\u0814\u083d\u0810\u0817\u0808\u0819\u080e\u0813\u0818\u0815\u0816\u0811\u0812\u0813\u0812\u0819\u080c\u080d\u0800\u0817\u081c\u0811\u0810\u0813\u081a\u0819\u080c\u0817\u080e\u0813\u0812\u0813\u080a\u0815\u0818\u0815\u083e\u081d\u081e\u0815\u081c\u082b\u0810\u0803\u0818\u0807\u081c\u0807\u0804"), Field_39214);
            Field_39218.Method_6114(Class_39208.Method_39245("\u5094\u50bd\u5090\u5097\u508d\u509c\u508b\u5097\u5098\u5095\u5097\u5090\u5096\u5097\u5097\u509c\u508d\u508d\u5080\u5097\u5098\u5095\u5095\u5096\u509a\u5098\u508d\u5096\u508b\u5097\u5094\u5098\u5081\u50ba\u5098\u509a\u5091\u509c\u509d\u50bb\u508c\u509f\u509f\u509c\u508b\u50ba\u5098\u5089\u5098\u509a\u5090\u508d\u5080\u5083\u5099\u5082\u5084"), Field_39219);
            Field_39218.Method_6114(Class_39208.Method_39231("\u100a\u1003\u100c\u100b\u1007\u1006\u1003\u100f\u100e\u1003\u1003\u1004\u1004\u1005\u1007\u100c\u1003\u1003\u100c\u100b\u1002\u100f\u100d\u100e\u100c\u100e\u1009\u1002\u1009\u1005\u100a\u1008\u1024\u102f\u1020\u1021\u1021\u102a\u102c\u1028\u1021\u102b\u1028\u102f\u102d\u102a\u1025\u1023\u1027\u102c\u1028"), Field_39216);
        }
        Field_39212 = new Class_39208(Class_7799.Method_7856());
    }

    private static String Method_39255(String string) {
        int n = 6557;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_22553 Method_39256(int n, int n2) {
        Class_15420 class_15420 = (Class_15420)this.Field_39225.get();
        Class_14963 class_14963 = class_15420.Field_15425;
        Class_40553 class_40553 = class_14963 != null ? class_14963.Method_14998(class_15420, n, n2) : (Class_7799.Method_7858() ? new Class_40803(this, n, n2) : new Class_40565(this, n, n2));
        return Class_39208.toLeakAwareBuffer((Class_22553)class_40553);
    }

    private static String Method_39257(String string) {
        int n = 3221;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39258(String string) {
        int n = 30497;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39208.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_39259() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static int Method_39260() {
        return Field_39216;
    }
}

