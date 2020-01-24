/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_17225
implements Callable {
    final Class_31717 Field_17226;

    private void Method_17227() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_17228() {
        return this.Method_17229();
    }

    public String Method_17229() {
        return String.valueOf(this.Field_17226.Method_31827());
    }

    Class_17225(Class_31717 class_31717) {
        this.Field_17226 = class_31717;
    }
}

