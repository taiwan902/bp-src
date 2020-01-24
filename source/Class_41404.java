/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_41404
implements Callable {
    final Class_1699 Field_41405;
    final int Field_41406;

    public Object Method_41407() {
        return this.Method_41409();
    }

    private void Method_41408() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_41409() {
        return Class_1674.Field_1675[this.Field_41406];
    }

    Class_41404(Class_1699 class_1699, int n) {
        this.Field_41405 = class_1699;
        this.Field_41406 = n;
    }
}

