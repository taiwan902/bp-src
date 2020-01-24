/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_22186
implements Class_1486 {
    public int Field_22187;

    public Class_22186() {
    }

    public void Method_22188(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_22186.Method_22192("\u0902\u0913\u0908\u0913\u091a\u0903\u0910\u091b\u091a\u091b\u090a\u091b\u0910\u0913\u091a\u090b\u090a\u0913\u090a\u0913")));
    }

    public void Method_22189(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_22186.Method_22191("`an'lebkh-no`ano|5~s")));
    }

    public void Method_22190(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_22187);
    }

    public Class_22186(int n) {
        this.Field_22187 = n;
    }

    private static String Method_22191(String string) {
        int n = 17203;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22186.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_22192(String string) {
        int n = 24536;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22186.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_22193() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_22186.Method_22194("\ua210\ua219\ua220\ua219\ua234\ua23d\ua224\ua235\ua238\ua231\ua200\ua231\ua234\ua23d"));
    }

    private static String Method_22194(String string) {
        int n = 7270;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22186.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_22195(Class_10954 class_10954) {
        this.Method_22189((Class_19025)class_10954);
    }
}

