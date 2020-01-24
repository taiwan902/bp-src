/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24796
implements Class_1486 {
    public byte[] Field_24797;

    private static String Method_24798(String string) {
        int n = 9294;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24796.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24799(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_24796.Method_24805("\u3000\u3001\u3000\u3001\u3000\u3001\u3000\u3001\u3008\u3009\u3008\u3009\u3008\u3009\u3008\u3009\u3010\u3011\u3010\u3011")));
    }

    public void Method_24800(Class_29900 class_29900) {
        class_29900.Method_29934(4368 & 8276);
        class_29900.Method_29903(this.Field_24797);
    }

    private static String Method_24801(String string) {
        int n = 759;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24796.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24802(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_24796.Method_24798("\uc504\uc514\uc502\uc512\uc510\uc500\uc516\uc516\uc51c\uc518\uc50a\uc51a\uc51c\uc51c\uc51a\uc50a\uc510\uc500\uc512\uc506")));
    }

    private void Method_24803() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_24796.Method_24801("\u3402\u3400\u3432\u3400\u3422\u3422\u3430\u3422\u3428\u3428\u341a\u342a\u3428\u3428"));
    }

    public void Method_24804(Class_10954 class_10954) {
        this.Method_24799((Class_19025)class_10954);
    }

    public Class_24796() {
        if (Class_18.Field_89 == null) {
            return;
        }
        this.Field_24797 = Class_18.Field_89.Field_38;
    }

    public Class_24796(byte[] arrby) {
        this.Field_24797 = arrby;
    }

    private static String Method_24805(String string) {
        int n = 23228;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24796.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

