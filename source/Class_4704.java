/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_4704
extends Class_4720 {
    public static final Class_3957 Field_4705 = Class_3957.Method_3962(Class_4704.Method_4714("\u0004\u0002\u0000\u0002\u0003\u0005\u0006"), Class_4231.class, new Class_4817());

    private void Method_4706() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_4707(Class_3436 class_3436) {
        int n = 706 & -31467;
        n |= ((Class_4231)((Object)class_3436.Method_3440(Field_4705))).Method_4247();
        if (!((Boolean)class_3436.Method_3440(\u0000, `)).booleanValue()) {
            n |= -24444 & 326;
        }
        if (((Boolean)class_3436.Method_3440(\u0000strictfp)).booleanValue()) {
            n |= 4168 & -31702;
        }
        return n;
    }

    public Class_4704() {
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_4705, (Comparable)((Object)Class_4231.Field_4238)).Method_3437(\u0000strictfp, Boolean.valueOf((-6951 & 295) != 0)).Method_3437(\u0000, `, Boolean.valueOf((10113 & 6149) != 0)));
    }

    public Class_4231 Method_4708(int n) {
        return Class_4231.Method_4259((n & (-31709 & 19)) % (12 & 2342));
    }

    public void Method_4709(Class_283 class_283, Class_626 class_626, Class_4751 class_4751, Class_3436 class_3436, Class_4879 class_4879) {
        if (!class_283.Field_306 && class_626.Method_792() != null && class_626.Method_792().Method_23844() == Class_10527.Field_10606) {
            class_626.Method_750(Class_19863.Field_19891[Class_3238.Method_3435(this)]);
            Class_4704.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(Class_1956.Method_1981(this), 4133 & 9217, ((Class_4231)((Object)class_3436.Method_3440(Field_4705))).Method_4247()));
        } else {
            super.\u0000strictfp(class_283, class_626, class_4751, class_3436, class_4879);
        }
    }

    protected Class_3855 Method_4710() {
        Class_3538[] arrclass_3538 = new Class_3538[22595 & 8339];
        arrclass_3538[8714 & -32731] = Field_4705;
        arrclass_3538[2055 & 4465] = \u0000strictfp;
        arrclass_3538[-15326 & 4178] = \u0000, `;
        return new Class_3855(this, arrclass_3538);
    }

    protected Class_23823 Method_4711(Class_3436 class_3436) {
        return new Class_23823(Class_1956.Method_1981(this), 4109 & 17459, ((Class_4231)((Object)class_3436.Method_3440(Field_4705))).Method_4247());
    }

    public void Method_4712(Class_1956 class_1956, Class_3987 class_3987, List list) {
        list.add(new Class_23823(class_1956, -12789 & 8193, Class_4231.Field_4238.Method_4247()));
        list.add(new Class_23823(class_1956, 677 & -11005, Class_4231.Field_4236.Method_4247()));
        list.add(new Class_23823(class_1956, 4613 & 9249, Class_4231.Field_4242.Method_4247()));
        list.add(new Class_23823(class_1956, 1477 & 25, Class_4231.Field_4235.Method_4247()));
    }

    public int Method_4713(Class_561 class_561, Class_4751 class_4751, int n) {
        Class_3436 class_3436 = class_561.Method_568(class_4751);
        if (class_3436.Method_3442() == this) {
            Class_4231 class_4231 = (Class_4231)((Object)class_3436.Method_3440(Field_4705));
            if (class_4231 == Class_4231.Field_4236) {
                return Class_12135.Method_12142();
            }
            if (class_4231 == Class_4231.Field_4242) {
                return Class_12135.Method_12138();
            }
        }
        return super.Method_4741(class_561, class_4751, n);
    }

    private static String Method_4714(String string) {
        int n = 22906;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4704.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_3436 Method_4715(int n) {
        return this.\u0000strictfp().Method_3685(Field_4705, (Comparable)((Object)this.Method_4708(n))).Method_3437(\u0000, `, Boolean.valueOf(((n & (8839 & 23612)) == 0 ? 2049 & 517 : 4311 & 2816) != 0)).Method_3437(\u0000strictfp, Boolean.valueOf(((n & (9 & 1288)) > 0 ? 163 & 26373 : 1129 & -12016) != 0));
    }

    protected int Method_4716(Class_3436 class_3436) {
        return class_3436.Method_3440(Field_4705) == Class_4231.Field_4235 ? 4200 & 11564 : super.Method_4728(class_3436);
    }

    public int Method_4717(Class_3436 class_3436) {
        return ((Class_4231)((Object)class_3436.Method_3440(Field_4705))).Method_4247();
    }

    protected void Method_4718(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, int n) {
        if (class_3436.Method_3440(Field_4705) == Class_4231.Field_4238 && class_283.Field_307.nextInt(n) == 0) {
            Class_4704.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(Class_10527.Field_10676, 10313 & -16079, 1042 & 2177));
        }
    }

    public int Method_4719(Class_3436 class_3436) {
        if (class_3436.Method_3442() != this) {
            return super.Method_4734(class_3436);
        }
        Class_4231 class_4231 = (Class_4231)((Object)class_3436.Method_3440(Field_4705));
        return class_4231 == Class_4231.Field_4236 ? Class_12135.Method_12142() : (class_4231 == Class_4231.Field_4242 ? Class_12135.Method_12138() : super.Method_4734(class_3436));
    }
}

