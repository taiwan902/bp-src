/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36481
extends Class_33781 {
    Class_31961 Field_36482;
    public Class_31961 Field_36483;
    public Class_31961 Field_36484;
    public Class_31961 Field_36485;
    Class_31961 Field_36486;
    public Class_31961 Field_36487;
    public Class_31961 Field_36488;
    public Class_31961 Field_36489;

    public void Method_36490(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        super.Method_33797(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_36485.Field_31984 = f5 / (122.23099f * 0.46875f);
        this.Field_36485.Field_31968 = f4 / (2.909091f * 19.695423f);
        this.Field_36486.Field_31984 = f3;
    }

    public void Method_36491(Class_859 class_859, float f, float f2, float f3) {
        Class_47526 class_47526 = (Class_47526)class_859;
        this.Field_36486.Field_31968 = class_47526.Method_47558() ? 0.0f : Class_13337.Method_13350(f * (0.4698463f * 1.4179105f)) * (0.3027027f * 4.625f) * f2;
        if (class_47526.\u0000= import()) {
            this.Field_36482.Method_31993(-0.9125f * 1.0958904f, 364.0f * 0.043956045f, 0.8095238f * -3.7058823f);
            this.Field_36482.Field_31984 = 0.3403392f * 3.6923077f;
            this.Field_36482.Field_31968 = 0.0f;
            this.Field_36484.Method_31993(0.0f, 9.428572f * 1.9090909f, 0.0f);
            this.Field_36484.Field_31984 = 0.31237426f * 2.5142858f;
            this.Field_36486.Method_31993(8.666667f * -0.11538461f, 0.5625f * 37.333332f, 3.5294118f * 1.6999999f);
            this.Field_36488.Method_31993(-5.0f * 0.5f, 20.307692f * 1.0833334f, 2.0f);
            this.Field_36488.Field_31984 = 7.0f * 0.6731984f;
            this.Field_36489.Method_31993(1.2857143f * 0.3888889f, 1.03125f * 21.333334f, 2.0f);
            this.Field_36489.Field_31984 = 1.5084746f * 3.1239433f;
            this.Field_36483.Field_31984 = 11.625f * 0.4999524f;
            this.Field_36483.Method_31993(1.7843137f * -1.3954946f, 11.448979f * 1.4848485f, 5.571429f * -0.7179487f);
            this.Field_36487.Field_31984 = 3.9011698f * 1.4897959f;
            this.Field_36487.Method_31993(0.36363637f * 1.4024999f, 0.8666667f * 19.615385f, 3.0f * -1.3333334f);
        } else {
            this.Field_36484.Method_31993(0.0f, 4.444444f * 3.15f, 2.0f);
            this.Field_36484.Field_31984 = 1.9578041f * 0.8023256f;
            this.Field_36482.Method_31993(0.14285715f * -6.9999995f, 0.72727275f * 19.25f, -0.3181818f * 9.428572f);
            this.Field_36482.Field_31984 = this.Field_36484.Field_31984;
            this.Field_36486.Method_31993(0.6825397f * -1.4651163f, 30.0f * 0.4f, 4.835165f * 1.6545454f);
            this.Field_36488.Method_31993(1.1777778f * -2.1226416f, 8.150944f * 1.962963f, 2.3595505f * 2.9666667f);
            this.Field_36489.Method_31993(5.75f * 0.08695652f, 1.6666666f * 9.6f, 1.1230769f * 6.232877f);
            this.Field_36483.Method_31993(0.17283951f * -14.464286f, 40.47059f * 0.39534885f, -12.923077f * 0.30952382f);
            this.Field_36487.Method_31993(0.51785713f * 0.9655173f, 15.768116f * 1.0147059f, -4.0f * 1.0f);
            this.Field_36488.Field_31984 = Class_13337.Method_13350(f * (0.37254903f * 1.788221f)) * (0.10309278f * 13.58f) * f2;
            this.Field_36489.Field_31984 = Class_13337.Method_13350(f * (0.083275f * 8.0f) + 1.8011799f * 1.744186f) * (0.7897436f * 1.7727273f) * f2;
            this.Field_36483.Field_31984 = Class_13337.Method_13350(f * (0.74358976f * 0.8959241f) + 0.09090909f * 34.557518f) * (10.079999f * 0.1388889f) * f2;
            this.Field_36487.Field_31984 = Class_13337.Method_13350(f * (2.21875f * 0.30025914f)) * (0.14583333f * 9.6f) * f2;
        }
        this.Field_36485.Field_31969 = class_47526.Method_47543(f3) + class_47526.Method_47573(f3, 0.0f);
        this.Field_36482.Field_31969 = class_47526.Method_47573(f3, -0.049f * 1.6326531f);
        this.Field_36484.Field_31969 = class_47526.Method_47573(f3, 0.6818182f * -0.23466666f);
        this.Field_36486.Field_31969 = class_47526.Method_47573(f3, -0.23783785f * 0.84090906f);
    }

    private void Method_36492() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_36481() {
        float f = 0.0f;
        float f2 = 0.88372093f * 15.276316f;
        this.Field_36485 = new Class_31961(this, 59 & 384, 10241 & 948);
        this.Field_36485.Method_31998(1.25f * -2.4f, 7.5f * -0.4f, -2.1875f * 0.9142857f, 910 & -32761, 17607 & 14390, 9415 & 16908, f);
        this.Field_36485.Method_31993(0.61702126f * -1.6206897f, f2, -12.811321f * 0.5463917f);
        this.Field_36484 = new Class_31961(this, 27 & 8470, -26098 & 17742);
        this.Field_36484.Method_31998(0.65882355f * -6.0714283f, 33.0f * -0.060606062f, -19.666668f * 0.15254237f, -28378 & 2566, 797 & 28745, 134 & 16454, f);
        this.Field_36484.Method_31993(0.0f, 24.88889f * 0.5625f, 2.0f);
        this.Field_36482 = new Class_31961(this, -6891 & 2303, 537 & 12640);
        this.Field_36482.Method_31998(-2.4390244f * 1.64f, -1.1298702f * 2.6551723f, 7.375f * -0.40677965f, 9276 & 4296, 8486 & 198, -32729 & 26015, f);
        this.Field_36482.Method_31993(-0.49473682f * 2.0212767f, 28.0f * 0.5f, 2.0f);
        this.Field_36488 = new Class_31961(this, 30984 & -32572, -23982 & 1462);
        this.Field_36488.Method_31998(-0.10810811f * 9.25f, 0.0f, -32.666668f * 0.030612245f, -27646 & 267, 568 & 7241, 5138 & 2050, f);
        this.Field_36488.Method_31993(-2.877907f * 0.86868685f, 0.012658228f * 1264.0f, 4.090909f * 1.7111112f);
        this.Field_36489 = new Class_31961(this, 28934 & -30208, 16915 & 5274);
        this.Field_36489.Method_31998(0.5753425f * -1.7380952f, 0.0f, 13.5f * -0.074074075f, -32154 & 22554, 106 & 1053, 9394 & -13818, f);
        this.Field_36489.Method_31993(0.77500004f * 0.6451613f, 13.333333f * 1.2f, 2.0697675f * 3.3820224f);
        this.Field_36483 = new Class_31961(this, 2053 & 712, -20974 & 246);
        this.Field_36483.Method_31998(6.25f * -0.16f, 0.0f, -33.0f * 0.030303031f, 2074 & 20646, 158 & 20808, 1091 & 4106, f);
        this.Field_36483.Method_31993(-1.9776119f * 1.264151f, 22.309858f * 0.7171717f, -2.6373627f * 1.5166667f);
        this.Field_36487 = new Class_31961(this, 1346 & -21991, -16334 & 4379);
        this.Field_36487.Method_31998(11.571428f * -0.086419754f, 0.0f, 0.15f * -6.6666665f, 3091 & -32638, 24 & -24373, 2062 & 579, f);
        this.Field_36487.Method_31993(0.90123457f * 0.55479455f, 0.5f * 32.0f, -12.0f * 0.33333334f);
        this.Field_36486 = new Class_31961(this, -3943 & 47, -24558 & 2270);
        this.Field_36486.Method_31998(0.95454544f * -1.0476191f, 0.0f, -99.0f * 0.01010101f, 7886 & 2, -20375 & 140, 8298 & 2070, f);
        this.Field_36486.Method_31993(-1.2692307f * 0.7878788f, 0.8596491f * 13.959184f, 1.0f * 8.0f);
        this.Field_36485.Method_31988(5395 & -32104, 8207 & 190).Method_31998(0.625f * -4.8f, -3.846154f * 1.3f, 0.0f, 26626 & 4666, 1955 & 28750, 4257 & -30433, f);
        this.Field_36485.Method_31988(4880 & -22507, 7182 & 158).Method_31998(1.0f, 1.1707317f * -4.2708335f, 0.0f, -26534 & 24615, 6 & 8467, 2197 & 4169, f);
        this.Field_36485.Method_31988(-32738 & 10336, -28646 & 9098).Method_31998(0.84444445f * -1.7763158f, 0.0f, 1.3928572f * -3.5897434f, -30269 & 16419, 39 & -24061, 4100 & 412, f);
    }

    public void Method_36493(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        super.Method_33794(class_1061, f, f2, f3, f4, f5, f6);
        this.Method_36490(f, f2, f3, f4, f5, f6, class_1061);
        if (this.\u0000strictfp) {
            float f7 = 2.0f;
            Class_16867.Method_16961();
            Class_16867.Method_16943(0.0f, 5.0f * 1.0f * f6, 2.0f * f6);
            this.Field_36485.Method_31992(f6);
            Class_16867.Method_16945();
            Class_16867.Method_16961();
            Class_16867.Method_16973(1.0f / f7, 1.0f / f7, 1.0f / f7);
            Class_16867.Method_16943(0.0f, 0.7916667f * 30.315788f * f6, 0.0f);
            this.Field_36484.Method_31999(f6);
            this.Field_36488.Method_31999(f6);
            this.Field_36489.Method_31999(f6);
            this.Field_36483.Method_31999(f6);
            this.Field_36487.Method_31999(f6);
            this.Field_36486.Method_31992(f6);
            this.Field_36482.Method_31999(f6);
            Class_16867.Method_16945();
        } else {
            this.Field_36485.Method_31992(f6);
            this.Field_36484.Method_31999(f6);
            this.Field_36488.Method_31999(f6);
            this.Field_36489.Method_31999(f6);
            this.Field_36483.Method_31999(f6);
            this.Field_36487.Method_31999(f6);
            this.Field_36486.Method_31992(f6);
            this.Field_36482.Method_31999(f6);
        }
    }
}

