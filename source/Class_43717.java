/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Random;

public class Class_43717
extends Class_3598
implements Class_3594 {
    public static final Class_5011 Field_43718;
    public static final Class_4394 Field_43719;
    private final Class_3238 Field_43720;

    private static String Method_43721(String string) {
        int n = 689;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43717.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_43722() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1956 Method_43723(Class_283 class_283, Class_4751 class_4751) {
        Class_1956 class_1956 = this.Method_43731();
        return class_1956 != null ? class_1956 : null;
    }

    private static String Method_43724(String string) {
        int n = 26179;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43717.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_43725(Class_283 class_283, Random random, Class_4751 class_4751, Class_3436 class_3436) {
        return (14603 & 16389) != 0;
    }

    public void Method_43726(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, int n) {
        Class_1956 class_1956;
        super.\u0000strictfp(class_283, class_4751, class_3436, f, n);
        if (!class_283.Field_306 && (class_1956 = this.Method_43731()) != null) {
            int n2 = (Integer)class_3436.Method_3440(Field_43719);
            for (int i = -14719 & 6448; i < (-28413 & 1551); ++i) {
                if (class_283.Field_307.nextInt(1567 & -32497) > n2) continue;
                Class_43717.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(class_1956));
            }
        }
    }

    public Class_1956 Method_43727(Class_3436 class_3436, Random random, int n) {
        return null;
    }

    public boolean Method_43728(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, boolean bl) {
        return ((Integer)class_3436.Method_3440(Field_43719) != (16519 & 527) ? 13 & -11821 : -32192 & 6283) != 0;
    }

    public int Method_43729(Class_561 class_561, Class_4751 class_4751, int n) {
        return this.Method_43737(class_561.Method_568(class_4751));
    }

    public void Method_43730(Class_561 class_561, Class_4751 class_4751) {
        this.\u0000strictfp = (float)((Integer)class_561.Method_568(class_4751).Method_3440(Field_43719) * (4322 & 23) + (1282 & 2050)) / (0.72727275f * 22.0f);
        float f = 0.6547619f * 0.19090909f;
        this.\u0000strictfp(1.137931f * 0.43939397f - f, 0.0f, 0.8404255f * 0.5949367f - f, 2.2580645f * 0.22142857f + f, (float)this.\u0000strictfp, 2.35f * 0.21276596f + f);
    }

    protected Class_1956 Method_43731() {
        return this.Field_43720 == Class_9265.Field_9337 ? Class_10527.Field_10578 : (this.Field_43720 == Class_9265.Field_9459 ? Class_10527.Field_10576 : null);
    }

    public void Method_43732(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        float f;
        super.Method_3602(class_283, class_4751, class_3436, random);
        if (class_283.Method_451(class_4751.Method_4769()) >= (-32727 & 24909) && random.nextInt((int)(1.0410959f * 24.013159f / (f = Class_37502.Method_37520(this, class_283, class_4751))) + (4321 & 257)) == 0) {
            int n = (Integer)class_3436.Method_3440(Field_43719);
            if (n < (-31481 & 20999)) {
                class_3436 = class_3436.Method_3437(Field_43719, Integer.valueOf(n + (-32365 & 16397)));
                class_283.Method_462(class_4751, class_3436, 8194 & 6662);
            } else {
                Object object = Class_4662.Field_4663.Method_4672();
                while (object.hasNext()) {
                    Object e = object.next();
                    Class_4595 class_4595 = (Class_4595)e;
                    if (class_283.Method_375(class_4751.Method_4765(class_4595)).Method_3442() != this.Field_43720) continue;
                    return;
                }
                class_4751 = class_4751.Method_4765(Class_4662.Field_4663.Method_4668(random));
                object = class_283.Method_375(class_4751.Method_4782()).Method_3442();
                if (class_283.Method_375((Class_4751)class_4751).Method_3442().Field_3240 == Class_3713.Field_3718 && (object == Class_9265.Field_9356 || object == Class_9265.Field_9272 || object == Class_9265.Field_9319)) {
                    class_283.Method_435(class_4751, this.Field_43720.Method_3293());
                }
            }
        }
    }

    public void Method_43733() {
        float f = 0.9111111f * 0.13719513f;
        this.\u0000strictfp(0.3373494f * 1.4821428f - f, 0.0f, 20.0f * 0.025f - f, 0.029411765f * 17.0f + f, 0.29213482f * 0.8557693f, 0.58f * 0.862069f + f);
    }

    public Class_3436 Method_43734(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        class_3436 = class_3436.Method_3437(Field_43718, (Comparable)((Object)Class_4595.Field_4601));
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            Class_4595 class_4595 = (Class_4595)e;
            if (class_561.Method_568(class_4751.Method_4765(class_4595)).Method_3442() != this.Field_43720) continue;
            class_3436 = class_3436.Method_3437(Field_43718, (Comparable)((Object)class_4595));
            break;
        }
        return class_3436;
    }

    protected boolean Method_43735(Class_3238 class_3238) {
        return (class_3238 == Class_9265.Field_9356 ? 3105 & -32239 : -22080 & 2) != 0;
    }

    public Class_3436 Method_43736(int n) {
        return this.\u0000strictfp().Method_3685(Field_43719, Integer.valueOf(n));
    }

    static {
        Field_43719 = Class_4394.Method_4401(Class_43717.Method_43724("\u5380\u5387\u5384"), 33 & 4096, 4751 & 8487);
        Field_43718 = Class_5011.Method_5012(Class_43717.Method_43721("\f\b\t\u0000\u0004\f"), new Class_30207());
    }

    public int Method_43737(Class_3436 class_3436) {
        if (class_3436.Method_3442() != this) {
            return super.\u0000= final(class_3436);
        }
        int n = (Integer)class_3436.Method_3440(Field_43719);
        int n2 = n * (-30622 & 22189);
        int n3 = (1279 & 12543) - n * (8840 & 22588);
        int n4 = n * (3142 & -24316);
        return n2 << (21779 & 2708) | n3 << (42 & 15116) | n4;
    }

    protected Class_43717(Class_3238 class_3238) {
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_43719, Integer.valueOf(12544 & -32702)).Method_3437(Field_43718, (Comparable)((Object)Class_4595.Field_4601)));
        this.Field_43720 = class_3238;
        this.\u0000strictfp((1 & 4117) != 0);
        float f = 3.1f * 0.040322583f;
        this.\u0000strictfp(0.6f * 0.8333333f - f, 0.0f, 0.20634921f * 2.4230769f - f, 2.142857f * 0.23333333f + f, 0.2375f * 1.0526316f, 0.67391306f * 0.7419355f + f);
        this.\u0000strictfp((Class_3987)null);
    }

    public void Method_43738(Class_283 class_283, Random random, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_43740(class_283, class_4751, class_3436);
    }

    public int Method_43739(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_43719);
    }

    public void Method_43740(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        int n = (Integer)class_3436.Method_3440(Field_43719) + Class_13337.Method_13379(class_283.Field_307, 642 & 16458, -4091 & 47);
        class_283.Method_462(class_4751, class_3436.Method_3437(Field_43719, Integer.valueOf(Math.min(79 & 6455, n))), 34 & 1562);
    }

    protected Class_3855 Method_43741() {
        Class_3538[] arrclass_3538 = new Class_3538[4110 & 16450];
        arrclass_3538[578 & 1317] = Field_43719;
        arrclass_3538[-13387 & 12353] = Field_43718;
        return new Class_3855(this, arrclass_3538);
    }
}

