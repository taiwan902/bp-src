/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public final class Class_19653
implements Callable {
    final Class_17281 Field_19654;

    Class_19653(Class_17281 class_17281) {
        this.Field_19654 = class_17281;
    }

    public String Method_19655() {
        return String.valueOf(this.Field_19654);
    }

    public Object Method_19656() {
        return this.Method_19655();
    }

    private void Method_19657() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

