/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47591
extends Class_40019 {
    protected float Field_47592;
    protected Class_35973 Field_47593;
    private static final Class_2080 Field_47594 = new Class_2080(Class_47591.Method_47598("\u4040\u4040\u4044\u4040\u4044\u4040\u4044\u4040\u4000\u4040\u4040\u4040\u4040\u4044\u4040\u4004\u4044\u4040\u4040\u4040\u4044\u4004\u4040\u4044\u4040"));

    public Class_47591(Class_8491 class_8491, Class_35973 class_35973, float f, float f2) {
        super(class_8491, class_35973, f);
        this.Field_47593 = class_35973;
        this.Field_47592 = f2;
        this.\u0000strictfp((Class_7380)new Class_23129(class_35973));
    }

    protected Class_2080 Method_47595(Class_34093 class_34093) {
        return Field_47594;
    }

    public Class_47591(Class_8491 class_8491, Class_35973 class_35973, float f) {
        this(class_8491, class_35973, f, 1.0f);
        this.\u0000strictfp((Class_7380)new Class_19353(this));
    }

    private void Method_47596() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_2080 Method_47597(Class_1061 class_1061) {
        return this.Method_47595((Class_34093)class_1061);
    }

    private static String Method_47598(String string) {
        int n = 22856;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47591.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_47599() {
        Class_16867.Method_16943(0.0f, 0.7285714f * 0.25735295f, 0.0f);
    }
}

