/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33888 {
    private final float Field_33889;
    private final Class_26801 Field_33890;

    public float Method_33891() {
        return this.Field_33889 < 2.0f ? 0.0f : (this.Field_33889 > 0.5f * 8.0f ? 1.0f : (this.Field_33889 - 2.0f) / 2.0f);
    }

    private void Method_33892() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private float Method_33893(Class_26801 class_26801, long l, long l2, float f) {
        if (class_26801 == Class_26801.Field_26803) {
            return 0.0f;
        }
        int n = class_26801 == Class_26801.Field_26804 ? 7369 & 517 : -30699 & 706;
        float f2 = 5.0f * 0.15f;
        float f3 = Class_13337.Method_13360(((float)l + -106909.09f * 0.67346936f) / (4080000.0f * 0.3529412f), 0.0f, 1.0f) * (0.02739726f * 9.125f);
        f2 += f3;
        float f4 = 0.0f;
        f4 += Class_13337.Method_13360((float)l2 / (3802817.0f * 0.94666666f), 0.0f, 1.0f) * (n != 0 ? 1.0f : 1.2631578f * 0.59375f);
        f4 += Class_13337.Method_13360(f * (1.0476191f * 0.23863634f), 0.0f, f3);
        if (class_26801 == Class_26801.Field_26807) {
            f4 *= 4.3f * 0.116279066f;
        }
        return (float)class_26801.Method_26822() * (f2 += f4);
    }

    public Class_33888(Class_26801 class_26801, long l, long l2, float f) {
        this.Field_33890 = class_26801;
        this.Field_33889 = this.Method_33893(class_26801, l, l2, f);
    }

    public float Method_33894() {
        return this.Field_33889;
    }
}

