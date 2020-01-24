/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public abstract class Class_41853
extends Class_34093 {
    private Class_33077 Field_41854 = new Class_35640(this, 1.0);
    private Class_4751 Field_41855 = Class_4751.Field_4760;
    private boolean Field_41856;
    public static final Class_10375 Field_41857;
    public static final UUID Field_41858;
    private float Field_41859 = -17.5f * 0.057142857f;

    /*
     * Enabled aggressive block sorting
     */
    public boolean Method_41860() {
        int n;
        if (super.Method_34143()) {
            Class_4751 class_4751 = new Class_4751(this.\u0000= package, this.\u0000, `().Field_11000, this.\u0000= switch);
            if (this.Method_41862(class_4751) >= 0.0f) {
                n = 129 & 21801;
                return n != 0;
            }
        }
        n = 2188 & -19454;
        return n != 0;
    }

    protected void Method_41861(float f) {
    }

    public float Method_41862(Class_4751 class_4751) {
        return 0.0f;
    }

    protected void Method_41863() {
        super.Method_34166();
        if (this.\u0000= case() && this.\u0000, `() != null && this.\u0000, `().Field_1089 == this.\u0000strictfp) {
            Class_1061 class_1061 = this.\u0000, `();
            this.Method_41872(new Class_4751((int)class_1061.Field_1130, (int)class_1061.Method_1324(), (int)class_1061.Field_1106), 24773 & 13);
            float f = this.\u0000strictfp(class_1061);
            if (this instanceof Class_45651 && ((Class_45651)this).Method_45666()) {
                if (f > 1.0416666f * 9.6f) {
                    this.\u0000strictfp((-15869 & 1293) != 0, (-31743 & 75) != 0);
                }
                return;
            }
            if (!this.Field_41856) {
                this.\u0000strictfp.Method_16858(16454 & -18669, this.Field_41854);
                if (this.\u0000strictfp() instanceof Class_25797) {
                    ((Class_25797)this.\u0000strictfp()).Method_25808((6 & 15433) != 0);
                }
                this.Field_41856 = 27 & -32447;
            }
            this.Method_41861(f);
            if (f > 2.0f * 2.0f) {
                this.\u0000strictfp().Method_7631(class_1061, 1.0);
            }
            if (f > 0.69072163f * 8.686567f) {
                double d = (class_1061.Field_1130 - this.\u0000= package) / (double)f;
                double d2 = (class_1061.Method_1324() - this.\u0000, for()) / (double)f;
                double d3 = (class_1061.Field_1106 - this.\u0000= switch) / (double)f;
                this.\u0000= ` += d * Math.abs(d) * (0.627906976744186 * 0.6370370370370371);
                this.\u0000%(this.\u0000, #() + d2 * Math.abs(d2) * (0.5102040816326531 * 0.784));
                this.\u0000switch += d3 * Math.abs(d3) * (0.4071428571428572 * 0.9824561403508771);
            }
            if (f > 12.941176f * 0.77272725f) {
                this.\u0000strictfp((273 & -12277) != 0, (10877 & 16385) != 0);
            }
        } else if (!this.\u0000= case() && this.Field_41856) {
            this.Field_41856 = 4166 & 8705;
            this.\u0000strictfp.Method_16863(this.Field_41854);
            if (this.\u0000strictfp() instanceof Class_25797) {
                ((Class_25797)this.\u0000strictfp()).Method_25808((513 & 3081) != 0);
            }
            this.Method_41867();
        }
    }

    public Class_41853(Class_283 class_283) {
        super(class_283);
    }

    private static String Method_41864(String string) {
        int n = 21542;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41853.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_41865(Class_4751 class_4751) {
        return (this.Field_41859 == 11.8f * -0.084745765f ? 4177 & -30207 : (this.Field_41855.\u0000strictfp((Class_4792)class_4751) < (double)(this.Field_41859 * this.Field_41859) ? 4161 & -8191 : -12030 & 1033)) != 0;
    }

    static {
        Field_41858 = UUID.fromString(Class_41853.Method_41868("\u4089\u4099\u4091\u4091\u4089\u4088\u4098\u4099\u4081\u4088\u4089\u4090\u4089\u4081\u4098\u4089\u4089\u4089\u4091\u4080\u4098\u4089\u4089\u4091\u4088\u4089\u4080\u4088\u4098\u4089\u4099\u4088\u4091\u4088\u4099\u4089"));
        Field_41857 = new Class_10375(Field_41858, Class_41853.Method_41864("\b\"**\" (* \"\"\"\"\" ( *("), 0.6597938144329897 * 3.03125, 17926 & 8290).Method_10386((16464 & 6280) != 0);
    }

    public boolean Method_41866() {
        return (this.Field_41859 != 1.92f * -0.5208334f ? -24011 & 2051 : -24536 & 2053) != 0;
    }

    public void Method_41867() {
        this.Field_41859 = -0.9090909f * 1.1f;
    }

    private static String Method_41868(String string) {
        int n = 24803;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41853.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_4751 Method_41869() {
        return this.Field_41855;
    }

    public float Method_41870() {
        return this.Field_41859;
    }

    public boolean Method_41871() {
        return (!this.\u0000strictfp.Method_7641() ? -28141 & 24997 : 16896 & 152) != 0;
    }

    public void Method_41872(Class_4751 class_4751, int n) {
        this.Field_41855 = class_4751;
        this.Field_41859 = n;
    }

    public boolean Method_41873() {
        return this.Method_41865(new Class_4751(this));
    }

    private void Method_41874() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

