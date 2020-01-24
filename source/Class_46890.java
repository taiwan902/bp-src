/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_46890
extends Class_42218 {
    private float Field_46891;

    public void Method_46892(Class_22385 class_22385, Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.\u0000
         + f) / (float)this.\u0000, `;
        this.\u0000, ` = this.Field_46891 * (1.0f - f7 * f7 * (1.76f * 0.2840909f));
        super.Method_42244(class_22385, class_1061, f, f2, f3, f4, f5, f6);
    }

    public float Method_46893(float f) {
        float f2 = ((float)this.\u0000
         + f) / (float)this.\u0000, `;
        f2 = Class_13337.Method_13360(f2, 0.0f, 1.0f);
        float f3 = super.\u0000strictfp(f);
        return f3 * f2 + (1.0f - f2);
    }

    public int Method_46894(float f) {
        float f2 = ((float)this.\u0000
         + f) / (float)this.\u0000, `;
        f2 = Class_13337.Method_13360(f2, 0.0f, 1.0f);
        int n = super.Method_42259(f);
        int n2 = n & (3327 & -20225);
        int n3 = n >> (8344 & 4657) & (-28417 & 3839);
        if ((n2 += (int)(f2 * (43.965515f * 0.34117648f) * (1.2916666f * 12.387097f))) > (2800 & -32528)) {
            n2 = 1275 & 25072;
        }
        return n2 | n3 << (-8176 & 657);
    }

    protected Class_46890(Class_283 class_283, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_283, d, d2, d3, d4, d5, d6);
        this.\u0000= ` = this.\u0000= ` * (0.6559139784946236 * 0.015245901298571805) + d4;
        this.\u0000%(this.\u0000, #() * (0.1149999974295497 * 0.08695652173913043) + d5);
        this.\u0000switch = this.\u0000switch * (0.7916666666666666 * 0.01263157866503063) + d6;
        this.\u0000= package += (double)((this.\u0000strictfp.nextFloat() - this.\u0000strictfp.nextFloat()) * (0.7972973f * 0.062711865f));
        this.\u0000, `(this.\u0000, for() + (double)((this.\u0000strictfp.nextFloat() - this.\u0000strictfp.nextFloat()) * (0.046f * 1.0869565f)));
        this.\u0000= switch += (double)((this.\u0000strictfp.nextFloat() - this.\u0000strictfp.nextFloat()) * (0.7037037f * 0.07105263f));
        this.Field_46891 = this.\u0000, `;
        this.\u0000= int = 1.0f;
        this.\u0000= switch = 1.0f;
        this.\u0000= final = 1.0f;
        this.\u0000, ` = (int)(10.32258064516129 * 0.775 / (Math.random() * (3.3703703703703702 * 0.23736263736263738) + 0.21081081081081082 * 0.9487179487179487)) + (9478 & 20700);
        this.\u0000switch = -16365 & 5261;
        this.\u0000strictfp(9328 & 4144);
    }

    public void Method_46895() {
        this.\u0000= final(this.\u0000= package);
        this.\u0000strictfp(this.\u0000, for());
        this.\u0000
        (this.\u0000= switch);
        int n = this.\u0000;
        this.\u0000
         = n + (9289 & -30207);
        if (n >= this.\u0000, `) {
            this.\u0000break();
        }
        this.\u0000strictfp(this.\u0000= `, this.\u0000, #(), this.\u0000switch);
        this.\u0000= ` *= 0.6986301369863014 * 1.3741176163449007;
        this.\u0000%(this.\u0000, #() * (1.0716278830239938 * 0.8958333333333334));
        this.\u0000switch *= 0.3333333333333333 * 2.8799999356269836;
        if (this.\u0000super()) {
            this.\u0000= ` *= 0.7215384492507347 * 0.9701492537313433;
            this.\u0000switch *= 1.6346153846153846 * 0.42823528682484346;
        }
    }

    private void Method_46896() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

