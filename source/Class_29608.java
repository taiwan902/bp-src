/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class Class_29608
implements Class_17563 {
    public Class_21065 Method_29609(Callable callable) {
        return this.next().submit(callable);
    }

    public Class_21065 Method_29610(Runnable runnable) {
        return this.next().submit(runnable);
    }

    public Class_21065 Method_29611() {
        return this.shutdownGracefully(5784578L & -3254957500058617590L, -3016246088419964881L & 606077583L, TimeUnit.SECONDS);
    }

    public Class_21065 Method_29612(Runnable runnable, Object object) {
        return this.next().submit(runnable, object);
    }

    public Future Method_29613(Runnable runnable, Object object) {
        return this.Method_29612(runnable, object);
    }

    public Class_42730 Method_29614(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return this.next().scheduleWithFixedDelay(runnable, l, l2, timeUnit);
    }

    public List Method_29615(Collection collection, long l, TimeUnit timeUnit) {
        return this.next().invokeAll(collection, l, timeUnit);
    }

    public Future Method_29616(Callable callable) {
        return this.Method_29609(callable);
    }

    public ScheduledFuture Method_29617(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return this.Method_29624(runnable, l, l2, timeUnit);
    }

    public ScheduledFuture Method_29618(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return this.Method_29614(runnable, l, l2, timeUnit);
    }

    public List Method_29619(Collection collection) {
        return this.next().invokeAll(collection);
    }

    public Object Method_29620(Collection collection, long l, TimeUnit timeUnit) {
        return this.next().invokeAny(collection, l, timeUnit);
    }

    @Deprecated
    public abstract void Method_29621();

    @Deprecated
    public List Method_29622() {
        this.Method_29621();
        return Collections.emptyList();
    }

    public Future Method_29623(Runnable runnable) {
        return this.Method_29610(runnable);
    }

    public Class_42730 Method_29624(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return this.next().scheduleAtFixedRate(runnable, l, l2, timeUnit);
    }

    private void Method_29625() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public ScheduledFuture Method_29626(Runnable runnable, long l, TimeUnit timeUnit) {
        return this.Method_29629(runnable, l, timeUnit);
    }

    public void Method_29627(Runnable runnable) {
        this.next().execute(runnable);
    }

    public Class_42730 Method_29628(Callable callable, long l, TimeUnit timeUnit) {
        return this.next().schedule(callable, l, timeUnit);
    }

    public Class_42730 Method_29629(Runnable runnable, long l, TimeUnit timeUnit) {
        return this.next().schedule(runnable, l, timeUnit);
    }

    public ScheduledFuture Method_29630(Callable callable, long l, TimeUnit timeUnit) {
        return this.Method_29628(callable, l, timeUnit);
    }

    public Object Method_29631(Collection collection) {
        return this.next().invokeAny(collection);
    }
}

