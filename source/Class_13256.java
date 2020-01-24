/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_13256 {
    private Class_42711 Field_13257;
    protected static final Class_2080 Field_13258 = new Class_2080(Class_13256.Method_13260("\u0382\u0383\u0382\u0383\u0386\u0385\u0386\u0385\u0380\u0381\u0382\u0383\u0384\u0385\u0386\u0387\u0380\u0383\u0382\u0381\u0384\u0387\u0384\u0385"));

    public int Method_13259() {
        return this.Field_13257.Method_42719();
    }

    private static String Method_13260(String string) {
        int n = 11014;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13256.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_13261(int n, int n2) {
        this.Field_13257.\u0000, `(Class_18.Field_89, n, n2);
    }

    public Class_13256(int n, int n2, int n3, String string) {
        this.Field_13257 = new Class_42711(this, n, n2, n3, string);
    }

    public void Method_13262(int n, int n2) {
    }

    public void Method_13263(int n, int n2) {
    }

    private void Method_13264() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_13265(boolean bl) {
        return this.Field_13257.Method_42717(bl);
    }

    public void Method_13266(int n, int n2) {
    }

    public Class_42376 Method_13267() {
        return this.Field_13257;
    }
}

