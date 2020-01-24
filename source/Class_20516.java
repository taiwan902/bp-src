/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_20516
implements Predicate {
    final Class_45406 Field_20517;

    private void Method_20518() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_20516(Class_45406 class_45406) {
        this.Field_20517 = class_45406;
    }

    public boolean Method_20519(Object object) {
        return this.Method_20520((Class_21696)object);
    }

    public boolean Method_20520(Class_21696 class_21696) {
        return (class_21696.Method_21715() != null && !class_21696.Method_21715().startsWith("#") ? -32735 & 10369 : 18259 & 2088) != 0;
    }
}

