/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_4374
extends Class_4351 {
    private void Method_4375(Class_283 class_283, Class_4751 class_4751, int n) {
        int n2 = -30613 & 2;
        for (int i = -n2; i <= 0; ++i) {
            this.\u0000, `(class_283, class_4751.Method_4766(i), n + (3093 & 547) - i);
        }
    }

    public Class_4374(boolean bl, int n, int n2, Class_3436 class_3436, Class_3436 class_34362) {
        super(bl, n, n2, class_3436, class_34362);
    }

    private void Method_4376() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_4377(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n;
        int n2 = this.\u0000strictfp(random);
        if (!this.\u0000strictfp(class_283, random, class_4751, n2)) {
            return (1034 & 16900) != 0;
        }
        this.Method_4375(class_283, class_4751.Method_4766(n2), 16922 & 1382);
        for (n = class_4751.\u0000, `() + n2 - (8807 & -30462) - random.nextInt((int)(-16316 & 5132)); n > class_4751.\u0000, `() + n2 / (16418 & 15362); n -= (2142 & -32733) + random.nextInt((int)(8524 & -29643))) {
            int n3;
            float f = random.nextFloat() * (0.11904762f * 26.38938f) * 2.0f;
            int n4 = class_4751.\u0000= final() + (int)(14.999999f * 0.033333335f + Class_13337.Method_13350(f) * (0.7816092f * 5.117647f));
            int n5 = class_4751.\u0000strictfp() + (int)(3.3999999f * 0.14705883f + Class_13337.Method_13370(f) * (0.94845355f * 4.2173915f));
            for (n3 = 9486 & 4656; n3 < (5269 & -32731); ++n3) {
                n4 = class_4751.\u0000= final() + (int)(0.38554215f * 3.8906252f + Class_13337.Method_13350(f) * (float)n3);
                n5 = class_4751.\u0000strictfp() + (int)(2.5285714f * 0.59322035f + Class_13337.Method_13370(f) * (float)n3);
                this.\u0000strictfp(class_283, new Class_4751(n4, n - (26371 & -26621) + n3 / (5010 & 34), n5), this.\u0000, `);
            }
            n3 = (-12019 & 33) + random.nextInt(16519 & 9218);
            int n6 = n;
            for (int i = n - n3; i <= n6; ++i) {
                int n7 = i - n6;
                this.\u0000strictfp(class_283, new Class_4751(n4, i, n5), (18449 & 8233) - n7);
            }
        }
        for (n = 896 & 1094; n < n2; ++n) {
            Class_4751 class_47512;
            Class_4751 class_47513;
            Class_4751 class_47514 = class_4751.Method_4766(n);
            if (this.\u0000strictfp(class_283.Method_375(class_47514).Method_3442())) {
                this.\u0000strictfp(class_283, class_47514, this.\u0000, `);
                if (n > 0) {
                    this.Method_4378(class_283, random, class_47514.Method_4771(), Class_11563.Field_11564);
                    this.Method_4378(class_283, random, class_47514.Method_4778(), Class_11563.Field_11568);
                }
            }
            if (n >= n2 - (3345 & -32187)) continue;
            Class_4751 class_47515 = class_47514.Method_4770();
            if (this.\u0000strictfp(class_283.Method_375(class_47515).Method_3442())) {
                this.\u0000strictfp(class_283, class_47515, this.\u0000, `);
                if (n > 0) {
                    this.Method_4378(class_283, random, class_47515.Method_4770(), Class_11563.Field_11566);
                    this.Method_4378(class_283, random, class_47515.Method_4778(), Class_11563.Field_11568);
                }
            }
            if (this.\u0000strictfp(class_283.Method_375(class_47513 = class_47514.Method_4784().Method_4770()).Method_3442())) {
                this.\u0000strictfp(class_283, class_47513, this.\u0000, `);
                if (n > 0) {
                    this.Method_4378(class_283, random, class_47513.Method_4770(), Class_11563.Field_11566);
                    this.Method_4378(class_283, random, class_47513.Method_4784(), Class_11563.Field_11569);
                }
            }
            if (!this.\u0000strictfp(class_283.Method_375(class_47512 = class_47514.Method_4784()).Method_3442())) continue;
            this.\u0000strictfp(class_283, class_47512, this.\u0000, `);
            if (n <= 0) continue;
            this.Method_4378(class_283, random, class_47512.Method_4771(), Class_11563.Field_11564);
            this.Method_4378(class_283, random, class_47512.Method_4784(), Class_11563.Field_11569);
        }
        return (1175 & 30753) != 0;
    }

    private void Method_4378(Class_283 class_283, Random random, Class_4751 class_4751, Class_4173 class_4173) {
        if (random.nextInt(21523 & -32477) > 0 && class_283.Method_507(class_4751)) {
            this.\u0000strictfp(class_283, class_4751, Class_9265.Field_9323.Method_3293().Method_3685(class_4173, Boolean.valueOf((9221 & 4307) != 0)));
        }
    }
}

