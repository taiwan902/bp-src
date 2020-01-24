/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public class Class_35293
extends Class_3238 {
    public static final Class_5011 Field_35294 = Class_5011.Method_5012(Class_35293.Method_35304("\u3114\u3113\u3111\u311b\u3118\u3111"), Class_4662.Field_4663);

    public boolean Method_35295() {
        return (-32475 & 584) != 0;
    }

    public Class_10997 Method_35296(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_35305(class_283, class_4751);
        return super.Method_3285(class_283, class_4751, class_3436);
    }

    public Class_10997 Method_35297(Class_283 class_283, Class_4751 class_4751) {
        this.Method_35305(class_283, class_4751);
        return super.Method_3397(class_283, class_4751);
    }

    private void Method_35298() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3436 Method_35299(int n) {
        Class_4595 class_4595 = Class_4595.Method_4637(n);
        if (class_4595.Method_4640() == Class_4565.Field_4569) {
            class_4595 = Class_4595.Field_4598;
        }
        return this.\u0000strictfp().Method_3685(Field_35294, (Comparable)((Object)class_4595));
    }

    public void Method_35300(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_35294));
        if (!this.Method_35308(class_283, class_4751, class_4595)) {
            this.\u0000strictfp(class_283, class_4751, class_3436, -3840 & 4);
            class_283.Method_472(class_4751);
        }
        super.Method_3336(class_283, class_4751, class_3436, class_3238);
    }

    protected Class_3855 Method_35301() {
        Class_3538[] arrclass_3538 = new Class_3538[645 & 25651];
        arrclass_3538[21553 & -22522] = Field_35294;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_35302(Class_3436 class_3436) {
        return ((Class_4595)((Object)class_3436.Method_3440(Field_35294))).Method_4648();
    }

    protected Class_35293() {
        super(Class_3713.Field_3751);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_35294, (Comparable)((Object)Class_4595.Field_4598)));
        this.\u0000strictfp(Class_3987.Field_3995);
    }

    public boolean Method_35303() {
        return (8292 & -29952) != 0;
    }

    private static String Method_35304(String string) {
        int n = 19305;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35293.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_35305(Class_561 class_561, Class_4751 class_4751) {
        Class_3436 class_3436 = class_561.Method_568(class_4751);
        if (class_3436.Method_3442() == this) {
            float f = 0.14423077f * 0.8666667f;
            switch (Class_20738.Field_20739[((Class_4595)((Object)class_3436.Method_3440(Field_35294))).ordinal()]) {
                case 1: {
                    this.\u0000strictfp(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case 2: {
                    this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
                    break;
                }
                case 3: {
                    this.\u0000strictfp(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                default: {
                    this.\u0000strictfp(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
                }
            }
        }
    }

    public Class_17531 Method_35306() {
        return Class_17531.Field_17538;
    }

    public boolean Method_35307(Class_283 class_283, Class_4751 class_4751) {
        return (class_283.Method_375(class_4751.Method_4771()).Method_3442().Method_3400() ? 12325 & -32767 : (class_283.Method_375(class_4751.Method_4770()).Method_3442().Method_3400() ? 1 & 1593 : (class_283.Method_375(class_4751.Method_4778()).Method_3442().Method_3400() ? 16385 & -31603 : (int)(class_283.Method_375(class_4751.Method_4784()).Method_3442().Method_3400() ? 1 : 0)))) != 0;
    }

    protected boolean Method_35308(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        return class_283.Method_375(class_4751.Method_4765(class_4595.Method_4660())).Method_3442().Method_3400();
    }

    public Class_3436 Method_35309(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        if (class_4595.Method_4640().Method_4581() && this.Method_35308(class_283, class_4751, class_4595)) {
            return this.\u0000strictfp().Method_3685(Field_35294, (Comparable)((Object)class_4595));
        }
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            Class_4595 class_45952 = (Class_4595)e;
            if (!this.Method_35308(class_283, class_4751, class_45952)) continue;
            return this.\u0000strictfp().Method_3685(Field_35294, (Comparable)((Object)class_45952));
        }
        return this.\u0000strictfp();
    }
}

