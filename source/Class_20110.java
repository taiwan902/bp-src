/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.FutureTask;

public class Class_20110 {
    public Runnable Field_20111;
    public FutureTask Field_20112;

    private void Method_20113() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_20110(Runnable runnable, FutureTask futureTask) {
        this.Field_20111 = runnable;
        this.Field_20112 = futureTask;
    }
}

