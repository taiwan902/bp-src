/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class_40635
extends Class_4981
implements Class_36751,
Class_5591 {
    private String Field_40636;
    private Class_23823[] Field_40637 = new Class_23823[-17145 & 517];
    private int Field_40638 = -1 & -1;

    public void Method_40639(String string) {
        this.Field_40636 = string;
    }

    private static boolean Method_40640(Class_4961 class_4961, Class_23823 class_23823, int n, Class_4595 class_4595) {
        return (!class_4961.Method_4965(n, class_23823) ? 128 & 20602 : (!(class_4961 instanceof Class_36377) || ((Class_36377)class_4961).Method_36380(n, class_23823, class_4595) ? 9345 & 22547 : -24192 & 20)) != 0;
    }

    private void Method_40641() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_40642(Class_1699 class_1699) {
        super.Method_4984(class_1699);
        Class_1758 class_1758 = class_1699.Method_1735("Items", -22390 & 17178);
        this.Field_40637 = new Class_23823[this.Method_40644()];
        if (class_1699.Method_1715("CustomName", 329 & 4104)) {
            this.Field_40636 = class_1699.Method_1708("CustomName");
        }
        this.Field_40638 = class_1699.Method_1738("TransferCooldown");
        for (int i = 4153 & 644; i < class_1758.Method_1772(); ++i) {
            Class_1699 class_16992 = class_1758.Method_1768(i);
            byte by = class_16992.Method_1716("Slot");
            if (by < 0 || by >= this.Field_40637.length) continue;
            this.Field_40637[by] = Class_23823.Method_23840(class_16992);
        }
    }

    private Class_4961 Method_40643() {
        Class_4595 class_4595 = Class_15219.Method_15231(this.\u0000, `());
        return Class_40635.Method_40670(this.\u0000, `(), this.\u0000strictfp.\u0000= final() + class_4595.Method_4654(), this.\u0000strictfp.\u0000, `() + class_4595.Method_4633(), this.\u0000strictfp.\u0000strictfp() + class_4595.Method_4656());
    }

    public int Method_40644() {
        return this.Field_40637.length;
    }

    public int Method_40645() {
        return 4608 & 9468;
    }

    public void Method_40646() {
        super.\u0000, for();
    }

    private boolean Method_40647(Class_4961 class_4961, Class_4595 class_4595) {
        if (class_4961 instanceof Class_36377) {
            Class_36377 class_36377 = (Class_36377)class_4961;
            int[] arrn = class_36377.Method_36379(class_4595);
            for (int i = 20482 & -28704; i < arrn.length; ++i) {
                Class_23823 class_23823 = class_36377.\u0000strictfp(arrn[i]);
                if (class_23823 != null && class_23823.Field_23826 == class_23823.Method_23837()) continue;
                return (18387 & -32760) != 0;
            }
        } else {
            int n = class_4961.Method_4968();
            for (int i = 2208 & 17408; i < n; ++i) {
                Class_23823 class_23823 = class_4961.Method_4964(i);
                if (class_23823 != null && class_23823.Field_23826 == class_23823.Method_23837()) continue;
                return (16649 & 8228) != 0;
            }
        }
        return (2723 & 20565) != 0;
    }

    public int Method_40648() {
        return 20672 & 2642;
    }

    public void Method_40649() {
        for (int i = 8 & 8580; i < this.Field_40637.length; ++i) {
            this.Field_40637[i] = null;
        }
    }

    public Class_23823 Method_40650(int n) {
        return this.Field_40637[n];
    }

    private static boolean Method_40651(Class_4961 class_4961, Class_23823 class_23823, int n, Class_4595 class_4595) {
        return (!(class_4961 instanceof Class_36377) || ((Class_36377)class_4961).Method_36378(n, class_23823, class_4595) ? 2065 & 16909 : 28672 & -32160) != 0;
    }

    public void Method_40652(int n, Class_23823 class_23823) {
        this.Field_40637[n] = class_23823;
        if (class_23823 != null && class_23823.Field_23826 > this.Method_40648()) {
            class_23823.Field_23826 = this.Method_40648();
        }
    }

    private boolean Method_40653() {
        Class_23823[] arrclass_23823 = this.Field_40637;
        int n = arrclass_23823.length;
        for (int i = 304 & 8781; i < n; ++i) {
            Class_23823 class_23823 = arrclass_23823[i];
            if (class_23823 != null && class_23823.Field_23826 == class_23823.Method_23837()) continue;
            return (525 & 16) != 0;
        }
        return (2065 & 17001) != 0;
    }

    public boolean Method_40654() {
        return (this.Field_40638 > 0 ? 11279 & 321 : 24883 & 6208) != 0;
    }

    public boolean Method_40655(Class_626 class_626) {
        return (this.\u0000strictfp.Method_429(this.\u0000strictfp) != this ? 0 & 8192 : (class_626.\u0000strictfp((double)this.\u0000strictfp.\u0000= final() + 1.25 * 0.4, (double)this.\u0000strictfp.\u0000, `() + 1.6206896551724137 * 0.30851063829787234, (double)this.\u0000strictfp.\u0000strictfp() + 6.333333333333333 * 0.07894736842105264) <= 0.3617021276595745 * 176.94117647058823 ? 15945 & -32733 : 193 & -23276)) != 0;
    }

    public static Class_23823 Method_40656(Class_4961 class_4961, Class_23823 class_23823, Class_4595 class_4595) {
        if (class_4961 instanceof Class_36377 && class_4595 != null) {
            Class_36377 class_36377 = (Class_36377)class_4961;
            int[] arrn = class_36377.Method_36379(class_4595);
            for (int i = 2048 & 1618; i < arrn.length && class_23823 != null && class_23823.Field_23826 > 0; ++i) {
                class_23823 = Class_40635.Method_40682(class_4961, class_23823, arrn[i], class_4595);
            }
        } else {
            int n = class_4961.Method_4968();
            for (int i = 24897 & 2696; i < n && class_23823 != null && class_23823.Field_23826 > 0; ++i) {
                class_23823 = Class_40635.Method_40682(class_4961, class_23823, i, class_4595);
            }
        }
        if (class_23823 != null && class_23823.Field_23826 == 0) {
            class_23823 = null;
        }
        return class_23823;
    }

    private static boolean Method_40657(Class_36751 class_36751, Class_4961 class_4961, int n, Class_4595 class_4595) {
        Class_23823 class_23823 = class_4961.Method_4964(n);
        if (class_23823 != null && Class_40635.Method_40651(class_4961, class_23823, n, class_4595)) {
            Class_23823 class_238232 = class_23823.Method_23850();
            Class_23823 class_238233 = Class_40635.Method_40656(class_36751, class_4961.Method_4972(n, 1933 & 6147), null);
            if (class_238233 == null || class_238233.Field_23826 == 0) {
                class_4961.Method_4966();
                return (1057 & -28663) != 0;
            }
            class_4961.Method_4963(n, class_238232);
        }
        return (16544 & -19176) != 0;
    }

    public void Method_40658(Class_1699 class_1699) {
        super.Method_4989(class_1699);
        Class_1758 class_1758 = new Class_1758();
        for (int i = -22296 & 1025; i < this.Field_40637.length; ++i) {
            if (this.Field_40637[i] == null) continue;
            Class_1699 class_16992 = new Class_1699();
            class_16992.Method_1724("Slot", (byte)i);
            this.Field_40637[i].Method_23841(class_16992);
            class_1758.Method_1781(class_16992);
        }
        class_1699.Method_1744("Items", class_1758);
        class_1699.Method_1739("TransferCooldown", this.Field_40638);
        if (this.Method_40659()) {
            class_1699.Method_1702("CustomName", this.Field_40636);
        }
    }

    public boolean Method_40659() {
        return (this.Field_40636 != null && this.Field_40636.length() > 0 ? -31703 & 513 : -20459 & 3008) != 0;
    }

    private boolean Method_40660() {
        Class_23823[] arrclass_23823 = this.Field_40637;
        int n = arrclass_23823.length;
        for (int i = 23696 & 8290; i < n; ++i) {
            Class_23823 class_23823 = arrclass_23823[i];
            if (class_23823 == null) continue;
            return (22592 & 1824) != 0;
        }
        return (4115 & -32343) != 0;
    }

    public Class_8295 Method_40661(Class_37781 class_37781, Class_626 class_626) {
        return new Class_16839(class_37781, this, class_626);
    }

    private static boolean Method_40662(Class_23823 class_23823, Class_23823 class_238232) {
        return (class_23823.Method_23844() != class_238232.Method_23844() ? 4168 & 16528 : (class_23823.Method_23843() != class_238232.Method_23843() ? 141 & 26416 : (class_23823.Field_23826 > class_23823.Method_23837() ? 577 & 22580 : (int)(Class_23823.Method_23895(class_23823, class_238232) ? 1 : 0)))) != 0;
    }

    public void Method_40663(Class_626 class_626) {
    }

    public void Method_40664(int n, int n2) {
    }

    public boolean Method_40665(int n, Class_23823 class_23823) {
        return (-28669 & 1097) != 0;
    }

    public static boolean Method_40666(Class_36751 class_36751) {
        Class_4961 class_4961 = Class_40635.Method_40680(class_36751);
        if (class_4961 != null) {
            Class_4595 class_4595 = Class_4595.Field_4615;
            if (Class_40635.Method_40677(class_4961, class_4595)) {
                return (37 & 15386) != 0;
            }
            if (class_4961 instanceof Class_36377) {
                Class_36377 class_36377 = (Class_36377)class_4961;
                int[] arrn = class_36377.Method_36379(class_4595);
                for (int i = -32748 & 23849; i < arrn.length; ++i) {
                    if (!Class_40635.Method_40657(class_36751, class_4961, arrn[i], class_4595)) continue;
                    return (10667 & 65) != 0;
                }
            } else {
                int n = class_4961.Method_4968();
                for (int i = -29303 & 16418; i < n; ++i) {
                    if (!Class_40635.Method_40657(class_36751, class_4961, i, class_4595)) continue;
                    return (407 & 1089) != 0;
                }
            }
        } else {
            for (Class_3443 class_3443 : Class_40635.Method_40686(class_36751.Method_36753(), class_36751.Method_36755(), class_36751.Method_36754() + 1.0, class_36751.Method_36752())) {
                if (!Class_40635.Method_40676(class_36751, class_3443)) continue;
                return (2049 & 12811) != 0;
            }
        }
        return (21008 & -22523) != 0;
    }

    public double Method_40667() {
        return (double)this.\u0000strictfp.\u0000, `() + 1.7916666666666667 * 0.27906976744186046;
    }

    public void Method_40668(int n) {
        this.Field_40638 = n;
    }

    public boolean Method_40669() {
        if (this.\u0000strictfp != null && !this.\u0000strictfp.Field_306) {
            if (!this.Method_40654() && Class_15219.Method_15222(this.\u0000, `())) {
                int n = 3128 & 8964;
                if (!this.Method_40660()) {
                    n = this.Method_40678() ? 1 : 0;
                }
                if (!this.Method_40653()) {
                    int n2 = n = Class_40635.Method_40666(this) || n != 0 ? 2371 & 4649 : 609 & 18432;
                }
                if (n != 0) {
                    this.Method_40668(2472 & 10);
                    this.Method_40646();
                    return (4365 & 2177) != 0;
                }
            }
            return (8204 & -27646) != 0;
        }
        return (-30684 & 154) != 0;
    }

    public static Class_4961 Method_40670(Class_283 class_283, double d, double d2, double d3) {
        int n;
        int n2;
        Object object;
        Class_4961 class_4961 = null;
        int n3 = Class_13337.Method_13371(d);
        Class_4751 class_4751 = new Class_4751(n3, n = Class_13337.Method_13371(d2), n2 = Class_13337.Method_13371(d3));
        Class_3238 class_3238 = class_283.Method_375(class_4751).Method_3442();
        if (class_3238.Method_3339() && (object = class_283.Method_429(class_4751)) instanceof Class_4961 && (class_4961 = (Class_4961)object) instanceof Class_36146 && class_3238 instanceof Class_4125) {
            class_4961 = ((Class_4125)class_3238).Method_4141(class_283, class_4751);
        }
        if (class_4961 == null && (object = class_283.Method_506(null, new Class_10997(d - 5.5 * 0.09090909090909091, d2 - 1.4074074074074074 * 0.35526315789473684, d3 - 0.5070422535211268 * 0.9861111111111112, d + 0.7380952380952381 * 0.6774193548387096, d2 + 0.6714285714285715 * 0.7446808510638298, d3 + 0.3333333333333333 * 1.5), Class_28857.Field_28861)).size() > 0) {
            class_4961 = (Class_4961)object.get(class_283.Field_307.nextInt(object.size()));
        }
        return class_4961;
    }

    public double Method_40671() {
        return (double)this.\u0000strictfp.\u0000strictfp() + 0.42857142857142855 * 1.1666666666666667;
    }

    public void Method_40672(Class_626 class_626) {
    }

    public Class_23823 Method_40673(int n, int n2) {
        if (this.Field_40637[n] != null) {
            if (this.Field_40637[n].Field_23826 <= n2) {
                Class_23823 class_23823 = this.Field_40637[n];
                this.Field_40637[n] = null;
                return class_23823;
            }
            Class_23823 class_23823 = this.Field_40637[n].Method_23857(n2);
            if (this.Field_40637[n].Field_23826 == 0) {
                this.Field_40637[n] = null;
            }
            return class_23823;
        }
        return null;
    }

    public Class_23823 Method_40674(int n) {
        if (this.Field_40637[n] != null) {
            Class_23823 class_23823 = this.Field_40637[n];
            this.Field_40637[n] = null;
            return class_23823;
        }
        return null;
    }

    public void Method_40675() {
        if (this.\u0000strictfp != null && !this.\u0000strictfp.Field_306) {
            this.Field_40638 -= -31711 & 8335;
            if (!this.Method_40654()) {
                this.Method_40668(18985 & 5456);
                this.Method_40669();
            }
        }
    }

    public static boolean Method_40676(Class_4961 class_4961, Class_3443 class_3443) {
        boolean bl = 131 & -13272;
        if (class_3443 == null) {
            return (0 & 12368) != 0;
        }
        Class_23823 class_23823 = class_3443.Method_3478().Method_23850();
        Class_23823 class_238232 = Class_40635.Method_40656(class_4961, class_23823, null);
        if (class_238232 != null && class_238232.Field_23826 != 0) {
            class_3443.Method_3476(class_238232);
        } else {
            bl = 1313 & 8401;
            class_3443.\u0000break();
        }
        return bl;
    }

    private static boolean Method_40677(Class_4961 class_4961, Class_4595 class_4595) {
        if (class_4961 instanceof Class_36377) {
            Class_36377 class_36377 = (Class_36377)class_4961;
            int[] arrn = class_36377.Method_36379(class_4595);
            for (int i = 10392 & 327; i < arrn.length; ++i) {
                if (class_36377.\u0000strictfp(arrn[i]) == null) continue;
                return (1024 & 16467) != 0;
            }
        } else {
            int n = class_4961.Method_4968();
            for (int i = 7174 & 64; i < n; ++i) {
                if (class_4961.Method_4964(i) == null) continue;
                return (20488 & 8196) != 0;
            }
        }
        return (-8077 & 3085) != 0;
    }

    private boolean Method_40678() {
        Class_4961 class_4961 = this.Method_40643();
        if (class_4961 == null) {
            return (16 & -27840) != 0;
        }
        Class_4595 class_4595 = Class_15219.Method_15231(this.\u0000, `()).Method_4660();
        if (this.Method_40647(class_4961, class_4595)) {
            return (16467 & -30580) != 0;
        }
        for (int i = 12321 & -14958; i < this.Method_40644(); ++i) {
            if (this.Method_40650(i) == null) continue;
            Class_23823 class_23823 = this.Method_40650(i).Method_23850();
            Class_23823 class_238232 = Class_40635.Method_40656(class_4961, this.Method_40673(i, -32223 & 14593), class_4595);
            if (class_238232 == null || class_238232.Field_23826 == 0) {
                class_4961.Method_4966();
                return (-32469 & 1153) != 0;
            }
            this.Method_40652(i, class_23823);
        }
        return (9474 & 13) != 0;
    }

    public boolean Method_40679() {
        return (this.Field_40638 <= (8727 & 18497) ? 181 & -15799 : 2050 & 8713) != 0;
    }

    public static Class_4961 Method_40680(Class_36751 class_36751) {
        return Class_40635.Method_40670(class_36751.Method_36753(), class_36751.Method_36755(), class_36751.Method_36754() + 1.0, class_36751.Method_36752());
    }

    public double Method_40681() {
        return (double)this.\u0000strictfp.\u0000= final() + 0.5 * 1.0;
    }

    private static Class_23823 Method_40682(Class_4961 class_4961, Class_23823 class_23823, int n, Class_4595 class_4595) {
        Class_23823 class_238232 = class_4961.Method_4964(n);
        if (Class_40635.Method_40640(class_4961, class_23823, n, class_4595)) {
            int n2 = 50 & -32703;
            if (class_238232 == null) {
                class_4961.Method_4963(n, class_23823);
                class_23823 = null;
                n2 = 513 & -24467;
            } else if (Class_40635.Method_40662(class_238232, class_23823)) {
                int n3 = class_23823.Method_23837() - class_238232.Field_23826;
                int n4 = Math.min(class_23823.Field_23826, n3);
                class_23823.Field_23826 -= n4;
                class_238232.Field_23826 += n4;
                int n5 = n2 = n4 > 0 ? 6153 & -23357 : 16512 & -32410;
            }
            if (n2 != 0) {
                if (class_4961 instanceof Class_40635) {
                    Class_40635 class_40635 = (Class_40635)class_4961;
                    if (class_40635.Method_40679()) {
                        class_40635.Method_40668(26954 & -31731);
                    }
                    class_4961.Method_4966();
                }
                class_4961.Method_4966();
            }
        }
        return class_23823;
    }

    public String Method_40683() {
        return this.Method_40659() ? this.Field_40636 : "container.hopper";
    }

    public int Method_40684(int n) {
        return -32767 & 1124;
    }

    public String Method_40685() {
        return "minecraft:hopper";
    }

    public static List Method_40686(Class_283 class_283, double d, double d2, double d3) {
        return class_283.Method_395(Class_3443.class, new Class_10997(d - 0.4909090909090909 * 1.0185185185185186, d2 - 0.42857142857142855 * 1.1666666666666667, d3 - 59.0 * 0.00847457627118644, d + 0.22807017543859648 * 2.1923076923076925, d2 + 0.203125 * 2.4615384615384617, d3 + 0.6071428571428572 * 0.8235294117647058), Class_28857.Field_28859);
    }
}

