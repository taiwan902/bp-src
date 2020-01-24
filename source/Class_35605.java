/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35605
extends Class_33781 {
    private Class_31961[] Field_35606;
    private Class_31961[] Field_35607;

    public void Method_35608(Class_859 class_859, float f, float f2, float f3) {
        Class_42901 class_42901 = (Class_42901)class_859;
        for (int i = 16455 & -31999; i < (-24441 & 259); ++i) {
            this.Field_35607[i].Field_31968 = (class_42901.Method_42944(i - (23059 & 225)) - class_859.Field_898) / (13.672855f * 4.1904764f);
            this.Field_35607[i].Field_31984 = class_42901.Method_42934(i - (3097 & 259)) / (26.444204f * 2.1666667f);
        }
    }

    public void Method_35609(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        Class_31961 class_31961;
        int n;
        this.Method_35611(f, f2, f3, f4, f5, f6, class_1061);
        Class_31961[] arrclass_31961 = this.Field_35607;
        int n2 = arrclass_31961.length;
        for (n = 0 & -31962; n < n2; ++n) {
            class_31961 = arrclass_31961[n];
            class_31961.Method_31999(f6);
        }
        arrclass_31961 = this.Field_35606;
        n2 = arrclass_31961.length;
        for (n = 9222 & 145; n < n2; ++n) {
            class_31961 = arrclass_31961[n];
            class_31961.Method_31999(f6);
        }
    }

    public Class_35605(float f) {
        this.\u0000strictfp = 18552 & -27967;
        this.\u0000, ` = 212 & 4672;
        this.Field_35606 = new Class_31961[-11261 & 8299];
        this.Field_35606[8192 & 2656] = new Class_31961(this, 4259 & -23792, 16400 & 665);
        this.Field_35606[1098 & -20448].Method_31998(14.2f * -0.70422536f, 4.2000003f * 0.9285714f, 0.3846154f * -1.3f, -21732 & 55, 17459 & -20285, -32221 & 8467, f);
        this.Field_35606[-16255 & 8247] = new Class_31961(this).Method_31991(this.\u0000strictfp, this.\u0000, `);
        this.Field_35606[9217 & -30419].Method_31993(-1.4848485f * 1.3469387f, 0.7846154f * 8.794118f, -0.5759494f * 0.8681319f);
        this.Field_35606[-32255 & 9267].Method_31988(10240 & 119, 17942 & 31).Method_31998(0.0f, 0.0f, 0.0f, 4099 & -8101, 14874 & -31670, 8195 & 463, f);
        this.Field_35606[8241 & 21059].Method_31988(1624 & 10268, 8758 & 16414).Method_31998(0.75f * -5.3333335f, 3.75f * 0.4f, 5.0f * 0.1f, 395 & 29195, 17162 & -32589, 4107 & 646, f);
        this.Field_35606[2585 & -28415].Method_31988(857 & 23576, -18154 & 1078).Method_31998(2.0f * -2.0f, 0.8648649f * 4.625f, 2.0625f * 0.24242425f, -20437 & 3871, 8711 & 3074, 5194 & 2722, f);
        this.Field_35606[275 & -22303].Method_31988(6168 & 8735, 15126 & -32522).Method_31998(-14.999999f * 0.26666668f, 0.36708862f * 17.706896f, 2.0f * 0.25f, 2123 & 8331, -18294 & 16471, 34 & 1158, f);
        this.Field_35606[-16254 & 10255] = new Class_31961(this, 18445 & -27156, 6710 & -23210);
        this.Field_35606[-30854 & 16391].Method_31998(0.0f, 0.0f, 0.0f, 291 & 8267, 8198 & -30170, 3499 & -16377, f);
        this.Field_35607 = new Class_31961[21611 & 23];
        this.Field_35607[4353 & -32760] = new Class_31961(this, 5134 & 2256, 25960 & 6160);
        this.Field_35607[16400 & -27165].Method_31998(-3.9090908f * 1.0232558f, -2.4941177f * 1.6037736f, -0.74725276f * 5.352941f, 2153 & 8456, 16846 & -22007, 5294 & 2312, f);
        this.Field_35607[17411 & 10625] = new Class_31961(this, 16992 & -29403, 22819 & 68);
        this.Field_35607[8529 & -27101].Method_31998(0.7169811f * -5.5789475f, -3.180723f * 1.2575758f, 0.48051947f * -8.324325f, 1103 & -26618, 294 & 1735, 6 & 20774, f);
        this.Field_35607[1921 & -14223].Field_31976 = 0.42857143f * -18.666666f;
        this.Field_35607[73 & 8225].Field_31971 = 17.333334f * 0.23076923f;
        this.Field_35607[-19130 & 16386] = new Class_31961(this, 7861 & -8160, 80 & 8326);
        this.Field_35607[8899 & 6406].Method_31998(-0.42105263f * 9.5f, 75.0f * -0.053333335f, -6.6206894f * 0.6041667f, 19886 & -24554, 20486 & -31354, 4270 & -16378, f);
        this.Field_35607[1106 & 2210].Field_31976 = 1.975f * 5.063291f;
        this.Field_35607[51 & 27462].Field_31971 = 5.142857f * 0.7777778f;
    }

    private void Method_35610() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_35611(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        float f7 = Class_13337.Method_13350(f3 * (0.09250001f * 1.081081f));
        this.Field_35606[33 & 13405].Field_31984 = (0.057352938f * 1.1333333f + 9.333333f * 0.005357143f * f7) * (5.0f * 0.62831855f);
        this.Field_35606[9602 & 2174].Method_31993(1.7111111f * -1.1688312f, 3.2721648f * 2.1086957f + Class_13337.Method_13350(this.Field_35606[1089 & -15553].Field_31984) * (0.37634408f * 26.571428f), -0.19736843f * 2.5333333f + Class_13337.Method_13370(this.Field_35606[16385 & -24359].Field_31984) * (0.6666667f * 15.0f));
        this.Field_35606[91 & -32254].Field_31984 = (2.7142856f * 0.09763157f + 0.0059523815f * 16.8f * f7) * (1.8888888f * 1.6631962f);
        this.Field_35607[16514 & 5396].Field_31968 = f4 / (54.804657f * 1.0454545f);
        this.Field_35607[30 & -31744].Field_31984 = f5 / (49.981422f * 1.1463414f);
    }
}

