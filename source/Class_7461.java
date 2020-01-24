/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;

public final class Class_7461
implements Runnable {
    final Class_26095 Field_7462;
    final Class_27581 Field_7463;
    final SocketAddress Field_7464;
    final Class_37748 Field_7465;

    Class_7461(Class_27581 class_27581, Class_26095 class_26095, SocketAddress socketAddress, Class_37748 class_37748) {
        this.Field_7463 = class_27581;
        this.Field_7462 = class_26095;
        this.Field_7464 = socketAddress;
        this.Field_7465 = class_37748;
    }

    private void Method_7466() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_7467() {
        if (this.Field_7463.isSuccess()) {
            this.Field_7462.Method_26103(this.Field_7464, this.Field_7465).Method_27583(Class_21832.Field_21835);
        } else {
            this.Field_7465.Method_37763(this.Field_7463.cause());
        }
    }
}

