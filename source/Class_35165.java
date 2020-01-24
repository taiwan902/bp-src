/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_35165
extends Class_4291 {
    private void Method_35166() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_35167(Class_283 class_283, Random random, Class_4751 class_4751) {
        if (!class_283.Method_507(class_4751)) {
            return (16384 & 1282) != 0;
        }
        if (class_283.Method_375(class_4751.Method_4769()).Method_3442() != Class_9265.Field_9368) {
            return (8212 & 18722) != 0;
        }
        class_283.Method_462(class_4751, Class_9265.Field_9334.Method_3293(), 2066 & -7121);
        for (int i = 1026 & -30536; i < (1500 & -16417); ++i) {
            Class_4751 class_47512 = class_4751.Method_4791(random.nextInt(72 & -4056) - random.nextInt(171 & 4632), -random.nextInt(781 & -26532), random.nextInt(-30712 & 585) - random.nextInt(8843 & 5128));
            if (class_283.Method_375(class_47512).Method_3442().Method_3373() != Class_3713.Field_3718) continue;
            int n = 32 & -32622;
            Class_4595[] arrclass_4595 = Class_4595.Method_4630();
            int n2 = arrclass_4595.length;
            for (int j = 0 & 2146; j < n2; ++j) {
                Class_4595 class_4595 = arrclass_4595[j];
                if (class_283.Method_375(class_47512.Method_4765(class_4595)).Method_3442() == Class_9265.Field_9334) {
                    ++n;
                }
                if (n > (17537 & -32747)) break;
            }
            if (n != (-14975 & 2081)) continue;
            class_283.Method_462(class_47512, Class_9265.Field_9334.Method_3293(), 294 & -28541);
        }
        return (-7919 & 5761) != 0;
    }
}

