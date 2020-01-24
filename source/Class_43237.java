/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_43237
extends Class_42218 {
    private float Field_43238;
    private double Field_43239;
    private double Field_43240;
    private double Field_43241;

    public int Method_43242(float f) {
        int n = super.Method_42259(f);
        float f2 = (float)this.\u0000
         / (float)this.\u0000, `;
        f2 *= f2;
        f2 *= f2;
        int n2 = n & (1279 & -9985);
        int n3 = n >> (8500 & 4115) & (7167 & 16639);
        if ((n3 += (int)(f2 * (0.05f * 300.0f) * (15.020409f * 1.0652174f))) > (-32528 & 240)) {
            n3 = 1521 & -16144;
        }
        return n2 | n3 << (560 & -30568);
    }

    public void Method_43243() {
        this.\u0000= final(this.\u0000= package);
        this.\u0000strictfp(this.\u0000, for());
        this.\u0000
        (this.\u0000= switch);
        float f = (float)this.\u0000
         / (float)this.\u0000, `;
        f = 1.0f - f;
        float f2 = 1.0f - f;
        f2 *= f2;
        f2 *= f2;
        this.\u0000= package = this.Field_43240 + this.\u0000= ` * (double)f;
        this.\u0000, `(this.Field_43239 + this.\u0000, #() * (double)f - (double)(f2 * (1.0064516f * 1.1923077f)));
        this.\u0000= switch = this.Field_43241 + this.\u0000switch * (double)f;
        int n = this.\u0000;
        this.\u0000
         = n + (8473 & 1185);
        if (n >= this.\u0000, `) {
            this.\u0000break();
        }
    }

    public float Method_43244(float f) {
        float f2 = super.\u0000strictfp(f);
        float f3 = (float)this.\u0000
         / (float)this.\u0000, `;
        f3 *= f3;
        f3 *= f3;
        return f2 * (1.0f - f3) + f3;
    }

    protected Class_43237(Class_283 class_283, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_283, d, d2, d3, d4, d5, d6);
        this.\u0000= ` = d4;
        this.\u0000%(d5);
        this.\u0000switch = d6;
        this.Field_43240 = d;
        this.Field_43239 = d2;
        this.Field_43241 = d3;
        this.\u0000= package = d + d4;
        this.\u0000= final(this.\u0000= package);
        this.\u0000strictfp(this.\u0000, `(d2 + d5));
        this.\u0000= switch = d3 + d6;
        this.\u0000
        (this.\u0000= switch);
        float f = this.\u0000strictfp.nextFloat() * (2.4705882f * 0.24285716f) + 0.6530612f * 0.6125f;
        this.Field_43238 = this.\u0000, ` = this.\u0000strictfp.nextFloat() * (1.2285714f * 0.40697676f) + 0.09090909f * 2.2f;
        this.\u0000= switch = this.\u0000= int = 1.0f * f;
        this.\u0000= final = this.\u0000= int;
        this.\u0000= switch *= 0.27321428f * 3.2941177f;
        this.\u0000= final *= 1.016129f * 0.8857143f;
        this.\u0000, ` = (int)(Math.random() * (0.45 * 22.22222222222222)) + (24606 & 5214);
        this.\u0000switch = -14207 & 8229;
        this.\u0000strictfp((int)(Math.random() * (4.7272727272727275 * 5.5) + 1.0 + 0.06578947368421052 * 3404.8));
    }

    private void Method_43245() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

