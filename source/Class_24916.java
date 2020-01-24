/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24916
implements Predicate {
    final Class_46025 Field_24917;

    Class_24916(Class_46025 class_46025) {
        this.Field_24917 = class_46025;
    }

    public boolean Method_24918(Object object) {
        return this.Method_24919((Class_45994)object);
    }

    public boolean Method_24919(Class_45994 class_45994) {
        return class_45994.Method_46014();
    }

    private void Method_24920() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

