/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33578
implements Class_4997 {
    protected final double Field_33579;
    protected final double Field_33580;
    protected final double Field_33581;

    private void Method_33582() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_33578(double d, double d2, double d3) {
        this.Field_33580 = d;
        this.Field_33581 = d2;
        this.Field_33579 = d3;
    }

    public double Method_33583() {
        return this.Field_33579;
    }

    public double Method_33584() {
        return this.Field_33580;
    }

    public double Method_33585() {
        return this.Field_33581;
    }
}

