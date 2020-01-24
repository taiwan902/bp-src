/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_16100
extends Class_3238 {
    public static final Class_4173 Field_16101;
    public static final Class_3957 Field_16102;
    public static final Class_4173 Field_16103;
    public static final Class_5011 Field_16104;
    public static final Class_3957 Field_16105;

    public int Method_16106(Class_3436 class_3436) {
        int n = -23502 & 4289;
        if (class_3436.Method_3440(Field_16102) == Class_45952.Field_45953) {
            n |= 27432 & 8;
            if (class_3436.Method_3440(Field_16105) == Class_39620.Field_39621) {
                n |= -16383 & 4913;
            }
            if (((Boolean)class_3436.Method_3440(Field_16103)).booleanValue()) {
                n |= 50 & 9743;
            }
        } else {
            n |= ((Class_4595)((Object)class_3436.Method_3440(Field_16104))).Method_4620().Method_4619();
            if (((Boolean)class_3436.Method_3440(Field_16101)).booleanValue()) {
                n |= -32651 & 4620;
            }
        }
        return n;
    }

    public static int Method_16107(Class_561 class_561, Class_4751 class_4751) {
        Class_3436 class_3436 = class_561.Method_568(class_4751);
        int n = class_3436.Method_3442().Method_3434(class_3436);
        boolean bl = Class_16100.Method_16141(n);
        Class_3436 class_34362 = class_561.Method_568(class_4751.Method_4782());
        int n2 = class_34362.Method_3442().Method_3434(class_34362);
        int n3 = bl ? n2 : n;
        Class_3436 class_34363 = class_561.Method_568(class_4751.Method_4769());
        int n4 = class_34363.Method_3442().Method_3434(class_34363);
        int n5 = bl ? n : n4;
        int n6 = (n5 & (2189 & 25411)) != 0 ? 1 & 20583 : -28127 & 0;
        int n7 = (n5 & (3858 & 98)) != 0 ? 8797 & 18561 : 2048 & 25901;
        return Class_16100.Method_16128(n3) | (bl ? 21064 & 1034 : 6212 & -24541) | (n6 != 0 ? 8336 & -11949 : 676 & 24) | (n7 != 0 ? 7208 & 16484 : -20540 & 4130);
    }

    public Class_37110 Method_16108(Class_283 class_283, Class_4751 class_4751, Vec3 vec3, Vec3 vec32) {
        this.Method_16112(class_283, class_4751);
        return super.Method_3372(class_283, class_4751, vec3, vec32);
    }

    public Class_10997 Method_16109(Class_283 class_283, Class_4751 class_4751) {
        this.Method_16112(class_283, class_4751);
        return super.Method_3397(class_283, class_4751);
    }

    public boolean Method_16110() {
        return (20482 & 32) != 0;
    }

    public Class_1956 Method_16111(Class_3436 class_3436, Random random, int n) {
        return class_3436.Method_3440(Field_16102) == Class_45952.Field_45953 ? null : this.Method_16121();
    }

    public void Method_16112(Class_561 class_561, Class_4751 class_4751) {
        this.Method_16137(Class_16100.Method_16107(class_561, class_4751));
    }

    public static Class_4595 Method_16113(Class_561 class_561, Class_4751 class_4751) {
        return Class_16100.Method_16142(Class_16100.Method_16107(class_561, class_4751));
    }

    public static boolean Method_16114(Class_561 class_561, Class_4751 class_4751) {
        return Class_16100.Method_16134(Class_16100.Method_16107(class_561, class_4751));
    }

    public String Method_16115() {
        return Class_7594.Method_7602((this.\u0000strictfp() + ".name").replaceAll("tile", "item"));
    }

    public boolean Method_16116(Class_283 class_283, Class_4751 class_4751) {
        return (class_4751.\u0000, `() >= (-30465 & 4351) ? 656 & 24832 : (Class_283.Method_538(class_283, class_4751.Method_4782()) && super.Method_3368(class_283, class_4751) && super.Method_3368(class_283, class_4751.Method_4769()) ? -20447 & 73 : 20500 & 130)) != 0;
    }

    private static String Method_16117(String string) {
        int n = 22861;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16100.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_16118(Class_283 class_283, Class_4751 class_4751, boolean bl) {
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        if (class_3436.Method_3442() == this) {
            Class_3436 class_34362;
            Class_4751 class_47512 = class_3436.Method_3440(Field_16102) == Class_45952.Field_45954 ? class_4751 : class_4751.Method_4782();
            Class_3436 class_34363 = class_34362 = class_4751 == class_47512 ? class_3436 : class_283.Method_375(class_47512);
            if (class_34362.Method_3442() == this && (Boolean)class_34362.Method_3440(Field_16101) != bl) {
                class_283.Method_462(class_47512, class_34362.Method_3437(Field_16101, Boolean.valueOf(bl)), -32669 & 16662);
                class_283.Method_481(class_47512, class_4751);
                class_283.Method_358(null, bl ? 25595 & 1003 : -14354 & 1023, class_4751, -6142 & 9);
            }
        }
    }

    protected static boolean Method_16119(int n) {
        return ((n & (21462 & -24560)) != 0 ? 2561 & 249 : -20479 & 4) != 0;
    }

    private static String Method_16120(String string) {
        int n = 7317;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16100.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_1956 Method_16121() {
        return this == Class_9265.Field_9311 ? Class_10527.Field_10656 : (this == Class_9265.Field_9271 ? Class_10527.Field_10697 : (this == Class_9265.Field_9423 ? Class_10527.Field_10593 : (this == Class_9265.Field_9381 ? Class_10527.Field_10569 : (this == Class_9265.Field_9276 ? Class_10527.Field_10664 : (this == Class_9265.Field_9289 ? Class_10527.Field_10556 : Class_10527.Field_10670)))));
    }

    public void Method_16122(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (class_3436.Method_3440(Field_16102) == Class_45952.Field_45953) {
            Class_4751 class_47512 = class_4751.Method_4782();
            Class_3436 class_34362 = class_283.Method_375(class_47512);
            if (class_34362.Method_3442() != this) {
                class_283.Method_472(class_4751);
            } else if (class_3238 != this) {
                this.Method_16122(class_283, class_47512, class_34362, class_3238);
            }
        } else {
            int n = 1040 & -30655;
            Class_4751 class_47513 = class_4751.Method_4769();
            Class_3436 class_34363 = class_283.Method_375(class_47513);
            if (class_34363.Method_3442() != this) {
                class_283.Method_472(class_4751);
                n = 22853 & 8201;
            }
            if (!Class_283.Method_538(class_283, class_4751.Method_4782())) {
                class_283.Method_472(class_4751);
                n = -30433 & 13953;
                if (class_34363.Method_3442() == this) {
                    class_283.Method_472(class_47513);
                }
            }
            if (n != 0) {
                if (!class_283.Field_306) {
                    this.\u0000strictfp(class_283, class_4751, class_3436, 12560 & 1036);
                }
            } else {
                int n2;
                int n3 = n2 = class_283.Method_414(class_4751) || class_283.Method_414(class_47513) ? 16545 & 8769 : 27264 & -31678;
                if ((n2 != 0 || class_3238.Method_3322()) && class_3238 != this && n2 != (Boolean)class_34363.Method_3440(Field_16103)) {
                    class_283.Method_462(class_47513, class_34363.Method_3437(Field_16103, Boolean.valueOf(n2 != 0)), -13818 & 4546);
                    if (n2 != (Boolean)class_3436.Method_3440(Field_16101)) {
                        class_283.Method_462(class_4751, class_3436.Method_3437(Field_16101, Boolean.valueOf(n2 != 0)), -14334 & 195);
                        class_283.Method_481(class_4751, class_4751);
                        class_283.Method_358(null, n2 != 0 ? 19455 & 1003 : 19454 & 2030, class_4751, -15208 & 2112);
                    }
                }
            }
        }
    }

    static {
        Field_16104 = Class_5011.Method_5012(Class_16100.Method_16140("\u8086\u8081\u8082\u8081\u8082\u8083"), Class_4662.Field_4663);
        Field_16101 = Class_4173.Method_4177(Class_16100.Method_16120("\u0422\u042c\u042a\u0420"));
        Field_16105 = Class_3957.Method_3963(Class_16100.Method_16130("\u2724\u2724\u2722\u272a\u2728"), Class_39620.class);
        Field_16103 = Class_4173.Method_4177(Class_16100.Method_16133("\u00d0\u00ce\u00d7\u00c4\u00d2\u00c4\u00c4"));
        Field_16102 = Class_3957.Method_3963(Class_16100.Method_16117("\u0e50\u0e59\u0e56\u0e5e"), Class_45952.class);
    }

    protected Class_16100(Class_3713 class_3713) {
        super(class_3713);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_16104, (Comparable)((Object)Class_4595.Field_4598)).Method_3437(Field_16101, Boolean.valueOf((2307 & -32672) != 0)).Method_3437(Field_16105, (Comparable)((Object)Class_39620.Field_39623)).Method_3437(Field_16103, Boolean.valueOf((-30416 & 513) != 0)).Method_3437(Field_16102, (Comparable)((Object)Class_45952.Field_45954)));
    }

    public Class_3436 Method_16123(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        if (class_3436.Method_3440(Field_16102) == Class_45952.Field_45954) {
            Class_3436 class_34362 = class_561.Method_568(class_4751.Method_4769());
            if (class_34362.Method_3442() == this) {
                class_3436 = class_3436.Method_3437(Field_16105, class_34362.Method_3440(Field_16105)).Method_3437(Field_16103, class_34362.Method_3440(Field_16103));
            }
        } else {
            Class_3436 class_34363 = class_561.Method_568(class_4751.Method_4782());
            if (class_34363.Method_3442() == this) {
                class_3436 = class_3436.Method_3437(Field_16104, class_34363.Method_3440(Field_16104)).Method_3437(Field_16101, class_34363.Method_3440(Field_16101));
            }
        }
        return class_3436;
    }

    public Class_17531 Method_16124() {
        return Class_17531.Field_17538;
    }

    public Class_1956 Method_16125(Class_283 class_283, Class_4751 class_4751) {
        return this.Method_16121();
    }

    public int Method_16126() {
        return 27171 & -31343;
    }

    protected Class_3855 Method_16127() {
        Class_3538[] arrclass_3538 = new Class_3538[16749 & -32763];
        arrclass_3538[16486 & -32504] = Field_16102;
        arrclass_3538[73 & 4357] = Field_16104;
        arrclass_3538[16390 & -31998] = Field_16101;
        arrclass_3538[24835 & 587] = Field_16105;
        arrclass_3538[516 & 16390] = Field_16103;
        return new Class_3855(this, arrclass_3538);
    }

    protected static int Method_16128(int n) {
        return n & (16519 & 4911);
    }

    public boolean Method_16129(Class_561 class_561, Class_4751 class_4751) {
        return Class_16100.Method_16134(Class_16100.Method_16107(class_561, class_4751));
    }

    private static String Method_16130(String string) {
        int n = 8115;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16100.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_16131(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626) {
        Class_4751 class_47512 = class_4751.Method_4782();
        if (class_626.Field_694.Method_18094() && class_3436.Method_3440(Field_16102) == Class_45952.Field_45953 && class_283.Method_375(class_47512).Method_3442() == this) {
            class_283.Method_472(class_47512);
        }
    }

    public boolean Method_16132(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        Class_3436 class_34362;
        if (this.\u0000strictfp == Class_3713.Field_3748) {
            return (-32439 & 28677) != 0;
        }
        Class_4751 class_47512 = class_3436.Method_3440(Field_16102) == Class_45952.Field_45954 ? class_4751 : class_4751.Method_4782();
        Class_3436 class_34363 = class_34362 = class_4751.equals(class_47512) ? class_3436 : class_283.Method_375(class_47512);
        if (class_34362.Method_3442() != this) {
            return (-28669 & 3108) != 0;
        }
        class_3436 = class_34362.Method_3438(Field_16101);
        class_283.Method_462(class_47512, class_3436, 21090 & -32761);
        class_283.Method_481(class_47512, class_4751);
        class_283.Method_358(class_626, (Boolean)class_3436.Method_3440(Field_16101) != false ? 9195 & 1003 : -30738 & 13294, class_4751, 1608 & 418);
        return (16513 & 4361) != 0;
    }

    private static String Method_16133(String string) {
        int n = 22631;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16100.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected static boolean Method_16134(int n) {
        return ((n & (13766 & 52)) != 0 ? -30717 & 4265 : 21321 & 0) != 0;
    }

    private void Method_16135() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_10997 Method_16136(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_16112(class_283, class_4751);
        return super.Method_3285(class_283, class_4751, class_3436);
    }

    private void Method_16137(int n) {
        float f = 0.16477273f * 1.137931f;
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f);
        Class_4595 class_4595 = Class_16100.Method_16142(n);
        boolean bl = Class_16100.Method_16134(n);
        boolean bl2 = Class_16100.Method_16119(n);
        if (bl) {
            if (class_4595 == Class_4595.Field_4603) {
                if (!bl2) {
                    this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
                } else {
                    this.\u0000strictfp(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
                }
            } else if (class_4595 == Class_4595.Field_4613) {
                if (!bl2) {
                    this.\u0000strictfp(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                } else {
                    this.\u0000strictfp(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
                }
            } else if (class_4595 == Class_4595.Field_4602) {
                if (!bl2) {
                    this.\u0000strictfp(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
                } else {
                    this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
                }
            } else if (class_4595 == Class_4595.Field_4598) {
                if (!bl2) {
                    this.\u0000strictfp(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
                } else {
                    this.\u0000strictfp(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
            }
        } else if (class_4595 == Class_4595.Field_4603) {
            this.\u0000strictfp(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
        } else if (class_4595 == Class_4595.Field_4613) {
            this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
        } else if (class_4595 == Class_4595.Field_4602) {
            this.\u0000strictfp(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else if (class_4595 == Class_4595.Field_4598) {
            this.\u0000strictfp(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
        }
    }

    public boolean Method_16138() {
        return (1026 & -25696) != 0;
    }

    public Class_3436 Method_16139(int n) {
        return (n & (-27095 & 268)) > 0 ? this.\u0000strictfp().Method_3685(Field_16102, (Comparable)((Object)Class_45952.Field_45953)).Method_3437(Field_16105, (Comparable)((Object)((n & (-32751 & 9291)) > 0 ? Class_39620.Field_39621 : Class_39620.Field_39623))).Method_3437(Field_16103, Boolean.valueOf(((n & (4138 & 3330)) > 0 ? 2561 & -27423 : 280 & 23717) != 0)) : this.\u0000strictfp().Method_3685(Field_16102, (Comparable)((Object)Class_45952.Field_45954)).Method_3437(Field_16104, (Comparable)((Object)Class_4595.Method_4628(n & (8591 & 6195)).Method_4617())).Method_3437(Field_16101, Boolean.valueOf(((n & (10374 & -32764)) > 0 ? 5 & -25581 : 4164 & 19105) != 0));
    }

    private static String Method_16140(String string) {
        int n = 28129;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16100.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected static boolean Method_16141(int n) {
        return ((n & (-32406 & 3080)) != 0 ? 30481 & 5 : -31664 & 802) != 0;
    }

    public static Class_4595 Method_16142(int n) {
        return Class_4595.Method_4628(n & (67 & 4103)).Method_4617();
    }
}

