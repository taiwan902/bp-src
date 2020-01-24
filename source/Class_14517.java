/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_14517
extends ArrayList {
    public Class_14517() {
    }

    private void Method_14518() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private boolean Method_14519(Class_23823 class_23823, Class_23823 class_238232) {
        return (Class_23823.Method_23886(class_23823, class_238232) && (!class_238232.Method_23842() || class_23823.Method_23842() && Class_25852.Method_25854(class_238232.Method_23845(), class_23823.Method_23845(), (26785 & 5440) != 0)) ? 11169 & 5129 : -5968 & 4103) != 0;
    }

    public Class_6757 Method_14520(Class_23823 class_23823, Class_23823 class_238232, int n) {
        if (n > 0 && n < this.size()) {
            Class_6757 class_6757 = (Class_6757)this.get(n);
            return !this.Method_14519(class_23823, class_6757.Method_6770()) || (class_238232 != null || class_6757.Method_6775()) && (!class_6757.Method_6775() || !this.Method_14519(class_238232, class_6757.Method_6765())) || class_23823.Field_23826 < class_6757.Method_6770().Field_23826 || class_6757.Method_6775() && class_238232.Field_23826 < class_6757.Method_6765().Field_23826 ? null : class_6757;
        }
        for (int i = 14598 & 1568; i < this.size(); ++i) {
            Class_6757 class_6757 = (Class_6757)this.get(i);
            if (!this.Method_14519(class_23823, class_6757.Method_6770()) || class_23823.Field_23826 < class_6757.Method_6770().Field_23826 || (class_6757.Method_6775() || class_238232 != null) && (!class_6757.Method_6775() || !this.Method_14519(class_238232, class_6757.Method_6765()) || class_238232.Field_23826 < class_6757.Method_6765().Field_23826)) continue;
            return class_6757;
        }
        return null;
    }

    public void Method_14521(Class_1699 class_1699) {
        Class_1758 class_1758 = class_1699.Method_1735("Recipes", -26102 & 42);
        for (int i = -31869 & 4108; i < class_1758.Method_1772(); ++i) {
            Class_1699 class_16992 = class_1758.Method_1768(i);
            this.add(new Class_6757(class_16992));
        }
    }

    public void Method_14522(Class_29900 class_29900) {
        class_29900.Method_29949((byte)(this.size() & (4351 & -32001)));
        for (int i = 321 & -31612; i < this.size(); ++i) {
            Class_6757 class_6757 = (Class_6757)this.get(i);
            class_29900.Method_29984(class_6757.Method_6770());
            class_29900.Method_29984(class_6757.Method_6767());
            Class_23823 class_23823 = class_6757.Method_6765();
            class_29900.Method_29980((class_23823 != null ? 8753 & 20617 : 1300 & 6146) != 0);
            if (class_23823 != null) {
                class_29900.Method_29984(class_23823);
            }
            class_29900.Method_29980(class_6757.Method_6776());
            class_29900.Method_30010(class_6757.Method_6774());
            class_29900.Method_30010(class_6757.Method_6772());
        }
    }

    public static Class_14517 Method_14523(Class_29900 class_29900) {
        Class_14517 class_14517 = new Class_14517();
        int n = class_29900.Method_29944() & (255 & 7423);
        for (int i = 1092 & -12031; i < n; ++i) {
            Class_23823 class_23823 = class_29900.Method_30002();
            Class_23823 class_238232 = class_29900.Method_30002();
            Class_23823 class_238233 = null;
            if (class_29900.Method_29962()) {
                class_238233 = class_29900.Method_30002();
            }
            boolean bl = class_29900.Method_29962();
            int n2 = class_29900.Method_29914();
            int n3 = class_29900.Method_29914();
            Class_6757 class_6757 = new Class_6757(class_23823, class_238233, class_238232, n2, n3);
            if (bl) {
                class_6757.Method_6768();
            }
            class_14517.add(class_6757);
        }
        return class_14517;
    }

    public Class_14517(Class_1699 class_1699) {
        this.Method_14521(class_1699);
    }

    public Class_1699 Method_14524() {
        Class_1699 class_1699 = new Class_1699();
        Class_1758 class_1758 = new Class_1758();
        for (int i = -31724 & 4672; i < this.size(); ++i) {
            Class_6757 class_6757 = (Class_6757)this.get(i);
            class_1758.Method_1781(class_6757.Method_6769());
        }
        class_1699.Method_1744("Recipes", class_1758);
        return class_1699;
    }
}

