/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_45624
extends Class_45398 {
    private int Field_45625;
    Class_20407 Field_45626;
    private int Field_45627;
    private int Field_45628;

    public void Method_45629(Class_1699 class_1699) {
        super.\u0000, `(class_1699);
        this.Method_45644(class_1699.Method_1733("PlayerCreated"));
    }

    protected void Method_45630(Class_4751 class_4751, Class_3238 class_3238) {
        this.\u0000strictfp("mob.irongolem.walk", 1.0f, 1.0f);
    }

    public void Method_45631(Class_1699 class_1699) {
        super.\u0000strictfp(class_1699);
        class_1699.Method_1706("PlayerCreated", this.Method_45648());
    }

    protected void Method_45632() {
        super.\u0000= final();
        this.\u0000strictfp.Method_32719(536 & 10390, (byte)(3520 & -16340));
    }

    protected void Method_45633(Class_1061 class_1061) {
        if (class_1061 instanceof Class_32423 && !(class_1061 instanceof Class_43073) && this.\u0000strictfp().nextInt(8245 & -28268) == 0) {
            this.\u0000, `((Class_859)class_1061);
        }
        super.\u0000, #(class_1061);
    }

    public Class_45624(Class_283 class_283) {
        super(class_283);
        this.\u0000= final(1.24f * 1.1290323f, 0.41428572f * 7.0f);
        ((Class_25797)this.\u0000strictfp()).Method_25808((1541 & 14409) != 0);
        this.\u0000strictfp.Method_16858(16387 & 9953, new Class_36925(this, 1.0, (-24281 & 81) != 0));
        this.\u0000strictfp.Method_16858(-28658 & 9810, new Class_38475(this, 1.8461538461538463 * 0.4875, 1.76f * 18.181818f));
        this.\u0000strictfp.Method_16858(515 & 8203, new Class_34068(this, 1.010752688172043 * 0.5936170212765958, (9353 & 18439) != 0));
        this.\u0000strictfp.Method_16858(3335 & -28668, new Class_35640(this, 1.0));
        this.\u0000strictfp.Method_16858(-32059 & 3365, new Class_37635(this));
        this.\u0000strictfp.Method_16858(2118 & 21054, new Class_34936(this, 3.9692307692307693 * 0.1511627906976744));
        this.\u0000strictfp.Method_16858(559 & 13463, new Class_38500(this, Class_626.class, 15.483871f * 0.3875f));
        this.\u0000strictfp.Method_16858(-22516 & 168, new Class_46015(this));
        this.\u0000, `.Method_16858(16401 & 4609, new Class_42848(this));
        this.\u0000, `.Method_16858(4259 & 8974, new Class_39631(this, (-28383 & 8258) != 0, new Class[20768 & -32762]));
        this.\u0000, `.Method_16858(28803 & 87, new Class_45930(this, Class_34093.class, -24918 & 16394, (10536 & 1668) != 0, (9353 & 16641) != 0, Class_32423.Field_32424));
    }

    public int Method_45634() {
        return this.Field_45625;
    }

    public void Method_45635(byte by) {
        if (by == (16764 & 6148)) {
            this.Field_45627 = 1163 & -15602;
            this.\u0000strictfp("mob.irongolem.throw", 1.0f, 1.0f);
        } else if (by == (1067 & 30731)) {
            this.Field_45625 = 408 & 8627;
        } else {
            super.\u0000strictfp(by);
        }
    }

    protected void Method_45636() {
        super.\u0000= 3();
        this.\u0000strictfp(Class_21716.Field_21718).Method_16556(88.63636363636364 * 1.1282051282051282);
        this.\u0000strictfp(Class_21716.Field_21722).Method_16556(0.75 * 0.3333333333333333);
    }

    public void Method_45637(boolean bl) {
        this.Field_45625 = bl ? 13268 & 1433 : -11967 & 2052;
        this.\u0000strictfp.Method_483(this, (byte)(17183 & 9323));
    }

    public Class_20407 Method_45638() {
        return this.Field_45626;
    }

    private void Method_45639() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_45640(Class_32797 class_32797) {
        if (!this.Method_45648() && this.\u0000strictfp != null && this.Field_45626 != null) {
            this.Field_45626.Method_20450(this.\u0000strictfp.Method_825(), -1 & -5);
        }
        super.\u0000strictfp(class_32797);
    }

    protected void Method_45641() {
        if ((this.Field_45628 -= -16127 & 7169) <= 0) {
            this.Field_45628 = (-31546 & 8286) + this.\u0000strictfp.nextInt(4274 & 9534);
            this.Field_45626 = this.\u0000strictfp.Method_558().Method_41910(new Class_4751(this), 2152 & -32478);
            if (this.Field_45626 == null) {
                this.\u0000
                ();
            } else {
                Class_4751 class_4751 = this.Field_45626.Method_20452();
                this.\u0000strictfp(class_4751, (int)((float)this.Field_45626.Method_20435() * (0.48000002f * 1.25f)));
            }
        }
        super.\u0000, if();
    }

    protected String Method_45642() {
        return "mob.irongolem.hit";
    }

    protected String Method_45643() {
        return "mob.irongolem.death";
    }

    public void Method_45644(boolean bl) {
        byte by = this.\u0000strictfp.Method_32708(24 & 2067);
        if (bl) {
            this.\u0000strictfp.Method_32704(-4079 & 2578, (byte)(by | 4353 & -30607));
        } else {
            this.\u0000strictfp.Method_32704(9752 & -32560, (byte)(by & (-2 & -1)));
        }
    }

    public int Method_45645() {
        return this.Field_45627;
    }

    protected int Method_45646(int n) {
        return n;
    }

    protected void Method_45647(boolean bl, int n) {
        int n2;
        int n3 = this.\u0000strictfp.nextInt(-1689 & 515);
        for (n2 = 14688 & 16908; n2 < n3; ++n2) {
            this.\u0000strictfp(Class_1956.Method_1981(Class_9265.Field_9402), -28089 & 9377, (float)Class_5607.Field_5613.Method_5652());
        }
        n2 = (18491 & -28349) + this.\u0000strictfp.nextInt(-26109 & 17559);
        for (int i = 26784 & 776; i < n2; ++i) {
            this.\u0000strictfp(Class_10527.Field_10565, 519 & 27649);
        }
    }

    public boolean Method_45648() {
        return ((this.\u0000strictfp.Method_32708(18352 & 4186) & (-16291 & 4481)) != 0 ? -28031 & 9253 : -19706 & 18568) != 0;
    }

    public boolean Method_45649(Class_1061 class_1061) {
        this.Field_45627 = 16558 & 4698;
        this.\u0000strictfp.Method_483(this, (byte)(-7548 & 6172));
        boolean bl = class_1061.Method_1340(Class_32797.Method_32863(this), (4135 & 16967) + this.\u0000strictfp.nextInt(15 & -16305));
        if (bl) {
            class_1061.Method_1161(class_1061.Method_1224() + 0.9176470588235294 * 0.43589744239281386);
            this.\u0000strictfp((Class_859)this, class_1061);
        }
        this.\u0000strictfp("mob.irongolem.throw", 1.0f, 1.0f);
        return bl;
    }

    public void Method_45650() {
        int n;
        int n2;
        Class_3238 class_3238;
        int n3;
        Class_3436 class_3436;
        super.\u0000a_();
        if (this.Field_45627 > 0) {
            this.Field_45627 -= 1041 & 2179;
        }
        if (this.Field_45625 > 0) {
            this.Field_45625 -= -32551 & 2049;
        }
        if (this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch > 1.9166666666666667 * 1.3043479710809744E-7 && this.\u0000strictfp.nextInt(5479 & 525) == 0 && (class_3238 = (class_3436 = this.\u0000strictfp.Method_375(new Class_4751(n = Class_13337.Method_13371(this.\u0000= package), n3 = Class_13337.Method_13371(this.\u0000, for() - 0.07500000111758709 * 2.6666666666666665), n2 = Class_13337.Method_13371(this.\u0000= switch)))).Method_3442()).Method_3373() != Class_3713.Field_3718) {
            int[] arrn = new int[677 & -32487];
            arrn[-7036 & 521] = Class_3238.Method_3367(class_3436);
            this.\u0000strictfp.Method_407(Class_40274.Field_40315, this.\u0000= package + ((double)this.\u0000strictfp.nextFloat() - 0.14754098360655737 * 3.388888888888889) * (double)this.\u0000= int(), this.\u0000, `().Field_11000 + 0.14492753623188406 * 0.6900000000000001, this.\u0000= switch + ((double)this.\u0000strictfp.nextFloat() - 4.142857142857143 * 0.12068965517241378) * (double)this.\u0000= int(), 8.170212765957448 * 0.4895833333333333 * ((double)this.\u0000strictfp.nextFloat() - 0.393939393939394 * 1.2692307692307692), 0.3333333333333333 * 1.5, ((double)this.\u0000strictfp.nextFloat() - 0.5692307692307692 * 0.8783783783783784) * (6.245614035087719 * 0.6404494382022472), arrn);
        }
    }
}

