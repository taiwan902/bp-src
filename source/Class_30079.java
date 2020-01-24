/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30079
implements Class_1486 {
    public Class_1782 Field_30080;

    public void Method_30081(Class_29900 class_29900) {
        this.Field_30080 = class_29900.Method_30020();
    }

    private static String Method_30082(String string) {
        int n = 29336;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30079.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_30083(Class_10954 class_10954) {
        this.Method_30085((Class_19025)class_10954);
    }

    private void Method_30084() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_30079.Method_30082("\u2003\u2000\u2022\u2001\u2022\u2022\u2020\u2022\u2020\u2020\u2002\u2022\u2021\u2020"));
    }

    public void Method_30085(Class_19025 class_19025) {
        class_19025.Method_19065(this);
    }

    public void Method_30086(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_30079.Method_30087("\u2880\u2881\u2884\u2886\u2880\u2881\u2884\u2887\u2889\u288c\u288e\u288f\u288f\u288d\u288b\u288a\u2895\u2894\u2896\u2892")));
    }

    private static String Method_30087(String string) {
        int n = 18534;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30079.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

