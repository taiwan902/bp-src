/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_21239
extends Class_15933 {
    public double Field_21240;
    private int Field_21241;
    public double Field_21242;

    private void Method_21243() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_15120 Method_21244() {
        return Class_15120.Field_15130;
    }

    public Class_3436 Method_21245() {
        return (this.Method_21249() ? Class_9265.Field_9425 : Class_9265.Field_9354).Method_3293().Method_3685(Class_16030.Field_16031, (Comparable)((Object)Class_4595.Field_4598));
    }

    protected void Method_21246(Class_1699 class_1699) {
        super.Method_15977(class_1699);
        this.Field_21242 = class_1699.Method_1721("PushX");
        this.Field_21240 = class_1699.Method_1721("PushZ");
        this.Field_21241 = class_1699.Method_1726("Fuel");
    }

    protected void Method_21247() {
        super.Method_15963();
        this.\u0000strictfp.Method_32719(-32651 & 9752, new Byte((byte)(3136 & -11519)));
    }

    protected void Method_21248(Class_1699 class_1699) {
        super.Method_15948(class_1699);
        class_1699.Method_1728("PushX", this.Field_21242);
        class_1699.Method_1728("PushZ", this.Field_21240);
        class_1699.Method_1731("Fuel", (short)this.Field_21241);
    }

    protected boolean Method_21249() {
        return ((this.\u0000strictfp.Method_32708(8209 & -30576) & (-30715 & 29257)) != 0 ? 2113 & 25125 : 16480 & 5148) != 0;
    }

    public void Method_21250(Class_32797 class_32797) {
        super.Method_15954(class_32797);
        if (!class_32797.Method_32854() && this.\u0000strictfp.Method_522().Method_7529("doEntityDrops")) {
            this.\u0000strictfp(new Class_23823(Class_9265.Field_9354, -19967 & 135), 0.0f);
        }
    }

    public boolean Method_21251(Class_626 class_626) {
        Class_23823 class_23823 = class_626.Field_628.Method_37821();
        if (class_23823 != null && class_23823.Method_23844() == Class_10527.Field_10698) {
            if (!class_626.Field_694.Method_18094() && (class_23823.Field_23826 -= 2561 & -31711) == 0) {
                class_626.Field_628.Method_37796(class_626.Field_628.Field_37782, null);
            }
            this.Field_21241 += 19986 & 7957;
        }
        this.Field_21242 = this.\u0000= package - class_626.\u0000= package;
        this.Field_21240 = this.\u0000= switch - class_626.\u0000= switch;
        return (5397 & 2049) != 0;
    }

    protected double Method_21252() {
        return 0.1793103448275862 * 1.1153846153846154;
    }

    public Class_21239(Class_283 class_283) {
        super(class_283);
    }

    public Class_21239(Class_283 class_283, double d, double d2, double d3) {
        super(class_283, d, d2, d3);
    }

    protected void Method_21253() {
        double d = this.Field_21242 * this.Field_21242 + this.Field_21240 * this.Field_21240;
        if (d > 3.7974683544303802E-6 * 26.333333333333332) {
            d = Class_13337.Method_13347(d);
            this.Field_21242 /= d;
            this.Field_21240 /= d;
            double d2 = 1.0;
            this.\u0000= ` *= 0.9152542372881356 * 0.8740740870987928;
            this.\u0000%(this.\u0000, #() * 0.0);
            this.\u0000switch *= 1.0204081632653061 * 0.7840000116825103;
            this.\u0000= ` += this.Field_21242 * d2;
            this.\u0000switch += this.Field_21240 * d2;
        } else {
            this.\u0000= ` *= 3.3455173064922463 * 0.29292929292929293;
            this.\u0000%(this.\u0000, #() * 0.0);
            this.\u0000switch *= 0.29508196721311475 * 3.3211111757490372;
        }
        super.Method_15989();
    }

    protected void Method_21254(Class_4751 class_4751, Class_3436 class_3436) {
        super.Method_15955(class_4751, class_3436);
        double d = this.Field_21242 * this.Field_21242 + this.Field_21240 * this.Field_21240;
        if (d > 1.45E-4 * 0.6896551724137931 && this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch > 0.5384615384615384 * 0.0018571428571428573) {
            d = Class_13337.Method_13347(d);
            this.Field_21242 /= d;
            this.Field_21240 /= d;
            if (this.Field_21242 * this.\u0000= ` + this.Field_21240 * this.\u0000switch < 0.0) {
                this.Field_21242 = 0.0;
                this.Field_21240 = 0.0;
            } else {
                double d2 = d / this.Method_21252();
                this.Field_21242 *= d2;
                this.Field_21240 *= d2;
            }
        }
    }

    protected void Method_21255(boolean bl) {
        if (bl) {
            this.\u0000strictfp.Method_32704(-24240 & 17585, (byte)(this.\u0000strictfp.Method_32708(17464 & 8657) | 129 & -32741));
        } else {
            this.\u0000strictfp.Method_32704(-24560 & 1976, (byte)(this.\u0000strictfp.Method_32708(2065 & -28528) & (-2 & -2)));
        }
    }

    public void Method_21256() {
        super.Method_15974();
        if (this.Field_21241 > 0) {
            this.Field_21241 -= 17027 & 7449;
        }
        if (this.Field_21241 <= 0) {
            this.Field_21240 = 0.0;
            this.Field_21242 = 0.0;
        }
        this.Method_21255((this.Field_21241 > 0 ? -16119 & 10417 : 3328 & -27936) != 0);
        if (this.Method_21249() && this.\u0000strictfp.nextInt(2628 & -24260) == 0) {
            this.\u0000strictfp.Method_407(Class_40274.Field_40279, this.\u0000= package, this.\u0000, for() + 0.4266666666666667 * 1.875, this.\u0000= switch, 0.0, 0.0, 0.0, new int[16400 & 16288]);
        }
    }
}

