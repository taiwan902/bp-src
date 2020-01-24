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

public class Class_26253 {
    private static final List Field_26254;

    static {
        Object[] arrobject = new Class_36948[4111 & 733];
        arrobject[530 & -24320] = new Class_36948(Class_10527.Field_10565, 2657 & 9238, 19585 & 41, 6279 & 357, 347 & 9738);
        arrobject[-32639 & 4913] = new Class_36948(Class_10527.Field_10705, 130 & 8193, -18023 & 16453, -15997 & 3595, 4263 & 3077);
        arrobject[17442 & 2186] = new Class_36948(Class_10527.Field_10564, 17410 & 16, -32762 & 5701, -28659 & 2441, -28569 & 13);
        arrobject[-18413 & 11] = new Class_36948(Class_10527.Field_10623, Class_5393.Field_5406.Method_5436(), 4 & 3084, 16649 & 7213, 4613 & 24669);
        arrobject[-1755 & 1606] = new Class_36948(Class_10527.Field_10673, 16516 & -18422, 3 & 15685, 647 & -16366, 25779 & 6415);
        arrobject[309 & -24379] = new Class_36948(Class_10527.Field_10698, -25600 & 577, 16899 & -27541, 392 & -32724, 8238 & 650);
        arrobject[9862 & -28346] = new Class_36948(Class_10527.Field_10630, 2053 & 24810, 3077 & 16713, 7 & -30717, 2607 & 4239);
        arrobject[17623 & 2063] = new Class_36948(Class_10527.Field_10552, 16406 & 96, 19061 & 4225, 8577 & -15867, -6749 & 85);
        arrobject[25113 & -30584] = new Class_36948(Class_1956.Method_1981(Class_9265.Field_9401), 1664 & 26952, 10564 & -32252, 14856 & 74, 23123 & 1037);
        arrobject[-16055 & 9] = new Class_36948(Class_10527.Field_10576, 1057 & 13056, 82 & 18443, -24563 & 1828, -28658 & 11);
        arrobject[17163 & 3082] = new Class_36948(Class_10527.Field_10578, 8292 & -32630, 4646 & 8202, -11130 & 772, -9718 & 506);
        arrobject[11 & 28859] = new Class_36948(Class_10527.Field_10594, 292 & 12355, 24933 & -31719, 1 & 19921, 1667 & -32733);
        arrobject[15918 & 16540] = new Class_36948(Class_10527.Field_10562, 15468 & -16256, 7 & -28143, -5631 & 45, 4341 & -31487);
        Field_26254 = Lists.newArrayList((Object[])arrobject);
    }

    private void Method_26255() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_26256() {
        Class_34391.Method_34406(Class_16282.class, "MSCorridor");
        Class_34391.Method_34406(Class_23106.class, "MSCrossing");
        Class_34391.Method_34406(Class_23614.class, "MSRoom");
        Class_34391.Method_34406(Class_13393.class, "MSStairs");
    }

    private static Class_13400 Method_26257(Class_13400 class_13400, List list, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4) {
        if (n4 > (-8625 & 8)) {
            return null;
        }
        if (Math.abs(n - class_13400.Method_13415().Field_42668) <= (-8588 & 336) && Math.abs(n3 - class_13400.Method_13415().Field_42669) <= (341 & 4216)) {
            Class_13400 class_134002 = Class_26253.Method_26259(list, random, n, n2, n3, class_4595, n4 + (10433 & 57));
            if (class_134002 != null) {
                list.add(class_134002);
                class_134002.Method_13427(class_13400, list, random);
            }
            return class_134002;
        }
        return null;
    }

    static List Method_26258() {
        return Field_26254;
    }

    private static Class_13400 Method_26259(List list, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4) {
        int n5 = random.nextInt(14189 & -30620);
        if (n5 >= (16477 & 12882)) {
            Class_42666 class_42666 = Class_23106.Method_23109(list, random, n, n2, n3, class_4595);
            if (class_42666 != null) {
                return new Class_23106(n4, random, class_42666, class_4595);
            }
        } else if (n5 >= (110 & 838)) {
            Class_42666 class_42666 = Class_13393.Method_13396(list, random, n, n2, n3, class_4595);
            if (class_42666 != null) {
                return new Class_13393(n4, random, class_42666, class_4595);
            }
        } else {
            Class_42666 class_42666 = Class_16282.Method_16288(list, random, n, n2, n3, class_4595);
            if (class_42666 != null) {
                return new Class_16282(n4, random, class_42666, class_4595);
            }
        }
        return null;
    }

    static Class_13400 Method_26260(Class_13400 class_13400, List list, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4) {
        return Class_26253.Method_26257(class_13400, list, random, n, n2, n3, class_4595, n4);
    }
}

