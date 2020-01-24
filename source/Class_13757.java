/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_13757
implements Predicate {
    final String Field_13758;
    final boolean Field_13759;

    public boolean Method_13760(Class_1061 class_1061) {
        return (class_1061.Method_1202().equals(this.Field_13758) != this.Field_13759 ? 65 & 6181 : 24717 & -32688) != 0;
    }

    public boolean Method_13761(Object object) {
        return this.Method_13760((Class_1061)object);
    }

    private void Method_13762() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_13757(String string, boolean bl) {
        this.Field_13758 = string;
        this.Field_13759 = bl;
    }
}

