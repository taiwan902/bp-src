/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Class_36539 {
    private static float Field_36540 = 0.48979592f * 0.40833333f;

    public boolean Method_36541(Class_561 class_561, Class_31211 class_31211, Class_3238 class_3238, Class_3436 class_3436, Class_4751 class_4751, Class_22385 class_22385, boolean bl, Class_4810[] arrclass_4810) {
        int n = 4160 & 18481;
        Class_29859 class_29859 = null;
        Object object = Class_4595.Field_4600;
        int n2 = ((Class_4595[])object).length;
        for (int i = 464 & 5640; i < n2; ++i) {
            Class_4595 class_4595 = object[i];
            List list = class_31211.Method_31218(class_4595);
            if (list.isEmpty()) continue;
            Class_4751 class_47512 = class_4751.Method_4765(class_4595);
            if (bl && !class_3238.Method_3356(class_561, class_47512, class_4595)) continue;
            if (class_29859 == null) {
                class_29859 = Class_29859.Method_29883(class_561, class_3436, class_4751);
            }
            if (!class_29859.Method_29879(list) && Class_19426.Method_19567()) {
                list = Class_24204.Method_24223(class_561, class_3436, class_4751, class_4595, list);
            }
            int n3 = class_3238.Method_3432(class_561, class_47512);
            this.Method_36544(class_561, class_3238, class_4751, class_4595, n3, (-8032 & 4100) != 0, class_22385, list, class_29859);
            n = 43 & -31999;
        }
        object = class_31211.Method_31214();
        if (object.size() > 0) {
            if (class_29859 == null) {
                class_29859 = Class_29859.Method_29883(class_561, class_3436, class_4751);
            }
            this.Method_36544(class_561, class_3238, class_4751, null, -1 & -1, (37 & -19439) != 0, class_22385, (List)object, class_29859);
            n = 161 & 4865;
        }
        if (class_29859 != null && Class_19426.Method_19508() && !class_29859.Method_29875() && Class_32544.Method_32551(class_561, class_3238, class_3436, class_4751) && Class_32544.Method_32551(class_561, class_3238, class_3436, class_4751)) {
            Class_31211 class_312112 = Class_32544.Method_32550();
            Class_3436 class_34362 = Class_32544.Method_32547();
            this.Method_36541(class_561, class_312112, class_34362.Method_3442(), class_34362, class_4751, class_22385, (9623 & -30679) != 0, arrclass_4810);
        }
        return n != 0;
    }

    public boolean Method_36542(Class_561 class_561, Class_31211 class_31211, Class_3677 class_3677, Class_4751 class_4751, Class_22385 class_22385, Class_4810[] arrclass_4810) {
        Class_3238 class_3238 = class_3677.Method_3688();
        class_3238.Method_3382(class_561, class_4751);
        return this.Method_36545(class_561, class_31211, class_3677, class_4751, class_22385, (2817 & -24493) != 0, arrclass_4810);
    }

    private void Method_36543(Class_561 class_561, Class_3238 class_3238, Class_4751 class_4751, Class_22385 class_22385, ArrayList arrayList, Class_29859 class_29859, Class_4810[] arrclass_4810) {
        float[] arrf = class_29859.Method_29877();
        BitSet bitSet = class_29859.Method_29880();
        Class_18559 class_18559 = class_29859.Method_29881();
        Class_3436 class_3436 = class_29859.Method_29878();
        double d = class_4751.\u0000= final();
        double d2 = class_4751.\u0000, `();
        double d3 = class_4751.\u0000strictfp();
        Class_16702 class_16702 = class_3238.Method_3296();
        if (class_16702 != Class_16702.Field_16706) {
            long l = Class_13337.Method_13384(class_4751);
            d += ((double)((float)(l >> (16400 & 279) & (335560783L & 571902095L)) / (1.4f * 10.714286f)) - 1.3518518518518519 * 0.3698630136986301) * (0.5 * 1.0);
            d3 += ((double)((float)(l >> (1149 & -32744) & (612381807L & 2099471L)) / (18.6f * 0.8064516f)) - 1.7884615384615385 * 0.27956989247311825) * (1.2 * 0.4166666666666667);
            if (class_16702 == Class_16702.Field_16705) {
                d2 += ((double)((float)(l >> (16724 & -28652) & (1896363023L & 33039L)) / (0.1632653f * 91.875f)) - 1.0) * (0.19058823529411767 * 1.0493827160493827);
            }
        }
        int n = arrayList.size();
        for (int i = 901 & 1064; i < n; ++i) {
            Class_14461 class_14461 = (Class_14461)arrayList.get(i);
            if (class_14461.Method_14476() != null) {
                Class_14461 class_144612 = class_14461;
                if (Class_19426.Method_19512()) {
                    class_14461 = Class_25918.Method_25944(class_561, class_3436, class_4751, class_14461, class_29859);
                }
                if (class_14461 == class_144612 && Class_19426.Method_19477()) {
                    class_14461 = Class_15787.Method_15790(class_4751, class_14461);
                }
            }
            this.Method_36553(class_3238, class_14461.Method_14478(), class_14461.Method_14475(), arrf, bitSet);
            class_18559.Method_18565(class_561, class_3238, class_4751, class_14461.Method_14475(), arrf, bitSet, arrclass_4810);
            if (class_22385.Method_22415()) {
                class_22385.Method_22414(class_14461.Method_14479());
                class_22385.Method_22425(class_14461.Method_14476());
            } else {
                class_22385.Method_22414(class_14461.Method_14478());
            }
            class_22385.Method_22440(Class_18559.Method_18566(class_18559)[-23935 & 5120], Class_18559.Method_18566(class_18559)[9 & 2629], Class_18559.Method_18566(class_18559)[8774 & 16683], Class_18559.Method_18566(class_18559)[-28153 & 131]);
            int n2 = Class_10125.Method_10171(class_14461, class_3238, class_561, class_4751, class_29859);
            if (!class_14461.Method_14474() && n2 < 0) {
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[96 & 16653], Class_18559.Method_18568(class_18559)[8740 & 1234], Class_18559.Method_18568(class_18559)[3493 & 25160], 11301 & 16716);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[841 & -20335], Class_18559.Method_18568(class_18559)[17933 & 8195], Class_18559.Method_18568(class_18559)[2897 & -31731], -23013 & 6211);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[4610 & 1058], Class_18559.Method_18568(class_18559)[-32086 & 2], Class_18559.Method_18568(class_18559)[1110 & -24438], -16122 & 138);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[515 & 9631], Class_18559.Method_18568(class_18559)[20651 & -31725], Class_18559.Method_18568(class_18559)[20487 & 1363], 4609 & 8193);
            } else {
                int n3 = n2 >= 0 ? n2 : class_3238.Method_3302(class_561, class_4751, class_14461.Method_14467());
                if (Class_22849.Field_22873) {
                    n3 = Class_18695.Method_18719(n3);
                }
                float f = (float)(n3 >> (21044 & 272) & (767 & 28927)) / (3.392857f * 75.1579f);
                float f2 = (float)(n3 >> (16520 & 73) & (1791 & 24831)) / (1.0f * 255.0f);
                float f3 = (float)(n3 & (8447 & -25089)) / (1.074074f * 237.4138f);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[4354 & 10336] * f, Class_18559.Method_18568(class_18559)[2180 & 17456] * f2, Class_18559.Method_18568(class_18559)[21248 & 2260] * f3, 532 & 17583);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[401 & 8297] * f, Class_18559.Method_18568(class_18559)[-12243 & 8387] * f2, Class_18559.Method_18568(class_18559)[835 & -30703] * f3, 291 & 19523);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[17114 & 1286] * f, Class_18559.Method_18568(class_18559)[1026 & 18695] * f2, Class_18559.Method_18568(class_18559)[-15221 & 578] * f3, 1283 & -30714);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[-8013 & 4167] * f, Class_18559.Method_18568(class_18559)[7183 & -32093] * f2, Class_18559.Method_18568(class_18559)[7171 & -32101] * f3, -24573 & 1113);
            }
            class_22385.Method_22441(d, d2, d3);
        }
    }

    private void Method_36544(Class_561 class_561, Class_3238 class_3238, Class_4751 class_4751, Class_4595 class_4595, int n, boolean bl, Class_22385 class_22385, List list, Class_29859 class_29859) {
        BitSet bitSet = class_29859.Method_29880();
        Class_3436 class_3436 = class_29859.Method_29878();
        double d = class_4751.\u0000= final();
        double d2 = class_4751.\u0000, `();
        double d3 = class_4751.\u0000strictfp();
        Class_16702 class_16702 = class_3238.Method_3296();
        if (class_16702 != Class_16702.Field_16706) {
            int n2 = class_4751.\u0000= final();
            int n3 = class_4751.\u0000strictfp();
            long l = (long)(n2 * (1345313295 & -2010135553)) ^ (long)n3 * (116129781L & 132907007L);
            l = l * l * (111541045L & 7504322883696965669L) + l * (6356854590843406347L & 286372363L);
            d += ((double)((float)(l >> (564 & 11410) & (1348403727L & 671130639L)) / (3.0555556f * 4.909091f)) - 2.4 * 0.20833333333333334) * (0.75 * 0.6666666666666666);
            d3 += ((double)((float)(l >> (21720 & 2590) & (29704223L & 603983887L)) / (1.6341463f * 9.179105f)) - 3.6538461538461537 * 0.1368421052631579) * (1.6 * 0.3125);
            if (class_16702 == Class_16702.Field_16705) {
                d2 += ((double)((float)(l >> (-15148 & 2845) & (67567663L & -7180325779850368945L)) / (1.9523809f * 7.682927f)) - 1.0) * (0.3241379310344828 * 0.6170212765957447);
            }
        }
        for (Object e : list) {
            Class_14461 class_14461 = (Class_14461)e;
            if (class_14461.Method_14476() != null) {
                Class_14461 class_144612 = class_14461;
                if (Class_19426.Method_19512()) {
                    class_14461 = Class_25918.Method_25944(class_561, class_3436, class_4751, class_14461, class_29859);
                }
                if (class_14461 == class_144612 && Class_19426.Method_19477()) {
                    class_14461 = Class_15787.Method_15790(class_4751, class_14461);
                }
            }
            if (bl) {
                this.Method_36553(class_3238, class_14461.Method_14478(), class_14461.Method_14475(), null, bitSet);
                int n4 = n = bitSet.get(-29947 & 160) ? class_3238.Method_3432(class_561, class_4751.Method_4765(class_14461.Method_14475())) : class_3238.Method_3432(class_561, class_4751);
            }
            if (class_22385.Method_22415()) {
                class_22385.Method_22414(class_14461.Method_14479());
                class_22385.Method_22425(class_14461.Method_14476());
            } else {
                class_22385.Method_22414(class_14461.Method_14478());
            }
            class_22385.Method_22440(n, n, n, n);
            int n5 = Class_10125.Method_10171(class_14461, class_3238, class_561, class_4751, class_29859);
            if (class_14461.Method_14474() || n5 >= 0) {
                int n6 = n5 >= 0 ? n5 : class_3238.Method_3302(class_561, class_4751, class_14461.Method_14467());
                if (Class_22849.Field_22873) {
                    n6 = Class_18695.Method_18719(n6);
                }
                float f = (float)(n6 >> (-28656 & 10480) & (12543 & 2303)) / (1.12f * 227.67857f);
                float f2 = (float)(n6 >> (-30452 & 8393) & (12799 & -29441)) / (42.5f * 6.0f);
                float f3 = (float)(n6 & (3839 & -24321)) / (294.23077f * 0.8666667f);
                class_22385.Method_22411(f, f2, f3, 9228 & 532);
                class_22385.Method_22411(f, f2, f3, -31341 & 4107);
                class_22385.Method_22411(f, f2, f3, 643 & -29686);
                class_22385.Method_22411(f, f2, f3, 1033 & 18951);
            }
            class_22385.Method_22441(d, d2, d3);
        }
    }

    public boolean Method_36545(Class_561 class_561, Class_31211 class_31211, Class_3677 class_3677, Class_4751 class_4751, Class_22385 class_22385, boolean bl, Class_4810[] arrclass_4810) {
        int n = Class_18.Method_222() && class_3677.Method_3688().Method_3355() == 0 && class_31211.Method_31213() ? -32767 & 12441 : 1314 & 12873;
        try {
            Class_3238 class_3238 = class_3677.Method_3688();
            return n != 0 ? this.Method_36549(class_561, class_31211, class_3238, class_3677, class_4751, class_22385, bl, arrclass_4810) : this.Method_36541(class_561, class_31211, class_3238, class_3677, class_4751, class_22385, bl, arrclass_4810);
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Tesselating block model");
            Class_13220 class_13220 = class_13268.Method_13280("Block model being tesselated");
            Class_13220.Method_13234(class_13220, class_4751, class_3677);
            class_13220.Method_13231("Using AO", n != 0);
            throw new Class_1809(class_13268);
        }
    }

    private void Method_36546() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_36547(Class_31211 class_31211, float f, float f2, float f3, float f4) {
        Class_4595[] arrclass_4595 = Class_4595.Field_4600;
        int n = arrclass_4595.length;
        for (int i = 18592 & 4869; i < n; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            this.Method_36552(f, f2, f3, f4, class_31211.Method_31218(class_4595));
        }
        this.Method_36552(f, f2, f3, f4, class_31211.Method_31214());
    }

    public boolean Method_36548(Class_46187 class_46187, Class_31211 class_31211, Class_3238 class_3238, Class_3436 class_3436, Class_4751 class_4751, Class_22385 class_22385, boolean bl, Class_4810[] arrclass_4810) {
        Object object;
        Object object2;
        int n = 69 & 9232;
        Class_29859 class_29859 = null;
        for (int i = 16484 & 4506; i < Class_4595.Field_4600.length; ++i) {
            object = Class_4595.Field_4600[i];
            object2 = (ArrayList)class_31211.Method_31218((Class_4595)object);
            if (((ArrayList)object2).isEmpty()) continue;
            Class_4751 class_47512 = class_4751.Method_4767((Class_4595)object, arrclass_4810[Class_14121.Field_14123.ordinal()]);
            if (bl && !class_3238.Method_3399(class_46187, class_47512, (Class_4595)object)) continue;
            if (class_29859 == null) {
                class_29859 = Class_29859.Method_29883(class_46187, class_3436, class_4751);
            }
            if (!class_29859.Method_29879((List)object2) && Class_19426.Method_19567()) {
                object2 = (ArrayList)Class_24204.Method_24223(class_46187, class_3436, class_4751, (Class_4595)object, (List)object2);
            }
            this.Method_36550(class_46187, class_3238, class_4751, class_22385, (ArrayList)object2, class_29859, arrclass_4810);
            n = 9605 & -15871;
        }
        ArrayList arrayList = (ArrayList)class_31211.Method_31214();
        if (arrayList.size() > 0) {
            if (class_29859 == null) {
                class_29859 = Class_29859.Method_29883(class_46187, class_3436, class_4751);
            }
            this.Method_36550(class_46187, class_3238, class_4751, class_22385, arrayList, class_29859, arrclass_4810);
            n = -16287 & 8205;
        }
        if (class_29859 != null && Class_19426.Method_19508() && !class_29859.Method_29875() && Class_32544.Method_32551(class_46187, class_3238, class_3436, class_4751)) {
            object = Class_32544.Method_32550();
            object2 = Class_32544.Method_32547();
            this.Method_36549(class_46187, (Class_31211)object, object2.Method_3442(), (Class_3436)object2, class_4751, class_22385, (-15035 & 4251) != 0, arrclass_4810);
        }
        return n != 0;
    }

    public boolean Method_36549(Class_561 class_561, Class_31211 class_31211, Class_3238 class_3238, Class_3436 class_3436, Class_4751 class_4751, Class_22385 class_22385, boolean bl, Class_4810[] arrclass_4810) {
        if (class_561 instanceof Class_46187) {
            return this.Method_36548((Class_46187)class_561, class_31211, class_3238, class_3436, class_4751, class_22385, bl, arrclass_4810);
        }
        int n = 38 & -8047;
        Class_29859 class_29859 = null;
        Object object = Class_4595.Field_4600;
        int n2 = ((Class_4595[])object).length;
        for (int i = -22240 & 16960; i < n2; ++i) {
            Class_4595 class_4595 = object[i];
            ArrayList arrayList = (ArrayList)class_31211.Method_31218(class_4595);
            if (arrayList.isEmpty()) continue;
            Class_4751 class_47512 = class_4751.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14123.ordinal()]);
            if (bl && !class_3238.Method_3356(class_561, class_47512, class_4595)) continue;
            if (class_29859 == null) {
                class_29859 = Class_29859.Method_29883(class_561, class_3436, class_4751);
            }
            if (!class_29859.Method_29879(arrayList) && Class_19426.Method_19567()) {
                arrayList = (ArrayList)Class_24204.Method_24223(class_561, class_3436, class_4751, class_4595, arrayList);
            }
            this.Method_36543(class_561, class_3238, class_4751, class_22385, arrayList, class_29859, arrclass_4810);
            n = 2105 & 9987;
        }
        object = (ArrayList)class_31211.Method_31214();
        if (((ArrayList)object).size() > 0) {
            if (class_29859 == null) {
                class_29859 = Class_29859.Method_29883(class_561, class_3436, class_4751);
            }
            this.Method_36543(class_561, class_3238, class_4751, class_22385, (ArrayList)object, class_29859, arrclass_4810);
            n = 727 & 7169;
        }
        if (class_29859 != null && Class_19426.Method_19508() && !class_29859.Method_29875() && Class_32544.Method_32551(class_561, class_3238, class_3436, class_4751)) {
            Class_31211 class_312112 = Class_32544.Method_32550();
            Class_3436 class_34362 = Class_32544.Method_32547();
            this.Method_36549(class_561, class_312112, class_34362.Method_3442(), class_34362, class_4751, class_22385, (-30969 & 9) != 0, arrclass_4810);
        }
        return n != 0;
    }

    private void Method_36550(Class_46187 class_46187, Class_3238 class_3238, Class_4751 class_4751, Class_22385 class_22385, ArrayList arrayList, Class_29859 class_29859, Class_4810[] arrclass_4810) {
        float[] arrf = class_29859.Method_29877();
        BitSet bitSet = class_29859.Method_29880();
        Class_18559 class_18559 = class_29859.Method_29881();
        Class_3436 class_3436 = class_29859.Method_29878();
        double d = class_4751.\u0000= final();
        double d2 = class_4751.\u0000, `();
        double d3 = class_4751.\u0000strictfp();
        Class_16702 class_16702 = class_3238.Method_3296();
        if (class_16702 != Class_16702.Field_16706) {
            long l = Class_13337.Method_13384(class_4751);
            d += ((double)((float)(l >> (5586 & 18992) & (36241439L & 818158607L)) / (0.13953489f * 107.49999f)) - 0.8684210526315789 * 0.5757575757575758) * (0.51 * 0.9803921568627451);
            d3 += ((double)((float)(l >> (-32228 & 8472) & (7251037698633246799L & -7251037700062964961L)) / (2.0232558f * 7.413793f)) - 0.7884615384615384 * 0.6341463414634146) * (1.4827586206896552 * 0.3372093023255814);
            if (class_16702 == Class_16702.Field_16705) {
                d2 += ((double)((float)(l >> (596 & 26654) & (5774167471980766879L & -5774167472558047217L)) / (727.5f * 0.020618556f)) - 1.0) * (3.409090909090909 * 0.058666666666666666);
            }
        }
        int n = arrayList.size();
        for (int i = 18502 & 265; i < n; ++i) {
            Class_14461 class_14461 = (Class_14461)arrayList.get(i);
            if (class_14461.Method_14476() != null) {
                Class_14461 class_144612 = class_14461;
                if (Class_19426.Method_19512()) {
                    class_14461 = Class_25918.Method_25944(class_46187, class_3436, class_4751, class_14461, class_29859);
                }
                if (class_14461 == class_144612 && Class_19426.Method_19477()) {
                    class_14461 = Class_15787.Method_15790(class_4751, class_14461);
                }
            }
            this.Method_36553(class_3238, class_14461.Method_14478(), class_14461.Method_14475(), arrf, bitSet);
            class_18559.Method_18564(class_46187, class_3238, class_4751, class_14461.Method_14475(), arrf, bitSet, arrclass_4810);
            if (class_22385.Method_22415()) {
                class_22385.Method_22414(class_14461.Method_14479());
                class_22385.Method_22425(class_14461.Method_14476());
            } else {
                class_22385.Method_22414(class_14461.Method_14478());
            }
            class_22385.Method_22440(Class_18559.Method_18566(class_18559)[16384 & -19927], Class_18559.Method_18566(class_18559)[1123 & 25], Class_18559.Method_18566(class_18559)[-24545 & 20482], Class_18559.Method_18566(class_18559)[12611 & 3083]);
            int n2 = Class_10125.Method_10171(class_14461, class_3238, class_46187, class_4751, class_29859);
            if (!class_14461.Method_14474() && n2 < 0) {
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[32 & 64], Class_18559.Method_18568(class_18559)[18179 & 14356], Class_18559.Method_18568(class_18559)[-16128 & 578], 804 & 4125);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[83 & 269], Class_18559.Method_18568(class_18559)[-13547 & 9345], Class_18559.Method_18568(class_18559)[2049 & 513], 20739 & -32229);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[4747 & -32750], Class_18559.Method_18568(class_18559)[8742 & 6411], Class_18559.Method_18568(class_18559)[8338 & 17006], 4291 & 274);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[14343 & 17763], Class_18559.Method_18568(class_18559)[3 & 18679], Class_18559.Method_18568(class_18559)[-32429 & 3], 16545 & -31209);
            } else {
                int n3 = n2 >= 0 ? n2 : class_3238.Method_3302(class_46187, class_4751, class_14461.Method_14467());
                if (Class_22849.Field_22873) {
                    n3 = Class_18695.Method_18719(n3);
                }
                float f = (float)(n3 >> (4698 & 3472) & (13055 & 3327)) / (2.1944444f * 116.20253f);
                float f2 = (float)(n3 >> (25481 & 72) & (255 & 5375)) / (1.1866666f * 214.88765f);
                float f3 = (float)(n3 & (1279 & -28161)) / (0.5934066f * 429.7222f);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[5542 & -30655] * f, Class_18559.Method_18568(class_18559)[1232 & 14339] * f2, Class_18559.Method_18568(class_18559)[20626 & -23807] * f3, 20868 & 2102);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[817 & 20485] * f, Class_18559.Method_18568(class_18559)[913 & -28665] * f2, Class_18559.Method_18568(class_18559)[67 & -7275] * f3, -10201 & 1027);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[29187 & 2314] * f, Class_18559.Method_18568(class_18559)[2 & 28710] * f2, Class_18559.Method_18568(class_18559)[9354 & -26041] * f3, -32097 & 4130);
                class_22385.Method_22411(Class_18559.Method_18568(class_18559)[18691 & 139] * f, Class_18559.Method_18568(class_18559)[8263 & -14277] * f2, Class_18559.Method_18568(class_18559)[3171 & -32741] * f3, -31595 & 585);
            }
            class_22385.Method_22441(d, d2, d3);
        }
    }

    public static void Method_36551() {
        Field_36540 = 1.0f - Class_19426.Method_19505() * (2.0f * 0.4f);
    }

    private void Method_36552(float f, float f2, float f3, float f4, List list) {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        for (Object e : list) {
            Class_14461 class_14461 = (Class_14461)e;
            class_22385.Method_22417(-7161 & 823, Class_29585.Field_29600);
            class_22385.Method_22414(class_14461.Method_14478());
            if (class_14461.Method_14474()) {
                class_22385.Method_22412(f2 * f, f3 * f, f4 * f);
            } else {
                class_22385.Method_22412(f, f, f);
            }
            Class_4792 class_4792 = class_14461.Method_14475().Method_4624();
            class_22385.Method_22422(class_4792.Method_4807(), class_4792.Method_4806(), class_4792.Method_4809());
            class_7644.Method_7647();
        }
    }

    private void Method_36553(Class_3238 class_3238, int[] arrn, Class_4595 class_4595, float[] arrf, BitSet bitSet) {
        float f;
        float f2 = 0.22891566f * 139.78947f;
        float f3 = 0.63492066f * 50.399998f;
        float f4 = 7.529412f * 4.25f;
        float f5 = 3.04f * -10.526316f;
        float f6 = -12.540541f * 2.5517242f;
        float f7 = -22.964706f * 1.3934426f;
        int n = arrn.length / (1252 & 16415);
        for (int i = 24065 & 8606; i < (84 & 9988); ++i) {
            f = Float.intBitsToFloat(arrn[i * n]);
            float f8 = Float.intBitsToFloat(arrn[i * n + (17033 & -29423)]);
            float f9 = Float.intBitsToFloat(arrn[i * n + (8747 & 20866)]);
            f2 = Math.min(f2, f);
            f3 = Math.min(f3, f8);
            f4 = Math.min(f4, f9);
            f5 = Math.max(f5, f);
            f6 = Math.max(f6, f8);
            f7 = Math.max(f7, f9);
        }
        if (arrf != null) {
            arrf[Class_4595.Field_4602.Method_4648()] = f2;
            arrf[Class_4595.Field_4603.Method_4648()] = f5;
            arrf[Class_4595.Field_4615.Method_4648()] = f3;
            arrf[Class_4595.Field_4601.Method_4648()] = f6;
            arrf[Class_4595.Field_4598.Method_4648()] = f4;
            arrf[Class_4595.Field_4613.Method_4648()] = f7;
            arrf[Class_4595.Field_4602.Method_4648() + Class_4595.Field_4600.length] = 1.0f - f2;
            arrf[Class_4595.Field_4603.Method_4648() + Class_4595.Field_4600.length] = 1.0f - f5;
            arrf[Class_4595.Field_4615.Method_4648() + Class_4595.Field_4600.length] = 1.0f - f3;
            arrf[Class_4595.Field_4601.Method_4648() + Class_4595.Field_4600.length] = 1.0f - f6;
            arrf[Class_4595.Field_4598.Method_4648() + Class_4595.Field_4600.length] = 1.0f - f4;
            arrf[Class_4595.Field_4613.Method_4648() + Class_4595.Field_4600.length] = 1.0f - f7;
        }
        float f10 = 3.7704915E-5f * 2.652174f;
        f = 0.36952826f * 2.7058823f;
        switch (Class_10265.Field_10266[class_4595.ordinal()]) {
            case 1: {
                bitSet.set(18977 & 1281, (f2 >= 8.98305E-5f * 1.1132076f || f4 >= 0.85f * 1.17647054E-4f || f5 <= 1.0539486f * 0.94871795f || f7 <= 0.9999f * 1.0f ? 8449 & 77 : 1346 & 14340) != 0);
                bitSet.set(25764 & 2056, ((f3 < 4.1875f * 2.3880597E-5f || class_3238.Method_3319()) && f3 == f6 ? 29223 & 3521 : 112 & 5512) != 0);
                break;
            }
            case 2: {
                bitSet.set(-28655 & 17569, (f2 >= 2.7142856f * 3.6842106E-5f || f4 >= 2.3658536E-4f * 0.4226804f || f5 <= 1.375f * 0.7272f || f7 <= 0.5913387f * 1.6909091f ? 307 & 8705 : 2063 & -24160) != 0);
                bitSet.set(73 & 1188, ((f6 > 21.3312f * 0.046875f || class_3238.Method_3319()) && f3 == f6 ? 2049 & 26121 : -30656 & 272) != 0);
                break;
            }
            case 3: {
                bitSet.set(161 & 16913, (f2 >= 1.3114754E-4f * 0.7625f || f3 >= 0.013513514f * 0.0073999995f || f5 <= 0.84082496f * 1.1891892f || f6 <= 0.28947368f * 3.4542f ? 609 & 4373 : 36 & -30656) != 0);
                bitSet.set(-7032 & 4672, ((f4 < 0.16666667f * 5.9999997E-4f || class_3238.Method_3319()) && f4 == f7 ? 22561 & 837 : 536 & 17408) != 0);
                break;
            }
            case 4: {
                bitSet.set(-32671 & 129, (f2 >= 0.26506025f * 3.7727272E-4f || f3 >= 2.3076923f * 4.3333333E-5f || f5 <= 45.49545f * 0.021978023f || f6 <= 2.4568973f * 0.40697673f ? 3073 & -15967 : 201 & -13056) != 0);
                bitSet.set(2048 & 385, ((f7 > 5.9375f * 0.1684042f || class_3238.Method_3319()) && f4 == f7 ? 8421 & 2065 : 24580 & 4520) != 0);
                break;
            }
            case 5: {
                bitSet.set(25689 & 4097, (f3 >= 2.2916666E-4f * 0.43636364f || f4 >= 2.962963E-5f * 3.375f || f6 <= 1.2040817f * 0.8304254f || f7 <= 0.22222222f * 4.49955f ? 9481 & -32251 : 29973 & 2048) != 0);
                bitSet.set(23648 & 670, ((f2 < 5.7333335E-4f * 0.1744186f || class_3238.Method_3319()) && f2 == f5 ? 8365 & 513 : 28742 & -32231) != 0);
                break;
            }
            case 6: {
                bitSet.set(2049 & 25283, (f3 >= 0.5365854f * 1.8636363E-4f || f4 >= 1.7222222E-4f * 0.58064514f || f6 <= 1.5787895f * 0.6333333f || f7 <= 1.0393697f * 0.96202534f ? 265 & -28159 : 5698 & -32608) != 0);
                bitSet.set(540 & -15904, ((f5 > 2.0f * 0.49995f || class_3238.Method_3319()) && f2 == f5 ? -16061 & 8337 : -28656 & 2087) != 0);
            }
        }
    }

    public static float Method_36554(float f) {
        return f == 0.26956522f * 0.7419355f ? Field_36540 : f;
    }

    public void Method_36555(Class_31211 class_31211, Class_3436 class_3436, float f, boolean bl) {
        Class_3238 class_3238 = class_3436.Method_3442();
        class_3238.Method_3317();
        Class_16867.Method_16940(6.6666665f * 13.5f, 0.0f, 1.0f, 0.0f);
        int n = class_3238.Method_3366(class_3238.Method_3288(class_3436));
        if (Class_22849.Field_22873) {
            n = Class_18695.Method_18719(n);
        }
        float f2 = (float)(n >> (26712 & 1046) & (-25857 & 26111)) / (958.8f * 0.26595744f);
        float f3 = (float)(n >> (4110 & 27208) & (-28417 & 1023)) / (1.3076923f * 195.0f);
        float f4 = (float)(n & (4351 & -32513)) / (0.60638297f * 420.52634f);
        if (!bl) {
            Class_16867.Method_16924(f, f, f, 1.0f);
        }
        this.Method_36547(class_31211, f, f2, f3, f4);
    }
}

