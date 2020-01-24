/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30088
extends Class_27380 {
    private static final Class_2080 Field_30089 = new Class_2080(Class_30088.Method_30093("\u2829\u2829\u2827\u282a\u282c\u2828\u282e\u282b\u2868\u2821\u282b\u2822\u2828\u2824\u282a\u286f\u283c\u283c\u283f\u2833\u283c\u2874\u283b\u2836\u2830"));

    public void Method_30090(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_30095((Class_41498)class_1061, d, d2, d3, f, f2);
    }

    protected Class_2080 Method_30091(Class_41498 class_41498) {
        return Field_30089;
    }

    protected Class_2080 Method_30092(Class_1061 class_1061) {
        return this.Method_30091((Class_41498)class_1061);
    }

    public Class_30088(Class_8491 class_8491) {
        super(class_8491);
    }

    private static String Method_30093(String string) {
        int n = 1183;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30088.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_30094() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_30095(Class_41498 class_41498, double d, double d2, double d3, float f, float f2) {
        this.\u0000, `((Class_1061)class_41498);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16961();
        Class_16867.Method_16943((float)d, (float)d2, (float)d3);
        Class_16867.Method_16940(class_41498.\u0000switch + (class_41498.\u0000= ? - class_41498.\u0000switch) * f2 - 2.652174f * 33.934425f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(class_41498.\u0000, 2 + (class_41498.\u0000= float - class_41498.\u0000, 2) * f2, 0.0f, 0.0f, 1.0f);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        int n = 22629 & 0;
        float f3 = 0.0f;
        float f4 = 0.040229883f * 12.428572f;
        float f5 = (float)((8713 & -32480) + n * (-32565 & 2090)) / (37.0f * 0.8648649f);
        float f6 = (float)((1095 & 4909) + n * (16394 & 12122)) / (360.0f * 0.08888889f);
        float f7 = 0.0f;
        float f8 = 0.17628205f * 0.8863636f;
        float f9 = (float)((1063 & 18437) + n * (-16865 & 16394)) / (174.54546f * 0.18333334f);
        float f10 = (float)((-15702 & 7243) + n * (11598 & -28486)) / (1.3157895f * 24.32f);
        float f11 = 0.08340517f * 0.6744186f;
        Class_16867.Method_16957();
        float f12 = (float)class_41498.Field_41506 - f2;
        if (f12 > 0.0f) {
            float f13 = -Class_13337.Method_13370(f12 * (14.076923f * 0.21311475f)) * f12;
            Class_16867.Method_16940(f13, 0.0f, 0.0f, 1.0f);
        }
        Class_16867.Method_16940(1.3125f * 34.285713f, 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16973(f11, f11, f11);
        Class_16867.Method_16943(-102.0f * 0.039215688f, 0.0f, 0.0f);
        GL11.glNormal3f((float)f11, (float)0.0f, (float)0.0f);
        class_22385.Method_22417(-30585 & 1127, Class_29585.Field_29598);
        class_22385.Method_22443(0.9 * -7.777777777777778, 1.7419354838709677 * -1.1481481481481481, 25.0 * -0.08).Method_22433(f7, f9).Method_22451();
        class_22385.Method_22443(-10.733333333333333 * 0.6521739130434783, 0.41304347826086957 * -4.842105263157895, 0.6818181818181819 * 2.933333333333333).Method_22433(f8, f9).Method_22451();
        class_22385.Method_22443(0.12121212121212122 * -57.75, 1.4666666666666666 * 1.3636363636363638, 4.4 * 0.45454545454545453).Method_22433(f8, f10).Method_22451();
        class_22385.Method_22443(-6.391304347826086 * 1.0952380952380953, 3.0714285714285716 * 0.6511627906976744, 0.35802469135802467 * -5.586206896551724).Method_22433(f7, f10).Method_22451();
        class_7644.Method_7647();
        GL11.glNormal3f((float)(-f11), (float)0.0f, (float)0.0f);
        class_22385.Method_22417(-31433 & 10759, Class_29585.Field_29598);
        class_22385.Method_22443(-4.413043478260869 * 1.5862068965517242, 1.3599999999999999 * 1.4705882352941178, 2.5 * -0.8).Method_22433(f7, f9).Method_22451();
        class_22385.Method_22443(6.923076923076923 * -1.011111111111111, 1.1896551724137931 * 1.681159420289855, 3.3333333333333335 * 0.6).Method_22433(f8, f9).Method_22451();
        class_22385.Method_22443(1.0229885057471264 * -6.842696629213483, 0.9523809523809523 * -2.1, 5.3125 * 0.3764705882352941).Method_22433(f8, f10).Method_22451();
        class_22385.Method_22443(0.6373626373626373 * -10.982758620689657, 2.625 * -0.7619047619047619, -2.857142857142857 * 0.7).Method_22433(f7, f10).Method_22451();
        class_7644.Method_7647();
        for (int i = 5890 & 8208; i < (22572 & 710); ++i) {
            Class_16867.Method_16940(3.1764705f * 28.333334f, 1.0f, 0.0f, 0.0f);
            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)f11);
            class_22385.Method_22417(-14825 & 79, Class_29585.Field_29598);
            class_22385.Method_22443(-7.838383838383839 * 1.0206185567010309, -25.333333333333336 * 0.07894736842105263, 0.0).Method_22433(f3, f5).Method_22451();
            class_22385.Method_22443(1.6623376623376624 * 4.8125, 3.5714285714285716 * -0.5599999999999999, 0.0).Method_22433(f4, f5).Method_22451();
            class_22385.Method_22443(0.4603174603174603 * 17.379310344827587, 1.3777777777777778 * 1.4516129032258065, 0.0).Method_22433(f4, f6).Method_22451();
            class_22385.Method_22443(0.6666666666666666 * -12.0, 2.75 * 0.7272727272727273, 0.0).Method_22433(f3, f6).Method_22451();
            class_7644.Method_7647();
        }
        Class_16867.Method_16942();
        Class_16867.Method_16945();
        super.Method_27403(class_41498, d, d2, d3, f, f2);
    }
}

