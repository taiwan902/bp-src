/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Class_46724
extends Class_46087 {
    public static final Class_46724 Field_46725;
    private static final Class_6113 Field_46726;
    private final ThreadFactory Field_46727 = new Class_15627(this.getClass());
    final Class_45231 Field_46728 = new Class_45231((Class_37082)this, this.Field_46734, Executors.callable(new Class_29565(this, null), null), Class_45231.Method_45249(Field_46732), -Field_46732);
    final BlockingQueue Field_46729 = new LinkedBlockingQueue();
    private final AtomicBoolean Field_46730 = new AtomicBoolean();
    Thread Field_46731;
    private static final long Field_46732;
    private final Class_6059 Field_46733 = new Class_6059(this);
    final Queue Field_46734 = new PriorityQueue();
    private final Class_21065 Field_46735 = new Class_46933(this, new UnsupportedOperationException());

    public Class_21065 Method_46736() {
        return this.Field_46735;
    }

    public Class_42730 Method_46737(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l < (1573454401L & 536904706L)) {
            Object[] arrobject = new Object[-31487 & 8201];
            arrobject[8516 & 18570] = l;
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", arrobject));
        }
        if (l2 <= (809503489L & -7053632282782292980L)) {
            Object[] arrobject = new Object[12297 & 2053];
            arrobject[1292 & -11773] = l2;
            throw new IllegalArgumentException(String.format("delay: %d (expected: > 0)", arrobject));
        }
        return this.Method_46748(new Class_45231((Class_37082)this, this.Field_46734, Executors.callable(runnable, null), Class_45231.Method_45249(timeUnit.toNanos(l)), -timeUnit.toNanos(l2)));
    }

    public Class_42730 Method_46738(Runnable runnable, long l, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l < (6311839551880430420L & -6311839553938258902L)) {
            Object[] arrobject = new Object[33 & 25];
            arrobject[1286 & 12537] = l;
            throw new IllegalArgumentException(String.format("delay: %d (expected: >= 0)", arrobject));
        }
        return this.Method_46748(new Class_45231((Class_37082)this, this.Field_46734, runnable, null, Class_45231.Method_45249(timeUnit.toNanos(l))));
    }

    private void Method_46739() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_46740() {
        return (2190 & 1040) != 0;
    }

    public boolean Method_46741(Thread thread) {
        return (thread == this.Field_46731 ? 6177 & 8195 : 6466 & 17944) != 0;
    }

    public ScheduledFuture Method_46742(Runnable runnable, long l, TimeUnit timeUnit) {
        return this.Method_46738(runnable, l, timeUnit);
    }

    static {
        Field_46726 = Class_10201.Method_10203(Class_46724.class);
        Field_46732 = TimeUnit.SECONDS.toNanos(558629889L & 1825412702963720269L);
        Field_46725 = new Class_46724();
    }

    public boolean Method_46743(long l, TimeUnit timeUnit) {
        return (2332 & 2) != 0;
    }

    static Class_6113 Method_46744() {
        return Field_46726;
    }

    private Class_46724() {
        this.Field_46734.add(this.Field_46728);
    }

    Runnable Method_46745() {
        Runnable runnable;
        BlockingQueue blockingQueue = this.Field_46729;
        do {
            Class_45231 class_45231;
            if ((class_45231 = (Class_45231)this.Field_46734.peek()) == null) {
                Runnable runnable2 = null;
                try {
                    runnable2 = (Runnable)blockingQueue.take();
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                return runnable2;
            }
            long l = class_45231.Method_45247();
            if (l > (550535170L & -2580690220025687387L)) {
                try {
                    runnable = (Runnable)blockingQueue.poll(l, TimeUnit.NANOSECONDS);
                }
                catch (InterruptedException interruptedException) {
                    return null;
                }
            } else {
                runnable = (Runnable)blockingQueue.poll();
            }
            if (runnable != null) continue;
            this.Method_46752();
            runnable = (Runnable)blockingQueue.poll();
        } while (runnable == null);
        return runnable;
    }

    static AtomicBoolean Method_46746(Class_46724 class_46724) {
        return class_46724.Field_46730;
    }

    private void Method_46747(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        this.Field_46729.add(runnable);
    }

    private Class_42730 Method_46748(Class_45231 class_45231) {
        if (class_45231 == null) {
            throw new NullPointerException("task");
        }
        if (this.inEventLoop()) {
            this.Field_46734.add(class_45231);
        } else {
            this.Method_46758(new Class_22832(this, class_45231));
        }
        return class_45231;
    }

    @Deprecated
    public void Method_46749() {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture Method_46750(Callable callable, long l, TimeUnit timeUnit) {
        return this.Method_46757(callable, l, timeUnit);
    }

    public Class_21065 Method_46751(long l, long l2, TimeUnit timeUnit) {
        return this.Method_46736();
    }

    private void Method_46752() {
        Class_45231 class_45231;
        long l = 0x110010L & 925369986L;
        while ((class_45231 = (Class_45231)this.Field_46734.peek()) != null) {
            if (l == (1107306640L & 941441123L)) {
                l = Class_45231.Method_45240();
            }
            if (class_45231.Method_45241() > l) break;
            this.Field_46734.remove();
            this.Field_46729.add(class_45231);
        }
    }

    public ScheduledFuture Method_46753(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return this.Method_46737(runnable, l, l2, timeUnit);
    }

    public Class_42730 Method_46754(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l < (1078481664L & 3189494511937267714L)) {
            Object[] arrobject = new Object[15493 & 16425];
            arrobject[544 & 4096] = l;
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", arrobject));
        }
        if (l2 <= (440860804L & 1704462377L)) {
            Object[] arrobject = new Object[-3995 & 1043];
            arrobject[-26620 & 8656] = l2;
            throw new IllegalArgumentException(String.format("period: %d (expected: > 0)", arrobject));
        }
        return this.Method_46748(new Class_45231((Class_37082)this, this.Field_46734, Executors.callable(runnable, null), Class_45231.Method_45249(timeUnit.toNanos(l)), timeUnit.toNanos(l2)));
    }

    public ScheduledFuture Method_46755(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return this.Method_46754(runnable, l, l2, timeUnit);
    }

    public boolean Method_46756() {
        return (4608 & -32329) != 0;
    }

    public Class_42730 Method_46757(Callable callable, long l, TimeUnit timeUnit) {
        if (callable == null) {
            throw new NullPointerException("callable");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l < (797040L & -7094530068453518839L)) {
            Object[] arrobject = new Object[2049 & -11639];
            arrobject[2052 & 603] = l;
            throw new IllegalArgumentException(String.format("delay: %d (expected: >= 0)", arrobject));
        }
        return this.Method_46748(new Class_45231(this, this.Field_46734, callable, Class_45231.Method_45249(timeUnit.toNanos(l))));
    }

    public void Method_46758(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        this.Method_46747(runnable);
        if (!this.inEventLoop()) {
            this.Method_46759();
        }
    }

    private void Method_46759() {
        if (this.Field_46730.compareAndSet((4128 & -15351) != 0, (-23735 & 18437) != 0)) {
            Thread thread = this.Field_46727.newThread(this.Field_46733);
            thread.start();
            this.Field_46731 = thread;
        }
    }
}

