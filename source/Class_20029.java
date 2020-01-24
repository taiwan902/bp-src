/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_20029 {
    private String Field_20030;
    private int Field_20031;
    private String Field_20032;
    private String Field_20033;

    public boolean Method_20034(String string, String string2) {
        return (this.Method_20050(string) || this.Method_20050(string2) ? 51 & -31103 : 26980 & -32240) != 0;
    }

    public boolean Method_20035() {
        return (this.Field_20031 == (10259 & -31678) ? 12357 & 16899 : 6280 & -31914) != 0;
    }

    public boolean Method_20036() {
        return (this.Field_20031 == (1399 & -32250) ? 53 & 8385 : 8960 & -28501) != 0;
    }

    public String Method_20037() {
        return this.Field_20032;
    }

    public boolean Method_20038(String string, String string2, String string3, boolean bl) {
        return (this.Method_20051(string, string2, string3) && this.Method_20059() == bl ? -28601 & 17441 : 8193 & 1160) != 0;
    }

    public boolean Method_20039(String string, boolean bl) {
        return (this.Method_20050(string) && this.Method_20059() == bl ? 9 & -30061 : 50 & 24833) != 0;
    }

    public boolean Method_20040(String string) {
        return (this.Method_20035() && string.equals(this.Field_20033) ? 31553 & 5 : 19225 & 4130) != 0;
    }

    public boolean Method_20041(String string) {
        return (this.Method_20043() && string.equals(this.Field_20033) ? -32639 & 3625 : 4096 & -24478) != 0;
    }

    public boolean Method_20042() {
        return (this.Field_20031 == (24633 & -30651) ? -30703 & 417 : -32752 & 12297) != 0;
    }

    public boolean Method_20043() {
        return (this.Field_20031 == (-31925 & 4099) ? 17413 & 4313 : 8455 & 4096) != 0;
    }

    public boolean Method_20044(String string) {
        return (this.Method_20043() && this.Field_20033.endsWith(string) ? 3905 & 15 : 16928 & -32569) != 0;
    }

    private void Method_20045() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_20046(String string, boolean bl) {
        return (this.Method_20058(string) && this.Method_20059() == bl ? 385 & 10321 : -31725 & 22980) != 0;
    }

    public boolean Method_20047(String string, String string2) {
        return (this.Method_20053(string) && string2.equals(this.Field_20032) ? -7167 & 6333 : 132 & -27879) != 0;
    }

    public boolean Method_20048() {
        return (this.Field_20031 == (4293 & 25101) ? 19585 & -32749 : 273 & 19460) != 0;
    }

    public String Method_20049() {
        return this.Field_20033;
    }

    public boolean Method_20050(String string) {
        return (this.Method_20048() && string.equals(this.Field_20033) ? 2099 & 1033 : 24584 & -30443) != 0;
    }

    public boolean Method_20051(String string, String string2, String string3) {
        return (this.Method_20050(string) || this.Method_20050(string2) || this.Method_20050(string3) ? 4097 & 25185 : 4873 & 1088) != 0;
    }

    public Class_20029(int n, String string, String string2, String string3) {
        this.Field_20031 = n;
        this.Field_20033 = string;
        this.Field_20032 = string2;
        this.Field_20030 = string3;
    }

    public boolean Method_20052(String string, String string2, boolean bl) {
        return (this.Method_20034(string, string2) && this.Method_20059() == bl ? 24865 & 3609 : 4452 & -32632) != 0;
    }

    public boolean Method_20053(String string) {
        return (this.Method_20036() && string.equals(this.Field_20033) ? 22049 & 85 : 2320 & 4678) != 0;
    }

    public int Method_20054() {
        try {
            return Integer.parseInt(this.Field_20032);
        }
        catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("Invalid integer: " + this.Field_20032 + ", line: " + this.Field_20030);
        }
    }

    public float Method_20055() {
        try {
            return Float.parseFloat(this.Field_20032);
        }
        catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("Invalid float: " + this.Field_20032 + ", line: " + this.Field_20030);
        }
    }

    public boolean Method_20056(String string) {
        return (this.Method_20057() && string.equals(this.Field_20033) ? 273 & -27645 : -26170 & 1584) != 0;
    }

    public boolean Method_20057() {
        return (this.Field_20031 == (2316 & 4292) ? 4205 & -31485 : 24 & 1122) != 0;
    }

    public boolean Method_20058(String string) {
        return (this.Method_20048() && this.Field_20033.endsWith(string) ? 789 & 1089 : 4609 & -16120) != 0;
    }

    public boolean Method_20059() {
        String string = this.Field_20032.toLowerCase();
        if (!string.equals("true") && !string.equals("false")) {
            throw new RuntimeException("Invalid boolean: " + this.Field_20032 + ", line: " + this.Field_20030);
        }
        return Boolean.valueOf(this.Field_20032);
    }
}

