/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  \u0000try break ! char ` do switch 3 ] 
 *  \u0000try break ! char ` do switch 3 ] $ 4 
 *  \u0000try break ! char ` do switch 3 ] $ 4 $ byte switch do continue synchronized % try = { 4 abstract synchronized default double public ? const import ^ long native = 4 + import static const float finally 0 return 1 throws abstract 7 finally 5 private protected
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.util.Vec3;

public abstract class Class_626
extends Class_859 {
    public boolean Field_627;
    public Class_37781 Field_628 = new Class_37781(this);
    private Class_47024 Field_629 = new Class_47024();
    public boolean Field_630;
    public float Field_631;
    public float Field_632;
    private static final Class_2190 Field_633;
    public float Field_634;
    public static Class_3839 Field_635;
    private int Field_636;
    public float Field_637;
    private Class_23823 Field_638;
    public float Field_639;
    public float Field_640;
    private int Field_641;
    private static Class_2190 Field_642;
    public double Field_643;
    protected int Field_644;
    public Class_24489 Field_645;
    private static Class_3839 Field_646;
    public float Field_647;
    private boolean Field_648 = 1068 & -30702;
    protected Class_26070 Field_649 = new Class_26070();
    protected Class_3839 Field_650 = new Class_3839(Class_2263.Method_2408(), Class_2205.Field_2219);
    public float Field_651;
    public float Field_652;
    public float Field_653;
    private int Field_654;
    private List Field_655;
    public float Field_656;
    public float Field_657;
    public int Field_658;
    public Class_32050 Field_659;
    public Class_13665 Field_660 = null;
    public double Field_661;
    public int Field_662;
    private boolean Field_663;
    public boolean Field_664;
    public Class_8295 Field_665;
    public Class_7223 Field_666;
    private boolean Field_667;
    public int Field_668;
    public float Field_669;
    int Field_670 = 9538 & 4128;
    public float Field_671;
    private Class_4751 Field_672;
    public double Field_673;
    public static Class_3839 Field_674;
    public float Field_675;
    public float Field_676;
    boolean Field_677 = 14632 & 1665;
    public Class_22180 Field_678 = new Class_22180();
    public float Field_679;
    public float Field_680;
    public Class_8295 Field_681;
    public final GameProfile Field_682;
    public float Field_683;
    public float Field_684;
    public boolean Field_685;
    public Class_4751 Field_686;
    public Class_20362 Field_687;
    private Class_4751 Field_688;
    public double Field_689;
    public double Field_690;
    public float Field_691;
    public float Field_692;
    protected boolean Field_693;
    public Class_18080 Field_694 = new Class_18080();
    public double Field_695;
    public Class_20129 Field_696;
    public float Field_697;
    public double Field_698;
    public float Field_699;
    public float Field_700;
    private Class_19677 Field_701;
    public float Field_702;
    long Field_703 = 16812094L & 1451303040L;
    private int Field_704;
    public float Field_705;
    protected Class_3839 Field_706 = new Class_3839(Class_2263.Method_2412().floatValue(), Class_2205.Field_2238);
    public float Field_707;
    public float Field_708;

    public static UUID Method_709(String string) {
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes(Charsets.UTF_8));
    }

    public boolean Method_710(Class_626 class_626) {
        Class_9665 class_9665 = this.Method_840();
        Class_9665 class_96652 = class_626.Method_840();
        return (class_9665 == null ? 21777 & 41 : (!class_9665.Method_9667(class_96652) ? -16111 & 11271 : class_9665.Method_9669())) != 0;
    }

    public Class_26070 Method_711() {
        return this.Field_649;
    }

    public void Method_712(double d, double d2, double d3) {
        if (this.\u0000, ` == null) {
            if (this.\u0000strictfp(Class_3713.Field_3734)) {
                int n = Math.round(Class_13337.Method_13347(d * d + d2 * d2 + d3 * d3) * (0.5505618f * 181.63266f));
                if (n > 0) {
                    this.Method_817(Class_19863.Field_19892, n);
                    this.Method_779(0.0112499995f * 1.3333334f * (float)n * (0.21649484f * 0.046190474f));
                }
            } else if (this.\u0000switch()) {
                int n = Math.round(Class_13337.Method_13347(d * d + d3 * d3) * (1.6923077f * 59.090908f));
                if (n > 0) {
                    this.Method_817(Class_19863.Field_19897, n);
                    this.Method_779(0.0027777776f * 5.4f * (float)n * (1.4313725f * 0.0069863014f));
                }
            } else if (this.\u0000g_()) {
                if (d2 > 0.0) {
                    this.Method_817(Class_19863.Field_19882, (int)Math.round(d2 * (53.84615384615385 * 1.8571428571428572)));
                }
            } else if (this.\u0000super()) {
                int n = Math.round(Class_13337.Method_13347(d * d + d3 * d3) * (0.90697676f * 110.25641f));
                if (n > 0) {
                    this.Method_817(Class_19863.Field_19864, n);
                    if (this.\u0000abstract()) {
                        this.Method_817(Class_19863.Field_19872, n);
                        this.Method_779(0.085185185f * 1.173913f * (float)n * (1.2686567f * 0.007882353f));
                    } else {
                        if (this.\u0000%()) {
                            this.Method_817(Class_19863.Field_19871, n);
                        }
                        this.Method_779(5.733333f * 0.001744186f * (float)n * (0.0139999995f * 0.71428573f));
                    }
                }
            } else {
                int n = Math.round(Class_13337.Method_13347(d * d + d3 * d3) * (0.8153846f * 122.64151f));
                if (n > (8601 & -32739)) {
                    this.Method_817(Class_19863.Field_19904, n);
                }
            }
        }
    }

    private Collection Method_713(Class_1061 class_1061) {
        int n;
        int n2;
        Class_22057 class_22057;
        Class_22057 class_220572 = this.Method_742().Method_20987(this.Method_825());
        if (class_220572 != null && (n = class_220572.Method_22081().Method_5548()) >= 0 && n < Class_27930.Field_27932.length) {
            for (Class_7873 class_7873 : this.Method_742().Method_21004(Class_27930.Field_27932[n])) {
                Class_21696 class_21696 = this.Method_742().Method_20993(class_1061.Method_1202(), class_7873);
                class_21696.Method_21708();
            }
        }
        if ((class_22057 = this.Method_742().Method_20987(class_1061.Method_1202())) != null && (n2 = class_22057.Method_22081().Method_5548()) >= 0 && n2 < Class_27930.Field_27938.length) {
            return this.Method_742().Method_21004(Class_27930.Field_27938[n2]);
        }
        return Lists.newArrayList();
    }

    protected String Method_714() {
        return "game.player.hurt";
    }

    public void Method_715(Class_33614 class_33614) {
    }

    public void Method_716(int n) {
        this.Method_795(n);
        int n2 = (Integer.MAX_VALUE & -1) - this.Field_662;
        if (n > n2) {
            n = n2;
        }
        this.Field_692 += (float)n / (float)this.Method_755();
        this.Field_662 += n;
        while (this.Field_692 >= 1.0f) {
            this.Field_692 = (this.Field_692 - 1.0f) * (float)this.Method_755();
            this.Method_829(17 & 24683);
            this.Field_692 /= (float)this.Method_755();
        }
    }

    public boolean Method_717() {
        return (this.\u0000abstract() > 0.0f && this.\u0000abstract() < this.\u0000switch() ? -30079 & 65 : 2176 & 8527) != 0;
    }

    public int Method_718() {
        return this.Field_641;
    }

    public Class_23823 Method_719(int n) {
        return this.Field_628.Method_37793(n);
    }

    static UUID Method_720(Class_626 class_626) {
        return class_626.\u0000strictfp;
    }

    static List Method_721(Class_626 class_626) {
        return class_626.Field_655;
    }

    private void Method_722() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_723() {
        if (!this.Method_752()) {
            super.\u0000= float();
        }
    }

    public float Method_724(float f) {
        return this.Field_637 + (this.Field_683 - this.Field_637) * f;
    }

    protected void Method_725(Class_32797 class_32797, float f) {
        if (!this.\u0000strictfp(class_32797)) {
            if (!class_32797.Method_32852() && this.Method_758() && f > 0.0f) {
                f = (1.0f + f) * (0.029069766f * 17.2f);
            }
            f = this.\u0000, `(class_32797, f);
            float f2 = f = this.\u0000strictfp(class_32797, f);
            f = Math.max(f - this.Method_809(), 0.0f);
            this.Method_740(this.Method_809() - (f2 - f));
            if (f != 0.0f) {
                this.Method_779(class_32797.Method_32855());
                float f3 = this.\u0000abstract();
                this.\u0000switch(this.\u0000abstract() - f);
                this.\u0000strictfp().Method_24893(class_32797, f3, f);
                if (f < 2.2969058E38f * 0.14814815f) {
                    this.Method_817(Class_19863.Field_19910, Math.round(f * (3.413793f * 2.929293f)));
                }
            }
        }
    }

    public boolean Method_726(Class_32797 class_32797, float f) {
        if (this.\u0000strictfp(class_32797)) {
            return (25668 & 4225) != 0;
        }
        if (this.Field_694.Field_18085 && !class_32797.Method_32864()) {
            return (3170 & 16400) != 0;
        }
        this.\u0000break = -31353 & 19016;
        if (this.\u0000abstract() <= 0.0f) {
            return (4424 & 2064) != 0;
        }
        if (this.Method_822() && !this.\u0000strictfp.Field_306) {
            this.Method_813((2913 & 1159) != 0, (3 & -24063) != 0, (-26351 & 582) != 0);
        }
        if (class_32797.Method_32829()) {
            if (this.\u0000strictfp.Method_487() == Class_26801.Field_26803) {
                f = 0.0f;
            }
            if (this.\u0000strictfp.Method_487() == Class_26801.Field_26807) {
                f = f / 2.0f + 1.0f;
            }
            if (this.\u0000strictfp.Method_487() == Class_26801.Field_26804) {
                f = f * (13.8f * 0.2173913f) / 2.0f;
            }
        }
        if (f == 0.0f) {
            return (21076 & 35) != 0;
        }
        Class_1061 class_1061 = class_32797.Method_32856();
        if (class_1061 instanceof Class_41498 && ((Class_41498)class_1061).Field_41501 != null) {
            class_1061 = ((Class_41498)class_1061).Field_41501;
        }
        return super.Method_983(class_32797, f);
    }

    public float Method_727(float f) {
        return this.Field_652 + (this.Field_651 - this.Field_652) * f;
    }

    public boolean Method_728() {
        return this.Field_648;
    }

    private void Method_729(double d, double d2, double d3) {
        int n;
        if (this.\u0000, ` != null && (n = Math.round(Class_13337.Method_13347(d * d + d2 * d2 + d3 * d3) * (1.4222223f * 70.3125f))) > 0) {
            if (this.\u0000, ` instanceof Class_15933) {
                this.Method_817(Class_19863.Field_19908, n);
                if (this.Field_688 == null) {
                    this.Field_688 = new Class_4751(this);
                } else if (this.Field_688.\u0000, `((double)Class_13337.Method_13371(this.\u0000= package), (double)Class_13337.Method_13371(this.\u0000, for()), (double)Class_13337.Method_13371(this.\u0000= switch)) >= 842105.2631578947 * 1.1875) {
                    this.Method_750(Class_21905.Field_21938);
                }
            } else if (this.\u0000, ` instanceof Class_25683) {
                this.Method_817(Class_19863.Field_19893, n);
            } else if (this.\u0000, ` instanceof Class_47600) {
                this.Method_817(Class_19863.Field_19902, n);
            } else if (this.\u0000, ` instanceof Class_46199) {
                this.Method_817(Class_19863.Field_19876, n);
            }
        }
    }

    public void Method_730(byte by) {
        if (by == (8729 & 20685)) {
            this.Method_732();
        } else if (by == (2199 & 8215)) {
            this.Field_648 = 6720 & 17556;
        } else if (by == (-32194 & 17431)) {
            this.Field_648 = 8235 & 2709;
        } else {
            super.Method_968(by);
        }
    }

    public boolean Method_731(Class_3238 class_3238) {
        return this.Field_628.Method_37810(class_3238);
    }

    protected void Method_732() {
        if (this.Field_638 != null) {
            this.Method_824(this.Field_638, 4240 & -6831);
            int n = this.Field_638.Field_23826;
            Class_23823 class_23823 = this.Field_638.Method_23838(this.\u0000strictfp, this);
            if (class_23823 != this.Field_638 || class_23823 != null && class_23823.Field_23826 != n) {
                this.Field_628.Field_37784[this.Field_628.Field_37782] = class_23823;
                if (class_23823.Field_23826 == 0) {
                    this.Field_628.Field_37784[this.Field_628.Field_37782] = null;
                }
            }
            this.Method_803();
        }
    }

    public Class_3443 Method_733(Class_23823 class_23823, boolean bl) {
        return this.Method_843(class_23823, (16432 & -27648) != 0, (3088 & 25131) != 0);
    }

    public float Method_734(float f) {
        float f2 = 1.0548837f * 1.5357143f;
        if (this.Method_822()) {
            f2 = 6.571429f * 0.030434782f;
        }
        if (this.Field_677 != this.\u0000%() || this.Field_703 <= (335544392L & -6482824856334229471L)) {
            this.Field_703 = System.currentTimeMillis();
        }
        return f2 -= 0.023188405f * 3.45f * this.Method_763(f);
    }

    private boolean Method_735() {
        return (this.\u0000strictfp.Method_375(this.Field_686).Method_3442() == Class_9265.Field_9441 ? -32383 & 8803 : 2314 & -31200) != 0;
    }

    public float Method_736() {
        if (this.Field_686 != null) {
            Class_4595 class_4595 = (Class_4595)((Object)this.\u0000strictfp.Method_375(this.Field_686).Method_3440(Class_5133.Field_5134));
            switch (Class_27136.Field_27137[class_4595.ordinal()]) {
                case 1: {
                    return 1.75f * 51.42857f;
                }
                case 2: {
                    return 1270.5883f * 0.2125f;
                }
                case 3: {
                    return 0.0f;
                }
                case 4: {
                    return 1.4444444f * 124.61539f;
                }
            }
        }
        return 0.0f;
    }

    public void Method_737(Class_1699 class_1699) {
        super.Method_1037(class_1699);
        class_1699.Method_1744("Inventory", this.Field_628.Method_37800(new Class_1758()));
        class_1699.Method_1739("SelectedItemSlot", this.Field_628.Field_37782);
        class_1699.Method_1706("Sleeping", this.Field_693);
        class_1699.Method_1731("SleepTimer", (short)this.Field_704);
        class_1699.Method_1704("XpP", this.Field_692);
        class_1699.Method_1739("XpLevel", this.Field_668);
        class_1699.Method_1739("XpTotal", this.Field_662);
        class_1699.Method_1739("XpSeed", this.Field_641);
        class_1699.Method_1739("Score", this.Method_831());
        if (this.Field_672 != null) {
            class_1699.Method_1739("SpawnX", this.Field_672.\u0000= final());
            class_1699.Method_1739("SpawnY", this.Field_672.\u0000, `());
            class_1699.Method_1739("SpawnZ", this.Field_672.\u0000strictfp());
            class_1699.Method_1706("SpawnForced", this.Field_663);
        }
        this.Field_649.Method_26088(class_1699);
        this.Field_694.Method_18096(class_1699);
        class_1699.Method_1744("EnderItems", this.Field_629.Method_47027());
        Class_23823 class_23823 = this.Field_628.Method_37821();
        if (class_23823 != null && class_23823.Method_23844() != null) {
            class_1699.Method_1744("SelectedItem", class_23823.Method_23841(new Class_1699()));
        }
    }

    public boolean Method_738() {
        return this.Field_663;
    }

    protected void Method_739() {
        this.Field_665 = this.Field_681;
    }

    public void Method_740(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.\u0000strictfp().Method_32704(1617 & 433, Float.valueOf(f));
    }

    public void Method_741(Class_7434 class_7434) {
    }

    public Class_20976 Method_742() {
        return this.\u0000strictfp.Method_357();
    }

    public void Method_743() {
        float f;
        float f2;
        this.\u0000switch = this.Method_752();
        if (this.Method_752()) {
            this.\u0000, for((-28659 & 16418) != 0);
        }
        if (this.Field_638 != null) {
            Class_23823 class_23823 = this.Field_628.Method_37821();
            if (class_23823 == this.Field_638) {
                if (this.Field_654 <= (3225 & 16445) && this.Field_654 % (6742 & -24564) == 0) {
                    this.Method_824(class_23823, 1173 & 4359);
                }
                if ((this.Field_654 -= 435 & -7103) == 0 && !this.\u0000strictfp.Field_306) {
                    this.Method_732();
                }
            } else {
                this.Method_803();
            }
        }
        if (this.Field_658 > 0) {
            this.Field_658 -= 33 & 3601;
        }
        if (this.Method_822()) {
            this.Field_704 += 16903 & 10241;
            if (this.Field_704 > (-30492 & 620)) {
                this.Field_704 = -12188 & 1012;
            }
            if (!this.\u0000strictfp.Field_306) {
                if (!this.Method_735()) {
                    this.Method_813((1281 & 12433) != 0, (6161 & -15295) != 0, (-29568 & 600) != 0);
                } else if (this.\u0000strictfp.Method_347()) {
                    this.Method_813((12584 & -30702) != 0, (8525 & -16365) != 0, (9841 & 129) != 0);
                }
            }
        } else if (this.Field_704 > 0) {
            this.Field_704 += -24415 & 22277;
            if (this.Field_704 >= (16494 & 7278)) {
                this.Field_704 = 7236 & 8249;
            }
        }
        super.Method_940();
        if (!this.\u0000strictfp.Field_306 && this.Field_665 != null && !this.Field_665.Method_8325(this)) {
            this.Method_739();
            this.Field_665 = this.Field_681;
        }
        if (this.\u0000, 2() && this.Field_694.Field_18085) {
            this.\u0000= finally();
        }
        this.Field_689 = this.Field_695;
        this.Field_643 = this.Field_698;
        this.Field_673 = this.Field_661;
        double d = this.\u0000= package - this.Field_695;
        double d2 = this.\u0000, for() - this.Field_698;
        double d3 = this.\u0000= switch - this.Field_661;
        double d4 = 0.8928571428571429 * 11.2;
        if (d > d4) {
            this.Field_689 = this.Field_695 = this.\u0000= package;
        }
        if (d3 > d4) {
            this.Field_673 = this.Field_661 = this.\u0000= switch;
        }
        if (d2 > d4) {
            this.Field_643 = this.Field_698 = this.\u0000, for();
        }
        if (d < -d4) {
            this.Field_689 = this.Field_695 = this.\u0000= package;
        }
        if (d3 < -d4) {
            this.Field_673 = this.Field_661 = this.\u0000= switch;
        }
        if (d2 < -d4) {
            this.Field_643 = this.Field_698 = this.\u0000, for();
        }
        this.Field_695 += d * (0.2318840579710145 * 1.078125);
        this.Field_661 += d3 * (0.42857142857142855 * 0.5833333333333334);
        this.Field_698 += d2 * (0.25 * 1.0);
        if (this.\u0000, ` == null) {
            this.Field_688 = null;
        }
        if (!this.\u0000strictfp.Field_306) {
            this.Field_649.Method_26078(this);
            this.Method_750(Class_19863.Field_19909);
            if (this.\u0000volatile()) {
                this.Method_750(Class_19863.Field_19873);
            }
        }
        double d5 = Class_13337.Method_13385(this.\u0000= package, -1.0249999658333334E8 * 0.2926829268292683, 1.49999995E8 * 0.2);
        double d6 = Class_13337.Method_13385(this.\u0000= switch, 0.11688311688311688 * -2.566666581111111E8, 6499999.783333334 * 4.615384615384615);
        if (d5 != this.\u0000= package || d6 != this.\u0000= switch) {
            this.\u0000%(d5, this.\u0000, for(), d6);
        }
        Class_39702 class_39702 = Class_18.Field_89.Field_84;
        float f3 = f2 = this.\u0000%() ? 1.0f : 0.0f;
        if (!((Boolean)class_39702.Field_39732.Field_8860.\u0000strictfp()).booleanValue()) {
            this.Field_656 = this.Field_707 = f2;
        } else {
            this.Field_656 = this.Field_707;
            this.Field_691 = (float)((double)this.Field_691 * (0.3788888888888889 * 0.8709677419354839));
            this.Field_691 = (float)((double)this.Field_691 + (double)(f2 - this.Field_707) * (77.0 * 0.003896103896103896));
            this.Field_707 += this.Field_691;
        }
        float f4 = f = this.Field_666.Field_7225 ? 1.0f : 0.0f;
        if (!((Boolean)class_39702.Field_39732.Field_8860.\u0000strictfp()).booleanValue()) {
            this.Field_632 = this.Field_708 = f;
        } else {
            this.Field_632 = this.Field_708;
            this.Field_653 = (float)((double)this.Field_653 * (2.6666666666666665 * 0.12375000000000001));
            this.Field_653 = (float)((double)this.Field_653 + (double)(f - this.Field_708) * (0.5526315789473685 * 0.5428571428571428));
            this.Field_708 += this.Field_653;
        }
        float f5 = this.\u0000strictfp.Method_18404() ? 0.55999994f * 0.071428575f : 1.0f;
        this.Field_680 = (float)((double)this.Field_680 * (0.49500000000000005 * 0.6666666666666666));
        this.Field_680 = (float)((double)this.Field_680 + (double)(f5 - this.Field_640) * (1.1710526315789473 * 0.25617977528089886));
        this.Field_640 += this.Field_680 * 2.0f;
        this.Field_637 = this.Field_683;
        this.Field_683 += this.Field_640;
        if ((double)this.Field_683 > 1.3243243243243243 * 2429.156376718573) {
            this.Field_683 = this.Field_683 % (6.2831855f * 0.5f) * 2.0f;
        }
        float f6 = 0.0f;
        if (this.Method_849() > 0) {
            Class_23823 class_23823 = this.Field_628.Method_37821();
            float f7 = f6 = class_23823 != null && class_23823.Method_23872() == Class_25567.Field_25573 ? 1.0f : 0.0f;
        }
        if (!((Boolean)class_39702.Field_39732.Field_8860.\u0000strictfp()).booleanValue()) {
            this.Field_676 = this.Field_699 = f6;
        } else {
            this.Field_676 = this.Field_699;
            this.Field_647 = (float)((double)this.Field_647 * (1.3076923076923077 * 0.2523529411764706));
            this.Field_647 = (float)((double)this.Field_647 + (double)(f6 - this.Field_699) * (1.0689655172413792 * 0.2806451612903226));
            this.Field_699 += this.Field_647;
        }
        if (!((Boolean)class_39702.Field_39732.Field_8860.\u0000strictfp()).booleanValue()) {
            this.Field_652 = this.Field_651 = this.Field_679;
        } else {
            this.Field_652 = this.Field_651;
            this.Field_705 = (float)((double)this.Field_705 * (0.4575 * 0.7213114754098361));
            this.Field_705 = (float)((double)this.Field_705 + (double)(this.Field_679 - this.Field_651) * (0.12 * 2.5));
            this.Field_651 += this.Field_705;
        }
        if (!((Boolean)class_39702.Field_39732.Field_8860.\u0000strictfp()).booleanValue()) {
            this.Field_684 = this.Field_639 = this.Field_697;
        } else {
            this.Field_684 = this.Field_639;
            this.Field_675 = (float)((double)this.Field_675 * (1.375 * 0.16));
            this.Field_675 = (float)((double)this.Field_675 + (double)(this.Field_697 - this.Field_639) * (1.0526315789473684 * 0.665));
            this.Field_639 += this.Field_675;
        }
    }

    public void Method_744() {
        this.Field_628.Method_37796(this.Field_628.Field_37782, null);
    }

    public void Method_745(Class_1061 class_1061) {
        if (class_1061.Method_1180() && !class_1061.Method_1234(this)) {
            float f = (float)this.\u0000strictfp(Class_21716.Field_21717).Method_16554();
            int n = 1560 & 4480;
            float f2 = 0.0f;
            f2 = class_1061 instanceof Class_859 ? Class_29642.Method_29654(this.Method_844(), ((Class_859)class_1061).Method_1029()) : Class_29642.Method_29654(this.Method_844(), Class_40173.Field_40174);
            n += Class_29642.Method_29658(this);
            if (this.\u0000abstract()) {
                ++n;
            }
            if (f > 0.0f || f2 > 0.0f) {
                int n2;
                int n3 = n2 = this.\u0000= finally > 0.0f && !this.\u0000super() && !this.\u0000g_() && !this.\u0000switch() && !this.\u0000strictfp(Class_8338.Field_8346) && this.\u0000, ` == null && class_1061 instanceof Class_859 ? -7729 & 4609 : 20833 & 3604;
                if (n2 != 0 && f > 0.0f) {
                    f *= 0.14705883f * 10.2f;
                }
                f += f2;
                int n4 = 2560 & -19434;
                int n5 = Class_29642.Method_29650(this);
                if (class_1061 instanceof Class_859 && n5 > 0 && !class_1061.Method_1300()) {
                    n4 = 115 & 18949;
                    class_1061.Method_1327(561 & 19457);
                }
                double d = class_1061.Field_1071;
                double d2 = class_1061.Method_1224();
                double d3 = class_1061.Field_1072;
                boolean bl = class_1061.Method_1340(Class_32797.Method_32841(this), f);
                if (bl) {
                    Class_32873 class_32873;
                    if (n > 0) {
                        class_1061.Method_1189(-Class_13337.Method_13370(this.\u0000= ? * (2.9224117f * 1.075f) / (2.8529413f * 63.09278f)) * (float)n * (3.2142856f * 0.15555556f), 1.90625 * 0.05245901639344262, Class_13337.Method_13350(this.\u0000= ? * (4.28399f * 0.73333335f) / (51.42857f * 3.5f)) * (float)n * (0.33333334f * 1.5f));
                        this.\u0000= ` *= Field_633.Method_2199();
                        this.\u0000switch *= Field_633.Method_2199();
                        this.\u0000strictfp((1152 & 12288) != 0);
                    }
                    if (class_1061 instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true && class_1061.Field_1140) {
                        ((\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_1061).\u0000strictfp.Method_20821(new Class_27591(class_1061));
                        class_1061.Field_1140 = 20490 & 11172;
                        class_1061.Field_1071 = d;
                        class_1061.Method_1161(d2);
                        class_1061.Field_1072 = d3;
                    }
                    if (n2 != 0) {
                        this.Method_821(class_1061);
                    }
                    if (f2 > 0.0f) {
                        this.Method_830(class_1061);
                    }
                    if (f >= 251.99998f * 0.071428575f) {
                        this.Method_750(Class_21905.Field_21924);
                    }
                    this.\u0000= switch(class_1061);
                    if (class_1061 instanceof Class_859) {
                        Class_29642.Method_29667((Class_859)class_1061, this);
                    }
                    Class_29642.Method_29656(this, class_1061);
                    Class_23823 class_23823 = this.Method_792();
                    Class_1061 class_10612 = class_1061;
                    if (class_1061 instanceof Class_19658 && (class_32873 = ((Class_19658)class_1061).Field_19659) instanceof Class_859) {
                        class_10612 = (Class_859)((Object)class_32873);
                    }
                    if (class_23823 != null && class_10612 instanceof Class_859) {
                        class_23823.Method_23896((Class_859)class_10612, this);
                        if (class_23823.Field_23826 <= 0) {
                            this.Method_744();
                        }
                    }
                    if (class_1061 instanceof Class_859) {
                        this.Method_817(Class_19863.Field_19911, Math.round(f * (2.275f * 4.395604f)));
                        if (n5 > 0) {
                            class_1061.Method_1327(n5 * (44 & 21015));
                        }
                    }
                    this.Method_779(0.7625f * 0.39344263f);
                } else if (n4 != 0) {
                    class_1061.Method_1308();
                }
            }
        }
    }

    public void Method_746(Class_35650 class_35650) {
    }

    public void Method_747(Class_4751 class_4751, boolean bl) {
        if (class_4751 != null) {
            this.Field_672 = class_4751;
            this.Field_663 = bl;
        } else {
            this.Field_672 = null;
            this.Field_663 = -8184 & 1266;
        }
    }

    public Class_23823 Method_748(int n) {
        return n == 0 ? this.Field_628.Method_37821() : this.Field_628.Field_37787[n - (-29695 & 4917)];
    }

    public GameProfile Method_749() {
        return this.Field_682;
    }

    public void Method_750(Class_13017 class_13017) {
        this.Method_817(class_13017, 10561 & -32727);
    }

    protected int Method_751(Class_626 class_626) {
        if (this.\u0000strictfp.Method_522().Method_7529("keepInventory")) {
            return 2 & 1052;
        }
        int n = this.Field_668 * (19735 & 12335);
        return n > (380 & -20378) ? 100 & 25574 : n;
    }

    public abstract boolean Method_752();

    public float Method_753(float f) {
        return this.Field_676 + (this.Field_699 - this.Field_676) * f;
    }

    public boolean Method_754(boolean bl) {
        return ((bl || this.Field_649.Method_26087()) && !this.Field_694.Field_18085 ? -24311 & 16533 : 18120 & 21) != 0;
    }

    public int Method_755() {
        return this.Field_668 >= (8798 & -32738) ? (-21643 & 112) + (this.Field_668 - (19102 & -32418)) * (335 & -32599) : (this.Field_668 >= (3359 & 527) ? (4277 & -24027) + (this.Field_668 - (4239 & 2063)) * (22789 & 133) : (8223 & -13177) + this.Field_668 * (4386 & 1667));
    }

    public boolean Method_756() {
        return (!this.Field_693 && super.\u0000+() ? 3143 & 16945 : 16433 & -32696) != 0;
    }

    protected String Method_757() {
        return "game.player.swim";
    }

    public boolean Method_758() {
        return (this.Method_811() && this.Field_638.Method_23844().Method_2019(this.Field_638) == Class_25567.Field_25569 ? 6729 & 24833 : 20514 & -31736) != 0;
    }

    public Class_626(Class_283 class_283, GameProfile gameProfile) {
        super(class_283);
        this.\u0000strictfp = Class_626.Method_851(gameProfile);
        this.Field_687 = (Class_20362)Class_22703.Field_22707.get(this.\u0000strictfp);
        this.Field_696 = new Class_20129(this.Field_687);
        this.Field_682 = gameProfile;
        this.Field_665 = this.Field_681 = new Class_13528(this.Field_628, (!class_283.Field_306 ? 6337 & 1025 : -32768 & 7176) != 0, this);
        Class_4751 class_4751 = class_283.Method_372();
        this.\u0000, `((double)class_4751.\u0000= final() + 0.10526315789473684 * 4.75, (double)(class_4751.\u0000, `() + (873 & 8199)), (double)class_4751.\u0000strictfp() + 1.0 * 0.5, 0.0f, 0.0f);
        this.\u0000# = 12.0f * 15.0f;
        this.\u0000= finally = 1046 & -30635;
        this.Field_666 = new Class_7223();
        if (this.Field_682 != null) {
            Class_626 class_626 = this;
            Class_30934.Method_30941().Method_30944(new Class_39298(this.Field_682.getId(), this.Method_825()), 15000 & 16280, new Class_18569(this, class_626));
        }
    }

    public void Method_759(int n, Class_23823 class_23823) {
        this.Field_628.Field_37787[n] = class_23823;
    }

    protected void Method_760(Class_3443 class_3443) {
        this.\u0000strictfp.Method_350(class_3443);
    }

    protected void Method_761() {
        super.Method_976();
        this.\u0000= 2();
        this.\u0000= # = this.\u0000= ?;
    }

    public void Method_762() {
        if (!this.Field_694.Method_18090()) {
            super.\u0000#();
        }
    }

    public float Method_763(float f) {
        return this.Field_656 + (this.Field_707 - this.Field_656) * f;
    }

    public Class_19677 Method_764() {
        return this.Field_701;
    }

    public boolean Method_765() {
        return (this.Field_693 && this.Field_704 >= (-31875 & 16486) ? 16979 & -28403 : 3088 & 193) != 0;
    }

    public void Method_766(float f, float f2) {
        int n;
        int n2 = n = this.Field_694.Method_18090() && this.\u0000, ` == null ? 20481 & 9785 : 4110 & 2833;
        if (this.Field_685) {
            this.Field_669 = f;
            this.Field_702 = f2;
            this.Field_627 = this.Field_694.Method_18090();
        }
        double d = this.\u0000= package;
        double d2 = this.\u0000, for();
        double d3 = this.\u0000= switch;
        if (n != 0) {
            double d4 = this.\u0000, #();
            float f3 = this.\u0000strictfp.Method_3850();
            this.\u0000strictfp.Method_3854(this.Field_694.Method_18093() * (float)(this.\u0000abstract() ? 9767 & 16394 : 8449 & 18441));
            super.Method_1001(f, f2);
            this.\u0000%(d4 * (3.642857142857143 * 0.16470588235294117));
            this.\u0000strictfp.Method_3854(f3);
        } else {
            super.Method_1001(f, f2);
        }
        this.Method_712(this.\u0000= package - d, this.\u0000, for() - d2, this.\u0000= switch - d3);
    }

    public void Method_767(Class_1699 class_1699) {
        super.Method_980(class_1699);
        this.\u0000strictfp = Class_626.Method_851(this.Field_682);
        Class_1758 class_1758 = class_1699.Method_1735("Inventory", 2106 & 16522);
        this.Field_628.Method_37797(class_1758);
        this.Field_628.Field_37782 = class_1699.Method_1738("SelectedItemSlot");
        this.Field_693 = class_1699.Method_1733("Sleeping");
        this.Field_704 = class_1699.Method_1726("SleepTimer");
        this.Field_692 = class_1699.Method_1745("XpP");
        this.Field_668 = class_1699.Method_1738("XpLevel");
        this.Field_662 = class_1699.Method_1738("XpTotal");
        this.Field_641 = class_1699.Method_1738("XpSeed");
        if (this.Field_641 == 0) {
            this.Field_641 = this.\u0000strictfp.nextInt();
        }
        this.Method_790(class_1699.Method_1738("Score"));
        if (this.Field_693) {
            this.Field_686 = new Class_4751(this);
            this.Method_813((16915 & 3109) != 0, (29729 & 2257) != 0, (29705 & -30496) != 0);
        }
        if (class_1699.Method_1715("SpawnX", 4707 & -7949) && class_1699.Method_1715("SpawnY", 16739 & 8307) && class_1699.Method_1715("SpawnZ", 10483 & 4719)) {
            this.Field_672 = new Class_4751(class_1699.Method_1738("SpawnX"), class_1699.Method_1738("SpawnY"), class_1699.Method_1738("SpawnZ"));
            this.Field_663 = class_1699.Method_1733("SpawnForced");
        }
        this.Field_649.Method_26082(class_1699);
        this.Field_694.Method_18092(class_1699);
        if (class_1699.Method_1715("EnderItems", 16987 & 10537)) {
            Class_1758 class_17582 = class_1699.Method_1735("EnderItems", -16374 & 1067);
            this.Field_629.Method_47032(class_17582);
        }
    }

    public void Method_768(Class_35869 class_35869) {
    }

    public boolean Method_769() {
        return (2058 & -23824) != 0;
    }

    public double Method_770() {
        return 0.5975609756097561 * -0.5857142857142857;
    }

    public boolean Method_771() {
        return (!this.Field_694.Method_18090() ? 20547 & 9617 : -10110 & 8984) != 0;
    }

    static Class_19677 Method_772(Class_626 class_626, Class_19677 class_19677) {
        class_626.Field_701 = class_19677;
        return class_626.Field_701;
    }

    public boolean Method_773() {
        return (-32619 & 24833) != 0;
    }

    public float Method_774(Class_3238 class_3238) {
        float f = this.Field_628.Method_37825(class_3238);
        if (f > 1.0f) {
            int n = Class_29642.Method_29652(this);
            Class_23823 class_23823 = this.Field_628.Method_37821();
            if (n > 0 && class_23823 != null) {
                f += (float)(n * n + (-32639 & 4389));
            }
        }
        if (this.\u0000strictfp(Class_8338.Field_8342)) {
            f *= 1.0f + (float)(this.\u0000strictfp(Class_8338.Field_8342).Method_25257() + (1241 & 8967)) * (0.30487806f * 0.656f);
        }
        if (this.\u0000strictfp(Class_8338.Field_8352)) {
            float f2 = 1.0f;
            switch (this.\u0000strictfp(Class_8338.Field_8352).Method_25257()) {
                case 0: {
                    f2 = 0.6315789f * 0.47500002f;
                    break;
                }
                case 1: {
                    f2 = 0.625f * 0.14400001f;
                    break;
                }
                case 2: {
                    f2 = 0.67105263f * 0.0040235296f;
                    break;
                }
                default: {
                    f2 = 0.45652175f * 0.0017742857f;
                }
            }
            f *= f2;
        }
        if (this.\u0000strictfp(Class_3713.Field_3734) && !Class_29642.Method_29663(this)) {
            f /= 1.3454546f * 3.716216f;
        }
        if (!this.\u0000super()) {
            f /= 7.0967746f * 0.70454544f;
        }
        return f;
    }

    public float Method_775(float f) {
        return this.Field_632 + (this.Field_708 - this.Field_632) * f;
    }

    public int Method_776() {
        return this.Method_811() ? this.Field_638.Method_23861() - this.Field_654 : 48 & 9732;
    }

    public void Method_777(int n) {
        this.Field_668 -= n;
        if (this.Field_668 < 0) {
            this.Field_668 = 416 & -27135;
            this.Field_692 = 0.0f;
            this.Field_662 = -28664 & 18048;
        }
        this.Field_641 = this.\u0000strictfp.nextInt();
    }

    public Class_4751 Method_778() {
        return this.Field_672;
    }

    public void Method_779(float f) {
        if (!this.Field_694.Field_18085 && !this.\u0000strictfp.Field_306) {
            this.Field_649.Method_26076(f);
        }
    }

    public void Method_780(Class_1061 class_1061, int n) {
        this.Method_795(n);
        Collection collection = this.Method_742().Method_21004(Class_27930.Field_27933);
        if (class_1061 instanceof Class_626) {
            this.Method_750(Class_19863.Field_19879);
            collection.addAll(this.Method_742().Method_21004(Class_27930.Field_27936));
            collection.addAll(this.Method_713(class_1061));
        } else {
            this.Method_750(Class_19863.Field_19903);
        }
        for (Class_7873 class_7873 : collection) {
            Class_21696 class_21696 = this.Method_742().Method_20993(this.Method_825(), class_7873);
            class_21696.Method_21708();
        }
    }

    public boolean Method_781(Class_626 class_626) {
        if (!this.\u0000= ?()) {
            return (131 & 552) != 0;
        }
        if (class_626.Method_752()) {
            return (11906 & -16320) != 0;
        }
        Class_9665 class_9665 = this.Method_840();
        return (class_9665 == null || class_626 == null || class_626.Method_840() != class_9665 || !class_9665.Method_9670() ? 707 & 8205 : 777 & 28674) != 0;
    }

    public boolean Method_782() {
        return this.Field_694.Field_18083;
    }

    protected void Method_783() {
        super.Method_1019();
        this.\u0000strictfp().\u0000= final(Class_21716.Field_21717).Method_16556(1.0);
        this.\u0000strictfp(Class_21716.Field_21722).Method_16556(Field_642.Method_2199());
    }

    public float Method_784() {
        int n = 20554 & 16;
        Class_23823[] arrclass_23823 = this.Field_628.Field_37787;
        int n2 = arrclass_23823.length;
        for (int i = 2889 & -28526; i < n2; ++i) {
            Class_23823 class_23823 = arrclass_23823[i];
            if (class_23823 == null) continue;
            ++n;
        }
        return (float)n / (float)this.Field_628.Field_37787.length;
    }

    public void Method_785() {
        super.Method_1003();
        this.Method_750(Class_19863.Field_19906);
        if (this.\u0000abstract()) {
            this.Method_779(0.6877193f * 1.1632653f);
        } else {
            this.Method_779(0.3625f * 0.55172414f);
        }
    }

    public void Method_786(Class_13017 class_13017) {
    }

    public Class_47024 Method_787() {
        return this.Field_629;
    }

    public void Method_788() {
    }

    public float Method_789(float f) {
        return this.Field_684 + (this.Field_639 - this.Field_684) * f;
    }

    public void Method_790(int n) {
        this.\u0000strictfp.Method_32704(-24557 & 1562, n);
    }

    public void Method_791() {
    }

    public Class_23823 Method_792() {
        return this.Field_628.Method_37821();
    }

    public Class_31516 Method_793(Class_4751 class_4751) {
        if (!this.\u0000strictfp.Field_306) {
            if (this.Method_822() || !this.\u0000volatile()) {
                return Class_31516.Field_31517;
            }
            if (!this.\u0000strictfp.Field_284.Method_18372()) {
                return Class_31516.Field_31522;
            }
            if (this.\u0000strictfp.Method_347()) {
                return Class_31516.Field_31521;
            }
            if (Math.abs(this.\u0000= package - (double)class_4751.\u0000= final()) > 7.038461538461539 * 0.4262295081967213 || Math.abs(this.\u0000, for() - (double)class_4751.\u0000, `()) > 4.829268292682927 * 0.41414141414141414 || Math.abs(this.\u0000= switch - (double)class_4751.\u0000strictfp()) > 0.6043956043956044 * 4.963636363636364) {
                return Class_31516.Field_31523;
            }
            double d = 0.6875 * 11.636363636363637;
            double d2 = 1.3076923076923077 * 3.8235294117647056;
            List list = this.\u0000strictfp.Method_488(Class_41880.class, new Class_10997((double)class_4751.\u0000= final() - d, (double)class_4751.\u0000, `() - d2, (double)class_4751.\u0000strictfp() - d, (double)class_4751.\u0000= final() + d, (double)class_4751.\u0000, `() + d2, (double)class_4751.\u0000strictfp() + d));
            if (!list.isEmpty()) {
                return Class_31516.Field_31518;
            }
        }
        if (this.\u0000= `()) {
            this.\u0000strictfp((Class_1061)null);
        }
        this.\u0000= final(0.6f * 0.3333333f, 1.1f * 0.18181819f);
        if (this.\u0000strictfp.Method_368(class_4751)) {
            Class_4595 class_4595 = (Class_4595)((Object)this.\u0000strictfp.Method_375(class_4751).Method_3440(Class_5133.Field_5134));
            float f = 0.5151515f * 0.97058827f;
            float f2 = 0.02631579f * 19.0f;
            switch (Class_27136.Field_27137[class_4595.ordinal()]) {
                case 1: {
                    f2 = 0.6035294f * 1.4912281f;
                    break;
                }
                case 2: {
                    f2 = 0.109195404f * 0.9157895f;
                    break;
                }
                case 3: {
                    f = 0.27894738f * 0.35849056f;
                    break;
                }
                case 4: {
                    f = 1.0131578f * 0.8883117f;
                }
            }
            this.Method_808(class_4595);
            this.\u0000%((double)((float)class_4751.\u0000= final() + f), (double)((float)class_4751.\u0000, `() + 4.6f * 0.14945653f), (double)((float)class_4751.\u0000strictfp() + f2));
        } else {
            this.\u0000%((double)((float)class_4751.\u0000= final() + 1.2063493f * 0.41447368f), (double)((float)class_4751.\u0000, `() + 0.55f * 1.25f), (double)((float)class_4751.\u0000strictfp() + 1.2982457f * 0.3851351f));
        }
        this.Field_693 = 161 & 6929;
        this.Field_704 = 5644 & 322;
        this.Field_686 = class_4751;
        this.\u0000switch = 0.0;
        this.\u0000= ` = 0.0;
        this.\u0000%(0.0);
        if (!this.\u0000strictfp.Field_306) {
            this.\u0000strictfp.Method_534();
        }
        return Class_31516.Field_31519;
    }

    public boolean Method_794(Class_4751 class_4751, Class_4595 class_4595, Class_23823 class_23823) {
        if (this.Field_694.Field_18083) {
            return (24673 & -26483) != 0;
        }
        if (class_23823 == null) {
            return (4130 & -15743) != 0;
        }
        Class_4751 class_47512 = class_4751.Method_4765(class_4595.Method_4660());
        Class_3238 class_3238 = this.\u0000strictfp.Method_375(class_47512).Method_3442();
        return (class_23823.Method_23889(class_3238) || class_23823.Method_23894() ? 4131 & -12779 : 16676 & 4162) != 0;
    }

    public void Method_795(int n) {
        int n2 = this.Method_831();
        this.\u0000strictfp.Method_32704(342 & -28517, n2 + n);
    }

    public void Method_796() {
        super.\u0000break();
        this.Field_681.Method_8320(this);
        if (this.Field_665 != null) {
            this.Field_665.Method_8320(this);
        }
    }

    public void Method_797(boolean bl) {
        this.Field_648 = bl;
    }

    public void Method_798() {
        if (this.Field_638 != null) {
            this.Field_638.Method_23868(this.\u0000strictfp, this, this.Field_654);
        }
        this.Method_803();
    }

    public int Method_799() {
        return this.Field_704;
    }

    public void Method_800(Class_4961 class_4961) {
    }

    public void Method_801(Class_23823 class_23823) {
    }

    public void Method_802(Class_46199 class_46199, Class_4961 class_4961) {
    }

    public void Method_803() {
        this.Field_638 = null;
        this.Field_654 = 2375 & 4104;
        if (!this.\u0000strictfp.Field_306) {
            this.\u0000
            ((-19294 & 268) != 0);
        }
    }

    public boolean Method_804(int n, Class_23823 class_23823) {
        if (n >= 0 && n < this.Field_628.Field_37784.length) {
            this.Field_628.Method_37796(n, class_23823);
            return (17411 & -32355) != 0;
        }
        int n2 = n - (16486 & 2676);
        if (n2 >= 0 && n2 < this.Field_628.Field_37787.length) {
            int n3 = n2 + (1 & 24911);
            if (class_23823 != null && class_23823.Method_23844() != null) {
                if (class_23823.Method_23844() instanceof Class_37716) {
                    if (Class_34093.Method_34150(class_23823) != n3) {
                        return (-10990 & 672) != 0;
                    }
                } else if (n3 != (-27579 & 2572) || class_23823.Method_23844() != Class_10527.Field_10702 && !(class_23823.Method_23844() instanceof Class_41056)) {
                    return (23946 & -32191) != 0;
                }
            }
            this.Field_628.Method_37796(n2 + this.Field_628.Field_37784.length, class_23823);
            return (9 & 18449) != 0;
        }
        int n4 = n - (19144 & 12765);
        if (n4 >= 0 && n4 < this.Field_629.\u0000= `()) {
            this.Field_629.\u0000, `(n4, class_23823);
            return (24601 & 6499) != 0;
        }
        return (-19939 & 16544) != 0;
    }

    public Class_1782 Method_805(boolean bl) {
        String string;
        Object object;
        if (this.Method_840() != null || this.Field_660 == null) {
            string = Class_22057.Method_22082(this.Method_840(), this.Method_825());
        } else {
            object = this.Field_660.Method_13677() != null ? this.Field_660.Method_13677() : this.Method_825();
            string = this.Field_660.Method_13681() + (String)object + this.Field_660.Method_13682();
        }
        object = new Class_2840(string);
        object.Method_1789().Method_2915(new Class_21230(Class_17245.Field_17253, "/msg " + this.Method_825() + " "));
        object.Method_1789().Method_2936(this.\u0000strictfp());
        object.Method_1789().Method_2926(this.Method_825());
        return object;
    }

    protected String Method_806() {
        return "game.player.swim.splash";
    }

    protected void Method_807() {
        super.Method_1027();
        this.\u0000strictfp.Method_32719(-28624 & 24602, (byte)(4634 & 24897));
        this.\u0000strictfp.Method_32719(61 & 1041, Float.valueOf(0.0f));
        this.\u0000strictfp.Method_32719(-30697 & 50, 140 & 12560);
        this.\u0000strictfp.Method_32719(-32742 & 20970, (byte)(-7034 & 801));
    }

    private void Method_808(Class_4595 class_4595) {
        this.Field_700 = 0.0f;
        this.Field_671 = 0.0f;
        switch (Class_27136.Field_27137[class_4595.ordinal()]) {
            case 1: {
                this.Field_671 = 0.4848485f * -3.7124999f;
                break;
            }
            case 2: {
                this.Field_671 = 0.7f * 2.5714285f;
                break;
            }
            case 3: {
                this.Field_700 = 0.62711865f * 2.8702703f;
                break;
            }
            case 4: {
                this.Field_700 = -3.4363635f * 0.52380955f;
            }
        }
    }

    public float Method_809() {
        return this.\u0000strictfp().Method_32722(5137 & 16979);
    }

    protected String Method_810(int n) {
        return n > (14101 & 44) ? "game.player.hurt.fall.big" : "game.player.hurt.fall.small";
    }

    public boolean Method_811() {
        return (this.Field_638 != null ? 2307 & -15647 : 24624 & 515) != 0;
    }

    protected String Method_812() {
        return "game.player.die";
    }

    public void Method_813(boolean bl, boolean bl2, boolean bl3) {
        this.\u0000= final(0.25909093f * 2.3157895f, 10.333333f * 0.17419355f);
        Class_3436 class_3436 = this.\u0000strictfp.Method_375(this.Field_686);
        if (this.Field_686 != null && class_3436.Method_3442() == Class_9265.Field_9441) {
            this.\u0000strictfp.Method_462(this.Field_686, class_3436.Method_3437(Class_5108.Field_5110, Boolean.valueOf((800 & 17437) != 0)), -32252 & 18926);
            Class_4751 class_4751 = Class_5108.Method_5113(this.\u0000strictfp, this.Field_686, 2816 & -24409);
            if (class_4751 == null) {
                class_4751 = this.Field_686.Method_4769();
            }
            this.\u0000%((double)((float)class_4751.\u0000= final() + 1.1538461f * 0.43333334f), (double)((float)class_4751.\u0000, `() + 0.8405797f * 0.11896552f), (double)((float)class_4751.\u0000strictfp() + 0.32142857f * 1.5555556f));
        }
        this.Field_693 = 9542 & 512;
        if (!this.\u0000strictfp.Field_306 && bl2) {
            this.\u0000strictfp.Method_534();
        }
        int n = this.Field_704 = bl ? 24838 & 1024 : 16494 & -28044;
        if (bl3) {
            this.Method_747(this.Field_686, (-24572 & 1729) != 0);
        }
    }

    public float Method_814() {
        return (float)this.\u0000strictfp(Class_21716.Field_21722).Method_16554();
    }

    public void Method_815(Class_4990 class_4990) {
    }

    protected void Method_816(float f) {
        this.Field_628.Method_37809(f);
    }

    public void Method_817(Class_13017 class_13017, int n) {
    }

    static boolean Method_818(Class_626 class_626, boolean bl) {
        class_626.Field_667 = bl;
        return class_626.Field_667;
    }

    public static Class_4751 Method_819(Class_283 class_283, Class_4751 class_4751, boolean bl) {
        Class_3238 class_3238 = class_283.Method_375(class_4751).Method_3442();
        if (class_3238 != Class_9265.Field_9441) {
            if (!bl) {
                return null;
            }
            boolean bl2 = class_3238.Method_3364();
            boolean bl3 = class_283.Method_375(class_4751.Method_4769()).Method_3442().Method_3364();
            return bl2 && bl3 ? class_4751 : null;
        }
        return Class_5108.Method_5113(class_283, class_4751, -28656 & 11981);
    }

    public boolean Method_820(Class_1061 class_1061) {
        Class_23823 class_23823;
        if (this.Method_752()) {
            if (class_1061 instanceof Class_4961) {
                this.Method_800((Class_4961)((Object)class_1061));
            }
            return (20496 & -30677) != 0;
        }
        Class_23823 class_238232 = this.Method_792();
        Class_23823 class_238233 = class_23823 = class_238232 != null ? class_238232.Method_23850() : null;
        if (!class_1061.Method_1297(this)) {
            if (class_238232 != null && class_1061 instanceof Class_859) {
                if (this.Field_694.Method_18094()) {
                    class_238232 = class_23823;
                }
                if (class_238232.Method_23881(this, (Class_859)class_1061)) {
                    if (class_238232.Field_23826 <= 0 && !this.Field_694.Method_18094()) {
                        this.Method_744();
                    }
                    return (141 & -25263) != 0;
                }
            }
            return (8193 & 1196) != 0;
        }
        if (class_238232 != null && class_238232 == this.Method_792()) {
            if (class_238232.Field_23826 <= 0 && !this.Field_694.Method_18094()) {
                this.Method_744();
            } else if (class_238232.Field_23826 < class_23823.Field_23826 && this.Field_694.Method_18094()) {
                class_238232.Field_23826 = class_23823.Field_23826;
            }
        }
        return (561 & 3265) != 0;
    }

    public void Method_821(Class_1061 class_1061) {
    }

    public boolean Method_822() {
        return this.Field_693;
    }

    public Class_23823[] Method_823() {
        return this.Field_628.Field_37787;
    }

    protected void Method_824(Class_23823 class_23823, int n) {
        if (class_23823.Method_23872() == Class_25567.Field_25570) {
            this.Method_833("random.drink", 0.15853658f * 3.1538463f, this.\u0000strictfp.Field_307.nextFloat() * (1.8f * 0.05555556f) + 0.73333335f * 1.2272726f);
        }
        if (class_23823.Method_23872() == Class_25567.Field_25571) {
            for (int i = -15712 & 64; i < n; ++i) {
                Vec3 vec3 = new Vec3(((double)this.\u0000strictfp.nextFloat() - 1.1458333333333333 * 0.4363636363636364) * (4.304347826086956 * 0.023232323232323236), Math.random() * (0.03650793650793651 * 2.739130434782609) + 1.0789473684210527 * 0.09268292682926829, 0.0);
                vec3 = vec3.\u0000, `(-this.\u0000= float * (4.8987546f * 0.6413044f) / (0.2580645f * 697.5f));
                vec3 = vec3.\u0000strictfp(-this.\u0000= ? * (4.6857653f * 0.67045456f) / (218.07692f * 0.82539684f));
                double d = (double)(-this.\u0000strictfp.nextFloat()) * (0.2345679012345679 * 2.557894736842105) - 1.8148148148148149 * 0.16530612244897958;
                Vec3 vec32 = new Vec3(((double)this.\u0000strictfp.nextFloat() - 0.3617021276595745 * 1.3823529411764706) * (0.8627450980392157 * 0.3477272727272727), d, 0.19999999999999998 * 3.0);
                vec32 = vec32.\u0000, `(-this.\u0000= float * (0.375f * 8.377581f) / (0.037037037f * 4860.0f));
                vec32 = vec32.\u0000strictfp(-this.\u0000= ? * (0.65449846f * 4.8f) / (348.0f * 0.51724136f));
                vec32 = vec32.\u0000strictfp(this.\u0000= package, this.\u0000, for() + (double)this.Method_837(), this.\u0000= switch);
                if (class_23823.Method_23877()) {
                    int[] arrn = new int[-32638 & 70];
                    arrn[2 & 6273] = Class_1956.Method_1986(class_23823.Method_23844());
                    arrn[2753 & -32747] = class_23823.Method_23843();
                    this.\u0000strictfp.Method_407(Class_40274.Field_40290, vec32.\u0000= final, vec32.\u0000strictfp, vec32.\u0000, `, vec3.\u0000= final, vec3.\u0000strictfp + 1.1643835616438356 * 0.04294117647058824, vec3.\u0000, `, arrn);
                    continue;
                }
                int[] arrn = new int[16421 & -26623];
                arrn[16416 & 4104] = Class_1956.Method_1986(class_23823.Method_23844());
                this.\u0000strictfp.Method_407(Class_40274.Field_40290, vec32.\u0000= final, vec32.\u0000strictfp, vec32.\u0000, `, vec3.\u0000= final, vec3.\u0000strictfp + 0.11666666666666668 * 0.42857142857142855, vec3.\u0000, `, arrn);
            }
            this.Method_833("random.eat", 1.3043479f * 0.38333333f + 0.10824742f * 4.6190476f * (float)this.\u0000strictfp.nextInt(25347 & -30526), (this.\u0000strictfp.nextFloat() - this.\u0000strictfp.nextFloat()) * (0.15116279f * 1.323077f) + 1.0f);
        }
    }

    public String Method_825() {
        return this.Field_682.getName();
    }

    static List Method_826(Class_626 class_626, List list) {
        class_626.Field_655 = list;
        return class_626.Field_655;
    }

    public boolean Method_827() {
        return this.Field_667;
    }

    private void Method_828(Class_1061 class_1061) {
        class_1061.Method_1273(this);
    }

    public void Method_829(int n) {
        this.Field_668 += n;
        if (this.Field_668 < 0) {
            this.Field_668 = 11412 & 552;
            this.Field_692 = 0.0f;
            this.Field_662 = 14672 & 36;
        }
        if (n > 0 && this.Field_668 % (6183 & 17925) == 0 && (float)this.Field_636 < (float)this.\u0000= package - 7.9545455f * 12.571428f) {
            float f = this.Field_668 > (2206 & 5182) ? 1.0f : (float)this.Field_668 / (120.0f * 0.25f);
            this.\u0000strictfp.Method_519(this, "random.levelup", f * (0.73134327f * 1.0255102f), 1.0f);
            this.Field_636 = this.\u0000= package;
        }
    }

    public void Method_830(Class_1061 class_1061) {
    }

    public int Method_831() {
        return this.\u0000strictfp.Method_32710(26642 & 1074);
    }

    public void Method_832() {
        this.\u0000= final(Field_674.Method_3850(), Field_635.Method_3850());
        super.\u0000= "();
        this.\u0000switch(this.\u0000switch());
        this.\u0000= static = -11776 & 2329;
    }

    public void Method_833(String string, float f, float f2) {
        this.\u0000strictfp.Method_552(this, string, f, f2);
    }

    public void Method_834() {
        if (!this.\u0000strictfp.Field_306 && this.\u0000%()) {
            this.\u0000strictfp((Class_1061)null);
            this.\u0000%((4736 & 88) != 0);
        } else {
            double d = this.\u0000= package;
            double d2 = this.\u0000, for();
            double d3 = this.\u0000= switch;
            float f = this.\u0000= ?;
            float f2 = this.\u0000= float;
            super.Method_1026();
            this.Field_634 = this.Field_657;
            this.Field_657 = 0.0f;
            this.Method_729(this.\u0000= package - d, this.\u0000, for() - d2, this.\u0000= switch - d3);
            if (this.\u0000, ` instanceof Class_47600) {
                this.\u0000= float = f2;
                this.\u0000= ? = f;
                this.\u0000super = ((Class_47600)this.\u0000, `).\u0000super;
            }
        }
    }

    public Class_3443 Method_835(boolean bl) {
        return this.Method_843(this.Field_628.Method_37830(this.Field_628.Field_37782, bl && this.Field_628.Method_37821() != null ? this.Field_628.Method_37821().Field_23826 : -32763 & 27691), (26392 & -26586) != 0, (515 & -26463) != 0);
    }

    public int Method_836() {
        return this.Field_694.Field_18085 ? 17408 & 6612 : 594 & 2132;
    }

    public float Method_837() {
        return this.Method_734(0.0f);
    }

    protected boolean Method_838() {
        return (this.\u0000abstract() <= 0.0f || this.Method_822() ? 19289 & 1187 : 1808 & 26816) != 0;
    }

    protected boolean Method_839() {
        return (!this.Field_694.Method_18090() ? 4097 & 2787 : 20 & 10504) != 0;
    }

    public Class_9665 Method_840() {
        return this.Method_742().Method_20987(this.Method_825());
    }

    protected boolean Method_841() {
        return (1665 & 267) != 0;
    }

    public void Method_842(Class_859 class_859) {
        Class_7898 class_7898;
        if (class_859 instanceof Class_32423) {
            this.Method_750(Class_21905.Field_21941);
        }
        if ((class_7898 = (Class_7898)Class_15516.Field_15520.get(Class_15516.Method_15549(class_859))) != null) {
            this.Method_750(class_7898.Field_7901);
        }
    }

    public Class_3443 Method_843(Class_23823 class_23823, boolean bl, boolean bl2) {
        if (class_23823 == null) {
            return null;
        }
        if (class_23823.Field_23826 == 0) {
            return null;
        }
        double d = this.\u0000, for() - 0.20816327357778744 * 1.4411764705882353 + (double)this.Method_837();
        Class_3443 class_3443 = new Class_3443(this.\u0000strictfp, this.\u0000= package, d, this.\u0000= switch, class_23823);
        class_3443.Method_3469(26923 & 5160);
        if (bl2) {
            class_3443.Method_3453(this.Method_825());
        }
        if (bl) {
            float f = this.\u0000strictfp.nextFloat() * (1.3703704f * 0.36486486f);
            float f2 = this.\u0000strictfp.nextFloat() * (5.714286f * 0.5497787f) * 2.0f;
            class_3443.\u0000= ` = -Class_13337.Method_13370(f2) * f;
            class_3443.\u0000switch = Class_13337.Method_13350(f2) * f;
            class_3443.\u0000%(0.22068965846094593 * 0.90625);
        } else {
            float f = 1.85f * 0.16216217f;
            class_3443.\u0000= ` = -Class_13337.Method_13370(this.\u0000= ? / (172.89474f * 1.0410959f) * (1.0114943f * 3.1058927f)) * Class_13337.Method_13350(this.\u0000= float / (1.4705882f * 122.4f) * (6.5f * 0.48332196f)) * f;
            class_3443.\u0000switch = Class_13337.Method_13350(this.\u0000= ? / (0.50549453f * 356.08694f) * (17.0f * 0.18479957f)) * Class_13337.Method_13350(this.\u0000= float / (0.45783132f * 393.1579f) * (1.8667436f * 1.6829268f)) * f;
            class_3443.\u0000%((double)(-Class_13337.Method_13370(this.\u0000= float / (1.3142858f * 136.95651f) * (0.16666667f * 18.849556f)) * f + 1.6470588f * 0.060714286f));
            float f3 = this.\u0000strictfp.nextFloat() * (0.032724924f * 96.0f) * 2.0f;
            f = 0.0060869562f * 3.2857144f * this.\u0000strictfp.nextFloat();
            class_3443.\u0000= ` += Math.cos(f3) * (double)f;
            class_3443.\u0000%(class_3443.\u0000, #() + (double)((this.\u0000strictfp.nextFloat() - this.\u0000strictfp.nextFloat()) * (0.5925926f * 0.16875f)));
            class_3443.\u0000switch += Math.sin(f3) * (double)f;
        }
        this.Method_760(class_3443);
        if (bl2) {
            this.Method_750(Class_19863.Field_19878);
        }
        return class_3443;
    }

    public Class_23823 Method_844() {
        return this.Field_628.Method_37821();
    }

    public void Method_845(Class_32797 class_32797) {
        super.Method_973(class_32797);
        this.\u0000= final(0.45238096f * 0.44210526f, 0.5584416f * 0.35813951f);
        this.\u0000%(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
        this.\u0000%(0.25263157894736843 * 0.3958333392317096);
        if (this.Method_825().equals("Notch")) {
            this.Method_843(new Class_23823(Class_10527.Field_10676, 8333 & -32719), (24753 & 775) != 0, (-30590 & 29004) != 0);
        }
        if (!this.\u0000strictfp.Method_522().Method_7529("keepInventory")) {
            this.Field_628.Method_37798();
        }
        if (class_32797 != null) {
            this.\u0000= ` = -Class_13337.Method_13350((this.\u0000= , + this.\u0000= ?) * (8.33205f * 0.37704918f) / (151.94806f * 1.1846154f)) * (0.17333333f * 0.5769231f);
            this.\u0000switch = -Class_13337.Method_13370((this.\u0000= , + this.\u0000= ?) * (3.0434182f * 1.032258f) / (97.07865f * 1.8541666f)) * (0.02419355f * 4.133333f);
        } else {
            this.\u0000switch = 0.0;
            this.\u0000= ` = 0.0;
        }
        this.Method_750(Class_19863.Field_19874);
        this.Method_786(Class_19863.Field_19873);
    }

    public Class_23823 Method_846() {
        return this.Field_638;
    }

    public boolean Method_847(Class_21361 class_21361) {
        return ((this.\u0000strictfp().Method_32708(30 & 22730) & class_21361.Method_21381()) == class_21361.Method_21381() ? 8203 & -32095 : 1028 & -30701) != 0;
    }

    public void Method_848(Class_23823 class_23823, int n) {
        if (class_23823 != this.Field_638) {
            this.Field_638 = class_23823;
            this.Field_654 = n;
            if (!this.\u0000strictfp.Field_306) {
                this.\u0000
                ((-27967 & 3379) != 0);
            }
        }
    }

    public int Method_849() {
        return this.Field_654;
    }

    public int Method_850() {
        return -30710 & 13322;
    }

    public static UUID Method_851(GameProfile gameProfile) {
        UUID uUID = gameProfile.getId();
        if (uUID == null) {
            uUID = Class_626.Method_709(gameProfile.getName());
        }
        return uUID;
    }

    public void Method_852() {
        if (this.Field_644 > 0) {
            this.Field_644 -= 1889 & 26767;
        }
        if (this.\u0000strictfp.Method_487() == Class_26801.Field_26803 && this.\u0000strictfp.Method_522().Method_7529("naturalRegeneration")) {
            if (this.\u0000abstract() < this.\u0000switch() && this.\u0000= package % (16404 & -19396) == 0) {
                this.\u0000, `(1.0f);
            }
            if (this.Field_649.Method_26087() && this.\u0000= package % (8414 & -30197) == 0) {
                this.Field_649.Method_26081(this.Field_649.Method_26086() + (-30133 & 13361));
            }
        }
        this.Field_628.Method_37802();
        this.Field_634 = this.Field_657;
        super.Method_947();
        Class_16547 class_16547 = this.\u0000strictfp(Class_21716.Field_21722);
        if (!this.\u0000strictfp.Field_306) {
            class_16547.Method_16556(this.Field_694.Method_18101());
        }
        this.\u0000strictfp.Method_3854(this.Field_650.Method_3850());
        if (this.\u0000abstract()) {
            this.\u0000strictfp.Method_3854((float)((double)this.\u0000strictfp.Method_3850() + (double)this.Field_650.Method_3850() * (double)Field_646.Method_3850()));
        }
        this.\u0000, #((float)class_16547.Method_16554());
        float f = Class_13337.Method_13347(this.\u0000= ` * this.\u0000= ` + this.\u0000switch * this.\u0000switch);
        float f2 = (float)(Math.atan(-this.\u0000, #() * (0.23636363636363636 * 0.846153858762521)) * (13.051948051948052 * 1.1492537313432836));
        if (f > 0.35999998f * 0.2777778f) {
            f = 4.631579f * 0.021590909f;
        }
        if (!this.\u0000super() || this.\u0000abstract() <= 0.0f) {
            f = 0.0f;
        }
        if (this.\u0000super() || this.\u0000abstract() <= 0.0f) {
            f2 = 0.0f;
        }
        this.Field_657 += (f - this.Field_657) * (1.8461539f * 0.21666667f);
        this.\u0000= | += (f2 - this.\u0000= |) * (0.51666665f * 1.5483872f);
        if (this.\u0000abstract() > 0.0f && !this.Method_752()) {
            Class_10997 class_10997 = null;
            class_10997 = this.\u0000, ` != null && !this.\u0000, `.Field_1110 ? this.\u0000, `().Method_11011(this.\u0000, `.Method_1315()).Method_11017(1.0, 0.0, 1.0) : this.\u0000, `().Method_11017(1.0, 0.09375 * 5.333333333333333, 1.0);
            ArrayList arrayList = this.\u0000strictfp.Method_473(this, class_10997);
            for (int i = -28109 & 25728; i < arrayList.size(); ++i) {
                Class_1061 class_1061 = (Class_1061)arrayList.get(i);
                if (class_1061.Field_1110) continue;
                this.Method_828(class_1061);
            }
        }
    }

    static {
        Field_642 = new Class_2190(Class_2263.Method_2385(), Class_2205.Field_2213);
        Field_674 = new Class_3839(Class_2263.Method_2417(), Class_2205.Field_2233);
        Field_635 = new Class_3839(Class_2263.Method_2273(), Class_2205.Field_2249);
        Field_646 = new Class_3839(Class_2263.Method_2301(), Class_2205.Field_2224);
        Field_633 = new Class_2190(Class_2263.Method_2407(), Class_2205.Field_2247);
    }

    public int Method_853() {
        return this.Field_628.Method_37808();
    }

    public void Method_854(Class_1782 class_1782) {
    }

    public boolean Method_855() {
        return Class_2457.Method_2530().Field_2463[24576 & -28664].\u0000strictfp().Method_7529("sendCommandFeedback");
    }

    public void Method_856(Class_626 class_626, boolean bl) {
        if (bl) {
            this.Field_628.Method_37819(class_626.Field_628);
            this.\u0000switch(class_626.\u0000abstract());
            this.Field_649 = class_626.Field_649;
            this.Field_668 = class_626.Field_668;
            this.Field_662 = class_626.Field_662;
            this.Field_692 = class_626.Field_692;
            this.Method_790(class_626.Method_831());
            this.\u0000strictfp = class_626.\u0000strictfp;
            this.\u0000strictfp = class_626.\u0000strictfp;
            this.\u0000strictfp = class_626.\u0000strictfp;
        } else if (this.\u0000strictfp.Method_522().Method_7529("keepInventory")) {
            this.Field_628.Method_37819(class_626.Field_628);
            this.Field_668 = class_626.Field_668;
            this.Field_662 = class_626.Field_662;
            this.Field_692 = class_626.Field_692;
            this.Method_790(class_626.Method_831());
        }
        this.Field_641 = class_626.Field_641;
        this.Field_629 = class_626.Field_629;
        this.\u0000strictfp().Method_32704(266 & 4111, class_626.\u0000strictfp().Method_32708(-32118 & 7498));
    }

    public boolean Method_857(Class_11641 class_11641) {
        if (class_11641.Method_11648()) {
            return (-32763 & 7745) != 0;
        }
        Class_23823 class_23823 = this.Method_792();
        return class_23823 != null && class_23823.Method_23851() ? class_23823.Method_23899().equals(class_11641.Method_11646()) : 14374 & 1880;
    }

    public void Method_858(float f, float f2) {
        if (!this.Field_694.Method_18095()) {
            if (f >= 2.0f) {
                this.Method_817(Class_19863.Field_19889, (int)Math.round((double)f * (86.95652173913044 * 1.15)));
            }
            super.Method_941(f, f2);
        }
    }
}

