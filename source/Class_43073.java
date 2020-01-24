/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_43073
extends Class_41880 {
    private int Field_43074 = 2068 & -30847;
    private int Field_43075;
    private int Field_43076;
    private int Field_43077 = 17027 & 1367;
    private int Field_43078 = 1247 & 8254;

    public void Method_43079(Class_32797 class_32797) {
        super.\u0000strictfp(class_32797);
        if (class_32797.Method_32856() instanceof Class_43151) {
            int n = Class_1956.Method_1986(Class_10527.Field_10650);
            int n2 = Class_1956.Method_1986(Class_10527.Field_10648);
            int n3 = n + this.\u0000strictfp.nextInt(n2 - n + (24869 & 75));
            this.\u0000strictfp(Class_1956.Method_1978(n3), 677 & 28689);
        } else if (class_32797.Method_32856() instanceof Class_43073 && class_32797.Method_32856() != this && ((Class_43073)class_32797.Method_32856()).Method_43097() && ((Class_43073)class_32797.Method_32856()).Method_43098()) {
            ((Class_43073)class_32797.Method_32856()).Method_43095();
            this.\u0000strictfp(new Class_23823(Class_10527.Field_10702, 235 & 7189, 22532 & 9412), 0.0f);
        }
    }

    public void Method_43080(Class_1699 class_1699) {
        super.\u0000strictfp(class_1699);
        if (this.\u0000strictfp.Method_32708(13361 & -32747) == (16427 & 2577)) {
            class_1699.Method_1706("powered", (2249 & -32255) != 0);
        }
        class_1699.Method_1731("Fuse", (short)this.Field_43078);
        class_1699.Method_1724("ExplosionRadius", (byte)this.Field_43077);
        class_1699.Method_1706("ignited", this.Method_43096());
    }

    public boolean Method_43081(Class_1061 class_1061) {
        return (-12277 & 9717) != 0;
    }

    public void Method_43082(float f, float f2) {
        super.\u0000, `(f, f2);
        this.Field_43076 = (int)((float)this.Field_43076 + f * (7.9615383f * 0.1884058f));
        if (this.Field_43076 > this.Field_43078 - (16413 & -31609)) {
            this.Field_43076 = this.Field_43078 - (-20475 & 525);
        }
    }

    private void Method_43083() {
        if (!this.\u0000strictfp.Field_306) {
            boolean bl = this.\u0000strictfp.Method_522().Method_7529("mobGriefing");
            float f = this.Method_43097() ? 2.0f : 1.0f;
            this.\u0000strictfp.Method_515(this, this.\u0000= package, this.\u0000, for(), this.\u0000= switch, (float)this.Field_43077 * f, bl);
            this.\u0000break();
        }
    }

    protected void Method_43084() {
        super.\u0000= final();
        this.\u0000strictfp.Method_32719(24850 & 148, (byte)(-1 & -1));
        this.\u0000strictfp.Method_32719(2705 & 5467, (byte)(256 & 16433));
        this.\u0000strictfp.Method_32719(1050 & -11790, (byte)(538 & -24575));
    }

    public float Method_43085(float f) {
        return ((float)this.Field_43075 + (float)(this.Field_43076 - this.Field_43075) * f) / (float)(this.Field_43078 - (20562 & 3334));
    }

    public void Method_43086(Class_27363 class_27363) {
        super.\u0000strictfp(class_27363);
        this.\u0000strictfp.Method_32704(23065 & 145, (byte)(2609 & 17673));
    }

    public void Method_43087(Class_1699 class_1699) {
        super.\u0000, `(class_1699);
        this.\u0000strictfp.Method_32704(8889 & 7447, (byte)(class_1699.Method_1733("powered") ? 24597 & -32727 : 5769 & 16454));
        if (class_1699.Method_1715("Fuse", 2667 & 5619)) {
            this.Field_43078 = class_1699.Method_1726("Fuse");
        }
        if (class_1699.Method_1715("ExplosionRadius", -31369 & 4195)) {
            this.Field_43077 = class_1699.Method_1716("ExplosionRadius");
        }
        if (class_1699.Method_1733("ignited")) {
            this.Method_43102();
        }
    }

    public void Method_43088() {
        if (this.\u0000volatile()) {
            int n;
            this.Field_43075 = this.Field_43076;
            if (this.Method_43096()) {
                this.Method_43091(17417 & 12369);
            }
            if ((n = this.Method_43099()) > 0 && this.Field_43076 == 0) {
                this.\u0000strictfp("creeper.primed", 1.0f, 3.2307692f * 0.15476191f);
            }
            this.Field_43076 += n;
            if (this.Field_43076 < 0) {
                this.Field_43076 = -32766 & 4429;
            }
            if (this.Field_43076 >= this.Field_43078) {
                this.Field_43076 = this.Field_43078;
                this.Method_43083();
            }
        }
        super.Method_41885();
    }

    protected void Method_43089() {
        super.Method_41890();
        this.\u0000strictfp(Class_21716.Field_21722).Method_16556(0.22916666666666669 * 1.0909090909090908);
    }

    public int Method_43090() {
        return this.\u0000strictfp() == null ? 535 & 10371 : (19 & -29817) + (int)(this.\u0000abstract() - 1.0f);
    }

    public void Method_43091(int n) {
        this.\u0000strictfp.Method_32704(2069 & 496, (byte)n);
    }

    private void Method_43092() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected boolean Method_43093(Class_626 class_626) {
        Class_23823 class_23823 = class_626.Field_628.Method_37821();
        if (class_23823 != null && class_23823.Method_23844() == Class_10527.Field_10615) {
            this.\u0000strictfp.Method_475(this.\u0000= package + 0.1 * 5.0, this.\u0000, for() + 0.036585365853658534 * 13.666666666666668, this.\u0000= switch + 0.9204545454545455 * 0.5432098765432098, "fire.ignite", 1.0f, this.\u0000strictfp.nextFloat() * (0.10769231f * 3.7142856f) + 1.1136364f * 0.71836734f);
            class_626.\u0000, for();
            if (!this.\u0000strictfp.Field_306) {
                this.Method_43102();
                class_23823.Method_23883(16397 & -25983, class_626);
                return (19111 & 1105) != 0;
            }
        }
        return super.\u0000= final(class_626);
    }

    protected Class_1956 Method_43094() {
        return Class_10527.Field_10579;
    }

    public Class_43073(Class_283 class_283) {
        super(class_283);
        this.\u0000strictfp.Method_16858(173 & 4673, new Class_40128(this));
        this.\u0000strictfp.Method_16858(4370 & 42, new Class_35285(this));
        this.\u0000strictfp.Method_16858(-20465 & 707, new Class_34269(this, Class_47883.class, 93.0f * 0.06451613f, 1.0, 1.0 * 1.2));
        this.\u0000strictfp.Method_16858(21575 & 4, new Class_36925(this, 1.0, (21348 & -32766) != 0));
        this.\u0000strictfp.Method_16858(26629 & -32529, new Class_34936(this, 1.3224489795918368 * 0.6049382716049383));
        this.\u0000strictfp.Method_16858(6406 & 110, new Class_38500(this, Class_626.class, 1.8125f * 4.413793f));
        this.\u0000strictfp.Method_16858(86 & -32250, new Class_46015(this));
        this.\u0000, `.Method_16858(18489 & -24443, new Class_44015(this, Class_626.class, (16385 & 8723) != 0));
        this.\u0000, `.Method_16858(12035 & 126, new Class_39631(this, (4513 & 1032) != 0, new Class[-32480 & 520]));
    }

    public void Method_43095() {
        this.Field_43074 += 8739 & -32615;
    }

    public boolean Method_43096() {
        return (this.\u0000strictfp.Method_32708(8338 & 2839) != 0 ? 27043 & 1037 : 20534 & 584) != 0;
    }

    public boolean Method_43097() {
        return (this.\u0000strictfp.Method_32708(25 & 19859) == (1 & -10969) ? 10321 & 16517 : 1670 & -32416) != 0;
    }

    public boolean Method_43098() {
        return (this.Field_43074 < (-24783 & 8387) && this.\u0000strictfp.Method_522().Method_7529("doMobLoot") ? 9 & 26915 : 12320 & 394) != 0;
    }

    public int Method_43099() {
        return this.\u0000strictfp.Method_32708(-31568 & 4689);
    }

    protected String Method_43100() {
        return "mob.creeper.say";
    }

    protected String Method_43101() {
        return "mob.creeper.death";
    }

    public void Method_43102() {
        this.\u0000strictfp.Method_32704(20575 & 10898, (byte)(7205 & -16111));
    }
}

