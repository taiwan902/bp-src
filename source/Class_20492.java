/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_20492
implements Class_19219 {
    public boolean Method_20493(Class_43010 class_43010, Class_283 class_283) {
        int n = 2120 & -19049;
        Class_23823 class_23823 = null;
        for (int i = 18565 & 5138; i < class_43010.Method_43028(); ++i) {
            Class_23823 class_238232 = class_43010.Method_43032(i);
            if (class_238232 == null) continue;
            if (class_238232.Method_23844() == Class_10527.Field_10671) {
                if (class_23823 != null) {
                    return (4421 & -16384) != 0;
                }
                class_23823 = class_238232;
                continue;
            }
            if (class_238232.Method_23844() != Class_10527.Field_10662) {
                return (72 & 18464) != 0;
            }
            ++n;
        }
        return (class_23823 != null && n > 0 ? 11033 & -16381 : 26168 & 6145) != 0;
    }

    public Class_23823 Method_20494() {
        return null;
    }

    public Class_23823[] Method_20495(Class_43010 class_43010) {
        Class_23823[] arrclass_23823 = new Class_23823[class_43010.Method_43028()];
        for (int i = -29568 & 24612; i < arrclass_23823.length; ++i) {
            Class_23823 class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null || !(class_23823.Method_23844() instanceof Class_38466)) continue;
            arrclass_23823[i] = class_23823;
            break;
        }
        return arrclass_23823;
    }

    public int Method_20496() {
        return 12329 & 16457;
    }

    private void Method_20497() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823 Method_20498(Class_43010 class_43010) {
        int n = 8966 & 2064;
        Class_23823 class_23823 = null;
        for (int i = 10260 & 4514; i < class_43010.Method_43028(); ++i) {
            Class_23823 class_238232 = class_43010.Method_43032(i);
            if (class_238232 == null) continue;
            if (class_238232.Method_23844() == Class_10527.Field_10671) {
                if (class_23823 != null) {
                    return null;
                }
                class_23823 = class_238232;
                continue;
            }
            if (class_238232.Method_23844() != Class_10527.Field_10662) {
                return null;
            }
            ++n;
        }
        if (class_23823 != null && n >= (17 & 20553) && Class_38466.Method_38472(class_23823) < (-14070 & 594)) {
            Class_23823 class_238233 = new Class_23823(Class_10527.Field_10671, n);
            class_238233.Method_23869((Class_1699)class_23823.Method_23845().Method_1732());
            class_238233.Method_23845().Method_1739("generation", Class_38466.Method_38472(class_23823) + (-26587 & 19));
            if (class_23823.Method_23851()) {
                class_238233.Method_23870(class_23823.Method_23899());
            }
            return class_238233;
        }
        return null;
    }
}

