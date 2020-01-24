/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27989
implements Class_1486 {
    private int Field_27990;
    private byte[] Field_27991;

    private void Method_27992() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_27989.Method_27998("\u1104\u1103\u1125\u1102\u1121\u1125\u1127\u1125\u1127\u1127\u1101\u1121\u1126\u1127"));
    }

    public void Method_27993(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_27990);
        class_29900.Method_29946(this.Field_27991);
    }

    private static String Method_27994(String string) {
        int n = 2283;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27989.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_27995(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_27989.Method_27994("\u0112\u0102\u0118\u0103\u010a\u0112\u0100\u010a\u010b\u010b\u011a\u010a\u0101\u0102\u010b\u011b\u011b\u0103\u011a\u0103")));
    }

    public void Method_27996(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_27989.Method_27999("\uc002\uc002\uc004\uc006\uc002\uc002\uc004\uc006\uc00a\uc00e\uc00e\uc00e\uc00c\uc00e\uc00a\uc00a\uc016\uc016\uc016\uc012")));
    }

    public Class_27989() {
    }

    public void Method_27997(Class_10954 class_10954) {
        this.Method_27996((Class_19025)class_10954);
    }

    private static String Method_27998(String string) {
        int n = 9089;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27989.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_27999(String string) {
        int n = 3338;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27989.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_27989(int n, byte[] arrby) {
        this.Field_27990 = n;
        this.Field_27991 = arrby;
    }
}

