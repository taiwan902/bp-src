/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_23902
implements Callable {
    final Class_18 Field_23903;

    public Object Method_23904() {
        return this.Method_23905();
    }

    public String Method_23905() {
        return Class_18.Method_194(this.Field_23903).Method_44211().Method_15256();
    }

    private void Method_23906() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_23902(Class_18 class_18) {
        this.Field_23903 = class_18;
    }
}

