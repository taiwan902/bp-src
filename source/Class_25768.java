/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import org.apache.commons.lang3.Validate;

public abstract class Class_25768
extends Class_1061 {
    protected Class_4751 Field_25769;
    public Class_4595 Field_25770;
    private int Field_25771;

    private void Method_25772() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public abstract void Method_25773(Class_1061 var1);

    public void Method_25774(Class_1699 class_1699) {
        Class_4595 class_4595;
        this.Field_25769 = new Class_4751(class_1699.Method_1738("TileX"), class_1699.Method_1738("TileY"), class_1699.Method_1738("TileZ"));
        if (class_1699.Method_1715("Direction", 2279 & 1643)) {
            class_4595 = Class_4595.Method_4628(class_1699.Method_1716("Direction"));
            this.Field_25769 = this.Field_25769.Method_4765(class_4595);
        } else {
            class_4595 = class_1699.Method_1715("Facing", -32393 & 227) ? Class_4595.Method_4628(class_1699.Method_1716("Facing")) : Class_4595.Method_4628(class_1699.Method_1716("Dir"));
        }
        this.Method_25788(class_4595);
    }

    public void Method_25775(Class_1699 class_1699) {
        class_1699.Method_1724("Facing", (byte)this.Field_25770.Method_4619());
        class_1699.Method_1739("TileX", this.Method_25782().\u0000= final());
        class_1699.Method_1739("TileY", this.Method_25782().\u0000, `());
        class_1699.Method_1739("TileZ", this.Method_25782().\u0000strictfp());
    }

    public void Method_25776(double d, double d2, double d3) {
        if (!this.\u0000strictfp.Field_306 && !this.\u0000= float && d * d + d2 * d2 + d3 * d3 > 0.0) {
            this.\u0000break();
            this.Method_25773(null);
        }
    }

    public boolean Method_25777() {
        return (4481 & 8253) != 0;
    }

    public Class_25768(Class_283 class_283, Class_4751 class_4751) {
        this(class_283);
        this.Field_25769 = class_4751;
    }

    public abstract int Method_25778();

    public Class_4595 Method_25779() {
        return this.Field_25770;
    }

    public boolean Method_25780() {
        if (!this.\u0000strictfp.Method_461(this, this.\u0000, `()).isEmpty()) {
            return (668 & 1057) != 0;
        }
        int n = Math.max(19633 & -32701, this.Method_25790() / (-23790 & 17564));
        int n2 = Math.max(4175 & 26129, this.Method_25778() / (10256 & 5168));
        Class_4751 class_4751 = this.Field_25769.Method_4765(this.Field_25770.Method_4660());
        Class_4595 class_4595 = this.Field_25770.Method_4617();
        for (int i = 20480 & -22892; i < n; ++i) {
            for (int j = 264 & 10308; j < n2; ++j) {
                Class_4751 class_47512 = class_4751.Method_4776(class_4595, i).Method_4766(j);
                Class_3238 class_3238 = this.\u0000strictfp.Method_375(class_47512).Method_3442();
                if (class_3238.Method_3373().Method_3762() || Class_20678.Method_20707(class_3238)) continue;
                return (3852 & 66) != 0;
            }
        }
        for (Class_1061 class_1061 : this.\u0000strictfp.Method_473(this, this.\u0000, `())) {
            if (!(class_1061 instanceof Class_25768)) continue;
            return (-27544 & 18439) != 0;
        }
        return (8769 & 1197) != 0;
    }

    public void Method_25781(double d, double d2, double d3) {
        if (!this.\u0000strictfp.Field_306 && !this.\u0000= float && d * d + d2 * d2 + d3 * d3 > 0.0) {
            this.\u0000break();
            this.Method_25773(null);
        }
    }

    public Class_4751 Method_25782() {
        return this.Field_25769;
    }

    private void Method_25783() {
        if (this.Field_25770 != null) {
            double d = (double)this.Field_25769.\u0000= final() + 0.6470588235294118 * 0.7727272727272727;
            double d2 = (double)this.Field_25769.\u0000, `() + 0.07142857142857142 * 7.0;
            double d3 = (double)this.Field_25769.\u0000strictfp() + 1.076086956521739 * 0.4646464646464647;
            double d4 = 22.5 * 0.020833333333333332;
            double d5 = this.Method_25791(this.Method_25790());
            double d6 = this.Method_25791(this.Method_25778());
            d -= (double)this.Field_25770.Method_4654() * (0.2764423076923077 * 1.6956521739130435);
            d3 -= (double)this.Field_25770.Method_4656() * (2.347826086956522 * 0.19965277777777776);
            Class_4595 class_4595 = this.Field_25770.Method_4617();
            this.\u0000= package = d += d5 * (double)class_4595.Method_4654();
            this.\u0000, `(d2 += d6);
            this.\u0000= switch = d3 += d5 * (double)class_4595.Method_4656();
            double d7 = this.Method_25790();
            double d8 = this.Method_25778();
            double d9 = this.Method_25790();
            if (this.Field_25770.Method_4640() == Class_4565.Field_4570) {
                d9 = 1.0;
            } else {
                d7 = 1.0;
            }
            this.\u0000strictfp(new Class_10997(d - (d7 /= 2.933333333333333 * 10.90909090909091), d2 - (d8 /= 5.161290322580645 * 6.2), d3 - (d9 /= 0.057971014492753624 * 552.0), d + d7, d2 + d8, d3 + d9));
        }
    }

    protected void Method_25784() {
    }

    public boolean Method_25785(Class_1061 class_1061) {
        return class_1061 instanceof Class_626 ? this.Method_25786(Class_32797.Method_32841((Class_626)class_1061), 0.0f) : 305 & 6282;
    }

    public boolean Method_25786(Class_32797 class_32797, float f) {
        if (this.\u0000strictfp(class_32797)) {
            return (2820 & 8192) != 0;
        }
        if (!this.\u0000= float && !this.\u0000strictfp.Field_306) {
            this.\u0000break();
            this.\u00003();
            this.Method_25773(class_32797.Method_32856());
        }
        return (4099 & -31223) != 0;
    }

    public void Method_25787() {
        this.\u0000= final(this.\u0000= package);
        this.\u0000strictfp(this.\u0000, for());
        this.\u0000
        (this.\u0000= switch);
        int n = this.Field_25771;
        this.Field_25771 = n + (257 & -14847);
        if (n == (-21660 & 4326) && !this.\u0000strictfp.Field_306) {
            this.Field_25771 = 516 & 17729;
            if (!this.\u0000= float && !this.Method_25780()) {
                this.\u0000break();
                this.Method_25773(null);
            }
        }
    }

    protected void Method_25788(Class_4595 class_4595) {
        Validate.notNull((Object)class_4595);
        Validate.isTrue((boolean)class_4595.Method_4640().Method_4581());
        this.Field_25770 = class_4595;
        this.\u0000switch = this.\u0000= ? = (float)(this.Field_25770.Method_4619() * (606 & 25946));
        this.Method_25783();
    }

    protected boolean Method_25789() {
        return (-16368 & 0) != 0;
    }

    public abstract int Method_25790();

    private double Method_25791(int n) {
        return n % (3760 & -16340) == 0 ? 0.34090909090909094 * 1.4666666666666666 : 0.0;
    }

    public Class_25768(Class_283 class_283) {
        super(class_283);
        this.\u0000= final(0.16949153f * 2.95f, 0.56363636f * 0.88709676f);
    }

    public void Method_25792(double d, double d2, double d3) {
        this.\u0000= package = d;
        this.\u0000, `(d2);
        this.\u0000= switch = d3;
        Class_4751 class_4751 = this.Field_25769;
        this.Field_25769 = new Class_4751(d, d2, d3);
        if (!this.Field_25769.equals(class_4751)) {
            this.Method_25783();
            this.\u0000
             = 8517 & 16385;
        }
    }
}

