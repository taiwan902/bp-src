/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_41614
extends Class_40019 {
    private static final Class_2080 Field_41615 = new Class_2080(Class_41614.Method_41629("\ua081\ua090\ua089\ua081\ua084\ua085\ua094\ua084\ua090\ua098\ua091\ua089\ua094\ua08d\ua084\ua094\ua080\ua090\ua080\ua091\ua085\ua08c\ua084\ua08d\ua081\ua099\ua081\ua088"));
    private static final Class_2080 Field_41616 = new Class_2080(Class_41614.Method_41619("\u2402\u2413\u2400\u2400\u2403\u2400\u2411\u2403\u2419\u241b\u241a\u2408\u241b\u240a\u2409\u241b\u2401\u2413\u2401\u2412\u2402\u2403\u2401\u2402\u2419\u240b\u2408\u2408\u240b\u2418\u240a\u2418\u2410\u2411"));
    int Field_41617;
    private static final Class_2080 Field_41618 = new Class_2080(Class_41614.Method_41622("\u223b\u222b\u2231\u2238\u223e\u223c\u222c\u223f\u2268\u2223\u222b\u2230\u222e\u2236\u223c\u226f\u2238\u222b\u2238\u222a\u223f\u2237\u223c\u2236\u2208\u2230\u2230\u2231\u223e\u227c\u2225\u223e\u2208"));

    public Class_41614(Class_8491 class_8491) {
        super(class_8491, new Class_37421(), 0.49468085f * 1.0107527f);
        this.Field_41617 = ((Class_37421)this.\u0000strictfp).Method_37428();
    }

    private static String Method_41619(String string) {
        int n = 27132;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41614.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_41620(Class_34093 class_34093, Class_23708 class_23708, double d, double d2, double d3) {
        return this.Method_41627((Class_44640)class_34093, class_23708, d, d2, d3);
    }

    private Vec3 Method_41621(Class_859 class_859, double d, float f) {
        double d2 = class_859.\u0000, for + (class_859.\u0000= package - class_859.\u0000, for) * (double)f;
        double d3 = d + class_859.\u0000, 2 + (class_859.\u0000, for() - class_859.\u0000, 2) * (double)f;
        double d4 = class_859.\u0000, # + (class_859.\u0000= switch - class_859.\u0000, #) * (double)f;
        return new Vec3(d2, d3, d4);
    }

    private static String Method_41622(String string) {
        int n = 1375;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41614.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_41623(Class_34093 class_34093, double d, double d2, double d3, float f, float f2) {
        this.Method_41631((Class_44640)class_34093, d, d2, d3, f, f2);
    }

    protected void Method_41624(Class_859 class_859, float f) {
        this.Method_41632((Class_44640)class_859, f);
    }

    public void Method_41625(Class_859 class_859, double d, double d2, double d3, float f, float f2) {
        this.Method_41631((Class_44640)class_859, d, d2, d3, f, f2);
    }

    public void Method_41626(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_41631((Class_44640)class_1061, d, d2, d3, f, f2);
    }

    public boolean Method_41627(Class_44640 class_44640, Class_23708 class_23708, double d, double d2, double d3) {
        Class_859 class_859;
        if (super.Method_40021(class_44640, class_23708, d, d2, d3)) {
            return (-32637 & 3393) != 0;
        }
        if (class_44640.Method_44659() && (class_859 = class_44640.Method_44671()) != null) {
            Vec3 vec3 = this.Method_41621(class_859, (double)class_859.\u0000= switch() * (5.833333333333333 * 0.08571428571428572), 1.0f);
            Vec3 vec32 = this.Method_41621(class_44640, class_44640.Method_44679(), 1.0f);
            if (class_23708.Method_23709(Class_10997.Method_11019(vec32.\u0000= final, vec32.\u0000strictfp, vec32.\u0000, `, vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `))) {
                return (4753 & 2157) != 0;
            }
        }
        return (0 & -26044) != 0;
    }

    protected Class_2080 Method_41628(Class_44640 class_44640) {
        return class_44640.Method_44653() ? Field_41616 : Field_41615;
    }

    private static String Method_41629(String string) {
        int n = 9660;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41614.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_41630() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_41631(Class_44640 class_44640, double d, double d2, double d3, float f, float f2) {
        if (this.Field_41617 != ((Class_37421)this.\u0000strictfp).Method_37428()) {
            this.\u0000strictfp = new Class_37421();
            this.Field_41617 = ((Class_37421)this.\u0000strictfp).Method_37428();
        }
        super.Method_40029(class_44640, d, d2, d3, f, f2);
        Class_859 class_859 = class_44640.Method_44671();
        if (class_859 != null) {
            float f3 = class_44640.Method_44667(f2);
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            this.\u0000strictfp(Field_41618);
            GL11.glTexParameterf((int)(28129 & 4083), (int)(-22526 & 11970), (float)(43419.41f * 0.24175824f));
            GL11.glTexParameterf((int)(11761 & 8165), (int)(10323 & -21501), (float)(8676.092f * 1.2098765f));
            Class_16867.Method_16931();
            Class_16867.Method_16969();
            Class_16867.Method_16952();
            Class_16867.Method_16930((-29695 & 517) != 0);
            float f4 = 205.7143f * 1.1666666f;
            Class_32876.Method_32943(Class_32876.Field_32911, f4, f4);
            Class_16867.Method_16984(775 & 21394, 8451 & 2621, -19961 & 3369, 586 & -31487);
            float f5 = (float)class_44640.\u0000strictfp.Method_363() + f2;
            float f6 = f5 * (0.59770113f * 0.8365385f) % 1.0f;
            float f7 = class_44640.Method_44679();
            Class_16867.Method_16961();
            Class_16867.Method_16943((float)d, (float)d2 + f7, (float)d3);
            Vec3 vec3 = this.Method_41621(class_859, (double)class_859.\u0000= switch() * (0.23076923076923078 * 2.1666666666666665), f2);
            Vec3 vec32 = this.Method_41621(class_44640, f7, f2);
            Vec3 vec33 = vec3.\u0000, `(vec32);
            double d4 = vec33.\u0000strictfp() + 1.0;
            vec33 = vec33.\u0000strictfp();
            float f8 = (float)Math.acos(vec33.\u0000strictfp);
            float f9 = (float)Math.atan2(vec33.\u0000, `, vec33.\u0000= final);
            Class_16867.Method_16940((0.91325366f * 1.72f + -f9) * (0.91780823f * 62.42674f), 0.0f, 1.0f, 0.0f);
            Class_16867.Method_16940(f8 * (5.7272725f * 10.0040245f), 1.0f, 0.0f, 0.0f);
            int n = 135 & -5007;
            double d5 = (double)f5 * (0.375 * 0.13333333333333333) * (1.0 - (double)(n & (-16359 & 4389)) * (0.41414141414141414 * 6.036585365853658));
            class_22385.Method_22417(9303 & -11769, Class_29585.Field_29586);
            float f10 = f3 * f3;
            int n2 = (9284 & 2880) + (int)(f10 * (0.5f * 480.0f));
            int n3 = (-16339 & 9266) + (int)(f10 * (148.89796f * 1.2894737f));
            int n4 = (-31096 & 226) - (int)(f10 * (83.2f * 0.7692308f));
            double d6 = (double)n * (1.4680851063829787 * 0.13623188405797101);
            double d7 = d6 * (0.13333333333333333 * 10.575);
            double d8 = 0.0 + Math.cos(d5 + 0.8235294117647058 * 2.861093309519276) * d7;
            double d9 = 0.0 + Math.sin(d5 + 4.039190554615448 * 0.5833333333333334) * d7;
            double d10 = 0.0 + Math.cos(d5 + 0.2232184253866432 * 3.5185185185185186) * d7;
            double d11 = 0.0 + Math.sin(d5 + 0.5235987755982988 * 1.5) * d7;
            double d12 = 0.0 + Math.cos(d5 + 5.8904862254808625 * 0.6666666666666666) * d7;
            double d13 = 0.0 + Math.sin(d5 + 1.894195570546787 * 2.073170731707317) * d7;
            double d14 = 0.0 + Math.cos(d5 + 5.044361399965054 * 1.0898876404494382) * d7;
            double d15 = 0.0 + Math.sin(d5 + 2.396471319084522 * 2.2941176470588234) * d7;
            double d16 = 0.0 + Math.cos(d5 + 3.0 * 1.0471975511965976) * d6;
            double d17 = 0.0 + Math.sin(d5 + 0.37699111843077515 * 8.333333333333334) * d6;
            double d18 = 0.0 + Math.cos(d5 + 0.0) * d6;
            double d19 = 0.0 + Math.sin(d5 + 0.0) * d6;
            double d20 = 0.0 + Math.cos(d5 + 0.3684210526315789 * 4.263590029871862) * d6;
            double d21 = 0.0 + Math.sin(d5 + 0.4072434921320102 * 3.857142857142857) * d6;
            double d22 = 0.0 + Math.cos(d5 + 2.827433388230814 * 1.6666666666666667) * d6;
            double d23 = 0.0 + Math.sin(d5 + 50.06913291658733 * 0.09411764705882353) * d6;
            double d24 = 0.0;
            double d25 = 0.11536153846153847 * 4.333333333333333;
            double d26 = -6.9285717f * 0.14432989f + f6;
            double d27 = d4 * (0.34736842105263155 * 1.4393939393939394 / d6) + d26;
            class_22385.Method_22443(d16, d4, d17).Method_22433(1.6181818181818182 * 0.30892696629213484, d27).Method_22424(n2, n3, n4, 2303 & -19201).Method_22451();
            class_22385.Method_22443(d16, 0.0, d17).Method_22433(0.3808761904761905 * 1.3125, d26).Method_22424(n2, n3, n4, 7423 & 8447).Method_22451();
            class_22385.Method_22443(d18, 0.0, d19).Method_22433(0.0, d26).Method_22424(n2, n3, n4, 767 & -13825).Method_22451();
            class_22385.Method_22443(d18, d4, d19).Method_22433(0.0, d27).Method_22424(n2, n3, n4, 4351 & 10751).Method_22451();
            class_22385.Method_22443(d20, d4, d21).Method_22433(0.76 * 0.6577631578947368, d27).Method_22424(n2, n3, n4, 16639 & -29697).Method_22451();
            class_22385.Method_22443(d20, 0.0, d21).Method_22433(0.41349753086419755 * 1.208955223880597, d26).Method_22424(n2, n3, n4, 2303 & -32513).Method_22451();
            class_22385.Method_22443(d22, 0.0, d23).Method_22433(0.0, d26).Method_22424(n2, n3, n4, 22783 & 511).Method_22451();
            class_22385.Method_22443(d22, d4, d23).Method_22433(0.0, d27).Method_22424(n2, n3, n4, 1279 & 10495).Method_22451();
            double d28 = 0.0;
            if (class_44640.\u0000= package % (-30702 & 1802) == 0) {
                d28 = 5.352941176470588 * 0.09340659340659341;
            }
            class_22385.Method_22443(d8, d4, d9).Method_22433(0.686046511627907 * 0.728813559322034, d28 + 0.19753086419753085 * 2.53125).Method_22424(n2, n3, n4, 4863 & 24831).Method_22451();
            class_22385.Method_22443(d10, d4, d11).Method_22433(1.0, d28 + 1.1547619047619047 * 0.4329896907216495).Method_22424(n2, n3, n4, 255 & 9471).Method_22451();
            class_22385.Method_22443(d14, d4, d15).Method_22433(1.0, d28).Method_22424(n2, n3, n4, 2303 & -26881).Method_22451();
            class_22385.Method_22443(d12, d4, d13).Method_22433(0.48148148148148145 * 1.0384615384615385, d28).Method_22424(n2, n3, n4, 1023 & 28927).Method_22451();
            class_7644.Method_7647();
            Class_16867.Method_16945();
        }
    }

    protected void Method_41632(Class_44640 class_44640, float f) {
        if (class_44640.Method_44653()) {
            Class_16867.Method_16973(0.8787879f * 2.6741378f, 0.03529412f * 66.58333f, 2.2406976f * 1.0487804f);
        }
    }

    protected Class_2080 Method_41633(Class_1061 class_1061) {
        return this.Method_41628((Class_44640)class_1061);
    }

    public boolean Method_41634(Class_1061 class_1061, Class_23708 class_23708, double d, double d2, double d3) {
        return this.Method_41627((Class_44640)class_1061, class_23708, d, d2, d3);
    }
}

