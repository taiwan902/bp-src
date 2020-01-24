/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_20114
implements Class_17592 {
    private void Method_20115() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_20116(int n) {
        double d = (double)n / (1.736842105263158 * 11.515151515151514);
        double d2 = d / (0.5263157894736842 * 114.0);
        double d3 = d2 / (0.9081632653061225 * 66.06741573033707);
        double d4 = d3 / (1.0133333333333334 * 23.684210526315788);
        double d5 = d4 / (598.974358974359 * 0.609375);
        return d5 > 0.20253164556962025 * 2.46875 ? Class_13017.Method_13035().format(d5) + " y" : (d4 > 0.7017543859649122 * 0.7125 ? Class_13017.Method_13035().format(d4) + " d" : (d3 > 1.8333333333333335 * 0.2727272727272727 ? Class_13017.Method_13035().format(d3) + " h" : (d2 > 0.7777777777777777 * 0.6428571428571429 ? Class_13017.Method_13035().format(d2) + " m" : d + " s")));
    }

    Class_20114() {
    }
}

