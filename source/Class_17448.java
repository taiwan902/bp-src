/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Random;

public class Class_17448
extends Class_3238 {
    public static final Class_4394 Field_17449 = Class_4394.Method_4401(Class_17448.Method_17458("\u0400\u0404\u0404"), -8175 & 296, -32689 & 14911);

    private void Method_17450() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_17531 Method_17451() {
        return Class_17531.Field_17538;
    }

    public boolean Method_17452(Class_283 class_283, Class_4751 class_4751) {
        return this.Method_17454(class_283, class_4751);
    }

    public Class_10997 Method_17453(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return null;
    }

    public boolean Method_17454(Class_283 class_283, Class_4751 class_4751) {
        Class_3238 class_3238 = class_283.Method_375(class_4751.Method_4782()).Method_3442();
        if (class_3238 == this) {
            return (26905 & -27583) != 0;
        }
        if (class_3238 != Class_9265.Field_9319 && class_3238 != Class_9265.Field_9272 && class_3238 != Class_9265.Field_9394) {
            return (592 & 6144) != 0;
        }
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            Class_4595 class_4595 = (Class_4595)e;
            if (class_283.Method_375(class_4751.Method_4765(class_4595).Method_4782()).Method_3442().Method_3373() != Class_3713.Field_3734) continue;
            return (3 & -28635) != 0;
        }
        return (-19648 & 2048) != 0;
    }

    public int Method_17455(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_17449);
    }

    public boolean Method_17456() {
        return (16449 & -19934) != 0;
    }

    public boolean Method_17457() {
        return (5379 & -32120) != 0;
    }

    private static String Method_17458(String string) {
        int n = 4222;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17448.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_17448() {
        super(Class_3713.Field_3736);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_17449, Integer.valueOf(-25546 & 512)));
        float f = 1.2727273f * 0.29464287f;
        this.\u0000strictfp(9.0f * 0.055555556f - f, 0.0f, 17.5f * 0.028571429f - f, 0.40721652f * 1.227848f + f, 1.0f, 1.8484849f * 0.2704918f + f);
        this.\u0000strictfp((-32763 & 5489) != 0);
    }

    public Class_1956 Method_17459(Class_283 class_283, Class_4751 class_4751) {
        return Class_10527.Field_10634;
    }

    public void Method_17460(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        this.Method_17465(class_283, class_4751, class_3436);
    }

    public Class_1956 Method_17461(Class_3436 class_3436, Random random, int n) {
        return Class_10527.Field_10634;
    }

    public void Method_17462(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if ((class_283.Method_375(class_4751.Method_4782()).Method_3442() == Class_9265.Field_9346 || this.Method_17465(class_283, class_4751, class_3436)) && class_283.Method_507(class_4751.Method_4769())) {
            int n = 1 & -15275;
            while (class_283.Method_375(class_4751.Method_4768(n)).Method_3442() == this) {
                ++n;
            }
            if (n < (16427 & 5591)) {
                int n2 = (Integer)class_3436.Method_3440(Field_17449);
                if (n2 == (-32625 & 8207)) {
                    class_283.Method_435(class_4751.Method_4769(), this.\u0000strictfp());
                    class_283.Method_462(class_4751, class_3436.Method_3437(Field_17449, Integer.valueOf(96 & 13077)), 8710 & 5276);
                } else {
                    class_283.Method_462(class_4751, class_3436.Method_3437(Field_17449, Integer.valueOf(n2 + (-14333 & 8577))), 26132 & 4494);
                }
            }
        }
    }

    public Class_3436 Method_17463(int n) {
        return this.\u0000strictfp().Method_3685(Field_17449, Integer.valueOf(n));
    }

    public int Method_17464(Class_561 class_561, Class_4751 class_4751, int n) {
        return class_561.Method_567(class_4751).Method_17379(class_4751);
    }

    protected final boolean Method_17465(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (this.Method_17452(class_283, class_4751)) {
            return (2585 & -20221) != 0;
        }
        this.\u0000strictfp(class_283, class_4751, class_3436, 1122 & -26112);
        class_283.Method_472(class_4751);
        return (16769 & -32734) != 0;
    }

    protected Class_3855 Method_17466() {
        Class_3538[] arrclass_3538 = new Class_3538[16897 & -24571];
        arrclass_3538[8192 & 4612] = Field_17449;
        return new Class_3855(this, arrclass_3538);
    }
}

