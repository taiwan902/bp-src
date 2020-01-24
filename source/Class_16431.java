/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Class_16431
implements Runnable {
    final CountDownLatch Field_16432;
    final List Field_16433;
    final Class_47372 Field_16434;

    public void Method_16435() {
        try {
            for (Runnable runnable : this.Field_16433) {
                runnable.run();
            }
        }
        catch (Exception exception) {
            Class_47372.Method_47397(this.Field_16434).Method_39162(exception);
        }
        finally {
            this.Field_16432.countDown();
        }
    }

    Class_16431(Class_47372 class_47372, List list, CountDownLatch countDownLatch) {
        this.Field_16434 = class_47372;
        this.Field_16433 = list;
        this.Field_16432 = countDownLatch;
    }

    private void Method_16436() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

