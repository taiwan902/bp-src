/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_6076
implements Predicate {
    final String Field_6077;
    final boolean Field_6078;

    private void Method_6079() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_6080(Class_1061 class_1061) {
        return (Class_15516.Method_15544(class_1061, this.Field_6077) != this.Field_6078 ? -23601 & 4113 : 10331 & 17408) != 0;
    }

    public boolean Method_6081(Object object) {
        return this.Method_6080((Class_1061)object);
    }

    Class_6076(String string, boolean bl) {
        this.Field_6077 = string;
        this.Field_6078 = bl;
    }
}

