/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_24231
implements Callable {
    final Class_31717 Field_24232;

    Class_24231(Class_31717 class_31717) {
        this.Field_24232 = class_31717;
    }

    private void Method_24233() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_24234() {
        return Class_13220.Method_13236(Class_31717.Method_31796(this.Field_24232), Class_31717.Method_31824(this.Field_24232), Class_31717.Method_31759(this.Field_24232));
    }

    public Object Method_24235() {
        return this.Method_24234();
    }
}

