/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31951
implements Class_1486 {
    private boolean Field_31952;

    private static String Method_31953(String string) {
        int n = 3516;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31951.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_31954(Class_29900 class_29900) {
        class_29900.Method_29980(this.Field_31952);
    }

    public Class_31951() {
    }

    public void Method_31955(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_31951.Method_31953("\ua00b\ua00b\ua001\ua00a\ua007\ua00f\ua00d\ua007\ua002\ua002\ua003\ua003\ua00c\ua00f\ua006\ua006\ua002\ua00a\ua003\ua00a")));
    }

    public Class_31951(boolean bl) {
        this.Field_31952 = bl;
    }

    public void Method_31956(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_31951.Method_31957("\u4015\u4005\u4011\u4000\u4005\u4015\u4001\u4001\u4004\u4000\u4011\u4001\u4000\u4001\u4004\u4014\u4000\u4010\u4001\u4014")));
    }

    private static String Method_31957(String string) {
        int n = 3863;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31951.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_31958(String string) {
        int n = 2785;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31951.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_31959() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_31951.Method_31958("\u4a04\u4a00\u4a24\u4a00\u4a24\u4a20\u4a20\u4a20\u4a2c\u4a2c\u4a08\u4a28\u4a28\u4a28"));
    }

    public void Method_31960(Class_10954 class_10954) {
        this.Method_31955((Class_19025)class_10954);
    }
}

