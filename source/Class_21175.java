/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class Class_21175 {
    private Class_21175 Field_21176;
    private static final AtomicReferenceFieldUpdater Field_21177;

    static {
        AtomicReferenceFieldUpdater<Class_21175, Class_21175> atomicReferenceFieldUpdater = Class_7799.Method_7835(Class_21175.class, Class_21175.Method_21181("\u09ba\u09b1\u09a8\u09a1"));
        if (atomicReferenceFieldUpdater == null) {
            atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(Class_21175.class, Class_21175.class, Class_21175.Method_21180("\u180b\u1800\u181f\u1813"));
        }
        Field_21177 = atomicReferenceFieldUpdater;
    }

    final void Method_21178(Class_21175 class_21175) {
        Field_21177.lazySet(this, class_21175);
    }

    public abstract Object Method_21179();

    private static String Method_21180(String string) {
        int n = 16604;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21175.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21181(String string) {
        int n = 3828;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21175.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    void Method_21182() {
        this.Method_21178(null);
    }

    private void Method_21183() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Object Method_21184() {
        return this.Method_21179();
    }

    final Class_21175 Method_21185() {
        return this.Field_21176;
    }
}

