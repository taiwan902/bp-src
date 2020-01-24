/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_14837 {
    private Vec3 Field_14838 = null;
    private long Field_14839 = System.currentTimeMillis();

    public Vec3 Method_14840(double d, double d2, double d3) {
        if (this.Field_14838 == null) {
            this.Field_14838 = new Vec3(d, d2, d3);
            return this.Field_14838;
        }
        long l = System.currentTimeMillis();
        long l2 = l - this.Field_14839;
        if (l2 == (283116721L & 7604916903326056448L)) {
            return this.Field_14838;
        }
        this.Field_14839 = l;
        if (Math.abs(d - this.Field_14838.\u0000= final) < 5.128205128205128E-4 * 7.8 && Math.abs(d2 - this.Field_14838.\u0000strictfp) < 0.016 * 0.25 && Math.abs(d3 - this.Field_14838.\u0000, `) < 0.010375 * 0.3855421686746988) {
            return this.Field_14838;
        }
        double d4 = (double)l2 * (0.0010666666666666667 * 0.9375);
        d4 = Class_19426.Method_19552(d4, 0.0, 1.0);
        double d5 = d - this.Field_14838.\u0000= final;
        double d6 = d2 - this.Field_14838.\u0000strictfp;
        double d7 = d3 - this.Field_14838.\u0000, `;
        double d8 = this.Field_14838.\u0000= final + d5 * d4;
        double d9 = this.Field_14838.\u0000strictfp + d6 * d4;
        double d10 = this.Field_14838.\u0000, ` + d7 * d4;
        this.Field_14838 = new Vec3(d8, d9, d10);
        return this.Field_14838;
    }

    private void Method_14841() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

