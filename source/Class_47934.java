/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ThreadFactory;

public final class Class_47934
extends Class_47259 {
    private void Method_47935() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_47936() {
        do {
            Runnable runnable;
            if ((runnable = this.takeTask()) == null) continue;
            runnable.run();
            this.updateLastExecutionTime();
        } while (!this.confirmShutdown());
    }

    Class_47934(Class_33611 class_33611, ThreadFactory threadFactory) {
        super(class_33611, threadFactory, (-31503 & 18695) != 0);
    }
}

