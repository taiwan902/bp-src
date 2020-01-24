/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_34780
extends Class_33077 {
    private Class_43406 Field_34781;
    double Field_34782;
    private Class_43406 Field_34783;
    Class_283 Field_34784;
    int Field_34785;

    private void Method_34786() {
        Class_42629 class_42629 = this.Field_34783.\u0000strictfp((Class_42629)this.Field_34781);
        if (class_42629 != null) {
            Class_626 class_626 = this.Field_34783.Method_43416();
            if (class_626 == null && this.Field_34781.Method_43416() != null) {
                class_626 = this.Field_34781.Method_43416();
            }
            if (class_626 != null) {
                class_626.Method_750(Class_19863.Field_19877);
                if (this.Field_34783 instanceof Class_43539) {
                    class_626.Method_750(Class_21905.Field_21914);
                }
            }
            this.Field_34783.\u0000, `(14192 & 22512);
            this.Field_34781.\u0000, `(8060 & -18575);
            this.Field_34783.Method_43412();
            this.Field_34781.Method_43412();
            class_42629.Method_42642(-3263 & -22964);
            class_42629.\u0000, `(this.Field_34783.\u0000= package, this.Field_34783.\u0000, for(), this.Field_34783.\u0000= switch, 0.0f, 0.0f);
            this.Field_34784.Method_350(class_42629);
            Random random = this.Field_34783.\u0000strictfp();
            for (int i = 17474 & 8464; i < (23 & 391); ++i) {
                double d = random.nextGaussian() * (0.8421052631578947 * 0.02375);
                double d2 = random.nextGaussian() * (0.024303797468354434 * 0.8229166666666666);
                double d3 = random.nextGaussian() * (0.09000000000000001 * 0.2222222222222222);
                double d4 = random.nextDouble() * (double)this.Field_34783.\u0000= int() * (0.64 * 3.125) - (double)this.Field_34783.\u0000= int();
                double d5 = 0.958904109589041 * 0.5214285714285715 + random.nextDouble() * (double)this.Field_34783.\u0000= switch();
                double d6 = random.nextDouble() * (double)this.Field_34783.\u0000= int() * (1.1428571428571428 * 1.75) - (double)this.Field_34783.\u0000= int();
                this.Field_34784.Method_407(Class_40274.Field_40278, this.Field_34783.\u0000= package + d4, this.Field_34783.\u0000, for() + d5, this.Field_34783.\u0000= switch + d6, d, d2, d3, new int[-14192 & 5126]);
            }
            if (this.Field_34784.Method_522().Method_7529("doMobLoot")) {
                this.Field_34784.Method_350(new Class_3481(this.Field_34784, this.Field_34783.\u0000= package, this.Field_34783.\u0000, for(), this.Field_34783.\u0000= switch, random.nextInt(-4049 & 2183) + (-12243 & 3475)));
            }
        }
    }

    private Class_43406 Method_34787() {
        float f = 4.111111f * 1.945946f;
        List list = this.Field_34784.Method_488(this.Field_34783.getClass(), this.Field_34783.\u0000, `().Method_11017(f, f, f));
        double d = 1.3891265133026984E308 * 1.2941176470588236;
        Class_43406 class_43406 = null;
        for (Class_43406 class_434062 : list) {
            if (!this.Field_34783.Method_43423(class_434062) || !(this.Field_34783.\u0000strictfp((Class_1061)class_434062) < d)) continue;
            class_43406 = class_434062;
            d = this.Field_34783.\u0000strictfp((Class_1061)class_434062);
        }
        return class_43406;
    }

    public boolean Method_34788() {
        return (this.Field_34781.\u0000volatile() && this.Field_34781.Method_43428() && this.Field_34785 < (316 & 17148) ? 16497 & 8449 : 1048 & 18661) != 0;
    }

    private void Method_34789() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_34790() {
        this.Field_34781 = null;
        this.Field_34785 = 4226 & -32764;
    }

    public Class_34780(Class_43406 class_43406, double d) {
        this.Field_34783 = class_43406;
        this.Field_34784 = class_43406.\u0000strictfp;
        this.Field_34782 = d;
        this.\u0000strictfp(1323 & 67);
    }

    public boolean Method_34791() {
        if (!this.Field_34783.Method_43428()) {
            return (7177 & -32768) != 0;
        }
        this.Field_34781 = this.Method_34787();
        return (this.Field_34781 != null ? -23335 & 4355 : -16051 & 2562) != 0;
    }

    public void Method_34792() {
        this.Field_34783.\u0000strictfp().Method_21479(this.Field_34781, 8.846154f * 1.1304348f, this.Field_34783.\u0000= int());
        this.Field_34783.\u0000strictfp().Method_7631(this.Field_34781, this.Field_34782);
        this.Field_34785 += 29 & 1633;
        if (this.Field_34785 >= (4668 & -14212) && this.Field_34783.\u0000strictfp((Class_1061)this.Field_34781) < 16.5 * 0.5454545454545454) {
            this.Method_34786();
        }
    }
}

