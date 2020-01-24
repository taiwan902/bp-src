/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Random;

public class Class_25178
extends Class_3238 {
    public static final Class_4173 Field_25179 = Class_4173.Method_4177(Class_25178.Method_25193("\ue061\ue071\ue062\ue073\ue061\ue071\ue073"));
    public static final Class_4173 Field_25180;
    public static final Class_4173 Field_25181;
    public static final Class_4173 Field_25182;
    public static final Class_4173 Field_25183;
    public static final Class_4173 Field_25184;
    public static final Class_4173 Field_25185;
    public static final Class_4173 Field_25186;

    private void Method_25187(Class_283 class_283, Class_4751 class_4751) {
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        int n = ((Boolean)class_3436.Method_3440(Field_25179)).booleanValue();
        int n2 = -15574 & 0;
        ArrayList arrayList = class_283.Method_473(null, new Class_10997((double)class_4751.\u0000= final() + this.\u0000%, (double)class_4751.\u0000, `() + this.\u0000, for, (double)class_4751.\u0000strictfp() + this.\u0000= final, (double)class_4751.\u0000= final() + this.\u0000, `, (double)class_4751.\u0000, `() + this.\u0000strictfp, (double)class_4751.\u0000strictfp() + this.\u0000
        ));
        if (!arrayList.isEmpty()) {
            for (Class_1061 class_1061 : arrayList) {
                if (class_1061.Method_1363()) continue;
                n2 = 35 & -2415;
                break;
            }
        }
        if (n2 != n) {
            class_3436 = class_3436.Method_3437(Field_25179, Boolean.valueOf(n2 != 0));
            class_283.Method_462(class_4751, class_3436, 1291 & 22595);
            this.Method_25189(class_283, class_4751, class_3436);
        }
        if (n2 != 0) {
            class_283.Method_441(class_4751, this, this.\u0000strictfp(class_283));
        }
    }

    public void Method_25188(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        int n;
        int n2 = ((Boolean)class_3436.Method_3440(Field_25186)).booleanValue();
        int n3 = n = !Class_283.Method_538(class_283, class_4751.Method_4782()) ? 16387 & 8197 : 1052 & 12803;
        if (n2 != n) {
            this.\u0000strictfp(class_283, class_4751, class_3436, -26982 & 10241);
            class_283.Method_472(class_4751);
        }
    }

    private void Method_25189(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_4595[] arrclass_4595 = new Class_4595[5910 & 2058];
        arrclass_4595[-23382 & 4096] = Class_4595.Field_4613;
        arrclass_4595[9235 & -30559] = Class_4595.Field_4602;
        Class_4595[] arrclass_45952 = arrclass_4595;
        int n = arrclass_45952.length;
        block0 : for (int i = 297 & 7296; i < n; ++i) {
            Class_4595 class_4595 = arrclass_45952[i];
            for (int j = 21763 & -30719; j < (42 & 9835); ++j) {
                Class_4751 class_47512 = class_4751.Method_4776(class_4595, j);
                Class_3436 class_34362 = class_283.Method_375(class_47512);
                if (class_34362.Method_3442() == Class_9265.Field_9266) {
                    if (class_34362.Method_3440(Class_15049.Field_15053) != class_4595.Method_4660()) continue block0;
                    Class_9265.Field_9266.Method_15079(class_283, class_47512, class_34362, (-28032 & 16449) != 0, (16771 & -28095) != 0, j, class_3436);
                    continue block0;
                }
                if (class_34362.Method_3442() != Class_9265.Field_9282) continue block0;
            }
        }
    }

    public void Method_25190(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_25189(class_283, class_4751, class_3436.Method_3437(Field_25179, Boolean.valueOf((4237 & -31727) != 0)));
    }

    private static String Method_25191(String string) {
        int n = 19782;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25178.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25192(String string) {
        int n = 12435;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25178.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25193(String string) {
        int n = 11256;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25178.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_25194(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (!class_283.Field_306 && ((Boolean)class_283.Method_375(class_4751).Method_3440(Field_25179)).booleanValue()) {
            this.Method_25187(class_283, class_4751);
        }
    }

    public Class_17531 Method_25195() {
        return Class_17531.Field_17537;
    }

    private static String Method_25196(String string) {
        int n = 1332;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25178.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_25197(String string) {
        int n = 26641;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25178.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_25198() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1956 Method_25199(Class_3436 class_3436, Random random, int n) {
        return Class_10527.Field_10624;
    }

    static {
        Field_25186 = Class_4173.Method_4177(Class_25178.Method_25191("\u8801\u8800\u8801\u8801\u8811\u8819\u8810\u8810\u8810"));
        Field_25181 = Class_4173.Method_4177(Class_25178.Method_25192("\ua018\ua009\ua008\ua019\ua01c\ua015\ua01c\ua01d"));
        Field_25182 = Class_4173.Method_4177(Class_25178.Method_25196("\u2506\u250a\u2501\u2502\u2500\u250e\u2507\u2507"));
        Field_25180 = Class_4173.Method_4177(Class_25178.Method_25206("\u3012\u3013\u3000\u3003\u3010"));
        Field_25184 = Class_4173.Method_4177(Class_25178.Method_25197("\u42c0\u42c1\u42c0\u42c1"));
        Field_25185 = Class_4173.Method_4177(Class_25178.Method_25203("\u7100\u7114\u7106\u7106\u7114"));
        Field_25183 = Class_4173.Method_4177(Class_25178.Method_25208("\u04d5\u04c7\u04d1\u04d6"));
    }

    public Class_1956 Method_25200(Class_283 class_283, Class_4751 class_4751) {
        return Class_10527.Field_10624;
    }

    public Class_25178() {
        super(Class_3713.Field_3751);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_25179, Boolean.valueOf((0 & 25088) != 0)).Method_3437(Field_25186, Boolean.valueOf((-24063 & 4554) != 0)).Method_3437(Field_25181, Boolean.valueOf((0 & 14369) != 0)).Method_3437(Field_25182, Boolean.valueOf((0 & 18433) != 0)).Method_3437(Field_25180, Boolean.valueOf((29252 & 3072) != 0)).Method_3437(Field_25184, Boolean.valueOf((-15994 & 4608) != 0)).Method_3437(Field_25185, Boolean.valueOf((16522 & 1296) != 0)).Method_3437(Field_25183, Boolean.valueOf((8227 & -31796) != 0)));
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 8.5f * 0.018382354f, 1.0f);
        this.\u0000strictfp((24929 & 2197) != 0);
    }

    public Class_3436 Method_25201(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        return class_3436.Method_3437(Field_25180, Boolean.valueOf(Class_25178.Method_25212(class_561, class_4751, class_3436, Class_4595.Field_4598))).Method_3437(Field_25184, Boolean.valueOf(Class_25178.Method_25212(class_561, class_4751, class_3436, Class_4595.Field_4603))).Method_3437(Field_25185, Boolean.valueOf(Class_25178.Method_25212(class_561, class_4751, class_3436, Class_4595.Field_4613))).Method_3437(Field_25183, Boolean.valueOf(Class_25178.Method_25212(class_561, class_4751, class_3436, Class_4595.Field_4602)));
    }

    public Class_10997 Method_25202(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return null;
    }

    private static String Method_25203(String string) {
        int n = 4894;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25178.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_25204(Class_3436 class_3436) {
        int n = 262 & 11456;
        if (((Boolean)class_3436.Method_3440(Field_25179)).booleanValue()) {
            n |= 4321 & 8459;
        }
        if (((Boolean)class_3436.Method_3440(Field_25186)).booleanValue()) {
            n |= 4098 & 16403;
        }
        if (((Boolean)class_3436.Method_3440(Field_25181)).booleanValue()) {
            n |= -15836 & 13332;
        }
        if (((Boolean)class_3436.Method_3440(Field_25182)).booleanValue()) {
            n |= 42 & 2636;
        }
        return n;
    }

    public void Method_25205(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_1061 class_1061) {
        if (!class_283.Field_306 && !((Boolean)class_3436.Method_3440(Field_25179)).booleanValue()) {
            this.Method_25187(class_283, new Class_4751(class_4751));
        }
    }

    private static String Method_25206(String string) {
        int n = 6308;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25178.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_25207() {
        return (8320 & -31978) != 0;
    }

    private static String Method_25208(String string) {
        int n = 17454;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25178.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_25209(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
    }

    protected Class_3855 Method_25210() {
        Class_3538[] arrclass_3538 = new Class_3538[21544 & 90];
        arrclass_3538[17152 & 84] = Field_25179;
        arrclass_3538[9797 & 4257] = Field_25186;
        arrclass_3538[18698 & 130] = Field_25181;
        arrclass_3538[91 & -28669] = Field_25182;
        arrclass_3538[-28380 & 11268] = Field_25180;
        arrclass_3538[533 & -26609] = Field_25184;
        arrclass_3538[8454 & 2070] = Field_25183;
        arrclass_3538[17447 & 4687] = Field_25185;
        return new Class_3855(this, arrclass_3538);
    }

    public void Method_25211(Class_561 class_561, Class_4751 class_4751) {
        Class_3436 class_3436 = class_561.Method_568(class_4751);
        boolean bl = (Boolean)class_3436.Method_3440(Field_25181);
        boolean bl2 = (Boolean)class_3436.Method_3440(Field_25186);
        if (!bl2) {
            this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.5454545f * 0.060661767f, 1.0f);
        } else if (!bl) {
            this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.1627907f * 3.0714285f, 1.0f);
        } else {
            this.\u0000strictfp(0.0f, 4.8f * 0.013020833f, 0.0f, 1.0f, 0.5375f * 0.29069766f, 1.0f);
        }
    }

    public static boolean Method_25212(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        Class_4751 class_47512 = class_4751.Method_4765(class_4595);
        Class_3436 class_34362 = class_561.Method_568(class_47512);
        Class_3238 class_3238 = class_34362.Method_3442();
        if (class_3238 == Class_9265.Field_9266) {
            Class_4595 class_45952 = class_4595.Method_4660();
            return (class_34362.Method_3440(Class_15049.Field_15053) == class_45952 ? 24601 & -32095 : 4228 & -23549) != 0;
        }
        if (class_3238 == Class_9265.Field_9282) {
            boolean bl;
            boolean bl2 = (Boolean)class_3436.Method_3440(Field_25186);
            return (bl2 == (bl = ((Boolean)class_34362.Method_3440(Field_25186)).booleanValue()) ? 261 & 16913 : 2081 & 4568) != 0;
        }
        return (4098 & 1376) != 0;
    }

    public void Method_25213(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        class_3436 = class_3436.Method_3437(Field_25186, Boolean.valueOf((!Class_283.Method_538(class_283, class_4751.Method_4782()) ? 18563 & 1345 : 132 & 16449) != 0));
        class_283.Method_462(class_4751, class_3436, 331 & 28675);
        this.Method_25189(class_283, class_4751, class_3436);
    }

    public Class_3436 Method_25214(int n) {
        return this.\u0000strictfp().Method_3685(Field_25179, Boolean.valueOf(((n & (-15839 & 5377)) > 0 ? -27101 & 24973 : 72 & -31854) != 0)).Method_3437(Field_25186, Boolean.valueOf(((n & (19010 & 1030)) > 0 ? 9737 & 2165 : 24852 & 4803) != 0)).Method_3437(Field_25181, Boolean.valueOf(((n & (46 & -700)) > 0 ? 2873 & -16381 : 8192 & 20625) != 0)).Method_3437(Field_25182, Boolean.valueOf(((n & (16397 & -32120)) > 0 ? 1653 & 4361 : 2689 & -16316) != 0));
    }

    public boolean Method_25215() {
        return (2048 & -31905) != 0;
    }

    public void Method_25216(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626) {
        if (!class_283.Field_306 && class_626.Method_792() != null && class_626.Method_792().Method_23844() == Class_10527.Field_10606) {
            class_283.Method_462(class_4751, class_3436.Method_3437(Field_25182, Boolean.valueOf((2057 & 16897) != 0)), 17668 & 6164);
        }
    }
}

