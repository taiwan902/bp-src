/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_26524
extends Class_21175 {
    private Object Field_26525;

    private void Method_26526() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Object Method_26527() {
        Object object = this.Field_26525;
        this.Field_26525 = null;
        return object;
    }

    public Object Method_26528() {
        return this.Field_26525;
    }

    Class_26524(Object object) {
        this.Field_26525 = object;
    }
}

