/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;

public class Class_26239
extends Class_25345 {
    final SocketAddress Field_26240;
    final Class_44314 Field_26241;

    public void Method_26242() {
        Class_37748 class_37748 = Class_41102.Method_41120(this.Field_26241.Field_44315);
        Class_12190 class_12190 = new Class_12190("connection timed out: " + this.Field_26240);
        if (class_37748 != null && class_37748.tryFailure((Throwable)class_12190)) {
            this.Field_26241.close(this.Field_26241.voidPromise());
        }
    }

    private void Method_26243() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_26239(Class_44314 class_44314, SocketAddress socketAddress) {
        this.Field_26241 = class_44314;
        this.Field_26240 = socketAddress;
    }
}

