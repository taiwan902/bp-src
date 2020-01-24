/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7519
implements Runnable {
    final Class_47372 Field_7520;

    private void Method_7521() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_7519(Class_47372 class_47372) {
        this.Field_7520 = class_47372;
    }

    public void Method_7522() {
        if (Class_47372.Method_47400(this.Field_7520).isDone()) {
            return;
        }
        Class_47372.Method_47419(this.Field_7520, Class_47372.Method_47402());
    }
}

