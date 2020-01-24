/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_18889
extends Class_8295 {
    private final Class_26421 Field_18890;
    private int Field_18891;
    private Class_4961 Field_18892;

    public Class_18889(Class_37781 class_37781, Class_4961 class_4961) {
        int n;
        this.Field_18892 = class_4961;
        this.\u0000strictfp((Class_26421)new Class_29430(class_37781.Field_37786, class_4961, 9748 & -28415, 56 & 26232, 4223 & 46));
        this.\u0000strictfp((Class_26421)new Class_29430(class_37781.Field_37786, class_4961, 2057 & 9201, 79 & 4303, 8573 & 2613));
        this.\u0000strictfp((Class_26421)new Class_29430(class_37781.Field_37786, class_4961, 8194 & -15218, 14950 & 17662, 18542 & 4398));
        this.Field_18890 = this.\u0000strictfp((Class_26421)new Class_38554(this, class_4961, 4111 & 2595, 10335 & 463, 17457 & 2131));
        for (n = -28608 & 16902; n < (1539 & 131); ++n) {
            for (int i = -32384 & 64; i < (-32757 & 2493); ++i) {
                this.\u0000strictfp(new Class_26421(class_37781, i + n * (-31991 & 24751) + (13579 & -14211), (26762 & 60) + i * (10458 & 5906), (980 & -4994) + n * (-22510 & 4374)));
            }
        }
        for (n = 2048 & -11452; n < (15721 & 16537); ++n) {
            this.\u0000strictfp(new Class_26421(class_37781, n, (-32744 & 25192) + n * (4438 & 26), 4286 & 2254));
        }
    }

    public Class_23823 Method_18893(Class_626 class_626, int n) {
        Class_23823 class_23823 = null;
        Class_26421 class_26421 = (Class_26421)this.\u0000, `.get(n);
        if (class_26421 != null && class_26421.Method_26439()) {
            Class_23823 class_238232 = class_26421.Method_26430();
            class_23823 = class_238232.Method_23850();
            if ((n < 0 || n > (16394 & -30170)) && n != (3 & 16547)) {
                if (!this.Field_18890.Method_26439() && this.Field_18890.Method_26435(class_238232) ? !this.\u0000strictfp(class_238232, -30513 & 25619, 44 & 11780, (2211 & 72) != 0) : (Class_29430.Method_29432(class_23823) ? !this.\u0000strictfp(class_238232, 2088 & -28525, -6105 & 4555, (13824 & -16263) != 0) : (n >= (8340 & 17669) && n < (-14241 & 1087) ? !this.\u0000strictfp(class_238232, -16353 & 4671, 104 & 3116, (17961 & 8324) != 0) : (n >= (12383 & 1727) && n < (4396 & 8249) ? !this.\u0000strictfp(class_238232, 8788 & -28666, 12351 & -15841, (5186 & 128) != 0) : !this.\u0000strictfp(class_238232, -14324 & 231, 122 & -22356, (-9726 & 113) != 0))))) {
                    return null;
                }
            } else {
                if (!this.\u0000strictfp(class_238232, 775 & -15228, 16936 & -26312, (18945 & 5161) != 0)) {
                    return null;
                }
                class_26421.Method_26428(class_238232, class_23823);
            }
            if (class_238232.Field_23826 == 0) {
                class_26421.Method_26437(null);
            } else {
                class_26421.Method_26431();
            }
            if (class_238232.Field_23826 == class_23823.Field_23826) {
                return null;
            }
            class_26421.Method_26441(class_626, class_238232);
        }
        return class_23823;
    }

    public boolean Method_18894(Class_626 class_626) {
        return this.Field_18892.Method_4971(class_626);
    }

    public void Method_18895() {
        super.Method_8322();
        for (int i = 25545 & 34; i < this.\u0000= final.size(); ++i) {
            Class_37497 class_37497 = (Class_37497)this.\u0000= final.get(i);
            if (this.Field_18891 == this.Field_18892.Method_4973(6408 & 514)) continue;
            class_37497.Method_37499(this, -4094 & 1440, this.Field_18892.Method_4973(-28668 & 16416));
        }
        this.Field_18891 = this.Field_18892.Method_4973(70 & 8481);
    }

    public void Method_18896(Class_37497 class_37497) {
        super.Method_8306(class_37497);
        class_37497.Method_37498(this, this.Field_18892);
    }

    public void Method_18897(int n, int n2) {
        this.Field_18892.Method_4970(n, n2);
    }

    private void Method_18898() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

