/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_4458
extends Class_4415 {
    private void Method_4459(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_4403 class_4403 = Class_4458.\u0000strictfp((Class_3713)this.\u0000strictfp);
        class_283.Method_462(class_4751, class_4403.\u0000strictfp().Method_3685(\u0000strictfp, class_3436.Method_3440(\u0000strictfp)), 15490 & 16511);
        class_283.Method_441(class_4751, class_4403, this.\u0000strictfp(class_283));
    }

    protected boolean Method_4460(Class_283 class_283, Class_4751 class_4751) {
        Class_4595[] arrclass_4595 = Class_4595.Method_4630();
        int n = arrclass_4595.length;
        for (int i = 16450 & 10512; i < n; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            if (!this.Method_4463(class_283, class_4751.Method_4765(class_4595))) continue;
            return (-31547 & 6169) != 0;
        }
        return (12736 & 2064) != 0;
    }

    public void Method_4461(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        block5 : {
            if (this.\u0000strictfp != Class_3713.Field_3750 || !class_283.Method_522().Method_7529("doFireTick")) break block5;
            int n = random.nextInt(16523 & 1095);
            if (n > 0) {
                Class_4751 class_47512 = class_4751;
                for (int i = 4180 & -16382; i < n; ++i) {
                    class_47512 = class_47512.Method_4791(random.nextInt(1415 & -28149) - (-19419 & 2251), 5159 & 8217, random.nextInt(291 & 29851) - (-32587 & 17929));
                    Class_3238 class_3238 = class_283.Method_375(class_47512).Method_3442();
                    if (class_3238.Field_3240 == Class_3713.Field_3718) {
                        if (!this.Method_4460(class_283, class_47512)) continue;
                        class_283.Method_435(class_47512, Class_9265.Field_9342.\u0000strictfp());
                        return;
                    }
                    if (!class_3238.Field_3240.Method_3761()) continue;
                    return;
                }
            } else {
                for (int i = 2752 & 8481; i < (1447 & 8195); ++i) {
                    Class_4751 class_47513 = class_4751.Method_4791(random.nextInt(14535 & -16125) - (6145 & -15901), 4369 & 64, random.nextInt(-32185 & 16643) - (-31339 & 2057));
                    if (!class_283.Method_507(class_47513.Method_4769()) || !this.Method_4463(class_283, class_47513)) continue;
                    class_283.Method_435(class_47513.Method_4769(), Class_9265.Field_9342.\u0000strictfp());
                }
            }
        }
    }

    private void Method_4462() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private boolean Method_4463(Class_283 class_283, Class_4751 class_4751) {
        return class_283.Method_375(class_4751).Method_3442().Method_3373().Method_3763();
    }

    public void Method_4464(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!this.\u0000strictfp(class_283, class_4751, class_3436)) {
            this.Method_4459(class_283, class_4751, class_3436);
        }
    }

    protected Class_4458(Class_3713 class_3713) {
        super(class_3713);
        this.\u0000strictfp((272 & 5665) != 0);
        if (class_3713 == Class_3713.Field_3750) {
            this.\u0000strictfp((20609 & 3073) != 0);
        }
    }
}

