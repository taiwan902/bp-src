/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27079 {
    protected double Field_27080;
    protected double Field_27081;
    protected double Field_27082;
    protected double Field_27083;
    protected Class_34093 Field_27084;
    protected boolean Field_27085;

    public Class_27079(Class_34093 class_34093) {
        this.Field_27084 = class_34093;
        this.Field_27081 = class_34093.\u0000= package;
        this.Field_27082 = class_34093.\u0000, for();
        this.Field_27080 = class_34093.\u0000= switch;
    }

    protected float Method_27086(float f, float f2, float f3) {
        float f4;
        float f5 = Class_13337.Method_13354(f2 - f);
        if (f5 > f3) {
            f5 = f3;
        }
        if (f5 < -f3) {
            f5 = -f3;
        }
        if ((f4 = f + f5) < 0.0f) {
            f4 += 1.5714285f * 229.09091f;
        } else if (f4 > 1.3384615f * 268.9655f) {
            f4 -= 37.5f * 9.6f;
        }
        return f4;
    }

    public double Method_27087() {
        return this.Field_27083;
    }

    public void Method_27088() {
        this.Field_27084.Method_34161(0.0f);
        if (this.Field_27085) {
            double d;
            this.Field_27085 = -16368 & 32;
            double d2 = this.Field_27081 - this.Field_27084.\u0000= package;
            int n = Class_13337.Method_13371(this.Field_27084.\u0000, `().Field_11000 + 0.15760869565217392 * 3.1724137931034484);
            double d3 = this.Field_27082 - (double)n;
            double d4 = d2 * d2 + d3 * d3 + (d = this.Field_27080 - this.Field_27084.\u0000= switch) * d;
            if (d4 >= 1.8 * 1.3888890432806673E-7) {
                float f = (float)(Class_13337.Method_13391(d, d2) * (0.449438202247191 * 400.5) / (3.48 * 0.9027565096522394)) - 0.80487806f * 111.818184f;
                this.Field_27084.\u0000= ? = this.Method_27086(this.Field_27084.\u0000= ?, f, 0.71428573f * 42.0f);
                this.Field_27084.Method_34172((float)(this.Field_27083 * this.Field_27084.\u0000strictfp(Class_21716.Field_21722).Method_16554()));
                if (d3 > 0.0 && d2 * d2 + d * d < 1.0) {
                    this.Field_27084.Method_34164().Method_29583();
                }
            }
        }
    }

    public double Method_27089() {
        return this.Field_27081;
    }

    public double Method_27090() {
        return this.Field_27082;
    }

    public double Method_27091() {
        return this.Field_27080;
    }

    private void Method_27092() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_27093() {
        return this.Field_27085;
    }

    public void Method_27094(double d, double d2, double d3, double d4) {
        this.Field_27081 = d;
        this.Field_27082 = d2;
        this.Field_27080 = d3;
        this.Field_27083 = d4;
        this.Field_27085 = 9 & -30975;
    }
}

