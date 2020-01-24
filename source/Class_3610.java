/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_3610 {
    public final String Field_3611;
    public final float Field_3612;
    public final float Field_3613;

    public String Method_3614() {
        return this.Method_3616();
    }

    public float Method_3615() {
        return this.Field_3612;
    }

    public Class_3610(String string, float f, float f2) {
        this.Field_3611 = string;
        this.Field_3613 = f;
        this.Field_3612 = f2;
    }

    public String Method_3616() {
        return "dig." + this.Field_3611;
    }

    private void Method_3617() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public float Method_3618() {
        return this.Field_3613;
    }

    public String Method_3619() {
        return "step." + this.Field_3611;
    }
}

