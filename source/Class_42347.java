/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42347
extends Class_40019 {
    private static final Class_2080 Field_42348;
    private static final Class_2080 Field_42349;

    public void Method_42350(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_42360((Class_42901)class_1061, d, d2, d3, f, f2);
    }

    public Class_42347(Class_8491 class_8491) {
        super(class_8491, new Class_35605(0.0f), 1.0f);
        this.\u0000strictfp((Class_7380)new Class_10917(this));
    }

    protected void Method_42351(Class_859 class_859, float f) {
        this.Method_42358((Class_42901)class_859, f);
    }

    private static String Method_42352(String string) {
        int n = 11571;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42347.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_42353(String string) {
        int n = 21771;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42347.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_42354() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_2080 Method_42355(Class_42901 class_42901) {
        int n = class_42901.Method_42941();
        return n > 0 && (n > (4176 & 82) || n / (-13043 & 4613) % (6226 & 25638) != (327 & 29873)) ? Field_42349 : Field_42348;
    }

    public void Method_42356(Class_859 class_859, double d, double d2, double d3, float f, float f2) {
        this.Method_42360((Class_42901)class_859, d, d2, d3, f, f2);
    }

    static {
        Field_42349 = new Class_2080(Class_42347.Method_42353("\uc009\uc018\uc001\uc009\uc00c\uc00d\uc01c\uc00c\uc018\uc010\uc019\uc001\uc01c\uc005\uc00c\uc01c\uc018\uc000\uc019\uc001\uc00c\uc01d\uc004\uc01c\uc008\uc011\uc009\uc000\uc015\uc01c\uc00c\uc00d\uc029\uc028\uc031\uc031\uc03c\uc02d\uc03c\uc03d\uc039\uc030\uc039\uc021\uc03d\uc034"));
        Field_42348 = new Class_2080(Class_42347.Method_42352("\uc00c\uc01c\uc000\uc00c\uc008\uc00c\uc018\uc00c\uc014\uc01c\uc014\uc00c\uc014\uc008\uc004\uc010\uc01c\uc000\uc01c\uc000\uc008\uc01c\uc000\uc018\uc000\uc01c\uc000\uc00c\uc01c\uc000\uc01c\uc000\uc03c"));
    }

    public void Method_42357(Class_34093 class_34093, double d, double d2, double d3, float f, float f2) {
        this.Method_42360((Class_42901)class_34093, d, d2, d3, f, f2);
    }

    protected void Method_42358(Class_42901 class_42901, float f) {
        float f2 = 2.0f;
        int n = class_42901.Method_42941();
        if (n > 0) {
            f2 -= ((float)n - f) / (431.2f * 0.5102041f) * (1.4242425f * 0.35106382f);
        }
        Class_16867.Method_16973(f2, f2, f2);
    }

    protected Class_2080 Method_42359(Class_1061 class_1061) {
        return this.Method_42355((Class_42901)class_1061);
    }

    public void Method_42360(Class_42901 class_42901, double d, double d2, double d3, float f, float f2) {
        Class_14453.Method_14460(class_42901, (2821 & 13321) != 0);
        super.Method_40029(class_42901, d, d2, d3, f, f2);
    }
}

