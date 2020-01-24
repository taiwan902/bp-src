/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33119
implements Predicate {
    final Class_22849 Field_33120;

    Class_33119(Class_22849 class_22849) {
        this.Field_33120 = class_22849;
    }

    private void Method_33121() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_33122(Object object) {
        return this.Method_33123((Class_1061)object);
    }

    public boolean Method_33123(Class_1061 class_1061) {
        return class_1061.Method_1344();
    }
}

