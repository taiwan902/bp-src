/*
 * Decompiled with CFR 0.145.
 */
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class Class_22284
extends Class_13500
implements Serializable {
    private static final AtomicReferenceFieldUpdater Field_22285;
    private transient Class_21175 Field_22286;

    Class_22284() {
    }

    protected final Class_21175 Method_22287() {
        return this.Field_22286;
    }

    private static String Method_22288(String string) {
        int n = 29265;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22284.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        AtomicReferenceFieldUpdater<Class_22284, Class_21175> atomicReferenceFieldUpdater = Class_7799.Method_7835(Class_22284.class, Class_22284.Method_22288("\u6870\u687c\u687b\u687f\u684c\u6878\u687a"));
        if (atomicReferenceFieldUpdater == null) {
            atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(Class_22284.class, Class_21175.class, Class_22284.Method_22290("\u2020\u2020\u2022\u2022\u2002\u2020\u2020"));
        }
        Field_22285 = atomicReferenceFieldUpdater;
    }

    protected final void Method_22289(Class_21175 class_21175) {
        Field_22285.lazySet(this, class_21175);
    }

    private static String Method_22290(String string) {
        int n = 1593;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22284.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_22291() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected final void Method_22292(Class_21175 class_21175) {
        this.Field_22286 = class_21175;
    }
}

