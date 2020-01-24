/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public final class Class_6059
implements Runnable {
    static final boolean Field_6060 = !Class_46724.class.desiredAssertionStatus() ? 8195 & 1233 : 8208 & 4384;
    final Class_46724 Field_6061;

    Class_6059(Class_46724 class_46724) {
        this.Field_6061 = class_46724;
    }

    private void Method_6062() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void Method_6063() {
        do lbl-1000: // 4 sources:
        {
            block4 : {
                if ((var1_1 = this.Field_6061.Method_46745()) == null) break block4;
                try {
                    var1_1.run();
                }
                catch (Throwable var2_2) {
                    Class_46724.Method_46744().Method_6127("Unexpected exception from the global event executor: ", var2_2);
                }
                if (var1_1 != this.Field_6061.Field_46728) ** GOTO lbl-1000
            }
            if (!this.Field_6061.Field_46729.isEmpty() || this.Field_6061.Field_46734.size() != (-27391 & 24593)) ** GOTO lbl-1000
            var2_3 = Class_46724.Method_46746(this.Field_6061).compareAndSet((boolean)(2317 & 17105), (boolean)(-14846 & 36));
            if (!Class_6059.Field_6060 && !var2_3) {
                throw new AssertionError();
            }
            if (!this.Field_6061.Field_46729.isEmpty() || this.Field_6061.Field_46734.size() != (3345 & 8197)) continue;
            return;
        } while (Class_46724.Method_46746(this.Field_6061).compareAndSet((boolean)(5393 & 8196), (boolean)(8713 & 5297)));
    }
}

