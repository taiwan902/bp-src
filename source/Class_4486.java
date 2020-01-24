/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class Class_4486
extends Class_1061 {
    private float Field_4487;
    private Class_3436 Field_4488;
    private int Field_4489;
    public int Field_4490;
    private boolean Field_4491;
    private boolean Field_4492;
    public boolean Field_4493;
    public Class_1699 Field_4494;

    protected void Method_4495() {
    }

    private void Method_4496() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_4497(Class_1699 class_1699) {
        int n = class_1699.Method_1716("Data") & (-12033 & 8447);
        this.Field_4488 = class_1699.Method_1715("Block", 10 & -29560) ? Class_3238.Method_3341(class_1699.Method_1708("Block")).Method_3342(n) : (class_1699.Method_1715("TileID", 16995 & 8303) ? Class_3238.Method_3323(class_1699.Method_1738("TileID")).Method_3342(n) : Class_3238.Method_3323(class_1699.Method_1716("Tile") & (18687 & 767)).Method_3342(n));
        this.Field_4490 = class_1699.Method_1716("Time") & (20991 & 255);
        Class_3238 class_3238 = this.Field_4488.Method_3442();
        if (class_1699.Method_1715("HurtEntities", 103 & 1891)) {
            this.Field_4492 = class_1699.Method_1733("HurtEntities");
            this.Field_4487 = class_1699.Method_1745("FallHurtAmount");
            this.Field_4489 = class_1699.Method_1738("FallHurtMax");
        } else if (class_3238 == Class_9265.Field_9376) {
            this.Field_4492 = 4097 & 3231;
        }
        if (class_1699.Method_1715("DropItem", -7833 & 99)) {
            this.Field_4493 = class_1699.Method_1733("DropItem");
        }
        if (class_1699.Method_1715("TileEntityData", 5195 & 938)) {
            this.Field_4494 = class_1699.Method_1703("TileEntityData");
        }
        if (class_3238 == null || class_3238.Method_3373() == Class_3713.Field_3718) {
            this.Field_4488 = Class_9265.Field_9394.\u0000strictfp();
        }
    }

    public Class_4486(Class_283 class_283) {
        super(class_283);
        this.Field_4493 = -16127 & 2185;
        this.Field_4489 = 1708 & 361;
        this.Field_4487 = 2.0f;
    }

    public Class_4486(Class_283 class_283, double d, double d2, double d3, Class_3436 class_3436) {
        super(class_283);
        this.Field_4493 = -16379 & 3337;
        this.Field_4489 = 2412 & -31574;
        this.Field_4487 = 2.0f;
        this.Field_4488 = class_3436;
        this.\u0000= ? = -28121 & 25985;
        this.\u0000= final(2.0882354f * 0.46211264f, 0.6818182f * 1.4153333f);
        this.\u0000%(d, d2, d3);
        this.\u0000= ` = 0.0;
        this.\u0000%(0.0);
        this.\u0000switch = 0.0;
        this.\u0000= final(d);
        this.\u0000strictfp(d2);
        this.\u0000
        (d3);
    }

    public void Method_4498(boolean bl) {
        this.Field_4492 = bl;
    }

    public void Method_4499(float f, float f2) {
        int n;
        Class_3238 class_3238 = this.Field_4488.Method_3442();
        if (this.Field_4492 && (n = Class_13337.Method_13362(f - 1.0f)) > 0) {
            ArrayList arrayList = Lists.newArrayList((Iterable)this.\u0000strictfp.Method_473(this, this.\u0000, `()));
            int n2 = class_3238 == Class_9265.Field_9376 ? 645 & 8481 : -27904 & 100;
            Class_32797 class_32797 = n2 != 0 ? Class_32797.Field_32798 : Class_32797.Field_32818;
            for (Class_1061 class_1061 : arrayList) {
                class_1061.Method_1340(class_32797, Math.min(Class_13337.Method_13377((float)n * this.Field_4487), this.Field_4489));
            }
            if (n2 != 0 && (double)this.\u0000strictfp.nextFloat() < 0.30714286171964233 * 0.16279069767441862 + (double)n * (0.64 * 0.078125)) {
                int n3 = (Integer)this.Field_4488.Method_3440(Class_27430.Field_27432);
                if (++n3 > (27683 & -32702)) {
                    this.Field_4491 = 4261 & 9025;
                } else {
                    this.Field_4488 = this.Field_4488.Method_3437(Class_27430.Field_27432, Integer.valueOf(n3));
                }
            }
        }
    }

    public Class_3436 Method_4500() {
        return this.Field_4488;
    }

    protected void Method_4501(Class_1699 class_1699) {
        Class_3238 class_3238 = this.Field_4488 != null ? this.Field_4488.Method_3442() : Class_9265.Field_9351;
        Class_2080 class_2080 = (Class_2080)Class_3238.Field_3271.\u0000, `((Object)class_3238);
        class_1699.Method_1702("Block", class_2080 == null ? "" : class_2080.Method_2086());
        class_1699.Method_1724("Data", (byte)class_3238.Method_3434(this.Field_4488));
        class_1699.Method_1724("Time", (byte)this.Field_4490);
        class_1699.Method_1706("DropItem", this.Field_4493);
        class_1699.Method_1706("HurtEntities", this.Field_4492);
        class_1699.Method_1704("FallHurtAmount", this.Field_4487);
        class_1699.Method_1739("FallHurtMax", this.Field_4489);
        if (this.Field_4494 != null) {
            class_1699.Method_1744("TileEntityData", this.Field_4494);
        }
    }

    protected boolean Method_4502() {
        return (2050 & 25672) != 0;
    }

    public Class_283 Method_4503() {
        return this.\u0000strictfp;
    }

    public void Method_4504(Class_13220 class_13220) {
        super.Method_1284(class_13220);
        if (this.Field_4488 != null) {
            Class_3238 class_3238 = this.Field_4488.Method_3442();
            class_13220.Method_13231("Immitating block ID", Class_3238.Method_3435(class_3238));
            class_13220.Method_13231("Immitating block data", class_3238.Method_3434(this.Field_4488));
        }
    }

    public void Method_4505() {
        Class_3238 class_3238 = this.Field_4488.Method_3442();
        if (class_3238.Method_3373() == Class_3713.Field_3718) {
            this.\u0000break();
        } else {
            Class_4751 class_4751;
            this.\u0000= final(this.\u0000= package);
            this.\u0000strictfp(this.\u0000, for());
            this.\u0000
            (this.\u0000= switch);
            int n = this.Field_4490;
            this.Field_4490 = n + (2833 & -15351);
            if (n == 0) {
                class_4751 = new Class_4751(this);
                if (this.\u0000strictfp.Method_375(class_4751).Method_3442() == class_3238) {
                    this.\u0000strictfp.Method_472(class_4751);
                } else if (!this.\u0000strictfp.Field_306) {
                    this.\u0000break();
                    return;
                }
            }
            this.\u0000%(this.\u0000, #() - 0.01945945902450665 * 2.0555555555555554);
            this.\u0000strictfp(this.\u0000= `, this.\u0000, #(), this.\u0000switch);
            this.\u0000= ` *= 0.9882352941176471 * 0.9916666859672183;
            this.\u0000%(this.\u0000, #() * (23.75 * 0.041263158697831));
            this.\u0000switch *= 0.6030769348144531 * 1.625;
            if (!this.\u0000strictfp.Field_306) {
                class_4751 = new Class_4751(this.\u0000= package, this.\u0000, for(), this.\u0000= switch);
                if (this.\u0000super()) {
                    this.\u0000= ` *= 0.8342465611353312 * 0.8390804597701149;
                    this.\u0000switch *= 1.5 * 0.4666666587193807;
                    this.\u0000%(this.\u0000, #() * (2.388888888888889 * -0.20930232558139536));
                    if (this.\u0000strictfp.Method_375(class_4751).Method_3442() != Class_9265.Field_9457) {
                        this.\u0000break();
                        if (!this.Field_4491) {
                            if (this.\u0000strictfp.Method_437(class_3238, class_4751, (14537 & 16657) != 0, Class_4595.Field_4601, null, null) && !Class_4475.Method_4483(this.\u0000strictfp, class_4751.Method_4782()) && this.\u0000strictfp.Method_462(class_4751, this.Field_4488, 16515 & 1631)) {
                                Class_4879 class_4879;
                                if (class_3238 instanceof Class_4475) {
                                    ((Class_4475)class_3238).Method_4484(this.\u0000strictfp, class_4751);
                                }
                                if (this.Field_4494 != null && class_3238 instanceof Class_3536 && (class_4879 = this.\u0000strictfp.Method_429(class_4751)) != null) {
                                    Class_1699 class_1699 = new Class_1699();
                                    class_4879.Method_4929(class_1699);
                                    for (String string : this.Field_4494.Method_1710()) {
                                        Class_1674 class_1674 = this.Field_4494.Method_1720(string);
                                        if (string.equals("x") || string.equals("y") || string.equals("z")) continue;
                                        class_1699.Method_1744(string, class_1674.Method_1677());
                                    }
                                    class_4879.Method_4911(class_1699);
                                    class_4879.Method_4922();
                                }
                            } else if (this.Field_4493 && this.\u0000strictfp.Method_522().Method_7529("doEntityDrops")) {
                                this.\u0000strictfp(new Class_23823(class_3238, 2073 & 4453, class_3238.Method_3369(this.Field_4488)), 0.0f);
                            }
                        }
                    }
                } else if (this.Field_4490 > (3325 & 20838) && !this.\u0000strictfp.Field_306 && (class_4751.\u0000, `() < (105 & 7169) || class_4751.\u0000, `() > (329 & 3456)) || this.Field_4490 > (8826 & 4700)) {
                    if (this.Field_4493 && this.\u0000strictfp.Method_522().Method_7529("doEntityDrops")) {
                        this.\u0000strictfp(new Class_23823(class_3238, 5133 & 8755, class_3238.Method_3369(this.Field_4488)), 0.0f);
                    }
                    this.\u0000break();
                }
            }
        }
    }

    public boolean Method_4506() {
        return (4765 & 24610) != 0;
    }

    public boolean Method_4507() {
        return (!this.\u0000= float ? 97 & 6415 : 18522 & 1056) != 0;
    }
}

