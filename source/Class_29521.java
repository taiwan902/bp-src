/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_29521
extends Class_4291 {
    public boolean Method_29522(Class_283 class_283, Random random, Class_4751 class_4751) {
        for (int i = 9 & -28314; i < (2381 & -28480); ++i) {
            Class_4751 class_47512 = class_4751.Method_4791(random.nextInt(138 & 7433) - random.nextInt(-16294 & 8329), random.nextInt(140 & 20516) - random.nextInt(2084 & -16364), random.nextInt(-15336 & 264) - random.nextInt(-27896 & 8268));
            if (!Class_9265.Field_9459.Method_3368(class_283, class_47512) || class_283.Method_375(class_47512.Method_4782()).Method_3442() != Class_9265.Field_9319) continue;
            class_283.Method_462(class_47512, Class_9265.Field_9459.Method_3293(), 16390 & -31678);
        }
        return (529 & 3137) != 0;
    }

    private void Method_29523() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

