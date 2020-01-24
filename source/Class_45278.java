/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;

public final class Class_45278
extends Class_44175 {
    final Class_36729 Field_45279;

    public void Method_45280(SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        this.safeSetFailure(class_37748, (Throwable)new UnsupportedOperationException());
    }

    Class_45278(Class_36729 class_36729, Class_8744 class_8744) {
        this(class_36729);
    }

    private Class_45278(Class_36729 class_36729) {
        this.Field_45279 = class_36729;
        super(class_36729);
    }

    private void Method_45281() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

