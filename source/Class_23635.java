/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class Class_23635
implements Comparator {
    final Class_41796 Field_23636;
    final Class_16456 Field_23637;

    public int Method_23638(Class_22538 class_22538, Class_22538 class_225382) {
        int n = Class_1956.Method_1986(class_22538.Method_22541());
        int n2 = Class_1956.Method_1986(class_225382.Method_22541());
        Class_13017 class_13017 = null;
        Class_13017 class_130172 = null;
        if (this.Field_23636.\u0000= float == 0) {
            class_13017 = Class_19863.Field_19900[n];
            class_130172 = Class_19863.Field_19900[n2];
        } else if (this.Field_23636.\u0000= float == (-16063 & 45)) {
            class_13017 = Class_19863.Field_19885[n];
            class_130172 = Class_19863.Field_19885[n2];
        } else if (this.Field_23636.\u0000= float == (1923 & 70)) {
            class_13017 = Class_19863.Field_19917[n];
            class_130172 = Class_19863.Field_19917[n2];
        }
        if (class_13017 != null || class_130172 != null) {
            int n3;
            if (class_13017 == null) {
                return -16381 & 6145;
            }
            if (class_130172 == null) {
                return -1 & -1;
            }
            int n4 = Class_16456.Method_16469(this.Field_23636.Field_41797).Method_25501(class_13017);
            if (n4 != (n3 = Class_16456.Method_16469(this.Field_23636.Field_41797).Method_25501(class_130172))) {
                return (n4 - n3) * this.Field_23636.\u0000abstract;
            }
        }
        return n - n2;
    }

    Class_23635(Class_41796 class_41796, Class_16456 class_16456) {
        this.Field_23636 = class_41796;
        this.Field_23637 = class_16456;
    }

    private void Method_23639() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_23640(Object object, Object object2) {
        return this.Method_23638((Class_22538)object, (Class_22538)object2);
    }
}

