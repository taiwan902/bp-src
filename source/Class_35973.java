/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35973
extends Class_33781 {
    public float Field_35974;
    public Class_31961 Field_35975;
    public Class_31961 Field_35976;
    public Class_31961 Field_35977;
    public Class_31961 Field_35978;
    public Class_31961 Field_35979;
    public boolean Field_35980;
    public float Field_35981;
    public boolean Field_35982;
    public Class_31961 Field_35983;
    public float Field_35984;
    public float Field_35985;
    public int Field_35986;
    public int Field_35987;
    public Class_31961 Field_35988;
    public float Field_35989;

    public Class_35973(float f) {
        this(f, 0.0f, 6211 & 1880, 16437 & 3872);
    }

    public void Method_35990(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_35995(f, f2, f3, f4, f5, f6, class_1061);
        Class_16867.Method_16961();
        if (this.\u0000strictfp) {
            float f7 = 2.0f;
            Class_16867.Method_16973(0.08695652f * 17.25f / f7, 1.5833334f * 0.9473684f / f7, 3.6000001f * 0.41666666f / f7);
            Class_16867.Method_16943(0.0f, 11.218391f * 1.4262295f * f6, 0.0f);
            this.Field_35975.Method_31999(f6);
            Class_16867.Method_16945();
            Class_16867.Method_16961();
            Class_16867.Method_16973(1.0f / f7, 1.0f / f7, 1.0f / f7);
            Class_16867.Method_16943(0.0f, 29.333334f * 0.8181818f * f6, 0.0f);
            this.Field_35976.Method_31999(f6);
            this.Field_35978.Method_31999(f6);
            this.Field_35983.Method_31999(f6);
            this.Field_35977.Method_31999(f6);
            this.Field_35979.Method_31999(f6);
            this.Field_35988.Method_31999(f6);
        } else {
            Class_16867.Method_16943(0.0f, 0.54761904f * 0.3652174f * this.Field_35985, 0.0f);
            this.Field_35975.Method_31999(f6);
            this.Field_35976.Method_31999(f6);
            this.Field_35978.Method_31999(f6);
            this.Field_35983.Method_31999(f6);
            this.Field_35977.Method_31999(f6);
            this.Field_35979.Method_31999(f6);
            this.Field_35988.Method_31999(f6);
        }
        Class_16867.Method_16945();
    }

    private void Method_35991() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_35992(float f) {
        this.Field_35978.Method_31996(f);
    }

    public Class_35973(float f, float f2, int n, int n2) {
        this.\u0000strictfp = n;
        this.\u0000, ` = n2;
        this.Field_35975 = new Class_31961(this, -24288 & 3157, 10240 & 1033);
        this.Field_35975.Method_31998(-27.272728f * 0.14666666f, -16.0f * 0.5f, 0.11111111f * -36.0f, 19500 & -24103, -27991 & 9290, 843 & 188, f);
        this.Field_35975.Method_31993(0.0f, 0.0f + f2, 0.0f);
        this.Field_35988 = new Class_31961(this, 13220 & 18466, 1184 & 260);
        this.Field_35988.Method_31998(-7.384615f * 0.5416667f, -0.6075949f * 13.166667f, 1.2394366f * -3.2272727f, 44 & 20506, 142 & -30968, 14 & -17336, f + 2.5833335f * 0.19354838f);
        this.Field_35988.Method_31993(0.0f, 0.0f + f2, 0.0f);
        this.Field_35976 = new Class_31961(this, 11346 & 24, 2417 & 20500);
        this.Field_35976.Method_31998(3.875f * -1.032258f, 0.0f, -2.1290324f * 0.93939394f, 10 & -6487, -32242 & 8204, 413 & 10244, f);
        this.Field_35976.Method_31993(0.0f, 0.0f + f2, 0.0f);
        this.Field_35978 = new Class_31961(this, -14292 & 105, -32617 & 10320);
        this.Field_35978.Method_31998(-3.0f * 1.0f, -1.9696969f * 1.0153847f, 1.4f * -1.4285715f, 2447 & 17956, 44 & -16226, 16868 & 5133, f);
        this.Field_35978.Method_31993(-0.5970149f * 8.375f, 2.0f + f2, 0.0f);
        this.Field_35983 = new Class_31961(this, 28730 & 3373, 2128 & -19437);
        this.Field_35983.Field_31965 = 849 & 19457;
        this.Field_35983.Method_31998(-2.3846154f * 0.41935483f, 0.63076925f * -3.1707315f, -1.76f * 1.1363636f, -22548 & 5, -32740 & 19790, -1867 & 12, f);
        this.Field_35983.Method_31993(2.5f * 2.0f, 2.0f + f2, 0.0f);
        this.Field_35977 = new Class_31961(this, 2 & -19947, -28144 & 9680);
        this.Field_35977.Method_31998(-0.4897959f * 4.0833335f, 0.0f, 0.051282052f * -39.0f, 5124 & 420, 1068 & -22004, -16228 & 13348, f);
        this.Field_35977.Method_31993(0.7162162f * -2.6528301f, 0.9139785f * 13.129412f + f2, 0.0f);
        this.Field_35979 = new Class_31961(this, 128 & 1316, 272 & 16560);
        this.Field_35979.Field_31965 = 1025 & 4097;
        this.Field_35979.Method_31998(-2.245614f * 0.890625f, 0.0f, -1.6956521f * 1.1794872f, 2572 & 437, 8302 & 141, 24661 & 3884, f);
        this.Field_35979.Method_31993(0.5f * 3.8f, 3.1515152f * 3.8076923f + f2, 0.0f);
    }

    public Class_35973() {
        this(0.0f);
    }

    public void Method_35993(boolean bl) {
        this.Field_35975.Field_31967 = bl;
        this.Field_35988.Field_31967 = bl;
        this.Field_35976.Field_31967 = bl;
        this.Field_35978.Field_31967 = bl;
        this.Field_35983.Field_31967 = bl;
        this.Field_35977.Field_31967 = bl;
        this.Field_35979.Field_31967 = bl;
    }

    public void Method_35994(Class_33781 class_33781) {
        super.Method_33792(class_33781);
        if (class_33781 instanceof Class_35973) {
            Class_35973 class_35973 = (Class_35973)class_33781;
            this.Field_35987 = class_35973.Field_35987;
            this.Field_35986 = class_35973.Field_35986;
            this.Field_35980 = class_35973.Field_35980;
            this.Field_35982 = class_35973.Field_35982;
            this.Field_35985 = class_35973.Field_35985;
            this.Field_35984 = class_35973.Field_35984;
            this.Field_35974 = class_35973.Field_35974;
            this.Field_35981 = class_35973.Field_35981;
            this.Field_35989 = class_35973.Field_35989;
        }
    }

    public void Method_35995(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        float f7;
        float f8;
        float f9 = 1.0f - this.Field_35989;
        float f10 = this.Field_35984 * f9;
        float f11 = 1.0f - f10;
        f4 += 31.764708f * 5.6666665f;
        if ((f4 %= 240.0f * 1.5f) < 0.0f) {
            f4 += 1.1081082f * 324.87802f;
        }
        this.Field_35975.Field_31968 = (f4 -= 123.8961f * 1.4528302f) / (4.1418633f * 13.833333f);
        this.Field_35975.Field_31984 = f5 / (277.88452f * 0.20618556f);
        this.Field_35978.Field_31984 = f11 * (Class_13337.Method_13350(f * (0.6987952f * 0.95335513f) + 2.09375f * 1.5004622f) * 2.0f * f2 * (0.17741935f * 2.818182f));
        this.Field_35983.Field_31984 = f11 * (Class_13337.Method_13350(f * (0.99929994f * 0.6666667f)) * 2.0f * f2 * (0.5135135f * 0.97368425f));
        this.Field_35978.Field_31969 = 0.0f;
        this.Field_35983.Field_31969 = 0.0f;
        this.Field_35977.Field_31984 = Class_13337.Method_13350(f * (0.06662f * 10.0f)) * (1.0f * 1.4f) * f2;
        this.Field_35979.Field_31984 = Class_13337.Method_13350(f * (1.3414634f * 0.4966218f) + 304.7345f * 0.010309278f) * (0.6444444f * 2.1724138f) * f2;
        this.Field_35977.Field_31968 = 0.0f;
        this.Field_35979.Field_31968 = 0.0f;
        if (this.\u0000, `) {
            this.Field_35978.Field_31984 += 1.53125f * -0.41033047f;
            this.Field_35983.Field_31984 += -0.21666156f * 2.9f;
            this.Field_35977.Field_31984 = -1.803001f * 0.6969697f;
            this.Field_35979.Field_31984 = -2.0516524f * 0.6125f;
            this.Field_35977.Field_31968 = 0.20668374f * 1.52f;
            this.Field_35979.Field_31968 = 1.3636364f * -0.23038347f;
        }
        if (class_1061 instanceof Class_626) {
            Class_626 class_626 = (Class_626)class_1061;
            if (class_626.Field_696.Method_20135()) {
                this.Field_35983.Field_31984 = this.Field_35983.Field_31984 * (0.26984128f * 1.852941f) - 0.20616701f * 1.5238096f;
            }
        } else if (this.Field_35987 != 0) {
            this.Field_35983.Field_31984 = this.Field_35983.Field_31984 * (0.17741936f * 2.8181818f) - 0.35167083f * 0.8933333f * (float)this.Field_35987;
        }
        this.Field_35978.Field_31968 = 0.0f;
        this.Field_35978.Field_31969 = 0.0f;
        float f12 = this.Field_35981;
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        f12 = 1.0f - f12;
        this.Field_35978.Field_31984 *= 2.96f * 0.16891892f + f12 * (85.0f * 0.005882353f);
        this.Field_35978.Field_31984 -= 4.0588236f * 0.077401556f * this.Field_35981;
        if (((Boolean)Class_18.Field_89.Field_84.Field_39732.Field_8870.\u0000strictfp()).booleanValue()) {
            this.Field_35978.Field_31968 *= 1.0f - this.Field_35974;
            this.Field_35978.Field_31968 = 0.21839081f * -2.3975313f * this.Field_35974;
        }
        this.Field_35983.Field_31968 = 0.0f;
        if (this.\u0000strictfp > -34083.527f * 0.29310346f) {
            f7 = this.\u0000strictfp;
            this.Field_35976.Field_31968 = Class_13337.Method_13370(Class_13337.Method_13388(f7) * (31.0f * 0.1013417f) * 2.0f) * (0.11388889f * 1.7560976f);
            this.Field_35978.Field_31972 = Class_13337.Method_13370(this.Field_35976.Field_31968) * (0.5681818f * 8.8f);
            this.Field_35978.Field_31976 = -Class_13337.Method_13350(this.Field_35976.Field_31968) * (5.8f * 0.86206895f);
            this.Field_35983.Field_31972 = -Class_13337.Method_13370(this.Field_35976.Field_31968) * (0.371134f * 13.472222f);
            this.Field_35983.Field_31976 = Class_13337.Method_13350(this.Field_35976.Field_31968) * (5.10989f * 0.97849464f);
            this.Field_35978.Field_31968 += this.Field_35976.Field_31968;
            this.Field_35983.Field_31968 += this.Field_35976.Field_31968;
            this.Field_35983.Field_31984 += this.Field_35976.Field_31968;
            f7 = 1.0f - this.\u0000strictfp;
            f7 *= f7;
            f7 *= f7;
            f7 = 1.0f - f7;
            f8 = Class_13337.Method_13370(f7 * (0.31578946f * 9.948378f));
            float f13 = Class_13337.Method_13370(this.\u0000strictfp * (6.4666667f * 0.48581332f)) * -(this.Field_35975.Field_31984 - 0.98245615f * 0.7125f) * (0.6545454f * 1.1458334f);
            this.Field_35978.Field_31984 = (float)((double)this.Field_35978.Field_31984 - ((double)f8 * (1.2521739130434781 * 0.9583333333333334) + (double)f13));
            this.Field_35978.Field_31968 += this.Field_35976.Field_31968 * 2.0f;
            this.Field_35978.Field_31969 += Class_13337.Method_13370(this.\u0000strictfp * (1.6319963f * 1.925f)) * (5.1666665f * -0.077419356f);
        }
        this.Field_35976.Field_31984 = this.Field_35985 * (2.5f * 0.2f);
        this.Field_35978.Field_31984 += this.Field_35985 * (0.36363637f * 1.1f);
        this.Field_35983.Field_31984 += this.Field_35985 * (0.974359f * 0.41052634f);
        this.Field_35977.Field_31972 = 1.8888888f * 0.052941177f + 8.706977f * 0.44791666f * this.Field_35985;
        this.Field_35979.Field_31972 = 0.022222223f * 4.5f + 0.4457143f * 8.75f * this.Field_35985;
        this.Field_35977.Field_31971 = 6.375f * 1.882353f - 5.8461537f * 0.5131579f * this.Field_35985;
        this.Field_35979.Field_31971 = 0.5813953f * 20.640001f - 2.325f * 1.2903225f * this.Field_35985;
        this.Field_35975.Field_31971 = 1.0f * this.Field_35985;
        this.Field_35978.Field_31984 = (float)((double)this.Field_35978.Field_31984 + 0.7126436781609196 * -2.204181942438 * (double)f10);
        this.Field_35978.Field_31968 = (float)((double)this.Field_35978.Field_31968 + 1.0392156862745099 * -0.5878137197754486 * (double)f10);
        this.Field_35983.Field_31984 = (float)((double)this.Field_35983.Field_31984 + 0.10313309216330128 * 2.5384615384615383 * (double)f10);
        this.Field_35983.Field_31968 = (float)((double)this.Field_35983.Field_31968 + 6.642857142857143 * 0.03941066052890421 * (double)f10);
        this.Field_35983.Field_31969 = (float)((double)this.Field_35983.Field_31969 + -2.2660668320975557 * 0.8472222222222222 * (double)f10);
        this.Field_35975.Field_31984 = (float)((double)this.Field_35975.Field_31984 + 2.0434782608695654 * 0.38434378208811293 * (double)f10);
        this.Field_35975.Field_31968 = (float)((double)this.Field_35975.Field_31968 + 9.97746555723425 * 0.061224489795918366 * (double)f10);
        this.Field_35978.Field_31969 += f11 * (Class_13337.Method_13350(f3 * (0.10285715f * 0.875f)) * (2.0f * 0.025f) + 0.05277778f * 0.94736844f);
        this.Field_35983.Field_31969 -= f11 * (Class_13337.Method_13350(f3 * (0.17081635f * 0.5268817f)) * (0.73333335f * 0.06818182f) + 0.45454547f * 0.11f);
        this.Field_35978.Field_31984 += f11 * (Class_13337.Method_13370(f3 * (0.20937501f * 0.32f)) * (0.056f * 0.89285713f));
        this.Field_35983.Field_31984 -= f11 * (Class_13337.Method_13370(f3 * (59.0f * 0.0011355933f)) * (0.44680852f * 0.11190476f));
        if ((double)this.Field_35989 > 4.6808510638297874E-4 * 2.1363636363636362) {
            f7 = 0.0f;
            f8 = 0.0f;
            this.Field_35978.Field_31969 = this.Field_35978.Field_31969 * f9 + 0.0f;
            this.Field_35983.Field_31969 = this.Field_35983.Field_31969 * f9 + 0.0f;
            this.Field_35978.Field_31968 = this.Field_35978.Field_31968 * f9 + (-(1.3125f * 0.07619048f - f7 * (0.6666667f * 0.90000004f)) + this.Field_35975.Field_31968) * this.Field_35989;
            this.Field_35983.Field_31968 = this.Field_35983.Field_31968 * f9 + (0.120000005f * 0.8333333f - f7 * (1.0869565f * 0.55200005f) + this.Field_35975.Field_31968 + 0.45925927f * 0.87096775f) * this.Field_35989;
            this.Field_35978.Field_31984 = this.Field_35978.Field_31984 * f9 + (-6.492625f * 0.24193548f + this.Field_35975.Field_31984) * this.Field_35989;
            this.Field_35983.Field_31984 = this.Field_35983.Field_31984 * f9 + (0.14492753f * -10.838495f + this.Field_35975.Field_31984) * this.Field_35989;
            this.Field_35978.Field_31984 -= (f7 * (3.6000001f * 0.33333334f) - f8 * (31.2f * 0.012820513f)) * this.Field_35989;
            this.Field_35983.Field_31984 -= (f7 * (112.80001f * 0.010638298f) - f8 * (5.8f * 0.06896552f)) * this.Field_35989;
            this.Field_35978.Field_31969 += (Class_13337.Method_13350(f3 * (0.23529412f * 0.38250002f)) * (0.5945946f * 0.08409091f) + 0.485f * 0.10309278f) * this.Field_35989;
            this.Field_35983.Field_31969 -= (Class_13337.Method_13350(f3 * (0.059361704f * 1.516129f)) * (1.04f * 0.048076924f) + 5.2f * 0.009615385f) * this.Field_35989;
            this.Field_35978.Field_31984 = (float)((double)this.Field_35978.Field_31984 + (double)Class_13337.Method_13370(f3 * (0.70666665f * 0.09481133f)) * (0.04488636363636364 * 1.1139240506329113) * (double)this.Field_35989);
            this.Field_35983.Field_31984 -= Class_13337.Method_13370(f3 * (10.75f * 0.0062325583f)) * (0.026470589f * 1.8888888f) * this.Field_35989;
        }
        Class_35973.\u0000strictfp((Class_31961)this.Field_35975, (Class_31961)this.Field_35988);
    }
}

