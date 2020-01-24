/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_43663
extends Class_33284 {
    private Class_23823 Field_43664;

    public Class_43663(Class_283 class_283, Class_859 class_859, int n) {
        this(class_283, class_859, new Class_23823(Class_10527.Field_10687, -15871 & 5195, n));
    }

    protected void Method_43665(Class_37110 class_37110) {
        if (!this.\u0000strictfp.Field_306) {
            Class_10997 class_10997;
            List list;
            List list2 = Class_10527.Field_10687.Method_4110(this.Field_43664);
            if (list2 != null && !list2.isEmpty() && !(list = this.\u0000strictfp.Method_488(Class_859.class, class_10997 = this.\u0000, `().Method_11017(1.042857142857143 * 3.835616438356164, 0.25925925925925924 * 7.714285714285714, 0.13043478260869565 * 30.666666666666668))).isEmpty()) {
                for (Class_859 class_859 : list) {
                    double d = this.\u0000strictfp((Class_1061)class_859);
                    if (!(d < 14.596491228070175 * 1.0961538461538463)) continue;
                    double d2 = 1.0 - Math.sqrt(d) / (3.672131147540984 * 1.0892857142857142);
                    if (class_859 == class_37110.Field_37114) {
                        d2 = 1.0;
                    }
                    for (Class_25240 class_25240 : list2) {
                        int n = class_25240.Method_25253();
                        if (Class_8338.Field_8341[n].Method_8420()) {
                            Class_8338.Field_8341[n].Method_8441(this, this.\u0000strictfp(), class_859, class_25240.Method_25257(), d2);
                            continue;
                        }
                        int n2 = (int)(d2 * (double)class_25240.Method_25251() + 0.8333333333333334 * 0.6);
                        if (n2 <= (-22346 & 5405)) continue;
                        class_859.Method_995(new Class_25240(n, n2, class_25240.Method_25257()));
                    }
                }
            }
            this.\u0000strictfp.Method_502(2010 & -22573, new Class_4751(this), this.Method_43666());
            this.\u0000break();
        }
    }

    public Class_43663(Class_283 class_283, double d, double d2, double d3, int n) {
        this(class_283, d, d2, d3, new Class_23823(Class_10527.Field_10687, 4353 & 10443, n));
    }

    public int Method_43666() {
        if (this.Field_43664 == null) {
            this.Field_43664 = new Class_23823(Class_10527.Field_10687, 12289 & 545, 896 & 37);
        }
        return this.Field_43664.Method_23843();
    }

    public Class_43663(Class_283 class_283) {
        super(class_283);
    }

    protected float Method_43667() {
        return 0.3392857f * 1.4736843f;
    }

    public void Method_43668(int n) {
        if (this.Field_43664 == null) {
            this.Field_43664 = new Class_23823(Class_10527.Field_10687, 4117 & 16545, 2563 & -32464);
        }
        this.Field_43664.Method_23849(n);
    }

    public void Method_43669(Class_1699 class_1699) {
        super.Method_33296(class_1699);
        if (this.Field_43664 != null) {
            class_1699.Method_1744("Potion", this.Field_43664.Method_23841(new Class_1699()));
        }
    }

    public Class_43663(Class_283 class_283, double d, double d2, double d3, Class_23823 class_23823) {
        super(class_283, d, d2, d3);
        this.Field_43664 = class_23823;
    }

    public void Method_43670(Class_1699 class_1699) {
        super.Method_33307(class_1699);
        if (class_1699.Method_1715("Potion", 2778 & 16399)) {
            this.Field_43664 = Class_23823.Method_23840(class_1699.Method_1703("Potion"));
        } else {
            this.Method_43668(class_1699.Method_1738("potionValue"));
        }
        if (this.Field_43664 == null) {
            this.\u0000break();
        }
    }

    public Class_43663(Class_283 class_283, Class_859 class_859, Class_23823 class_23823) {
        super(class_283, class_859);
        this.Field_43664 = class_23823;
    }

    protected float Method_43671() {
        return 0.074074075f * 0.675f;
    }

    protected float Method_43672() {
        return -17.5f * 1.1428572f;
    }

    private void Method_43673() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

