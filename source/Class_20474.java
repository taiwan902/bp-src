/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_20474
implements Callable {
    final Class_44584 Field_20475;
    final Class_15008 Field_20476;

    public Object Method_20477() {
        return this.Method_20479();
    }

    Class_20474(Class_15008 class_15008, Class_44584 class_44584) {
        this.Field_20476 = class_15008;
        this.Field_20475 = class_44584;
    }

    private void Method_20478() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_20479() {
        return this.Field_20475.toString();
    }
}

