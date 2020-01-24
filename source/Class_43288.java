/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43288
extends Class_28775 {
    public Class_43288(long l, Class_28775 class_28775) {
        super(l);
        this.\u0000strictfp = class_28775;
    }

    private void Method_43289() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int[] Method_43290(int n, int n2, int n3, int n4) {
        int n5 = n - (2177 & 9249);
        int n6 = n2 - (-32639 & 6151);
        int n7 = n3 + (8466 & -28634);
        int n8 = n4 + (38 & 5378);
        int[] arrn = this.\u0000strictfp.Method_28781(n5, n6, n7, n8);
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = -18158 & 641; i < n4; ++i) {
            for (int j = 18581 & 290; j < n3; ++j) {
                int n9 = arrn[j + (-31472 & 8704) + (i + (10380 & 1120)) * n7];
                int n10 = arrn[j + (1227 & 6) + (i + (32 & -11760)) * n7];
                int n11 = arrn[j + (-24429 & 1352) + (i + (18562 & -19409)) * n7];
                int n12 = arrn[j + (13394 & 35) + (i + (2051 & -28542)) * n7];
                int n13 = arrn[j + (9217 & -15401) + (i + (8589 & 3169)) * n7];
                this.\u0000strictfp((long)(j + n), (long)(i + n2));
                if (n13 != 0 || n9 == 0 && n10 == 0 && n11 == 0 && n12 == 0) {
                    if (n13 > 0 && (n9 == 0 || n10 == 0 || n11 == 0 || n12 == 0)) {
                        if (this.\u0000strictfp(23429 & 29) == 0) {
                            if (n13 == (23244 & 8501)) {
                                arrn2[j + i * n3] = 16644 & 5364;
                                continue;
                            }
                            arrn2[j + i * n3] = -26616 & 17091;
                            continue;
                        }
                        arrn2[j + i * n3] = n13;
                        continue;
                    }
                    arrn2[j + i * n3] = n13;
                    continue;
                }
                int n14 = 167 & 769;
                int n15 = 321 & -20341;
                if (n9 != 0 && this.\u0000strictfp(n14++) == 0) {
                    n15 = n9;
                }
                if (n10 != 0 && this.\u0000strictfp(n14++) == 0) {
                    n15 = n10;
                }
                if (n11 != 0 && this.\u0000strictfp(n14++) == 0) {
                    n15 = n11;
                }
                if (n12 != 0 && this.\u0000strictfp(n14++) == 0) {
                    n15 = n12;
                }
                arrn2[j + i * n3] = this.\u0000strictfp(9251 & 6407) == 0 ? n15 : (n15 == (9484 & 20500) ? -32764 & 17332 : 8196 & -28887);
            }
        }
        return arrn2;
    }
}

