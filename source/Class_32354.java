/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public final class Class_32354
implements Runnable {
    private final List Field_32355 = new ArrayList();
    static final boolean Field_32356 = !Class_26907.class.desiredAssertionStatus() ? -27387 & 17025 : 3384 & -24448;

    private void Method_32357() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_32354(Class_30180 class_30180) {
        this();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void Method_32358() {
        do lbl-1000: // 3 sources:
        {
            this.Method_32359();
            this.Method_32360();
            this.Method_32359();
            this.Method_32360();
            try {
                Thread.sleep(-550118071688099864L & 550118071064953853L);
            }
            catch (InterruptedException var1_1) {
                // empty catch block
            }
            if (!this.Field_32355.isEmpty() || !Class_26907.Method_26920().isEmpty()) ** GOTO lbl-1000
            var1_2 = Class_26907.Method_26916().compareAndSet((boolean)(8321 & -30207), (boolean)(4948 & -22527));
            if (!Class_32354.Field_32356 && !var1_2) {
                throw new AssertionError();
            }
            if (!Class_26907.Method_26920().isEmpty()) continue;
            return;
        } while (Class_26907.Method_26916().compareAndSet((boolean)(13 & 24800), (boolean)(3203 & -28319)));
    }

    private void Method_32359() {
        Class_34711 class_34711;
        while ((class_34711 = (Class_34711)Class_26907.Method_26920().poll()) != null) {
            if (class_34711.Field_34714) {
                this.Field_32355.add(class_34711);
                continue;
            }
            this.Field_32355.remove(class_34711);
        }
    }

    private Class_32354() {
    }

    private void Method_32360() {
        List list = this.Field_32355;
        int n = -27648 & 27048;
        while (n < list.size()) {
            Class_34711 class_34711 = (Class_34711)list.get(n);
            if (!class_34711.Field_34713.isAlive()) {
                list.remove(n);
                try {
                    class_34711.Field_34712.run();
                }
                catch (Throwable throwable) {
                    Class_26907.Method_26914().Method_6127("Thread death watcher task raised an exception:", throwable);
                }
                continue;
            }
            ++n;
        }
    }
}

