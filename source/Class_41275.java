/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_41275
extends Class_4291 {
    private final Class_3436 Field_41276;

    public Class_41275(Class_5341 class_5341) {
        this.Field_41276 = Class_9265.Field_9278.\u0000strictfp().Method_3685(Class_5320.Field_5321, (Comparable)((Object)class_5341));
    }

    public boolean Method_41277(Class_283 class_283, Random random, Class_4751 class_4751) {
        Class_3238 class_3238;
        while (((class_3238 = class_283.Method_375(class_4751).Method_3442()).Method_3373() == Class_3713.Field_3718 || class_3238.Method_3373() == Class_3713.Field_3729) && class_4751.\u0000, `() > 0) {
            class_4751 = class_4751.Method_4782();
        }
        for (int i = 3488 & -20456; i < (-11638 & 10736); ++i) {
            Class_4751 class_47512 = class_4751.Method_4791(random.nextInt(24 & 6696) - random.nextInt(-19944 & 1353), random.nextInt(15237 & 6) - random.nextInt(4268 & -15036), random.nextInt(-15639 & 8202) - random.nextInt(-26344 & 8842));
            if (!class_283.Method_507(class_47512) || !Class_9265.Field_9278.Method_5329(class_283, class_47512, this.Field_41276)) continue;
            class_283.Method_462(class_47512, this.Field_41276, 1026 & 198);
        }
        return (-24511 & 561) != 0;
    }

    private void Method_41278() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

