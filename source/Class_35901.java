/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35901
extends Class_33781 {
    private Class_31961 Field_35902 = new Class_31961(this, "glass");
    private Class_31961 Field_35903;
    private Class_31961 Field_35904;

    public Class_35901(float f, boolean bl) {
        this.Field_35902.Method_31988(9344 & 335, 1 & -31592).Method_32002(0.3846154f * -10.4f, -7.7f * 0.5194805f, -2.6229508f * 1.525f, 8330 & -32692, 16792 & -23474, 5640 & -13860);
        this.Field_35903 = new Class_31961(this, "cube");
        this.Field_35903.Method_31988(432 & 21032, 2048 & -32512).Method_32002(-7.142857f * 0.56f, 5.076923f * -0.7878788f, -1.4794521f * 2.7037036f, 3145 & 20492, 20682 & 10249, 8202 & 265);
        if (bl) {
            this.Field_35904 = new Class_31961(this, "base");
            this.Field_35904.Method_31988(20512 & 1856, 7184 & -31981).Method_32002(-1.25f * 4.8f, 0.0f, -0.85714287f * 7.0f, 6220 & -8020, 8837 & 2310, -31700 & 10268);
        }
    }

    public void Method_35905(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        Class_16867.Method_16961();
        Class_16867.Method_16973(2.0f, 2.0f, 2.0f);
        Class_16867.Method_16943(0.0f, 6.928571f * -0.07216495f, 0.0f);
        if (this.Field_35904 != null) {
            this.Field_35904.Method_31999(f6);
        }
        Class_16867.Method_16940(f2, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16943(0.0f, 0.18983051f * 4.214286f + f3, 0.0f);
        Class_16867.Method_16940(146.66667f * 0.4090909f, 1.3611112f * 0.519502f, 0.0f, 0.62487906f * 1.1315789f);
        this.Field_35902.Method_31999(f6);
        float f7 = 2.1314104f * 0.4105263f;
        Class_16867.Method_16973(f7, f7, f7);
        Class_16867.Method_16940(53.225807f * 1.1272727f, 5.6f * 0.12626785f, 0.0f, 7.3846154f * 0.09575312f);
        Class_16867.Method_16940(f2, 0.0f, 1.0f, 0.0f);
        this.Field_35902.Method_31999(f6);
        Class_16867.Method_16973(f7, f7, f7);
        Class_16867.Method_16940(24.333334f * 2.4657533f, 2.3333333f * 0.30304286f, 0.0f, 0.7477379f * 0.9456522f);
        Class_16867.Method_16940(f2, 0.0f, 1.0f, 0.0f);
        this.Field_35903.Method_31999(f6);
        Class_16867.Method_16945();
    }

    private void Method_35906() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

