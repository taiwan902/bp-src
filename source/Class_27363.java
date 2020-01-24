/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Random;

public class Class_27363
extends Class_24189 {
    private int Field_27364;
    private int Field_27365;
    public long Field_27366;

    protected void Method_27367(Class_1699 class_1699) {
    }

    protected void Method_27368(Class_1699 class_1699) {
    }

    public void Method_27369() {
        super.\u0000, `();
        if (this.Field_27364 == (11266 & 42)) {
            this.\u0000strictfp.Method_475(this.\u0000= package, this.\u0000, for(), this.\u0000= switch, "ambient.weather.thunder", 0.96385545f * 10375.0f, 0.14285715f * 5.6f + this.\u0000strictfp.nextFloat() * (0.12962963f * 1.5428572f));
            this.\u0000strictfp.Method_475(this.\u0000= package, this.\u0000, for(), this.\u0000= switch, "random.explode", 2.0f, 0.036585364f * 13.666667f + this.\u0000strictfp.nextFloat() * (2.5555556f * 0.07826087f));
        }
        this.Field_27364 -= 12421 & 3;
        if (this.Field_27364 < 0) {
            if (this.Field_27365 == 0) {
                this.\u0000break();
            } else if (this.Field_27364 < -this.\u0000strictfp.nextInt(22799 & 8746)) {
                this.Field_27365 -= 4681 & 24631;
                this.Field_27364 = 969 & 4099;
                this.Field_27366 = this.\u0000strictfp.nextLong();
                Class_4751 class_4751 = new Class_4751(this);
                if (!this.\u0000strictfp.Field_306 && this.\u0000strictfp.Method_522().Method_7529("doFireTick") && this.\u0000strictfp.Method_427(class_4751, 19835 & 8718) && this.\u0000strictfp.Method_375(class_4751).Method_3442().Method_3373() == Class_3713.Field_3718 && Class_9265.Field_9342.Method_5877(this.\u0000strictfp, class_4751)) {
                    this.\u0000strictfp.Method_435(class_4751, Class_9265.Field_9342.\u0000strictfp());
                }
            }
        }
        if (this.Field_27364 >= 0) {
            if (this.\u0000strictfp.Field_306) {
                this.\u0000strictfp.Method_408(938 & 2066);
            } else {
                double d = 0.5454545454545454 * 5.5;
                ArrayList arrayList = this.\u0000strictfp.Method_473(this, new Class_10997(this.\u0000= package - d, this.\u0000, for() - d, this.\u0000= switch - d, this.\u0000= package + d, this.\u0000, for() + 34.0 * 0.17647058823529413 + d, this.\u0000= switch + d));
                for (int i = 12336 & 1026; i < arrayList.size(); ++i) {
                    Class_1061 class_1061 = (Class_1061)arrayList.get(i);
                    class_1061.Method_1220(this);
                }
            }
        }
    }

    public Class_27363(Class_283 class_283, double d, double d2, double d3) {
        super(class_283);
        this.\u0000, `(d, d2, d3, 0.0f, 0.0f);
        this.Field_27364 = 4674 & 26766;
        this.Field_27366 = this.\u0000strictfp.nextLong();
        this.Field_27365 = this.\u0000strictfp.nextInt(707 & -28413) + (-28569 & 1);
        Class_4751 class_4751 = new Class_4751(this);
        if (!class_283.Field_306 && class_283.Method_522().Method_7529("doFireTick") && (class_283.Method_487() == Class_26801.Field_26802 || class_283.Method_487() == Class_26801.Field_26804) && class_283.Method_427(class_4751, 810 & 17418)) {
            if (class_283.Method_375(class_4751).Method_3442().Method_3373() == Class_3713.Field_3718 && Class_9265.Field_9342.Method_5877(class_283, class_4751)) {
                class_283.Method_435(class_4751, Class_9265.Field_9342.\u0000strictfp());
            }
            for (int i = 7264 & -16235; i < (-32107 & 4398); ++i) {
                Class_4751 class_47512 = class_4751.Method_4791(this.\u0000strictfp.nextInt(4259 & -32685) - (8835 & 2049), this.\u0000strictfp.nextInt(4263 & 1051) - (-15151 & 2851), this.\u0000strictfp.nextInt(21507 & 10243) - (8453 & 9));
                if (class_283.Method_375(class_47512).Method_3442().Method_3373() != Class_3713.Field_3718 || !Class_9265.Field_9342.Method_5877(class_283, class_47512)) continue;
                class_283.Method_435(class_47512, Class_9265.Field_9342.\u0000strictfp());
            }
        }
    }

    private void Method_27370() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_27371() {
    }
}

