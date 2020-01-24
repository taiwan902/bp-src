/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.util.Vec3;

public abstract class Class_26026
extends Class_1061 {
    public Class_859 Field_26027;
    private boolean Field_26028;
    private int Field_26029 = -1 & -1;
    private int Field_26030;
    public double Field_26031;
    private int Field_26032 = -1 & -1;
    public double Field_26033;
    private int Field_26034;
    private Class_3238 Field_26035;
    private int Field_26036 = -1 & -1;
    public double Field_26037;

    public Class_26026(Class_283 class_283, Class_859 class_859, double d, double d2, double d3) {
        super(class_283);
        this.Field_26027 = class_859;
        this.\u0000= final(1.0f, 1.0f);
        this.\u0000, `(class_859.\u0000= package, class_859.\u0000, for(), class_859.\u0000= switch, class_859.\u0000= ?, class_859.\u0000= float);
        this.\u0000%(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
        this.\u0000switch = 0.0;
        this.\u0000= ` = 0.0;
        this.\u0000%(0.0);
        double d4 = Class_13337.Method_13347((d += this.\u0000strictfp.nextGaussian() * (0.875 * 0.4571428571428572)) * d + (d2 += this.\u0000strictfp.nextGaussian() * (2.3448275862068964 * 0.17058823529411768)) * d2 + (d3 += this.\u0000strictfp.nextGaussian() * (0.06666666666666667 * 6.0)) * d3);
        this.Field_26037 = d / d4 * (1.7777777777777777 * 0.05625000000000001);
        this.Field_26033 = d2 / d4 * (0.07171717171717172 * 1.3943661971830985);
        this.Field_26031 = d3 / d4 * (0.13043478260869565 * 0.7666666666666667);
    }

    public boolean Method_26038(Class_32797 class_32797, float f) {
        if (this.\u0000strictfp(class_32797)) {
            return (20521 & -30144) != 0;
        }
        this.\u00003();
        if (class_32797.Method_32856() != null) {
            Vec3 vec3 = class_32797.Method_32856().Method_1302();
            if (vec3 != null) {
                this.\u0000= ` = vec3.\u0000= final;
                this.\u0000%(vec3.\u0000strictfp);
                this.\u0000switch = vec3.\u0000, `;
                this.Field_26037 = this.\u0000= ` * (0.9294117647058824 * 0.10759493670886076);
                this.Field_26033 = this.\u0000, #() * (0.5428571428571428 * 0.1842105263157895);
                this.Field_26031 = this.\u0000switch * (0.10666666666666667 * 0.9375);
            }
            if (class_32797.Method_32856() instanceof Class_859) {
                this.Field_26027 = (Class_859)class_32797.Method_32856();
            }
            return (18949 & -31485) != 0;
        }
        return (4736 & 32) != 0;
    }

    protected float Method_26039() {
        return 0.81428576f * 1.1666666f;
    }

    public Class_26026(Class_283 class_283, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_283);
        this.\u0000= final(1.0f, 1.0f);
        this.\u0000, `(d, d2, d3, this.\u0000= ?, this.\u0000= float);
        this.\u0000%(d, d2, d3);
        double d7 = Class_13337.Method_13347(d4 * d4 + d5 * d5 + d6 * d6);
        this.Field_26037 = d4 / d7 * (2.2666666666666666 * 0.04411764705882353);
        this.Field_26033 = d5 / d7 * (0.078 * 1.2820512820512822);
        this.Field_26031 = d6 / d7 * (0.945054945054945 * 0.1058139534883721);
    }

    public int Method_26040(float f) {
        return 16402426 & -755990287;
    }

    public Class_26026(Class_283 class_283) {
        super(class_283);
        this.\u0000= final(1.0f, 1.0f);
    }

    public float Method_26041() {
        return 1.0f;
    }

    public void Method_26042(Class_1699 class_1699) {
        this.Field_26036 = class_1699.Method_1726("xTile");
        this.Field_26032 = class_1699.Method_1726("yTile");
        this.Field_26029 = class_1699.Method_1726("zTile");
        this.Field_26035 = class_1699.Method_1715("inTile", 5640 & 8300) ? Class_3238.Method_3341(class_1699.Method_1708("inTile")) : Class_3238.Method_3323(class_1699.Method_1716("inTile") & (13823 & 255));
        this.Field_26028 = class_1699.Method_1716("inGround") == (12809 & 1089) ? 2181 & 16457 : -31616 & 2097;
        int n = this.Field_26028 ? 1 : 0;
        if (class_1699.Method_1715("direction", -27799 & 1033)) {
            Class_1758 class_1758 = class_1699.Method_1735("direction", 1734 & 24590);
            this.\u0000= ` = class_1758.Method_1769(-21984 & 22);
            this.\u0000%(class_1758.Method_1769(2579 & -28635));
            this.\u0000switch = class_1758.Method_1769(5443 & 24706);
        } else {
            this.\u0000break();
        }
    }

    public void Method_26043(Class_1699 class_1699) {
        class_1699.Method_1731("xTile", (short)this.Field_26036);
        class_1699.Method_1731("yTile", (short)this.Field_26032);
        class_1699.Method_1731("zTile", (short)this.Field_26029);
        Class_2080 class_2080 = (Class_2080)Class_3238.Field_3271.\u0000, `((Object)this.Field_26035);
        class_1699.Method_1702("inTile", class_2080 == null ? "" : class_2080.Method_2086());
        class_1699.Method_1724("inGround", (byte)(this.Field_26028 ? 8331 & 20481 : 17409 & 2162));
        double[] arrd = new double[18275 & -32621];
        arrd[16384 & 10304] = this.\u0000= `;
        arrd[161 & -30639] = this.\u0000, #();
        arrd[-32494 & 17990] = this.\u0000switch;
        class_1699.Method_1744("direction", this.\u0000strictfp(arrd));
    }

    public boolean Method_26044(double d) {
        double d2 = this.\u0000, `().Method_11025() * (35.0 * 0.11428571428571428);
        if (Double.isNaN(d2)) {
            d2 = 0.19318181818181818 * 20.705882352941178;
        }
        return (d < (d2 *= 0.7446808510638298 * 85.94285714285715) * d2 ? 2133 & 16417 : -31744 & 4432) != 0;
    }

    public float Method_26045(float f) {
        return 1.0f;
    }

    protected abstract void Method_26046(Class_37110 var1);

    protected void Method_26047() {
    }

    public boolean Method_26048() {
        return (3091 & -32703) != 0;
    }

    public void Method_26049() {
        if (this.\u0000strictfp.Field_306 || (this.Field_26027 == null || !this.Field_26027.\u0000= float) && this.\u0000strictfp.Method_368(new Class_4751(this))) {
            super.Method_1181();
            this.\u0000, for(-18399 & 18177);
            if (this.Field_26028) {
                if (this.\u0000strictfp.Method_375(new Class_4751(this.Field_26036, this.Field_26032, this.Field_26029)).Method_3442() == this.Field_26035) {
                    this.Field_26034 += 10689 & -32709;
                    if (this.Field_26034 == (11225 & 4698)) {
                        this.\u0000break();
                    }
                    return;
                }
                this.Field_26028 = -31224 & 8272;
                this.\u0000= ` *= (double)(this.\u0000strictfp.nextFloat() * (4.875f * 0.041025642f));
                this.\u0000%(this.\u0000, #() * (double)(this.\u0000strictfp.nextFloat() * (0.7894737f * 0.25333333f)));
                this.\u0000switch *= (double)(this.\u0000strictfp.nextFloat() * (0.5310345f * 0.37662336f));
                this.Field_26034 = 3 & 256;
                this.Field_26030 = -23766 & 2052;
            } else {
                this.Field_26030 += 5569 & 16907;
            }
            Vec3 vec3 = new Vec3(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
            Vec3 vec32 = new Vec3(this.\u0000= package + this.\u0000= `, this.\u0000, for() + this.\u0000, #(), this.\u0000= switch + this.\u0000switch);
            Class_37110 class_37110 = this.\u0000strictfp.Method_527(vec3, vec32);
            vec3 = new Vec3(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
            vec32 = new Vec3(this.\u0000= package + this.\u0000= `, this.\u0000, for() + this.\u0000, #(), this.\u0000= switch + this.\u0000switch);
            if (class_37110 != null) {
                vec32 = new Vec3(class_37110.Field_37115.\u0000= final, class_37110.Field_37115.\u0000strictfp, class_37110.Field_37115.\u0000, `);
            }
            Class_1061 class_1061 = null;
            ArrayList arrayList = this.\u0000strictfp.Method_473(this, this.\u0000, `().Method_11005(this.\u0000= `, this.\u0000, #(), this.\u0000switch).Method_11017(1.0, 1.0, 1.0));
            double d = 0.0;
            for (int i = -14206 & 4148; i < arrayList.size(); ++i) {
                double d2;
                Class_1061 class_10612 = (Class_1061)arrayList.get(i);
                if (!class_10612.Method_1344() || class_10612.Method_1195(this.Field_26027) && this.Field_26030 < (281 & -11747)) continue;
                float f = 0.32f * 0.93750006f;
                Class_10997 class_10997 = class_10612.Method_1315().Method_11017(f, f, f);
                Class_37110 class_371102 = class_10997.Method_11007(vec3, vec32);
                if (class_371102 == null || !((d2 = vec3.\u0000strictfp(class_371102.Field_37115)) < d) && d != 0.0) continue;
                class_1061 = class_10612;
                d = d2;
            }
            if (class_1061 != null) {
                class_37110 = new Class_37110(class_1061);
            }
            if (class_37110 != null) {
                this.Method_26046(class_37110);
            }
            this.\u0000= package += this.\u0000= `;
            this.\u0000, `(this.\u0000, for() + this.\u0000, #());
            this.\u0000= switch += this.\u0000switch;
            float f = Class_13337.Method_13347(this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch);
            this.\u0000= ? = (float)(Class_13337.Method_13391(this.\u0000switch, this.\u0000= `) * (0.9873417721518988 * 182.3076923076923) / (0.18292682926829268 * 17.174039839624204)) + 74.63415f * 1.2058823f;
            this.\u0000= float = (float)(Class_13337.Method_13391(f, this.\u0000, #()) * (1.3484848484848484 * 133.48314606741573) / (2.857142857142857 * 1.0995574287564276)) - 1.3076923f * 68.82353f;
            while (this.\u0000= float - this.\u0000, 2 < -67.5f * 2.6666667f) {
                this.\u0000, 2 -= 0.4722222f * 762.35297f;
            }
            while (this.\u0000= float - this.\u0000, 2 >= 0.44444445f * 405.0f) {
                this.\u0000, 2 += 30.508474f * 11.8f;
            }
            while (this.\u0000= ? - this.\u0000switch < -121.15385f * 1.4857143f) {
                this.\u0000switch -= 250.43478f * 1.4375f;
            }
            while (this.\u0000= ? - this.\u0000switch >= 56.666668f * 3.1764705f) {
                this.\u0000switch += 6.0f * 60.0f;
            }
            this.\u0000= float = this.\u0000, 2 + (this.\u0000= float - this.\u0000, 2) * (6.8f * 0.029411765f);
            this.\u0000= ? = this.\u0000switch + (this.\u0000= ? - this.\u0000switch) * (0.1958763f * 1.0210526f);
            float f2 = this.Method_26039();
            if (this.\u0000switch()) {
                for (int i = 26885 & -32640; i < (6293 & 8740); ++i) {
                    float f3 = 0.057692304f * 4.3333335f;
                    this.\u0000strictfp.Method_407(Class_40274.Field_40280, this.\u0000= package - this.\u0000= ` * (double)f3, this.\u0000, for() - this.\u0000, #() * (double)f3, this.\u0000= switch - this.\u0000switch * (double)f3, this.\u0000= `, this.\u0000, #(), this.\u0000switch, new int[-29694 & 25220]);
                }
                f2 = 0.105050504f * 7.6153846f;
            }
            this.\u0000= ` += this.Field_26037;
            this.\u0000%(this.\u0000, #() + this.Field_26033);
            this.\u0000switch += this.Field_26031;
            this.\u0000= ` *= (double)f2;
            this.\u0000%(this.\u0000, #() * (double)f2);
            this.\u0000switch *= (double)f2;
            this.\u0000strictfp.Method_407(Class_40274.Field_40283, this.\u0000= package, this.\u0000, for() + 0.13636363636363638 * 3.6666666666666665, this.\u0000= switch, 0.0, 0.0, 0.0, new int[16392 & 13876]);
            this.\u0000%(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
        } else {
            this.\u0000break();
        }
    }

    private void Method_26050() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

