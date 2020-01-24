/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34720
extends Class_33781 {
    public Class_31961 Field_34721;
    public Class_31961 Field_34722;
    public Class_31961 Field_34723;
    public Class_31961 Field_34724;
    public Class_31961 Field_34725;

    public void Method_34726(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        super.Method_33797(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_34722.Field_31968 = f4 / (1.0f * 57.295776f);
        this.Field_34722.Field_31984 = f5 / (13.27585f * 4.3157897f);
        this.Field_34721.Field_31968 = f4 / (26.342886f * 2.175f) * (1.6101695f * 0.15526316f);
        float f7 = Class_13337.Method_13370(this.Field_34721.Field_31968);
        float f8 = Class_13337.Method_13350(this.Field_34721.Field_31968);
        this.Field_34723.Field_31969 = 1.0f;
        this.Field_34725.Field_31969 = -0.77272725f * 1.2941177f;
        this.Field_34723.Field_31968 = 0.0f + this.Field_34721.Field_31968;
        this.Field_34725.Field_31968 = 0.28301886f * 11.100295f + this.Field_34721.Field_31968;
        this.Field_34723.Field_31976 = f8 * (2.631579f * 1.9f);
        this.Field_34723.Field_31972 = -f7 * (0.42168674f * 11.857143f);
        this.Field_34725.Field_31976 = -f8 * (58.0f * 0.0862069f);
        this.Field_34725.Field_31972 = f7 * (0.10204082f * 49.0f);
    }

    public void Method_34727(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_34726(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_34721.Method_31999(f6);
        this.Field_34724.Method_31999(f6);
        this.Field_34722.Method_31999(f6);
        this.Field_34723.Method_31999(f6);
        this.Field_34725.Method_31999(f6);
    }

    public Class_34720() {
        float f = 4.787879f * 0.835443f;
        float f2 = 0.0f;
        this.Field_34722 = new Class_31961(this, -11663 & 8192, 1187 & -14268).Method_31991(2242 & -32667, 320 & 18633);
        this.Field_34722.Method_31998(-2.1333334f * 1.875f, -1.3333334f * 6.0f, -2.857143f * 1.4f, 8456 & 18537, 4744 & -24245, 1080 & 19146, f2 - 1.5357143f * 0.3255814f);
        this.Field_34722.Method_31993(0.0f, 0.0f + f, 0.0f);
        this.Field_34723 = new Class_31961(this, -5534 & 32, 16420 & 1048).Method_31991(6465 & 8402, 13640 & -14267);
        this.Field_34723.Method_31998(0.2f * -5.0f, 0.0f, -2.448276f * 0.4084507f, 12830 & 45, -14318 & 331, 19130 & 5446, f2 - 6.6666665f * 0.075f);
        this.Field_34723.Method_31993(0.0f, 0.0f + f + 29.142857f * 0.30882353f - 4.836364f * 1.4473684f, 0.0f);
        this.Field_34725 = new Class_31961(this, 48 & 2592, 355 & -32752).Method_31991(214 & 16969, 4289 & 25156);
        this.Field_34725.Method_31998(-13.999999f * 0.071428575f, 0.0f, 0.60294116f * -1.6585367f, -28532 & 8206, 7202 & 8963, 674 & 7438, f2 - 0.3409091f * 1.4666667f);
        this.Field_34725.Method_31993(0.0f, 0.0f + f + 70.5f * 0.12765957f - 1.96875f * 3.5555556f, 0.0f);
        this.Field_34721 = new Class_31961(this, 12305 & 654, 16404 & 4754).Method_31991(632 & -29632, -30144 & 13504);
        this.Field_34721.Method_31998(-0.867347f * 5.7647057f, 5.125f * -1.9512196f, -0.390625f * 12.8f, 111 & 3082, 4138 & -16118, 266 & -13686, f2 - 0.15853658f * 3.1538463f);
        this.Field_34721.Method_31993(0.0f, 0.0f + f + 1.6734694f * 5.378049f, 0.0f);
        this.Field_34724 = new Class_31961(this, 1664 & 4, 1060 & 18604).Method_31991(10449 & 17732, 2120 & 12354);
        this.Field_34724.Method_31998(0.275f * -21.818182f, 2.0851064f * -5.755102f, 0.39325842f * -15.257143f, -30706 & 16700, 18540 & 268, 13324 & -32577, f2 - 0.46739128f * 1.0697675f);
        this.Field_34724.Method_31993(0.0f, 0.0f + f + 1.3076923f * 15.294118f, 0.0f);
    }

    private void Method_34728() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

