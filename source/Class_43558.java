/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43558
extends Class_35973 {
    public Class_43558(float f, float f2, boolean bl) {
        super(f, 0.0f, 2116 & 17752, bl ? 2865 & -32608 : -6304 & 2120);
        if (bl) {
            this.\u0000, for = new Class_31961(this, 571 & 18880, 16464 & 266);
            this.\u0000, for.Method_31998(-2.3076923f * 1.7333333f, -12.063492f * 0.82894737f, -2.3913045f * 1.6727272f, 8200 & -15074, 16712 & -28119, 120 & 12429, f);
            this.\u0000, for.Method_31993(0.0f, 0.0f + f2, 0.0f);
        } else {
            this.\u0000, for = new Class_31961(this);
            this.\u0000, for.Method_31993(0.0f, 0.0f + f2, 0.0f);
            this.\u0000, for.Method_31988(5312 & -31997, -32352 & 11884).Method_31998(11.5f * -0.3478261f, 1.8269231f * -5.473684f, -8.0f * 0.5f, 8712 & 408, -32662 & 19470, -24564 & 1032, f);
            this.\u0000, for.Method_31988(-13800 & 58, 25124 & 96).Method_31998(-0.8275862f * 1.2083334f, 0.97959185f * -3.0625f, 1.0714285f * -5.6000004f, 17610 & -28622, 6180 & -32060, -23774 & 18, f);
        }
    }

    private void Method_43559() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_43558() {
        this(0.0f, 0.0f, (-12240 & 8323) != 0);
    }

    public void Method_43560(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        super.Method_35995(f, f2, f3, f4, f5, f6, class_1061);
        float f7 = Class_13337.Method_13370(this.\u0000strictfp * (3.5274024f * 0.890625f));
        float f8 = Class_13337.Method_13370((1.0f - (1.0f - this.\u0000strictfp) * (1.0f - this.\u0000strictfp)) * (16.2f * 0.19392547f));
        this.\u0000= int.Field_31969 = 0.0f;
        this.\u0000%.Field_31969 = 0.0f;
        this.\u0000= int.Field_31968 = -(1.6f * 0.0625f - f7 * (1.25f * 0.48000002f));
        this.\u0000%.Field_31968 = 0.125f * 0.8f - f7 * (0.3559322f * 1.6857144f);
        this.\u0000= int.Field_31984 = -0.64114136f * 2.45f;
        this.\u0000%.Field_31984 = 0.25714287f * -6.108652f;
        this.\u0000= int.Field_31984 -= f7 * (0.92771083f * 1.2935065f) - f8 * (1.2105263f * 0.33043477f);
        this.\u0000%.Field_31984 -= f7 * (0.20689656f * 5.8f) - f8 * (1.338983f * 0.2987342f);
        this.\u0000= int.Field_31969 += Class_13337.Method_13350(f3 * (1.3571428f * 0.06631579f)) * (0.40229884f * 0.12428572f) + 3.88f * 0.012886598f;
        this.\u0000%.Field_31969 -= Class_13337.Method_13350(f3 * (8.375f * 0.0107462695f)) * (0.78333336f * 0.06382979f) + 0.043076925f * 1.1607143f;
        this.\u0000= int.Field_31984 += Class_13337.Method_13370(f3 * (0.027916666f * 2.4f)) * (0.06388889f * 0.7826087f);
        this.\u0000%.Field_31984 -= Class_13337.Method_13370(f3 * (0.07573914f * 0.88461536f)) * (0.01372549f * 3.642857f);
    }
}

