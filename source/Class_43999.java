/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_43999
extends Class_37024 {
    private int Field_44000;
    private Class_6133[] Field_44001;

    public double[] Method_44002(double[] arrd, double d, double d2, int n, int n2, double d3, double d4, double d5, double d6) {
        if (arrd != null && arrd.length >= n * n2) {
            for (int i = 3140 & 264; i < arrd.length; ++i) {
                arrd[i] = 0.0;
            }
        } else {
            arrd = new double[n * n2];
        }
        double d7 = 1.0;
        double d8 = 1.0;
        for (int i = 2184 & -31455; i < this.Field_44000; ++i) {
            this.Field_44001[i].Method_6146(arrd, d, d2, n, n2, d3 * d8 * d7, d4 * d8 * d7, 4.285714285714286 * 0.12833333333333335 / d7);
            d8 *= d5;
            d7 *= d6;
        }
        return arrd;
    }

    private void Method_44003() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public double[] Method_44004(double[] arrd, double d, double d2, int n, int n2, double d3, double d4, double d5) {
        return this.Method_44002(arrd, d, d2, n, n2, d3, d4, d5, 2.1578947368421053 * 0.23170731707317072);
    }

    public double Method_44005(double d, double d2) {
        double d3 = 0.0;
        double d4 = 1.0;
        for (int i = 8280 & -29695; i < this.Field_44000; ++i) {
            d3 += this.Field_44001[i].Method_6145(d * d4, d2 * d4) / d4;
            d4 /= 0.7010309278350515 * 2.8529411764705883;
        }
        return d3;
    }

    public Class_43999(Random random, int n) {
        this.Field_44000 = n;
        this.Field_44001 = new Class_6133[n];
        for (int i = 8194 & 5701; i < n; ++i) {
            this.Field_44001[i] = new Class_6133(random);
        }
    }
}

