/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Class_28010
implements Class_24899 {
    private static final AtomicReferenceFieldUpdater Field_28011;
    private AtomicReferenceArray Field_28012;

    public Class_34810 Method_28013(Class_28213 class_28213) {
        int n;
        Class_35774 class_35774;
        if (class_28213 == null) {
            throw new NullPointerException("key");
        }
        AtomicReferenceArray atomicReferenceArray = this.Field_28012;
        if (atomicReferenceArray == null && !Field_28011.compareAndSet(this, null, atomicReferenceArray = new AtomicReferenceArray(10276 & -28268))) {
            atomicReferenceArray = this.Field_28012;
        }
        if ((class_35774 = (Class_35774)atomicReferenceArray.get(n = Class_28010.Method_28017(class_28213))) == null) {
            class_35774 = new Class_35774(class_28213);
            if (atomicReferenceArray.compareAndSet(n, null, class_35774)) {
                return class_35774;
            }
            class_35774 = (Class_35774)atomicReferenceArray.get(n);
        }
        Class_35774 class_357742 = class_35774;
        synchronized (class_357742) {
            Class_35774 class_357743 = class_35774;
            do {
                if (!Class_35774.Method_35783(class_357743) && Class_35774.Method_35782(class_357743) == class_28213) {
                    return class_357743;
                }
                Class_35774 class_357744 = Class_35774.Method_35785(class_357743);
                if (class_357744 == null) {
                    Class_35774 class_357745 = new Class_35774(class_35774, class_28213);
                    Class_35774.Method_35784(class_357743, class_357745);
                    Class_35774.Method_35781(class_357745, class_357743);
                    return class_357745;
                }
                class_357743 = class_357744;
            } while (true);
        }
    }

    private static String Method_28014(String string) {
        int n = 10983;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28010.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        AtomicReferenceFieldUpdater<Class_28010, AtomicReferenceArray> atomicReferenceFieldUpdater = Class_7799.Method_7835(Class_28010.class, Class_28010.Method_28015("\u900d\u9009\u900a\u900f\u9001\u9009\u900f\u900f\u9009\u900c"));
        if (atomicReferenceFieldUpdater == null) {
            atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(Class_28010.class, AtomicReferenceArray.class, Class_28010.Method_28014("\u4081\u4080\u4080\u4080\u4085\u4084\u4085\u4084\u4081\u4081"));
        }
        Field_28011 = atomicReferenceFieldUpdater;
    }

    private static String Method_28015(String string) {
        int n = 25836;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28010.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_28016() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static int Method_28017(Class_28213 class_28213) {
        return class_28213.id() & (-22521 & 123);
    }
}

