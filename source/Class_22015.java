/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.PrivilegedAction;

public final class Class_22015
implements PrivilegedAction {
    final String Field_22016;

    Class_22015(String string) {
        this.Field_22016 = string;
    }

    private void Method_22017() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_22018() {
        return this.Method_22019();
    }

    public String Method_22019() {
        return System.getProperty(this.Field_22016);
    }
}

