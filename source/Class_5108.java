/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Random;

public class Class_5108
extends Class_5133 {
    public static final Class_3957 Field_5109 = Class_3957.Method_3963(Class_5108.Method_5122("\u080b\u080b\u0809\u080a"), Class_5137.class);
    public static final Class_4173 Field_5110 = Class_4173.Method_4177(Class_5108.Method_5118("\u0c00\u0c08\u0c08\u0c08\u0c0c\u0c04\u0c0c\u0c0c"));

    public void Method_5111(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, int n) {
        if (class_3436.Method_3440(Field_5109) == Class_5137.Field_5138) {
            super.\u0000strictfp(class_283, class_4751, class_3436, f, 52 & 2561);
        }
    }

    public void Method_5112(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(\u0000strictfp));
        if (class_3436.Method_3440(Field_5109) == Class_5137.Field_5140) {
            if (class_283.Method_375(class_4751.Method_4765(class_4595.Method_4660())).Method_3442() != this) {
                class_283.Method_472(class_4751);
            }
        } else if (class_283.Method_375(class_4751.Method_4765(class_4595)).Method_3442() != this) {
            class_283.Method_472(class_4751);
            if (!class_283.Field_306) {
                this.\u0000strictfp(class_283, class_4751, class_3436, -22523 & 1072);
            }
        }
    }

    public static Class_4751 Method_5113(Class_283 class_283, Class_4751 class_4751, int n) {
        Class_4595 class_4595 = (Class_4595)((Object)class_283.Method_375(class_4751).Method_3440(\u0000strictfp));
        int n2 = class_4751.\u0000= final();
        int n3 = class_4751.\u0000, `();
        int n4 = class_4751.\u0000strictfp();
        for (int i = 26896 & -31608; i <= (257 & 16571); ++i) {
            int n5 = n2 - class_4595.Method_4654() * i - (3081 & -20141);
            int n6 = n4 - class_4595.Method_4656() * i - (821 & -949);
            int n7 = n5 + (-14926 & 2);
            int n8 = n6 + (-31538 & 17187);
            for (int j = n5; j <= n7; ++j) {
                for (int k = n6; k <= n8; ++k) {
                    Class_4751 class_47512 = new Class_4751(j, n3, k);
                    if (!Class_5108.Method_5120(class_283, class_47512)) continue;
                    if (n <= 0) {
                        return class_47512;
                    }
                    --n;
                }
            }
        }
        return null;
    }

    public boolean Method_5114() {
        return (6786 & 24832) != 0;
    }

    protected Class_3855 Method_5115() {
        Class_3538[] arrclass_3538 = new Class_3538[-9977 & 43];
        arrclass_3538[16960 & 6172] = \u0000strictfp;
        arrclass_3538[1061 & 20609] = Field_5109;
        arrclass_3538[9427 & 22534] = Field_5110;
        return new Class_3855(this, arrclass_3538);
    }

    private Class_626 Method_5116(Class_283 class_283, Class_4751 class_4751) {
        for (Class_626 class_626 : class_283.Field_325) {
            if (!class_626.Method_822() || !class_626.Field_686.equals(class_4751)) continue;
            return class_626;
        }
        return null;
    }

    public boolean Method_5117(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        if (class_283.Field_306) {
            return (13521 & -15579) != 0;
        }
        if (class_3436.Method_3440(Field_5109) != Class_5137.Field_5140) {
            class_4751 = class_4751.Method_4765((Class_4595)((Object)class_3436.Method_3440(\u0000strictfp)));
            class_3436 = class_283.Method_375(class_4751);
            if (class_3436.Method_3442() != this) {
                return (833 & -27587) != 0;
            }
        }
        if (class_283.Field_284.Method_18362() && class_283.Method_547(class_4751) != Class_17281.Field_17327) {
            Object object;
            if (((Boolean)class_3436.Method_3440(Field_5110)).booleanValue()) {
                object = this.Method_5116(class_283, class_4751);
                if (object != null) {
                    class_626.Method_854(new Class_2849("tile.bed.occupied", new Object[11904 & 16440]));
                    return (11861 & -16381) != 0;
                }
                class_3436 = class_3436.Method_3437(Field_5110, Boolean.valueOf((-31158 & 4113) != 0));
                class_283.Method_462(class_4751, class_3436, 20541 & 262);
            }
            if ((object = class_626.Method_793(class_4751)) == Class_31516.Field_31519) {
                class_3436 = class_3436.Method_3437(Field_5110, Boolean.valueOf((8833 & -15357) != 0));
                class_283.Method_462(class_4751, class_3436, 68 & -29932);
                return (18049 & 4105) != 0;
            }
            if (object == Class_31516.Field_31521) {
                class_626.Method_854(new Class_2849("tile.bed.noSleep", new Object[0 & -32754]));
            } else if (object == Class_31516.Field_31518) {
                class_626.Method_854(new Class_2849("tile.bed.notSafe", new Object[0 & -31085]));
            }
            return (133 & 2843) != 0;
        }
        class_283.Method_472(class_4751);
        Class_4751 class_47512 = class_4751.Method_4765(((Class_4595)((Object)class_3436.Method_3440(\u0000strictfp))).Method_4660());
        if (class_283.Method_375(class_47512).Method_3442() == this) {
            class_283.Method_472(class_47512);
        }
        class_283.Method_559(null, (double)class_4751.\u0000= final() + 0.1111111111111111 * 4.5, (double)class_4751.\u0000, `() + 0.09770114942528736 * 5.117647058823529, (double)class_4751.\u0000strictfp() + 0.20930232558139536 * 2.388888888888889, 2.3913045f * 2.090909f, (20491 & 1) != 0, (17 & -23929) != 0);
        return (10241 & -31573) != 0;
    }

    private static String Method_5118(String string) {
        int n = 23230;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5108.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_5108() {
        super(Class_3713.Field_3735);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_5109, (Comparable)((Object)Class_5137.Field_5138)).Method_3437(Field_5110, Boolean.valueOf((210 & -27615) != 0)));
        this.Method_5126();
    }

    public Class_3436 Method_5119(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        Class_3436 class_34362;
        if (class_3436.Method_3440(Field_5109) == Class_5137.Field_5138 && (class_34362 = class_561.Method_568(class_4751.Method_4765((Class_4595)((Object)class_3436.Method_3440(\u0000strictfp))))).Method_3442() == this) {
            class_3436 = class_3436.Method_3437(Field_5110, class_34362.Method_3440(Field_5110));
        }
        return class_3436;
    }

    protected static boolean Method_5120(Class_283 class_283, Class_4751 class_4751) {
        return (Class_283.Method_538(class_283, class_4751.Method_4782()) && !class_283.Method_375(class_4751).Method_3442().Method_3373().Method_3762() && !class_283.Method_375(class_4751.Method_4769()).Method_3442().Method_3373().Method_3762() ? 12433 & -15583 : 2435 & 20568) != 0;
    }

    public int Method_5121(Class_3436 class_3436) {
        int n = 428 & 9217;
        n |= ((Class_4595)((Object)class_3436.Method_3440(\u0000strictfp))).Method_4619();
        if (class_3436.Method_3440(Field_5109) == Class_5137.Field_5140) {
            n |= -28230 & 27208;
            if (((Boolean)class_3436.Method_3440(Field_5110)).booleanValue()) {
                n |= 4118 & -32603;
            }
        }
        return n;
    }

    private static String Method_5122(String string) {
        int n = 5024;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5108.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_5123() {
        return 24579 & 129;
    }

    public void Method_5124(Class_561 class_561, Class_4751 class_4751) {
        this.Method_5126();
    }

    public boolean Method_5125() {
        return (2100 & 8834) != 0;
    }

    private void Method_5126() {
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0645162f * 0.52840906f, 1.0f);
    }

    public Class_17531 Method_5127() {
        return Class_17531.Field_17538;
    }

    public Class_1956 Method_5128(Class_3436 class_3436, Random random, int n) {
        return class_3436.Method_3440(Field_5109) == Class_5137.Field_5140 ? null : Class_10527.Field_10604;
    }

    public void Method_5129(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626) {
        Class_4751 class_47512;
        if (class_626.Field_694.Method_18094() && class_3436.Method_3440(Field_5109) == Class_5137.Field_5140 && class_283.Method_375(class_47512 = class_4751.Method_4765(((Class_4595)((Object)class_3436.Method_3440(\u0000strictfp))).Method_4660())).Method_3442() == this) {
            class_283.Method_472(class_47512);
        }
    }

    private void Method_5130() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1956 Method_5131(Class_283 class_283, Class_4751 class_4751) {
        return Class_10527.Field_10604;
    }

    public Class_3436 Method_5132(int n) {
        Class_4595 class_4595 = Class_4595.Method_4628(n);
        return (n & (648 & 13320)) > 0 ? this.\u0000strictfp().Method_3685(Field_5109, (Comparable)((Object)Class_5137.Field_5140)).Method_3437(\u0000strictfp, (Comparable)((Object)class_4595)).Method_3437(Field_5110, Boolean.valueOf(((n & (28 & -21340)) > 0 ? 1169 & 8195 : 9602 & -32671) != 0)) : this.\u0000strictfp().Method_3685(Field_5109, (Comparable)((Object)Class_5137.Field_5138)).Method_3437(\u0000strictfp, (Comparable)((Object)class_4595));
    }
}

