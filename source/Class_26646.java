/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.PrivilegedAction;

public final class Class_26646
implements PrivilegedAction {
    public ClassLoader Method_26647() {
        return Thread.currentThread().getContextClassLoader();
    }

    public Object Method_26648() {
        return this.Method_26647();
    }

    Class_26646() {
    }

    private void Method_26649() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

