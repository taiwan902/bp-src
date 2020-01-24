/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_33462
extends Class_33077 {
    Class_43406 Field_33463;
    Class_43406 Field_33464;
    private int Field_33465;
    double Field_33466;

    public void Method_33467() {
        if ((this.Field_33465 -= 26769 & 4673) <= 0) {
            this.Field_33465 = 4238 & 28283;
            this.Field_33463.\u0000strictfp().Method_7631(this.Field_33464, this.Field_33466);
        }
    }

    public Class_33462(Class_43406 class_43406, double d) {
        this.Field_33463 = class_43406;
        this.Field_33466 = d;
    }

    public boolean Method_33468() {
        if (this.Field_33463.\u0000strictfp() >= 0) {
            return (-32732 & 24386) != 0;
        }
        if (!this.Field_33464.\u0000volatile()) {
            return (16480 & -28416) != 0;
        }
        double d = this.Field_33463.\u0000strictfp((Class_1061)this.Field_33464);
        return (d >= 10.343283582089553 * 0.8701298701298701 && d <= 59.733333333333334 * 4.285714285714286 ? 273 & -28671 : 1048 & -20412) != 0;
    }

    public boolean Method_33469() {
        if (this.Field_33463.\u0000strictfp() >= 0) {
            return (581 & -18432) != 0;
        }
        List list = this.Field_33463.\u0000strictfp.Method_488(this.Field_33463.getClass(), this.Field_33463.\u0000, `().Method_11017(6.185567010309279 * 1.2933333333333332, 0.7368421052631579 * 5.428571428571429, 2.475 * 3.2323232323232323));
        Class_43406 class_43406 = null;
        double d = 2.4482758620689653 * 7.342690269155938E307;
        for (Class_43406 class_434062 : list) {
            double d2;
            if (class_434062.\u0000strictfp() < 0 || !((d2 = this.Field_33463.\u0000strictfp((Class_1061)class_434062)) <= d)) continue;
            d = d2;
            class_43406 = class_434062;
        }
        if (class_43406 == null) {
            return (6665 & 24832) != 0;
        }
        if (d < 1.0 * 9.0) {
            return (18 & -31731) != 0;
        }
        this.Field_33464 = class_43406;
        return (16653 & -24445) != 0;
    }

    private void Method_33470() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33471() {
        this.Field_33465 = 18788 & 9219;
    }

    public void Method_33472() {
        this.Field_33464 = null;
    }
}

