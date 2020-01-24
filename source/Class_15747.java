/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15747 {
    private int Field_15748;
    private final Class_4595 Field_15749;
    private final Class_283 Field_15750;
    private final Class_4595 Field_15751;
    private Class_4751 Field_15752;
    private final Class_4565 Field_15753;
    private int Field_15754;
    private int Field_15755 = 16387 & 4272;

    protected boolean Method_15756(Class_3238 class_3238) {
        return (class_3238.Field_3240 == Class_3713.Field_3718 || class_3238 == Class_9265.Field_9342 || class_3238 == Class_9265.Field_9291 ? 3717 & 16385 : 13574 & 1) != 0;
    }

    protected int Method_15757() {
        int n;
        this.Field_15748 = 17547 & -22272;
        block0 : while (this.Field_15748 < (21783 & 2653)) {
            for (n = 13344 & 82; n < this.Field_15754; ++n) {
                Class_4751 class_4751 = this.Field_15752.Method_4776(this.Field_15749, n).Method_4766(this.Field_15748);
                Class_3238 class_3238 = this.Field_15750.Method_375(class_4751).Method_3442();
                if (!this.Method_15756(class_3238)) break block0;
                if (class_3238 == Class_9265.Field_9291) {
                    this.Field_15755 += 2179 & 4865;
                }
                if (n == 0 ? (class_3238 = this.Field_15750.Method_375(class_4751.Method_4765(this.Field_15751)).Method_3442()) != Class_9265.Field_9445 : n == this.Field_15754 - (17547 & -32751) && (class_3238 = this.Field_15750.Method_375(class_4751.Method_4765(this.Field_15749)).Method_3442()) != Class_9265.Field_9445) break block0;
            }
            this.Field_15748 += 309 & -27007;
        }
        for (n = 6169 & 546; n < this.Field_15754; ++n) {
            if (this.Field_15750.Method_375(this.Field_15752.Method_4776(this.Field_15749, n).Method_4766(this.Field_15748)).Method_3442() == Class_9265.Field_9445) continue;
            this.Field_15748 = 956 & -4096;
            break;
        }
        if (this.Field_15748 <= (2453 & 125) && this.Field_15748 >= (263 & 16939)) {
            return this.Field_15748;
        }
        this.Field_15752 = null;
        this.Field_15754 = 12808 & -29472;
        this.Field_15748 = -16374 & 1284;
        return 8963 & 7296;
    }

    static int Method_15758(Class_15747 class_15747) {
        return class_15747.Field_15748;
    }

    public int Method_15759() {
        return this.Field_15748;
    }

    public int Method_15760() {
        return this.Field_15754;
    }

    static Class_4595 Method_15761(Class_15747 class_15747) {
        return class_15747.Field_15749;
    }

    static int Method_15762(Class_15747 class_15747) {
        return class_15747.Field_15754;
    }

    static Class_4751 Method_15763(Class_15747 class_15747) {
        return class_15747.Field_15752;
    }

    public void Method_15764() {
        for (int i = 0 & 8616; i < this.Field_15754; ++i) {
            Class_4751 class_4751 = this.Field_15752.Method_4776(this.Field_15749, i);
            for (int j = 24704 & -32755; j < this.Field_15748; ++j) {
                this.Field_15750.Method_462(class_4751.Method_4766(j), Class_9265.Field_9291.\u0000strictfp().Method_3685(Class_14263.Field_14264, (Comparable)((Object)this.Field_15753)), -27565 & 17026);
            }
        }
    }

    private void Method_15765() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_15747(Class_283 class_283, Class_4751 class_4751, Class_4565 class_4565) {
        this.Field_15750 = class_283;
        this.Field_15753 = class_4565;
        if (class_4565 == Class_4565.Field_4566) {
            this.Field_15751 = Class_4595.Field_4603;
            this.Field_15749 = Class_4595.Field_4602;
        } else {
            this.Field_15751 = Class_4595.Field_4598;
            this.Field_15749 = Class_4595.Field_4613;
        }
        Class_4751 class_47512 = class_4751;
        while (class_4751.\u0000, `() > class_47512.\u0000, `() - (21 & 3221) && class_4751.\u0000, `() > 0 && this.Method_15756(class_283.Method_375(class_4751.Method_4782()).Method_3442())) {
            class_4751 = class_4751.Method_4782();
        }
        int n = this.Method_15768(class_4751, this.Field_15751) - (-28535 & 18545);
        if (n >= 0) {
            this.Field_15752 = class_4751.Method_4776(this.Field_15751, n);
            this.Field_15754 = this.Method_15768(this.Field_15752, this.Field_15749);
            if (this.Field_15754 < (-25574 & 16386) || this.Field_15754 > (9749 & -26603)) {
                this.Field_15752 = null;
                this.Field_15754 = 4392 & -32687;
            }
        }
        if (this.Field_15752 != null) {
            this.Field_15748 = this.Method_15757();
        }
    }

    public boolean Method_15766() {
        return (this.Field_15752 != null && this.Field_15754 >= (8867 & 86) && this.Field_15754 <= (-22507 & 21535) && this.Field_15748 >= (-32213 & 9475) && this.Field_15748 <= (20661 & -30123) ? 8221 & 16451 : 24864 & 2072) != 0;
    }

    static int Method_15767(Class_15747 class_15747) {
        return class_15747.Field_15755;
    }

    protected int Method_15768(Class_4751 class_4751, Class_4595 class_4595) {
        Object object;
        int n;
        for (n = 10656 & 72; n < (12054 & 4158) && this.Method_15756(this.Field_15750.Method_375((Class_4751)(object = class_4751.Method_4776(class_4595, n))).Method_3442()) && this.Field_15750.Method_375(((Class_4751)object).Method_4782()).Method_3442() == Class_9265.Field_9445; ++n) {
        }
        object = this.Field_15750.Method_375(class_4751.Method_4776(class_4595, n)).Method_3442();
        return object == Class_9265.Field_9445 ? n : 2 & 24920;
    }
}

