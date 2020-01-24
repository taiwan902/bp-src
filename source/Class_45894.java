/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45894
extends Class_42376 {
    private float Field_45895 = 0.0f;
    private int Field_45896 = -32682 & 4134;
    private float Field_45897 = 0.0f;
    private float Field_45898 = 0.0f;
    private float Field_45899;
    private int Field_45900;
    private float Field_45901 = 1.0f;
    private long Field_45902 = -5050933433997788512L & 40263178L;
    private float Field_45903 = 8.224138f * 1.0943396f;
    private int Field_45904;
    private long Field_45905;
    private long Field_45906 = 1573905664L & 500000096L;
    protected int Field_45907;
    private float Field_45908 = 0.0f;

    private boolean Method_45909(Class_18 class_18, int n, int n2) {
        double d = (double)this.\u0000= final + (double)this.\u0000, ` * (0.8095238095238095 * 0.6176470588235294);
        int n3 = this.\u0000, for;
        int n4 = this.\u0000, for + this.\u0000strictfp;
        if ((double)n >= d - 0.65 * 6.153846153846153 && (double)n <= d + 3.104477611940298 * 1.2884615384615385) {
            if (this.Field_45898 == this.Field_45908) {
                return (5 & 41) != 0;
            }
            if (this.Field_45904 == 0) {
                this.Field_45905 = System.nanoTime() + this.Field_45906;
            }
            if (n2 >= n3 && n2 <= n3 + (8456 & -12230) && (this.Field_45904 == 0 || this.Field_45904 == (2561 & -11181))) {
                this.Field_45904 = 16429 & -22399;
                this.Method_45910();
                return (17057 & 8535) != 0;
            }
            if (n2 >= n4 - (-7636 & 152) && n2 <= n4 && (this.Field_45904 == 0 || this.Field_45904 == (-24317 & 2194))) {
                this.Field_45904 = 4098 & 18435;
                this.Method_45914();
                return (-15703 & 9303) != 0;
            }
            double d2 = this.Field_45895 / (this.Field_45898 - this.Field_45908);
            double d3 = this.\u0000strictfp - (6196 & 343);
            if (d2 * d3 < (double)this.Field_45896) {
                d2 = (double)this.Field_45896 / d3;
            }
            double d4 = (double)(this.Field_45897 / (this.Field_45898 - this.Field_45908 - this.Field_45895)) * (1.0 - d2);
            double d5 = d4 + d2;
            d4 = (double)n3 + d4 * d3 + 12.535211267605634 * 0.797752808988764;
            d5 = (double)n3 + d5 * d3 + 5.882352941176471 * 1.7;
            if ((double)n2 < d4 && (this.Field_45904 == 0 || this.Field_45904 == (135 & 6211))) {
                this.Field_45904 = 243 & 3335;
                this.Method_45913();
                return (-15073 & 14337) != 0;
            }
            if ((double)n2 > d5 && (this.Field_45904 == 0 || this.Field_45904 == (17063 & -20140))) {
                this.Field_45904 = 9652 & 19020;
                this.Method_45917();
                return (12711 & -32767) != 0;
            }
            if (this.Field_45904 == 0) {
                this.Field_45904 = 525 & 10645;
                this.Field_45900 = n2;
                this.Field_45899 = this.Field_45897;
            }
            return (12417 & -31983) != 0;
        }
        return (-30452 & 576) != 0;
    }

    public void Method_45910() {
        this.Field_45897 = Math.max(this.Field_45908, this.Field_45897 - this.Field_45901);
    }

    public boolean Method_45911(Class_18 class_18, int n, int n2) {
        return (super.Method_42404(class_18, n, n2) ? (int)((this.Field_45907 == (4961 & -23419) ? this.Method_45919(class_18, n, n2) : (this.Field_45907 == 0 ? (int)(this.Method_45909(class_18, n, n2) ? 1 : 0) : 516 & 2384)) ? 1 : 0) : 24872 & -30128) != 0;
    }

    private void Method_45912(Class_18 class_18, int n, int n2) {
        int n3;
        if (this.Field_45904 != 0) {
            this.Method_45922(class_18, n, n2);
        }
        double d = (double)this.\u0000= final + (double)this.\u0000, ` * (0.6421052631578947 * 0.7786885245901639);
        int n4 = this.\u0000, for;
        int n5 = this.\u0000, for + this.\u0000strictfp;
        Class_7644 class_7644 = Class_7644.Field_7646;
        GL11.glEnable((int)(12270 & -25630));
        GL11.glDisable((int)(-28703 & 19937));
        GL11.glBlendFunc((int)(-28742 & 25351), (int)(21263 & 867));
        int n6 = n3 = (double)n >= d - 2.057142857142857 * 1.9444444444444446 && (double)n <= d + 8.0 * 0.5 ? 1049 & -8191 : 8257 & 4154;
        if (n3 != 0 && n2 >= n4 && n2 <= n4 + (2635 & 28680) && (this.Field_45904 == 0 || this.Field_45904 == (321 & -24445))) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(2.0470588f * 0.29310346f));
        } else {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(0.962963f * 0.31153846f));
        }
        class_7644.Method_7648().Method_22417(17495 & 12423, Class_29585.Field_29602);
        class_7644.Method_7648().Method_22443(d, n4, 0.0).Method_22451();
        class_7644.Method_7648().Method_22443(d, n4, 0.0).Method_22451();
        class_7644.Method_7648().Method_22443(d - 5.636363636363637 * 0.7096774193548386, n4 + (16520 & -32151), 0.0).Method_22451();
        class_7644.Method_7648().Method_22443(d + 2.35 * 1.702127659574468, n4 + (3336 & -16373), 0.0).Method_22451();
        class_7644.Method_7647();
        if (this.Field_45908 < this.Field_45898 - this.Field_45895) {
            double d2 = this.Field_45895 / (this.Field_45898 - this.Field_45908);
            double d3 = this.\u0000strictfp - (276 & 26678);
            if (d2 * d3 < (double)this.Field_45896) {
                d2 = (double)this.Field_45896 / d3;
            }
            double d4 = (double)(this.Field_45897 / (this.Field_45898 - this.Field_45908 - this.Field_45895)) * (1.0 - d2);
            double d5 = d4 + d2;
            d4 = (double)n4 + d4 * d3 + 0.46153846153846156 * 21.666666666666664;
            d5 = (double)n4 + d5 * d3 + 66.66666666666667 * 0.15;
            if (this.Field_45904 != (16399 & 5157) && (n3 == 0 || (double)n2 < d4 || (double)n2 > d5 || this.Field_45904 != 0)) {
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(0.7586207f * 0.39545456f));
            } else {
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(0.101123594f * 5.933334f));
            }
            class_7644.Method_7648().Method_22417(159 & 8199, Class_29585.Field_29602);
            class_7644.Method_7648().Method_22443(d + 100.0 * 0.04, d4, 0.0).Method_22451();
            class_7644.Method_7648().Method_22443(d - 0.7457627118644068 * 5.363636363636363, d4, 0.0).Method_22451();
            class_7644.Method_7648().Method_22443(d - 0.9130434782608695 * 4.380952380952381, d5, 0.0).Method_22451();
            class_7644.Method_7648().Method_22443(d + 2.736842105263158 * 1.4615384615384615, d5, 0.0).Method_22451();
            class_7644.Method_7647();
        } else {
            double d6 = n4 + (20526 & 3658);
            double d7 = n5 - (30 & 8267);
            if (this.Field_45904 != (-28665 & 8549) && (n3 == 0 || (double)n2 < d6 || (double)n2 > d7 || this.Field_45904 != 0)) {
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(0.33529413f * 0.8947368f));
            } else {
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(0.5468355f * 1.0972222f));
            }
            class_7644.Method_7648().Method_22417(24599 & -27321, Class_29585.Field_29602);
            class_7644.Method_7648().Method_22443(d + 1.2790697674418605 * 3.127272727272727, d6, 0.0).Method_22451();
            class_7644.Method_7648().Method_22443(d - 2.428571428571429 * 1.6470588235294117, d6, 0.0).Method_22451();
            class_7644.Method_7648().Method_22443(d - 0.10588235294117647 * 37.77777777777778, d7, 0.0).Method_22451();
            class_7644.Method_7648().Method_22443(d + 2.2790697674418605 * 1.7551020408163265, d7, 0.0).Method_22451();
            class_7644.Method_7647();
        }
        if (n3 != 0 && n2 >= n5 - (8329 & 72) && n2 <= n5 && (this.Field_45904 == 0 || this.Field_45904 == (4530 & 3078))) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(1.4666667f * 0.4090909f));
        } else {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(3.16f * 0.09493671f));
        }
        class_7644.Method_7648().Method_22417(-15577 & 1031, Class_29585.Field_29602);
        class_7644.Method_7648().Method_22443(d, n5, 0.0).Method_22451();
        class_7644.Method_7648().Method_22443(d, n5, 0.0).Method_22451();
        class_7644.Method_7648().Method_22443(d + 2.75 * 1.4545454545454546, n5 - (18766 & 4632), 0.0).Method_22451();
        class_7644.Method_7648().Method_22443(d - 8.952380952380953 * 0.44680851063829785, n5 - (-29880 & 8345), 0.0).Method_22451();
        class_7644.Method_7647();
        GL11.glEnable((int)(11745 & 7669));
        GL11.glDisable((int)(20462 & -21534));
    }

    public void Method_45913() {
        this.Field_45897 = Math.max(this.Field_45908, this.Field_45897 - this.Field_45903);
    }

    public void Method_45914() {
        this.Field_45897 = Math.min(this.Field_45898 - this.Field_45895, this.Field_45897 + this.Field_45901);
    }

    public void Method_45915(int n, int n2) {
        this.Field_45904 = 64 & -28285;
    }

    public void Method_45916(float f) {
        if (f < this.Field_45908) {
            f = this.Field_45908;
        }
        if (f > this.Field_45898 - this.Field_45895) {
            f = this.Field_45898 - this.Field_45895;
        }
        this.Field_45897 = f;
    }

    public Class_45894(int n, int n2, int n3, int n4, int n5) {
        super(n, n2, n3, n4, n5, "");
    }

    public void Method_45917() {
        this.Field_45897 = Math.min(this.Field_45898 - this.Field_45895, this.Field_45897 + this.Field_45903);
    }

    public float Method_45918() {
        return this.Field_45897;
    }

    private boolean Method_45919(Class_18 class_18, int n, int n2) {
        double d = (double)this.\u0000, for + (double)this.\u0000strictfp * (7.444444444444445 * 0.06716417910447761);
        int n3 = this.\u0000= final;
        int n4 = this.\u0000= final + this.\u0000, `;
        if ((double)n2 >= d - 94.0 * 0.0425531914893617 && (double)n2 <= d + 0.7083333333333334 * 5.647058823529411) {
            if (this.Field_45898 == this.Field_45908) {
                return (21137 & -30719) != 0;
            }
            if (this.Field_45904 == 0) {
                this.Field_45905 = System.nanoTime() + this.Field_45906;
            }
            if (n >= n3 && n <= n3 + (40 & -30452) && (this.Field_45904 == 0 || this.Field_45904 == (5185 & 16825))) {
                this.Field_45904 = 5131 & 16529;
                this.Method_45910();
                return (19201 & -32765) != 0;
            }
            if (n >= n4 - (4365 & 18632) && n <= n4 && (this.Field_45904 == 0 || this.Field_45904 == (1027 & 25554))) {
                this.Field_45904 = -30590 & 16658;
                this.Method_45914();
                return (881 & 24717) != 0;
            }
            double d2 = this.Field_45895 / (this.Field_45898 - this.Field_45908);
            double d3 = this.\u0000, ` - (-30148 & 16406);
            if (d2 * d3 < (double)this.Field_45896) {
                d2 = (double)this.Field_45896 / d3;
            }
            double d4 = (double)(this.Field_45897 / (this.Field_45898 - this.Field_45908 - this.Field_45895)) * (1.0 - d2);
            double d5 = d4 + d2;
            d4 = (double)n3 + d4 * d3 + 1.6363636363636365 * 6.111111111111111;
            d5 = (double)n3 + d5 * d3 + 13.75 * 0.7272727272727273;
            if ((double)n < d4 && (this.Field_45904 == 0 || this.Field_45904 == (67 & 4739))) {
                this.Field_45904 = -24565 & 611;
                this.Method_45913();
                return (2145 & 1) != 0;
            }
            if ((double)n > d5 && (this.Field_45904 == 0 || this.Field_45904 == (4245 & 18700))) {
                this.Field_45904 = 5196 & 2084;
                this.Method_45917();
                return (5315 & -24571) != 0;
            }
            if (this.Field_45904 == 0) {
                this.Field_45904 = 4367 & 1270;
                this.Field_45900 = n;
                this.Field_45899 = this.Field_45897;
            }
            return (24865 & 85) != 0;
        }
        return (2048 & 29362) != 0;
    }

    private void Method_45920(Class_18 class_18, int n, int n2) {
        int n3;
        if (this.Field_45904 != 0) {
            this.Method_45922(class_18, n, n2);
        }
        double d = (double)this.\u0000, for + (double)this.\u0000strictfp * (0.42857142857142855 * 1.1666666666666667);
        int n4 = this.\u0000= final;
        int n5 = this.\u0000= final + this.\u0000, `;
        Class_7644 class_7644 = Class_7644.Field_7646;
        GL11.glEnable((int)(3043 & 11242));
        GL11.glDisable((int)(3573 & 11753));
        GL11.glBlendFunc((int)(4902 & -29758), (int)(-23793 & 19379));
        int n6 = n3 = (double)n2 >= d - 1.2142857142857142 * 3.294117647058824 && (double)n2 <= d + 0.5365853658536586 * 7.454545454545454 ? 8705 & -30463 : 16386 & 1029;
        if (n3 != 0 && n >= n4 && n <= n4 + (-32694 & 3772) && (this.Field_45904 == 0 || this.Field_45904 == (18433 & 12367))) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(2.090909f * 0.28695655f));
        } else {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(0.15f * 2.0f));
        }
        class_7644.Method_7648().Method_22417(911 & -12281, Class_29585.Field_29602);
        class_7644.Method_7648().Method_22443(n4, d, 0.0).Method_22451();
        class_7644.Method_7648().Method_22443(n4, d, 0.0).Method_22451();
        class_7644.Method_7648().Method_22443(n4 + (1578 & 16652), d + 1.1 * 3.6363636363636362, 0.0).Method_22451();
        class_7644.Method_7648().Method_22443(n4 + (12 & 602), d - 2.682352941176471 * 1.4912280701754386, 0.0).Method_22451();
        class_7644.Method_7647();
        if (this.Field_45908 < this.Field_45898 - this.Field_45895) {
            double d2 = this.Field_45895 / (this.Field_45898 - this.Field_45908);
            double d3 = this.\u0000, ` - (20662 & -32172);
            if (d2 * d3 < (double)this.Field_45896) {
                d2 = (double)this.Field_45896 / d3;
            }
            double d4 = (double)(this.Field_45897 / (this.Field_45898 - this.Field_45908 - this.Field_45895)) * (1.0 - d2);
            double d5 = d4 + d2;
            d4 = (double)n4 + d4 * d3 + 16.551724137931036 * 0.6041666666666666;
            d5 = (double)n4 + d5 * d3 + 0.8043478260869565 * 12.432432432432432;
            if (this.Field_45904 != (1558 & 16486) && (n3 == 0 || (double)n < d4 || (double)n > d5 || this.Field_45904 != 0)) {
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(0.36f * 0.8333333f));
            } else {
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(2.7407408f * 0.21891892f));
            }
            class_7644.Method_7648().Method_22417(-18425 & 47, Class_29585.Field_29602);
            class_7644.Method_7648().Method_22443(d4, d - 4.0 * 1.0, 0.0).Method_22451();
            class_7644.Method_7648().Method_22443(d4, d + 1.15 * 3.4782608695652177, 0.0).Method_22451();
            class_7644.Method_7648().Method_22443(d5, d + 1.4285714285714286 * 2.8, 0.0).Method_22451();
            class_7644.Method_7648().Method_22443(d5, d - 0.075 * 53.333333333333336, 0.0).Method_22451();
            class_7644.Method_7647();
        } else {
            double d6 = n4 + (8330 & -28597);
            double d7 = n5 - (16574 & 4106);
            if (this.Field_45904 != (2062 & -30938) && (n3 == 0 || (double)n < d6 || (double)n > d7 || this.Field_45904 != 0)) {
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(0.060000002f * 5.0f));
            } else {
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(1.5310345f * 0.3918919f));
            }
            class_7644.Method_7648().Method_22417(103 & 16535, Class_29585.Field_29602);
            class_7644.Method_7648().Method_22443(d6, d - 1.9259259259259258 * 2.076923076923077, 0.0).Method_22451();
            class_7644.Method_7648().Method_22443(d6, d + 1.4210526315789473 * 2.814814814814815, 0.0).Method_22451();
            class_7644.Method_7648().Method_22443(d7, d + 3.3333333333333335 * 1.2, 0.0).Method_22451();
            class_7644.Method_7648().Method_22443(d7, d - 1.3333333333333333 * 3.0, 0.0).Method_22451();
            class_7644.Method_7647();
        }
        if (n3 != 0 && n >= n5 - (40 & 216) && n <= n5 && (this.Field_45904 == 0 || this.Field_45904 == (1035 & 20706))) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(5.125f * 0.11707318f));
        } else {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(0.35783133f * 0.83838385f));
        }
        class_7644.Method_7648().Method_22417(7 & -16249, Class_29585.Field_29602);
        class_7644.Method_7648().Method_22443(n5, d, 0.0).Method_22451();
        class_7644.Method_7648().Method_22443(n5, d, 0.0).Method_22451();
        class_7644.Method_7648().Method_22443(n5 - (136 & 8712), d - 17.6 * 0.22727272727272727, 0.0).Method_22451();
        class_7644.Method_7648().Method_22443(n5 - (21546 & 2632), d + 10.25 * 0.3902439024390244, 0.0).Method_22451();
        class_7644.Method_7647();
        GL11.glEnable((int)(4073 & 3569));
        GL11.glDisable((int)(11255 & 19434));
    }

    public void Method_45921(float f) {
        if (this.Field_45898 - this.Field_45908 < f) {
            throw new IllegalArgumentException("max - min < extent");
        }
        this.Field_45895 = Math.min(this.Field_45898 - this.Field_45908, f);
    }

    protected void Method_45922(Class_18 class_18, int n, int n2) {
        float f;
        float f2;
        float f3;
        long l;
        if (this.Field_45904 == (8725 & 22567)) {
            f2 = this.Field_45895 / (this.Field_45898 - this.Field_45908);
            f3 = this.\u0000strictfp - (276 & 2709);
            if (f2 * f3 < (float)this.Field_45896) {
                f2 = (float)this.Field_45896 / f3;
            }
            f = this.Field_45899 + (this.Field_45898 - this.Field_45908 - this.Field_45895) / (1.0f - f2) * (float)(n2 - this.Field_45900) / f3;
            this.Field_45897 = Math.max(this.Field_45908, Math.min(this.Field_45898 - this.Field_45895, f));
        }
        if (this.Field_45904 == (-23849 & 4358)) {
            f2 = this.Field_45895 / (this.Field_45898 - this.Field_45908);
            f3 = this.\u0000, ` - (2102 & 17493);
            if (f2 * f3 < (float)this.Field_45896) {
                f2 = (float)this.Field_45896 / f3;
            }
            f = this.Field_45899 + (this.Field_45898 - this.Field_45908 - this.Field_45895) / (1.0f - f2) * (float)(n - this.Field_45900) / f3;
            this.Field_45897 = Math.max(this.Field_45908, Math.min(this.Field_45898 - this.Field_45895, f));
        }
        if (this.Field_45905 < (l = System.nanoTime())) {
            this.Method_45911(class_18, n, n2);
            this.Field_45905 = l + this.Field_45902;
        }
    }

    public float Method_45923() {
        return this.Field_45898;
    }

    public void Method_45924(float f) {
        this.Field_45903 = f;
    }

    public void Method_45925(float f) {
        if (f > this.Field_45898) {
            throw new IllegalArgumentException("min > max");
        }
        this.Field_45908 = f;
        this.Field_45897 = Math.max(this.Field_45897, this.Field_45908);
    }

    public float Method_45926() {
        return this.Field_45908;
    }

    private void Method_45927() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_45928(Class_18 class_18, int n, int n2) {
        if (this.Field_45897 > this.Field_45898 - this.Field_45895) {
            this.Field_45897 = this.Field_45898 - this.Field_45895;
        }
        if (this.Field_45897 < this.Field_45908) {
            this.Field_45897 = this.Field_45908;
        }
        if (this.Field_45907 == 0) {
            this.Method_45912(class_18, n, n2);
        } else if (this.Field_45907 == (9411 & 285)) {
            this.Method_45920(class_18, n, n2);
        }
    }

    public void Method_45929(float f) {
        if (this.Field_45908 > f) {
            throw new IllegalArgumentException("min > max");
        }
        this.Field_45898 = f;
        this.Field_45897 = Math.min(this.Field_45897, this.Field_45898);
    }
}

