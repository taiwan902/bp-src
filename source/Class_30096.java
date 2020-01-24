/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30096
extends Class_21785 {
    private boolean Field_30097;
    private boolean Field_30098;
    private boolean Field_30099;
    private boolean Field_30100;
    private boolean Field_30101;

    public void Method_30102(boolean bl) {
        this.Field_30097 = bl;
    }

    public boolean Method_30103() {
        return this.Field_30097;
    }

    public Class_26869 Method_30104(Class_1061 class_1061, double d, double d2, double d3) {
        return this.\u0000strictfp(Class_13337.Method_13371(d - (double)(class_1061.Method_1266() / 2.0f)), Class_13337.Method_13371(d2), Class_13337.Method_13371(d3 - (double)(class_1061.Method_1266() / 2.0f)));
    }

    public boolean Method_30105() {
        return this.Field_30100;
    }

    public boolean Method_30106() {
        return this.Field_30101;
    }

    public void Method_30107(boolean bl) {
        this.Field_30100 = bl;
    }

    public Class_26869 Method_30108(Class_1061 class_1061) {
        int n;
        if (this.Field_30100 && class_1061.Method_1314()) {
            n = (int)class_1061.Method_1315().Field_11000;
            Class_4810 class_4810 = new Class_4810(Class_13337.Method_13371(class_1061.Field_1130), n, Class_13337.Method_13371(class_1061.Field_1106));
            Class_3238 class_3238 = this.\u0000strictfp.Method_568(class_4810).Method_3442();
            while (class_3238 == Class_9265.Field_9281 || class_3238 == Class_9265.Field_9286) {
                class_4810.Method_4814(Class_13337.Method_13371(class_1061.Field_1130), ++n, Class_13337.Method_13371(class_1061.Field_1106));
                class_3238 = this.\u0000strictfp.Method_568(class_4810).Method_3442();
            }
            this.Field_30101 = 299 & -32704;
        } else {
            n = Class_13337.Method_13371(class_1061.Method_1315().Field_11000 + 0.13541666666666666 * 3.6923076923076925);
        }
        return this.\u0000strictfp(Class_13337.Method_13371(class_1061.Method_1315().Field_10999), n, Class_13337.Method_13371(class_1061.Method_1315().Field_11001));
    }

    public void Method_30109(boolean bl) {
        this.Field_30101 = bl;
    }

    public void Method_30110() {
        super.Method_21792();
        this.Field_30101 = this.Field_30099;
    }

    public void Method_30111(boolean bl) {
        this.Field_30098 = bl;
    }

    public void Method_30112(Class_561 class_561, Class_1061 class_1061) {
        super.Method_21795(class_561, class_1061);
        this.Field_30099 = this.Field_30101;
    }

    private void Method_30113() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static int Method_30114(Class_561 class_561, Class_1061 class_1061, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2, boolean bl3) {
        int n7 = 192 & 18724;
        Class_4751 class_4751 = new Class_4751(class_1061);
        Class_4810 class_4810 = new Class_4810();
        for (int i = n; i < n + n4; ++i) {
            for (int j = n2; j < n2 + n5; ++j) {
                for (int k = n3; k < n3 + n6; ++k) {
                    class_4810.Method_4814(i, j, k);
                    Class_3238 class_3238 = class_561.Method_568(class_4810).Method_3442();
                    if (class_3238.Method_3373() == Class_3713.Field_3718) continue;
                    if (class_3238 != Class_9265.Field_9296 && class_3238 != Class_9265.Field_9417) {
                        if (class_3238 != Class_9265.Field_9281 && class_3238 != Class_9265.Field_9286) {
                            if (!bl3 && class_3238 instanceof Class_16100 && class_3238.Method_3373() == Class_3713.Field_3723) {
                                return 2176 & 29706;
                            }
                        } else {
                            if (bl) {
                                return -1 & -1;
                            }
                            n7 = 8465 & -15167;
                        }
                    } else {
                        n7 = 579 & 16805;
                    }
                    if (class_1061.Field_1089.Method_375(class_4810).Method_3442() instanceof Class_5164) {
                        if (class_1061.Field_1089.Method_375(class_4751).Method_3442() instanceof Class_5164 || class_1061.Field_1089.Method_375(class_4751.Method_4782()).Method_3442() instanceof Class_5164) continue;
                        return -3 & -3;
                    }
                    if (class_3238.Method_3362(class_561, class_4810) || bl2 && class_3238 instanceof Class_16100 && class_3238.Method_3373() == Class_3713.Field_3723) continue;
                    if (class_3238 instanceof Class_27820 || class_3238 instanceof Class_20919 || class_3238 instanceof Class_33671) {
                        return -3 & -1;
                    }
                    if (class_3238 == Class_9265.Field_9296 || class_3238 == Class_9265.Field_9417) {
                        return -1 & -4;
                    }
                    Class_3713 class_3713 = class_3238.Method_3373();
                    if (class_3713 != Class_3713.Field_3750) {
                        return 1856 & 16384;
                    }
                    if (class_1061.Method_1162()) continue;
                    return -2 & -1;
                }
            }
        }
        return n7 != 0 ? -30658 & 4994 : 1309 & 18945;
    }

    private Class_26869 Method_30115(Class_1061 class_1061, int n, int n2, int n3, int n4) {
        Class_26869 class_26869 = null;
        int n5 = this.Method_30116(class_1061, n, n2, n3);
        if (n5 == (10259 & 17510)) {
            return this.\u0000strictfp(n, n2, n3);
        }
        if (n5 == (-32431 & 2177)) {
            class_26869 = this.\u0000strictfp(n, n2, n3);
        }
        if (class_26869 == null && n4 > 0 && n5 != (-1 & -3) && n5 != (-4 & -3) && this.Method_30116(class_1061, n, n2 + n4, n3) == (-28081 & 11313)) {
            class_26869 = this.\u0000strictfp(n, n2 + n4, n3);
            n2 += n4;
        }
        if (class_26869 != null) {
            int n6 = 16402 & 13632;
            int n7 = 21632 & -31989;
            while (n2 > 0) {
                n7 = this.Method_30116(class_1061, n, n2 - (9 & 9313), n3);
                if (this.Field_30101 && n7 == (-1 & -1)) {
                    return null;
                }
                if (n7 != (8305 & -13809)) break;
                if (n6++ >= class_1061.Method_1362()) {
                    return null;
                }
                if (--n2 <= 0) {
                    return null;
                }
                class_26869 = this.\u0000strictfp(n, n2, n3);
            }
            if (n7 == (-2 & -2)) {
                return null;
            }
        }
        return class_26869;
    }

    private int Method_30116(Class_1061 class_1061, int n, int n2, int n3) {
        return Class_30096.Method_30114(this.\u0000strictfp, class_1061, n, n2, n3, this.\u0000strictfp, this.\u0000= final, this.\u0000, `, this.Field_30101, this.Field_30098, this.Field_30097);
    }

    public int Method_30117(Class_26869[] arrclass_26869, Class_1061 class_1061, Class_26869 class_26869, Class_26869 class_268692, float f) {
        int n = -32040 & 18720;
        int n2 = -32647 & 27140;
        if (this.Method_30116(class_1061, class_26869.Field_26870, class_26869.Field_26871 + (337 & 8195), class_26869.Field_26873) == (6721 & -32639)) {
            n2 = 8993 & -15343;
        }
        Class_26869 class_268693 = this.Method_30115(class_1061, class_26869.Field_26870, class_26869.Field_26871, class_26869.Field_26873 + (5903 & 1), n2);
        Class_26869 class_268694 = this.Method_30115(class_1061, class_26869.Field_26870 - (-23945 & 1025), class_26869.Field_26871, class_26869.Field_26873, n2);
        Class_26869 class_268695 = this.Method_30115(class_1061, class_26869.Field_26870 + (19073 & 4353), class_26869.Field_26871, class_26869.Field_26873, n2);
        Class_26869 class_268696 = this.Method_30115(class_1061, class_26869.Field_26870, class_26869.Field_26871, class_26869.Field_26873 - (23041 & -23419), n2);
        if (class_268693 != null && !class_268693.Field_26879 && class_268693.Method_26884(class_268692) < f) {
            arrclass_26869[n++] = class_268693;
        }
        if (class_268694 != null && !class_268694.Field_26879 && class_268694.Method_26884(class_268692) < f) {
            arrclass_26869[n++] = class_268694;
        }
        if (class_268695 != null && !class_268695.Field_26879 && class_268695.Method_26884(class_268692) < f) {
            arrclass_26869[n++] = class_268695;
        }
        if (class_268696 != null && !class_268696.Field_26879 && class_268696.Method_26884(class_268692) < f) {
            arrclass_26869[n++] = class_268696;
        }
        return n;
    }
}

