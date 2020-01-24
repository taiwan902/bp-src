/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_9697
implements Callable {
    final Class_283 Field_9698;

    Class_9697(Class_283 class_283) {
        this.Field_9698 = class_283;
    }

    public Object Method_9699() {
        return this.Method_9701();
    }

    private void Method_9700() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_9701() {
        return this.Field_9698.Field_320.Method_12177();
    }
}

