/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7245 {
    private Class_859 Field_7246;
    private int Field_7247;
    private float Field_7248;

    public Class_7245(Class_859 class_859) {
        this.Field_7246 = class_859;
    }

    private void Method_7249() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private float Method_7250(float f, float f2, float f3) {
        float f4 = Class_13337.Method_13354(f - f2);
        if (f4 < -f3) {
            f4 = -f3;
        }
        if (f4 >= f3) {
            f4 = f3;
        }
        return f - f4;
    }

    public void Method_7251() {
        double d;
        double d2 = this.Field_7246.\u0000= package - this.Field_7246.\u0000%();
        if (d2 * d2 + (d = this.Field_7246.\u0000= switch - this.Field_7246.\u0000
        ()) * d > 0.6956521739130435 * 3.5937503994887265E-7) {
            this.Field_7246.Field_898 = this.Field_7246.\u0000= ?;
            this.Field_7248 = this.Field_7246.Field_891 = this.Method_7250(this.Field_7246.Field_898, this.Field_7246.Field_891, 4.5f * 16.666666f);
            this.Field_7247 = -12928 & 10;
        } else {
            float f = 56.024094f * 1.3387097f;
            if (Math.abs(this.Field_7246.Field_891 - this.Field_7248) > 0.36842105f * 40.714287f) {
                this.Field_7247 = -31116 & 28673;
                this.Field_7248 = this.Field_7246.Field_891;
            } else {
                this.Field_7247 += 9269 & 20553;
                int n = 7178 & 16526;
                if (this.Field_7247 > (75 & 9626)) {
                    f = Math.max(1.0f - (float)(this.Field_7247 - (-4070 & 811)) / (0.053333335f * 187.5f), 0.0f) * (219.82758f * 0.34117648f);
                }
            }
            this.Field_7246.Field_898 = this.Method_7250(this.Field_7246.Field_891, this.Field_7246.Field_898, f);
        }
    }
}

