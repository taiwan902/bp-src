/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 */
import com.google.common.util.concurrent.FutureCallback;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;

public class Class_9689
implements FutureCallback {
    final Class_26579 Field_9690;
    final Class_19202 Field_9691;
    final Class_17594 Field_9692;

    public void Method_9693(Throwable throwable) {
        Class_19202.Method_19211(this.Field_9691, this.Field_9692);
        if (!(throwable instanceof CancellationException) && !(throwable instanceof InterruptedException)) {
            Class_18.Field_89.Method_232(Class_13268.Method_13285(throwable, "Rendering chunk"));
        }
    }

    public void Method_9694(List list) {
        block6 : {
            Class_19202.Method_19211(this.Field_9691, this.Field_9692);
            this.Field_9692.Method_17609().lock();
            try {
                if (this.Field_9692.Method_17610() == Class_15815.Field_15816) {
                    this.Field_9692.Method_17604(Class_15815.Field_15819);
                    break block6;
                }
                if (!this.Field_9692.Method_17614()) {
                    Class_19202.Method_19210().warn("Chunk render task was " + (Object)((Object)this.Field_9692.Method_17610()) + " when I expected it to be uploading; aborting task");
                }
            }
            finally {
                this.Field_9692.Method_17609().unlock();
            }
            return;
        }
        this.Field_9692.Method_17605().Method_6217(this.Field_9690);
    }

    Class_9689(Class_19202 class_19202, Class_17594 class_17594, Class_26579 class_26579) {
        this.Field_9691 = class_19202;
        this.Field_9692 = class_17594;
        this.Field_9690 = class_26579;
    }

    public void Method_9695(Object object) {
        this.Method_9694((List)object);
    }

    private void Method_9696() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

