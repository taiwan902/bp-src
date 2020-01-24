/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Mouse
 */
import internal.org.lwjgl.input.Mouse;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Class_29028
extends Class_6841 {
    protected int Field_29029;
    protected int Field_29030;
    protected int Field_29031;
    final Class_16456 Field_29032;
    protected Comparator Field_29033;
    protected List Field_29034;

    protected final Class_22538 Method_29035(int n) {
        return (Class_22538)this.Field_29034.get(n);
    }

    protected void Method_29036(int n, boolean bl, int n2, int n3) {
    }

    private void Method_29037() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected boolean Method_29038(int n) {
        return (9257 & -28410) != 0;
    }

    protected void Method_29039(int n) {
        if (n != this.Field_29030) {
            this.Field_29030 = n;
            this.Field_29029 = -1 & -1;
        } else if (this.Field_29029 == (-1 & -1)) {
            this.Field_29029 = 2051 & 129;
        } else {
            this.Field_29030 = -1 & -1;
            this.Field_29029 = -12216 & 1170;
        }
        Collections.sort(this.Field_29034, this.Field_29033);
    }

    protected void Method_29040(int n, int n2, Class_7644 class_7644) {
        if (!Mouse.isButtonDown((int)(-12672 & 4352))) {
            this.Field_29031 = -1 & -1;
        }
        if (this.Field_29031 == 0) {
            this.Field_29032.Method_16491(n + (16507 & 1143) - (16407 & 4370), n2 + (577 & 8353), 4380 & 8194, 8 & 29825);
        } else {
            this.Field_29032.Method_16491(n + (16755 & 1275) - (50 & -6113), n2 + (9731 & -32499), 16432 & -32375, -32237 & 24698);
        }
        if (this.Field_29031 == (293 & 193)) {
            this.Field_29032.Method_16491(n + (2789 & 1191) - (11090 & 20506), n2 + (16385 & 753), -14268 & 1040, 12817 & 2176);
        } else {
            this.Field_29032.Method_16491(n + (-30553 & 1253) - (658 & 16499), n2 + (1289 & 609), 16528 & -25082, 1943 & -32750);
        }
        if (this.Field_29031 == (7082 & 16402)) {
            this.Field_29032.Method_16491(n + (17623 & 2519) - (-24294 & 50), n2 + (16907 & 3073), 16404 & -27160, 140 & -32495);
        } else {
            this.Field_29032.Method_16491(n + (215 & 27359) - (2642 & -15310), n2 + (21027 & 1169), -20208 & 3144, 82 & 22);
        }
        if (this.Field_29030 != (-1 & -1)) {
            int n3 = -23473 & 127;
            int n4 = -32486 & 22550;
            if (this.Field_29030 == (-26367 & 25683)) {
                n3 = 21633 & 9093;
            } else if (this.Field_29030 == (17530 & 131)) {
                n3 = 18675 & -31041;
            }
            if (this.Field_29029 == (13417 & -32251)) {
                n4 = 1590 & -5916;
            }
            this.Field_29032.Method_16491(n + n3, n2 + (20633 & -22489), n4, 4280 & 16388);
        }
    }

    protected void Method_29041(int n, int n2) {
        if (n2 >= this.\u0000% && n2 <= this.\u0000= switch) {
            int n3 = this.\u0000strictfp(n, n2);
            int n4 = this.\u0000, ` / (1058 & 3026) - (3164 & 16508) - (21904 & 10266);
            if (n3 >= 0) {
                if (n < n4 + (-14040 & 572) || n > n4 + (10607 & 5288) + (16405 & 4508)) {
                    return;
                }
                Class_22538 class_22538 = this.Method_29035(n3);
                this.Method_29046(class_22538, n, n2);
            } else {
                String string = "";
                if (n >= n4 + (371 & 16499) - (-24077 & 18) && n <= n4 + (119 & 9587)) {
                    string = this.Method_29047(6177 & -32238);
                } else if (n >= n4 + (-22875 & 20919) - (8506 & -12270) && n <= n4 + (4277 & 18917)) {
                    string = this.Method_29047(19073 & 4119);
                } else {
                    if (n < n4 + (1239 & 19159) - (6170 & -31885) || n > n4 + (19159 & -19241)) {
                        return;
                    }
                    string = this.Method_29047(16419 & 8710);
                }
                string = ("" + Class_9802.Method_9806(string, new Object[-30196 & 4144])).trim();
                if (string.length() > 0) {
                    int n5 = n + (-26337 & 716);
                    int n6 = n2 - (6158 & 16669);
                    int n7 = Class_16456.Method_16486(this.Field_29032).Method_28715(string);
                    Class_16456.Method_16477(this.Field_29032, n5 - (-27049 & 16419), n6 - (4099 & 3395), n5 + n7 + (-22329 & 1059), n6 + (12553 & 2622) + (-24053 & 2403), -1033321948 & -670957496, -771091334 & -1049361920);
                    Class_16456.Method_16480(this.Field_29032).Method_28729(string, n5, n6, -1 & -1);
                }
            }
        }
    }

    protected Class_29028(Class_16456 class_16456, Class_18 class_18) {
        this.Field_29032 = class_16456;
        super(class_18, class_16456.\u0000= final, class_16456.\u0000, `, -31704 & 9120, class_16456.\u0000, ` - (-28592 & 66), -32547 & 8726);
        this.Field_29031 = -1 & -1;
        this.Field_29030 = -1 & -1;
        this.\u0000= final((22017 & 2240) != 0);
        this.\u0000strictfp((17 & 1089) != 0, -28522 & 1556);
    }

    protected void Method_29042(Class_13017 class_13017, int n, int n2, boolean bl) {
        if (class_13017 != null) {
            String string = class_13017.Method_13043(Class_16456.Method_16469(this.Field_29032).Method_25501(class_13017));
            this.Field_29032.\u0000, `(Class_16456.Method_16498(this.Field_29032), string, n - Class_16456.Method_16485(this.Field_29032).Method_28715(string), n2 + (-30529 & 17157), bl ? 234881023 & 1358954495 : 351900062 & 43167888);
        } else {
            String string = "-";
            this.Field_29032.\u0000, `(Class_16456.Method_16493(this.Field_29032), string, n - Class_16456.Method_16490(this.Field_29032).Method_28715(string), n2 + (-22483 & 16645), bl ? 150994943 & -1325400065 : 10023065 & 548444370);
        }
    }

    protected void Method_29043(int n, int n2) {
        this.Field_29031 = -1 & -1;
        if (n >= (-23713 & 2127) && n < (4723 & 8563)) {
            this.Field_29031 = 2562 & -12215;
        } else if (n >= (-30289 & 193) && n < (437 & 3237)) {
            this.Field_29031 = 18435 & 8197;
        } else if (n >= (699 & 22707) && n < (223 & 8663)) {
            this.Field_29031 = -13918 & 10;
        }
        if (this.Field_29031 >= 0) {
            this.Method_29039(this.Field_29031);
            this.\u0000, `.Method_245().Method_29119(Class_29471.Method_29474(new Class_2080("gui.button.press"), 1.0f));
        }
    }

    protected void Method_29044() {
        this.Field_29032.\u0000, 2();
    }

    protected final int Method_29045() {
        return this.Field_29034.size();
    }

    protected void Method_29046(Class_22538 class_22538, int n, int n2) {
        if (class_22538 != null) {
            Class_1956 class_1956 = class_22538.Method_22541();
            Class_23823 class_23823 = new Class_23823(class_1956);
            String string = class_23823.Method_23893();
            String string2 = ("" + Class_9802.Method_9806(string + ".name", new Object[24577 & -28670])).trim();
            if (string2.length() > 0) {
                int n3 = n + (17421 & -32468);
                int n4 = n2 - (8524 & -32708);
                int n5 = Class_16456.Method_16492(this.Field_29032).Method_28715(string2);
                Class_16456.Method_16474(this.Field_29032, n3 - (6467 & 8211), n4 - (7 & 6659), n3 + n5 + (7179 & -32765), n4 + (808 & 4104) + (1059 & -14329), -96165752 & -1056958463, -229629918 & -930344947);
                Class_16456.Method_16466(this.Field_29032).Method_28729(string2, n3, n4, -1 & -1);
            }
        }
    }

    protected abstract String Method_29047(int var1);
}

