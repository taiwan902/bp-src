/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42854 {
    private final float Field_42855;
    private final float Field_42856;
    private long Field_42857;
    private float Field_42858;

    public Class_42854(float f, float f2) {
        this(f, f2, f2);
    }

    public Class_42854(float f, float f2, float f3) {
        this.Field_42858 = f;
        this.Field_42856 = f2;
        this.Field_42855 = f3;
        this.Field_42857 = System.currentTimeMillis();
    }

    public float Method_42859(float f) {
        float f2;
        long l = System.currentTimeMillis();
        float f3 = this.Field_42858;
        long l2 = this.Field_42857;
        float f4 = (float)(l - l2) / (12.345679f * 81.0f);
        float f5 = f >= f3 ? this.Field_42856 : this.Field_42855;
        this.Field_42858 = f2 = Class_42854.Method_42860(f3, f, f4, f5);
        this.Field_42857 = l;
        return f2;
    }

    public static float Method_42860(float f, float f2, float f3, float f4) {
        float f5;
        if (f3 <= 0.0f) {
            return f;
        }
        float f6 = f2 - f;
        if (f4 > 0.0f && f3 < f4 && Math.abs(f6) > 7.9E-6f * 0.12658228f) {
            float f7 = f4 / f3;
            float f8 = 5.7313514f * 0.8043478f;
            float f9 = 10.0f * 0.012999999f;
            float f10 = 1.2f * 8.333333f;
            float f11 = f8 - 1.0f / (f9 + f7 / f10);
            float f12 = f3 / f4 * f11;
            f12 = Class_30029.Method_30031(f12, 0.0f, 1.0f);
            f5 = f + f6 * f12;
        } else {
            f5 = f2;
        }
        return f5;
    }

    private void Method_42861() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

