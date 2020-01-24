/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;

public class Class_26125
implements Class_21832 {
    final Class_26095 Field_26126;
    final SocketAddress Field_26127;
    final Class_37748 Field_26128;
    final Class_35837 Field_26129;
    final Class_27581 Field_26130;

    private void Method_26131() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_26125(Class_35837 class_35837, Class_27581 class_27581, Class_26095 class_26095, SocketAddress socketAddress, Class_37748 class_37748) {
        this.Field_26129 = class_35837;
        this.Field_26130 = class_27581;
        this.Field_26126 = class_26095;
        this.Field_26127 = socketAddress;
        this.Field_26128 = class_37748;
    }

    public void Method_26132(Class_21065 class_21065) {
        this.Method_26133((Class_27581)class_21065);
    }

    public void Method_26133(Class_27581 class_27581) {
        Class_35837.Method_35846(this.Field_26130, this.Field_26126, this.Field_26127, this.Field_26128);
    }
}

