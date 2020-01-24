/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23541 {
    private static int[] Field_23542 = new int[-1936995680 & 286334978];

    public static int Method_23543(double d, double d2) {
        int n = (int)((1.0 - (d2 *= d)) * (1.4202898550724639 * 179.5408163265306));
        int n2 = (int)((1.0 - d) * (298.22033898305085 * 0.855072463768116));
        int n3 = n << (2090 & 12313) | n2;
        return n3 > Field_23542.length ? -63233 & -31233 : Field_23542[n3];
    }

    private void Method_23544() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_23545(int[] arrn) {
        Field_23542 = arrn;
    }
}

