/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_30182
implements Callable {
    final Class_570 Field_30183;

    public String Method_30184() {
        return this.Field_30183.Field_580.Field_48.Method_1442();
    }

    private void Method_30185() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_30186() {
        return this.Method_30184();
    }

    Class_30182(Class_570 class_570) {
        this.Field_30183 = class_570;
    }
}

