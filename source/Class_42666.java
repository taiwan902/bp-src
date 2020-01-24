/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.base.Objects$ToStringHelper
 */
import com.google.common.base.Objects;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42666 {
    public int Field_42667;
    public int Field_42668;
    public int Field_42669;
    public int Field_42670;
    public int Field_42671;
    public int Field_42672;

    public static Class_42666 Method_42673(int n, int n2, int n3, int n4, int n5, int n6) {
        return new Class_42666(Math.min(n, n4), Math.min(n2, n5), Math.min(n3, n6), Math.max(n, n4), Math.max(n2, n5), Math.max(n3, n6));
    }

    public Class_37367 Method_42674() {
        int[] arrn = new int[9686 & 4646];
        arrn[8193 & -27422] = this.Field_42668;
        arrn[785 & 20513] = this.Field_42672;
        arrn[34 & -9982] = this.Field_42669;
        arrn[347 & 515] = this.Field_42670;
        arrn[19620 & 12310] = this.Field_42671;
        arrn[-32435 & 533] = this.Field_42667;
        return new Class_37367(arrn);
    }

    public Class_4792 Method_42675() {
        return new Class_4792(this.Field_42670 - this.Field_42668, this.Field_42671 - this.Field_42672, this.Field_42667 - this.Field_42669);
    }

    public Class_42666(int[] arrn) {
        if (arrn.length == (21414 & 10310)) {
            this.Field_42668 = arrn[8280 & -15226];
            this.Field_42672 = arrn[5193 & 16529];
            this.Field_42669 = arrn[4251 & 25154];
            this.Field_42670 = arrn[1027 & 25159];
            this.Field_42671 = arrn[8196 & -15788];
            this.Field_42667 = arrn[37 & 461];
        }
    }

    public int Method_42676() {
        return this.Field_42667 - this.Field_42669 + (-31415 & 6147);
    }

    public void Method_42677(int n, int n2, int n3) {
        this.Field_42668 += n;
        this.Field_42672 += n2;
        this.Field_42669 += n3;
        this.Field_42670 += n;
        this.Field_42671 += n2;
        this.Field_42667 += n3;
    }

    private void Method_42678() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_42679(int n, int n2, int n3, int n4) {
        return (this.Field_42670 >= n && this.Field_42668 <= n3 && this.Field_42667 >= n2 && this.Field_42669 <= n4 ? 4801 & 271 : 1552 & 4361) != 0;
    }

    public Class_42666(int n, int n2, int n3, int n4, int n5, int n6) {
        this.Field_42668 = n;
        this.Field_42672 = n2;
        this.Field_42669 = n3;
        this.Field_42670 = n4;
        this.Field_42671 = n5;
        this.Field_42667 = n6;
    }

    public Class_42666(int n, int n2, int n3, int n4) {
        this.Field_42668 = n;
        this.Field_42669 = n2;
        this.Field_42670 = n3;
        this.Field_42667 = n4;
        this.Field_42672 = 13 & 2177;
        this.Field_42671 = 22024 & 8818;
    }

    public boolean Method_42680(Class_42666 class_42666) {
        return (this.Field_42670 >= class_42666.Field_42668 && this.Field_42668 <= class_42666.Field_42670 && this.Field_42667 >= class_42666.Field_42669 && this.Field_42669 <= class_42666.Field_42667 && this.Field_42671 >= class_42666.Field_42672 && this.Field_42672 <= class_42666.Field_42671 ? 12379 & 37 : 124 & -29695) != 0;
    }

    public Class_42666() {
    }

    public Class_4792 Method_42681() {
        return new Class_4751(this.Field_42668 + (this.Field_42670 - this.Field_42668 + (-14847 & 193)) / (4115 & 8642), this.Field_42672 + (this.Field_42671 - this.Field_42672 + (2065 & -32223)) / (4270 & 11779), this.Field_42669 + (this.Field_42667 - this.Field_42669 + (18443 & -32751)) / (-32494 & 18626));
    }

    public static Class_42666 Method_42682(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, Class_4595 class_4595) {
        switch (Class_15724.Field_15725[class_4595.ordinal()]) {
            case 1: {
                return new Class_42666(n + n4, n2 + n5, n3 - n9 + (2081 & 577) + n6, n + n7 - (-8169 & 65) + n4, n2 + n8 - (16517 & 5121) + n5, n3 + n6);
            }
            case 2: {
                return new Class_42666(n + n4, n2 + n5, n3 + n6, n + n7 - (6529 & -6597) + n4, n2 + n8 - (585 & 16643) + n5, n3 + n9 - (1361 & -7539) + n6);
            }
            case 3: {
                return new Class_42666(n - n9 + (-32757 & 30977) + n6, n2 + n5, n3 + n4, n + n6, n2 + n8 - (641 & -14321) + n5, n3 + n7 - (-28351 & 641) + n4);
            }
            case 4: {
                return new Class_42666(n + n6, n2 + n5, n3 + n4, n + n9 - (321 & 4097) + n6, n2 + n8 - (1041 & 8737) + n5, n3 + n7 - (6475 & 8325) + n4);
            }
        }
        return new Class_42666(n + n4, n2 + n5, n3 + n6, n + n7 - (8197 & 1641) + n4, n2 + n8 - (12293 & -32255) + n5, n3 + n9 - (513 & 21561) + n6);
    }

    public boolean Method_42683(Class_4792 class_4792) {
        return (class_4792.Method_4807() >= this.Field_42668 && class_4792.Method_4807() <= this.Field_42670 && class_4792.Method_4809() >= this.Field_42669 && class_4792.Method_4809() <= this.Field_42667 && class_4792.Method_4806() >= this.Field_42672 && class_4792.Method_4806() <= this.Field_42671 ? 341 & 5121 : 16598 & -32256) != 0;
    }

    public static Class_42666 Method_42684() {
        return new Class_42666(Integer.MAX_VALUE & -1, -1 & Integer.MAX_VALUE, Integer.MAX_VALUE & -1, -1003474048 & -1853880275, -1600126336 & -1928309728, -2080286720 & -2086141681);
    }

    public String Method_42685() {
        return Objects.toStringHelper((Object)this).add("x0", this.Field_42668).add("y0", this.Field_42672).add("z0", this.Field_42669).add("x1", this.Field_42670).add("y1", this.Field_42671).add("z1", this.Field_42667).toString();
    }

    public int Method_42686() {
        return this.Field_42671 - this.Field_42672 + (-30207 & 4335);
    }

    public int Method_42687() {
        return this.Field_42670 - this.Field_42668 + (-32763 & 4545);
    }

    public void Method_42688(Class_42666 class_42666) {
        this.Field_42668 = Math.min(this.Field_42668, class_42666.Field_42668);
        this.Field_42672 = Math.min(this.Field_42672, class_42666.Field_42672);
        this.Field_42669 = Math.min(this.Field_42669, class_42666.Field_42669);
        this.Field_42670 = Math.max(this.Field_42670, class_42666.Field_42670);
        this.Field_42671 = Math.max(this.Field_42671, class_42666.Field_42671);
        this.Field_42667 = Math.max(this.Field_42667, class_42666.Field_42667);
    }

    public Class_42666(Class_4792 class_4792, Class_4792 class_47922) {
        this.Field_42668 = Math.min(class_4792.Method_4807(), class_47922.Method_4807());
        this.Field_42672 = Math.min(class_4792.Method_4806(), class_47922.Method_4806());
        this.Field_42669 = Math.min(class_4792.Method_4809(), class_47922.Method_4809());
        this.Field_42670 = Math.max(class_4792.Method_4807(), class_47922.Method_4807());
        this.Field_42671 = Math.max(class_4792.Method_4806(), class_47922.Method_4806());
        this.Field_42667 = Math.max(class_4792.Method_4809(), class_47922.Method_4809());
    }
}

