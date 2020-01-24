/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_3563
extends Class_3598
implements Class_3594 {
    public static final Class_3957 Field_3564;
    public static final Class_3957 Field_3565;
    public static final Class_3957 Field_3566;

    public void Method_3567(Class_283 class_283, Class_4751 class_4751, Class_37289 class_37289, int n) {
        class_283.Method_462(class_4751, this.\u0000strictfp().Method_3685(Field_3566, (Comparable)((Object)Class_36572.Field_36573)).Method_3437(Field_3565, (Comparable)((Object)class_37289)), n);
        class_283.Method_462(class_4751.Method_4769(), this.\u0000strictfp().Method_3685(Field_3566, (Comparable)((Object)Class_36572.Field_36575)), n);
    }

    public Class_3563() {
        super(Class_3713.Field_3725);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_3565, (Comparable)((Object)Class_37289.Field_37297)).Method_3437(Field_3566, (Comparable)((Object)Class_36572.Field_36573)).Method_3437(Field_3564, (Comparable)((Object)Class_4595.Field_4598)));
        this.\u0000= final(0.0f);
        this.\u0000strictfp(\u0000strictfp);
        this.\u0000, `("doublePlant");
    }

    static {
        Field_3565 = Class_3957.Method_3963(Class_3563.Method_3578("\u8291\u8282\u8293\u8288\u8286\u828d\u8295"), Class_37289.class);
        Field_3566 = Class_3957.Method_3963(Class_3563.Method_3572("\u1030\u1030\u1032\u1030"), Class_36572.class);
        Field_3564 = Class_5133.Field_5134;
    }

    public Class_37289 Method_3568(Class_561 class_561, Class_4751 class_4751) {
        Class_3436 class_3436 = class_561.Method_568(class_4751);
        if (class_3436.Method_3442() == this) {
            class_3436 = this.Method_3571(class_3436, class_561, class_4751);
            return (Class_37289)((Object)class_3436.Method_3440(Field_3565));
        }
        return Class_37289.Field_37295;
    }

    public void Method_3569(Class_283 class_283, Class_626 class_626, Class_4751 class_4751, Class_3436 class_3436, Class_4879 class_4879) {
        if (class_283.Field_306 || class_626.Method_792() == null || class_626.Method_792().Method_23844() != Class_10527.Field_10606 || class_3436.Method_3440(Field_3566) != Class_36572.Field_36573 || !this.Method_3576(class_283, class_4751, class_3436, class_626)) {
            super.\u0000strictfp(class_283, class_626, class_4751, class_3436, class_4879);
        }
    }

    public void Method_3570(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_859 class_859, Class_23823 class_23823) {
        class_283.Method_462(class_4751.Method_4769(), this.\u0000strictfp().Method_3685(Field_3566, (Comparable)((Object)Class_36572.Field_36575)), 7 & 10770);
    }

    public Class_3436 Method_3571(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        Class_3436 class_34362;
        if (class_3436.Method_3440(Field_3566) == Class_36572.Field_36575 && (class_34362 = class_561.Method_568(class_4751.Method_4782())).Method_3442() == this) {
            class_3436 = class_3436.Method_3437(Field_3565, class_34362.Method_3440(Field_3565));
        }
        return class_3436;
    }

    private static String Method_3572(String string) {
        int n = 28904;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_3563.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_3573(Class_283 class_283, Random random, Class_4751 class_4751, Class_3436 class_3436) {
        return (25 & -18427) != 0;
    }

    public void Method_3574(Class_561 class_561, Class_4751 class_4751) {
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    public Class_16702 Method_3575() {
        return Class_16702.Field_16704;
    }

    private boolean Method_3576(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626) {
        Class_37289 class_37289 = (Class_37289)((Object)class_3436.Method_3440(Field_3565));
        if (class_37289 != Class_37289.Field_37295 && class_37289 != Class_37289.Field_37300) {
            return (8082 & 16389) != 0;
        }
        class_626.Method_750(Class_19863.Field_19891[Class_3238.Method_3435(this)]);
        int n = (class_37289 == Class_37289.Field_37300 ? Class_5341.Field_5345 : Class_5341.Field_5348).Method_5356();
        Class_3563.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(Class_9265.Field_9278, -32446 & 1039, n));
        return (4613 & 24633) != 0;
    }

    public void Method_3577(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626) {
        if (class_3436.Method_3440(Field_3566) == Class_36572.Field_36575) {
            if (class_283.Method_375(class_4751.Method_4782()).Method_3442() == this) {
                if (!class_626.Field_694.Method_18094()) {
                    Class_3436 class_34362 = class_283.Method_375(class_4751.Method_4782());
                    Class_37289 class_37289 = (Class_37289)((Object)class_34362.Method_3440(Field_3565));
                    if (class_37289 != Class_37289.Field_37295 && class_37289 != Class_37289.Field_37300) {
                        class_283.Method_541(class_4751.Method_4782(), (81 & -12287) != 0);
                    } else if (!class_283.Field_306) {
                        if (class_626.Method_792() != null && class_626.Method_792().Method_23844() == Class_10527.Field_10606) {
                            this.Method_3576(class_283, class_4751, class_34362, class_626);
                            class_283.Method_472(class_4751.Method_4782());
                        } else {
                            class_283.Method_541(class_4751.Method_4782(), (2113 & 4743) != 0);
                        }
                    } else {
                        class_283.Method_472(class_4751.Method_4782());
                    }
                } else {
                    class_283.Method_472(class_4751.Method_4782());
                }
            }
        } else if (class_626.Field_694.Method_18094() && class_283.Method_375(class_4751.Method_4769()).Method_3442() == this) {
            class_283.Method_462(class_4751.Method_4769(), Class_9265.Field_9351.Method_3293(), 66 & 22146);
        }
        super.\u0000strictfp(class_283, class_4751, class_3436, class_626);
    }

    private static String Method_3578(String string) {
        int n = 13590;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_3563.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_3579(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!this.Method_3588(class_283, class_4751, class_3436)) {
            Class_3563 class_3563;
            int n = class_3436.Method_3440(Field_3566) == Class_36572.Field_36575 ? 29765 & 43 : 17544 & 96;
            Class_4751 class_47512 = n != 0 ? class_4751 : class_4751.Method_4769();
            Class_4751 class_47513 = n != 0 ? class_4751.Method_4782() : class_4751;
            Class_3563 class_35632 = n != 0 ? this : class_283.Method_375(class_47512).Method_3442();
            Class_3238 class_3238 = class_3563 = n != 0 ? class_283.Method_375(class_47513).Method_3442() : this;
            if (class_35632 == this) {
                class_283.Method_462(class_47512, Class_9265.Field_9351.Method_3293(), 20610 & 3842);
            }
            if (class_3563 == this) {
                class_283.Method_462(class_47513, Class_9265.Field_9351.Method_3293(), 1187 & 10567);
                if (n == 0) {
                    this.\u0000strictfp(class_283, class_47513, class_3436, -31743 & 2980);
                }
            }
        }
    }

    protected Class_3855 Method_3580() {
        Class_3538[] arrclass_3538 = new Class_3538[18439 & 9219];
        arrclass_3538[-13586 & 1024] = Field_3566;
        arrclass_3538[12321 & 2513] = Field_3565;
        arrclass_3538[17463 & -28670] = Field_3564;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_3581(Class_3436 class_3436) {
        return class_3436.Method_3440(Field_3566) != Class_36572.Field_36575 && class_3436.Method_3440(Field_3565) != Class_37289.Field_37300 ? ((Class_37289)((Object)class_3436.Method_3440(Field_3565))).Method_37307() : 16754 & 3072;
    }

    public int Method_3582(Class_561 class_561, Class_4751 class_4751, int n) {
        Class_37289 class_37289 = this.Method_3568(class_561, class_4751);
        return class_37289 != Class_37289.Field_37300 && class_37289 != Class_37289.Field_37295 ? 553648127 & 50331647 : Class_18104.Method_18110(class_561, class_4751);
    }

    public void Method_3583(Class_283 class_283, Random random, Class_4751 class_4751, Class_3436 class_3436) {
        Class_3563.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(this, 55 & 7945, this.Method_3568(class_283, class_4751).Method_37307()));
    }

    public boolean Method_3584(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, boolean bl) {
        Class_37289 class_37289 = this.Method_3568(class_283, class_4751);
        return (class_37289 != Class_37289.Field_37300 && class_37289 != Class_37289.Field_37295 ? -28669 & 913 : 18 & 16928) != 0;
    }

    public int Method_3585(Class_283 class_283, Class_4751 class_4751) {
        return this.Method_3568(class_283, class_4751).Method_37307();
    }

    public Class_1956 Method_3586(Class_3436 class_3436, Random random, int n) {
        if (class_3436.Method_3440(Field_3566) == Class_36572.Field_36575) {
            return null;
        }
        Class_37289 class_37289 = (Class_37289)((Object)class_3436.Method_3440(Field_3565));
        return class_37289 == Class_37289.Field_37295 ? null : (class_37289 == Class_37289.Field_37300 ? (random.nextInt(-32759 & 1964) == 0 ? Class_10527.Field_10622 : null) : Class_1956.Method_1981(this));
    }

    public boolean Method_3587(Class_283 class_283, Class_4751 class_4751) {
        return (super.Method_3607(class_283, class_4751) && class_283.Method_507(class_4751.Method_4769()) ? 3 & 53 : -29567 & 12560) != 0;
    }

    public boolean Method_3588(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (class_3436.Method_3440(Field_3566) == Class_36572.Field_36575) {
            return (class_283.Method_375(class_4751.Method_4782()).Method_3442() == this ? 2129 & 16399 : 562 & -32699) != 0;
        }
        Class_3436 class_34362 = class_283.Method_375(class_4751.Method_4769());
        return (class_34362.Method_3442() == this && super.Method_3606(class_283, class_4751, class_34362) ? 18459 & 4645 : 1095 & -16256) != 0;
    }

    private void Method_3589() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3436 Method_3590(int n) {
        return (n & (26142 & -32727)) > 0 ? this.\u0000strictfp().Method_3685(Field_3566, (Comparable)((Object)Class_36572.Field_36575)) : this.\u0000strictfp().Method_3685(Field_3566, (Comparable)((Object)Class_36572.Field_36573)).Method_3437(Field_3565, (Comparable)((Object)Class_37289.Method_37306(n & (16415 & 7367))));
    }

    public int Method_3591(Class_3436 class_3436) {
        return class_3436.Method_3440(Field_3566) == Class_36572.Field_36575 ? 25352 & -28470 | ((Class_4595)((Object)class_3436.Method_3440(Field_3564))).Method_4619() : ((Class_37289)((Object)class_3436.Method_3440(Field_3565))).Method_37307();
    }

    public boolean Method_3592(Class_283 class_283, Class_4751 class_4751) {
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        if (class_3436.Method_3442() != this) {
            return (23041 & 9309) != 0;
        }
        Class_37289 class_37289 = (Class_37289)((Object)this.Method_3571(class_3436, class_283, class_4751).Method_3440(Field_3565));
        return (class_37289 == Class_37289.Field_37295 || class_37289 == Class_37289.Field_37300 ? 5505 & 2069 : 1431 & 4136) != 0;
    }

    public void Method_3593(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_37289[] arrclass_37289 = Class_37289.Method_37308();
        int n = arrclass_37289.length;
        for (int i = 19842 & 8257; i < n; ++i) {
            Class_37289 class_37289 = arrclass_37289[i];
            list.add(new Class_23823(class_1956, 11809 & 20485, class_37289.Method_37307()));
        }
    }
}

