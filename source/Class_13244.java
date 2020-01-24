/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_13244
implements Callable {
    final Class_13268 Field_13245;

    private void Method_13246() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_13247() {
        return this.Method_13248();
    }

    Class_13244(Class_13268 class_13268) {
        this.Field_13245 = class_13268;
    }

    public String Method_13248() {
        return System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
    }
}

