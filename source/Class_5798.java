/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_5798
extends Class_3238 {
    public static final Class_4173 Field_5799 = Class_4173.Method_4177(Class_5798.Method_5809("\u02a0\u02a5\u02a5\u02a1\u02a0\u02a1\u02a0"));

    public void Method_5800(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (class_283.Method_414(class_4751)) {
            this.Method_5808(class_283, class_4751, class_3436.Method_3437(Field_5799, Boolean.valueOf((16657 & 14433) != 0)));
            class_283.Method_472(class_4751);
        }
    }

    private void Method_5801() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_5802(Class_25529 class_25529) {
        return (-32512 & 17490) != 0;
    }

    public void Method_5803(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_859 class_859) {
        if (!class_283.Field_306 && ((Boolean)class_3436.Method_3440(Field_5799)).booleanValue()) {
            Class_5813 class_5813 = new Class_5813(class_283, (float)class_4751.\u0000= final() + 0.92156863f * 0.5425532f, class_4751.\u0000, `(), (float)class_4751.\u0000strictfp() + 2.6551723f * 0.1883117f, class_859);
            class_283.Method_350(class_5813);
            class_283.Method_519(class_5813, "game.tnt.primed", 1.0f, 1.0f);
        }
    }

    public void Method_5804(Class_283 class_283, Class_4751 class_4751, Class_25529 class_25529) {
        if (!class_283.Field_306) {
            Class_5813 class_5813 = new Class_5813(class_283, (float)class_4751.\u0000= final() + 0.39436617f * 1.2678572f, class_4751.\u0000, `(), (float)class_4751.\u0000strictfp() + 0.41666666f * 1.2f, class_25529.Method_25547());
            class_5813.Field_5814 = class_283.Field_307.nextInt(class_5813.Field_5814 / (-31316 & 16405)) + class_5813.Field_5814 / (3720 & 16490);
            class_283.Method_350(class_5813);
        }
    }

    public Class_3436 Method_5805(int n) {
        return this.\u0000strictfp().Method_3685(Field_5799, Boolean.valueOf(((n & (10337 & 515)) > 0 ? -31103 & 2067 : 30720 & 1043) != 0));
    }

    public boolean Method_5806(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        Class_1956 class_1956;
        if (class_626.Method_792() != null && ((class_1956 = class_626.Method_792().Method_23844()) == Class_10527.Field_10615 || class_1956 == Class_10527.Field_10627)) {
            this.Method_5803(class_283, class_4751, class_3436.Method_3437(Field_5799, Boolean.valueOf((-30589 & 8745) != 0)), class_626);
            class_283.Method_472(class_4751);
            if (class_1956 == Class_10527.Field_10615) {
                class_626.Method_792().Method_23883(4353 & 18467, class_626);
            } else if (!class_626.Field_694.Method_18094()) {
                class_626.Method_792().Field_23826 -= 5633 & 2441;
            }
            return (1153 & 25377) != 0;
        }
        return super.Method_3289(class_283, class_4751, class_3436, class_626, class_4595, f, f2, f3);
    }

    public void Method_5807(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        super.Method_3407(class_283, class_4751, class_3436);
        if (class_283.Method_414(class_4751)) {
            this.Method_5808(class_283, class_4751, class_3436.Method_3437(Field_5799, Boolean.valueOf((323 & 5) != 0)));
            class_283.Method_472(class_4751);
        }
    }

    public void Method_5808(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_5803(class_283, class_4751, class_3436, null);
    }

    private static String Method_5809(String string) {
        int n = 9918;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5798.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_5810(Class_3436 class_3436) {
        return (Boolean)class_3436.Method_3440(Field_5799) != false ? 24071 & -32735 : 1036 & 18434;
    }

    public void Method_5811(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_1061 class_1061) {
        Class_41498 class_41498;
        if (!class_283.Field_306 && class_1061 instanceof Class_41498 && (class_41498 = (Class_41498)class_1061).\u0000, 2()) {
            this.Method_5803(class_283, new Class_4751(class_4751), class_283.Method_375(class_4751).Method_3437(Field_5799, Boolean.valueOf((18777 & 9765) != 0)), class_41498.Field_41501 instanceof Class_859 ? (Class_859)class_41498.Field_41501 : null);
            class_283.Method_472(class_4751);
        }
    }

    public Class_5798() {
        super(Class_3713.Field_3745);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_5799, Boolean.valueOf((12803 & 16400) != 0)));
        this.\u0000strictfp(Class_3987.Field_3998);
    }

    protected Class_3855 Method_5812() {
        Class_3538[] arrclass_3538 = new Class_3538[777 & -16329];
        arrclass_3538[-31584 & 6162] = Field_5799;
        return new Class_3855(this, arrclass_3538);
    }
}

