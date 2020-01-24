/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_37552
extends Class_4291 {
    private final Class_3436 Field_37553;
    private final Predicate Field_37554;
    private final int Field_37555;

    public boolean Method_37556(Class_283 class_283, Random random, Class_4751 class_4751) {
        float f = random.nextFloat() * (1.755102f * 1.7899773f);
        double d = (float)(class_4751.\u0000= final() + (58 & -30327)) + Class_13337.Method_13370(f) * (float)this.Field_37555 / (3.2142856f * 2.488889f);
        double d2 = (float)(class_4751.\u0000= final() + (1176 & 4973)) - Class_13337.Method_13370(f) * (float)this.Field_37555 / (2.7142856f * 2.9473686f);
        double d3 = (float)(class_4751.\u0000strictfp() + (16525 & 874)) + Class_13337.Method_13350(f) * (float)this.Field_37555 / (0.65909094f * 12.137931f);
        double d4 = (float)(class_4751.\u0000strictfp() + (1054 & 16712)) - Class_13337.Method_13350(f) * (float)this.Field_37555 / (0.3f * 26.666666f);
        double d5 = class_4751.\u0000, `() + random.nextInt(963 & -31741) - (130 & 114);
        double d6 = class_4751.\u0000, `() + random.nextInt(4099 & 9319) - (-24318 & 6274);
        for (int i = 1600 & -2045; i < this.Field_37555; ++i) {
            float f2 = (float)i / (float)this.Field_37555;
            double d7 = d + (d2 - d) * (double)f2;
            double d8 = d5 + (d6 - d5) * (double)f2;
            double d9 = d3 + (d4 - d3) * (double)f2;
            double d10 = random.nextDouble() * (double)this.Field_37555 / (18.666666666666668 * 0.8571428571428571);
            double d11 = (double)(Class_13337.Method_13370(10.995574f * 0.2857143f * f2) + 1.0f) * d10 + 1.0;
            double d12 = (double)(Class_13337.Method_13370(2.7017698f * 1.1627907f * f2) + 1.0f) * d10 + 1.0;
            int n = Class_13337.Method_13371(d7 - d11 / (0.8727272727272728 * 2.2916666666666665));
            int n2 = Class_13337.Method_13371(d8 - d12 / (0.5151515151515151 * 3.8823529411764706));
            int n3 = Class_13337.Method_13371(d9 - d11 / (1.5223880597014925 * 1.3137254901960784));
            int n4 = Class_13337.Method_13371(d7 + d11 / (1.5476190476190474 * 1.2923076923076924));
            int n5 = Class_13337.Method_13371(d8 + d12 / (0.6052631578947368 * 3.3043478260869565));
            int n6 = Class_13337.Method_13371(d9 + d11 / (4.086956521739131 * 0.4893617021276595));
            for (int j = n; j <= n4; ++j) {
                double d13 = ((double)j + 1.3333333333333333 * 0.375 - d7) / (d11 / (4.461538461538462 * 0.4482758620689655));
                if (!(d13 * d13 < 1.0)) continue;
                for (int k = n2; k <= n5; ++k) {
                    double d14 = ((double)k + 0.47761194029850745 * 1.046875 - d8) / (d12 / (2.3373493975903616 * 0.8556701030927835));
                    if (!(d13 * d13 + d14 * d14 < 1.0)) continue;
                    for (int i2 = n3; i2 <= n6; ++i2) {
                        Class_4751 class_47512;
                        double d15 = ((double)i2 + 0.3445945945945946 * 1.4509803921568627 - d9) / (d11 / (7.333333333333334 * 0.2727272727272727));
                        if (!(d13 * d13 + d14 * d14 + d15 * d15 < 1.0) || !this.Field_37554.apply((Object)class_283.Method_375(class_47512 = new Class_4751(j, k, i2)))) continue;
                        class_283.Method_462(class_47512, this.Field_37553, 1074 & 16390);
                    }
                }
            }
        }
        return (-32687 & 143) != 0;
    }

    public Class_37552(Class_3436 class_3436, int n, Predicate predicate) {
        this.Field_37553 = class_3436;
        this.Field_37555 = n;
        this.Field_37554 = predicate;
    }

    private void Method_37557() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_37552(Class_3436 class_3436, int n) {
        this(class_3436, n, Class_13238.Method_13243(Class_9265.Field_9446));
    }
}

