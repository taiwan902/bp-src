/*
 * Decompiled with CFR 0.145.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public interface Class_17563
extends Iterable,
ScheduledExecutorService {
    default public ScheduledFuture Method_17564(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return this.Method_17571(runnable, l, l2, timeUnit);
    }

    public Class_42730 Method_17565(Runnable var1, long var2, long var4, TimeUnit var6);

    public Class_21065 Method_17566(Runnable var1);

    @Deprecated
    public void Method_17567();

    public Class_21065 Method_17568();

    default public ScheduledFuture Method_17569(Callable callable, long l, TimeUnit timeUnit) {
        return this.Method_17572(callable, l, timeUnit);
    }

    public Class_42730 Method_17570(Runnable var1, long var2, TimeUnit var4);

    public Class_42730 Method_17571(Runnable var1, long var2, long var4, TimeUnit var6);

    public Class_42730 Method_17572(Callable var1, long var2, TimeUnit var4);

    public Class_21065 Method_17573();

    default public Future Method_17574(Runnable runnable, Object object) {
        return this.Method_17577(runnable, object);
    }

    default public ScheduledFuture Method_17575(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return this.Method_17565(runnable, l, l2, timeUnit);
    }

    public Class_37082 Method_17576();

    public Class_21065 Method_17577(Runnable var1, Object var2);

    public Class_21065 Method_17578(Callable var1);

    default public Future Method_17579(Runnable runnable) {
        return this.Method_17566(runnable);
    }

    default public ScheduledFuture Method_17580(Runnable runnable, long l, TimeUnit timeUnit) {
        return this.Method_17570(runnable, l, timeUnit);
    }

    public Class_21065 Method_17581(long var1, long var3, TimeUnit var5);

    default public Future Method_17582(Callable callable) {
        return this.Method_17578(callable);
    }
}

