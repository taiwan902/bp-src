/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_10433 {
    private static int Field_10434;
    private static final Class_3436 Field_10435;
    private static int[] Field_10436;
    private static Class_28499 Field_10437;
    private static Class_28499 Field_10438;
    private static final Class_16661 Field_10439;
    private static Class_14837 Field_10440;
    private static float[][] Field_10441;
    private static Vec3 Field_10442;
    private static int Field_10443;
    private static Class_28499[] Field_10444;
    private static int Field_10445;
    private static final Class_16661 Field_10446;
    private static final Class_3436 Field_10447;
    private static Class_28499 Field_10448;
    private static Class_28499 Field_10449;
    private static Class_28499[][] Field_10450;
    private static Class_14837 Field_10451;
    public static Random Field_10452;
    private static Vec3 Field_10453;
    private static int[] Field_10454;
    private static final Class_16661 Field_10455;
    private static int Field_10456;
    private static int[] Field_10457;
    private static Class_28371[] Field_10458;
    private static int Field_10459;
    private static int Field_10460;
    private static final Class_16661 Field_10461;
    private static Vec3 Field_10462;
    private static Class_28499 Field_10463;
    private static int Field_10464;
    private static int[] Field_10465;
    private static final Class_16661 Field_10466;
    private static int Field_10467;
    private static Class_28499 Field_10468;
    private static Class_28499 Field_10469;
    private static int[] Field_10470;
    private static Class_28499 Field_10471;
    private static Class_28499 Field_10472;
    private static Class_28499 Field_10473;
    private static Class_28499 Field_10474;
    private static boolean Field_10475;
    private static Class_28499 Field_10476;
    private static Class_14837 Field_10477;
    private static Class_14837 Field_10478;
    private static Class_28499 Field_10479;
    private static float[][] Field_10480;
    private static Class_28499 Field_10481;
    private static Class_28499 Field_10482;
    private static Class_28499 Field_10483;
    private static String Field_10484;

    private static String Method_10485(String string) {
        int n = 8084;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10433.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Vec3 Method_10486(Vec3 vec3) {
        return Field_10442 == null ? vec3 : Field_10442;
    }

    private void Method_10487() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static int Method_10488(int n, int n2) {
        if (Field_10436 == null) {
            return n2;
        }
        if (n >= 0 && n < Field_10436.length) {
            int n3 = Field_10436[n];
            return n3 < 0 ? n2 : n3;
        }
        return n2;
    }

    protected static Class_17281 Method_10489(Class_561 class_561, Class_4751 class_4751) {
        Class_17281 class_17281 = class_561.Method_567(class_4751);
        if (class_17281 == Class_17281.Field_17337 && !Class_19426.Method_19592()) {
            class_17281 = Class_17281.Field_17318;
        }
        return class_17281;
    }

    public static Vec3 Method_10490(Vec3 vec3, Class_283 class_283, Class_1061 class_1061, float f) {
        int n = class_283.Field_284.Method_18379();
        switch (n) {
            case 0: {
                Class_18 class_18 = Class_18.Field_89;
                vec3 = Class_10433.Method_10491(vec3, class_18.Field_72, class_1061.Field_1130, class_1061.Method_1324() + 1.0, class_1061.Field_1106);
                break;
            }
            case 1: {
                vec3 = Class_10433.Method_10486(vec3);
            }
        }
        return vec3;
    }

    public static Vec3 Method_10491(Vec3 vec3, Class_561 class_561, double d, double d2, double d3) {
        if (Field_10483 == null) {
            return vec3;
        }
        int n = Field_10483.Method_28522(class_561, d, d2, d3, 55 & 18571);
        int n2 = n >> (-28396 & 2291) & (1279 & -23809);
        int n3 = n >> (2312 & 8221) & (-28161 & 255);
        int n4 = n & (5375 & 255);
        float f = (float)n2 / (0.6494845f * 392.61905f);
        float f2 = (float)n3 / (207.88043f * 1.2266667f);
        float f3 = (float)n4 / (134.71698f * 1.8928572f);
        float f4 = (float)vec3.\u0000= final / (5.2222223f * 0.09574468f);
        float f5 = (float)vec3.\u0000strictfp / (0.37254903f * 1.7789605f);
        float f6 = (float)vec3.\u0000, `;
        Vec3 vec32 = Field_10440.Method_14840(f *= f4, f2 *= f5, f3 *= f6);
        return vec32;
    }

    static {
        Field_10484 = Class_10433.Method_10485("=(% !!,");
        Field_10471 = null;
        Field_10474 = null;
        Field_10463 = null;
        Field_10438 = null;
        Field_10482 = null;
        Field_10444 = null;
        Field_10450 = null;
        Field_10483 = null;
        Field_10440 = new Class_14837();
        Field_10479 = null;
        Field_10451 = new Class_14837();
        Field_10469 = null;
        Field_10478 = new Class_14837();
        Field_10473 = null;
        Field_10477 = new Class_14837();
        Field_10458 = null;
        Field_10456 = 1064 & 12948;
        Field_10437 = null;
        Field_10448 = null;
        Field_10434 = -1 & -1;
        Field_10476 = null;
        Field_10449 = null;
        Field_10481 = null;
        Field_10468 = null;
        Field_10472 = null;
        Field_10475 = 67 & -32255;
        Field_10443 = -1 & -1;
        Field_10467 = -1 & -1;
        Field_10445 = -1 & -1;
        Field_10460 = -1 & -1;
        Field_10459 = -1 & -1;
        Field_10464 = -1 & -1;
        Field_10462 = null;
        Field_10453 = null;
        Field_10442 = null;
        Field_10457 = null;
        Field_10470 = null;
        Field_10441 = null;
        Field_10480 = null;
        Field_10454 = null;
        Field_10465 = null;
        Field_10436 = null;
        Field_10435 = Class_9265.Field_9272.Method_3293();
        Field_10447 = Class_9265.Field_9286.\u0000strictfp();
        Field_10452 = new Random();
        Field_10439 = new Class_23792();
        Field_10446 = new Class_19775();
        Field_10461 = new Class_26985();
        Field_10455 = new Class_19637();
        Field_10466 = new Class_38890();
    }
}

