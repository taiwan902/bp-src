/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_46871
extends Class_28775 {
    public int[] Method_46872(int n, int n2, int n3, int n4) {
        int[] arrn = this.\u0000strictfp.Method_28781(n, n2, n3, n4);
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = 385 & 4160; i < n4; ++i) {
            for (int j = -24512 & 3080; j < n3; ++j) {
                this.\u0000strictfp((long)(j + n), (long)(i + n2));
                arrn2[j + i * n3] = arrn[j + i * n3] > 0 ? this.\u0000strictfp(277141503 & 1092588511) + (554 & 2050) : 12808 & 17602;
            }
        }
        return arrn2;
    }

    public Class_46871(long l, Class_28775 class_28775) {
        super(l);
        this.\u0000strictfp = class_28775;
    }

    private void Method_46873() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

