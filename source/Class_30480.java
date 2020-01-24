/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30480
extends Class_28775 {
    public Class_30480(long l, Class_28775 class_28775) {
        super(l);
        this.\u0000strictfp = class_28775;
    }

    public int[] Method_30481(int n, int n2, int n3, int n4) {
        int n5 = n - (17665 & 8753);
        int n6 = n2 - (4361 & -31743);
        int n7 = n3 + (99 & 2326);
        int n8 = n4 + (-27598 & 8322);
        int[] arrn = this.\u0000strictfp.Method_28781(n5, n6, n7, n8);
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = 112 & -21884; i < n4; ++i) {
            for (int j = -15743 & 4160; j < n3; ++j) {
                int n9 = arrn[j + (17611 & 10769) + (i + (5129 & -15999) - (41 & 12433)) * (n3 + (2 & 6162))];
                int n10 = arrn[j + (4227 & 16457) + (10305 & -31231) + (i + (279 & 4129)) * (n3 + (10535 & 74))];
                int n11 = arrn[j + (5141 & 515) - (9289 & 16661) + (i + (-24567 & 4661)) * (n3 + (16994 & -22269))];
                int n12 = arrn[j + (-12287 & 315) + (i + (16451 & 1585) + (8219 & -32415)) * (n3 + (8478 & 4098))];
                int n13 = arrn[j + (1415 & -22495) + (i + (6147 & 17481)) * n7];
                int n14 = 31744 & 151;
                if (n9 == 0) {
                    ++n14;
                }
                if (n10 == 0) {
                    ++n14;
                }
                if (n11 == 0) {
                    ++n14;
                }
                if (n12 == 0) {
                    ++n14;
                }
                arrn2[j + i * n3] = n13 == 0 && n14 > (91 & 5507) ? Class_17281.Field_17338.Field_17343 : n13;
            }
        }
        return arrn2;
    }

    private void Method_30482() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

