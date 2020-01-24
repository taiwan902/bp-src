/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public final class Class_23940
implements Callable {
    final Class_3436 Field_23941;

    Class_23940(Class_3436 class_3436) {
        this.Field_23941 = class_3436;
    }

    public Object Method_23942() {
        return this.Method_23943();
    }

    public String Method_23943() {
        return this.Field_23941.toString();
    }

    private void Method_23944() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

