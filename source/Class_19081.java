/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_19081
implements Callable {
    final Class_11372 Field_19082;
    final Class_24069 Field_19083;

    Class_19081(Class_24069 class_24069, Class_11372 class_11372) {
        this.Field_19083 = class_24069;
        this.Field_19082 = class_11372;
    }

    public String Method_19084() {
        return this.Field_19082.Method_11438();
    }

    private void Method_19085() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_19086() {
        return this.Method_19084();
    }
}

