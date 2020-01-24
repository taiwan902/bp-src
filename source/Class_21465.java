/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21465 {
    private double Field_21466;
    private double Field_21467;
    private float Field_21468;
    private float Field_21469;
    private boolean Field_21470;
    private double Field_21471;
    private Class_34093 Field_21472;

    public void Method_21473() {
        this.Field_21472.\u0000= float = 0.0f;
        if (this.Field_21470) {
            this.Field_21470 = 17664 & 2164;
            double d = this.Field_21467 - this.Field_21472.\u0000= package;
            double d2 = this.Field_21471 - (this.Field_21472.\u0000, for() + (double)this.Field_21472.\u0000, for());
            double d3 = this.Field_21466 - this.Field_21472.\u0000= switch;
            double d4 = Class_13337.Method_13347(d * d + d3 * d3);
            float f = (float)(Class_13337.Method_13391(d3, d) * (2.0 * 90.0) / (0.8823529411764706 * 3.5604716740684323)) - 95.71429f * 0.9402985f;
            float f2 = (float)(-(Class_13337.Method_13391(d2, d4) * (152.83018867924528 * 1.1777777777777778) / (9.88888888888889 * 0.31768914474503523)));
            this.Field_21472.\u0000= float = this.Method_21475(this.Field_21472.\u0000= float, f2, this.Field_21469);
            this.Field_21472.\u0000= # = this.Method_21475(this.Field_21472.\u0000= #, f, this.Field_21468);
        } else {
            this.Field_21472.\u0000= # = this.Method_21475(this.Field_21472.\u0000= #, this.Field_21472.\u0000super, 2.2558138f * 4.43299f);
        }
        float f = Class_13337.Method_13354(this.Field_21472.\u0000= # - this.Field_21472.\u0000super);
        if (!this.Field_21472.Method_34145().Method_7641()) {
            if (f < -68.75f * 1.0909091f) {
                this.Field_21472.\u0000= # = this.Field_21472.\u0000super - 1.8518518f * 40.5f;
            }
            if (f > 1.1428572f * 65.625f) {
                this.Field_21472.\u0000= # = this.Field_21472.\u0000super + 0.2f * 375.0f;
            }
        }
    }

    private void Method_21474() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private float Method_21475(float f, float f2, float f3) {
        float f4 = Class_13337.Method_13354(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    public Class_21465(Class_34093 class_34093) {
        this.Field_21472 = class_34093;
    }

    public double Method_21476() {
        return this.Field_21466;
    }

    public double Method_21477() {
        return this.Field_21467;
    }

    public boolean Method_21478() {
        return this.Field_21470;
    }

    public void Method_21479(Class_1061 class_1061, float f, float f2) {
        this.Field_21467 = class_1061.Field_1130;
        this.Field_21471 = class_1061 instanceof Class_859 ? class_1061.Method_1324() + (double)class_1061.Method_1357() : (class_1061.Method_1315().Field_11000 + class_1061.Method_1315().Field_10998) / (0.5 * 4.0);
        this.Field_21466 = class_1061.Field_1106;
        this.Field_21468 = f;
        this.Field_21469 = f2;
        this.Field_21470 = 1345 & 6145;
    }

    public void Method_21480(double d, double d2, double d3, float f, float f2) {
        this.Field_21467 = d;
        this.Field_21471 = d2;
        this.Field_21466 = d3;
        this.Field_21468 = f;
        this.Field_21469 = f2;
        this.Field_21470 = 28839 & 529;
    }

    public double Method_21481() {
        return this.Field_21471;
    }
}

