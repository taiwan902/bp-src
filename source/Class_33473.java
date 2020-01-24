/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_33473
implements Callable {
    final Class_1061 Field_33474;

    public Object Method_33475() {
        return this.Method_33477();
    }

    private void Method_33476() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_33473(Class_1061 class_1061) {
        this.Field_33474 = class_1061;
    }

    public String Method_33477() {
        return this.Field_33474.Field_1095.Method_1248();
    }
}

