/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_31843
implements Callable {
    final Class_34695 Field_31844;
    final Class_2062 Field_31845;

    private void Method_31846() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_31847() {
        return this.Field_31845.getClass().getName();
    }

    public Object Method_31848() {
        return this.Method_31847();
    }

    Class_31843(Class_34695 class_34695, Class_2062 class_2062) {
        this.Field_31844 = class_34695;
        this.Field_31845 = class_2062;
    }
}

