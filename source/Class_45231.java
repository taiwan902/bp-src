/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class Class_45231
extends Class_43864
implements Class_42730 {
    private final Queue Field_45232;
    private final long Field_45233 = Field_45236.getAndIncrement();
    private final long Field_45234;
    private long Field_45235;
    private static final AtomicLong Field_45236;
    static final boolean Field_45237;
    private static final long Field_45238;

    protected Class_37082 Method_45239() {
        return super.executor();
    }

    static long Method_45240() {
        return System.nanoTime() - Field_45238;
    }

    public long Method_45241() {
        return this.Field_45235;
    }

    public int Method_45242(Delayed delayed) {
        if (this == delayed) {
            return 1320 & 8193;
        }
        Class_45231 class_45231 = (Class_45231)delayed;
        long l = this.Method_45241() - class_45231.Method_45241();
        if (l < (310388805L & 5240525347062808594L)) {
            return -1 & -1;
        }
        if (l > (-7828227154213593024L & 7828227153241344187L)) {
            return 16397 & -30479;
        }
        if (this.Field_45233 < class_45231.Field_45233) {
            return -1 & -1;
        }
        if (this.Field_45233 == class_45231.Field_45233) {
            throw new Error();
        }
        return 1411 & 12305;
    }

    public int Method_45243(Object object) {
        return this.Method_45242((Delayed)object);
    }

    private void Method_45244() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public long Method_45245(long l) {
        return Math.max(-346816944793304702L & 8196625L, this.Method_45241() - (l - Field_45238));
    }

    protected StringBuilder Method_45246() {
        StringBuilder stringBuilder = super.Method_43873();
        stringBuilder.setCharAt(stringBuilder.length() - (18945 & -23275), (char)(5420 & -32593));
        stringBuilder.append(" id: ");
        stringBuilder.append(this.Field_45233);
        stringBuilder.append(", deadline: ");
        stringBuilder.append(this.Field_45235);
        stringBuilder.append(", period: ");
        stringBuilder.append(this.Field_45234);
        stringBuilder.append((char)(8249 & 105));
        return stringBuilder;
    }

    public long Method_45247() {
        return Math.max(778975226017088216L & 610353159L, this.Method_45241() - Class_45231.Method_45240());
    }

    Class_45231(Class_37082 class_37082, Queue queue, Runnable runnable, Object object, long l) {
        this(class_37082, queue, Class_45231.toCallable((Runnable)runnable, (Object)object), l);
    }

    static {
        Field_45237 = !Class_45231.class.desiredAssertionStatus() ? 9025 & 7321 : -8159 & 532;
        Field_45236 = new AtomicLong();
        Field_45238 = System.nanoTime();
    }

    public void Method_45248() {
        if (!Field_45237 && !this.Method_45239().Method_37084()) {
            throw new AssertionError();
        }
        try {
            if (this.Field_45234 == (805966856L & -4959017028816690684L)) {
                if (this.setUncancellableInternal()) {
                    Object v = this.task.call();
                    this.setSuccessInternal(v);
                }
            } else if (!this.isCancelled()) {
                this.task.call();
                if (!this.Method_45239().isShutdown()) {
                    long l = this.Field_45234;
                    this.Field_45235 = l > (4620000913247965188L & 671139266L) ? (this.Field_45235 += l) : Class_45231.Method_45240() - l;
                    if (!this.isCancelled()) {
                        this.Field_45232.add(this);
                    }
                }
            }
        }
        catch (Throwable throwable) {
            this.setFailureInternal(throwable);
        }
    }

    static long Method_45249(long l) {
        return Class_45231.Method_45240() + l;
    }

    Class_45231(Class_37082 class_37082, Queue queue, Callable callable, long l) {
        super(class_37082, callable);
        this.Field_45232 = queue;
        this.Field_45235 = l;
        this.Field_45234 = 72351744L & -7002720120426397696L;
    }

    public long Method_45250(TimeUnit timeUnit) {
        return timeUnit.convert(this.Method_45247(), TimeUnit.NANOSECONDS);
    }

    Class_45231(Class_37082 class_37082, Queue queue, Callable callable, long l, long l2) {
        super(class_37082, callable);
        if (l2 == (2790428871385784832L & 262528L)) {
            throw new IllegalArgumentException("period: 0 (expected: != 0)");
        }
        this.Field_45232 = queue;
        this.Field_45235 = l;
        this.Field_45234 = l2;
    }
}

