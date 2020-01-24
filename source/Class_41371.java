/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_41371
implements Callable {
    final Class_3013 Field_41372;

    Class_41371(Class_3013 class_3013) {
        this.Field_41372 = class_3013;
    }

    public Object Method_41373() {
        return this.Method_41374();
    }

    public String Method_41374() {
        return "Integrated Server (map_client.txt)";
    }

    private void Method_41375() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

