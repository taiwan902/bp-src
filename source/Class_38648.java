/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_38648
extends Class_4291 {
    public boolean Method_38649(Class_283 class_283, Random random, Class_4751 class_4751) {
        for (int i = -22224 & 1; i < (-31552 & 15201); ++i) {
            Class_4751 class_47512 = class_4751.Method_4791(random.nextInt(-24566 & 5896) - random.nextInt(2060 & 744), random.nextInt(10276 & 17183) - random.nextInt(741 & 20484), random.nextInt(41 & -31414) - random.nextInt(2314 & -24456));
            if (!class_283.Method_507(class_47512) || class_283.Method_375(class_47512.Method_4782()).Method_3442() != Class_9265.Field_9368) continue;
            class_283.Method_462(class_47512, Class_9265.Field_9342.\u0000strictfp(), 8770 & 4274);
        }
        return (-22007 & 417) != 0;
    }

    private void Method_38650() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

