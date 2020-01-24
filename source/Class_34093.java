/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000try break ! char ` do switch 3 ] 
 *  \u0000try break ! char ` do switch 3 ] $ 4 
 *  \u0000try break ! char ` do switch 3 ] $ 4 $ byte switch do continue synchronized % try = { 4 abstract synchronized default double public ? const import ^ long native = 4 + import static const float finally 0 return 1 throws abstract 7 finally 5 private protected
 *  \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ 
 *  \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ $ native private ` final ] 2 extends float ? boolean
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class Class_34093
extends Class_859 {
    public int Field_34094;
    public Class_17281 Field_34095 = null;
    private Class_1699 Field_34096;
    private Class_27487 Field_34097;
    private boolean Field_34098;
    protected Class_27079 Field_34099;
    private Class_21465 Field_34100;
    protected float[] Field_34101 = new float[-28473 & 24877];
    public int Field_34102 = 10496 & 17034;
    private Class_7245 Field_34103;
    private boolean Field_34104;
    protected final Class_16850 Field_34105;
    private boolean Field_34106;
    protected Class_7611 Field_34107;
    protected final Class_16850 Field_34108;
    public Class_4751 Field_34109 = null;
    private Class_859 Field_34110;
    protected int Field_34111;
    private Class_1061 Field_34112;
    private Class_23823[] Field_34113 = new Class_23823[8469 & 5125];
    protected Class_29579 Field_34114;

    protected String Method_34115() {
        return null;
    }

    public int Method_34116() {
        return 2319 & 5252;
    }

    public void Method_34117(Class_859 class_859) {
        this.Field_34110 = class_859;
    }

    public void Method_34118() {
        super.Method_947();
        this.\u0000strictfp.Field_310.Method_2789("looting");
        if (!this.\u0000strictfp.Field_306 && this.Method_34153() && !this.\u00003 && this.\u0000strictfp.Method_522().Method_7529("mobGriefing")) {
            for (Class_3443 class_3443 : this.\u0000strictfp.Method_488(Class_3443.class, this.\u0000, `().Method_11017(1.0, 0.0, 1.0))) {
                if (class_3443.\u0000= float || class_3443.Method_3478() == null || class_3443.Method_3454()) continue;
                this.Method_34139(class_3443);
            }
        }
        this.\u0000strictfp.Field_310.Method_2790();
    }

    public Class_23823[] Method_34119() {
        return this.Field_34113;
    }

    protected int Method_34120(Class_626 class_626) {
        if (this.Field_34111 > 0) {
            int n = this.Field_34111;
            Class_23823[] arrclass_23823 = this.Method_34119();
            for (int i = -23468 & 16904; i < arrclass_23823.length; ++i) {
                if (arrclass_23823[i] == null || !(this.Field_34101[i] <= 1.0f)) continue;
                n += (309 & 12289) + this.\u0000strictfp.nextInt(579 & -3709);
            }
            return n;
        }
        return this.Field_34111;
    }

    protected void Method_34121(Class_33888 class_33888) {
        float f = class_33888.Method_33891();
        if (this.Method_34163() != null && this.\u0000strictfp.nextFloat() < 0.43333334f * 0.5769231f * f) {
            Class_29642.Method_29673(this.\u0000strictfp, this.Method_34163(), (int)(1.0f * 5.0f + f * (float)this.\u0000strictfp.nextInt(4114 & 27314)));
        }
        for (int i = -16252 & 104; i < (638 & -19452); ++i) {
            Class_23823 class_23823 = this.Method_34168(i);
            if (class_23823 == null || !(this.\u0000strictfp.nextFloat() < 1.2f * 0.41666666f * f)) continue;
            Class_29642.Method_29673(this.\u0000strictfp, class_23823, (int)(1.1558442f * 4.3258424f + f * (float)this.\u0000strictfp.nextInt(-27438 & 10522)));
        }
    }

    protected void Method_34122() {
    }

    private void Method_34123() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_34124() {
        return this.Field_34106;
    }

    private void Method_34125() {
        if (this.Field_34098 && this.Field_34096 != null) {
            if (this.Field_34096.Method_1715("UUIDMost", -31972 & 36) && this.Field_34096.Method_1715("UUIDLeast", 4877 & 8260)) {
                UUID uUID = new UUID(this.Field_34096.Method_1705("UUIDMost"), this.Field_34096.Method_1705("UUIDLeast"));
                for (Class_859 class_859 : this.\u0000strictfp.Method_488(Class_859.class, this.\u0000, `().Method_11017(41.42857142857142 * 0.2413793103448276, 4.310344827586207 * 2.32, 3.0952380952380953 * 3.230769230769231))) {
                    if (!class_859.\u0000strictfp().equals(uUID)) continue;
                    this.Field_34112 = class_859;
                    break;
                }
            } else if (this.Field_34096.Method_1715("X", -32401 & 5347) && this.Field_34096.Method_1715("Y", -12953 & 12395) && this.Field_34096.Method_1715("Z", -24217 & 611)) {
                Class_4751 class_4751 = new Class_4751(this.Field_34096.Method_1738("X"), this.Field_34096.Method_1738("Y"), this.Field_34096.Method_1738("Z"));
                Class_32225 class_32225 = Class_32225.Method_32229(this.\u0000strictfp, class_4751);
                if (class_32225 == null) {
                    class_32225 = Class_32225.Method_32237(this.\u0000strictfp, class_4751);
                }
                this.Field_34112 = class_32225;
            } else {
                this.Method_34146((10286 & 16384) != 0, (133 & -19455) != 0);
            }
        }
        this.Field_34096 = null;
    }

    public static Class_1956 Method_34126(int n, int n2) {
        switch (n) {
            case 4: {
                if (n2 == 0) {
                    return Class_10527.Field_10547;
                }
                if (n2 == (16753 & -22525)) {
                    return Class_10527.Field_10596;
                }
                if (n2 == (-28074 & 3362)) {
                    return Class_10527.Field_10544;
                }
                if (n2 == (-32761 & 15395)) {
                    return Class_10527.Field_10667;
                }
                if (n2 == (2453 & 12292)) {
                    return Class_10527.Field_10599;
                }
            }
            case 3: {
                if (n2 == 0) {
                    return Class_10527.Field_10619;
                }
                if (n2 == (4689 & 2055)) {
                    return Class_10527.Field_10683;
                }
                if (n2 == (7430 & 514)) {
                    return Class_10527.Field_10693;
                }
                if (n2 == (3075 & 24871)) {
                    return Class_10527.Field_10600;
                }
                if (n2 == (164 & -31468)) {
                    return Class_10527.Field_10714;
                }
            }
            case 2: {
                if (n2 == 0) {
                    return Class_10527.Field_10549;
                }
                if (n2 == (12489 & 18947)) {
                    return Class_10527.Field_10636;
                }
                if (n2 == (-31054 & 10310)) {
                    return Class_10527.Field_10601;
                }
                if (n2 == (4131 & 24599)) {
                    return Class_10527.Field_10628;
                }
                if (n2 == (17156 & 14372)) {
                    return Class_10527.Field_10672;
                }
            }
            case 1: {
                if (n2 == 0) {
                    return Class_10527.Field_10640;
                }
                if (n2 == (-23487 & 18441)) {
                    return Class_10527.Field_10635;
                }
                if (n2 == (20491 & 1282)) {
                    return Class_10527.Field_10613;
                }
                if (n2 == (419 & 1623)) {
                    return Class_10527.Field_10686;
                }
                if (n2 != (8228 & 17870)) break;
                return Class_10527.Field_10529;
            }
        }
        return null;
    }

    public Class_859 Method_34127() {
        return this.Field_34110;
    }

    public void Method_34128() {
    }

    protected Class_1956 Method_34129() {
        return null;
    }

    public boolean Method_34130() {
        if (this.\u0000switch) {
            return (24580 & 512) != 0;
        }
        \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean  native private ` final ] 2 extends float ? boolean2 = new \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean(2080 & 17305, 8576 & -14304, 4482 & 3593);
        for (int i = 16468 & -28158; i < (3210 & -32212); ++i) {
            double d = this.\u0000= package + (double)(((float)((i >> (18572 & 9475)) % (19842 & 518)) - 0.9324325f * 0.5362319f) * this.\u0000= int() * (2.5142858f * 0.3181818f));
            double d2 = this.\u0000, for() + (double)(((float)((i >> (30353 & 105)) % (7 & -26606)) - 0.011494253f * 43.5f) * (0.025882354f * 3.8636363f));
            double d3 = this.\u0000= switch + (double)(((float)((i >> (-27550 & 650)) % (-32766 & 1102)) - 1.3809525f * 0.36206895f) * this.\u0000= int() * (0.8f * 1.0f));
             native private ` final ] 2 extends float ? boolean2.\u0000strictfp(d, d2 + (double)this.\u0000, for(), d3);
            if (!this.\u0000strictfp.Method_375((Class_4751) native private ` final ] 2 extends float ? boolean2).Method_3442().Method_3421()) continue;
            return (851 & 1025) != 0;
        }
        return (1380 & -16240) != 0;
    }

    public Class_1061 Method_34131() {
        return this.Field_34112;
    }

    protected float Method_34132(float f, float f2) {
        this.Field_34103.Method_7251();
        return f2;
    }

    public boolean Method_34133() {
        return (16454 & 4096) != 0;
    }

    public void Method_34134() {
        String string = this.Method_34115();
        if (string != null) {
            this.\u0000strictfp(string, this.\u0000= float(), this.\u0000= package());
        }
    }

    public Class_23823 Method_34135(int n) {
        return this.Field_34113[n];
    }

    public float Method_34136() {
        return 1.0f;
    }

    protected boolean Method_34137(Class_626 class_626) {
        return (132 & 2595) != 0;
    }

    protected void Method_34138() {
        super.Method_1027();
        this.\u0000strictfp.Method_32719(-9057 & 303, (byte)(4100 & 16));
    }

    protected void Method_34139(Class_3443 class_3443) {
        Class_23823 class_23823 = class_3443.Method_3478();
        int n = Class_34093.Method_34150(class_23823);
        if (n > (-1 & -1)) {
            Object object;
            int n2 = 4449 & -13287;
            Class_23823 class_238232 = this.Method_34135(n);
            if (class_238232 != null) {
                if (n == 0) {
                    if (class_23823.Method_23844() instanceof Class_20825 && !(class_238232.Method_23844() instanceof Class_20825)) {
                        n2 = 17425 & -28671;
                    } else if (class_23823.Method_23844() instanceof Class_20825 && class_238232.Method_23844() instanceof Class_20825) {
                        object = (Class_20825)class_23823.Method_23844();
                        Class_20825 class_20825 = (Class_20825)class_238232.Method_23844();
                        n2 = ((Class_20825)object).Method_20829() != class_20825.Method_20829() ? (((Class_20825)object).Method_20829() > class_20825.Method_20829() ? 4233 & 1553 : 0 & 5272) : (class_23823.Method_23843() > class_238232.Method_23843() || class_23823.Method_23842() && !class_238232.Method_23842() ? 4161 & 16679 : 27273 & 1140);
                    } else {
                        n2 = class_23823.Method_23844() instanceof Class_31111 && class_238232.Method_23844() instanceof Class_31111 ? (class_23823.Method_23842() && !class_238232.Method_23842() ? 1027 & -32455 : -31231 & 18688) : -30718 & 1025;
                    }
                } else if (class_23823.Method_23844() instanceof Class_37716 && !(class_238232.Method_23844() instanceof Class_37716)) {
                    n2 = 9747 & 6213;
                } else if (class_23823.Method_23844() instanceof Class_37716 && class_238232.Method_23844() instanceof Class_37716) {
                    object = (Class_37716)class_23823.Method_23844();
                    Class_37716 class_37716 = (Class_37716)class_238232.Method_23844();
                    n2 = ((Class_37716)object).Field_37718 != class_37716.Field_37718 ? (((Class_37716)object).Field_37718 > class_37716.Field_37718 ? -10143 & 8709 : -32760 & 31780) : (class_23823.Method_23843() > class_238232.Method_23843() || class_23823.Method_23842() && !class_238232.Method_23842() ? -30655 & 24873 : 7310 & -16304);
                } else {
                    n2 = 16640 & 8194;
                }
            }
            if (n2 != 0 && this.Method_34180(class_23823)) {
                if (class_238232 != null && this.\u0000strictfp.nextFloat() - 0.0063829785f * 15.666667f < this.Field_34101[n]) {
                    this.\u0000strictfp(class_238232, 0.0f);
                }
                if (class_23823.Method_23844() == Class_10527.Field_10673 && class_3443.Method_3475() != null && (object = this.\u0000strictfp.Method_489(class_3443.Method_3475())) != null) {
                    ((Class_626)object).Method_750(Class_21905.Field_21907);
                }
                this.Method_34159(n, class_23823);
                this.Field_34101[n] = 2.0f;
                this.Field_34106 = -20333 & 581;
                this.\u0000, `((Class_1061)class_3443, 8937 & 1301);
                class_3443.\u0000break();
            }
        }
    }

    public boolean Method_34140(int n, Class_23823 class_23823) {
        int n2;
        if (n == (6243 & -24333)) {
            n2 = -25984 & 25680;
        } else {
            n2 = n - (-13980 & 9318) + (10249 & 771);
            if (n2 < 0 || n2 >= this.Field_34113.length) {
                return (-32224 & 24711) != 0;
            }
        }
        if (class_23823 == null || Class_34093.Method_34150(class_23823) == n2 || n2 == (-24060 & 1180) && class_23823.Method_23844() instanceof Class_41056) {
            this.Method_34159(n2, class_23823);
            return (-30671 & 20611) != 0;
        }
        return (3072 & 16553) != 0;
    }

    public boolean Method_34141() {
        return (!this.Method_34160() && !(this instanceof Class_32423) ? 387 & -18391 : -31990 & 14368) != 0;
    }

    protected boolean Method_34142() {
        return (1 & -28367) != 0;
    }

    public boolean Method_34143() {
        return (12993 & -31731) != 0;
    }

    protected void Method_34144() {
        super.Method_1019();
        this.\u0000strictfp().\u0000= final(Class_21716.Field_21719).Method_16556(10.790697674418604 * 1.4827586206896552);
    }

    public Class_7611 Method_34145() {
        return this.Field_34107;
    }

    public void Method_34146(boolean bl, boolean bl2) {
        if (this.Field_34098) {
            this.Field_34098 = 7216 & -32248;
            this.Field_34112 = null;
            if (!this.\u0000strictfp.Field_306 && bl2) {
                this.\u0000strictfp(Class_10527.Field_10536, -22773 & 18625);
            }
            if (!this.\u0000strictfp.Field_306 && bl && this.\u0000strictfp instanceof Class_2651) {
                ((Class_2651)this.\u0000strictfp).Method_2711().Method_7970(this, new Class_34578(-20991 & 303, this, null));
            }
        }
    }

    public Class_21465 Method_34147() {
        return this.Field_34100;
    }

    public void Method_34148(boolean bl) {
        this.Field_34104 = bl;
    }

    public Class_34093(Class_283 class_283) {
        super(class_283);
        this.Field_34108 = new Class_16850(class_283 != null && class_283.Field_310 != null ? class_283.Field_310 : null);
        this.Field_34105 = new Class_16850(class_283 != null && class_283.Field_310 != null ? class_283.Field_310 : null);
        this.Field_34100 = new Class_21465(this);
        this.Field_34099 = new Class_27079(this);
        this.Field_34114 = new Class_29579(this);
        this.Field_34103 = new Class_7245(this);
        this.Field_34107 = this.Method_34154(class_283);
        this.Field_34097 = new Class_27487(this);
        for (int i = 21008 & 3072; i < this.Field_34101.length; ++i) {
            this.Field_34101[i] = 0.64705884f * 0.13136363f;
        }
        UUID uUID = this.\u0000strictfp();
        long l = uUID.getLeastSignificantBits();
        this.Field_34102 = (int)(l & (Integer.MAX_VALUE & -2429064792007245825L));
    }

    public void Method_34149(Class_1699 class_1699) {
        Class_1758 class_1758;
        int n;
        super.Method_980(class_1699);
        if (class_1699.Method_1715("CanPickUpLoot", 1157 & -18429)) {
            this.Method_34148(class_1699.Method_1733("CanPickUpLoot"));
        }
        this.Field_34106 = class_1699.Method_1733("PersistenceRequired");
        if (class_1699.Method_1715("Equipment", 13 & -10183)) {
            class_1758 = class_1699.Method_1735("Equipment", 8266 & 19006);
            for (n = 19984 & 4328; n < this.Field_34113.length; ++n) {
                this.Field_34113[n] = Class_23823.Method_23840(class_1758.Method_1768(n));
            }
        }
        if (class_1699.Method_1715("DropChances", 4873 & 9449)) {
            class_1758 = class_1699.Method_1735("DropChances", 519 & 16581);
            for (n = 10295 & -16376; n < class_1758.Method_1772(); ++n) {
                this.Field_34101[n] = class_1758.Method_1770(n);
            }
        }
        this.Field_34098 = class_1699.Method_1733("Leashed");
        if (this.Field_34098 && class_1699.Method_1715("Leash", 14618 & 527)) {
            this.Field_34096 = class_1699.Method_1703("Leash");
        }
        this.Method_34183(class_1699.Method_1733("NoAI"));
    }

    public static int Method_34150(Class_23823 class_23823) {
        if (class_23823.Method_23844() != Class_1956.Method_1981(Class_9265.Field_9337) && class_23823.Method_23844() != Class_10527.Field_10702) {
            if (class_23823.Method_23844() instanceof Class_37716) {
                switch (((Class_37716)class_23823.Method_23844()).Field_37717) {
                    case 0: {
                        return 17430 & 12556;
                    }
                    case 1: {
                        return 4099 & -15397;
                    }
                    case 2: {
                        return 394 & 3;
                    }
                    case 3: {
                        return -24557 & 2089;
                    }
                }
            }
            return -16220 & 6162;
        }
        return 28006 & 4100;
    }

    protected void Method_34151(boolean bl, int n) {
        Class_1956 class_1956 = this.Method_34129();
        if (class_1956 != null) {
            int n2 = this.\u0000strictfp.nextInt(-31597 & 4419);
            if (n > 0) {
                n2 += this.\u0000strictfp.nextInt(n + (-31823 & 23563));
            }
            for (int i = 20524 & 8208; i < n2; ++i) {
                this.\u0000strictfp(class_1956, 16689 & -28019);
            }
        }
    }

    public void Method_34152(Class_1061 class_1061, boolean bl) {
        this.Field_34098 = -23419 & 4873;
        this.Field_34112 = class_1061;
        if (!this.\u0000strictfp.Field_306 && bl && this.\u0000strictfp instanceof Class_2651) {
            ((Class_2651)this.\u0000strictfp).Method_2711().Method_7970(this, new Class_34578(5409 & 26753, this, this.Field_34112));
        }
    }

    public boolean Method_34153() {
        return this.Field_34104;
    }

    protected Class_7611 Method_34154(Class_283 class_283) {
        return new Class_25797(this, class_283);
    }

    public boolean Method_34155() {
        return (this.\u0000strictfp.Method_542(this.\u0000, `(), this) && this.\u0000strictfp.Method_461(this, this.\u0000, `()).isEmpty() && !this.\u0000strictfp.Method_509(this.\u0000, `()) ? 16389 & 13635 : 8200 & 1154) != 0;
    }

    public boolean Method_34156() {
        return (this.\u0000strictfp.Method_32708(21455 & 15) != 0 ? -24573 & 2173 : 6184 & 1024) != 0;
    }

    protected void Method_34157() {
        if (this.Field_34106) {
            this.\u0000break = 3104 & -28654;
        } else {
            Class_626 class_626 = this.\u0000strictfp.Method_469(this, 1.641025641025641 * -0.609375);
            if (class_626 != null) {
                double d = class_626.\u0000= package - this.\u0000= package;
                double d2 = class_626.\u0000, for() - this.\u0000, for();
                double d3 = class_626.\u0000= switch - this.\u0000= switch;
                double d4 = d * d + d2 * d2 + d3 * d3;
                if (this.Method_34142() && d4 > 7329.684210526316 * 2.235294117647059) {
                    this.\u0000break();
                }
                if (this.\u0000break > (2904 & 4825) && this.\u0000strictfp.nextInt(-30874 & 25377) == 0 && d4 > 2861.176470588235 * 0.35789473684210527 && this.Method_34142()) {
                    this.\u0000break();
                } else if (d4 < 10.0 * 102.4) {
                    this.\u0000break = 8706 & -30316;
                }
            }
        }
    }

    protected void Method_34158(boolean bl, int n) {
        for (int i = 8267 & -30704; i < this.Method_34119().length; ++i) {
            int n2;
            Class_23823 class_23823 = this.Method_34135(i);
            int n3 = n2 = this.Field_34101[i] > 1.0f ? 8197 & 5299 : 66 & 0;
            if (class_23823 == null || !bl && n2 == 0 || !(this.\u0000strictfp.nextFloat() - (float)n * (0.13857143f * 0.072164945f) < this.Field_34101[i])) continue;
            if (n2 == 0 && class_23823.Method_23846()) {
                int n4 = Math.max(class_23823.Method_23859() - (57 & 477), 9601 & -32767);
                int n5 = class_23823.Method_23859() - this.\u0000strictfp.nextInt(this.\u0000strictfp.nextInt(n4) + (4161 & 24635));
                if (n5 > n4) {
                    n5 = n4;
                }
                if (n5 < (12385 & 1801)) {
                    n5 = -32767 & 17289;
                }
                class_23823.Method_23849(n5);
            }
            this.\u0000strictfp(class_23823, 0.0f);
        }
    }

    public void Method_34159(int n, Class_23823 class_23823) {
        this.Field_34113[n] = class_23823;
    }

    public boolean Method_34160() {
        return this.Field_34098;
    }

    public void Method_34161(float f) {
        this.\u0000= static = f;
    }

    public Class_27487 Method_34162() {
        return this.Field_34097;
    }

    public Class_23823 Method_34163() {
        return this.Field_34113[20480 & 8890];
    }

    public Class_29579 Method_34164() {
        return this.Field_34114;
    }

    private float Method_34165(float f, float f2, float f3) {
        float f4 = Class_13337.Method_13354(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    protected void Method_34166() {
        if (this.Field_34096 != null) {
            this.Method_34125();
        }
        if (this.Field_34098) {
            if (!this.\u0000volatile()) {
                this.Method_34146((4531 & -30715) != 0, (20509 & 931) != 0);
            }
            if (this.Field_34112 == null || this.Field_34112.Field_1110) {
                this.Method_34146((385 & 1613) != 0, (2065 & -12159) != 0);
            }
        }
    }

    public boolean Method_34167(Class class_) {
        return (class_ != Class_46703.class ? 10255 & -28015 : 1031 & -30464) != 0;
    }

    public Class_23823 Method_34168(int n) {
        return this.Field_34113[n + (-16103 & 6183)];
    }

    public Class_26405 Method_34169(Class_33888 class_33888, Class_26405 class_26405) {
        this.\u0000strictfp(Class_21716.Field_21719).Method_16549(new Class_10375("Random spawn bonus", this.\u0000strictfp.nextGaussian() * (0.30985915492957744 * 0.16136363636363638), 261 & 29219));
        return class_26405;
    }

    protected final void Method_34170() {
        this.\u0000break += 8707 & 2369;
        this.\u0000strictfp.Field_310.Method_2789("checkDespawn");
        this.Method_34157();
        this.\u0000strictfp.Field_310.Method_2790();
        this.\u0000strictfp.Field_310.Method_2789("sensing");
        this.Field_34097.Method_27492();
        this.\u0000strictfp.Field_310.Method_2790();
        this.\u0000strictfp.Field_310.Method_2789("targetSelector");
        this.Field_34105.Method_16859();
        this.\u0000strictfp.Field_310.Method_2790();
        this.\u0000strictfp.Field_310.Method_2789("goalSelector");
        this.Field_34108.Method_16859();
        this.\u0000strictfp.Field_310.Method_2790();
        this.\u0000strictfp.Field_310.Method_2789("navigation");
        this.Field_34107.Method_7630();
        this.\u0000strictfp.Field_310.Method_2790();
        this.\u0000strictfp.Field_310.Method_2789("mob tick");
        this.Method_34122();
        this.\u0000strictfp.Field_310.Method_2790();
        this.\u0000strictfp.Field_310.Method_2789("controls");
        this.\u0000strictfp.Field_310.Method_2789("move");
        this.Field_34099.Method_27088();
        this.\u0000strictfp.Field_310.Method_2783("look");
        this.Field_34100.Method_21473();
        this.\u0000strictfp.Field_310.Method_2783("jump");
        this.Field_34114.Method_29582();
        this.\u0000strictfp.Field_310.Method_2790();
        this.\u0000strictfp.Field_310.Method_2790();
    }

    public final boolean Method_34171(Class_626 class_626) {
        if (this.Method_34160() && this.Method_34131() == class_626) {
            this.Method_34146((14337 & 1823) != 0, (!class_626.Field_694.Method_18094() ? 3077 & 4155 : 8332 & 3074) != 0);
            return (8721 & 2501) != 0;
        }
        Class_23823 class_23823 = class_626.Field_628.Method_37821();
        if (class_23823 != null && class_23823.Method_23844() == Class_10527.Field_10536 && this.Method_34141()) {
            if (!(this instanceof Class_45651) || !((Class_45651)this).Method_45670()) {
                this.Method_34152(class_626, (30729 & -32687) != 0);
                class_23823.Field_23826 -= 8771 & 23613;
                return (-24313 & 2673) != 0;
            }
            if (((Class_45651)this).Method_45664(class_626)) {
                this.Method_34152(class_626, (651 & 16417) != 0);
                class_23823.Field_23826 -= 28689 & 1601;
                return (1809 & 4097) != 0;
            }
        }
        return (this.Method_34137(class_626) ? -30447 & 18057 : (int)(super.\u0000, `(class_626) ? 1 : 0)) != 0;
    }

    public void Method_34172(float f) {
        super.Method_1015(f);
        this.Method_34161(f);
    }

    public int Method_34173() {
        return -27415 & 18472;
    }

    public void Method_34174(int n, float f) {
        this.Field_34101[n] = f;
    }

    public void Method_34175() {
        if (Class_19426.Method_19608() && this.Method_34185()) {
            this.Method_34177();
        } else {
            super.Method_940();
            if (!this.\u0000strictfp.Field_306) {
                this.Method_34166();
            }
        }
    }

    public boolean Method_34176() {
        return (super.Method_1051() && !this.Method_34156() ? 8229 & -32623 : -32756 & 17072) != 0;
    }

    private void Method_34177() {
        float f;
        this.\u0000break += 1057 & 24851;
        if (this instanceof Class_41880 && (f = this.\u0000strictfp(1.0f)) > 1.0f * 0.5f) {
            this.\u0000break += -12026 & 10786;
        }
        this.Method_34157();
    }

    public void Method_34178(Class_1699 class_1699) {
        super.Method_1037(class_1699);
        class_1699.Method_1706("CanPickUpLoot", this.Method_34153());
        class_1699.Method_1706("PersistenceRequired", this.Field_34106);
        Class_1758 class_1758 = new Class_1758();
        for (int i = 1482 & 10245; i < this.Field_34113.length; ++i) {
            Class_1699 class_16992 = new Class_1699();
            if (this.Field_34113[i] != null) {
                this.Field_34113[i].Method_23841(class_16992);
            }
            class_1758.Method_1781(class_16992);
        }
        class_1699.Method_1744("Equipment", class_1758);
        Class_1758 class_17582 = new Class_1758();
        for (int i = -8171 & 3776; i < this.Field_34101.length; ++i) {
            class_17582.Method_1781(new Class_39580(this.Field_34101[i]));
        }
        class_1699.Method_1744("DropChances", class_17582);
        class_1699.Method_1706("Leashed", this.Field_34098);
        if (this.Field_34112 != null) {
            Class_1699 class_16993 = new Class_1699();
            if (this.Field_34112 instanceof Class_859) {
                class_16993.Method_1718("UUIDMost", this.Field_34112.Method_1194().getMostSignificantBits());
                class_16993.Method_1718("UUIDLeast", this.Field_34112.Method_1194().getLeastSignificantBits());
            } else if (this.Field_34112 instanceof Class_25768) {
                Class_4751 class_4751 = ((Class_25768)this.Field_34112).Method_25782();
                class_16993.Method_1739("X", class_4751.\u0000= final());
                class_16993.Method_1739("Y", class_4751.\u0000, `());
                class_16993.Method_1739("Z", class_4751.\u0000strictfp());
            }
            class_1699.Method_1744("Leash", class_16993);
        }
        if (this.Method_34156()) {
            class_1699.Method_1706("NoAI", this.Method_34156());
        }
    }

    public int Method_34179() {
        if (this.Method_34127() == null) {
            return 16011 & -16301;
        }
        int n = (int)(this.\u0000abstract() - this.\u0000switch() * (90.0f * 0.0036666668f));
        if ((n -= ((8903 & -28661) - this.\u0000strictfp.Method_487().Method_26822()) * (165 & -21436)) < 0) {
            n = 522 & 160;
        }
        return n + (535 & 1035);
    }

    protected boolean Method_34180(Class_23823 class_23823) {
        return (2821 & 16417) != 0;
    }

    public void Method_34181() {
        super.Method_937();
        this.\u0000strictfp.Field_310.Method_2789("mobBaseTick");
        if (this.\u0000volatile()) {
            int n = this.Field_34094;
            this.Field_34094 = n + (-16351 & 1107);
            if (this.\u0000strictfp.nextInt(-31767 & 11240) < n) {
                this.Field_34094 = -this.Method_34190();
                this.Method_34134();
            }
        }
        this.\u0000strictfp.Field_310.Method_2790();
    }

    public Class_27079 Method_34182() {
        return this.Field_34099;
    }

    public void Method_34183(boolean bl) {
        this.\u0000strictfp.Method_32704(-32721 & 8271, (byte)(bl ? 4369 & 19523 : 66 & 11288));
    }

    protected void Method_34184(Class_33888 class_33888) {
        if (this.\u0000strictfp.nextFloat() < 0.2777778f * 0.54f * class_33888.Method_33891()) {
            float f;
            int n = this.\u0000strictfp.nextInt(-23485 & 4106);
            float f2 = f = this.\u0000strictfp.Method_487() == Class_26801.Field_26804 ? 0.6857143f * 0.14583333f : 0.2596154f * 0.962963f;
            if (this.\u0000strictfp.nextFloat() < 1.4186046f * 0.06696721f) {
                ++n;
            }
            if (this.\u0000strictfp.nextFloat() < 0.125f * 0.76f) {
                ++n;
            }
            if (this.\u0000strictfp.nextFloat() < 1.7083334f * 0.055609755f) {
                ++n;
            }
            for (int i = -32497 & 4099; i >= 0; --i) {
                Class_1956 class_1956;
                Class_23823 class_23823 = this.Method_34168(i);
                if (i < (-32757 & 10819) && this.\u0000strictfp.nextFloat() < f) break;
                if (class_23823 != null || (class_1956 = Class_34093.Method_34126(i + (16479 & -32223), n)) == null) continue;
                this.Method_34159(i + (8201 & 6853), new Class_23823(class_1956));
            }
        }
    }

    private boolean Method_34185() {
        double d;
        if (this.\u0000, for()) {
            return (14851 & -31488) != 0;
        }
        if (this.\u0000= " > 0) {
            return (4232 & 17409) != 0;
        }
        if (this.\u0000= package < (14740 & 607)) {
            return (5 & -6408) != 0;
        }
        Class_283 class_283 = this.\u0000strictfp();
        if (class_283 == null) {
            return (576 & -6123) != 0;
        }
        if (class_283.Field_325.size() != (10257 & 4161)) {
            return (4005 & -32696) != 0;
        }
        Class_1061 class_1061 = (Class_1061)class_283.Field_325.get(3182 & -12272);
        double d2 = Math.abs(this.\u0000= package - class_1061.Field_1130) - 25.846153846153847 * 0.6190476190476191;
        double d3 = d2 * d2 + (d = Math.abs(this.\u0000= switch - class_1061.Field_1106) - 48.0 * 0.3333333333333333) * d;
        return (!this.\u0000strictfp(d3) ? 8295 & 1161 : -31744 & 136) != 0;
    }

    public void Method_34186(byte by) {
        if (by == (85 & 1300)) {
            this.Method_34189();
        } else {
            super.Method_968(by);
        }
    }

    public void Method_34187() {
        this.Field_34106 = -32719 & 28747;
    }

    public void Method_34188(Class_1061 class_1061, float f, float f2) {
        double d;
        double d2 = class_1061.Field_1130 - this.\u0000= package;
        double d3 = class_1061.Field_1106 - this.\u0000= switch;
        if (class_1061 instanceof Class_859) {
            Class_859 class_859 = (Class_859)class_1061;
            d = class_859.\u0000, for() + (double)class_859.\u0000, for() - (this.\u0000, for() + (double)this.\u0000, for());
        } else {
            d = (class_1061.Method_1315().Field_11000 + class_1061.Method_1315().Field_10998) / (2.3333333333333335 * 0.8571428571428571) - (this.\u0000, for() + (double)this.\u0000, for());
        }
        double d4 = Class_13337.Method_13347(d2 * d2 + d3 * d3);
        float f3 = (float)(Class_13337.Method_13391(d3, d2) * (289.2857142857143 * 0.6222222222222222) / (0.3888888888888889 * 8.078381109230897)) - 88.125f * 1.0212766f;
        float f4 = (float)(-(Class_13337.Method_13391(d, d4) * (180.0 * 1.0) / (48.69468613064179 * 0.06451612903225806)));
        this.\u0000= float = this.Method_34165(this.\u0000= float, f4, f2);
        this.\u0000= ? = this.Method_34165(this.\u0000= ?, f3, f);
    }

    public void Method_34189() {
        if (this.\u0000strictfp.Field_306) {
            for (int i = 8320 & 0; i < (-32491 & 5236); ++i) {
                double d = this.\u0000strictfp.nextGaussian() * (1.0298507462686568 * 0.01942028985507246);
                double d2 = this.\u0000strictfp.nextGaussian() * (0.0684931506849315 * 0.29200000000000004);
                double d3 = this.\u0000strictfp.nextGaussian() * (0.12727272727272726 * 0.15714285714285717);
                double d4 = 0.6153846153846154 * 16.25;
                this.\u0000strictfp.Method_407(Class_40274.Field_40288, this.\u0000= package + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= int() * 2.0f) - (double)this.\u0000= int() - d * d4, this.\u0000, for() + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= switch()) - d2 * d4, this.\u0000= switch + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= int() * 2.0f) - (double)this.\u0000= int() - d3 * d4, d, d2, d3, new int[324 & -15744]);
            }
        } else {
            this.\u0000strictfp.Method_483(this, (byte)(8213 & -14284));
        }
    }

    public int Method_34190() {
        return 11344 & 4215;
    }
}

