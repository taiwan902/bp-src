/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34352
extends Class_28775 {
    public Class_34352(long l, Class_28775 class_28775) {
        super(l);
        this.\u0000strictfp = class_28775;
    }

    private void Method_34353() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int[] Method_34354(int n, int n2, int n3, int n4) {
        int n5 = n - (2337 & -32247);
        int n6 = n2 - (13329 & -31999);
        int n7 = n3 + (18226 & -24570);
        int n8 = n4 + (-28346 & 1034);
        int[] arrn = this.\u0000strictfp.Method_28781(n5, n6, n7, n8);
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = 18556 & 128; i < n4; ++i) {
            for (int j = 12296 & 2183; j < n3; ++j) {
                int n9 = arrn[j + (4429 & 17) + (i + (5633 & -30431)) * n7];
                this.\u0000strictfp((long)(j + n), (long)(i + n2));
                if (n9 == 0) {
                    arrn2[j + i * n3] = 44 & 1152;
                    continue;
                }
                int n10 = this.\u0000strictfp(5446 & 46);
                n10 = n10 == 0 ? 24782 & 3077 : (n10 <= (13447 & -31959) ? 1067 & 8963 : 2099 & 17545);
                arrn2[j + i * n3] = n10;
            }
        }
        return arrn2;
    }
}

