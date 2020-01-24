/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_14103
extends Class_3529 {
    public static final Class_4173 Field_14104 = Class_4173.Method_4177(Class_14103.Method_14107("\u5100\u5103\u5101\u5102\u5107\u5104\u5106\u5104\u5100"));

    public void Method_14105(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!class_283.Field_306) {
            boolean bl = class_283.Method_414(class_4751);
            boolean bl2 = (Boolean)class_3436.Method_3440(Field_14104);
            if (bl && !bl2) {
                class_283.Method_462(class_4751, class_3436.Method_3437(Field_14104, Boolean.valueOf((20609 & 9729) != 0)), -19402 & 2060);
                class_283.Method_441(class_4751, this, this.Method_14117(class_283));
            } else if (!bl && bl2) {
                class_283.Method_462(class_4751, class_3436.Method_3437(Field_14104, Boolean.valueOf((8642 & 2065) != 0)), -28523 & 26628);
            }
        }
    }

    public Class_3436 Method_14106(int n) {
        return this.\u0000strictfp().Method_3685(Field_14104, Boolean.valueOf(((n & (11 & -13759)) > 0 ? 17431 & 8353 : 4628 & -29695) != 0));
    }

    private static String Method_14107(String string) {
        int n = 22481;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14103.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_14108() {
        return (-32249 & 18713) != 0;
    }

    private void Method_14109() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_14110(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_859 class_859, Class_23823 class_23823) {
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_4879 instanceof Class_43621) {
            Class_35869 class_35869 = ((Class_43621)class_4879).Method_43628();
            if (class_23823.Method_23851()) {
                class_35869.Method_35882(class_23823.Method_23899());
            }
            if (!class_283.Field_306) {
                class_35869.Method_35890(class_283.Method_522().Method_7529("sendCommandFeedback"));
            }
        }
    }

    public int Method_14111() {
        return 2051 & 25615;
    }

    public int Method_14112(Class_3436 class_3436) {
        int n = 8336 & -30430;
        if (((Boolean)class_3436.Method_3440(Field_14104)).booleanValue()) {
            n |= 4177 & -24571;
        }
        return n;
    }

    public Class_14103() {
        super(Class_3713.Field_3748, Class_3779.Field_3813);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_14104, Boolean.valueOf((8 & 96) != 0)));
    }

    public void Method_14113(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_4879 instanceof Class_43621) {
            ((Class_43621)class_4879).Method_43628().Method_35891(class_283);
            class_283.Method_520(class_4751, this);
        }
    }

    public Class_4879 Method_14114(Class_283 class_283, int n) {
        return new Class_43621();
    }

    public int Method_14115(Random random) {
        return 1350 & -8160;
    }

    public int Method_14116(Class_283 class_283, Class_4751 class_4751) {
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        return class_4879 instanceof Class_43621 ? ((Class_43621)class_4879).Method_43628().Method_35886() : 1046 & -13856;
    }

    public int Method_14117(Class_283 class_283) {
        return 269 & 17921;
    }

    public boolean Method_14118(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        return class_4879 instanceof Class_43621 ? ((Class_43621)class_4879).Method_43628().Method_35877(class_626) : 10560 & -11261;
    }

    public Class_3436 Method_14119(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        return this.\u0000strictfp().Method_3685(Field_14104, Boolean.valueOf((580 & 6154) != 0));
    }

    protected Class_3855 Method_14120() {
        Class_3538[] arrclass_3538 = new Class_3538[1657 & 7];
        arrclass_3538[2625 & 8458] = Field_14104;
        return new Class_3855(this, arrclass_3538);
    }
}

