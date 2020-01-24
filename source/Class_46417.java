/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.nio.channels.AlreadyConnectedException;
import java.nio.channels.ConnectionPendingException;

public class Class_46417
extends Class_44175 {
    final Class_41005 Field_46418;

    private Class_46417(Class_41005 class_41005) {
        this.Field_46418 = class_41005;
        super(class_41005);
    }

    private void Method_46419() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_46417(Class_41005 class_41005, Class_10905 class_10905) {
        this(class_41005);
    }

    public void Method_46420(SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        Class_26095 class_26095;
        if (!class_37748.setUncancellable() || !this.ensureOpen(class_37748)) {
            return;
        }
        if (Class_41005.Method_41026(this.Field_46418) == (-3809 & 3234)) {
            AlreadyConnectedException alreadyConnectedException = new AlreadyConnectedException();
            this.safeSetFailure(class_37748, (Throwable)alreadyConnectedException);
            this.Field_46418.pipeline().Method_6281(alreadyConnectedException);
            return;
        }
        if (Class_41005.Method_41025(this.Field_46418) != null) {
            throw new ConnectionPendingException();
        }
        Class_41005.Method_41020(this.Field_46418, class_37748);
        if (Class_41005.Method_41026(this.Field_46418) != (2201 & -24509) && socketAddress2 == null) {
            socketAddress2 = new Class_24415(this.Field_46418);
        }
        if (socketAddress2 != null) {
            try {
                this.Field_46418.Method_41039(socketAddress2);
            }
            catch (Throwable throwable) {
                this.safeSetFailure(class_37748, throwable);
                this.close(this.voidPromise());
                return;
            }
        }
        if (!((class_26095 = Class_17965.Method_17969(socketAddress)) instanceof Class_38138)) {
            Class_31422 class_31422 = new Class_31422("connection refused");
            this.safeSetFailure(class_37748, (Throwable)class_31422);
            this.close(this.voidPromise());
            return;
        }
        Class_38138 class_38138 = (Class_38138)class_26095;
        Class_41005.Method_41043(this.Field_46418, class_38138.Method_38158(this.Field_46418));
    }
}

