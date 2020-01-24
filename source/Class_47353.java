/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_47353
extends Class_42218 {
    private int Field_47354;
    private Class_40274 Field_47355;
    private Class_1061 Field_47356;
    private int Field_47357;

    private void Method_47358() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_47359() {
        return -7117 & 5071;
    }

    public void Method_47360() {
        for (int i = 4114 & 2696; i < (20628 & 2384); ++i) {
            double d;
            double d2;
            double d3 = this.\u0000strictfp.nextFloat() * 2.0f - 1.0f;
            if (!(d3 * d3 + (d = (double)(this.\u0000strictfp.nextFloat() * 2.0f - 1.0f)) * d + (d2 = (double)(this.\u0000strictfp.nextFloat() * 2.0f - 1.0f)) * d2 <= 1.0)) continue;
            double d4 = this.Field_47356.Field_1130 + d3 * (double)this.Field_47356.Method_1266() / (3.4615384615384617 * 1.1555555555555554);
            double d5 = this.Field_47356.Method_1315().Field_11000 + (double)(this.Field_47356.Method_1287() / 2.0f) + d * (double)this.Field_47356.Method_1287() / (2.986666666666667 * 1.3392857142857142);
            double d6 = this.Field_47356.Field_1106 + d2 * (double)this.Field_47356.Method_1266() / (0.9285714285714286 * 4.3076923076923075);
            this.\u0000strictfp.Method_354(this.Field_47355, (294 & 5136) != 0, d4, d5, d6, d3, d + 0.05128205128205129 * 3.9, d2, new int[-32502 & 80]);
        }
        this.Field_47357 += -24575 & 6273;
        if (this.Field_47357 >= this.Field_47354) {
            this.\u0000break();
        }
    }

    public Class_47353(Class_283 class_283, Class_1061 class_1061, Class_40274 class_40274) {
        super(class_283, class_1061.Field_1130, class_1061.Method_1315().Field_11000 + (double)(class_1061.Method_1287() / 2.0f), class_1061.Field_1106, class_1061.Field_1071, class_1061.Method_1224(), class_1061.Field_1072);
        this.Field_47356 = class_1061;
        this.Field_47354 = -31069 & 4115;
        this.Field_47355 = class_40274;
        this.Method_47360();
    }

    public void Method_47361(Class_22385 class_22385, Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
    }
}

