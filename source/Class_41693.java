/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_41693
implements Callable {
    final Class_24069 Field_41694;
    final Class_11372 Field_41695;

    public Object Method_41696() {
        return this.Method_41697();
    }

    public String Method_41697() {
        return this.Field_41695.Method_11431() + " x " + this.Field_41695.Method_11424();
    }

    private void Method_41698() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_41693(Class_24069 class_24069, Class_11372 class_11372) {
        this.Field_41694 = class_24069;
        this.Field_41695 = class_11372;
    }
}

