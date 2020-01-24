/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_22508
extends Class_8295 {
    private final Class_283 Field_22509;
    private Class_43918 Field_22510;
    private Class_7434 Field_22511;

    public void Method_22512(Class_37497 class_37497) {
        super.Method_8306(class_37497);
    }

    private void Method_22513() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_22514(Class_626 class_626) {
        return (this.Field_22511.Method_7441() == class_626 ? 8265 & 4503 : 17024 & 16) != 0;
    }

    public Class_23823 Method_22515(Class_626 class_626, int n) {
        Class_23823 class_23823 = null;
        Class_26421 class_26421 = (Class_26421)this.\u0000, `.get(n);
        if (class_26421 != null && class_26421.Method_26439()) {
            Class_23823 class_238232 = class_26421.Method_26430();
            class_23823 = class_238232.Method_23850();
            if (n == (2 & 8450)) {
                if (!this.\u0000strictfp(class_238232, 26763 & 5191, -31449 & 20519, (-23541 & 2069) != 0)) {
                    return null;
                }
                class_26421.Method_26428(class_238232, class_23823);
            } else if (n != 0 && n != (11525 & -15709) ? (n >= (-32693 & 12567) && n < (9566 & 190) ? !this.\u0000strictfp(class_238232, -7809 & 5790, 16487 & -17993, (-26271 & 656) != 0) : n >= (6527 & 1054) && n < (-22409 & 16679) && !this.\u0000strictfp(class_238232, 9351 & -11685, 158 & -26561, (-23776 & 16533) != 0)) : !this.\u0000strictfp(class_238232, 12291 & 779, 55 & 16935, (2564 & 17728) != 0)) {
                return null;
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

    public Class_22508(Class_37781 class_37781, Class_7434 class_7434, Class_283 class_283) {
        int n;
        this.Field_22511 = class_7434;
        this.Field_22509 = class_283;
        this.Field_22510 = new Class_43918(class_37781.Field_37786, class_7434);
        this.\u0000strictfp(new Class_26421(this.Field_22510, 1216 & 8226, 1188 & 8502, 2549 & 573));
        this.\u0000strictfp(new Class_26421(this.Field_22510, 1223 & 2081, -32642 & 16447, 4157 & 2101));
        this.\u0000strictfp((Class_26421)new Class_30060(class_37781.Field_37786, class_7434, this.Field_22510, 934 & 2, 1144 & 253, 2231 & 13117));
        for (n = 2 & 17576; n < (2067 & -28029); ++n) {
            for (int i = 3592 & 4257; i < (16397 & 4107); ++i) {
                this.\u0000strictfp(new Class_26421(class_37781, i + n * (20491 & 8217) + (-6005 & 777), (-17784 & 44) + i * (22707 & 1042), (-11052 & 92) + n * (-30702 & 16434)));
            }
        }
        for (n = 16470 & 4224; n < (16509 & 12553); ++n) {
            this.\u0000strictfp(new Class_26421(class_37781, n, (-22504 & 5164) + n * (30002 & 19), 431 & -3938));
        }
    }

    public void Method_22516() {
        super.Method_8322();
    }

    public void Method_22517(Class_4961 class_4961) {
        this.Field_22510.Method_43929();
        super.Method_8312(class_4961);
    }

    public void Method_22518(int n) {
        this.Field_22510.Method_43941(n);
    }

    public Class_43918 Method_22519() {
        return this.Field_22510;
    }

    public void Method_22520(Class_626 class_626) {
        super.Method_8320(class_626);
        this.Field_22511.Method_7436(null);
        super.Method_8320(class_626);
        if (!this.Field_22509.Field_306) {
            Class_23823 class_23823 = this.Field_22510.Method_43943(520 & 274);
            if (class_23823 != null) {
                class_626.Method_733(class_23823, (16432 & 514) != 0);
            }
            if ((class_23823 = this.Field_22510.Method_43943(8241 & -14783)) != null) {
                class_626.Method_733(class_23823, (1044 & 4833) != 0);
            }
        }
    }

    public void Method_22521(int n, int n2) {
    }
}

