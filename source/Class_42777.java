/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_42777
extends Class_42759 {
    private final Class_31224 Field_42778;

    private static String Method_42779(String string) {
        int n = 22310;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42777.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_42777(Class_31224 class_31224) {
        this.Field_42778 = class_31224;
    }

    private static String Method_42780(String string) {
        int n = 27365;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42777.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_42781(String string) {
        int n = 26966;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42777.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_42782(Class_39158 class_39158, Class_22553 class_22553, List list) {
        if (class_22553.Method_22564() != 0) {
            Class_29900 class_29900 = new Class_29900(class_22553);
            int n = class_29900.Method_30004();
            int n2 = class_29900.Method_30005();
            Class_1486 class_1486 = ((Class_11271)((Object)class_39158.Method_39175().attr(Class_44584.Field_44601).Method_34812())).Method_11289(this.Field_42778, n);
            if (class_1486 == null) {
                throw new IOException(Class_42777.Method_42780("\u0944\u0946\u0942\u0907\u0946\u0946\u0945\u094c\u094b\u094b\u090e\u0946\u094a\u090f") + n);
            }
            class_29900.Method_29963(n2);
            class_1486.Method_1487(class_29900);
            if (class_29900.Method_30014() > 0) {
                throw new IOException(Class_42777.Method_42781("\u7000\u7001\u7001\u7009\u7001\u7000\u7044") + ((Class_11271)((Object)class_39158.Method_39175().attr(Class_44584.Field_44601).Method_34812())).Method_11292() + Class_42777.Method_42779("\u0688") + n + Class_42777.Method_42785("\u1000\u1002\u1002\u1000\u1000\u1008\u1002\u1000\u100a\u1008\u1008\u100a\u1008\u1000\u100a\u1000\u1010\u1018\u1012\u1012\u1018\u1010\u1012\u1010\u1018\u1018\u101a\u1012\u1018\u101a\u1010\u101a\u102a\u1020\u1022") + class_29900.Method_30014() + Class_42777.Method_42783("\u2020\u2021\u202a\u2023\u2024\u2025\u2026\u2027\u2020\u2029\u202a\u202b\u202c\u202d\u2026\u2027\u2038\u2031\u2032\u2033\u2034\u2035\u2036\u2037\u2030\u2031\u203a\u203b\u203c\u203d\u203e\u2037\u2000\u2001\u2002") + n);
            }
            list.add(class_1486);
        }
    }

    private static String Method_42783(String string) {
        int n = 1422;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42777.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_42784() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_42777.Method_42786("\uc029\uc026\uc01a\uc025\uc00c\uc000\uc018\uc00a\uc002\uc00a\uc03e\uc00e\uc00b\uc002"));
    }

    private static String Method_42785(String string) {
        int n = 24405;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42777.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_42786(String string) {
        int n = 28911;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42777.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

