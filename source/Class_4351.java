/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public abstract class Class_4351
extends Class_4286 {
    protected final Class_3436 Field_4352;
    protected int Field_4353;
    protected final Class_3436 Field_4354;
    protected final int Field_4355;

    protected int Method_4356(Random random) {
        int n = random.nextInt(-29421 & 16899) + this.Field_4355;
        if (this.Field_4353 > (35 & -22519)) {
            n += random.nextInt(this.Field_4353);
        }
        return n;
    }

    protected boolean Method_4357(Class_283 class_283, Random random, Class_4751 class_4751, int n) {
        return (this.Method_4359(class_283, class_4751, n) && this.Method_4360(class_4751, class_283) ? 83 & -19287 : 20485 & 8232) != 0;
    }

    protected void Method_4358(Class_283 class_283, Class_4751 class_4751, int n) {
        int n2 = n * n;
        for (int i = -n; i <= n + (16897 & 6593); ++i) {
            for (int j = -n; j <= n + (2113 & -32745); ++j) {
                Class_3713 class_3713;
                Class_4751 class_47512;
                int n3 = i - (20547 & -29823);
                int n4 = j - (-13247 & 31);
                if (i * i + j * j > n2 && n3 * n3 + n4 * n4 > n2 && i * i + n4 * n4 > n2 && n3 * n3 + j * j > n2 || (class_3713 = class_283.Method_375(class_47512 = class_4751.Method_4791(i, -15008 & 12310, j)).Method_3442().Method_3373()) != Class_3713.Field_3718 && class_3713 != Class_3713.Field_3729) continue;
                this.\u0000strictfp(class_283, class_47512, this.Field_4354);
            }
        }
    }

    private boolean Method_4359(Class_283 class_283, Class_4751 class_4751, int n) {
        int n2 = 9349 & 22531;
        if (class_4751.\u0000, `() >= (-32645 & 1) && class_4751.\u0000, `() + n + (16999 & 3073) <= (274 & 1409)) {
            for (int i = 198 & 21048; i <= (8855 & -31703) + n; ++i) {
                int n3 = -20189 & 16962;
                if (i == 0) {
                    n3 = -28521 & 18497;
                } else if (i >= (9219 & 257) + n - (-32734 & 4242)) {
                    n3 = -30425 & 22146;
                }
                for (int j = -n3; j <= n3 && n2 != 0; ++j) {
                    for (int k = -n3; k <= n3 && n2 != 0; ++k) {
                        if (class_4751.\u0000, `() + i >= 0 && class_4751.\u0000, `() + i < (-30840 & 2304) && this.\u0000strictfp(class_283.Method_375(class_4751.Method_4791(j, i, k)).Method_3442())) continue;
                        n2 = 4277 & 322;
                    }
                }
            }
            return n2 != 0;
        }
        return (-24446 & 72) != 0;
    }

    public Class_4351(boolean bl, int n, int n2, Class_3436 class_3436, Class_3436 class_34362) {
        super(bl);
        this.Field_4355 = n;
        this.Field_4353 = n2;
        this.Field_4352 = class_3436;
        this.Field_4354 = class_34362;
    }

    private boolean Method_4360(Class_4751 class_4751, Class_283 class_283) {
        Class_4751 class_47512 = class_4751.Method_4782();
        Class_3238 class_3238 = class_283.Method_375(class_47512).Method_3442();
        if ((class_3238 == Class_9265.Field_9319 || class_3238 == Class_9265.Field_9272) && class_4751.\u0000, `() >= (779 & -24478)) {
            this.\u0000strictfp(class_283, class_47512);
            this.\u0000strictfp(class_283, class_47512.Method_4770());
            this.\u0000strictfp(class_283, class_47512.Method_4784());
            this.\u0000strictfp(class_283, class_47512.Method_4784().Method_4770());
            return (523 & 12401) != 0;
        }
        return (578 & 2353) != 0;
    }

    private void Method_4361() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_4362(Class_283 class_283, Class_4751 class_4751, int n) {
        int n2 = n * n;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                Class_4751 class_47512;
                Class_3713 class_3713;
                if (i * i + j * j > n2 || (class_3713 = class_283.Method_375(class_47512 = class_4751.Method_4791(i, 25120 & 1289, j)).Method_3442().Method_3373()) != Class_3713.Field_3718 && class_3713 != Class_3713.Field_3729) continue;
                this.\u0000strictfp(class_283, class_47512, this.Field_4354);
            }
        }
    }
}

