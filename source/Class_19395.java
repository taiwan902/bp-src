/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_19395
extends Class_4286 {
    private static final Class_3436 Field_19396;
    private static final Class_3436 Field_19397;

    public boolean Method_19398(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n = random.nextInt(-31547 & 12807) + (10303 & 4167);
        int n2 = n - random.nextInt(630 & -23542) - (-30709 & 627);
        int n3 = n - n2;
        int n4 = (-32759 & 27937) + random.nextInt(n3 + (-31711 & 4243));
        int n5 = 1281 & 8777;
        if (class_4751.\u0000, `() >= (-32511 & 27217) && class_4751.\u0000, `() + n + (-15871 & 303) <= (4928 & -7930)) {
            int n6;
            int n7;
            int n8;
            for (int i = class_4751.\u0000, `(); i <= class_4751.\u0000, `() + (8197 & 6137) + n && n5 != 0; ++i) {
                n6 = -32415 & 17;
                n6 = i - class_4751.\u0000, `() < n2 ? 33 & 26180 : n4;
                Class_4810 class_4810 = new Class_4810();
                for (n8 = class_4751.\u0000= final() - n6; n8 <= class_4751.\u0000= final() + n6 && n5 != 0; ++n8) {
                    for (n7 = class_4751.\u0000strictfp() - n6; n7 <= class_4751.\u0000strictfp() + n6 && n5 != 0; ++n7) {
                        if (i >= 0 && i < (2308 & -32512)) {
                            if (this.\u0000strictfp(class_283.Method_375(class_4810.Method_4814(n8, i, n7)).Method_3442())) continue;
                            n5 = 6082 & 41;
                            continue;
                        }
                        n5 = 17728 & -32222;
                    }
                }
            }
            if (n5 == 0) {
                return (323 & 5760) != 0;
            }
            Class_3238 class_3238 = class_283.Method_375(class_4751.Method_4782()).Method_3442();
            if ((class_3238 == Class_9265.Field_9319 || class_3238 == Class_9265.Field_9272) && class_4751.\u0000, `() < (1280 & 8672) - n - (-16383 & 3633)) {
                int n9;
                this.\u0000strictfp(class_283, class_4751.Method_4782());
                n6 = 4612 & -29486;
                for (n9 = class_4751.\u0000, `() + n; n9 >= class_4751.\u0000, `() + n2; --n9) {
                    for (n8 = class_4751.\u0000= final() - n6; n8 <= class_4751.\u0000= final() + n6; ++n8) {
                        n7 = n8 - class_4751.\u0000= final();
                        for (int i = class_4751.\u0000strictfp() - n6; i <= class_4751.\u0000strictfp() + n6; ++i) {
                            Class_4751 class_47512;
                            int n10 = i - class_4751.\u0000strictfp();
                            if (Math.abs(n7) == n6 && Math.abs(n10) == n6 && n6 > 0 || class_283.Method_375(class_47512 = new Class_4751(n8, n9, i)).Method_3442().Method_3381()) continue;
                            this.\u0000strictfp(class_283, class_47512, Field_19396);
                        }
                    }
                    if (n6 >= (3213 & -32765) && n9 == class_4751.\u0000, `() + n2 + (22669 & 337)) {
                        --n6;
                        continue;
                    }
                    if (n6 >= n4) continue;
                    ++n6;
                }
                for (n9 = 9185 & -32752; n9 < n - (12581 & -16383); ++n9) {
                    Class_3238 class_32382 = class_283.Method_375(class_4751.Method_4766(n9)).Method_3442();
                    if (class_32382.Method_3373() != Class_3713.Field_3718 && class_32382.Method_3373() != Class_3713.Field_3729) continue;
                    this.\u0000strictfp(class_283, class_4751.Method_4766(n9), Field_19397);
                }
                return (3971 & 20497) != 0;
            }
            return (3172 & -27896) != 0;
        }
        return (32 & 12873) != 0;
    }

    private void Method_19399() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_19397 = Class_9265.Field_9383.Method_3293().Method_3685(Class_4544.Field_4545, (Comparable)((Object)Class_4231.Field_4236));
        Field_19396 = Class_9265.Field_9421.\u0000strictfp().Method_3685(Class_4704.Field_4705, (Comparable)((Object)Class_4231.Field_4236)).Method_3437(Class_4720.Field_4725, Boolean.valueOf((-16352 & 12356) != 0));
    }

    public Class_19395() {
        super((-27000 & 18466) != 0);
    }
}

