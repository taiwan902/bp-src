/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_29123
extends Class_4291 {
    private Class_3436 Field_29124;
    private Class_5596 Field_29125;

    public Class_29123(Class_5596 class_5596, Class_5607 class_5607) {
        this.Method_29128(class_5596, class_5607);
    }

    private void Method_29126() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_29127(Class_283 class_283, Random random, Class_4751 class_4751) {
        for (int i = 10288 & 1153; i < (18755 & 8788); ++i) {
            Class_4751 class_47512 = class_4751.Method_4791(random.nextInt(-30631 & 1164) - random.nextInt(-31736 & 2205), random.nextInt(4445 & 10278) - random.nextInt(1044 & -32059), random.nextInt(-23526 & 2472) - random.nextInt(1709 & 18506));
            if (!class_283.Method_507(class_47512) || class_283.Field_284.Method_18370() && class_47512.\u0000, `() >= (1791 & 18687) || !this.Field_29125.\u0000strictfp(class_283, class_47512, this.Field_29124)) continue;
            class_283.Method_462(class_47512, this.Field_29124, 22090 & -30414);
        }
        return (257 & 10757) != 0;
    }

    public void Method_29128(Class_5596 class_5596, Class_5607 class_5607) {
        this.Field_29125 = class_5596;
        this.Field_29124 = class_5596.\u0000strictfp().Method_3685(class_5596.Method_5603(), (Comparable)((Object)class_5607));
    }
}

