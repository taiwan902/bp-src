/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;

public class Class_39639
extends Class_4981
implements Class_36377,
Class_5591 {
    private static final int[] Field_39640;
    private Class_1956 Field_39641;
    private boolean[] Field_39642;
    private String Field_39643;
    private static final int[] Field_39644;
    private int Field_39645;
    private Class_23823[] Field_39646 = new Class_23823[-21980 & 17413];

    public void Method_39647() {
        for (int i = 4 & 3264; i < this.Field_39646.length; ++i) {
            this.Field_39646[i] = null;
        }
    }

    public int Method_39648(int n) {
        switch (n) {
            case 0: {
                return this.Field_39645;
            }
        }
        return -22000 & 17761;
    }

    public void Method_39649(Class_626 class_626) {
    }

    public void Method_39650() {
        boolean[] arrbl;
        if (this.Field_39645 > 0) {
            this.Field_39645 -= -30683 & 1665;
            if (this.Field_39645 == 0) {
                this.Method_39653();
                this.\u0000, for();
            } else if (!this.Method_39656()) {
                this.Field_39645 = 17927 & 6208;
                this.\u0000, for();
            } else if (this.Field_39641 != this.Field_39646[12787 & 16387].Method_23844()) {
                this.Field_39645 = -32110 & 1312;
                this.\u0000, for();
            }
        } else if (this.Method_39656()) {
            this.Field_39645 = 18896 & 4497;
            this.Field_39641 = this.Field_39646[-30205 & 8259].Method_23844();
        }
        if (!this.\u0000strictfp.Field_306 && !Arrays.equals(arrbl = this.Method_39665(), this.Field_39642)) {
            this.Field_39642 = arrbl;
            Class_3436 class_3436 = this.\u0000strictfp.Method_375(this.\u0000strictfp());
            if (!(class_3436.Method_3442() instanceof Class_8186)) {
                return;
            }
            for (int i = -22999 & 22784; i < Class_8186.Field_8187.length; ++i) {
                class_3436 = class_3436.Method_3437(Class_8186.Field_8187[i], Boolean.valueOf(arrbl[i]));
            }
            this.\u0000strictfp.Method_462(this.\u0000strictfp, class_3436, -7933 & 98);
        }
    }

    public boolean Method_39651(int n, Class_23823 class_23823, Class_4595 class_4595) {
        return this.Method_39657(n, class_23823);
    }

    public boolean Method_39652() {
        return (this.Field_39643 != null && this.Field_39643.length() > 0 ? 8457 & 4101 : 8323 & 16416) != 0;
    }

    private void Method_39653() {
        if (this.Method_39656()) {
            Class_23823 class_23823 = this.Field_39646[587 & -23517];
            for (int i = 8856 & 18438; i < (235 & 8195); ++i) {
                if (this.Field_39646[i] == null || this.Field_39646[i].Method_23844() != Class_10527.Field_10687) continue;
                int n = this.Field_39646[i].Method_23843();
                int n2 = this.Method_39663(n, class_23823);
                List list = Class_10527.Field_10687.Method_4114(n);
                List list2 = Class_10527.Field_10687.Method_4114(n2);
                if (n > 0 && list == list2 || list != null && (list.equals(list2) || list2 == null)) {
                    if (Class_4104.Method_4120(n) || !Class_4104.Method_4120(n2)) continue;
                    this.Field_39646[i].Method_23849(n2);
                    continue;
                }
                if (n == n2) continue;
                this.Field_39646[i].Method_23849(n2);
            }
            if (class_23823.Method_23844().Method_2024()) {
                this.Field_39646[1739 & 24835] = new Class_23823(class_23823.Method_23844().Method_1991());
            } else {
                this.Field_39646[259 & -30581].Field_23826 -= 97 & 5379;
                if (this.Field_39646[16579 & 2819].Field_23826 <= 0) {
                    this.Field_39646[-28669 & 87] = null;
                }
            }
        }
    }

    public int Method_39654() {
        return 20993 & -32331;
    }

    public void Method_39655(String string) {
        this.Field_39643 = string;
    }

    private boolean Method_39656() {
        if (this.Field_39646[13059 & 16603] != null && this.Field_39646[23571 & -32533].Field_23826 > 0) {
            Class_23823 class_23823 = this.Field_39646[4707 & -23541];
            if (!class_23823.Method_23844().Method_1970(class_23823)) {
                return (3266 & 24584) != 0;
            }
            int n = 5776 & 10498;
            for (int i = 4740 & -30623; i < (3 & -9009); ++i) {
                if (this.Field_39646[i] == null || this.Field_39646[i].Method_23844() != Class_10527.Field_10687) continue;
                int n2 = this.Field_39646[i].Method_23843();
                int n3 = this.Method_39663(n2, class_23823);
                if (!Class_4104.Method_4120(n2) && Class_4104.Method_4120(n3)) {
                    n = 10241 & 16825;
                    break;
                }
                List list = Class_10527.Field_10687.Method_4114(n2);
                List list2 = Class_10527.Field_10687.Method_4114(n3);
                if (n2 > 0 && list == list2 || list != null && (list.equals(list2) || list2 == null) || n2 == n3) continue;
                n = 389 & -32703;
                break;
            }
            return n != 0;
        }
        return (-29179 & 16770) != 0;
    }

    public boolean Method_39657(int n, Class_23823 class_23823) {
        return (n == (-7177 & 6147) ? class_23823.Method_23844().Method_1970(class_23823) : (class_23823.Method_23844() == Class_10527.Field_10687 || class_23823.Method_23844() == Class_10527.Field_10666 ? 8197 & 19 : 4116 & -22653)) != 0;
    }

    public int[] Method_39658(Class_4595 class_4595) {
        return class_4595 == Class_4595.Field_4601 ? Field_39640 : Field_39644;
    }

    public Class_8295 Method_39659(Class_37781 class_37781, Class_626 class_626) {
        return new Class_18889(class_37781, this);
    }

    public Class_23823 Method_39660(int n, int n2) {
        if (n >= 0 && n < this.Field_39646.length) {
            Class_23823 class_23823 = this.Field_39646[n];
            this.Field_39646[n] = null;
            return class_23823;
        }
        return null;
    }

    public void Method_39661(int n, Class_23823 class_23823) {
        if (n >= 0 && n < this.Field_39646.length) {
            this.Field_39646[n] = class_23823;
        }
    }

    public int Method_39662() {
        return this.Field_39646.length;
    }

    private int Method_39663(int n, Class_23823 class_23823) {
        return class_23823 == null ? n : (class_23823.Method_23844().Method_1970(class_23823) ? Class_12264.Method_12338(n, class_23823.Method_23844().Method_2018(class_23823)) : n);
    }

    public Class_23823 Method_39664(int n) {
        return n >= 0 && n < this.Field_39646.length ? this.Field_39646[n] : null;
    }

    public boolean[] Method_39665() {
        boolean[] arrbl = new boolean[11 & 1795];
        for (int i = -3648 & 1024; i < (12351 & 16579); ++i) {
            if (this.Field_39646[i] == null) continue;
            arrbl[i] = 8997 & 5195;
        }
        return arrbl;
    }

    static {
        int[] arrn = new int[-32747 & 3];
        arrn[10252 & 1330] = 2051 & 5683;
        Field_39640 = arrn;
        int[] arrn2 = new int[5143 & 10275];
        arrn2[8228 & 17600] = -31736 & 6230;
        arrn2[23605 & 259] = 17409 & 433;
        arrn2[16770 & -26094] = 1810 & -24574;
        Field_39644 = arrn2;
    }

    public int Method_39666() {
        return 1112 & 16833;
    }

    public void Method_39667(Class_1699 class_1699) {
        super.Method_4984(class_1699);
        Class_1758 class_1758 = class_1699.Method_1735("Items", 11566 & 26);
        this.Field_39646 = new Class_23823[this.Method_39662()];
        for (int i = 17286 & -22527; i < class_1758.Method_1772(); ++i) {
            Class_1699 class_16992 = class_1758.Method_1768(i);
            byte by = class_16992.Method_1716("Slot");
            if (by < 0 || by >= this.Field_39646.length) continue;
            this.Field_39646[by] = Class_23823.Method_23840(class_16992);
        }
        this.Field_39645 = class_1699.Method_1726("BrewTime");
        if (class_1699.Method_1715("CustomName", 265 & 18444)) {
            this.Field_39643 = class_1699.Method_1708("CustomName");
        }
    }

    public void Method_39668(Class_626 class_626) {
    }

    public boolean Method_39669(Class_626 class_626) {
        return (this.\u0000strictfp.Method_429(this.\u0000strictfp) != this ? -32496 & 6154 : (class_626.\u0000strictfp((double)this.\u0000strictfp.\u0000= final() + 0.6287878787878788 * 0.7951807228915663, (double)this.\u0000strictfp.\u0000, `() + 2.064516129032258 * 0.2421875, (double)this.\u0000strictfp.\u0000strictfp() + 0.25 * 2.0) <= 64.0 * 1.0 ? 3175 & 4361 : 4100 & 25602)) != 0;
    }

    public String Method_39670() {
        return "minecraft:brewing_stand";
    }

    public void Method_39671(int n, int n2) {
        switch (n) {
            case 0: {
                this.Field_39645 = n2;
            }
        }
    }

    public Class_23823 Method_39672(int n) {
        if (n >= 0 && n < this.Field_39646.length) {
            Class_23823 class_23823 = this.Field_39646[n];
            this.Field_39646[n] = null;
            return class_23823;
        }
        return null;
    }

    public boolean Method_39673(int n, Class_23823 class_23823, Class_4595 class_4595) {
        return (5123 & 16385) != 0;
    }

    public void Method_39674(Class_1699 class_1699) {
        super.Method_4989(class_1699);
        class_1699.Method_1731("BrewTime", (short)this.Field_39645);
        Class_1758 class_1758 = new Class_1758();
        for (int i = 330 & 19605; i < this.Field_39646.length; ++i) {
            if (this.Field_39646[i] == null) continue;
            Class_1699 class_16992 = new Class_1699();
            class_16992.Method_1724("Slot", (byte)i);
            this.Field_39646[i].Method_23841(class_16992);
            class_1758.Method_1781(class_16992);
        }
        class_1699.Method_1744("Items", class_1758);
        if (this.Method_39652()) {
            class_1699.Method_1702("CustomName", this.Field_39643);
        }
    }

    private void Method_39675() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_39676() {
        return this.Method_39652() ? this.Field_39643 : "container.brewing";
    }
}

