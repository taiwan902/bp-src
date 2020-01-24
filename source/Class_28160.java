/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public final class Class_28160
implements Callable {
    final Class_4751 Field_28161;

    private void Method_28162() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_28160(Class_4751 class_4751) {
        this.Field_28161 = class_4751;
    }

    public Object Method_28163() {
        return this.Method_28164();
    }

    public String Method_28164() {
        return Class_13220.Method_13237(this.Field_28161);
    }
}

