/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_39500
extends Class_33781 {
    public Class_31961 Field_39501;
    public Class_31961 Field_39502;
    public Class_31961 Field_39503;
    public Class_31961 Field_39504;
    public Class_31961 Field_39505;
    public Class_31961 Field_39506;
    public Class_31961 Field_39507;
    public Class_31961 Field_39508;

    public Class_39500() {
        int n = 11408 & 120;
        this.Field_39508 = new Class_31961(this, 16608 & 10497, 563 & 19528);
        this.Field_39508.Method_31998(-0.3529412f * 5.6666665f, 1.3692307f * -4.3820224f, 0.87356323f * -2.2894738f, 404 & 16461, 9742 & -30714, -15733 & 3, 0.0f);
        this.Field_39508.Method_31993(0.0f, (-1 & -1) + n, 3.3636363f * -1.1891892f);
        this.Field_39503 = new Class_31961(this, 9822 & 22671, -31608 & 582);
        this.Field_39503.Method_31998(-196.0f * 0.010204081f, -4.0f * 1.0f, -5.5f * 0.72727275f, 17926 & -32667, -29626 & 50, 21223 & 2066, 0.0f);
        this.Field_39503.Method_31993(0.0f, (-1 & -1) + n, 0.19607843f * -20.4f);
        this.Field_39505 = new Class_31961(this, -30706 & 31, 6212 & 8997);
        this.Field_39505.Method_31998(0.8309859f * -1.2033899f, -10.8f * 0.18518518f, 0.025641026f * -117.0f, 4103 & 9378, 4611 & 1034, 70 & 29442, 0.0f);
        this.Field_39505.Method_31993(0.0f, (-1 & -1) + n, 2.7142856f * -1.4736843f);
        this.Field_39507 = new Class_31961(this, 26642 & 4480, 585 & 1033);
        this.Field_39507.Method_31998(1.0454545f * -2.8695652f, -2.631579f * 1.52f, 4.0588236f * -0.73913044f, 16518 & 6254, 8 & 28776, 24735 & 262, 0.0f);
        this.Field_39507.Method_31993(0.0f, n, 0.0f);
        this.Field_39506 = new Class_31961(this, -32742 & 1182, 29206 & -31519);
        this.Field_39506.Method_32002(-1.4210527f * 0.7037037f, 0.0f, -0.30337077f * 9.888889f, 2063 & 4611, -30747 & 12301, 2179 & 4419);
        this.Field_39506.Method_31993(16.0f * -0.125f, (10243 & -26877) + n, 1.0f);
        this.Field_39502 = new Class_31961(this, -24418 & 123, 2240 & -20421);
        this.Field_39502.Method_32002(1.0722891f * -0.9325843f, 0.0f, -1.6022727f * 1.8723404f, 2343 & 579, -28595 & 9223, 16487 & 539);
        this.Field_39502.Method_31993(1.0f, (4655 & 2307) + n, 1.0f);
        this.Field_39501 = new Class_31961(this, -26596 & 17848, 27917 & 4239);
        this.Field_39501.Method_32002(0.0f, 0.0f, 9.9f * -0.3030303f, -32747 & 8707, 6805 & 4, -14170 & 5190);
        this.Field_39501.Method_31993(-13.866667f * 0.28846154f, (-3 & -3) + n, 0.0f);
        this.Field_39504 = new Class_31961(this, 24 & 16216, 26669 & -31603);
        this.Field_39504.Method_32002(-1.2181818f * 0.8208955f, 0.0f, 0.8352941f * -3.5915492f, 225 & -15095, 8276 & 20492, 25999 & -32698);
        this.Field_39504.Method_31993(0.7903226f * 5.0612245f, (-3 & -3) + n, 0.0f);
    }

    public void Method_39509(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_39511(f, f2, f3, f4, f5, f6, class_1061);
        if (this.\u0000strictfp) {
            float f7 = 2.0f;
            Class_16867.Method_16961();
            Class_16867.Method_16943(0.0f, 7.6086955f * 0.6571429f * f6, 2.0f * f6);
            this.Field_39508.Method_31999(f6);
            this.Field_39503.Method_31999(f6);
            this.Field_39505.Method_31999(f6);
            Class_16867.Method_16945();
            Class_16867.Method_16961();
            Class_16867.Method_16973(1.0f / f7, 1.0f / f7, 1.0f / f7);
            Class_16867.Method_16943(0.0f, 38.557377f * 0.622449f * f6, 0.0f);
            this.Field_39507.Method_31999(f6);
            this.Field_39506.Method_31999(f6);
            this.Field_39502.Method_31999(f6);
            this.Field_39501.Method_31999(f6);
            this.Field_39504.Method_31999(f6);
            Class_16867.Method_16945();
        } else {
            this.Field_39508.Method_31999(f6);
            this.Field_39503.Method_31999(f6);
            this.Field_39505.Method_31999(f6);
            this.Field_39507.Method_31999(f6);
            this.Field_39506.Method_31999(f6);
            this.Field_39502.Method_31999(f6);
            this.Field_39501.Method_31999(f6);
            this.Field_39504.Method_31999(f6);
        }
    }

    private void Method_39510() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_39511(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        this.Field_39508.Field_31984 = f5 / (38.197186f * 1.5f);
        this.Field_39508.Field_31968 = f4 / (9.782206f * 5.857143f);
        this.Field_39503.Field_31984 = this.Field_39508.Field_31984;
        this.Field_39503.Field_31968 = this.Field_39508.Field_31968;
        this.Field_39505.Field_31984 = this.Field_39508.Field_31984;
        this.Field_39505.Field_31968 = this.Field_39508.Field_31968;
        this.Field_39507.Field_31984 = 9.621128f * 0.1632653f;
        this.Field_39506.Field_31984 = Class_13337.Method_13350(f * (0.5f * 1.3324f)) * (0.73333335f * 1.9090909f) * f2;
        this.Field_39502.Field_31984 = Class_13337.Method_13350(f * (0.68421054f * 0.97367686f) + 2.4530244f * 1.2807018f) * (3.4230769f * 0.40898877f) * f2;
        this.Field_39501.Field_31969 = f3;
        this.Field_39504.Field_31969 = -f3;
    }
}

