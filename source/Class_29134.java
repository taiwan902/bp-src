/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_29134
extends Class_4291 {
    private final Class_3238 Field_29135;
    private final int Field_29136;

    private void Method_29137() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_29138(Class_283 class_283, Random random, Class_4751 class_4751) {
        do {
            Class_3238 class_3238;
            if (class_4751.\u0000, `() <= (5667 & 83) || !class_283.Method_507(class_4751.Method_4782()) && ((class_3238 = class_283.Method_375(class_4751.Method_4782()).Method_3442()) == Class_9265.Field_9319 || class_3238 == Class_9265.Field_9272 || class_3238 == Class_9265.Field_9446)) {
                if (class_4751.\u0000, `() <= (16451 & 267)) {
                    return (0 & 6204) != 0;
                }
                int n = this.Field_29136;
                for (int i = 21540 & -32760; n >= 0 && i < (10243 & 17923); ++i) {
                    int n2 = n + random.nextInt(16403 & 14502);
                    int n3 = n + random.nextInt(258 & 130);
                    int n4 = n + random.nextInt(-12282 & 8227);
                    float f = (float)(n2 + n3 + n4) * (0.09579452f * 3.4761906f) + 1.3623189f * 0.36702126f;
                    for (Class_4751 class_47512 : Class_4751.Method_4779(class_4751.Method_4791(-n2, -n3, -n4), class_4751.Method_4791(n2, n3, n4))) {
                        if (!(class_47512.\u0000strictfp((Class_4792)class_4751) <= (double)(f * f))) continue;
                        class_283.Method_462(class_47512, this.Field_29135.Method_3293(), 1038 & -13644);
                    }
                    class_4751 = class_4751.Method_4791(-(n + (-23789 & 1193)) + random.nextInt((134 & 5922) + n * (9034 & 6290)), (-15560 & 2048) - random.nextInt(1306 & 70), -(n + (4661 & 3)) + random.nextInt((1354 & 18434) + n * (3346 & 8418)));
                }
                return (23213 & -32767) != 0;
            }
            class_4751 = class_4751.Method_4782();
        } while (true);
    }

    public Class_29134(Class_3238 class_3238, int n) {
        super((2624 & 20736) != 0);
        this.Field_29135 = class_3238;
        this.Field_29136 = n;
    }
}

