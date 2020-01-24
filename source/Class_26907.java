/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Queue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Class_26907 {
    private static final Queue Field_26908;
    private static final AtomicBoolean Field_26909;
    private static final ThreadFactory Field_26910;
    private static Thread Field_26911;
    private static final Class_6113 Field_26912;
    private static final Class_32354 Field_26913;

    static Class_6113 Method_26914() {
        return Field_26912;
    }

    public static void Method_26915(Thread thread, Runnable runnable) {
        if (thread == null) {
            throw new NullPointerException("thread");
        }
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        Class_26907.Method_26919(thread, runnable, (12290 & -15248) != 0);
    }

    static AtomicBoolean Method_26916() {
        return Field_26909;
    }

    public static void Method_26917(Thread thread, Runnable runnable) {
        if (thread == null) {
            throw new NullPointerException("thread");
        }
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        if (!thread.isAlive()) {
            throw new IllegalArgumentException("thread must be alive.");
        }
        Class_26907.Method_26919(thread, runnable, (5189 & -32623) != 0);
    }

    private void Method_26918() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_26907() {
    }

    private static void Method_26919(Thread thread, Runnable runnable, boolean bl) {
        Field_26908.add(new Class_34711(thread, runnable, bl));
        if (Field_26909.compareAndSet((9 & 25092) != 0, (24609 & 641) != 0)) {
            Thread thread2 = Field_26910.newThread(Field_26913);
            thread2.start();
            Field_26911 = thread2;
        }
    }

    static {
        Field_26912 = Class_10201.Method_10203(Class_26907.class);
        Field_26910 = new Class_15627(Class_26907.class, (5185 & 675) != 0, -7907 & 643);
        Field_26908 = Class_7799.Method_7830();
        Field_26913 = new Class_32354(null);
        Field_26909 = new AtomicBoolean();
    }

    static Queue Method_26920() {
        return Field_26908;
    }
}

