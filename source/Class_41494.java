/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41494
extends Class_32426 {
    public Class_23823 Method_41495(Class_43010 class_43010) {
        Class_23823 class_23823 = null;
        for (int i = -30620 & 4099; i < class_43010.Method_43028() && class_23823 == null; ++i) {
            Class_23823 class_238232 = class_43010.Method_43032(i);
            if (class_238232 == null || class_238232.Method_23844() != Class_10527.Field_10701) continue;
            class_23823 = class_238232;
        }
        class_23823 = class_23823.Method_23850();
        class_23823.Field_23826 = 21025 & 5;
        if (class_23823.Method_23845() == null) {
            class_23823.Method_23869(new Class_1699());
        }
        class_23823.Method_23845().Method_1706("map_is_scaling", (-13535 & 157) != 0);
        return class_23823;
    }

    public Class_41494() {
        Class_23823[] arrclass_23823 = new Class_23823[6937 & -23539];
        arrclass_23823[-14318 & 5320] = new Class_23823(Class_10527.Field_10703);
        arrclass_23823[4353 & 189] = new Class_23823(Class_10527.Field_10703);
        arrclass_23823[1058 & 22543] = new Class_23823(Class_10527.Field_10703);
        arrclass_23823[4171 & 275] = new Class_23823(Class_10527.Field_10703);
        arrclass_23823[4100 & -7810] = new Class_23823(Class_10527.Field_10701, 23748 & -24015, 32767 & 32767);
        arrclass_23823[21 & -27321] = new Class_23823(Class_10527.Field_10703);
        arrclass_23823[8198 & 16903] = new Class_23823(Class_10527.Field_10703);
        arrclass_23823[4359 & -15641] = new Class_23823(Class_10527.Field_10703);
        arrclass_23823[18831 & -32680] = new Class_23823(Class_10527.Field_10703);
        super(16547 & 3851, 4387 & 16583, arrclass_23823, new Class_23823(Class_10527.Field_10641, -32384 & 9299, -17824 & 16401));
    }

    private void Method_41496() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_41497(Class_43010 class_43010, Class_283 class_283) {
        if (!super.Method_32432(class_43010, class_283)) {
            return (2322 & 5) != 0;
        }
        Class_23823 class_23823 = null;
        for (int i = 9 & 7286; i < class_43010.Method_43028() && class_23823 == null; ++i) {
            Class_23823 class_238232 = class_43010.Method_43032(i);
            if (class_238232 == null || class_238232.Method_23844() != Class_10527.Field_10701) continue;
            class_23823 = class_238232;
        }
        if (class_23823 == null) {
            return (2048 & -15292) != 0;
        }
        Class_33760 class_33760 = Class_10527.Field_10701.Method_40868(class_23823, class_283);
        return (class_33760 == null ? 14749 & 576 : (class_33760.Field_33767 < (16647 & -30652) ? -14163 & 4609 : 20612 & 529)) != 0;
    }
}

