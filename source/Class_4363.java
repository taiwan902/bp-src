/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_4363
extends Class_4286 {
    private static final Class_3436 Field_4364 = Class_9265.Field_9383.Method_3293().Method_3685(Class_4544.Field_4545, (Comparable)((Object)Class_4231.Field_4236));
    private static final Class_3436 Field_4365 = Class_9265.Field_9421.\u0000strictfp().Method_3685(Class_4704.Field_4705, (Comparable)((Object)Class_4231.Field_4236)).Method_3437(Class_4720.Field_4725, Boolean.valueOf((17024 & -30702) != 0));

    public boolean Method_4366(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n = random.nextInt(6733 & -24316) + (-32698 & 17318);
        int n2 = (-31527 & 24839) + random.nextInt(12306 & 17674);
        int n3 = n - n2;
        int n4 = (35 & -27066) + random.nextInt(1798 & -24422);
        int n5 = 12833 & 16449;
        if (class_4751.\u0000, `() >= (16905 & 15377) && class_4751.\u0000, `() + n + (65 & 2077) <= (26912 & 265)) {
            reference var14_16;
            int n6;
            int n7;
            int n8;
            for (int i = class_4751.\u0000, `(); i <= class_4751.\u0000, `() + (9 & 2049) + n && n5 != 0; ++i) {
                n6 = 9259 & 4417;
                n6 = i - class_4751.\u0000, `() < n2 ? -32576 & 3344 : n4;
                Class_4810 class_4810 = new Class_4810();
                for (n8 = class_4751.\u0000= final() - n6; n8 <= class_4751.\u0000= final() + n6 && n5 != 0; ++n8) {
                    for (n7 = class_4751.\u0000strictfp() - n6; n7 <= class_4751.\u0000strictfp() + n6 && n5 != 0; ++n7) {
                        if (i >= 0 && i < (2344 & 17745)) {
                            var14_16 = (reference)class_283.Method_375(class_4810.Method_4814(n8, i, n7)).Method_3442();
                            if (var14_16.Method_3373() == Class_3713.Field_3718 || var14_16.Method_3373() == Class_3713.Field_3729) continue;
                            n5 = 256 & 17924;
                            continue;
                        }
                        n5 = 18440 & -32255;
                    }
                }
            }
            if (n5 == 0) {
                return (2306 & -32575) != 0;
            }
            Class_3238 class_3238 = class_283.Method_375(class_4751.Method_4782()).Method_3442();
            if ((class_3238 == Class_9265.Field_9319 || class_3238 == Class_9265.Field_9272 || class_3238 == Class_9265.Field_9356) && class_4751.\u0000, `() < (21318 & 288) - n - (17543 & 14913)) {
                this.\u0000strictfp(class_283, class_4751.Method_4782());
                n6 = random.nextInt(66 & 16787);
                int n9 = 1 & 16965;
                n8 = 4096 & 282;
                for (n7 = 100 & 19721; n7 <= n3; ++n7) {
                    var14_16 = class_4751.\u0000, `() + n - n7;
                    for (int i = class_4751.\u0000= final() - n6; i <= class_4751.\u0000= final() + n6; ++i) {
                        int n10 = i - class_4751.\u0000= final();
                        for (int j = class_4751.\u0000strictfp() - n6; j <= class_4751.\u0000strictfp() + n6; ++j) {
                            Class_4751 class_47512;
                            int n11 = j - class_4751.\u0000strictfp();
                            if (Math.abs(n10) == n6 && Math.abs(n11) == n6 && n6 > 0 || class_283.Method_375(class_47512 = new Class_4751(i, (int)var14_16, j)).Method_3442().Method_3381()) continue;
                            this.\u0000strictfp(class_283, class_47512, Field_4365);
                        }
                    }
                    if (n6 >= n9) {
                        n6 = n8;
                        n8 = 22919 & 65;
                        if (++n9 <= n4) continue;
                        n9 = n4;
                        continue;
                    }
                    ++n6;
                }
                n7 = random.nextInt(5715 & 2307);
                for (var14_16 = 17651 & -32768; var14_16 < n - n7; ++var14_16) {
                    Class_3238 class_32382 = class_283.Method_375(class_4751.Method_4766((int)var14_16)).Method_3442();
                    if (class_32382.Method_3373() != Class_3713.Field_3718 && class_32382.Method_3373() != Class_3713.Field_3729) continue;
                    this.\u0000strictfp(class_283, class_4751.Method_4766((int)var14_16), Field_4364);
                }
                return (4353 & 8269) != 0;
            }
            return (8790 & -16224) != 0;
        }
        return (-26336 & 9284) != 0;
    }

    public Class_4363(boolean bl) {
        super(bl);
    }

    private void Method_4367() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

