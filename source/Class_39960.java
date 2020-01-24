/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_39960
extends Class_33077 {
    private Class_46703 Field_39961;

    public Class_39960(Class_46703 class_46703) {
        this.Field_39961 = class_46703;
        this.\u0000strictfp(17025 & -24317);
    }

    public void Method_39962() {
        Random random = this.Field_39961.\u0000strictfp();
        double d = this.Field_39961.\u0000= package + (double)((random.nextFloat() * 2.0f - 1.0f) * (43.870968f * 0.3647059f));
        double d2 = this.Field_39961.\u0000, for() + (double)((random.nextFloat() * 2.0f - 1.0f) * (0.8061224f * 19.848103f));
        double d3 = this.Field_39961.\u0000= switch + (double)((random.nextFloat() * 2.0f - 1.0f) * (0.627451f * 25.5f));
        this.Field_39961.\u0000strictfp().Method_27094(d, d2, d3, 1.0);
    }

    public boolean Method_39963() {
        double d;
        double d2;
        Class_27079 class_27079 = this.Field_39961.\u0000strictfp();
        if (!class_27079.Method_27093()) {
            return (2049 & 513) != 0;
        }
        double d3 = class_27079.Method_27089() - this.Field_39961.\u0000= package;
        double d4 = d3 * d3 + (d = class_27079.Method_27090() - this.Field_39961.\u0000, for()) * d + (d2 = class_27079.Method_27091() - this.Field_39961.\u0000= switch) * d2;
        return (d4 < 1.0 || d4 > 2.903225806451613 * 1240.0 ? -32767 & 21585 : 24850 & 8) != 0;
    }

    public boolean Method_39964() {
        return (16963 & 12548) != 0;
    }

    private void Method_39965() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

