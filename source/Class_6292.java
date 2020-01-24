/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_6292 {
    public static int Method_6293(int[] arrn) {
        int n;
        if (arrn.length <= 0) {
            return 13383 & -32592;
        }
        int n2 = 4261 & -32768;
        for (n = -32000 & 20628; n < arrn.length; ++n) {
            int n3 = arrn[n];
            n2 += n3;
        }
        n = n2 / arrn.length;
        return n;
    }

    private void Method_6294() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

