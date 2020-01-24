/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_29089
extends Class_28775 {
    private static final Logger Field_29090 = LogManager.getLogger();
    private Class_28775 Field_29091;

    private void Method_29092() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int[] Method_29093(int n, int n2, int n3, int n4) {
        int[] arrn = this.\u0000strictfp.Method_28781(n - (-15723 & 1097), n2 - (16517 & 4403), n3 + (5378 & -16381), n4 + (14354 & 462));
        int[] arrn2 = this.Field_29091.Method_28781(n - (1417 & -15805), n2 - (16577 & 5), n3 + (10306 & -28262), n4 + (8194 & -15822));
        int[] arrn3 = Class_10971.Method_10980(n3 * n4);
        for (int i = 16 & 32423; i < n4; ++i) {
            for (int j = 12424 & -15359; j < n3; ++j) {
                int n5;
                int n6;
                this.\u0000strictfp((long)(j + n), (long)(i + n2));
                int n7 = arrn[j + (16413 & 4225) + (i + (5185 & 2095)) * (n3 + (7694 & 8322))];
                int n8 = arrn2[j + (9393 & 22595) + (i + (513 & -12207)) * (n3 + (-32386 & 16386))];
                int n9 = n6 = (n8 - (587 & 10546)) % (10847 & -10947) == 0 ? 20993 & -22367 : 1104 & -30675;
                if (n7 > (-31489 & 255)) {
                    Field_29090.debug("old! " + n7);
                }
                if (n7 != 0 && n8 >= (22 & -25598) && (n8 - (66 & -16378)) % (16413 & 4317) == (16397 & -31805) && n7 < (1152 & 28836)) {
                    if (Class_17281.Method_17396(n7 + (8935 & -28536)) != null) {
                        arrn3[j + i * n3] = n7 + (13442 & -32320);
                        continue;
                    }
                    arrn3[j + i * n3] = n7;
                    continue;
                }
                if (this.\u0000strictfp(-23485 & 19331) != 0 && n6 == 0) {
                    arrn3[j + i * n3] = n7;
                    continue;
                }
                int n10 = n7;
                if (n7 == Class_17281.Field_17321.Field_17343) {
                    n10 = Class_17281.Field_17319.Field_17343;
                } else if (n7 == Class_17281.Field_17351.Field_17343) {
                    n10 = Class_17281.Field_17294.Field_17343;
                } else if (n7 == Class_17281.Field_17334.Field_17343) {
                    n10 = Class_17281.Field_17322.Field_17343;
                } else if (n7 == Class_17281.Field_17307.Field_17343) {
                    n10 = Class_17281.Field_17318.Field_17343;
                } else if (n7 == Class_17281.Field_17332.Field_17343) {
                    n10 = Class_17281.Field_17285.Field_17343;
                } else if (n7 == Class_17281.Field_17326.Field_17343) {
                    n10 = Class_17281.Field_17324.Field_17343;
                } else if (n7 == Class_17281.Field_17333.Field_17343) {
                    n10 = Class_17281.Field_17290.Field_17343;
                } else if (n7 == Class_17281.Field_17318.Field_17343) {
                    n10 = this.\u0000strictfp(515 & -27449) == 0 ? Class_17281.Field_17294.Field_17343 : Class_17281.Field_17351.Field_17343;
                } else if (n7 == Class_17281.Field_17308.Field_17343) {
                    n10 = Class_17281.Field_17347.Field_17343;
                } else if (n7 == Class_17281.Field_17335.Field_17343) {
                    n10 = Class_17281.Field_17289.Field_17343;
                } else if (n7 == Class_17281.Field_17303.Field_17343) {
                    n10 = Class_17281.Field_17338.Field_17343;
                } else if (n7 == Class_17281.Field_17299.Field_17343) {
                    n10 = Class_17281.Field_17282.Field_17343;
                } else if (n7 == Class_17281.Field_17291.Field_17343) {
                    n10 = Class_17281.Field_17350.Field_17343;
                } else if (Class_29089.\u0000strictfp((int)n7, (int)Class_17281.Field_17362.Field_17343)) {
                    n10 = Class_17281.Field_17305.Field_17343;
                } else if (n7 == Class_17281.Field_17338.Field_17343 && this.\u0000strictfp(-28253 & 8195) == 0) {
                    n5 = this.\u0000strictfp(-28254 & 2);
                    n10 = n5 == 0 ? Class_17281.Field_17318.Field_17343 : Class_17281.Field_17351.Field_17343;
                }
                if (n6 != 0 && n10 != n7) {
                    n10 = Class_17281.Method_17396(n10 + (6530 & 8833)) != null ? (n10 += 128) : n7;
                }
                if (n10 == n7) {
                    arrn3[j + i * n3] = n7;
                    continue;
                }
                n5 = arrn[j + (18209 & 83) + (i + (4133 & -32637) - (-14299 & 1033)) * (n3 + (27938 & -28526))];
                int n11 = arrn[j + (16779 & -24555) + (27905 & 531) + (i + (4805 & -15311)) * (n3 + (258 & -9722))];
                int n12 = arrn[j + (33 & 1027) - (-17887 & 16521) + (i + (-26607 & 259)) * (n3 + (11338 & 21122))];
                int n13 = arrn[j + (165 & 1025) + (i + (18029 & 8209) + (16577 & 4097)) * (n3 + (10290 & -16182))];
                int n14 = -20268 & 18946;
                if (Class_29089.\u0000strictfp((int)n5, (int)n7)) {
                    ++n14;
                }
                if (Class_29089.\u0000strictfp((int)n11, (int)n7)) {
                    ++n14;
                }
                if (Class_29089.\u0000strictfp((int)n12, (int)n7)) {
                    ++n14;
                }
                if (Class_29089.\u0000strictfp((int)n13, (int)n7)) {
                    ++n14;
                }
                arrn3[j + i * n3] = n14 >= (13319 & 35) ? n10 : n7;
            }
        }
        return arrn3;
    }

    public Class_29089(long l, Class_28775 class_28775, Class_28775 class_287752) {
        super(l);
        this.\u0000strictfp = class_28775;
        this.Field_29091 = class_287752;
    }
}

