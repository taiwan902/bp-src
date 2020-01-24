/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_8186
extends Class_3529 {
    public static final Class_4173[] Field_8187;

    public Class_17531 Method_8188() {
        return Class_17531.Field_17538;
    }

    static {
        Class_4173[] arrclass_4173 = new Class_4173[4259 & -21217];
        arrclass_4173[21280 & -29679] = Class_4173.Method_4177(Class_8186.Method_8203("\u2000\u2000\u2002\u2026\u2006\u2002\u2000\u2000\u200c\u200c\u202e\u2008"));
        arrclass_4173[8395 & 24113] = Class_4173.Method_4177(Class_8186.Method_8208("\u04a0\u04a9\u04ba\u0493\u04a8\u04a1\u04ba\u04bb\u04a0\u04a9\u0492\u04bb"));
        arrclass_4173[4138 & -30698] = Class_4173.Method_4177(Class_8186.Method_8192("\u4220\u4220\u4230\u4214\u4222\u4226\u4236\u4236\u4224\u4224\u4214\u4270"));
        Field_8187 = arrclass_4173;
    }

    public void Method_8189() {
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.1611111f * 0.7758621f, 1.0f);
    }

    public Class_1956 Method_8190(Class_283 class_283, Class_4751 class_4751) {
        return Class_10527.Field_10580;
    }

    public Class_8186() {
        super(Class_3713.Field_3748);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_8187[16896 & 3133], Boolean.valueOf((8259 & -32256) != 0)).Method_3437(Field_8187[-30591 & 25857], Boolean.valueOf((7560 & 6) != 0)).Method_3437(Field_8187[-11926 & 2050], Boolean.valueOf((17440 & 12819) != 0)));
    }

    public void Method_8191(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_4879 instanceof Class_39639) {
            Class_24128.Method_24131(class_283, class_4751, (Class_39639)class_4879);
        }
        super.Method_3531(class_283, class_4751, class_3436);
    }

    private static String Method_8192(String string) {
        int n = 29291;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_8186.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_4879 Method_8193(Class_283 class_283, int n) {
        return new Class_39639();
    }

    public void Method_8194(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        double d = (float)class_4751.\u0000= final() + 0.032f * 12.5f + random.nextFloat() * (0.030303031f * 6.6f);
        double d2 = (float)class_4751.\u0000, `() + 1.7073171f * 0.41f + random.nextFloat() * (0.3f * 1.0f);
        double d3 = (float)class_4751.\u0000strictfp() + 0.4387755f * 0.91162795f + random.nextFloat() * (0.10882353f * 1.8378378f);
        class_283.Method_407(Class_40274.Field_40283, d, d2, d3, 0.0, 0.0, 0.0, new int[40 & 21508]);
    }

    public void Method_8195(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_10997 class_10997, List list, Class_1061 class_1061) {
        this.\u0000strictfp(0.10560345f * 4.142857f, 0.0f, 2.0f * 0.21875f, 1.0563381f * 0.53249997f, 0.031626508f * 27.666666f, 0.4090909f * 1.375f);
        super.\u0000strictfp(class_283, class_4751, class_3436, class_10997, list, class_1061);
        this.Method_8189();
        super.\u0000strictfp(class_283, class_4751, class_3436, class_10997, list, class_1061);
    }

    public int Method_8196() {
        return 20483 & 2351;
    }

    public boolean Method_8197(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        if (class_283.Field_306) {
            return (13441 & 581) != 0;
        }
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_4879 instanceof Class_39639) {
            class_626.Method_800((Class_39639)class_4879);
            class_626.Method_750(Class_19863.Field_19920);
        }
        return (22609 & 1025) != 0;
    }

    private void Method_8198() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_8199(Class_3436 class_3436) {
        int n = 17924 & 8424;
        for (int i = 4384 & 8204; i < (-30685 & 1667); ++i) {
            if (!((Boolean)class_3436.Method_3440(Field_8187[i])).booleanValue()) continue;
            n |= (-30651 & 9265) << i;
        }
        return n;
    }

    public boolean Method_8200() {
        return (24160 & 257) != 0;
    }

    public String Method_8201() {
        return Class_7594.Method_7602("item.brewingStand.name");
    }

    public boolean Method_8202() {
        return (16897 & 9219) != 0;
    }

    private static String Method_8203(String string) {
        int n = 32005;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_8186.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_1956 Method_8204(Class_3436 class_3436, Random random, int n) {
        return Class_10527.Field_10580;
    }

    protected Class_3855 Method_8205() {
        Class_3538[] arrclass_3538 = new Class_3538[8195 & 1091];
        arrclass_3538[10816 & 56] = Field_8187[-32768 & 20528];
        arrclass_3538[12435 & 17253] = Field_8187[-19933 & 18497];
        arrclass_3538[10579 & 4098] = Field_8187[9354 & 21318];
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_8206(Class_283 class_283, Class_4751 class_4751) {
        return Class_8295.Method_8323(class_283.Method_429(class_4751));
    }

    public void Method_8207(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_859 class_859, Class_23823 class_23823) {
        Class_4879 class_4879;
        if (class_23823.Method_23851() && (class_4879 = class_283.Method_429(class_4751)) instanceof Class_39639) {
            ((Class_39639)class_4879).Method_39655(class_23823.Method_23899());
        }
    }

    private static String Method_8208(String string) {
        int n = 1162;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_8186.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_3436 Method_8209(int n) {
        Class_3436 class_3436 = this.\u0000strictfp();
        for (int i = 128 & -24992; i < (131 & 4663); ++i) {
            class_3436 = class_3436.Method_3437(Field_8187[i], Boolean.valueOf(((n & (8217 & 903) << i) > 0 ? 6185 & 18375 : 32 & 26) != 0));
        }
        return class_3436;
    }

    public boolean Method_8210() {
        return (4228 & -28912) != 0;
    }
}

