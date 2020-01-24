/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public final class Class_8580
implements Callable {
    final Class_17281 Field_8581;

    public String Method_8582() {
        return String.valueOf(this.Field_8581);
    }

    public Object Method_8583() {
        return this.Method_8582();
    }

    Class_8580(Class_17281 class_17281) {
        this.Field_8581 = class_17281;
    }

    private void Method_8584() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

