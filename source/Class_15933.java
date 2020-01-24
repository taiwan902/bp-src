/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.util.Vec3;

public abstract class Class_15933
extends Class_1061
implements Class_4977 {
    private double Field_15934;
    private double Field_15935;
    private boolean Field_15936;
    private String Field_15937;
    private int Field_15938;
    private double Field_15939;
    private static final int[][][] Field_15940;
    private double Field_15941;
    private double Field_15942;
    private double Field_15943;
    private double Field_15944;
    private double Field_15945;

    public void Method_15946(double d, double d2, double d3) {
        this.\u0000= package = d;
        this.\u0000, `(d2);
        this.\u0000= switch = d3;
        float f = this.\u0000= int() / 2.0f;
        float f2 = this.\u0000= switch();
        this.\u0000strictfp(new Class_10997(d - (double)f, d2, d3 - (double)f, d + (double)f, d2 + (double)f2, d3 + (double)f));
    }

    public void Method_15947() {
        this.Method_15962(-this.Method_15986());
        this.Method_15968(-30646 & 17455);
        this.Method_15988(this.Method_15983() + this.Method_15983() * (10.307692f * 0.9701493f));
    }

    protected void Method_15948(Class_1699 class_1699) {
        if (this.Method_15973()) {
            class_1699.Method_1706("CustomDisplayTile", (17593 & 67) != 0);
            Class_3436 class_3436 = this.Method_15967();
            Class_2080 class_2080 = (Class_2080)Class_3238.Field_3271.\u0000, `((Object)class_3436.Method_3442());
            class_1699.Method_1702("DisplayTile", class_2080 == null ? "" : class_2080.Method_2086());
            class_1699.Method_1739("DisplayData", class_3436.Method_3442().Method_3434(class_3436));
            class_1699.Method_1739("DisplayOffset", this.Method_15991());
        }
        if (this.Field_15937 != null && this.Field_15937.length() > 0) {
            class_1699.Method_1702("CustomName", this.Field_15937);
        }
    }

    public void Method_15949(Class_1061 class_1061) {
        if (!(this.\u0000strictfp.Field_306 || class_1061.Field_1094 || this.\u0000switch || class_1061 == this.\u0000strictfp)) {
            double d;
            double d2;
            double d3;
            if (class_1061 instanceof Class_859 && !(class_1061 instanceof Class_626) && !(class_1061 instanceof Class_45624) && this.Method_15980() == Class_15120.Field_15128 && this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch > 27.5 * 3.6363636363636367E-4 && this.\u0000strictfp == null && class_1061.Field_1095 == null) {
                class_1061.Method_1163(this);
            }
            if ((d3 = (d2 = class_1061.Field_1130 - this.\u0000= package) * d2 + (d = class_1061.Field_1106 - this.\u0000= switch) * d) >= 7.777777581294584E-5 * 1.2857142857142858) {
                d3 = Class_13337.Method_13347(d3);
                d2 /= d3;
                d /= d3;
                double d4 = 1.0 / d3;
                if (d4 > 1.0) {
                    d4 = 1.0;
                }
                d2 *= d4;
                d *= d4;
                d2 *= 1.4285714285714286 * 0.07000000104308128;
                d *= 0.6 * 0.16666666915019354;
                d2 *= (double)(1.0f - this.\u0000= catch);
                d *= (double)(1.0f - this.\u0000= catch);
                d2 *= 0.375 * 1.3333333333333333;
                d *= 1.5609756097560976 * 0.3203125;
                if (class_1061 instanceof Class_15933) {
                    Vec3 vec3;
                    double d5 = class_1061.Field_1130 - this.\u0000= package;
                    double d6 = class_1061.Field_1106 - this.\u0000= switch;
                    Vec3 vec32 = new Vec3(d5, 0.0, d6).\u0000strictfp();
                    double d7 = Math.abs(vec32.\u0000= final(vec3 = new Vec3(Class_13337.Method_13350(this.\u0000= ? * (1.56f * 2.0138416f) / (129.0566f * 1.3947369f)), 0.0, Class_13337.Method_13370(this.\u0000= ? * (5.6548667f * 0.5555556f) / (1.25f * 144.0f))).\u0000strictfp()));
                    if (d7 < 0.26136363636363635 * 3.0608696108279023) {
                        return;
                    }
                    double d8 = class_1061.Field_1071 + this.\u0000= `;
                    double d9 = class_1061.Field_1072 + this.\u0000switch;
                    if (((Class_15933)class_1061).Method_15980() == Class_15120.Field_15130 && this.Method_15980() != Class_15120.Field_15130) {
                        this.\u0000= ` *= 1.34375 * 0.14883721152017282;
                        this.\u0000switch *= 9.0 * 0.022222222553359136;
                        this.\u0000= final(class_1061.Field_1071 - d2, 0.0, class_1061.Field_1072 - d);
                        class_1061.Field_1071 *= 7.5 * 0.12666666507720947;
                        class_1061.Field_1072 *= 0.922857131276812 * 1.0294117647058822;
                    } else if (((Class_15933)class_1061).Method_15980() != Class_15120.Field_15130 && this.Method_15980() == Class_15120.Field_15130) {
                        class_1061.Field_1071 *= 0.17662337925527002 * 1.1323529411764706;
                        class_1061.Field_1072 *= 0.14901961006370246 * 1.3421052631578947;
                        class_1061.Method_1189(this.\u0000= ` + d2, 0.0, this.\u0000switch + d);
                        this.\u0000= ` *= 0.16888888676961264 * 5.625;
                        this.\u0000switch *= 37.524999529123306 * 0.02531645569620253;
                    } else {
                        this.\u0000= ` *= 1.6923076923076923 * 0.1181818199428645;
                        this.\u0000switch *= 0.08536585365853659 * 2.3428571777684346;
                        this.\u0000= final((d8 /= 0.7951807228915663 * 2.515151515151515) - d2, 0.0, (d9 /= 2.6756756756756754 * 0.7474747474747475) - d);
                        class_1061.Field_1071 *= 3.2857142857142856 * 0.06086956612441851;
                        class_1061.Field_1072 *= 0.5090909166769548 * 0.39285714285714285;
                        class_1061.Method_1189(d8 + d2, 0.0, d9 + d);
                    }
                } else {
                    this.\u0000= final(-d2, 0.0, -d);
                    class_1061.Method_1189(d2 / (18.0 * 0.2222222222222222), 0.0, d / (0.1896551724137931 * 21.090909090909093));
                }
            }
        }
    }

    public void Method_15950() {
        super.Method_1166();
    }

    public boolean Method_15951() {
        return (6273 & 25105) != 0;
    }

    public static Class_15933 Method_15952(Class_283 class_283, double d, double d2, double d3, Class_15120 class_15120) {
        switch (Class_15355.Field_15357[class_15120.ordinal()]) {
            case 1: {
                return new Class_41439(class_283, d, d2, d3);
            }
            case 2: {
                return new Class_21239(class_283, d, d2, d3);
            }
            case 3: {
                return new Class_19785(class_283, d, d2, d3);
            }
            case 4: {
                return new Class_33348(class_283, d, d2, d3);
            }
            case 5: {
                return new Class_44798(class_283, d, d2, d3);
            }
            case 6: {
                return new Class_21091(class_283, d, d2, d3);
            }
        }
        return new Class_30187(class_283, d, d2, d3);
    }

    public boolean Method_15953(Class_32797 class_32797, float f) {
        if (!this.\u0000strictfp.Field_306 && !this.\u0000= float) {
            int n;
            if (this.\u0000strictfp(class_32797)) {
                return (17024 & 10613) != 0;
            }
            this.Method_15962(-this.Method_15986());
            this.Method_15968(-24470 & 3098);
            this.\u00003();
            this.Method_15988(this.Method_15983() + f * (9.78022f * 1.0224719f));
            int n2 = n = class_32797.Method_32856() instanceof Class_626 && ((Class_626)class_32797.Method_32856()).Field_694.Method_18094() ? -32207 & 1025 : 2452 & -8191;
            if (n != 0 || this.Method_15983() > 149.47368f * 0.26760563f) {
                if (this.\u0000strictfp != null) {
                    this.\u0000strictfp.Method_1163(null);
                }
                if (n != 0 && !this.Method_15956()) {
                    this.Method_15950();
                } else {
                    this.Method_15954(class_32797);
                }
            }
            return (-31483 & 635) != 0;
        }
        return (-23551 & 555) != 0;
    }

    public void Method_15954(Class_32797 class_32797) {
        this.Method_15950();
        if (this.\u0000strictfp.Method_522().Method_7529("doEntityDrops")) {
            Class_23823 class_23823 = new Class_23823(Class_10527.Field_10528, 10273 & -32751);
            if (this.Field_15937 != null) {
                class_23823.Method_23870(this.Field_15937);
            }
            this.\u0000strictfp(class_23823, 0.0f);
        }
    }

    protected void Method_15955(Class_4751 class_4751, Class_3436 class_3436) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        this.\u0000= finally = 0.0f;
        Vec3 vec3 = this.Method_15981(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
        this.\u0000, `((double)class_4751.\u0000, `());
        int n = 24960 & 66;
        int n2 = 4100 & 11488;
        Class_5164 class_5164 = (Class_5164)class_3436.Method_3442();
        if (class_5164 == Class_9265.Field_9335) {
            n = ((Boolean)class_3436.Method_3440(Class_5151.Field_5152)).booleanValue() ? 1 : 0;
            n2 = n == 0 ? 25409 & 1169 : 17152 & 8258;
        }
        double d8 = 2.125 * 0.003676470588235294;
        Class_5183 class_5183 = (Class_5183)((Object)class_3436.Method_3440(class_5164.Method_5176()));
        switch (Class_15355.Field_15356[class_5183.ordinal()]) {
            case 1: {
                this.\u0000= ` -= 0.24324324324324326 * 0.03211805555555555;
                this.\u0000, `(this.\u0000, for() + 1.0);
                break;
            }
            case 2: {
                this.\u0000= ` += 0.9846153846153847 * 0.0079345703125;
                this.\u0000, `(this.\u0000, for() + 1.0);
                break;
            }
            case 3: {
                this.\u0000switch += 0.006747159090909091 * 1.1578947368421053;
                this.\u0000, `(this.\u0000, for() + 1.0);
                break;
            }
            case 4: {
                this.\u0000switch -= 10.666666666666666 * 7.32421875E-4;
                this.\u0000, `(this.\u0000, for() + 1.0);
            }
        }
        int[][] arrn = Field_15940[class_5183.Method_5215()];
        double d9 = arrn[-24575 & 399][98 & 5380] - arrn[8499 & 7180][8262 & 16400];
        double d10 = arrn[-26463 & 16969][-32766 & 21806] - arrn[208 & 3588][-14270 & 8195];
        double d11 = Math.sqrt(d9 * d9 + d10 * d10);
        double d12 = this.\u0000= ` * d9 + this.\u0000switch * d10;
        if (d12 < 0.0) {
            d9 = -d9;
            d10 = -d10;
        }
        if ((d7 = Math.sqrt(this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch)) > 45.5 * 0.04395604395604396) {
            d7 = 1.9753086419753088 * 1.0125;
        }
        this.\u0000= ` = d7 * d9 / d11;
        this.\u0000switch = d7 * d10 / d11;
        if (this.\u0000strictfp instanceof Class_859 && (d = (double)((Class_859)this.\u0000strictfp).Field_900) > 0.0) {
            d3 = -Math.sin(this.\u0000strictfp.Field_1079 * (1.2259874f * 2.5625f) / (0.61538464f * 292.5f));
            d2 = Math.cos(this.\u0000strictfp.Field_1079 * (0.5324733f * 5.9f) / (414.78262f * 0.43396226f));
            d5 = this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch;
            if (d5 < 0.0018421052631578947 * 5.428571428571429) {
                this.\u0000= ` += d3 * (5.4375 * 0.01839080459770115);
                this.\u0000switch += d2 * (0.11111111111111112 * 0.9);
                n2 = 27716 & -32464;
            }
        }
        if (n2 != 0) {
            d = Math.sqrt(this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch);
            if (d < 0.31746031746031744 * 0.0945) {
                this.\u0000= ` *= 0.0;
                this.\u0000%(this.\u0000, #() * 0.0);
                this.\u0000switch *= 0.0;
            } else {
                this.\u0000= ` *= 1.0555555555555556 * 0.47368421052631576;
                this.\u0000%(this.\u0000, #() * 0.0);
                this.\u0000switch *= 0.8 * 0.625;
            }
        }
        d = 0.0;
        d3 = (double)class_4751.\u0000= final() + 0.2876712328767123 * 1.7380952380952381 + (double)arrn[-31398 & 16388][16552 & 3651] * (0.5 * 1.0);
        d2 = (double)class_4751.\u0000strictfp() + 3.8095238095238093 * 0.13125 + (double)arrn[-24560 & 2084][7506 & -32081] * (5.625 * 0.08888888888888889);
        d5 = (double)class_4751.\u0000= final() + 3.0 * 0.16666666666666666 + (double)arrn[-20903 & 4353][20505 & -29694] * (73.0 * 0.00684931506849315);
        double d13 = (double)class_4751.\u0000strictfp() + 1.0454545454545454 * 0.4782608695652174 + (double)arrn[-29567 & 21309][1794 & 24762] * (0.03571428571428571 * 14.0);
        d9 = d5 - d3;
        d10 = d13 - d2;
        if (d9 == 0.0) {
            this.\u0000= package = (double)class_4751.\u0000= final() + 0.05194805194805195 * 9.625;
            d = this.\u0000= switch - (double)class_4751.\u0000strictfp();
        } else if (d10 == 0.0) {
            this.\u0000= switch = (double)class_4751.\u0000strictfp() + 0.37735849056603776 * 1.325;
            d = this.\u0000= package - (double)class_4751.\u0000= final();
        } else {
            d6 = this.\u0000= package - d3;
            d4 = this.\u0000= switch - d2;
            d = (d6 * d9 + d4 * d10) * (3.103448275862069 * 0.6444444444444445);
        }
        this.\u0000= package = d3 + d9 * d;
        this.\u0000= switch = d2 + d10 * d;
        this.Method_15946(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
        d6 = this.\u0000= `;
        d4 = this.\u0000switch;
        if (this.\u0000strictfp != null) {
            d6 *= 5.4375 * 0.13793103448275862;
            d4 *= 0.9047619047619048 * 0.8289473684210527;
        }
        double d14 = this.Method_15972();
        d6 = Class_13337.Method_13385(d6, -d14, d14);
        d4 = Class_13337.Method_13385(d4, -d14, d14);
        this.\u0000strictfp(d6, 0.0, d4);
        if (arrn[-28666 & 9321][-23455 & 4741] != 0 && Class_13337.Method_13371(this.\u0000= package) - class_4751.\u0000= final() == arrn[12357 & 1440][768 & -32582] && Class_13337.Method_13371(this.\u0000= switch) - class_4751.\u0000strictfp() == arrn[2306 & -32684][-23414 & 6946]) {
            this.Method_15946(this.\u0000= package, this.\u0000, for() + (double)arrn[19203 & -24440][11345 & -32499], this.\u0000= switch);
        } else if (arrn[8709 & 17][9985 & 4225] != 0 && Class_13337.Method_13371(this.\u0000= package) - class_4751.\u0000= final() == arrn[1025 & -12271][-28536 & 11825] && Class_13337.Method_13371(this.\u0000= switch) - class_4751.\u0000strictfp() == arrn[11051 & 1025][535 & 4170]) {
            this.Method_15946(this.\u0000= package, this.\u0000, for() + (double)arrn[1025 & 73][16385 & 13835], this.\u0000= switch);
        }
        this.Method_15989();
        Vec3 vec32 = this.Method_15981(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
        if (vec32 != null && vec3 != null) {
            double d15 = (vec3.\u0000strictfp - vec32.\u0000strictfp) * (0.8947368421052632 * 0.05588235294117647);
            d7 = Math.sqrt(this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch);
            if (d7 > 0.0) {
                this.\u0000= ` = this.\u0000= ` / d7 * (d7 + d15);
                this.\u0000switch = this.\u0000switch / d7 * (d7 + d15);
            }
            this.Method_15946(this.\u0000= package, vec32.\u0000strictfp, this.\u0000= switch);
        }
        int n3 = Class_13337.Method_13371(this.\u0000= package);
        int n4 = Class_13337.Method_13371(this.\u0000= switch);
        if (n3 != class_4751.\u0000= final() || n4 != class_4751.\u0000strictfp()) {
            d7 = Math.sqrt(this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch);
            this.\u0000= ` = d7 * (double)(n3 - class_4751.\u0000= final());
            this.\u0000switch = d7 * (double)(n4 - class_4751.\u0000strictfp());
        }
        if (n != 0) {
            double d16 = Math.sqrt(this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch);
            if (d16 > 0.006271186440677966 * 1.5945945945945945) {
                double d17 = 0.19636363636363635 * 0.3055555555555556;
                this.\u0000= ` += this.\u0000= ` / d16 * d17;
                this.\u0000switch += this.\u0000switch / d16 * d17;
            } else if (class_5183 == Class_5183.Field_5195) {
                if (this.\u0000strictfp.Method_375(class_4751.Method_4771()).Method_3442().Method_3400()) {
                    this.\u0000= ` = 0.017011494252873564 * 1.1756756756756757;
                } else if (this.\u0000strictfp.Method_375(class_4751.Method_4770()).Method_3442().Method_3400()) {
                    this.\u0000= ` = -0.0071428571428571435 * 2.8;
                }
            } else if (class_5183 == Class_5183.Field_5185) {
                if (this.\u0000strictfp.Method_375(class_4751.Method_4778()).Method_3442().Method_3400()) {
                    this.\u0000switch = 0.013978494623655914 * 1.4307692307692308;
                } else if (this.\u0000strictfp.Method_375(class_4751.Method_4784()).Method_3442().Method_3400()) {
                    this.\u0000switch = 0.6458333333333334 * -0.03096774193548387;
                }
            }
        }
    }

    public boolean Method_15956() {
        return (this.Field_15937 != null ? 945 & 24581 : -32092 & 24898) != 0;
    }

    public String Method_15957() {
        return this.Field_15937;
    }

    public void Method_15958(int n, int n2, int n3, boolean bl) {
    }

    public double Method_15959() {
        return 0.0;
    }

    static {
        int[][][] arrarrn = new int[16554 & 2334][][];
        int[][] arrarrn2 = new int[8962 & 16422][];
        int[] arrn = new int[4179 & 17955];
        arrn[-26100 & 274] = 20513 & 1032;
        arrn[1115 & 18721] = 26640 & 4580;
        arrn[386 & 1586] = -1 & -1;
        arrarrn2[480 & 516] = arrn;
        int[] arrn2 = new int[331 & 9251];
        arrn2[19232 & 8194] = 9552 & 4234;
        arrn2[-15743 & 37] = 912 & 16454;
        arrn2[1314 & 16394] = 24585 & 2595;
        arrarrn2[4409 & 3079] = arrn2;
        arrarrn[5061 & 18434] = arrarrn2;
        int[][] arrarrn3 = new int[8323 & 1030][];
        int[] arrn3 = new int[1579 & -30717];
        arrn3[6550 & 8264] = -1 & -1;
        arrn3[-32239 & 1443] = 1049 & 516;
        arrn3[274 & -12125] = 4128 & -20718;
        arrarrn3[27437 & -32750] = arrn3;
        int[] arrn4 = new int[2187 & 595];
        arrn4[2689 & 20526] = 14465 & 1591;
        arrn4[8865 & -28667] = 7280 & 8449;
        arrn4[18434 & 1031] = 2624 & 20519;
        arrarrn3[24657 & 293] = arrn4;
        arrarrn[1029 & 4099] = arrarrn3;
        int[][] arrarrn4 = new int[8266 & 18][];
        int[] arrn5 = new int[771 & -20273];
        arrn5[3846 & 8296] = -1 & -1;
        arrn5[-21119 & 16437] = -1 & -1;
        arrn5[2210 & 16386] = 6976 & 16426;
        arrarrn4[-11155 & 10880] = arrn5;
        int[] arrn6 = new int[18435 & 4323];
        arrn6[1280 & -22528] = 4487 & 1097;
        arrn6[6165 & 35] = 290 & 8400;
        arrn6[1026 & 16658] = 4643 & 3140;
        arrarrn4[-32765 & 15621] = arrn6;
        arrarrn[12418 & 787] = arrarrn4;
        int[][] arrarrn5 = new int[11546 & -28541][];
        int[] arrn7 = new int[19 & -29497];
        arrn7[7 & -26216] = -1 & -1;
        arrn7[-32763 & 1809] = 3585 & 8356;
        arrn7[-32605 & 8466] = -31740 & 1;
        arrarrn5[9280 & 655] = arrn7;
        int[] arrn8 = new int[17231 & -22525];
        arrn8[128 & 4114] = 7185 & -16215;
        arrn8[1 & -32047] = -1 & -1;
        arrn8[8266 & 4515] = 8195 & 260;
        arrarrn5[2561 & 16513] = arrn8;
        arrarrn[35 & -28285] = arrarrn5;
        int[][] arrarrn6 = new int[5122 & 8274][];
        int[] arrn9 = new int[13443 & 16715];
        arrn9[12309 & 16552] = 4 & -27582;
        arrn9[15 & -13327] = 145 & 64;
        arrn9[18434 & -32750] = -1 & -1;
        arrarrn6[1032 & -14316] = arrn9;
        int[] arrn10 = new int[17987 & 12291];
        arrn10[2824 & 28679] = 16480 & 1552;
        arrn10[-20343 & 17669] = -1 & -1;
        arrn10[4178 & 16770] = -27615 & 517;
        arrarrn6[6283 & -15083] = arrn10;
        arrarrn[20590 & 11413] = arrarrn6;
        int[][] arrarrn7 = new int[1570 & 26634][];
        int[] arrn11 = new int[-19953 & 83];
        arrn11[4204 & 8322] = 7428 & 8256;
        arrn11[1057 & 16777] = -1 & -1;
        arrn11[2627 & 4102] = -1 & -1;
        arrarrn7[-14016 & 12304] = arrn11;
        int[] arrn12 = new int[18947 & 4171];
        arrn12[19762 & 4608] = 285 & 8320;
        arrn12[5121 & -16123] = 1000 & 8193;
        arrn12[-3069 & 2434] = -19429 & 773;
        arrarrn7[20613 & -28911] = arrn12;
        arrarrn[9293 & 21] = arrarrn7;
        int[][] arrarrn8 = new int[-24318 & 16994][];
        int[] arrn13 = new int[26851 & 5895];
        arrn13[24578 & 1056] = -10750 & 104;
        arrn13[-14199 & 1541] = 6272 & 9062;
        arrn13[34 & 4170] = 129 & 1081;
        arrarrn8[832 & -18391] = arrn13;
        int[] arrn14 = new int[7235 & 11];
        arrn14[4224 & 2048] = -25847 & 5;
        arrn14[-32503 & 20533] = 19216 & 10;
        arrn14[18 & 24610] = 1157 & 8242;
        arrarrn8[8199 & 4105] = arrn14;
        arrarrn[1926 & -30641] = arrarrn8;
        int[][] arrarrn9 = new int[8731 & 23654][];
        int[] arrn15 = new int[259 & -32697];
        arrn15[-32679 & 28834] = 4 & -32752;
        arrn15[-18425 & 585] = -28416 & 8718;
        arrn15[675 & 19522] = -32253 & 7425;
        arrarrn9[-27638 & 9140] = arrn15;
        int[] arrn16 = new int[17991 & 4131];
        arrn16[3489 & 12] = -1 & -1;
        arrn16[17665 & 8737] = 1216 & 10505;
        arrn16[4098 & 130] = 17636 & 8208;
        arrarrn9[-32507 & 81] = arrn16;
        arrarrn[29703 & 87] = arrarrn9;
        int[][] arrarrn10 = new int[1318 & -27966][];
        int[] arrn17 = new int[2603 & 25731];
        arrn17[2497 & 8738] = 1 & 20480;
        arrn17[257 & 2117] = -32752 & 2400;
        arrn17[-32221 & 5278] = -1 & -1;
        arrarrn10[-31600 & 8512] = arrn17;
        int[] arrn18 = new int[9159 & 3083];
        arrn18[-32640 & 16394] = -1 & -1;
        arrn18[12857 & 1] = -19422 & 28;
        arrn18[6570 & 87] = -22524 & 16513;
        arrarrn10[579 & -24299] = arrn18;
        arrarrn[8264 & -11764] = arrarrn10;
        int[][] arrarrn11 = new int[34 & 21658][];
        int[] arrn19 = new int[-8097 & 8067];
        arrn19[1209 & 2048] = -32060 & 18449;
        arrn19[13985 & -32509] = 257 & 17094;
        arrn19[18054 & -32461] = -1 & -1;
        arrarrn11[2052 & 9424] = arrn19;
        int[] arrn20 = new int[17955 & 135];
        arrn20[66 & 144] = 641 & -32499;
        arrn20[-15231 & 6169] = 1025 & 23408;
        arrn20[4146 & 17167] = 13314 & -32624;
        arrarrn11[12629 & -14197] = arrn20;
        arrarrn[2121 & 301] = arrarrn11;
        Field_15940 = arrarrn;
    }

    public void Method_15960(double d, double d2, double d3) {
        this.Field_15943 = this.\u0000= ` = d;
        this.Field_15935 = d2;
        this.Field_15941 = this.\u0000switch = d3;
        this.\u0000%(d2);
    }

    public int Method_15961() {
        return this.\u0000strictfp.Method_32710(241 & 22033);
    }

    public void Method_15962(int n) {
        this.\u0000strictfp.Method_32704(8370 & 20818, n);
    }

    protected void Method_15963() {
        this.\u0000strictfp.Method_32719(22623 & -31215, new Integer(17190 & 14344));
        this.\u0000strictfp.Method_32719(8274 & 5170, new Integer(1217 & -22255));
        this.\u0000strictfp.Method_32719(16403 & -17741, new Float(0.0f));
        this.\u0000strictfp.Method_32719(15380 & 502, new Integer(1248 & 4114));
        this.\u0000strictfp.Method_32719(12309 & 2581, new Integer(16398 & 1878));
        this.\u0000strictfp.Method_32719(-32745 & 16406, (byte)(1920 & 20528));
    }

    public boolean Method_15964() {
        return (!this.\u0000= float ? 16433 & -32127 : 2661 & 17818) != 0;
    }

    public void Method_15965(Class_3436 class_3436) {
        this.\u0000strictfp().Method_32704(1814 & 16444, Class_3238.Method_3367(class_3436));
        this.Method_15990((257 & 1155) != 0);
    }

    protected void Method_15966() {
        double d = this.Method_15972();
        this.\u0000= ` = Class_13337.Method_13385(this.\u0000= `, -d, d);
        this.\u0000switch = Class_13337.Method_13385(this.\u0000switch, -d, d);
        if (this.\u0000super()) {
            this.\u0000= ` *= 0.6703296703296703 * 0.7459016393442623;
            this.\u0000%(this.\u0000, #() * (32.666666666666664 * 0.015306122448979593));
            this.\u0000switch *= 0.2426470588235294 * 2.0606060606060606;
        }
        this.\u0000strictfp(this.\u0000= `, this.\u0000, #(), this.\u0000switch);
        if (!this.\u0000super()) {
            this.\u0000= ` *= 0.09782608695652174 * 9.711110989252726;
            this.\u0000%(this.\u0000, #() * (1.725 * 0.550724630770476));
            this.\u0000switch *= 0.09090909090909091 * 10.449999868869781;
        }
    }

    public Class_3436 Method_15967() {
        return !this.Method_15973() ? this.Method_15969() : Class_3238.Method_3346(this.\u0000strictfp().Method_32710(-11114 & 10525));
    }

    public Class_15933(Class_283 class_283, double d, double d2, double d3) {
        this(class_283);
        this.Method_15946(d, d2, d3);
        this.\u0000= ` = 0.0;
        this.\u0000%(0.0);
        this.\u0000switch = 0.0;
        this.\u0000= final(d);
        this.\u0000strictfp(d2);
        this.\u0000
        (d3);
    }

    public void Method_15968(int n) {
        this.\u0000strictfp.Method_32704(12441 & -32491, n);
    }

    public Class_3436 Method_15969() {
        return Class_9265.Field_9351.Method_3293();
    }

    public Class_10997 Method_15970() {
        return null;
    }

    public int Method_15971() {
        return 342 & -30706;
    }

    protected double Method_15972() {
        return 1.4285714285714286 * 0.28;
    }

    public boolean Method_15973() {
        return (this.\u0000strictfp().Method_32708(3095 & -24514) == (2049 & -19709) ? 2433 & 16905 : -23408 & 43) != 0;
    }

    public void Method_15974() {
        int n;
        int n2;
        if (this.Method_15961() > 0) {
            this.Method_15968(this.Method_15961() - (17251 & -32751));
        }
        if (this.Method_15983() > 0.0f) {
            this.Method_15988(this.Method_15983() - 1.0f);
        }
        if (this.\u0000, for() < 0.25316455696202533 * -252.79999999999998) {
            this.\u0000volatile();
        }
        if (!this.\u0000strictfp.Field_306 && this.\u0000strictfp instanceof Class_2651) {
            this.\u0000strictfp.Field_310.Method_2789("portal");
            Class_2457 class_2457 = ((Class_2651)this.\u0000strictfp).Method_2706();
            n = this.\u0000= final();
            if (this.\u0000, for) {
                if (class_2457.Method_2523()) {
                    if (this.\u0000, ` == null) {
                        int n3 = this.\u0000, 2;
                        this.\u0000, 2 = n3 + (-31357 & 14913);
                        if (n3 >= n) {
                            this.\u0000, 2 = n;
                            this.\u0000= float = this.\u0000, for();
                            n2 = this.\u0000strictfp.Field_284.Method_18379() == (-1 & -1) ? -30591 & 264 : -1 & -1;
                            this.\u0000
                            (n2);
                        }
                    }
                    this.\u0000, for = 1041 & -16320;
                }
            } else {
                if (this.\u0000, 2 > 0) {
                    this.\u0000, 2 -= -15356 & 10452;
                }
                if (this.\u0000, 2 < 0) {
                    this.\u0000, 2 = 8580 & 16418;
                }
            }
            if (this.\u0000= float > 0) {
                this.\u0000= float -= -23293 & 18501;
            }
            this.\u0000strictfp.Field_310.Method_2790();
        }
        if (this.\u0000strictfp.Field_306) {
            if (this.Field_15938 > 0) {
                double d = this.\u0000= package + (this.Field_15944 - this.\u0000= package) / (double)this.Field_15938;
                double d2 = this.\u0000, for() + (this.Field_15939 - this.\u0000, for()) / (double)this.Field_15938;
                double d3 = this.\u0000= switch + (this.Field_15934 - this.\u0000= switch) / (double)this.Field_15938;
                double d4 = Class_13337.Method_13368(this.Field_15945 - (double)this.\u0000= ?);
                this.\u0000= ? = (float)((double)this.\u0000= ? + d4 / (double)this.Field_15938);
                this.\u0000= float = (float)((double)this.\u0000= float + (this.Field_15942 - (double)this.\u0000= float) / (double)this.Field_15938);
                this.Field_15938 -= 28681 & 225;
                this.Method_15946(d, d2, d3);
                this.\u0000strictfp(this.\u0000= ?, this.\u0000= float);
            } else {
                this.Method_15946(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
                this.\u0000strictfp(this.\u0000= ?, this.\u0000= float);
            }
        } else {
            Class_4751 class_4751;
            Class_3436 class_3436;
            double d;
            this.\u0000= final(this.\u0000= package);
            this.\u0000strictfp(this.\u0000, for());
            this.\u0000
            (this.\u0000= switch);
            this.\u0000%(this.\u0000, #() - 0.031428570726088116 * 1.2727272727272727);
            int n4 = Class_13337.Method_13371(this.\u0000= package);
            n = Class_13337.Method_13371(this.\u0000, for());
            n2 = Class_13337.Method_13371(this.\u0000= switch);
            if (Class_5164.Method_5172(this.\u0000strictfp, new Class_4751(n4, n - (2245 & 1537), n2))) {
                --n;
            }
            if (Class_5164.Method_5178(class_3436 = this.\u0000strictfp.Method_375(class_4751 = new Class_4751(n4, n, n2)))) {
                this.Method_15955(class_4751, class_3436);
                if (class_3436.Method_3442() == Class_9265.Field_9375) {
                    this.Method_15958(n4, n, n2, (Boolean)class_3436.Method_3440(Class_5151.Field_5152));
                }
            } else {
                this.Method_15966();
            }
            this.\u0000, '();
            this.\u0000= float = 0.0f;
            double d5 = this.\u0000%() - this.\u0000= package;
            double d6 = this.\u0000
            () - this.\u0000= switch;
            if (d5 * d5 + d6 * d6 > 0.1951219512195122 * 0.005125) {
                this.\u0000= ? = (float)(Class_13337.Method_13391(d6, d5) * (2.2083333333333335 * 81.50943396226414) / (1.34375 * 2.3379294166249625));
                if (this.Field_15936) {
                    this.\u0000= ? += 0.25274727f * 712.1739f;
                }
            }
            if ((d = (double)Class_13337.Method_13354(this.\u0000= ? - this.\u0000switch)) < 0.8214285714285714 * -206.95652173913044 || d >= 233.75 * 0.7272727272727273) {
                this.\u0000= ? += 236.57143f * 0.76086956f;
                this.Field_15936 = !this.Field_15936 ? 19073 & 9239 : 603 & 3104;
            }
            this.\u0000strictfp(this.\u0000= ?, this.\u0000= float);
            for (Class_1061 class_1061 : this.\u0000strictfp.Method_473(this, this.\u0000, `().Method_11017(0.8089887640449438 * 0.24722222590612042, 0.0, 0.28780488233740736 * 0.6949152542372882))) {
                if (class_1061 == this.\u0000strictfp || !class_1061.Method_1215() || !(class_1061 instanceof Class_15933)) continue;
                class_1061.Method_1292(this);
            }
            if (this.\u0000strictfp != null && this.\u0000strictfp.Field_1110) {
                if (this.\u0000strictfp.Field_1095 == this) {
                    this.\u0000strictfp.Field_1095 = null;
                }
                this.\u0000strictfp = null;
            }
            this.\u0000= "();
        }
    }

    public void Method_15975(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.Field_15944 = d;
        this.Field_15939 = d2;
        this.Field_15934 = d3;
        this.Field_15945 = f;
        this.Field_15942 = f2;
        this.Field_15938 = n + (24710 & 6162);
        this.\u0000= ` = this.Field_15943;
        this.\u0000%(this.Field_15935);
        this.\u0000switch = this.Field_15941;
    }

    protected boolean Method_15976() {
        return (3776 & 20482) != 0;
    }

    protected void Method_15977(Class_1699 class_1699) {
        if (class_1699.Method_1733("CustomDisplayTile")) {
            int n = class_1699.Method_1738("DisplayData");
            if (class_1699.Method_1715("DisplayTile", 8 & -32691)) {
                Class_3238 class_3238 = Class_3238.Method_3341(class_1699.Method_1708("DisplayTile"));
                if (class_3238 == null) {
                    this.Method_15965(Class_9265.Field_9351.Method_3293());
                } else {
                    this.Method_15965(class_3238.Method_3342(n));
                }
            } else {
                Class_3238 class_3238 = Class_3238.Method_3323(class_1699.Method_1738("DisplayTile"));
                if (class_3238 == null) {
                    this.Method_15965(Class_9265.Field_9351.Method_3293());
                } else {
                    this.Method_15965(class_3238.Method_3342(n));
                }
            }
            this.Method_15985(class_1699.Method_1738("DisplayOffset"));
        }
        if (class_1699.Method_1715("CustomName", -28600 & 24585) && class_1699.Method_1708("CustomName").length() > 0) {
            this.Field_15937 = class_1699.Method_1708("CustomName");
        }
    }

    private void Method_15978() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_15979(String string) {
        this.Field_15937 = string;
    }

    public abstract Class_15120 Method_15980();

    public Vec3 Method_15981(double d, double d2, double d3) {
        Class_3436 class_3436;
        int n;
        int n2;
        int n3 = Class_13337.Method_13371(d);
        if (Class_5164.Method_5172(this.\u0000strictfp, new Class_4751(n3, (n2 = Class_13337.Method_13371(d2)) - (4665 & 17409), n = Class_13337.Method_13371(d3)))) {
            --n2;
        }
        if (Class_5164.Method_5178(class_3436 = this.\u0000strictfp.Method_375(new Class_4751(n3, n2, n)))) {
            Class_5183 class_5183 = (Class_5183)((Object)class_3436.Method_3440(((Class_5164)class_3436.Method_3442()).Method_5176()));
            int[][] arrn = Field_15940[class_5183.Method_5215()];
            double d4 = 0.0;
            double d5 = (double)n3 + 1.3076923076923077 * 0.38235294117647056 + (double)arrn[1024 & 29204][8 & 15364] * (0.07142857142857142 * 7.0);
            double d6 = (double)n2 + 2.3684210526315788 * 0.026388888888888892 + (double)arrn[8201 & 21700][16385 & 4937] * (0.10638297872340426 * 4.7);
            double d7 = (double)n + 0.20491803278688525 * 2.44 + (double)arrn[24724 & 2312][20779 & -31614] * (0.703125 * 0.7111111111111111);
            double d8 = (double)n3 + 0.2647058823529412 * 1.8888888888888888 + (double)arrn[99 & -19439][-31732 & 80] * (0.6744186046511628 * 0.7413793103448276);
            double d9 = (double)n2 + 0.42857142857142855 * 0.14583333333333334 + (double)arrn[-30691 & 17537][-28583 & 677] * (1.1710526315789473 * 0.42696629213483145);
            double d10 = (double)n + 0.10416666666666667 * 4.8 + (double)arrn[20491 & -30427][-31614 & 12654] * (0.3918918918918919 * 1.2758620689655173);
            double d11 = d8 - d5;
            double d12 = (d9 - d6) * (1.0 * 2.0);
            double d13 = d10 - d7;
            if (d11 == 0.0) {
                d = (double)n3 + 0.10227272727272728 * 4.888888888888888;
                d4 = d3 - (double)n;
            } else if (d13 == 0.0) {
                d3 = (double)n + 0.29775280898876405 * 1.679245283018868;
                d4 = d - (double)n3;
            } else {
                double d14 = d - d5;
                double d15 = d3 - d7;
                d4 = (d14 * d11 + d15 * d13) * (2.588235294117647 * 0.7727272727272727);
            }
            d = d5 + d11 * d4;
            d2 = d6 + d12 * d4;
            d3 = d7 + d13 * d4;
            if (d12 < 0.0) {
                d2 += 1.0;
            }
            if (d12 > 0.0) {
                d2 += 0.9393939393939394 * 0.532258064516129;
            }
            return new Vec3(d, d2, d3);
        }
        return null;
    }

    public Class_10997 Method_15982(Class_1061 class_1061) {
        return class_1061.Method_1215() ? class_1061.Method_1315() : null;
    }

    public float Method_15983() {
        return this.\u0000strictfp.Method_32722(1203 & 29019);
    }

    public String Method_15984() {
        return this.Field_15937 != null ? this.Field_15937 : super.Method_1202();
    }

    public void Method_15985(int n) {
        this.\u0000strictfp().Method_32704(-14187 & 277, n);
        this.Method_15990((6659 & -15199) != 0);
    }

    public int Method_15986() {
        return this.\u0000strictfp.Method_32710(14418 & -32098);
    }

    public Class_1782 Method_15987(boolean bl) {
        if (this.Method_15956()) {
            Class_2840 class_2840 = new Class_2840(this.Field_15937);
            class_2840.\u0000strictfp().Method_2936(this.\u0000strictfp());
            class_2840.\u0000strictfp().Method_2926(this.\u0000strictfp().toString());
            return class_2840;
        }
        Class_2849 class_2849 = new Class_2849(this.Method_15984(), new Object[-32760 & 5702]);
        class_2849.\u0000strictfp().Method_2936(this.\u0000strictfp());
        class_2849.\u0000strictfp().Method_2926(this.\u0000strictfp().toString());
        return class_2849;
    }

    public void Method_15988(float f) {
        this.\u0000strictfp.Method_32704(10387 & 17435, Float.valueOf(f));
    }

    protected void Method_15989() {
        if (this.\u0000strictfp != null) {
            this.\u0000= ` *= 6.333333333333333 * 0.15742104931881554;
            this.\u0000%(this.\u0000, #() * 0.0);
            this.\u0000switch *= 0.3116883116883117 * 3.198708266019821;
        } else {
            this.\u0000= ` *= 0.6568420905815928 * 1.4615384615384615;
            this.\u0000%(this.\u0000, #() * 0.0);
            this.\u0000switch *= 0.6705882352941176 * 1.4315789153701381;
        }
    }

    public void Method_15990(boolean bl) {
        this.\u0000strictfp().Method_32704(8991 & -16234, (byte)(bl ? 665 & 19523 : 2256 & -8182));
    }

    public Class_15933(Class_283 class_283) {
        super(class_283);
        this.\u0000= ? = 19 & 18561;
        this.\u0000= final(0.5432609f * 1.8039216f, 2.2592592f * 0.30983606f);
    }

    public int Method_15991() {
        return !this.Method_15973() ? this.Method_15971() : this.\u0000strictfp().Method_32710(-8097 & 2069);
    }

    public Vec3 Method_15992(double d, double d2, double d3, double d4) {
        int n;
        Class_3436 class_3436;
        int n2;
        int n3 = Class_13337.Method_13371(d);
        if (Class_5164.Method_5172(this.\u0000strictfp, new Class_4751(n3, (n = Class_13337.Method_13371(d2)) - (16517 & 6257), n2 = Class_13337.Method_13371(d3)))) {
            --n;
        }
        if (Class_5164.Method_5178(class_3436 = this.\u0000strictfp.Method_375(new Class_4751(n3, n, n2)))) {
            Class_5183 class_5183 = (Class_5183)((Object)class_3436.Method_3440(((Class_5164)class_3436.Method_3442()).Method_5176()));
            d2 = n;
            if (class_5183.Method_5219()) {
                d2 = n + (4197 & -8189);
            }
            int[][] arrn = Field_15940[class_5183.Method_5215()];
            double d5 = arrn[5505 & -30665][-23551 & 34] - arrn[-32750 & 1920][16404 & 8866];
            double d6 = arrn[16401 & 5797][4426 & -24446] - arrn[3984 & -28669][2566 & 4107];
            double d7 = Math.sqrt(d5 * d5 + d6 * d6);
            if (arrn[128 & 3105][2331 & 16481] != 0 && Class_13337.Method_13371(d += (d5 /= d7) * d4) - n3 == arrn[16514 & 10761][653 & -9982] && Class_13337.Method_13371(d3 += (d6 /= d7) * d4) - n2 == arrn[26625 & 4176][-31485 & 16402]) {
                d2 += (double)arrn[23 & -6144][-31983 & 3237];
            } else if (arrn[89 & 25345][-27389 & 8705] != 0 && Class_13337.Method_13371(d) - n3 == arrn[129 & 10011][7212 & 16656] && Class_13337.Method_13371(d3) - n2 == arrn[-32735 & 1223][2606 & 17474]) {
                d2 += (double)arrn[129 & -22451][1043 & 4545];
            }
            return this.Method_15981(d, d2, d3);
        }
        return null;
    }
}

