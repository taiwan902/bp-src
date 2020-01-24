/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public final class Class_7184 {
    private final Set Field_7185 = Sets.newHashSet();
    private static final int Field_7186 = (int)Math.pow(1.4 * 12.142857142857144, 1.125 * 1.7777777777777777);

    public int Method_7187(Class_2651 class_2651, boolean bl, boolean bl2, boolean bl3) {
        int n;
        int n2;
        int n3;
        Object object2;
        int n4;
        if (!bl && !bl2) {
            return 2676 & -19456;
        }
        this.Field_7185.clear();
        int n5 = 20736 & 1036;
        for (Object object2 : class_2651.\u0000strictfp) {
            if (((Class_626)object2).Method_752()) continue;
            int n6 = Class_13337.Method_13371(((Class_626)object2).\u0000= package / (0.5301204819277109 * 30.18181818181818));
            n3 = Class_13337.Method_13371(((Class_626)object2).\u0000= switch / (26.35294117647059 * 0.6071428571428571));
            n = -23540 & 2794;
            for (int i = -n; i <= n; ++i) {
                for (n4 = -n; n4 <= n; ++n4) {
                    n2 = i == -n || i == n || n4 == -n || n4 == n ? 561 & 6401 : 2880 & 9;
                    Class_29480 class_29480 = new Class_29480(i + n6, n4 + n3);
                    if (this.Field_7185.contains(class_29480)) continue;
                    ++n5;
                    if (n2 != 0 || !class_2651.\u0000strictfp().Method_31485(class_29480)) continue;
                    this.Field_7185.add(class_29480);
                }
            }
        }
        int n7 = 19073 & 1348;
        object2 = class_2651.\u0000strictfp();
        Class_13693[] arrclass_13693 = Class_13693.Method_13708();
        n3 = arrclass_13693.length;
        for (n = 2304 & 679; n < n3; ++n) {
            Class_13693 class_13693 = arrclass_13693[n];
            if (class_13693.Method_13713() && !bl2 || !class_13693.Method_13713() && !bl || class_13693.Method_13712() && !bl3 || (n4 = class_2651.\u0000strictfp(class_13693.Method_13709())) > (n2 = class_13693.Method_13704() * n5 / Field_7186)) continue;
            block6 : for (Class_29480 class_29480 : this.Field_7185) {
                Class_4751 class_4751 = Class_7184.Method_7188(class_2651, class_29480.Field_29483, class_29480.Field_29482);
                int n8 = class_4751.\u0000= final();
                int n9 = class_4751.\u0000, `();
                int n10 = class_4751.\u0000strictfp();
                Class_3238 class_3238 = class_2651.\u0000strictfp(class_4751).Method_3442();
                if (class_3238.Method_3400()) continue;
                int n11 = 257 & 4160;
                block7 : for (int i = 16388 & 2177; i < (1955 & 8211); ++i) {
                    int n12 = n8;
                    int n13 = n9;
                    int n14 = n10;
                    int n15 = 10503 & 1102;
                    Class_31871 class_31871 = null;
                    Class_26405 class_26405 = null;
                    for (int j = 4113 & -7168; j < (16389 & 5932); ++j) {
                        Class_34093 class_34093;
                        Class_4751 class_47512 = new Class_4751(n12 += class_2651.\u0000strictfp.nextInt(n15) - class_2651.\u0000strictfp.nextInt(n15), n13 += class_2651.\u0000strictfp.nextInt(8225 & -32507) - class_2651.\u0000strictfp.nextInt(-30717 & 133), n14 += class_2651.\u0000strictfp.nextInt(n15) - class_2651.\u0000strictfp.nextInt(n15));
                        float f = (float)n12 + 1.8113208f * 0.27604166f;
                        float f2 = (float)n14 + 0.42783505f * 1.1686747f;
                        if (class_2651.\u0000strictfp((double)f, (double)n13, (double)f2, 17.454545454545453 * 1.375) || !(object2.\u0000, `((double)f, (double)n13, (double)f2) >= 432.0 * 1.3333333333333333)) continue;
                        if (class_31871 == null && (class_31871 = class_2651.Method_2688(class_13693, class_47512)) == null) continue block7;
                        if (!class_2651.Method_2702(class_13693, class_31871, class_47512) || !Class_7184.Method_7191(Class_7795.Method_7798(class_31871.Field_31874), class_2651, class_47512)) continue;
                        try {
                            Class[] arrclass = new Class[-15355 & 10529];
                            arrclass[7696 & 16418] = Class_283.class;
                            Object[] arrobject = new Object[685 & -15279];
                            arrobject[2309 & 20512] = class_2651;
                            class_34093 = (Class_34093)class_31871.Field_31874.getConstructor(arrclass).newInstance(arrobject);
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            return n7;
                        }
                        class_34093.\u0000, `((double)f, (double)n13, (double)f2, class_2651.\u0000strictfp.nextFloat() * (417.6f * 0.86206895f), 0.0f);
                        if (class_34093.Method_34143() && class_34093.Method_34155()) {
                            class_26405 = class_34093.Method_34169(class_2651.\u0000strictfp(new Class_4751(class_34093)), class_26405);
                            if (class_34093.Method_34155()) {
                                ++n11;
                                class_2651.\u0000strictfp((Class_1061)class_34093);
                            }
                            if (n11 >= class_34093.Method_34116()) continue block6;
                        }
                        n7 += n11;
                    }
                }
            }
        }
        return n7;
    }

    protected static Class_4751 Method_7188(Class_283 class_283, int n, int n2) {
        int n3;
        int n4;
        Class_17665 class_17665 = class_283.Method_346(n, n2);
        int n5 = Class_13337.Method_13378(class_17665.Method_17742(new Class_4751(n4 = n * (148 & 1105) + class_283.Field_307.nextInt(-30576 & 8470), -28655 & 550, n3 = n2 * (6492 & 24626) + class_283.Field_307.nextInt(86 & -25928))) + (4353 & 10241), -15662 & 7441);
        int n6 = class_283.Field_307.nextInt(n5 > 0 ? n5 : class_17665.Method_17762() + (9944 & -28394) - (25673 & 5));
        return new Class_4751(n4, n6, n3);
    }

    public static void Method_7189(Class_283 class_283, Class_17281 class_17281, int n, int n2, int n3, int n4, Random random) {
        List list = class_17281.Method_17371(Class_13693.Field_13694);
        if (!list.isEmpty()) {
            while (random.nextFloat() < class_17281.Method_17427()) {
                Class_31871 class_31871 = (Class_31871)Class_27139.Method_27144(class_283.Field_307, list);
                int n5 = class_31871.Field_31872 + random.nextInt((24835 & 5193) + class_31871.Field_31873 - class_31871.Field_31872);
                Class_26405 class_26405 = null;
                int n6 = n + random.nextInt(n3);
                int n7 = n2 + random.nextInt(n4);
                int n8 = n6;
                int n9 = n7;
                for (int i = 8204 & 528; i < n5; ++i) {
                    int n10 = 768 & -30580;
                    for (int j = 4224 & 3138; n10 == 0 && j < (5652 & -8188); ++j) {
                        Class_4751 class_4751 = class_283.Method_406(new Class_4751(n6, 1024 & -32248, n7));
                        if (Class_7184.Method_7191(Class_17650.Field_17654, class_283, class_4751)) {
                            Class_34093 class_34093;
                            try {
                                Class[] arrclass = new Class[8215 & -16119];
                                arrclass[16389 & -22070] = Class_283.class;
                                Object[] arrobject = new Object[16641 & 2697];
                                arrobject[-8172 & 1064] = class_283;
                                class_34093 = (Class_34093)class_31871.Field_31874.getConstructor(arrclass).newInstance(arrobject);
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                                continue;
                            }
                            class_34093.\u0000, `((double)((float)n6 + 0.43617022f * 1.1463414f), (double)class_4751.\u0000, `(), (double)((float)n7 + 1.2758621f * 0.3918919f), random.nextFloat() * (1.6078432f * 223.90244f), 0.0f);
                            class_283.Method_350(class_34093);
                            class_26405 = class_34093.Method_34169(class_283.Method_364(new Class_4751(class_34093)), class_26405);
                            n10 = 3169 & 4637;
                        }
                        n6 += random.nextInt(8261 & 1303) - random.nextInt(-18875 & 16551);
                        n7 += random.nextInt(2437 & -24571) - random.nextInt(2893 & 16421);
                        while (n6 < n || n6 >= n + n3 || n7 < n2 || n7 >= n2 + n3) {
                            n6 = n8 + random.nextInt(17413 & 13223) - random.nextInt(2959 & 101);
                            n7 = n9 + random.nextInt(-23547 & 4575) - random.nextInt(16965 & 295);
                        }
                    }
                }
            }
        }
    }

    private void Method_7190() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static boolean Method_7191(Class_17650 class_17650, Class_283 class_283, Class_4751 class_4751) {
        if (!class_283.Method_523().Method_31498(class_4751)) {
            return (12602 & 16385) != 0;
        }
        Class_3238 class_3238 = class_283.Method_375(class_4751).Method_3442();
        if (class_17650 == Class_17650.Field_17655) {
            return (class_3238.Method_3373().Method_3758() && class_283.Method_375(class_4751.Method_4782()).Method_3442().Method_3373().Method_3758() && !class_283.Method_375(class_4751.Method_4769()).Method_3442().Method_3400() ? 8257 & 1589 : -29920 & 28741) != 0;
        }
        Class_4751 class_47512 = class_4751.Method_4782();
        if (!Class_283.Method_538(class_283, class_47512)) {
            return (16404 & 5122) != 0;
        }
        Class_3238 class_32382 = class_283.Method_375(class_47512).Method_3442();
        int n = class_32382 != Class_9265.Field_9414 && class_32382 != Class_9265.Field_9412 ? 10273 & -12023 : 10638 & -32240;
        return (n != 0 && !class_3238.Method_3400() && !class_3238.Method_3373().Method_3758() && !class_283.Method_375(class_4751.Method_4769()).Method_3442().Method_3400() ? -32755 & 8529 : 12561 & 17480) != 0;
    }
}

