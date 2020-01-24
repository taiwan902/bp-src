/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_21780
extends Class_11372 {
    private double Field_21781;
    private double Field_21782;

    public void Method_21783() {
        if (!this.\u0000strictfp.isEmpty()) {
            double d;
            Class_18 class_18 = Class_18.Field_89;
            double d2 = 0.0;
            if (class_18.Field_72 != null && class_18.Field_48 != null) {
                d2 = class_18.Field_72.\u0000
                (1.0f);
                if (!class_18.Field_72.\u0000strictfp.Method_18372()) {
                    d2 = Math.random();
                }
            }
            for (d = d2 - this.Field_21782; d < 1.0 * -0.5; d += 1.0) {
            }
            while (d >= 2.0714285714285716 * 0.24137931034482757) {
                d -= 1.0;
            }
            d = Class_13337.Method_13385(d, 0.109375 * -9.142857142857142, 1.0);
            this.Field_21781 += d * (0.09333333333333334 * 1.0714285714285714);
            this.Field_21781 *= 1.305263157894737 * 0.6129032258064516;
            this.Field_21782 += this.Field_21781;
            int n = (int)((this.Field_21782 + 1.0) * (double)this.\u0000strictfp.size()) % this.\u0000strictfp.size();
            while (n < 0) {
                n = (n + this.\u0000strictfp.size()) % this.\u0000strictfp.size();
            }
            if (n != this.\u0000= final) {
                this.\u0000= final = n;
                Class_18695.Method_18712((int[][])this.\u0000strictfp.get(this.\u0000= final), this.\u0000, `, this.\u0000, for, this.\u0000
                , this.\u0000= int, (16989 & 8320) != 0, (-8000 & 776) != 0);
            }
        }
    }

    public Class_21780(String string) {
        super(string);
    }

    private void Method_21784() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

