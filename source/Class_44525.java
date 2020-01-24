/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_44525
extends Class_43406 {
    private int Field_44526 = -32512 & 28834;
    private boolean Field_44527 = -22508 & 22049;
    private int Field_44528 = -30207 & 29060;
    private Class_43330 Field_44529;
    private boolean Field_44530 = 25000 & -25082;
    private int Field_44531 = 1678 & 31024;
    private int Field_44532 = 16914 & -22528;
    private Class_14002 Field_44533 = Class_14002.Field_14011;
    private Class_626 Field_44534 = null;

    protected int Method_44535() {
        return this.Field_44533.Method_14013();
    }

    protected String Method_44536() {
        return "mob.rabbit.death";
    }

    public int Method_44537() {
        return this.Method_44545() == (99 & 25187) ? 5418 & 25116 : super.\u0000, 2();
    }

    protected String Method_44538() {
        return "mob.rabbit.hop";
    }

    public Class_26405 Method_44539(Class_33888 class_33888, Class_26405 class_26405) {
        class_26405 = super.\u0000strictfp(class_33888, class_26405);
        int n = this.\u0000strictfp.nextInt(1286 & 175);
        int n2 = 17024 & -32476;
        if (class_26405 instanceof Class_28850) {
            n = ((Class_28850)class_26405).Field_28851;
            n2 = 65 & 19221;
        } else {
            class_26405 = new Class_28850(n);
        }
        this.Method_44540(n);
        if (n2 != 0) {
            this.\u0000, `(-19896 & -6576);
        }
        return class_26405;
    }

    public void Method_44540(int n) {
        if (n == (611 & -27165)) {
            this.\u0000strictfp.Method_16863(this.Field_44529);
            this.\u0000strictfp.Method_16858(16404 & -19315, new Class_40419(this));
            this.\u0000, `.Method_16858(233 & 21521, new Class_39631(this, (-32639 & 8800) != 0, new Class[202 & 6448]));
            this.\u0000, `.Method_16858(-32750 & 16426, new Class_44015(this, Class_626.class, (21089 & 1289) != 0));
            this.\u0000, `.Method_16858(17438 & 195, new Class_44015(this, Class_47526.class, (13313 & 18755) != 0));
            if (!this.\u0000strictfp()) {
                this.\u0000= final(Class_7594.Method_7602("entity.KillerBunny.name"));
            }
        }
        this.\u0000strictfp.Method_32704(26 & -19690, (byte)n);
    }

    public boolean Method_44541(Class_32797 class_32797, float f) {
        return (this.\u0000strictfp(class_32797) ? 24578 & 513 : (int)(super.Method_43420(class_32797, f) ? 1 : 0)) != 0;
    }

    public float Method_44542(float f) {
        return this.Field_44528 == 0 ? 0.0f : ((float)this.Field_44526 + f) / (float)this.Field_44528;
    }

    protected String Method_44543() {
        return "mob.rabbit.hurt";
    }

    private void Method_44544() {
        this.Field_44532 = this.Method_44535();
    }

    public int Method_44545() {
        return this.\u0000strictfp.Method_32708(1554 & 8627);
    }

    protected float Method_44546() {
        return this.\u0000strictfp.Method_27093() && this.\u0000strictfp.Method_27090() > this.\u0000, for() + 0.803030303030303 * 0.6226415094339623 ? 0.82258064f * 0.60784316f : this.Field_44533.Method_14024();
    }

    protected void Method_44547() {
        int[] arrn = new int[13 & -25663];
        arrn[2056 & 1601] = Class_3238.Method_3367(Class_9265.Field_9439.Method_3342(6663 & 8655));
        this.\u0000strictfp.Method_407(Class_40274.Field_40311, this.\u0000= package + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= int() * 2.0f) - (double)this.\u0000= int(), this.\u0000, for() + 0.5 * 1.0 + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= switch()), this.\u0000= switch + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= int() * 2.0f) - (double)this.\u0000= int(), 0.0, 0.0, 0.0, arrn);
        this.Field_44531 = 18148 & 4478;
    }

    public void Method_44548(byte by) {
        if (by == (19737 & -32763)) {
            this.\u0000= static();
            this.Field_44528 = 171 & -26802;
            this.Field_44526 = 23827 & -32760;
        } else {
            super.Method_43414(by);
        }
    }

    public void Method_44549(Class_1699 class_1699) {
        super.Method_43425(class_1699);
        class_1699.Method_1739("RabbitType", this.Method_44545());
        class_1699.Method_1739("MoreCarrotTicks", this.Field_44531);
    }

    public boolean Method_44550(Class_1061 class_1061) {
        if (this.Method_44545() == (-24333 & 4195)) {
            this.\u0000strictfp("mob.attack", 1.0f, (this.\u0000strictfp.nextFloat() - this.\u0000strictfp.nextFloat()) * (0.4717949f * 0.42391303f) + 1.0f);
            return class_1061.Method_1340(Class_32797.Method_32863(this), 3.2941177f * 2.4285715f);
        }
        return class_1061.Method_1340(Class_32797.Method_32863(this), 0.42391303f * 7.0769234f);
    }

    private boolean Method_44551(Class_1956 class_1956) {
        return (class_1956 == Class_10527.Field_10713 || class_1956 == Class_10527.Field_10681 || class_1956 == Class_1956.Method_1981(Class_9265.Field_9353) ? 1 & 11323 : 4124 & 16928) != 0;
    }

    static boolean Method_44552(Class_44525 class_44525) {
        return class_44525.Method_44564();
    }

    public void Method_44553() {
        super.Method_43426();
        if (this.Field_44526 != this.Field_44528) {
            if (this.Field_44526 == 0 && !this.\u0000strictfp.Field_306) {
                this.\u0000strictfp.Method_483(this, (byte)(725 & 4131));
            }
            this.Field_44526 += 13641 & -30559;
        } else if (this.Field_44528 != 0) {
            this.Field_44526 = -31744 & 27171;
            this.Field_44528 = 256 & -23391;
        }
    }

    protected void Method_44554() {
        this.\u0000strictfp(new Class_23823(Class_10527.Field_10694, 465 & 24589), 0.0f);
    }

    public void Method_44555(Class_14002 class_14002) {
        this.Field_44533 = class_14002;
    }

    public void Method_44556(double d) {
        this.\u0000strictfp().Method_7624(d);
        this.\u0000strictfp.Method_27094(this.\u0000strictfp.Method_27089(), this.\u0000strictfp.Method_27090(), this.\u0000strictfp.Method_27091(), d);
    }

    private void Method_44557(double d, double d2) {
        this.\u0000= ? = (float)(Class_13337.Method_13391(d2 - this.\u0000= switch, d - this.\u0000= package) * (2.238095238095238 * 80.42553191489361) / (1.8666666666666667 * 1.6829960644231035)) - 0.20454545f * 440.0f;
    }

    public boolean Method_44558() {
        return this.Field_44530;
    }

    private void Method_44559() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_44560() {
    }

    private void Method_44561() {
        this.Method_44544();
        this.Method_44566();
    }

    protected void Method_44562(boolean bl, int n) {
        int n2;
        int n3 = this.\u0000strictfp.nextInt(2 & -27381) + this.\u0000strictfp.nextInt((1 & -23391) + n);
        for (n2 = -24556 & 4106; n2 < n3; ++n2) {
            this.\u0000strictfp(Class_10527.Field_10649, -8061 & 4365);
        }
        n3 = this.\u0000strictfp.nextInt(402 & 8743);
        for (n2 = -16382 & 10817; n2 < n3; ++n2) {
            if (this.\u0000, 2()) {
                this.\u0000strictfp(Class_10527.Field_10558, 17897 & 12291);
                continue;
            }
            this.\u0000strictfp(Class_10527.Field_10560, 18441 & -32509);
        }
    }

    public boolean Method_44563(Class_23823 class_23823) {
        return (class_23823 != null && this.Method_44551(class_23823.Method_23844()) ? -32621 & 12329 : -30711 & 29184) != 0;
    }

    private boolean Method_44564() {
        return (this.Field_44531 == 0 ? 8339 & 21765 : 518 & -30704) != 0;
    }

    protected String Method_44565() {
        return "mob.rabbit.idle";
    }

    private void Method_44566() {
        ((Class_35765)this.\u0000strictfp).Method_35770((-30427 & 26240) != 0);
    }

    public Class_42629 Method_44567(Class_42629 class_42629) {
        return this.Method_44571(class_42629);
    }

    private void Method_44568() {
        ((Class_35765)this.\u0000strictfp).Method_35770((6721 & -8031) != 0);
    }

    public void Method_44569(Class_1699 class_1699) {
        super.Method_43422(class_1699);
        this.Method_44540(class_1699.Method_1738("RabbitType"));
        this.Field_44531 = class_1699.Method_1738("MoreCarrotTicks");
    }

    public void Method_44570(Class_14002 class_14002) {
        this.Method_44574((8709 & 19467) != 0, class_14002);
        this.Field_44528 = class_14002.Method_14023();
        this.Field_44526 = 1046 & -23744;
    }

    public Class_44525 Method_44571(Class_42629 class_42629) {
        Class_44525 class_44525 = new Class_44525(this.\u0000strictfp);
        if (class_42629 instanceof Class_44525) {
            class_44525.Method_44540(this.\u0000strictfp.nextBoolean() ? this.Method_44545() : ((Class_44525)class_42629).Method_44545());
        }
        return class_44525;
    }

    protected void Method_44572() {
        super.\u0000= 3();
        this.\u0000strictfp(Class_21716.Field_21718).Method_16556(0.05434782608695652 * 184.0);
        this.\u0000strictfp(Class_21716.Field_21722).Method_16556(7.3 * 0.04109589204396287);
    }

    protected void Method_44573() {
        super.\u0000= final();
        this.\u0000strictfp.Method_32719(19 & -22478, (byte)(-22904 & 6401));
    }

    public void Method_44574(boolean bl, Class_14002 class_14002) {
        super.\u0000= package(bl);
        if (!bl) {
            if (this.Field_44533 == Class_14002.Field_14009) {
                this.Field_44533 = Class_14002.Field_14011;
            }
        } else {
            this.Method_44556(30.0 * 0.05 * (double)class_14002.Method_14020());
            this.\u0000strictfp(this.Method_44538(), this.\u0000= float(), ((this.\u0000strictfp.nextFloat() - this.\u0000strictfp.nextFloat()) * (0.10666667f * 1.875f) + 1.0f) * (0.24347825f * 3.2857144f));
        }
        this.Field_44530 = bl;
    }

    public Class_44525(Class_283 class_283) {
        super(class_283);
        this.\u0000= final(0.97894734f * 0.61290324f, 0.6060976f * 1.1549295f);
        this.\u0000strictfp = new Class_35765(this, this);
        this.\u0000strictfp = new Class_42441(this);
        ((Class_25797)this.\u0000strictfp()).Method_25808((41 & -26555) != 0);
        this.\u0000strictfp.Method_7637(11.190476f * 0.22340426f);
        this.\u0000strictfp.Method_16858(-32253 & 10545, new Class_40128(this));
        this.\u0000strictfp.Method_16858(-30527 & 16645, new Class_38697(this, 0.30120481927710846 * 4.4155999999999995));
        this.\u0000strictfp.Method_16858(3 & 16554, new Class_37150(this, 1.0, Class_10527.Field_10713, (-24378 & 6704) != 0));
        this.\u0000strictfp.Method_16858(8710 & -32430, new Class_37150(this, 1.0, Class_10527.Field_10681, (-32767 & 7484) != 0));
        this.\u0000strictfp.Method_16858(20519 & 2626, new Class_37150(this, 1.0, Class_1956.Method_1981(Class_9265.Field_9353), (0 & 17054) != 0));
        this.\u0000strictfp.Method_16858(3 & 47, new Class_34780(this, 1.831578947368421 * 0.4367816091954023));
        this.\u0000strictfp.Method_16858(1239 & 25133, new Class_41338(this));
        this.\u0000strictfp.Method_16858(-31987 & 26677, new Class_34936(this, 0.5869565217391305 * 1.0222222222222221));
        this.\u0000strictfp.Method_16858(12299 & 3851, new Class_38500(this, Class_626.class, 1.4761904f * 6.774194f));
        this.Field_44529 = new Class_43330(this, Class_47526.class, 21.236364f * 0.75342464f, 1.0340909090909092 * 1.2861538461538462, 0.8035416666666667 * 1.6551724137931034);
        this.\u0000strictfp.Method_16858(24686 & 4117, this.Field_44529);
        this.Method_44556(0.0);
    }

    public void Method_44575() {
        if (this.\u0000strictfp.Method_27087() > 0.18064516129032257 * 4.428571428571429) {
            this.Method_44555(Class_14002.Field_14012);
        } else if (this.Field_44533 != Class_14002.Field_14009) {
            this.Method_44555(Class_14002.Field_14011);
        }
        if (this.Field_44532 > 0) {
            this.Field_44532 -= 10249 & -15871;
        }
        if (this.Field_44531 > 0) {
            this.Field_44531 -= this.\u0000strictfp.nextInt(6147 & 25891);
            if (this.Field_44531 < 0) {
                this.Field_44531 = 4100 & -23568;
            }
        }
        if (this.\u0000super()) {
            Object object;
            if (!this.Field_44527) {
                this.Method_44574((2106 & 704) != 0, Class_14002.Field_14010);
                this.Method_44561();
            }
            if (this.Method_44545() == (99 & -17049) && this.Field_44532 == 0 && (object = this.\u0000strictfp()) != null && this.\u0000strictfp((Class_1061)object) < 68.92307692307692 * 0.23214285714285715) {
                this.Method_44557(((Class_859)object).\u0000= package, ((Class_859)object).\u0000= switch);
                this.\u0000strictfp.Method_27094(((Class_859)object).\u0000= package, object.\u0000, for(), ((Class_859)object).\u0000= switch, this.\u0000strictfp.Method_27087());
                this.Method_44570(Class_14002.Field_14009);
                this.Field_44527 = 35 & 11081;
            }
            if (!((Class_35765)(object = (Class_35765)this.\u0000strictfp)).Method_35771()) {
                if (this.\u0000strictfp.Method_27093() && this.Field_44532 == 0) {
                    Class_15832 class_15832 = this.\u0000strictfp.Method_7636();
                    Vec3 vec3 = new Vec3(this.\u0000strictfp.Method_27089(), this.\u0000strictfp.Method_27090(), this.\u0000strictfp.Method_27091());
                    if (class_15832 != null && class_15832.Method_15844() < class_15832.Method_15840()) {
                        vec3 = class_15832.Method_15843(this);
                    }
                    this.Method_44557(vec3.\u0000= final, vec3.\u0000, `);
                    this.Method_44570(this.Field_44533);
                }
            } else if (!((Class_35765)object).Method_35773()) {
                this.Method_44568();
            }
        }
        this.Field_44527 = this.\u0000super();
    }
}

