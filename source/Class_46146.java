/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_46146
extends Class_41731 {
    final Class_47372 Field_46147;

    Class_46146(Class_47372 class_47372, Class_42792 class_42792) {
        this(class_47372);
    }

    private void Method_46148() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_46146(Class_47372 class_47372) {
        this.Field_46147 = class_47372;
    }

    protected Class_37082 Method_46149() {
        if (Class_47372.Method_47397(this.Field_46147) == null) {
            throw new IllegalStateException();
        }
        return Class_47372.Method_47397(this.Field_46147).Method_39160();
    }
}

