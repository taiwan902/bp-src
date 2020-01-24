/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.PrivilegedAction;

public final class Class_15083
implements PrivilegedAction {
    final Class Field_15084;

    Class_15083(Class class_) {
        this.Field_15084 = class_;
    }

    private void Method_15085() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public ClassLoader Method_15086() {
        return this.Field_15084.getClassLoader();
    }

    public Object Method_15087() {
        return this.Method_15086();
    }
}

