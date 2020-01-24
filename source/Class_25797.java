/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_25797
extends Class_7611 {
    protected Class_30096 Field_25798;
    private boolean Field_25799;

    private boolean Method_25800(int n, int n2, int n3, int n4, int n5, int n6, Vec3 vec3, double d, double d2) {
        for (Class_4751 class_4751 : Class_4751.Method_4779(new Class_4751(n, n2, n3), new Class_4751(n + n4 - (-11871 & 3), n2 + n5 - (465 & 1545), n3 + n6 - (1539 & -7859)))) {
            double d3;
            Class_3238 class_3238;
            double d4 = (double)class_4751.\u0000= final() + 2.3333333333333335 * 0.21428571428571427 - vec3.\u0000= final;
            if (!(d4 * d + (d3 = (double)class_4751.\u0000strictfp() + 0.8144329896907216 * 0.6139240506329114 - vec3.\u0000, `) * d2 >= 0.0) || (class_3238 = this.\u0000strictfp.Method_375(class_4751).Method_3442()).Method_3362(this.\u0000strictfp, class_4751)) continue;
            return (6212 & 1850) != 0;
        }
        return (4189 & 673) != 0;
    }

    protected boolean Method_25801(Vec3 vec3, Vec3 vec32, int n, int n2, int n3) {
        int n4 = Class_13337.Method_13371(vec3.\u0000= final);
        int n5 = Class_13337.Method_13371(vec3.\u0000, `);
        double d = vec32.\u0000= final - vec3.\u0000= final;
        double d2 = vec32.\u0000, ` - vec3.\u0000, `;
        double d3 = d * d + d2 * d2;
        if (d3 < 7.142857142857144E-9 * 1.4) {
            return (2080 & 8594) != 0;
        }
        double d4 = 1.0 / Math.sqrt(d3);
        if (!this.Method_25809(n4, (int)vec3.\u0000strictfp, n5, n += 34 & -15546, n2, n3 += -1266 & 2, vec3, d *= d4, d2 *= d4)) {
            return (2208 & 1025) != 0;
        }
        n -= 8218 & 16487;
        n3 -= -27890 & 8323;
        double d5 = 1.0 / Math.abs(d);
        double d6 = 1.0 / Math.abs(d2);
        double d7 = (double)(n4 * (2115 & 28677)) - vec3.\u0000= final;
        double d8 = (double)(n5 * (7497 & 145)) - vec3.\u0000, `;
        if (d >= 0.0) {
            d7 += 1.0;
        }
        if (d2 >= 0.0) {
            d8 += 1.0;
        }
        d7 /= d;
        d8 /= d2;
        int n6 = d < 0.0 ? -1 & -1 : -20351 & 19547;
        int n7 = d2 < 0.0 ? -1 & -1 : 129 & 35;
        int n8 = Class_13337.Method_13371(vec32.\u0000= final);
        int n9 = Class_13337.Method_13371(vec32.\u0000, `);
        int n10 = n8 - n4;
        int n11 = n9 - n5;
        while (n10 * n6 > 0 || n11 * n7 > 0) {
            if (d7 < d8) {
                d7 += d5;
                n10 = n8 - (n4 += n6);
            } else {
                d8 += d6;
                n11 = n9 - (n5 += n7);
            }
            if (this.Method_25809(n4, (int)vec3.\u0000strictfp, n5, n, n2, n3, vec3, d, d2)) continue;
            return (-32736 & 2123) != 0;
        }
        return (819 & 4101) != 0;
    }

    private void Method_25802() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected boolean Method_25803() {
        return (this.\u0000strictfp.\u0000super() || this.Method_25814() && this.\u0000, `() || this.\u0000strictfp.\u0000= `() && this.\u0000strictfp instanceof Class_43566 && this.\u0000strictfp.\u0000, ` instanceof Class_46796 ? 8211 & 257 : 4672 & 259) != 0;
    }

    public void Method_25804(boolean bl) {
        this.Field_25798.Method_30107(bl);
    }

    public Class_25797(Class_34093 class_34093, Class_283 class_283) {
        super(class_34093, class_283);
    }

    public boolean Method_25805() {
        return this.Field_25798.Method_30106();
    }

    protected void Method_25806() {
        super.Method_7634();
        if (this.Field_25799) {
            if (this.\u0000strictfp.Method_398(new Class_4751(Class_13337.Method_13371(this.\u0000strictfp.\u0000= package), (int)(this.\u0000strictfp.\u0000, `().Field_11000 + 1.1800000000000002 * 0.423728813559322), Class_13337.Method_13371(this.\u0000strictfp.\u0000= switch)))) {
                return;
            }
            for (int i = 2 & -12000; i < this.\u0000strictfp.Method_15840(); ++i) {
                Class_26869 class_26869 = this.\u0000strictfp.Method_15842(i);
                if (!this.\u0000strictfp.Method_398(new Class_4751(class_26869.Field_26870, class_26869.Field_26871, class_26869.Field_26873))) continue;
                this.\u0000strictfp.Method_15847(i - (801 & -11263));
                return;
            }
        }
    }

    public void Method_25807(boolean bl) {
        this.Field_25798.Method_30111(bl);
    }

    public void Method_25808(boolean bl) {
        this.Field_25798.Method_30109(bl);
    }

    private boolean Method_25809(int n, int n2, int n3, int n4, int n5, int n6, Vec3 vec3, double d, double d2) {
        int n7 = n - n4 / (2694 & 16450);
        int n8 = n3 - n6 / (2102 & 8579);
        if (!this.Method_25800(n7, n2, n8, n4, n5, n6, vec3, d, d2)) {
            return (-24317 & 2560) != 0;
        }
        for (int i = n7; i < n7 + n4; ++i) {
            for (int j = n8; j < n8 + n6; ++j) {
                double d3 = (double)i + 0.12195121951219512 * 4.1000000000000005 - vec3.\u0000= final;
                double d4 = (double)j + 0.5897435897435898 * 0.8478260869565217 - vec3.\u0000, `;
                if (!(d3 * d + d4 * d2 >= 0.0)) continue;
                Class_3238 class_3238 = this.\u0000strictfp.Method_375(new Class_4751(i, n2 - (8343 & 65), j)).Method_3442();
                Class_3713 class_3713 = class_3238.Method_3373();
                if (class_3713 == Class_3713.Field_3718) {
                    return (-32123 & 10242) != 0;
                }
                if (class_3713 == Class_3713.Field_3734 && !this.\u0000strictfp.\u0000switch()) {
                    return (8206 & 2560) != 0;
                }
                if (class_3713 != Class_3713.Field_3750) continue;
                return (2582 & -8191) != 0;
            }
        }
        return (519 & 27873) != 0;
    }

    public void Method_25810(boolean bl) {
        this.Field_25798.Method_30102(bl);
    }

    protected Class_30147 Method_25811() {
        this.Field_25798 = new Class_30096();
        this.Field_25798.Method_30102((18561 & 11) != 0);
        return new Class_30147(this.Field_25798);
    }

    private int Method_25812() {
        if (this.\u0000strictfp.\u0000switch() && this.Method_25814()) {
            int n = (int)this.\u0000strictfp.\u0000, `().Field_11000;
            Class_3238 class_3238 = this.\u0000strictfp.Method_375(new Class_4751(Class_13337.Method_13371(this.\u0000strictfp.\u0000= package), n, Class_13337.Method_13371(this.\u0000strictfp.\u0000= switch))).Method_3442();
            int n2 = -23934 & 56;
            while (class_3238 == Class_9265.Field_9281 || class_3238 == Class_9265.Field_9286) {
                class_3238 = this.\u0000strictfp.Method_375(new Class_4751(Class_13337.Method_13371(this.\u0000strictfp.\u0000= package), ++n, Class_13337.Method_13371(this.\u0000strictfp.\u0000= switch))).Method_3442();
                if (++n2 <= (1049 & 18772)) continue;
                return (int)this.\u0000strictfp.\u0000, `().Field_11000;
            }
            return n;
        }
        return (int)(this.\u0000strictfp.\u0000, `().Field_11000 + 0.4807692307692307 * 1.04);
    }

    protected Vec3 Method_25813() {
        return new Vec3(this.\u0000strictfp.\u0000= package, this.Method_25812(), this.\u0000strictfp.\u0000= switch);
    }

    public boolean Method_25814() {
        return this.Field_25798.Method_30105();
    }

    public boolean Method_25815() {
        return this.Field_25798.Method_30103();
    }

    public void Method_25816(boolean bl) {
        this.Field_25799 = bl;
    }
}

