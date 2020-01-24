/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_38813
extends Class_1551 {
    private int Field_38814;
    private boolean Field_38815 = 18473 & -28459;
    private final int Field_38816;
    private int Field_38817;
    private boolean Field_38818 = 1297 & 6349;
    private int Field_38819;
    private String Field_38820 = "";
    private Class_11216 Field_38821;
    public int Field_38822;
    private int Field_38823 = 1928491128 & 74741617;
    private int Field_38824;
    private int Field_38825 = 1357439200 & 551680744;
    public final int Field_38826;
    public final int Field_38827;
    private Predicate Field_38828 = Predicates.alwaysTrue();
    private boolean Field_38829 = 18485 & -24255;
    private boolean Field_38830 = 577 & 4529;
    private boolean Field_38831;
    public int Field_38832;
    private int Field_38833 = 16544 & -20950;
    private final Class_28636 Field_38834;

    public void Method_38835(String string) {
        String string2 = "";
        String string3 = Class_12053.Method_12055(string);
        int n = this.Field_38824 < this.Field_38819 ? this.Field_38824 : this.Field_38819;
        int n2 = this.Field_38824 < this.Field_38819 ? this.Field_38819 : this.Field_38824;
        int n3 = this.Field_38833 - this.Field_38820.length() - (n - n2);
        int n4 = -22336 & 289;
        if (this.Field_38820.length() > 0) {
            string2 = string2 + this.Field_38820.substring(4105 & -31392, n);
        }
        if (n3 < string3.length()) {
            string2 = string2 + string3.substring(-3039 & 342, n3);
            n4 = n3;
        } else {
            string2 = string2 + string3;
            n4 = string3.length();
        }
        if (this.Field_38820.length() > 0 && n2 < this.Field_38820.length()) {
            string2 = string2 + this.Field_38820.substring(n2);
        }
        if (this.Field_38828.apply((Object)string2)) {
            this.Field_38820 = string2;
            this.Method_38865(n - this.Field_38819 + n4);
            if (this.Field_38821 != null) {
                this.Field_38821.Method_11217(this.Field_38816, this.Field_38820);
            }
        }
    }

    public void Method_38836(int n) {
        if (this.Field_38820.length() != 0) {
            if (this.Field_38819 != this.Field_38824) {
                this.Method_38835("");
            } else {
                int n2 = n < 0 ? 3345 & -3903 : 4609 & 24;
                int n3 = n2 != 0 ? this.Field_38824 + n : this.Field_38824;
                int n4 = n2 != 0 ? this.Field_38824 : this.Field_38824 + n;
                String string = "";
                if (n3 >= 0) {
                    string = this.Field_38820.substring(26368 & -32528, n3);
                }
                if (n4 < this.Field_38820.length()) {
                    string = string + this.Field_38820.substring(n4);
                }
                if (this.Field_38828.apply((Object)string)) {
                    this.Field_38820 = string;
                    if (n2 != 0) {
                        this.Method_38865(n);
                    }
                    if (this.Field_38821 != null) {
                        this.Field_38821.Method_11217(this.Field_38816, this.Field_38820);
                    }
                }
            }
        }
    }

    public void Method_38837(boolean bl) {
        this.Field_38818 = bl;
    }

    public boolean Method_38838() {
        return this.Field_38815;
    }

    private void Method_38839(int n, int n2, int n3, int n4) {
        int n5;
        if (n < n3) {
            n5 = n;
            n = n3;
            n3 = n5;
        }
        if (n2 < n4) {
            n5 = n2;
            n2 = n4;
            n4 = n5;
        }
        if (n3 > this.Field_38822 + this.Field_38826) {
            n3 = this.Field_38822 + this.Field_38826;
        }
        if (n > this.Field_38822 + this.Field_38826) {
            n = this.Field_38822 + this.Field_38826;
        }
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        Class_16867.Method_16924(0.0f, 0.0f, 1.0151515f * 251.19403f, 200.35715f * 1.2727273f);
        Class_16867.Method_16922();
        Class_16867.Method_16926();
        Class_16867.Method_16912(30123 & 5387);
        class_22385.Method_22417(-16217 & 23, Class_29585.Field_29602);
        class_22385.Method_22443(n, n4, 0.0).Method_22451();
        class_22385.Method_22443(n3, n4, 0.0).Method_22451();
        class_22385.Method_22443(n3, n2, 0.0).Method_22451();
        class_22385.Method_22443(n, n2, 0.0).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16946();
        Class_16867.Method_16965();
    }

    public void Method_38840(int n) {
        if (this.Field_38820.length() != 0) {
            if (this.Field_38819 != this.Field_38824) {
                this.Method_38835("");
            } else {
                this.Method_38836(this.Method_38869(n) - this.Field_38824);
            }
        }
    }

    public Class_38813(int n, Class_28636 class_28636, int n2, int n3, int n4, int n5) {
        this.Field_38816 = n;
        this.Field_38834 = class_28636;
        this.Field_38822 = n2;
        this.Field_38832 = n3;
        this.Field_38826 = n4;
        this.Field_38827 = n5;
    }

    public void Method_38841(Class_11216 class_11216) {
        this.Field_38821 = class_11216;
    }

    public void Method_38842(int n) {
        this.Field_38823 = n;
    }

    public int Method_38843(int n, int n2, boolean bl) {
        int n3 = n2;
        int n4 = n < 0 ? 20085 & 4489 : 16584 & -32766;
        int n5 = Math.abs(n);
        for (int i = 11786 & 20512; i < n5; ++i) {
            if (n4 == 0) {
                int n6 = this.Field_38820.length();
                if ((n3 = this.Field_38820.indexOf(19185 & 300, n3)) == (-1 & -1)) {
                    n3 = n6;
                    continue;
                }
                while (bl && n3 < n6 && this.Field_38820.charAt(n3) == (2160 & 420)) {
                    ++n3;
                }
                continue;
            }
            while (bl && n3 > 0 && this.Field_38820.charAt(n3 - (-24059 & 17537)) == (8484 & 2096)) {
                --n3;
            }
            while (n3 > 0 && this.Field_38820.charAt(n3 - (5249 & 81)) != (2724 & 29026)) {
                --n3;
            }
        }
        return n3;
    }

    public void Method_38844(Predicate predicate) {
        this.Field_38828 = predicate;
    }

    private void Method_38845() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_38846() {
        return this.Field_38819;
    }

    public void Method_38847() {
        if (Class_18.Field_89.Field_127.Field_2178 > 0) {
            this.Field_38814 += 1281 & 18435;
        }
    }

    public String Method_38848() {
        return this.Field_38820;
    }

    public void Method_38849() {
        if (this.Method_38838()) {
            if (this.Method_38852()) {
                Class_38813.\u0000, `((int)(this.Field_38822 - (641 & 9509)), (int)(this.Field_38832 - (-32447 & 1075)), (int)(this.Field_38822 + this.Field_38826 + (1027 & 37)), (int)(this.Field_38832 + this.Field_38827 + (49 & 22669)), (int)(-6247966 & -6184775));
                Class_38813.\u0000, `((int)this.Field_38822, (int)this.Field_38832, (int)(this.Field_38822 + this.Field_38826), (int)(this.Field_38832 + this.Field_38827), (int)(-16776934 & -16626112));
            }
            int n = this.Field_38829 ? this.Field_38825 : this.Field_38823;
            int n2 = this.Field_38824 - this.Field_38817;
            int n3 = this.Field_38819 - this.Field_38817;
            String string = this.Field_38834.Method_28691(this.Field_38820.substring(this.Field_38817), this.Method_38856());
            int n4 = n2 >= 0 && n2 <= string.length() ? 1073 & -31995 : -28670 & 16656;
            int n5 = this.Field_38831 && this.Field_38814 / (-31738 & 11087) % (16546 & 271) == 0 && n4 != 0 ? 3 & -32759 : 368 & -10231;
            int n6 = this.Field_38818 ? this.Field_38822 + (16900 & 6172) : this.Field_38822;
            int n7 = this.Field_38818 ? this.Field_38832 + (this.Field_38827 - (4361 & 10908)) / (17410 & -28610) : this.Field_38832;
            int n8 = n6;
            if (n3 > string.length()) {
                n3 = string.length();
            }
            if (string.length() > 0) {
                String string2 = n4 != 0 ? string.substring(8260 & -30200, n2) : string;
                n8 = this.Field_38834.Method_28729(string2, n6, n7, n);
            }
            int n9 = this.Field_38824 < this.Field_38820.length() || this.Field_38820.length() >= this.Method_38866() ? -27487 & 89 : -32196 & 8386;
            int n10 = n8;
            if (n4 == 0) {
                n10 = n2 > 0 ? n6 + this.Field_38826 : n6;
            } else if (n9 != 0) {
                n10 = n8 - (9841 & -16241);
                --n8;
            }
            if (string.length() > 0 && n4 != 0 && n2 < string.length()) {
                n8 = this.Field_38834.Method_28729(string.substring(n2), n8, n7, n);
            }
            if (n5 != 0) {
                if (n9 != 0) {
                    Class_1551.Method_1558(n10, n7 - (20521 & 2883), n10 + (137 & 593), n7 + (41 & 1089) + (8265 & 16553), -601870 & -3024428);
                } else {
                    this.Field_38834.Method_28729("_", n10, n7, n);
                }
            }
            if (n3 != n2) {
                int n11 = n6 + this.Field_38834.Method_28715(string.substring(12627 & 16512, n3));
                this.Method_38839(n10, n7 - (8721 & -32639), n11 - (-22471 & 16515), n7 + (21 & -21493) + (1289 & 2733));
            }
        }
    }

    public int Method_38850() {
        return this.Field_38824;
    }

    public void Method_38851(int n) {
        this.Field_38824 = n;
        int n2 = this.Field_38820.length();
        this.Field_38824 = Class_13337.Method_13367(this.Field_38824, 1492 & 32, n2);
        this.Method_38860(this.Field_38824);
    }

    public boolean Method_38852() {
        return this.Field_38818;
    }

    public void Method_38853(String string) {
        if (this.Field_38828.apply((Object)string)) {
            this.Field_38820 = string.length() > this.Field_38833 ? string.substring(16384 & 11780, this.Field_38833) : string;
            this.Method_38870();
        }
    }

    public boolean Method_38854(char c, int n) {
        if (!this.Field_38831) {
            return (5131 & 144) != 0;
        }
        if (Class_1490.Method_1520(n)) {
            this.Method_38870();
            this.Method_38860(2049 & 1058);
            return (135 & -27119) != 0;
        }
        if (Class_1490.Method_1540(n)) {
            Class_1490.Method_1522(this.Method_38857());
            return (17925 & 219) != 0;
        }
        if (Class_1490.Method_1512(n)) {
            if (this.Field_38829) {
                this.Method_38835(Class_1490.Method_1523());
            }
            return (261 & -23535) != 0;
        }
        if (Class_1490.Method_1532(n)) {
            Class_1490.Method_1522(this.Method_38857());
            if (this.Field_38829) {
                this.Method_38835("");
            }
            return (1057 & 15179) != 0;
        }
        switch (n) {
            case 14: {
                if (Class_1490.Method_1538()) {
                    if (this.Field_38829) {
                        this.Method_38840(-1 & -1);
                    }
                } else if (this.Field_38829) {
                    this.Method_38836(-1 & -1);
                }
                return (-32727 & 11287) != 0;
            }
            case 199: {
                if (Class_1490.Method_1510()) {
                    this.Method_38860(-11649 & 1152);
                } else {
                    this.Method_38867();
                }
                return (10241 & 20481) != 0;
            }
            case 203: {
                if (Class_1490.Method_1510()) {
                    if (Class_1490.Method_1538()) {
                        this.Method_38860(this.Method_38871(-1 & -1, this.Method_38846()));
                    } else {
                        this.Method_38860(this.Method_38846() - (-31999 & 12489));
                    }
                } else if (Class_1490.Method_1538()) {
                    this.Method_38851(this.Method_38869(-1 & -1));
                } else {
                    this.Method_38865(-1 & -1);
                }
                return (-32645 & 1025) != 0;
            }
            case 205: {
                if (Class_1490.Method_1510()) {
                    if (Class_1490.Method_1538()) {
                        this.Method_38860(this.Method_38871(-14463 & 8233, this.Method_38846()));
                    } else {
                        this.Method_38860(this.Method_38846() + (769 & -23535));
                    }
                } else if (Class_1490.Method_1538()) {
                    this.Method_38851(this.Method_38869(145 & -16383));
                } else {
                    this.Method_38865(16385 & 177);
                }
                return (-29951 & 107) != 0;
            }
            case 207: {
                if (Class_1490.Method_1510()) {
                    this.Method_38860(this.Field_38820.length());
                } else {
                    this.Method_38870();
                }
                return (-32479 & 10905) != 0;
            }
            case 211: {
                if (Class_1490.Method_1538()) {
                    if (this.Field_38829) {
                        this.Method_38840(17 & -14011);
                    }
                } else if (this.Field_38829) {
                    this.Method_38836(1025 & -7887);
                }
                return (29701 & 2337) != 0;
            }
        }
        if (Class_12053.Method_12057(c)) {
            if (this.Field_38829) {
                this.Method_38835(Character.toString(c));
            }
            return (5 & 21507) != 0;
        }
        return (3072 & -12122) != 0;
    }

    public void Method_38855(int n, int n2, int n3) {
        int n4;
        int n5 = n4 = n >= this.Field_38822 && n < this.Field_38822 + this.Field_38826 && n2 >= this.Field_38832 && n2 < this.Field_38832 + this.Field_38827 ? 14723 & 21 : -27422 & 8461;
        if (this.Field_38830) {
            this.Method_38858(n4 != 0);
        }
        if (this.Field_38831 && n4 != 0 && n3 == 0) {
            int n6 = n - this.Field_38822;
            if (this.Field_38818) {
                n6 -= 4;
            }
            String string = this.Field_38834.Method_28691(this.Field_38820.substring(this.Field_38817), this.Method_38856());
            this.Method_38851(this.Field_38834.Method_28691(string, n6).length() + this.Field_38817);
        }
    }

    public int Method_38856() {
        return this.Method_38852() ? this.Field_38826 - (6184 & 8524) : this.Field_38826;
    }

    public String Method_38857() {
        int n = this.Field_38824 < this.Field_38819 ? this.Field_38824 : this.Field_38819;
        int n2 = this.Field_38824 < this.Field_38819 ? this.Field_38819 : this.Field_38824;
        return this.Field_38820.substring(n, n2);
    }

    public void Method_38858(boolean bl) {
        if (bl && !this.Field_38831) {
            this.Field_38814 = -32704 & 2208;
        }
        this.Field_38831 = bl;
    }

    public void Method_38859(int n) {
        this.Field_38833 = n;
        if (this.Field_38820.length() > n) {
            this.Field_38820 = this.Field_38820.substring(4429 & 27648, n);
        }
    }

    public void Method_38860(int n) {
        int n2 = this.Field_38820.length();
        if (n > n2) {
            n = n2;
        }
        if (n < 0) {
            n = 9745 & 16748;
        }
        this.Field_38819 = n;
        if (this.Field_38834 != null) {
            if (this.Field_38817 > n2) {
                this.Field_38817 = n2;
            }
            int n3 = this.Method_38856();
            String string = this.Field_38834.Method_28691(this.Field_38820.substring(this.Field_38817), n3);
            int n4 = string.length() + this.Field_38817;
            if (n == this.Field_38817) {
                this.Field_38817 -= this.Field_38834.Method_28720(this.Field_38820, n3, (18721 & 1539) != 0).length();
            }
            if (n > n4) {
                this.Field_38817 += n - n4;
            } else if (n <= this.Field_38817) {
                this.Field_38817 -= this.Field_38817 - n;
            }
            this.Field_38817 = Class_13337.Method_13367(this.Field_38817, 22784 & 8322, n2);
        }
    }

    public boolean Method_38861() {
        return this.Field_38831;
    }

    public void Method_38862(boolean bl) {
        this.Field_38829 = bl;
    }

    public void Method_38863(int n) {
        this.Field_38825 = n;
    }

    public void Method_38864(boolean bl) {
        this.Field_38815 = bl;
    }

    public void Method_38865(int n) {
        this.Method_38851(this.Field_38819 + n);
    }

    public int Method_38866() {
        return this.Field_38833;
    }

    public void Method_38867() {
        this.Method_38851(16578 & -23792);
    }

    public void Method_38868(boolean bl) {
        this.Field_38830 = bl;
    }

    public int Method_38869(int n) {
        return this.Method_38871(n, this.Method_38850());
    }

    public void Method_38870() {
        this.Method_38851(this.Field_38820.length());
    }

    public int Method_38871(int n, int n2) {
        return this.Method_38843(n, n2, (-31643 & 12571) != 0);
    }

    public int Method_38872() {
        return this.Field_38816;
    }
}

