/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_23106
extends Class_13400 {
    private Class_4595 Field_23107;
    private boolean Field_23108;

    public static Class_42666 Method_23109(List list, Random random, int n, int n2, int n3, Class_4595 class_4595) {
        Class_42666 class_42666 = new Class_42666(n, n2, n3, n, n2 + (514 & 8263), n3);
        if (random.nextInt(-18844 & 18828) == 0) {
            class_42666.Field_42671 += 8294 & 3468;
        }
        switch (Class_31128.Field_31129[class_4595.ordinal()]) {
            case 1: {
                class_42666.Field_42668 = n - (16385 & -31343);
                class_42666.Field_42670 = n + (-18165 & 7);
                class_42666.Field_42669 = n3 - (2084 & -32418);
                break;
            }
            case 2: {
                class_42666.Field_42668 = n - (17 & 18245);
                class_42666.Field_42670 = n + (11107 & -28669);
                class_42666.Field_42667 = n3 + (2052 & 28933);
                break;
            }
            case 3: {
                class_42666.Field_42668 = n - (4 & 11556);
                class_42666.Field_42669 = n3 - (129 & 27137);
                class_42666.Field_42667 = n3 + (8931 & -14321);
                break;
            }
            case 4: {
                class_42666.Field_42670 = n + (2276 & 12295);
                class_42666.Field_42669 = n3 - (2241 & -19945);
                class_42666.Field_42667 = n3 + (-32249 & 21547);
            }
        }
        return Class_13400.Method_13426(list, class_42666) != null ? null : class_42666;
    }

    private void Method_23110() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23106() {
    }

    public void Method_23111(Class_13400 class_13400, List list, Random random) {
        int n = this.\u0000strictfp();
        switch (Class_31128.Field_31129[this.Field_23107.ordinal()]) {
            case 1: {
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 + (4225 & 8229), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 - (-32157 & 11649), Class_4595.Field_4598, n);
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 - (-32503 & 14503), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 + (16385 & 221), Class_4595.Field_4602, n);
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42670 + (525 & -12287), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 + (8227 & -29111), Class_4595.Field_4603, n);
                break;
            }
            case 2: {
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 + (1829 & 10385), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42667 + (24901 & 2067), Class_4595.Field_4613, n);
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 - (18273 & 12293), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 + (19217 & 77), Class_4595.Field_4602, n);
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42670 + (8229 & 17601), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 + (1217 & -5847), Class_4595.Field_4603, n);
                break;
            }
            case 3: {
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 + (-30709 & 13441), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 - (10437 & 1539), Class_4595.Field_4598, n);
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 + (5379 & 10369), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42667 + (6273 & 331), Class_4595.Field_4613, n);
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 - (-28411 & 8419), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 + (5157 & 579), Class_4595.Field_4602, n);
                break;
            }
            case 4: {
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 + (37 & 3585), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 - (193 & 2307), Class_4595.Field_4598, n);
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 + (-31997 & 9257), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42667 + (-15871 & 169), Class_4595.Field_4613, n);
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42670 + (-32511 & 2635), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 + (769 & 16389), Class_4595.Field_4603, n);
            }
        }
        if (this.Field_23108) {
            if (random.nextBoolean()) {
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 + (275 & -10751), this.\u0000strictfp.Field_42672 + (1627 & -30301) + (-24479 & 16901), this.\u0000strictfp.Field_42669 - (-15215 & 2857), Class_4595.Field_4598, n);
            }
            if (random.nextBoolean()) {
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 - (-32183 & 385), this.\u0000strictfp.Field_42672 + (17819 & 8231) + (-24567 & 1571), this.\u0000strictfp.Field_42669 + (13121 & 173), Class_4595.Field_4602, n);
            }
            if (random.nextBoolean()) {
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42670 + (2081 & 16657), this.\u0000strictfp.Field_42672 + (5715 & 10403) + (12385 & 3843), this.\u0000strictfp.Field_42669 + (16593 & 15), Class_4595.Field_4603, n);
            }
            if (random.nextBoolean()) {
                Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 + (25107 & 1157), this.\u0000strictfp.Field_42672 + (4899 & 1223) + (4179 & 8453), this.\u0000strictfp.Field_42667 + (193 & 16937), Class_4595.Field_4613, n);
            }
        }
    }

    protected void Method_23112(Class_1699 class_1699) {
        class_1699.Method_1706("tf", this.Field_23108);
        class_1699.Method_1739("D", this.Field_23107.Method_4619());
    }

    protected void Method_23113(Class_1699 class_1699) {
        this.Field_23108 = class_1699.Method_1733("tf");
        this.Field_23107 = Class_4595.Method_4628(class_1699.Method_1738("D"));
    }

    public boolean Method_23114(Class_283 class_283, Random random, Class_42666 class_42666) {
        if (this.\u0000strictfp(class_283, class_42666)) {
            return (-32380 & 1) != 0;
        }
        if (this.Field_23108) {
            this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42668 + (6785 & -24311), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669, this.\u0000strictfp.Field_42670 - (8465 & -15839), this.\u0000strictfp.Field_42672 + (-10161 & 1059) - (-26343 & 1665), this.\u0000strictfp.Field_42667, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (1286 & 2593) != 0);
            this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42668, this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 + (9249 & 6341), this.\u0000strictfp.Field_42670, this.\u0000strictfp.Field_42672 + (18115 & 6167) - (10241 & 81), this.\u0000strictfp.Field_42667 - (4113 & 16457), (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (16384 & 12377) != 0);
            this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42668 + (-26815 & 16401), this.\u0000strictfp.Field_42671 - (2050 & 30), this.\u0000strictfp.Field_42669, this.\u0000strictfp.Field_42670 - (20515 & 2313), this.\u0000strictfp.Field_42671, this.\u0000strictfp.Field_42667, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (352 & 16908) != 0);
            this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42668, this.\u0000strictfp.Field_42671 - (16934 & -18413), this.\u0000strictfp.Field_42669 + (1025 & 961), this.\u0000strictfp.Field_42670, this.\u0000strictfp.Field_42671, this.\u0000strictfp.Field_42667 - (-29109 & 401), (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (-21302 & 4128) != 0);
            this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42668 + (397 & 1), this.\u0000strictfp.Field_42672 + (-15613 & 5123), this.\u0000strictfp.Field_42669 + (10249 & -27467), this.\u0000strictfp.Field_42670 - (5 & -15991), this.\u0000strictfp.Field_42672 + (131 & 25099), this.\u0000strictfp.Field_42667 - (15635 & 521), (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (-32631 & 21348) != 0);
        } else {
            this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42668 + (20753 & 1097), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669, this.\u0000strictfp.Field_42670 - (-32693 & 4129), this.\u0000strictfp.Field_42671, this.\u0000strictfp.Field_42667, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (69 & 16680) != 0);
            this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42668, this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 + (9345 & 337), this.\u0000strictfp.Field_42670, this.\u0000strictfp.Field_42671, this.\u0000strictfp.Field_42667 - (4353 & 27185), (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (17666 & -32223) != 0);
        }
        this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42668 + (8203 & 18085), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 + (4361 & 9345), this.\u0000strictfp.Field_42668 + (5213 & -22271), this.\u0000strictfp.Field_42671, this.\u0000strictfp.Field_42669 + (20931 & 2569), (Class_3436)Class_9265.Field_9379.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (-24064 & 322) != 0);
        this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42668 + (1 & 19511), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42667 - (19241 & -32763), this.\u0000strictfp.Field_42668 + (-11773 & 289), this.\u0000strictfp.Field_42671, this.\u0000strictfp.Field_42667 - (4113 & 325), (Class_3436)Class_9265.Field_9379.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (2079 & 0) != 0);
        this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42670 - (12961 & -13221), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 + (16709 & 10249), this.\u0000strictfp.Field_42670 - (-14319 & 5), this.\u0000strictfp.Field_42671, this.\u0000strictfp.Field_42669 + (-28635 & 16913), (Class_3436)Class_9265.Field_9379.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (6432 & -15350) != 0);
        this.\u0000strictfp(class_283, class_42666, this.\u0000strictfp.Field_42670 - (19 & 9065), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42667 - (20497 & 10497), this.\u0000strictfp.Field_42670 - (11801 & -32703), this.\u0000strictfp.Field_42671, this.\u0000strictfp.Field_42667 - (1073 & 8463), (Class_3436)Class_9265.Field_9379.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (18946 & 4148) != 0);
        for (int i = this.\u0000strictfp.Field_42668; i <= this.\u0000strictfp.Field_42670; ++i) {
            for (int j = this.\u0000strictfp.Field_42669; j <= this.\u0000strictfp.Field_42667; ++j) {
                if (this.\u0000strictfp(class_283, i, this.\u0000strictfp.Field_42672 - (8833 & 17425), j, class_42666).Method_3442().Method_3373() != Class_3713.Field_3718) continue;
                this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9379.Method_3293(), i, this.\u0000strictfp.Field_42672 - (-15295 & 8481), j, class_42666);
            }
        }
        return (10243 & 5397) != 0;
    }

    public Class_23106(int n, Random random, Class_42666 class_42666, Class_4595 class_4595) {
        super(n);
        this.Field_23107 = class_4595;
        this.\u0000strictfp = class_42666;
        this.Field_23108 = class_42666.Method_42686() > (8195 & 5899) ? 8331 & 19253 : 17944 & 448;
    }
}

