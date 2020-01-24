/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_28810
extends Class_1490
implements Class_1549 {
    private final DateFormat Field_28811 = new SimpleDateFormat();
    private String Field_28812;
    private List Field_28813;
    private boolean Field_28814;
    private static final Logger Field_28815 = LogManager.getLogger();
    private String[] Field_28816 = new String[13005 & -29692];
    private String Field_28817;
    protected String Field_28818 = "Select world";
    private Class_8472 Field_28819;
    private Class_42376 Field_28820;
    private Class_42376 Field_28821;
    protected Class_1490 Field_28822;
    private boolean Field_28823;
    private int Field_28824;
    private Class_42376 Field_28825;
    private Class_42376 Field_28826;

    static Class_42376 Method_28827(Class_28810 class_28810) {
        return class_28810.Field_28820;
    }

    static DateFormat Method_28828(Class_28810 class_28810) {
        return class_28810.Field_28811;
    }

    static int Method_28829(Class_28810 class_28810) {
        return class_28810.Field_28824;
    }

    public void Method_28830() {
        this.Field_28818 = Class_9802.Method_9806("selectWorld.title", new Object[26883 & 144]);
        try {
            this.Method_28847();
        }
        catch (Class_15514 class_15514) {
            Field_28815.error("Couldn't load level list", (Throwable)class_15514);
            this.\u0000strictfp.Method_218(new Class_40941("Unable to load worlds", class_15514.getMessage()));
            return;
        }
        this.Field_28812 = Class_9802.Method_9806("selectWorld.world", new Object[-28480 & 28430]);
        this.Field_28817 = Class_9802.Method_9806("selectWorld.conversion", new Object[262 & 5185]);
        this.Field_28816[Class_35650.Field_35653.Method_35660()] = Class_9802.Method_9806("gameMode.survival", new Object[25096 & -32638]);
        this.Field_28816[Class_35650.Field_35657.Method_35660()] = Class_9802.Method_9806("gameMode.creative", new Object[-26604 & 1385]);
        this.Field_28816[Class_35650.Field_35651.Method_35660()] = Class_9802.Method_9806("gameMode.adventure", new Object[17408 & 8716]);
        this.Field_28816[Class_35650.Field_35654.Method_35660()] = Class_9802.Method_9806("gameMode.spectator", new Object[8852 & -14039]);
        this.Field_28819 = new Class_8472(this, this.\u0000strictfp);
        this.Field_28819.\u0000strictfp(8356 & 20501, 423 & 26693);
        this.Method_28832();
    }

    protected String Method_28831(int n) {
        return ((Class_40879)this.Field_28813.get(n)).Method_40893();
    }

    public void Method_28832() {
        this.Field_28820 = new Class_42376(21649 & 515, this.\u0000= final / (6162 & 130) - (29594 & 1210), this.\u0000, ` - (2229 & 29046), 4246 & 694, 26645 & 60, Class_9802.Method_9806("selectWorld.select", new Object[8192 & 3298]));
        this.\u0000strictfp.add(this.Field_28820);
        this.\u0000strictfp.add(new Class_42376(9283 & -32717, this.\u0000= final / (4123 & -32190) + (5718 & 25004), this.\u0000, ` - (1469 & -28108), -12074 & 3222, 605 & 11444, Class_9802.Method_9806("selectWorld.create", new Object[19505 & 4234])));
        this.Field_28826 = new Class_42376(2311 & -16362, this.\u0000= final / (9003 & 22) - (17306 & -22341), this.\u0000, ` - (604 & 2076), 16729 & 4168, 5460 & 10910, Class_9802.Method_9806("selectWorld.rename", new Object[16384 & 6440]));
        this.\u0000strictfp.add(this.Field_28826);
        this.Field_28821 = new Class_42376(8243 & 5770, this.\u0000= final / (8250 & 198) - (2765 & 9308), this.\u0000, ` - (16540 & -28354), -24502 & 1225, 17052 & 20, Class_9802.Method_9806("selectWorld.delete", new Object[9530 & -32764]));
        this.\u0000strictfp.add(this.Field_28821);
        this.Field_28825 = new Class_42376(607 & -26585, this.\u0000= final / (-15829 & 2050) + (-32467 & 4678), this.\u0000, ` - (-29476 & 16447), 1532 & 4680, 8668 & -27628, Class_9802.Method_9806("selectWorld.recreate", new Object[18438 & -32240]));
        this.\u0000strictfp.add(this.Field_28825);
        this.\u0000strictfp.add(new Class_42376(1029 & -32152, this.\u0000= final / (291 & 27662) + (25938 & 82), this.\u0000, ` - (29244 & 1438), -24498 & 3784, -28513 & 18196, Class_9802.Method_9806("gui.cancel", new Object[13568 & 2662])));
        this.Field_28820.Field_42388 = 2697 & 1024;
        this.Field_28821.Field_42388 = 1088 & 31504;
        this.Field_28826.Field_42388 = 2309 & 88;
        this.Field_28825.Field_42388 = 25240 & -31644;
    }

    public void Method_28833(int n) {
        this.\u0000strictfp.Method_218(null);
        if (!this.Field_28823) {
            String string;
            this.Field_28823 = -28669 & 16425;
            String string2 = this.Method_28831(n);
            if (string2 == null) {
                string2 = "World" + n;
            }
            if ((string = this.Method_28845(n)) == null) {
                string = "World" + n;
            }
            if (this.\u0000strictfp.Method_172().Method_2052(string2)) {
                this.\u0000strictfp.Method_186(string2, string, null);
            }
        }
    }

    static String[] Method_28834(Class_28810 class_28810) {
        return class_28810.Field_28816;
    }

    public Class_28810(Class_1490 class_1490) {
        this.Field_28822 = class_1490;
    }

    static Class_42376 Method_28835(Class_28810 class_28810) {
        return class_28810.Field_28826;
    }

    public static Class_1792 Method_28836(Class_1549 class_1549, String string, int n) {
        String string2 = Class_9802.Method_9806("selectWorld.deleteQuestion", new Object[-7165 & 4612]);
        String string3 = "'" + string + "' " + Class_9802.Method_9806("selectWorld.deleteWarning", new Object[-27328 & 19]);
        String string4 = Class_9802.Method_9806("selectWorld.deleteButton", new Object[-24447 & 2]);
        String string5 = Class_9802.Method_9806("gui.cancel", new Object[-23214 & 18957]);
        Class_1792 class_1792 = new Class_1792(class_1549, string2, string3, string4, string5, n);
        return class_1792;
    }

    protected void Method_28837(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == (195 & 8202)) {
                String string = this.Method_28845(this.Field_28824);
                if (string != null) {
                    this.Field_28814 = 16769 & 12803;
                    Class_1792 class_1792 = Class_28810.Method_28836(this, string, this.Field_28824);
                    this.\u0000strictfp.Method_218(class_1792);
                }
            } else if (class_42376.Field_42392 == (-32719 & 6275)) {
                this.Method_28833(this.Field_28824);
            } else if (class_42376.Field_42392 == (17411 & -24533)) {
                this.\u0000strictfp.Method_218(new Class_38966(this));
            } else if (class_42376.Field_42392 == (-11738 & 86)) {
                this.\u0000strictfp.Method_218(new Class_35710(this, this.Method_28831(this.Field_28824)));
            } else if (class_42376.Field_42392 == 0) {
                this.\u0000strictfp.Method_218(this.Field_28822);
            } else if (class_42376.Field_42392 == (-22913 & 18695)) {
                Class_38966 class_38966 = new Class_38966(this);
                Class_26655 class_26655 = this.\u0000strictfp.Method_172().Method_2048(this.Method_28831(this.Field_28824), (18948 & -32496) != 0);
                Class_31717 class_31717 = class_26655.Method_26657();
                class_26655.Method_26656();
                class_38966.Method_38997(class_31717);
                this.\u0000strictfp.Method_218(class_38966);
            } else {
                this.Field_28819.\u0000strictfp(class_42376);
            }
        }
    }

    static int Method_28838(Class_28810 class_28810, int n) {
        class_28810.Field_28824 = n;
        return class_28810.Field_28824;
    }

    public void Method_28839(int n, int n2, float f) {
        this.Field_28819.\u0000strictfp(n, n2, f);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_28818, this.\u0000= final / (-30846 & 2058), -30180 & 340, 687865855 & 1090519039);
        super.Method_1545(n, n2, f);
    }

    private void Method_28840() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_28841() {
        super.Method_1544();
        this.Field_28819.\u0000, for();
    }

    static List Method_28842(Class_28810 class_28810) {
        return class_28810.Field_28813;
    }

    public void Method_28843(boolean bl, int n) {
        if (this.Field_28814) {
            this.Field_28814 = -14719 & 4168;
            if (bl) {
                Class_2047 class_2047 = this.\u0000strictfp.Method_172();
                class_2047.Method_2053();
                class_2047.Method_2055(this.Method_28831(n));
                try {
                    this.Method_28847();
                }
                catch (Class_15514 class_15514) {
                    Field_28815.error("Couldn't load level list", (Throwable)class_15514);
                }
            }
            this.\u0000strictfp.Method_218(this);
        }
    }

    static Class_42376 Method_28844(Class_28810 class_28810) {
        return class_28810.Field_28825;
    }

    protected String Method_28845(int n) {
        String string = ((Class_40879)this.Field_28813.get(n)).Method_40889();
        if (StringUtils.isEmpty((CharSequence)string)) {
            string = Class_9802.Method_9806("selectWorld.world", new Object[-32495 & 8716]) + " " + (n + (-30449 & 21569));
        }
        return string;
    }

    static String Method_28846(Class_28810 class_28810) {
        return class_28810.Field_28817;
    }

    private void Method_28847() {
        Class_2047 class_2047 = this.\u0000strictfp.Method_172();
        this.Field_28813 = class_2047.Method_2049();
        Collections.sort(this.Field_28813);
        this.Field_28824 = -1 & -1;
    }

    static Class_42376 Method_28848(Class_28810 class_28810) {
        return class_28810.Field_28821;
    }

    static String Method_28849(Class_28810 class_28810) {
        return class_28810.Field_28812;
    }
}

