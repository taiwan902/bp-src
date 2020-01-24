/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_15331
implements Callable {
    final Class_283 Field_15332;
    final Class_4751 Field_15333;

    public Object Method_15334() {
        return this.Method_15335();
    }

    Class_15331(Class_283 class_283, Class_4751 class_4751) {
        this.Field_15332 = class_283;
        this.Field_15333 = class_4751;
    }

    public String Method_15335() {
        return Class_13220.Method_13237(this.Field_15333);
    }

    private void Method_15336() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

