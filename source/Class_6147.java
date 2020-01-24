/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class Class_6147
implements Comparator {
    final Class_40260 Field_6148;
    final Class_16456 Field_6149;

    Class_6147(Class_40260 class_40260, Class_16456 class_16456) {
        this.Field_6148 = class_40260;
        this.Field_6149 = class_16456;
    }

    public int Method_6150(Object object, Object object2) {
        return this.Method_6151((Class_22538)object, (Class_22538)object2);
    }

    public int Method_6151(Class_22538 class_22538, Class_22538 class_225382) {
        int n = Class_1956.Method_1986(class_22538.Method_22541());
        int n2 = Class_1956.Method_1986(class_225382.Method_22541());
        Class_13017 class_13017 = null;
        Class_13017 class_130172 = null;
        if (this.Field_6148.\u0000= float == (-28510 & 2578)) {
            class_13017 = Class_19863.Field_19891[n];
            class_130172 = Class_19863.Field_19891[n2];
        } else if (this.Field_6148.\u0000= float == 0) {
            class_13017 = Class_19863.Field_19885[n];
            class_130172 = Class_19863.Field_19885[n2];
        } else if (this.Field_6148.\u0000= float == (4609 & -32671)) {
            class_13017 = Class_19863.Field_19917[n];
            class_130172 = Class_19863.Field_19917[n2];
        }
        if (class_13017 != null || class_130172 != null) {
            int n3;
            if (class_13017 == null) {
                return 1921 & -32759;
            }
            if (class_130172 == null) {
                return -1 & -1;
            }
            int n4 = Class_16456.Method_16469(this.Field_6148.Field_40261).Method_25501(class_13017);
            if (n4 != (n3 = Class_16456.Method_16469(this.Field_6148.Field_40261).Method_25501(class_130172))) {
                return (n4 - n3) * this.Field_6148.\u0000abstract;
            }
        }
        return n - n2;
    }

    private void Method_6152() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

