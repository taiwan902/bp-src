/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  sun.misc.Cleaner
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import sun.misc.Cleaner;

public final class Class_30211 {
    private static final long Field_30212;
    private static final Class_6113 Field_30213;

    private void Method_30214() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_30215(String string) {
        int n = 2126;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30211.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static void Method_30216(ByteBuffer byteBuffer) {
        if (Field_30212 == (-1L & -1L) || !byteBuffer.isDirect()) {
            return;
        }
        try {
            Cleaner cleaner = (Cleaner)Class_11149.Method_11157(byteBuffer, Field_30212);
            if (cleaner != null) {
                cleaner.clean();
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static String Method_30217(String string) {
        int n = 30280;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30211.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_30218(String string) {
        int n = 7511;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30211.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_30211() {
    }

    private static String Method_30219(String string) {
        int n = 19996;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30211.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_30213 = Class_10201.Method_10203(Class_30211.class);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(12291 & 1129);
        long l = -1L & -1L;
        if (Class_11149.Method_11163()) {
            try {
                Field field = byteBuffer.getClass().getDeclaredField(Class_30211.Method_30218("\u1830\u1835\u1836\u1833\u1830\u1831\u1826"));
                field.setAccessible((24585 & 705) != 0);
                Cleaner cleaner = (Cleaner)field.get(byteBuffer);
                cleaner.clean();
                l = Class_11149.Method_11176(field);
            }
            catch (Throwable throwable) {
                l = -1L & -1L;
            }
        }
        Field_30213.Method_6114(Class_30211.Method_30219("\u2264\u226f\u226a\u226d\u2220\u2261\u2264\u2263\u2220\u224d\u2264\u2269\u226a\u224d\u2268\u226b\u2268\u226b\u226e\u2223\u226c\u2263\u2268\u226d\u2260\u226b\u226e\u2225\u2226\u2225\u222c\u2267\u2242"), l != (-1L & -1L) ? Class_30211.Method_30215("\u8005\u8001\u8005\u800c\u800c\u8000\u8000\u800d\u8009") : Class_30211.Method_30217("\u0002\t\u0006\u0001\u0002\n\u000f\u0002\u0005\u000b\u0002"));
        Field_30212 = l;
        Class_30211.Method_30216(byteBuffer);
    }
}

