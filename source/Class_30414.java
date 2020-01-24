/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30414
extends Class_28775 {
    public static Class_28775 Method_30415(long l, Class_28775 class_28775, int n) {
        Class_28775 class_287752 = class_28775;
        for (int i = -22528 & 17539; i < n; ++i) {
            class_287752 = new Class_30414(l + (long)i, class_287752);
        }
        return class_287752;
    }

    public Class_30414(long l, Class_28775 class_28775) {
        super(l);
        this.Field_28778 = class_28775;
    }

    private void Method_30416() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int[] Method_30417(int n, int n2, int n3, int n4) {
        int n5;
        int n6 = n >> (20869 & 25);
        int n7 = n2 >> (-12139 & 9769);
        int n8 = (n3 >> (3201 & -15511)) + (770 & -22414);
        int n9 = (n4 >> (-28175 & 26125)) + (29794 & 2838);
        int[] arrn = this.\u0000strictfp.Method_28781(n6, n7, n8, n9);
        int n10 = n8 - (16903 & -32695) << (65 & -31483);
        int n11 = n9 - (24833 & 5295) << (12833 & 17411);
        int[] arrn2 = Class_10971.Method_10980(n10 * n11);
        for (int i = 18944 & -31600; i < n9 - (16393 & 15639); ++i) {
            int n12;
            n5 = (i << (-16365 & 13473)) * n10;
            int n13 = arrn[n12 + (8197 & 392) + (i + (16901 & -29216)) * n8];
            int n14 = arrn[n12 + (30064 & 2567) + (i + (1 & 19143)) * n8];
            for (n12 = 8332 & -29694; n12 < n8 - (1729 & 16385); ++n12) {
                this.\u0000strictfp((long)(n12 + n6 << (25619 & -32383)), (long)(i + n7 << (16585 & 5169)));
                int n15 = arrn[n12 + (-32669 & 28173) + (i + (16384 & -24576)) * n8];
                int n16 = arrn[n12 + (4253 & 16417) + (i + (13097 & 1)) * n8];
                arrn2[n5] = n13;
                int n17 = n5++;
                int[] arrn3 = new int[2203 & 1090];
                arrn3[16517 & 3088] = n13;
                arrn3[17425 & 73] = n14;
                arrn2[n17 + n10] = this.\u0000strictfp(arrn3);
                int[] arrn4 = new int[262 & 15450];
                arrn4[12304 & -15704] = n13;
                arrn4[-14269 & 12801] = n15;
                arrn2[n5] = this.\u0000strictfp(arrn4);
                arrn2[n5++ + n10] = this.\u0000strictfp(n13, n15, n14, n16);
                n13 = n15;
                n14 = n16;
            }
        }
        int[] arrn5 = Class_10971.Method_10980(n3 * n4);
        for (n5 = 608 & 0; n5 < n4; ++n5) {
            System.arraycopy(arrn2, (n5 + (n2 & (133 & 113))) * n10 + (n & (8745 & 18753)), arrn5, n5 * n3, n3);
        }
        return arrn5;
    }
}

