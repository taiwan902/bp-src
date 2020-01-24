/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43961
extends Class_40019 {
    private static final Class_2080 Field_43962 = new Class_2080(Class_43961.Method_43971("\u6c00\u6c10\u6c0c\u6c00\u6c04\u6c00\u6c14\u6c00\u6c18\u6c10\u6c18\u6c00\u6c18\u6c04\u6c08\u6c1c\u6c04\u6c18\u6c1c\u6c18\u6c14\u6c1c\u6c00\u6c1c\u6c1c\u6c18\u6c10\u6c18\u6c00\u6c1c\u6c14"));

    protected Class_2080 Method_43963(Class_1061 class_1061) {
        return this.Method_43964((Class_35570)class_1061);
    }

    protected Class_2080 Method_43964(Class_35570 class_35570) {
        return Field_43962;
    }

    public void Method_43965(Class_35570 class_35570, double d, double d2, double d3, float f, float f2) {
        this.\u0000, ` = 0.01875f * 13.333333f * (float)class_35570.Method_35584();
        super.Method_40029(class_35570, d, d2, d3, f, f2);
    }

    private void Method_43966() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_43967(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_43965((Class_35570)class_1061, d, d2, d3, f, f2);
    }

    protected void Method_43968(Class_35570 class_35570, float f) {
        float f2 = class_35570.Method_35584();
        float f3 = (class_35570.Field_35571 + (class_35570.Field_35572 - class_35570.Field_35571) * f) / (f2 * (3.2777777f * 0.15254238f) + 1.0f);
        float f4 = 1.0f / (f3 + 1.0f);
        Class_16867.Method_16973(f4 * f2, 1.0f / f4 * f2, f4 * f2);
    }

    public void Method_43969(Class_859 class_859, double d, double d2, double d3, float f, float f2) {
        this.Method_43965((Class_35570)class_859, d, d2, d3, f, f2);
    }

    protected void Method_43970(Class_859 class_859, float f) {
        this.Method_43968((Class_35570)class_859, f);
    }

    private static String Method_43971(String string) {
        int n = 25443;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43961.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_43972(Class_34093 class_34093, double d, double d2, double d3, float f, float f2) {
        this.Method_43965((Class_35570)class_34093, d, d2, d3, f, f2);
    }

    public Class_43961(Class_8491 class_8491, Class_33781 class_33781, float f) {
        super(class_8491, class_33781, f);
        this.\u0000strictfp((Class_7380)new Class_14956(this));
    }
}

