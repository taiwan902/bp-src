/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_21147
extends Enum {
    public static final /* enum */ Class_21147 Field_21148;
    public static final /* enum */ Class_21147 Field_21149;
    private static final Class_21147[] Field_21150;
    private static final Class_21147[] Field_21151;
    public static final /* enum */ Class_21147 Field_21152;

    private static String Method_21153(String string) {
        int n = 24602;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21147.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_21152 = new Class_21147(Class_21147.Method_21157("\u8028\u8020\u8032\u8032\u8038\u8028\u8022\u803a\u8028"), 76 & 25600, Class_21147.Method_21154("\u0628\u0623\u0622\u0621\u062e\u062d\u0626\u062f\u0628"), -7284 & 3072);
        Field_21149 = new Class_21147(Class_21147.Method_21159("\u7911\u791d\u791e\u791e\u7910\u7915\u791b\u790b\u790d\u7919\u7917\u790f\u7918"), -11209 & 265, Class_21147.Method_21153("\u4012\u4012\u4013\u4011\u4011\u4010\u4012\u4002\u4002\u4010\u4010\u4000\u4011"), -32661 & 513);
        Field_21148 = new Class_21147(Class_21147.Method_21160("\u2083\u2098\u2082\u208a\u209b\u2080\u2088\u208a\u2089\u209a\u2091\u2082\u2089\u2090\u2082"), 10502 & 1203, Class_21147.Method_21158("\u2142\u2140\u2141\u2140\u2142\u2140\u2143\u2140\u2140\u2142\u2142\u2140\u2140\u2140\u2141"), 9238 & -32726);
        Class_21147[] arrclass_21147 = new Class_21147[8331 & 17203];
        arrclass_21147[8196 & 4099] = Field_21152;
        arrclass_21147[10785 & -15091] = Field_21149;
        arrclass_21147[-32761 & 9506] = Field_21148;
        Field_21150 = arrclass_21147;
        Class_21147[] arrclass_211472 = new Class_21147[25679 & 259];
        arrclass_211472[-13312 & 4104] = Field_21152;
        arrclass_211472[17669 & 137] = Field_21149;
        arrclass_211472[-31077 & 354] = Field_21148;
        Field_21151 = arrclass_211472;
    }

    private static String Method_21154(String string) {
        int n = 14519;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21147.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_21147 Method_21155(String string) {
        return Enum.valueOf(Class_21147.class, string);
    }

    private void Method_21156() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_21157(String string) {
        int n = 19931;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21147.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21158(String string) {
        int n = 22912;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21147.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21159(String string) {
        int n = 7355;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21147.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21160(String string) {
        int n = 12891;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21147.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_21147[] Method_21161() {
        return (Class_21147[])Field_21150.clone();
    }
}

