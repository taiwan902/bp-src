/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.LoadingCache
 */
import com.google.common.cache.LoadingCache;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_14263
extends Class_4844 {
    public static final Class_3957 Field_14264;

    public void Method_14265(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_1061 class_1061) {
        if (class_1061.Field_1095 == null && class_1061.Field_1099 == null) {
            class_1061.Method_1361(new Class_4751(class_4751));
        }
    }

    public Class_14263() {
        super(Class_3713.Field_3720, (21528 & -32544) != 0);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_14264, (Comparable)((Object)Class_4565.Field_4566)));
        this.\u0000strictfp((20737 & 8905) != 0);
    }

    private void Method_14266() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_9702 Method_14267(Class_283 class_283, Class_4751 class_4751) {
        Object object;
        int n;
        Class_4565 class_4565 = Class_4565.Field_4570;
        Class_15747 class_15747 = new Class_15747(class_283, class_4751, Class_4565.Field_4566);
        LoadingCache loadingCache = Class_22266.Method_22276(class_283, (1037 & 387) != 0);
        if (!class_15747.Method_15766()) {
            class_4565 = Class_4565.Field_4566;
            class_15747 = new Class_15747(class_283, class_4751, Class_4565.Field_4570);
        }
        if (!class_15747.Method_15766()) {
            return new Class_9702(class_4751, Class_4595.Field_4598, Class_4595.Field_4601, loadingCache, -30671 & 13, 6917 & 129, 257 & 29265);
        }
        int[] arrn = new int[Class_5016.Method_5026().length];
        Class_4595 class_4595 = Class_15747.Method_15761(class_15747).Method_4617();
        Class_4751 class_47512 = Class_15747.Method_15763(class_15747).Method_4766(class_15747.Method_15759() - (5201 & -32625));
        Object object2 = Class_5016.Method_5026();
        int n2 = ((Class_5016[])object2).length;
        for (n = 16436 & 4353; n < n2; ++n) {
            Class_5016 class_5016 = object2[n];
            object = new Class_9702(class_4595.Method_4647() == class_5016 ? class_47512 : class_47512.Method_4776(Class_15747.Method_15761(class_15747), class_15747.Method_15760() - (9 & 2179)), Class_4595.Method_4649(class_5016, class_4565), Class_4595.Field_4601, loadingCache, class_15747.Method_15760(), class_15747.Method_15759(), 12301 & -29535);
            for (int i = 1091 & 17160; i < class_15747.Method_15760(); ++i) {
                for (int j = -32543 & 9480; j < class_15747.Method_15759(); ++j) {
                    Class_7692 class_7692 = ((Class_9702)object).Method_9716(i, j, -20223 & 205);
                    if (class_7692.Method_7699() == null || class_7692.Method_7699().Method_3442().Method_3373() == Class_3713.Field_3718) continue;
                    int[] arrn2 = arrn;
                    int n3 = class_5016.ordinal();
                    arrn2[n3] = arrn2[n3] + (325 & -14847);
                }
            }
        }
        object2 = Class_5016.Field_5018;
        Class_5016[] arrclass_5016 = Class_5016.Method_5026();
        n = arrclass_5016.length;
        for (int i = 6160 & 8969; i < n; ++i) {
            object = arrclass_5016[i];
            if (arrn[object.ordinal()] >= arrn[object2.ordinal()]) continue;
            object2 = object;
        }
        return new Class_9702(class_4595.Method_4647() == object2 ? class_47512 : class_47512.Method_4776(Class_15747.Method_15761(class_15747), class_15747.Method_15760() - (1051 & -23935)), Class_4595.Method_4649((Class_5016)((Object)object2), class_4565), Class_4595.Field_4601, loadingCache, class_15747.Method_15760(), class_15747.Method_15759(), 8595 & 4129);
    }

    static {
        Enum[] arrenum = new Class_4565[8195 & 1062];
        arrenum[-31936 & 27655] = Class_4565.Field_4566;
        arrenum[17031 & 13689] = Class_4565.Field_4570;
        Field_14264 = Class_3957.Method_3961(Class_14263.Method_14282("\u8e8d\u8e94\u8e87\u8e9d"), Class_4565.class, arrenum);
    }

    public Class_3436 Method_14268(int n) {
        return this.\u0000strictfp().Method_3685(Field_14264, (Comparable)((Object)((n & (1027 & 2051)) == (6954 & -32697) ? Class_4565.Field_4570 : Class_4565.Field_4566)));
    }

    public void Method_14269(Class_561 class_561, Class_4751 class_4751) {
        Class_4565 class_4565 = (Class_4565)((Object)class_561.Method_568(class_4751).Method_3440(Field_14264));
        float f = 0.7380952f * 0.16935484f;
        float f2 = 0.005f * 25.0f;
        if (class_4565 == Class_4565.Field_4566) {
            f = 0.3956044f * 1.2638888f;
        }
        if (class_4565 == Class_4565.Field_4570) {
            f2 = 1.3333334f * 0.375f;
        }
        this.\u0000strictfp(0.3846154f * 1.3f - f, 0.0f, 0.7916667f * 0.6315789f - f2, 0.5f * 1.0f + f, 1.0f, 2.2333333f * 0.2238806f + f2);
    }

    public static int Method_14270(Class_4565 class_4565) {
        return class_4565 == Class_4565.Field_4566 ? 10241 & 16481 : (class_4565 == Class_4565.Field_4570 ? 12290 & 18959 : 24585 & 3108);
    }

    public boolean Method_14271() {
        return (216 & 34) != 0;
    }

    public void Method_14272(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (random.nextInt(-30620 & 4837) == 0) {
            class_283.Method_482((double)class_4751.\u0000= final() + 0.3064516129032258 * 1.631578947368421, (double)class_4751.\u0000, `() + 0.48936170212765956 * 1.0217391304347827, (double)class_4751.\u0000strictfp() + 0.7666666666666667 * 0.6521739130434783, "portal.portal", 0.31111112f * 1.6071428f, random.nextFloat() * (0.24935065f * 1.6041666f) + 1.382353f * 0.57872343f, (16724 & 4138) != 0);
        }
        for (int i = 26531 & 4; i < (2150 & 21652); ++i) {
            double d = (float)class_4751.\u0000= final() + random.nextFloat();
            double d2 = (float)class_4751.\u0000, `() + random.nextFloat();
            double d3 = (float)class_4751.\u0000strictfp() + random.nextFloat();
            double d4 = ((double)random.nextFloat() - 4.588235294117647 * 0.10897435897435898) * (0.19387755102040816 * 2.5789473684210527);
            double d5 = ((double)random.nextFloat() - 0.826923076923077 * 0.6046511627906976) * (1.7073170731707317 * 0.29285714285714287);
            double d6 = ((double)random.nextFloat() - 0.40476190476190477 * 1.2352941176470589) * (4.9 * 0.1020408163265306);
            int n = random.nextInt(-32053 & 10278) * (-14206 & 9738) - (-30843 & 12289);
            if (class_283.Method_375(class_4751.Method_4771()).Method_3442() != this && class_283.Method_375(class_4751.Method_4770()).Method_3442() != this) {
                d = (double)class_4751.\u0000= final() + 2.875 * 0.17391304347826086 + 4.0 * 0.0625 * (double)n;
                d4 = random.nextFloat() * 2.0f * (float)n;
            } else {
                d3 = (double)class_4751.\u0000strictfp() + 0.8181818181818182 * 0.611111111111111 + 0.34649122807017546 * 0.7215189873417721 * (double)n;
                d6 = random.nextFloat() * 2.0f * (float)n;
            }
            class_283.Method_407(Class_40274.Field_40307, d, d2, d3, d4, d5, d6, new int[8576 & -12222]);
        }
    }

    public int Method_14273(Class_3436 class_3436) {
        return Class_14263.Method_14270((Class_4565)((Object)class_3436.Method_3440(Field_14264)));
    }

    public boolean Method_14274(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        int n;
        Class_4565 class_4565 = null;
        Class_3436 class_3436 = class_561.Method_568(class_4751);
        if (class_561.Method_568(class_4751).Method_3442() == this) {
            class_4565 = (Class_4565)((Object)class_3436.Method_3440(Field_14264));
            if (class_4565 == null) {
                return (256 & -21468) != 0;
            }
            if (class_4565 == Class_4565.Field_4570 && class_4595 != Class_4595.Field_4603 && class_4595 != Class_4595.Field_4602) {
                return (3172 & -28007) != 0;
            }
            if (class_4565 == Class_4565.Field_4566 && class_4595 != Class_4595.Field_4613 && class_4595 != Class_4595.Field_4598) {
                return (514 & 20717) != 0;
            }
        }
        int n2 = class_561.Method_568(class_4751.Method_4771()).Method_3442() == this && class_561.Method_568(class_4751.Method_4781(386 & 3094)).Method_3442() != this ? 22533 & 9033 : 132 & 17441;
        int n3 = class_561.Method_568(class_4751.Method_4770()).Method_3442() == this && class_561.Method_568(class_4751.Method_4783(-32697 & 13314)).Method_3442() != this ? 16673 & -30187 : 10246 & 16;
        int n4 = class_561.Method_568(class_4751.Method_4778()).Method_3442() == this && class_561.Method_568(class_4751.Method_4788(16391 & 9362)).Method_3442() != this ? 16899 & 3313 : -28606 & 18456;
        int n5 = class_561.Method_568(class_4751.Method_4784()).Method_3442() == this && class_561.Method_568(class_4751.Method_4772(2 & 19099)).Method_3442() != this ? 16673 & 2583 : 1024 & 2110;
        int n6 = n2 != 0 || n3 != 0 || class_4565 == Class_4565.Field_4566 ? 273 & -32735 : 17104 & -31742;
        int n7 = n = n4 != 0 || n5 != 0 || class_4565 == Class_4565.Field_4570 ? 25113 & 3 : 16390 & 2984;
        return (n6 != 0 && class_4595 == Class_4595.Field_4602 ? 533 & 331 : (n6 != 0 && class_4595 == Class_4595.Field_4603 ? 8727 & 21833 : (n != 0 && class_4595 == Class_4595.Field_4598 ? 16677 & -22519 : (n != 0 && class_4595 == Class_4595.Field_4613 ? 11289 & 257 : 128 & -9692)))) != 0;
    }

    public void Method_14275(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        Class_15747 class_15747;
        Class_4565 class_4565 = (Class_4565)((Object)class_3436.Method_3440(Field_14264));
        if (class_4565 == Class_4565.Field_4566) {
            Class_15747 class_157472 = new Class_15747(class_283, class_4751, Class_4565.Field_4566);
            if (!class_157472.Method_15766() || Class_15747.Method_15767(class_157472) < Class_15747.Method_15762(class_157472) * Class_15747.Method_15758(class_157472)) {
                class_283.Method_435(class_4751, Class_9265.Field_9351.Method_3293());
            }
        } else if (!(class_4565 != Class_4565.Field_4570 || (class_15747 = new Class_15747(class_283, class_4751, Class_4565.Field_4570)).Method_15766() && Class_15747.Method_15767(class_15747) >= Class_15747.Method_15762(class_15747) * Class_15747.Method_15758(class_15747))) {
            class_283.Method_435(class_4751, Class_9265.Field_9351.Method_3293());
        }
    }

    public boolean Method_14276(Class_283 class_283, Class_4751 class_4751) {
        Class_15747 class_15747 = new Class_15747(class_283, class_4751, Class_4565.Field_4566);
        if (class_15747.Method_15766() && Class_15747.Method_15767(class_15747) == 0) {
            class_15747.Method_15764();
            return (5633 & 18705) != 0;
        }
        Class_15747 class_157472 = new Class_15747(class_283, class_4751, Class_4565.Field_4570);
        if (class_157472.Method_15766() && Class_15747.Method_15767(class_157472) == 0) {
            class_157472.Method_15764();
            return (4409 & 5) != 0;
        }
        return (770 & 8400) != 0;
    }

    public void Method_14277(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        super.\u0000, `(class_283, class_4751, class_3436, random);
        if (class_283.Field_284.Method_18372() && class_283.Method_522().Method_7529("doMobSpawning") && random.nextInt(-6156 & 2000) < class_283.Method_487().Method_26822()) {
            Class_1061 class_1061;
            int n = class_4751.\u0000, `();
            Class_4751 class_47512 = class_4751;
            while (!Class_283.Method_538(class_283, class_47512) && class_47512.\u0000, `() > 0) {
                class_47512 = class_47512.Method_4782();
            }
            if (n > 0 && !class_283.Method_375(class_47512.Method_4769()).Method_3442().Method_3400() && (class_1061 = Class_23726.Method_23729(class_283, 10489 & -32451, (double)class_47512.\u0000= final() + 1.6065573770491803 * 0.3112244897959184, (double)class_47512.\u0000, `() + 0.24444444444444444 * 4.500000000000001, (double)class_47512.\u0000strictfp() + 0.85 * 0.5882352941176471)) != null) {
                class_1061.Field_1096 = class_1061.Method_1245();
            }
        }
    }

    public int Method_14278(Random random) {
        return -30698 & 5185;
    }

    public Class_17531 Method_14279() {
        return Class_17531.Field_17537;
    }

    protected Class_3855 Method_14280() {
        Class_3538[] arrclass_3538 = new Class_3538[18945 & 12381];
        arrclass_3538[21576 & 262] = Field_14264;
        return new Class_3855(this, arrclass_3538);
    }

    public Class_10997 Method_14281(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return null;
    }

    private static String Method_14282(String string) {
        int n = 21512;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14263.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_1956 Method_14283(Class_283 class_283, Class_4751 class_4751) {
        return null;
    }
}

