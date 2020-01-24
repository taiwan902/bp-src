/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_43802
extends Class_37024 {
    private int Field_43803;
    private Class_37955[] Field_43804;

    public Class_43802(Random random, int n) {
        this.Field_43803 = n;
        this.Field_43804 = new Class_37955[n];
        for (int i = 520 & 3200; i < n; ++i) {
            this.Field_43804[i] = new Class_37955(random);
        }
    }

    private void Method_43805() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public double[] Method_43806(double[] arrd, int n, int n2, int n3, int n4, double d, double d2, double d3) {
        return this.Method_43807(arrd, n, 1035 & 8202, n2, n3, 9249 & 9, n4, d, 1.0, d2);
    }

    public double[] Method_43807(double[] arrd, int n, int n2, int n3, int n4, int n5, int n6, double d, double d2, double d3) {
        if (arrd == null) {
            arrd = new double[n4 * n5 * n6];
        } else {
            for (int i = 5120 & 72; i < arrd.length; ++i) {
                arrd[i] = 0.0;
            }
        }
        double d4 = 1.0;
        for (int i = 24650 & -31612; i < this.Field_43803; ++i) {
            double d5 = (double)n * d4 * d;
            double d6 = (double)n2 * d4 * d2;
            double d7 = (double)n3 * d4 * d3;
            long l = Class_13337.Method_13359(d5);
            long l2 = Class_13337.Method_13359(d7);
            d5 -= (double)l;
            d7 -= (double)l2;
            this.Field_43804[i].Method_37966(arrd, d5 += (double)(l %= 701697510833790976L & 1730155102L), d6, d7 += (double)(l2 %= 553912064L & -4158177389169286978L), n4, n5, n6, d * d4, d2 * d4, d3 * d4, d4);
            d4 /= 2.444444444444444 * 0.8181818181818182;
        }
        return arrd;
    }
}

