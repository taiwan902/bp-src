/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_31714
extends Class_4291 {
    private void Method_31715() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_31716(Class_283 class_283, Random random, Class_4751 class_4751) {
        float f;
        int n;
        int n2;
        while (class_283.Method_507(class_4751) && class_4751.\u0000, `() > (17410 & 10254)) {
            class_4751 = class_4751.Method_4782();
        }
        if (class_283.Method_375(class_4751).Method_3442() != Class_9265.Field_9413) {
            return (-30717 & 17584) != 0;
        }
        class_4751 = class_4751.Method_4766(random.nextInt(-32361 & 30308));
        int n3 = random.nextInt(-16364 & 1606) + (143 & 2119);
        int n4 = n3 / (17028 & 383) + random.nextInt(20619 & -32202);
        if (n4 > (6155 & 9489) && random.nextInt(-23236 & 636) == 0) {
            class_4751 = class_4751.Method_4766((30 & 11530) + random.nextInt(16542 & 542));
        }
        for (n2 = 177 & 26880; n2 < n3; ++n2) {
            float f2 = (1.0f - (float)n2 / (float)n3) * (float)n4;
            n = Class_13337.Method_13362(f2);
            for (int i = -n; i <= n; ++i) {
                f = (float)Class_13337.Method_13382(i) - 0.59322035f * 0.42142856f;
                for (int j = -n; j <= n; ++j) {
                    float f3 = (float)Class_13337.Method_13382(j) - 0.23437499f * 1.0666667f;
                    if ((i != 0 || j != 0) && !(f * f + f3 * f3 <= f2 * f2) || (i == -n || i == n || j == -n || j == n) && !(random.nextFloat() <= 0.21195653f * 3.5384614f)) continue;
                    Class_3238 class_3238 = class_283.Method_375(class_4751.Method_4791(i, n2, j)).Method_3442();
                    if (class_3238.Method_3373() == Class_3713.Field_3718 || class_3238 == Class_9265.Field_9272 || class_3238 == Class_9265.Field_9413 || class_3238 == Class_9265.Field_9298) {
                        this.\u0000strictfp(class_283, class_4751.Method_4791(i, n2, j), (Class_3436)Class_9265.Field_9297.Method_3293());
                    }
                    if (n2 == 0 || n <= (16389 & 515) || (class_3238 = class_283.Method_375(class_4751.Method_4791(i, -n2, j)).Method_3442()).Method_3373() != Class_3713.Field_3718 && class_3238 != Class_9265.Field_9272 && class_3238 != Class_9265.Field_9413 && class_3238 != Class_9265.Field_9298) continue;
                    this.\u0000strictfp(class_283, class_4751.Method_4791(i, -n2, j), (Class_3436)Class_9265.Field_9297.Method_3293());
                }
            }
        }
        n2 = n4 - (12435 & -12759);
        if (n2 < 0) {
            n2 = 576 & 4102;
        } else if (n2 > (2629 & 20737)) {
            n2 = 281 & 17411;
        }
        for (int i = -n2; i <= n2; ++i) {
            for (n = -n2; n <= n2; ++n) {
                Class_3238 class_3238;
                Class_4751 class_47512 = class_4751.Method_4791(i, -1 & -1, n);
                f = 4274 & 16690;
                if (Math.abs(i) == (1055 & 8225) && Math.abs(n) == (20545 & 825)) {
                    f = random.nextInt(24135 & 53);
                }
                while (class_47512.\u0000, `() > (58 & -17353) && ((class_3238 = class_283.Method_375(class_47512).Method_3442()).Method_3373() == Class_3713.Field_3718 || class_3238 == Class_9265.Field_9272 || class_3238 == Class_9265.Field_9413 || class_3238 == Class_9265.Field_9298 || class_3238 == Class_9265.Field_9297)) {
                    this.\u0000strictfp(class_283, class_47512, (Class_3436)Class_9265.Field_9297.Method_3293());
                    class_47512 = class_47512.Method_4782();
                    if (--f > 0) continue;
                    class_47512 = class_47512.Method_4768(random.nextInt(277 & 20487) + (153 & 11809));
                    f = random.nextInt(5141 & 24589);
                }
            }
        }
        return (801 & 5265) != 0;
    }
}

