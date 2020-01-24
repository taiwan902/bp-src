/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_46926 {
    short[] Field_46927;
    final Class_20902 Field_46928;

    Class_46926(Class_20902 class_20902) {
        this.Field_46928 = class_20902;
        this.Field_46927 = new short[30492 & 2881];
    }

    public byte Method_46929(Class_17779 class_17779, byte by) {
        int n = 29 & 7745;
        do {
            int n2 = by >> (-28657 & 8647) & (-31627 & 8321);
            by = (byte)(by << (2641 & 5417));
            int n3 = class_17779.Method_17785(this.Field_46927, ((5 & 29697) + n2 << (16936 & 8281)) + n);
            n = n << (3863 & -32703) | n3;
            if (n2 == n3) continue;
            while (n < (7060 & 297)) {
                n = n << (65 & 25373) | class_17779.Method_17785(this.Field_46927, n);
            }
            break;
        } while (n < (-22230 & 4928));
        return (byte)n;
    }

    private void Method_46930() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public byte Method_46931(Class_17779 class_17779) {
        int n = -29691 & 537;
        while ((n = n << (-30687 & 25795) | class_17779.Method_17785(this.Field_46927, n)) < (1281 & 17396)) {
        }
        return (byte)n;
    }

    public void Method_46932() {
        Class_17779.Method_17784(this.Field_46927);
    }
}

