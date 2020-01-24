/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_7422
implements Callable {
    final Class_4879 Field_7423;

    public Object Method_7424() {
        return this.Method_7426();
    }

    private void Method_7425() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_7422(Class_4879 class_4879) {
        this.Field_7423 = class_4879;
    }

    public String Method_7426() {
        return (String)Class_4879.Method_4902().get(this.Field_7423.getClass()) + " // " + this.Field_7423.getClass().getCanonicalName();
    }
}

