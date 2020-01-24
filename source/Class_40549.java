/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class Class_40549
implements Class_21065 {
    public Object Method_40550(long l, TimeUnit timeUnit) {
        if (this.await(l, timeUnit)) {
            Throwable throwable = this.cause();
            if (throwable == null) {
                return this.getNow();
            }
            throw new ExecutionException(throwable);
        }
        throw new TimeoutException();
    }

    public Object Method_40551() {
        this.await();
        Throwable throwable = this.cause();
        if (throwable == null) {
            return this.getNow();
        }
        throw new ExecutionException(throwable);
    }

    private void Method_40552() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

