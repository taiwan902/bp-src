/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_34441
extends Class_3238 {
    public static final Class_4173 Field_34442 = Class_4173.Method_4177(Class_34441.Method_34443("\u8200\u8208\u820a\u8202\u820e"));

    private static String Method_34443(String string) {
        int n = 20553;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34441.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_34444(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (!class_283.Field_306) {
            if (class_283.Method_451(class_4751.Method_4769()) < (8708 & 148) && class_283.Method_375(class_4751.Method_4769()).Method_3442().Method_3384() > (-3582 & 2451)) {
                class_283.Method_435(class_4751, Class_9265.Field_9272.Method_3293().Method_3685(Class_4180.Field_4181, (Comparable)((Object)Class_4194.Field_4202)));
            } else if (class_283.Method_451(class_4751.Method_4769()) >= (10253 & 1481)) {
                for (int i = 24640 & 3078; i < (2116 & 9349); ++i) {
                    Class_4751 class_47512 = class_4751.Method_4791(random.nextInt(7187 & 16515) - (4245 & -15263), random.nextInt(5 & -19897) - (16403 & 2507), random.nextInt(-30717 & 20487) - (18703 & 9857));
                    Class_3436 class_34362 = class_283.Method_375(class_47512);
                    Class_3238 class_3238 = class_283.Method_375(class_47512.Method_4769()).Method_3442();
                    if (class_34362.Method_3442() != Class_9265.Field_9272 || class_34362.Method_3440(Class_4180.Field_4181) != Class_4194.Field_4202 || class_283.Method_451(class_47512.Method_4769()) < (388 & 5132) || class_3238.Method_3384() > (-31670 & 4738)) continue;
                    class_283.Method_435(class_47512, this.\u0000strictfp());
                }
            }
        }
    }

    public int Method_34445(Class_3436 class_3436) {
        return -28288 & 16418;
    }

    public Class_1956 Method_34446(Class_3436 class_3436, Random random, int n) {
        return Class_9265.Field_9272.Method_3427(Class_9265.Field_9272.Method_3293().Method_3685(Class_4180.Field_4181, (Comparable)((Object)Class_4194.Field_4202)), random, n);
    }

    protected Class_3855 Method_34447() {
        Class_3538[] arrclass_3538 = new Class_3538[1089 & 18697];
        arrclass_3538[29200 & 8] = Field_34442;
        return new Class_3855(this, arrclass_3538);
    }

    public Class_3436 Method_34448(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        Class_3238 class_3238 = class_561.Method_568(class_4751.Method_4769()).Method_3442();
        return class_3436.Method_3437(Field_34442, Boolean.valueOf((class_3238 == Class_9265.Field_9413 || class_3238 == Class_9265.Field_9458 ? 69 & 22025 : -28416 & 1674) != 0));
    }

    private void Method_34449() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_34450(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        super.Method_3391(class_283, class_4751, class_3436, random);
        if (random.nextInt(19722 & 58) == 0) {
            class_283.Method_407(Class_40274.Field_40309, (float)class_4751.\u0000= final() + random.nextFloat(), (float)class_4751.\u0000, `() + 0.1375f * 8.0f, (float)class_4751.\u0000strictfp() + random.nextFloat(), 0.0, 0.0, 0.0, new int[1768 & 0]);
        }
    }

    protected Class_34441() {
        super(Class_3713.Field_3726, Class_3779.Field_3798);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_34442, Boolean.valueOf((285 & 6274) != 0)));
        this.\u0000strictfp((-24287 & 1539) != 0);
        this.\u0000strictfp(Class_3987.Field_3993);
    }
}

