/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_29083
extends Class_28775 {
    private boolean Method_29084(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6) {
        if (!Class_29083.\u0000strictfp((int)n4, (int)n5)) {
            return (-31680 & 13216) != 0;
        }
        int n7 = arrn[n + (13 & 13185) + (n2 + (517 & -30591) - (29233 & 2317)) * (n3 + (8330 & -32189))];
        int n8 = arrn[n + (12297 & 16897) + (777 & 6305) + (n2 + (-16351 & 8781)) * (n3 + (-30718 & 8214))];
        int n9 = arrn[n + (-31919 & 37) - (-32695 & 8227) + (n2 + (529 & 8361)) * (n3 + (2594 & -19310))];
        int n10 = arrn[n + (-32661 & 17169) + (n2 + (4769 & 26629) + (-24541 & 265)) * (n3 + (-16205 & 2050))];
        arrn2[n + n2 * n3] = this.Method_29086(n7, n5) && this.Method_29086(n8, n5) && this.Method_29086(n9, n5) && this.Method_29086(n10, n5) ? n4 : n6;
        return (24851 & 4645) != 0;
    }

    private void Method_29085() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private boolean Method_29086(int n, int n2) {
        if (Class_29083.\u0000strictfp((int)n, (int)n2)) {
            return (21129 & -23215) != 0;
        }
        Class_17281 class_17281 = Class_17281.Method_17396(n);
        Class_17281 class_172812 = Class_17281.Method_17396(n2);
        if (class_17281 != null && class_172812 != null) {
            Class_7931 class_7931;
            Class_7931 class_79312 = class_17281.Method_17392();
            return (class_79312 == (class_7931 = class_172812.Method_17392()) || class_79312 == Class_7931.Field_7935 || class_7931 == Class_7931.Field_7935 ? 13569 & -32189 : 4224 & 26180) != 0;
        }
        return (4128 & 24909) != 0;
    }

    private boolean Method_29087(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6) {
        if (n4 != n5) {
            return (-28598 & 11793) != 0;
        }
        int n7 = arrn[n + (20545 & 41) + (n2 + (-32249 & 1065) - (-24311 & 549)) * (n3 + (-22390 & 16918))];
        int n8 = arrn[n + (8553 & -32747) + (8451 & 241) + (n2 + (-31673 & 289)) * (n3 + (-28154 & 10))];
        int n9 = arrn[n + (18977 & -27515) - (297 & 4629) + (n2 + (-16255 & 3081)) * (n3 + (4278 & 2114))];
        int n10 = arrn[n + (-15359 & 2053) + (n2 + (197 & 4105) + (-32749 & 22053)) * (n3 + (906 & -24510))];
        arrn2[n + n2 * n3] = Class_29083.\u0000strictfp((int)n7, (int)n5) && Class_29083.\u0000strictfp((int)n8, (int)n5) && Class_29083.\u0000strictfp((int)n9, (int)n5) && Class_29083.\u0000strictfp((int)n10, (int)n5) ? n4 : n6;
        return (-21757 & 17409) != 0;
    }

    public int[] Method_29088(int n, int n2, int n3, int n4) {
        int[] arrn = this.\u0000strictfp.Method_28781(n - (2697 & -16287), n2 - (1 & 21261), n3 + (13826 & -14330), n4 + (3346 & -24406));
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = -28671 & 16658; i < n4; ++i) {
            for (int j = 6420 & 8; j < n3; ++j) {
                int n5;
                int n6;
                int n7;
                int n8;
                this.\u0000strictfp((long)(j + n), (long)(i + n2));
                int n9 = arrn[j + (17681 & -20255) + (i + (4099 & 305)) * (n3 + (-30582 & 3))];
                if (this.Method_29084(arrn, arrn2, j, i, n3, n9, Class_17281.Field_17299.Field_17343, Class_17281.Field_17358.Field_17343) || this.Method_29087(arrn, arrn2, j, i, n3, n9, Class_17281.Field_17362.Field_17343, Class_17281.Field_17305.Field_17343) || this.Method_29087(arrn, arrn2, j, i, n3, n9, Class_17281.Field_17296.Field_17343, Class_17281.Field_17305.Field_17343) || this.Method_29087(arrn, arrn2, j, i, n3, n9, Class_17281.Field_17326.Field_17343, Class_17281.Field_17332.Field_17343)) continue;
                if (n9 == Class_17281.Field_17321.Field_17343) {
                    n7 = arrn[j + (2341 & 12817) + (i + (8253 & 18113) - (921 & 20579)) * (n3 + (13322 & 2166))];
                    n6 = arrn[j + (593 & 21505) + (26673 & 4363) + (i + (-28665 & 649)) * (n3 + (25154 & 7575))];
                    n5 = arrn[j + (6401 & 8201) - (13825 & -30717) + (i + (261 & 147)) * (n3 + (17462 & -28342))];
                    n8 = arrn[j + (13329 & -30719) + (i + (13339 & -16255) + (21505 & 103)) * (n3 + (22594 & 426))];
                    if (n7 != Class_17281.Field_17308.Field_17343 && n6 != Class_17281.Field_17308.Field_17343 && n5 != Class_17281.Field_17308.Field_17343 && n8 != Class_17281.Field_17308.Field_17343) {
                        arrn2[j + i * n3] = n9;
                        continue;
                    }
                    arrn2[j + i * n3] = Class_17281.Field_17282.Field_17343;
                    continue;
                }
                if (n9 == Class_17281.Field_17337.Field_17343) {
                    n7 = arrn[j + (1101 & -28493) + (i + (1027 & -32639) - (18061 & 2113)) * (n3 + (-20218 & 2763))];
                    n6 = arrn[j + (8453 & 129) + (39 & 5129) + (i + (6785 & -32479)) * (n3 + (-24954 & 8274))];
                    n5 = arrn[j + (17 & 5643) - (18585 & -19611) + (i + (193 & -28379)) * (n3 + (16918 & -24253))];
                    n8 = arrn[j + (-24501 & 1029) + (i + (-32759 & 129) + (4393 & 1029)) * (n3 + (4102 & 771))];
                    if (n7 != Class_17281.Field_17321.Field_17343 && n6 != Class_17281.Field_17321.Field_17343 && n5 != Class_17281.Field_17321.Field_17343 && n8 != Class_17281.Field_17321.Field_17343 && n7 != Class_17281.Field_17333.Field_17343 && n6 != Class_17281.Field_17333.Field_17343 && n5 != Class_17281.Field_17333.Field_17343 && n8 != Class_17281.Field_17333.Field_17343 && n7 != Class_17281.Field_17308.Field_17343 && n6 != Class_17281.Field_17308.Field_17343 && n5 != Class_17281.Field_17308.Field_17343 && n8 != Class_17281.Field_17308.Field_17343) {
                        if (n7 != Class_17281.Field_17335.Field_17343 && n8 != Class_17281.Field_17335.Field_17343 && n6 != Class_17281.Field_17335.Field_17343 && n5 != Class_17281.Field_17335.Field_17343) {
                            arrn2[j + i * n3] = n9;
                            continue;
                        }
                        arrn2[j + i * n3] = Class_17281.Field_17331.Field_17343;
                        continue;
                    }
                    arrn2[j + i * n3] = Class_17281.Field_17318.Field_17343;
                    continue;
                }
                arrn2[j + i * n3] = n9;
            }
        }
        return arrn2;
    }

    public Class_29083(long l, Class_28775 class_28775) {
        super(l);
        this.\u0000strictfp = class_28775;
    }
}

