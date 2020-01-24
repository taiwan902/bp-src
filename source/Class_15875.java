/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_15875
extends Class_8295 {
    public Class_4961 Field_15876 = new Class_41254();
    public Class_43010 Field_15877 = new Class_43010(this, 5155 & -16237, -15353 & 315);
    private Class_4751 Field_15878;
    private Class_283 Field_15879;

    public Class_23823 Method_15880(Class_626 class_626, int n) {
        Class_23823 class_23823 = null;
        Class_26421 class_26421 = (Class_26421)this.\u0000, `.get(n);
        if (class_26421 != null && class_26421.Method_26439()) {
            Class_23823 class_238232 = class_26421.Method_26430();
            class_23823 = class_238232.Method_23850();
            if (n == 0) {
                if (!this.\u0000strictfp(class_238232, 17546 & -21717, 8766 & -32721, (13319 & -32711) != 0)) {
                    return null;
                }
                class_26421.Method_26428(class_238232, class_23823);
            } else if (n >= (24698 & 1679) && n < (53 & 18725) ? !this.\u0000strictfp(class_238232, 4453 & -23003, 10366 & -32465, (8483 & -32768) != 0) : (n >= (8565 & -29009) && n < (-14674 & 302) ? !this.\u0000strictfp(class_238232, 11214 & -32757, 61 & -30489, (3105 & 772) != 0) : !this.\u0000strictfp(class_238232, 12426 & 16911, 302 & -10577, (3080 & 848) != 0))) {
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

    public boolean Method_15881(Class_23823 class_23823, Class_26421 class_26421) {
        return (class_26421.Field_26425 != this.Field_15876 && super.Method_8310(class_23823, class_26421) ? 5141 & -22335 : 5368 & -8190) != 0;
    }

    private void Method_15882() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_15883(Class_626 class_626) {
        super.Method_8320(class_626);
        if (!this.Field_15879.Field_306) {
            for (int i = -27903 & 2112; i < (12397 & -15975); ++i) {
                Class_23823 class_23823 = this.Field_15877.Method_43015(i);
                if (class_23823 == null) continue;
                class_626.Method_733(class_23823, (2440 & 4213) != 0);
            }
        }
    }

    public Class_15875(Class_37781 class_37781, Class_283 class_283, Class_4751 class_4751) {
        int n;
        int n2;
        this.Field_15879 = class_283;
        this.Field_15878 = class_4751;
        this.\u0000strictfp((Class_26421)new Class_34083(class_37781.Field_37786, this.Field_15877, this.Field_15876, -32633 & 2056, 31358 & 124, 13347 & 547));
        for (n2 = 12418 & 17664; n2 < (1027 & 16599); ++n2) {
            for (n = -29888 & 8240; n < (9043 & 18443); ++n) {
                this.\u0000strictfp(new Class_26421(this.Field_15877, n + n2 * (2067 & 17731), (3358 & 606) + n * (83 & 12698), (3129 & -7917) + n2 * (4255 & 18)));
            }
        }
        for (n2 = 9218 & 4552; n2 < (-29413 & 8387); ++n2) {
            for (n = 2112 & 16641; n < (4105 & 1099); ++n) {
                this.\u0000strictfp(new Class_26421(class_37781, n + n2 * (6361 & 8201) + (-27381 & 18477), (-32531 & 13320) + n * (-14318 & 8799), (8308 & 597) + n2 * (274 & 3126)));
            }
        }
        for (n2 = 914 & 22597; n2 < (8987 & 22633); ++n2) {
            this.\u0000strictfp(new Class_26421(class_37781, n2, (3080 & -24136) + n2 * (17306 & 18), 9198 & -27505));
        }
        this.Method_15884(this.Field_15877);
    }

    public void Method_15884(Class_4961 class_4961) {
        this.Field_15876.Method_4963(80 & 8224, Class_22497.Method_22506().Method_22500(this.Field_15877, this.Field_15879));
    }

    public boolean Method_15885(Class_626 class_626) {
        return (this.Field_15879.Method_375(this.Field_15878).Method_3442() != Class_9265.Field_9433 ? 8851 & 7264 : (class_626.\u0000strictfp((double)this.Field_15878.\u0000= final() + 1.9019607843137254 * 0.26288659793814434, (double)this.Field_15878.\u0000, `() + 0.9361702127659575 * 0.5340909090909091, (double)this.Field_15878.\u0000strictfp() + 0.4642857142857143 * 1.0769230769230769) <= 83.86206896551724 * 0.7631578947368421 ? 16771 & 601 : 13198 & 17472)) != 0;
    }
}

