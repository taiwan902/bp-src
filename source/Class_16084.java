/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_16084
implements Callable {
    final Class_18 Field_16085;

    public String Method_16086() {
        return Class_18.Method_188(this.Field_16085);
    }

    Class_16084(Class_18 class_18) {
        this.Field_16085 = class_18;
    }

    private void Method_16087() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_16088() {
        return this.Method_16086();
    }
}

