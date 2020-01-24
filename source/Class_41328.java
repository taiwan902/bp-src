/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41328
extends Class_40019 {
    private static final Class_2080 Field_41329 = new Class_2080(Class_41328.Method_41336("\u080a\u080a\u0804\u0808\u080e\u0808\u080c\u080a\u0800\u080a\u0802\u0808\u0802\u080e\u0800\u0806\u0818\u0816\u081c\u081e\u081e\u0814\u081e\u0810\u081e\u081c\u0818\u0812\u081a\u0814\u081e"));
    private static final Class_2080 Field_41330 = new Class_2080(Class_41328.Method_41331("\u05d1\u05c0\u05d1\u05d1\u05d0\u05d3\u05c0\u05d2\u058a\u05c8\u05cb\u05d9\u05c8\u05d9\u05d8\u058a\u05c2\u05c1\u05c0\u05d2\u05d1\u0582\u05c2\u05c1\u05c8\u05da\u05d9\u05da\u05da\u05c9\u05ca\u05ca\u05f1\u05e0\u05e3\u05e2\u05a3\u05f1\u05e3\u05e2"));

    private static String Method_41331(String string) {
        int n = 12038;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41328.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_41332(Class_859 class_859, float f) {
        this.Method_41333((Class_46703)class_859, f);
    }

    protected void Method_41333(Class_46703 class_46703, float f) {
        float f2 = 1.0f;
        float f3 = (80.0f * 0.1f + f2) / 2.0f;
        float f4 = (10.625f * 0.7529412f + 1.0f / f2) / 2.0f;
        Class_16867.Method_16973(f4, f3, f4);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
    }

    protected Class_2080 Method_41334(Class_1061 class_1061) {
        return this.Method_41335((Class_46703)class_1061);
    }

    protected Class_2080 Method_41335(Class_46703 class_46703) {
        return class_46703.Method_46708() ? Field_41330 : Field_41329;
    }

    public Class_41328(Class_8491 class_8491) {
        super(class_8491, new Class_38781(), 0.6803279f * 0.73493975f);
    }

    private static String Method_41336(String string) {
        int n = 21432;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41328.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_41337() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

