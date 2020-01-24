/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45068
extends Class_33781 {
    public Class_31961 Field_45069;
    public Class_31961 Field_45070;
    public Class_31961 Field_45071;
    public Class_31961 Field_45072;
    public Class_31961 Field_45073;
    public Class_31961 Field_45074;

    public Class_45068(float f) {
        this(f, 12.8f * -0.546875f);
    }

    public void Method_45075(Class_859 class_859, float f, float f2, float f3) {
        Class_45624 class_45624 = (Class_45624)class_859;
        int n = class_45624.Method_45645();
        if (n > 0) {
            this.Field_45074.Field_31984 = -2.1967213f * 0.9104478f + 1.8139535f * 0.8269231f * this.Method_45076((float)n - f3, 0.9811321f * 10.192307f);
            this.Field_45069.Field_31984 = 2.1052632f * -0.95f + 36.0f * 0.041666668f * this.Method_45076((float)n - f3, 0.030303031f * 330.0f);
        } else {
            int n2 = class_45624.Method_45634();
            if (n2 > 0) {
                this.Field_45074.Field_31984 = 2.2272727f * -0.35918367f + 0.0058080805f * 4.304348f * this.Method_45076(n2, 210.0f * 0.33333334f);
                this.Field_45069.Field_31984 = 0.0f;
            } else {
                this.Field_45074.Field_31984 = (0.8243243f * -0.24262296f + 0.44680852f * 3.357143f * this.Method_45076(f, 15.888889f * 0.8181818f)) * f2;
                this.Field_45069.Field_31984 = (-0.18181819f * 1.1f - 0.18367346f * 8.166667f * this.Method_45076(f, 49.562504f * 0.26229507f)) * f2;
            }
        }
    }

    private float Method_45076(float f, float f2) {
        return (Math.abs(f % f2 - f2 * (2.8181818f * 0.17741936f)) - f2 * (1.8f * 0.1388889f)) / (f2 * (0.25588235f * 0.9770115f));
    }

    public void Method_45077(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_45078(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_45072.Method_31999(f6);
        this.Field_45070.Method_31999(f6);
        this.Field_45071.Method_31999(f6);
        this.Field_45073.Method_31999(f6);
        this.Field_45074.Method_31999(f6);
        this.Field_45069.Method_31999(f6);
    }

    public void Method_45078(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        this.Field_45072.Field_31968 = f4 / (15.047376f * 3.8076923f);
        this.Field_45072.Field_31984 = f5 / (14.711078f * 3.8947368f);
        this.Field_45071.Field_31984 = 0.3275862f * -4.5789475f * this.Method_45076(f, 0.0952381f * 136.5f) * f2;
        this.Field_45073.Field_31984 = 2.909091f * 0.515625f * this.Method_45076(f, 17.8f * 0.7303371f) * f2;
        this.Field_45071.Field_31968 = 0.0f;
        this.Field_45073.Field_31968 = 0.0f;
    }

    public Class_45068(float f, float f2) {
        int n = 17571 & 2500;
        int n2 = 3209 & -31836;
        this.Field_45072 = new Class_31961(this).Method_31991(n, n2);
        this.Field_45072.Method_31993(0.0f, 0.0f + f2, 4.6842103f * -0.4269663f);
        this.Field_45072.Method_31988(812 & 20482, -21566 & 8).Method_31998(0.14925373f * -26.800001f, -2.1818182f * 5.5f, -8.25f * 0.6666667f, 18844 & 73, -32693 & 8350, 8266 & 905, f);
        this.Field_45072.Method_31988(792 & 3097, 2053 & 4642).Method_31998(-1.013889f * 0.98630136f, -66.666664f * 0.075f, -3.3333333f * 2.25f, 25667 & 4146, 30222 & -30396, 146 & 8462, f);
        this.Field_45070 = new Class_31961(this).Method_31991(n, n2);
        this.Field_45070.Method_31993(0.0f, 0.0f + f2, 0.0f);
        this.Field_45070.Method_31988(26776 & -27904, 17192 & 121).Method_31998(6.076923f * -1.4810127f, -1.5555556f * 1.2857143f, 1.7142857f * -3.5f, 1586 & -32489, 700 & 12, 16939 & 3227, f);
        this.Field_45070.Method_31988(-32768 & 16593, 1094 & -32058).Method_31998(0.43055555f * -10.451613f, 0.47058824f * 21.25f, 2.0555556f * -1.4594594f, -27175 & 8233, 3229 & -28345, -24154 & 527, f + 1.0967742f * 0.45588234f);
        this.Field_45074 = new Class_31961(this).Method_31991(n, n2);
        this.Field_45074.Method_31993(0.0f, -1.8229167f * 3.84f, 0.0f);
        this.Field_45074.Method_31988(16444 & 6524, -28651 & 10269).Method_31998(0.15957446f * -81.46667f, 0.13636364f * -18.333332f, 0.96153843f * -3.1200001f, 4246 & -24540, 18718 & -20386, 518 & 18519, f);
        this.Field_45069 = new Class_31961(this).Method_31991(n, n2);
        this.Field_45069.Method_31993(0.0f, 1.2105263f * -5.7826085f, 0.0f);
        this.Field_45069.Method_31988(-32643 & 12350, 62 & 1338).Method_31998(0.36486486f * 24.666668f, -0.8505154f * 2.939394f, 1.5172414f * -1.9772727f, 8324 & 17756, 19775 & 12318, 14854 & 17798, f);
        this.Field_45071 = new Class_31961(this, 8288 & 4100, 18582 & 278).Method_31991(n, n2);
        this.Field_45071.Method_31993(0.4050633f * -9.875f, 0.023809524f * 756.0f + f2, 0.0f);
        this.Field_45071.Method_31988(-3929 & 2405, 8329 & -31184).Method_31998(-1.5441177f * 2.2666667f, 0.1875f * -16.0f, -1.0531915f * 2.8484848f, 142 & -18074, 3440 & 16920, 7 & 3333, f);
        this.Field_45073 = new Class_31961(this, 9 & -7612, 22614 & 319).Method_31991(n, n2);
        this.Field_45073.Field_31965 = -3823 & 579;
        this.Field_45073.Method_31988(4668 & 18492, 1 & 17032).Method_31993(0.55172414f * 9.0625f, 1.0843374f * 16.6f + f2, 0.0f);
        this.Field_45073.Method_31998(2.375f * -1.4736842f, 0.98571426f * -3.0434783f, 4.142857f * -0.72413796f, -30586 & 16670, 8285 & 146, -13307 & 8263, f);
    }

    public Class_45068() {
        this(0.0f);
    }

    private void Method_45079() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

