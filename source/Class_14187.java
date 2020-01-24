/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_14187
implements Predicate {
    final Predicate Field_14188;

    public boolean Method_14189(Object object) {
        return this.Method_14190((Class_7692)object);
    }

    public boolean Method_14190(Class_7692 class_7692) {
        return (class_7692 != null && this.Field_14188.apply((Object)class_7692.Method_7699()) ? 2147 & -31615 : 769 & -30684) != 0;
    }

    private void Method_14191() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_14187(Predicate predicate) {
        this.Field_14188 = predicate;
    }
}

