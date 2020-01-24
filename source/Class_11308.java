/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

public class Class_11308 {
    private static final int Field_11309 = (int)Math.pow(1.546875 * 10.343434343434344, 0.0);
    private int Field_11310 = 6400 & 12288;
    private final BitSet Field_11311 = new BitSet(7168 & 4216);
    private static final int Field_11312 = (int)Math.pow(0.78125 * 20.48, 1.0);
    private static final int Field_11313 = (int)Math.pow(0.5360824742268041 * 29.846153846153847, 3.918367346938776 * 0.5104166666666666);
    private static final int[] Field_11314 = new int[10058 & 1480];

    private Set Method_11315(int n) {
        EnumSet<Class_4595> enumSet = EnumSet.noneOf(Class_4595.class);
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>(17826 & 8576);
        arrayDeque.add(Class_17583.Method_17586(n));
        this.Field_11311.set(n, (-27391 & 5) != 0);
        while (!arrayDeque.isEmpty()) {
            int n2 = (Integer)arrayDeque.poll();
            this.Method_11321(n2, enumSet);
            Class_4595[] arrclass_4595 = Class_4595.Field_4600;
            int n3 = arrclass_4595.length;
            for (int i = -14325 & 16; i < n3; ++i) {
                Class_4595 class_4595 = arrclass_4595[i];
                int n4 = this.Method_11322(n2, class_4595);
                if (n4 < 0 || this.Field_11311.get(n4)) continue;
                this.Field_11311.set(n4, (-26605 & 105) != 0);
                arrayDeque.add(Class_17583.Method_17586(n4));
            }
        }
        return enumSet;
    }

    static {
        int n = 4673 & -23400;
        int n2 = 149 & 105;
        int n3 = 135 & 1112;
        for (int i = 4113 & -24060; i < (4112 & 980); ++i) {
            for (int j = -18267 & 8; j < (-31724 & 529); ++j) {
                for (int k = 16532 & 6208; k < (-32710 & 2576); ++k) {
                    if (i != 0 && i != (17007 & -26609) && j != 0 && j != (4111 & 16671) && k != 0 && k != (8351 & 4111)) continue;
                    Class_11308.Field_11314[n3++] = Class_11308.Method_11316(i, j, k);
                }
            }
        }
    }

    private static int Method_11316(int n, int n2, int n3) {
        return n << (-22714 & 20513) | n2 << (12 & 5208) | n3 << (-14955 & 4676);
    }

    public void Method_11317(Class_4751 class_4751) {
        this.Field_11311.set(Class_11308.Method_11319(class_4751), (17 & 2569) != 0);
        this.Field_11310 -= 101 & -30447;
    }

    private void Method_11318() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static int Method_11319(Class_4751 class_4751) {
        return Class_11308.Method_11316(class_4751.\u0000= final() & (527 & 4127), class_4751.\u0000, `() & (687 & -32673), class_4751.\u0000strictfp() & (17519 & 14607));
    }

    public Class_12181 Method_11320() {
        Class_12181 class_12181 = new Class_12181();
        if ((-25936 & 4418) - this.Field_11310 < (16715 & 12560)) {
            class_12181.Method_12185((1049 & 3013) != 0);
        } else if (this.Field_11310 == 0) {
            class_12181.Method_12185((8 & -25147) != 0);
        } else {
            int[] arrn = Field_11314;
            int n = arrn.length;
            for (int i = 1703 & 4352; i < n; ++i) {
                int n2 = arrn[i];
                if (this.Field_11311.get(n2)) continue;
                class_12181.Method_12187(this.Method_11315(n2));
            }
        }
        return class_12181;
    }

    private void Method_11321(int n, Set set) {
        int n2 = n >> (-26622 & 17656) & (16687 & 1695);
        if (n2 == 0) {
            set.add(Class_4595.Field_4602);
        } else if (n2 == (-27633 & 19039)) {
            set.add(Class_4595.Field_4603);
        }
        int n3 = n >> (24 & 8520) & (15631 & 17071);
        if (n3 == 0) {
            set.add(Class_4595.Field_4615);
        } else if (n3 == (2079 & 17583)) {
            set.add(Class_4595.Field_4601);
        }
        int n4 = n >> (36 & -31601) & (-31697 & 271);
        if (n4 == 0) {
            set.add(Class_4595.Field_4598);
        } else if (n4 == (8735 & 16655)) {
            set.add(Class_4595.Field_4613);
        }
    }

    private int Method_11322(int n, Class_4595 class_4595) {
        switch (Class_17097.Field_17098[class_4595.ordinal()]) {
            case 1: {
                if ((n >> (4154 & 25032) & (2335 & 15)) == 0) {
                    return -1 & -1;
                }
                return n - Field_11313;
            }
            case 2: {
                if ((n >> (585 & 152) & (559 & -26465)) == (-15729 & 2335)) {
                    return -1 & -1;
                }
                return n + Field_11313;
            }
            case 3: {
                if ((n >> (27732 & 6) & (143 & 6191)) == 0) {
                    return -1 & -1;
                }
                return n - Field_11312;
            }
            case 4: {
                if ((n >> (4822 & 2084) & (1807 & 10255)) == (13327 & 95)) {
                    return -1 & -1;
                }
                return n + Field_11312;
            }
            case 5: {
                if ((n >> (21096 & 3217) & (-24305 & 2063)) == 0) {
                    return -1 & -1;
                }
                return n - Field_11309;
            }
            case 6: {
                if ((n >> (25696 & 2057) & (591 & 6159)) == (15 & 3151)) {
                    return -1 & -1;
                }
                return n + Field_11309;
            }
        }
        return -1 & -1;
    }
}

