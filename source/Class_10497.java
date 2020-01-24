/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_10497
implements Predicate {
    final Class_2651 Field_10498;

    private void Method_10499() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_10497(Class_2651 class_2651) {
        this.Field_10498 = class_2651;
    }

    public boolean Method_10500(Class_859 class_859) {
        return (class_859 != null && class_859.Method_1033() && this.Field_10498.\u0000, for(class_859.\u0000strictfp()) ? -32509 & 27877 : 2048 & 16393) != 0;
    }

    public boolean Method_10501(Object object) {
        return this.Method_10500((Class_859)object);
    }
}

