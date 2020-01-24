/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public abstract class Class_46087
extends AbstractExecutorService
implements Class_37082 {
    public ScheduledFuture Method_46088(Callable callable, long l, TimeUnit timeUnit) {
        return this.Method_46098(callable, l, timeUnit);
    }

    public Future Method_46089(Callable callable) {
        return this.Method_46108(callable);
    }

    public Class_42730 Method_46090(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture Method_46091(Runnable runnable, long l, TimeUnit timeUnit) {
        return this.Method_46093(runnable, l, timeUnit);
    }

    private void Method_46092() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_42730 Method_46093(Runnable runnable, long l, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture Method_46094(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return this.Method_46090(runnable, l, l2, timeUnit);
    }

    public ScheduledFuture Method_46095(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return this.Method_46106(runnable, l, l2, timeUnit);
    }

    public Iterator Method_46096() {
        return new Class_36629(this, null);
    }

    @Deprecated
    public abstract void Method_46097();

    public Class_42730 Method_46098(Callable callable, long l, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public Class_21065 Method_46099(Runnable runnable) {
        return (Class_21065)super.submit(runnable);
    }

    public boolean Method_46100() {
        return this.inEventLoop(Thread.currentThread());
    }

    public Class_33149 Method_46101() {
        return new Class_41731(this);
    }

    public Class_21065 Method_46102(Runnable runnable, Object object) {
        return (Class_21065)super.submit(runnable, object);
    }

    public Future Method_46103(Runnable runnable, Object object) {
        return this.Method_46102(runnable, object);
    }

    public Class_21065 Method_46104() {
        return this.shutdownGracefully(76614690L & -6857403538849250814L, 724585071L & 8523791L, TimeUnit.SECONDS);
    }

    public Class_37082 Method_46105() {
        return this;
    }

    public Class_42730 Method_46106(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    protected final RunnableFuture Method_46107(Callable callable) {
        return new Class_43864(this, callable);
    }

    public Class_21065 Method_46108(Callable callable) {
        return (Class_21065)super.submit(callable);
    }

    protected final RunnableFuture Method_46109(Runnable runnable, Object object) {
        return new Class_43864(this, runnable, object);
    }

    @Deprecated
    public List Method_46110() {
        this.Method_46097();
        return Collections.emptyList();
    }

    public Future Method_46111(Runnable runnable) {
        return this.Method_46099(runnable);
    }
}

