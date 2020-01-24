/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Lists
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_44039
extends Class_31144 {
    private final Class_14944[][] Field_44040;
    private Class_11216 Field_44041;
    private final Class_29437 Field_44042 = new Class_29437();
    private final List Field_44043 = Lists.newArrayList();
    private Class_1551 Field_44044;
    private int Field_44045;
    private final List Field_44046 = Lists.newArrayList();

    protected int Method_44047() {
        return super.\u0000strictfp() + (936 & 9264);
    }

    public Class_44039(Class_18 class_18, int n, int n2, int n3, int n4, int n5, Class_11216 class_11216, Class_14944[] ... arrclass_14944) {
        super(class_18, n, n2, n3, n4, n5);
        this.Field_44041 = class_11216;
        this.Field_44040 = arrclass_14944;
        this.\u0000= final = 38 & 29889;
        this.Method_44059();
        this.Method_44050();
    }

    private Class_1551 Method_44048(Class_14944 class_14944, int n, boolean bl) {
        return class_14944 instanceof Class_23438 ? this.Method_44049(this.\u0000, ` / (-31998 & 25610) - (-28517 & 17339) + n, 529 & 17508, (Class_23438)class_14944) : (class_14944 instanceof Class_25268 ? this.Method_44057(this.\u0000, ` / (16642 & 4770) - (14491 & 223) + n, 513 & 25732, (Class_25268)class_14944) : (class_14944 instanceof Class_18167 ? this.Method_44069(this.\u0000, ` / (4162 & 647) - (8863 & 19867) + n, -30719 & 4872, (Class_18167)class_14944) : (class_14944 instanceof Class_15395 ? this.Method_44065(this.\u0000, ` / (19970 & 2) - (155 & -7233) + n, 8456 & 19460, (Class_15395)class_14944, bl) : null)));
    }

    private Class_43880 Method_44049(int n, int n2, Class_23438 class_23438) {
        Class_43880 class_43880 = new Class_43880(this.Field_44041, class_23438.\u0000strictfp(), n, n2, class_23438.\u0000strictfp(), class_23438.Method_23447(), class_23438.Method_23443(), class_23438.Method_23446(), class_23438.Method_23444());
        class_43880.\u0000, ` = class_23438.\u0000, `();
        return class_43880;
    }

    private void Method_44050() {
        this.Field_44043.clear();
        for (int i = 1 & 4100; i < this.Field_44040[this.Field_44045].length; i += 2) {
            Class_14944 class_14944 = this.Field_44040[this.Field_44045][i];
            Class_14944 class_149442 = i < this.Field_44040[this.Field_44045].length - (4123 & -32735) ? this.Field_44040[this.Field_44045][i + (513 & 10305)] : null;
            Class_1551 class_1551 = (Class_1551)this.Field_44042.Method_29447(class_14944.Method_14951());
            Class_1551 class_15512 = class_149442 != null ? (Class_1551)this.Field_44042.Method_29447(class_149442.Method_14951()) : null;
            Class_23503 class_23503 = new Class_23503(class_1551, class_15512);
            this.Field_44043.add(class_23503);
        }
    }

    public void Method_44051() {
        if (this.Field_44045 > 0) {
            this.Method_44055(this.Field_44045 - (-28537 & 8737));
        }
    }

    private void Method_44052(Class_1551 class_1551, boolean bl) {
        if (class_1551 instanceof Class_42376) {
            ((Class_42376)class_1551).Field_42378 = bl;
        } else if (class_1551 instanceof Class_38813) {
            ((Class_38813)class_1551).Method_38864(bl);
        } else if (class_1551 instanceof Class_36766) {
            ((Class_36766)class_1551).Field_36771 = bl;
        }
    }

    public void Method_44053(char c, int n) {
        block1 : {
            int n2;
            block2 : {
                Class_38813 class_38813;
                block3 : {
                    int n3;
                    block4 : {
                        if (!(this.Field_44044 instanceof Class_38813)) break block1;
                        class_38813 = (Class_38813)this.Field_44044;
                        if (Class_1490.Method_1512(n)) break block2;
                        if (n != (271 & 5151)) break block3;
                        class_38813.Method_38858((4648 & 144) != 0);
                        int n4 = this.Field_44046.indexOf(this.Field_44044);
                        n4 = Class_1490.Method_1510() ? (n4 == 0 ? this.Field_44046.size() - (-15851 & 1409) : --n4) : (n4 == this.Field_44046.size() - (-24317 & 20677) ? -24568 & 2129 : ++n4);
                        this.Field_44044 = (Class_1551)this.Field_44046.get(n4);
                        class_38813 = (Class_38813)this.Field_44044;
                        class_38813.Method_38858((-25817 & 16401) != 0);
                        int n5 = class_38813.Field_38832 + this.\u0000= int;
                        n3 = class_38813.Field_38832;
                        if (n5 <= this.\u0000= switch) break block4;
                        this.\u0000, `((float)(n5 - this.\u0000= switch), (8200 & 6) != 0);
                        break block1;
                    }
                    if (n3 >= this.\u0000%) break block1;
                    this.\u0000= final = n3;
                    break block1;
                }
                class_38813.Method_38854(c, n);
                break block1;
            }
            String string = Class_1490.Method_1523();
            String[] arrstring = string.split(";");
            int n6 = n2 = this.Field_44046.indexOf(this.Field_44044);
            String[] arrstring2 = arrstring;
            int n7 = arrstring2.length;
            for (int i = 14944 & -15970; i < n7; ++i) {
                String string2 = arrstring2[i];
                ((Class_38813)this.Field_44046.get(n6)).Method_38853(string2);
                n6 = n6 == this.Field_44046.size() - (-32349 & 25089) ? 16524 & 2656 : ++n6;
                if (n6 == n2) break;
            }
        }
    }

    public int Method_44054() {
        return this.Field_44040.length;
    }

    public void Method_44055(int n) {
        if (n != this.Field_44045) {
            int n2 = this.Field_44045;
            this.Field_44045 = n;
            this.Method_44050();
            this.Method_44056(n2, n);
            this.\u0000= final = 0.0f;
        }
    }

    private void Method_44056(int n, int n2) {
        int n3;
        Class_14944 class_14944;
        Class_14944[] arrclass_14944 = this.Field_44040[n];
        int n4 = arrclass_14944.length;
        for (n3 = -12158 & 8236; n3 < n4; ++n3) {
            class_14944 = arrclass_14944[n3];
            if (class_14944 == null) continue;
            this.Method_44052((Class_1551)this.Field_44042.Method_29447(class_14944.Method_14951()), (25185 & -26620) != 0);
        }
        arrclass_14944 = this.Field_44040[n2];
        n4 = arrclass_14944.length;
        for (n3 = -32212 & 12690; n3 < n4; ++n3) {
            class_14944 = arrclass_14944[n3];
            if (class_14944 == null) continue;
            this.Method_44052((Class_1551)this.Field_44042.Method_29447(class_14944.Method_14951()), (2053 & 8371) != 0);
        }
    }

    private Class_47574 Method_44057(int n, int n2, Class_25268 class_25268) {
        Class_47574 class_47574 = new Class_47574(this.Field_44041, class_25268.\u0000strictfp(), n, n2, class_25268.\u0000strictfp(), class_25268.Method_25271());
        class_47574.\u0000, ` = class_25268.\u0000, `();
        return class_47574;
    }

    public boolean Method_44058(int n, int n2, int n3) {
        boolean bl = super.Method_31148(n, n2, n3);
        int n4 = this.\u0000strictfp(n, n2);
        if (n4 >= 0) {
            Class_23503 class_23503 = this.Method_44062(n4);
            if (this.Field_44044 != Class_23503.Method_23510(class_23503) && this.Field_44044 != null && this.Field_44044 instanceof Class_38813) {
                ((Class_38813)this.Field_44044).Method_38858((2 & -32415) != 0);
            }
            this.Field_44044 = Class_23503.Method_23510(class_23503);
        }
        return bl;
    }

    private void Method_44059() {
        Class_14944[][] arrclass_14944 = this.Field_44040;
        int n = arrclass_14944.length;
        for (int i = -15663 & 256; i < n; ++i) {
            Class_14944[] arrclass_149442 = arrclass_14944[i];
            for (int j = 4352 & 129; j < arrclass_149442.length; j += 2) {
                Class_14944 class_14944 = arrclass_149442[j];
                Class_14944 class_149442 = j < arrclass_149442.length - (11049 & -31723) ? arrclass_149442[j + (12737 & 557)] : null;
                Class_1551 class_1551 = this.Method_44048(class_14944, 12483 & 2324, (class_149442 == null ? 559 & 19665 : 2816 & -32765) != 0);
                Class_1551 class_15512 = this.Method_44048(class_149442, -7456 & 5559, (class_14944 == null ? 3337 & 195 : 4276 & -7614) != 0);
                Class_23503 class_23503 = new Class_23503(class_1551, class_15512);
                this.Field_44043.add(class_23503);
                if (class_14944 != null && class_1551 != null) {
                    this.Field_44042.Method_29453(class_14944.Method_14951(), class_1551);
                    if (class_1551 instanceof Class_38813) {
                        this.Field_44046.add((Class_38813)class_1551);
                    }
                }
                if (class_149442 == null || class_15512 == null) continue;
                this.Field_44042.Method_29453(class_149442.Method_14951(), class_15512);
                if (!(class_15512 instanceof Class_38813)) continue;
                this.Field_44046.add((Class_38813)class_15512);
            }
        }
    }

    private void Method_44060() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_14246 Method_44061(int n) {
        return this.Method_44062(n);
    }

    public Class_23503 Method_44062(int n) {
        return (Class_23503)this.Field_44043.get(n);
    }

    public void Method_44063() {
        if (this.Field_44045 < this.Field_44040.length - (20901 & 10307)) {
            this.Method_44055(this.Field_44045 + (19713 & 4621));
        }
    }

    public void Method_44064(boolean bl) {
        for (Class_23503 class_23503 : this.Field_44043) {
            if (Class_23503.Method_23511(class_23503) instanceof Class_42376) {
                ((Class_42376)Class_23503.Method_23511((Class_23503)class_23503)).Field_42388 = bl;
            }
            if (!(Class_23503.Method_23525(class_23503) instanceof Class_42376)) continue;
            ((Class_42376)Class_23503.Method_23525((Class_23503)class_23503)).Field_42388 = bl;
        }
    }

    private Class_36766 Method_44065(int n, int n2, Class_15395 class_15395, boolean bl) {
        Class_36766 class_36766 = bl ? new Class_36766(this.\u0000, `.Field_27, class_15395.\u0000strictfp(), n, n2, this.\u0000, ` - n * (4114 & 2434), 3860 & -32585, -1 & -1) : new Class_36766(this.\u0000, `.Field_27, class_15395.\u0000strictfp(), n, n2, 2966 & 5279, 9524 & 532, -1 & -1);
        class_36766.Field_36771 = class_15395.\u0000, `();
        class_36766.Method_36782(class_15395.\u0000strictfp());
        class_36766.Method_36786();
        return class_36766;
    }

    public int Method_44066() {
        return this.Field_44045;
    }

    public int Method_44067() {
        return this.Field_44043.size();
    }

    public Class_1551 Method_44068(int n) {
        return (Class_1551)this.Field_44042.Method_29447(n);
    }

    private Class_38813 Method_44069(int n, int n2, Class_18167 class_18167) {
        Class_38813 class_38813 = new Class_38813(class_18167.\u0000strictfp(), this.\u0000, `.Field_27, n, n2, 479 & -26986, -28651 & 2324);
        class_38813.Method_38853(class_18167.\u0000strictfp());
        class_38813.Method_38841(this.Field_44041);
        class_38813.Method_38864(class_18167.\u0000, `());
        class_38813.Method_38844(class_18167.Method_18169());
        return class_38813;
    }

    public int Method_44070() {
        return -30224 & 9108;
    }

    public Class_1551 Method_44071() {
        return this.Field_44044;
    }
}

