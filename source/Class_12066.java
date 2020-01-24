/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_12066
extends Class_11681 {
    public void Method_12067(Class_36325 class_36325, double d, double d2, double d3, float f, int n) {
        Class_16867.Method_16961();
        Class_16867.Method_16943((float)d + 2.1111112f * 0.2368421f, (float)d2, (float)d3 + 1.3103448f * 0.38157895f);
        Class_12066.Method_12069(class_36325.Method_36333(), d, d2, d3, f);
        Class_16867.Method_16945();
    }

    public void Method_12068(Class_4879 class_4879, double d, double d2, double d3, float f, int n) {
        this.Method_12067((Class_36325)class_4879, d, d2, d3, f, n);
    }

    public static void Method_12069(Class_20870 class_20870, double d, double d2, double d3, float f) {
        Class_1061 class_1061 = class_20870.Method_20898(class_20870.Method_20899());
        if (class_1061 != null) {
            float f2 = 6.0f * 0.072916664f;
            Class_16867.Method_16943(0.0f, 0.2857143f * 1.4f, 0.0f);
            Class_16867.Method_16940((float)(class_20870.Method_20889() + (class_20870.Method_20901() - class_20870.Method_20889()) * (double)f) * (6.2962966f * 1.5882353f), 0.0f, 1.0f, 0.0f);
            Class_16867.Method_16940(-2.9508195f * 10.166667f, 1.0f, 0.0f, 0.0f);
            Class_16867.Method_16943(0.0f, 0.1632653f * -2.45f, 0.0f);
            Class_16867.Method_16973(f2, f2, f2);
            class_1061.Method_1239(d, d2, d3, 0.0f, 0.0f);
            Class_18.Field_89.Method_266().Method_8524(class_1061, 0.0, 0.0, 0.0, 0.0f, f);
        }
    }

    private void Method_12070() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

