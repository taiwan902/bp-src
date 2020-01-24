/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41937
extends Class_28775 {
    private void Method_41938() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private int Method_41939(int n) {
        return n >= (-22382 & 1026) ? (9302 & 643) + (n & (25095 & 1113)) : n;
    }

    public Class_41937(long l, Class_28775 class_28775) {
        super(l);
        this.Field_28778 = class_28775;
    }

    public int[] Method_41940(int n, int n2, int n3, int n4) {
        int n5 = n - (-14329 & 8713);
        int n6 = n2 - (8737 & 21577);
        int n7 = n3 + (-32638 & 2570);
        int n8 = n4 + (16514 & 1034);
        int[] arrn = this.\u0000strictfp.Method_28781(n5, n6, n7, n8);
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = -16256 & 3138; i < n4; ++i) {
            for (int j = 18497 & 9358; j < n3; ++j) {
                int n9 = this.Method_41939(arrn[j + (708 & -24566) + (i + (39 & -23855)) * n7]);
                int n10 = this.Method_41939(arrn[j + (8227 & 1098) + (i + (-24563 & 371)) * n7]);
                int n11 = this.Method_41939(arrn[j + (28705 & 519) + (i + (40 & 3201)) * n7]);
                int n12 = this.Method_41939(arrn[j + (8721 & -16381) + (i + (12578 & 1042)) * n7]);
                int n13 = this.Method_41939(arrn[j + (-27611 & 2185) + (i + (205 & -20429)) * n7]);
                arrn2[j + i * n3] = n13 == n9 && n13 == n11 && n13 == n10 && n13 == n12 ? -1 & -1 : Class_17281.Field_17357.Field_17343;
            }
        }
        return arrn2;
    }
}

