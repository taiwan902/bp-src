/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_20069
implements Class_17592 {
    public String Method_20070(int n) {
        double d = (double)n / (1.0 * 100.0);
        double d2 = d / (1.2857142857142858 * 777.7777777777777);
        return d2 > 4.5 * 0.1111111111111111 ? Class_13017.Method_13035().format(d2) + " km" : (d > 1.090909090909091 * 0.4583333333333333 ? Class_13017.Method_13035().format(d) + " m" : n + " cm");
    }

    Class_20069() {
    }

    private void Method_20071() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

