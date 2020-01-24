/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_25356
implements Class_1486 {
    public int Field_25357;
    public ArrayList Field_25358 = new ArrayList();

    private static String Method_25359(String string) {
        int n = 25051;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25356.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_25360(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_25356.Method_25364("\u0168\u0179\u0162\u0139\u0170\u0169\u017a\u0171\u0170\u0131\u0160\u0171\u017a\u0179\u0170\u0161\u0170\u0129\u0170\u0169")));
    }

    public void Method_25361(Class_29900 class_29900) {
        this.Field_25357 = class_29900.Method_30004();
        int n = class_29900.Method_30004();
        for (int i = 65 & -14940; i < n; ++i) {
            this.Field_25358.add(class_29900.Method_29991(32767 & 32767));
        }
    }

    public void Method_25362(Class_10954 class_10954) {
        this.Method_25363((Class_19025)class_10954);
    }

    public void Method_25363(Class_19025 class_19025) {
        class_19025.Method_19044(this);
    }

    private static String Method_25364(String string) {
        int n = 16632;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25356.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_25365() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_25356.Method_25359("\u0b40\u0b42\u0b50\u0b42\u0b44\u0b44\u0b56\u0b44\u0b42\u0b42\u0b50\u0b40\u0b46\u0b46"));
    }
}

