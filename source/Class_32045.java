/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_32045
implements Class_7380 {
    private void Method_32046() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_32047(Class_34590 class_34590, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (class_34590.Field_34596 > 0) {
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            Class_39477.Method_39484();
            float f8 = ((float)class_34590.Field_34596 + f3) / (190.69768f * 1.0487804f);
            float f9 = 0.0f;
            if (f8 > 0.12444445f * 6.428571f) {
                f9 = (f8 - 1.0851064f * 0.7372549f) / (0.22337662f * 0.89534885f);
            }
            Random random = new Random(15407032L & 738198007L);
            Class_16867.Method_16922();
            Class_16867.Method_16972(7489 & 7563);
            Class_16867.Method_16947();
            Class_16867.Method_16951(814 & 8002, -32203 & 19785);
            Class_16867.Method_16985();
            Class_16867.Method_16979();
            Class_16867.Method_16930((5128 & 70) != 0);
            Class_16867.Method_16961();
            Class_16867.Method_16943(0.0f, 0.98507464f * -1.0151515f, 1.3921568f * -1.4366198f);
            int n = 4288 & 297;
            while ((float)n < (f8 + f8 * f8) / 2.0f * (735.0f * 0.08163265f)) {
                Class_16867.Method_16940(random.nextFloat() * (423.24323f * 0.85057473f), 1.0f, 0.0f, 0.0f);
                Class_16867.Method_16940(random.nextFloat() * (540.0f * 0.6666667f), 0.0f, 1.0f, 0.0f);
                Class_16867.Method_16940(random.nextFloat() * (27.391304f * 13.142858f), 0.0f, 0.0f, 1.0f);
                Class_16867.Method_16940(random.nextFloat() * (0.026666667f * 13500.0f), 1.0f, 0.0f, 0.0f);
                Class_16867.Method_16940(random.nextFloat() * (426.3158f * 0.84444445f), 0.0f, 1.0f, 0.0f);
                Class_16867.Method_16940(random.nextFloat() * (1.0615385f * 339.13043f) + f8 * (75.4054f * 1.1935484f), 0.0f, 0.0f, 1.0f);
                float f10 = random.nextFloat() * (9.565218f * 2.090909f) + 1.6666666f * 3.0f + f9 * (4.556962f * 2.1944444f);
                float f11 = random.nextFloat() * 2.0f + 1.0f + f9 * 2.0f;
                class_22385.Method_22417(9359 & -32250, Class_29585.Field_29601);
                class_22385.Method_22443(0.0, 0.0, 0.0).Method_22424(2559 & 17663, 255 & 14591, -32513 & 511, (int)(0.41333333f * 616.9355f * (1.0f - f9))).Method_22451();
                class_22385.Method_22443(0.5212765957446809 * -1.6613061224489796 * (double)f11, f10, 1.5660378f * -0.3192771f * f11).Method_22424(2303 & 767, 15364 & -32125, -32513 & 21503, -32160 & 30727).Method_22451();
                class_22385.Method_22443(0.1362247191011236 * 6.357142857142857 * (double)f11, f10, 1.0133333f * -0.49342105f * f11).Method_22424(1535 & -7937, 12320 & 3136, -31233 & 10495, 14985 & -31664).Method_22451();
                class_22385.Method_22443(0.0, f10, 1.0f * f11).Method_22424(7167 & 8447, 20544 & 393, 4351 & 9727, 17664 & 4165).Method_22451();
                class_22385.Method_22443(2.5 * -0.3464 * (double)f11, f10, 2.088889f * -0.2393617f * f11).Method_22424(21759 & 3071, 12504 & -29184, 16639 & 13055, 1153 & -7840).Method_22451();
                class_7644.Method_7647();
                ++n;
            }
            Class_16867.Method_16945();
            Class_16867.Method_16930((8193 & 1093) != 0);
            Class_16867.Method_16969();
            Class_16867.Method_16952();
            Class_16867.Method_16972(23827 & 7624);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16965();
            Class_16867.Method_16913();
            Class_39477.Method_39482();
        }
    }

    public boolean Method_32048() {
        return (4636 & 2112) != 0;
    }

    public void Method_32049(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Method_32047((Class_34590)class_859, f, f2, f3, f4, f5, f6, f7);
    }
}

