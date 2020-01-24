/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_11027
extends Class_3238 {
    private int Field_11028;
    private final Class_3238 Field_11029;
    public static final Class_3957 Field_11030;
    public static final Class_3957 Field_11031;
    private static final int[][] Field_11032;
    private boolean Field_11033;
    public static final Class_5011 Field_11034;
    private final Class_3436 Field_11035;

    public void Method_11036(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Field_11029.Method_3287(class_283, class_4751, class_3436);
    }

    public boolean Method_11037(Class_283 class_283, Class_4751 class_4751) {
        return this.Field_11029.Method_3368(class_283, class_4751);
    }

    private static String Method_11038(String string) {
        int n = 16310;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11027.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_3855 Method_11039() {
        Class_3538[] arrclass_3538 = new Class_3538[16915 & 4143];
        arrclass_3538[17002 & -32512] = Field_11034;
        arrclass_3538[16721 & 6145] = Field_11031;
        arrclass_3538[10 & 1351] = Field_11030;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_11040(Class_561 class_561, Class_4751 class_4751) {
        Class_3436 class_3436;
        Class_3238 class_3238;
        int n;
        Class_3436 class_34362 = class_561.Method_568(class_4751);
        Class_4595 class_4595 = (Class_4595)((Object)class_34362.Method_3440(Field_11034));
        Class_37983 class_37983 = (Class_37983)((Object)class_34362.Method_3440(Field_11031));
        int n2 = n = class_37983 == Class_37983.Field_37986 ? 9001 & 1155 : 9224 & -15808;
        if (class_4595 == Class_4595.Field_4603) {
            Class_3436 class_34363 = class_561.Method_568(class_4751.Method_4770());
            Class_3238 class_32382 = class_34363.Method_3442();
            if (Class_11027.Method_11065(class_32382) && class_37983 == class_34363.Method_3440(Field_11031)) {
                Class_4595 class_45952 = (Class_4595)((Object)class_34363.Method_3440(Field_11034));
                if (class_45952 == Class_4595.Field_4598 && !Class_11027.Method_11060(class_561, class_4751.Method_4784(), class_34362)) {
                    return n != 0 ? 289 & 8337 : 10274 & -31666;
                }
                if (class_45952 == Class_4595.Field_4613 && !Class_11027.Method_11060(class_561, class_4751.Method_4778(), class_34362)) {
                    return n != 0 ? 3123 & 16518 : 25699 & 2077;
                }
            }
        } else if (class_4595 == Class_4595.Field_4602) {
            Class_3436 class_34364 = class_561.Method_568(class_4751.Method_4771());
            Class_3238 class_32383 = class_34364.Method_3442();
            if (Class_11027.Method_11065(class_32383) && class_37983 == class_34364.Method_3440(Field_11031)) {
                Class_4595 class_45953 = (Class_4595)((Object)class_34364.Method_3440(Field_11034));
                if (class_45953 == Class_4595.Field_4598 && !Class_11027.Method_11060(class_561, class_4751.Method_4784(), class_34362)) {
                    return n != 0 ? 70 & -14326 : 25481 & 3137;
                }
                if (class_45953 == Class_4595.Field_4613 && !Class_11027.Method_11060(class_561, class_4751.Method_4778(), class_34362)) {
                    return n != 0 ? 279 & 12393 : 12334 & 17410;
                }
            }
        } else if (class_4595 == Class_4595.Field_4613) {
            Class_3436 class_34365 = class_561.Method_568(class_4751.Method_4784());
            Class_3238 class_32384 = class_34365.Method_3442();
            if (Class_11027.Method_11065(class_32384) && class_37983 == class_34365.Method_3440(Field_11031)) {
                Class_4595 class_45954 = (Class_4595)((Object)class_34365.Method_3440(Field_11034));
                if (class_45954 == Class_4595.Field_4602 && !Class_11027.Method_11060(class_561, class_4751.Method_4770(), class_34362)) {
                    return n != 0 ? -13789 & 5146 : -32687 & 9987;
                }
                if (class_45954 == Class_4595.Field_4603 && !Class_11027.Method_11060(class_561, class_4751.Method_4771(), class_34362)) {
                    return n != 0 ? 10257 & 4771 : 10370 & 16395;
                }
            }
        } else if (class_4595 == Class_4595.Field_4598 && Class_11027.Method_11065(class_3238 = (class_3436 = class_561.Method_568(class_4751.Method_4778())).Method_3442()) && class_37983 == class_3436.Method_3440(Field_11031)) {
            Class_4595 class_45955 = (Class_4595)((Object)class_3436.Method_3440(Field_11034));
            if (class_45955 == Class_4595.Field_4602 && !Class_11027.Method_11060(class_561, class_4751.Method_4770(), class_34362)) {
                return n != 0 ? 8453 & -10613 : 6442 & 16914;
            }
            if (class_45955 == Class_4595.Field_4603 && !Class_11027.Method_11060(class_561, class_4751.Method_4771(), class_34362)) {
                return n != 0 ? 6486 & -14814 : 18977 & 389;
            }
        }
        return -22947 & 128;
    }

    public Class_3436 Method_11041(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        if (this.Method_11067(class_561, class_4751)) {
            switch (this.Method_11051(class_561, class_4751)) {
                case 0: {
                    class_3436 = class_3436.Method_3437(Field_11030, (Comparable)((Object)Class_31031.Field_31037));
                    break;
                }
                case 1: {
                    class_3436 = class_3436.Method_3437(Field_11030, (Comparable)((Object)Class_31031.Field_31032));
                    break;
                }
                case 2: {
                    class_3436 = class_3436.Method_3437(Field_11030, (Comparable)((Object)Class_31031.Field_31034));
                }
            }
        } else {
            switch (this.Method_11040(class_561, class_4751)) {
                case 0: {
                    class_3436 = class_3436.Method_3437(Field_11030, (Comparable)((Object)Class_31031.Field_31037));
                    break;
                }
                case 1: {
                    class_3436 = class_3436.Method_3437(Field_11030, (Comparable)((Object)Class_31031.Field_31033));
                    break;
                }
                case 2: {
                    class_3436 = class_3436.Method_3437(Field_11030, (Comparable)((Object)Class_31031.Field_31038));
                }
            }
        }
        return class_3436;
    }

    public void Method_11042(Class_561 class_561, Class_4751 class_4751) {
        if (this.Field_11033) {
            this.\u0000strictfp(0.5783133f * 0.8645833f * (float)(this.Field_11028 % (3154 & 4098)), 0.6533333f * 0.7653062f * (float)(this.Field_11028 / (-30580 & 13060) % (523 & 3154)), 0.27160493f * 1.8409091f * (float)(this.Field_11028 / (-30702 & 1607) % (18886 & 523)), 0.3854167f * 1.2972972f + 0.7f * 0.71428573f * (float)(this.Field_11028 % (6850 & 17442)), 0.84444445f * 0.59210527f + 4.5f * 0.11111111f * (float)(this.Field_11028 / (20572 & 8837) % (-6142 & 354)), 4.25f * 0.11764706f + 0.9354838f * 0.5344828f * (float)(this.Field_11028 / (11523 & 2) % (22 & 66)));
        } else {
            this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public Class_37110 Method_11043(Class_283 class_283, Class_4751 class_4751, Vec3 vec3, Vec3 vec32) {
        Class_37110[] arrclass_37110 = new Class_37110[13 & 22552];
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        int n = ((Class_4595)((Object)class_3436.Method_3440(Field_11034))).Method_4619();
        int n2 = class_3436.Method_3440(Field_11031) == Class_37983.Field_37986 ? -24511 & 16425 : 24905 & 512;
        int[] arrn = Field_11032[n + (n2 != 0 ? 6180 & -32610 : 8912 & 3337)];
        this.Field_11033 = 8361 & 323;
        for (int i = 1284 & 2290; i < (2856 & 1038); ++i) {
            this.Field_11028 = i;
            if (Arrays.binarySearch(arrn, i) >= 0) continue;
            arrclass_37110[i] = super.Method_3372(class_283, class_4751, vec3, vec32);
        }
        Object object = arrn;
        int n3 = ((int[])object).length;
        for (int i = -28672 & 837; i < n3; ++i) {
            int n4 = object[i];
            arrclass_37110[n4] = null;
        }
        object = null;
        double d = 0.0;
        Class_37110[] arrclass_371102 = arrclass_37110;
        int n5 = arrclass_371102.length;
        for (int i = 9252 & 21400; i < n5; ++i) {
            double d2;
            Class_37110 class_37110 = arrclass_371102[i];
            if (class_37110 == null || !((d2 = class_37110.Field_37115.\u0000strictfp(vec32)) > d)) continue;
            object = class_37110;
            d = d2;
        }
        return object;
    }

    public boolean Method_11044() {
        return (3073 & 44) != 0;
    }

    public boolean Method_11045(Class_561 class_561, Class_4751 class_4751) {
        Class_3436 class_3436;
        Class_3238 class_3238;
        Class_3436 class_34362 = class_561.Method_568(class_4751);
        Class_4595 class_4595 = (Class_4595)((Object)class_34362.Method_3440(Field_11034));
        Class_37983 class_37983 = (Class_37983)((Object)class_34362.Method_3440(Field_11031));
        int n = class_37983 == Class_37983.Field_37986 ? 8321 & 9 : -32696 & 166;
        float f = 0.40163934f * 1.244898f;
        float f2 = 1.0f;
        if (n != 0) {
            f = 0.0f;
            f2 = 0.44021738f * 1.1358025f;
        }
        float f3 = 0.0f;
        float f4 = 0.42000002f * 1.1904762f;
        float f5 = 0.08064517f * 6.2f;
        float f6 = 1.0f;
        int n2 = 393 & 17952;
        if (class_4595 == Class_4595.Field_4603) {
            Class_3436 class_34363 = class_561.Method_568(class_4751.Method_4771());
            Class_3238 class_32382 = class_34363.Method_3442();
            if (Class_11027.Method_11065(class_32382) && class_37983 == class_34363.Method_3440(Field_11031)) {
                Class_4595 class_45952 = (Class_4595)((Object)class_34363.Method_3440(Field_11034));
                if (class_45952 == Class_4595.Field_4598 && !Class_11027.Method_11060(class_561, class_4751.Method_4778(), class_34362)) {
                    f5 = 0.0f;
                    f6 = 0.37142858f * 1.3461539f;
                    n2 = 4611 & 297;
                } else if (class_45952 == Class_4595.Field_4613 && !Class_11027.Method_11060(class_561, class_4751.Method_4784(), class_34362)) {
                    f5 = 1.3013699f * 0.38421053f;
                    f6 = 1.0f;
                    n2 = -28861 & 41;
                }
            }
        } else if (class_4595 == Class_4595.Field_4602) {
            Class_3436 class_34364 = class_561.Method_568(class_4751.Method_4770());
            Class_3238 class_32383 = class_34364.Method_3442();
            if (Class_11027.Method_11065(class_32383) && class_37983 == class_34364.Method_3440(Field_11031)) {
                f3 = 4.9333334f * 0.10135135f;
                f4 = 1.0f;
                Class_4595 class_45953 = (Class_4595)((Object)class_34364.Method_3440(Field_11034));
                if (class_45953 == Class_4595.Field_4598 && !Class_11027.Method_11060(class_561, class_4751.Method_4778(), class_34362)) {
                    f5 = 0.0f;
                    f6 = 1.3939394f * 0.35869566f;
                    n2 = 21649 & -32251;
                } else if (class_45953 == Class_4595.Field_4613 && !Class_11027.Method_11060(class_561, class_4751.Method_4784(), class_34362)) {
                    f5 = 0.21874999f * 2.2857144f;
                    f6 = 1.0f;
                    n2 = -16127 & 2611;
                }
            }
        } else if (class_4595 == Class_4595.Field_4613) {
            Class_3436 class_34365 = class_561.Method_568(class_4751.Method_4778());
            Class_3238 class_32384 = class_34365.Method_3442();
            if (Class_11027.Method_11065(class_32384) && class_37983 == class_34365.Method_3440(Field_11031)) {
                f5 = 0.0f;
                f6 = 0.43835616f * 1.140625f;
                Class_4595 class_45954 = (Class_4595)((Object)class_34365.Method_3440(Field_11034));
                if (class_45954 == Class_4595.Field_4602 && !Class_11027.Method_11060(class_561, class_4751.Method_4771(), class_34362)) {
                    n2 = 8227 & -32639;
                } else if (class_45954 == Class_4595.Field_4603 && !Class_11027.Method_11060(class_561, class_4751.Method_4770(), class_34362)) {
                    f3 = 0.15789473f * 3.1666667f;
                    f4 = 1.0f;
                    n2 = 2057 & 5985;
                }
            }
        } else if (class_4595 == Class_4595.Field_4598 && Class_11027.Method_11065(class_3238 = (class_3436 = class_561.Method_568(class_4751.Method_4784())).Method_3442()) && class_37983 == class_3436.Method_3440(Field_11031)) {
            Class_4595 class_45955 = (Class_4595)((Object)class_3436.Method_3440(Field_11034));
            if (class_45955 == Class_4595.Field_4602 && !Class_11027.Method_11060(class_561, class_4751.Method_4771(), class_34362)) {
                n2 = 12293 & 777;
            } else if (class_45955 == Class_4595.Field_4603 && !Class_11027.Method_11060(class_561, class_4751.Method_4770(), class_34362)) {
                f3 = 1.1529412f * 0.43367344f;
                f4 = 1.0f;
                n2 = 2419 & -24443;
            }
        }
        if (n2 != 0) {
            this.\u0000strictfp(f3, f, f5, f4, f2, f6);
        }
        return n2 != 0;
    }

    public Class_3436 Method_11046(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        Class_3436 class_3436 = super.Method_3330(class_283, class_4751, class_4595, f, f2, f3, n, class_859);
        class_3436 = class_3436.Method_3437(Field_11034, (Comparable)((Object)class_859.\u0000, `())).Method_3437(Field_11030, (Comparable)((Object)Class_31031.Field_31037));
        return class_4595 != Class_4595.Field_4615 && (class_4595 == Class_4595.Field_4601 || (double)f2 <= 0.4444444444444444 * 1.125) ? class_3436.Method_3437(Field_11031, (Comparable)((Object)Class_37983.Field_37985)) : class_3436.Method_3437(Field_11031, (Comparable)((Object)Class_37983.Field_37986));
    }

    public boolean Method_11047(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        return this.Field_11029.Method_3289(class_283, class_4751, this.Field_11035, class_626, Class_4595.Field_4615, 0.0f, 0.0f, 0.0f);
    }

    public int Method_11048(Class_3436 class_3436) {
        int n = -29504 & 513;
        if (class_3436.Method_3440(Field_11031) == Class_37983.Field_37986) {
            n |= 4 & 6660;
        }
        return n |= (4103 & -6811) - ((Class_4595)((Object)class_3436.Method_3440(Field_11034))).Method_4648();
    }

    public boolean Method_11049() {
        return (4112 & 1833) != 0;
    }

    public boolean Method_11050() {
        return this.Field_11029.Method_3392();
    }

    public int Method_11051(Class_561 class_561, Class_4751 class_4751) {
        Class_3436 class_3436;
        Class_3238 class_3238;
        int n;
        Class_3436 class_34362 = class_561.Method_568(class_4751);
        Class_4595 class_4595 = (Class_4595)((Object)class_34362.Method_3440(Field_11034));
        Class_37983 class_37983 = (Class_37983)((Object)class_34362.Method_3440(Field_11031));
        int n2 = n = class_37983 == Class_37983.Field_37986 ? 37 & -29949 : 8529 & 1544;
        if (class_4595 == Class_4595.Field_4603) {
            Class_3436 class_34363 = class_561.Method_568(class_4751.Method_4771());
            Class_3238 class_32382 = class_34363.Method_3442();
            if (Class_11027.Method_11065(class_32382) && class_37983 == class_34363.Method_3440(Field_11031)) {
                Class_4595 class_45952 = (Class_4595)((Object)class_34363.Method_3440(Field_11034));
                if (class_45952 == Class_4595.Field_4598 && !Class_11027.Method_11060(class_561, class_4751.Method_4778(), class_34362)) {
                    return n != 0 ? -32445 & 17553 : 2435 & -16382;
                }
                if (class_45952 == Class_4595.Field_4613 && !Class_11027.Method_11060(class_561, class_4751.Method_4784(), class_34362)) {
                    return n != 0 ? 266 & 4118 : 8209 & -32765;
                }
            }
        } else if (class_4595 == Class_4595.Field_4602) {
            Class_3436 class_34364 = class_561.Method_568(class_4751.Method_4770());
            Class_3238 class_32383 = class_34364.Method_3442();
            if (Class_11027.Method_11065(class_32383) && class_37983 == class_34364.Method_3440(Field_11031)) {
                Class_4595 class_45953 = (Class_4595)((Object)class_34364.Method_3440(Field_11034));
                if (class_45953 == Class_4595.Field_4598 && !Class_11027.Method_11060(class_561, class_4751.Method_4778(), class_34362)) {
                    return n != 0 ? -32766 & 11074 : 16437 & 4353;
                }
                if (class_45953 == Class_4595.Field_4613 && !Class_11027.Method_11060(class_561, class_4751.Method_4784(), class_34362)) {
                    return n != 0 ? 24581 & 65 : -13918 & 8206;
                }
            }
        } else if (class_4595 == Class_4595.Field_4613) {
            Class_3436 class_34365 = class_561.Method_568(class_4751.Method_4778());
            Class_3238 class_32384 = class_34365.Method_3442();
            if (Class_11027.Method_11065(class_32384) && class_37983 == class_34365.Method_3440(Field_11031)) {
                Class_4595 class_45954 = (Class_4595)((Object)class_34365.Method_3440(Field_11034));
                if (class_45954 == Class_4595.Field_4602 && !Class_11027.Method_11060(class_561, class_4751.Method_4771(), class_34362)) {
                    return n != 0 ? -32757 & 3074 : 20609 & 1539;
                }
                if (class_45954 == Class_4595.Field_4603 && !Class_11027.Method_11060(class_561, class_4751.Method_4770(), class_34362)) {
                    return n != 0 ? 10505 & -16349 : 1382 & -24558;
                }
            }
        } else if (class_4595 == Class_4595.Field_4598 && Class_11027.Method_11065(class_3238 = (class_3436 = class_561.Method_568(class_4751.Method_4784())).Method_3442()) && class_37983 == class_3436.Method_3440(Field_11031)) {
            Class_4595 class_45955 = (Class_4595)((Object)class_3436.Method_3440(Field_11034));
            if (class_45955 == Class_4595.Field_4602 && !Class_11027.Method_11060(class_561, class_4751.Method_4771(), class_34362)) {
                return n != 0 ? 2049 & 1361 : 8794 & -32638;
            }
            if (class_45955 == Class_4595.Field_4603 && !Class_11027.Method_11060(class_561, class_4751.Method_4770(), class_34362)) {
                return n != 0 ? 1026 & -14073 : 28673 & 1249;
            }
        }
        return 2184 & 19;
    }

    public float Method_11052(Class_1061 class_1061) {
        return this.Field_11029.Method_3348(class_1061);
    }

    public Class_3779 Method_11053(Class_3436 class_3436) {
        return this.Field_11029.Method_3306(this.Field_11035);
    }

    public int Method_11054(Class_561 class_561, Class_4751 class_4751) {
        return this.Field_11029.Method_3432(class_561, class_4751);
    }

    public void Method_11055(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Field_11029.Method_3357(class_283, class_4751, this.Field_11035);
    }

    public Class_10997 Method_11056(Class_283 class_283, Class_4751 class_4751) {
        return this.Field_11029.Method_3397(class_283, class_4751);
    }

    public void Method_11057(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        this.Field_11029.Method_3391(class_283, class_4751, class_3436, random);
    }

    public void Method_11058(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.\u0000strictfp(class_283, class_4751, this.Field_11035, Class_9265.Field_9351);
        this.Field_11029.Method_3407(class_283, class_4751, this.Field_11035);
    }

    private static String Method_11059(String string) {
        int n = 16963;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11027.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_11060(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436) {
        Class_3436 class_34362 = class_561.Method_568(class_4751);
        Class_3238 class_3238 = class_34362.Method_3442();
        return (Class_11027.Method_11065(class_3238) && class_34362.Method_3440(Field_11031) == class_3436.Method_3440(Field_11031) && class_34362.Method_3440(Field_11034) == class_3436.Method_3440(Field_11034) ? 171 & -13755 : 6916 & 0) != 0;
    }

    public void Method_11061(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        this.Field_11029.Method_3413(class_283, class_4751, class_3436, random);
    }

    public Class_3436 Method_11062(int n) {
        Class_3436 class_3436 = this.\u0000strictfp().Method_3685(Field_11031, (Comparable)((Object)((n & (8612 & 16926)) > 0 ? Class_37983.Field_37986 : Class_37983.Field_37985)));
        class_3436 = class_3436.Method_3437(Field_11034, (Comparable)((Object)Class_4595.Method_4637((3271 & 517) - (n & (4227 & 18755)))));
        return class_3436;
    }

    public void Method_11063(Class_561 class_561, Class_4751 class_4751) {
        if (class_561.Method_568(class_4751).Method_3440(Field_11031) == Class_37983.Field_37986) {
            this.\u0000strictfp(0.0f, 0.96875f * 0.516129f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 10.875f * 0.04597701f, 1.0f);
        }
    }

    static {
        Field_11034 = Class_5011.Method_5012(Class_11027.Method_11038("\ud880\ud881\ud881\ud881\ud880\ud881"), Class_4662.Field_4663);
        Field_11031 = Class_3957.Method_3963(Class_11027.Method_11071("\u060c\u0604\u060a\u0602"), Class_37983.class);
        Field_11030 = Class_3957.Method_3963(Class_11027.Method_11059("\u0401\u0403\u0401\u0401\u0407"), Class_31031.class);
        int[][] arrarrn = new int[5198 & -14168][];
        int[] arrn = new int[27 & -30650];
        arrn[18474 & 384] = 12 & -16825;
        arrn[16459 & 8193] = 197 & -15355;
        arrarrn[18438 & 4224] = arrn;
        int[] arrn2 = new int[3074 & 25474];
        arrn2[8242 & -14720] = 13349 & 17029;
        arrn2[10773 & -32765] = -7857 & 7207;
        arrarrn[681 & 1303] = arrn2;
        int[] arrn3 = new int[4130 & 962];
        arrn3[21505 & 8560] = 10038 & 6350;
        arrn3[2309 & 1065] = 159 & 1063;
        arrarrn[28770 & -29169] = arrn3;
        int[] arrn4 = new int[74 & 51];
        arrn4[4626 & 224] = 22 & 396;
        arrn4[-9975 & 65] = -29690 & 28742;
        arrarrn[87 & -32125] = arrn4;
        int[] arrn5 = new int[8902 & 19506];
        arrn5[-32247 & 5184] = 4138 & 8388;
        arrn5[24849 & 4101] = 125 & -22655;
        arrarrn[6660 & 24646] = arrn5;
        int[] arrn6 = new int[2050 & 16398];
        arrn6[10246 & 4096] = 1 & 26881;
        arrn6[513 & 7621] = 2183 & 4131;
        arrarrn[397 & -29115] = arrn6;
        int[] arrn7 = new int[-24566 & 21507];
        arrn7[3073 & -32766] = 43 & -15870;
        arrn7[9235 & 649] = -16217 & 12299;
        arrarrn[16598 & 551] = arrn7;
        int[] arrn8 = new int[3 & -198];
        arrn8[23587 & -32240] = 1028 & 10633;
        arrn8[10243 & 97] = -8150 & 6850;
        arrarrn[22759 & 8711] = arrn8;
        Field_11032 = arrarrn;
    }

    public int Method_11064(Class_283 class_283) {
        return this.Field_11029.Method_3309(class_283);
    }

    public static boolean Method_11065(Class_3238 class_3238) {
        return class_3238 instanceof Class_11027;
    }

    public void Method_11066(Class_283 class_283, Class_4751 class_4751, Class_1061 class_1061) {
        this.Field_11029.Method_3387(class_283, class_4751, class_1061);
    }

    public boolean Method_11067(Class_561 class_561, Class_4751 class_4751) {
        Class_3436 class_3436;
        Class_3238 class_3238;
        Class_3436 class_34362 = class_561.Method_568(class_4751);
        Class_4595 class_4595 = (Class_4595)((Object)class_34362.Method_3440(Field_11034));
        Class_37983 class_37983 = (Class_37983)((Object)class_34362.Method_3440(Field_11031));
        int n = class_37983 == Class_37983.Field_37986 ? 2209 & -15353 : -29054 & 116;
        float f = 1.1153846f * 0.44827586f;
        float f2 = 1.0f;
        if (n != 0) {
            f = 0.0f;
            f2 = 5.0f * 0.1f;
        }
        float f3 = 0.0f;
        float f4 = 1.0f;
        float f5 = 0.0f;
        float f6 = 1.56f * 0.32051283f;
        int n2 = -32493 & 2049;
        if (class_4595 == Class_4595.Field_4603) {
            f3 = 0.7368421f * 0.67857146f;
            f6 = 1.0f;
            Class_3436 class_34363 = class_561.Method_568(class_4751.Method_4770());
            Class_3238 class_32382 = class_34363.Method_3442();
            if (Class_11027.Method_11065(class_32382) && class_37983 == class_34363.Method_3440(Field_11031)) {
                Class_4595 class_45952 = (Class_4595)((Object)class_34363.Method_3440(Field_11034));
                if (class_45952 == Class_4595.Field_4598 && !Class_11027.Method_11060(class_561, class_4751.Method_4784(), class_34362)) {
                    f6 = 0.24175824f * 2.0681818f;
                    n2 = 12946 & -32768;
                } else if (class_45952 == Class_4595.Field_4613 && !Class_11027.Method_11060(class_561, class_4751.Method_4778(), class_34362)) {
                    f5 = 0.27380952f * 1.826087f;
                    n2 = 320 & -12270;
                }
            }
        } else if (class_4595 == Class_4595.Field_4602) {
            f4 = 0.37662336f * 1.3275863f;
            f6 = 1.0f;
            Class_3436 class_34364 = class_561.Method_568(class_4751.Method_4771());
            Class_3238 class_32383 = class_34364.Method_3442();
            if (Class_11027.Method_11065(class_32383) && class_37983 == class_34364.Method_3440(Field_11031)) {
                Class_4595 class_45953 = (Class_4595)((Object)class_34364.Method_3440(Field_11034));
                if (class_45953 == Class_4595.Field_4598 && !Class_11027.Method_11060(class_561, class_4751.Method_4784(), class_34362)) {
                    f6 = 6.3333335f * 0.078947365f;
                    n2 = -12288 & 11527;
                } else if (class_45953 == Class_4595.Field_4613 && !Class_11027.Method_11060(class_561, class_4751.Method_4778(), class_34362)) {
                    f5 = 0.33333334f * 1.5f;
                    n2 = -4059 & 1090;
                }
            }
        } else if (class_4595 == Class_4595.Field_4613) {
            f5 = 0.27083334f * 1.8461537f;
            f6 = 1.0f;
            Class_3436 class_34365 = class_561.Method_568(class_4751.Method_4784());
            Class_3238 class_32384 = class_34365.Method_3442();
            if (Class_11027.Method_11065(class_32384) && class_37983 == class_34365.Method_3440(Field_11031)) {
                Class_4595 class_45954 = (Class_4595)((Object)class_34365.Method_3440(Field_11034));
                if (class_45954 == Class_4595.Field_4602 && !Class_11027.Method_11060(class_561, class_4751.Method_4770(), class_34362)) {
                    f4 = 0.86607146f * 0.57731956f;
                    n2 = 132 & -16280;
                } else if (class_45954 == Class_4595.Field_4603 && !Class_11027.Method_11060(class_561, class_4751.Method_4771(), class_34362)) {
                    f3 = 2.1818182f * 0.22916666f;
                    n2 = 256 & -16320;
                }
            }
        } else if (class_4595 == Class_4595.Field_4598 && Class_11027.Method_11065(class_3238 = (class_3436 = class_561.Method_568(class_4751.Method_4778())).Method_3442()) && class_37983 == class_3436.Method_3440(Field_11031)) {
            Class_4595 class_45955 = (Class_4595)((Object)class_3436.Method_3440(Field_11034));
            if (class_45955 == Class_4595.Field_4602 && !Class_11027.Method_11060(class_561, class_4751.Method_4770(), class_34362)) {
                f4 = 1.25f * 0.4f;
                n2 = 16626 & -27128;
            } else if (class_45955 == Class_4595.Field_4603 && !Class_11027.Method_11060(class_561, class_4751.Method_4771(), class_34362)) {
                f3 = 0.23195878f * 2.1555555f;
                n2 = 9296 & 7040;
            }
        }
        this.\u0000strictfp(f3, f, f5, f4, f2, f6);
        return n2 != 0;
    }

    protected Class_11027(Class_3436 class_3436) {
        super(class_3436.Method_3442().Field_3240);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_11034, (Comparable)((Object)Class_4595.Field_4598)).Method_3437(Field_11031, (Comparable)((Object)Class_37983.Field_37985)).Method_3437(Field_11030, (Comparable)((Object)Class_31031.Field_31037)));
        this.Field_11029 = class_3436.Method_3442();
        this.Field_11035 = class_3436;
        this.\u0000= final(this.Field_11029.Field_3249);
        this.\u0000strictfp(this.Field_11029.Field_3252 / (14.833333f * 0.2022472f));
        this.\u0000strictfp(this.Field_11029.Field_3276);
        this.\u0000strictfp(255 & 255);
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    public boolean Method_11068(Class_3436 class_3436, boolean bl) {
        return this.Field_11029.Method_3354(class_3436, bl);
    }

    public Vec3 Method_11069(Class_283 class_283, Class_4751 class_4751, Class_1061 class_1061, Vec3 vec3) {
        return this.Field_11029.Method_3376(class_283, class_4751, class_1061, vec3);
    }

    public Class_17531 Method_11070() {
        return this.Field_11029.Method_3286();
    }

    private static String Method_11071(String string) {
        int n = 11480;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11027.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_11072(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_10997 class_10997, List list, Class_1061 class_1061) {
        this.Method_11063(class_283, class_4751);
        super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
        boolean bl = this.Method_11067(class_283, class_4751);
        super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
        if (bl && this.Method_11045(class_283, class_4751)) {
            super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
        }
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    public void Method_11073(Class_283 class_283, Class_4751 class_4751, Class_626 class_626) {
        this.Field_11029.Method_3308(class_283, class_4751, class_626);
    }

    private void Method_11074() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_11075(Class_283 class_283, Class_4751 class_4751, Class_25529 class_25529) {
        this.Field_11029.Method_3414(class_283, class_4751, class_25529);
    }
}

