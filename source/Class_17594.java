/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Class_17594 {
    private Class_15815 Field_17595 = Class_15815.Field_15817;
    private final List Field_17596 = Lists.newArrayList();
    private final ReentrantLock Field_17597 = new ReentrantLock();
    private Class_9684 Field_17598;
    private Class_26579 Field_17599;
    private final Class_26332 Field_17600;
    private final Class_6176 Field_17601;
    private boolean Field_17602;

    public void Method_17603() {
        this.Field_17597.lock();
        try {
            if (this.Field_17600 == Class_26332.Field_26335 && this.Field_17595 != Class_15815.Field_15819) {
                this.Field_17601.Method_6221((12577 & 3137) != 0);
            }
            this.Field_17602 = 8229 & 22427;
            this.Field_17595 = Class_15815.Field_15819;
            for (Runnable runnable : this.Field_17596) {
                runnable.run();
            }
        }
        finally {
            this.Field_17597.unlock();
        }
    }

    public void Method_17604(Class_15815 class_15815) {
        this.Field_17597.lock();
        try {
            this.Field_17595 = class_15815;
        }
        finally {
            this.Field_17597.unlock();
        }
    }

    public Class_6176 Method_17605() {
        return this.Field_17601;
    }

    public void Method_17606(Class_26579 class_26579) {
        this.Field_17599 = class_26579;
    }

    public Class_17594(Class_6176 class_6176, Class_26332 class_26332) {
        this.Field_17601 = class_6176;
        this.Field_17600 = class_26332;
    }

    private void Method_17607() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_26332 Method_17608() {
        return this.Field_17600;
    }

    public ReentrantLock Method_17609() {
        return this.Field_17597;
    }

    public Class_15815 Method_17610() {
        return this.Field_17595;
    }

    public Class_9684 Method_17611() {
        return this.Field_17598;
    }

    public void Method_17612(Runnable runnable) {
        this.Field_17597.lock();
        try {
            this.Field_17596.add(runnable);
            if (this.Field_17602) {
                runnable.run();
            }
        }
        finally {
            this.Field_17597.unlock();
        }
    }

    public void Method_17613(Class_9684 class_9684) {
        this.Field_17598 = class_9684;
    }

    public boolean Method_17614() {
        return this.Field_17602;
    }

    public Class_26579 Method_17615() {
        return this.Field_17599;
    }
}

