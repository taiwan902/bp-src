/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43252
extends Class_40019 {
    private static final Class_2080 Field_43253 = new Class_2080(Class_43252.Method_43254("  $ $ $ `    $ d$ $ $d$   $$$ $d\u0004\u0000\u0000"));

    private static String Method_43254(String string) {
        int n = 15845;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43252.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_43255(Class_1061 class_1061) {
        return this.Method_43257((Class_36060)class_1061);
    }

    public Class_43252(Class_8491 class_8491) {
        super(class_8491, new Class_33864(), 1.439394f * 0.17368421f);
    }

    protected void Method_43256(Class_859 class_859, float f) {
        this.Method_43258((Class_36060)class_859, f);
    }

    protected Class_2080 Method_43257(Class_36060 class_36060) {
        return Field_43253;
    }

    protected void Method_43258(Class_36060 class_36060, float f) {
        int n = class_36060.\u0000= catch();
        float f2 = (class_36060.\u0000= final + (class_36060.\u0000strictfp - class_36060.\u0000= final) * f) / ((float)n * (0.09433962f * 5.3f) + 1.0f);
        float f3 = 1.0f / (f2 + 1.0f);
        float f4 = n;
        Class_16867.Method_16973(f3 * f4, 1.0f / f3 * f4, f3 * f4);
    }

    private void Method_43259() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

