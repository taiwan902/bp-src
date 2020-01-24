/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;
import net.minecraft.util.Vec3;

public abstract class Class_33284
extends Class_1061
implements Class_30859 {
    private int Field_33285 = -1 & -1;
    private String Field_33286;
    private Class_3238 Field_33287;
    private int Field_33288;
    private int Field_33289 = -1 & -1;
    public int Field_33290;
    private Class_859 Field_33291;
    private int Field_33292;
    protected boolean Field_33293;
    private int Field_33294 = -1 & -1;

    public Class_859 Method_33295() {
        if (this.Field_33291 == null && this.Field_33286 != null && this.Field_33286.length() > 0) {
            this.Field_33291 = this.\u0000strictfp.Method_489(this.Field_33286);
            if (this.Field_33291 == null && this.\u0000strictfp instanceof Class_2651) {
                try {
                    Class_1061 class_1061 = ((Class_2651)this.\u0000strictfp).Method_2675(UUID.fromString(this.Field_33286));
                    if (class_1061 instanceof Class_859) {
                        this.Field_33291 = (Class_859)class_1061;
                    }
                }
                catch (Throwable throwable) {
                    this.Field_33291 = null;
                }
            }
        }
        return this.Field_33291;
    }

    public void Method_33296(Class_1699 class_1699) {
        class_1699.Method_1731("xTile", (short)this.Field_33294);
        class_1699.Method_1731("yTile", (short)this.Field_33285);
        class_1699.Method_1731("zTile", (short)this.Field_33289);
        Class_2080 class_2080 = (Class_2080)Class_3238.Field_3271.\u0000, `((Object)this.Field_33287);
        class_1699.Method_1702("inTile", class_2080 == null ? "" : class_2080.Method_2086());
        class_1699.Method_1724("shake", (byte)this.Field_33290);
        class_1699.Method_1724("inGround", (byte)(this.Field_33293 ? 1169 & 6247 : -32736 & 3480));
        if ((this.Field_33286 == null || this.Field_33286.length() == 0) && this.Field_33291 instanceof Class_626) {
            this.Field_33286 = this.Field_33291.\u0000, `();
        }
        class_1699.Method_1702("ownerName", this.Field_33286 == null ? "" : this.Field_33286);
    }

    public boolean Method_33297(double d) {
        double d2 = this.\u0000, `().Method_11025() * (12.96551724137931 * 0.30851063829787234);
        if (Double.isNaN(d2)) {
            d2 = 3.652173913043478 * 1.0952380952380953;
        }
        return (d < (d2 *= 2.923076923076923 * 21.894736842105264) * d2 ? -14303 & 9 : 252 & 259) != 0;
    }

    public void Method_33298() {
        this.\u0000, for = this.\u0000= package;
        this.\u0000, 2 = this.\u0000, for();
        this.\u0000, # = this.\u0000= switch;
        super.Method_1181();
        if (this.Field_33290 > 0) {
            this.Field_33290 -= 12353 & -30203;
        }
        if (this.Field_33293) {
            if (this.\u0000strictfp.Method_375(new Class_4751(this.Field_33294, this.Field_33285, this.Field_33289)).Method_3442() == this.Field_33287) {
                this.Field_33288 += 4641 & 1217;
                if (this.Field_33288 == (-6987 & 1264)) {
                    this.\u0000break();
                }
                return;
            }
            this.Field_33293 = 20672 & 1801;
            this.\u0000= ` *= (double)(this.\u0000strictfp.nextFloat() * (0.175f * 1.1428572f));
            this.\u0000%(this.\u0000, #() * (double)(this.\u0000strictfp.nextFloat() * (0.9230769f * 0.21666667f)));
            this.\u0000switch *= (double)(this.\u0000strictfp.nextFloat() * (12.833333f * 0.015584416f));
            this.Field_33288 = 8256 & -11487;
            this.Field_33292 = 2 & 28672;
        } else {
            this.Field_33292 += 9249 & 4357;
        }
        Vec3 vec3 = new Vec3(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
        Vec3 vec32 = new Vec3(this.\u0000= package + this.\u0000= `, this.\u0000, for() + this.\u0000, #(), this.\u0000= switch + this.\u0000switch);
        Class_37110 class_37110 = this.\u0000strictfp.Method_527(vec3, vec32);
        vec3 = new Vec3(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
        vec32 = new Vec3(this.\u0000= package + this.\u0000= `, this.\u0000, for() + this.\u0000, #(), this.\u0000= switch + this.\u0000switch);
        if (class_37110 != null) {
            vec32 = new Vec3(class_37110.Field_37115.\u0000= final, class_37110.Field_37115.\u0000strictfp, class_37110.Field_37115.\u0000, `);
        }
        if (!this.\u0000strictfp.Field_306) {
            Class_1061 class_1061 = null;
            ArrayList arrayList = this.\u0000strictfp.Method_473(this, this.\u0000, `().Method_11005(this.\u0000= `, this.\u0000, #(), this.\u0000switch).Method_11017(1.0, 1.0, 1.0));
            double d = 0.0;
            Class_859 class_859 = this.Method_33295();
            for (int i = 24932 & -32767; i < arrayList.size(); ++i) {
                double d2;
                Class_1061 class_10612 = (Class_1061)arrayList.get(i);
                if (!class_10612.Method_1344() || class_10612 == class_859 && this.Field_33292 < (18063 & 2069)) continue;
                float f = 0.3f * 1.0f;
                Class_10997 class_10997 = class_10612.Method_1315().Method_11017(f, f, f);
                Class_37110 class_371102 = class_10997.Method_11007(vec3, vec32);
                if (class_371102 == null || !((d2 = vec3.\u0000strictfp(class_371102.Field_37115)) < d) && d != 0.0) continue;
                class_1061 = class_10612;
                d = d2;
            }
            if (class_1061 != null) {
                class_37110 = new Class_37110(class_1061);
            }
        }
        if (class_37110 != null) {
            if (class_37110.Field_37112 == Class_7192.Field_7193 && this.\u0000strictfp.Method_375(class_37110.Method_37118()).Method_3442() == Class_9265.Field_9291) {
                this.\u0000strictfp(class_37110.Method_37118());
            } else {
                this.Method_33299(class_37110);
            }
        }
        this.\u0000= package += this.\u0000= `;
        this.\u0000, `(this.\u0000, for() + this.\u0000, #());
        this.\u0000= switch += this.\u0000switch;
        float f = Class_13337.Method_13347(this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch);
        this.\u0000= ? = (float)(Class_13337.Method_13391(this.\u0000= `, this.\u0000switch) * (1.0704225352112675 * 168.1578947368421) / (0.7717391304347826 * 4.070796114510718));
        this.\u0000= float = (float)(Class_13337.Method_13391(this.\u0000, #(), f) * (229.0909090909091 * 0.7857142857142857) / (2.9919930034188504 * 1.05));
        while (this.\u0000= float - this.\u0000, 2 < 0.2f * -900.0f) {
            this.\u0000, 2 -= 2.0f * 180.0f;
        }
        while (this.\u0000= float - this.\u0000, 2 >= 141.42857f * 1.2727273f) {
            this.\u0000, 2 += 0.35f * 1028.5714f;
        }
        while (this.\u0000= ? - this.\u0000switch < -398.18182f * 0.4520548f) {
            this.\u0000switch -= 450.0f * 0.8f;
        }
        while (this.\u0000= ? - this.\u0000switch >= 1.5555556f * 115.71429f) {
            this.\u0000switch += 30.0f * 12.0f;
        }
        this.\u0000= float = this.\u0000, 2 + (this.\u0000= float - this.\u0000, 2) * (0.78494626f * 0.2547945f);
        this.\u0000= ? = this.\u0000switch + (this.\u0000= ? - this.\u0000switch) * (1.0f * 0.2f);
        float f2 = 1.21f * 0.8181818f;
        float f3 = this.Method_33306();
        if (this.\u0000switch()) {
            for (int i = 20672 & -22514; i < (18500 & 12965); ++i) {
                float f4 = 0.21428572f * 1.1666666f;
                this.\u0000strictfp.Method_407(Class_40274.Field_40280, this.\u0000= package - this.\u0000= ` * (double)f4, this.\u0000, for() - this.\u0000, #() * (double)f4, this.\u0000= switch - this.\u0000switch * (double)f4, this.\u0000= `, this.\u0000, #(), this.\u0000switch, new int[-16352 & 2436]);
            }
            f2 = 0.077108435f * 10.375f;
        }
        this.\u0000= ` *= (double)f2;
        this.\u0000%(this.\u0000, #() * (double)f2);
        this.\u0000switch *= (double)f2;
        this.\u0000%(this.\u0000, #() - (double)f3);
        this.\u0000%(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
    }

    public Class_33284(Class_283 class_283) {
        super(class_283);
        this.\u0000= final(0.395f * 0.6329114f, 1.3333334f * 0.1875f);
    }

    protected abstract void Method_33299(Class_37110 var1);

    public void Method_33300(double d, double d2, double d3) {
        this.\u0000= ` = d;
        this.\u0000%(d2);
        this.\u0000switch = d3;
        if (this.\u0000, 2 == 0.0f && this.\u0000switch == 0.0f) {
            float f = Class_13337.Method_13347(d * d + d3 * d3);
            this.\u0000switch = this.\u0000= ? = (float)(Class_13337.Method_13391(d, d3) * (480.0 * 0.375) / (3.862613918348106 * 0.8133333333333334));
            this.\u0000, 2 = this.\u0000= float = (float)(Class_13337.Method_13391(d2, f) * (355.0 * 0.5070422535211268) / (0.7894736842105263 * 3.979350694547071));
        }
    }

    protected float Method_33301() {
        return 0.0f;
    }

    protected void Method_33302() {
    }

    public Class_33284(Class_283 class_283, double d, double d2, double d3) {
        super(class_283);
        this.Field_33288 = -22012 & 2;
        this.\u0000= final(1.171875f * 0.21333334f, 0.24683546f * 1.0128205f);
        this.\u0000%(d, d2, d3);
    }

    private void Method_33303() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33304(double d, double d2, double d3, float f, float f2) {
        float f3 = Class_13337.Method_13347(d * d + d2 * d2 + d3 * d3);
        d /= (double)f3;
        d2 /= (double)f3;
        d3 /= (double)f3;
        d += this.\u0000strictfp.nextGaussian() * (0.04819277108433735 * 0.15562499652151018) * (double)f2;
        d2 += this.\u0000strictfp.nextGaussian() * (0.007338709513386411 * 1.021978021978022) * (double)f2;
        d3 += this.\u0000strictfp.nextGaussian() * (0.3333333333333333 * 0.02249999949708581) * (double)f2;
        this.\u0000= ` = d *= (double)f;
        this.\u0000%(d2 *= (double)f);
        this.\u0000switch = d3 *= (double)f;
        float f4 = Class_13337.Method_13347(d * d + d3 * d3);
        this.\u0000switch = this.\u0000= ? = (float)(Class_13337.Method_13391(d, d3) * (0.3389830508474576 * 531.0) / (3.247489035171472 * 0.967391304347826));
        this.\u0000, 2 = this.\u0000= float = (float)(Class_13337.Method_13391(d2, f4) * (0.8 * 225.0) / (0.7454626635636797 * 4.214285714285714));
        this.Field_33288 = -31936 & 13368;
    }

    protected float Method_33305() {
        return 4.178571f * 0.35897437f;
    }

    protected float Method_33306() {
        return 1.4375f * 0.020869564f;
    }

    public Class_33284(Class_283 class_283, Class_859 class_859) {
        super(class_283);
        this.Field_33291 = class_859;
        this.\u0000= final(0.9305555f * 0.26865673f, 0.72727275f * 0.34375f);
        this.\u0000, `(class_859.\u0000= package, class_859.\u0000, for() + (double)class_859.\u0000, for(), class_859.\u0000= switch, class_859.\u0000= ?, class_859.\u0000= float);
        this.\u0000= package -= (double)(Class_13337.Method_13350(this.\u0000= ? / (198.22786f * 0.90804595f) * (0.96511626f * 3.2551444f)) * (0.15666667f * 1.0212766f));
        this.\u0000, `(this.\u0000, for() - 0.8969072164948454 * 0.11149425453495705);
        this.\u0000= switch -= (double)(Class_13337.Method_13370(this.\u0000= ? / (223.84616f * 0.8041237f) * (12.356931f * 0.2542373f)) * (0.48f * 0.33333334f));
        this.\u0000%(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
        float f = 1.9767442f * 0.20235294f;
        this.\u0000= ` = -Class_13337.Method_13370(this.\u0000= ? / (76.0f * 2.368421f) * (0.9995977f * 3.142857f)) * Class_13337.Method_13350(this.\u0000= float / (166.56715f * 1.0806452f) * (0.41025642f * 7.6576324f)) * f;
        this.\u0000switch = Class_13337.Method_13350(this.\u0000= ? / (0.8333333f * 216.0f) * (1.453125f * 2.1619563f)) * Class_13337.Method_13350(this.\u0000= float / (0.7303371f * 246.46153f) * (2.2857144f * 1.3744467f)) * f;
        this.\u0000%((double)(-Class_13337.Method_13370((this.\u0000= float + this.Method_33301()) / (3.0f * 60.0f) * (3.8338082f * 0.8194444f)) * f));
        this.Method_33304(this.\u0000= `, this.\u0000, #(), this.\u0000switch, this.Method_33305(), 1.0f);
    }

    public void Method_33307(Class_1699 class_1699) {
        this.Field_33294 = class_1699.Method_1726("xTile");
        this.Field_33285 = class_1699.Method_1726("yTile");
        this.Field_33289 = class_1699.Method_1726("zTile");
        this.Field_33287 = class_1699.Method_1715("inTile", 26637 & 1048) ? Class_3238.Method_3341(class_1699.Method_1708("inTile")) : Class_3238.Method_3323(class_1699.Method_1716("inTile") & (2303 & -20225));
        this.Field_33290 = class_1699.Method_1716("shake") & (255 & -32513);
        this.Field_33293 = class_1699.Method_1716("inGround") == (-27711 & 8209) ? 9761 & 2441 : 772 & -12231;
        this.Field_33291 = null;
        this.Field_33286 = class_1699.Method_1708("ownerName");
        if (this.Field_33286 != null && this.Field_33286.length() == 0) {
            this.Field_33286 = null;
        }
        this.Field_33291 = this.Method_33295();
    }
}

