/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class Class_34534
extends Class_31404 {
    private static final AtomicReferenceFieldUpdater Field_34535;
    private transient Class_21175 Field_34536;

    Class_34534() {
    }

    static {
        AtomicReferenceFieldUpdater<Class_34534, Class_21175> atomicReferenceFieldUpdater = Class_7799.Method_7835(Class_34534.class, Class_34534.Method_34542("\u0a26\u0a22\u0a22\u0a26\u0a00\u0a26\u0a24"));
        if (atomicReferenceFieldUpdater == null) {
            atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(Class_34534.class, Class_21175.class, Class_34534.Method_34537("\u4001\u4005\u4006\u4002\u4003\u4005\u4005"));
        }
        Field_34535 = atomicReferenceFieldUpdater;
    }

    private static String Method_34537(String string) {
        int n = 28854;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34534.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected final Class_21175 Method_34538() {
        return this.Field_34536;
    }

    private void Method_34539() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected final void Method_34540(Class_21175 class_21175) {
        this.Field_34536 = class_21175;
    }

    protected final Class_21175 Method_34541(Class_21175 class_21175) {
        return Field_34535.getAndSet(this, class_21175);
    }

    private static String Method_34542(String string) {
        int n = 12792;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34534.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

