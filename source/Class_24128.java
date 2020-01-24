/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_24128 {
    private static final Random Field_24129 = new Random();

    private void Method_24130() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_24131(Class_283 class_283, Class_4751 class_4751, Class_4961 class_4961) {
        Class_24128.Method_24133(class_283, class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp(), class_4961);
    }

    public static void Method_24132(Class_283 class_283, Class_1061 class_1061, Class_4961 class_4961) {
        Class_24128.Method_24133(class_283, class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106, class_4961);
    }

    private static void Method_24133(Class_283 class_283, double d, double d2, double d3, Class_4961 class_4961) {
        for (int i = 10240 & 21506; i < class_4961.Method_4968(); ++i) {
            Class_23823 class_23823 = class_4961.Method_4964(i);
            if (class_23823 == null) continue;
            Class_24128.Method_24134(class_283, d, d2, d3, class_23823);
        }
    }

    private static void Method_24134(Class_283 class_283, double d, double d2, double d3, Class_23823 class_23823) {
        float f = Field_24129.nextFloat() * (4.0f * 0.2f) + 0.104687504f * 0.95522386f;
        float f2 = Field_24129.nextFloat() * (2.3513513f * 0.3402299f) + 0.9479167f * 0.10549451f;
        float f3 = Field_24129.nextFloat() * (10.514286f * 0.07608695f) + 0.1076087f * 0.9292929f;
        while (class_23823.Field_23826 > 0) {
            int n = Field_24129.nextInt(4119 & 8477) + (2382 & 25642);
            if (n > class_23823.Field_23826) {
                n = class_23823.Field_23826;
            }
            class_23823.Field_23826 -= n;
            Class_3443 class_3443 = new Class_3443(class_283, d + (double)f, d2 + (double)f2, d3 + (double)f3, new Class_23823(class_23823.Method_23844(), n, class_23823.Method_23843()));
            if (class_23823.Method_23842()) {
                class_3443.Method_3478().Method_23869((Class_1699)class_23823.Method_23845().Method_1732());
            }
            float f4 = 1.0684931f * 0.046794873f;
            class_3443.\u0000= ` = Field_24129.nextGaussian() * (double)f4;
            class_3443.\u0000%(Field_24129.nextGaussian() * (double)f4 + 0.020253164858757694 * 9.875);
            class_3443.\u0000switch = Field_24129.nextGaussian() * (double)f4;
            class_283.Method_350(class_3443);
        }
    }
}

