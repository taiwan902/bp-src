/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.collect.Lists
 *  com.google.common.primitives.Doubles
 *  com.google.common.primitives.Floats
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import net.minecraft.util.Vec3;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_20772
implements Class_10930,
Class_5591 {
    private int Field_20773;
    public \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true Field_20774;
    private double Field_20775;
    private long Field_20776;
    private double Field_20777;
    private int Field_20778;
    private int Field_20779;
    private Class_29437 Field_20780 = new Class_29437();
    public final Class_44584 Field_20781;
    private int Field_20782;
    private final Class_2457 Field_20783;
    private long Field_20784;
    private double Field_20785;
    private int Field_20786;
    private static final Logger Field_20787 = LogManager.getLogger();
    private int Field_20788;
    private boolean Field_20789 = 513 & -32493;
    private boolean Field_20790;

    public void Method_20791(Class_47014 class_47014) {
        Class_34388.Method_34390(class_47014, this, this.Field_20774.\u0000strictfp());
        ArrayList arrayList = Lists.newArrayList();
        for (String string : this.Field_20783.Method_2601((Class_1367)this.Field_20774, class_47014.Method_47017(), class_47014.Method_47022())) {
            arrayList.add(string);
        }
        this.Field_20774.\u0000strictfp.Method_20821(new Class_31558(arrayList.toArray(new String[arrayList.size()])));
    }

    private void Method_20792(String string) {
        this.Field_20783.Method_2553().Method_2756((Class_1367)this.Field_20774, string);
    }

    public void Method_20793(Class_40755 class_40755) {
        Class_34388.Method_34390(class_40755, this, this.Field_20774.\u0000strictfp());
        Class_2651 class_2651 = this.Field_20783.Method_2550(this.Field_20774.\u0000= catch);
        Class_4751 class_4751 = class_40755.Method_40765();
        this.Field_20774.\u0000, 2();
        switch (Class_13456.Field_13458[class_40755.Method_40760().ordinal()]) {
            case 1: {
                if (!this.Field_20774.\u0000c_()) {
                    this.Field_20774.\u0000strictfp((3152 & 21129) != 0);
                }
                return;
            }
            case 2: {
                if (!this.Field_20774.\u0000c_()) {
                    this.Field_20774.\u0000strictfp((-14767 & 289) != 0);
                }
                return;
            }
            case 3: {
                this.Field_20774.\u0000, if();
                return;
            }
            case 4: 
            case 5: 
            case 6: {
                double d = this.Field_20774.\u0000= package - ((double)class_4751.\u0000= final() + 0.18666666666666668 * 2.6785714285714284);
                double d2 = this.Field_20774.\u0000, for() - ((double)class_4751.\u0000, `() + 0.19117647058823528 * 2.6153846153846154) + 1.6590909090909092 * 0.9041095890410958;
                double d3 = this.Field_20774.\u0000= switch - ((double)class_4751.\u0000strictfp() + 0.8032786885245902 * 0.6224489795918368);
                double d4 = d * d + d2 * d2 + d3 * d3;
                if (d4 > 47.07692307692308 * 0.7647058823529411) {
                    return;
                }
                if (class_4751.\u0000, `() >= this.Field_20783.Method_2617()) {
                    return;
                }
                if (class_40755.Method_40760() == Class_22232.Field_22239) {
                    if (!this.Field_20783.Method_2636(class_2651, class_4751, (Class_626)this.Field_20774) && class_2651.\u0000strictfp().Method_31498(class_4751)) {
                        this.Field_20774.\u0000strictfp.Method_38765(class_4751, class_40755.Method_40759());
                    } else {
                        this.Field_20774.\u0000strictfp.Method_20821(new Class_26313(class_2651, class_4751));
                    }
                } else {
                    if (class_40755.Method_40760() == Class_22232.Field_22235) {
                        this.Field_20774.\u0000strictfp.Method_38766(class_4751);
                    } else if (class_40755.Method_40760() == Class_22232.Field_22238) {
                        this.Field_20774.\u0000strictfp.Method_38773();
                    }
                    if (class_2651.\u0000strictfp(class_4751).Method_3442().Method_3373() != Class_3713.Field_3718) {
                        this.Field_20774.\u0000strictfp.Method_20821(new Class_26313(class_2651, class_4751));
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid player action");
    }

    public Class_20772(Class_2457 class_2457, Class_44584 class_44584, \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2) {
        this.Field_20783 = class_2457;
        this.Field_20781 = class_44584;
        class_44584.Method_44630(this);
        this.Field_20774 = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2;
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp = this;
    }

    public void Method_20794(Class_1782 class_1782) {
        Field_20787.info(this.Field_20774.\u0000, `() + " lost connection: " + class_1782);
        this.Field_20783.Method_2610();
        Object[] arrobject = new Object[-10879 & 21];
        arrobject[23086 & -32768] = this.Field_20774.\u0000strictfp();
        Class_2849 class_2849 = new Class_2849("multiplayer.player.left", arrobject);
        class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5485);
        this.Field_20783.Method_2616().Method_3157(class_2849);
        this.Field_20774.\u0000= !();
        this.Field_20783.Method_2616().Method_3103(this.Field_20774);
        if (this.Field_20783.Method_2538() && this.Field_20774.\u0000, `().equals(this.Field_20783.Method_2629())) {
            Field_20787.info("Stopping singleplayer server as player logged out");
            this.Field_20783.Method_2520();
        }
    }

    public Class_44584 Method_20795() {
        return this.Field_20781;
    }

    private boolean Method_20796(Class_29005 class_29005) {
        return (!Doubles.isFinite((double)class_29005.Method_29014()) || !Doubles.isFinite((double)class_29005.Method_29018()) || !Doubles.isFinite((double)class_29005.Method_29015()) || !Floats.isFinite((float)class_29005.Method_29020()) || !Floats.isFinite((float)class_29005.Method_29023()) ? 26681 & 197 : 16464 & 11401) != 0;
    }

    public void Method_20797(double d, double d2, double d3, float f, float f2, Set set) {
        this.Field_20789 = 534 & 16712;
        this.Field_20777 = d;
        this.Field_20775 = d2;
        this.Field_20785 = d3;
        if (set.contains((Object)Class_33501.Field_33503)) {
            this.Field_20777 += this.Field_20774.\u0000= package;
        }
        if (set.contains((Object)Class_33501.Field_33508)) {
            this.Field_20775 += this.Field_20774.\u0000, for();
        }
        if (set.contains((Object)Class_33501.Field_33505)) {
            this.Field_20785 += this.Field_20774.\u0000= switch;
        }
        float f3 = f;
        float f4 = f2;
        if (set.contains((Object)Class_33501.Field_33507)) {
            f3 = f + this.Field_20774.\u0000= ?;
        }
        if (set.contains((Object)Class_33501.Field_33504)) {
            f4 = f2 + this.Field_20774.\u0000= float;
        }
        this.Field_20774.\u0000strictfp(this.Field_20777, this.Field_20775, this.Field_20785, f3, f4);
        this.Field_20774.\u0000strictfp.Method_20821(new Class_42558(d, d2, d3, f, f2, set));
    }

    public void Method_20798(Class_34421 class_34421) {
        if (class_34421.Method_34425() == this.Field_20788) {
            int n = (int)(this.Method_20810() - this.Field_20776);
            this.Field_20774.\u0000strictfp = (this.Field_20774.\u0000strictfp * (1067 & -12025) + n) / (205 & 12548);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void Method_20799(Class_28799 class_28799) {
        Class_34388.Method_34390(class_28799, this, this.Field_20774.\u0000strictfp());
        if ("MC|BEdit".equals(class_28799.Method_28808())) {
            Class_29900 class_29900 = new Class_29900(Class_16620.Method_16631(class_28799.Method_28806()));
            try {
                Class_23823 class_23823 = class_29900.Method_30002();
                if (class_23823 == null) return;
                if (!Class_33817.Method_33820(class_23823.Method_23845())) {
                    throw new IOException("Invalid book tag!");
                }
                Class_23823 class_238232 = this.Field_20774.\u0000strictfp.Method_37821();
                if (class_238232 == null) {
                    return;
                }
                if (class_23823.Method_23844() != Class_10527.Field_10662 || class_23823.Method_23844() != class_238232.Method_23844()) return;
                class_238232.Method_23879("pages", class_23823.Method_23845().Method_1735("pages", -30583 & 12344));
                return;
            }
            catch (Exception exception) {
                Field_20787.error("Couldn't handle book info", (Throwable)exception);
                return;
            }
            finally {
                class_29900.Method_29972();
            }
        }
        if ("MC|BSign".equals(class_28799.Method_28808())) {
            Class_29900 class_29900 = new Class_29900(Class_16620.Method_16631(class_28799.Method_28806()));
            try {
                Class_23823 class_23823 = class_29900.Method_30002();
                if (class_23823 == null) return;
                if (!Class_38466.Method_38470(class_23823.Method_23845())) {
                    throw new IOException("Invalid book tag!");
                }
                Class_23823 class_238233 = this.Field_20774.\u0000strictfp.Method_37821();
                if (class_238233 == null) {
                    return;
                }
                if (class_23823.Method_23844() != Class_10527.Field_10671 || class_238233.Method_23844() != Class_10527.Field_10662) return;
                class_238233.Method_23879("author", new Class_1746(this.Field_20774.\u0000, `()));
                class_238233.Method_23879("title", new Class_1746(class_23823.Method_23845().Method_1708("title")));
                class_238233.Method_23879("pages", class_23823.Method_23845().Method_1735("pages", 524 & -7702));
                class_238233.Method_23882(Class_10527.Field_10671);
                return;
            }
            catch (Exception exception) {
                Field_20787.error("Couldn't sign book", (Throwable)exception);
                return;
            }
            finally {
                class_29900.Method_29972();
            }
        }
        if ("MC|TrSel".equals(class_28799.Method_28808())) {
            try {
                int n = class_28799.Method_28806().Method_29914();
                Class_8295 class_8295 = this.Field_20774.\u0000, `;
                if (!(class_8295 instanceof Class_22508)) return;
                ((Class_22508)class_8295).Method_22518(n);
                return;
            }
            catch (Exception exception) {
                Field_20787.error("Couldn't select trade", (Throwable)exception);
            }
            return;
        } else if ("MC|AdvCdm".equals(class_28799.Method_28808())) {
            if (!this.Field_20783.Method_2605()) {
                this.Field_20774.\u0000strictfp((Class_1782)new Class_2849("advMode.notEnabled", new Object[-17920 & 197]));
                return;
            } else if (this.Field_20774.\u0000strictfp(-31670 & 6946, "") && this.Field_20774.\u0000strictfp.Method_18094()) {
                Class_29900 class_29900 = class_28799.Method_28806();
                try {
                    Object object;
                    byte by = class_29900.Method_29944();
                    Class_35869 class_35869 = null;
                    if (by == 0) {
                        object = this.Field_20774.\u0000strictfp.Method_429(new Class_4751(class_29900.Method_29914(), class_29900.Method_29914(), class_29900.Method_29914()));
                        if (object instanceof Class_43621) {
                            class_35869 = ((Class_43621)object).Method_43628();
                        }
                    } else if (by == (4759 & 1) && (object = this.Field_20774.\u0000strictfp.Method_343(class_29900.Method_29914())) instanceof Class_21091) {
                        class_35869 = ((Class_21091)object).Method_21103();
                    }
                    object = class_29900.Method_29991(class_29900.Method_30014());
                    boolean bl = class_29900.Method_29962();
                    if (class_35869 == null) return;
                    class_35869.Method_35893((String)object);
                    class_35869.Method_35890(bl);
                    if (!bl) {
                        class_35869.Method_35887(null);
                    }
                    class_35869.Method_35880();
                    Object[] arrobject = new Object[16709 & 10785];
                    arrobject[517 & 40] = object;
                    this.Field_20774.\u0000strictfp((Class_1782)new Class_2849("advMode.setCommand.success", arrobject));
                    return;
                }
                catch (Exception exception) {
                    Field_20787.error("Couldn't set command block", (Throwable)exception);
                    return;
                }
                finally {
                    class_29900.Method_29972();
                }
            } else {
                this.Field_20774.\u0000strictfp((Class_1782)new Class_2849("advMode.notAllowed", new Object[20492 & 2945]));
            }
            return;
        } else if ("MC|Beacon".equals(class_28799.Method_28808())) {
            if (!(this.Field_20774.\u0000, ` instanceof Class_32215)) return;
            try {
                Class_29900 class_29900 = class_28799.Method_28806();
                int n = class_29900.Method_29914();
                int n2 = class_29900.Method_29914();
                Class_32215 class_32215 = (Class_32215)this.Field_20774.\u0000, `;
                Class_26421 class_26421 = class_32215.\u0000strictfp(1024 & -7647);
                if (!class_26421.Method_26439()) return;
                class_26421.Method_26427(10321 & -32221);
                Class_4961 class_4961 = class_32215.Method_32218();
                class_4961.Method_4970(153 & 16643, n);
                class_4961.Method_4970(8259 & 138, n2);
                class_4961.Method_4966();
                return;
            }
            catch (Exception exception) {
                Field_20787.error("Couldn't set beacon", (Throwable)exception);
            }
            return;
        } else {
            if (!"MC|ItemName".equals(class_28799.Method_28808()) || !(this.Field_20774.\u0000, ` instanceof Class_9871)) return;
            Class_9871 class_9871 = (Class_9871)this.Field_20774.\u0000, `;
            if (class_28799.Method_28806() != null && class_28799.Method_28806().Method_30014() >= (18433 & 545)) {
                String string = Class_12053.Method_12055(class_28799.Method_28806().Method_29991(32767 & 32767));
                if (string.length() > (30 & 16479)) return;
                class_9871.Method_9885(string);
                return;
            } else {
                class_9871.Method_9885("");
            }
        }
    }

    public void Method_20800(Class_21137 class_21137) {
        Class_34388.Method_34390(class_21137, this, this.Field_20774.\u0000strictfp());
        if (this.Field_20774.\u0000strictfp.Method_38768()) {
            int n;
            Class_4879 class_4879;
            Object object;
            Class_4751 class_4751;
            Class_1699 class_1699;
            int n2 = class_21137.Method_21140() < 0 ? 2113 & -15735 : 16464 & -28672;
            Class_23823 class_23823 = class_21137.Method_21141();
            if (class_23823 != null && class_23823.Method_23842() && class_23823.Method_23845().Method_1715("BlockEntityTag", 12603 & -13750) && (class_1699 = class_23823.Method_23845().Method_1703("BlockEntityTag")).Method_1707("x") && class_1699.Method_1707("y") && class_1699.Method_1707("z") && (class_4879 = this.Field_20774.\u0000strictfp.Method_429(class_4751 = new Class_4751(class_1699.Method_1738("x"), class_1699.Method_1738("y"), class_1699.Method_1738("z")))) != null) {
                object = new Class_1699();
                class_4879.Method_4929((Class_1699)object);
                ((Class_1699)object).Method_1740("x");
                ((Class_1699)object).Method_1740("y");
                ((Class_1699)object).Method_1740("z");
                class_23823.Method_23879("BlockEntityTag", (Class_1674)object);
            }
            int n3 = class_21137.Method_21140() >= (4865 & 16437) && class_21137.Method_21140() < (636 & 1188) + Class_37781.Method_37807() ? -32765 & 6181 : 20864 & -21943;
            int n4 = class_23823 == null || class_23823.Method_23844() != null ? 4387 & -13819 : 549 & 26;
            int n5 = n = class_23823 == null || class_23823.Method_23843() >= 0 && class_23823.Field_23826 <= (-12216 & 8928) && class_23823.Field_23826 > 0 ? 4113 & 20389 : 4104 & 10450;
            if (n3 != 0 && n4 != 0 && n != 0) {
                if (class_23823 == null) {
                    this.Field_20774.\u0000strictfp.Method_8321(class_21137.Method_21140(), null);
                } else {
                    this.Field_20774.\u0000strictfp.Method_8321(class_21137.Method_21140(), class_23823);
                }
                this.Field_20774.\u0000strictfp.Method_8317((Class_626)this.Field_20774, (8353 & 1041) != 0);
            } else if (n2 != 0 && n4 != 0 && n != 0 && this.Field_20779 < (-32568 & 6873)) {
                this.Field_20779 += 10327 & -27332;
                object = this.Field_20774.\u0000strictfp(class_23823, (12417 & -29631) != 0);
                if (object != null) {
                    ((Class_3443)object).Method_3459();
                }
            }
        }
    }

    public void Method_20801(Class_23026 class_23026) {
        Class_34388.Method_34390(class_23026, this, this.Field_20774.\u0000strictfp());
        this.Field_20774.\u0000= +();
    }

    public void Method_20802(double d, double d2, double d3, float f, float f2) {
        this.Method_20797(d, d2, d3, f, f2, Collections.emptySet());
    }

    public void Method_20803(Class_29005 class_29005) {
        Class_34388.Method_34390(class_29005, this, this.Field_20774.\u0000strictfp());
        if (this.Method_20796(class_29005)) {
            this.Method_20817("Invalid move packet received");
        } else {
            Class_2651 class_2651 = this.Field_20783.Method_2550(this.Field_20774.\u0000= catch);
            this.Field_20790 = -24507 & 3851;
            if (!this.Field_20774.\u0000#) {
                double d = this.Field_20774.\u0000= package;
                double d2 = this.Field_20774.\u0000, for();
                double d3 = this.Field_20774.\u0000= switch;
                double d4 = 0.0;
                double d5 = class_29005.Method_29014() - this.Field_20777;
                double d6 = class_29005.Method_29018() - this.Field_20775;
                double d7 = class_29005.Method_29015() - this.Field_20785;
                if (class_29005.Method_29027()) {
                    d4 = d5 * d5 + d6 * d6 + d7 * d7;
                    if (!this.Field_20789 && d4 < 1.12 * 0.2232142857142857) {
                        this.Field_20789 = 24577 & 6213;
                    }
                }
                if (this.Field_20789) {
                    double d8;
                    double d9;
                    this.Field_20773 = this.Field_20778;
                    if (this.Field_20774.\u0000, ` != null) {
                        float f = this.Field_20774.\u0000= ?;
                        float f2 = this.Field_20774.\u0000= float;
                        this.Field_20774.\u0000, `.Method_1295();
                        double d10 = this.Field_20774.\u0000= package;
                        double d11 = this.Field_20774.\u0000, for();
                        double d12 = this.Field_20774.\u0000= switch;
                        if (class_29005.Method_29017()) {
                            f = class_29005.Method_29023();
                            f2 = class_29005.Method_29020();
                        }
                        this.Field_20774.\u0000, for(class_29005.Method_29016());
                        this.Field_20774.\u0000, #();
                        this.Field_20774.\u0000strictfp(d10, d11, d12, f, f2);
                        if (this.Field_20774.\u0000, ` != null) {
                            this.Field_20774.\u0000, `.Method_1295();
                        }
                        this.Field_20783.Method_2616().Method_3123(this.Field_20774);
                        if (this.Field_20774.\u0000, ` != null) {
                            if (d4 > 32.0 * 0.125) {
                                Class_1061 class_1061 = this.Field_20774.\u0000, `;
                                this.Field_20774.\u0000strictfp.Method_20821(new Class_23151(class_1061));
                                this.Method_20802(this.Field_20774.\u0000= package, this.Field_20774.\u0000, for(), this.Field_20774.\u0000= switch, this.Field_20774.\u0000= ?, this.Field_20774.\u0000= float);
                            }
                            this.Field_20774.\u0000, `.Field_1139 = 4097 & 18433;
                        }
                        if (this.Field_20789) {
                            this.Field_20777 = this.Field_20774.\u0000= package;
                            this.Field_20775 = this.Field_20774.\u0000, for();
                            this.Field_20785 = this.Field_20774.\u0000= switch;
                        }
                        class_2651.\u0000, for((Class_1061)this.Field_20774);
                        return;
                    }
                    if (this.Field_20774.\u0000byte()) {
                        this.Field_20774.\u0000, #();
                        this.Field_20774.\u0000strictfp(this.Field_20777, this.Field_20775, this.Field_20785, this.Field_20774.\u0000= ?, this.Field_20774.\u0000= float);
                        class_2651.\u0000, for((Class_1061)this.Field_20774);
                        return;
                    }
                    double d13 = this.Field_20774.\u0000, for();
                    this.Field_20777 = this.Field_20774.\u0000= package;
                    this.Field_20775 = this.Field_20774.\u0000, for();
                    this.Field_20785 = this.Field_20774.\u0000= switch;
                    double d14 = this.Field_20774.\u0000= package;
                    double d15 = this.Field_20774.\u0000, for();
                    double d16 = this.Field_20774.\u0000= switch;
                    float f = this.Field_20774.\u0000= ?;
                    float f3 = this.Field_20774.\u0000= float;
                    if (class_29005.Method_29027() && class_29005.Method_29018() == -226.57731958762886 * 4.409090909090909) {
                        class_29005.Method_29021((26664 & -28672) != 0);
                    }
                    if (class_29005.Method_29027()) {
                        d14 = class_29005.Method_29014();
                        d15 = class_29005.Method_29018();
                        d16 = class_29005.Method_29015();
                        if (Math.abs(class_29005.Method_29014()) > 0.4090909090909091 * 7.333333333333333E7 || Math.abs(class_29005.Method_29015()) > 1.3636363636363635E7 * 2.2) {
                            this.Method_20817("Illegal position");
                            return;
                        }
                    }
                    if (class_29005.Method_29017()) {
                        f = class_29005.Method_29023();
                        f3 = class_29005.Method_29020();
                    }
                    this.Field_20774.\u0000, #();
                    this.Field_20774.\u0000strictfp(this.Field_20777, this.Field_20775, this.Field_20785, f, f3);
                    if (!this.Field_20789) {
                        return;
                    }
                    double d17 = d14 - this.Field_20774.\u0000= package;
                    double d18 = d15 - this.Field_20774.\u0000, for();
                    double d19 = d17 * d17 + d18 * d18 + (d8 = d16 - this.Field_20774.\u0000= switch) * d8;
                    if (!(!(d19 - (d9 = this.Field_20774.\u0000= ` * this.Field_20774.\u0000= ` + this.Field_20774.\u0000, #() * this.Field_20774.\u0000, #() + this.Field_20774.\u0000switch * this.Field_20774.\u0000switch) > 102.77777777777777 * 0.972972972972973) || this.Field_20783.Method_2538() && this.Field_20783.Method_2629().equals(this.Field_20774.\u0000, `()))) {
                        Field_20787.warn(this.Field_20774.\u0000, `() + " moved too quickly! " + d17 + "," + d18 + "," + d8 + " (" + d17 + ", " + d18 + ", " + d8 + ")");
                        this.Method_20802(this.Field_20777, this.Field_20775, this.Field_20785, this.Field_20774.\u0000= ?, this.Field_20774.\u0000= float);
                        return;
                    }
                    float f4 = 0.092307694f * 0.6770833f;
                    boolean bl = class_2651.\u0000strictfp((Class_1061)this.Field_20774, this.Field_20774.\u0000, `().Method_11012(f4, f4, f4)).isEmpty();
                    if (this.Field_20774.\u0000super() && !class_29005.Method_29016() && d18 > 0.0) {
                        this.Field_20774.\u0000= #();
                    }
                    this.Field_20774.\u0000strictfp(d17, d18, d8);
                    this.Field_20774.\u0000, for(class_29005.Method_29016());
                    d17 = d14 - this.Field_20774.\u0000= package;
                    d18 = d15 - this.Field_20774.\u0000, for();
                    if (d18 > 1.5833333333333333 * -0.31578947368421056 || d18 < 0.24 * 2.0833333333333335) {
                        d18 = 0.0;
                    }
                    d8 = d16 - this.Field_20774.\u0000= switch;
                    d19 = d17 * d17 + d18 * d18 + d8 * d8;
                    int n = 6882 & -31740;
                    if (d19 > 0.03225806451612903 * 1.9375 && !this.Field_20774.\u0000byte() && !this.Field_20774.\u0000strictfp.Method_38768()) {
                        n = 273 & 9733;
                        Field_20787.warn(this.Field_20774.\u0000, `() + " moved wrongly!");
                    }
                    this.Field_20774.\u0000strictfp(d14, d15, d16, f, f3);
                    this.Field_20774.\u0000, for(this.Field_20774.\u0000= package - d, this.Field_20774.\u0000, for() - d2, this.Field_20774.\u0000= switch - d3);
                    if (!this.Field_20774.\u0000switch) {
                        boolean bl2 = class_2651.\u0000strictfp((Class_1061)this.Field_20774, this.Field_20774.\u0000, `().Method_11012(f4, f4, f4)).isEmpty();
                        if (!(!bl || n == 0 && bl2 || this.Field_20774.\u0000byte())) {
                            this.Method_20802(this.Field_20777, this.Field_20775, this.Field_20785, f, f3);
                            return;
                        }
                    }
                    Class_10997 class_10997 = this.Field_20774.\u0000, `().Method_11017(f4, f4, f4).Method_11005(0.0, -4.2625 * 0.12903225806451613, 0.0);
                    if (!(this.Field_20783.Method_2573() || this.Field_20774.\u0000strictfp.Method_18095() || class_2651.\u0000
                    (class_10997))) {
                        if (d18 >= 0.6021505376344086 * -0.051897321428571425) {
                            this.Field_20782 += -20351 & 2409;
                            if (this.Field_20782 > (80 & 1617)) {
                                Field_20787.warn(this.Field_20774.\u0000, `() + " was kicked for floating too long!");
                                this.Method_20817("Flying is not enabled on this server");
                                return;
                            }
                        }
                    } else {
                        this.Field_20782 = 704 & -15076;
                    }
                    this.Field_20774.\u0000, for(class_29005.Method_29016());
                    this.Field_20783.Method_2616().Method_3123(this.Field_20774);
                    this.Field_20774.\u0000strictfp(this.Field_20774.\u0000, for() - d13, class_29005.Method_29016());
                } else if (this.Field_20778 - this.Field_20773 > (-10892 & 2581)) {
                    this.Method_20802(this.Field_20777, this.Field_20775, this.Field_20785, this.Field_20774.\u0000= ?, this.Field_20774.\u0000= float);
                }
            }
        }
    }

    public void Method_20804(Class_38076 class_38076) {
        Class_34388.Method_34390(class_38076, this, this.Field_20774.\u0000strictfp());
        if (this.Field_20774.\u0000strictfp() == Class_34249.Field_34256) {
            Class_2849 class_2849 = new Class_2849("chat.cannotSend", new Object[12368 & -29311]);
            class_2849.\u0000strictfp().Method_2917(Class_5478.Field_5505);
            this.Method_20821(new Class_22168(class_2849));
        } else {
            this.Field_20774.\u0000, 2();
            String string = class_38076.Method_38081();
            string = StringUtils.normalizeSpace((String)string);
            for (int i = 13441 & 14; i < string.length(); ++i) {
                if (Class_12053.Method_12057(string.charAt(i))) continue;
                this.Method_20817("Illegal characters in chat");
                return;
            }
            if (string.startsWith("/")) {
                this.Method_20792(string);
            } else {
                Object[] arrobject = new Object[24578 & 4670];
                arrobject[-24555 & 1120] = this.Field_20774.\u0000strictfp();
                arrobject[-31709 & 10645] = string;
                Class_2849 class_2849 = new Class_2849("chat.type.text", arrobject);
                this.Field_20783.Method_2616().Method_3094(class_2849, (2096 & 1160) != 0);
            }
            this.Field_20786 += 19540 & 12565;
            if (this.Field_20786 > (8653 & 2794) && !this.Field_20783.Method_2616().Method_3116(this.Field_20774.\u0000strictfp())) {
                this.Method_20817("disconnect.spam");
            }
        }
    }

    public void Method_20805(Class_29048 class_29048) {
        Class_34388.Method_34390(class_29048, this, this.Field_20774.\u0000strictfp());
        Short s = (Short)this.Field_20780.Method_29447(this.Field_20774.\u0000, `.Field_8298);
        if (s != null && class_29048.Method_29055() == s.shortValue() && this.Field_20774.\u0000, `.Field_8298 == class_29048.Method_29056() && !this.Field_20774.\u0000, `.Method_8330((Class_626)this.Field_20774) && !this.Field_20774.\u0000c_()) {
            this.Field_20774.\u0000, `.Method_8317((Class_626)this.Field_20774, (12577 & -28987) != 0);
        }
    }

    public void Method_20806(Class_25900 class_25900) {
        Class_34388.Method_34390(class_25900, this, this.Field_20774.\u0000strictfp());
        this.Field_20774.\u0000, 2();
        Class_8752 class_8752 = class_25900.Method_25907();
        switch (Class_13456.Field_13459[class_8752.ordinal()]) {
            case 1: {
                if (this.Field_20774.\u0000#) {
                    this.Field_20774 = this.Field_20783.Method_2616().Method_3138(this.Field_20774, -9948 & 1089, (12359 & 1169) != 0);
                    break;
                }
                if (this.Field_20774.\u0000strictfp().\u0000strictfp().Method_31839()) {
                    if (this.Field_20783.Method_2538() && this.Field_20774.\u0000, `().equals(this.Field_20783.Method_2629())) {
                        this.Field_20774.\u0000strictfp.Method_20817("You have died. Game over, man, it's game over!");
                        this.Field_20783.Method_2623();
                        break;
                    }
                    Class_14573 class_14573 = new Class_14573(this.Field_20774.\u0000strictfp(), null, "(You just lost the game)", null, "Death in Hardcore");
                    this.Field_20783.Method_2616().Method_3133().\u0000strictfp((Class_9848)class_14573);
                    this.Field_20774.\u0000strictfp.Method_20817("You have died. Game over, man, it's game over!");
                    break;
                }
                if (this.Field_20774.\u0000abstract() > 0.0f) {
                    return;
                }
                this.Field_20774 = this.Field_20783.Method_2616().Method_3138(this.Field_20774, 818 & 0, (10244 & 1585) != 0);
                break;
            }
            case 2: {
                this.Field_20774.\u0000strictfp().Method_36684(this.Field_20774);
                break;
            }
            case 3: {
                this.Field_20774.\u0000strictfp((Class_13017)Class_21905.Field_21936);
            }
        }
    }

    public void Method_20807(Class_33384 class_33384) {
        Class_34388.Method_34390(class_33384, this, this.Field_20774.\u0000strictfp());
        this.Field_20774.\u0000strictfp(class_33384.Method_33393(), class_33384.Method_33390(), class_33384.Method_33397(), class_33384.Method_33392());
    }

    public void Method_20808(Class_32249 class_32249) {
        Class_34388.Method_34390(class_32249, this, this.Field_20774.\u0000strictfp());
        if (this.Field_20774.\u0000c_()) {
            Class_2651 class_2651;
            Class_1061 class_1061 = null;
            Object object = this.Field_20783.Field_2463;
            int n = ((Class_2651[])object).length;
            for (int i = 2113 & -32624; i < n && ((class_2651 = object[i]) == null || (class_1061 = class_32249.Method_32255(class_2651)) == null); ++i) {
            }
            if (class_1061 != null) {
                this.Field_20774.\u0000switch((Class_1061)this.Field_20774);
                this.Field_20774.\u0000strictfp((Class_1061)null);
                if (class_1061.Field_1089 != this.Field_20774.\u0000strictfp) {
                    object = this.Field_20774.\u0000strictfp();
                    Class_2651 class_26512 = (Class_2651)class_1061.Field_1089;
                    this.Field_20774.\u0000= catch = class_1061.Field_1132;
                    this.Method_20821(new Class_25724(this.Field_20774.\u0000= catch, object.\u0000strictfp(), object.\u0000strictfp().Method_31833(), this.Field_20774.\u0000strictfp.Method_38767()));
                    object.\u0000%((Class_1061)this.Field_20774);
                    this.Field_20774.\u0000= float = 35 & 4240;
                    this.Field_20774.\u0000, `(class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106, class_1061.Field_1079, class_1061.Field_1093);
                    if (this.Field_20774.\u0000volatile()) {
                        ((Class_2651)object).Method_2680((Class_1061)this.Field_20774, (-32685 & 512) != 0);
                        class_26512.\u0000strictfp((Class_1061)this.Field_20774);
                        class_26512.Method_2680((Class_1061)this.Field_20774, (-24400 & 3080) != 0);
                    }
                    this.Field_20774.\u0000strictfp((Class_283)class_26512);
                    this.Field_20783.Method_2616().Method_3122(this.Field_20774, (Class_2651)object);
                    this.Field_20774.\u0000, `(class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106);
                    this.Field_20774.\u0000strictfp.Method_38775(class_26512);
                    this.Field_20783.Method_2616().Method_3136(this.Field_20774, class_26512);
                    this.Field_20783.Method_2616().Method_3153(this.Field_20774);
                } else {
                    this.Field_20774.\u0000, `(class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106);
                }
            }
        }
    }

    public void Method_20809(Class_26297 class_26297) {
        Class_34388.Method_34390(class_26297, this, this.Field_20774.\u0000strictfp());
        this.Field_20774.\u0000, 2();
        if (this.Field_20774.\u0000, `.Field_8298 == class_26297.Method_26303() && this.Field_20774.\u0000, `.Method_8330((Class_626)this.Field_20774) && !this.Field_20774.\u0000c_()) {
            this.Field_20774.\u0000, `.Method_8328((Class_626)this.Field_20774, class_26297.Method_26306());
            this.Field_20774.\u0000, `.Method_8322();
        }
    }

    private long Method_20810() {
        return System.nanoTime() / (7288059574370655168L & -7288059575707679135L);
    }

    public void Method_20811(Class_41193 class_41193) {
        Object object;
        Class_34388.Method_34390(class_41193, this, this.Field_20774.\u0000strictfp());
        Class_2651 class_2651 = this.Field_20783.Method_2550(this.Field_20774.\u0000= catch);
        Class_23823 class_23823 = this.Field_20774.\u0000strictfp.Method_37821();
        int n = 586 & -29391;
        Class_4751 class_4751 = class_41193.Method_41205();
        Class_4595 class_4595 = Class_4595.Method_4637(class_41193.Method_41202());
        this.Field_20774.\u0000, 2();
        if (class_41193.Method_41202() == (12031 & -16129)) {
            if (class_23823 == null) {
                return;
            }
            this.Field_20774.\u0000strictfp.Method_38772((Class_626)this.Field_20774, class_2651, class_23823);
        } else if (class_4751.\u0000, `() < this.Field_20783.Method_2617() - (16549 & 513) || class_4595 != Class_4595.Field_4601 && class_4751.\u0000, `() < this.Field_20783.Method_2617()) {
            if (this.Field_20789 && this.Field_20774.\u0000strictfp((double)class_4751.\u0000= final() + 0.7021276595744681 * 0.7121212121212122, (double)class_4751.\u0000, `() + 0.5113636363636364 * 0.9777777777777777, (double)class_4751.\u0000strictfp() + 0.16129032258064516 * 3.1) < 1088.0 * 0.058823529411764705 && !this.Field_20783.Method_2636(class_2651, class_4751, (Class_626)this.Field_20774) && class_2651.\u0000strictfp().Method_31498(class_4751)) {
                this.Field_20774.\u0000strictfp.Method_38764((Class_626)this.Field_20774, class_2651, class_23823, class_4751, class_4595, class_41193.Method_41208(), class_41193.Method_41206(), class_41193.Method_41211());
            }
            n = 6161 & 8623;
        } else {
            Object[] arrobject = new Object[8231 & 1105];
            arrobject[6720 & -8143] = this.Field_20783.Method_2617();
            object = new Class_2849("build.tooHigh", arrobject);
            object.\u0000strictfp().Method_2917(Class_5478.Field_5505);
            this.Field_20774.\u0000strictfp.Method_20821(new Class_22168((Class_1782)object));
            n = -28555 & 3;
        }
        if (n != 0) {
            this.Field_20774.\u0000strictfp.Method_20821(new Class_26313(class_2651, class_4751));
            this.Field_20774.\u0000strictfp.Method_20821(new Class_26313(class_2651, class_4751.Method_4765(class_4595)));
        }
        if ((class_23823 = this.Field_20774.\u0000strictfp.Method_37821()) != null && class_23823.Field_23826 == 0) {
            this.Field_20774.\u0000strictfp.Field_37784[this.Field_20774.\u0000strictfp.Field_37782] = null;
            class_23823 = null;
        }
        if (class_23823 == null || class_23823.Method_23861() == 0) {
            this.Field_20774.\u0000= static = 97 & 7199;
            this.Field_20774.\u0000strictfp.Field_37784[this.Field_20774.\u0000strictfp.Field_37782] = Class_23823.Method_23855(this.Field_20774.\u0000strictfp.Field_37784[this.Field_20774.\u0000strictfp.Field_37782]);
            object = this.Field_20774.\u0000, `.Method_8334(this.Field_20774.\u0000strictfp, this.Field_20774.\u0000strictfp.Field_37782);
            this.Field_20774.\u0000, `.Method_8322();
            this.Field_20774.\u0000= static = 384 & 16401;
            if (!Class_23823.Method_23880(this.Field_20774.\u0000strictfp.Method_37821(), class_41193.Method_41203())) {
                this.Method_20821(new Class_35914(this.Field_20774.\u0000, `.Field_8298, ((Class_26421)object).Field_26423, this.Field_20774.\u0000strictfp.Method_37821()));
            }
        }
    }

    public void Method_20812(Class_34764 class_34764) {
    }

    public void Method_20813(Class_33066 class_33066) {
        Class_34388.Method_34390(class_33066, this, this.Field_20774.\u0000strictfp());
        this.Field_20774.\u0000, 2();
        switch (Class_13456.Field_13457[class_33066.Method_33073().ordinal()]) {
            case 1: {
                this.Field_20774.\u0000%((-21491 & 16515) != 0);
                break;
            }
            case 2: {
                this.Field_20774.\u0000%((603 & 4224) != 0);
                break;
            }
            case 3: {
                this.Field_20774.\u0000strictfp((-12287 & 3461) != 0);
                break;
            }
            case 4: {
                this.Field_20774.\u0000strictfp((11008 & -12147) != 0);
                break;
            }
            case 5: {
                this.Field_20774.\u0000strictfp((1058 & 2640) != 0, (4337 & 1541) != 0, (-28663 & 9363) != 0);
                this.Field_20789 = 24 & 609;
                break;
            }
            case 6: {
                if (!(this.Field_20774.\u0000, ` instanceof Class_46199)) break;
                ((Class_46199)this.Field_20774.\u0000, `).Method_46369(class_33066.Method_33074());
                break;
            }
            case 7: {
                if (!(this.Field_20774.\u0000, ` instanceof Class_46199)) break;
                ((Class_46199)this.Field_20774.\u0000, `).Method_46331((Class_626)this.Field_20774);
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid client command!");
            }
        }
    }

    public void Method_20814(Class_26970 class_26970) {
        Class_34388.Method_34390(class_26970, this, this.Field_20774.\u0000strictfp());
        if (class_26970.Method_26977() >= 0 && class_26970.Method_26977() < Class_37781.Method_37807()) {
            this.Field_20774.\u0000strictfp.Field_37782 = class_26970.Method_26977();
            this.Field_20774.\u0000, 2();
        } else {
            Field_20787.warn(this.Field_20774.\u0000, `() + " tried to set an invalid carried item");
        }
    }

    public void Method_20815() {
        this.Field_20790 = -28048 & 2056;
        this.Field_20778 += -32715 & 9473;
        this.Field_20783.Field_2500.Method_2789("keepAlive");
        if ((long)this.Field_20778 - this.Field_20784 > (4117791500526428345L & -4117791501570598868L)) {
            this.Field_20784 = this.Field_20778;
            this.Field_20776 = this.Method_20810();
            this.Field_20788 = (int)this.Field_20776;
            this.Method_20821(new Class_33020(this.Field_20788));
        }
        this.Field_20783.Field_2500.Method_2790();
        if (this.Field_20786 > 0) {
            this.Field_20786 -= 24101 & -32575;
        }
        if (this.Field_20779 > 0) {
            this.Field_20779 -= -21775 & 16389;
        }
        if (this.Field_20774.\u0000strictfp() > (580124681L & 274891636L) && this.Field_20783.Method_2568() > 0 && Class_2457.Method_2513() - this.Field_20774.\u0000strictfp() > (long)(this.Field_20783.Method_2568() * (9192 & -31764) * (16638 & -21188))) {
            this.Method_20817("You have been idle for too long!");
        }
    }

    private void Method_20816() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_20817(String string) {
        Class_2840 class_2840 = new Class_2840(string);
        this.Field_20781.Method_44606(new Class_26444(class_2840), new Class_18595(this, class_2840), new Class_18600[2066 & 5]);
        this.Field_20781.Method_44623();
        Futures.getUnchecked((Future)this.Field_20783.Method_2526(new Class_27095(this)));
    }

    public void Method_20818(Class_30787 class_30787) {
        Class_34388.Method_34390(class_30787, this, this.Field_20774.\u0000strictfp());
        this.Field_20774.\u0000, 2();
        this.Field_20774.\u0000, for();
    }

    public void Method_20819(Class_28523 class_28523) {
        Class_34388.Method_34390(class_28523, this, this.Field_20774.\u0000strictfp());
        this.Field_20774.\u0000strictfp(class_28523);
    }

    public void Method_20820(Class_23186 class_23186) {
        Class_34388.Method_34390(class_23186, this, this.Field_20774.\u0000strictfp());
        this.Field_20774.\u0000strictfp.Method_18102((class_23186.Method_23195() && this.Field_20774.\u0000strictfp.Method_18095() ? 4369 & 1601 : 4240 & 19242) != 0);
    }

    public void Method_20821(Class_1486 class_1486) {
        Object object;
        if (class_1486 instanceof Class_22168) {
            Class_22168 class_22168 = (Class_22168)class_1486;
            object = this.Field_20774.\u0000strictfp();
            if (object == Class_34249.Field_34256) {
                return;
            }
            if (object == Class_34249.Field_34253 && !class_22168.Method_22179()) {
                return;
            }
        }
        try {
            this.Field_20781.Method_44629(class_1486);
        }
        catch (Throwable throwable) {
            object = Class_13268.Method_13285(throwable, "Sending packet");
            Class_13220 class_13220 = ((Class_13268)object).Method_13280("Packet being sent");
            class_13220.Method_13232("Packet class", new Class_17994(this, class_1486));
            throw new Class_1809((Class_13268)object);
        }
    }

    public void Method_20822(Class_27010 class_27010) {
        Class_34388.Method_34390(class_27010, this, this.Field_20774.\u0000strictfp());
        Class_2651 class_2651 = this.Field_20783.Method_2550(this.Field_20774.\u0000= catch);
        Class_1061 class_1061 = class_27010.Method_27020(class_2651);
        this.Field_20774.\u0000, 2();
        if (class_1061 != null) {
            boolean bl = this.Field_20774.\u0000= final(class_1061);
            double d = 4.833333333333333 * 7.448275862068966;
            if (!bl) {
                d = 15.352941176470589 * 0.5862068965517241;
            }
            if (this.Field_20774.\u0000strictfp(class_1061) < d) {
                if (class_27010.Method_27018() == Class_19177.Field_19179) {
                    this.Field_20774.\u0000%(class_1061);
                } else if (class_27010.Method_27018() == Class_19177.Field_19181) {
                    class_1061.Method_1221((Class_626)this.Field_20774, class_27010.Method_27022());
                } else if (class_27010.Method_27018() == Class_19177.Field_19180) {
                    if (class_1061 instanceof Class_3443 || class_1061 instanceof Class_3481 || class_1061 instanceof Class_41498 || class_1061 == this.Field_20774) {
                        this.Method_20817("Attempting to attack an invalid entity");
                        this.Field_20783.Method_2589("Player " + this.Field_20774.\u0000, `() + " tried to attack an invalid entity");
                        return;
                    }
                    this.Field_20774.\u0000= `(class_1061);
                }
            }
        }
    }

    public void Method_20823(Class_33266 class_33266) {
        Class_34388.Method_34390(class_33266, this, this.Field_20774.\u0000strictfp());
        this.Field_20774.\u0000, 2();
        if (this.Field_20774.\u0000, `.Field_8298 == class_33266.Method_33282() && this.Field_20774.\u0000, `.Method_8330((Class_626)this.Field_20774)) {
            if (this.Field_20774.\u0000c_()) {
                ArrayList arrayList = Lists.newArrayList();
                for (int i = -32762 & 8; i < this.Field_20774.\u0000, `.Field_8299.size(); ++i) {
                    arrayList.add(((Class_26421)this.Field_20774.\u0000, `.Field_8299.get(i)).Method_26430());
                }
                this.Field_20774.\u0000strictfp(this.Field_20774.\u0000, `, (List)arrayList);
            } else {
                Class_23823 class_23823 = this.Field_20774.\u0000, `.Method_8308(class_33266.Method_33281(), class_33266.Method_33276(), class_33266.Method_33274(), (Class_626)this.Field_20774);
                if (Class_23823.Method_23880(class_33266.Method_33275(), class_23823)) {
                    this.Field_20774.\u0000strictfp.Method_20821(new Class_24570(class_33266.Method_33282(), class_33266.Method_33277(), (37 & -31663) != 0));
                    this.Field_20774.\u0000= static = 1157 & 21065;
                    this.Field_20774.\u0000, `.Method_8322();
                    this.Field_20774.\u0000= import();
                    this.Field_20774.\u0000= static = 17024 & -30458;
                } else {
                    this.Field_20780.Method_29453(this.Field_20774.\u0000, `.Field_8298, class_33266.Method_33277());
                    this.Field_20774.\u0000strictfp.Method_20821(new Class_24570(class_33266.Method_33282(), class_33266.Method_33277(), (-25533 & 12) != 0));
                    this.Field_20774.\u0000, `.Method_8317((Class_626)this.Field_20774, (144 & -13792) != 0);
                    ArrayList arrayList = Lists.newArrayList();
                    for (int i = 8212 & 1664; i < this.Field_20774.\u0000, `.Field_8299.size(); ++i) {
                        arrayList.add(((Class_26421)this.Field_20774.\u0000, `.Field_8299.get(i)).Method_26430());
                    }
                    this.Field_20774.\u0000strictfp(this.Field_20774.\u0000, `, (List)arrayList);
                }
            }
        }
    }

    public void Method_20824(Class_33586 class_33586) {
        Class_34388.Method_34390(class_33586, this, this.Field_20774.\u0000strictfp());
        this.Field_20774.\u0000, 2();
        Class_2651 class_2651 = this.Field_20783.Method_2550(this.Field_20774.\u0000= catch);
        Class_4751 class_4751 = class_33586.Method_33589();
        if (class_2651.\u0000
        (class_4751)) {
            Class_4879 class_4879 = class_2651.\u0000strictfp(class_4751);
            if (!(class_4879 instanceof Class_33614)) {
                return;
            }
            Class_33614 class_33614 = (Class_33614)class_4879;
            if (!class_33614.Method_33623() || class_33614.Method_33628() != this.Field_20774) {
                this.Field_20783.Method_2589("Player " + this.Field_20774.\u0000, `() + " just tried to change non-editable sign");
                return;
            }
            Class_1782[] arrclass_1782 = class_33586.Method_33591();
            for (int i = 547 & 13312; i < arrclass_1782.length; ++i) {
                class_33614.Field_33615[i] = new Class_2840(Class_5478.Method_5555(arrclass_1782[i].Method_1788()));
                class_33614.Method_33631();
            }
            class_33614.\u0000, for();
            class_2651.\u0000
            (class_4751);
        }
    }
}

