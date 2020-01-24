/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_7893
implements Callable {
    final Class_18 Field_7894;

    private void Method_7895() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_7896() {
        return "Client (map_client.txt)";
    }

    Class_7893(Class_18 class_18) {
        this.Field_7894 = class_18;
    }

    public Object Method_7897() {
        return this.Method_7896();
    }
}

