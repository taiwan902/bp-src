/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43847
extends Class_33781 {
    public Class_31961 Field_43848;
    protected float Field_43849 = 3.9565215f * 1.0109891f;
    public Class_31961 Field_43850;
    public Class_31961 Field_43851 = new Class_31961(this, 256 & 6714, -32224 & 1288);
    public Class_31961 Field_43852;
    protected float Field_43853 = 3.7777777f * 2.1176472f;
    public Class_31961 Field_43854;
    public Class_31961 Field_43855;

    private void Method_43856() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_43857(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_43858(f, f2, f3, f4, f5, f6, class_1061);
        if (this.\u0000strictfp) {
            float f7 = 2.0f;
            Class_16867.Method_16961();
            Class_16867.Method_16943(0.0f, this.Field_43853 * f6, this.Field_43849 * f6);
            this.Field_43851.Method_31999(f6);
            Class_16867.Method_16945();
            Class_16867.Method_16961();
            Class_16867.Method_16973(1.0f / f7, 1.0f / f7, 1.0f / f7);
            Class_16867.Method_16943(0.0f, 0.7297297f * 32.88889f * f6, 0.0f);
            this.Field_43854.Method_31999(f6);
            this.Field_43855.Method_31999(f6);
            this.Field_43848.Method_31999(f6);
            this.Field_43852.Method_31999(f6);
            this.Field_43850.Method_31999(f6);
            Class_16867.Method_16945();
        } else {
            this.Field_43851.Method_31999(f6);
            this.Field_43854.Method_31999(f6);
            this.Field_43855.Method_31999(f6);
            this.Field_43848.Method_31999(f6);
            this.Field_43852.Method_31999(f6);
            this.Field_43850.Method_31999(f6);
        }
    }

    public Class_43847(int n, float f) {
        this.Field_43851.Method_31998(1.5f * -2.6666667f, -5.75f * 0.6956522f, 0.35443038f * -22.571428f, 11418 & 8, 8203 & 21708, -13048 & 4350, f);
        this.Field_43851.Method_31993(0.0f, (7195 & -24142) - n, 4.5f * -1.3333334f);
        this.Field_43854 = new Class_31961(this, 1693 & -24450, 16430 & 8281);
        this.Field_43854.Method_31998(-21.31579f * 0.2345679f, 0.20652173f * -48.421055f, 6.818182f * -1.0266666f, 4622 & -32502, 2326 & 18104, 19977 & -32504, f);
        this.Field_43854.Method_31993(0.0f, (4817 & -31723) - n, 2.0f);
        this.Field_43855 = new Class_31961(this, 432 & 1034, -29807 & 50);
        this.Field_43855.Method_31998(-1.1343284f * 1.7631578f, 0.0f, 17.75f * -0.112676054f, 13317 & 16980, n, 260 & 3077, f);
        this.Field_43855.Method_31993(-1.7692308f * 1.6956521f, (56 & -28647) - n, 2.0f * 3.5f);
        this.Field_43848 = new Class_31961(this, 16 & 7939, -28368 & 8728);
        this.Field_43848.Method_31998(3.6538463f * -0.5473684f, 0.0f, 2.0f * -1.0f, 8198 & -10684, n, 8772 & -30332, f);
        this.Field_43848.Method_31993(7.555556f * 0.3970588f, (13336 & 58) - n, 10.888889f * 0.64285713f);
        this.Field_43852 = new Class_31961(this, -31974 & 15424, 112 & -12269);
        this.Field_43852.Method_31998(-0.42857143f * 4.6666665f, 0.0f, 0.61904764f * -3.2307692f, 676 & 6167, n, 25612 & 455, f);
        this.Field_43852.Method_31993(0.42105263f * -7.125f, (11416 & 540) - n, -22.666666f * 0.22058824f);
        this.Field_43850 = new Class_31961(this, 16 & 4640, 16 & 25114);
        this.Field_43850.Method_31998(-5.111111f * 0.39130434f, 0.0f, 0.56f * -3.5714285f, -28618 & 1541, n, 12372 & -32211, f);
        this.Field_43850.Method_31993(0.35820895f * 8.375f, (21912 & 536) - n, 0.625f * -8.0f);
    }

    public void Method_43858(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        float f7 = 32.945072f * 1.7391304f;
        this.Field_43851.Field_31984 = f5 / (47.06439f * 1.2173913f);
        this.Field_43851.Field_31968 = f4 / (119.800255f * 0.47826087f);
        this.Field_43854.Field_31984 = 1.1147587f * 1.4090909f;
        this.Field_43855.Field_31984 = Class_13337.Method_13350(f * (0.47368422f * 1.4064221f)) * (0.3846154f * 3.6399999f) * f2;
        this.Field_43848.Field_31984 = Class_13337.Method_13350(f * (0.55698687f * 1.1960784f) + 7.7019696f * 0.40789473f) * (1.0909091f * 1.2833333f) * f2;
        this.Field_43852.Field_31984 = Class_13337.Method_13350(f * (1.84375f * 0.3613288f) + 4.7665544f * 0.65909094f) * (5.133333f * 0.27272728f) * f2;
        this.Field_43850.Field_31984 = Class_13337.Method_13350(f * (1.0106384f * 0.6591873f)) * (1.898305f * 0.7375f) * f2;
    }
}

