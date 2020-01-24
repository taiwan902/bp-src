/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class Class_32728
extends Class_27041 {
    public static final Object Field_32729 = new Object();

    public Object Method_32730(int n) {
        Object[] arrobject = this.indexedVariables;
        return n < arrobject.length ? arrobject[n] : Field_32729;
    }

    public Map Method_32731() {
        IdentityHashMap identityHashMap = this.typeParameterMatcherFindCache;
        if (identityHashMap == null) {
            this.typeParameterMatcherFindCache = identityHashMap = new IdentityHashMap();
        }
        return identityHashMap;
    }

    public static void Method_32732() {
        Thread thread = Thread.currentThread();
        if (thread instanceof Class_18149) {
            ((Class_18149)thread).Method_18153(null);
        } else {
            ThreadLocal threadLocal = Class_27041.Field_27050;
            if (threadLocal != null) {
                threadLocal.remove();
            }
        }
    }

    public Map Method_32733() {
        IdentityHashMap identityHashMap = this.charsetEncoderCache;
        if (identityHashMap == null) {
            this.charsetEncoderCache = identityHashMap = new IdentityHashMap();
        }
        return identityHashMap;
    }

    public void Method_32734(int n) {
        this.futureListenerStackDepth = n;
    }

    public void Method_32735(int n) {
        this.localChannelReaderStackDepth = n;
    }

    private void Method_32736(int n, Object object) {
        Object[] arrobject = this.indexedVariables;
        int n2 = arrobject.length;
        int n3 = n;
        n3 |= n3 >>> (9483 & -28591);
        n3 |= n3 >>> (6150 & 10123);
        n3 |= n3 >>> (-28660 & 26180);
        n3 |= n3 >>> (18745 & -27576);
        n3 |= n3 >>> (1200 & 6225);
        Object[] arrobject2 = Arrays.copyOf(arrobject, ++n3);
        Arrays.fill(arrobject2, n2, arrobject2.length, Field_32729);
        arrobject2[n] = object;
        this.indexedVariables = arrobject2;
    }

    private static Class_32728 Method_32737(Class_18149 class_18149) {
        Class_32728 class_32728 = class_18149.Method_18151();
        if (class_32728 == null) {
            class_32728 = new Class_32728();
            class_18149.Method_18153(class_32728);
        }
        return class_32728;
    }

    private Class_32728() {
        super(Class_32728.Method_32750());
    }

    public Class_43471 Method_32738() {
        return this.counterHashCode;
    }

    public Map Method_32739() {
        IdentityHashMap identityHashMap = this.typeParameterMatcherGetCache;
        if (identityHashMap == null) {
            this.typeParameterMatcherGetCache = identityHashMap = new IdentityHashMap();
        }
        return identityHashMap;
    }

    public Map Method_32740() {
        WeakHashMap weakHashMap = this.handlerSharableCache;
        if (weakHashMap == null) {
            this.handlerSharableCache = weakHashMap = new WeakHashMap(10245 & -12250);
        }
        return weakHashMap;
    }

    public int Method_32741() {
        return this.localChannelReaderStackDepth;
    }

    public int Method_32742() {
        return this.futureListenerStackDepth;
    }

    public static Class_32728 Method_32743() {
        Thread thread = Thread.currentThread();
        if (thread instanceof Class_18149) {
            return Class_32728.Method_32737((Class_18149)thread);
        }
        return Class_32728.Method_32746();
    }

    public static int Method_32744() {
        int n = nextIndex.getAndIncrement();
        if (n < 0) {
            nextIndex.decrementAndGet();
            throw new IllegalStateException("too many thread-local indexed variables");
        }
        return n;
    }

    public Map Method_32745() {
        IdentityHashMap identityHashMap = this.charsetDecoderCache;
        if (identityHashMap == null) {
            this.charsetDecoderCache = identityHashMap = new IdentityHashMap();
        }
        return identityHashMap;
    }

    private static Class_32728 Method_32746() {
        Class_32728 class_32728;
        ThreadLocal<Class_32728> threadLocal = Class_27041.Field_27050;
        if (threadLocal == null) {
            Class_27041.Field_27050 = threadLocal = new ThreadLocal<Class_32728>();
        }
        if ((class_32728 = (Class_32728)threadLocal.get()) == null) {
            class_32728 = new Class_32728();
            threadLocal.set(class_32728);
        }
        return class_32728;
    }

    public static Class_32728 Method_32747() {
        ThreadLocal threadLocal;
        Thread thread = Thread.currentThread();
        Object object = thread instanceof Class_18149 ? ((Class_18149)thread).Method_18151() : ((threadLocal = Class_27041.Field_27050) == null ? null : (Class_32728)threadLocal.get());
        return object;
    }

    public Class_32341 Method_32748() {
        Class_32341 class_32341 = this.random;
        if (class_32341 == null) {
            this.random = class_32341 = new Class_32341();
        }
        return class_32341;
    }

    public boolean Method_32749(int n, Object object) {
        Object[] arrobject = this.indexedVariables;
        if (n < arrobject.length) {
            Object object2 = arrobject[n];
            arrobject[n] = object;
            return (object2 == Field_32729 ? 17 & 23977 : 3072 & -28669) != 0;
        }
        this.Method_32736(n, object);
        return (21521 & -31987) != 0;
    }

    private static Object[] Method_32750() {
        Object[] arrobject = new Object[16430 & 2144];
        Arrays.fill(arrobject, Field_32729);
        return arrobject;
    }

    private void Method_32751() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_32752(int n) {
        Object[] arrobject = this.indexedVariables;
        if (n < arrobject.length) {
            Object object = arrobject[n];
            arrobject[n] = Field_32729;
            return object;
        }
        return Field_32729;
    }

    public void Method_32753(Class_43471 class_43471) {
        this.counterHashCode = class_43471;
    }
}

