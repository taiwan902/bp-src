/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_29139
extends Class_4291 {
    private Class_37289 Field_29140;

    private void Method_29141() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_29142(Class_37289 class_37289) {
        this.Field_29140 = class_37289;
    }

    public boolean Method_29143(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n = 16512 & -23967;
        for (int i = 3211 & 16; i < (64 & -26418); ++i) {
            Class_4751 class_47512 = class_4751.Method_4791(random.nextInt(1544 & -24420) - random.nextInt(24777 & 776), random.nextInt(26630 & -32756) - random.nextInt(12 & -29691), random.nextInt(9480 & 6216) - random.nextInt(20489 & 1368));
            if (!class_283.Method_507(class_47512) || class_283.Field_284.Method_18370() && class_47512.\u0000, `() >= (2302 & 6142) || !Class_9265.Field_9399.Method_3587(class_283, class_47512)) continue;
            Class_9265.Field_9399.Method_3567(class_283, class_47512, this.Field_29140, -16373 & 11570);
            n = 16903 & 2105;
        }
        return n != 0;
    }
}

