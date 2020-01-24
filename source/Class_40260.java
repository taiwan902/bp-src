/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import java.util.List;

public class Class_40260
extends Class_29028 {
    final Class_16456 Field_40261;

    private void Method_40262() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_40263(int n, int n2, Class_7644 class_7644) {
        super.Method_29040(n, n2, class_7644);
        if (this.\u0000strictfp == 0) {
            this.Field_40261.Method_16491(n + (18559 & -31629) - (-22190 & 22195) + (10309 & -28663), n2 + (81 & 22025) + (6145 & 17461), -25318 & 722, 1083 & -30186);
        } else {
            this.Field_40261.Method_16491(n + (25595 & -26505) - (-32206 & 2203), n2 + (10275 & 21085), 146 & -16102, 17082 & -29421);
        }
        if (this.\u0000strictfp == (-30647 & 4497)) {
            this.Field_40261.Method_16491(n + (17071 & 12453) - (-32162 & 50) + (25625 & 741), n2 + (4097 & -5423) + (18513 & 9507), 36 & -29651, 25330 & -26350);
        } else {
            this.Field_40261.Method_16491(n + (933 & 5285) - (18 & -27746), n2 + (16401 & 4363), 6244 & -24276, 8210 & -29674);
        }
        if (this.\u0000strictfp == (26630 & 578)) {
            this.Field_40261.Method_16491(n + (-7945 & 6615) - (-3054 & 2098) + (-31215 & 24585), n2 + (-26059 & 24643) + (97 & -29819), 8503 & 5246, 16850 & 10290);
        } else {
            this.Field_40261.Method_16491(n + (-32289 & 14551) - (20690 & -32205), n2 + (15489 & -31967), 2102 & 12471, 21010 & 2130);
        }
    }

    protected String Method_40264(int n) {
        return n == 0 ? "stat.crafted" : (n == (16833 & -31211) ? "stat.used" : "stat.mined");
    }

    protected void Method_40265(int n, int n2, int n3, int n4, int n5, int n6) {
        Class_22538 class_22538 = this.\u0000strictfp(n);
        Class_1956 class_1956 = class_22538.Method_22541();
        this.Field_40261.Method_16494(n2 + (25211 & 1068), n3, class_1956);
        int n7 = Class_1956.Method_1986(class_1956);
        this.\u0000strictfp(Class_19863.Field_19885[n7], n2 + (-27785 & 18547), n3, (n % (6498 & -15869) == 0 ? 153 & -32697 : 10526 & -31744) != 0);
        this.\u0000strictfp(Class_19863.Field_19917[n7], n2 + (8941 & 7349), n3, (n % (-27518 & 586) == 0 ? -27613 & 19277 : -30680 & 28753) != 0);
        this.\u0000strictfp((Class_13017)class_22538, n2 + (16895 & 2263), n3, (n % (1538 & -24574) == 0 ? 97 & 20765 : 8449 & 2598) != 0);
    }

    public Class_40260(Class_16456 class_16456, Class_18 class_18) {
        this.Field_40261 = class_16456;
        super(class_16456, class_18);
        this.\u0000strictfp = Lists.newArrayList();
        for (Class_22538 class_22538 : Class_19863.Field_19880) {
            int n = -31212 & 12736;
            int n2 = Class_1956.Method_1986(class_22538.Method_22541());
            if (Class_16456.Method_16469(class_16456).Method_25501(class_22538) > 0) {
                n = 4115 & -14655;
            } else if (Class_19863.Field_19917[n2] != null && Class_16456.Method_16469(class_16456).Method_25501(Class_19863.Field_19917[n2]) > 0) {
                n = 1101 & 4387;
            } else if (Class_19863.Field_19885[n2] != null && Class_16456.Method_16469(class_16456).Method_25501(Class_19863.Field_19885[n2]) > 0) {
                n = 15379 & -32723;
            }
            if (n == 0) continue;
            this.\u0000strictfp.add(class_22538);
        }
        this.\u0000strictfp = new Class_6147(this, class_16456);
    }
}

