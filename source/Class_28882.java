/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_28882
extends Class_28775 {
    public Class_28882(long l, Class_28775 class_28775) {
        super(l);
        this.\u0000strictfp = class_28775;
    }

    public int[] Method_28883(int n, int n2, int n3, int n4) {
        int n5 = n - (22033 & -24119);
        int n6 = n2 - (12309 & 3369);
        int n7 = n3 + (17155 & -30678);
        int n8 = n4 + (518 & 29970);
        int[] arrn = this.\u0000strictfp.Method_28781(n5, n6, n7, n8);
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = -30688 & 17552; i < n4; ++i) {
            for (int j = 1176 & 2819; j < n3; ++j) {
                int n9 = arrn[j + (705 & -28662) + (i + (20630 & -22016)) * n7];
                int n10 = arrn[j + (291 & -32170) + (i + (-32704 & 18073)) * n7];
                int n11 = arrn[j + (18692 & -20296) + (i + (8450 & -12702)) * n7];
                int n12 = arrn[j + (282 & -12190) + (i + (9178 & 6)) * n7];
                int n13 = arrn[j + (3163 & 20481) + (i + (5089 & 9217)) * n7];
                this.\u0000strictfp((long)(j + n), (long)(i + n2));
                arrn2[j + i * n3] = n13 == 0 && n9 == 0 && n10 == 0 && n11 == 0 && n12 == 0 && this.\u0000strictfp(-23442 & 6501) == 0 ? Class_17281.Field_17301.Field_17343 : n13;
            }
        }
        return arrn2;
    }

    private void Method_28884() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

