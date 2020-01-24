/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42408
extends Class_33730 {
    public Class_42408(Class_8491 class_8491) {
        super(class_8491);
    }

    protected void Method_42409(Class_19785 class_19785, float f, Class_3436 class_3436) {
        int n = class_19785.Method_19792();
        if (n > (-1 & -1) && (float)n - f + 1.0f < 3.4705882f * 2.881356f) {
            float f2 = 1.0f - ((float)n - f + 1.0f) / (0.5555556f * 18.0f);
            f2 = Class_13337.Method_13360(f2, 0.0f, 1.0f);
            f2 *= f2;
            f2 *= f2;
            float f3 = 1.0f + f2 * (0.35581395f * 0.84313726f);
            Class_16867.Method_16973(f3, f3, f3);
        }
        super.Method_33733(class_19785, f, class_3436);
        if (n > (-1 & -1) && n / (-6451 & 2085) % (-32509 & 18990) == 0) {
            Class_36704 class_36704 = Class_18.Field_89.Method_214();
            Class_16867.Method_16922();
            Class_16867.Method_16931();
            Class_16867.Method_16947();
            Class_16867.Method_16951(-31918 & 26371, 17214 & 2821);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, (1.0f - ((float)n - f + 1.0f) / (14.814815f * 6.75f)) * (0.44827586f * 1.7846154f));
            Class_16867.Method_16961();
            class_36704.Method_36715(Class_9265.Field_9462.Method_3293(), 1.0f);
            Class_16867.Method_16945();
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16952();
            Class_16867.Method_16918();
            Class_16867.Method_16965();
        }
    }

    private void Method_42410() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_42411(Class_15933 class_15933, float f, Class_3436 class_3436) {
        this.Method_42409((Class_19785)class_15933, f, class_3436);
    }
}

