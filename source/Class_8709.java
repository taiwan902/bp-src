/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.PrivilegedAction;

public final class Class_8709
implements PrivilegedAction {
    public ClassLoader Method_8710() {
        return ClassLoader.getSystemClassLoader();
    }

    private void Method_8711() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_8712() {
        return this.Method_8710();
    }

    Class_8709() {
    }
}

