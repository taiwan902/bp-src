/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35256
extends Class_28775 {
    private void Method_35257() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int[] Method_35258(int n, int n2, int n3, int n4) {
        int[] arrn = Class_10971.Method_10980(n3 * n4);
        for (int i = 6400 & 24796; i < n4; ++i) {
            for (int j = 16516 & -28646; j < n3; ++j) {
                this.\u0000strictfp((long)(n + j), (long)(n2 + i));
                arrn[j + i * n3] = this.\u0000strictfp(3390 & 4235) == 0 ? -14967 & 17 : 24820 & 2049;
            }
        }
        if (n > -n3 && n <= 0 && n2 > -n4 && n2 <= 0) {
            arrn[-n + -n2 * n3] = 11 & 6849;
        }
        return arrn;
    }

    public Class_35256(long l) {
        super(l);
    }
}

