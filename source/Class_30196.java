/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30196
extends Class_14299 {
    public static final Class_5011 Field_30197 = Class_5011.Method_5012(Class_30196.Method_30198("\u1508\u1509\u150a\u1503\u1504\u150d"), Class_4662.Field_4663);

    private static String Method_30198(String string) {
        int n = 26587;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30196.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_30199(Class_561 class_561, Class_4751 class_4751) {
        Class_4595 class_4595 = (Class_4595)((Object)class_561.Method_568(class_4751).Method_3440(Field_30197));
        float f = 0.04411765f * 6.375f;
        float f2 = 3.013393f * 0.25925925f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        float f5 = 0.06798246f * 1.8387097f;
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        switch (Class_6014.Field_6015[class_4595.ordinal()]) {
            case 1: {
                this.\u0000strictfp(f3, f, 1.0f - f5, f4, f2, 1.0f);
                break;
            }
            case 2: {
                this.\u0000strictfp(f3, f, 0.0f, f4, f2, f5);
                break;
            }
            case 3: {
                this.\u0000strictfp(1.0f - f5, f, f3, 1.0f, f2, f4);
                break;
            }
            case 4: {
                this.\u0000strictfp(0.0f, f, f3, f5, f2, f4);
            }
        }
    }

    protected Class_3855 Method_30200() {
        Class_3538[] arrclass_3538 = new Class_3538[3617 & 401];
        arrclass_3538[7776 & 274] = Field_30197;
        return new Class_3855(this, arrclass_3538);
    }

    public Class_30196() {
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_30197, (Comparable)((Object)Class_4595.Field_4598)));
    }

    public void Method_30201(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_30197));
        if (!class_283.Method_375(class_4751.Method_4765(class_4595.Method_4660())).Method_3442().Method_3373().Method_3762()) {
            this.\u0000strictfp(class_283, class_4751, class_3436, -28623 & 2756);
            class_283.Method_472(class_4751);
        }
        super.\u0000strictfp(class_283, class_4751, class_3436, class_3238);
    }

    public int Method_30202(Class_3436 class_3436) {
        return ((Class_4595)((Object)class_3436.Method_3440(Field_30197))).Method_4648();
    }

    public Class_3436 Method_30203(int n) {
        Class_4595 class_4595 = Class_4595.Method_4637(n);
        if (class_4595.Method_4640() == Class_4565.Field_4569) {
            class_4595 = Class_4595.Field_4598;
        }
        return this.\u0000strictfp().Method_3685(Field_30197, (Comparable)((Object)class_4595));
    }

    private void Method_30204() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

