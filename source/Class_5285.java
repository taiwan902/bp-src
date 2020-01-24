/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_5285
extends Class_3238 {
    public static final Class_4173 Field_5286;
    public static final Class_5011 Field_5287;
    public static final Class_3957 Field_5288;

    public boolean Method_5289() {
        return (-31488 & 8197) != 0;
    }

    public boolean Method_5290(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        return (8471 & 4673) != 0;
    }

    public void Method_5291(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_5287));
        Class_4751 class_47512 = class_4751.Method_4765(class_4595.Method_4660());
        Class_3436 class_34362 = class_283.Method_375(class_47512);
        if (class_34362.Method_3442() != Class_9265.Field_9270 && class_34362.Method_3442() != Class_9265.Field_9341) {
            class_283.Method_472(class_4751);
        } else {
            class_34362.Method_3442().Method_3336(class_283, class_47512, class_34362, class_3238);
        }
    }

    private static String Method_5292(String string) {
        int n = 18550;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5285.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_5293(Class_561 class_561, Class_4751 class_4751) {
        this.Method_5307(class_561.Method_568(class_4751));
    }

    private void Method_5294(Class_3436 class_3436) {
        float f = 0.6043956f * 0.41363636f;
        float f2 = 0.33333334f * 1.125f;
        float f3 = 0.3956044f * 1.579861f;
        float f4 = 1.4375f * 0.17391305f;
        float f5 = 0.5106383f * 1.46875f;
        switch (Class_30750.Field_30751[((Class_4595)((Object)class_3436.Method_3440(Field_5287))).ordinal()]) {
            case 1: {
                this.\u0000strictfp(0.26875f * 1.3953488f, 0.61607146f * 0.4057971f, 0.5080645f * 0.7380952f, 1.487069f * 0.42028984f, 1.0f, 0.18895349f * 3.3076923f);
                break;
            }
            case 2: {
                this.\u0000strictfp(13.0f * 0.028846154f, 0.0f, 3.225f * 0.11627907f, 0.19565217f * 3.1944444f, 0.90789473f * 0.82608694f, 2.44f * 0.25614753f);
                break;
            }
            case 3: {
                this.\u0000strictfp(0.2668919f * 0.93670887f, 0.814433f * 0.46044305f, 0.1328125f * 1.882353f, 0.18037975f * 4.1578946f, 0.6826923f * 0.91549295f, 1.0f);
                break;
            }
            case 4: {
                this.\u0000strictfp(1.2884616f * 0.19402985f, 0.20689656f * 1.8125f, 0.0f, 1.8125f * 0.41379312f, 0.024038462f * 26.0f, 11.75f * 0.06382979f);
                break;
            }
            case 5: {
                this.\u0000strictfp(9.8f * 0.038265307f, 1.0847458f * 0.23046875f, 0.26595744f * 0.94f, 0.24739584f * 2.5263157f, 0.796875f * 0.9411765f, 1.0f);
                break;
            }
            case 6: {
                this.\u0000strictfp(0.0f, 0.6875f * 0.54545456f, 0.63235295f * 0.39534885f, 0.70000005f * 1.0714285f, 0.29017857f * 2.1538463f, 0.79518074f * 0.9431818f);
            }
        }
    }

    public Class_3436 Method_5295(int n) {
        return this.\u0000strictfp().Method_3685(Field_5287, (Comparable)((Object)Class_5285.Method_5299(n))).Method_3437(Field_5288, (Comparable)((Object)((n & (968 & -32759)) > 0 ? Class_5369.Field_5373 : Class_5369.Field_5372)));
    }

    public boolean Method_5296(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        return (72 & -18174) != 0;
    }

    public Class_1956 Method_5297(Class_283 class_283, Class_4751 class_4751) {
        return class_283.Method_375(class_4751).Method_3440(Field_5288) == Class_5369.Field_5373 ? Class_1956.Method_1981(Class_9265.Field_9341) : Class_1956.Method_1981(Class_9265.Field_9270);
    }

    static {
        Field_5287 = Class_5011.Method_5013(Class_5285.Method_5292("\u431c\u4318\u431a\u4312\u4314\u431c"));
        Field_5288 = Class_3957.Method_3963(Class_5285.Method_5302("\u4e22\u4e23\u4e20\u4e21"), Class_5369.class);
        Field_5286 = Class_4173.Method_4177(Class_5285.Method_5310("\ua98d\ua984\ua983\ua98e\ua98c"));
    }

    public void Method_5298(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        super.Method_3357(class_283, class_4751, class_3436);
        Class_4595 class_4595 = ((Class_4595)((Object)class_3436.Method_3440(Field_5287))).Method_4660();
        class_4751 = class_4751.Method_4765(class_4595);
        Class_3436 class_34362 = class_283.Method_375(class_4751);
        if ((class_34362.Method_3442() == Class_9265.Field_9270 || class_34362.Method_3442() == Class_9265.Field_9341) && ((Boolean)class_34362.Method_3440(Class_5257.Field_5260)).booleanValue()) {
            class_34362.Method_3442().Method_3331(class_283, class_4751, class_34362, 2816 & 25701);
            class_283.Method_472(class_4751);
        }
    }

    public static Class_4595 Method_5299(int n) {
        int n2 = n & (511 & -15353);
        return n2 > (-30683 & 16389) ? null : Class_4595.Method_4637(n2);
    }

    public int Method_5300(Class_3436 class_3436) {
        int n = -15324 & 2178;
        n |= ((Class_4595)((Object)class_3436.Method_3440(Field_5287))).Method_4648();
        if (class_3436.Method_3440(Field_5288) == Class_5369.Field_5373) {
            n |= 20813 & -30200;
        }
        return n;
    }

    public void Method_5301(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626) {
        Class_4595 class_4595;
        Class_4751 class_47512;
        Class_3238 class_3238;
        if (class_626.Field_694.Method_18094() && (class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_5287))) != null && ((class_3238 = class_283.Method_375(class_47512 = class_4751.Method_4765(class_4595.Method_4660())).Method_3442()) == Class_9265.Field_9270 || class_3238 == Class_9265.Field_9341)) {
            class_283.Method_472(class_47512);
        }
        super.Method_3395(class_283, class_4751, class_3436, class_626);
    }

    private static String Method_5302(String string) {
        int n = 4332;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5285.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_5303(Random random) {
        return -9728 & 1296;
    }

    public boolean Method_5304() {
        return (3292 & 24578) != 0;
    }

    public Class_5285() {
        super(Class_3713.Field_3738);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_5287, (Comparable)((Object)Class_4595.Field_4598)).Method_3437(Field_5288, (Comparable)((Object)Class_5369.Field_5372)).Method_3437(Field_5286, Boolean.valueOf((-32752 & 33) != 0)));
        this.\u0000strictfp(\u0000= package);
        this.\u0000= final(0.08139535f * 6.142857f);
    }

    public boolean Method_5305(Class_283 class_283, Class_4751 class_4751) {
        return (320 & -27647) != 0;
    }

    private void Method_5306() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_5307(Class_3436 class_3436) {
        float f = 0.46153843f * 0.5416667f;
        Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_5287));
        if (class_4595 != null) {
            switch (Class_30750.Field_30751[class_4595.ordinal()]) {
                case 1: {
                    this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.1769663f * 1.4126984f, 1.0f);
                    break;
                }
                case 2: {
                    this.\u0000strictfp(0.0f, 0.30241936f * 2.48f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 3: {
                    this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5555556f * 0.45f);
                    break;
                }
                case 4: {
                    this.\u0000strictfp(0.0f, 0.0f, 0.89772725f * 0.8354431f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 5: {
                    this.\u0000strictfp(0.0f, 0.0f, 0.0f, 0.24615385f * 1.015625f, 1.0f, 1.0f);
                    break;
                }
                case 6: {
                    this.\u0000strictfp(0.21276596f * 3.5249999f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
            }
        }
    }

    protected Class_3855 Method_5308() {
        Class_3538[] arrclass_3538 = new Class_3538[12451 & -28853];
        arrclass_3538[8194 & -30628] = Field_5287;
        arrclass_3538[-31743 & 18567] = Field_5288;
        arrclass_3538[9226 & -14013] = Field_5286;
        return new Class_3855(this, arrclass_3538);
    }

    public void Method_5309(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_10997 class_10997, List list, Class_1061 class_1061) {
        this.Method_5307(class_3436);
        super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
        this.Method_5294(class_3436);
        super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    private static String Method_5310(String string) {
        int n = 9586;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5285.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

