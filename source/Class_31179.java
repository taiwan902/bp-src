/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31179
extends Class_28775 {
    private boolean Method_31180(int n) {
        return Class_17281.Method_17396(n) instanceof Class_22657;
    }

    private void Method_31181() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private boolean Method_31182(int n) {
        return (Class_17281.Method_17396(n) != null && Class_17281.Method_17396(n).Method_17378() == Class_37772.class ? 16579 & 1061 : (n == Class_17281.Field_17331.Field_17343 || n == Class_17281.Field_17335.Field_17343 || n == Class_17281.Field_17289.Field_17343 || n == Class_17281.Field_17351.Field_17343 || n == Class_17281.Field_17332.Field_17343 || Class_31179.\u0000strictfp((int)n) ? -14257 & 817 : 2186 & 9584)) != 0;
    }

    public int[] Method_31183(int n, int n2, int n3, int n4) {
        int[] arrn = this.\u0000strictfp.Method_28781(n - (515 & 18505), n2 - (211 & -2779), n3 + (-30665 & 1098), n4 + (50 & 514));
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = 16650 & 6225; i < n4; ++i) {
            for (int j = 10504 & -16336; j < n3; ++j) {
                int n5;
                int n6;
                int n7;
                int n8;
                this.\u0000strictfp((long)(j + n), (long)(i + n2));
                int n9 = arrn[j + (20889 & -21503) + (i + (257 & -30689)) * (n3 + (222 & 11811))];
                Class_17281 class_17281 = Class_17281.Method_17396(n9);
                if (n9 == Class_17281.Field_17301.Field_17343) {
                    n7 = arrn[j + (2307 & 8201) + (i + (24577 & 6165) - (-17319 & 33)) * (n3 + (322 & 8195))];
                    n6 = arrn[j + (17441 & 581) + (513 & -24549) + (i + (-28071 & 293)) * (n3 + (-28670 & 3270))];
                    n8 = arrn[j + (801 & 9225) - (-23791 & 4291) + (i + (26433 & -28535)) * (n3 + (8290 & 16402))];
                    n5 = arrn[j + (-32381 & 533) + (i + (4161 & -29391) + (-11951 & 2049)) * (n3 + (4115 & 1290))];
                    if (n7 != Class_17281.Field_17303.Field_17343 && n6 != Class_17281.Field_17303.Field_17343 && n8 != Class_17281.Field_17303.Field_17343 && n5 != Class_17281.Field_17303.Field_17343) {
                        arrn2[j + i * n3] = n9;
                        continue;
                    }
                    arrn2[j + i * n3] = Class_17281.Field_17313.Field_17343;
                    continue;
                }
                if (class_17281 != null && class_17281.Method_17378() == Class_37772.class) {
                    n7 = arrn[j + (2313 & -23019) + (i + (9681 & 43) - (8451 & 16925)) * (n3 + (1027 & 26818))];
                    n6 = arrn[j + (-31265 & 1) + (14857 & 103) + (i + (-24571 & 6393)) * (n3 + (5422 & -32765))];
                    n8 = arrn[j + (2393 & -15871) - (1233 & 28715) + (i + (4097 & 10947)) * (n3 + (28678 & 130))];
                    n5 = arrn[j + (12309 & 16803) + (i + (729 & 12295) + (-32249 & 24593)) * (n3 + (-9942 & 71))];
                    if (this.Method_31182(n7) && this.Method_31182(n6) && this.Method_31182(n8) && this.Method_31182(n5)) {
                        if (!(Class_31179.\u0000strictfp((int)n7) || Class_31179.\u0000strictfp((int)n6) || Class_31179.\u0000strictfp((int)n8) || Class_31179.\u0000strictfp((int)n5))) {
                            arrn2[j + i * n3] = n9;
                            continue;
                        }
                        arrn2[j + i * n3] = Class_17281.Field_17336.Field_17343;
                        continue;
                    }
                    arrn2[j + i * n3] = Class_17281.Field_17331.Field_17343;
                    continue;
                }
                if (n9 != Class_17281.Field_17299.Field_17343 && n9 != Class_17281.Field_17282.Field_17343 && n9 != Class_17281.Field_17358.Field_17343) {
                    if (class_17281 != null && class_17281.Method_17369()) {
                        this.Method_31184(arrn, arrn2, j, i, n3, n9, Class_17281.Field_17311.Field_17343);
                        continue;
                    }
                    if (n9 != Class_17281.Field_17305.Field_17343 && n9 != Class_17281.Field_17362.Field_17343) {
                        if (n9 != Class_17281.Field_17303.Field_17343 && n9 != Class_17281.Field_17338.Field_17343 && n9 != Class_17281.Field_17357.Field_17343 && n9 != Class_17281.Field_17337.Field_17343) {
                            n7 = arrn[j + (10579 & -32767) + (i + (16403 & 10625) - (8847 & -9183)) * (n3 + (266 & -16174))];
                            n6 = arrn[j + (2321 & 12453) + (6421 & 515) + (i + (2191 & 16913)) * (n3 + (-16122 & 2562))];
                            n8 = arrn[j + (4641 & -31743) - (-27485 & 93) + (i + (1033 & 129)) * (n3 + (-32381 & 1066))];
                            n5 = arrn[j + (-27573 & 8481) + (i + (5701 & -14045) + (12291 & -15515)) * (n3 + (10298 & 4163))];
                            if (!(Class_31179.\u0000strictfp((int)n7) || Class_31179.\u0000strictfp((int)n6) || Class_31179.\u0000strictfp((int)n8) || Class_31179.\u0000strictfp((int)n5))) {
                                arrn2[j + i * n3] = n9;
                                continue;
                            }
                            arrn2[j + i * n3] = Class_17281.Field_17336.Field_17343;
                            continue;
                        }
                        arrn2[j + i * n3] = n9;
                        continue;
                    }
                    n7 = arrn[j + (153 & 23555) + (i + (41 & 2053) - (-32235 & 8323)) * (n3 + (20742 & 10))];
                    n6 = arrn[j + (25605 & 4105) + (561 & 2049) + (i + (-32757 & 8513)) * (n3 + (29019 & 2082))];
                    n8 = arrn[j + (1553 & 18433) - (389 & 12321) + (i + (-24491 & 521)) * (n3 + (2258 & 550))];
                    n5 = arrn[j + (8773 & -32511) + (i + (3825 & 1) + (325 & 16545)) * (n3 + (16915 & -18230))];
                    if (!(Class_31179.\u0000strictfp((int)n7) || Class_31179.\u0000strictfp((int)n6) || Class_31179.\u0000strictfp((int)n8) || Class_31179.\u0000strictfp((int)n5))) {
                        if (this.Method_31180(n7) && this.Method_31180(n6) && this.Method_31180(n8) && this.Method_31180(n5)) {
                            arrn2[j + i * n3] = n9;
                            continue;
                        }
                        arrn2[j + i * n3] = Class_17281.Field_17321.Field_17343;
                        continue;
                    }
                    arrn2[j + i * n3] = n9;
                    continue;
                }
                this.Method_31184(arrn, arrn2, j, i, n3, n9, Class_17281.Field_17328.Field_17343);
            }
        }
        return arrn2;
    }

    public Class_31179(long l, Class_28775 class_28775) {
        super(l);
        this.\u0000strictfp = class_28775;
    }

    private void Method_31184(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5) {
        if (Class_31179.\u0000strictfp((int)n4)) {
            arrn2[n + n2 * n3] = n4;
        } else {
            int n6 = arrn[n + (307 & 193) + (n2 + (641 & -28665) - (-30647 & 17813)) * (n3 + (-24429 & 2))];
            int n7 = arrn[n + (2069 & 8609) + (2401 & -19435) + (n2 + (-32735 & 18433)) * (n3 + (2891 & 12422))];
            int n8 = arrn[n + (-32723 & 8449) - (2377 & -28011) + (n2 + (13027 & -14335)) * (n3 + (-28590 & 1667))];
            int n9 = arrn[n + (2365 & 4289) + (n2 + (3589 & -16223) + (17 & 15)) * (n3 + (-13565 & 4266))];
            arrn2[n + n2 * n3] = !Class_31179.\u0000strictfp((int)n6) && !Class_31179.\u0000strictfp((int)n7) && !Class_31179.\u0000strictfp((int)n8) && !Class_31179.\u0000strictfp((int)n9) ? n4 : n5;
        }
    }
}

