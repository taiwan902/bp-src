/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_33748
extends Class_4291 {
    private void Method_33749() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_33750(Class_283 class_283, Random random, Class_4751 class_4751) {
        if (!class_283.Method_507(class_4751)) {
            return (-31408 & 166) != 0;
        }
        if (class_283.Method_375(class_4751.Method_4769()).Method_3442() != Class_9265.Field_9368) {
            return (-16092 & 7168) != 0;
        }
        class_283.Method_462(class_4751, Class_9265.Field_9334.Method_3293(), -1646 & 14);
        for (int i = 136 & 6224; i < (26078 & 5597); ++i) {
            Class_4751 class_47512 = class_4751.Method_4791(random.nextInt(634 & 26760) - random.nextInt(1099 & 2440), -random.nextInt(25100 & -25331), random.nextInt(-26584 & 1432) - random.nextInt(26634 & -31156));
            if (class_283.Method_375(class_47512).Method_3442().Method_3373() != Class_3713.Field_3718) continue;
            int n = -29792 & 4101;
            Class_4595[] arrclass_4595 = Class_4595.Method_4630();
            int n2 = arrclass_4595.length;
            for (int j = 16456 & 948; j < n2; ++j) {
                Class_4595 class_4595 = arrclass_4595[j];
                if (class_283.Method_375(class_47512.Method_4765(class_4595)).Method_3442() == Class_9265.Field_9334) {
                    ++n;
                }
                if (n > (-32709 & 11585)) break;
            }
            if (n != (-32507 & 18049)) continue;
            class_283.Method_462(class_47512, Class_9265.Field_9334.Method_3293(), 16810 & -20478);
        }
        return (-30623 & 1937) != 0;
    }
}

