/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Executor;

public final class Class_19830
implements Executor {
    public static final Class_19830 Field_19831 = new Class_19830();

    private void Method_19832() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_19833(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        runnable.run();
    }

    private Class_19830() {
    }
}

