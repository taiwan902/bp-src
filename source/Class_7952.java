/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_7952
implements Callable {
    final Class_31717 Field_7953;

    public Object Method_7954() {
        return this.Method_7955();
    }

    public String Method_7955() {
        return Class_31717.Method_31804(this.Field_7953);
    }

    private void Method_7956() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_7952(Class_31717 class_31717) {
        this.Field_7953 = class_31717;
    }
}

