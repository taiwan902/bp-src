/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_17022 {
    double Field_17023;
    double Field_17024;

    float Method_17025() {
        return Class_13337.Method_13347(this.Field_17023 * this.Field_17023 + this.Field_17024 * this.Field_17024);
    }

    private void Method_17026() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_17022(double d, double d2) {
        this.Field_17023 = d;
        this.Field_17024 = d2;
    }

    public void Method_17027(Random random, double d, double d2, double d3, double d4) {
        this.Field_17023 = Class_13337.Method_13389(random, d, d3);
        this.Field_17024 = Class_13337.Method_13389(random, d2, d4);
    }

    public boolean Method_17028(double d, double d2, double d3, double d4) {
        int n = 5124 & 8650;
        if (this.Field_17023 < d) {
            this.Field_17023 = d;
            n = 5 & -32373;
        } else if (this.Field_17023 > d3) {
            this.Field_17023 = d3;
            n = 289 & 523;
        }
        if (this.Field_17024 < d2) {
            this.Field_17024 = d2;
            n = 145 & -23487;
        } else if (this.Field_17024 > d4) {
            this.Field_17024 = d4;
            n = 26689 & 4627;
        }
        return n != 0;
    }

    double Method_17029(Class_17022 class_17022) {
        double d = this.Field_17023 - class_17022.Field_17023;
        double d2 = this.Field_17024 - class_17022.Field_17024;
        return Math.sqrt(d * d + d2 * d2);
    }

    public void Method_17030(Class_17022 class_17022) {
        this.Field_17023 -= class_17022.Field_17023;
        this.Field_17024 -= class_17022.Field_17024;
    }

    Class_17022() {
    }

    public int Method_17031(Class_283 class_283) {
        Class_4751 class_4751 = new Class_4751(this.Field_17023, 0.26 * 984.6153846153845, this.Field_17024);
        while (class_4751.\u0000, `() > 0) {
            if (class_283.Method_375(class_4751 = class_4751.Method_4782()).Method_3442().Method_3373() == Class_3713.Field_3718) continue;
            return class_4751.\u0000, `() + (1 & 2517);
        }
        return 309 & 265;
    }

    void Method_17032() {
        double d = this.Method_17025();
        this.Field_17023 /= d;
        this.Field_17024 /= d;
    }

    public boolean Method_17033(Class_283 class_283) {
        Class_4751 class_4751 = new Class_4751(this.Field_17023, 55.05376344086021 * 4.65, this.Field_17024);
        while (class_4751.\u0000, `() > 0) {
            Class_3713 class_3713 = class_283.Method_375(class_4751 = class_4751.Method_4782()).Method_3442().Method_3373();
            if (class_3713 == Class_3713.Field_3718) continue;
            return (!class_3713.Method_3758() && class_3713 != Class_3713.Field_3755 ? 5265 & 771 : 208 & -19924) != 0;
        }
        return (5120 & 218) != 0;
    }
}

