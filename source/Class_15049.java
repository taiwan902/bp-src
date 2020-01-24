/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 */
import com.google.common.base.Objects;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Random;

public class Class_15049
extends Class_3238 {
    public static final Class_4173 Field_15050;
    public static final Class_4173 Field_15051;
    public static final Class_4173 Field_15052;
    public static final Class_5011 Field_15053;

    public Class_3436 Method_15054(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        Class_3436 class_3436 = this.\u0000strictfp().Method_3685(Field_15050, Boolean.valueOf((10292 & 21123) != 0)).Method_3437(Field_15052, Boolean.valueOf((1032 & 8963) != 0)).Method_3437(Field_15051, Boolean.valueOf((-32758 & 26181) != 0));
        if (class_4595.Method_4640().Method_4581()) {
            class_3436 = class_3436.Method_3437(Field_15053, (Comparable)((Object)class_4595));
        }
        return class_3436;
    }

    public Class_15049() {
        super(Class_3713.Field_3751);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_15053, (Comparable)((Object)Class_4595.Field_4598)).Method_3437(Field_15050, Boolean.valueOf((152 & 22816) != 0)).Method_3437(Field_15052, Boolean.valueOf((64 & 12314) != 0)).Method_3437(Field_15051, Boolean.valueOf((9256 & 400) != 0)));
        this.\u0000strictfp(Class_3987.Field_3998);
        this.\u0000strictfp((4121 & 18241) != 0);
    }

    public void Method_15055(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        this.Method_15079(class_283, class_4751, class_3436, (9760 & -28415) != 0, (281 & 1) != 0, -1 & -1, null);
    }

    public void Method_15056(Class_561 class_561, Class_4751 class_4751) {
        float f = 0.087500006f * 2.142857f;
        switch (Class_15263.Field_15264[((Class_4595)((Object)class_561.Method_568(class_4751).Method_3440(Field_15053))).ordinal()]) {
            case 1: {
                this.\u0000strictfp(0.0f, 0.09052631f * 2.2093024f, 3.2142856f * 0.15555556f - f, f * 2.0f, 5.2f * 0.15384616f, 0.0875f * 5.714286f + f);
                break;
            }
            case 2: {
                this.\u0000strictfp(1.0f - f * 2.0f, 0.035555556f * 5.625f, 2.0833335f * 0.24f - f, 1.0f, 1.4468085f * 0.5529412f, 0.030303031f * 16.5f + f);
                break;
            }
            case 3: {
                this.\u0000strictfp(0.6956522f * 0.71875f - f, 0.5588235f * 0.35789475f, 0.0f, 0.40517244f * 1.2340425f + f, 0.9445783f * 0.8469388f, f * 2.0f);
                break;
            }
            case 4: {
                this.\u0000strictfp(1.1111112f * 0.45f - f, 2.1578948f * 0.09268292f, 1.0f - f * 2.0f, 0.43292686f * 1.1549295f + f, 0.2f * 4.0f, 1.0f);
            }
        }
    }

    public Class_3436 Method_15057(int n) {
        return this.\u0000strictfp().Method_3685(Field_15053, (Comparable)((Object)Class_4595.Method_4628(n & (4175 & 531)))).Method_3437(Field_15050, Boolean.valueOf(((n & (16745 & 10250)) > 0 ? 1743 & 2049 : 720 & 18442) != 0)).Method_3437(Field_15052, Boolean.valueOf(((n & (327 & -31596)) > 0 ? 9 & 14083 : 4097 & -31206) != 0));
    }

    public int Method_15058(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        return (Boolean)class_3436.Method_3440(Field_15050) == false ? 17925 & -26606 : (class_3436.Method_3440(Field_15053) == class_4595 ? 8463 & 255 : 645 & 18448);
    }

    public boolean Method_15059() {
        return (16384 & 155) != 0;
    }

    private static String Method_15060(String string) {
        int n = 21408;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15049.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_15053 = Class_5011.Method_5012(Class_15049.Method_15071("\u9848\u9848\u9848\u9840\u9844\u984c"), Class_4662.Field_4663);
        Field_15050 = Class_4173.Method_4177(Class_15049.Method_15060("\u0560\u0561\u0563\u0563\u0560\u0561\u0562"));
        Field_15052 = Class_4173.Method_4177(Class_15049.Method_15080("\u2021\u2025\u2026\u2022\u2021\u2021\u2027\u2027"));
        Field_15051 = Class_4173.Method_4177(Class_15049.Method_15078("\u8000\u8000\u8000\u8000\u8010\u8010\u8010\u8010\u8010"));
    }

    public boolean Method_15061() {
        return (25134 & 1344) != 0;
    }

    public boolean Method_15062(Class_283 class_283, Class_4751 class_4751) {
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            Class_4595 class_4595 = (Class_4595)e;
            if (!class_283.Method_375(class_4751.Method_4765(class_4595)).Method_3442().Method_3400()) continue;
            return (1 & 4115) != 0;
        }
        return (50 & 12805) != 0;
    }

    private void Method_15063(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        class_283.Method_525(class_4751, this);
        class_283.Method_525(class_4751.Method_4765(class_4595.Method_4660()), this);
    }

    public void Method_15064(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        boolean bl = (Boolean)class_3436.Method_3440(Field_15052);
        boolean bl2 = (Boolean)class_3436.Method_3440(Field_15050);
        if (bl || bl2) {
            this.Method_15079(class_283, class_4751, class_3436, (-26109 & 8297) != 0, (16914 & -32312) != 0, -1 & -1, null);
        }
        if (bl2) {
            class_283.Method_525(class_4751, this);
            class_283.Method_525(class_4751.Method_4765(((Class_4595)((Object)class_3436.Method_3440(Field_15053))).Method_4660()), this);
        }
        super.Method_3357(class_283, class_4751, class_3436);
    }

    public void Method_15065(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
    }

    protected Class_3855 Method_15066() {
        Class_3538[] arrclass_3538 = new Class_3538[17412 & 12302];
        arrclass_3538[29896 & 2086] = Field_15053;
        arrclass_3538[16905 & 5123] = Field_15050;
        arrclass_3538[-32718 & 16390] = Field_15052;
        arrclass_3538[-30205 & 4291] = Field_15051;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_15067(Class_3436 class_3436) {
        int n = 86 & 26880;
        n |= ((Class_4595)((Object)class_3436.Method_3440(Field_15053))).Method_4619();
        if (((Boolean)class_3436.Method_3440(Field_15050)).booleanValue()) {
            n |= 2058 & -22772;
        }
        if (((Boolean)class_3436.Method_3440(Field_15052)).booleanValue()) {
            n |= 3086 & -12283;
        }
        return n;
    }

    public void Method_15068(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        Class_4595 class_4595;
        if (class_3238 != this && this.Method_15081(class_283, class_4751, class_3436) && !class_283.Method_375(class_4751.Method_4765((class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_15053))).Method_4660())).Method_3442().Method_3400()) {
            this.\u0000strictfp(class_283, class_4751, class_3436, 16530 & -31220);
            class_283.Method_472(class_4751);
        }
    }

    public boolean Method_15069(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        return (class_4595.Method_4640().Method_4581() && class_283.Method_375(class_4751.Method_4765(class_4595.Method_4660())).Method_3442().Method_3400() ? -14951 & 5 : -23918 & 329) != 0;
    }

    private void Method_15070(Class_283 class_283, Class_4751 class_4751, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (bl2 && !bl4) {
            class_283.Method_475((double)class_4751.\u0000= final() + 3.2857142857142856 * 0.15217391304347827, (double)class_4751.\u0000, `() + 0.21363636363636365 * 0.46808510638297873, (double)class_4751.\u0000strictfp() + 0.010752688172043012 * 46.5, "random.click", 0.3f * 1.3333333f, 0.83478266f * 0.71875f);
        } else if (!bl2 && bl4) {
            class_283.Method_475((double)class_4751.\u0000= final() + 0.5675675675675675 * 0.880952380952381, (double)class_4751.\u0000, `() + 1.1466666666666667 * 0.0872093023255814, (double)class_4751.\u0000strictfp() + 2.7142857142857144 * 0.18421052631578946, "random.click", 0.6547619f * 0.6109091f, 8.9f * 0.056179777f);
        } else if (bl && !bl3) {
            class_283.Method_475((double)class_4751.\u0000= final() + 1.4878048780487805 * 0.3360655737704918, (double)class_4751.\u0000, `() + 0.15636363636363637 * 0.6395348837209303, (double)class_4751.\u0000strictfp() + 0.53125 * 0.9411764705882353, "random.click", 0.30769232f * 1.3f, 0.6730769f * 1.04f);
        } else if (!bl && bl3) {
            class_283.Method_475((double)class_4751.\u0000= final() + 0.36363636363636365 * 1.375, (double)class_4751.\u0000, `() + 0.37083333333333335 * 0.2696629213483146, (double)class_4751.\u0000strictfp() + 0.7232142857142858 * 0.691358024691358, "random.bowhit", 0.4f * 1.0f, 2.7727273f * 0.4327869f / (class_283.Field_307.nextFloat() * (0.01724138f * 11.6f) + 0.42954543f * 2.0952382f));
        }
    }

    private static String Method_15071(String string) {
        int n = 5293;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15049.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_10997 Method_15072(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return null;
    }

    public void Method_15073(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_859 class_859, Class_23823 class_23823) {
        this.Method_15079(class_283, class_4751, class_3436, (20041 & 8224) != 0, (3076 & -16374) != 0, -1 & -1, null);
    }

    private void Method_15074() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3436 Method_15075(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        return class_3436.Method_3437(Field_15051, Boolean.valueOf((!Class_283.Method_538(class_561, class_4751.Method_4782()) ? 24617 & 135 : 8256 & 21665) != 0));
    }

    public boolean Method_15076() {
        return (9 & 16673) != 0;
    }

    public Class_17531 Method_15077() {
        return Class_17531.Field_17539;
    }

    private static String Method_15078(String string) {
        int n = 88;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15049.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_15079(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, boolean bl, boolean bl2, int n, Class_3436 class_34362) {
        Object object;
        Class_4751 class_47512;
        Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_15053));
        int n2 = ((Boolean)class_3436.Method_3440(Field_15052)).booleanValue();
        boolean bl3 = (Boolean)class_3436.Method_3440(Field_15050);
        int n3 = !Class_283.Method_538(class_283, class_4751.Method_4782()) ? 5 & 6147 : 256 & 12;
        int n4 = !bl ? 2081 & 8969 : -16040 & 6692;
        boolean bl4 = 9473 & -28012;
        int n5 = -24448 & 1041;
        Class_3436[] arrclass_3436 = new Class_3436[-31702 & 27563];
        for (int i = 24897 & -25951; i < (6330 & -7830); ++i) {
            class_47512 = class_4751.Method_4776(class_4595, i);
            object = class_283.Method_375(class_47512);
            if (object.Method_3442() == Class_9265.Field_9266) {
                if (object.Method_3440(Field_15053) != class_4595.Method_4660()) break;
                n5 = i;
                break;
            }
            if (object.Method_3442() != Class_9265.Field_9282 && i != n) {
                arrclass_3436[i] = null;
                n4 = 8240 & -29943;
                continue;
            }
            if (i == n) {
                object = (Class_3436)Objects.firstNonNull((Object)class_34362, (Object)object);
            }
            int n6 = (Boolean)object.Method_3440(Class_25178.Field_25182) == false ? -16383 & 4795 : 4113 & -6072;
            boolean bl5 = (Boolean)object.Method_3440(Class_25178.Field_25179);
            int n7 = ((Boolean)object.Method_3440(Class_25178.Field_25186)).booleanValue();
            n4 &= n7 == n3 ? 17489 & 265 : 10496 & -32758;
            bl4 |= n6 != 0 && bl5 ? 16645 & -22493 : 4113 & -23614;
            arrclass_3436[i] = object;
            if (i != n) continue;
            class_283.Method_441(class_4751, this, this.\u0000strictfp(class_283));
            n4 &= n6;
        }
        Class_3436 class_34363 = this.\u0000strictfp().Method_3685(Field_15052, Boolean.valueOf(n4 != 0)).Method_3437(Field_15050, Boolean.valueOf(bl4 &= (n4 &= n5 > (-32503 & 9349) ? 4677 & 8361 : 9234 & -32636)));
        if (n5 > 0) {
            class_47512 = class_4751.Method_4776(class_4595, n5);
            object = class_4595.Method_4660();
            class_283.Method_462(class_47512, class_34363.Method_3437(Field_15053, (Comparable)object), -16381 & 10627);
            this.Method_15063(class_283, class_47512, (Class_4595)object);
            this.Method_15070(class_283, class_47512, n4 != 0, bl4, n2 != 0, bl3);
        }
        this.Method_15070(class_283, class_4751, n4 != 0, bl4, n2 != 0, bl3);
        if (!bl) {
            class_283.Method_462(class_4751, class_34363.Method_3437(Field_15053, (Comparable)((Object)class_4595)), 12311 & -31229);
            if (bl2) {
                this.Method_15063(class_283, class_4751, class_4595);
            }
        }
        if (n2 != n4) {
            for (int i = 17409 & 11123; i < n5; ++i) {
                object = class_4751.Method_4776(class_4595, i);
                Class_3436 class_34364 = arrclass_3436[i];
                if (class_34364 == null || class_283.Method_375((Class_4751)object).Method_3442() == Class_9265.Field_9351) continue;
                class_283.Method_462((Class_4751)object, class_34364.Method_3437(Field_15052, Boolean.valueOf(n4 != 0)), 2311 & 531);
            }
        }
    }

    private static String Method_15080(String string) {
        int n = 32193;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15049.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private boolean Method_15081(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!this.Method_15062(class_283, class_4751)) {
            this.\u0000strictfp(class_283, class_4751, class_3436, 786 & 1152);
            class_283.Method_472(class_4751);
            return (768 & -23422) != 0;
        }
        return (8713 & -31707) != 0;
    }

    public int Method_15082(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        return (Boolean)class_3436.Method_3440(Field_15050) != false ? -24305 & 2207 : 4328 & -31485;
    }
}

