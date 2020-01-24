/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class Class_46518
extends Class_46087 {
    private final Set Field_46519 = new LinkedHashSet<E>();
    private final Thread Field_46520;
    private long Field_46521;
    private final Class_17563 Field_46522;
    private static final Class_6113 Field_46523;
    static final boolean Field_46524;
    private final boolean Field_46525;
    private final Semaphore Field_46526 = new Semaphore(256 & 27168);
    private static final Runnable Field_46527;
    private long Field_46528;
    private final Class_33149 Field_46529 = new Class_41731(Class_46724.Field_46725);
    private int Field_46530 = 513 & 10433;
    private static final long Field_46531;
    private static final AtomicIntegerFieldUpdater Field_46532;
    final Queue Field_46533 = new PriorityQueue<E>();
    private long Field_46534;
    private final Queue Field_46535;
    private long Field_46536;

    protected boolean Method_46537() {
        if (!Field_46524 && !this.inEventLoop()) {
            throw new AssertionError();
        }
        Class_45231 class_45231 = (Class_45231)this.Field_46533.peek();
        return (class_45231 != null && class_45231.Method_45241() <= Class_45231.Method_45240() ? -29471 & 24579 : 18496 & -23916) != 0;
    }

    @Deprecated
    public void Method_46538() {
        int n;
        int n2;
        int n3;
        if (this.Method_46579()) {
            return;
        }
        boolean bl = this.inEventLoop();
        do {
            if (this.Method_46561()) {
                return;
            }
            n2 = 30977 & -31715;
            n = Field_46532.get(this);
            if (bl) {
                n3 = -32498 & 2565;
                continue;
            }
            switch (n) {
                case 1: 
                case 2: 
                case 3: {
                    n3 = -24564 & 16485;
                    break;
                }
                default: {
                    n3 = n;
                    n2 = 1105 & 19204;
                }
            }
        } while (!Field_46532.compareAndSet(this, n, n3));
        if (n == (1377 & -15731)) {
            this.Field_46520.start();
        }
        if (n2 != 0) {
            this.Method_46577(bl);
        }
    }

    public ScheduledFuture Method_46539(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return this.Method_46580(runnable, l, l2, timeUnit);
    }

    protected long Method_46540(long l) {
        Class_45231 class_45231 = (Class_45231)this.Field_46533.peek();
        if (class_45231 == null) {
            return Field_46531;
        }
        return class_45231.Method_45245(l);
    }

    static Set Method_46541(Class_46518 class_46518) {
        return class_46518.Field_46519;
    }

    static long Method_46542(Class_46518 class_46518) {
        return class_46518.Field_46534;
    }

    protected boolean Method_46543(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        return this.Field_46535.remove(runnable);
    }

    public Class_42730 Method_46544(Runnable runnable, long l, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l < (-5415930606086487806L & 5415930606028604608L)) {
            Object[] arrobject = new Object[17921 & 2129];
            arrobject[-31212 & 16554] = l;
            throw new IllegalArgumentException(String.format("delay: %d (expected: >= 0)", arrobject));
        }
        return this.Method_46549(new Class_45231((Class_37082)this, this.Field_46533, runnable, null, Class_45231.Method_45249(timeUnit.toNanos(l))));
    }

    public void Method_46545(Runnable runnable) {
        if (this.inEventLoop()) {
            this.Field_46519.add(runnable);
        } else {
            this.Method_46572(new Class_26545(this, runnable));
        }
    }

    public ScheduledFuture Method_46546(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        return this.Method_46576(runnable, l, l2, timeUnit);
    }

    protected void Method_46547() {
    }

    protected boolean Method_46548() {
        this.Method_46571();
        Runnable runnable = this.Method_46575();
        if (runnable == null) {
            return (4231 & -29632) != 0;
        }
        do {
            try {
                runnable.run();
            }
            catch (Throwable throwable) {
                Field_46523.Method_6127("A task raised an exception.", throwable);
            }
        } while ((runnable = this.Method_46575()) != null);
        this.Field_46521 = Class_45231.Method_45240();
        return (33 & 3333) != 0;
    }

    private Class_42730 Method_46549(Class_45231 class_45231) {
        if (class_45231 == null) {
            throw new NullPointerException("task");
        }
        if (this.inEventLoop()) {
            this.Field_46533.add(class_45231);
        } else {
            this.Method_46572(new Class_23408(this, class_45231));
        }
        return class_45231;
    }

    static Semaphore Method_46550(Class_46518 class_46518) {
        return class_46518.Field_46526;
    }

    protected static void Method_46551() {
        throw new RejectedExecutionException("event executor terminated");
    }

    protected boolean Method_46552() {
        if (!this.Method_46561()) {
            return (-31704 & 26693) != 0;
        }
        if (!this.inEventLoop()) {
            throw new IllegalStateException("must be invoked from an event loop");
        }
        this.Method_46581();
        if (this.Field_46534 == (4398987086202147025L & -4398987087313884640L)) {
            this.Field_46534 = Class_45231.Method_45240();
        }
        if (this.Method_46548() || this.Method_46569()) {
            if (this.Method_46579()) {
                return (3601 & 16387) != 0;
            }
            this.Method_46577((2065 & 13) != 0);
            return (5329 & 2566) != 0;
        }
        long l = Class_45231.Method_45240();
        if (this.Method_46579() || l - this.Field_46534 > this.Field_46536) {
            return (2563 & 16405) != 0;
        }
        if (l - this.Field_46521 <= this.Field_46528) {
            this.Method_46577((4113 & 1665) != 0);
            try {
                Thread.sleep(1375744126L & -6780438204888513820L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            return (18187 & 16) != 0;
        }
        return (23425 & 15) != 0;
    }

    public boolean Method_46553(long l, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (this.inEventLoop()) {
            throw new IllegalStateException("cannot await termination of the current thread");
        }
        if (this.Field_46526.tryAcquire(l, timeUnit)) {
            this.Field_46526.release();
        }
        return this.Method_46584();
    }

    static Queue Method_46554(Class_46518 class_46518) {
        return class_46518.Field_46535;
    }

    public void Method_46555(Runnable runnable) {
        if (this.inEventLoop()) {
            this.Field_46519.remove(runnable);
        } else {
            this.Method_46572(new Class_32123(this, runnable));
        }
    }

    protected boolean Method_46556(Runnable runnable) {
        return (8465 & 2273) != 0;
    }

    protected boolean Method_46557() {
        if (!Field_46524 && !this.inEventLoop()) {
            throw new AssertionError();
        }
        return (!this.Field_46535.isEmpty() ? 653 & -24573 : -32736 & 9287) != 0;
    }

    public ScheduledFuture Method_46558(Runnable runnable, long l, TimeUnit timeUnit) {
        return this.Method_46544(runnable, l, timeUnit);
    }

    public ScheduledFuture Method_46559(Callable callable, long l, TimeUnit timeUnit) {
        return this.Method_46568(callable, l, timeUnit);
    }

    public Class_21065 Method_46560() {
        return this.Field_46529;
    }

    public boolean Method_46561() {
        return (Field_46532.get(this) >= (-32465 & 22083) ? 17345 & 6177 : 17504 & -32759) != 0;
    }

    private static String Method_46562(String string) {
        int n = 17083;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_46518.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_46563() {
        if (Field_46532.get(this) == (5269 & 9) && Field_46532.compareAndSet(this, -32637 & 8257, 24690 & 130)) {
            this.Field_46533.add(new Class_45231((Class_37082)this, this.Field_46533, Executors.callable(new Class_25333(this, null), null), Class_45231.Method_45249(Field_46531), -Field_46531));
            this.Field_46520.start();
        }
    }

    protected abstract void Method_46564();

    protected void Method_46565() {
        this.Field_46521 = Class_45231.Method_45240();
    }

    protected Runnable Method_46566() {
        Runnable runnable;
        if (!Field_46524 && !this.inEventLoop()) {
            throw new AssertionError();
        }
        if (!(this.Field_46535 instanceof BlockingQueue)) {
            throw new UnsupportedOperationException();
        }
        BlockingQueue blockingQueue = (BlockingQueue)this.Field_46535;
        do {
            Class_45231 class_45231;
            if ((class_45231 = (Class_45231)this.Field_46533.peek()) == null) {
                Runnable runnable2 = null;
                try {
                    runnable2 = (Runnable)blockingQueue.take();
                    if (runnable2 == Field_46527) {
                        runnable2 = null;
                    }
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                return runnable2;
            }
            long l = class_45231.Method_45247();
            runnable = null;
            if (l > (673186954L & 1083146513L)) {
                try {
                    runnable = (Runnable)blockingQueue.poll(l, TimeUnit.NANOSECONDS);
                }
                catch (InterruptedException interruptedException) {
                    return null;
                }
            }
            if (runnable != null) continue;
            this.Method_46571();
            runnable = (Runnable)blockingQueue.poll();
        } while (runnable == null);
        return runnable;
    }

    static {
        Field_46524 = !Class_46518.class.desiredAssertionStatus() ? -8183 & 4209 : 14721 & 1570;
        Field_46523 = Class_10201.Method_10203(Class_46518.class);
        Field_46527 = new Class_9921();
        AtomicIntegerFieldUpdater<Class_46518> atomicIntegerFieldUpdater = Class_7799.Method_7844(Class_46518.class, Class_46518.Method_46562("\u8c10\u8c17\u8c00\u8c15\u8c02"));
        if (atomicIntegerFieldUpdater == null) {
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(Class_46518.class, Class_46518.Method_46583("\u1080\u1083\u1090\u1081\u1092"));
        }
        Field_46532 = atomicIntegerFieldUpdater;
        Field_46531 = TimeUnit.SECONDS.toNanos(61221153L & 1115265L);
    }

    public Class_21065 Method_46567(long l, long l2, TimeUnit timeUnit) {
        int n;
        int n2;
        int n3;
        if (l < (271190280L & 127200111176819269L)) {
            throw new IllegalArgumentException("quietPeriod: " + l + " (expected >= 0)");
        }
        if (l2 < l) {
            throw new IllegalArgumentException("timeout: " + l2 + " (expected >= quietPeriod (" + l + "))");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (this.Method_46561()) {
            return this.Method_46560();
        }
        boolean bl = this.inEventLoop();
        do {
            if (this.Method_46561()) {
                return this.Method_46560();
            }
            n = 6145 & 16581;
            n2 = Field_46532.get(this);
            if (bl) {
                n3 = 16455 & 3587;
                continue;
            }
            switch (n2) {
                case 1: 
                case 2: {
                    n3 = 283 & -32733;
                    break;
                }
                default: {
                    n3 = n2;
                    n = -31594 & 16457;
                }
            }
        } while (!Field_46532.compareAndSet(this, n2, n3));
        this.Field_46528 = timeUnit.toNanos(l);
        this.Field_46536 = timeUnit.toNanos(l2);
        if (n2 == (27975 & 33)) {
            this.Field_46520.start();
        }
        if (n != 0) {
            this.Method_46577(bl);
        }
        return this.Method_46560();
    }

    public Class_42730 Method_46568(Callable callable, long l, TimeUnit timeUnit) {
        if (callable == null) {
            throw new NullPointerException("callable");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l < (-1053753252320902016L & 1053753251977238534L)) {
            Object[] arrobject = new Object[5953 & 26761];
            arrobject[4696 & -30463] = l;
            throw new IllegalArgumentException(String.format("delay: %d (expected: >= 0)", arrobject));
        }
        return this.Method_46549(new Class_45231(this, this.Field_46533, callable, Class_45231.Method_45249(timeUnit.toNanos(l))));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean Method_46569() {
        int n = 420 & -24040;
        while (!this.Field_46519.isEmpty()) {
            ArrayList<E> arrayList = new ArrayList<E>(this.Field_46519);
            this.Field_46519.clear();
            for (Runnable runnable : arrayList) {
                try {
                    runnable.run();
                }
                catch (Throwable throwable) {
                    try {
                        Field_46523.Method_6127("Shutdown hook raised an exception.", throwable);
                    }
                    catch (Throwable throwable2) {
                        n = -28631 & 197;
                        throw throwable2;
                    }
                    n = -16115 & 12369;
                    continue;
                }
                n = 20121 & 257;
            }
        }
        if (n != 0) {
            this.Field_46521 = Class_45231.Method_45240();
        }
        return n != 0;
    }

    public boolean Method_46570(Thread thread) {
        return (thread == this.Field_46520 ? 2313 & -31599 : -32671 & 25220) != 0;
    }

    protected Class_46518(Class_17563 class_17563, ThreadFactory threadFactory, boolean bl) {
        if (threadFactory == null) {
            throw new NullPointerException("threadFactory");
        }
        this.Field_46522 = class_17563;
        this.Field_46525 = bl;
        this.Field_46520 = threadFactory.newThread(new Class_24471(this));
        this.Field_46535 = this.Method_46585();
    }

    private void Method_46571() {
        Class_45231 class_45231;
        long l = 8673340478885732449L & 557979284L;
        while ((class_45231 = (Class_45231)this.Field_46533.peek()) != null) {
            if (l == (366038082L & 6437014400167064448L)) {
                l = Class_45231.Method_45240();
            }
            if (class_45231.Method_45241() > l) break;
            this.Field_46533.remove();
            this.Field_46535.add(class_45231);
        }
    }

    public void Method_46572(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        boolean bl = this.inEventLoop();
        if (bl) {
            this.Method_46582(runnable);
        } else {
            this.Method_46563();
            this.Method_46582(runnable);
            if (this.Method_46579() && this.Method_46543(runnable)) {
                Class_46518.Method_46551();
            }
        }
        if (!this.Field_46525 && this.Method_46556(runnable)) {
            this.Method_46577(bl);
        }
    }

    static AtomicIntegerFieldUpdater Method_46573() {
        return Field_46532;
    }

    static Class_33149 Method_46574(Class_46518 class_46518) {
        return class_46518.Field_46529;
    }

    protected Runnable Method_46575() {
        Runnable runnable;
        if (!Field_46524 && !this.inEventLoop()) {
            throw new AssertionError();
        }
        while ((runnable = (Runnable)this.Field_46535.poll()) == Field_46527) {
        }
        return runnable;
    }

    public Class_42730 Method_46576(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l < (1596160137235335232L & 50475288L)) {
            Object[] arrobject = new Object[-32509 & 12937];
            arrobject[1024 & 2130] = l;
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", arrobject));
        }
        if (l2 <= (-6643181050807287530L & 2103873L)) {
            Object[] arrobject = new Object[719 & 2049];
            arrobject[16 & -15352] = l2;
            throw new IllegalArgumentException(String.format("period: %d (expected: > 0)", arrobject));
        }
        return this.Method_46549(new Class_45231((Class_37082)this, this.Field_46533, Executors.callable(runnable, null), Class_45231.Method_45249(timeUnit.toNanos(l)), timeUnit.toNanos(l2)));
    }

    protected void Method_46577(boolean bl) {
        if (!bl || Field_46532.get(this) == (6659 & 9259)) {
            this.Field_46535.add(Field_46527);
        }
    }

    protected boolean Method_46578(long l) {
        long l2;
        block4 : {
            this.Method_46571();
            Runnable runnable = this.Method_46575();
            if (runnable == null) {
                return (69 & 2466) != 0;
            }
            long l3 = Class_45231.Method_45240() + l;
            long l4 = -3634595739711364842L & 117725416L;
            do {
                try {
                    runnable.run();
                }
                catch (Throwable throwable) {
                    Field_46523.Method_6127("A task raised an exception.", throwable);
                }
                if (((l4 += 134780033L & 1615135041L) & (1644709055L & 432943889679387519L)) == (621821760L & 3963049258802593840L) && (l2 = Class_45231.Method_45240()) >= l3) break block4;
            } while ((runnable = this.Method_46575()) != null);
            l2 = Class_45231.Method_45240();
        }
        this.Field_46521 = l2;
        return (2421 & -16383) != 0;
    }

    public boolean Method_46579() {
        return (Field_46532.get(this) >= (-15356 & 140) ? 17949 & 8417 : 1025 & 20672) != 0;
    }

    public Class_42730 Method_46580(Runnable runnable, long l, long l2, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("command");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        if (l < (2127069860376675616L & 1073782928L)) {
            Object[] arrobject = new Object[9473 & 2071];
            arrobject[10400 & 9] = l;
            throw new IllegalArgumentException(String.format("initialDelay: %d (expected: >= 0)", arrobject));
        }
        if (l2 <= (812441616L & -8236769283870160892L)) {
            Object[] arrobject = new Object[33 & 23123];
            arrobject[24704 & 0] = l2;
            throw new IllegalArgumentException(String.format("delay: %d (expected: > 0)", arrobject));
        }
        return this.Method_46549(new Class_45231((Class_37082)this, this.Field_46533, Executors.callable(runnable, null), Class_45231.Method_45249(timeUnit.toNanos(l)), -timeUnit.toNanos(l2)));
    }

    private void Method_46581() {
        Class_45231[] arrclass_45231;
        if (this.Field_46533.isEmpty()) {
            return;
        }
        Class_45231[] arrclass_452312 = arrclass_45231 = this.Field_46533.toArray(new Class_45231[this.Field_46533.size()]);
        int n = arrclass_452312.length;
        for (int i = 516 & 58; i < n; ++i) {
            Class_45231 class_45231 = arrclass_452312[i];
            class_45231.cancel((25089 & 194) != 0);
        }
        this.Field_46533.clear();
    }

    protected void Method_46582(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        if (this.Method_46579()) {
            Class_46518.Method_46551();
        }
        this.Field_46535.add(runnable);
    }

    private static String Method_46583(String string) {
        int n = 18728;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_46518.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_46584() {
        return (Field_46532.get(this) == (-30203 & 28701) ? 4641 & -16377 : -32568 & 9748) != 0;
    }

    protected Queue Method_46585() {
        return new LinkedBlockingQueue<E>();
    }

    private void Method_46586() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_6113 Method_46587() {
        return Field_46523;
    }
}

