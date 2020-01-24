/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public abstract class Class_5700
extends Class_5717 {
    public static final Class_3957 Field_5701;
    public static final Class_4173 Field_5702;

    public Class_3538 Method_5703() {
        return Field_5701;
    }

    private static String Method_5704(String string) {
        int n = 2857;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5700.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_5702 = Class_4173.Method_4177(Class_5700.Method_5704("\u108b\u1089\u108b\u1083\u1080\u1089\u1089\u1089"));
        Field_5701 = Class_3957.Method_3963(Class_5700.Method_5708("\u4202\u4200\u4200\u4202\u4205\u4207\u4206"), Class_5750.class);
    }

    private void Method_5705() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_5706(Class_1956 class_1956, Class_3987 class_3987, List list) {
        if (class_1956 != Class_1956.Method_1981(Class_9265.Field_9392)) {
            Class_5750[] arrclass_5750 = Class_5750.Method_5791();
            int n = arrclass_5750.length;
            for (int i = 16454 & -18559; i < n; ++i) {
                Class_5750 class_5750 = arrclass_5750[i];
                if (class_5750 == Class_5750.Field_5763) continue;
                list.add(new Class_23823(class_1956, 16657 & 11299, class_5750.Method_5768()));
            }
        }
    }

    public Object Method_5707(Class_23823 class_23823) {
        return Class_5750.Method_5785(class_23823.Method_23843() & (1135 & 2327));
    }

    private static String Method_5708(String string) {
        int n = 9706;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5700.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_5709(Class_3436 class_3436) {
        int n = -16348 & 9728;
        n |= ((Class_5750)((Object)class_3436.Method_3440(Field_5701))).Method_5768();
        if (this.\u0000, !()) {
            if (((Boolean)class_3436.Method_3440(Field_5702)).booleanValue()) {
                n |= 651 & 20488;
            }
        } else if (class_3436.Method_3440(\u0000strictfp) == Class_5736.Field_5737) {
            n |= 23064 & 9288;
        }
        return n;
    }

    public Class_3779 Method_5710(Class_3436 class_3436) {
        return ((Class_5750)((Object)class_3436.Method_3440(Field_5701))).Method_5774();
    }

    public Class_1956 Method_5711(Class_3436 class_3436, Random random, int n) {
        return Class_1956.Method_1981(Class_9265.Field_9430);
    }

    protected Class_3855 Method_5712() {
        Class_3855 class_3855;
        if (this.\u0000, !()) {
            Class_3538[] arrclass_3538;
            class_3855 = new Class_3855(this, arrclass_3538);
            arrclass_3538 = new Class_3538[-30942 & 147];
            arrclass_3538[16393 & 9984] = Field_5702;
            arrclass_3538[27155 & -28635] = Field_5701;
        } else {
            Class_3538[] arrclass_3538;
            class_3855 = new Class_3855(this, arrclass_3538);
            arrclass_3538 = new Class_3538[-32126 & 22530];
            arrclass_3538[1056 & 16390] = \u0000strictfp;
            arrclass_3538[9217 & -32207] = Field_5701;
        }
        return class_3855;
    }

    public Class_3436 Method_5713(int n) {
        Class_3436 class_3436 = this.\u0000strictfp().Method_3685(Field_5701, (Comparable)((Object)Class_5750.Method_5785(n & (-26345 & 8207))));
        class_3436 = this.\u0000, !() ? class_3436.Method_3437(Field_5702, Boolean.valueOf(((n & (16425 & -31862)) != 0 ? -32747 & 15265 : -32760 & 3460) != 0)) : class_3436.Method_3437(\u0000strictfp, (Comparable)((Object)((n & (344 & 16392)) == 0 ? Class_5736.Field_5738 : Class_5736.Field_5737)));
        return class_3436;
    }

    public String Method_5714(int n) {
        return super.\u0000strictfp() + "." + Class_5750.Method_5785(n).Method_5781();
    }

    public Class_5700() {
        super(Class_3713.Field_3721);
        Class_3436 class_3436 = this.\u0000strictfp.Method_3867();
        class_3436 = this.\u0000, !() ? class_3436.Method_3437(Field_5702, Boolean.valueOf((4388 & -32766) != 0)) : class_3436.Method_3437(\u0000strictfp, (Comparable)((Object)Class_5736.Field_5738));
        this.\u0000strictfp(class_3436.Method_3437(Field_5701, (Comparable)((Object)Class_5750.Field_5755)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    public Class_1956 Method_5715(Class_283 class_283, Class_4751 class_4751) {
        return Class_1956.Method_1981(Class_9265.Field_9430);
    }

    public int Method_5716(Class_3436 class_3436) {
        return ((Class_5750)((Object)class_3436.Method_3440(Field_5701))).Method_5768();
    }
}

