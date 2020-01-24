/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_19202
implements Runnable {
    private static final Logger Field_19203 = LogManager.getLogger();
    private Class_4810[] Field_19204 = Class_14121.Method_14160();
    private final Class_9684 Field_19205;
    private final Class_22205 Field_19206;

    private Class_9684 Method_19207() {
        return this.Field_19205 != null ? this.Field_19205 : this.Field_19206.Method_22230();
    }

    public Class_19202(Class_22205 class_22205, Class_9684 class_9684) {
        this.Field_19206 = class_22205;
        this.Field_19205 = class_9684;
    }

    public Class_19202(Class_22205 class_22205) {
        this(class_22205, null);
    }

    private void Method_19208(Class_17594 class_17594) {
        if (this.Field_19205 == null) {
            this.Field_19206.Method_22228(class_17594.Method_17611());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void Method_19209(Class_17594 class_17594) {
        class_17594.Method_17609().lock();
        try {
            if (class_17594.Method_17610() != Class_15815.Field_15817) {
                if (!class_17594.Method_17614()) {
                    Field_19203.warn("Chunk render task was " + (Object)((Object)class_17594.Method_17610()) + " when I expected it to be pending; ignoring task");
                }
                return;
            }
            class_17594.Method_17604(Class_15815.Field_15818);
        }
        finally {
            class_17594.Method_17609().unlock();
        }
        Class_1061 class_1061 = Class_18.Field_89.Method_246();
        if (class_1061 == null) {
            class_17594.Method_17603();
        } else {
            ListenableFuture listenableFuture;
            class_17594.Method_17613(this.Method_19207());
            float f = (float)class_1061.Field_1130;
            float f2 = (float)class_1061.Method_1324() + class_1061.Method_1357();
            float f3 = (float)class_1061.Field_1106;
            Class_26332 class_26332 = class_17594.Method_17608();
            if (class_26332 == Class_26332.Field_26335) {
                class_17594.Method_17605().Method_6224(f, f2, f3, class_17594, this.Field_19204);
            } else if (class_26332 == Class_26332.Field_26334) {
                class_17594.Method_17605().Method_6219(f, f2, f3, class_17594);
            }
            class_17594.Method_17609().lock();
            try {
                if (class_17594.Method_17610() != Class_15815.Field_15818) {
                    if (!class_17594.Method_17614()) {
                        Field_19203.warn("Chunk render task was " + (Object)((Object)class_17594.Method_17610()) + " when I expected it to be compiling; aborting task");
                    }
                    this.Method_19208(class_17594);
                    return;
                }
                class_17594.Method_17604(Class_15815.Field_15816);
            }
            finally {
                class_17594.Method_17609().unlock();
            }
            Class_26579 class_26579 = class_17594.Method_17615();
            ArrayList<ListenableFuture> arrayList = new ArrayList<ListenableFuture>();
            if (class_26332 == Class_26332.Field_26335) {
                listenableFuture = Class_17531.Method_17542();
                int n = ((Class_17531[])listenableFuture).length;
                for (int i = 19178 & -31744; i < n; ++i) {
                    ListenableFuture listenableFuture2 = listenableFuture[i];
                    if (!class_26579.Method_26598((Class_17531)listenableFuture2)) continue;
                    arrayList.add(this.Field_19206.Method_22226((Class_17531)listenableFuture2, class_17594.Method_17611().Method_9686((Class_17531)listenableFuture2), class_17594.Method_17605(), class_26579));
                }
            } else if (class_26332 == Class_26332.Field_26334) {
                arrayList.add(this.Field_19206.Method_22226(Class_17531.Field_17537, class_17594.Method_17611().Method_9686(Class_17531.Field_17537), class_17594.Method_17605(), class_26579));
            }
            listenableFuture = Futures.allAsList(arrayList);
            class_17594.Method_17612(new Class_21750(this, listenableFuture));
            Futures.addCallback((ListenableFuture)listenableFuture, (FutureCallback)new Class_9689(this, class_17594, class_26579));
        }
    }

    static Logger Method_19210() {
        return Field_19203;
    }

    static void Method_19211(Class_19202 class_19202, Class_17594 class_17594) {
        class_19202.Method_19208(class_17594);
    }

    private void Method_19212() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_19213() {
        try {
            Thread.currentThread().setPriority(7253 & 5);
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            do {
                this.Method_19209(this.Field_19206.Method_22227());
            } while (true);
        }
        catch (InterruptedException interruptedException) {
            Field_19203.debug("Stopping due to interrupt");
            return;
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Batching chunks");
            Class_18.Field_89.Method_232(Class_18.Field_89.Method_264(class_13268));
            return;
        }
    }
}

