/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30840
extends Class_27380 {
    private static final Class_2080 Field_30841 = new Class_2080(Class_30840.Method_30844("\u0488\u0499\u0486\u048a\u048d\u0488\u049f\u048b\u0491\u0499\u0492\u048a\u0491\u048c\u0483\u0497\u0489\u0480\u048a\u048b\u0498\u0489\u049a\u0493\u049d\u0498\u048f\u0482\u0485\u048d\u0486\u048e\u0499\u048c\u049f\u048e\u0481\u0489\u048e\u049b\u0490\u0490\u048e\u0492\u049d"));
    private Class_33781 Field_30842 = new Class_35901(0.0f, (39 & -27647) != 0);

    protected Class_2080 Method_30843(Class_1061 class_1061) {
        return this.Method_30848((Class_14845)class_1061);
    }

    private static String Method_30844(String string) {
        int n = 6904;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30840.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_30845(Class_14845 class_14845, double d, double d2, double d3, float f, float f2) {
        float f3 = (float)class_14845.Field_14847 + f2;
        Class_16867.Method_16961();
        Class_16867.Method_16943((float)d, (float)d2, (float)d3);
        this.\u0000strictfp(Field_30841);
        float f4 = Class_13337.Method_13370(f3 * (0.12307692f * 1.625f)) / 2.0f + 1.0659341f * 0.46907216f;
        f4 = f4 * f4 + f4;
        this.Field_30842.Method_33794(class_14845, 0.0f, f3 * (3.6666667f * 0.8181818f), f4 * (0.036842108f * 5.428571f), 0.0f, 0.0f, 0.57894737f * 0.10795455f);
        Class_16867.Method_16945();
        super.Method_27403(class_14845, d, d2, d3, f, f2);
    }

    private void Method_30846() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_30847(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_30845((Class_14845)class_1061, d, d2, d3, f, f2);
    }

    protected Class_2080 Method_30848(Class_14845 class_14845) {
        return Field_30841;
    }

    public Class_30840(Class_8491 class_8491) {
        super(class_8491);
        this.\u0000, ` = 0.82f * 0.6097561f;
    }
}

