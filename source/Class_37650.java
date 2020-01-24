/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public abstract class Class_37650
extends Class_13400 {
    protected static final List Field_37651;

    private int Method_37652(List list) {
        int n = -7931 & 5816;
        int n2 = -30446 & 9228;
        for (Class_7452 class_7452 : list) {
            if (class_7452.Field_7454 > 0 && class_7452.Field_7457 < class_7452.Field_7454) {
                n = 1161 & -28399;
            }
            n2 += class_7452.Field_7455;
        }
        return n != 0 ? n2 : -1 & -1;
    }

    static {
        Object[] arrobject = new Class_36948[16653 & -20466];
        arrobject[16460 & -31728] = new Class_36948(Class_10527.Field_10673, 64 & -32604, 25485 & 4161, 4163 & -23281, 5 & 26629);
        arrobject[-23935 & 5417] = new Class_36948(Class_10527.Field_10565, 8203 & 6516, 28803 & 2381, 2565 & -16059, 18063 & 5);
        arrobject[6262 & -32502] = new Class_36948(Class_10527.Field_10705, -16381 & 8196, 31491 & -32651, 8579 & 5139, -32753 & 17167);
        arrobject[24867 & -25449] = new Class_36948(Class_10527.Field_10642, 21523 & 2560, 335 & 17921, 721 & 8483, 16389 & 13549);
        arrobject[-28284 & 2100] = new Class_36948(Class_10527.Field_10683, -14840 & 2514, 16645 & -24359, -26043 & 427, 22629 & 8599);
        arrobject[13981 & 69] = new Class_36948(Class_10527.Field_10615, -32763 & 28720, 1377 & -26093, 17025 & 3345, -10201 & 157);
        arrobject[-16113 & 15590] = new Class_36948(Class_10527.Field_10675, 17536 & 10320, 12295 & 35, 4119 & -32753, 5 & 6237);
        arrobject[-32481 & 7175] = new Class_36948(Class_10527.Field_10594, 2274 & -27640, 16917 & 8225, -22475 & 5123, 15370 & -32422);
        arrobject[4106 & 18504] = new Class_36948(Class_10527.Field_10647, 8257 & 16678, -32767 & 9793, 71 & 13729, 540 & 16841);
        arrobject[43 & 30733] = new Class_36948(Class_10527.Field_10562, -12757 & 8276, 12579 & -32699, 20515 & 2113, 17415 & 12317);
        arrobject[10938 & 4107] = new Class_36948(Class_10527.Field_10542, -32628 & 26738, 1189 & -32245, 17155 & 11285, 8451 & 5123);
        arrobject[1163 & 18459] = new Class_36948(Class_1956.Method_1981(Class_9265.Field_9445), 5904 & 24584, 10370 & 4418, 17316 & 6156, 3074 & 290);
        Field_37651 = Lists.newArrayList((Object[])arrobject);
    }

    protected Class_13400 Method_37653(Class_41963 class_41963, List list, Random random, int n, int n2, boolean bl) {
        if (this.\u0000strictfp != null) {
            switch (Class_45688.Field_45689[this.\u0000strictfp.ordinal()]) {
                case 1: {
                    return this.Method_37659(class_41963, list, random, this.\u0000strictfp.Field_42670 + (523 & -28367), this.\u0000strictfp.Field_42672 + n, this.\u0000strictfp.Field_42669 + n2, Class_4595.Field_4603, this.\u0000strictfp(), bl);
                }
                case 2: {
                    return this.Method_37659(class_41963, list, random, this.\u0000strictfp.Field_42670 + (-15183 & 4111), this.\u0000strictfp.Field_42672 + n, this.\u0000strictfp.Field_42669 + n2, Class_4595.Field_4603, this.\u0000strictfp(), bl);
                }
                case 3: {
                    return this.Method_37659(class_41963, list, random, this.\u0000strictfp.Field_42668 + n2, this.\u0000strictfp.Field_42672 + n, this.\u0000strictfp.Field_42667 + (-26591 & 8587), Class_4595.Field_4613, this.\u0000strictfp(), bl);
                }
                case 4: {
                    return this.Method_37659(class_41963, list, random, this.\u0000strictfp.Field_42668 + n2, this.\u0000strictfp.Field_42672 + n, this.\u0000strictfp.Field_42667 + (-28663 & 17953), Class_4595.Field_4613, this.\u0000strictfp(), bl);
                }
            }
        }
        return null;
    }

    private void Method_37654() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_37650 Method_37655(Class_41963 class_41963, List list, List list2, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4) {
        int n5 = this.Method_37652(list);
        int n6 = n5 > 0 && n4 <= (94 & 4767) ? -28415 & 3073 : -6128 & 0;
        int n7 = 26369 & 2244;
        block0 : while (n7 < (2629 & -32459) && n6 != 0) {
            ++n7;
            int n8 = random.nextInt(n5);
            for (Class_7452 class_7452 : list) {
                if ((n8 -= class_7452.Field_7455) >= 0) continue;
                if (!class_7452.Method_7460(n4) || class_7452 == class_41963.Field_41966 && !class_7452.Field_7453) continue block0;
                Class_37650 class_37650 = Class_9675.Method_9681(class_7452, list2, random, n, n2, n3, class_4595, n4);
                if (class_37650 == null) continue;
                class_7452.Field_7457 += -11761 & 65;
                class_41963.Field_41966 = class_7452;
                if (!class_7452.Method_7458()) {
                    list.remove(class_7452);
                }
                return class_37650;
            }
        }
        return Class_39982.Method_39986(list2, random, n, n2, n3, class_4595, n4);
    }

    public Class_37650() {
    }

    protected static boolean Method_37656(Class_42666 class_42666) {
        return (class_42666 != null && class_42666.Field_42672 > (6682 & 16811) ? 10305 & 259 : 9462 & 2561) != 0;
    }

    protected Class_13400 Method_37657(Class_41963 class_41963, List list, Random random, int n, int n2, boolean bl) {
        if (this.\u0000strictfp != null) {
            switch (Class_45688.Field_45689[this.\u0000strictfp.ordinal()]) {
                case 1: {
                    return this.Method_37659(class_41963, list, random, this.\u0000strictfp.Field_42668 + n, this.\u0000strictfp.Field_42672 + n2, this.\u0000strictfp.Field_42669 - (8193 & 17), this.\u0000strictfp, this.\u0000strictfp(), bl);
                }
                case 2: {
                    return this.Method_37659(class_41963, list, random, this.\u0000strictfp.Field_42668 + n, this.\u0000strictfp.Field_42672 + n2, this.\u0000strictfp.Field_42667 + (9413 & 795), this.\u0000strictfp, this.\u0000strictfp(), bl);
                }
                case 3: {
                    return this.Method_37659(class_41963, list, random, this.\u0000strictfp.Field_42668 - (-16375 & 513), this.\u0000strictfp.Field_42672 + n2, this.\u0000strictfp.Field_42669 + n, this.\u0000strictfp, this.\u0000strictfp(), bl);
                }
                case 4: {
                    return this.Method_37659(class_41963, list, random, this.\u0000strictfp.Field_42670 + (1153 & 2135), this.\u0000strictfp.Field_42672 + n2, this.\u0000strictfp.Field_42669 + n, this.\u0000strictfp, this.\u0000strictfp(), bl);
                }
            }
        }
        return null;
    }

    protected void Method_37658(Class_1699 class_1699) {
    }

    private Class_13400 Method_37659(Class_41963 class_41963, List list, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4, boolean bl) {
        if (Math.abs(n - class_41963.\u0000strictfp().Field_42668) <= (9331 & -25992) && Math.abs(n3 - class_41963.\u0000strictfp().Field_42669) <= (20598 & -21384)) {
            Class_37650 class_37650;
            List list2 = class_41963.Field_41967;
            if (bl) {
                list2 = class_41963.Field_41965;
            }
            if ((class_37650 = this.Method_37655(class_41963, list2, list, random, n, n2, n3, class_4595, n4 + (3105 & 607))) != null) {
                list.add(class_37650);
                class_41963.Field_41964.add(class_37650);
            }
            return class_37650;
        }
        return Class_39982.Method_39986(list, random, n, n2, n3, class_4595, n4);
    }

    protected Class_37650(int n) {
        super(n);
    }

    protected void Method_37660(Class_1699 class_1699) {
    }

    protected Class_13400 Method_37661(Class_41963 class_41963, List list, Random random, int n, int n2, boolean bl) {
        if (this.\u0000strictfp != null) {
            switch (Class_45688.Field_45689[this.\u0000strictfp.ordinal()]) {
                case 1: {
                    return this.Method_37659(class_41963, list, random, this.\u0000strictfp.Field_42668 - (1161 & 4353), this.\u0000strictfp.Field_42672 + n, this.\u0000strictfp.Field_42669 + n2, Class_4595.Field_4602, this.\u0000strictfp(), bl);
                }
                case 2: {
                    return this.Method_37659(class_41963, list, random, this.\u0000strictfp.Field_42668 - (24601 & 131), this.\u0000strictfp.Field_42672 + n, this.\u0000strictfp.Field_42669 + n2, Class_4595.Field_4602, this.\u0000strictfp(), bl);
                }
                case 3: {
                    return this.Method_37659(class_41963, list, random, this.\u0000strictfp.Field_42668 + n2, this.\u0000strictfp.Field_42672 + n, this.\u0000strictfp.Field_42669 - (11269 & 21313), Class_4595.Field_4598, this.\u0000strictfp(), bl);
                }
                case 4: {
                    return this.Method_37659(class_41963, list, random, this.\u0000strictfp.Field_42668 + n2, this.\u0000strictfp.Field_42672 + n, this.\u0000strictfp.Field_42669 - (5123 & 8477), Class_4595.Field_4598, this.\u0000strictfp(), bl);
                }
            }
        }
        return null;
    }
}

