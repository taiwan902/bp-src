/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_4368
extends Class_4286 {
    private static final Class_3436 Field_4369;
    private boolean Field_4370;
    private static final Class_3436 Field_4371;

    private void Method_4372() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4368(boolean bl, boolean bl2) {
        super(bl);
        this.Field_4370 = bl2;
    }

    public boolean Method_4373(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n = random.nextInt(271 & 28179) + (11845 & -28283);
        if (this.Field_4370) {
            n += random.nextInt(5735 & -16225);
        }
        int n2 = 23 & 5089;
        if (class_4751.\u0000, `() >= (13585 & -32755) && class_4751.\u0000, `() + n + (-30717 & 1769) <= (17800 & 771)) {
            Object object;
            int n3;
            int n4;
            int n5;
            for (int i = class_4751.\u0000, `(); i <= class_4751.\u0000, `() + (-27871 & 8193) + n; ++i) {
                n3 = 5125 & -30247;
                if (i == class_4751.\u0000, `()) {
                    n3 = -29584 & 4;
                }
                if (i >= class_4751.\u0000, `() + (16577 & 295) + n - (16550 & 266)) {
                    n3 = -30686 & 258;
                }
                object = new Class_4810();
                for (n5 = class_4751.\u0000= final() - n3; n5 <= class_4751.\u0000= final() + n3 && n2 != 0; ++n5) {
                    for (n4 = class_4751.\u0000strictfp() - n3; n4 <= class_4751.\u0000strictfp() + n3 && n2 != 0; ++n4) {
                        if (i >= 0 && i < (20963 & 2820)) {
                            if (this.\u0000strictfp(class_283.Method_375(((Class_4810)object).Method_4814(n5, i, n4)).Method_3442())) continue;
                            n2 = 15065 & 256;
                            continue;
                        }
                        n2 = 25704 & -28412;
                    }
                }
            }
            if (n2 == 0) {
                return (-26476 & 1578) != 0;
            }
            Class_3238 class_3238 = class_283.Method_375(class_4751.Method_4782()).Method_3442();
            if ((class_3238 == Class_9265.Field_9319 || class_3238 == Class_9265.Field_9272 || class_3238 == Class_9265.Field_9356) && class_4751.\u0000, `() < (10502 & -32000) - n - (-31167 & 18585)) {
                this.\u0000strictfp(class_283, class_4751.Method_4782());
                for (n3 = class_4751.\u0000, `() - (75 & -23917) + n; n3 <= class_4751.\u0000, `() + n; ++n3) {
                    int n6 = n3 - (class_4751.\u0000, `() + n);
                    n5 = (-11259 & 2099) - n6 / (8802 & 17678);
                    for (n4 = class_4751.\u0000= final() - n5; n4 <= class_4751.\u0000= final() + n5; ++n4) {
                        int n7 = n4 - class_4751.\u0000= final();
                        for (int i = class_4751.\u0000strictfp() - n5; i <= class_4751.\u0000strictfp() + n5; ++i) {
                            Class_4751 class_47512;
                            Class_3238 class_32382;
                            int n8 = i - class_4751.\u0000strictfp();
                            if (Math.abs(n7) == n5 && Math.abs(n8) == n5 && (random.nextInt(8283 & 5250) == 0 || n6 == 0) || (class_32382 = class_283.Method_375(class_47512 = new Class_4751(n4, n3, i)).Method_3442()).Method_3373() != Class_3713.Field_3718 && class_32382.Method_3373() != Class_3713.Field_3729) continue;
                            this.\u0000strictfp(class_283, class_47512, Field_4369);
                        }
                    }
                }
                for (n3 = 4099 & -15328; n3 < n; ++n3) {
                    object = class_283.Method_375(class_4751.Method_4766(n3)).Method_3442();
                    if (((Class_3238)object).Method_3373() != Class_3713.Field_3718 && ((Class_3238)object).Method_3373() != Class_3713.Field_3729) continue;
                    this.\u0000strictfp(class_283, class_4751.Method_4766(n3), Field_4371);
                }
                return (2229 & -23805) != 0;
            }
            return (-32768 & 8196) != 0;
        }
        return (1124 & 138) != 0;
    }

    static {
        Field_4371 = Class_9265.Field_9383.Method_3293().Method_3685(Class_4544.Field_4545, (Comparable)((Object)Class_4231.Field_4242));
        Field_4369 = Class_9265.Field_9421.\u0000strictfp().Method_3685(Class_4704.Field_4705, (Comparable)((Object)Class_4231.Field_4242)).Method_3437(Class_4704.\u0000strictfp, Boolean.valueOf((108 & 30994) != 0));
    }
}

