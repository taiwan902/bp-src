/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33928
extends Class_28775 {
    public Class_33928(long l, Class_28775 class_28775) {
        super(l);
        this.\u0000strictfp = class_28775;
    }

    public int[] Method_33929(int n, int n2, int n3, int n4) {
        int n5 = n - (25987 & 1);
        int n6 = n2 - (30885 & 1025);
        int n7 = n3 + (34 & 3138);
        int n8 = n4 + (16386 & 8215);
        int[] arrn = this.\u0000strictfp.Method_28781(n5, n6, n7, n8);
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = 256 & -11091; i < n4; ++i) {
            for (int j = 3072 & 219; j < n3; ++j) {
                int n9;
                int n10 = arrn[j + (1485 & 8195) + (i + (225 & 17413) - (265 & 24673)) * (n3 + (21870 & -32637))];
                int n11 = arrn[j + (-32327 & 14343) + (24641 & 1037) + (i + (25153 & 1281)) * (n3 + (-32590 & 1026))];
                int n12 = arrn[j + (8471 & -32639) - (20533 & -30591) + (i + (29889 & 2579)) * (n3 + (-22521 & 194))];
                int n13 = arrn[j + (1317 & 8201) + (i + (1 & 17203) + (769 & 161)) * (n3 + (8230 & -14325))];
                arrn2[j + i * n3] = n9 = arrn[j + (16393 & -28415) + (i + (8385 & -28669)) * n7];
                this.\u0000strictfp((long)(j + n), (long)(i + n2));
                if (n9 != 0 || n10 != 0 || n11 != 0 || n12 != 0 || n13 != 0 || this.\u0000strictfp(12551 & 16594) != 0) continue;
                arrn2[j + i * n3] = 137 & -31743;
            }
        }
        return arrn2;
    }

    private void Method_33930() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

