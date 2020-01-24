/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.channels.ClosedChannelException;

public class Class_31866
implements Runnable {
    final Class_18249 Field_31867;
    final ClosedChannelException Field_31868;

    public void Method_31869() {
        this.Field_31867.Method_18280(this.Field_31868);
    }

    private void Method_31870() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_31866(Class_18249 class_18249, ClosedChannelException closedChannelException) {
        this.Field_31867 = class_18249;
        this.Field_31868 = closedChannelException;
    }
}

