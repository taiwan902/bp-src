/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_16023
extends Class_11372 {
    public double Field_16024;
    public static String Field_16025;
    public double Field_16026;

    private void Method_16027() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_16028() {
        Class_18 class_18 = Class_18.Field_89;
        if (class_18.Field_72 != null && class_18.Field_48 != null) {
            this.Method_16029(class_18.Field_72, class_18.Field_48.\u0000= package, class_18.Field_48.\u0000= switch, class_18.Field_48.\u0000= ?, (0 & 9450) != 0, (8458 & 7169) != 0);
        } else {
            this.Method_16029(null, 0.0, 0.0, 0.0, (11283 & 20493) != 0, (81 & 17058) != 0);
        }
    }

    public void Method_16029(Class_283 class_283, double d, double d2, double d3, boolean bl, boolean bl2) {
        if (!this.\u0000strictfp.isEmpty()) {
            double d4 = 0.0;
            if (class_283 != null && !bl) {
                Class_4751 class_4751 = class_283.Method_372();
                double d5 = (double)class_4751.\u0000= final() - d;
                double d6 = (double)class_4751.\u0000strictfp() - d2;
                d4 = -(((d3 %= 0.1111111111111111 * 3240.0) - 0.8666666666666667 * 103.84615384615384) * (4.71238898038469 * 0.6666666666666666) / (142.38805970149255 * 1.2641509433962264) - Math.atan2(d6, d5));
                if (!class_283.Field_284.Method_18372()) {
                    d4 = Math.random() * (1.1304347826086956 * 2.779101193560202) * (0.373134328358209 * 5.359999999999999);
                }
            }
            if (bl2) {
                this.Field_16024 = d4;
            } else {
                double d7;
                for (d7 = d4 - this.Field_16024; d7 < -2.3360560757462565 * 1.3448275862068966; d7 += 3.1666666666666665 * 1.9841637812146062) {
                }
                while (d7 >= 6.981317007977318 * 0.45) {
                    d7 -= 11.760834036515636 * 0.5342465753424658;
                }
                d7 = Class_13337.Method_13385(d7, -3.444444444444444 * 0.2903225806451613, 1.0);
                this.Field_16026 += d7 * (15.5 * 0.0064516129032258064);
                this.Field_16026 *= 0.9500000000000001 * 0.8421052631578947;
                this.Field_16024 += this.Field_16026;
            }
            int n = (int)((this.Field_16024 / (1.2622950819672132 * 4.977588360233178) + 1.0) * (double)this.\u0000strictfp.size()) % this.\u0000strictfp.size();
            while (n < 0) {
                n = (n + this.\u0000strictfp.size()) % this.\u0000strictfp.size();
            }
            if (n != this.\u0000= final) {
                this.\u0000= final = n;
                Class_18695.Method_18712((int[][])this.\u0000strictfp.get(this.\u0000= final), this.\u0000, `, this.\u0000, for, this.\u0000
                , this.\u0000= int, (-27648 & 10970) != 0, (1025 & 4600) != 0);
            }
        }
    }

    public Class_16023(String string) {
        super(string);
        Field_16025 = string;
    }
}

