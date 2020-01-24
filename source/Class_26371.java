/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_26371
implements Callable {
    final Class_31717 Field_26372;

    public Object Method_26373() {
        return this.Method_26375();
    }

    private void Method_26374() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_26375() {
        return String.valueOf(Class_31717.Method_31773(this.Field_26372));
    }

    Class_26371(Class_31717 class_31717) {
        this.Field_26372 = class_31717;
    }
}

