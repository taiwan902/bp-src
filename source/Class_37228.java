/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_37228
implements Class_1486 {
    public boolean Field_37229;
    public int Field_37230;
    public UUID Field_37231;
    public boolean Field_37232;

    public void Method_37233(Class_29900 class_29900) {
        this.Field_37230 = class_29900.Method_30004();
        this.Field_37231 = new UUID(class_29900.Method_30001(), class_29900.Method_30001());
        this.Field_37232 = class_29900.Method_29962();
        this.Field_37229 = class_29900.Method_29962();
    }

    private static String Method_37234(String string) {
        int n = 13910;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37228.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_37235() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_37228.Method_37238("\u2401\u2400\u2410\u2401\u2400\u2400\u2410\u2400\u2408\u2408\u2418\u2408\u2409\u2408"));
    }

    public void Method_37236(Class_10954 class_10954) {
        this.Method_37239((Class_19025)class_10954);
    }

    public void Method_37237(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_37228.Method_37234("\u2814\u2804\u281a\u2802\u280c\u2814\u2802\u280a\u2804\u2800\u2812\u2802\u2808\u2808\u2806\u2816\u2818\u2800\u281a\u2806")));
    }

    private static String Method_37238(String string) {
        int n = 11078;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37228.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_37239(Class_19025 class_19025) {
        class_19025.Method_19049(this);
    }
}

