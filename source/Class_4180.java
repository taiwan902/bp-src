/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_4180
extends Class_3238 {
    public static final Class_3957 Field_4181 = Class_3957.Method_3963(Class_4180.Method_4189("\u8826\u8820\u8820\u8822\u8825\u8823\u8822"), Class_4194.class);
    public static final Class_4173 Field_4182 = Class_4173.Method_4177(Class_4180.Method_4185("\u03a0\u03a5\u03a6\u03a6\u03a0"));

    public Class_3436 Method_4183(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        if (class_3436.Method_3440(Field_4181) == Class_4194.Field_4199) {
            Class_3238 class_3238 = class_561.Method_568(class_4751.Method_4769()).Method_3442();
            class_3436 = class_3436.Method_3437(Field_4182, Boolean.valueOf((class_3238 == Class_9265.Field_9413 || class_3238 == Class_9265.Field_9458 ? -27591 & 24705 : 14736 & 590) != 0));
        }
        return class_3436;
    }

    private void Method_4184() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_4185(String string) {
        int n = 26590;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4180.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_4186(Class_283 class_283, Class_4751 class_4751) {
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        return class_3436.Method_3442() != this ? 11018 & -12064 : ((Class_4194)((Object)class_3436.Method_3440(Field_4181))).Method_4206();
    }

    public Class_3779 Method_4187(Class_3436 class_3436) {
        return ((Class_4194)((Object)class_3436.Method_3440(Field_4181))).Method_4216();
    }

    public void Method_4188(Class_1956 class_1956, Class_3987 class_3987, List list) {
        list.add(new Class_23823(this, -30685 & 21761, Class_4194.Field_4202.Method_4206()));
        list.add(new Class_23823(this, -4061 & 2633, Class_4194.Field_4203.Method_4206()));
        list.add(new Class_23823(this, 2369 & -28659, Class_4194.Field_4199.Method_4206()));
    }

    private static String Method_4189(String string) {
        int n = 15944;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4180.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_4180() {
        super(Class_3713.Field_3753);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_4181, (Comparable)((Object)Class_4194.Field_4202)).Method_3437(Field_4182, Boolean.valueOf((2306 & 8721) != 0)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    public int Method_4190(Class_3436 class_3436) {
        return ((Class_4194)((Object)class_3436.Method_3440(Field_4181))).Method_4206();
    }

    public int Method_4191(Class_3436 class_3436) {
        Class_4194 class_4194 = (Class_4194)((Object)class_3436.Method_3440(Field_4181));
        if (class_4194 == Class_4194.Field_4199) {
            class_4194 = Class_4194.Field_4202;
        }
        return class_4194.Method_4206();
    }

    protected Class_3855 Method_4192() {
        Class_3538[] arrclass_3538 = new Class_3538[2694 & 5170];
        arrclass_3538[8752 & 19464] = Field_4181;
        arrclass_3538[1153 & -28317] = Field_4182;
        return new Class_3855(this, arrclass_3538);
    }

    public Class_3436 Method_4193(int n) {
        return this.\u0000strictfp().Method_3685(Field_4181, (Comparable)((Object)Class_4194.Method_4211(n)));
    }
}

