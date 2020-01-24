/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32553
extends Class_28775 {
    public int[] Method_32554(int n, int n2, int n3, int n4) {
        int n5 = n - (18441 & 195);
        int n6 = n2 - (13 & 7201);
        int n7 = n3 + (526 & 18562);
        int n8 = n4 + (18515 & 4770);
        int[] arrn = this.\u0000strictfp.Method_28781(n5, n6, n7, n8);
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = 532 & 17440; i < n4; ++i) {
            for (int j = 6308 & -7936; j < n3; ++j) {
                int n9 = arrn[j + (16400 & -18834) + (i + (28869 & -31231)) * n7];
                int n10 = arrn[j + (-25590 & 16594) + (i + (8209 & 6379)) * n7];
                int n11 = arrn[j + (91 & -25567) + (i + (516 & -32480)) * n7];
                int n12 = arrn[j + (25 & -11967) + (i + (12386 & -30841)) * n7];
                int n13 = arrn[j + (-23013 & 133) + (i + (16385 & 11915)) * n7];
                if (n9 == n10 && n11 == n12) {
                    this.\u0000strictfp((long)(j + n), (long)(i + n2));
                    n13 = this.\u0000strictfp(27042 & 518) == 0 ? n9 : n11;
                } else {
                    if (n9 == n10) {
                        n13 = n9;
                    }
                    if (n11 == n12) {
                        n13 = n11;
                    }
                }
                arrn2[j + i * n3] = n13;
            }
        }
        return arrn2;
    }

    public Class_32553(long l, Class_28775 class_28775) {
        super(l);
        this.Field_28778 = class_28775;
    }

    private void Method_32555() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

