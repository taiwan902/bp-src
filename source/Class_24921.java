/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24921 {
    private final boolean Field_24922;
    private final double Field_24923;
    private final double Field_24924;

    public double Method_24925() {
        return this.Field_24924;
    }

    public boolean Method_24926() {
        return this.Field_24922;
    }

    private void Method_24927() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_24921(double d, double d2, boolean bl) {
        this.Field_24924 = d;
        this.Field_24923 = d2;
        this.Field_24922 = bl;
    }

    public double Method_24928() {
        return this.Field_24923;
    }
}

