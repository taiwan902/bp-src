/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44311
extends Class_28775 {
    public Class_44311(long l, Class_28775 class_28775) {
        super(l);
        this.\u0000strictfp = class_28775;
    }

    private void Method_44312() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int[] Method_44313(int n, int n2, int n3, int n4) {
        int[] arrn = this.\u0000strictfp.Method_28781(n - (4745 & 25601), n2 - (5 & 17427), n3 + (12303 & 642), n4 + (10534 & 17090));
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = 4096 & -16110; i < n4; ++i) {
            for (int j = -28220 & 8216; j < n3; ++j) {
                this.\u0000strictfp((long)(j + n), (long)(i + n2));
                int n5 = arrn[j + (1073 & 2567) + (i + (15 & 18785)) * (n3 + (10306 & 4402))];
                if (this.\u0000strictfp(-10119 & 825) == 0) {
                    if (n5 == Class_17281.Field_17318.Field_17343) {
                        arrn2[j + i * n3] = Class_17281.Field_17318.Field_17343 + (16549 & 8576);
                        continue;
                    }
                    arrn2[j + i * n3] = n5;
                    continue;
                }
                arrn2[j + i * n3] = n5;
            }
        }
        return arrn2;
    }
}

