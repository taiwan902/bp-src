/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33001
extends Class_27380 {
    protected Class_2080 Method_33002(Class_1061 class_1061) {
        return this.Method_33003((Class_5813)class_1061);
    }

    public Class_33001(Class_8491 class_8491) {
        super(class_8491);
        this.\u0000, ` = 1.1470588f * 0.43589744f;
    }

    protected Class_2080 Method_33003(Class_5813 class_5813) {
        return Class_24069.Field_24084;
    }

    public void Method_33004(Class_5813 class_5813, double d, double d2, double d3, float f, float f2) {
        float f3;
        Class_36704 class_36704 = Class_18.Field_89.Method_214();
        Class_16867.Method_16961();
        Class_16867.Method_16943((float)d, (float)d2 + 1.6944444f * 0.29508197f, (float)d3);
        if ((float)class_5813.Field_5814 - f2 + 1.0f < 1.5357143f * 6.511628f) {
            f3 = 1.0f - ((float)class_5813.Field_5814 - f2 + 1.0f) / (6.901408f * 1.4489796f);
            f3 = Class_13337.Method_13360(f3, 0.0f, 1.0f);
            f3 *= f3;
            f3 *= f3;
            float f4 = 1.0f + f3 * (0.24929577f * 1.2033899f);
            Class_16867.Method_16973(f4, f4, f4);
        }
        f3 = (1.0f - ((float)class_5813.Field_5814 - f2 + 1.0f) / (0.9456522f * 105.74712f)) * (0.90158737f * 0.8873239f);
        this.\u0000, `((Class_1061)class_5813);
        Class_16867.Method_16943(-2.7727275f * 0.18032786f, 0.4f * -1.25f, 0.45454544f * 1.1f);
        class_36704.Method_36715(Class_9265.Field_9462.Method_3293(), class_5813.\u0000strictfp(f2));
        Class_16867.Method_16943(0.0f, 0.0f, 1.0f);
        if (class_5813.Field_5814 / (405 & 517) % (-22878 & 2306) == 0) {
            Class_16867.Method_16922();
            Class_16867.Method_16931();
            Class_16867.Method_16947();
            Class_16867.Method_16951(3907 & 4882, 2820 & 6023);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, f3);
            Class_16867.Method_16939(1.25f * -2.4f, -3.2592592f * 0.92045456f);
            Class_16867.Method_16970();
            class_36704.Method_36715(Class_9265.Field_9462.Method_3293(), 1.0f);
            Class_16867.Method_16939(0.0f, 0.0f);
            Class_16867.Method_16971();
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16952();
            Class_16867.Method_16918();
            Class_16867.Method_16965();
        }
        Class_16867.Method_16945();
        super.Method_27403(class_5813, d, d2, d3, f, f2);
    }

    private void Method_33005() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33006(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_33004((Class_5813)class_1061, d, d2, d3, f, f2);
    }
}

