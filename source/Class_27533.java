/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_27533
implements Class_1486 {
    private UUID Field_27534;
    private int Field_27535;

    private static String Method_27536(String string) {
        int n = 1195;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27533.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_27537(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_27533.Method_27536("\u806c\u807c\u8062\u8038\u8074\u806c\u807a\u8070\u807c\u8038\u8068\u8078\u8072\u8070\u807c\u806c\u8070\u8028\u8070\u806c")));
    }

    public void Method_27538(Class_10954 class_10954) {
        this.Method_27541((Class_19025)class_10954);
    }

    public Class_27533() {
    }

    private static String Method_27539(String string) {
        int n = 333;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27533.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_27540(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_27535);
        class_29900.Method_29957(this.Field_27534.getMostSignificantBits());
        class_29900.Method_29957(this.Field_27534.getLeastSignificantBits());
    }

    public void Method_27541(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_27533.Method_27543("\u0110\u0101\u011e\u0105\u010c\u0115\u0102\u0109\u0100\u0105\u0114\u0105\u010a\u0109\u0104\u0115\u010c\u0115\u010c\u0111")));
    }

    private void Method_27542() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_27533.Method_27539("\u9084\u9082\u9087\u9081\u9081\u9084\u9085\u9086\u9087\u9086\u9083\u9082\u9086\u9086"));
    }

    public Class_27533(int n, UUID uUID) {
        this.Field_27535 = n;
        this.Field_27534 = uUID;
    }

    private static String Method_27543(String string) {
        int n = 28303;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27533.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

