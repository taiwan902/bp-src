/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_7032
implements Callable {
    final Class_42218 Field_7033;
    final Class_27551 Field_7034;

    public Object Method_7035() {
        return this.Method_7036();
    }

    public String Method_7036() {
        return this.Field_7033.Method_42238();
    }

    Class_7032(Class_27551 class_27551, Class_42218 class_42218) {
        this.Field_7034 = class_27551;
        this.Field_7033 = class_42218;
    }

    private void Method_7037() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

