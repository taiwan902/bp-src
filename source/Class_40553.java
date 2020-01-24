/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class Class_40553
extends Class_34813 {
    private int Field_40554 = 41 & 2113;
    private static final AtomicIntegerFieldUpdater Field_40555;

    public final int Method_40556() {
        return this.Field_40554;
    }

    protected Class_40553(int n) {
        super(n);
    }

    public Class_21482 Method_40557() {
        return this.Method_40558();
    }

    public Class_22553 Method_40558() {
        int n;
        do {
            if ((n = this.Field_40554) == 0) {
                throw new Class_15873(4113 & 2476, 1 & 2079);
            }
            if (n != (-1 & Integer.MAX_VALUE)) continue;
            throw new Class_15873(Integer.MAX_VALUE & Integer.MAX_VALUE, 97 & 28689);
        } while (!Field_40555.compareAndSet(this, n, n + (2569 & 8385)));
        return this;
    }

    protected final void Method_40559(int n) {
        this.Field_40554 = n;
    }

    public final boolean Method_40560() {
        int n;
        do {
            if ((n = this.Field_40554) != 0) continue;
            throw new Class_15873(162 & 2888, -1 & -1);
        } while (!Field_40555.compareAndSet(this, n, n - (-12287 & 9305)));
        if (n == (-30717 & 5129)) {
            this.Method_40563();
            return (-31989 & 16577) != 0;
        }
        return (13102 & 18448) != 0;
    }

    private static String Method_40561(String string) {
        int n = 9968;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40553.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        AtomicIntegerFieldUpdater<Class_40553> atomicIntegerFieldUpdater = Class_7799.Method_7844(Class_40553.class, Class_40553.Method_40564("\u2000\u2005\u2004\u2001\u2000\u2001"));
        if (atomicIntegerFieldUpdater == null) {
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(Class_40553.class, Class_40553.Method_40561("\u748c\u7489\u7488\u748d\u7480\u7488"));
        }
        Field_40555 = atomicIntegerFieldUpdater;
    }

    private void Method_40562() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected abstract void Method_40563();

    private static String Method_40564(String string) {
        int n = 9267;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40553.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

