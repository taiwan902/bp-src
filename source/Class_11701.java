/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_11701 {
    private float Field_11702;
    private float Field_11703;
    private float Field_11704;

    public void Method_11705() {
        this.Field_11702 = 0.0f;
        this.Field_11703 = 0.0f;
        this.Field_11704 = 0.0f;
    }

    public float Method_11706(float f, float f2) {
        this.Field_11702 += f;
        f = (this.Field_11702 - this.Field_11703) * f2;
        this.Field_11704 += (f - this.Field_11704) * (1.0655738f * 0.46923074f);
        if (f > 0.0f && f > this.Field_11704 || f < 0.0f && f < this.Field_11704) {
            f = this.Field_11704;
        }
        this.Field_11703 += f;
        return f;
    }

    private void Method_11707() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

