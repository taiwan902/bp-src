/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_30917
implements Thread.UncaughtExceptionHandler {
    Class_30917() {
    }

    private void Method_30918() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_30919(Thread thread, Throwable throwable) {
        Class_32341.Method_32349().Method_6122("An exception has been raised by {}", thread.getName(), throwable);
    }
}

