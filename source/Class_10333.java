/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_10333
implements Callable {
    final Class_17665 Field_10334;
    final Class_4751 Field_10335;

    Class_10333(Class_17665 class_17665, Class_4751 class_4751) {
        this.Field_10334 = class_17665;
        this.Field_10335 = class_4751;
    }

    public String Method_10336() {
        return Class_13220.Method_13237(this.Field_10335);
    }

    private void Method_10337() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_10338() {
        return this.Method_10336();
    }
}

