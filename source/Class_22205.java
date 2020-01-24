/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListenableFutureTask
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  internal.org.lwjgl.opengl.GL11
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_22205 {
    private final Class_19202 Field_22206;
    private final BlockingQueue Field_22207 = Queues.newArrayBlockingQueue((int)Field_22210);
    private final Queue Field_22208 = Queues.newArrayDeque();
    private static final ThreadFactory Field_22209;
    public static int Field_22210;
    private static final Logger Field_22211;
    private final Class_43913 Field_22212 = new Class_43913();
    private final BlockingQueue Field_22213 = Queues.newArrayBlockingQueue((int)(1132 & 2420));
    private final Class_24679 Field_22214 = new Class_24679();
    private final List Field_22215 = Lists.newArrayList();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean Method_22216(Class_6176 class_6176) {
        boolean bl;
        class_6176.Method_6223().lock();
        try {
            Class_17594 class_17594 = class_6176.Method_6216();
            try {
                this.Field_22206.Method_19209(class_17594);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            bl = 8483 & -28031;
        }
        finally {
            class_6176.Method_6223().unlock();
        }
        return bl;
    }

    public Class_22205() {
        int n;
        for (n = 4736 & 2058; n < (20786 & 11274); ++n) {
            Class_19202 class_19202 = new Class_19202(this);
            Thread thread = Field_22209.newThread(class_19202);
            thread.start();
            this.Field_22215.add(class_19202);
        }
        for (n = -14304 & 386; n < Field_22210; ++n) {
            this.Field_22207.add(new Class_9684());
        }
        this.Field_22206 = new Class_19202(this, new Class_9684());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean Method_22217(Class_6176 class_6176) {
        boolean bl;
        class_6176.Method_6223().lock();
        try {
            Class_17594 class_17594 = class_6176.Method_6216();
            class_17594.Method_17612(new Class_9854(this, class_17594));
            boolean bl2 = this.Field_22213.offer(class_17594);
            if (!bl2) {
                class_17594.Method_17603();
            }
            bl = bl2;
        }
        finally {
            class_6176.Method_6223().unlock();
        }
        return bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean Method_22218(long l) {
        int n = 6468 & -7536;
        int n2 = (17415 & 6313) + Class_18.Field_89.Field_84.Field_39778 / (19339 & 1026);
        do {
            long l2;
            int n3 = 5134 & 16976;
            Queue queue = this.Field_22208;
            synchronized (queue) {
                if (!this.Field_22208.isEmpty()) {
                    ((ListenableFutureTask)this.Field_22208.poll()).run();
                    n3 = 1433 & -28605;
                    n = 1673 & 20481;
                }
            }
            if (l == (1082216464L & -5619823601970568121L) || n3 == 0 || (l2 = l - System.nanoTime()) < (676074312L & -728719145723491295L) && n2 <= 0) break;
            if (n2 <= 0) continue;
            --n2;
        } while (true);
        return n != 0;
    }

    private static String Method_22219(String string) {
        int n = 24171;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22205.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static BlockingQueue Method_22220(Class_22205 class_22205) {
        return class_22205.Field_22213;
    }

    static {
        Field_22211 = LogManager.getLogger();
        Field_22209 = new ThreadFactoryBuilder().setNameFormat(Class_22205.Method_22219("\u8220\u8208\u8212\u820a\u820c\u8204\u8227\u8207\u8219\u8209\u8203\u820b\u821d\u820c\u820e\u820e")).setDaemon((641 & 16385) != 0).build();
        Field_22210 = -32633 & 24837;
    }

    public String Method_22221() {
        Object[] arrobject = new Object[135 & -5117];
        arrobject[-28640 & 27152] = this.Field_22213.size();
        arrobject[-21229 & 1] = this.Field_22208.size();
        arrobject[1286 & 16515] = this.Field_22207.size();
        return String.format("pC: %03d, pU: %1d, aB: %1d", arrobject);
    }

    public void Method_22222() {
        while (!this.Field_22213.isEmpty()) {
            Class_17594 class_17594 = (Class_17594)this.Field_22213.poll();
            if (class_17594 == null) continue;
            class_17594.Method_17603();
        }
    }

    private void Method_22223(Class_22385 class_22385, Class_13574 class_13574) {
        this.Field_22212.Method_43917(class_13574);
        this.Field_22212.Method_43915(class_22385);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean Method_22224(Class_6176 class_6176) {
        boolean bl;
        class_6176.Method_6223().lock();
        try {
            Class_17594 class_17594 = class_6176.Method_6214();
            if (class_17594 == null) {
                boolean bl2;
                boolean bl3 = bl2 = 6667 & 16657;
                return bl3;
            }
            class_17594.Method_17612(new Class_18202(this, class_17594));
            bl = this.Field_22213.offer(class_17594);
        }
        finally {
            class_6176.Method_6223().unlock();
        }
        return bl;
    }

    private void Method_22225() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ListenableFuture Method_22226(Class_17531 class_17531, Class_22385 class_22385, Class_6176 class_6176, Class_26579 class_26579) {
        if (Class_18.Field_89.Method_140()) {
            if (Class_32876.Method_32939()) {
                Class_13574 class_13574 = class_6176.Method_6231(class_17531.ordinal());
                if (class_13574 != null) {
                    this.Method_22223(class_22385, class_13574);
                }
            } else {
                this.Method_22229(class_22385, ((Class_15337)class_6176).Method_15341(class_17531, class_26579), class_6176);
            }
            class_22385.Method_22444(0.0, 0.0, 0.0);
            return Futures.immediateFuture(null);
        }
        ListenableFutureTask listenableFutureTask = ListenableFutureTask.create((Runnable)new Class_33874(this, class_17531, class_22385, class_6176, class_26579), null);
        Queue queue = this.Field_22208;
        synchronized (queue) {
            this.Field_22208.add(listenableFutureTask);
            return listenableFutureTask;
        }
    }

    public Class_17594 Method_22227() {
        return (Class_17594)this.Field_22213.take();
    }

    public void Method_22228(Class_9684 class_9684) {
        this.Field_22207.add(class_9684);
    }

    private void Method_22229(Class_22385 class_22385, int n, Class_6176 class_6176) {
        GL11.glNewList((int)n, (int)(4873 & 13062));
        Class_16867.Method_16961();
        class_6176.Method_6212();
        Class_24679.Method_24681(class_22385);
        Class_16867.Method_16945();
        GL11.glEndList();
    }

    public Class_9684 Method_22230() {
        return (Class_9684)this.Field_22207.take();
    }

    public void Method_22231() {
        this.Method_22222();
        while (this.Method_22218(-2895279505783335374L & 2895279505721589897L)) {
        }
        ArrayList arrayList = Lists.newArrayList();
        while (arrayList.size() != Field_22210) {
            try {
                arrayList.add(this.Method_22230());
            }
            catch (InterruptedException interruptedException) {}
        }
        this.Field_22207.addAll(arrayList);
    }
}

