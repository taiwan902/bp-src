/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24471
implements Runnable {
    final Class_46518 Field_24472;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Method_24473() {
        int n = -7288 & 4128;
        this.Field_24472.Method_46565();
        try {
            this.Field_24472.Method_46564();
            n = 10273 & -16109;
        }
        catch (Throwable throwable) {
            Class_46518.Method_46587().Method_6127("Unexpected exception from an event executor: ", throwable);
        }
        finally {
            int n2;
            while ((n2 = Class_46518.Method_46573().get(this.Field_24472)) < (859 & 9255) && !Class_46518.Method_46573().compareAndSet(this.Field_24472, n2, 4255 & 16899)) {
            }
            if (n != 0 && Class_46518.Method_46542(this.Field_24472) == (-1080483312008116053L & 79692304L)) {
                Class_46518.Method_46587().Method_6126("Buggy " + Class_37082.class.getSimpleName() + " implementation; " + Class_46518.class.getSimpleName() + ".confirmShutdown() must be called before run() implementation terminates.");
            }
            while (!this.Field_24472.Method_46552()) {
            }
        }
        try {
            this.Field_24472.Method_46547();
            Class_46518.Method_46573().set(this.Field_24472, -16379 & 8207);
            Class_46518.Method_46550(this.Field_24472).release();
        }
        catch (Throwable throwable) {
            Class_46518.Method_46573().set(this.Field_24472, -32523 & 4357);
            Class_46518.Method_46550(this.Field_24472).release();
            if (!Class_46518.Method_46554(this.Field_24472).isEmpty()) {
                Class_46518.Method_46587().Method_6132("An event executor terminated with non-empty task queue (" + Class_46518.Method_46554(this.Field_24472).size() + (char)(2923 & 41));
            }
            Class_46518.Method_46574(this.Field_24472).Method_33154(null);
            throw throwable;
        }
        if (!Class_46518.Method_46554(this.Field_24472).isEmpty()) {
            Class_46518.Method_46587().Method_6132("An event executor terminated with non-empty task queue (" + Class_46518.Method_46554(this.Field_24472).size() + (char)(105 & 19503));
        }
        Class_46518.Method_46574(this.Field_24472).Method_33154(null);
    }

    Class_24471(Class_46518 class_46518) {
        this.Field_24472 = class_46518;
    }

    private void Method_24474() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

