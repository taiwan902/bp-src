/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_1809
extends RuntimeException {
    private final Class_13268 Field_1810;

    public String Method_1811() {
        return this.Field_1810.Method_13289();
    }

    public Class_13268 Method_1812() {
        return this.Field_1810;
    }

    public Throwable Method_1813() {
        return this.Field_1810.Method_13288();
    }

    public Class_1809(Class_13268 class_13268) {
        this.Field_1810 = class_13268;
    }

    private void Method_1814() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

