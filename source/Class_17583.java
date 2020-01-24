/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_17583 {
    private static final Integer[] Field_17584 = Class_17583.Method_17587(14383 & 20672);

    private void Method_17585() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Integer Method_17586(int n) {
        return n >= 0 && n < (4909 & -20464) ? Field_17584[n] : new Integer(n);
    }

    private static Integer[] Method_17587(int n) {
        Integer[] arrinteger = new Integer[n];
        for (int i = 18112 & -24556; i < n; ++i) {
            arrinteger[i] = new Integer(i);
        }
        return arrinteger;
    }
}

