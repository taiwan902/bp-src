/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public abstract class Class_45804
extends Class_5717 {
    public static final Class_3957 Field_45805 = Class_3957.Method_3963(Class_45804.Method_45812("\u2108\u2108\u210a\u2102\u210d\u2105\u210e"), Class_4231.class);

    public String Method_45806(int n) {
        return super.\u0000strictfp() + "." + Class_4231.Method_4259(n).Method_4261();
    }

    public void Method_45807(Class_1956 class_1956, Class_3987 class_3987, List list) {
        if (class_1956 != Class_1956.Method_1981(Class_9265.Field_9301)) {
            Class_4231[] arrclass_4231 = Class_4231.Method_4250();
            int n = arrclass_4231.length;
            for (int i = -31160 & 12289; i < n; ++i) {
                Class_4231 class_4231 = arrclass_4231[i];
                list.add(new Class_23823(class_1956, 1081 & 20993, class_4231.Method_4247()));
            }
        }
    }

    private void Method_45808() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1956 Method_45809(Class_283 class_283, Class_4751 class_4751) {
        return Class_1956.Method_1981(Class_9265.Field_9460);
    }

    public Class_3538 Method_45810() {
        return Field_45805;
    }

    public Class_1956 Method_45811(Class_3436 class_3436, Random random, int n) {
        return Class_1956.Method_1981(Class_9265.Field_9460);
    }

    private static String Method_45812(String string) {
        int n = 12451;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_45804.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Object Method_45813(Class_23823 class_23823) {
        return Class_4231.Method_4259(class_23823.Method_23843() & (71 & -19449));
    }

    public int Method_45814(Class_3436 class_3436) {
        int n = 1634 & 401;
        n |= ((Class_4231)((Object)class_3436.Method_3440(Field_45805))).Method_4247();
        if (!this.\u0000, !() && class_3436.Method_3440(\u0000strictfp) == Class_5736.Field_5737) {
            n |= 14602 & 17561;
        }
        return n;
    }

    public Class_45804() {
        super(Class_3713.Field_3723);
        Class_3436 class_3436 = this.\u0000strictfp.Method_3867();
        if (!this.\u0000, !()) {
            class_3436 = class_3436.Method_3437(\u0000strictfp, (Comparable)((Object)Class_5736.Field_5738));
        }
        this.\u0000strictfp(class_3436.Method_3437(Field_45805, (Comparable)((Object)Class_4231.Field_4238)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    protected Class_3855 Method_45815() {
        Class_3855 class_3855;
        if (this.\u0000, !()) {
            Class_3538[] arrclass_3538;
            class_3855 = new Class_3855(this, arrclass_3538);
            arrclass_3538 = new Class_3538[16545 & 267];
            arrclass_3538[440 & 16448] = Field_45805;
        } else {
            Class_3538[] arrclass_3538;
            class_3855 = new Class_3855(this, arrclass_3538);
            arrclass_3538 = new Class_3538[-12122 & 579];
            arrclass_3538[512 & 24704] = \u0000strictfp;
            arrclass_3538[8227 & 5969] = Field_45805;
        }
        return class_3855;
    }

    public int Method_45816(Class_3436 class_3436) {
        return ((Class_4231)((Object)class_3436.Method_3440(Field_45805))).Method_4247();
    }

    public Class_3436 Method_45817(int n) {
        Class_3436 class_3436 = this.\u0000strictfp().Method_3685(Field_45805, (Comparable)((Object)Class_4231.Method_4259(n & (20903 & 1559))));
        if (!this.\u0000, !()) {
            class_3436 = class_3436.Method_3437(\u0000strictfp, (Comparable)((Object)((n & (16968 & -27458)) == 0 ? Class_5736.Field_5738 : Class_5736.Field_5737)));
        }
        return class_3436;
    }

    public Class_3779 Method_45818(Class_3436 class_3436) {
        return ((Class_4231)((Object)class_3436.Method_3440(Field_45805))).Method_4265();
    }
}

