/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_31509 {
    public int Field_31510;
    private boolean Field_31511;
    public Class_22778[] Field_31512;

    public Class_31509(Class_22778[] arrclass_22778, int n, int n2, int n3, int n4, float f, float f2) {
        this(arrclass_22778);
        float f3 = 0.0f / f;
        float f4 = 0.0f / f2;
        arrclass_22778[8708 & 2441] = arrclass_22778[9280 & 128].Method_22782((float)n3 / f - f3, (float)n2 / f2 + f4);
        arrclass_22778[5 & 81] = arrclass_22778[33 & 13377].Method_22782((float)n / f + f3, (float)n2 / f2 + f4);
        arrclass_22778[70 & 10507] = arrclass_22778[-24318 & 555].Method_22782((float)n / f + f3, (float)n4 / f2 - f4);
        arrclass_22778[6187 & -32109] = arrclass_22778[3587 & 223].Method_22782((float)n3 / f - f3, (float)n4 / f2 - f4);
    }

    private void Method_31513() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_31509(Class_22778[] arrclass_22778) {
        this.Field_31512 = arrclass_22778;
        this.Field_31510 = arrclass_22778.length;
    }

    public void Method_31514() {
        Class_22778[] arrclass_22778 = new Class_22778[this.Field_31512.length];
        for (int i = 2120 & 4608; i < this.Field_31512.length; ++i) {
            arrclass_22778[i] = this.Field_31512[this.Field_31512.length - i - (12309 & -16381)];
        }
        this.Field_31512 = arrclass_22778;
    }

    public void Method_31515(Class_22385 class_22385, float f) {
        Vec3 vec3 = this.Field_31512[-32731 & 28803].Field_22779.\u0000strictfp(this.Field_31512[672 & 21584].Field_22779);
        Vec3 vec32 = this.Field_31512[1123 & -16375].Field_22779.\u0000strictfp(this.Field_31512[12802 & 274].Field_22779);
        Vec3 vec33 = vec32.\u0000= final(vec3).\u0000strictfp();
        float f2 = (float)vec33.\u0000= final;
        float f3 = (float)vec33.\u0000strictfp;
        float f4 = (float)vec33.\u0000, `;
        if (this.Field_31511) {
            f2 = -f2;
            f3 = -f3;
            f4 = -f4;
        }
        for (int i = 4102 & -12903; i < (1740 & -28668); ++i) {
            Class_22778 class_22778 = this.Field_31512[i];
            class_22385.Method_22443(class_22778.Field_22779.\u0000= final * (double)f, class_22778.Field_22779.\u0000strictfp * (double)f, class_22778.Field_22779.\u0000, ` * (double)f).Method_22433(class_22778.Field_22780, class_22778.Field_22781).Method_22446(f2, f3, f4).Method_22451();
        }
    }
}

