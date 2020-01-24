/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_4340
extends Class_4351 {
    private static final Class_3436 Field_4341;
    private boolean Field_4342;
    private static final Class_3436 Field_4343;
    private static final Class_3436 Field_4344;

    public boolean Method_4345(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n = this.\u0000strictfp(random);
        if (!this.\u0000strictfp(class_283, random, class_4751, n)) {
            return (28684 & -32110) != 0;
        }
        this.Method_4346(class_283, class_4751.\u0000= final(), class_4751.\u0000strictfp(), class_4751.\u0000, `() + n, 9220 & 530, random);
        for (int i = 3072 & -3991; i < n; ++i) {
            Class_3238 class_3238 = class_283.Method_375(class_4751.Method_4766(i)).Method_3442();
            if (class_3238.Method_3373() == Class_3713.Field_3718 || class_3238.Method_3373() == Class_3713.Field_3729) {
                this.\u0000strictfp(class_283, class_4751.Method_4766(i), this.\u0000, `);
            }
            if (i >= n - (2117 & -8173)) continue;
            class_3238 = class_283.Method_375(class_4751.Method_4791(51 & 5249, i, 16 & 5440)).Method_3442();
            if (class_3238.Method_3373() == Class_3713.Field_3718 || class_3238.Method_3373() == Class_3713.Field_3729) {
                this.\u0000strictfp(class_283, class_4751.Method_4791(-27327 & 653, i, 12 & 4802), this.\u0000, `);
            }
            if ((class_3238 = class_283.Method_375(class_4751.Method_4791(137 & 5137, i, -31333 & 10337)).Method_3442()).Method_3373() == Class_3713.Field_3718 || class_3238.Method_3373() == Class_3713.Field_3729) {
                this.\u0000strictfp(class_283, class_4751.Method_4791(1571 & 16453, i, 17153 & -28599), this.\u0000, `);
            }
            if ((class_3238 = class_283.Method_375(class_4751.Method_4791(-16359 & 258, i, -32767 & 21185)).Method_3442()).Method_3373() != Class_3713.Field_3718 && class_3238.Method_3373() != Class_3713.Field_3729) continue;
            this.\u0000strictfp(class_283, class_4751.Method_4791(16800 & 9792, i, 6161 & 9347), this.\u0000, `);
        }
        return (-28153 & 9249) != 0;
    }

    private void Method_4346(Class_283 class_283, int n, int n2, int n3, int n4, Random random) {
        int n5 = random.nextInt(26645 & -27643) + (this.Field_4342 ? this.\u0000strictfp : -22461 & 17459);
        int n6 = -32252 & 73;
        for (int i = n3 - n5; i <= n3; ++i) {
            int n7 = n3 - i;
            int n8 = n4 + Class_13337.Method_13377((float)n7 / (float)n5 * (4.1525426f * 0.8428571f));
            this.\u0000, `(class_283, new Class_4751(n, i, n2), n8 + (n7 > 0 && n8 == n6 && (i & (11649 & 20489)) == 0 ? 6405 & 9753 : 28741 & 514));
            n6 = n8;
        }
    }

    static {
        Field_4344 = Class_9265.Field_9383.Method_3293().Method_3685(Class_4544.Field_4545, (Comparable)((Object)Class_4231.Field_4236));
        Field_4341 = Class_9265.Field_9421.\u0000strictfp().Method_3685(Class_4704.Field_4705, (Comparable)((Object)Class_4231.Field_4236)).Method_3437(Class_4720.Field_4725, Boolean.valueOf((23633 & -32630) != 0));
        Field_4343 = Class_9265.Field_9272.Method_3293().Method_3685(Class_4180.Field_4181, (Comparable)((Object)Class_4194.Field_4199));
    }

    private void Method_4347(Class_283 class_283, Class_4751 class_4751) {
        for (int i = -2 & -1; i <= (8758 & 22794); ++i) {
            for (int j = -2 & -2; j <= (171 & 9554); ++j) {
                if (Math.abs(i) == (9382 & -30190) && Math.abs(j) == (28906 & 7)) continue;
                this.Method_4348(class_283, class_4751.Method_4791(i, 289 & 1024, j));
            }
        }
    }

    private void Method_4348(Class_283 class_283, Class_4751 class_4751) {
        for (int i = 455 & 8194; i >= (-1 & -3); --i) {
            Class_4751 class_47512 = class_4751.Method_4766(i);
            Class_3238 class_3238 = class_283.Method_375(class_47512).Method_3442();
            if (class_3238 == Class_9265.Field_9319 || class_3238 == Class_9265.Field_9272) {
                this.\u0000strictfp(class_283, class_47512, Field_4343);
                break;
            }
            if (class_3238.Method_3373() != Class_3713.Field_3718 && i < 0) break;
        }
    }

    public Class_4340(boolean bl, boolean bl2) {
        super(bl, -22947 & 16429, 4111 & -15713, Field_4344, Field_4341);
        this.Field_4342 = bl2;
    }

    public void Method_4349(Class_283 class_283, Random random, Class_4751 class_4751) {
        this.Method_4347(class_283, class_4751.Method_4771().Method_4778());
        this.Method_4347(class_283, class_4751.Method_4783(-12254 & 643).Method_4778());
        this.Method_4347(class_283, class_4751.Method_4771().Method_4772(14691 & -15334));
        this.Method_4347(class_283, class_4751.Method_4783(2186 & 515).Method_4772(23554 & -32638));
        for (int i = 8208 & -32060; i < (7685 & -32755); ++i) {
            int n = random.nextInt(23806 & -31936);
            int n2 = n % (-25784 & 17577);
            int n3 = n / (1610 & 4536);
            if (n2 != 0 && n2 != (519 & 24591) && n3 != 0 && n3 != (519 & 12759)) continue;
            this.Method_4347(class_283, class_4751.Method_4791((-3 & -3) + n2, 13345 & 16, (-3 & -3) + n3));
        }
    }

    private void Method_4350() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

