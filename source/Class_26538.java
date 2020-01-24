/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26538
implements Class_19219 {
    public Class_23823 Method_26539() {
        return null;
    }

    public Class_23823[] Method_26540(Class_43010 class_43010) {
        Class_23823[] arrclass_23823 = new Class_23823[class_43010.Method_43028()];
        for (int i = 512 & -11863; i < arrclass_23823.length; ++i) {
            Class_23823 class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null || !class_23823.Method_23844().Method_2024()) continue;
            arrclass_23823[i] = new Class_23823(class_23823.Method_23844().Method_1991());
        }
        return arrclass_23823;
    }

    public int Method_26541() {
        return -16247 & 10793;
    }

    private void Method_26542() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823 Method_26543(Class_43010 class_43010) {
        int n = 26 & -24544;
        Class_23823 class_23823 = null;
        for (int i = 8360 & 5392; i < class_43010.Method_43028(); ++i) {
            Class_23823 class_238232 = class_43010.Method_43032(i);
            if (class_238232 == null) continue;
            if (class_238232.Method_23844() == Class_10527.Field_10701) {
                if (class_23823 != null) {
                    return null;
                }
                class_23823 = class_238232;
                continue;
            }
            if (class_238232.Method_23844() != Class_10527.Field_10641) {
                return null;
            }
            ++n;
        }
        if (class_23823 != null && n >= (321 & 35)) {
            Class_23823 class_238233 = new Class_23823(Class_10527.Field_10701, n + (-23421 & 6989), class_23823.Method_23843());
            if (class_23823.Method_23851()) {
                class_238233.Method_23870(class_23823.Method_23899());
            }
            return class_238233;
        }
        return null;
    }

    public boolean Method_26544(Class_43010 class_43010, Class_283 class_283) {
        int n = 16458 & -20444;
        Class_23823 class_23823 = null;
        for (int i = -1965 & 4; i < class_43010.Method_43028(); ++i) {
            Class_23823 class_238232 = class_43010.Method_43032(i);
            if (class_238232 == null) continue;
            if (class_238232.Method_23844() == Class_10527.Field_10701) {
                if (class_23823 != null) {
                    return (12326 & 1728) != 0;
                }
                class_23823 = class_238232;
                continue;
            }
            if (class_238232.Method_23844() != Class_10527.Field_10641) {
                return (1008 & -32760) != 0;
            }
            ++n;
        }
        return (class_23823 != null && n > 0 ? -7385 & 6337 : 16656 & 2051) != 0;
    }
}

