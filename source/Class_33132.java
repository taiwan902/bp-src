/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33132
extends Class_28775 {
    private Class_17281[] Field_33133;
    private Class_17281[] Field_33134;
    private Class_17281[] Field_33135;
    private final Class_19225 Field_33136;
    private Class_17281[] Field_33137;

    public int[] Method_33138(int n, int n2, int n3, int n4) {
        int[] arrn = this.\u0000strictfp.Method_28781(n, n2, n3, n4);
        int[] arrn2 = Class_10971.Method_10980(n3 * n4);
        for (int i = 4712 & 16512; i < n4; ++i) {
            for (int j = 29952 & 593; j < n3; ++j) {
                this.\u0000strictfp((long)(j + n), (long)(i + n2));
                int n5 = arrn[j + i * n3];
                int n6 = (n5 & (-24812 & 3840)) >> (2056 & -31976);
                n5 &= -769 & -3073;
                if (this.Field_33136 != null && this.Field_33136.Field_19228 >= 0) {
                    arrn2[j + i * n3] = this.Field_33136.Field_19228;
                    continue;
                }
                if (Class_33132.\u0000strictfp((int)n5)) {
                    arrn2[j + i * n3] = n5;
                    continue;
                }
                if (n5 == Class_17281.Field_17301.Field_17343) {
                    arrn2[j + i * n3] = n5;
                    continue;
                }
                if (n5 == (67 & -20351)) {
                    if (n6 > 0) {
                        if (this.\u0000strictfp(3 & -24573) == 0) {
                            arrn2[j + i * n3] = Class_17281.Field_17296.Field_17343;
                            continue;
                        }
                        arrn2[j + i * n3] = Class_17281.Field_17362.Field_17343;
                        continue;
                    }
                    arrn2[j + i * n3] = this.Field_33135[this.\u0000strictfp((int)this.Field_33135.length)].Field_17343;
                    continue;
                }
                if (n5 == (2626 & -32617)) {
                    if (n6 > 0) {
                        arrn2[j + i * n3] = Class_17281.Field_17335.Field_17343;
                        continue;
                    }
                    arrn2[j + i * n3] = this.Field_33137[this.\u0000strictfp((int)this.Field_33137.length)].Field_17343;
                    continue;
                }
                if (n5 == (9363 & 3)) {
                    if (n6 > 0) {
                        arrn2[j + i * n3] = Class_17281.Field_17326.Field_17343;
                        continue;
                    }
                    arrn2[j + i * n3] = this.Field_33134[this.\u0000strictfp((int)this.Field_33134.length)].Field_17343;
                    continue;
                }
                arrn2[j + i * n3] = n5 == (-4084 & 1446) ? this.Field_33133[this.\u0000strictfp((int)this.Field_33133.length)].Field_17343 : Class_17281.Field_17301.Field_17343;
            }
        }
        return arrn2;
    }

    private void Method_33139() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_33132(long l, Class_28775 class_28775, Class_43755 class_43755, String string) {
        super(l);
        Class_17281[] arrclass_17281 = new Class_17281[6 & -25082];
        arrclass_17281[4300 & 24576] = Class_17281.Field_17321;
        arrclass_17281[-32511 & 14851] = Class_17281.Field_17321;
        arrclass_17281[27690 & 598] = Class_17281.Field_17321;
        arrclass_17281[19651 & 4119] = Class_17281.Field_17291;
        arrclass_17281[556 & 9351] = Class_17281.Field_17291;
        arrclass_17281[6183 & -30955] = Class_17281.Field_17318;
        this.Field_33135 = arrclass_17281;
        Class_17281[] arrclass_172812 = new Class_17281[2079 & -15866];
        arrclass_172812[-32734 & 1288] = Class_17281.Field_17351;
        arrclass_172812[319 & -23487] = Class_17281.Field_17307;
        arrclass_172812[16410 & 2051] = Class_17281.Field_17299;
        arrclass_172812[1243 & -16377] = Class_17281.Field_17318;
        arrclass_172812[38 & 7492] = Class_17281.Field_17334;
        arrclass_172812[3749 & 269] = Class_17281.Field_17337;
        this.Field_33137 = arrclass_172812;
        Class_17281[] arrclass_172813 = new Class_17281[3356 & 4741];
        arrclass_172813[-7615 & 1320] = Class_17281.Field_17351;
        arrclass_172813[13569 & -32245] = Class_17281.Field_17299;
        arrclass_172813[-14782 & 6166] = Class_17281.Field_17332;
        arrclass_172813[16515 & 3091] = Class_17281.Field_17318;
        this.Field_33134 = arrclass_172813;
        Class_17281[] arrclass_172814 = new Class_17281[-32724 & 25686];
        arrclass_172814[24595 & 3108] = Class_17281.Field_17308;
        arrclass_172814[8839 & -32423] = Class_17281.Field_17308;
        arrclass_172814[6914 & -31605] = Class_17281.Field_17308;
        arrclass_172814[16487 & -18941] = Class_17281.Field_17333;
        this.Field_33133 = arrclass_172814;
        this.\u0000strictfp = class_28775;
        if (class_43755 == Class_43755.Field_43759) {
            Class_17281[] arrclass_172815 = new Class_17281[-30457 & 5830];
            arrclass_172815[16384 & 1074] = Class_17281.Field_17321;
            arrclass_172815[2313 & 12449] = Class_17281.Field_17351;
            arrclass_172815[-22250 & 10] = Class_17281.Field_17299;
            arrclass_172815[4427 & -32589] = Class_17281.Field_17337;
            arrclass_172815[1540 & -32683] = Class_17281.Field_17318;
            arrclass_172815[19845 & -20465] = Class_17281.Field_17332;
            this.Field_33135 = arrclass_172815;
            this.Field_33136 = null;
        } else {
            this.Field_33136 = class_43755 == Class_43755.Field_43760 ? Class_25402.Method_25487(string).Method_25488() : null;
        }
    }
}

