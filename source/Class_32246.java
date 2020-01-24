/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_32246
extends Class_4291 {
    public boolean Method_32247(Class_283 class_283, Random random, Class_4751 class_4751) {
        while (class_4751.\u0000, `() < (1185 & 16518)) {
            if (class_283.Method_507(class_4751)) {
                Class_4595[] arrclass_4595 = Class_4662.Field_4663.Method_4675();
                int n = arrclass_4595.length;
                for (int i = 1280 & -27947; i < n; ++i) {
                    Class_4595 class_4595 = arrclass_4595[i];
                    if (!Class_9265.Field_9323.Method_3338(class_283, class_4751, class_4595)) continue;
                    Class_3436 class_3436 = Class_9265.Field_9323.Method_3293().Method_3685(Class_11563.Field_11569, Boolean.valueOf((class_4595 == Class_4595.Field_4598 ? 17543 & 8705 : 1536 & 20756) != 0)).Method_3437(Class_11563.Field_11564, Boolean.valueOf((class_4595 == Class_4595.Field_4603 ? -32253 & 1065 : 16640 & -22396) != 0)).Method_3437(Class_11563.Field_11568, Boolean.valueOf((class_4595 == Class_4595.Field_4613 ? 28785 & 389 : 25360 & 4) != 0)).Method_3437(Class_11563.Field_11566, Boolean.valueOf((class_4595 == Class_4595.Field_4602 ? 1089 & 6165 : 7432 & -24459) != 0));
                    class_283.Method_462(class_4751, class_3436, 8455 & 16434);
                    break;
                }
            } else {
                class_4751 = class_4751.Method_4791(random.nextInt(12647 & -15852) - random.nextInt(-24562 & 18516), 21760 & 8240, random.nextInt(17477 & 8212) - random.nextInt(19718 & 36));
            }
            class_4751 = class_4751.Method_4769();
        }
        return (-23551 & 20609) != 0;
    }

    private void Method_32248() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

