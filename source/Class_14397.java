/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_14397
extends Class_3238 {
    public static final Class_4394 Field_14398 = Class_4394.Method_4401(Class_14397.Method_14411("\u4488\u448a\u448e\u4484\u4485\u4484\u4481\u4486"), 2 & 23432, -28625 & 135);

    public void Method_14399(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        super.Method_3336(class_283, class_4751, class_3436, class_3238);
        if (class_283.Method_375(class_4751.Method_4769()).Method_3442().Method_3373().Method_3762()) {
            class_283.Method_435(class_4751, Class_9265.Field_9272.Method_3293());
        }
    }

    public int Method_14400(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_14398);
    }

    public void Method_14401(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        int n = (Integer)class_3436.Method_3440(Field_14398);
        if (!this.Method_14413(class_283, class_4751) && !class_283.Method_496(class_4751.Method_4769())) {
            if (n > 0) {
                class_283.Method_462(class_4751, class_3436.Method_3437(Field_14398, Integer.valueOf(n - (2435 & -28583))), -30634 & 16387);
            } else if (!this.Method_14405(class_283, class_4751)) {
                class_283.Method_435(class_4751, Class_9265.Field_9272.Method_3293());
            }
        } else if (n < (-7865 & 4655)) {
            class_283.Method_462(class_4751, class_3436.Method_3437(Field_14398, Integer.valueOf(22663 & -31209)), -32766 & 2275);
        }
    }

    public Class_1956 Method_14402(Class_3436 class_3436, Random random, int n) {
        return Class_9265.Field_9272.Method_3427(Class_9265.Field_9272.Method_3293().Method_3685(Class_4180.Field_4181, (Comparable)((Object)Class_4194.Field_4202)), random, n);
    }

    public boolean Method_14403() {
        return (-13438 & 33) != 0;
    }

    public Class_3436 Method_14404(int n) {
        return this.\u0000strictfp().Method_3685(Field_14398, Integer.valueOf(n & (2087 & -15081)));
    }

    private boolean Method_14405(Class_283 class_283, Class_4751 class_4751) {
        Class_3238 class_3238 = class_283.Method_375(class_4751.Method_4769()).Method_3442();
        return (class_3238 instanceof Class_37502 || class_3238 instanceof Class_43717 ? 17409 & 4231 : -22528 & 17458) != 0;
    }

    public boolean Method_14406() {
        return (2116 & -7552) != 0;
    }

    private void Method_14407() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_14408(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        switch (Class_25587.Field_25588[class_4595.ordinal()]) {
            case 1: {
                return (-28183 & 11265) != 0;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                Class_3238 class_3238 = class_561.Method_568(class_4751).Method_3442();
                return (!class_3238.Method_3375() && class_3238 != Class_9265.Field_9356 ? 6535 & -32727 : -15071 & 4160) != 0;
            }
        }
        return super.Method_3356(class_561, class_4751, class_4595);
    }

    public Class_10997 Method_14409(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return new Class_10997(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp(), class_4751.\u0000= final() + (-32765 & 10361), class_4751.\u0000, `() + (35 & 8785), class_4751.\u0000strictfp() + (-31739 & 11041));
    }

    protected Class_3855 Method_14410() {
        Class_3538[] arrclass_3538 = new Class_3538[8333 & 23649];
        arrclass_3538[16544 & -28336] = Field_14398;
        return new Class_3855(this, arrclass_3538);
    }

    protected Class_14397() {
        super(Class_3713.Field_3753);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_14398, Integer.valueOf(2049 & -23736)));
        this.\u0000strictfp((-29919 & 16393) != 0);
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.83116883f * 1.1279297f, 1.0f);
        this.\u0000strictfp(511 & 4351);
    }

    private static String Method_14411(String string) {
        int n = 12144;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14397.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_1956 Method_14412(Class_283 class_283, Class_4751 class_4751) {
        return Class_1956.Method_1981(Class_9265.Field_9272);
    }

    private boolean Method_14413(Class_283 class_283, Class_4751 class_4751) {
        for (Class_4810 class_4810 : Class_4751.Method_4789(class_4751.Method_4791(-2 & -4, -23552 & 88, -4 & -4), class_4751.Method_4791(76 & 916, -27359 & 2689, -14138 & 8460))) {
            if (class_283.Method_375(class_4810).Method_3442().Method_3373() != Class_3713.Field_3734) continue;
            return (-32669 & 11793) != 0;
        }
        return (1026 & 4168) != 0;
    }

    public void Method_14414(Class_283 class_283, Class_4751 class_4751, Class_1061 class_1061, float f) {
        if (class_1061 instanceof Class_859) {
            if (!class_283.Field_306 && class_283.Field_307.nextFloat() < f - 1.1639345f * 0.42957744f) {
                if (!(class_1061 instanceof Class_626) && !class_283.Method_522().Method_7529("mobGriefing")) {
                    return;
                }
                class_283.Method_435(class_4751, Class_9265.Field_9272.Method_3293());
            }
            super.Method_3299(class_283, class_4751, class_1061, f);
        }
    }
}

