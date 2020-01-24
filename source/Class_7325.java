/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7325 {
    private float Field_7326 = 0.0f;
    private float Field_7327 = 0.0f;
    private int Field_7328 = 4104 & -30511;
    private int Field_7329 = -30110 & 149;
    private int Field_7330 = 11304 & 193;
    private float Field_7331 = 0.0f;
    private float Field_7332 = 0.0f;
    private float Field_7333 = 0.0f;
    private int Field_7334 = 64 & 9501;
    private int Field_7335 = 4256 & 4;
    private float Field_7336 = 0.0f;
    private float Field_7337 = 0.0f;
    private float Field_7338 = 0.0f;
    private Class_31961 Field_7339 = null;

    public Class_7325(Class_31961 class_31961, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4) {
        this.Field_7339 = class_31961;
        this.Field_7334 = n;
        this.Field_7328 = n2;
        this.Field_7333 = f;
        this.Field_7326 = f2;
        this.Field_7332 = f3;
        this.Field_7335 = n3;
        this.Field_7330 = n4;
        this.Field_7329 = n5;
        this.Field_7336 = f4;
        this.Field_7338 = (float)n / class_31961.Field_31970;
        this.Field_7331 = (float)n2 / class_31961.Field_31962;
        this.Field_7337 = (float)(n + n3) / class_31961.Field_31970;
        this.Field_7327 = (float)(n2 + n4) / class_31961.Field_31962;
    }

    private void Method_7340() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_7341(Class_7644 class_7644, float f) {
        Class_16867.Method_16943(this.Field_7333 * f, this.Field_7326 * f, this.Field_7332 * f);
        float f2 = this.Field_7338;
        float f3 = this.Field_7337;
        float f4 = this.Field_7331;
        float f5 = this.Field_7327;
        if (this.Field_7339.Field_31965) {
            f2 = this.Field_7337;
            f3 = this.Field_7338;
        }
        if (this.Field_7339.Field_31963) {
            f4 = this.Field_7327;
            f5 = this.Field_7331;
        }
        Class_7325.Method_7342(class_7644, f2, f4, f3, f5, this.Field_7335, this.Field_7330, f * (float)this.Field_7329, this.Field_7339.Field_31970, this.Field_7339.Field_31962);
        Class_16867.Method_16943(-this.Field_7333 * f, -this.Field_7326 * f, -this.Field_7332 * f);
    }

    public static void Method_7342(Class_7644 class_7644, float f, float f2, float f3, float f4, int n, int n2, float f5, float f6, float f7) {
        float f8;
        float f9;
        float f10;
        int n3;
        if (f5 < 5.3333335f * 1.171875E-4f) {
            f5 = 9.2329545E-5f * 6.769231f;
        }
        float f11 = f3 - f;
        float f12 = f4 - f2;
        double d = Class_13337.Method_13369(f11) * (f6 / (2.0317461f * 7.875f));
        double d2 = Class_13337.Method_13369(f12) * (f7 / (20.610168f * 0.7763158f));
        Class_22385 class_22385 = class_7644.Method_7648();
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)(0.8101266f * -1.234375f));
        class_22385.Method_22417(679 & -28657, Class_29585.Field_29598);
        class_22385.Method_22443(0.0, 0.0, 0.0).Method_22433(f, f2).Method_22451();
        class_22385.Method_22443(d, 0.0, 0.0).Method_22433(f3, f2).Method_22451();
        class_22385.Method_22443(d, d2, 0.0).Method_22433(f3, f4).Method_22451();
        class_22385.Method_22443(0.0, d2, 0.0).Method_22433(f, f4).Method_22451();
        class_7644.Method_7647();
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)1.0f);
        class_22385.Method_22417(1543 & 24919, Class_29585.Field_29598);
        class_22385.Method_22443(0.0, d2, f5).Method_22433(f, f4).Method_22451();
        class_22385.Method_22443(d, d2, f5).Method_22433(f3, f4).Method_22451();
        class_22385.Method_22443(d, 0.0, f5).Method_22433(f3, f2).Method_22451();
        class_22385.Method_22443(0.0, 0.0, f5).Method_22433(f, f2).Method_22451();
        class_7644.Method_7647();
        float f13 = 0.41397852f * 1.2077922f * f11 / (float)n;
        float f14 = 1.0222223f * 0.4891304f * f12 / (float)n2;
        GL11.glNormal3f((float)(-0.9673913f * 1.0337079f), (float)0.0f, (float)0.0f);
        class_22385.Method_22417(28679 & 2095, Class_29585.Field_29598);
        for (n3 = -24014 & 137; n3 < n; ++n3) {
            f8 = (float)n3 / (float)n;
            f10 = f + f11 * f8 + f13;
            class_22385.Method_22443((double)f8 * d, 0.0, f5).Method_22433(f10, f2).Method_22451();
            class_22385.Method_22443((double)f8 * d, 0.0, 0.0).Method_22433(f10, f2).Method_22451();
            class_22385.Method_22443((double)f8 * d, d2, 0.0).Method_22433(f10, f4).Method_22451();
            class_22385.Method_22443((double)f8 * d, d2, f5).Method_22433(f10, f4).Method_22451();
        }
        class_7644.Method_7647();
        GL11.glNormal3f((float)1.0f, (float)0.0f, (float)0.0f);
        class_22385.Method_22417(343 & 26671, Class_29585.Field_29598);
        for (n3 = 2 & -23360; n3 < n; ++n3) {
            f8 = (float)n3 / (float)n;
            f10 = f + f11 * f8 + f13;
            f9 = f8 + 1.0f / (float)n;
            class_22385.Method_22443((double)f9 * d, d2, f5).Method_22433(f10, f4).Method_22451();
            class_22385.Method_22443((double)f9 * d, d2, 0.0).Method_22433(f10, f4).Method_22451();
            class_22385.Method_22443((double)f9 * d, 0.0, 0.0).Method_22433(f10, f2).Method_22451();
            class_22385.Method_22443((double)f9 * d, 0.0, f5).Method_22433(f10, f2).Method_22451();
        }
        class_7644.Method_7647();
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        class_22385.Method_22417(167 & 3335, Class_29585.Field_29598);
        for (n3 = 1090 & -11744; n3 < n2; ++n3) {
            f8 = (float)n3 / (float)n2;
            f10 = f2 + f12 * f8 + f14;
            f9 = f8 + 1.0f / (float)n2;
            class_22385.Method_22443(0.0, (double)f9 * d2, 0.0).Method_22433(f, f10).Method_22451();
            class_22385.Method_22443(d, (double)f9 * d2, 0.0).Method_22433(f3, f10).Method_22451();
            class_22385.Method_22443(d, (double)f9 * d2, f5).Method_22433(f3, f10).Method_22451();
            class_22385.Method_22443(0.0, (double)f9 * d2, f5).Method_22433(f, f10).Method_22451();
        }
        class_7644.Method_7647();
        GL11.glNormal3f((float)0.0f, (float)(0.3611111f * -2.7692308f), (float)0.0f);
        class_22385.Method_22417(24615 & 4943, Class_29585.Field_29598);
        for (n3 = 596 & -9216; n3 < n2; ++n3) {
            f8 = (float)n3 / (float)n2;
            f10 = f2 + f12 * f8 + f14;
            class_22385.Method_22443(d, (double)f8 * d2, 0.0).Method_22433(f3, f10).Method_22451();
            class_22385.Method_22443(0.0, (double)f8 * d2, 0.0).Method_22433(f, f10).Method_22451();
            class_22385.Method_22443(0.0, (double)f8 * d2, f5).Method_22433(f, f10).Method_22451();
            class_22385.Method_22443(d, (double)f8 * d2, f5).Method_22433(f3, f10).Method_22451();
        }
        class_7644.Method_7647();
    }
}

