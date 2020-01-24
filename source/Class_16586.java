/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_16586
implements Callable {
    final Class_31428 Field_16587;

    public Object Method_16588() {
        return this.Method_16589();
    }

    Class_16586(Class_31428 class_31428) {
        this.Field_16587 = class_31428;
    }

    public String Method_16589() {
        return this.Field_16587.getClass().getCanonicalName();
    }

    private void Method_16590() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

