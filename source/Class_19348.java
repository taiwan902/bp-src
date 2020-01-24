/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_19348 {
    private void Method_19349() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static int Method_19350(int n, int n2) {
        int n3 = (n & (-15630320 & -16629490)) >> (4380 & 2617) & (16895 & 4863);
        int n4 = (n2 & (-11435520 & -8256510)) >> (56 & 8475) & (-28417 & 18687);
        int n5 = (n3 + n4) / (-32638 & 12298);
        if (n3 == 0 && n4 == 0) {
            n3 = 9267 & -32571;
            n4 = -28645 & 26433;
        } else {
            if (n3 == 0) {
                n = n2;
                n5 /= 10274 & -31726;
            }
            if (n4 == 0) {
                n2 = n;
                n5 /= -7806 & 4106;
            }
        }
        int n6 = (n >> (9043 & 2064) & (1535 & 24831)) * n3;
        int n7 = (n >> (24 & -32760) & (-14593 & 511)) * n3;
        int n8 = (n & (1279 & 4351)) * n3;
        int n9 = (n2 >> (4240 & 18461) & (255 & 20991)) * n4;
        int n10 = (n2 >> (283 & 8328) & (-24321 & 3071)) * n4;
        int n11 = (n2 & (24831 & -27137)) * n4;
        int n12 = (n6 + n9) / (n3 + n4);
        int n13 = (n7 + n10) / (n3 + n4);
        int n14 = (n8 + n11) / (n3 + n4);
        return n5 << (58 & -32232) | n12 << (2609 & -28592) | n13 << (520 & 3161) | n14;
    }

    public static int Method_19351(int n, int n2, int n3, int n4) {
        int n5 = Class_19348.Method_19350(n, n2);
        int n6 = Class_19348.Method_19350(n3, n4);
        int n7 = Class_19348.Method_19350(n5, n6);
        return n7;
    }
}

