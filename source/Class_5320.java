/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_5320
extends Class_3598
implements Class_3594 {
    public static final Class_3957 Field_5321 = Class_3957.Method_3963(Class_5320.Method_5326("\u0140\u0140\u0140\u0140"), Class_5341.class);

    public boolean Method_5322(Class_283 class_283, Random random, Class_4751 class_4751, Class_3436 class_3436) {
        return (3697 & 9) != 0;
    }

    protected Class_5320() {
        super(Class_3713.Field_3725);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_5321, (Comparable)((Object)Class_5341.Field_5346)));
        float f = 0.20327869f * 1.967742f;
        this.\u0000strictfp(1.0298507f * 0.48550725f - f, 0.0f, 0.3888889f * 1.2857143f - f, 0.39102563f * 1.2786885f + f, 0.84571433f * 0.9459459f, 1.1363636f * 0.44f + f);
    }

    public boolean Method_5323(Class_283 class_283, Class_4751 class_4751) {
        return (18489 & 12419) != 0;
    }

    private void Method_5324() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_5325(Class_283 class_283, Class_4751 class_4751) {
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        return class_3436.Method_3442().Method_3434(class_3436);
    }

    private static String Method_5326(String string) {
        int n = 11219;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5320.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_3855 Method_5327() {
        Class_3538[] arrclass_3538 = new Class_3538[19009 & 257];
        arrclass_3538[0 & 13888] = Field_5321;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_5328() {
        return Class_23541.Method_23543(0.026785714285714284 * 18.666666666666668, 1.0);
    }

    public boolean Method_5329(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return this.\u0000, `(class_283.Method_375(class_4751.Method_4782()).Method_3442());
    }

    public boolean Method_5330(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, boolean bl) {
        return (class_3436.Method_3440(Field_5321) != Class_5341.Field_5346 ? 1037 & -15821 : 9782 & -28288) != 0;
    }

    public Class_16702 Method_5331() {
        return Class_16702.Field_16705;
    }

    public int Method_5332(int n, Random random) {
        return (1029 & 27433) + random.nextInt(n * (9222 & -29966) + (8289 & 7053));
    }

    public int Method_5333(Class_561 class_561, Class_4751 class_4751, int n) {
        return class_561.Method_567(class_4751).Method_17379(class_4751);
    }

    public Class_3436 Method_5334(int n) {
        return this.\u0000strictfp().Method_3685(Field_5321, (Comparable)((Object)Class_5341.Method_5351(n)));
    }

    public void Method_5335(Class_283 class_283, Random random, Class_4751 class_4751, Class_3436 class_3436) {
        Class_37289 class_37289 = Class_37289.Field_37300;
        if (class_3436.Method_3440(Field_5321) == Class_5341.Field_5348) {
            class_37289 = Class_37289.Field_37295;
        }
        if (Class_9265.Field_9399.Method_3587(class_283, class_4751)) {
            Class_9265.Field_9399.Method_3567(class_283, class_4751, class_37289, -23790 & 3206);
        }
    }

    public Class_1956 Method_5336(Class_3436 class_3436, Random random, int n) {
        return random.nextInt(124 & 22792) == 0 ? Class_10527.Field_10622 : null;
    }

    public void Method_5337(Class_283 class_283, Class_626 class_626, Class_4751 class_4751, Class_3436 class_3436, Class_4879 class_4879) {
        if (!class_283.Field_306 && class_626.Method_792() != null && class_626.Method_792().Method_23844() == Class_10527.Field_10606) {
            class_626.Method_750(Class_19863.Field_19891[Class_3238.Method_3435(this)]);
            Class_5320.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(Class_9265.Field_9278, -30683 & 1875, ((Class_5341)((Object)class_3436.Method_3440(Field_5321))).Method_5356()));
        } else {
            super.\u0000strictfp(class_283, class_626, class_4751, class_3436, class_4879);
        }
    }

    public int Method_5338(Class_3436 class_3436) {
        return ((Class_5341)((Object)class_3436.Method_3440(Field_5321))).Method_5356();
    }

    public void Method_5339(Class_1956 class_1956, Class_3987 class_3987, List list) {
        for (int i = 3329 & 517; i < (515 & 8199); ++i) {
            list.add(new Class_23823(class_1956, -7923 & 627, i));
        }
    }

    public int Method_5340(Class_3436 class_3436) {
        if (class_3436.Method_3442() != this) {
            return super.\u0000= final(class_3436);
        }
        Class_5341 class_5341 = (Class_5341)((Object)class_3436.Method_3440(Field_5321));
        return class_5341 == Class_5341.Field_5346 ? 16777215 & 50331647 : Class_23541.Method_23543(1.8846153846153846 * 0.2653061224489796, 1.0);
    }
}

