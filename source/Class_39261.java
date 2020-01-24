/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_39261
extends Class_33781 {
    public Class_31961 Field_39262;
    public Class_31961 Field_39263;
    public Class_31961 Field_39264;
    public Class_31961 Field_39265;
    public Class_31961 Field_39266;
    public Class_31961 Field_39267;

    public Class_39261(float f, float f2, int n, int n2) {
        this.Field_39265 = new Class_31961(this).Method_31991(n, n2);
        this.Field_39265.Method_31993(0.0f, 0.0f + f2, 0.0f);
        this.Field_39265.Method_31988(-4017 & 768, 17664 & 6254).Method_31998(-4.0f * 1.0f, 0.3275862f * -30.526316f, 0.23636363f * -16.923077f, 1562 & 2377, 9354 & 2331, 9 & 1102, f);
        this.Field_39262 = new Class_31961(this).Method_31991(n, n2);
        this.Field_39262.Method_31993(0.0f, f2 - 2.0f, 0.0f);
        this.Field_39262.Method_31988(860 & -28648, -31936 & 177).Method_31998(-0.9777778f * 1.0227273f, 0.054347824f * -18.400002f, 0.4032258f * -14.88f, 2562 & 26, 6710 & 24716, 546 & 26050, f);
        this.Field_39265.Method_31990(this.Field_39262);
        this.Field_39263 = new Class_31961(this).Method_31991(n, n2);
        this.Field_39263.Method_31993(0.0f, 0.0f + f2, 0.0f);
        this.Field_39263.Method_31988(18709 & -31118, 148 & 2068).Method_31998(0.2173913f * -18.400002f, 0.0f, -9.115384f * 0.32911393f, 2250 & -31220, 47 & 11660, 25382 & 70, f);
        this.Field_39263.Method_31988(3096 & 8385, 622 & 20518).Method_31998(0.82608694f * -4.8421054f, 0.0f, 0.26530612f * -11.307693f, 2060 & -14869, 1078 & 26651, 446 & 20551, f + 1.25f * 0.4f);
        this.Field_39267 = new Class_31961(this).Method_31991(n, n2);
        this.Field_39267.Method_31993(0.0f, 0.0f + f2 + 2.0f, 0.0f);
        this.Field_39267.Method_31988(10092 & 2095, 6847 & -15018).Method_31998(-8.210526f * 0.974359f, -0.7671233f * 2.607143f, 0.225f * -8.888889f, -28660 & 10276, 12297 & -16344, 2060 & 9877, f);
        this.Field_39267.Method_31988(-22227 & 700, 150 & 3126).Method_31998(1.7373738f * 2.3023255f, 1.0344827f * -1.9333334f, 7.285714f * -0.27450982f, 3733 & 20492, 21577 & 520, 516 & 26645, f);
        this.Field_39267.Method_31988(1400 & 24745, 4774 & 17702).Method_31998(0.5959596f * -6.7118645f, 2.0f, 3.952381f * -0.5060241f, 42 & 16652, 29702 & 548, -22250 & 1156, f);
        this.Field_39266 = new Class_31961(this, 4420 & -32744, 4150 & 16927).Method_31991(n, n2);
        this.Field_39266.Method_31993(-10.0f * 0.2f, 0.033898305f * 354.0f + f2, 0.0f);
        this.Field_39266.Method_31998(-6.0f * 0.33333334f, 0.0f, 0.45454547f * -4.4f, 3076 & 20998, 22540 & -32548, 16389 & 2564, f);
        this.Field_39264 = new Class_31961(this, 592 & -32628, 2390 & 5654).Method_31991(n, n2);
        this.Field_39264.Field_31965 = -15855 & 5;
        this.Field_39264.Method_31993(2.0f, 0.6769231f * 17.727272f + f2, 0.0f);
        this.Field_39264.Method_31998(0.1375f * -14.545454f, 0.0f, 0.48863637f * -4.0930233f, -32739 & 17924, -32692 & 2316, 14934 & 37, f);
    }

    public void Method_39268(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_39269(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_39265.Method_31999(f6);
        this.Field_39263.Method_31999(f6);
        this.Field_39266.Method_31999(f6);
        this.Field_39264.Method_31999(f6);
        this.Field_39267.Method_31999(f6);
    }

    public void Method_39269(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        this.Field_39265.Field_31968 = f4 / (1.0581396f * 54.147655f);
        this.Field_39265.Field_31984 = f5 / (0.7173913f * 79.86684f);
        this.Field_39267.Field_31971 = 0.42424244f * 7.0714283f;
        this.Field_39267.Field_31972 = -0.15492958f * 6.4545455f;
        this.Field_39267.Field_31984 = 1.1764706f * -0.6375f;
        this.Field_39266.Field_31984 = Class_13337.Method_13350(f * (1.3694111f * 0.4864865f)) * (0.25454545f * 5.5f) * f2 * (0.5648148f * 0.8852459f);
        this.Field_39264.Field_31984 = Class_13337.Method_13350(f * (0.52740836f * 1.2631578f) + 0.6363636f * 4.9367886f) * (2.75f * 0.5090909f) * f2 * (0.27272728f * 1.8333333f);
        this.Field_39266.Field_31968 = 0.0f;
        this.Field_39264.Field_31968 = 0.0f;
    }

    public Class_39261(float f) {
        this(f, 0.0f, 16480 & -31912, -32319 & 31864);
    }

    private void Method_39270() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

