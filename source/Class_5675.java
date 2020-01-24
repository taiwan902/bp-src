/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_5675
implements Predicate {
    final Class_5665 Field_5676;

    public boolean Method_5677(Class_5607 class_5607) {
        return (class_5607.Method_5633() == this.Field_5676 ? 5473 & -32611 : 26024 & -32700) != 0;
    }

    public boolean Method_5678(Object object) {
        return this.Method_5677((Class_5607)object);
    }

    private void Method_5679() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_5675(Class_5665 class_5665) {
        this.Field_5676 = class_5665;
    }
}

