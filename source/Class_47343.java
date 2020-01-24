/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47343
extends Class_40019 {
    private static final Class_2080 Field_47344 = new Class_2080(Class_47343.Method_47345("\u2482\u2483\u2488\u2481\u2482\u2481\u2480\u2483\u2488\u2483\u248a\u2481\u248a\u2483\u2488\u248b\u2480\u2483\u2480\u2489\u2482\u2489\u2480\u248b\u2480"));

    private static String Method_47345(String string) {
        int n = 29462;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47343.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_47346(Class_38719 class_38719, float f, float f2, float f3) {
        float f4 = class_38719.Field_38720 + (class_38719.Field_38725 - class_38719.Field_38720) * f3;
        float f5 = class_38719.Field_38730 + (class_38719.Field_38723 - class_38719.Field_38730) * f3;
        Class_16867.Method_16943(0.0f, 0.09615385f * 5.2f, 0.0f);
        Class_16867.Method_16940(80.0f * 2.25f - f2, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(f4, 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16940(f5, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16943(0.0f, 1.8611112f * -0.6447761f, 0.0f);
    }

    protected Class_2080 Method_47347(Class_38719 class_38719) {
        return Field_47344;
    }

    protected float Method_47348(Class_38719 class_38719, float f) {
        return class_38719.Field_38731 + (class_38719.Field_38732 - class_38719.Field_38731) * f;
    }

    protected void Method_47349(Class_859 class_859, float f, float f2, float f3) {
        this.Method_47346((Class_38719)class_859, f, f2, f3);
    }

    protected Class_2080 Method_47350(Class_1061 class_1061) {
        return this.Method_47347((Class_38719)class_1061);
    }

    private void Method_47351() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_47343(Class_8491 class_8491, Class_33781 class_33781, float f) {
        super(class_8491, class_33781, f);
    }

    protected float Method_47352(Class_859 class_859, float f) {
        return this.Method_47348((Class_38719)class_859, f);
    }
}

