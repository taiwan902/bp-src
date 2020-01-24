/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;

public abstract class Class_30282
extends Class_29608 {
    private final Class_27121 Field_30283;
    private final AtomicInteger Field_30284 = new AtomicInteger();
    private final Class_37082[] Field_30285;
    private final Class_33149 Field_30286 = new Class_41731(Class_46724.Field_46725);
    private final AtomicInteger Field_30287 = new AtomicInteger();

    public boolean Method_30288() {
        Class_37082[] arrclass_37082 = this.Field_30285;
        int n = arrclass_37082.length;
        for (int i = 6201 & 16960; i < n; ++i) {
            Class_37082 class_37082 = arrclass_37082[i];
            if (class_37082.isTerminated()) continue;
            return (-30424 & 1168) != 0;
        }
        return (18449 & 161) != 0;
    }

    static Class_33149 Method_30289(Class_30282 class_30282) {
        return class_30282.Field_30286;
    }

    protected Set Method_30290() {
        Set set = Collections.newSetFromMap(new LinkedHashMap());
        Collections.addAll(set, this.Field_30285);
        return set;
    }

    public boolean Method_30291() {
        Class_37082[] arrclass_37082 = this.Field_30285;
        int n = arrclass_37082.length;
        for (int i = 8 & 22416; i < n; ++i) {
            Class_37082 class_37082 = arrclass_37082[i];
            if (class_37082.isShutdown()) continue;
            return (-30702 & 12320) != 0;
        }
        return (-31729 & 577) != 0;
    }

    private void Method_30292() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_21065 Method_30293(long l, long l2, TimeUnit timeUnit) {
        Class_37082[] arrclass_37082 = this.Field_30285;
        int n = arrclass_37082.length;
        for (int i = 3074 & -28540; i < n; ++i) {
            Class_37082 class_37082 = arrclass_37082[i];
            class_37082.shutdownGracefully(l, l2, timeUnit);
        }
        return this.Method_30300();
    }

    private static boolean Method_30294(int n) {
        return ((n & -n) == n ? -23439 & 20619 : -15854 & 64) != 0;
    }

    protected abstract Class_37082 Method_30295(ThreadFactory var1, Object ... var2);

    public Iterator Method_30296() {
        return this.Method_30290().iterator();
    }

    protected Class_30282(int n, ThreadFactory threadFactory, Object ... arrobject) {
        int n2;
        if (n <= 0) {
            Object[] arrobject2 = new Object[659 & 97];
            arrobject2[17465 & 4160] = n;
            throw new IllegalArgumentException(String.format("nThreads: %d (expected: > 0)", arrobject2));
        }
        if (threadFactory == null) {
            threadFactory = this.Method_30304();
        }
        this.Field_30285 = new Class_46518[n];
        this.Field_30283 = Class_30282.Method_30294(this.Field_30285.length) ? new Class_32211(this, null) : new Class_35969(this, null);
        block8 : for (int i = 19472 & 4484; i < n; ++i) {
            int n3 = 16736 & 8718;
            try {
                this.Field_30285[i] = this.Method_30295(threadFactory, arrobject);
                n3 = 21529 & 8709;
                if (n3 != 0) continue;
            }
            catch (Exception exception) {
                try {
                    Class_18.Field_19.error((Object)exception);
                    for (int j = -16366 & 1184; j < (10251 & 458); ++j) {
                        System.err.println("failed to create a child event loop");
                        Class_18.Field_19.info("failed to create a child event loop");
                    }
                    System.exit(18453 & 1387);
                    throw new IllegalStateException("failed to create a child event loop", exception);
                }
                catch (Throwable throwable) {
                    if (n3 == 0) {
                        int n4;
                        for (n4 = 3077 & 672; n4 < i; ++n4) {
                            this.Field_30285[n4].shutdownGracefully();
                        }
                        for (n4 = -32640 & 20595; n4 < i; ++n4) {
                            Class_37082 class_37082 = this.Field_30285[n4];
                            try {
                                while (!class_37082.isTerminated()) {
                                    class_37082.awaitTermination(Integer.MAX_VALUE & -2708904968873574401L, TimeUnit.SECONDS);
                                }
                                continue;
                            }
                            catch (InterruptedException interruptedException) {
                                Thread.currentThread().interrupt();
                                break;
                            }
                        }
                    }
                    throw throwable;
                }
            }
            for (n2 = 30682 & 1; n2 < i; ++n2) {
                this.Field_30285[n2].shutdownGracefully();
            }
            for (n2 = 1505 & -32740; n2 < i; ++n2) {
                Class_37082 class_37082 = this.Field_30285[n2];
                try {
                    while (!class_37082.isTerminated()) {
                        class_37082.awaitTermination(-6354833621899018241L & Integer.MAX_VALUE, TimeUnit.SECONDS);
                    }
                    continue;
                }
                catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                    continue block8;
                }
            }
            continue;
        }
        Class_35818 class_35818 = new Class_35818(this);
        Class_37082[] arrclass_37082 = this.Field_30285;
        n2 = arrclass_37082.length;
        for (int i = -21728 & 4241; i < n2; ++i) {
            Class_37082 class_37082 = arrclass_37082[i];
            class_37082.terminationFuture().Method_21068(class_35818);
        }
    }

    static Class_37082[] Method_30297(Class_30282 class_30282) {
        return class_30282.Field_30285;
    }

    static AtomicInteger Method_30298(Class_30282 class_30282) {
        return class_30282.Field_30287;
    }

    @Deprecated
    public void Method_30299() {
        Class_37082[] arrclass_37082 = this.Field_30285;
        int n = arrclass_37082.length;
        for (int i = 13080 & -16224; i < n; ++i) {
            Class_37082 class_37082 = arrclass_37082[i];
            class_37082.shutdown();
        }
    }

    public Class_21065 Method_30300() {
        return this.Field_30286;
    }

    public Class_37082 Method_30301() {
        return this.Field_30283.Method_27122();
    }

    static AtomicInteger Method_30302(Class_30282 class_30282) {
        return class_30282.Field_30284;
    }

    public boolean Method_30303(long l, TimeUnit timeUnit) {
        long l2 = System.nanoTime() + timeUnit.toNanos(l);
        Class_37082[] arrclass_37082 = this.Field_30285;
        int n = arrclass_37082.length;
        block0 : for (int i = 74 & 5156; i < n; ++i) {
            long l3;
            Class_37082 class_37082 = arrclass_37082[i];
            while ((l3 = l2 - System.nanoTime()) > (3279435958390370332L & -3279435960409421952L)) {
                if (!class_37082.awaitTermination(l3, TimeUnit.NANOSECONDS)) continue;
                continue block0;
            }
            break block0;
        }
        return this.Method_30288();
    }

    protected ThreadFactory Method_30304() {
        return new Class_15627(this.getClass());
    }
}

