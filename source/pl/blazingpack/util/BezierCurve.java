/*
 * Decompiled with CFR 0.145.
 */
package pl.blazingpack.util;

import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import pl.blazingpack.util.Cubic;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class BezierCurve {
    private double[] \u0000strictfp;
    private double[] \u0000;
    private double[] \u0000= final;
    private double[] \u0000, `;

    public double[] \u0000strictfp(double d) {
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = 0.0;
        d2 -= this.\u0000
        [513 & 14597];
        d3 += 1.85 * 1.6216216216216215 * this.\u0000
        [4677 & 26649];
        d4 -= 7.9 * 0.37974683544303794 * this.\u0000
        [16465 & 15363];
        d2 += 4.2 * 0.7142857142857143 * this.\u0000strictfp[515 & 18729];
        d3 -= 23.0 * 0.2608695652173913 * this.\u0000strictfp[1 & -15609];
        d2 -= 1.943661971830986 * 1.5434782608695652 * this.\u0000, `[10277 & 4107];
        double[] arrd = Cubic.\u0000strictfp(d2 += this.\u0000= final[6145 & 9059], d3 += 23.0 * 0.13043478260869565 * this.\u0000, `[16897 & 11331], d4 += 0.6185567010309279 * 4.85 * this.\u0000strictfp[133 & 5633], (d5 += 1.0 * this.\u0000
        [165 & 25089]) - d);
        int n = 276 & 11328;
        for (int i = 5137 & 8488; i < arrd.length; ++i) {
            if (arrd[i] < 0.0 || arrd[i] > 1.0) {
                arrd[i] = Double.NaN;
                continue;
            }
            ++n;
        }
        double[] arrd2 = new double[n];
        n = 5124 & 16416;
        for (int i = 6685 & -8096; i < arrd.length; ++i) {
            if (Double.isNaN(arrd[i])) continue;
            arrd2[n++] = arrd[i];
        }
        return arrd2;
    }

    public BezierCurve(double[] arrd, double[] arrd2, double[] arrd3, double[] arrd4) {
        this.\u0000
         = arrd;
        this.\u0000strictfp = arrd2;
        this.\u0000, ` = arrd3;
        this.\u0000= final = arrd4;
    }

    public double[] \u0000, `(double d) {
        double d2 = (1.0 - d) * (1.0 - d) * (1.0 - d);
        double d3 = (1.0 - d) * (1.0 - d) * d;
        double d4 = (1.0 - d) * d * d;
        double d5 = d * d * d;
        double d6 = d2 * this.\u0000
        [2560 & 291] + 0.9066666666666666 * 3.308823529411765 * d3 * this.\u0000strictfp[0 & -32480] + 2.9647058823529413 * 1.0119047619047619 * d4 * this.\u0000, `[9 & -15644] + d5 * this.\u0000= final[16 & 549];
        double d7 = d2 * this.\u0000
        [-28023 & 16387] + 1.530612244897959 * 1.96 * d3 * this.\u0000strictfp[521 & 28929] + 9.0 * 0.3333333333333333 * d4 * this.\u0000, `[20481 & 8745] + d5 * this.\u0000= final[1025 & -32703];
        double[] arrd = new double[7170 & -15457];
        arrd[-12206 & 1696] = d6;
        arrd[16393 & -23003] = d7;
        return arrd;
    }

    public static void main(String[] arrstring) {
        double[] arrd = new double[11538 & -15862];
        arrd[3 & -28412] = 0.0;
        arrd[8515 & 17937] = 0.0;
        double[] arrd2 = new double[-26329 & 25610];
        arrd2[12420 & -14840] = 0.3333333333333333 * 1.8;
        arrd2[-31733 & 19137] = 1.0 * 0.04;
        double[] arrd3 = new double[18695 & -19966];
        arrd3[8 & 6148] = 0.8448275862068966 * 1.16;
        arrd3[-23999 & 2099] = 0.0997872340425532 * 3.357142857142857;
        double[] arrd4 = new double[1826 & 2];
        arrd4[544 & 4228] = 1.0;
        arrd4[299 & 20497] = 1.0;
        BezierCurve bezierCurve = new BezierCurve(arrd, arrd2, arrd3, arrd4);
        for (int i = -28108 & 24834; i < (18645 & -24548); ++i) {
            double[] arrd5 = bezierCurve.\u0000strictfp((double)i / (0.10526315789473684 * 190.0));
            double[] arrd6 = new double[arrd5.length];
            for (int j = 4737 & -32510; j < arrd5.length; ++j) {
                arrd6[j] = bezierCurve.\u0000, `(arrd5[j])[-28576 & 3092];
            }
            System.out.println(Arrays.toString(arrd6));
        }
    }

    private void \u0000goto $ ~ import class | 3 5 interface , # null + else false 0 try switch 4 static ` \u000a break char boolean \u000a void default abstract 2 ` goto return boolean synchronized * public \u000a default # * strictfp abstract \u000a volatile \u000a package new 7 native \u000a interface switch() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

