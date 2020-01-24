/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Class_44826
extends Class_41880
implements Class_10909 {
    private int Field_44827;
    private static final Class_1956[] Field_44828;
    private static final Class_10375 Field_44829;
    private static final UUID Field_44830;

    protected float Method_44831(Class_32797 class_32797, float f) {
        f = super.\u0000strictfp(class_32797, f);
        if (class_32797.Method_32856() == this) {
            f = 0.0f;
        }
        if (class_32797.Method_32862()) {
            f = (float)((double)f * (0.26999999999999996 * 0.5555555555555556));
        }
        return f;
    }

    public void Method_44832(boolean bl) {
        this.\u0000strictfp().Method_32704(53 & -28323, (byte)(bl ? 17025 & 2135 : -16256 & 2306));
    }

    public float Method_44833() {
        return 1.1034483f * 1.468125f;
    }

    private static String Method_44834(String string) {
        int n = 1580;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_44826.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_44835() {
        super.\u0000= final();
        this.\u0000strictfp().Method_32719(21 & -15467, (byte)(1440 & 6));
    }

    protected String Method_44836() {
        return null;
    }

    protected String Method_44837() {
        return null;
    }

    public Class_44826(Class_283 class_283) {
        super(class_283);
        this.\u0000= final(0.53571427f * 1.1200001f, 0.42804882f * 4.5555553f);
        this.\u0000strictfp.Method_16858(-30687 & 9223, new Class_40128(this));
        this.\u0000strictfp.Method_16858(739 & 11534, new Class_42946(this, 1.0, 4284 & 316, 11.5625f * 0.8648649f));
        this.\u0000strictfp.Method_16858(4418 & 18438, new Class_34936(this, 1.0));
        this.\u0000strictfp.Method_16858(24579 & 3075, new Class_38500(this, Class_626.class, 7.809524f * 1.0243902f));
        this.\u0000strictfp.Method_16858(2123 & 20739, new Class_46015(this));
        this.\u0000, `.Method_16858(16457 & 10241, new Class_39631(this, (2071 & 8736) != 0, new Class[658 & 4160]));
        this.\u0000, `.Method_16858(-32174 & 18574, new Class_44015(this, Class_626.class, (1027 & 221) != 0));
    }

    protected void Method_44838() {
        super.Method_41890();
        this.\u0000strictfp(Class_21716.Field_21718).Method_16556(239.20000000000002 * 0.10869565217391304);
        this.\u0000strictfp(Class_21716.Field_21722).Method_16556(0.5818181818181818 * 0.4296875);
    }

    private static String Method_44839(String string) {
        int n = 18943;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_44826.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_44840() {
        if (!this.\u0000strictfp.Field_306) {
            if (this.Method_44841()) {
                int n = this.Field_44827;
                this.Field_44827 = n - (-32767 & 577);
                if (n <= 0) {
                    List list;
                    this.Method_44832((-31848 & 1025) != 0);
                    Class_23823 class_23823 = this.\u0000strictfp();
                    this.\u0000strictfp(-9707 & 40, (Class_23823)null);
                    if (class_23823 != null && class_23823.Method_23844() == Class_10527.Field_10687 && (list = Class_10527.Field_10687.Method_4110(class_23823)) != null) {
                        for (Class_25240 class_25240 : list) {
                            this.\u0000, `(new Class_25240(class_25240));
                        }
                    }
                    this.\u0000strictfp(Class_21716.Field_21722).Method_16551(Field_44829);
                }
            } else {
                int n = -1 & -1;
                if (this.\u0000strictfp.nextFloat() < 0.11785715f * 1.2727273f && this.\u0000strictfp(Class_3713.Field_3734) && !this.\u0000strictfp(Class_8338.Field_8376)) {
                    n = 9021 & 9453;
                } else if (this.\u0000strictfp.nextFloat() < 0.2867647f * 0.52307695f && this.\u0000, 2() && !this.\u0000strictfp(Class_8338.Field_8366)) {
                    n = -16461 & 16371;
                } else if (this.\u0000strictfp.nextFloat() < 0.17021276f * 0.29375002f && this.\u0000abstract() < this.\u0000switch()) {
                    n = 16343 & 32733;
                } else if (this.\u0000strictfp.nextFloat() < 4.25f * 0.05882353f && this.\u0000strictfp() != null && !this.\u0000strictfp(Class_8338.Field_8361) && this.\u0000strictfp().\u0000strictfp((Class_1061)this) > 1.2857142857142858 * 94.1111111111111) {
                    n = 32734 & 16274;
                } else if (this.\u0000strictfp.nextFloat() < 0.2857143f * 0.875f && this.\u0000strictfp() != null && !this.\u0000strictfp(Class_8338.Field_8361) && this.\u0000strictfp().\u0000strictfp((Class_1061)this) > 0.4090909090909091 * 295.77777777777777) {
                    n = 16371 & 16274;
                }
                if (n > (-1 & -1)) {
                    this.\u0000strictfp(-15040 & 8194, new Class_23823(Class_10527.Field_10687, -28415 & 9293, n));
                    this.Field_44827 = this.\u0000strictfp().Method_23861();
                    this.Method_44832((8325 & 6409) != 0);
                    Class_16547 class_16547 = this.\u0000strictfp(Class_21716.Field_21722);
                    class_16547.Method_16551(Field_44829);
                    class_16547.Method_16549(Field_44829);
                }
            }
            if (this.\u0000strictfp.nextFloat() < 1.5555556f * 4.8214284E-4f) {
                this.\u0000strictfp.Method_483(this, (byte)(1423 & -24001));
            }
        }
        super.Method_41884();
    }

    public boolean Method_44841() {
        return (this.\u0000strictfp().Method_32708(10421 & 21) == (193 & -22269) ? -26623 & 151 : 8 & 2082) != 0;
    }

    private void Method_44842() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_44843(byte by) {
        if (by == (15 & 28783)) {
            for (int i = 2571 & 5312; i < this.\u0000strictfp.nextInt(18659 & 9511) + (16139 & 16426); ++i) {
                this.\u0000strictfp.Method_407(Class_40274.Field_40323, this.\u0000= package + this.\u0000strictfp.nextGaussian() * (0.1354736792413812 * 0.9595959595959596), this.\u0000, `().Field_10998 + 0.6136363636363636 * 0.8148148148148148 + this.\u0000strictfp.nextGaussian() * (1.675 * 0.07761193745171846), this.\u0000= switch + this.\u0000strictfp.nextGaussian() * (0.2 * 0.6499999761581421), 0.0, 0.0, 0.0, new int[-32231 & 5250]);
            }
        } else {
            super.\u0000strictfp(by);
        }
    }

    public void Method_44844(Class_859 class_859, float f) {
        if (!this.Method_44841()) {
            Class_43663 class_43663 = new Class_43663(this.\u0000strictfp, (Class_859)this, 32732 & 32765);
            double d = class_859.\u0000, for() + (double)class_859.\u0000, for() - 0.8250000178813934 * 1.3333333333333333;
            class_43663.\u0000= float -= -25.333332f * 0.7894737f;
            double d2 = class_859.\u0000= package + class_859.\u0000= ` - this.\u0000= package;
            double d3 = d - this.\u0000, for();
            double d4 = class_859.\u0000= switch + class_859.\u0000switch - this.\u0000= switch;
            float f2 = Class_13337.Method_13347(d2 * d2 + d4 * d4);
            if (f2 >= 7.06383f * 1.1325301f && !class_859.Method_1039(Class_8338.Field_8357)) {
                class_43663.Method_43668(32698 & -65);
            } else if (class_859.Method_961() >= 9.333333f * 0.85714287f && !class_859.Method_1039(Class_8338.Field_8367)) {
                class_43663.Method_43668(-108 & 32660);
            } else if (f2 <= 1.4769231f * 2.03125f && !class_859.Method_1039(Class_8338.Field_8368) && this.\u0000strictfp.nextFloat() < 1.5f * 0.16666667f) {
                class_43663.Method_43668(-66 & 32697);
            }
            class_43663.\u0000a_(d2, d3 + (double)(f2 * (0.88571435f * 0.22580644f)), d4, 0.22826086f * 3.2857144f, 1.375f * 5.818182f);
            this.\u0000strictfp.Method_350(class_43663);
        }
    }

    static {
        Field_44830 = UUID.fromString(Class_44826.Method_44839("\u50c0\u5084\u5083\u50c6\u50c4\u5084\u50c6\u50c3\u50c0\u5084\u50c2\u50c6\u5080\u50c4\u50c7\u50c2\u5081\u50c4\u50c2\u5086\u50c4\u50c1\u50c2\u50c6\u50c4\u50c5\u5083\u5083\u5084\u50c1\u50c7\u5083\u50e4\u50e5\u50e6\u50a2"));
        Field_44829 = new Class_10375(Field_44830, Class_44826.Method_44834("\u0700\u0707\u0704\u0703\u0706\u0705\u0702\u0703\u070c\u070f\u070c\u0709\u0708\u0709\u070c\u070d\u0700\u0703\u0704\u0701\u0700\u0705"), 1.1470588235294117 * -0.21794871794871795, 21525 & 770).Method_10386((1418 & -24063) != 0);
        Class_1956[] arrclass_1956 = new Class_1956[2601 & 8264];
        arrclass_1956[24592 & -31840] = Class_10527.Field_10712;
        arrclass_1956[24625 & 5515] = Class_10527.Field_10577;
        arrclass_1956[6707 & -24254] = Class_10527.Field_10564;
        arrclass_1956[-19441 & 307] = Class_10527.Field_10680;
        arrclass_1956[524 & 8628] = Class_10527.Field_10666;
        arrclass_1956[-30283 & 8205] = Class_10527.Field_10579;
        arrclass_1956[6 & 22806] = Class_10527.Field_10616;
        arrclass_1956[-30705 & 279] = Class_10527.Field_10616;
        Field_44828 = arrclass_1956;
    }

    protected void Method_44845(boolean bl, int n) {
        int n2 = this.\u0000strictfp.nextInt(27 & -32665) + (16929 & 3223);
        for (int i = 3114 & 16848; i < n2; ++i) {
            int n3 = this.\u0000strictfp.nextInt(8199 & 5131);
            Class_1956 class_1956 = Field_44828[this.\u0000strictfp.nextInt(Field_44828.length)];
            if (n > 0) {
                n3 += this.\u0000strictfp.nextInt(n + (21513 & 8609));
            }
            for (int j = 8448 & -31733; j < n3; ++j) {
                this.\u0000strictfp(class_1956, 3269 & 8209);
            }
        }
    }

    protected String Method_44846() {
        return null;
    }
}

