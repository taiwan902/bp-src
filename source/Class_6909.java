/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_6909
implements Predicate {
    private void Method_6910() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_6911(Class_1061 class_1061) {
        return (class_1061 instanceof Class_4961 && class_1061.Method_1285() ? 163 & 11281 : 13853 & 16672) != 0;
    }

    Class_6909() {
    }

    public boolean Method_6912(Object object) {
        return this.Method_6911((Class_1061)object);
    }
}

