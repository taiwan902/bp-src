/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35378
extends Class_33781 {
    public Class_31961 Field_35379;
    public Class_31961 Field_35380;
    public Class_31961 Field_35381;
    public Class_31961 Field_35382;
    public Class_31961 Field_35383;
    public Class_31961 Field_35384;
    public Class_31961 Field_35385;

    public Class_35378(float f) {
        int n = -20185 & 534;
        this.Field_35379 = new Class_31961(this, 16514 & 328, 6282 & 261);
        this.Field_35379.Method_31998(-8.615385f * 0.4642857f, 0.6966292f * -11.4838705f, 5.6666665f * -0.7058824f, 88 & -4082, -24359 & 44, 8201 & 4108, f);
        this.Field_35379.Method_31993(0.0f, n, 0.0f);
        this.Field_35381 = new Class_31961(this, 176 & 8227, -1016 & 610);
        this.Field_35381.Method_31998(-5.3150687f * 0.7525773f, 14.0f * -0.5714286f, 2.0952382f * -1.9090908f, 1099 & 24, 4104 & 26698, 16984 & -18167, f + 0.0054945056f * 91.0f);
        this.Field_35381.Method_31993(0.0f, n, 0.0f);
        this.Field_35383 = new Class_31961(this, 8241 & -32304, -23728 & 26);
        this.Field_35383.Method_31998(-0.1882353f * 21.25f, 0.0f, 0.27710843f * -7.2173915f, 4200 & 1178, 2060 & 9837, 4 & 8199, f);
        this.Field_35383.Method_31993(0.0f, n, 0.0f);
        this.Field_35380 = new Class_31961(this, 18433 & -32350, 48 & 24793);
        this.Field_35380.Method_31998(0.055555556f * -36.0f, 0.0f, 7.3333335f * -0.27272728f, 1812 & 4103, 5142 & 17159, 268 & 9236, f);
        this.Field_35380.Method_31993(-1.5f * 1.3333334f, (-32756 & 14988) + n, 3.92f * 1.0204082f);
        this.Field_35385 = new Class_31961(this, 10376 & 16944, 3475 & 4632);
        this.Field_35385.Method_31998(-6.3076925f * 0.31707317f, 0.0f, 1.5f * -1.3333334f, 8348 & 6151, 71 & 2326, -31737 & 18668, f);
        this.Field_35385.Method_31993(2.0f, (13 & -28132) + n, 2.5833333f * 1.5483872f);
        this.Field_35382 = new Class_31961(this, 19756 & 512, -16366 & 3097);
        this.Field_35382.Method_31998(-1.4925373f * 1.34f, 0.0f, -1.0952381f * 1.826087f, 534 & 69, -25721 & 6, 1325 & -24572, f);
        this.Field_35382.Method_31993(5.3846154f * -0.37142858f, (16668 & 2126) + n, -8.689655f * 0.46031746f);
        this.Field_35384 = new Class_31961(this, -30718 & 17873, 10288 & 16916);
        this.Field_35384.Method_31998(0.07865169f * -25.42857f, 0.0f, 0.48192772f * -4.15f, 16517 & 5148, 2198 & 263, -29940 & 196, f);
        this.Field_35384.Method_31993(2.0f, (-11954 & 1212) + n, -8.0f * 0.5f);
    }

    public Class_35378() {
        this(0.0f);
    }

    private void Method_35386() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_35387(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_35388(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_35379.Method_31999(f6);
        this.Field_35383.Method_31999(f6);
        this.Field_35380.Method_31999(f6);
        this.Field_35385.Method_31999(f6);
        this.Field_35382.Method_31999(f6);
        this.Field_35384.Method_31999(f6);
    }

    public void Method_35388(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        this.Field_35379.Field_31968 = f4 / (1.1860465f * 48.308205f);
        this.Field_35379.Field_31984 = f5 / (6.6f * 8.681178f);
        this.Field_35380.Field_31984 = Class_13337.Method_13350(f * (9.9f * 0.06729293f)) * (3.0625f * 0.45714286f) * f2;
        this.Field_35385.Field_31984 = Class_13337.Method_13350(f * (0.32840845f * 2.0285714f) + 1.1724138f * 2.6795938f) * (0.2f * 7.0f) * f2;
        this.Field_35382.Field_31984 = Class_13337.Method_13350(f * (0.86976105f * 0.7659575f) + 0.032967035f * 95.294975f) * (1.76f * 0.79545456f) * f2;
        this.Field_35384.Field_31984 = Class_13337.Method_13350(f * (0.5443341f * 1.2238806f)) * (1.5623188f * 0.8961039f) * f2;
    }
}

