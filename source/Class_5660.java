/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_5660
implements Predicate {
    final Class_5596 Field_5661;

    public boolean Method_5662(Class_5607 class_5607) {
        return (class_5607.Method_5633() == this.Field_5661.Method_5605() ? 13409 & -32765 : 3104 & 213) != 0;
    }

    private void Method_5663() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_5664(Object object) {
        return this.Method_5662((Class_5607)object);
    }

    Class_5660(Class_5596 class_5596) {
        this.Field_5661 = class_5596;
    }
}

