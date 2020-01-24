/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_8719 {
    private static final String[] Field_8720;
    private static final int Field_8721;
    private String[] Field_8722 = Field_8720;
    private String[] Field_8723 = Field_8720;

    public void Method_8724(Class_1699 class_1699) {
        if (class_1699.Method_1715("CommandStats", 16650 & 2715)) {
            Class_1699 class_16992 = class_1699.Method_1703("CommandStats");
            Class_26261[] arrclass_26261 = Class_26261.Method_26286();
            int n = arrclass_26261.length;
            for (int i = 20 & 18952; i < n; ++i) {
                Class_26261 class_26261 = arrclass_26261[i];
                String string = class_26261.Method_26279() + "Name";
                String string2 = class_26261.Method_26279() + "Objective";
                if (!class_16992.Method_1715(string, -32247 & 4426) || !class_16992.Method_1715(string2, 18574 & -20216)) continue;
                String string3 = class_16992.Method_1708(string);
                String string4 = class_16992.Method_1708(string2);
                Class_8719.Method_8728(this, class_26261, string3, string4);
            }
        }
    }

    public void Method_8725(Class_1699 class_1699) {
        Class_1699 class_16992 = new Class_1699();
        Class_26261[] arrclass_26261 = Class_26261.Method_26286();
        int n = arrclass_26261.length;
        for (int i = 1042 & -32727; i < n; ++i) {
            Class_26261 class_26261 = arrclass_26261[i];
            String string = this.Field_8723[class_26261.Method_26270()];
            String string2 = this.Field_8722[class_26261.Method_26270()];
            if (string == null || string2 == null) continue;
            class_16992.Method_1702(class_26261.Method_26279() + "Name", string);
            class_16992.Method_1702(class_26261.Method_26279() + "Objective", string2);
        }
        if (!class_16992.Method_1736()) {
            class_1699.Method_1744("CommandStats", class_16992);
        }
    }

    private static void Method_8726(Class_8719 class_8719, Class_26261 class_26261) {
        if (class_8719.Field_8723 != Field_8720 && class_8719.Field_8722 != Field_8720) {
            class_8719.Field_8723[class_26261.Method_26270()] = null;
            class_8719.Field_8722[class_26261.Method_26270()] = null;
            int n = 6487 & -7159;
            Class_26261[] arrclass_26261 = Class_26261.Method_26286();
            int n2 = arrclass_26261.length;
            for (int i = 1095 & 10800; i < n2; ++i) {
                Class_26261 class_262612 = arrclass_26261[i];
                if (class_8719.Field_8723[class_262612.Method_26270()] == null || class_8719.Field_8722[class_262612.Method_26270()] == null) continue;
                n = 512 & 13569;
                break;
            }
            if (n != 0) {
                class_8719.Field_8723 = Field_8720;
                class_8719.Field_8722 = Field_8720;
            }
        }
    }

    public void Method_8727(Class_8719 class_8719) {
        Class_26261[] arrclass_26261 = Class_26261.Method_26286();
        int n = arrclass_26261.length;
        for (int i = 5136 & 269; i < n; ++i) {
            Class_26261 class_26261 = arrclass_26261[i];
            Class_8719.Method_8728(this, class_26261, class_8719.Field_8723[class_26261.Method_26270()], class_8719.Field_8722[class_26261.Method_26270()]);
        }
    }

    public static void Method_8728(Class_8719 class_8719, Class_26261 class_26261, String string, String string2) {
        if (string != null && string.length() != 0 && string2 != null && string2.length() != 0) {
            if (class_8719.Field_8723 == Field_8720 || class_8719.Field_8722 == Field_8720) {
                class_8719.Field_8723 = new String[Field_8721];
                class_8719.Field_8722 = new String[Field_8721];
            }
            class_8719.Field_8723[class_26261.Method_26270()] = string;
            class_8719.Field_8722[class_26261.Method_26270()] = string2;
        } else {
            Class_8719.Method_8726(class_8719, class_26261);
        }
    }

    public void Method_8729(Class_1367 class_1367, Class_26261 class_26261, int n) {
        String string = this.Field_8723[class_26261.Method_26270()];
        if (string != null) {
            String string2;
            Class_20976 class_20976;
            Class_7873 class_7873;
            Class_47202 class_47202 = new Class_47202(this, class_1367);
            try {
                string2 = Class_36787.Method_36830(class_47202, string);
            }
            catch (\u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized \u0000final ~ 6 ' 0 | try - " 4 switch const if this 3 " throw int import * volatile return 9 ~ super void 5 3 5 implements float for - super false double continue throws true public 9 true | false , ] float do double float ` public if null static do synchronized2) {
                return;
            }
            String string3 = this.Field_8722[class_26261.Method_26270()];
            if (string3 != null && (class_7873 = (class_20976 = class_1367.Method_1375().Method_357()).Method_21003(string3)) != null && class_20976.Method_21011(string2, class_7873)) {
                Class_21696 class_21696 = class_20976.Method_20993(string2, class_7873);
                class_21696.Method_21709(n);
            }
        }
    }

    private void Method_8730() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_8721 = Class_26261.Method_26286().length;
        Field_8720 = new String[Field_8721];
    }
}

