/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_19837
implements Callable {
    final Class_13268 Field_19838;

    Class_19837(Class_13268 class_13268) {
        this.Field_19838 = class_13268;
    }

    public Object Method_19839() {
        return this.Method_19840();
    }

    public String Method_19840() {
        return System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor");
    }

    private void Method_19841() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

