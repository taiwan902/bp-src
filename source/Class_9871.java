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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_9871
extends Class_8295 {
    private int Field_9872;
    private String Field_9873;
    private final Class_626 Field_9874;
    private Class_283 Field_9875;
    private Class_4751 Field_9876;
    private Class_4961 Field_9877 = new Class_41254();
    private Class_4961 Field_9878 = new Class_45843(this, "Repair", (-32247 & 3077) != 0, -28157 & 262);
    public int Field_9879;
    private static final Logger Field_9880 = LogManager.getLogger();

    public Class_9871(Class_37781 class_37781, Class_283 class_283, Class_626 class_626) {
        this(class_37781, class_283, Class_4751.Field_4760, class_626);
    }

    public void Method_9881(Class_37497 class_37497) {
        super.Method_8306(class_37497);
        class_37497.Method_37499(this, 32 & 6208, this.Field_9879);
    }

    private void Method_9882() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_9883() {
        int n = 6213 & 128;
        int n2 = 2049 & -32765;
        int n3 = -3807 & 1609;
        int n4 = 705 & -27635;
        int n5 = 1667 & 86;
        int n6 = 2433 & 8193;
        int n7 = 793 & 1221;
        Class_23823 class_23823 = this.Field_9878.Method_4964(-32088 & 21825);
        this.Field_9879 = 7175 & -16351;
        int n8 = -5109 & 596;
        int n9 = 4160 & 831;
        int n10 = 1536 & 418;
        if (class_23823 == null) {
            this.Field_9877.Method_4963(8461 & 2162, null);
            this.Field_9879 = 9248 & 20508;
        } else {
            int n11;
            Class_23823 class_238232 = class_23823.Method_23850();
            Class_23823 class_238233 = this.Field_9878.Method_4964(12865 & 1025);
            Map map = Class_29642.Method_29665(class_238232);
            int n12 = 4096 & 18458;
            n9 = n9 + class_23823.Method_23867() + (class_238233 == null ? 32 & 21121 : class_238233.Method_23867());
            this.Field_9872 = 5648 & -8192;
            if (class_238233 != null) {
                int n13 = n12 = class_238233.Method_23844() == Class_10527.Field_10625 && Class_10527.Field_10625.Method_21691(class_238233).Method_1772() > 0 ? 1111 & -32639 : -12252 & 8960;
                if (class_238232.Method_23846() && class_238232.Method_23844().Method_1998(class_23823, class_238233)) {
                    int n14;
                    n11 = Math.min(class_238232.Method_23853(), class_238232.Method_23859() / (2860 & -16380));
                    if (n11 <= 0) {
                        this.Field_9877.Method_4963(10264 & -31739, null);
                        this.Field_9879 = -26608 & 1027;
                        return;
                    }
                    for (n14 = 33 & 10256; n11 > 0 && n14 < class_238233.Field_23826; ++n14) {
                        int n15 = class_238232.Method_23853() - n11;
                        class_238232.Method_23849(n15);
                        ++n8;
                        n11 = Math.min(class_238232.Method_23853(), class_238232.Method_23859() / (1356 & -20476));
                    }
                    this.Field_9872 = n14;
                } else {
                    int n16;
                    int n17;
                    if (!(n12 != 0 || class_238232.Method_23844() == class_238233.Method_23844() && class_238232.Method_23846())) {
                        this.Field_9877.Method_4963(16410 & -31675, null);
                        this.Field_9879 = 29696 & 987;
                        return;
                    }
                    if (class_238232.Method_23846() && n12 == 0) {
                        int n18 = class_23823.Method_23859() - class_23823.Method_23853();
                        int n19 = class_238233.Method_23859() - class_238233.Method_23853();
                        n16 = n19 + class_238232.Method_23859() * (12 & 16526) / (-16268 & 8940);
                        int n20 = n18 + n16;
                        n17 = class_238232.Method_23859() - n20;
                        if (n17 < 0) {
                            n17 = 18496 & -32223;
                        }
                        if (n17 < class_238232.Method_23843()) {
                            class_238232.Method_23849(n17);
                            n8 += 2;
                        }
                    }
                    Map map2 = Class_29642.Method_29665(class_238233);
                    Iterator iterator = map2.keySet().iterator();
                    while (iterator.hasNext()) {
                        int n21;
                        n16 = (Integer)iterator.next();
                        Class_30635 class_30635 = Class_30635.Method_30685(n16);
                        if (class_30635 == null) continue;
                        n17 = map.containsKey(n16) ? (Integer)map.get(n16) : 18530 & 4868;
                        int n22 = (Integer)map2.get(n16);
                        int n23 = n17 == n22 ? ++n22 : Math.max(n22, n17);
                        n22 = n23;
                        int n24 = class_30635.Method_30697(class_23823);
                        if (this.Field_9874.Field_694.Method_18094() || class_23823.Method_23844() == Class_10527.Field_10625) {
                            n24 = -23531 & 937;
                        }
                        Iterator iterator2 = map.keySet().iterator();
                        while (iterator2.hasNext()) {
                            n21 = (Integer)iterator2.next();
                            if (n21 == n16 || class_30635.Method_30690(Class_30635.Method_30685(n21))) continue;
                            n24 = 64 & 8227;
                            ++n8;
                        }
                        if (n24 == 0) continue;
                        if (n22 > class_30635.Method_30672()) {
                            n22 = class_30635.Method_30672();
                        }
                        map.put(n16, n22);
                        n21 = 532 & 14600;
                        switch (class_30635.Method_30677()) {
                            case 1: {
                                n21 = 332 & 4136;
                                break;
                            }
                            case 2: {
                                n21 = 5637 & 8206;
                            }
                            default: {
                                break;
                            }
                            case 5: {
                                n21 = 1427 & -24574;
                                break;
                            }
                            case 10: {
                                n21 = -30687 & 13719;
                            }
                        }
                        if (n12 != 0) {
                            n21 = Math.max(1 & 23329, n21 / (5478 & 2178));
                        }
                        n8 += n21 * n22;
                    }
                }
            }
            if (StringUtils.isBlank((CharSequence)this.Field_9873)) {
                if (class_23823.Method_23851()) {
                    n10 = 12489 & -15341;
                    n8 += n10;
                    class_238232.Method_23891();
                }
            } else if (!this.Field_9873.equals(class_23823.Method_23899())) {
                n10 = 49 & -24311;
                n8 += n10;
                class_238232.Method_23870(this.Field_9873);
            }
            this.Field_9879 = n9 + n8;
            if (n8 <= 0) {
                class_238232 = null;
            }
            if (n10 == n8 && n10 > 0 && this.Field_9879 >= (-22084 & 5161)) {
                this.Field_9879 = 551 & 1199;
            }
            if (this.Field_9879 >= (104 & 22188) && !this.Field_9874.Field_694.Method_18094()) {
                class_238232 = null;
            }
            if (class_238232 != null) {
                n11 = class_238232.Method_23867();
                if (class_238233 != null && n11 < class_238233.Method_23867()) {
                    n11 = class_238233.Method_23867();
                }
                n11 = n11 * (594 & -26362) + (17473 & 897);
                class_238232.Method_23887(n11);
                Class_29642.Method_29655(map, class_238232);
            }
            this.Field_9877.Method_4963(12816 & -32765, class_238232);
            this.\u0000, `();
        }
    }

    static int Method_9884(Class_9871 class_9871) {
        return class_9871.Field_9872;
    }

    public void Method_9885(String string) {
        this.Field_9873 = string;
        if (this.\u0000strictfp(3714 & 10).Method_26439()) {
            Class_23823 class_23823 = this.\u0000strictfp(-14430 & 2050).Method_26430();
            if (StringUtils.isBlank((CharSequence)string)) {
                class_23823.Method_23891();
            } else {
                class_23823.Method_23870(this.Field_9873);
            }
        }
        this.Method_9883();
    }

    static Class_4961 Method_9886(Class_9871 class_9871) {
        return class_9871.Field_9878;
    }

    public Class_23823 Method_9887(Class_626 class_626, int n) {
        Class_23823 class_23823 = null;
        Class_26421 class_26421 = (Class_26421)this.\u0000, `.get(n);
        if (class_26421 != null && class_26421.Method_26439()) {
            Class_23823 class_238232 = class_26421.Method_26430();
            class_23823 = class_238232.Method_23850();
            if (n == (14919 & -32742)) {
                if (!this.\u0000strictfp(class_238232, 435 & 579, -32657 & 7847, (-20061 & 16465) != 0)) {
                    return null;
                }
                class_26421.Method_26428(class_238232, class_23823);
            } else if (n != 0 && n != (18769 & 4609) ? n >= (16451 & -29685) && n < (-28633 & 8383) && !this.\u0000strictfp(class_238232, 6166 & 10144, 21074 & 8366, (8237 & -32384) != 0) : !this.\u0000strictfp(class_238232, -31989 & 16503, 14391 & -15761, (2048 & 551) != 0)) {
                return null;
            }
            if (class_238232.Field_23826 == 0) {
                class_26421.Method_26437(null);
            } else {
                class_26421.Method_26431();
            }
            if (class_238232.Field_23826 == class_23823.Field_23826) {
                return null;
            }
            class_26421.Method_26441(class_626, class_238232);
        }
        return class_23823;
    }

    public void Method_9888(Class_626 class_626) {
        super.Method_8320(class_626);
        if (!this.Field_9875.Field_306) {
            for (int i = -13936 & 8709; i < this.Field_9878.Method_4968(); ++i) {
                Class_23823 class_23823 = this.Field_9878.Method_4976(i);
                if (class_23823 == null) continue;
                class_626.Method_733(class_23823, (16418 & 4928) != 0);
            }
        }
    }

    public Class_9871(Class_37781 class_37781, Class_283 class_283, Class_4751 class_4751, Class_626 class_626) {
        int n;
        this.Field_9876 = class_4751;
        this.Field_9875 = class_283;
        this.Field_9874 = class_626;
        this.\u0000strictfp(new Class_26421(this.Field_9878, 25632 & -28604, -27621 & 16411, 16623 & 3119));
        this.\u0000strictfp(new Class_26421(this.Field_9878, 2567 & 145, 8300 & 4686, 63 & 8559));
        this.\u0000strictfp((Class_26421)new Class_28625(this, this.Field_9877, 2347 & 1030, 134 & -23898, 16687 & 6319, class_283, class_4751));
        for (n = 16394 & 9601; n < (1043 & -11325); ++n) {
            for (int i = 14664 & 5; i < (399 & 11369); ++i) {
                this.\u0000strictfp(new Class_26421(class_37781, i + n * (9225 & 21017) + (-32055 & 2319), (8202 & 600) + i * (-25322 & 723), (1652 & 93) + n * (2074 & 4183)));
            }
        }
        for (n = -22490 & 592; n < (15371 & 57); ++n) {
            this.\u0000strictfp(new Class_26421(class_37781, n, (5260 & 344) + n * (-32142 & 10522), 142 & 12431));
        }
    }

    public void Method_9889(Class_4961 class_4961) {
        super.Method_8312(class_4961);
        if (class_4961 == this.Field_9878) {
            this.Method_9883();
        }
    }

    public void Method_9890(int n, int n2) {
        if (n == 0) {
            this.Field_9879 = n2;
        }
    }

    public boolean Method_9891(Class_626 class_626) {
        return (this.Field_9875.Method_375(this.Field_9876).Method_3442() != Class_9265.Field_9376 ? -27672 & 25617 : (class_626.\u0000strictfp((double)this.Field_9876.\u0000= final() + 0.44285714285714284 * 1.1290322580645162, (double)this.Field_9876.\u0000, `() + 2.3902439024390243 * 0.20918367346938777, (double)this.Field_9876.\u0000strictfp() + 4.666666666666667 * 0.10714285714285714) <= 5.2105263157894735 * 12.282828282828284 ? 16393 & -27515 : 15138 & 17420)) != 0;
    }
}

