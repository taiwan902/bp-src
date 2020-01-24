/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public abstract class Class_38701
extends Class_5717 {
    public static final Class_4173 Field_38702 = Class_4173.Method_4177(Class_38701.Method_38712("\u4b42\u4b54\u4b50\u4b54\u4b54\u4b54\u4b42\u4b42"));
    public static final Class_3957 Field_38703 = Class_3957.Method_3963(Class_38701.Method_38713("\u4448\u444c\u444e\u4446\u4448\u4444\u444e"), Class_34956.class);

    public Class_3436 Method_38704(int n) {
        Class_3436 class_3436 = this.\u0000strictfp().Method_3685(Field_38703, (Comparable)((Object)Class_34956.Method_34968(n & (13575 & 2583))));
        class_3436 = this.\u0000, !() ? class_3436.Method_3437(Field_38702, Boolean.valueOf(((n & (8216 & -30552)) != 0 ? 10243 & 16761 : 18488 & 384) != 0)) : class_3436.Method_3437(\u0000strictfp, (Comparable)((Object)((n & (45 & 19738)) == 0 ? Class_5736.Field_5738 : Class_5736.Field_5737)));
        return class_3436;
    }

    public String Method_38705(int n) {
        return super.\u0000strictfp() + "." + Class_34956.Method_34968(n).Method_34963();
    }

    protected Class_3855 Method_38706() {
        Class_3855 class_3855;
        if (this.\u0000, !()) {
            Class_3538[] arrclass_3538;
            class_3855 = new Class_3855(this, arrclass_3538);
            arrclass_3538 = new Class_3538[106 & 17410];
            arrclass_3538[18448 & 1288] = Field_38702;
            arrclass_3538[577 & 4099] = Field_38703;
        } else {
            Class_3538[] arrclass_3538;
            class_3855 = new Class_3855(this, arrclass_3538);
            arrclass_3538 = new Class_3538[8887 & -28406];
            arrclass_3538[1026 & -32344] = \u0000strictfp;
            arrclass_3538[43 & 2049] = Field_38703;
        }
        return class_3855;
    }

    private void Method_38707() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_38708() {
        return Class_7594.Method_7602(this.\u0000strictfp() + ".red_sandstone.name");
    }

    public Class_3538 Method_38709() {
        return Field_38703;
    }

    public Class_1956 Method_38710(Class_3436 class_3436, Random random, int n) {
        return Class_1956.Method_1981(Class_9265.Field_9463);
    }

    public Class_1956 Method_38711(Class_283 class_283, Class_4751 class_4751) {
        return Class_1956.Method_1981(Class_9265.Field_9463);
    }

    private static String Method_38712(String string) {
        int n = 4707;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38701.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38713(String string) {
        int n = 18944;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38701.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_3779 Method_38714(Class_3436 class_3436) {
        return ((Class_34956)((Object)class_3436.Method_3440(Field_38703))).Method_34966();
    }

    public int Method_38715(Class_3436 class_3436) {
        return ((Class_34956)((Object)class_3436.Method_3440(Field_38703))).Method_34972();
    }

    public int Method_38716(Class_3436 class_3436) {
        int n = 5184 & -32252;
        n |= ((Class_34956)((Object)class_3436.Method_3440(Field_38703))).Method_34972();
        if (this.\u0000, !()) {
            if (((Boolean)class_3436.Method_3440(Field_38702)).booleanValue()) {
                n |= 18280 & 2184;
            }
        } else if (class_3436.Method_3440(\u0000strictfp) == Class_5736.Field_5737) {
            n |= 18904 & -32758;
        }
        return n;
    }

    public void Method_38717(Class_1956 class_1956, Class_3987 class_3987, List list) {
        if (class_1956 != Class_1956.Method_1981(Class_9265.Field_9362)) {
            Class_34956[] arrclass_34956 = Class_34956.Method_34970();
            int n = arrclass_34956.length;
            for (int i = -24243 & 5154; i < n; ++i) {
                Class_34956 class_34956 = arrclass_34956[i];
                list.add(new Class_23823(class_1956, -8179 & 1553, class_34956.Method_34972()));
            }
        }
    }

    public Object Method_38718(Class_23823 class_23823) {
        return Class_34956.Method_34968(class_23823.Method_23843() & (287 & 3207));
    }

    public Class_38701() {
        super(Class_3713.Field_3721);
        Class_3436 class_3436 = this.\u0000strictfp.Method_3867();
        class_3436 = this.\u0000, !() ? class_3436.Method_3437(Field_38702, Boolean.valueOf((-22368 & 16452) != 0)) : class_3436.Method_3437(\u0000strictfp, (Comparable)((Object)Class_5736.Field_5738));
        this.\u0000strictfp(class_3436.Method_3437(Field_38703, (Comparable)((Object)Class_34956.Field_34960)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }
}

