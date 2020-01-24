/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_19353
implements Class_7380 {
    private final Class_28538 Field_19354;

    public Class_19353(Class_28538 class_28538) {
        this.Field_19354 = class_28538;
    }

    public boolean Method_19355() {
        return (4361 & 10324) != 0;
    }

    private void Method_19356() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_19357(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        Class_23823 class_23823 = class_859.Method_1010();
        if (class_23823 != null) {
            Object object;
            Class_35973 class_35973 = (Class_35973)this.Field_19354.Method_28550();
            float f8 = class_35973.Field_35974;
            Class_16867.Method_16961();
            Class_16867.Method_16943(0.0f, 0.32380953f * 0.61764705f * class_35973.Field_35985, 0.0f);
            if (class_35973.\u0000strictfp) {
                object = 1.7916666f * 0.27906978f;
                Class_16867.Method_16943(0.0f, 0.26865673f * 2.3263888f, 0.0f);
                Class_16867.Method_16940(0.011235955f * -1780.0f, -1.0769231f * 0.9285714f, 0.0f, 0.0f);
                Class_16867.Method_16973(object, object, object);
            }
            if (class_859 instanceof Class_626) {
                Class_626 class_626 = (Class_626)class_859;
                if (((Boolean)Class_18.Field_89.Field_84.Field_39732.Field_8870.\u0000strictfp()).booleanValue()) {
                    if (class_626.Method_758()) {
                        class_35973.Method_35992(0.012999999f * 2.5f);
                        Class_16867.Method_16973(0.93202245f * 1.1265823f, 7.2625f * 0.14457831f, 2.6486487f * 0.39642853f);
                        Class_16867.Method_16943(-0.21315788f * 2.1111112f, 1.2222222f * 0.20454545f, -0.32200003f * 0.2173913f);
                        Class_16867.Method_16940(-2711.6667f * 9.0f, 201145.81f * 0.6825397f, 1.2195122f * -1648118.0f, 1.2105263f * -2193178.2f);
                    } else {
                        class_35973.Method_35992(0.08284884f * 0.75438595f);
                    }
                } else {
                    class_35973.Method_35992(0.0453629f * 1.3777778f);
                }
                if (!((Boolean)Class_18.Field_89.Field_84.Field_39732.Field_8855.\u0000strictfp()).booleanValue()) {
                    Class_16867.Method_16943(-0.10714286f * 0.5833333f, 1.7836539f * 0.24528302f, 1.4090909f * 0.04435484f);
                } else if (!class_626.Method_758()) {
                    Class_16867.Method_16943(-0.88350004f * 0.09677419f, 0.5463917f * 0.87391514f, 0.27038234f * 0.5862069f);
                    Class_16867.Method_16940(-117.16667f * 0.16216215f, 94.28571f * 0.21212122f, 0.0f, -14.333334f * 0.41860464f);
                } else {
                    Class_16867.Method_16943(7.2727275f * -0.00859375f, 0.18472221f * 2.368421f, 0.033653848f * 1.8571428f);
                }
            } else {
                class_35973.Method_35992(0.047413792f * 1.3181819f);
                Class_16867.Method_16943(-0.035416666f * 1.7647059f, 0.8413462f * 0.52f, 0.32051283f * 0.195f);
            }
            if (class_859 instanceof Class_626 && ((Class_626)class_859).Field_659 != null) {
                class_23823 = new Class_23823(Class_10527.Field_10609, 8461 & 16560);
            }
            object = class_23823.Method_23844();
            Class_18 class_18 = Class_18.Field_89;
            if (object instanceof Class_41056 && Class_3238.Method_3345((Class_1956)object).Method_3316() == (8790 & 4226)) {
                Class_16867.Method_16943(0.0f, 1.8181819f * 0.103125f, -0.20833333f * 1.5f);
                Class_16867.Method_16940(42.790695f * 0.4673913f, 1.0f, 0.0f, 0.0f);
                Class_16867.Method_16940(13.269231f * 3.3913043f, 0.0f, 1.0f, 0.0f);
                float f9 = 1.3571428f * 0.2763158f;
                Class_16867.Method_16973(-f9, -f9, f9);
            }
            class_18.Method_252().Method_6951(class_859, class_23823, Class_7673.Field_7674);
            Class_16867.Method_16945();
        }
    }
}

