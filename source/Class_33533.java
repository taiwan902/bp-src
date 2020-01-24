/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_33533
extends Class_4291 {
    private Class_3238 Field_33534 = Class_9265.Field_9385;
    private int Field_33535;

    public Class_33533(int n) {
        this.Field_33535 = n;
    }

    public boolean Method_33536(Class_283 class_283, Random random, Class_4751 class_4751) {
        if (class_283.Method_375(class_4751).Method_3442().Method_3373() != Class_3713.Field_3734) {
            return (12385 & 20) != 0;
        }
        int n = random.nextInt(this.Field_33535 - (-30174 & 28942)) + (16546 & -28662);
        int n2 = 595 & 6149;
        for (int i = class_4751.\u0000= final() - n; i <= class_4751.\u0000= final() + n; ++i) {
            for (int j = class_4751.\u0000strictfp() - n; j <= class_4751.\u0000strictfp() + n; ++j) {
                int n3;
                int n4 = i - class_4751.\u0000= final();
                if (n4 * n4 + (n3 = j - class_4751.\u0000strictfp()) * n3 > n * n) continue;
                for (int k = class_4751.\u0000, `() - n2; k <= class_4751.\u0000, `() + n2; ++k) {
                    Class_4751 class_47512 = new Class_4751(i, k, j);
                    Class_3238 class_3238 = class_283.Method_375(class_47512).Method_3442();
                    if (class_3238 != Class_9265.Field_9272 && class_3238 != Class_9265.Field_9385) continue;
                    class_283.Method_462(class_47512, this.Field_33534.Method_3293(), -24466 & 2579);
                }
            }
        }
        return (16657 & 12973) != 0;
    }

    private void Method_33537() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

