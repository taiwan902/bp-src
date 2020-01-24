/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_29529
extends Class_24929 {
    private ArrayList Field_29530;

    public void Method_29531(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_29529.Method_29535("\u4460\u4461\u446c\u4424\u446c\u4465\u4460\u4469\u4461\u4424\u4464\u4465\u4469\u4469\u4465\u4464\u447d\u4434\u447c\u4470")));
    }

    private void Method_29532() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_29529.Method_29534("\u0f06\u0f01\u0f07\u0f00\u0f07\u0f03\u0f01\u0f03\u0f0d\u0f0d\u0f0b\u0f0b\u0f08\u0f09"));
    }

    public Class_29529() {
    }

    public void Method_29533(Class_10954 class_10954) {
        this.Method_29531((Class_19025)class_10954);
    }

    private static String Method_29534(String string) {
        int n = 31092;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_29529.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_29535(String string) {
        int n = 28462;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_29529.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_29536(String string) {
        int n = 13315;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_29529.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_29537(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_29529.Method_29536("\u3200\u3201\u3208\u3240\u320c\u3205\u3204\u320d\u3209\u3248\u3208\u3209\u3205\u3205\u320d\u320c\u3209\u3240\u3208\u3200")));
    }

    public Class_29529(ArrayList arrayList) {
        this.Field_29530 = arrayList;
    }

    public void Method_29538(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_29530.size());
        for (byte[][] arrby : this.Field_29530) {
            class_29900.Method_29946(arrby[12338 & 2117]);
            class_29900.Method_29946(arrby[10801 & 201]);
        }
    }
}

