/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_42465
extends Class_18956 {
    private final Class Field_42466;

    public boolean Method_42467(Object object) {
        return this.Field_42466.isInstance(object);
    }

    private void Method_42468() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_42465(Class class_) {
        this.Field_42466 = class_;
    }
}

