/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_36944
extends Class_4291 {
    private Class_3238 Field_36945;

    public Class_36944(Class_3238 class_3238) {
        this.Field_36945 = class_3238;
    }

    private void Method_36946() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_36947(Class_283 class_283, Random random, Class_4751 class_4751) {
        if (class_283.Method_507(class_4751) && class_283.Method_375(class_4751.Method_4782()).Method_3442() == this.Field_36945) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5 = random.nextInt(8288 & 16691) + (20694 & 10510);
            int n6 = random.nextInt(5653 & 78) + (28673 & 1035);
            Class_4810 class_4810 = new Class_4810();
            for (n4 = class_4751.\u0000= final() - n6; n4 <= class_4751.\u0000= final() + n6; ++n4) {
                for (n = class_4751.\u0000strictfp() - n6; n <= class_4751.\u0000strictfp() + n6; ++n) {
                    n2 = n4 - class_4751.\u0000= final();
                    if (n2 * n2 + (n3 = n - class_4751.\u0000strictfp()) * n3 > n6 * n6 + (-25623 & 16389) || class_283.Method_375(class_4810.Method_4814(n4, class_4751.\u0000, `() - (161 & 7425), n)).Method_3442() == this.Field_36945) continue;
                    return (-32760 & 10373) != 0;
                }
            }
            for (n4 = class_4751.\u0000, `(); n4 < class_4751.\u0000, `() + n5 && n4 < (4581 & -23296); ++n4) {
                for (n = class_4751.\u0000= final() - n6; n <= class_4751.\u0000= final() + n6; ++n) {
                    for (n2 = class_4751.\u0000strictfp() - n6; n2 <= class_4751.\u0000strictfp() + n6; ++n2) {
                        int n7;
                        n3 = n - class_4751.\u0000= final();
                        if (n3 * n3 + (n7 = n2 - class_4751.\u0000strictfp()) * n7 > n6 * n6 + (-28287 & 26115)) continue;
                        class_283.Method_462(new Class_4751(n, n4, n2), Class_9265.Field_9445.Method_3293(), -32765 & 1642);
                    }
                }
            }
            Class_14845 class_14845 = new Class_14845(class_283);
            class_14845.Method_1239((float)class_4751.\u0000= final() + 0.8918919f * 0.56060606f, class_4751.\u0000, `() + n5, (float)class_4751.\u0000strictfp() + 1.2857143f * 0.3888889f, random.nextFloat() * (701.99994f * 0.51282054f), 0.0f);
            class_283.Method_350(class_14845);
            class_283.Method_462(class_4751.Method_4766(n5), Class_9265.Field_9414.Method_3293(), -16382 & 566);
            return (9281 & 16517) != 0;
        }
        return (4865 & 27650) != 0;
    }
}

