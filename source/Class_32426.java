/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32426
implements Class_19219 {
    private boolean Field_32427;
    private final int Field_32428;
    private final int Field_32429;
    private final Class_23823 Field_32430;
    private final Class_23823[] Field_32431;

    public boolean Method_32432(Class_43010 class_43010, Class_283 class_283) {
        for (int i = 16407 & 8; i <= (16519 & -24469) - this.Field_32429; ++i) {
            for (int j = 66 & -24319; j <= (-24541 & 19) - this.Field_32428; ++j) {
                if (this.Method_32434(class_43010, i, j, (8323 & 21557) != 0)) {
                    return (-32735 & 18515) != 0;
                }
                if (!this.Method_32434(class_43010, i, j, (-16118 & 8741) != 0)) continue;
                return (6467 & -24571) != 0;
            }
        }
        return (30749 & 1218) != 0;
    }

    public Class_23823 Method_32433() {
        return this.Field_32430;
    }

    private boolean Method_32434(Class_43010 class_43010, int n, int n2, boolean bl) {
        for (int i = -32768 & 16730; i < (67 & -26085); ++i) {
            for (int j = 24728 & 4929; j < (835 & 28803); ++j) {
                Class_23823 class_23823;
                int n3 = i - n;
                int n4 = j - n2;
                Class_23823 class_238232 = null;
                if (n3 >= 0 && n4 >= 0 && n3 < this.Field_32429 && n4 < this.Field_32428) {
                    class_238232 = bl ? this.Field_32431[this.Field_32429 - n3 - (-28159 & 11281) + n4 * this.Field_32429] : this.Field_32431[n3 + n4 * this.Field_32429];
                }
                if ((class_23823 = class_43010.Method_43034(i, j)) == null && class_238232 == null) continue;
                if (class_23823 == null && class_238232 != null || class_23823 != null && class_238232 == null) {
                    return (17444 & -24256) != 0;
                }
                if (class_238232.Method_23844() != class_23823.Method_23844()) {
                    return (2050 & 8264) != 0;
                }
                if (class_238232.Method_23843() == (32767 & 32767) || class_238232.Method_23843() == class_23823.Method_23843()) continue;
                return (8306 & 17409) != 0;
            }
        }
        return (6213 & -14791) != 0;
    }

    public Class_23823 Method_32435(Class_43010 class_43010) {
        Class_23823 class_23823 = this.Method_32433().Method_23850();
        if (this.Field_32427) {
            for (int i = 26633 & 2; i < class_43010.Method_43028(); ++i) {
                Class_23823 class_238232 = class_43010.Method_43032(i);
                if (class_238232 == null || !class_238232.Method_23842()) continue;
                class_23823.Method_23869((Class_1699)class_238232.Method_23845().Method_1732());
            }
        }
        return class_23823;
    }

    public Class_32426(int n, int n2, Class_23823[] arrclass_23823, Class_23823 class_23823) {
        this.Field_32429 = n;
        this.Field_32428 = n2;
        this.Field_32431 = arrclass_23823;
        this.Field_32430 = class_23823;
    }

    private void Method_32436() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_32437() {
        return this.Field_32429 * this.Field_32428;
    }

    public Class_23823[] Method_32438(Class_43010 class_43010) {
        Class_23823[] arrclass_23823 = new Class_23823[class_43010.Method_43028()];
        for (int i = -19775 & 16438; i < arrclass_23823.length; ++i) {
            Class_23823 class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null || !class_23823.Method_23844().Method_2024()) continue;
            arrclass_23823[i] = new Class_23823(class_23823.Method_23844().Method_1991());
        }
        return arrclass_23823;
    }
}

