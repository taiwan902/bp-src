/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_30767
extends Class_4720 {
    public static final Class_3957 Field_30768 = Class_3957.Method_3962(Class_30767.Method_30779("\u4300\u4302\u4300\u430a\u4307\u430d\u4306"), Class_4231.class, new Class_26483());

    public int Method_30769(Class_3436 class_3436) {
        return ((Class_4231)((Object)class_3436.Method_3440(Field_30768))).Method_4247();
    }

    protected Class_23823 Method_30770(Class_3436 class_3436) {
        return new Class_23823(Class_1956.Method_1981(this), 3073 & 8865, ((Class_4231)((Object)class_3436.Method_3440(Field_30768))).Method_4247() - (8740 & 20564));
    }

    public Class_30767() {
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_30768, (Comparable)((Object)Class_4231.Field_4243)).Method_3437(\u0000strictfp, Boolean.valueOf((4609 & 17825) != 0)).Method_3437(\u0000, `, Boolean.valueOf((1 & 5021) != 0)));
    }

    public void Method_30771(Class_283 class_283, Class_626 class_626, Class_4751 class_4751, Class_3436 class_3436, Class_4879 class_4879) {
        if (!class_283.Field_306 && class_626.Method_792() != null && class_626.Method_792().Method_23844() == Class_10527.Field_10606) {
            class_626.Method_750(Class_19863.Field_19891[Class_3238.Method_3435(this)]);
            Class_30767.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(Class_1956.Method_1981(this), 12321 & 2113, ((Class_4231)((Object)class_3436.Method_3440(Field_30768))).Method_4247() - (532 & 8205)));
        } else {
            super.\u0000strictfp(class_283, class_626, class_4751, class_3436, class_4879);
        }
    }

    public int Method_30772(Class_3436 class_3436) {
        int n = 6 & 17457;
        n |= ((Class_4231)((Object)class_3436.Method_3440(Field_30768))).Method_4247() - (8510 & 16388);
        if (!((Boolean)class_3436.Method_3440(\u0000, `)).booleanValue()) {
            n |= 12556 & -31211;
        }
        if (((Boolean)class_3436.Method_3440(\u0000strictfp)).booleanValue()) {
            n |= -18424 & 16990;
        }
        return n;
    }

    protected void Method_30773(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, int n) {
        if (class_3436.Method_3440(Field_30768) == Class_4231.Field_4233 && class_283.Field_307.nextInt(n) == 0) {
            Class_30767.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(Class_10527.Field_10676, -24571 & 17537, 320 & 5674));
        }
    }

    public Class_3436 Method_30774(int n) {
        return this.\u0000strictfp().Method_3685(Field_30768, (Comparable)((Object)this.Method_30776(n))).Method_3437(\u0000, `, Boolean.valueOf(((n & (2484 & 7)) == 0 ? 16645 & 5667 : -27488 & 8267) != 0)).Method_3437(\u0000strictfp, Boolean.valueOf(((n & (9738 & 9)) > 0 ? 3347 & -7539 : 2082 & 216) != 0));
    }

    public int Method_30775(Class_283 class_283, Class_4751 class_4751) {
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        return class_3436.Method_3442().Method_3434(class_3436) & (11687 & 579);
    }

    public Class_4231 Method_30776(int n) {
        return Class_4231.Method_4259((n & (17227 & -25577)) + (-32364 & 1124));
    }

    public void Method_30777(Class_1956 class_1956, Class_3987 class_3987, List list) {
        list.add(new Class_23823(class_1956, 515 & 8265, 0 & 270));
        list.add(new Class_23823(class_1956, 9 & 14481, 9 & -3241));
    }

    private void Method_30778() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_30779(String string) {
        int n = 30180;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30767.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_3855 Method_30780() {
        Class_3538[] arrclass_3538 = new Class_3538[2251 & 20771];
        arrclass_3538[7936 & 8258] = Field_30768;
        arrclass_3538[649 & 5137] = \u0000strictfp;
        arrclass_3538[3586 & -32669] = \u0000, `;
        return new Class_3855(this, arrclass_3538);
    }
}

