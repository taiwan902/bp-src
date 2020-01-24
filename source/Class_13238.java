/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_13238
implements Predicate {
    private final Class_3238 Field_13239;

    private void Method_13240() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_13241(Object object) {
        return this.Method_13242((Class_3436)object);
    }

    private Class_13238(Class_3238 class_3238) {
        this.Field_13239 = class_3238;
    }

    public boolean Method_13242(Class_3436 class_3436) {
        return (class_3436 != null && class_3436.Method_3442() == this.Field_13239 ? 4169 & 25603 : -32366 & 14856) != 0;
    }

    public static Class_13238 Method_13243(Class_3238 class_3238) {
        return new Class_13238(class_3238);
    }
}

