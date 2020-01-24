/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_36990
extends Class_4291 {
    private void Method_36991() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_36992(Class_283 class_283, Random random, Class_4751 class_4751) {
        for (int i = 9602 & 6152; i < (-15528 & 5184); ++i) {
            Class_4751 class_47512 = class_4751.Method_4791(random.nextInt(1550 & 8265) - random.nextInt(8333 & 2056), random.nextInt(1228 & 25094) - random.nextInt(24844 & 6340), random.nextInt(136 & 26153) - random.nextInt(24734 & 4616));
            if (!class_283.Method_507(class_47512) || class_283.Method_375(class_47512.Method_4782()).Method_3442() != Class_9265.Field_9319 || !Class_9265.Field_9337.Method_3368(class_283, class_47512)) continue;
            class_283.Method_462(class_47512, Class_9265.Field_9337.Method_3293().Method_3685(Class_33798.\u0000strictfp, (Comparable)((Object)Class_4662.Field_4663.Method_4668(random))), 20502 & -30454);
        }
        return (4737 & -31739) != 0;
    }
}

