/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ 
 *  \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ $ native private ` final ] 2 extends float ? boolean
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import pl.blazingpack.fastutils.FastRandom;

public class Class_570
extends Class_283 {
    private \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean Field_571 = new \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean(458 & 4116, -28414 & 16553, 16407 & -30136, 10531 & 523);
    private final Class_44898 Field_572 = new Class_44898(-29670 & 29696);
    private final Set Field_573 = Sets.newHashSet();
    private Class_20715 Field_574;
    public boolean Field_575;
    private Class_20165 Field_576;
    Class_4452 Field_577 = new Class_4452();
    private final Set Field_578 = Sets.newHashSet();
    private FastRandom Field_579 = new FastRandom(System.currentTimeMillis());
    public final Class_18 Field_580 = Class_18.Field_89;

    public Class_13220 Method_581(Class_13268 class_13268) {
        Class_13220 class_13220 = super.Method_504(class_13268);
        class_13220.Method_13232("Forced entities", new Class_32312(this));
        class_13220.Method_13232("Retry entities", new Class_8456(this));
        class_13220.Method_13232("Server brand", new Class_30182(this));
        class_13220.Method_13232("Server type", new Class_7790(this));
        return class_13220;
    }

    public Class_17665 Method_582(Class_4751 class_4751) {
        return this.Method_587(class_4751.\u0000= final() >> (261 & -23540), class_4751.\u0000strictfp() >> (-16331 & 2124));
    }

    public int Method_583(Class_4751 class_4751) {
        if (this.Field_575 && !((Boolean)this.Field_580.Field_84.Field_39732.Field_8846.\u0000strictfp()).booleanValue()) {
            return -32737 & 719;
        }
        if (class_4751.\u0000, `() < 0) {
            return -32160 & 15388;
        }
        if (class_4751.\u0000, `() >= (2316 & 864)) {
            class_4751 = new Class_4751(class_4751.\u0000= final(), 767 & 14591, class_4751.\u0000strictfp());
        }
        return this.Method_582(class_4751).Method_17741(class_4751, -12278 & 10276);
    }

    public void Method_584(Class_20976 class_20976) {
        this.\u0000strictfp = class_20976;
    }

    public void Method_585(Class_6778 class_6778, int n, int n2, int n3, int n4) {
        if (this.\u0000, `(n, n2, n3) && this.Method_619(n, n2, n3)) {
            Class_17665 class_17665 = this.Method_616(n, n3);
            class_17665.Method_17773(class_6778, n, n2, n3, n4);
            this.\u0000, `(new Class_4751(n, n2, n3));
        }
    }

    protected void Method_586() {
    }

    public Class_17665 Method_587(int n, int n2) {
        return this.Field_574.Method_20737(n, n2);
    }

    protected void Method_588(Class_1061 class_1061) {
        super.Method_468(class_1061);
        if (this.Field_573.contains(class_1061)) {
            this.Field_573.remove(class_1061);
        }
    }

    public void Method_589(double d, double d2, double d3, String string, float f, float f2, boolean bl) {
        double d4 = this.Field_580.Method_246().Method_1337(d, d2, d3);
        Class_29471 class_29471 = new Class_29471(new Class_2080(string), f, f2, (float)d, (float)d2, (float)d3);
        if (bl && d4 > 48.9795918367347 * 2.0416666666666665) {
            double d5 = Math.sqrt(d4) / (13.191489361702128 * 3.032258064516129);
            this.Field_580.Method_245().Method_29108(class_29471, (int)(d5 * (17.22222222222222 * 1.1612903225806452)));
        } else {
            this.Field_580.Method_245().Method_29119(class_29471);
        }
    }

    public int Method_590(int n, int n2, int n3, boolean bl) {
        if (this.Field_575 && !((Boolean)this.Field_580.Field_84.Field_39732.Field_8846.\u0000strictfp()).booleanValue()) {
            return -21905 & 17807;
        }
        if (n >= (-12665724 & -29934414) && n3 >= (-29967200 & -21086592) && n < (-2117483639 & 1943794624) && n3 < (466340804 & 566875042)) {
            if (bl && this.\u0000strictfp(n, n2, n3).Method_3442().Method_3304()) {
                int n4 = this.Method_590(n, n2 + (2405 & 5251), n3, (4311 & -23000) != 0);
                int n5 = this.Method_590(n + (593 & 1161), n2, n3, (1225 & 26884) != 0);
                int n6 = this.Method_590(n - (-29557 & 8197), n2, n3, (17544 & 10242) != 0);
                int n7 = this.Method_590(n, n2, n3 + (-32699 & 1579), (1024 & 2100) != 0);
                int n8 = this.Method_590(n, n2, n3 - (12289 & -15125), (-32211 & 4096) != 0);
                if (n5 > n4) {
                    n4 = n5;
                }
                if (n6 > n4) {
                    n4 = n6;
                }
                if (n7 > n4) {
                    n4 = n7;
                }
                if (n8 > n4) {
                    n4 = n8;
                }
                return n4;
            }
            if (n2 < 0) {
                return 7720 & 16466;
            }
            if (n2 >= (2305 & 268)) {
                n2 = 255 & -15873;
            }
            Class_17665 class_17665 = this.Method_616(n, n3);
            return class_17665.Method_17738(n, n2, n3, this.\u0000, `);
        }
        return -32737 & 3215;
    }

    public void Method_591(int n, Class_1061 class_1061) {
        Class_1061 class_10612 = this.Method_601(n);
        if (class_10612 != null) {
            this.Method_620(class_10612);
        }
        this.Field_578.add(class_1061);
        class_1061.Method_1366(n);
        if (!this.Method_613(class_1061)) {
            this.Field_573.add(class_1061);
        }
        this.\u0000strictfp.Method_29453(n, class_1061);
    }

    public int Method_592(int n, int n2, int n3, int n4) {
        int n5 = this.Method_593(Class_6778.Field_6781, n, n2, n3);
        int n6 = this.Method_593(Class_6778.Field_6780, n, n2, n3);
        if (n6 < n4) {
            n6 = n4;
        }
        return n5 << (8213 & -28610) | n6 << (1508 & 25110);
    }

    public int Method_593(Class_6778 class_6778, int n, int n2, int n3) {
        if (this.\u0000strictfp.Method_18370() && class_6778 == Class_6778.Field_6781) {
            return 1408 & 10247;
        }
        if (n2 < 0) {
            n2 = 640 & 5376;
        }
        if (!this.\u0000, `(n, n2, n3)) {
            return class_6778.Field_6779;
        }
        Class_17665 class_17665 = this.Method_616(n, n3);
        Class_3677 class_3677 = class_17665.Method_17726(n, n2, n3);
        if (class_3677.Method_3688().Method_3304()) {
            int n4 = this.Method_599(class_6778, n, n2 + (6289 & 8197), n3);
            int n5 = this.Method_599(class_6778, n + (13633 & 17053), n2, n3);
            int n6 = this.Method_599(class_6778, n - (28961 & 3165), n2, n3);
            int n7 = this.Method_599(class_6778, n, n2, n3 + (643 & 65));
            int n8 = this.Method_599(class_6778, n, n2, n3 - (6149 & 17193));
            if (n5 > n4) {
                n4 = n5;
            }
            if (n6 > n4) {
                n4 = n6;
            }
            if (n7 > n4) {
                n4 = n7;
            }
            if (n8 > n4) {
                n4 = n8;
            }
            return n4;
        }
        return class_17665.Method_17727(class_6778, n, n2, n3);
    }

    static Set Method_594(Class_570 class_570) {
        return class_570.Field_578;
    }

    public void Method_595(double d, double d2, double d3, double d4, double d5, double d6, Class_1699 class_1699) {
        this.Field_580.Field_129.Method_27564(new Class_42862(this, d, d2, d3, d4, d5, d6, this.Field_580.Field_129, class_1699));
    }

    static Set Method_596(Class_570 class_570) {
        return class_570.Field_573;
    }

    public void Method_597(int n, int n2, boolean bl) {
        if (bl) {
            this.Field_574.Method_20730(n, n2);
        } else {
            this.Field_574.Method_20721(n, n2);
        }
        if (!bl) {
            this.\u0000, `(n * (17168 & -30669), 2 & -24312, n2 * (26 & 3765), n * (-28524 & 8272) + (-25393 & 24847), 4354 & 8592, n2 * (-10314 & 8216) + (-20465 & 16799));
        }
    }

    public void Method_598(long l) {
        if (l < (-1121681887709495039L & 1121681887132730372L)) {
            l = -l;
            this.\u0000strictfp().Method_7528("doDaylightCycle", "false");
        } else {
            this.\u0000strictfp().Method_7528("doDaylightCycle", "true");
        }
        super.Method_535(l);
    }

    public int Method_599(Class_6778 class_6778, int n, int n2, int n3) {
        if (n2 < 0) {
            n2 = 136 & 4181;
        }
        if (!this.\u0000, `(n, n2, n3)) {
            return class_6778.Field_6779;
        }
        if (!this.Method_619(n, n2, n3)) {
            return class_6778.Field_6779;
        }
        if (this.Field_575 && !((Boolean)this.Field_580.Field_84.Field_39732.Field_8846.\u0000strictfp()).booleanValue()) {
            return 2175 & 21135;
        }
        Class_17665 class_17665 = this.Method_616(n, n3);
        return class_17665.Method_17727(class_6778, n, n2, n3);
    }

    public boolean Method_600(int n, int n2, int n3, boolean bl) {
        return (!this.\u0000, `(n, n2, n3) ? 8200 & 18548 : this.Method_624(n >> (8725 & 3334), n3 >> (6975 & -16380), bl)) != 0;
    }

    public Class_1061 Method_601(int n) {
        Class_1378 class_1378 = this.Field_580.Field_48;
        if (class_1378 == null) {
            return null;
        }
        return n == class_1378.\u0000, `() ? class_1378 : super.Method_343(n);
    }

    protected int Method_602(Class_4751 class_4751, Class_6778 class_6778) {
        if (this.Field_575 && !((Boolean)this.Field_580.Field_84.Field_39732.Field_8846.\u0000strictfp()).booleanValue()) {
            return 11151 & 4159;
        }
        if (class_6778 == Class_6778.Field_6781 && this.\u0000, for(class_4751)) {
            return 4303 & 527;
        }
        Class_3238 class_3238 = this.Method_611(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp()).Method_3688();
        int n = class_6778 == Class_6778.Field_6781 ? 2836 & 128 : class_3238.Method_3355();
        int n2 = class_3238.Method_3384();
        if (n2 >= (4127 & 8975) && class_3238.Method_3355() > 0) {
            n2 = 25665 & 5037;
        }
        if (n2 < (19397 & 4147)) {
            n2 = 131 & 17445;
        }
        if (n2 >= (303 & -7665)) {
            return 8576 & 16944;
        }
        if (n >= (783 & 8206)) {
            return n;
        }
        Class_4595[] arrclass_4595 = Class_4595.Field_4600;
        int n3 = arrclass_4595.length;
        for (int i = 136 & 609; i < n3; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            Class_4751 class_47512 = class_4751.Method_4767(class_4595, (Class_4810)this.Field_577.get());
            int n4 = this.Method_615(class_6778, class_47512) - n2;
            if (n4 > n) {
                n = n4;
            }
            if (n < (22670 & -32210)) continue;
            return n;
        }
        return n;
    }

    public boolean Method_603(Class_6778 class_6778, Class_4751 class_4751) {
        if (!this.Method_624(class_4751.\u0000= final() >> (16420 & 12420), class_4751.\u0000strictfp() >> (68 & -11610), (16464 & 11268) != 0)) {
            return (20612 & -32766) != 0;
        }
        if (!this.\u0000strictfp(class_4751, -30701 & 145, (8309 & 16642) != 0)) {
            return (304 & 8704) != 0;
        }
        Class_17665 class_17665 = this.Method_587(class_4751.\u0000= final() >> (108 & 2308), class_4751.\u0000strictfp() >> (-28403 & 2052));
        if (!class_17665.Method_17708().Field_326) {
            return this.Method_622(class_6778, class_4751, class_17665, null);
        }
        class_17665.Field_17687.incrementAndGet();
        class_17665.Field_17683 = class_17665.Method_17708().Method_363();
        ArrayList<Class_17665> arrayList = new ArrayList<Class_17665>();
        int n = class_4751.\u0000= final();
        int n2 = class_4751.\u0000strictfp();
        for (int i = (n >> (1540 & -12012)) - (19 & -14263); i <= (n >> (4 & 2831)) + (49 & 30723); ++i) {
            for (int j = (n2 >> (1063 & -20476)) - (29697 & 695); j <= (n2 >> (1229 & 772)) + (2085 & -15975); ++j) {
                if (i == n >> (2348 & 12373) || j == n2 >> (580 & 16660) || !this.Method_624(i, j, (24584 & 1347) != 0)) continue;
                Class_17665 class_176652 = this.Method_587(i, j);
                class_176652.Field_17687.incrementAndGet();
                class_176652.Field_17683 = class_17665.Method_17708().Method_363();
                arrayList.add(class_176652);
            }
        }
        if (!Class_18.Field_89.Method_140()) {
            return this.Method_622(class_6778, class_4751, class_17665, arrayList);
        }
        if (class_4751 instanceof Class_4810) {
            class_4751 = new Class_4751(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp());
        }
        Class_4751 class_47512 = class_4751;
        this.\u0000strictfp.submit(new Class_20751(this, class_6778, class_47512, class_17665, arrayList));
        return (4103 & 8225) != 0;
    }

    public boolean Method_604(Class_4751 class_4751, Class_3436 class_3436) {
        int n = class_4751.\u0000= final();
        int n2 = class_4751.\u0000, `();
        int n3 = class_4751.\u0000strictfp();
        this.Method_612(n, n2, n3, n, n2, n3);
        return super.Method_462(class_4751, class_3436, 539 & 9223);
    }

    public Class_3677 Method_605(Class_4751 class_4751) {
        return this.Method_611(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp());
    }

    public void Method_606(int n, int n2, int n3) {
        int n4 = 176 & 18453;
        int n5 = n4 / (-24574 & 2491);
        Random random = new Random();
        Class_23823 class_23823 = this.Field_580.Field_48.\u0000strictfp();
        int n6 = this.Field_580.Field_61.Method_11771() == Class_35650.Field_35657 && class_23823 != null && Class_3238.Method_3345(class_23823.Method_23844()) == Class_9265.Field_9412 ? 193 & -18429 : 4106 & 18513;
        \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean  native private ` final ] 2 extends float ? boolean2 = this.Field_571;
        n -= n5;
        n2 -= n5;
        n3 -= n5;
        FastRandom fastRandom = this.Field_579;
        int n7 = 8692 & 2036;
        if (n6 != 0) {
            n7 = 1000 & 17390;
        }
        for (int i = 16402 & -29696; i < n7; ++i) {
            int n8 = n + fastRandom.\u0000, `(n4);
            int n9 = n2 + fastRandom.\u0000, `(n4);
            int n10 = n3 + fastRandom.\u0000, `(n4);
             native private ` final ] 2 extends float ? boolean2.\u0000strictfp(n8, n9, n10);
            Class_3677 class_3677 = this.Method_611(n8, n9, n10);
            class_3677.Method_3688().Method_3391(this, (Class_4751) native private ` final ] 2 extends float ? boolean2, class_3677, random);
            if (n6 == 0 || class_3677.Method_3688() != Class_9265.Field_9412) continue;
            this.\u0000strictfp(Class_40274.Field_40284, (double)n8 + 0.11764705882352941 * 4.25, (double)n9 + 2.0 * 0.25, (double)n10 + 0.2903225806451613 * 1.722222222222222, 0.0, 0.0, 0.0, new int[27072 & 1042]);
        }
    }

    protected Class_12166 Method_607() {
        this.Field_574 = new Class_20715(this);
        return this.Field_574;
    }

    public void Method_608(Class_4751 class_4751, String string, float f, float f2, boolean bl) {
        this.Method_589((double)class_4751.\u0000= final() + 0.3064516129032258 * 1.631578947368421, (double)class_4751.\u0000, `() + 1.9130434782608696 * 0.26136363636363635, (double)class_4751.\u0000strictfp() + 0.328125 * 1.5238095238095237, string, f, f2, bl);
    }

    protected void Method_609(Class_1061 class_1061) {
        super.Method_543(class_1061);
        int n = -11759 & 10276;
        if (this.Field_578.contains(class_1061)) {
            if (class_1061.Method_1285()) {
                this.Field_573.add(class_1061);
                n = 9297 & 4645;
            } else {
                this.Field_578.remove(class_1061);
            }
        }
    }

    protected int Method_610() {
        return this.Field_580.Field_84.Field_39801;
    }

    public Class_570(Class_20165 class_20165, Class_9780 class_9780, int n, Class_26801 class_26801, Class_2767 class_2767) {
        super(new Class_44391(), new Class_31717(class_9780, "MpServer"), Class_18343.Method_18354(n), class_2767, (6481 & 553) != 0);
        this.Field_576 = class_20165;
        this.\u0000strictfp().Method_31801(class_26801);
        this.\u0000strictfp.Method_18359(this);
        this.\u0000strictfp(new Class_4751(-32738 & 18376, -14751 & 8276, 1544 & -28533));
        this.\u0000strictfp = this.Method_607();
        this.\u0000strictfp = new Class_39524();
        this.\u0000= switch();
        this.\u0000, 2();
    }

    public Class_3677 Method_611(int n, int n2, int n3) {
        if (!this.\u0000, `(n, n2, n3)) {
            return Class_9265.Field_9351.Method_3293();
        }
        Class_17665 class_17665 = this.Method_616(n, n3);
        return class_17665.Method_17726(n, n2, n3);
    }

    public void Method_612(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    public boolean Method_613(Class_1061 class_1061) {
        boolean bl = super.Method_350(class_1061);
        this.Field_578.add(class_1061);
        if (!bl) {
            this.Field_573.add(class_1061);
        } else if (class_1061 instanceof Class_15933) {
            this.Field_580.Method_245().Method_29119(new Class_39339((Class_15933)class_1061));
        }
        return bl;
    }

    public Class_1061 Method_614(int n) {
        Class_1061 class_1061 = (Class_1061)this.\u0000strictfp.Method_29446(n);
        if (class_1061 != null) {
            this.Field_578.remove(class_1061);
            this.Method_620(class_1061);
        }
        return class_1061;
    }

    public int Method_615(Class_6778 class_6778, Class_4751 class_4751) {
        return this.Method_599(class_6778, class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp());
    }

    public Class_17665 Method_616(int n, int n2) {
        return this.Method_587(n >> (404 & -28124), n2 >> (-28603 & 30));
    }

    private void Method_617() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_618() {
        if (this.Field_576.Field_20168 != null && this.Field_576.Field_20168.Field_29741) {
            this.Field_576.Method_20230().Field_44590.Method_26110().Method_19096((8192 & -11968) != 0);
            byte[] arrby = new byte[1195 & -22507];
            arrby[2128 & -16222] = 26913 & -27645;
            this.Field_576.Field_20181.Method_44629(new Class_28799("bp:close", arrby));
        } else {
            this.Field_576.Method_20230().Method_44622(new Class_2840("Quitting"));
        }
    }

    public boolean Method_619(int n, int n2, int n3) {
        return this.Method_600(n, n2, n3, (26753 & 5153) != 0);
    }

    public void Method_620(Class_1061 class_1061) {
        super.Method_474(class_1061);
        this.Field_578.remove(class_1061);
    }

    public void Method_621() {
        super.Method_373();
        this.\u0000, `(this.\u0000, `() + (1409292565L & 163875L));
        if (this.\u0000strictfp().Method_7529("doDaylightCycle")) {
            this.Method_598(this.\u0000= final() + (805881989L & 4474878042922295305L));
        }
        this.\u0000strictfp.Method_2789("reEntryProcessing");
        for (int i = 1808 & 2124; i < (4106 & -29362) && !this.Field_573.isEmpty(); ++i) {
            Class_1061 class_1061 = (Class_1061)this.Field_573.iterator().next();
            this.Field_573.remove(class_1061);
            if (this.\u0000, for.contains(class_1061)) continue;
            this.Method_613(class_1061);
        }
        this.\u0000strictfp.Method_2783("chunkCache");
        this.Field_574.Method_20725();
        this.\u0000strictfp.Method_2783("blocks");
        this.Method_623();
        this.\u0000strictfp.Method_2790();
    }

    public boolean Method_622(Class_6778 class_6778, Class_4751 class_4751, Class_17665 class_17665, ArrayList arrayList) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        if (class_17665 == null) {
            return (0 & 8) != 0;
        }
        if (this.Field_575 && !((Boolean)this.Field_580.Field_84.Field_39732.Field_8846.\u0000strictfp()).booleanValue()) {
            return (-31229 & 16485) != 0;
        }
        int n10 = -30131 & 24720;
        int n11 = 1539 & -15936;
        if (!this.\u0000
        ) {
            this.\u0000strictfp.Method_2789("getBrightness");
        }
        int n12 = this.Method_615(class_6778, class_4751);
        int n13 = this.Method_602(class_4751, class_6778);
        int n14 = class_4751.\u0000= final();
        int n15 = class_4751.\u0000, `();
        int n16 = class_4751.\u0000strictfp();
        int[] arrn = this.\u0000strictfp;
        if (n13 > n12) {
            arrn[n11++] = 17022433 & 738609722;
        } else if (n13 < n12) {
            arrn[n11++] = -1802097822 & 570558624 | n12 << (14355 & 17562);
            while (n10 < n11) {
                int n17 = arrn[n10++];
                n6 = (n17 & (20671 & 9279)) - (18043 & 4128) + n14;
                n2 = (n17 >> (46 & 3286) & (10111 & 16447)) - (22576 & 8224) + n15;
                n3 = (n17 >> (268 & 8252) & (4159 & -31681)) - (16688 & 2594) + n16;
                n9 = n17 >> (2066 & 22) & (-6065 & 143);
                n4 = this.Method_599(class_6778, n6, n2, n3);
                if (n4 != n9) continue;
                this.Method_585(class_6778, n6, n2, n3, 0 & 1706);
                if (n9 <= 0 || (n8 = Class_13337.Method_13382(n6 - n14)) + (n7 = Class_13337.Method_13382(n2 - n15)) + (n5 = Class_13337.Method_13382(n3 - n16)) >= (4119 & 16657)) continue;
                Class_4595[] arrclass_4595 = Class_4595.Field_4600;
                n = arrclass_4595.length;
                for (int i = 21634 & 2056; i < n; ++i) {
                    Class_4595 class_4595 = arrclass_4595[i];
                    int n18 = n6 + class_4595.Method_4654();
                    int n19 = n2 + class_4595.Method_4633();
                    int n20 = n3 + class_4595.Method_4656();
                    int n21 = Math.max(24715 & 2113, this.Method_611(n18, n19, n20).Method_3688().Method_3384());
                    n4 = this.Method_599(class_6778, n18, n19, n20);
                    if (n4 != n9 - n21 || n11 >= arrn.length) continue;
                    arrn[n11++] = n18 - n14 + (-32472 & 1203) | n19 - n15 + (-22238 & 21160) << (-29618 & 12806) | n20 - n16 + (1184 & -30429) << (-16243 & 4958) | n9 - n21 << (1810 & 2066);
                }
            }
            n10 = 1056 & 65;
        }
        if (!this.\u0000
        ) {
            this.\u0000strictfp.Method_2790();
        }
        if (!this.\u0000
        ) {
            this.\u0000strictfp.Method_2789("checkedPosition < toCheckCount");
        }
        Class_4810 class_4810 = new Class_4810(18453 & 5378, 27266 & 85, -31096 & 2070);
        while (n10 < n11) {
            n6 = arrn[n10++];
            n2 = (n6 & (1599 & 4159)) - (-12243 & 2162) + n14;
            n3 = (n6 >> (-14314 & 1319) & (-32065 & 24959)) - (160 & 2404) + n15;
            n9 = (n6 >> (-964 & 268) & (4159 & -30145)) - (424 & 11380) + n16;
            class_4810.Method_4816(n2, n3, n9);
            n4 = this.Method_615(class_6778, class_4810);
            n8 = this.Method_602(class_4810, class_6778);
            if (n8 == n4) continue;
            this.Method_585(class_6778, n2, n3, n9, n8);
            if (n8 <= n4) continue;
            n7 = Math.abs(n2 - n14);
            n5 = Math.abs(n3 - n15);
            int n22 = Math.abs(n9 - n16);
            int n23 = n = n11 < arrn.length - (8463 & 4694) ? 1041 & -13821 : 12358 & 424;
            if (n7 + n5 + n22 >= (4125 & 16433) || n == 0) continue;
            if (this.Method_599(class_6778, n2 - (16533 & 10251), n3, n9) < n8) {
                arrn[n11++] = n2 - (-27103 & 259) - n14 + (1068 & 352) | n3 - n15 + (-16218 & 1120) << (518 & -18090) | n9 - n16 + (11049 & 1072) << (16045 & 12);
            }
            if (this.Method_599(class_6778, n2 + (8421 & 16387), n3, n9) < n8) {
                arrn[n11++] = n2 + (22153 & 305) - n14 + (98 & 18464) | n3 - n15 + (15397 & 352) << (25622 & 262) | n9 - n16 + (96 & 5169) << (13070 & 17549);
            }
            if (this.Method_599(class_6778, n2, n3 - (-22399 & 4709), n9) < n8) {
                arrn[n11++] = n2 - n14 + (-32719 & 9004) | n3 - (25605 & 4817) - n15 + (2466 & -32715) << (135 & -23514) | n9 - n16 + (4256 & 40) << (-30676 & 350);
            }
            if (this.Method_599(class_6778, n2, n3 + (1025 & 10597), n9) < n8) {
                arrn[n11++] = n2 - n14 + (9580 & -32592) | n3 + (9739 & -26559) - n15 + (-23947 & 21536) << (7662 & 6) | n9 - n16 + (100 & 17320) << (142 & -32755);
            }
            if (this.Method_599(class_6778, n2, n3, n9 - (4257 & 18501)) < n8) {
                arrn[n11++] = n2 - n14 + (8352 & 1060) | n3 - n15 + (4640 & 2160) << (3382 & 70) | n9 - (-24023 & 18833) - n16 + (56 & 16163) << (1548 & 12);
            }
            if (this.Method_599(class_6778, n2, n3, n9 + (1697 & 28935)) >= n8) continue;
            arrn[n11++] = n2 - n14 + (40 & 24820) | n3 - n15 + (-9947 & 34) << (526 & 12694) | n9 + (12833 & -32639) - n16 + (5153 & 46) << (-30436 & 12460);
        }
        if (this.\u0000
        ) {
            class_17665.Field_17687.decrementAndGet();
            if (arrayList != null) {
                for (Class_17665 class_176652 : arrayList) {
                    class_176652.Field_17687.decrementAndGet();
                }
            }
        } else {
            this.\u0000strictfp.Method_2790();
        }
        return (4241 & 97) != 0;
    }

    protected void Method_623() {
        super.Method_533();
        Class_44898 class_44898 = this.\u0000strictfp;
        Class_44898 class_448982 = this.Field_572;
        Class_20759 class_20759 = class_448982.Method_44923();
        while (class_20759.hasNext()) {
            if (class_44898.Method_44918(class_20759.next())) continue;
            class_20759.remove();
        }
        if (class_448982.Method_44914() == class_44898.Method_44914()) {
            class_448982.Method_44924();
        }
        int n = 41 & 11266;
        this.\u0000strictfp.Method_2789("getChunk");
        Class_20759 class_207592 = class_44898.Method_44923();
        while (class_207592.hasNext()) {
            Class_29480 class_29480 = (Class_29480)class_207592.next();
            if (class_448982.Method_44918(class_29480)) continue;
            int n2 = class_29480.Field_29483 * (4247 & 18448);
            int n3 = class_29480.Field_29482 * (-30415 & 9234);
            Class_17665 class_17665 = this.Method_587(class_29480.Field_29483, class_29480.Field_29482);
            this.\u0000strictfp(n2, n3, class_17665);
            class_448982.Method_44925(class_29480);
            if (++n < (554 & 14558)) continue;
            this.\u0000strictfp.Method_2790();
            return;
        }
        this.\u0000strictfp.Method_2790();
    }

    protected boolean Method_624(int n, int n2, boolean bl) {
        return (this.Field_574.Method_20736(n, n2) && (bl || !this.Field_574.Method_20737(n, n2).Method_17728()) ? -10699 & 65 : 545 & -15076) != 0;
    }

    public void Method_625() {
        int n;
        int n2;
        Class_1061 class_1061;
        int n3;
        this.\u0000, for.removeAll(this.\u0000
        );
        for (n = -5119 & 10; n < this.\u0000
        .size(); ++n) {
            class_1061 = (Class_1061)this.\u0000
            .get(n);
            n2 = class_1061.Field_1147;
            n3 = class_1061.Field_1090;
            if (!class_1061.Field_1077 || !this.Method_624(n2, n3, (2689 & 25957) != 0)) continue;
            this.Method_587(n2, n3).Method_17717(class_1061);
        }
        for (n = 648 & -8176; n < this.\u0000
        .size(); ++n) {
            this.Method_609((Class_1061)this.\u0000
            .get(n));
        }
        this.\u0000
        .clear();
        for (n = -27648 & 660; n < this.\u0000, for.size(); ++n) {
            class_1061 = (Class_1061)this.\u0000, for.get(n);
            if (class_1061.Field_1095 != null) {
                if (!class_1061.Field_1095.Field_1110 && class_1061.Field_1095.Field_1099 == class_1061) continue;
                class_1061.Field_1095.Field_1099 = null;
                class_1061.Field_1095 = null;
            }
            if (!class_1061.Field_1110) continue;
            n2 = class_1061.Field_1147;
            n3 = class_1061.Field_1090;
            if (class_1061.Field_1077 && this.Method_624(n2, n3, (69 & -10103) != 0)) {
                this.Method_587(n2, n3).Method_17717(class_1061);
            }
            this.\u0000, for.remove(n--);
            this.Method_609(class_1061);
        }
    }
}

