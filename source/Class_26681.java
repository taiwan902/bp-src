/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ScheduledFuture;

public class Class_26681
implements Class_18600 {
    final Class_47372 Field_26682;
    final ScheduledFuture Field_26683;

    private void Method_26684() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_26681(Class_47372 class_47372, ScheduledFuture scheduledFuture) {
        this.Field_26682 = class_47372;
        this.Field_26683 = scheduledFuture;
    }

    public void Method_26685(Class_21065 class_21065) {
        if (this.Field_26683 != null) {
            this.Field_26683.cancel((-32512 & 4218) != 0);
        }
    }
}

