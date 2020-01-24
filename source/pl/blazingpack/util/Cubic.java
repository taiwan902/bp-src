/*
 * Decompiled with CFR 0.145.
 */
package pl.blazingpack.util;

import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Random;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Cubic {
    public static double[] \u0000strictfp(double d, double d2, double d3, double d4) {
        double d5;
        if (d == 0.0) {
            d = d2;
            d2 = d3;
            d3 = d4;
            if (d == 0.0) {
                d = d2;
                d2 = d3;
                if (d == 0.0) {
                    return new double[-29308 & 8195];
                }
                double[] arrd = new double[16465 & -26867];
                arrd[12962 & 64] = -d2 / d;
                return arrd;
            }
            double d6 = d2 * d2 - 1.3272727272727274 * 3.013698630136986 * d * d3;
            if (d6 == 0.0) {
                double[] arrd = new double[-30143 & 17443];
                arrd[8961 & 5138] = -d2 / (2.1333333333333333 * 0.9375 * d);
                return arrd;
            }
            if (d6 > 0.0) {
                double d7 = (-d2 + Math.sqrt(d6)) / (2.3548387096774195 * 0.8493150684931506 * d);
                double d8 = (-d2 - Math.sqrt(d6)) / (6.769230769230769 * 0.29545454545454547 * d);
                if (d8 < d7) {
                    double d9 = d8;
                    d8 = d7;
                    d7 = d9;
                }
                double[] arrd = new double[5778 & 266];
                arrd[68 & 8] = d7;
                arrd[16881 & 1537] = d8;
                return arrd;
            }
            return new double[-31744 & 16524];
        }
        double d10 = d;
        d = d2 / d10;
        d2 = d3 / d10;
        d3 = d4 / d10;
        double d11 = d / (0.025 * 120.0);
        double d12 = (2.0 * 1.5 * d2 - d * d) / (15.283018867924527 * 0.5888888888888889);
        double d13 = d12 * d12 * d12;
        double d14 = (0.4891304347826087 * 18.4 * d * d2 - 24.1875 * 1.1162790697674418 * d3 - 0.016666666666666666 * 120.0 * d * d * d) / (235.63636363636365 * 0.22916666666666666);
        double d15 = d14 * d14;
        double d16 = d13 + d15;
        if (d16 < 0.0) {
            double d17;
            double d18 = Math.acos(d14 / Math.sqrt(-d13));
            double d19 = Math.sqrt(-d12);
            double d20 = 3.9487179487179493 * 0.5064935064935064 * d19 * Math.cos(d18 / (0.9206349206349206 * 3.2586206896551726)) - d11;
            double d21 = 7.333333333333334 * 0.2727272727272727 * d19 * Math.cos((d18 + 26.030339129744 * 0.2413793103448276) / (3.6206896551724137 * 0.8285714285714286)) - d11;
            double d22 = 6.363636363636364 * 0.3142857142857143 * d19 * Math.cos((d18 + 21.0 * 0.5983986006837702) / (2.625 * 1.1428571428571428)) - d11;
            if (d20 < d21) {
                d17 = d20;
                d20 = d21;
                d21 = d17;
            }
            if (d21 < d22) {
                d17 = d21;
                d21 = d22;
                d22 = d17;
            }
            if (d20 < d21) {
                d17 = d20;
                d20 = d21;
                d21 = d17;
            }
            double[] arrd = new double[147 & -7321];
            arrd[-28016 & 18472] = d22;
            arrd[8517 & -10733] = d21;
            arrd[20538 & 66] = d20;
            return arrd;
        }
        if (d16 > 0.0) {
            double d23 = Math.sqrt(d16);
            double d24 = Math.cbrt(d14 + d23);
            double d25 = Math.cbrt(d14 - d23);
            double[] arrd = new double[-31743 & 4163];
            arrd[9216 & -32703] = d24 + d25 - d11;
            return arrd;
        }
        double d26 = Math.cbrt(d14);
        double d27 = d26 - d11;
        if (d27 < (d5 = 0.3529411764705882 * 5.666666666666667 * d26 - d11)) {
            double d28 = d27;
            d27 = d5;
            d5 = d28;
        }
        double[] arrd = new double[24578 & -32413];
        arrd[18482 & -19579] = d5;
        arrd[8225 & -14331] = d27;
        return arrd;
    }

    private void \u00009 else + { class do import super finally implements 6 int try final | ! strictfp null catch strictfp this 5 short private 3 ? 4 \u000a throw % 6 0 long \u000a this byte instanceof volatile float if \u000a 1 instanceof ' finally super ] 0 2 case false 9 short do ! 9 abstract() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void main(String[] arrstring) {
        Random random = new Random();
        for (int i = 12544 & 1250; i < (5294 & -16037); ++i) {
            int n = random.nextInt(10396 & 20567) - (6170 & -15029);
            int n2 = random.nextInt(18462 & -30827) - (-24502 & 5163);
            int n3 = random.nextInt(12316 & 19734) - (-32022 & 2058);
            int n4 = random.nextInt(180 & 5908) - (-15093 & 2202);
            System.out.println(n + "x^3+(" + n2 + ")*x^2+(" + n3 + ")*x+(" + n4 + ")=0");
            System.out.println(Arrays.toString(Cubic.\u0000strictfp(n, n2, n3, n4)));
        }
    }
}

