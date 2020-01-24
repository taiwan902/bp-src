/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_43313
extends Class_42218 {
    private double Field_43314;
    private double Field_43315;
    private double Field_43316;
    private float Field_43317;

    private void Method_43318() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public float Method_43319(float f) {
        float f2 = super.\u0000strictfp(f);
        float f3 = (float)this.\u0000
         / (float)this.\u0000, `;
        f3 = f3 * f3 * f3 * f3;
        return f2 * (1.0f - f3) + f3;
    }

    protected Class_43313(Class_283 class_283, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_283, d, d2, d3, d4, d5, d6);
        this.\u0000= ` = d4;
        this.\u0000%(d5);
        this.\u0000switch = d6;
        this.Field_43314 = this.\u0000= package = d;
        this.Field_43316 = d2;
        this.\u0000, `(d2);
        this.Field_43315 = this.\u0000= switch = d3;
        float f = this.\u0000strictfp.nextFloat() * (0.39705884f * 1.5111111f) + 0.88f * 0.45454547f;
        this.Field_43317 = this.\u0000, ` = this.\u0000strictfp.nextFloat() * (0.016161617f * 12.375f) + 0.7946428f * 0.6292135f;
        this.\u0000= switch = this.\u0000= int = 1.0f * f;
        this.\u0000= final = this.\u0000= int;
        this.\u0000= switch *= 0.013333334f * 22.5f;
        this.\u0000= final *= 0.82840914f * 1.0864197f;
        this.\u0000, ` = (int)(Math.random() * (9.393939393939394 * 1.064516129032258)) + (16952 & 10348);
        this.\u0000switch = 19737 & 8193;
        this.\u0000strictfp((int)(Math.random() * (9.015873015873016 * 0.8873239436619719)));
    }

    public void Method_43320(Class_22385 class_22385, Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.\u0000
         + f) / (float)this.\u0000, `;
        f7 = 1.0f - f7;
        f7 *= f7;
        f7 = 1.0f - f7;
        this.\u0000, ` = this.Field_43317 * f7;
        super.Method_42244(class_22385, class_1061, f, f2, f3, f4, f5, f6);
    }

    public void Method_43321() {
        this.\u0000= final(this.\u0000= package);
        this.\u0000strictfp(this.\u0000, for());
        this.\u0000
        (this.\u0000= switch);
        float f = (float)this.\u0000
         / (float)this.\u0000, `;
        f = -f + f * f * 2.0f;
        f = 1.0f - f;
        this.\u0000= package = this.Field_43314 + this.\u0000= ` * (double)f;
        this.\u0000, `(this.Field_43316 + this.\u0000, #() * (double)f + (double)(1.0f - f));
        this.\u0000= switch = this.Field_43315 + this.\u0000switch * (double)f;
        int n = this.\u0000;
        this.\u0000
         = n + (16395 & 5797);
        if (n >= this.\u0000, `) {
            this.\u0000break();
        }
    }

    public int Method_43322(float f) {
        int n = super.Method_42259(f);
        float f2 = (float)this.\u0000
         / (float)this.\u0000, `;
        f2 *= f2;
        f2 *= f2;
        int n2 = n & (10751 & 1791);
        int n3 = n >> (561 & 18522) & (511 & 26879);
        if ((n3 += (int)(f2 * (45.9375f * 0.3265306f) * (1360.0f * 0.011764706f))) > (18928 & 252)) {
            n3 = 1012 & -16134;
        }
        return n2 | n3 << (4496 & -24515);
    }
}

