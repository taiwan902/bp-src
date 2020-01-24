/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32460
implements Class_1486 {
    private static final byte[] Field_32461;

    public void Method_32462(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_32460.Method_32468("\u8210\u8201\u8216\u8204\u8200\u8211\u8206\u8205\u8201\u8204\u8214\u8205\u8207\u8205\u8201\u8210\u8205\u8214\u8204\u8210")));
    }

    public void Method_32463(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_32460.Method_32466("\u4042\u4042\u404a\u4000\u404a\u4042\u4042\u4048\u404a\u400a\u4048\u4048\u4040\u4042\u4048\u4048\u404a\u4002\u4048\u4040")));
    }

    public void Method_32464(Class_29900 class_29900) {
        class_29900.Method_29903(Field_32461);
    }

    public void Method_32465(Class_10954 class_10954) {
        this.Method_32463((Class_19025)class_10954);
    }

    private static String Method_32466(String string) {
        int n = 28734;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32460.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32467(String string) {
        int n = 6610;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32460.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_32468(String string) {
        int n = 19701;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32460.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        byte[] arrby = new byte[146 & 4710];
        arrby[-24512 & 16928] = 20861 & -31617;
        arrby[8755 & -30263] = 4347 & -16005;
        Field_32461 = arrby;
    }

    private void Method_32469() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_32460.Method_32467("\u0843\u0844\u0870\u0847\u0866\u0862\u0872\u0860\u0860\u0860\u0854\u0864\u0861\u0860"));
    }
}

