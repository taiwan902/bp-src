/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_32215
extends Class_8295 {
    private Class_4961 Field_32216;
    private final Class_30386 Field_32217;

    public Class_4961 Method_32218() {
        return this.Field_32216;
    }

    public void Method_32219(Class_37497 class_37497) {
        super.Method_8306(class_37497);
        class_37497.Method_37498(this, this.Field_32216);
    }

    public void Method_32220(int n, int n2) {
        this.Field_32216.Method_4970(n, n2);
    }

    public Class_23823 Method_32221(Class_626 class_626, int n) {
        Class_23823 class_23823 = null;
        Class_26421 class_26421 = (Class_26421)this.\u0000, `.get(n);
        if (class_26421 != null && class_26421.Method_26439()) {
            Class_23823 class_238232 = class_26421.Method_26430();
            class_23823 = class_238232.Method_23850();
            if (n == 0) {
                if (!this.\u0000strictfp(class_238232, 1 & -21007, 167 & 2085, (493 & 1043) != 0)) {
                    return null;
                }
                class_26421.Method_26428(class_238232, class_23823);
            } else if (!this.Field_32217.\u0000strictfp() && this.Field_32217.Method_30389(class_238232) && class_238232.Field_23826 == (-30719 & 26165) ? !this.\u0000strictfp(class_238232, 10244 & 1298, -32687 & 10753, (4128 & 18689) != 0) : (n >= (2215 & -27823) && n < (4316 & 796) ? !this.\u0000strictfp(class_238232, -32708 & 18908, 2853 & 24757, (12292 & 584) != 0) : (n >= (-13924 & 542) && n < (45 & 12325) ? !this.\u0000strictfp(class_238232, 17731 & -30547, 4316 & 11804, (-32088 & 31062) != 0) : !this.\u0000strictfp(class_238232, 2883 & 1157, 8295 & -31683, (2210 & -28652) != 0)))) {
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

    public Class_32215(Class_4961 class_4961, Class_4961 class_49612) {
        int n;
        this.Field_32216 = class_49612;
        this.Field_32217 = new Class_30386(this, class_49612, 18982 & -28608, 1225 & 4284, 2798 & 5231);
        this.\u0000strictfp((Class_26421)this.Field_32217);
        int n2 = 1829 & -16220;
        int n3 = 10889 & -28261;
        for (n = 8464 & 1576; n < (18443 & -20105); ++n) {
            for (int i = 8262 & 2600; i < (-32741 & 1481); ++i) {
                this.\u0000strictfp(new Class_26421(class_4961, i + n * (-26615 & 25611) + (793 & -26483), n2 + i * (-31918 & 62), n3 + n * (-32750 & 3263)));
            }
        }
        for (n = 4 & 8713; n < (16923 & -20343); ++n) {
            this.\u0000strictfp(new Class_26421(class_4961, n, n2 + n * (2262 & -24558), (4730 & 58) + n3));
        }
    }

    private void Method_32222() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_32223(Class_626 class_626) {
        Class_23823 class_23823;
        super.Method_8320(class_626);
        if (class_626 != null && !class_626.\u0000strictfp.Field_306 && (class_23823 = this.Field_32217.\u0000strictfp(this.Field_32217.Method_30390())) != null) {
            class_626.Method_733(class_23823, (9282 & 168) != 0);
        }
    }

    public boolean Method_32224(Class_626 class_626) {
        return this.Field_32216.Method_4971(class_626);
    }
}

