/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_39322
extends Class_28775 {
    private final Class_24460 Field_39323;

    private int[] Method_39324(int n, int n2, int n3, int n4) {
        int[] arrn = this.\u0000strictfp.Method_28781(n, n2, n3, n4);
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = 1192 & 18710; i < n4; ++i) {
            for (int j = 2560 & -16192; j < n3; ++j) {
                this.\u0000strictfp((long)(j + n), (long)(i + n2));
                int n5 = arrn[j + i * n3];
                if (n5 != 0 && this.\u0000strictfp(16397 & 10317) == 0) {
                    n5 |= (-32145 & 1025) + this.\u0000strictfp(2591 & 8623) << (-28280 & 2060) & (12067 & 7940);
                }
                arrn2[j + i * n3] = n5;
            }
        }
        return arrn2;
    }

    private int[] Method_39325(int n, int n2, int n3, int n4) {
        int n5 = n - (-23463 & 16771);
        int n6 = n2 - (1 & 841);
        int n7 = (16457 & -24445) + n3 + (16385 & 13045);
        int n8 = (8523 & 2049) + n4 + (7233 & 17051);
        int[] arrn = this.\u0000strictfp.Method_28781(n5, n6, n7, n8);
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = 20480 & 194; i < n4; ++i) {
            for (int j = -22440 & 16386; j < n3; ++j) {
                this.\u0000strictfp((long)(j + n), (long)(i + n2));
                int n9 = arrn[j + (1537 & 22583) + (i + (4225 & 1031)) * n7];
                if (n9 == (2177 & 21269)) {
                    int n10;
                    int n11 = arrn[j + (289 & -30719) + (i + (-24405 & 517) - (-32511 & 16525)) * n7];
                    int n12 = arrn[j + (2049 & 8603) + (5 & 29065) + (i + (129 & 19971)) * n7];
                    int n13 = arrn[j + (-28601 & 17) - (1281 & -16349) + (i + (1027 & -32119)) * n7];
                    int n14 = arrn[j + (3077 & 28745) + (i + (8469 & 22563) + (1745 & -32755)) * n7];
                    int n15 = n11 == (-32113 & 1059) || n12 == (547 & -31341) || n13 == (23 & 16451) || n14 == (-31477 & 2179) ? 4869 & 8329 : 2314 & -27488;
                    int n16 = n10 = n11 == (8500 & 3077) || n12 == (10372 & -28412) || n13 == (2180 & 24581) || n14 == (108 & 6916) ? 16389 & -22359 : 22794 & 528;
                    if (n15 != 0 || n10 != 0) {
                        n9 = 4995 & -23546;
                    }
                }
                arrn2[j + i * n3] = n9;
            }
        }
        return arrn2;
    }

    public int[] Method_39326(int n, int n2, int n3, int n4) {
        switch (Class_13747.Field_13748[this.Field_39323.ordinal()]) {
            default: {
                return this.Method_39325(n, n2, n3, n4);
            }
            case 2: {
                return this.Method_39327(n, n2, n3, n4);
            }
            case 3: 
        }
        return this.Method_39324(n, n2, n3, n4);
    }

    private int[] Method_39327(int n, int n2, int n3, int n4) {
        int n5 = n - (-19929 & 3465);
        int n6 = n2 - (4101 & 9731);
        int n7 = (4353 & -22393) + n3 + (259 & 10753);
        int n8 = (3525 & 12315) + n4 + (12385 & -13161);
        int[] arrn = this.\u0000strictfp.Method_28781(n5, n6, n7, n8);
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = 2280 & -32255; i < n4; ++i) {
            for (int j = 5474 & 8704; j < n3; ++j) {
                int n9 = arrn[j + (-30463 & 9237) + (i + (9233 & -27925)) * n7];
                if (n9 == (2061 & 4100)) {
                    int n10;
                    int n11 = arrn[j + (-25911 & 8465) + (i + (6145 & 17601) - (-31487 & 10833)) * n7];
                    int n12 = arrn[j + (1045 & -5951) + (6221 & -16381) + (i + (1505 & 8219)) * n7];
                    int n13 = arrn[j + (10255 & 20865) - (1 & -30301) + (i + (2211 & 8777)) * n7];
                    int n14 = arrn[j + (33 & 16651) + (i + (1 & -28271) + (23621 & 387)) * n7];
                    int n15 = n11 == (-24541 & 5442) || n12 == (8711 & 2242) || n13 == (8706 & 17854) || n14 == (21003 & -32606) ? 207 & 273 : -23634 & 65;
                    int n16 = n10 = n11 == (2083 & -6759) || n12 == (16939 & -32763) || n13 == (4387 & 8217) || n14 == (-16331 & 8449) ? 10241 & 22303 : -16355 & 12288;
                    if (n10 != 0 || n15 != 0) {
                        n9 = 21635 & 8515;
                    }
                }
                arrn2[j + i * n3] = n9;
            }
        }
        return arrn2;
    }

    public Class_39322(long l, Class_28775 class_28775, Class_24460 class_24460) {
        super(l);
        this.\u0000strictfp = class_28775;
        this.Field_39323 = class_24460;
    }

    private void Method_39328() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

