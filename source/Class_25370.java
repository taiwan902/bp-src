/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_25370
implements Class_19219 {
    private void Method_25371() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823[] Method_25372(Class_43010 class_43010) {
        Class_23823[] arrclass_23823 = new Class_23823[class_43010.Method_43028()];
        for (int i = 5459 & 18568; i < arrclass_23823.length; ++i) {
            Class_23823 class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null) continue;
            if (class_23823.Method_23844().Method_2024()) {
                arrclass_23823[i] = new Class_23823(class_23823.Method_23844().Method_1991());
                continue;
            }
            if (!class_23823.Method_23842() || Class_39935.Method_39953(class_23823) <= 0) continue;
            arrclass_23823[i] = class_23823.Method_23850();
            arrclass_23823[i].Field_23826 = -32623 & 27137;
        }
        return arrclass_23823;
    }

    public boolean Method_25373(Class_43010 class_43010, Class_283 class_283) {
        Class_23823 class_23823 = null;
        Class_23823 class_238232 = null;
        for (int i = -24168 & 2146; i < class_43010.Method_43028(); ++i) {
            int n;
            Class_23823 class_238233 = class_43010.Method_43032(i);
            if (class_238233 == null) continue;
            if (class_238233.Method_23844() != Class_10527.Field_10711) {
                return (9332 & -13941) != 0;
            }
            if (class_23823 != null && class_238232 != null) {
                return (272 & -500) != 0;
            }
            int n2 = Class_39935.Method_39952(class_238233);
            int n3 = n = Class_39935.Method_39953(class_238233) > 0 ? 3 & -3751 : 18080 & -30654;
            if (class_23823 != null) {
                if (n != 0) {
                    return (11337 & 258) != 0;
                }
                if (n2 != Class_39935.Method_39952(class_23823)) {
                    return (16384 & 1186) != 0;
                }
                class_238232 = class_238233;
                continue;
            }
            if (class_238232 != null) {
                if (n == 0) {
                    return (2324 & 96) != 0;
                }
                if (n2 != Class_39935.Method_39952(class_238232)) {
                    return (2956 & 4160) != 0;
                }
                class_23823 = class_238233;
                continue;
            }
            if (n != 0) {
                class_23823 = class_238233;
                continue;
            }
            class_238232 = class_238233;
        }
        return (class_23823 != null && class_238232 != null ? 2049 & -27853 : -11695 & 1312) != 0;
    }

    Class_25370(Class_6082 class_6082) {
        this();
    }

    private Class_25370() {
    }

    public Class_23823 Method_25374() {
        return null;
    }

    public int Method_25375() {
        return 17618 & 3;
    }

    public Class_23823 Method_25376(Class_43010 class_43010) {
        for (int i = 5361 & 8704; i < class_43010.Method_43028(); ++i) {
            Class_23823 class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null || Class_39935.Method_39953(class_23823) <= 0) continue;
            Class_23823 class_238232 = class_23823.Method_23850();
            class_238232.Field_23826 = 20481 & 8715;
            return class_238232;
        }
        return null;
    }
}

