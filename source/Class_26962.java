/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;

public class Class_26962
extends Class_25345 {
    final Class_37748 Field_26963;
    final SocketAddress Field_26964;
    final SocketAddress Field_26965;
    final Class_42469 Field_26966;
    final Class_42469 Field_26967;

    Class_26962(Class_42469 class_42469, Class_42469 class_424692, SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        this.Field_26966 = class_42469;
        this.Field_26967 = class_424692;
        this.Field_26965 = socketAddress;
        this.Field_26964 = socketAddress2;
        this.Field_26963 = class_37748;
    }

    public void Method_26968() {
        Class_42469.Method_42551(this.Field_26967, this.Field_26965, this.Field_26964, this.Field_26963);
    }

    private void Method_26969() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

