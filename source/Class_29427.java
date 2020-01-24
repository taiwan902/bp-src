/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_29427
extends Class_4291 {
    public boolean Method_29428(Class_283 class_283, Random random, Class_4751 class_4751) {
        for (int i = 276 & 21504; i < (570 & 2123); ++i) {
            Class_4751 class_47512 = class_4751.Method_4791(random.nextInt(8408 & 4140) - random.nextInt(20521 & -31092), random.nextInt(-32572 & 4373) - random.nextInt(333 & -12668), random.nextInt(4296 & -24033) - random.nextInt(3081 & 568));
            if (!class_283.Method_507(class_47512)) continue;
            int n = (17 & -16377) + random.nextInt(random.nextInt(-10041 & 8227) + (2073 & -24509));
            for (int j = 3176 & 512; j < n; ++j) {
                if (!Class_9265.Field_9405.Method_21813(class_283, class_47512)) continue;
                class_283.Method_462(class_47512.Method_4766(j), Class_9265.Field_9405.\u0000strictfp(), -28285 & 514);
            }
        }
        return (201 & 28967) != 0;
    }

    private void Method_29429() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

