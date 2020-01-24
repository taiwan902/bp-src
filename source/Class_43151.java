/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Calendar;
import java.util.Random;

public class Class_43151
extends Class_41880
implements Class_10909 {
    private Class_36925 Field_43152 = new Class_36925(this, Class_626.class, 5.25 * 0.22857142857142856, (4608 & 2130) != 0);
    private Class_42946 Field_43153 = new Class_42946(this, 1.0, 18966 & 5141, -12228 & 316, 0.6122449f * 24.5f);

    public void Method_43154() {
        this.\u0000strictfp.Method_16863(this.Field_43152);
        this.\u0000strictfp.Method_16863(this.Field_43153);
        Class_23823 class_23823 = this.\u0000strictfp();
        if (class_23823 != null && class_23823.Method_23844() == Class_10527.Field_10690) {
            this.\u0000strictfp.Method_16858(-31804 & 26639, this.Field_43153);
        } else {
            this.\u0000strictfp.Method_16858(14660 & 52, this.Field_43152);
        }
    }

    public void Method_43155(Class_859 class_859, float f) {
        Class_41498 class_41498 = new Class_41498(this.\u0000strictfp, this, class_859, 7.0588236f * 0.22666667f, (526 & 1119) - this.\u0000strictfp.Method_487().Method_26822() * (1383 & 4));
        int n = Class_29642.Method_29662(Class_30635.Field_30664.Field_30638, this.\u0000strictfp());
        int n2 = Class_29642.Method_29662(Class_30635.Field_30646.Field_30638, this.\u0000strictfp());
        class_41498.Method_41514((double)(f * 2.0f) + this.\u0000strictfp.nextGaussian() * (0.48275862068965514 * 0.5178571428571429) + (double)((float)this.\u0000strictfp.Method_487().Method_26822() * (0.70526314f * 0.15597016f)));
        if (n > 0) {
            class_41498.Method_41514(class_41498.Method_41516() + (double)n * (0.40384615384615385 * 1.2380952380952381) + 9.75 * 0.05128205128205128);
        }
        if (n2 > 0) {
            class_41498.Method_41527(n2);
        }
        if (Class_29642.Method_29662(Class_30635.Field_30661.Field_30638, this.\u0000strictfp()) > 0 || this.Method_43168() == (525 & 2435)) {
            class_41498.\u0000, for(20583 & 364);
        }
        this.\u0000strictfp("random.bow", 1.0f, 1.0f / (this.\u0000strictfp().nextFloat() * (1.9230769f * 0.208f) + 1.8787879f * 0.42580646f));
        this.\u0000strictfp.Method_350(class_41498);
    }

    protected void Method_43156(boolean bl, int n) {
        int n2;
        int n3;
        if (this.Method_43168() == (-31743 & 16705)) {
            n2 = this.\u0000strictfp.nextInt((715 & 29971) + n) - (65 & -28125);
            for (n3 = 12352 & -29423; n3 < n2; ++n3) {
                this.\u0000strictfp(Class_10527.Field_10698, -20219 & 3187);
            }
        } else {
            n2 = this.\u0000strictfp.nextInt((1159 & 22531) + n);
            for (n3 = -16254 & 13912; n3 < n2; ++n3) {
                this.\u0000strictfp(Class_10527.Field_10568, 8209 & -10879);
            }
        }
        n2 = this.\u0000strictfp.nextInt((28679 & -31293) + n);
        for (n3 = 24577 & -32680; n3 < n2; ++n3) {
            this.\u0000strictfp(Class_10527.Field_10603, 5 & -24165);
        }
    }

    public double Method_43157() {
        return this.\u0000, for() ? 0.0 : -0.8806451612903226 * 0.3974358974358974;
    }

    protected void Method_43158(Class_33888 class_33888) {
        super.\u0000strictfp(class_33888);
        this.Method_43163(56 & -30528, new Class_23823(Class_10527.Field_10690));
    }

    public boolean Method_43159(Class_1061 class_1061) {
        if (super.Method_41889(class_1061)) {
            if (this.Method_43168() == (257 & 8781) && class_1061 instanceof Class_859) {
                ((Class_859)class_1061).Method_995(new Class_25240(Class_8338.Field_8354.Field_8364, 15561 & -32566));
            }
            return (3085 & 4481) != 0;
        }
        return (8260 & 385) != 0;
    }

    protected String Method_43160() {
        return "mob.skeleton.say";
    }

    protected void Method_43161() {
        super.\u0000= final();
        this.\u0000strictfp.Method_32719(4173 & -7667, new Byte((byte)(105 & 3346)));
    }

    protected String Method_43162() {
        return "mob.skeleton.hurt";
    }

    public void Method_43163(int n, Class_23823 class_23823) {
        super.\u0000strictfp(n, class_23823);
        if (!this.\u0000strictfp.Field_306 && n == 0) {
            this.Method_43154();
        }
    }

    protected void Method_43164(Class_4751 class_4751, Class_3238 class_3238) {
        this.\u0000strictfp("mob.skeleton.step", 4.9500003f * 0.030303031f, 1.0f);
    }

    public Class_26405 Method_43165(Class_33888 class_33888, Class_26405 class_26405) {
        Calendar calendar;
        class_26405 = super.\u0000strictfp(class_33888, class_26405);
        if (this.\u0000strictfp.Field_284 instanceof Class_19328 && this.\u0000strictfp().nextInt(-22779 & 4141) > 0) {
            this.\u0000strictfp.Method_16858(10244 & -16282, this.Field_43152);
            this.Method_43175(8195 & -31987);
            this.Method_43163(-23422 & 22528, new Class_23823(Class_10527.Field_10566));
            this.\u0000strictfp(Class_21716.Field_21717).Method_16556(0.9230769230769231 * 4.333333333333333);
        } else {
            this.\u0000strictfp.Method_16858(8212 & 21004, this.Field_43153);
            this.Method_43158(class_33888);
            this.\u0000, `(class_33888);
        }
        this.\u0000= `((this.\u0000strictfp.nextFloat() < 0.4714286f * 1.1666666f * class_33888.Method_33891() ? 18949 & -32639 : -16300 & 1800) != 0);
        if (this.\u0000, `(-8185 & 5188) == null && (calendar = this.\u0000strictfp.Method_400()).get(26650 & 838) + (681 & 18499) == (4330 & -29686) && calendar.get(23 & 8485) == (28991 & -32097) && this.\u0000strictfp.nextFloat() < 1.1558442f * 0.21629213f) {
            this.Method_43163(25156 & 388, new Class_23823(this.\u0000strictfp.nextFloat() < 1.2363636f * 0.080882356f ? Class_9265.Field_9284 : Class_9265.Field_9337));
            this.\u0000strictfp[132 & -32673] = 0.0f;
        }
        return class_26405;
    }

    public void Method_43166() {
        if (this.\u0000strictfp.Method_347() && !this.\u0000strictfp.Field_306) {
            float f = this.\u0000strictfp(1.0f);
            Class_4751 class_4751 = new Class_4751(this.\u0000= package, Math.round(this.\u0000, for()), this.\u0000= switch);
            if (f > 0.375f * 1.3333334f && this.\u0000strictfp.nextFloat() * (7.5f * 4.0f) < (f - 2.523077f * 0.15853658f) * 2.0f && this.\u0000strictfp.Method_398(class_4751)) {
                int n = 24211 & 325;
                Class_23823 class_23823 = this.\u0000, `(5254 & 11092);
                if (class_23823 != null) {
                    if (class_23823.Method_23846()) {
                        class_23823.Method_23849(class_23823.Method_23853() + this.\u0000strictfp.nextInt(-11885 & 11298));
                        if (class_23823.Method_23853() >= class_23823.Method_23859()) {
                            this.\u0000, `(class_23823);
                            this.Method_43163(29748 & 2759, null);
                        }
                    }
                    n = -15547 & 168;
                }
                if (n != 0) {
                    this.\u0000, for(12808 & 1112);
                }
            }
        }
        if (this.\u0000strictfp.Field_306 && this.Method_43168() == (8193 & 2369)) {
            this.\u0000= final(4.7894735f * 0.15032968f, 0.05263158f * 48.165f);
        }
        super.Method_41884();
    }

    public void Method_43167(Class_1699 class_1699) {
        super.\u0000strictfp(class_1699);
        class_1699.Method_1724("SkeletonType", (byte)this.Method_43168());
    }

    public int Method_43168() {
        return this.\u0000strictfp.Method_32708(11341 & 20493);
    }

    protected void Method_43169() {
        if (this.Method_43168() == (-13311 & 9099)) {
            this.\u0000strictfp(new Class_23823(Class_10527.Field_10702, 5 & 785, 513 & 3081), 0.0f);
        }
    }

    public void Method_43170() {
        super.\u0000+();
        if (this.\u0000, ` instanceof Class_41853) {
            Class_41853 class_41853 = (Class_41853)this.\u0000, `;
            this.\u0000super = class_41853.\u0000super;
        }
    }

    public Class_43151(Class_283 class_283) {
        super(class_283);
        this.\u0000strictfp.Method_16858(2561 & 133, new Class_40128(this));
        this.\u0000strictfp.Method_16858(17411 & 466, new Class_36907(this));
        this.\u0000strictfp.Method_16858(-32477 & 5259, new Class_46458(this, 1.0));
        this.\u0000strictfp.Method_16858(-23741 & 1087, new Class_34269(this, Class_47526.class, 2.857143f * 2.1f, 1.0, 1.6918032786885244 * 0.7093023255813954));
        this.\u0000strictfp.Method_16858(24580 & 2564, new Class_34936(this, 1.0));
        this.\u0000strictfp.Method_16858(1430 & 8238, new Class_38500(this, Class_626.class, 20.266666f * 0.39473686f));
        this.\u0000strictfp.Method_16858(-8026 & 2135, new Class_46015(this));
        this.\u0000, `.Method_16858(-20223 & 18607, new Class_39631(this, (0 & 5125) != 0, new Class[-24447 & 7016]));
        this.\u0000, `.Method_16858(9234 & 2147, new Class_44015(this, Class_626.class, (323 & 18945) != 0));
        this.\u0000, `.Method_16858(-23893 & 2375, new Class_44015(this, Class_45624.class, (16403 & -30399) != 0));
        if (class_283 != null && !class_283.Field_306) {
            this.Method_43154();
        }
    }

    public void Method_43171(Class_32797 class_32797) {
        super.\u0000strictfp(class_32797);
        if (class_32797.Method_32823() instanceof Class_41498 && class_32797.Method_32856() instanceof Class_626) {
            Class_626 class_626 = (Class_626)class_32797.Method_32856();
            double d = class_626.\u0000= package - this.\u0000= package;
            double d2 = class_626.\u0000= switch - this.\u0000= switch;
            if (d * d + d2 * d2 >= 1.6 * 1562.5) {
                class_626.Method_750(Class_21905.Field_21930);
            }
        } else if (class_32797.Method_32856() instanceof Class_43073 && ((Class_43073)class_32797.Method_32856()).Method_43097() && ((Class_43073)class_32797.Method_32856()).Method_43098()) {
            ((Class_43073)class_32797.Method_32856()).Method_43095();
            this.\u0000strictfp(new Class_23823(Class_10527.Field_10702, 4129 & 11393, this.Method_43168() == (4099 & 577) ? 20485 & -22013 : -14328 & 4100), 0.0f);
        }
    }

    protected String Method_43172() {
        return "mob.skeleton.death";
    }

    public float Method_43173() {
        return this.Method_43168() == (26651 & 769) ? super.\u0000, for() : 0.24050634f * 7.2347364f;
    }

    public void Method_43174(Class_1699 class_1699) {
        super.\u0000, `(class_1699);
        if (class_1699.Method_1715("SkeletonType", 99 & -32541)) {
            byte by = class_1699.Method_1716("SkeletonType");
            this.Method_43175(by);
        }
        this.Method_43154();
    }

    public void Method_43175(int n) {
        this.\u0000strictfp.Method_32704(-32435 & 14349, (byte)n);
        this.\u0000, # = n == (4749 & 67) ? -27941 & 8453 : 1290 & -16255;
        int n2 = this.\u0000, # ? 1 : 0;
        if (n == (129 & -32695)) {
            this.\u0000= final(1.2878788f * 0.55905885f, 2.0851064f * 1.2157654f);
        } else {
            this.\u0000= final(0.8043478f * 0.745946f, 0.06451613f * 30.225002f);
        }
    }

    private void Method_43176() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_40173 Method_43177() {
        return Class_40173.Field_40177;
    }

    protected Class_1956 Method_43178() {
        return Class_10527.Field_10568;
    }

    protected void Method_43179() {
        super.Method_41890();
        this.\u0000strictfp(Class_21716.Field_21722).Method_16556(5.285714285714286 * 0.0472972972972973);
    }
}

