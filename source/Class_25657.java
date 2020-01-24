/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_25657
extends Class_8295 {
    private int Field_25658;
    private final Class_4961 Field_25659;
    private int Field_25660;
    private int Field_25661;
    private int Field_25662;

    private void Method_25663() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823 Method_25664(Class_626 class_626, int n) {
        Class_23823 class_23823 = null;
        Class_26421 class_26421 = (Class_26421)this.\u0000, `.get(n);
        if (class_26421 != null && class_26421.Method_26439()) {
            Class_23823 class_238232 = class_26421.Method_26430();
            class_23823 = class_238232.Method_23850();
            if (n == (-28670 & 9367)) {
                if (!this.\u0000strictfp(class_238232, 3367 & 24707, 39 & -20161, (-21451 & 523) != 0)) {
                    return null;
                }
                class_26421.Method_26428(class_238232, class_23823);
            } else if (n != (16907 & -28187) && n != 0 ? (Class_30396.Method_30400().Method_30401(class_238232) != null ? !this.\u0000strictfp(class_238232, 17108 & -28382, 23041 & 8273, (8204 & 771) != 0) : (Class_44437.Method_44455(class_238232) ? !this.\u0000strictfp(class_238232, 2853 & -24559, -30674 & 1538, (516 & 2051) != 0) : (n >= (1123 & -24297) && n < (5215 & 318) ? !this.\u0000strictfp(class_238232, 4638 & 16479, -32217 & 30895, (19585 & 12800) != 0) : n >= (4126 & 17183) && n < (25143 & 4143) && !this.\u0000strictfp(class_238232, 8371 & 1039, 16414 & 8286, (20616 & -22476) != 0)))) : !this.\u0000strictfp(class_238232, 16551 & 4867, -27345 & 119, (8739 & -31732) != 0)) {
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

    public boolean Method_25665(Class_626 class_626) {
        return this.Field_25659.Method_4971(class_626);
    }

    public void Method_25666(int n, int n2) {
        this.Field_25659.Method_4970(n, n2);
    }

    public void Method_25667(Class_37497 class_37497) {
        super.Method_8306(class_37497);
        class_37497.Method_37498(this, this.Field_25659);
    }

    public void Method_25668() {
        super.Method_8322();
        for (int i = -32766 & 4608; i < this.\u0000= final.size(); ++i) {
            Class_37497 class_37497 = (Class_37497)this.\u0000= final.get(i);
            if (this.Field_25658 != this.Field_25659.Method_4973(4162 & 3851)) {
                class_37497.Method_37499(this, 16950 & -24253, this.Field_25659.Method_4973(286 & 24066));
            }
            if (this.Field_25660 != this.Field_25659.Method_4973(-28672 & 2062)) {
                class_37497.Method_37499(this, 6416 & 8324, this.Field_25659.Method_4973(4437 & -23552));
            }
            if (this.Field_25662 != this.Field_25659.Method_4973(-18423 & 359)) {
                class_37497.Method_37499(this, 9037 & 5265, this.Field_25659.Method_4973(-32495 & 7213));
            }
            if (this.Field_25661 == this.Field_25659.Method_4973(1763 & 30731)) continue;
            class_37497.Method_37499(this, 25603 & 611, this.Field_25659.Method_4973(10319 & 1299));
        }
        this.Field_25658 = this.Field_25659.Method_4973(6 & 8611);
        this.Field_25660 = this.Field_25659.Method_4973(9044 & -29695);
        this.Field_25662 = this.Field_25659.Method_4973(37 & -26607);
        this.Field_25661 = this.Field_25659.Method_4973(6339 & 17451);
    }

    public Class_25657(Class_37781 class_37781, Class_4961 class_4961) {
        int n;
        this.Field_25659 = class_4961;
        this.\u0000strictfp(new Class_26421(class_4961, -32246 & 257, 31804 & 57, 9267 & 4305));
        this.\u0000strictfp((Class_26421)new Class_43817(class_4961, 4293 & 17195, -32392 & 3641, 1591 & 8309));
        this.\u0000strictfp((Class_26421)new Class_41242(class_37781.Field_37786, class_4961, 2562 & 290, 25204 & 6519, -14285 & 419));
        for (n = -28544 & 10848; n < (1903 & 19); ++n) {
            for (int i = -32752 & 16800; i < (4169 & -22129); ++i) {
                this.\u0000strictfp(new Class_26421(class_37781, i + n * (9005 & 16585) + (4667 & -32503), (1294 & 8345) + i * (25659 & 2198), (8796 & -32524) + n * (1107 & -32238)));
            }
        }
        for (n = 96 & -25570; n < (-16375 & 10921); ++n) {
            this.\u0000strictfp(new Class_26421(class_37781, n, (4105 & 19690) + n * (-32713 & 1178), 25742 & 4558));
        }
    }
}

