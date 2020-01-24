/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;

public final class Class_14437
implements Runnable {
    final SocketAddress Field_14438;
    final Class_37748 Field_14439;
    final Class_27581 Field_14440;
    final SocketAddress Field_14441;
    final Class_26095 Field_14442;

    private void Method_14443() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_14444() {
        if (this.Field_14440.isSuccess()) {
            if (this.Field_14441 == null) {
                this.Field_14442.Method_26100(this.Field_14438, this.Field_14439);
            } else {
                this.Field_14442.Method_26097(this.Field_14438, this.Field_14441, this.Field_14439);
            }
            this.Field_14439.Method_37766(Class_21832.Field_21835);
        } else {
            this.Field_14439.Method_37763(this.Field_14440.cause());
        }
    }

    Class_14437(Class_27581 class_27581, SocketAddress socketAddress, Class_26095 class_26095, SocketAddress socketAddress2, Class_37748 class_37748) {
        this.Field_14440 = class_27581;
        this.Field_14441 = socketAddress;
        this.Field_14442 = class_26095;
        this.Field_14438 = socketAddress2;
        this.Field_14439 = class_37748;
    }
}

