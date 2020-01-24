/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_21684
extends Class_1956 {
    public void Method_21685(Class_23823 class_23823, Class_626 class_626, List list, boolean bl) {
        super.Method_2003(class_23823, class_626, list, bl);
        Class_1758 class_1758 = this.Method_21691(class_23823);
        if (class_1758 != null) {
            for (int i = -32768 & 16548; i < class_1758.Method_1772(); ++i) {
                short s = class_1758.Method_1768(i).Method_1726("id");
                short s2 = class_1758.Method_1768(i).Method_1726("lvl");
                if (Class_30635.Method_30685(s) == null) continue;
                list.add(Class_30635.Method_30685(s).Method_30706(s2));
            }
        }
    }

    public void Method_21686(Class_23823 class_23823, Class_38800 class_38800) {
        Class_1758 class_1758 = this.Method_21691(class_23823);
        int n = -15327 & 75;
        for (int i = -31968 & 29761; i < class_1758.Method_1772(); ++i) {
            Class_1699 class_1699 = class_1758.Method_1768(i);
            if (class_1699.Method_1726("id") != class_38800.Field_38802.Field_30638) continue;
            if (class_1699.Method_1726("lvl") < class_38800.Field_38801) {
                class_1699.Method_1731("lvl", (short)class_38800.Field_38801);
            }
            n = 8971 & 3108;
            break;
        }
        if (n != 0) {
            Class_1699 class_1699 = new Class_1699();
            class_1699.Method_1731("id", (short)class_38800.Field_38802.Field_30638);
            class_1699.Method_1731("lvl", (short)class_38800.Field_38801);
            class_1758.Method_1781(class_1699);
        }
        if (!class_23823.Method_23842()) {
            class_23823.Method_23869(new Class_1699());
        }
        class_23823.Method_23845().Method_1744("StoredEnchantments", class_1758);
    }

    public Class_36948 Method_21687(Random random) {
        return this.Method_21688(random, 14789 & 16401, -32685 & 8193, 1161 & -26623);
    }

    public Class_36948 Method_21688(Random random, int n, int n2, int n3) {
        Class_23823 class_23823 = new Class_23823(Class_10527.Field_10629, -15819 & 3331, 4675 & -15328);
        Class_29642.Method_29673(random, class_23823, -32482 & 9246);
        return new Class_36948(class_23823, n, n2, n3);
    }

    public boolean Method_21689(Class_23823 class_23823) {
        return (21505 & 577) != 0;
    }

    private void Method_21690() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1758 Method_21691(Class_23823 class_23823) {
        Class_1699 class_1699 = class_23823.Method_23845();
        return class_1699 != null && class_1699.Method_1715("StoredEnchantments", 29193 & -32695) ? (Class_1758)class_1699.Method_1720("StoredEnchantments") : new Class_1758();
    }

    public void Method_21692(Class_30635 class_30635, List list) {
        for (int i = class_30635.Method_30696(); i <= class_30635.Method_30672(); ++i) {
            list.add(this.Method_21695(new Class_38800(class_30635, i)));
        }
    }

    public boolean Method_21693(Class_23823 class_23823) {
        return (4608 & 17486) != 0;
    }

    public Class_41140 Method_21694(Class_23823 class_23823) {
        return this.Method_21691(class_23823).Method_1772() > 0 ? Class_41140.Field_41145 : super.Method_2022(class_23823);
    }

    public Class_23823 Method_21695(Class_38800 class_38800) {
        Class_23823 class_23823 = new Class_23823(this);
        this.Method_21686(class_23823, class_38800);
        return class_23823;
    }
}

