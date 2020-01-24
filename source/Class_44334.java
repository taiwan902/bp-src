/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_44334
extends Class_4291 {
    public boolean Method_44335(Class_283 class_283, Random random, Class_4751 class_4751) {
        for (int i = 15232 & 1053; i < (20660 & 1310); ++i) {
            Class_4751 class_47512;
            Class_4751 class_47513 = class_4751.Method_4791(random.nextInt(-24404 & 343) - random.nextInt(44 & 12820), 25476 & 5144, random.nextInt(18444 & 8197) - random.nextInt(2308 & 20709));
            if (!class_283.Method_507(class_47513) || class_283.Method_375((class_47512 = class_47513.Method_4782()).Method_4771()).Method_3442().Method_3373() != Class_3713.Field_3734 && class_283.Method_375(class_47512.Method_4770()).Method_3442().Method_3373() != Class_3713.Field_3734 && class_283.Method_375(class_47512.Method_4778()).Method_3442().Method_3373() != Class_3713.Field_3734 && class_283.Method_375(class_47512.Method_4784()).Method_3442().Method_3373() != Class_3713.Field_3734) continue;
            int n = (16402 & 5251) + random.nextInt(random.nextInt(19003 & -28221) + (16385 & -19327));
            for (int j = 1569 & 16590; j < n; ++j) {
                if (!Class_9265.Field_9346.Method_17452(class_283, class_47513)) continue;
                class_283.Method_462(class_47513.Method_4766(j), Class_9265.Field_9346.\u0000strictfp(), 22530 & 46);
            }
        }
        return (24833 & 1033) != 0;
    }

    private void Method_44336() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

