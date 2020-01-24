/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;

public abstract class Class_35728
extends Class_33077 {
    protected boolean Field_35729;
    private int Field_35730;
    private int Field_35731;
    private boolean Field_35732;
    private int Field_35733;
    protected final Class_41853 Field_35734;

    public boolean Method_35735() {
        Class_859 class_859 = this.Field_35734.\u0000strictfp();
        if (class_859 == null) {
            return (7564 & -24064) != 0;
        }
        if (!class_859.Method_1033()) {
            return (185 & -16320) != 0;
        }
        Class_9665 class_9665 = this.Field_35734.\u0000strictfp();
        Class_9665 class_96652 = class_859.Method_949();
        if (class_9665 != null && class_96652 == class_9665) {
            return (136 & 8822) != 0;
        }
        double d = this.Method_35739();
        if (this.Field_35734.\u0000strictfp((Class_1061)class_859) > d * d) {
            return (-31552 & 546) != 0;
        }
        if (this.Field_35729) {
            if (this.Field_35734.\u0000strictfp().Method_27491(class_859)) {
                this.Field_35730 = 4678 & 10368;
            } else if ((this.Field_35730 += 9299 & -32639) > (13948 & 444)) {
                return (2198 & 4616) != 0;
            }
        }
        return (!(class_859 instanceof Class_626) || !((Class_626)class_859).Field_694.Field_18085 ? 55 & 4353 : 1035 & -7552) != 0;
    }

    protected boolean Method_35736(Class_859 class_859, boolean bl) {
        if (!Class_35728.Method_35742(this.Field_35734, class_859, bl, this.Field_35729)) {
            return (33 & -26544) != 0;
        }
        if (!this.Field_35734.Method_41865(new Class_4751(class_859))) {
            return (9472 & 96) != 0;
        }
        if (this.Field_35732) {
            if ((this.Field_35731 -= 10263 & 225) <= 0) {
                this.Field_35733 = 17666 & 8229;
            }
            if (this.Field_35733 == 0) {
                int n = this.Field_35733 = this.Method_35737(class_859) ? 1729 & -32469 : 12802 & 302;
            }
            if (this.Field_35733 == (16458 & -30206)) {
                return (1312 & 8193) != 0;
            }
        }
        return (3105 & 16473) != 0;
    }

    private boolean Method_35737(Class_859 class_859) {
        int n;
        this.Field_35731 = (74 & 21774) + this.Field_35734.\u0000strictfp().nextInt(24597 & -32763);
        Class_15832 class_15832 = this.Field_35734.\u0000strictfp().Method_7629(class_859);
        if (class_15832 == null) {
            return (17409 & -24396) != 0;
        }
        Class_26869 class_26869 = class_15832.Method_15841();
        if (class_26869 == null) {
            return (6 & -12072) != 0;
        }
        int n2 = class_26869.Field_26870 - Class_13337.Method_13371(class_859.\u0000= package);
        return ((double)(n2 * n2 + (n = class_26869.Field_26873 - Class_13337.Method_13371(class_859.\u0000= switch)) * n) <= 1.5416666666666667 * 1.4594594594594594 ? 13825 & -14107 : 4226 & 10600) != 0;
    }

    public void Method_35738() {
        this.Field_35734.\u0000, `((Class_859)null);
    }

    protected double Method_35739() {
        Class_16547 class_16547 = this.Field_35734.\u0000strictfp(Class_21716.Field_21719);
        return class_16547 == null ? 2.3703703703703702 * 6.75 : class_16547.Method_16554();
    }

    private void Method_35740() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_35741() {
        this.Field_35733 = 11808 & -32760;
        this.Field_35731 = 1028 & 688;
        this.Field_35730 = -17326 & 288;
    }

    public static boolean Method_35742(Class_34093 class_34093, Class_859 class_859, boolean bl, boolean bl2) {
        if (class_859 == null) {
            return (-31451 & 152) != 0;
        }
        if (class_859 == class_34093) {
            return (-32768 & 5764) != 0;
        }
        if (!class_859.Method_1033()) {
            return (-32762 & 17008) != 0;
        }
        if (!class_34093.Method_34167(class_859.getClass())) {
            return (5640 & 18816) != 0;
        }
        Class_9665 class_9665 = class_34093.\u0000strictfp();
        Class_9665 class_96652 = class_859.Method_949();
        if (class_9665 != null && class_96652 == class_9665) {
            return (17792 & 10303) != 0;
        }
        if (class_34093 instanceof Class_7591 && StringUtils.isNotEmpty((CharSequence)((Class_7591)((Object)class_34093)).Method_7593())) {
            if (class_859 instanceof Class_7591 && ((Class_7591)((Object)class_34093)).Method_7593().equals(((Class_7591)((Object)class_859)).Method_7593())) {
                return (23632 & 8224) != 0;
            }
            if (class_859 == ((Class_7591)((Object)class_34093)).Method_7592()) {
                return (-24576 & 20610) != 0;
            }
        } else if (class_859 instanceof Class_626 && !bl && ((Class_626)class_859).Field_694.Field_18085) {
            return (10241 & -27382) != 0;
        }
        return (!bl2 || class_34093.Method_34162().Method_27491(class_859) ? 2049 & -20473 : 2112 & 30214) != 0;
    }

    public Class_35728(Class_41853 class_41853, boolean bl) {
        this(class_41853, bl, (14402 & 272) != 0);
    }

    public Class_35728(Class_41853 class_41853, boolean bl, boolean bl2) {
        this.Field_35734 = class_41853;
        this.Field_35729 = bl;
        this.Field_35732 = bl2;
    }
}

