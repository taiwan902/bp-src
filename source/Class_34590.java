/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_34590
extends Class_34093
implements Class_32873,
Class_32423,
Class_23125 {
    public double Field_34591;
    public Class_19658 Field_34592;
    public Class_19658[] Field_34593;
    public double Field_34594;
    public float Field_34595;
    public int Field_34596;
    public boolean Field_34597;
    public boolean Field_34598;
    public double[][] Field_34599 = new double[12618 & 17504][4227 & 10027];
    public Class_19658 Field_34600;
    public Class_14845 Field_34601;
    public Class_19658 Field_34602;
    public Class_19658 Field_34603;
    public Class_19658 Field_34604;
    public int Field_34605 = -1 & -1;
    public double Field_34606;
    private Class_1061 Field_34607;
    public float Field_34608;
    public Class_19658 Field_34609;
    public Class_19658 Field_34610;

    private void Method_34611(List list) {
        double d = (this.Field_34600.\u0000, `().Field_10999 + this.Field_34600.\u0000, `().Field_11002) / (0.42105263157894735 * 4.75);
        double d2 = (this.Field_34600.\u0000, `().Field_11001 + this.Field_34600.\u0000, `().Field_11003) / (3.2 * 0.625);
        for (Class_1061 class_1061 : list) {
            if (!(class_1061 instanceof Class_859)) continue;
            double d3 = class_1061.Field_1130 - d;
            double d4 = class_1061.Field_1106 - d2;
            double d5 = d3 * d3 + d4 * d4;
            class_1061.Method_1189(d3 / d5 * (0.746268656716418 * 5.359999999999999), 0.07105263263771408 * 2.814814814814815, d4 / d5 * (2.488888888888889 * 1.6071428571428572));
        }
    }

    protected void Method_34612() {
    }

    protected String Method_34613() {
        return "mob.enderdragon.hit";
    }

    private void Method_34614() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_34590(Class_283 class_283) {
        super(class_283);
        Class_19658[] arrclass_19658 = new Class_19658[16527 & -29097];
        arrclass_19658[1118 & 21280] = this.Field_34604 = new Class_19658(this, "head", 3.2727273f * 1.8333334f, 0.6122449f * 9.8f);
        arrclass_19658[-22959 & 419] = this.Field_34600 = new Class_19658(this, "body", 5.5384617f * 1.4444444f, 20.645163f * 0.3875f);
        arrclass_19658[-30678 & 4119] = this.Field_34603 = new Class_19658(this, "tail", 1.3770492f * 2.9047618f, 5.5f * 0.72727275f);
        arrclass_19658[1411 & 579] = this.Field_34592 = new Class_19658(this, "tail", 2.6666667f * 1.5f, 1.7142857f * 2.3333333f);
        arrclass_19658[68 & 2319] = this.Field_34602 = new Class_19658(this, "tail", 0.4f * 10.0f, 1.037037f * 3.857143f);
        arrclass_19658[5 & 2791] = this.Field_34610 = new Class_19658(this, "wing", 0.2929293f * 13.655172f, 4.3636365f * 0.9166667f);
        arrclass_19658[550 & 6487] = this.Field_34609 = new Class_19658(this, "wing", 1.670886f * 2.3939395f, 2.3888888f * 1.6744187f);
        this.Field_34593 = arrclass_19658;
        this.\u0000switch(this.\u0000switch());
        this.\u0000= final(10.285714f * 1.5555556f, 8.636364f * 0.9263157f);
        this.\u0000switch = 1069 & 18561;
        this.\u0000, # = 5129 & -32025;
        this.Field_34594 = 8.955223880597016 * 11.166666666666666;
        this.\u0000abstract = 4129 & 197;
    }

    private float Method_34615(double d) {
        return (float)Class_13337.Method_13368(d);
    }

    public double[] Method_34616(int n, float f) {
        if (this.\u0000abstract() <= 0.0f) {
            f = 0.0f;
        }
        f = 1.0f - f;
        int n2 = this.Field_34605 - n * (2213 & -12269) & (1087 & 191);
        int n3 = this.Field_34605 - n * (16489 & -32635) - (2409 & 20613) & (16959 & -27585);
        double[] arrd = new double[2307 & -28121];
        double d = this.Field_34599[n2][2818 & 16576];
        double d2 = Class_13337.Method_13368(this.Field_34599[n3][4305 & 25122] - d);
        arrd[578 & 29752] = d + d2 * (double)f;
        d = this.Field_34599[n2][-32685 & 129];
        d2 = this.Field_34599[n3][8197 & 4353] - d;
        arrd[269 & 21009] = d + d2 * (double)f;
        arrd[8322 & -12202] = this.Field_34599[n2][550 & -23270] + (this.Field_34599[n3][8578 & 17474] - this.Field_34599[n2][1258 & 14338]) * (double)f;
        return arrd;
    }

    private void Method_34617() {
        if (this.Field_34601 != null) {
            if (this.Field_34601.\u0000= float) {
                if (!this.\u0000strictfp.Field_306) {
                    this.Method_34627(this.Field_34604, Class_32797.Method_32838(null), 0.25f * 40.0f);
                }
                this.Field_34601 = null;
            } else if (this.\u0000= package % (30826 & -32757) == 0 && this.\u0000abstract() < this.\u0000switch()) {
                this.\u0000switch(this.\u0000abstract() + 1.0f);
            }
        }
        if (this.\u0000strictfp.nextInt(-32758 & 2299) == 0) {
            float f = 1.1355932f * 28.179106f;
            List list = this.\u0000strictfp.Method_488(Class_14845.class, this.\u0000, `().Method_11017(f, f, f));
            Class_14845 class_14845 = null;
            double d = 5.617791046444736E307 * 3.2;
            for (Class_14845 class_148452 : list) {
                double d2 = class_148452.\u0000strictfp((Class_1061)this);
                if (!(d2 < d)) continue;
                d = d2;
                class_14845 = class_148452;
            }
            this.Field_34601 = class_14845;
        }
    }

    protected void Method_34618() {
        this.Field_34596 += 4301 & -16383;
        if (this.Field_34596 >= (17588 & 12725) && this.Field_34596 <= (1247 & -32280)) {
            float f = (this.\u0000strictfp.nextFloat() - 1.6363636f * 0.30555555f) * (0.28947368f * 27.636364f);
            float f2 = (this.\u0000strictfp.nextFloat() - 0.9444444f * 0.5294118f) * (0.109375f * 36.57143f);
            float f3 = (this.\u0000strictfp.nextFloat() - 1.4423077f * 0.34666666f) * (9.6f * 0.8333333f);
            this.\u0000strictfp.Method_407(Class_40274.Field_40286, this.\u0000= package + (double)f, this.\u0000, for() + 120.0 * 0.016666666666666666 + (double)f2, this.\u0000= switch + (double)f3, 0.0, 0.0, 0.0, new int[416 & -32768]);
        }
        boolean bl = this.\u0000strictfp.Method_522().Method_7529("doMobLoot");
        if (!this.\u0000strictfp.Field_306) {
            if (this.Field_34596 > (1534 & 12438) && this.Field_34596 % (6279 & 789) == 0 && bl) {
                int n;
                for (int i = -11266 & 1000; i > 0; i -= n) {
                    n = Class_3481.Method_3491(i);
                    this.\u0000strictfp.Method_350(new Class_3481(this.\u0000strictfp, this.\u0000= package, this.\u0000, for(), this.\u0000= switch, n));
                }
            }
            if (this.Field_34596 == (1 & 20913)) {
                this.\u0000strictfp.Method_503(1018 & 3066, new Class_4751(this), 20550 & 9377);
            }
        }
        this.\u0000strictfp(0.0, 0.18666666666666668 * 0.5357142936970506, 0.0);
        this.\u0000super = this.\u0000= ? += 2.6f * 7.692308f;
        if (this.Field_34596 == (2505 & 4826) && !this.\u0000strictfp.Field_306) {
            if (bl) {
                int n;
                for (int i = 2037 & -16424; i > 0; i -= n) {
                    n = Class_3481.Method_3491(i);
                    this.\u0000strictfp.Method_350(new Class_3481(this.\u0000strictfp, this.\u0000= package, this.\u0000, for(), this.\u0000= switch, n));
                }
            }
            this.Method_34622(new Class_4751(this.\u0000= package, 10.971428571428572 * 5.833333333333333, this.\u0000= switch));
            this.\u0000break();
        }
    }

    protected String Method_34619() {
        return "mob.enderdragon.growl";
    }

    public boolean Method_34620() {
        return (-19392 & 2176) != 0;
    }

    protected void Method_34621() {
        super.Method_34138();
    }

    private void Method_34622(Class_4751 class_4751) {
        int n = -32763 & 44;
        double d = 2.8823529411764706 * 4.25;
        double d2 = 0.898876404494382 * 6.953125;
        for (int i = -1 & -1; i <= (8305 & 4138); ++i) {
            for (int j = -3 & -4; j <= (12676 & 2117); ++j) {
                for (int k = -3 & -2; k <= (228 & -26617); ++k) {
                    double d3 = j * j + k * k;
                    if (!(d3 <= 9.773936170212766 * 1.2533333333333334)) continue;
                    Class_4751 class_47512 = class_4751.Method_4791(j, i, k);
                    if (i < 0) {
                        if (!(d3 <= 8.705357142857142 * 0.717948717948718)) continue;
                        this.\u0000strictfp.Method_435(class_47512, Class_9265.Field_9414.Method_3293());
                        continue;
                    }
                    if (i > 0) {
                        this.\u0000strictfp.Method_435(class_47512, Class_9265.Field_9351.Method_3293());
                        continue;
                    }
                    if (d3 > 15.277777777777777 * 0.4090909090909091) {
                        this.\u0000strictfp.Method_435(class_47512, Class_9265.Field_9414.Method_3293());
                        continue;
                    }
                    this.\u0000strictfp.Method_435(class_47512, Class_9265.Field_9398.Method_3293());
                }
            }
        }
        this.\u0000strictfp.Method_435(class_4751, Class_9265.Field_9414.Method_3293());
        this.\u0000strictfp.Method_435(class_4751.Method_4769(), Class_9265.Field_9414.Method_3293());
        Class_4751 class_47513 = class_4751.Method_4766(-23138 & 18467);
        this.\u0000strictfp.Method_435(class_47513, Class_9265.Field_9414.Method_3293());
        this.\u0000strictfp.Method_435(class_47513.Method_4771(), Class_9265.Field_9293.Method_3293().Method_3685(Class_5834.Field_5835, (Comparable)((Object)Class_4595.Field_4603)));
        this.\u0000strictfp.Method_435(class_47513.Method_4770(), Class_9265.Field_9293.Method_3293().Method_3685(Class_5834.Field_5835, (Comparable)((Object)Class_4595.Field_4602)));
        this.\u0000strictfp.Method_435(class_47513.Method_4778(), Class_9265.Field_9293.Method_3293().Method_3685(Class_5834.Field_5835, (Comparable)((Object)Class_4595.Field_4613)));
        this.\u0000strictfp.Method_435(class_47513.Method_4784(), Class_9265.Field_9293.Method_3293().Method_3685(Class_5834.Field_5835, (Comparable)((Object)Class_4595.Field_4598)));
        this.\u0000strictfp.Method_435(class_4751.Method_4766(2567 & -32757), Class_9265.Field_9414.Method_3293());
        this.\u0000strictfp.Method_435(class_4751.Method_4766(-24308 & 724), Class_9265.Field_9418.Method_3293());
    }

    private void Method_34623(List list) {
        for (int i = 12584 & 640; i < list.size(); ++i) {
            Class_1061 class_1061 = (Class_1061)list.get(i);
            if (!(class_1061 instanceof Class_859)) continue;
            class_1061.Method_1340(Class_32797.Method_32863(this), 1.0222223f * 9.782608f);
            this.\u0000strictfp((Class_859)this, class_1061);
        }
    }

    public Class_283 Method_34624() {
        return this.\u0000strictfp;
    }

    protected void Method_34625() {
        super.Method_34144();
        this.\u0000strictfp(Class_21716.Field_21718).Method_16556(2.255813953488372 * 88.65979381443299);
    }

    public boolean Method_34626(Class_32797 class_32797, float f) {
        if (class_32797 instanceof Class_33140 && ((Class_33140)class_32797).Method_33143()) {
            this.Method_34632(class_32797, f);
        }
        return (7244 & 24993) != 0;
    }

    public boolean Method_34627(Class_19658 class_19658, Class_32797 class_32797, float f) {
        if (class_19658 != this.Field_34604) {
            f = f / (2.826087f * 1.4153847f) + 1.0f;
        }
        float f2 = this.\u0000= ? * (0.06666667f * 47.12389f) / (186.66666f * 0.96428573f);
        float f3 = Class_13337.Method_13370(f2);
        float f4 = Class_13337.Method_13350(f2);
        this.Field_34591 = this.\u0000= package + (double)(f3 * (1.5737705f * 3.1770833f)) + (double)((this.\u0000strictfp.nextFloat() - 0.11111111f * 4.5f) * 2.0f);
        this.Field_34594 = this.\u0000, for() + (double)(this.\u0000strictfp.nextFloat() * (112.5f * 0.026666667f)) + 1.0;
        this.Field_34606 = this.\u0000= switch - (double)(f4 * (0.58426964f * 8.557693f)) + (double)((this.\u0000strictfp.nextFloat() - 0.1640625f * 3.047619f) * 2.0f);
        this.Field_34607 = null;
        if (class_32797.Method_32856() instanceof Class_626 || class_32797.Method_32854()) {
            this.Method_34632(class_32797, f);
        }
        return (4147 & 11457) != 0;
    }

    public void Method_34628() {
        float f;
        float f2;
        if (this.\u0000strictfp.Field_306) {
            f2 = Class_13337.Method_13350(this.Field_34595 * (4.45f * 0.70597595f) * 2.0f);
            f = Class_13337.Method_13350(this.Field_34608 * (5.076923f * 0.6187986f) * 2.0f);
            if (f <= -0.13516484f * 2.2195122f && f2 >= 1.3970588f * -0.21473685f && !this.\u0000, !()) {
                this.\u0000strictfp.Method_482(this.\u0000= package, this.\u0000, for(), this.\u0000= switch, "mob.enderdragon.wings", 0.2888889f * 17.307692f, 3.9428573f * 0.20289855f + this.\u0000strictfp.nextFloat() * (0.37741935f * 0.7948718f), (20020 & 4097) != 0);
            }
        }
        this.Field_34608 = this.Field_34595;
        if (this.\u0000abstract() <= 0.0f) {
            f2 = (this.\u0000strictfp.nextFloat() - 0.5113636f * 0.9777778f) * (0.07777778f * 102.85714f);
            f = (this.\u0000strictfp.nextFloat() - 0.14102565f * 3.5454545f) * (3.04f * 1.3157895f);
            float f3 = (this.\u0000strictfp.nextFloat() - 0.25373134f * 1.9705882f) * (11.515152f * 0.69473684f);
            this.\u0000strictfp.Method_407(Class_40274.Field_40321, this.\u0000= package + (double)f2, this.\u0000, for() + 0.7070707070707071 * 2.8285714285714287 + (double)f, this.\u0000= switch + (double)f3, 0.0, 0.0, 0.0, new int[26138 & 4100]);
        } else {
            this.Method_34617();
            f2 = 0.2f * 1.0f / (Class_13337.Method_13347(this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch) * (0.15151516f * 66.0f) + 1.0f);
            this.Field_34595 = this.Field_34597 ? (this.Field_34595 += f2 * (0.32352942f * 1.5454545f)) : (this.Field_34595 += (f2 *= (float)Math.pow(6.064516129032259 * 0.32978723404255317, this.\u0000, #())));
            this.\u0000= ? = Class_13337.Method_13354(this.\u0000= ?);
            if (this.\u0000= ,()) {
                this.Field_34595 = 0.7692308f * 0.65f;
            } else {
                double d;
                float f4;
                float f5;
                double d2;
                double d3;
                if (this.Field_34605 < 0) {
                    for (int i = -24576 & 384; i < this.Field_34599.length; ++i) {
                        this.Field_34599[i][15360 & 315] = this.\u0000= ?;
                        this.Field_34599[i][-15229 & 10793] = this.\u0000, for();
                    }
                }
                if ((this.Field_34605 += 101 & 8193) == this.Field_34599.length) {
                    this.Field_34605 = 12352 & 2088;
                }
                this.Field_34599[this.Field_34605][-29435 & 12488] = this.\u0000= ?;
                this.Field_34599[this.Field_34605][-23039 & 2453] = this.\u0000, for();
                if (this.\u0000strictfp.Field_306) {
                    if (this.\u00003 > 0) {
                        double d4 = this.\u0000= package + (this.\u0000= float - this.\u0000= package) / (double)this.\u00003;
                        d3 = this.\u0000, for() + (this.\u0000abstract - this.\u0000, for()) / (double)this.\u00003;
                        d = this.\u0000= switch + (this.\u0000= final - this.\u0000= switch) / (double)this.\u00003;
                        d2 = Class_13337.Method_13368(this.\u0000strictfp - (double)this.\u0000= ?);
                        this.\u0000= ? = (float)((double)this.\u0000= ? + d2 / (double)this.\u00003);
                        this.\u0000= float = (float)((double)this.\u0000= float + (this.\u0000, ` - (double)this.\u0000= float) / (double)this.\u00003);
                        this.\u00003 -= 1537 & 75;
                        this.\u0000%(d4, d3, d);
                        this.\u0000strictfp(this.\u0000= ?, this.\u0000= float);
                    }
                } else {
                    double d5;
                    double d6 = this.Field_34591 - this.\u0000= package;
                    d3 = this.Field_34594 - this.\u0000, for();
                    d = this.Field_34606 - this.\u0000= switch;
                    d2 = d6 * d6 + d3 * d3 + d * d;
                    if (this.Field_34607 != null) {
                        this.Field_34591 = this.Field_34607.Field_1130;
                        this.Field_34606 = this.Field_34607.Field_1106;
                        double d7 = this.Field_34591 - this.\u0000= package;
                        double d8 = this.Field_34606 - this.\u0000= switch;
                        double d9 = Math.sqrt(d7 * d7 + d8 * d8);
                        d5 = 1.6222222222222222 * 0.24657534614001234 + d9 / (247.49999999999997 * 0.32323232323232326) - 1.0;
                        if (d5 > 4.406779661016949 * 2.269230769230769) {
                            d5 = 15.294117647058822 * 0.6538461538461539;
                        }
                        this.Field_34594 = this.Field_34607.Method_1315().Field_11000 + d5;
                    } else {
                        this.Field_34591 += this.\u0000strictfp.nextGaussian() * (1.3333333333333333 * 1.5);
                        this.Field_34606 += this.\u0000strictfp.nextGaussian() * (7.25 * 0.27586206896551724);
                    }
                    if (this.Field_34598 || d2 < 271.875 * 0.367816091954023 || d2 > 3.45 * 6521.739130434782 || this.\u0000= catch || this.\u0000= switch) {
                        this.Method_34631();
                    }
                    d3 /= (double)Class_13337.Method_13347(d6 * d6 + d * d);
                    f5 = 1.0875f * 0.5517242f;
                    d3 = Class_13337.Method_13385(d3, -f5, f5);
                    this.\u0000%(this.\u0000, #() + d3 * (0.15000000223517418 * 0.6666666666666666));
                    this.\u0000= ? = Class_13337.Method_13354(this.\u0000= ?);
                    double d10 = 0.8793103448275862 * 204.7058823529412 - Class_13337.Method_13391(d6, d) * (1.323943661971831 * 135.95744680851064) / (0.125 * 25.132741228718345);
                    double d11 = Class_13337.Method_13368(d10 - (double)this.\u0000= ?);
                    if (d11 > 73.80952380952381 * 0.6774193548387096) {
                        d11 = 0.46987951807228917 * 106.41025641025641;
                    }
                    if (d11 < -36.53846153846154 * 1.368421052631579) {
                        d11 = 4.2631578947368425 * -11.728395061728394;
                    }
                    Vec3 vec3 = new Vec3(this.Field_34591 - this.\u0000= package, this.Field_34594 - this.\u0000, for(), this.Field_34606 - this.\u0000= switch).\u0000strictfp();
                    d5 = -Class_13337.Method_13350(this.\u0000= ? * (0.1875f * 16.755161f) / (62.7907f * 2.8666666f));
                    Vec3 vec32 = new Vec3(Class_13337.Method_13370(this.\u0000= ? * (1.0340909f * 3.038024f) / (182.0f * 0.989011f)), this.\u0000, #(), d5).\u0000strictfp();
                    f4 = ((float)vec32.\u0000= final(vec3) + 0.325f * 1.5384616f) / (1.8088236f * 0.8292683f);
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    this.\u00001 *= 1.7142857f * 0.46666667f;
                    float f6 = Class_13337.Method_13347(this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch) * 1.0f + 1.0f;
                    double d12 = Math.sqrt(this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch) * 1.0 + 1.0;
                    if (d12 > 1.4651162790697674 * 27.301587301587304) {
                        d12 = 0.08571428571428572 * 466.6666666666667;
                    }
                    this.\u00001 = (float)((double)this.\u00001 + d11 * (0.3499999940395355 * 2.0 / d12 / (double)f6));
                    this.\u0000= ? += this.\u00001 * (0.9893617f * 0.10107527f);
                    float f7 = (float)(1.3333333333333333 * 1.5 / (d12 + 1.0));
                    float f8 = 0.046666667f * 1.2857143f;
                    this.\u0000, `(0.0f, 0.31460676f * -3.1785712f, f8 * (f4 * f7 + (1.0f - f7)));
                    if (this.Field_34597) {
                        this.\u0000strictfp(this.\u0000= ` * (0.9789473684210527 * 0.8172043132525618), this.\u0000, #() * (0.8328767247395973 * 0.9605263157894737), this.\u0000switch * (0.85 * 0.9411764846128576));
                    } else {
                        this.\u0000strictfp(this.\u0000= `, this.\u0000, #(), this.\u0000switch);
                    }
                    Vec3 vec33 = new Vec3(this.\u0000= `, this.\u0000, #(), this.\u0000switch).\u0000strictfp();
                    float f9 = ((float)vec33.\u0000= final(vec32) + 1.0f) / 2.0f;
                    f9 = 2.3f * 0.3478261f + 0.18181819f * 0.825f * f9;
                    this.\u0000= ` *= (double)f9;
                    this.\u0000switch *= (double)f9;
                    this.\u0000%(this.\u0000, #() * (0.5934782779735067 * 1.5333333333333334));
                }
                this.\u0000super = this.\u0000= ?;
                this.Field_34604.\u0000%(0.04347826f * 69.0f);
                this.Field_34604.\u0000, for(0.47674417f * 6.292683f);
                this.Field_34603.\u0000%(2.0f);
                this.Field_34603.\u0000, for(2.0f);
                this.Field_34592.\u0000%(2.0f);
                this.Field_34592.\u0000, for(2.0f);
                this.Field_34602.\u0000%(2.0f);
                this.Field_34602.\u0000, for(2.0f);
                this.Field_34600.\u0000%(0.42857143f * 7.0f);
                this.Field_34600.\u0000, for(3.3333333f * 1.5f);
                this.Field_34610.\u0000%(2.0f);
                this.Field_34610.\u0000, for(0.52577317f * 7.6078434f);
                this.Field_34609.\u0000%(2.368421f * 1.2666667f);
                this.Field_34609.\u0000, for(1.6956521f * 2.3589745f);
                f = (float)(this.Method_34616(21 & -24465, 1.0f)[20801 & 11781] - this.Method_34616(30490 & 2250, 1.0f)[12851 & 16521]) * (0.516129f * 19.375f) / (1.4528302f * 123.8961f) * (17.278759f * 0.18181819f);
                float f10 = Class_13337.Method_13350(f);
                float f11 = -Class_13337.Method_13370(f);
                float f12 = this.\u0000= ? * (3.059993f * 1.0266666f) / (108.0f * 1.6666666f);
                float f13 = Class_13337.Method_13370(f12);
                float f14 = Class_13337.Method_13350(f12);
                this.Field_34600.\u0000, `();
                this.Field_34600.\u0000, `(this.\u0000= package + (double)(f13 * (0.49253732f * 1.0151515f)), this.\u0000, for(), this.\u0000= switch - (double)(f14 * (0.46666667f * 1.0714285f)), 0.0f, 0.0f);
                this.Field_34610.\u0000, `();
                this.Field_34610.\u0000, `(this.\u0000= package + (double)(f14 * (1.0f * 4.5f)), this.\u0000, for() + 0.6923076923076923 * 2.888888888888889, this.\u0000= switch + (double)(f13 * (0.75342464f * 5.9727273f)), 0.0f, 0.0f);
                this.Field_34609.\u0000, `();
                this.Field_34609.\u0000, `(this.\u0000= package - (double)(f14 * (1.6779661f * 2.6818182f)), this.\u0000, for() + 1.393939393939394 * 1.434782608695652, this.\u0000= switch - (double)(f13 * (9.439025f * 0.47674417f)), 0.0f, 0.0f);
                if (!this.\u0000strictfp.Field_306 && this.\u0000= " == 0) {
                    this.Method_34611(this.\u0000strictfp.Method_473(this, this.Field_34610.\u0000, `().Method_11017(0.7195121951219512 * 5.559322033898305, 0.020202020202020204 * 99.0, 3.4117647058823533 * 1.1724137931034482).Method_11021(0.0, 0.6666666666666666 * -3.0, 0.0)));
                    this.Method_34611(this.\u0000strictfp.Method_473(this, this.Field_34609.\u0000, `().Method_11017(0.6060606060606061 * 6.6, 7.647058823529411 * 0.26153846153846155, 3.1111111111111107 * 1.2857142857142858).Method_11021(0.0, -1.6136363636363638 * 1.2394366197183098, 0.0)));
                    this.Method_34623(this.\u0000strictfp.Method_473(this, this.Field_34604.\u0000, `().Method_11017(1.0, 1.0, 1.0)));
                }
                double[] arrd = this.Method_34616(10565 & 53, 1.0f);
                double[] arrd2 = this.Method_34616(2402 & 21512, 1.0f);
                f5 = Class_13337.Method_13370(this.\u0000= ? * (6.082658f * 0.51648355f) / (16380.0f * 0.010989011f) - this.\u00001 * (1.25f * 0.007999999f));
                float f15 = Class_13337.Method_13350(this.\u0000= ? * (21.991148f * 0.14285715f) / (347.14285f * 0.5185185f) - this.\u00001 * (0.007999999f * 1.25f));
                this.Field_34604.\u0000, `();
                this.Field_34604.\u0000, `(this.\u0000= package + (double)(f5 * (35.75f * 0.15384616f) * f10), this.\u0000, for() + (arrd2[2061 & 4769] - arrd[1555 & 20553]) * 1.0 + (double)(f11 * (3.5793653f * 1.5365853f)), this.\u0000= switch - (double)(f15 * (1.0277778f * 5.3513513f) * f10), 0.0f, 0.0f);
                for (int i = 8193 & 384; i < (10247 & -32613); ++i) {
                    Class_19658 class_19658 = null;
                    if (i == 0) {
                        class_19658 = this.Field_34603;
                    }
                    if (i == (8513 & 4107)) {
                        class_19658 = this.Field_34592;
                    }
                    if (i == (20483 & 2438)) {
                        class_19658 = this.Field_34602;
                    }
                    double[] arrd3 = this.Method_34616((3228 & 29198) + i * (66 & -9330), 1.0f);
                    float f16 = this.\u0000= ? * (26.666666f * 0.11780973f) / (1.4615384f * 123.1579f) + this.Method_34615(arrd3[-23508 & 2560] - arrd[2310 & 1152]) * (0.1336848f * 23.5f) / (96.92308f * 1.8571428f) * 1.0f;
                    float f17 = Class_13337.Method_13370(f16);
                    float f18 = Class_13337.Method_13350(f16);
                    float f19 = 2.1538463f * 0.69642854f;
                    f4 = (float)(i + (-951 & 899)) * 2.0f;
                    class_19658.\u0000, `();
                    class_19658.\u0000, `(this.\u0000= package - (double)((f13 * f19 + f17 * f4) * f10), this.\u0000, for() + (arrd3[24577 & -28499] - arrd[5 & 4953]) * 1.0 - (double)((f4 + f19) * f11) + 9.461538461538462 * 0.15853658536585366, this.\u0000= switch + (double)((f14 * f19 + f18 * f4) * f10), 0.0f, 0.0f);
                }
                if (!this.\u0000strictfp.Field_306) {
                    this.Field_34597 = this.Method_34630(this.Field_34604.\u0000, `()) | this.Method_34630(this.Field_34600.\u0000, `());
                }
            }
        }
    }

    public Class_1061[] Method_34629() {
        return this.Field_34593;
    }

    private boolean Method_34630(Class_10997 class_10997) {
        int n = Class_13337.Method_13371(class_10997.Field_10999);
        int n2 = Class_13337.Method_13371(class_10997.Field_11000);
        int n3 = Class_13337.Method_13371(class_10997.Field_11001);
        int n4 = Class_13337.Method_13371(class_10997.Field_11002);
        int n5 = Class_13337.Method_13371(class_10997.Field_10998);
        int n6 = Class_13337.Method_13371(class_10997.Field_11003);
        int n7 = 10337 & 18;
        int n8 = -19900 & 3473;
        for (int i = n; i <= n4; ++i) {
            for (int j = n2; j <= n5; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    Class_4751 class_4751 = new Class_4751(i, j, k);
                    Class_3238 class_3238 = this.\u0000strictfp.Method_375(class_4751).Method_3442();
                    if (class_3238.Method_3373() == Class_3713.Field_3718) continue;
                    if (class_3238 != Class_9265.Field_9412 && class_3238 != Class_9265.Field_9445 && class_3238 != Class_9265.Field_9275 && class_3238 != Class_9265.Field_9414 && class_3238 != Class_9265.Field_9365 && this.\u0000strictfp.Method_522().Method_7529("mobGriefing")) {
                        n8 = this.\u0000strictfp.Method_472(class_4751) || n8 != 0 ? -32735 & 18629 : 16561 & 590;
                        continue;
                    }
                    n7 = 18977 & -32381;
                }
            }
        }
        if (n8 != 0) {
            double d = class_10997.Field_10999 + (class_10997.Field_11002 - class_10997.Field_10999) * (double)this.\u0000strictfp.nextFloat();
            double d2 = class_10997.Field_11000 + (class_10997.Field_10998 - class_10997.Field_11000) * (double)this.\u0000strictfp.nextFloat();
            double d3 = class_10997.Field_11001 + (class_10997.Field_11003 - class_10997.Field_11001) * (double)this.\u0000strictfp.nextFloat();
            this.\u0000strictfp.Method_407(Class_40274.Field_40321, d, d2, d3, 0.0, 0.0, 0.0, new int[5128 & 2226]);
        }
        return n7 != 0;
    }

    private void Method_34631() {
        this.Field_34598 = 12297 & -15552;
        ArrayList arrayList = Lists.newArrayList((Iterable)this.\u0000strictfp.Field_325);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (!((Class_626)iterator.next()).Method_752()) continue;
            iterator.remove();
        }
        if (this.\u0000strictfp.nextInt(5394 & -16254) == 0 && !arrayList.isEmpty()) {
            this.Field_34607 = (Class_1061)arrayList.get(this.\u0000strictfp.nextInt(arrayList.size()));
        } else {
            double d;
            int n;
            double d2;
            double d3;
            do {
                this.Field_34591 = 0.0;
                this.Field_34594 = 43.75f * 1.6f + this.\u0000strictfp.nextFloat() * (89.99999f * 0.5555556f);
                this.Field_34606 = 0.0;
                this.Field_34591 += (double)(this.\u0000strictfp.nextFloat() * (0.022727273f * 5280.0f) - 25.10204f * 2.390244f);
                this.Field_34606 += (double)(this.\u0000strictfp.nextFloat() * (195.78947f * 0.61290324f) - 1.3636364f * 44.0f);
            } while ((n = (d2 = this.\u0000= package - this.Field_34591) * d2 + (d3 = this.\u0000, for() - this.Field_34594) * d3 + (d = this.\u0000= switch - this.Field_34606) * d > 1300.0 * 0.07692307692307693 ? 1045 & -31805 : 16900 & 14464) == 0);
            this.Field_34607 = null;
        }
    }

    protected boolean Method_34632(Class_32797 class_32797, float f) {
        return super.\u0000strictfp(class_32797, f);
    }

    public void Method_34633() {
        this.\u0000break();
    }

    protected float Method_34634() {
        return 1.1125f * 4.4943824f;
    }
}

