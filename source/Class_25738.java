/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_25738
extends Class_3238 {
    public static final Class_3957 Field_25739 = Class_3957.Method_3963(Class_25738.Method_25748("\u0430\u0420\u0430\u0428\u0420\u0428\u0430"), Class_30961.class);

    protected Class_3855 Method_25740() {
        Class_3538[] arrclass_3538 = new Class_3538[1 & -24373];
        arrclass_3538[-32768 & 4609] = Field_25739;
        return new Class_3855(this, arrclass_3538);
    }

    public Class_25738() {
        super(Class_3713.Field_3727);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_25739, (Comparable)((Object)Class_30961.Field_30965)));
        this.\u0000= final(0.0f);
        this.\u0000strictfp(Class_3987.Field_3995);
    }

    public int Method_25741(Class_283 class_283, Class_4751 class_4751) {
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        return class_3436.Method_3442().Method_3434(class_3436);
    }

    private void Method_25742() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_25743(Class_3436 class_3436) {
        return ((Class_30961)((Object)class_3436.Method_3440(Field_25739))).Method_30999();
    }

    public int Method_25744(Random random) {
        return 16731 & 6144;
    }

    public Class_3436 Method_25745(int n) {
        return this.\u0000strictfp().Method_3685(Field_25739, (Comparable)((Object)Class_30961.Method_30987(n)));
    }

    protected Class_23823 Method_25746(Class_3436 class_3436) {
        switch (Class_16847.Field_16848[((Class_30961)((Object)class_3436.Method_3440(Field_25739))).ordinal()]) {
            case 1: {
                return new Class_23823(Class_9265.Field_9373);
            }
            case 2: {
                return new Class_23823(Class_9265.Field_9300);
            }
            case 3: {
                return new Class_23823(Class_9265.Field_9300, -16357 & 8993, Class_39537.Field_39541.Method_39554());
            }
            case 4: {
                return new Class_23823(Class_9265.Field_9300, 2205 & 25121, Class_39537.Field_39545.Method_39554());
            }
            case 5: {
                return new Class_23823(Class_9265.Field_9300, -29525 & 4625, Class_39537.Field_39539.Method_39554());
            }
        }
        return new Class_23823(Class_9265.Field_9446);
    }

    public void Method_25747(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, int n) {
        if (!class_283.Field_306 && class_283.Method_522().Method_7529("doTileDrops")) {
            Class_45373 class_45373 = new Class_45373(class_283);
            class_45373.\u0000, `((double)class_4751.\u0000= final() + 0.11458333333333333 * 4.363636363636364, (double)class_4751.\u0000, `(), (double)class_4751.\u0000strictfp() + 0.6484375 * 0.7710843373493976, 0.0f, 0.0f);
            class_283.Method_350(class_45373);
            class_45373.\u0000= `();
        }
    }

    private static String Method_25748(String string) {
        int n = 28327;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25738.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_25749(Class_3436 class_3436) {
        Class_3238 class_3238 = class_3436.Method_3442();
        return (class_3436 == Class_9265.Field_9446.Method_3293().Method_3685(Class_3903.Field_3904, (Comparable)((Object)Class_3915.Field_3921)) || class_3238 == Class_9265.Field_9373 || class_3238 == Class_9265.Field_9300 ? 5125 & 16449 : 16404 & -20478) != 0;
    }

    public void Method_25750(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_30961[] arrclass_30961 = Class_30961.Method_30986();
        int n = arrclass_30961.length;
        for (int i = 2049 & 56; i < n; ++i) {
            Class_30961 class_30961 = arrclass_30961[i];
            list.add(new Class_23823(class_1956, 3175 & 16641, class_30961.Method_30999()));
        }
    }
}

