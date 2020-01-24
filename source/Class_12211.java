/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_12211
extends Class_3529 {
    public static final Class_4173 Field_12212 = Class_4173.Method_4177(Class_12211.Method_12217("\u2160\u2160\u2162\u2142\u2164\u2164\u2166\u2166\u2160\u2160"));

    public Class_3436 Method_12213(int n) {
        return this.\u0000strictfp().Method_3685(Field_12212, Boolean.valueOf((n > 0 ? 16397 & 4099 : 2819 & 8) != 0));
    }

    public Class_4879 Method_12214(Class_283 class_283, int n) {
        return new Class_44146();
    }

    protected Class_3855 Method_12215() {
        Class_3538[] arrclass_3538 = new Class_3538[-24303 & 22537];
        arrclass_3538[6656 & -32563] = Field_12212;
        return new Class_3855(this, arrclass_3538);
    }

    public boolean Method_12216() {
        return (75 & 24609) != 0;
    }

    private static String Method_12217(String string) {
        int n = 8097;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12211.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_12218(Class_3436 class_3436) {
        return (Boolean)class_3436.Method_3440(Field_12212) != false ? 2331 & 20513 : 4132 & 19472;
    }

    public void Method_12219(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_23823 class_23823) {
        Class_4879 class_4879;
        if (!class_283.Field_306 && (class_4879 = class_283.Method_429(class_4751)) instanceof Class_44146) {
            ((Class_44146)class_4879).Method_44151(new Class_23823(class_23823.Method_23844(), 1371 & 16929, class_23823.Method_23843()));
            class_283.Method_462(class_4751, class_3436.Method_3437(Field_12212, Boolean.valueOf((17029 & 3091) != 0)), -18410 & 386);
        }
    }

    public void Method_12220(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_12225(class_283, class_4751, class_3436);
        super.Method_3531(class_283, class_4751, class_3436);
    }

    public int Method_12221(Class_283 class_283, Class_4751 class_4751) {
        Class_23823 class_23823;
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_4879 instanceof Class_44146 && (class_23823 = ((Class_44146)class_4879).Method_44149()) != null) {
            return Class_1956.Method_1986(class_23823.Method_23844()) + (169 & 21267) - Class_1956.Method_1986(Class_10527.Field_10650);
        }
        return 16387 & 14576;
    }

    public int Method_12222() {
        return 16803 & 7191;
    }

    private void Method_12223() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_12224(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, int n) {
        if (!class_283.Field_306) {
            super.\u0000strictfp(class_283, class_4751, class_3436, f, -32384 & 1130);
        }
    }

    private void Method_12225(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_44146 class_44146;
        Class_23823 class_23823;
        Class_4879 class_4879;
        if (!class_283.Field_306 && (class_4879 = class_283.Method_429(class_4751)) instanceof Class_44146 && (class_23823 = (class_44146 = (Class_44146)class_4879).Method_44149()) != null) {
            class_283.Method_502(31727 & 1021, class_4751, 8253 & 18688);
            class_283.Method_442(class_4751, null);
            class_44146.Method_44151(null);
            float f = 1.0791667f * 0.6486486f;
            double d = (double)(class_283.Field_307.nextFloat() * f) + (double)(1.0f - f) * (0.35625 * 1.4035087719298245);
            double d2 = (double)(class_283.Field_307.nextFloat() * f) + (double)(1.0f - f) * (0.022727272727272728 * 8.8) + 1.2782608695652173 * 0.46938775510204084;
            double d3 = (double)(class_283.Field_307.nextFloat() * f) + (double)(1.0f - f) * (0.4788732394366197 * 1.0441176470588236);
            Class_23823 class_238232 = class_23823.Method_23850();
            Class_3443 class_3443 = new Class_3443(class_283, (double)class_4751.\u0000= final() + d, (double)class_4751.\u0000, `() + d2, (double)class_4751.\u0000strictfp() + d3, class_238232);
            class_3443.Method_3455();
            class_283.Method_350(class_3443);
        }
    }

    public boolean Method_12226(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        if (((Boolean)class_3436.Method_3440(Field_12212)).booleanValue()) {
            this.Method_12225(class_283, class_4751, class_3436);
            class_3436 = class_3436.Method_3437(Field_12212, Boolean.valueOf((-2280 & 195) != 0));
            class_283.Method_462(class_4751, class_3436, 6939 & 25766);
            return (4489 & 9315) != 0;
        }
        return (132 & -17557) != 0;
    }

    protected Class_12211() {
        super(Class_3713.Field_3723, Class_3779.Field_3788);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_12212, Boolean.valueOf((8196 & 7696) != 0)));
        this.\u0000strictfp(Class_3987.Field_3995);
    }
}

