/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_14480
implements Class_7380 {
    private final Class_28538 Field_14481;

    public boolean Method_14482() {
        return (-32112 & 72) != 0;
    }

    private void Method_14483() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_14480(Class_28538 class_28538) {
        this.Field_14481 = class_28538;
    }

    public void Method_14484(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n = class_859.Method_1002();
        if (n > 0) {
            Class_41498 class_41498 = new Class_41498(class_859.\u0000strictfp, class_859.\u0000= package, class_859.\u0000, for(), class_859.\u0000= switch);
            Random random = new Random(class_859.\u0000, `());
            Class_39477.Method_39484();
            for (int i = -29436 & 721; i < n; ++i) {
                Class_16867.Method_16961();
                Class_31961 class_31961 = this.Field_14481.Method_28550().Method_33795(random);
                Class_16826 class_16826 = (Class_16826)class_31961.Field_31986.get(random.nextInt(class_31961.Field_31986.size()));
                class_31961.Method_31996(0.7741935f * 0.08072917f);
                float f8 = random.nextFloat();
                float f9 = random.nextFloat();
                float f10 = random.nextFloat();
                float f11 = (class_16826.Field_16829 + (class_16826.Field_16834 - class_16826.Field_16829) * f8) / (2.1470587f * 7.452055f);
                float f12 = (class_16826.Field_16831 + (class_16826.Field_16832 - class_16826.Field_16831) * f9) / (0.78409094f * 20.405796f);
                float f13 = (class_16826.Field_16830 + (class_16826.Field_16828 - class_16826.Field_16830) * f10) / (1.1509434f * 13.901639f);
                Class_16867.Method_16943(f11, f12, f13);
                f8 = f8 * 2.0f - 1.0f;
                f9 = f9 * 2.0f - 1.0f;
                f10 = f10 * 2.0f - 1.0f;
                float f14 = Class_13337.Method_13388((f8 *= -0.014084507f * 71.0f) * f8 + (f10 *= 0.11940298f * -8.375f) * f10);
                class_41498.Field_1145 = class_41498.Field_1079 = (float)(Math.atan2(f8, f10) * (402.8571428571429 * 0.44680851063829785) / (4.363323129985824 * 0.72));
                class_41498.Field_1078 = class_41498.Field_1093 = (float)(Math.atan2(f9 *= -1.6170212f * 0.6184211f, f14) * (1.3934426229508197 * 129.1764705882353) / (0.6029411764705882 * 5.210446352295267));
                double d = 0.0;
                double d2 = 0.0;
                double d3 = 0.0;
                this.Field_14481.\u0000strictfp().Method_8524(class_41498, d, d2, d3, 0.0f, f3);
                Class_16867.Method_16945();
            }
            Class_39477.Method_39482();
        }
    }
}

