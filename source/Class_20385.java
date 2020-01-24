/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_20385 {
    public static final Class_20385 Field_20386;
    private final Throwable Field_20387;
    public static final Class_20385 Field_20388;
    protected static final Class_20861 Field_20389;
    protected static final Class_20861 Field_20390;

    static {
        Field_20390 = Class_20861.Method_20865(Class_20385.class.getName() + Class_20385.Method_20393("\u0430\u0401\u0412\u0413\u0410\u0415\u0412\u0403\u041c\u0419\u041a"));
        Field_20389 = Class_20861.Method_20865(Class_20385.class.getName() + Class_20385.Method_20394("\u0401\u0414\u0410\u0406\u0400\u0406\u0412\u0412"));
        Field_20386 = new Class_20385(Field_20390);
        Field_20388 = new Class_20385(Field_20389);
    }

    public boolean Method_20391() {
        return (this.Field_20387 != Field_20390 ? -16085 & 7169 : -31664 & 10276) != 0;
    }

    protected Class_20385(Throwable throwable) {
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        this.Field_20387 = throwable;
    }

    public static Class_20385 Method_20392(Throwable throwable) {
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        return new Class_20385(throwable);
    }

    private static String Method_20393(String string) {
        int n = 32600;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20385.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20394(String string) {
        int n = 595;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20385.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Throwable Method_20395() {
        if (this.Method_20398()) {
            return this.Field_20387;
        }
        return null;
    }

    public String Method_20396() {
        if (this.Method_20391()) {
            if (this.Method_20399()) {
                return "success";
            }
            String string = this.Method_20395().toString();
            StringBuilder stringBuilder = new StringBuilder(string.length() + (665 & -19437));
            stringBuilder.append("failure(");
            stringBuilder.append(string);
            stringBuilder.append((char)(-28375 & 635));
            return stringBuilder.toString();
        }
        return "unfinished";
    }

    private void Method_20397() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_20398() {
        return (this.Field_20387 != Field_20389 && this.Field_20387 != Field_20390 ? -28541 & 125 : 0 & 19604) != 0;
    }

    public boolean Method_20399() {
        return (this.Field_20387 == Field_20389 ? 1057 & 2059 : 24587 & 1664) != 0;
    }
}

