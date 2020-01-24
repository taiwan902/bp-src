/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43218
extends Class_42218 {
    private int Field_43219;
    private int Field_43220;
    private static final Class_2080 Field_43221 = new Class_2080(Class_43218.Method_43224("\u4242\u4252\u4240\u4241\u4247\u4245\u4255\u4246\u4211\u4243\u4251\u4243\u4246\u4256\u4257\u4255\u4243\u4200\u4242\u4242\u4245\u4257\u4254\u4257\u4243\u4241\u4250\u4203\u4256\u4245\u4247"));
    private Class_34695 Field_43222;

    protected Class_43218(Class_34695 class_34695, Class_283 class_283, double d, double d2, double d3) {
        super(class_283, d, d2, d3, 0.0, 0.0, 0.0);
        this.Field_43222 = class_34695;
        this.\u0000switch = 0.0;
        this.\u0000= ` = 0.0;
        this.\u0000%(0.0);
        this.Field_43219 = 16616 & 2764;
    }

    public void Method_43223() {
        this.Field_43220 += 4305 & 1291;
        if (this.Field_43220 == this.Field_43219) {
            this.\u0000break();
        }
    }

    private static String Method_43224(String string) {
        int n = 24919;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43218.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_43225() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_43226() {
        return 611 & 3075;
    }

    public void Method_43227(Class_22385 class_22385, Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8 = ((float)this.Field_43220 + f) / (float)this.Field_43219;
        if ((f7 = 2.0f - (f8 *= f8) * 2.0f) > 1.0f) {
            f7 = 1.0f;
        }
        Class_16867.Method_16931();
        float f9 = 1.1234568f * 0.11126373f;
        float f10 = (float)(this.\u0000= package - \u0000, `);
        float f11 = (float)(this.\u0000, for() - \u0000= final);
        float f12 = (float)(this.\u0000= switch - \u0000strictfp);
        float f13 = this.\u0000strictfp.Method_397(new Class_4751(this));
        this.Field_43222.Method_34707(Field_43221);
        Class_16867.Method_16947();
        Class_16867.Method_16951(2858 & -26874, 4947 & 779);
        class_22385.Method_22417(26719 & 1543, Class_29585.Field_29586);
        class_22385.Method_22443(f10 - 1.1147541f * 0.112132356f, f11, f12 + 1.013889f * 0.12328767f).Method_22433(0.0, 1.0).Method_22427(f13, f13, f13, f7 *= 0.003076923f * 65.0f).Method_22451();
        class_22385.Method_22443(f10 + 0.16666667f * 0.75f, f11, f12 + 0.09926471f * 1.2592592f).Method_22433(1.0, 1.0).Method_22427(f13, f13, f13, f7).Method_22451();
        class_22385.Method_22443(f10 + 0.049418606f * 2.5294118f, f11, f12 - 1.84f * 0.06793478f).Method_22433(1.0, 0.0).Method_22427(f13, f13, f13, f7).Method_22451();
        class_22385.Method_22443(f10 - 0.27155173f * 0.46031746f, f11, f12 - 0.13157895f * 0.95f).Method_22433(0.0, 0.0).Method_22427(f13, f13, f13, f7).Method_22451();
        Class_7644.Method_7649().Method_7647();
        Class_16867.Method_16952();
        Class_16867.Method_16918();
    }
}

