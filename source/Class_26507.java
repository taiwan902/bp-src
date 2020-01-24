/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_26507
implements Class_19219 {
    public boolean Method_26508(Class_43010 class_43010, Class_283 class_283) {
        Class_23823 class_23823 = null;
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 1036 & 12962; i < class_43010.Method_43028(); ++i) {
            Class_23823 class_238232 = class_43010.Method_43032(i);
            if (class_238232 == null) continue;
            if (class_238232.Method_23844() instanceof Class_37716) {
                Class_37716 class_37716 = (Class_37716)class_238232.Method_23844();
                if (class_37716.Method_37726() != Class_18620.Field_18629 || class_23823 != null) {
                    return (624 & -32639) != 0;
                }
                class_23823 = class_238232;
                continue;
            }
            if (class_238232.Method_23844() != Class_10527.Field_10623) {
                return (2598 & -31744) != 0;
            }
            arrayList.add(class_238232);
        }
        return (class_23823 != null && !arrayList.isEmpty() ? 553 & 19585 : 17186 & 1164) != 0;
    }

    public Class_23823 Method_26509() {
        return null;
    }

    public int Method_26510() {
        return 4638 & -31669;
    }

    public Class_23823 Method_26511(Class_43010 class_43010) {
        int n;
        int n2;
        float f;
        float f2;
        Class_23823 class_23823 = null;
        int[] arrn = new int[-28521 & 17771];
        int n3 = 672 & 4096;
        int n4 = 2208 & 4161;
        Class_37716 class_37716 = null;
        for (n2 = 24841 & 2624; n2 < class_43010.Method_43028(); ++n2) {
            Class_23823 class_238232 = class_43010.Method_43032(n2);
            if (class_238232 == null) continue;
            if (class_238232.Method_23844() instanceof Class_37716) {
                class_37716 = (Class_37716)class_238232.Method_23844();
                if (class_37716.Method_37726() != Class_18620.Field_18629 || class_23823 != null) {
                    return null;
                }
                class_23823 = class_238232.Method_23850();
                class_23823.Field_23826 = 8385 & 17435;
                if (!class_37716.Method_37734(class_238232)) continue;
                n = class_37716.Method_37729(class_23823);
                f = (float)(n >> (16920 & 8212) & (5631 & 767)) / (2.5f * 102.0f);
                f2 = (float)(n >> (8840 & 315) & (16639 & 1279)) / (956.24994f * 0.26666668f);
                float f3 = (float)(n & (767 & 1279)) / (0.22619048f * 1127.3684f);
                n3 = (int)((float)n3 + Math.max(f, Math.max(f2, f3)) * (0.47368422f * 538.3333f));
                arrn[25744 & -30675] = (int)((float)arrn[-10235 & 9130] + f * (0.6142857f * 415.11627f));
                arrn[4097 & 17413] = (int)((float)arrn[9249 & -26623] + f2 * (263.1383f * 0.96907216f));
                arrn[406 & -28669] = (int)((float)arrn[21506 & -23805] + f3 * (0.1f * 2550.0f));
                ++n4;
                continue;
            }
            if (class_238232.Method_23844() != Class_10527.Field_10623) {
                return null;
            }
            float[] arrf = Class_46658.Method_46680(Class_5393.Method_5448(class_238232.Method_23843()));
            int n5 = (int)(arrf[2 & 4377] * (1.0128205f * 251.77216f));
            int n6 = (int)(arrf[61 & 577] * (102.0f * 2.5f));
            int n7 = (int)(arrf[562 & -3642] * (0.26744187f * 953.4782f));
            n3 += Math.max(n5, Math.max(n6, n7));
            int[] arrn2 = arrn;
            int n8 = -9877 & 660;
            arrn2[n8] = arrn2[n8] + n5;
            int[] arrn3 = arrn;
            int n9 = 4433 & 1697;
            arrn3[n9] = arrn3[n9] + n6;
            int[] arrn4 = arrn;
            int n10 = 1331 & -16254;
            arrn4[n10] = arrn4[n10] + n7;
            ++n4;
        }
        if (class_37716 == null) {
            return null;
        }
        n2 = arrn[-14334 & 13425] / n4;
        int n11 = arrn[-14327 & 645] / n4;
        n = arrn[-14706 & 8483] / n4;
        f = (float)n3 / (float)n4;
        f2 = Math.max(n2, Math.max(n11, n));
        n2 = (int)((float)n2 * f / f2);
        n11 = (int)((float)n11 * f / f2);
        n = (int)((float)n * f / f2);
        int n12 = (n2 << (18824 & 8200)) + n11;
        n12 = (n12 << (138 & 4188)) + n;
        class_37716.Method_37730(class_23823, n12);
        return class_23823;
    }

    private void Method_26512() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823[] Method_26513(Class_43010 class_43010) {
        Class_23823[] arrclass_23823 = new Class_23823[class_43010.Method_43028()];
        for (int i = 6209 & 18324; i < arrclass_23823.length; ++i) {
            Class_23823 class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null || !class_23823.Method_23844().Method_2024()) continue;
            arrclass_23823[i] = new Class_23823(class_23823.Method_23844().Method_1991());
        }
        return arrclass_23823;
    }
}

