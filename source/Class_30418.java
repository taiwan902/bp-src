/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public final class Class_30418
implements Callable {
    final Class_4751 Field_30419;

    public String Method_30420() {
        return Class_13220.Method_13237(this.Field_30419);
    }

    Class_30418(Class_4751 class_4751) {
        this.Field_30419 = class_4751;
    }

    public Object Method_30421() {
        return this.Method_30420();
    }

    private void Method_30422() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

