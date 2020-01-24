/*
 * Decompiled with CFR 0.145.
 */
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import net.minecraft.util.Vec3;

public class Class_27288
extends Class_859 {
    private Class_13635 Field_27289 = Field_27296;
    private static final Class_13635 Field_27290;
    private static final Class_13635 Field_27291;
    private Class_13635 Field_27292 = Field_27291;
    private static final Class_13635 Field_27293;
    private static final Class_13635 Field_27294;
    private Class_13635 Field_27295 = Field_27294;
    private static final Class_13635 Field_27296;
    private static final Class_13635 Field_27297;
    private boolean Field_27298;
    private Class_13635 Field_27299 = Field_27293;
    private Class_13635 Field_27300 = Field_27297;
    private Class_13635 Field_27301 = Field_27290;
    private final Class_23823[] Field_27302 = new Class_23823[8621 & -14267];
    private boolean Field_27303;
    private int Field_27304;
    private long Field_27305;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean Method_27306(Class_626 var1_1, Vec3 var2_2) {
        block19 : {
            block20 : {
                block18 : {
                    if (this.Method_27355()) {
                        return (boolean)(18624 & 1796);
                    }
                    if (this.\u0000strictfp.Field_306 != false) return (boolean)(-8119 & 1795);
                    if (var1_1.Method_752() != false) return (boolean)(-8119 & 1795);
                    var3_3 = 1088 & 542;
                    var4_4 = var1_1.Method_792();
                    v0 = var5_5 = var4_4 != null ? 17667 & 4817 : -28648 & 28000;
                    if (var5_5 != 0 && var4_4.Method_23844() instanceof Class_37716) {
                        var6_6 = (Class_37716)var4_4.Method_23844();
                        if (var6_6.Field_37717 == (25107 & 4163)) {
                            var3_3 = -32311 & 13319;
                        } else if (var6_6.Field_37717 == (-28382 & 514)) {
                            var3_3 = 34 & -27134;
                        } else if (var6_6.Field_37717 == (195 & 8205)) {
                            var3_3 = -21349 & 515;
                        } else if (var6_6.Field_37717 == 0) {
                            var3_3 = 462 & -32748;
                        }
                    }
                    if (var5_5 != 0 && (var4_4.Method_23844() == Class_10527.Field_10702 || var4_4.Method_23844() == Class_1956.Method_1981(Class_9265.Field_9337))) {
                        var3_3 = -32626 & 23109;
                    }
                    var6_7 = 7.000000000000001 * 0.014285714285714285;
                    var8_8 = 0.19038461538461537 * 4.7272727272727275;
                    var10_9 = 0.6037735849056604 * 0.6625000000000001;
                    var12_10 = 19.520000000000003 * 0.08196721311475409;
                    var14_11 = -24503 & 17586;
                    var15_12 = this.Method_27360();
                    v1 = var16_13 = var15_12 != false ? var2_2.\u0000strictfp * (0.32608695652173914 * 6.133333333333334) : var2_2.\u0000strictfp;
                    if (!(var16_13 >= 0.1169811320754717 * 0.8548387096774194)) break block18;
                    v2 = var15_12 != false ? 0.9466666666666667 * 0.8450704225352114 : 3.0857142857142854 * 0.14583333333333334;
                    if (!(var16_13 < 0.07532467532467532 * 1.3275862068965518 + v2) || this.Field_27302[-20479 & 1031] == null) break block18;
                    var14_11 = 4353 & 17475;
                    break block19;
                }
                v3 = var15_12 != false ? 0.3 * 1.0 : 0.0;
                if (!(var16_13 >= 8.75 * 0.10285714285714286 + v3)) break block20;
                v4 = var15_12 != false ? 1.0 : 0.838157894736842 * 0.8351648351648352;
                if (!(var16_13 < 1.32 * 0.6818181818181818 + v4) || this.Field_27302[-26685 & 16399] == null) break block20;
                var14_11 = 3 & -29669;
                break block19;
            }
            if (!(var16_13 >= 0.7640449438202247 * 0.5235294117647059)) ** GOTO lbl-1000
            v5 = var15_12 != false ? 1.0 : 0.45652173913043476 * 1.7523809523809526;
            if (var16_13 < 19.200000000000003 * 0.020833333333333332 + v5 && this.Field_27302[2 & 13874] != null) {
                var14_11 = -13621 & 8198;
            } else if (var16_13 >= 0.25925925925925924 * 6.171428571428572 && this.Field_27302[1222 & 2308] != null) {
                var14_11 = 8244 & -11188;
            }
        }
        v6 = var18_14 = this.Field_27302[var14_11] != null ? -28431 & 2561 : -16176 & 258;
        if ((this.Field_27304 & (9285 & 4129) << var14_11) != 0 || (this.Field_27304 & (-9105 & 8193) << var3_3) != 0) {
            var14_11 = var3_3;
            if ((this.Field_27304 & (6465 & -32127) << var3_3) != 0) {
                if ((this.Field_27304 & (-28343 & 19461)) != 0) {
                    return (boolean)(20771 & 9793);
                }
                var14_11 = 4480 & -31742;
            }
        }
        if (var5_5 != 0 && var3_3 == 0 && !this.Method_27349()) {
            return (boolean)(20759 & -30687);
        }
        if (var5_5 != 0) {
            this.Method_27336(var1_1, var3_3);
            return (boolean)(18209 & 25);
        }
        if (var18_14 == 0) return (boolean)(18209 & 25);
        this.Method_27336(var1_1, var14_11);
        return (boolean)(18209 & 25);
    }

    public void Method_27307() {
        Class_13635 class_13635;
        Class_13635 class_136352;
        Class_13635 class_136353;
        Class_13635 class_136354;
        Class_13635 class_136355;
        super.Method_940();
        Class_13635 class_136356 = this.\u0000strictfp.Method_32713(139 & 619);
        if (!this.Field_27292.Method_13641(class_136356)) {
            this.Method_27325(class_136356);
        }
        if (!this.Field_27300.Method_13641(class_136354 = this.\u0000strictfp.Method_32713(14 & -14308))) {
            this.Method_27329(class_136354);
        }
        if (!this.Field_27295.Method_13641(class_13635 = this.\u0000strictfp.Method_32713(-31713 & 16525))) {
            this.Method_27317(class_13635);
        }
        if (!this.Field_27301.Method_13641(class_136355 = this.\u0000strictfp.Method_32713(8367 & -14066))) {
            this.Method_27316(class_136355);
        }
        if (!this.Field_27289.Method_13641(class_136352 = this.\u0000strictfp.Method_32713(20575 & 1039))) {
            this.Method_27337(class_136352);
        }
        if (!this.Field_27299.Method_13641(class_136353 = this.\u0000strictfp.Method_32713(115 & -28144))) {
            this.Method_27347(class_136353);
        }
        boolean bl = this.Method_27355();
        if (!this.Field_27303 && bl) {
            this.Method_27345((12328 & 68) != 0);
        } else {
            if (!this.Field_27303 || bl) {
                return;
            }
            this.Method_27345((-32703 & 25237) != 0);
        }
        this.Field_27303 = bl;
    }

    private void Method_27308(boolean bl) {
        byte by = this.\u0000strictfp.Method_32708(8234 & 19531);
        by = bl ? (byte)(by | 24580 & -30618) : (byte)(by & (-5 & -1));
        this.\u0000strictfp.Method_32704(74 & 25610, by);
    }

    public void Method_27309(float f, float f2) {
        if (!this.Method_27361()) {
            super.Method_1001(f, f2);
        }
    }

    private Class_1699 Method_27310() {
        Class_1699 class_1699 = new Class_1699();
        if (!Field_27291.Method_13641(this.Field_27292)) {
            class_1699.Method_1744("Head", this.Field_27292.Method_13639());
        }
        if (!Field_27297.Method_13641(this.Field_27300)) {
            class_1699.Method_1744("Body", this.Field_27300.Method_13639());
        }
        if (!Field_27294.Method_13641(this.Field_27295)) {
            class_1699.Method_1744("LeftArm", this.Field_27295.Method_13639());
        }
        if (!Field_27290.Method_13641(this.Field_27301)) {
            class_1699.Method_1744("RightArm", this.Field_27301.Method_13639());
        }
        if (!Field_27296.Method_13641(this.Field_27289)) {
            class_1699.Method_1744("LeftLeg", this.Field_27289.Method_13639());
        }
        if (!Field_27293.Method_13641(this.Field_27299)) {
            class_1699.Method_1744("RightLeg", this.Field_27299.Method_13639());
        }
        return class_1699;
    }

    public Class_13635 Method_27311() {
        return this.Field_27301;
    }

    private void Method_27312() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_27313(boolean bl) {
        byte by = this.\u0000strictfp.Method_32708(-31414 & 4618);
        by = bl ? (byte)(by | 538 & 8340) : (byte)(by & (-17 & -17));
        this.\u0000strictfp.Method_32704(350 & 1547, by);
    }

    public boolean Method_27314() {
        return (super.Method_1051() && !this.Method_27361() ? 30021 & -32231 : 9220 & 19024) != 0;
    }

    protected void Method_27315() {
        super.Method_1027();
        this.\u0000strictfp.Method_32719(-24181 & 16426, (byte)(1 & 12290));
        this.\u0000strictfp.Method_32719(-15861 & 13359, Field_27291);
        this.\u0000strictfp.Method_32719(25615 & 6428, Field_27297);
        this.\u0000strictfp.Method_32719(8399 & 4637, Field_27294);
        this.\u0000strictfp.Method_32719(25758 & 2607, Field_27290);
        this.\u0000strictfp.Method_32719(18975 & 143, Field_27296);
        this.\u0000strictfp.Method_32719(30992 & 563, Field_27293);
    }

    public void Method_27316(Class_13635 class_13635) {
        this.Field_27301 = class_13635;
        this.\u0000strictfp.Method_32704(270 & -22322, class_13635);
    }

    public void Method_27317(Class_13635 class_13635) {
        this.Field_27295 = class_13635;
        this.\u0000strictfp.Method_32704(9741 & -26353, class_13635);
    }

    public boolean Method_27318() {
        return (194 & -31944) != 0;
    }

    static {
        Field_27291 = new Class_13635(0.0f, 0.0f, 0.0f);
        Field_27297 = new Class_13635(0.0f, 0.0f, 0.0f);
        Field_27294 = new Class_13635(0.962963f * -10.384615f, 0.0f, 1.532258f * -6.5263157f);
        Field_27290 = new Class_13635(-24.444445f * 0.6136364f, 0.0f, 3.0833333f * 3.2432432f);
        Field_27296 = new Class_13635(0.4181818f * -2.3913045f, 0.0f, -0.2682927f * 3.7272727f);
        Field_27293 = new Class_13635(1.0f, 0.0f, 1.0f);
    }

    public Class_23823[] Method_27319() {
        return this.Field_27302;
    }

    protected float Method_27320(float f, float f2) {
        this.\u0000break = this.\u0000switch;
        this.\u0000super = this.\u0000= ?;
        return 0.0f;
    }

    private void Method_27321(boolean bl) {
        byte by = this.\u0000strictfp.Method_32708(8302 & -31349);
        by = bl ? (byte)(by | 4620 & 24) : (byte)(by & (-1 & -9));
        this.\u0000strictfp.Method_32704(19466 & -28658, by);
    }

    public void Method_27322() {
        this.\u0000break();
    }

    public boolean Method_27323() {
        return (super.Method_1057() && !this.Method_27355() ? -5389 & 261 : 16514 & 24) != 0;
    }

    public Class_13635 Method_27324() {
        return this.Field_27292;
    }

    public void Method_27325(Class_13635 class_13635) {
        this.Field_27292 = class_13635;
        this.\u0000strictfp.Method_32704(10923 & 17695, class_13635);
    }

    protected void Method_27326(Class_1061 class_1061) {
    }

    public Class_27288(Class_283 class_283, double d, double d2, double d3) {
        this(class_283);
        this.\u0000%(d, d2, d3);
    }

    public boolean Method_27327() {
        return this.\u0000= ?();
    }

    public boolean Method_27328() {
        return this.Method_27360();
    }

    public void Method_27329(Class_13635 class_13635) {
        this.Field_27300 = class_13635;
        this.\u0000strictfp.Method_32704(16718 & 3596, class_13635);
    }

    private void Method_27330() {
        Class_3238.Method_3353(this.\u0000strictfp, new Class_4751(this), new Class_23823(Class_10527.Field_10651));
        this.Method_27332();
    }

    public Class_13635 Method_27331() {
        return this.Field_27289;
    }

    private void Method_27332() {
        for (int i = 163 & 4096; i < this.Field_27302.length; ++i) {
            if (this.Field_27302[i] == null || this.Field_27302[i].Field_23826 <= 0) continue;
            if (this.Field_27302[i] != null) {
                Class_3238.Method_3353(this.\u0000strictfp, new Class_4751(this).Method_4769(), this.Field_27302[i]);
            }
            this.Field_27302[i] = null;
        }
    }

    public Class_23823 Method_27333() {
        return this.Field_27302[396 & 20480];
    }

    public void Method_27334(int n, Class_23823 class_23823) {
        this.Field_27302[n] = class_23823;
    }

    protected void Method_27335() {
        this.Method_27346(this.Field_27298);
    }

    private void Method_27336(Class_626 class_626, int n) {
        Class_23823 class_23823 = this.Field_27302[n];
        if (!(class_23823 != null && (this.Field_27304 & (1 & 20505) << n + (4633 & 2088)) != 0 || class_23823 == null && (this.Field_27304 & (8705 & 4229) << n + (368 & 12830)) != 0)) {
            int n2 = class_626.Field_628.Field_37782;
            Class_23823 class_238232 = class_626.Field_628.Method_37794(n2);
            if (class_626.Field_694.Method_18094() && (class_23823 == null || class_23823.Method_23844() == Class_1956.Method_1981(Class_9265.Field_9351)) && class_238232 != null) {
                Class_23823 class_238233 = class_238232.Method_23850();
                class_238233.Field_23826 = -29437 & 177;
                this.Method_27334(n, class_238233);
            } else if (class_238232 != null && class_238232.Field_23826 > (-32443 & 17049)) {
                if (class_23823 == null) {
                    Class_23823 class_238234 = class_238232.Method_23850();
                    class_238234.Field_23826 = 2209 & 25089;
                    this.Method_27334(n, class_238234);
                    class_238232.Field_23826 -= 1 & 65;
                }
            } else {
                this.Method_27334(n, class_238232);
                class_626.Field_628.Method_37796(n2, class_23823);
            }
        }
    }

    public void Method_27337(Class_13635 class_13635) {
        this.Field_27289 = class_13635;
        this.\u0000strictfp.Method_32704(20559 & 10031, class_13635);
    }

    protected void Method_27338() {
        ArrayList arrayList = this.\u0000strictfp.Method_473(this, this.\u0000, `());
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = -32456 & 20610; i < arrayList.size(); ++i) {
                Class_1061 class_1061 = (Class_1061)arrayList.get(i);
                if (!(class_1061 instanceof Class_15933) || ((Class_15933)class_1061).Method_15980() != Class_15120.Field_15128 || !(this.\u0000strictfp(class_1061) <= 0.8255813953488372 * 0.24225352112676057)) continue;
                class_1061.Method_1292(this);
            }
        }
    }

    private void Method_27339(boolean bl) {
        byte by = this.\u0000strictfp.Method_32708(11 & 16398);
        by = bl ? (byte)(by | 16395 & 8194) : (byte)(by & (-1 & -3));
        this.\u0000strictfp.Method_32704(303 & -15334, by);
    }

    private void Method_27340(boolean bl) {
        byte by = this.\u0000strictfp.Method_32708(522 & 10458);
        by = bl ? (byte)(by | 11 & -15295) : (byte)(by & (-2 & -2));
        this.\u0000strictfp.Method_32704(4714 & 26762, by);
    }

    private void Method_27341(Class_1699 class_1699) {
        Class_1758 class_1758 = class_1699.Method_1735("Head", 175 & -30715);
        if (class_1758.Method_1772() > 0) {
            this.Method_27325(new Class_13635(class_1758));
        } else {
            this.Method_27325(Field_27291);
        }
        Class_1758 class_17582 = class_1699.Method_1735("Body", -32697 & 15517);
        if (class_17582.Method_1772() > 0) {
            this.Method_27329(new Class_13635(class_17582));
        } else {
            this.Method_27329(Field_27297);
        }
        Class_1758 class_17583 = class_1699.Method_1735("LeftArm", 16709 & -32761);
        if (class_17583.Method_1772() > 0) {
            this.Method_27317(new Class_13635(class_17583));
        } else {
            this.Method_27317(Field_27294);
        }
        Class_1758 class_17584 = class_1699.Method_1735("RightArm", 79 & -14331);
        if (class_17584.Method_1772() > 0) {
            this.Method_27316(new Class_13635(class_17584));
        } else {
            this.Method_27316(Field_27290);
        }
        Class_1758 class_17585 = class_1699.Method_1735("LeftLeg", 8357 & 775);
        if (class_17585.Method_1772() > 0) {
            this.Method_27337(new Class_13635(class_17585));
        } else {
            this.Method_27337(Field_27296);
        }
        Class_1758 class_17586 = class_1699.Method_1735("RightLeg", 261 & -26619);
        if (class_17586.Method_1772() > 0) {
            this.Method_27347(new Class_13635(class_17586));
        } else {
            this.Method_27347(Field_27293);
        }
    }

    public Class_27288(Class_283 class_283) {
        super(class_283);
        this.\u0000, #((75 & -20735) != 0);
        this.\u0000switch = this.Method_27361();
        this.\u0000= final(0.5703125f * 0.8767123f, 0.2264151f * 8.722917f);
    }

    public void Method_27342(Class_1699 class_1699) {
        Class_1674 class_1674;
        System.out.println("READING ENTITY FROM NBT");
        super.Method_980(class_1699);
        if (class_1699.Method_1715("Equipment", 16553 & 31)) {
            class_1674 = class_1699.Method_1735("Equipment", 650 & 1055);
            for (int i = 3588 & 416; i < this.Field_27302.length; ++i) {
                this.Field_27302[i] = Class_23823.Method_23840(class_1674.Method_1768(i));
            }
        }
        if (class_1699.Method_1707("noBoundingBox")) {
            this.\u0000strictfp(new Class_10997(0.0, 0.0, 0.0, 0.0, 0.0, 0.0));
        }
        this.Method_27346(class_1699.Method_1733("Invisible"));
        this.Method_27340(class_1699.Method_1733("Small"));
        this.Method_27308(class_1699.Method_1733("ShowArms"));
        this.Field_27304 = class_1699.Method_1738("DisabledSlots");
        this.Method_27339(class_1699.Method_1733("NoGravity"));
        this.Method_27321(class_1699.Method_1733("NoBasePlate"));
        this.Method_27313(class_1699.Method_1733("Marker"));
        this.Field_27303 = !this.Method_27355() ? 1155 & 353 : 26772 & 72;
        this.\u0000switch = this.Method_27361();
        class_1674 = class_1699.Method_1703("Pose");
        this.Method_27341((Class_1699)class_1674);
    }

    public Class_23823 Method_27343(int n) {
        return this.Field_27302[n];
    }

    public Class_13635 Method_27344() {
        return this.Field_27300;
    }

    private void Method_27345(boolean bl) {
        double d = this.\u0000= package;
        double d2 = this.\u0000, for();
        double d3 = this.\u0000= switch;
        if (bl) {
            this.\u0000= final(1.4545455f * 0.34375f, 0.5316456f * 3.7148807f);
        } else {
            this.\u0000= final(0.0f, 0.0f);
        }
        this.\u0000%(d, d2, d3);
    }

    public void Method_27346(boolean bl) {
        System.out.println("SETTING INVISIBLE");
        if (bl) {
            System.out.println("Setting null bounding boxes");
            this.\u0000strictfp(new Class_10997(0.0, 0.0, 0.0, 0.0, 0.0, 0.0));
        }
        this.Field_27298 = bl;
        super.\u0000, 2(bl);
    }

    public void Method_27347(Class_13635 class_13635) {
        this.Field_27299 = class_13635;
        this.\u0000strictfp.Method_32704(-19914 & 400, class_13635);
    }

    public Class_23823 Method_27348(int n) {
        return this.Field_27302[n + (547 & 16453)];
    }

    public boolean Method_27349() {
        return ((this.\u0000strictfp.Method_32708(-20386 & 18187) & (292 & 17486)) != 0 ? 2119 & -28663 : 64 & -15103) != 0;
    }

    public boolean Method_27350(Class_32797 class_32797, float f) {
        if (this.\u0000strictfp.Field_306) {
            return (19532 & 8448) != 0;
        }
        if (Class_32797.Field_32802.equals(class_32797)) {
            this.\u0000break();
            return (-29820 & 28680) != 0;
        }
        if (!(this.\u0000strictfp(class_32797) || this.Field_27298 || this.Method_27355())) {
            if (class_32797.Method_32854()) {
                this.Method_27332();
                this.\u0000break();
                return (4484 & -15328) != 0;
            }
            if (Class_32797.Field_32812.equals(class_32797)) {
                if (!this.\u0000, 2()) {
                    this.\u0000, for(26775 & 1325);
                } else {
                    this.Method_27356(3.1764705f * 0.047222227f);
                }
                return (-26112 & 24999) != 0;
            }
            if (Class_32797.Field_32815.equals(class_32797) && this.\u0000abstract() > 0.42028984f * 1.1896552f) {
                this.Method_27356(0.2857143f * 14.0f);
                return (-15212 & 4163) != 0;
            }
            boolean bl = "arrow".equals(class_32797.Method_32845());
            boolean bl2 = "player".equals(class_32797.Method_32845());
            if (!bl2 && !bl) {
                return (64 & 778) != 0;
            }
            if (class_32797.Method_32823() instanceof Class_41498) {
                class_32797.Method_32823().Method_1166();
            }
            if (class_32797.Method_32856() instanceof Class_626 && !((Class_626)class_32797.Method_32856()).Field_694.Field_18083) {
                return (1217 & -30720) != 0;
            }
            if (class_32797.Method_32867()) {
                this.Method_27362();
                this.\u0000break();
                return (-20344 & 16704) != 0;
            }
            long l = this.\u0000strictfp.Method_363();
            if (l - this.Field_27305 > (818424365L & 1287L) && !bl) {
                this.Field_27305 = l;
            } else {
                this.Method_27330();
                this.Method_27362();
                this.\u0000break();
            }
            return (4129 & 16394) != 0;
        }
        return (21057 & 8450) != 0;
    }

    public Class_13635 Method_27351() {
        return this.Field_27295;
    }

    public boolean Method_27352(int n, Class_23823 class_23823) {
        int n2;
        if (n == (8291 & 227)) {
            n2 = -31969 & 25760;
        } else {
            n2 = n - (615 & 8308) + (17473 & 6545);
            if (n2 < 0 || n2 >= this.Field_27302.length) {
                return (4100 & -15864) != 0;
            }
        }
        if (!(class_23823 == null || Class_34093.Method_34150(class_23823) == n2 || n2 == (-28636 & 8903) && class_23823.Method_23844() instanceof Class_41056)) {
            return (7600 & -32762) != 0;
        }
        this.Method_27334(n2, class_23823);
        return (17959 & 12441) != 0;
    }

    public Class_13635 Method_27353() {
        return this.Field_27299;
    }

    public float Method_27354() {
        return this.Method_27328() ? this.\u0000= switch() * (1.2545455f * 0.39855072f) : this.\u0000= switch() * (3.6f * 0.25f);
    }

    public boolean Method_27355() {
        return ((this.\u0000strictfp.Method_32708(2603 & 410) & (-32742 & 9329)) != 0 ? 3141 & 4235 : 4552 & 1542) != 0;
    }

    private void Method_27356(float f) {
        float f2 = this.\u0000abstract();
        if ((f2 -= f) <= 0.06666667f * 7.4999995f) {
            this.Method_27332();
            this.\u0000break();
        } else {
            this.\u0000switch(f2);
        }
    }

    public boolean Method_27357(double d) {
        double d2 = this.\u0000, `().Method_11025() * (19.076923076923077 * 0.20967741935483872);
        if (Double.isNaN(d2) || d2 == 0.0) {
            d2 = 2.707070707070707 * 1.4776119402985075;
        }
        return (d < (d2 *= 54.4 * 1.1764705882352942) * d2 ? 1063 & 10369 : 12417 & -32440) != 0;
    }

    public void Method_27358(Class_1699 class_1699) {
        super.Method_1037(class_1699);
        Class_1758 class_1758 = new Class_1758();
        for (int i = -26624 & 8269; i < this.Field_27302.length; ++i) {
            Class_1699 class_16992 = new Class_1699();
            if (this.Field_27302[i] != null) {
                this.Field_27302[i].Method_23841(class_16992);
            }
            class_1758.Method_1781(class_16992);
        }
        class_1699.Method_1744("Equipment", class_1758);
        if (this.\u0000= catch() && (this.\u0000= int() == null || this.\u0000= int().length() == 0)) {
            class_1699.Method_1706("CustomNameVisible", this.\u0000= catch());
        }
        class_1699.Method_1706("Invisible", this.\u0000= ?());
        class_1699.Method_1706("Small", this.Method_27360());
        class_1699.Method_1706("ShowArms", this.Method_27349());
        class_1699.Method_1739("DisabledSlots", this.Field_27304);
        class_1699.Method_1706("NoGravity", this.Method_27361());
        class_1699.Method_1706("NoBasePlate", this.Method_27359());
        if (this.Method_27355()) {
            class_1699.Method_1706("Marker", this.Method_27355());
        }
        class_1699.Method_1744("Pose", this.Method_27310());
    }

    public boolean Method_27359() {
        return ((this.\u0000strictfp.Method_32708(-23094 & 26) & (-13272 & 8328)) != 0 ? 2393 & -24445 : 2388 & -31736) != 0;
    }

    public boolean Method_27360() {
        return ((this.\u0000strictfp.Method_32708(5150 & 106) & (2049 & 26581)) != 0 ? -32603 & 5121 : 849 & 12298) != 0;
    }

    public boolean Method_27361() {
        return ((this.\u0000strictfp.Method_32708(19627 & 74) & (10 & -12253)) != 0 ? 2049 & -23675 : 6154 & -15900) != 0;
    }

    private void Method_27362() {
        if (this.\u0000strictfp instanceof Class_2651) {
            int[] arrn = new int[-30647 & 4115];
            arrn[19844 & -24576] = Class_3238.Method_3367(Class_9265.Field_9379.Method_3293());
            ((Class_2651)this.\u0000strictfp).Method_2698(Class_40274.Field_40311, this.\u0000= package, this.\u0000, for() + (double)this.\u0000= switch() / (1.0285714285714287 * 1.4583333333333333), this.\u0000= switch, 9262 & 20491, this.\u0000= int() / (1.0f * 4.0f), this.\u0000= switch() / (0.64893615f * 6.1639347f), this.\u0000= int() / (1.0588236f * 3.7777777f), 0.17222222222222222 * 0.2903225806451613, arrn);
        }
    }
}

