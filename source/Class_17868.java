/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_17868
implements Callable {
    final Class_27551 Field_17869;
    final Class_42218 Field_17870;

    public Object Method_17871() {
        return this.Method_17872();
    }

    public String Method_17872() {
        return this.Field_17870.Method_42238();
    }

    Class_17868(Class_27551 class_27551, Class_42218 class_42218) {
        this.Field_17869 = class_27551;
        this.Field_17870 = class_42218;
    }

    private void Method_17873() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

