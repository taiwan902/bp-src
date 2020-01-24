/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32118 {
    public static final char[] Field_32119 = Class_32118.Method_32121("\u1400\u1400\u1400\u1400\u1400\u1400\u1400\u1400\u1408\u1408\u1458\u1458\u1458\u1458\u1458\u1458").toCharArray();

    private void Method_32120() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_32121(String string) {
        int n = 4509;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32118.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static String Method_32122(byte[] arrby) {
        char[] arrc = new char[arrby.length * (450 & 11834)];
        for (int i = 12292 & 1025; i < arrby.length; ++i) {
            arrc[i * (1043 & 6790)] = Field_32119[arrby[i] >> (132 & 27910) & (1039 & 16543)];
            arrc[i * (16978 & 8203) + (25989 & -30189)] = Field_32119[arrby[i] & (18447 & -20129)];
        }
        return new String(arrc);
    }
}

