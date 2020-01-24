/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_17994
implements Callable {
    final Class_20772 Field_17995;
    final Class_1486 Field_17996;

    Class_17994(Class_20772 class_20772, Class_1486 class_1486) {
        this.Field_17995 = class_20772;
        this.Field_17996 = class_1486;
    }

    public String Method_17997() {
        return this.Field_17996.getClass().getCanonicalName();
    }

    private void Method_17998() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_17999() {
        return this.Method_17997();
    }
}

