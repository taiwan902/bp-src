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

public class Class_41796
extends Class_29028 {
    final Class_16456 Field_41797;

    public Class_41796(Class_16456 class_16456, Class_18 class_18) {
        this.Field_41797 = class_16456;
        super(class_16456, class_18);
        this.\u0000strictfp = Lists.newArrayList();
        for (Class_22538 class_22538 : Class_19863.Field_19899) {
            int n = 2570 & 4401;
            int n2 = Class_1956.Method_1986(class_22538.Method_22541());
            if (Class_16456.Method_16469(class_16456).Method_25501(class_22538) > 0) {
                n = -23039 & 273;
            } else if (Class_19863.Field_19900[n2] != null && Class_16456.Method_16469(class_16456).Method_25501(Class_19863.Field_19900[n2]) > 0) {
                n = 89 & 19461;
            } else if (Class_19863.Field_19885[n2] != null && Class_16456.Method_16469(class_16456).Method_25501(Class_19863.Field_19885[n2]) > 0) {
                n = 263 & 4713;
            }
            if (n == 0) continue;
            this.\u0000strictfp.add(class_22538);
        }
        this.\u0000strictfp = new Class_23635(this, class_16456);
    }

    protected String Method_41798(int n) {
        return n == (1079 & -24439) ? "stat.crafted" : (n == (-24062 & 20483) ? "stat.used" : "stat.depleted");
    }

    private void Method_41799() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_41800(int n, int n2, Class_7644 class_7644) {
        super.Method_29040(n, n2, class_7644);
        if (this.\u0000strictfp == 0) {
            this.Field_41797.Method_16491(n + (8571 & 18547) - (2098 & 8339) + (-31047 & 26629), n2 + (5189 & 24883) + (1025 & 28699), 11352 & 75, 26138 & 2423);
        } else {
            this.Field_41797.Method_16491(n + (3827 & 4211) - (4506 & 26162), n2 + (-12191 & 525), 5213 & -5942, 18646 & 12315);
        }
        if (this.\u0000strictfp == (20641 & 21)) {
            this.Field_41797.Method_16491(n + (429 & 181) - (1047 & -30190) + (1 & 7225), n2 + (18565 & 9729) + (3809 & 1), 8722 & 6330, 6354 & 26);
        } else {
            this.Field_41797.Method_16491(n + (-32025 & 1189) - (22 & -16366), n2 + (157 & 27171), 19475 & 626, 2067 & 14098);
        }
        if (this.\u0000strictfp == (9287 & 18834)) {
            this.Field_41797.Method_16491(n + (-30473 & 26583) - (12371 & -32486) + (1 & -26543), n2 + (1373 & 10273) + (-26459 & 8529), -24220 & 17958, 215 & -32486);
        } else {
            this.Field_41797.Method_16491(n + (1239 & 24799) - (9850 & -30697), n2 + (-24319 & 16475), 26663 & 4140, 1170 & -16110);
        }
    }

    protected void Method_41801(int n, int n2, int n3, int n4, int n5, int n6) {
        Class_22538 class_22538 = this.\u0000strictfp(n);
        Class_1956 class_1956 = class_22538.Method_22541();
        this.Field_41797.Method_16494(n2 + (8232 & -13380), n3, class_1956);
        int n7 = Class_1956.Method_1986(class_1956);
        this.\u0000strictfp(Class_19863.Field_19900[n7], n2 + (115 & 6643), n3, (n % (2450 & -31734) == 0 ? 257 & 17619 : 28 & 16672) != 0);
        this.\u0000strictfp(Class_19863.Field_19885[n7], n2 + (13493 & -32603), n3, (n % (6178 & 650) == 0 ? 2889 & 16433 : 2560 & 80) != 0);
        this.\u0000strictfp((Class_13017)class_22538, n2 + (479 & 25303), n3, (n % (-28650 & 3459) == 0 ? 9233 & -32761 : -32511 & 9456) != 0);
    }
}

