/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_20919
extends Class_5133 {
    public static final Class_4173 Field_20920 = Class_4173.Method_4177(Class_20919.Method_20937("\u4409\u4402\u4403\u4408"));
    public static final Class_4173 Field_20921 = Class_4173.Method_4177(Class_20919.Method_20932("\u0c48\u0c51\u0c4b\u0c5b\u0c4c\u0c5d\u0c5e"));
    public static final Class_4173 Field_20922 = Class_4173.Method_4177(Class_20919.Method_20928("\u6534\u6532\u6502\u6522\u6530\u6534\u6534"));

    public boolean Method_20923(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        if (((Boolean)class_3436.Method_3440(Field_20920)).booleanValue()) {
            class_3436 = class_3436.Method_3437(Field_20920, Boolean.valueOf((8738 & -31719) != 0));
            class_283.Method_462(class_4751, class_3436, -31578 & 522);
        } else {
            Class_4595 class_45952 = Class_4595.Method_4618(class_626.\u0000= ?);
            if (class_3436.Method_3440(\u0000strictfp) == class_45952.Method_4660()) {
                class_3436 = class_3436.Method_3437(\u0000strictfp, (Comparable)((Object)class_45952));
            }
            class_3436 = class_3436.Method_3437(Field_20920, Boolean.valueOf((-13935 & 9249) != 0));
            class_283.Method_462(class_4751, class_3436, 8658 & 4098);
        }
        class_283.Method_358(class_626, (Boolean)class_3436.Method_3440(Field_20920) != false ? -23573 & 1007 : 3071 & 13294, class_4751, 19460 & -19712);
        return (8769 & 6529) != 0;
    }

    public Class_3436 Method_20924(int n) {
        return this.\u0000strictfp().Method_3685(\u0000strictfp, (Comparable)((Object)Class_4595.Method_4628(n))).Method_3437(Field_20920, Boolean.valueOf(((n & (2054 & 4621)) != 0 ? 17481 & 53 : 2048 & 276) != 0)).Method_3437(Field_20921, Boolean.valueOf(((n & (2088 & 223)) != 0 ? -30715 & 20651 : 12672 & 44) != 0));
    }

    public boolean Method_20925() {
        return (2049 & 20812) != 0;
    }

    public Class_3436 Method_20926(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        return this.\u0000strictfp().Method_3685(\u0000strictfp, (Comparable)((Object)class_859.\u0000, `())).Method_3437(Field_20920, Boolean.valueOf((3136 & -7678) != 0)).Method_3437(Field_20921, Boolean.valueOf((1536 & 14410) != 0)).Method_3437(Field_20922, Boolean.valueOf((-13551 & 12390) != 0));
    }

    public Class_10997 Method_20927(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (((Boolean)class_3436.Method_3440(Field_20920)).booleanValue()) {
            return null;
        }
        Class_4565 class_4565 = ((Class_4595)((Object)class_3436.Method_3440(\u0000strictfp))).Method_4640();
        return class_4565 == Class_4565.Field_4570 ? new Class_10997(class_4751.\u0000= final(), class_4751.\u0000, `(), (float)class_4751.\u0000strictfp() + 0.4151786f * 0.9032258f, class_4751.\u0000= final() + (2115 & -32759), (float)class_4751.\u0000, `() + 0.3611111f * 4.1538463f, (float)class_4751.\u0000strictfp() + 0.1875f * 3.3333333f) : new Class_10997((float)class_4751.\u0000= final() + 1.9555556f * 0.19176136f, class_4751.\u0000, `(), class_4751.\u0000strictfp(), (float)class_4751.\u0000= final() + 0.5141129f * 1.2156863f, (float)class_4751.\u0000, `() + 0.6666667f * 2.25f, class_4751.\u0000strictfp() + (-32621 & 9513));
    }

    private static String Method_20928(String string) {
        int n = 28159;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20919.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_20929(Class_561 class_561, Class_4751 class_4751) {
        return (Boolean)class_561.Method_568(class_4751).Method_3440(Field_20920);
    }

    private void Method_20930() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_20931(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        boolean bl;
        if (!class_283.Field_306 && ((bl = class_283.Method_414(class_4751)) || class_3238.Method_3322())) {
            if (bl && !((Boolean)class_3436.Method_3440(Field_20920)).booleanValue() && !((Boolean)class_3436.Method_3440(Field_20921)).booleanValue()) {
                class_283.Method_462(class_4751, class_3436.Method_3437(Field_20920, Boolean.valueOf((1 & 16801) != 0)).Method_3437(Field_20921, Boolean.valueOf((-32463 & 9221) != 0)), 4102 & 17715);
                class_283.Method_358(null, 6123 & -23553, class_4751, 2218 & 16400);
            } else if (!bl && ((Boolean)class_3436.Method_3440(Field_20920)).booleanValue() && ((Boolean)class_3436.Method_3440(Field_20921)).booleanValue()) {
                class_283.Method_462(class_4751, class_3436.Method_3437(Field_20920, Boolean.valueOf((-27220 & 592) != 0)).Method_3437(Field_20921, Boolean.valueOf((-11996 & 9232) != 0)), 2818 & 42);
                class_283.Method_358(null, 5102 & 1007, class_4751, 1672 & 4100);
            } else if (bl != (Boolean)class_3436.Method_3440(Field_20921)) {
                class_283.Method_462(class_4751, class_3436.Method_3437(Field_20921, Boolean.valueOf(bl)), -16382 & 4387);
            }
        }
    }

    private static String Method_20932(String string) {
        int n = 3318;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20919.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_3855 Method_20933() {
        Class_3538[] arrclass_3538 = new Class_3538[13316 & 388];
        arrclass_3538[7749 & 8576] = \u0000strictfp;
        arrclass_3538[2561 & -20335] = Field_20920;
        arrclass_3538[4107 & -15934] = Field_20921;
        arrclass_3538[259 & 4259] = Field_20922;
        return new Class_3855(this, arrclass_3538);
    }

    public boolean Method_20934(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        return (19491 & -20407) != 0;
    }

    public int Method_20935(Class_3436 class_3436) {
        int n = 145 & 24160;
        n |= ((Class_4595)((Object)class_3436.Method_3440(\u0000strictfp))).Method_4619();
        if (((Boolean)class_3436.Method_3440(Field_20921)).booleanValue()) {
            n |= 5273 & -15864;
        }
        if (((Boolean)class_3436.Method_3440(Field_20920)).booleanValue()) {
            n |= -32730 & 16452;
        }
        return n;
    }

    public boolean Method_20936(Class_283 class_283, Class_4751 class_4751) {
        return (class_283.Method_375(class_4751.Method_4782()).Method_3442().Method_3373().Method_3762() ? (int)(super.\u0000, `(class_283, class_4751) ? 1 : 0) : 16384 & -31679) != 0;
    }

    private static String Method_20937(String string) {
        int n = 11157;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20919.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_20919(Class_4231 class_4231) {
        super(Class_3713.Field_3723, class_4231.Method_4265());
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_20920, Boolean.valueOf((2352 & -11776) != 0)).Method_3437(Field_20921, Boolean.valueOf((-28486 & 1793) != 0)).Method_3437(Field_20922, Boolean.valueOf((9408 & 2066) != 0)));
        this.\u0000strictfp(Class_3987.Field_3998);
    }

    public void Method_20938(Class_561 class_561, Class_4751 class_4751) {
        Class_4565 class_4565 = ((Class_4595)((Object)class_561.Method_568(class_4751).Method_3440(\u0000strictfp))).Method_4640();
        if (class_4565 == Class_4565.Field_4570) {
            this.\u0000strictfp(0.0f, 0.0f, 0.07244318f * 5.1764708f, 1.0f, 1.0f, 12.03125f * 0.051948052f);
        } else {
            this.\u0000strictfp(8.25f * 0.045454547f, 0.0f, 0.0f, 0.18181819f * 3.4375f, 1.0f, 1.0f);
        }
    }

    public boolean Method_20939() {
        return (26757 & 1026) != 0;
    }

    public Class_3436 Method_20940(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        Class_4565 class_4565 = ((Class_4595)((Object)class_3436.Method_3440(\u0000strictfp))).Method_4640();
        if (class_4565 == Class_4565.Field_4570 && (class_561.Method_568(class_4751.Method_4771()).Method_3442() == Class_9265.Field_9320 || class_561.Method_568(class_4751.Method_4770()).Method_3442() == Class_9265.Field_9320) || class_4565 == Class_4565.Field_4566 && (class_561.Method_568(class_4751.Method_4778()).Method_3442() == Class_9265.Field_9320 || class_561.Method_568(class_4751.Method_4784()).Method_3442() == Class_9265.Field_9320)) {
            class_3436 = class_3436.Method_3437(Field_20922, Boolean.valueOf((-29631 & 17289) != 0));
        }
        return class_3436;
    }
}

