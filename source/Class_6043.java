/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_6043
implements Predicate {
    final Class_47526 Field_6044;

    private void Method_6045() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_6046(Class_1061 class_1061) {
        return (class_1061 instanceof Class_46658 || class_1061 instanceof Class_44525 ? 1313 & 28683 : 4388 & -32703) != 0;
    }

    Class_6043(Class_47526 class_47526) {
        this.Field_6044 = class_47526;
    }

    public boolean Method_6047(Object object) {
        return this.Method_6046((Class_1061)object);
    }
}

