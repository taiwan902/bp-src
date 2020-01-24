/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

public final class Class_11149 {
    private static final Unsafe Field_11150;
    private static final Class_6113 Field_11151;
    private static final long Field_11152;
    private static final boolean Field_11153;
    private static final boolean Field_11154;

    private static String Method_11155(String string) {
        int n = 1840;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11156(String string) {
        int n = 29784;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Object Method_11157(Object object, long l) {
        return Field_11150.getObject(object, l);
    }

    static void Method_11158(long l, int n) {
        if (Field_11153) {
            Field_11150.putInt(l, n);
        } else if (Field_11154) {
            Class_11149.Method_11169(l, (byte)(n >>> (-20390 & 17560)));
            Class_11149.Method_11169(l + (-8473020019732100703L & 8473020018085330971L), (byte)(n >>> (-26596 & 16496)));
            Class_11149.Method_11169(l + (1210581795L & 822151178L), (byte)(n >>> (-32579 & 8264)));
            Class_11149.Method_11169(l + (6203152876890489107L & 1413481579L), (byte)n);
        } else {
            Class_11149.Method_11169(l + (21020819L & -4309645821282338045L), (byte)(n >>> (157 & 2616)));
            Class_11149.Method_11169(l + (-4243215638463471434L & 4243215638441496650L), (byte)(n >>> (4146 & 1752)));
            Class_11149.Method_11169(l + (147857413L & 70046297L), (byte)(n >>> (8234 & 20508)));
            Class_11149.Method_11169(l, (byte)n);
        }
    }

    static AtomicIntegerFieldUpdater Method_11159(Class class_, String string) {
        return new Class_9912(Field_11150, class_, string);
    }

    private static String Method_11160(String string) {
        int n = 21242;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static byte Method_11161(long l) {
        return Field_11150.getByte(l);
    }

    private static String Method_11162(String string) {
        int n = 18033;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static boolean Method_11163() {
        return (Field_11150 != null ? -31997 & 8209 : 2048 & 8437) != 0;
    }

    static ClassLoader Method_11164() {
        if (System.getSecurityManager() == null) {
            return Thread.currentThread().getContextClassLoader();
        }
        return (ClassLoader)AccessController.doPrivileged(new Class_26646());
    }

    private static long Method_11165(Object object, long l) {
        return Field_11150.getLong(object, l);
    }

    private void Method_11166() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static void Method_11167(long l, long l2, long l3) {
        while (l3 > (7644788785397372928L & 271656130L)) {
            long l4 = Math.min(l3, 20448354L & -4530207594281549552L);
            Field_11150.copyMemory(l, l2, l4);
            l3 -= l4;
            l += l4;
            l2 += l4;
        }
    }

    static ClassLoader Method_11168() {
        if (System.getSecurityManager() == null) {
            return ClassLoader.getSystemClassLoader();
        }
        return (ClassLoader)AccessController.doPrivileged(new Class_8709());
    }

    static void Method_11169(long l, byte by) {
        Field_11150.putByte(l, by);
    }

    private static String Method_11170(String string) {
        int n = 12579;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static AtomicLongFieldUpdater Method_11171(Class class_, String string) {
        return new Class_16652(Field_11150, class_, string);
    }

    private static String Method_11172(String string) {
        int n = 27249;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static ClassLoader Method_11173(Class class_) {
        if (System.getSecurityManager() == null) {
            return class_.getClassLoader();
        }
        return (ClassLoader)AccessController.doPrivileged(new Class_15083(class_));
    }

    static void Method_11174(long l, short s) {
        if (Field_11153) {
            Field_11150.putShort(l, s);
        } else if (Field_11154) {
            Class_11149.Method_11169(l, (byte)(s >>> (201 & 1576)));
            Class_11149.Method_11169(l + (4228204275662115911L & 1091830017L), (byte)s);
        } else {
            Class_11149.Method_11169(l + (1050649L & 144786209L), (byte)(s >>> (-32759 & 17448)));
            Class_11149.Method_11169(l, (byte)s);
        }
    }

    static void Method_11175(ByteBuffer byteBuffer) {
        Class_30211.Method_30216(byteBuffer);
    }

    static long Method_11176(Field field) {
        return Field_11150.objectFieldOffset(field);
    }

    static {
        Field field;
        Unsafe unsafe;
        Field_11151 = Class_10201.Method_10203(Class_11149.class);
        Field_11154 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? -32249 & 12385 : -22208 & 14;
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1 & -15977);
        try {
            field = Buffer.class.getDeclaredField(Class_11149.Method_11181("\u8081\u8080\u8082\u8082\u8085\u8085\u8087"));
            field.setAccessible((1163 & 545) != 0);
            if (field.getLong(ByteBuffer.allocate(30477 & 67)) != (1615339554L & 1404121587830358277L)) {
                field = null;
            } else if (field.getLong(byteBuffer) == (138478122L & 396898372L)) {
                field = null;
            }
        }
        catch (Throwable throwable) {
            field = null;
        }
        Field_11151.Method_6114(Class_11149.Method_11197("\u4040\u4042\u4046\u4040\u4004\u4044\u4040\u4046\u400c\u4068\u404c\u404e\u404c\u404e\u404a\u400e\u4052\u4056\u4054\u4052\u4056\u4050\u4052\u4012\u401a\u4058\u405c"), field != null ? Class_11149.Method_11162("\u4000\u4001\u4002\u4003\u4000\u4001\u4002\u4003\u4000") : Class_11149.Method_11178("\u1201\u1208\u1201\u1200\u1205\u120d\u120c\u1205\u1208\u1200\u1209"));
        if (field != null) {
            try {
                Field field2 = Unsafe.class.getDeclaredField(Class_11149.Method_11156("\u3840\u385d\u3850\u3861\u385c\u3841\u3850\u3855\u3858"));
                field2.setAccessible((-30525 & 25873) != 0);
                unsafe = (Unsafe)field2.get(null);
                Field_11151.Method_6114(Class_11149.Method_11155("\uc008\uc008\uc003\uc003\uc000\uc000\uc00a\uc00a\uc009\uc020\uc00b\uc002\uc000\uc001\uc002\uc00b\uc009\uc001\uc00a\uc02a\uc001\uc008\uc00a\uc00b\uc000\uc009\uc003\uc00a\uc008"), unsafe != null ? Class_11149.Method_11180("\u0402\u0404\u0400\u0401\u0403\u0407\u0407\u0400\u040e") : Class_11149.Method_11160("\u108c\u1085\u1088\u108d\u108c\u1085\u1080\u108d\u1080\u108d\u1084"));
                try {
                    if (unsafe != null) {
                        Class[] arrclass = new Class[1029 & 24965];
                        arrclass[4352 & -30492] = Object.class;
                        arrclass[19009 & -32639] = Long.TYPE;
                        arrclass[3074 & 8611] = Object.class;
                        arrclass[9219 & 2435] = Long.TYPE;
                        arrclass[-32236 & 20550] = Long.TYPE;
                        unsafe.getClass().getDeclaredMethod(Class_11149.Method_11170("\u0a8c\u0a80\u0a9d\u0a94\u0aa0\u0a88\u0a80\u0a80\u0a9d\u0a94"), arrclass);
                        Field_11151.Method_6130(Class_11149.Method_11191("\u0000\u0004\u001c\u001c\u0018\u001c\u0004\u0014\u0014\f\u0014\b\u001c\u0018\u0018\u0010\u0000\f\u0010\u0018\b\u0000\b\b\u0018\u0010\u0010\b\f\u0018\f\u0004\u001c\u0010\u0010\u001c\u0010"));
                    }
                }
                catch (NoSuchMethodError noSuchMethodError) {
                    Field_11151.Method_6130(Class_11149.Method_11177("\u0900\u0903\u0910\u0911\u0912\u0913\u0900\u0911\u0910\u0923\u0910\u0901\u0912\u0911\u0912\u0911\u0910\u0911\u0902\u0903\u0932\u0913\u0912\u0911\u0900\u0903\u0900\u0913\u0902\u0911\u0912\u0901\u0932\u0933\u0932\u0933\u0930\u0933\u0932"));
                    throw noSuchMethodError;
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    Field_11151.Method_6130(Class_11149.Method_11184("\u0a5c\u0a59\u0a41\u0a00\u0a40\u0a45\u0a5c\u0a4d\u0a09\u0a71\u0a49\u0a55\u0a44\u0a40\u0a40\u0a08\u0a4c\u0a41\u0a5d\u0a55\u0a60\u0a49\u0a40\u0a41\u0a55\u0a5d\u0a1d\u0a04\u0a50\u0a48\u0a44\u0a50\u0a6c\u0a65\u0a61\u0a6d\u0a6d\u0a60\u0a68"));
                    throw noSuchMethodException;
                }
            }
            catch (Throwable throwable) {
                unsafe = null;
            }
        } else {
            unsafe = null;
        }
        Field_11150 = unsafe;
        if (unsafe == null) {
            Field_11152 = -1L & -1L;
            Field_11153 = -19392 & 793;
        } else {
            boolean bl;
            Field_11152 = Class_11149.Method_11176(field);
            try {
                Class<?> class_ = Class.forName(Class_11149.Method_11193("\u0000\b\u001c\b@\u0000\u0004\u0000L\u0000\b\u0014\u0014"), (8 & 24883) != 0, ClassLoader.getSystemClassLoader());
                Method method = class_.getDeclaredMethod(Class_11149.Method_11172("\u2cf1\u2ce0\u2ce1\u2ce0\u2ce1\u2ce1\u2ce0\u2ce1\u2ce8"), new Class[-32567 & 3620]);
                method.setAccessible((4097 & 3091) != 0);
                bl = Boolean.TRUE.equals(method.invoke(null, new Object[-32750 & 864]));
            }
            catch (Throwable throwable) {
                String string = Class_16591.Method_16596(Class_11149.Method_11189("\u0850\u0840\u0810\u0850\u0840\u0850\u0850"), "");
                bl = string.matches(Class_11149.Method_11190("\u0401\u0422\u0420\u0403\u0420\u0423\u0423\u0401\u042b\u0428\u0429\u0428\u042b\u0428\u0429\u040b\u0421\u0422\u0420\u0423\u0423\u0422\u0423\u0420\u042b\u042b\u0428\u0428\u0429\u042a\u0428\u0428"));
            }
            Field_11153 = bl;
            Field_11151.Method_6114(Class_11149.Method_11188("\u0194\u0195\u0182\u0197\u01d0\u0191\u0196\u0193\u01d0\u0195\u0196\u0183\u0184\u01d1\u0182\u0193\u0184\u0181\u0186\u0183\u0180\u0181\u0182\u01d7\u01c4\u0195\u0192"), Field_11153);
        }
    }

    private static String Method_11177(String string) {
        int n = 20167;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_11149() {
    }

    private static String Method_11178(String string) {
        int n = 9907;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static short Method_11179(long l) {
        if (Field_11153) {
            return Field_11150.getShort(l);
        }
        if (Field_11154) {
            return (short)(Class_11149.Method_11161(l) << (-32632 & 2092) | Class_11149.Method_11161(l + (1077941257L & 3504177041958617761L)) & (-32513 & 7679));
        }
        return (short)(Class_11149.Method_11161(l + (75534861L & 1480861699L)) << (25352 & 6153) | Class_11149.Method_11161(l) & (17407 & -23297));
    }

    private static String Method_11180(String string) {
        int n = 19974;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11181(String string) {
        int n = 31646;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static void Method_11182(Throwable throwable) {
        Field_11150.throwException(throwable);
    }

    static long Method_11183() {
        return Field_11150.arrayBaseOffset(byte[].class);
    }

    private static String Method_11184(String string) {
        int n = 23065;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static int Method_11185(long l) {
        if (Field_11153) {
            return Field_11150.getInt(l);
        }
        if (Field_11154) {
            return Class_11149.Method_11161(l) << (668 & 6426) | (Class_11149.Method_11161(l + (-6579091456466599615L & 591036569L)) & (4607 & -23297)) << (-30381 & 24720) | (Class_11149.Method_11161(l + (7368236744388398243L & 629186578L)) & (2303 & -15617)) << (8217 & -9336) | Class_11149.Method_11161(l + (2116864515L & 8401219L)) & (2303 & 6143);
        }
        return Class_11149.Method_11161(l + (-2782216745820583897L & 545390595L)) << (1625 & 24) | (Class_11149.Method_11161(l + (-8747305754152665086L & 8747305753725388294L)) & (767 & 20991)) << (4176 & 16437) | (Class_11149.Method_11161(l + (1854156543747885633L & 601882787L)) & (-32257 & 4351)) << (17482 & -22504) | Class_11149.Method_11161(l) & (15103 & -32513);
    }

    static long Method_11186(long l) {
        if (Field_11153) {
            return Field_11150.getLong(l);
        }
        if (Field_11154) {
            return (long)Class_11149.Method_11161(l) << (-32579 & 14136) | ((long)Class_11149.Method_11161(l + (5737442645708386313L & -5737442647274651135L)) & (-3998933518108319489L & 3998933517266408703L)) << (8561 & -15824) | ((long)Class_11149.Method_11161(l + (5425895944682213526L & -5425895945965270013L)) & (-7177383713968043521L & 1107305215L)) << (21608 & 2092) | ((long)Class_11149.Method_11161(l + (16794151L & 3805537366840444931L)) & (1342718975L & 220332287L)) << (1140 & -23904) | ((long)Class_11149.Method_11161(l + (5343775898812549654L & -5343775900682903283L)) & (1914837247L & 5140040296030044415L)) << (24602 & -32356) | ((long)Class_11149.Method_11161(l + (135987215L & 1646273477L)) & (2045255486303944959L & -2045255487099435521L)) << (24692 & -28270) | ((long)Class_11149.Method_11161(l + (329862L & 7207366333663544878L)) & (-531395009706949633L & 605028607L)) << (-32743 & 17772) | (long)Class_11149.Method_11161(l + (1082995735L & 403833383L)) & (1086595327L & 169886207L);
        }
        return (long)Class_11149.Method_11161(l + (134363399L & 1384480983L)) << (18490 & 121) | ((long)Class_11149.Method_11161(l + (10621318L & -4484591871556828657L)) & (202966015L & 1963785694004422911L)) << (-27856 & 26684) | ((long)Class_11149.Method_11161(l + (1634018063L & -5423603358725291003L)) & (16795135L & 8449176452908688127L)) << (31656 & -32711) | ((long)Class_11149.Method_11161(l + (1342717956L & 48437454L)) & (-907536053470755841L & 1342284031L)) << (20716 & 2098) | ((long)Class_11149.Method_11161(l + (83247203L & 167779459L)) & (676327214860026111L & -676327215904443905L)) << (12312 & 2106) | ((long)Class_11149.Method_11161(l + (2687507L & -3163041361649565302L)) & (7188024460116100607L & -7188024461486980865L)) << (15152 & -32688) | ((long)Class_11149.Method_11161(l + (-4383814346635606501L & 942170113L)) & (1148190975L & -2675578973155818753L)) << (-32662 & 904) | (long)Class_11149.Method_11161(l) & (445120767L & 8048026541822689535L);
    }

    static long Method_11187(ByteBuffer byteBuffer) {
        return Class_11149.Method_11165(byteBuffer, Field_11152);
    }

    private static String Method_11188(String string) {
        int n = 30834;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11189(String string) {
        int n = 17537;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11190(String string) {
        int n = 21547;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_11191(String string) {
        int n = 8535;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static void Method_11192(Object object, long l, Object object2, long l2, long l3) {
        while (l3 > (50364673L & 1076240420L)) {
            long l4 = Math.min(l3, -8254456401603550894L & 34621989L);
            Field_11150.copyMemory(object, l, object2, l2, l4);
            l3 -= l4;
            l += l4;
            l2 += l4;
        }
    }

    private static String Method_11193(String string) {
        int n = 28358;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static int Method_11194() {
        return Field_11150.addressSize();
    }

    static void Method_11195(long l, long l2) {
        if (Field_11153) {
            Field_11150.putLong(l, l2);
        } else if (Field_11154) {
            Class_11149.Method_11169(l, (byte)(l2 >>> (21690 & -30600)));
            Class_11149.Method_11169(l + (-6645877840437833073L & 591529217L), (byte)(l2 >>> (49 & 1520)));
            Class_11149.Method_11169(l + (-7584837429749284862L & 1107822898L), (byte)(l2 >>> (1004 & 4136)));
            Class_11149.Method_11169(l + (6082657283276288007L & -6082657283710255069L), (byte)(l2 >>> (-24399 & 6496)));
            Class_11149.Method_11169(l + (1686143044L & 4276268L), (byte)(l2 >>> (8732 & 3448)));
            Class_11149.Method_11169(l + (545285061L & 157389831L), (byte)(l2 >>> (3152 & 16953)));
            Class_11149.Method_11169(l + (-6319697428603584506L & 1136671807L), (byte)(l2 >>> (22281 & 2076)));
            Class_11149.Method_11169(l + (1074528359L & 243471L), (byte)l2);
        } else {
            Class_11149.Method_11169(l + (547620039L & -4507319107567599609L), (byte)(l2 >>> (894 & 2104)));
            Class_11149.Method_11169(l + (1352326L & -5327541251897424826L), (byte)(l2 >>> (1076 & -24328)));
            Class_11149.Method_11169(l + (-1356743697653290907L & 1356743695948842775L), (byte)(l2 >>> (5225 & 680)));
            Class_11149.Method_11169(l + (5330001483226484740L & 437421732L), (byte)(l2 >>> (20513 & -32474)));
            Class_11149.Method_11169(l + (-3797628078766886861L & 3797628078740472067L), (byte)(l2 >>> (-32551 & 11032)));
            Class_11149.Method_11169(l + (-6789157566123703758L & 134228227L), (byte)(l2 >>> (20496 & 9621)));
            Class_11149.Method_11169(l + (5430751011901841409L & -5430751013306481203L), (byte)(l2 >>> (8236 & 4121)));
            Class_11149.Method_11169(l, (byte)l2);
        }
    }

    static AtomicReferenceFieldUpdater Method_11196(Class class_, String string) {
        return new Class_21214(Field_11150, class_, string);
    }

    private static String Method_11197(String string) {
        int n = 26128;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11149.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

