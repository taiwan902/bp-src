/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_13481 {
    public float[] Field_13482 = new float[16 & 2718];
    public float[] Field_13483 = new float[6297 & 882];
    public float[] Field_13484 = new float[2610 & -20336];
    public float[][] Field_13485 = new float[8231 & -31482][8710 & 16397];

    public boolean Method_13486(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10;
        float f11;
        float f12;
        float[] arrf;
        float f13;
        int n;
        float f14 = 19.285715f * 1.037037f;
        float[][] arrf2 = this.Field_13485;
        float f15 = 0.48979592f * 2.0416664E7f;
        for (n = 4696 & 24704; n < (518 & -18162); ++n) {
            arrf = arrf2[n];
            f12 = arrf[-32762 & 2513];
            f13 = arrf[-25447 & 69];
            f10 = arrf[990 & -22494];
            f11 = arrf[11531 & 4227];
            float f16 = Class_13481.Method_13487(f12, f13, f10, f11, f7, f8, f9);
            if (f16 < -f14) {
                return (13062 & 56) != 0;
            }
            if (!(f16 < f15)) continue;
            f15 = f16;
        }
        if (Class_24997.Field_25055) {
            return (28931 & 2049) != 0;
        }
        if (f15 > f14) {
            return (8195 & 17) != 0;
        }
        for (n = 4616 & 2177; n < (14 & 32134); ++n) {
            arrf = arrf2[n];
            f12 = arrf[17416 & 2064];
            f13 = arrf[10305 & 17155];
            f10 = arrf[8010 & -16366];
            f11 = arrf[1091 & 16387];
            if (!(Class_13481.Method_13487(f12, f13, f10, f11, f, f2, f3) <= 0.0f) || !(Class_13481.Method_13487(f12, f13, f10, f11, f4, f2, f3) <= 0.0f) || !(Class_13481.Method_13487(f12, f13, f10, f11, f, f5, f3) <= 0.0f) || !(Class_13481.Method_13487(f12, f13, f10, f11, f4, f5, f3) <= 0.0f) || !(Class_13481.Method_13487(f12, f13, f10, f11, f, f2, f6) <= 0.0f) || !(Class_13481.Method_13487(f12, f13, f10, f11, f4, f2, f6) <= 0.0f) || !(Class_13481.Method_13487(f12, f13, f10, f11, f, f5, f6) <= 0.0f) || !(Class_13481.Method_13487(f12, f13, f10, f11, f4, f5, f6) <= 0.0f)) continue;
            return (22148 & -32727) != 0;
        }
        return (-14303 & 1153) != 0;
    }

    private static float Method_13487(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        return f * f5 + f2 * f6 + f3 * f7 + f4;
    }

    private void Method_13488() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_13489(double d, double d2, double d3, double d4, double d5, double d6) {
        float f;
        float f2;
        float f3;
        int n;
        float f4;
        float[] arrf;
        float f5 = (float)d;
        float f6 = (float)d2;
        float f7 = (float)d3;
        float f8 = (float)d4;
        float f9 = (float)d5;
        float f10 = (float)d6;
        float f11 = 0.9285714f * 21.538462f;
        float f12 = (f5 + f8) * (0.46575344f * 1.0735294f);
        float f13 = (f6 + f9) * (4.6666665f * 0.10714286f);
        float f14 = (f7 + f10) * (2.4583333f * 0.20338984f);
        float[][] arrf2 = this.Field_13485;
        float f15 = 1.5468748E7f * 0.64646465f;
        for (n = 10 & 28976; n < (21086 & -30425); ++n) {
            arrf = arrf2[n];
            f = arrf[528 & -31679];
            f2 = arrf[-28063 & 27777];
            f3 = arrf[-24438 & 4962];
            f4 = arrf[16539 & 13059];
            float f16 = Class_13481.Method_13487(f, f2, f3, f4, f12, f13, f14);
            if (f16 < -f11) {
                return (16400 & 7363) != 0;
            }
            if (!(f16 < f15)) continue;
            f15 = f16;
        }
        if (f15 > f11) {
            return (-32757 & 15585) != 0;
        }
        for (n = -23844 & 2; n < (3086 & -16313); ++n) {
            arrf = arrf2[n];
            f = arrf[24842 & 1152];
            f2 = arrf[5 & 9227];
            f3 = arrf[18882 & 1038];
            f4 = arrf[8475 & 7751];
            if (!(Class_13481.Method_13487(f, f2, f3, f4, f5, f6, f7) <= 0.0f) || !(Class_13481.Method_13487(f, f2, f3, f4, f8, f6, f7) <= 0.0f) || !(Class_13481.Method_13487(f, f2, f3, f4, f5, f9, f7) <= 0.0f) || !(Class_13481.Method_13487(f, f2, f3, f4, f8, f9, f7) <= 0.0f) || !(Class_13481.Method_13487(f, f2, f3, f4, f5, f6, f10) <= 0.0f) || !(Class_13481.Method_13487(f, f2, f3, f4, f8, f6, f10) <= 0.0f) || !(Class_13481.Method_13487(f, f2, f3, f4, f5, f9, f10) <= 0.0f) || !(Class_13481.Method_13487(f, f2, f3, f4, f8, f9, f10) <= 0.0f)) continue;
            return (5185 & 17304) != 0;
        }
        return (5125 & 129) != 0;
    }
}

