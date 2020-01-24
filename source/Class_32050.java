/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_32050
extends Class_1061 {
    private double Field_32051;
    private double Field_32052;
    private int Field_32053 = -1 & -1;
    private int Field_32054 = -1 & -1;
    private double Field_32055;
    private double Field_32056;
    private double Field_32057;
    private static final List Field_32058;
    private float Field_32059;
    private double Field_32060;
    private boolean Field_32061;
    private int Field_32062 = -1 & -1;
    private double Field_32063;
    private int Field_32064;
    private static final List Field_32065;
    private Class_3238 Field_32066;
    private double Field_32067;
    public int Field_32068;
    private int Field_32069;
    public Class_626 Field_32070;
    private int Field_32071;
    private static final List Field_32072;
    private int Field_32073;
    private int Field_32074;
    private int Field_32075;
    public Class_1061 Field_32076;

    public void Method_32077(double d, double d2, double d3, float f, float f2) {
        float f3 = Class_13337.Method_13347(d * d + d2 * d2 + d3 * d3);
        d /= (double)f3;
        d2 /= (double)f3;
        d3 /= (double)f3;
        d += this.\u0000strictfp.nextGaussian() * (0.3333333333333333 * 0.02249999949708581) * (double)f2;
        d2 += this.\u0000strictfp.nextGaussian() * (0.00444444434510337 * 1.6875) * (double)f2;
        d3 += this.\u0000strictfp.nextGaussian() * (29.0 * 2.5862068387454953E-4) * (double)f2;
        this.\u0000= ` = d *= (double)f;
        this.\u0000%(d2 *= (double)f);
        this.\u0000switch = d3 *= (double)f;
        float f4 = Class_13337.Method_13347(d * d + d3 * d3);
        this.\u0000switch = this.\u0000= ? = (float)(Class_13337.Method_13391(d, d3) * (16020.0 * 0.011235955056179775) / (3.7127913178788465 * 0.8461538461538461));
        this.\u0000, 2 = this.\u0000= float = (float)(Class_13337.Method_13391(d2, f4) * (60.0 * 3.0) / (3.4858767800105923 * 0.9012345679012346));
        this.Field_32074 = 20616 & 518;
    }

    public void Method_32078(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.Field_32067 = d;
        this.Field_32052 = d2;
        this.Field_32051 = d3;
        this.Field_32057 = f;
        this.Field_32056 = f2;
        this.Field_32075 = n;
        this.\u0000= ` = this.Field_32060;
        this.\u0000%(this.Field_32063);
        this.\u0000switch = this.Field_32055;
    }

    public boolean Method_32079(double d) {
        double d2 = this.\u0000, `().Method_11025() * (3.4117647058823533 * 1.1724137931034482);
        if (Double.isNaN(d2)) {
            d2 = 2.2 * 1.8181818181818181;
        }
        return (d < (d2 *= 3840.0 * 0.016666666666666666) * d2 ? 129 & 89 : 14339 & 1184) != 0;
    }

    private void Method_32080() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_32081() {
        super.Method_1166();
        if (this.Field_32070 != null) {
            this.Field_32070.Field_659 = null;
        }
    }

    public static List Method_32082() {
        return Field_32072;
    }

    private Class_23823 Method_32083() {
        float f = this.\u0000strictfp.Field_307.nextFloat();
        int n = Class_29642.Method_29664(this.Field_32070);
        int n2 = Class_29642.Method_29657(this.Field_32070);
        float f2 = 0.032352943f * 3.090909f - (float)n * (23.333334f * 0.0010714285f) - (float)n2 * (0.82857144f * 0.0120689655f);
        float f3 = 0.47692308f * 0.104838714f + (float)n * (0.0029166667f * 3.4285715f) - (float)n2 * (2.48f * 0.004032258f);
        f2 = Class_13337.Method_13360(f2, 0.0f, 1.0f);
        f3 = Class_13337.Method_13360(f3, 0.0f, 1.0f);
        if (f < f2) {
            this.Field_32070.Method_750(Class_19863.Field_19866);
            return ((Class_27162)Class_27139.Method_27144(this.\u0000strictfp, Field_32058)).Method_27169(this.\u0000strictfp);
        }
        if ((f -= f2) < f3) {
            this.Field_32070.Method_750(Class_19863.Field_19875);
            return ((Class_27162)Class_27139.Method_27144(this.\u0000strictfp, Field_32065)).Method_27169(this.\u0000strictfp);
        }
        float f4 = f - f3;
        this.Field_32070.Method_750(Class_19863.Field_19895);
        return ((Class_27162)Class_27139.Method_27144(this.\u0000strictfp, Field_32072)).Method_27169(this.\u0000strictfp);
    }

    public void Method_32084() {
        super.Method_1181();
        if (this.Field_32075 > 0) {
            double d = this.\u0000= package + (this.Field_32067 - this.\u0000= package) / (double)this.Field_32075;
            double d2 = this.\u0000, for() + (this.Field_32052 - this.\u0000, for()) / (double)this.Field_32075;
            double d3 = this.\u0000= switch + (this.Field_32051 - this.\u0000= switch) / (double)this.Field_32075;
            double d4 = Class_13337.Method_13368(this.Field_32057 - (double)this.\u0000= ?);
            this.\u0000= ? = (float)((double)this.\u0000= ? + d4 / (double)this.Field_32075);
            this.\u0000= float = (float)((double)this.\u0000= float + (this.Field_32056 - (double)this.\u0000= float) / (double)this.Field_32075);
            this.Field_32075 -= 3361 & -15787;
            this.\u0000%(d, d2, d3);
            this.\u0000strictfp(this.\u0000= ?, this.\u0000= float);
        } else {
            Object object;
            if (!this.\u0000strictfp.Field_306) {
                object = this.Field_32070.Method_792();
                if (this.Field_32070.\u0000= float || !this.Field_32070.\u0000volatile() || object == null || ((Class_23823)object).Method_23844() != Class_10527.Field_10609 || this.\u0000strictfp((Class_1061)this.Field_32070) > 1.9166666666666667 * 534.2608695652174) {
                    this.Method_32081();
                    this.Field_32070.Field_659 = null;
                    return;
                }
                if (this.Field_32076 != null) {
                    if (!this.Field_32076.Field_1110) {
                        this.\u0000= package = this.Field_32076.Field_1130;
                        double d = this.Field_32076.Method_1287();
                        this.\u0000, `(this.Field_32076.Method_1315().Field_11000 + d * (0.8098765432098766 * 0.9878048780487805));
                        this.\u0000= switch = this.Field_32076.Field_1106;
                        return;
                    }
                    this.Field_32076 = null;
                }
            }
            if (this.Field_32068 > 0) {
                this.Field_32068 -= 33 & -31231;
            }
            if (this.Field_32061) {
                if (this.\u0000strictfp.Method_375(new Class_4751(this.Field_32054, this.Field_32053, this.Field_32062)).Method_3442() == this.Field_32066) {
                    this.Field_32074 += 8193 & 16907;
                    if (this.Field_32074 == (1457 & -31564)) {
                        this.Method_32081();
                    }
                    return;
                }
                this.Field_32061 = 280 & 1696;
                this.\u0000= ` *= (double)(this.\u0000strictfp.nextFloat() * (0.2742857f * 0.7291667f));
                this.\u0000%(this.\u0000, #() * (double)(this.\u0000strictfp.nextFloat() * (0.23f * 0.8695652f)));
                this.\u0000switch *= (double)(this.\u0000strictfp.nextFloat() * (0.7684211f * 0.26027396f));
                this.Field_32074 = -20432 & 16384;
                this.Field_32069 = 10533 & 1552;
            } else {
                this.Field_32069 += 8273 & 21153;
            }
            object = new Vec3(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
            Vec3 vec3 = new Vec3(this.\u0000= package + this.\u0000= `, this.\u0000, for() + this.\u0000, #(), this.\u0000= switch + this.\u0000switch);
            Class_37110 class_37110 = this.\u0000strictfp.Method_527((Vec3)object, vec3);
            object = new Vec3(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
            vec3 = new Vec3(this.\u0000= package + this.\u0000= `, this.\u0000, for() + this.\u0000, #(), this.\u0000= switch + this.\u0000switch);
            if (class_37110 != null) {
                vec3 = new Vec3(class_37110.Field_37115.\u0000= final, class_37110.Field_37115.\u0000strictfp, class_37110.Field_37115.\u0000, `);
            }
            Class_1061 class_1061 = null;
            ArrayList arrayList = this.\u0000strictfp.Method_473(this, this.\u0000, `().Method_11005(this.\u0000= `, this.\u0000, #(), this.\u0000switch).Method_11017(1.0, 1.0, 1.0));
            double d = 0.0;
            for (int i = 10326 & 21641; i < arrayList.size(); ++i) {
                double d5;
                Class_1061 class_10612 = (Class_1061)arrayList.get(i);
                if (!class_10612.Method_1344() || class_10612 == this.Field_32070 && this.Field_32069 < (5 & 16583)) continue;
                float f = 0.20156251f * 1.4883721f;
                Class_10997 class_10997 = class_10612.Method_1315().Method_11017(f, f, f);
                Class_37110 class_371102 = class_10997.Method_11007((Vec3)object, vec3);
                if (class_371102 == null || !((d5 = ((Vec3)object).\u0000strictfp(class_371102.Field_37115)) < d) && d != 0.0) continue;
                class_1061 = class_10612;
                d = d5;
            }
            if (class_1061 != null) {
                class_37110 = new Class_37110(class_1061);
            }
            if (class_37110 != null) {
                if (class_37110.Field_37114 != null) {
                    if (class_37110.Field_37114.Method_1340(Class_32797.Method_32827(this, this.Field_32070), 0.0f)) {
                        this.Field_32076 = class_37110.Field_37114;
                    }
                } else {
                    this.Field_32061 = 8481 & -26099;
                }
            }
            if (!this.Field_32061) {
                double d6;
                this.\u0000strictfp(this.\u0000= `, this.\u0000, #(), this.\u0000switch);
                float f = Class_13337.Method_13347(this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch);
                this.\u0000= ? = (float)(Class_13337.Method_13391(this.\u0000= `, this.\u0000switch) * (0.7457627118644068 * 241.36363636363637) / (0.4383561643835616 * 7.166758241001716));
                this.\u0000= float = (float)(Class_13337.Method_13391(this.\u0000, #(), f) * (6300.0 * 0.02857142857142857) / (31.066860685499066 * 0.10112359550561797));
                while (this.\u0000= float - this.\u0000, 2 < -281.73914f * 0.6388889f) {
                    this.\u0000, 2 -= 0.8153846f * 441.50943f;
                }
                while (this.\u0000= float - this.\u0000, 2 >= 2.032258f * 88.57143f) {
                    this.\u0000, 2 += 1.7659575f * 203.85542f;
                }
                while (this.\u0000= ? - this.\u0000switch < 0.75609756f * -238.06451f) {
                    this.\u0000switch -= 0.9125f * 394.52054f;
                }
                while (this.\u0000= ? - this.\u0000switch >= 0.31578946f * 570.0f) {
                    this.\u0000switch += 178.14433f * 2.0208333f;
                }
                this.\u0000= float = this.\u0000, 2 + (this.\u0000= float - this.\u0000, 2) * (0.3794872f * 0.527027f);
                this.\u0000= ? = this.\u0000switch + (this.\u0000= ? - this.\u0000switch) * (91.0f * 0.0021978023f);
                float f2 = 0.28411764f * 3.2380953f;
                if (this.\u0000super() || this.\u0000= catch) {
                    f2 = 1.425f * 0.3508772f;
                }
                int n = 17741 & 2085;
                double d7 = 0.0;
                for (int i = -23272 & 17028; i < n; ++i) {
                    Class_10997 class_10997 = this.\u0000, `();
                    double d8 = class_10997.Field_10998 - class_10997.Field_11000;
                    double d9 = class_10997.Field_11000 + d8 * (double)i / (double)n;
                    d6 = class_10997.Field_11000 + d8 * (double)(i + (4169 & 2213)) / (double)n;
                    Class_10997 class_109972 = new Class_10997(class_10997.Field_10999, d9, class_10997.Field_11001, class_10997.Field_11002, d6, class_10997.Field_11003);
                    if (!this.\u0000strictfp.Method_546(class_109972, Class_3713.Field_3734)) continue;
                    d7 += 1.0 / (double)n;
                }
                if (!this.\u0000strictfp.Field_306 && d7 > 0.0) {
                    Class_2651 class_2651 = (Class_2651)this.\u0000strictfp;
                    int n2 = 10515 & -28627;
                    Class_4751 class_4751 = new Class_4751(this).Method_4769();
                    if (this.\u0000strictfp.nextFloat() < 1.6097561f * 0.15530303f && this.\u0000strictfp.Method_496(class_4751)) {
                        n2 = 17411 & 12322;
                    }
                    if (this.\u0000strictfp.nextFloat() < 0.026595745f * 18.8f && !this.\u0000strictfp.Method_398(class_4751)) {
                        --n2;
                    }
                    if (this.Field_32071 > 0) {
                        this.Field_32071 -= -32767 & 12289;
                        if (this.Field_32071 <= 0) {
                            this.Field_32064 = 2056 & 10114;
                            this.Field_32073 = 274 & 224;
                        }
                    } else if (this.Field_32073 > 0) {
                        this.Field_32073 -= n2;
                        if (this.Field_32073 <= 0) {
                            this.\u0000%(this.\u0000, #() - 0.18076923346290222 * 1.1063829787234043);
                            this.\u0000strictfp("random.splash", 0.057971016f * 4.3125f, 1.0f + (this.\u0000strictfp.nextFloat() - this.\u0000strictfp.nextFloat()) * (0.61935484f * 0.6458333f));
                            float f3 = Class_13337.Method_13371(this.\u0000, `().Field_11000);
                            class_2651.Method_2698(Class_40274.Field_40280, this.\u0000= package, f3 + 1.0f, this.\u0000= switch, (int)(1.0f + this.\u0000= int() * (0.4861111f * 41.142857f)), this.\u0000= int(), 0.0, this.\u0000= int(), 0.8367346938775511 * 0.2390243938056434, new int[2240 & 28672]);
                            class_2651.Method_2698(Class_40274.Field_40277, this.\u0000= package, f3 + 1.0f, this.\u0000= switch, (int)(1.0f + this.\u0000= int() * (35.833332f * 0.55813956f)), this.\u0000= int(), 0.0, this.\u0000= int(), 0.12203390012353153 * 1.6388888888888888, new int[64 & -28152]);
                            this.Field_32071 = Class_13337.Method_13379(this.\u0000strictfp, 1134 & 11, 17055 & 2174);
                        } else {
                            double d10;
                            this.Field_32059 = (float)((double)this.Field_32059 + this.\u0000strictfp.nextGaussian() * (0.42105263157894735 * 9.5));
                            float f4 = this.Field_32059 * (0.90909094f * 0.01919862f);
                            float f5 = Class_13337.Method_13370(f4);
                            float f6 = Class_13337.Method_13350(f4);
                            d6 = this.\u0000= package + (double)(f5 * (float)this.Field_32073 * (1.8333334f * 0.054545455f));
                            double d11 = (float)Class_13337.Method_13371(this.\u0000, `().Field_11000) + 1.0f;
                            Class_3238 class_3238 = class_2651.\u0000strictfp(new Class_4751((int)d6, (int)d11 - (6705 & 1031), (int)(d10 = this.\u0000= switch + (double)(f6 * (float)this.Field_32073 * (0.004761905f * 21.0f))))).Method_3442();
                            if (class_3238 == Class_9265.Field_9286 || class_3238 == Class_9265.Field_9281) {
                                if (this.\u0000strictfp.nextFloat() < 1.0f * 0.15f) {
                                    class_2651.Method_2698(Class_40274.Field_40280, d6, d11 - 1.8076923076923077 * 0.055319149760489766, d10, 16401 & -24575, f5, 0.22448979591836735 * 0.4454545454545455, f6, 0.0, new int[25984 & -28644]);
                                }
                                float f7 = f5 * (0.30769232f * 0.13f);
                                float f8 = f6 * (1.1639345f * 0.034366194f);
                                class_2651.Method_2698(Class_40274.Field_40277, d6, d11, d10, 12544 & -16335, f8, 2.782608695652174 * 0.00359375, -f7, 1.0, new int[4 & 8241]);
                                class_2651.Method_2698(Class_40274.Field_40277, d6, d11, d10, -31487 & 8292, -f8, 1.425 * 0.007017543859649123, f7, 1.0, new int[3338 & 160]);
                            }
                        }
                    } else if (this.Field_32064 > 0) {
                        this.Field_32064 -= n2;
                        float f9 = 0.00505618f * 29.666666f;
                        if (this.Field_32064 < (-30636 & 21175)) {
                            f9 = (float)((double)f9 + (double)((148 & -13793) - this.Field_32064) * (0.21000000000000002 * 0.23809523809523808));
                        } else if (this.Field_32064 < (-21974 & 4136)) {
                            f9 = (float)((double)f9 + (double)((18603 & -32452) - this.Field_32064) * (0.07285714285714286 * 0.27450980392156865));
                        } else if (this.Field_32064 < (-28292 & 24638)) {
                            f9 = (float)((double)f9 + (double)((9148 & -32706) - this.Field_32064) * (0.007395833333333333 * 1.352112676056338));
                        }
                        if (this.\u0000strictfp.nextFloat() < f9) {
                            double d12;
                            double d13;
                            float f10 = Class_13337.Method_13392(this.\u0000strictfp, 0.0f, 744.0f * 0.48387095f) * (12.2f * 0.0014305977f);
                            float f11 = Class_13337.Method_13392(this.\u0000strictfp, 44.35484f * 0.56363636f, 0.4857143f * 123.52941f);
                            d6 = this.\u0000= package + (double)(Class_13337.Method_13370(f10) * f11 * (0.88461536f * 0.11304348f));
                            Class_3238 class_3238 = class_2651.\u0000strictfp(new Class_4751((int)d6, (int)(d12 = (double)((float)Class_13337.Method_13371(this.\u0000, `().Field_11000) + 1.0f)) - (573 & 29761), (int)(d13 = this.\u0000= switch + (double)(Class_13337.Method_13350(f10) * f11 * (3.5769231f * 0.027956989f))))).Method_3442();
                            if (class_3238 == Class_9265.Field_9286 || class_3238 == Class_9265.Field_9281) {
                                class_2651.Method_2698(Class_40274.Field_40313, d6, d12, d13, (5250 & 2102) + this.\u0000strictfp.nextInt(-20950 & 4098), 3.0 * 0.033333333830038704, 0.0, 0.8901098901098901 * 0.11234568068642675, 0.0, new int[-24511 & 22800]);
                            }
                        }
                        if (this.Field_32064 <= 0) {
                            this.Field_32059 = Class_13337.Method_13392(this.\u0000strictfp, 0.0f, 0.70731705f * 508.96555f);
                            this.Field_32073 = Class_13337.Method_13379(this.\u0000strictfp, 724 & -7148, -27528 & 339);
                        }
                    } else {
                        this.Field_32064 = Class_13337.Method_13379(this.\u0000strictfp, 16484 & -23443, 29573 & 964);
                        this.Field_32064 -= Class_29642.Method_29657(this.Field_32070) * (-24516 & 1556) * (28741 & 2077);
                    }
                    if (this.Field_32071 > 0) {
                        this.\u0000%(this.\u0000, #() - (double)(this.\u0000strictfp.nextFloat() * this.\u0000strictfp.nextFloat() * this.\u0000strictfp.nextFloat()) * (1.7450980392156863 * 0.11460674157303372));
                    }
                }
                double d14 = d7 * (0.47368421052631576 * 4.222222222222222) - 1.0;
                this.\u0000%(this.\u0000, #() + 0.06347825945071553 * 0.6301369863013698 * d14);
                if (d7 > 0.0) {
                    f2 = (float)((double)f2 * (35.1 * 0.02564102564102564));
                    this.\u0000%(this.\u0000, #() * (0.3829787234042553 * 2.088888888888889));
                }
                this.\u0000= ` *= (double)f2;
                this.\u0000%(this.\u0000, #() * (double)f2);
                this.\u0000switch *= (double)f2;
                this.\u0000%(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
            }
        }
    }

    static {
        Class_27162[] arrclass_27162 = new Class_27162[4363 & 523];
        arrclass_27162[31433 & -32748] = new Class_27162(new Class_23823(Class_10527.Field_10640), 874 & 20618).Method_27167(0.99642855f * 0.9032258f);
        arrclass_27162[139 & -32735] = new Class_27162(new Class_23823(Class_10527.Field_10620), -31926 & 154);
        arrclass_27162[-16349 & 6] = new Class_27162(new Class_23823(Class_10527.Field_10603), 1451 & 10);
        arrclass_27162[263 & -3453] = new Class_27162(new Class_23823(Class_10527.Field_10687), 17418 & 762);
        arrclass_27162[25686 & 2564] = new Class_27162(new Class_23823(Class_10527.Field_10624), 37 & 19015);
        arrclass_27162[-30073 & 20805] = new Class_27162(new Class_23823(Class_10527.Field_10609), 19011 & 290).Method_27167(0.097297296f * 9.25f);
        arrclass_27162[-27641 & 16454] = new Class_27162(new Class_23823(Class_10527.Field_10559), 17578 & 2378);
        arrclass_27162[-32489 & 12367] = new Class_27162(new Class_23823(Class_10527.Field_10616), -22515 & 17157);
        arrclass_27162[2217 & -7862] = new Class_27162(new Class_23823(Class_10527.Field_10623, -32086 & 26650, Class_5393.Field_5404.Method_5436()), 13859 & 2057);
        arrclass_27162[17229 & -25445] = new Class_27162(new Class_23823(Class_9265.Field_9266), 27534 & 4203);
        arrclass_27162[16490 & 14] = new Class_27162(new Class_23823(Class_10527.Field_10574), 12379 & 2058);
        Field_32058 = Arrays.asList(arrclass_27162);
        Class_27162[] arrclass_271622 = new Class_27162[8294 & 4110];
        arrclass_271622[8712 & 16449] = new Class_27162(new Class_23823(Class_9265.Field_9303), 6205 & 8641);
        arrclass_271622[2561 & -24505] = new Class_27162(new Class_23823(Class_10527.Field_10668), 21505 & -22047);
        arrclass_271622[-16182 & 6] = new Class_27162(new Class_23823(Class_10527.Field_10594), 1281 & 24777);
        arrclass_271622[16423 & 6147] = new Class_27162(new Class_23823(Class_10527.Field_10690), -30197 & 385).Method_27167(1.0632912f * 0.23511903f).Method_27168();
        arrclass_271622[20 & 3108] = new Class_27162(new Class_23823(Class_10527.Field_10609), -23931 & 2057).Method_27167(0.22f * 1.1363636f).Method_27168();
        arrclass_271622[5261 & 261] = new Class_27162(new Class_23823(Class_10527.Field_10629), 16393 & -25087).Method_27168();
        Field_32065 = Arrays.asList(arrclass_271622);
        Class_27162[] arrclass_271623 = new Class_27162[2372 & -19932];
        arrclass_271623[16896 & 4128] = new Class_27162(new Class_23823(Class_10527.Field_10689, 2177 & 517, Class_18525.Field_18528.Method_18548()), 2620 & -24514);
        arrclass_271623[-30459 & 8369] = new Class_27162(new Class_23823(Class_10527.Field_10689, -32471 & 4115, Class_18525.Field_18526.Method_18548()), 2073 & 5787);
        arrclass_271623[130 & 2114] = new Class_27162(new Class_23823(Class_10527.Field_10689, 5185 & -15871, Class_18525.Field_18533.Method_18548()), 22534 & 8362);
        arrclass_271623[-16345 & 15427] = new Class_27162(new Class_23823(Class_10527.Field_10689, 16947 & 3329, Class_18525.Field_18527.Method_18548()), 12495 & -28915);
        Field_32072 = Arrays.asList(arrclass_271623);
    }

    public void Method_32085(double d, double d2, double d3) {
        this.Field_32060 = this.\u0000= ` = d;
        this.Field_32063 = d2;
        this.Field_32055 = this.\u0000switch = d3;
        this.\u0000%(d2);
    }

    public Class_32050(Class_283 class_283, Class_626 class_626) {
        super(class_283);
        this.\u0000abstract = -32759 & 9763;
        this.Field_32070 = class_626;
        this.Field_32070.Field_659 = this;
        this.\u0000= final(1.0f * 0.25f, 0.14814815f * 1.6875f);
        this.\u0000, `(class_626.\u0000= package, class_626.\u0000, for() + (double)class_626.Method_837(), class_626.\u0000= switch, class_626.\u0000= ?, class_626.\u0000= float);
        this.\u0000= package -= (double)(Class_13337.Method_13350(this.\u0000= ? / (207.16982f * 0.86885244f) * (1.3404255f * 2.343728f)) * (0.3895652f * 0.4107143f));
        this.\u0000, `(this.\u0000, for() - 0.06779661016949153 * 1.4750000219792128);
        this.\u0000= switch -= (double)(Class_13337.Method_13370(this.\u0000= ? / (112.799995f * 1.5957447f) * (7.5f * 0.41887903f)) * (11.166667f * 0.014328358f));
        this.\u0000%(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
        float f = 0.484375f * 0.82580644f;
        this.\u0000= ` = -Class_13337.Method_13370(this.\u0000= ? / (403.78378f * 0.44578314f) * (3.5247138f * 0.8913044f)) * Class_13337.Method_13350(this.\u0000= float / (0.42105263f * 427.5f) * (0.8513514f * 3.6901248f)) * f;
        this.\u0000switch = Class_13337.Method_13350(this.\u0000= ? / (70.10526f * 2.5675676f) * (0.5471698f * 5.741532f)) * Class_13337.Method_13350(this.\u0000= float / (102.58064f * 1.754717f) * (0.98174775f * 3.2f)) * f;
        this.\u0000%((double)(-Class_13337.Method_13370(this.\u0000= float / (0.52307695f * 344.1176f) * (1.0625f * 2.956793f)) * f));
        this.Method_32077(this.\u0000= `, this.\u0000, #(), this.\u0000switch, 0.33333334f * 4.5f, 1.0f);
    }

    public Class_32050(Class_283 class_283, double d, double d2, double d3, Class_626 class_626) {
        this(class_283);
        this.\u0000%(d, d2, d3);
        this.\u0000abstract = 37 & 3009;
        this.Field_32070 = class_626;
        class_626.Field_659 = this;
    }

    public void Method_32086(Class_1699 class_1699) {
        this.Field_32054 = class_1699.Method_1726("xTile");
        this.Field_32053 = class_1699.Method_1726("yTile");
        this.Field_32062 = class_1699.Method_1726("zTile");
        this.Field_32066 = class_1699.Method_1715("inTile", 17551 & -24312) ? Class_3238.Method_3341(class_1699.Method_1708("inTile")) : Class_3238.Method_3323(class_1699.Method_1716("inTile") & (-32513 & 14335));
        this.Field_32068 = class_1699.Method_1716("shake") & (4351 & -24321);
        this.Field_32061 = class_1699.Method_1716("inGround") == (1927 & 20593) ? -31631 & 24705 : 9282 & -32639;
    }

    protected void Method_32087() {
    }

    public Class_32050(Class_283 class_283) {
        super(class_283);
        this.\u0000= final(2.0769231f * 0.120370366f, 0.74626863f * 0.335f);
        this.\u0000abstract = 1025 & 24625;
    }

    public void Method_32088(Class_1699 class_1699) {
        class_1699.Method_1731("xTile", (short)this.Field_32054);
        class_1699.Method_1731("yTile", (short)this.Field_32053);
        class_1699.Method_1731("zTile", (short)this.Field_32062);
        Class_2080 class_2080 = (Class_2080)Class_3238.Field_3271.\u0000, `((Object)this.Field_32066);
        class_1699.Method_1702("inTile", class_2080 == null ? "" : class_2080.Method_2086());
        class_1699.Method_1724("shake", (byte)this.Field_32068);
        class_1699.Method_1724("inGround", (byte)(this.Field_32061 ? 4897 & -22515 : 14372 & 17152));
    }

    public int Method_32089() {
        if (this.\u0000strictfp.Field_306) {
            return 1028 & -3495;
        }
        int n = 18828 & -20447;
        if (this.Field_32076 != null) {
            double d = this.Field_32070.\u0000= package - this.\u0000= package;
            double d2 = this.Field_32070.\u0000, for() - this.\u0000, for();
            double d3 = this.Field_32070.\u0000= switch - this.\u0000= switch;
            double d4 = Class_13337.Method_13347(d * d + d2 * d2 + d3 * d3);
            double d5 = 1.7804878048780488 * 0.05616438356164384;
            this.Field_32076.Field_1071 += d * d5;
            this.Field_32076.Method_1161(this.Field_32076.Method_1224() + d2 * d5 + (double)Class_13337.Method_13347(d4) * (0.085 * 0.9411764705882353));
            this.Field_32076.Field_1072 += d3 * d5;
            n = 2447 & 19;
        } else if (this.Field_32071 > 0) {
            Class_3443 class_3443 = new Class_3443(this.\u0000strictfp, this.\u0000= package, this.\u0000, for(), this.\u0000= switch, this.Method_32083());
            double d = this.Field_32070.\u0000= package - this.\u0000= package;
            double d6 = this.Field_32070.\u0000, for() - this.\u0000, for();
            double d7 = this.Field_32070.\u0000= switch - this.\u0000= switch;
            double d8 = Class_13337.Method_13347(d * d + d6 * d6 + d7 * d7);
            double d9 = 1.1176470588235294 * 0.08947368421052632;
            class_3443.\u0000= ` = d * d9;
            class_3443.\u0000%(d6 * d9 + (double)Class_13337.Method_13347(d8) * (43.5 * 0.0018390804597701149));
            class_3443.\u0000switch = d7 * d9;
            this.\u0000strictfp.Method_350(class_3443);
            this.Field_32070.\u0000strictfp.Method_350(new Class_3481(this.Field_32070.\u0000strictfp, this.Field_32070.\u0000= package, this.Field_32070.\u0000, for() + 19.8 * 0.025252525252525252, this.Field_32070.\u0000= switch + 0.7416666666666667 * 0.6741573033707865, this.\u0000strictfp.nextInt(11271 & 21390) + (10977 & 29)));
            n = 23041 & -31437;
        }
        if (this.Field_32061) {
            n = 4138 & -14778;
        }
        this.Method_32081();
        this.Field_32070.Field_659 = null;
        return n;
    }
}

