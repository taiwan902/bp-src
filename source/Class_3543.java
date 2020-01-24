/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_3543
extends Class_3529 {
    public static final Class_4394 Field_3544 = Class_4394.Method_4401(Class_3543.Method_3556("\u0a40\u0a42\u0a42\u0a40\u0a46"), 5712 & -24287, 13327 & 16655);
    private final boolean Field_3545;

    public int Method_3546() {
        return 2071 & 8323;
    }

    public void Method_3547(Class_283 class_283, Class_4751 class_4751) {
        if (!class_283.Field_284.Method_18370()) {
            Class_3436 class_3436 = class_283.Method_375(class_4751);
            int n = class_283.Method_443(Class_6778.Field_6781, class_4751) - class_283.Method_330();
            float f = class_283.Method_485(1.0f);
            float f2 = f < 5.857143f * 0.5363695f ? 0.0f : 2.6703537f * 2.3529413f;
            f += (f2 - f) * (0.82191783f * 0.24333332f);
            n = Math.round((float)n * Class_13337.Method_13350(f));
            n = Class_13337.Method_13367(n, -22391 & 4614, 15 & 8335);
            if (this.Field_3545) {
                n = (18719 & 4111) - n;
            }
            if ((Integer)class_3436.Method_3440(Field_3544) != n) {
                class_283.Method_462(class_4751, class_3436.Method_3437(Field_3544, Integer.valueOf(n)), 17695 & -32221);
            }
        }
    }

    public boolean Method_3548() {
        return (9249 & 21072) != 0;
    }

    public Class_4879 Method_3549(Class_283 class_283, int n) {
        return new Class_46901();
    }

    public Class_3436 Method_3550(int n) {
        return this.\u0000strictfp().Method_3685(Field_3544, Integer.valueOf(n));
    }

    protected Class_3855 Method_3551() {
        Class_3538[] arrclass_3538 = new Class_3538[-12107 & 3329];
        arrclass_3538[2079 & 16384] = Field_3544;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_3552(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_3544);
    }

    public void Method_3553(Class_561 class_561, Class_4751 class_4751) {
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.5543478f * 0.6764706f, 1.0f);
    }

    public Class_3543(boolean bl) {
        super(Class_3713.Field_3723);
        this.Field_3545 = bl;
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_3544, Integer.valueOf(17442 & 12288)));
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.3525f * 1.0638298f, 1.0f);
        this.\u0000strictfp(Class_3987.Field_3998);
        this.\u0000= final(0.073684216f * 2.7142856f);
        this.\u0000strictfp(\u0000= `);
        this.\u0000, `("daylightDetector");
    }

    public boolean Method_3554() {
        return (2563 & 449) != 0;
    }

    public Class_1956 Method_3555(Class_3436 class_3436, Random random, int n) {
        return Class_1956.Method_1981(Class_9265.Field_9393);
    }

    private static String Method_3556(String string) {
        int n = 22421;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_3543.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_3557(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        return (Integer)class_3436.Method_3440(Field_3544);
    }

    public boolean Method_3558() {
        return (6 & 20584) != 0;
    }

    public void Method_3559(Class_1956 class_1956, Class_3987 class_3987, List list) {
        if (!this.Field_3545) {
            super.\u0000strictfp(class_1956, class_3987, list);
        }
    }

    private void Method_3560() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1956 Method_3561(Class_283 class_283, Class_4751 class_4751) {
        return Class_1956.Method_1981(Class_9265.Field_9393);
    }

    public boolean Method_3562(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        if (class_626.Method_782()) {
            if (class_283.Field_306) {
                return (787 & 9357) != 0;
            }
            if (this.Field_3545) {
                class_283.Method_462(class_4751, Class_9265.Field_9393.\u0000strictfp().Method_3685(Field_3544, class_3436.Method_3440(Field_3544)), 8484 & 18055);
                Class_9265.Field_9393.Method_3547(class_283, class_4751);
            } else {
                class_283.Method_462(class_4751, Class_9265.Field_9277.\u0000strictfp().Method_3685(Field_3544, class_3436.Method_3440(Field_3544)), 12838 & -32484);
                Class_9265.Field_9277.Method_3547(class_283, class_4751);
            }
            return (-32573 & 13069) != 0;
        }
        return super.\u0000strictfp(class_283, class_4751, class_3436, class_626, class_4595, f, f2, f3);
    }
}

