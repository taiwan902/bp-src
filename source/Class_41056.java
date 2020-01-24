/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_41056
extends Class_1956 {
    protected final Class_3238 Field_41057;

    public void Method_41058(Class_1956 class_1956, Class_3987 class_3987, List list) {
        this.Field_41057.Method_3305(class_1956, class_3987, list);
    }

    public boolean Method_41059(Class_23823 class_23823, Class_626 class_626, Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3) {
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        Class_3238 class_3238 = class_3436.Method_3442();
        if (!class_3238.Method_3393(class_283, class_4751)) {
            class_4751 = class_4751.Method_4765(class_4595);
        }
        if (class_23823.Field_23826 == 0) {
            return (17560 & -32512) != 0;
        }
        if (!class_626.Method_794(class_4751, class_4595, class_23823)) {
            return (2198 & 26176) != 0;
        }
        if (class_283.Method_437(this.Field_41057, class_4751, (329 & 18468) != 0, class_4595, null, class_23823)) {
            int n = this.\u0000strictfp(class_23823.Method_23843());
            Class_3436 class_34362 = this.Field_41057.Method_3330(class_283, class_4751, class_4595, f, f2, f3, n, class_626);
            if (class_283.Method_462(class_4751, class_34362, 21123 & 47)) {
                class_34362 = class_283.Method_375(class_4751);
                if (class_34362.Method_3442() == this.Field_41057) {
                    Class_41056.Method_41066(class_283, class_626, class_4751, class_23823);
                    this.Field_41057.Method_3318(class_283, class_4751, class_34362, class_626, class_23823);
                }
                class_283.Method_475((float)class_4751.\u0000= final() + 0.74545455f * 0.6707317f, (float)class_4751.\u0000, `() + 0.1125f * 4.4444447f, (float)class_4751.\u0000strictfp() + 0.3776596f * 1.3239436f, this.Field_41057.Field_3276.Method_3614(), (this.Field_41057.Field_3276.Method_3618() + 1.0f) / 2.0f, this.Field_41057.Field_3276.Method_3615() * (0.4912281f * 1.6285714f));
                class_23823.Field_23826 -= -31215 & 26625;
            }
            return (2243 & -32759) != 0;
        }
        return (-7360 & 1074) != 0;
    }

    private void Method_41060() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_41061(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, Class_626 class_626, Class_23823 class_23823) {
        Class_3238 class_3238 = class_283.Method_375(class_4751).Method_3442();
        if (class_3238 == Class_9265.Field_9458) {
            class_4595 = Class_4595.Field_4601;
        } else if (!class_3238.Method_3393(class_283, class_4751)) {
            class_4751 = class_4751.Method_4765(class_4595);
        }
        return class_283.Method_437(this.Field_41057, class_4751, (4707 & 17556) != 0, class_4595, null, class_23823);
    }

    public String Method_41062(Class_23823 class_23823) {
        return this.Field_41057.Method_3408();
    }

    public Class_3238 Method_41063() {
        return this.Field_41057;
    }

    public Class_3987 Method_41064() {
        return this.Field_41057.Method_3325();
    }

    public String Method_41065() {
        return this.Field_41057.Method_3408();
    }

    public static boolean Method_41066(Class_283 class_283, Class_626 class_626, Class_4751 class_4751, Class_23823 class_23823) {
        Class_4879 class_4879;
        Class_2457 class_2457 = Class_2457.Method_2530();
        if (class_2457 == null) {
            return (-30396 & 8194) != 0;
        }
        if (class_23823.Method_23842() && class_23823.Method_23845().Method_1715("BlockEntityTag", -16113 & 5178) && (class_4879 = class_283.Method_429(class_4751)) != null) {
            if (!class_283.Field_306 && class_4879.Method_4921() && !class_2457.Method_2616().Method_3116(class_626.Method_749())) {
                return (-7676 & 2241) != 0;
            }
            Class_1699 class_1699 = new Class_1699();
            Class_1699 class_16992 = (Class_1699)class_1699.Method_1732();
            class_4879.Method_4929(class_1699);
            Class_1699 class_16993 = (Class_1699)class_23823.Method_23845().Method_1720("BlockEntityTag");
            class_1699.Method_1730(class_16993);
            class_1699.Method_1739("x", class_4751.\u0000= final());
            class_1699.Method_1739("y", class_4751.\u0000, `());
            class_1699.Method_1739("z", class_4751.\u0000strictfp());
            if (!class_1699.Method_1734(class_16992)) {
                class_4879.Method_4911(class_1699);
                class_4879.Method_4922();
                return (35 & 19473) != 0;
            }
        }
        return (-7995 & 2056) != 0;
    }

    public Class_41056 Method_41067(String string) {
        super.Method_2000(string);
        return this;
    }

    public Class_1956 Method_41068(String string) {
        return this.Method_41067(string);
    }

    public Class_41056(Class_3238 class_3238) {
        this.Field_41057 = class_3238;
    }
}

