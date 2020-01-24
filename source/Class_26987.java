/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;

public class Class_26987
extends Class_25345 {
    final SocketAddress Field_26988;
    final Class_42469 Field_26989;
    final Class_42469 Field_26990;
    final Class_37748 Field_26991;

    Class_26987(Class_42469 class_42469, Class_42469 class_424692, SocketAddress socketAddress, Class_37748 class_37748) {
        this.Field_26989 = class_42469;
        this.Field_26990 = class_424692;
        this.Field_26988 = socketAddress;
        this.Field_26991 = class_37748;
    }

    public void Method_26992() {
        Class_42469.Method_42539(this.Field_26990, this.Field_26988, this.Field_26991);
    }

    private void Method_26993() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

