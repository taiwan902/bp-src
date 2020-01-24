/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_32257
extends Class_1906 {
    private Class_4961 Field_32258;
    private static final Logger Field_32259 = LogManager.getLogger();
    private static final Class_2080 Field_32260 = new Class_2080(Class_32257.Method_32263("$$ $ $ $d$$ `$  400404p440040p40\u0004"));
    private boolean Field_32261;
    private Class_46788 Field_32262;

    private static String Method_32263(String string) {
        int n = 27812;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32257.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static void Method_32264(Class_32257 class_32257, String string, int n, int n2) {
        class_32257.\u0000strictfp(string, n, n2);
    }

    protected void Method_32265(float f, int n, int n2) {
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_32260);
        int n3 = (this.\u0000= final - this.\u0000, for) / (1070 & -3710);
        int n4 = (this.\u0000, ` - this.\u0000= int) / (20514 & -24426);
        this.\u0000strictfp(n3, n4, 1024 & 2112, 2146 & 20, this.\u0000, for, this.\u0000= int);
        this.\u0000strictfp.Field_44259 = 67.60564f * 1.4791666f;
        this.\u0000strictfp.Method_44287(new Class_23823(Class_10527.Field_10707), n3 + (-18390 & 17066), n4 + (8557 & 2301));
        this.\u0000strictfp.Method_44287(new Class_23823(Class_10527.Field_10673), n3 + (6571 & -15314) + (25814 & -28610), n4 + (-32659 & 13167));
        this.\u0000strictfp.Method_44287(new Class_23823(Class_10527.Field_10705), n3 + (-15318 & 12399) + (4399 & -16340), n4 + (4205 & 17533));
        this.\u0000strictfp.Method_44287(new Class_23823(Class_10527.Field_10565), n3 + (20266 & -24406) + (5458 & 98), n4 + (237 & -32387));
        this.\u0000strictfp.Field_44259 = 0.0f;
    }

    static void Method_32266(Class_32257 class_32257, String string, int n, int n2) {
        class_32257.\u0000strictfp(string, n, n2);
    }

    public void Method_32267() {
        super.Method_1942();
        int n = this.Field_32258.Method_4973(620 & 16641);
        int n2 = this.Field_32258.Method_4973(513 & 29721);
        int n3 = this.Field_32258.Method_4973(3074 & 4166);
        if (this.Field_32261 && n >= 0) {
            int n4;
            int n5;
            Class_46986 class_46986;
            int n6;
            int n7;
            int n8;
            this.Field_32261 = 6672 & 16517;
            for (n8 = 18945 & 8276; n8 <= (-24410 & 21594); ++n8) {
                n5 = Class_47216.Field_47225[n8].length;
                n6 = n5 * (1118 & -12010) + (n5 - (-8181 & 3109)) * (15111 & 98);
                for (n7 = 64 & 2049; n7 < n5; ++n7) {
                    n4 = Class_47216.Field_47225[n8][n7].Field_8364;
                    class_46986 = new Class_46986(this, n8 << (25737 & 524) | n4, this.\u0000
                     + (29038 & 1613) + n7 * (28 & 18233) - n6 / (21522 & 98), this.\u0000% + (214 & 9238) + n8 * (21081 & 1305), n4, n8);
                    this.\u0000strictfp.add(class_46986);
                    if (n8 >= n) {
                        class_46986.\u0000strictfp = 1040 & -12218;
                        continue;
                    }
                    if (n4 != n2) continue;
                    class_46986.\u0000strictfp((6853 & 1) != 0);
                }
            }
            n8 = -19701 & 16579;
            n5 = Class_47216.Field_47225[n8].length + (1025 & 667);
            n6 = n5 * (2902 & 12438) + (n5 - (19121 & -27645)) * (642 & -23226);
            for (n7 = 4360 & 16432; n7 < n5 - (7201 & -23989); ++n7) {
                n4 = Class_47216.Field_47225[n8][n7].Field_8364;
                class_46986 = new Class_46986(this, n8 << (40 & 1437) | n4, this.\u0000
                 + (255 & 11687) + n7 * (2077 & 12858) - n6 / (18442 & 4214), this.\u0000% + (623 & 47), n4, n8);
                this.\u0000strictfp.add(class_46986);
                if (n8 >= n) {
                    class_46986.\u0000strictfp = 16548 & 4674;
                    continue;
                }
                if (n4 != n3) continue;
                class_46986.\u0000strictfp((931 & 16393) != 0);
            }
            if (n2 > 0) {
                Class_46986 class_469862 = new Class_46986(this, n8 << (1163 & -16120) | n2, this.\u0000
                 + (1191 & 20647) + (n5 - (12693 & 67)) * (17500 & -22215) - n6 / (14498 & 16962), this.\u0000% + (2223 & 12911), n2, n8);
                this.\u0000strictfp.add(class_469862);
                if (n8 >= n) {
                    class_469862.\u0000strictfp = 29728 & -30464;
                } else if (n2 == n3) {
                    class_469862.\u0000strictfp((545 & -14315) != 0);
                }
            }
        }
        this.Field_32262.\u0000strictfp = this.Field_32258.Method_4964(2048 & 1666) != null && n2 > 0 ? -16255 & 8231 : -28540 & 73;
    }

    private void Method_32268() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_2080 Method_32269() {
        return Field_32260;
    }

    static void Method_32270(Class_32257 class_32257, String string, int n, int n2) {
        class_32257.\u0000strictfp(string, n, n2);
    }

    protected void Method_32271(int n, int n2) {
        Class_39477.Method_39484();
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("tile.beacon.primary", new Object[352 & 5128]), -28930 & 8510, 18458 & 1034, 14738656 & -924262172);
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("tile.beacon.secondary", new Object[17286 & 12312]), 18681 & 12975, 2111 & 10, 853860577 & 99868898);
        for (Class_42376 class_42376 : this.\u0000strictfp) {
            if (!class_42376.Method_42405()) continue;
            class_42376.Method_42403(n - this.\u0000
            , n2 - this.\u0000%);
            break;
        }
        Class_39477.Method_39485();
    }

    public void Method_32272() {
        super.Method_1946();
        this.Field_32262 = new Class_46788(this, -1 & -1, this.\u0000
         + (229 & 8612), this.\u0000% + (2159 & 12779));
        this.\u0000strictfp.add(this.Field_32262);
        this.\u0000strictfp.add(new Class_47093(this, -2 & -2, this.\u0000
         + (17854 & 6846), this.\u0000% + (5227 & 24699)));
        this.Field_32261 = 4241 & 1089;
        this.Field_32262.\u0000strictfp = 25344 & -30576;
    }

    protected void Method_32273(Class_42376 class_42376) {
        if (class_42376.Field_42392 == (-2 & -2)) {
            this.\u0000strictfp.Method_218(null);
        } else if (class_42376.Field_42392 == (-1 & -1)) {
            String string = "MC|Beacon";
            Class_29900 class_29900 = new Class_29900(Class_16620.Method_16633());
            class_29900.Method_30010(this.Field_32258.Method_4973(4169 & 2611));
            class_29900.Method_30010(this.Field_32258.Method_4973(4294 & 17154));
            this.\u0000strictfp.Method_271().Method_20245(new Class_28799(string, class_29900));
            this.\u0000strictfp.Method_218(null);
        } else if (class_42376 instanceof Class_46986) {
            if (((Class_46986)class_42376).\u0000, `()) {
                return;
            }
            int n = class_42376.Field_42392;
            int n2 = n & (2559 & 18175);
            int n3 = n >> (-32613 & 14412);
            if (n3 < (8327 & 5123)) {
                this.Field_32258.Method_4970(1625 & -22365, n2);
            } else {
                this.Field_32258.Method_4970(-23534 & 19170, n2);
            }
            this.\u0000strictfp.clear();
            this.Method_32272();
            this.Method_32267();
        }
    }

    public Class_32257(Class_37781 class_37781, Class_4961 class_4961) {
        super(new Class_32215(class_37781, class_4961));
        this.Field_32258 = class_4961;
        this.\u0000, for = 2279 & -6922;
        this.\u0000= int = 6107 & -32517;
    }
}

