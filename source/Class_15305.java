/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_15305
implements Callable {
    final Class_13268 Field_15306;

    private void Method_15307() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_15305(Class_13268 class_13268) {
        this.Field_15306 = class_13268;
    }

    public String Method_15308() {
        return "1.8.8";
    }

    public Object Method_15309() {
        return this.Method_15308();
    }
}

