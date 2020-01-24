/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23413
implements Class_1486 {
    private String Field_23414;
    private boolean Field_23415;

    public void Method_23416(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_23413.Method_23419("\u6563\u6562\u6561\u6523\u6563\u6562\u6561\u6562\u656a\u652b\u656b\u656a\u6568\u656a\u656a\u656b\u6562\u6523\u6563\u6563")));
    }

    private static String Method_23417(String string) {
        int n = 7861;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23413.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_23418(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_23413.Method_23420("\u0014\u0004\u001a\u0003\f\u0014\u0002\n\r\t\u001a\n\u0001\u0000\u000f\u001f\u0019\u0001\u001a\u0007")));
    }

    public Class_23413() {
    }

    private static String Method_23419(String string) {
        int n = 651;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23413.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23420(String string) {
        int n = 16650;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23413.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_23413(boolean bl, String string) {
        this.Field_23414 = string;
        this.Field_23415 = bl;
    }

    public void Method_23421(Class_10954 class_10954) {
        this.Method_23416((Class_19025)class_10954);
    }

    private void Method_23422() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_23413.Method_23417("\u4007\u4000\u4004\u4003\u4002\u4006\u4006\u4004\u4004\u4004\u4000\u4000\u4005\u4004"));
    }

    public void Method_23423(Class_29900 class_29900) {
        class_29900.Method_29980(this.Field_23415);
        class_29900.Method_29960(this.Field_23414);
    }
}

