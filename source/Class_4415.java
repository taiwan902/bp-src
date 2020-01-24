/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.util.Vec3;

public abstract class Class_4415
extends Class_3238 {
    public static Class_3839 Field_4416;
    public static final Class_4394 Field_4417;
    private static Class_4452 Field_4418;

    public int Method_4419() {
        return 16647 & 2129;
    }

    public int Method_4420(Class_561 class_561, Class_4751 class_4751, int n) {
        return this.\u0000strictfp == Class_3713.Field_3734 ? Class_18104.Method_18111(class_561, class_4751) : 2030043135 & 83886079;
    }

    public boolean Method_4421(Class_3436 class_3436, boolean bl) {
        return (bl && (Integer)class_3436.Method_3440(Field_4417) == 0 ? 20737 & 10357 : -32254 & 28689) != 0;
    }

    private void Method_4422() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_4423(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_4417);
    }

    public void Method_4424(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_4427(class_283, class_4751, class_3436);
    }

    public static Class_4403 Method_4425(Class_3713 class_3713) {
        if (class_3713 == Class_3713.Field_3734) {
            return Class_9265.Field_9281;
        }
        if (class_3713 == Class_3713.Field_3750) {
            return Class_9265.Field_9403;
        }
        throw new IllegalArgumentException("Invalid material");
    }

    public static float Method_4426(int n) {
        if (n >= (4248 & 19466)) {
            n = -28147 & 9472;
        }
        return (float)(n + (19975 & -32575)) / (1.5652174f * 5.75f);
    }

    public boolean Method_4427(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (this.\u0000strictfp == Class_3713.Field_3750) {
            int n = 640 & -31391;
            Object object = Class_4595.Method_4630();
            int n2 = ((Class_4595[])object).length;
            for (int i = 20872 & -32765; i < n2; ++i) {
                Class_4595 class_4595 = object[i];
                if (class_4595 == Class_4595.Field_4615 || class_283.Method_375(class_4751.Method_4765(class_4595)).Method_3442().Method_3373() != Class_3713.Field_3734) continue;
                n = -32311 & 5;
                break;
            }
            if (n != 0) {
                object = (Integer)class_3436.Method_3440(Field_4417);
                if ((Integer)object == 0) {
                    class_283.Method_435(class_4751, Class_9265.Field_9445.Method_3293());
                    this.Method_4439(class_283, class_4751);
                    return (1289 & 12803) != 0;
                }
                if ((Integer)object <= (2084 & 9796)) {
                    class_283.Method_435(class_4751, Class_9265.Field_9373.Method_3293());
                    this.Method_4439(class_283, class_4751);
                    return (16787 & 4645) != 0;
                }
            }
        }
        return (16385 & 9370) != 0;
    }

    public void Method_4428(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        this.Method_4427(class_283, class_4751, class_3436);
    }

    public boolean Method_4429(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        return (class_561.Method_568(class_4751).Method_3442().Method_3373() == this.\u0000strictfp ? 24584 & 308 : (class_4595 == Class_4595.Field_4601 ? 769 & -32765 : (int)(super.Method_3356(class_561, class_4751, class_4595) ? 1 : 0))) != 0;
    }

    protected Class_3855 Method_4430() {
        Class_3538[] arrclass_3538 = new Class_3538[25097 & 2499];
        arrclass_3538[17420 & 160] = Field_4417;
        return new Class_3855(this, arrclass_3538);
    }

    public boolean Method_4431() {
        return (578 & 16540) != 0;
    }

    static {
        Field_4417 = Class_4394.Method_4401(Class_4415.Method_4445("\u2011\u2011\u2001\u2011\u2011"), 276 & 24776, -28017 & 2095);
        Field_4418 = new Class_4452();
        Field_4416 = new Class_3839(Class_2263.Method_2286(), Class_2205.Field_2227);
    }

    protected Vec3 Method_4432(Class_561 class_561, Class_4751 class_4751) {
        Class_4751 class_47512;
        Class_4595 class_4595;
        Object e;
        Vec3 vec3 = new Vec3(0.0, 0.0, 0.0);
        int n = this.Method_4446(class_561, class_4751);
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            int n2;
            e = iterator.next();
            class_4595 = (Class_4595)e;
            class_47512 = class_4751.Method_4767(class_4595, (Class_4810)Field_4418.get());
            int n3 = this.Method_4446(class_561, class_47512);
            if (n3 < 0) {
                if (class_561.Method_569(class_47512).Method_3688().Method_3373().Method_3761() || (n3 = this.Method_4446(class_561, class_47512.Method_4782())) < 0) continue;
                n2 = n3 - (n - (16984 & 13320));
                vec3.\u0000strictfp((class_47512.\u0000= final() - class_4751.\u0000= final()) * n2, (class_47512.\u0000, `() - class_4751.\u0000, `()) * n2, (class_47512.\u0000strictfp() - class_4751.\u0000strictfp()) * n2);
                continue;
            }
            if (n3 < 0) continue;
            n2 = n3 - n;
            vec3.\u0000strictfp((class_47512.\u0000= final() - class_4751.\u0000= final()) * n2, (class_47512.\u0000, `() - class_4751.\u0000, `()) * n2, (class_47512.\u0000strictfp() - class_4751.\u0000strictfp()) * n2);
        }
        if ((Integer)class_561.Method_569(class_4751).Method_3691(Field_4417) >= (-12008 & 8364)) {
            iterator = Class_4662.Field_4663.Method_4672();
            while (iterator.hasNext()) {
                e = iterator.next();
                class_4595 = (Class_4595)e;
                class_47512 = class_4751.Method_4765(class_4595);
                if (!this.Method_4451(class_561, class_47512, class_4595) && !this.Method_4451(class_561, class_47512.Method_4769(), class_4595)) continue;
                vec3 = vec3.\u0000strictfp();
                vec3.\u0000strictfp(0.0, Field_4416.Method_3850(), 0.0);
                break;
            }
        }
        return vec3.\u0000strictfp();
    }

    public Vec3 Method_4433(Class_283 class_283, Class_4751 class_4751, Class_1061 class_1061, Vec3 vec3) {
        return vec3.\u0000
        (this.Method_4432(class_283, class_4751));
    }

    public boolean Method_4434() {
        return (16490 & -32636) != 0;
    }

    public Class_10997 Method_4435(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return null;
    }

    public boolean Method_4436(Class_561 class_561, Class_4751 class_4751) {
        return (this.\u0000strictfp != Class_3713.Field_3750 ? 21 & 25347 : 578 & 4117) != 0;
    }

    public Class_1956 Method_4437(Class_3436 class_3436, Random random, int n) {
        return null;
    }

    public int Method_4438(Random random) {
        return 256 & 6677;
    }

    protected void Method_4439(Class_283 class_283, Class_4751 class_4751) {
        double d = class_4751.\u0000= final();
        double d2 = class_4751.\u0000, `();
        double d3 = class_4751.\u0000strictfp();
        class_283.Method_475(d + 0.2318840579710145 * 2.15625, d2 + 0.06060606060606061 * 8.25, d3 + 0.8953488372093024 * 0.5584415584415584, "random.fizz", 0.38636363f * 1.2941177f, 2.4375f * 1.0666666f + (class_283.Field_307.nextFloat() - class_283.Field_307.nextFloat()) * (0.42666668f * 1.875f));
        for (int i = 2176 & 816; i < (3257 & -28408); ++i) {
            class_283.Method_407(Class_40274.Field_40279, d + Math.random(), d2 + 0.25 * 4.8, d3 + Math.random(), 0.0, 0.0, 0.0, new int[416 & 9]);
        }
    }

    public int Method_4440(Class_561 class_561, Class_4751 class_4751) {
        int n = class_561.Method_564(class_4751, -30510 & 16397);
        int n2 = class_561.Method_564(class_4751.Method_4769(), 7312 & 44);
        int n3 = n & (1279 & 8959);
        int n4 = n2 & (16895 & 255);
        int n5 = n >> (3088 & 185) & (26879 & 511);
        int n6 = n2 >> (24 & 3635) & (255 & 27647);
        return (n3 > n4 ? n3 : n4) | (n5 > n6 ? n5 : n6) << (16986 & -24399);
    }

    public static double Method_4441(Class_561 class_561, Class_4751 class_4751, Class_3713 class_3713) {
        Vec3 vec3 = Class_4415.Method_4425(class_3713).\u0000strictfp(class_561, class_4751);
        return vec3.\u0000= final == 0.0 && vec3.\u0000, ` == 0.0 ? 1.0724637681159421 * -932.4324324324324 : Class_13337.Method_13391(vec3.\u0000, `, vec3.\u0000= final) - 1.3529411764705883 * 1.1610233719788365;
    }

    public boolean Method_4442(Class_561 class_561, Class_4751 class_4751) {
        for (int i = -1 & -1; i <= (8927 & 17665); ++i) {
            for (int j = -1 & -1; j <= (81 & -16351); ++j) {
                Class_3436 class_3436 = class_561.Method_568(class_4751.Method_4791(i, 8274 & 6304, j));
                Class_3238 class_3238 = class_3436.Method_3442();
                Class_3713 class_3713 = class_3238.Method_3373();
                if (class_3713 == this.\u0000strictfp || class_3238.Method_3381()) continue;
                return (603 & -30687) != 0;
            }
        }
        return (2596 & -20470) != 0;
    }

    public Class_3436 Method_4443(int n) {
        return this.\u0000strictfp().Method_3685(Field_4417, Integer.valueOf(n));
    }

    public static Class_4458 Method_4444(Class_3713 class_3713) {
        if (class_3713 == Class_3713.Field_3734) {
            return Class_9265.Field_9286;
        }
        if (class_3713 == Class_3713.Field_3750) {
            return Class_9265.Field_9358;
        }
        throw new IllegalArgumentException("Invalid material");
    }

    protected Class_4415(Class_3713 class_3713) {
        super(class_3713);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_4417, Integer.valueOf(4182 & -32767)));
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp((12553 & 545) != 0);
    }

    private static String Method_4445(String string) {
        int n = 13613;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4415.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected int Method_4446(Class_561 class_561, Class_4751 class_4751) {
        int n = this.Method_4447(class_561, class_4751);
        return n >= (16524 & 1035) ? -31947 & 64 : n;
    }

    protected int Method_4447(Class_561 class_561, Class_4751 class_4751) {
        return class_561.Method_568(class_4751).Method_3442().Method_3373() == this.\u0000strictfp ? (Integer)class_561.Method_568(class_4751).Method_3440(Field_4417) : -1 & -1;
    }

    public Class_17531 Method_4448() {
        return this.\u0000strictfp == Class_3713.Field_3734 ? Class_17531.Field_17537 : Class_17531.Field_17532;
    }

    public int Method_4449(Class_283 class_283) {
        return this.\u0000strictfp == Class_3713.Field_3734 ? 1037 & 20805 : (this.\u0000strictfp == Class_3713.Field_3750 ? (class_283.Field_284.Method_18370() ? -32757 & 1066 : 2591 & 29854) : 8368 & 1027);
    }

    public void Method_4450(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        Class_3713 class_3713;
        double d = class_4751.\u0000= final();
        double d2 = class_4751.\u0000, `();
        double d3 = class_4751.\u0000strictfp();
        if (this.\u0000strictfp == Class_3713.Field_3734) {
            int n = (Integer)class_3436.Method_3440(Field_4417);
            if (n > 0 && n < (17433 & -32116)) {
                if (random.nextInt(18524 & -23487) == 0) {
                    class_283.Method_482(d + 1.5576923076923077 * 0.32098765432098764, d2 + 1.5434782608695652 * 0.323943661971831, d3 + 80.0 * 0.00625, "liquid.water", random.nextFloat() * (0.31325302f * 0.7980769f) + 0.1764706f * 4.25f, random.nextFloat() * 1.0f + 1.1315789f * 0.44186047f, (288 & 16902) != 0);
                }
            } else if (random.nextInt(8718 & 16715) == 0) {
                class_283.Method_407(Class_40274.Field_40281, d + (double)random.nextFloat(), d2 + (double)random.nextFloat(), d3 + (double)random.nextFloat(), 0.0, 0.0, 0.0, new int[21250 & 2164]);
            }
        }
        if (this.\u0000strictfp == Class_3713.Field_3750 && class_283.Method_375(class_4751.Method_4769()).Method_3442().Method_3373() == Class_3713.Field_3718 && !class_283.Method_375(class_4751.Method_4769()).Method_3442().Method_3375()) {
            if (random.nextInt(228 & 27244) == 0) {
                double d4 = d + (double)random.nextFloat();
                double d5 = d2 + this.\u0000strictfp;
                double d6 = d3 + (double)random.nextFloat();
                class_283.Method_407(Class_40274.Field_40294, d4, d5, d6, 0.0, 0.0, 0.0, new int[3074 & 20792]);
                class_283.Method_482(d4, d5, d6, "liquid.lavapop", 0.128f * 1.5625f + random.nextFloat() * (10.444445f * 0.019148936f), 2.0425532f * 0.44062498f + random.nextFloat() * (1.2750001f * 0.11764706f), (1184 & 27165) != 0);
            }
            if (random.nextInt(18120 & 200) == 0) {
                class_283.Method_482(d, d2, d3, "liquid.lava", 0.8947368f * 0.22352941f + random.nextFloat() * (0.75308645f * 0.26557377f), 0.0625f * 14.4f + random.nextFloat() * (3.0f * 0.05f), (4389 & 9864) != 0);
            }
        }
        if (random.nextInt(1306 & 24618) == 0 && Class_283.Method_538(class_283, class_4751.Method_4782()) && !(class_3713 = class_283.Method_375(class_4751.Method_4768(-10206 & 1426)).Method_3442().Method_3373()).Method_3761() && !class_3713.Method_3758()) {
            double d7 = d + (double)random.nextFloat();
            double d8 = d2 - 0.41250000000000003 * 2.5454545454545454;
            double d9 = d3 + (double)random.nextFloat();
            if (this.\u0000strictfp == Class_3713.Field_3734) {
                class_283.Method_407(Class_40274.Field_40322, d7, d8, d9, 0.0, 0.0, 0.0, new int[-28189 & 1028]);
            } else {
                class_283.Method_407(Class_40274.Field_40289, d7, d8, d9, 0.0, 0.0, 0.0, new int[1573 & 4096]);
            }
        }
    }

    public boolean Method_4451(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        Class_3713 class_3713 = class_561.Method_568(class_4751).Method_3442().Method_3373();
        return (class_3713 == this.\u0000strictfp ? 1066 & 16448 : (class_4595 == Class_4595.Field_4601 ? 9097 & 20549 : (class_3713 == Class_3713.Field_3730 ? 1152 & -26601 : (int)(super.Method_3349(class_561, class_4751, class_4595) ? 1 : 0)))) != 0;
    }
}

