/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_22024
extends Class_11681 {
    private static final Class_2080 Field_22025 = new Class_2080(Class_22024.Method_22027("\u6728\u6729\u6720\u6729\u672c\u672f\u672c\u672f\u6762\u6729\u6722\u6729\u6724\u672d\u6724\u6767\u672a\u6729\u6728\u672b\u6726\u6727\u6706\u672f\u6728\u6729\u6720\u6763\u672c\u6727\u672e"));

    public void Method_22026(Class_47216 class_47216, double d, double d2, double d3, float f, int n) {
        if (Class_19426.Method_19570() && Class_12440.Field_12441) {
            return;
        }
        float f2 = class_47216.Method_47252();
        if (f2 > 0.0f) {
            if (Class_19426.Method_19570()) {
                Class_12440.Method_12957();
            }
            Class_16867.Method_16967(4652 & 2565, 0.012345678f * 8.1f);
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            Class_16867.Method_16954();
            List list = class_47216.Method_47248();
            int n2 = 16652 & -24381;
            for (int i = 36 & 9088; i < list.size(); ++i) {
                Class_45087 class_45087 = (Class_45087)list.get(i);
                int n3 = n2 + class_45087.Method_45090();
                this.\u0000strictfp(Field_22025);
                GL11.glTexParameterf((int)(15845 & 4065), (int)(26946 & 14990), (float)(0.23863636f * 43987.43f));
                GL11.glTexParameterf((int)(7649 & 3559), (int)(10703 & -21997), (float)(11439.038f * 0.91764706f));
                Class_16867.Method_16931();
                Class_16867.Method_16969();
                Class_16867.Method_16952();
                Class_16867.Method_16930((16385 & 1665) != 0);
                Class_16867.Method_16984(3847 & 866, 8465 & -32213, 177 & 769, 8352 & 2049);
                double d4 = (double)class_47216.\u0000, `().Method_363() + (double)f;
                double d5 = Class_13337.Method_13352(-d4 * (2.05 * 0.09756097560975611) - (double)Class_13337.Method_13371(-d4 * (2.869565217391304 * 0.03484848484848485)));
                float f3 = class_45087.Method_45091()[-28464 & 10244];
                float f4 = class_45087.Method_45091()[10337 & 16405];
                float f5 = class_45087.Method_45091()[42 & 22807];
                double d6 = d4 * (0.967741935483871 * 0.025833333333333333) * (-0.016666666666666666 * 90.0);
                double d7 = 0.06666666666666667 * 3.0;
                double d8 = 1.0625 * 0.47058823529411764 + Math.cos(d6 + 0.05555555555555555 * 42.41150082346221) * (1.175 * 0.1702127659574468);
                double d9 = 9.0 * 0.05555555555555555 + Math.sin(d6 + 0.5365853658536586 * 4.391089731722097) * (3.2941176470588234 * 0.06071428571428572);
                double d10 = 6.2 * 0.08064516129032258 + Math.cos(d6 + 3.9565217391304346 * 0.19850722811144297) * (0.25846153846153846 * 0.7738095238095238);
                double d11 = 0.02238805970149254 * 22.333333333333332 + Math.sin(d6 + 1.5039539299100073 * 0.5222222222222223) * (0.975 * 0.20512820512820515);
                double d12 = 0.11267605633802817 * 4.4375 + Math.cos(d6 + 20.420352248333653 * 0.19230769230769232) * (0.7551020408163265 * 0.2648648648648649);
                double d13 = 2.375 * 0.21052631578947367 + Math.sin(d6 + 0.35802469135802467 * 10.96849159227471) * (0.9454545454545454 * 0.21153846153846156);
                double d14 = 0.27906976744186046 * 1.7916666666666667 + Math.cos(d6 + 5.434594188106481 * 1.0116279069767442) * (0.96 * 0.20833333333333334);
                double d15 = 0.22580645161290322 * 2.2142857142857144 + Math.sin(d6 + 2.088888888888889 * 2.6319193773425127) * (0.7931034482758621 * 0.25217391304347825);
                double d16 = 0.0;
                double d17 = 1.0;
                double d18 = -2.9545454545454546 * 0.3384615384615385 + d5;
                double d19 = (double)((float)class_45087.Method_45090() * f2) * (0.5989583333333334 * 4.173913043478261) + d18;
                class_22385.Method_22417(223 & 26631, Class_29585.Field_29586);
                class_22385.Method_22443(d + d8, d2 + (double)n3, d3 + d9).Method_22433(1.0, d19).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d8, d2 + (double)n2, d3 + d9).Method_22433(1.0, d18).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d10, d2 + (double)n2, d3 + d11).Method_22433(0.0, d18).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d10, d2 + (double)n3, d3 + d11).Method_22433(0.0, d19).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d14, d2 + (double)n3, d3 + d15).Method_22433(1.0, d19).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d14, d2 + (double)n2, d3 + d15).Method_22433(1.0, d18).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d12, d2 + (double)n2, d3 + d13).Method_22433(0.0, d18).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d12, d2 + (double)n3, d3 + d13).Method_22433(0.0, d19).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d10, d2 + (double)n3, d3 + d11).Method_22433(1.0, d19).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d10, d2 + (double)n2, d3 + d11).Method_22433(1.0, d18).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d14, d2 + (double)n2, d3 + d15).Method_22433(0.0, d18).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d14, d2 + (double)n3, d3 + d15).Method_22433(0.0, d19).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d12, d2 + (double)n3, d3 + d13).Method_22433(1.0, d19).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d12, d2 + (double)n2, d3 + d13).Method_22433(1.0, d18).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d8, d2 + (double)n2, d3 + d9).Method_22433(0.0, d18).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_22385.Method_22443(d + d8, d2 + (double)n3, d3 + d9).Method_22433(0.0, d19).Method_22427(f3, f4, f5, 1.0f).Method_22451();
                class_7644.Method_7647();
                Class_16867.Method_16947();
                Class_16867.Method_16984(5891 & 17354, -2293 & 2883, 833 & 12293, 13696 & -32766);
                Class_16867.Method_16930((16400 & -30425) != 0);
                d6 = 0.004761904761904762 * 42.0;
                d7 = 0.0425531914893617 * 4.7;
                d8 = 0.8705882352941177 * 0.918918918918919;
                d9 = 0.36538461538461536 * 0.5473684210526316;
                d10 = 0.2608695652173913 * 0.7666666666666667;
                d11 = 0.7250000000000001 * 1.103448275862069;
                d12 = 0.9032258064516129 * 0.8857142857142858;
                d13 = 1.115492957746479 * 0.7171717171717171;
                d14 = 0.0;
                d15 = 1.0;
                d16 = -0.5584415584415584 * 1.7906976744186047 + d5;
                d17 = (double)((float)class_45087.Method_45090() * f2) + d16;
                class_22385.Method_22417(8711 & -32761, Class_29585.Field_29586);
                class_22385.Method_22443(d + 0.3622641509433962 * 0.5520833333333334, d2 + (double)n3, d3 + 0.05660377358490567 * 3.533333333333333).Method_22433(1.0, d17).Method_22427(f3, f4, f5, 0.06896552f * 1.8125f).Method_22451();
                class_22385.Method_22443(d + 0.2595744680851064 * 0.7704918032786885, d2 + (double)n2, d3 + 0.3611111111111111 * 0.5538461538461539).Method_22433(1.0, d16).Method_22427(f3, f4, f5, 0.29268292f * 0.42708334f).Method_22451();
                class_22385.Method_22443(d + 0.9297297297297298 * 0.8604651162790697, d2 + (double)n2, d3 + 0.9148936170212766 * 0.2186046511627907).Method_22433(0.0, d16).Method_22427(f3, f4, f5, 0.28125f * 0.44444445f).Method_22451();
                class_22385.Method_22443(d + 1.4833333333333334 * 0.5393258426966292, d2 + (double)n3, d3 + 1.1857142857142857 * 0.16867469879518074).Method_22433(0.0, d17).Method_22427(f3, f4, f5, 0.008680556f * 14.4f).Method_22451();
                class_22385.Method_22443(d + 0.6626506024096386 * 1.2072727272727273, d2 + (double)n3, d3 + 0.22500000000000003 * 3.5555555555555554).Method_22433(1.0, d17).Method_22427(f3, f4, f5, 0.1f * 1.25f).Method_22451();
                class_22385.Method_22443(d + 18.8 * 0.0425531914893617, d2 + (double)n2, d3 + 0.047058823529411764 * 17.0).Method_22433(1.0, d16).Method_22427(f3, f4, f5, 0.067307696f * 1.8571428f).Method_22451();
                class_22385.Method_22443(d + 0.018518518518518517 * 10.8, d2 + (double)n2, d3 + 3.772727272727273 * 0.21204819277108433).Method_22433(0.0, d16).Method_22427(f3, f4, f5, 3.1111112f * 0.04017857f).Method_22451();
                class_22385.Method_22443(d + 0.26944444444444443 * 0.7422680412371134, d2 + (double)n3, d3 + 0.05747126436781609 * 13.920000000000002).Method_22433(0.0, d17).Method_22427(f3, f4, f5, 0.7473684f * 0.16725352f).Method_22451();
                class_22385.Method_22443(d + 1.8571428571428572 * 0.4307692307692308, d2 + (double)n3, d3 + 0.012765957446808512 * 15.666666666666666).Method_22433(1.0, d17).Method_22427(f3, f4, f5, 0.12352942f * 1.0119047f).Method_22451();
                class_22385.Method_22443(d + 4.072727272727273 * 0.19642857142857142, d2 + (double)n2, d3 + 0.09484536082474228 * 2.108695652173913).Method_22433(1.0, d16).Method_22427(f3, f4, f5, 0.5208334f * 0.24f).Method_22451();
                class_22385.Method_22443(d + 2.1724137931034484 * 0.3682539682539683, d2 + (double)n2, d3 + 0.1511627906976744 * 5.292307692307693).Method_22433(0.0, d16).Method_22427(f3, f4, f5, 0.08732877f * 1.4313725f).Method_22451();
                class_22385.Method_22443(d + 3.6 * 0.22222222222222224, d2 + (double)n3, d3 + 1.0879120879120878 * 0.7353535353535354).Method_22433(0.0, d17).Method_22427(f3, f4, f5, 0.12790698f * 0.97727275f).Method_22451();
                class_22385.Method_22443(d + 0.22988505747126436 * 0.8700000000000001, d2 + (double)n3, d3 + 0.8717948717948719 * 0.9176470588235294).Method_22433(1.0, d17).Method_22427(f3, f4, f5, 2.90625f * 0.043010753f).Method_22451();
                class_22385.Method_22443(d + 1.488888888888889 * 0.13432835820895522, d2 + (double)n2, d3 + 0.5176470588235295 * 1.5454545454545454).Method_22433(1.0, d16).Method_22427(f3, f4, f5, 0.12083334f * 1.0344827f).Method_22451();
                class_22385.Method_22443(d + 0.3384615384615385 * 0.5909090909090909, d2 + (double)n2, d3 + 0.49142857142857144 * 0.4069767441860465).Method_22433(0.0, d16).Method_22427(f3, f4, f5, 0.012658228f * 9.875f).Method_22451();
                class_22385.Method_22443(d + 1.0 * 0.2, d2 + (double)n3, d3 + 0.72 * 0.2777777777777778).Method_22433(0.0, d17).Method_22427(f3, f4, f5, 0.13690476f * 0.9130435f).Method_22451();
                class_7644.Method_7647();
                Class_16867.Method_16918();
                Class_16867.Method_16965();
                Class_16867.Method_16930((549 & -22463) != 0);
                n2 = n3;
            }
            Class_16867.Method_16978();
            if (Class_19426.Method_19570()) {
                Class_12440.Method_12748();
            }
        }
    }

    private static String Method_22027(String string) {
        int n = 7027;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22024.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_22028() {
        return (-31659 & 24617) != 0;
    }

    private void Method_22029() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_22030(Class_4879 class_4879, double d, double d2, double d3, float f, int n) {
        this.Method_22026((Class_47216)class_4879, d, d2, d3, f, n);
    }
}

