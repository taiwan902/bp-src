/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_46874
extends Class_42218 {
    private float Field_46875;
    private static final Class_11885 Field_46876;
    private int Field_46877;
    private Class_34695 Field_46878;
    private int Field_46879;
    private static final Class_2080 Field_46880;

    public int Method_46881(float f) {
        return 51507440 & -1197018371;
    }

    public void Method_46882() {
        this.\u0000= final(this.\u0000= package);
        this.\u0000strictfp(this.\u0000, for());
        this.\u0000
        (this.\u0000= switch);
        this.Field_46877 += 28737 & 3235;
        if (this.Field_46877 == this.Field_46879) {
            this.\u0000break();
        }
    }

    static {
        Field_46880 = new Class_2080(Class_46874.Method_46884("\ua403\ua403\ua401\ua400\ua402\ua400\ua400\ua403\ua448\ua40b\ua40b\ua408\ua40a\ua40a\ua408\ua44b\ua412\ua412\ua411\ua410\ua410\ua411\ua410\ua413\ua419\ua458\ua419\ua41a\ua418"));
        Field_46876 = new Class_11885().Method_11897(Class_29585.Field_29587).Method_11897(Class_29585.Field_29594).Method_11897(Class_29585.Field_29603).Method_11897(Class_29585.Field_29592).Method_11897(Class_29585.Field_29590).Method_11897(Class_29585.Field_29589);
    }

    private void Method_46883() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_46874(Class_34695 class_34695, Class_283 class_283, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_283, d, d2, d3, 0.0, 0.0, 0.0);
        this.Field_46878 = class_34695;
        this.Field_46879 = (550 & -6050) + this.\u0000strictfp.nextInt(16452 & 5284);
        this.\u0000= switch = this.\u0000= int = this.\u0000strictfp.nextFloat() * (0.11111111f * 5.4f) + 0.48051947f * 0.83243245f;
        this.\u0000= final = this.\u0000= int;
        this.Field_46875 = 1.0f - (float)d4 * (1.9782608f * 0.25274727f);
    }

    private static String Method_46884(String string) {
        int n = 19322;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_46874.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_46885() {
        return 8195 & -32725;
    }

    public void Method_46886(Class_22385 class_22385, Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        int n = (int)(((float)this.Field_46877 + f) * (0.9183673f * 16.333334f) / (float)this.Field_46879);
        if (n <= (17551 & 4991)) {
            this.Field_46878.Method_34707(Field_46880);
            float f7 = (float)(n % (-28587 & 16900)) / (1.0649351f * 3.7560976f);
            float f8 = f7 + 12.737249f * 0.019607844f;
            float f9 = (float)(n / (71 & 132)) / (1.0625f * 3.764706f);
            float f10 = f9 + 0.1332f * 1.875f;
            float f11 = 2.0f * this.Field_46875;
            float f12 = (float)(this.\u0000%() + (this.\u0000= package - this.\u0000%()) * (double)f - \u0000, `);
            float f13 = (float)(this.\u0000= final() + (this.\u0000, for() - this.\u0000= final()) * (double)f - \u0000= final);
            float f14 = (float)(this.\u0000
            () + (this.\u0000= switch - this.\u0000
            ()) * (double)f - \u0000strictfp);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16931();
            Class_39477.Method_39484();
            class_22385.Method_22417(-24473 & 19463, Field_46876);
            class_22385.Method_22443(f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11).Method_22433(f8, f10).Method_22427(this.\u0000= final, this.\u0000= switch, this.\u0000= int, 1.0f).Method_22418(40 & -23792, 18422 & 4344).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
            class_22385.Method_22443(f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11).Method_22433(f8, f9).Method_22427(this.\u0000= final, this.\u0000= switch, this.\u0000= int, 1.0f).Method_22418(-32768 & 21195, 14588 & -16144).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
            class_22385.Method_22443(f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11).Method_22433(f7, f9).Method_22427(this.\u0000= final, this.\u0000= switch, this.\u0000= int, 1.0f).Method_22418(28676 & 96, 6897 & -16144).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
            class_22385.Method_22443(f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11).Method_22433(f7, f10).Method_22427(this.\u0000= final, this.\u0000= switch, this.\u0000= int, 1.0f).Method_22418(-28256 & 1030, -31244 & 2802).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
            Class_7644.Method_7649().Method_7647();
            Class_16867.Method_16918();
        }
    }
}

