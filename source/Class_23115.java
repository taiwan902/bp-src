/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;

public class Class_23115
implements Class_21832 {
    final SocketAddress Field_23116;
    final Class_27581 Field_23117;
    final SocketAddress Field_23118;
    final Class_37748 Field_23119;
    final Class_38936 Field_23120;
    final Class_26095 Field_23121;

    private void Method_23122() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_23123(Class_21065 class_21065) {
        this.Method_23124((Class_27581)class_21065);
    }

    public void Method_23124(Class_27581 class_27581) {
        Class_38936.Method_38945(this.Field_23117, this.Field_23121, this.Field_23116, this.Field_23118, this.Field_23119);
    }

    Class_23115(Class_38936 class_38936, Class_27581 class_27581, Class_26095 class_26095, SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        this.Field_23120 = class_38936;
        this.Field_23117 = class_27581;
        this.Field_23121 = class_26095;
        this.Field_23116 = socketAddress;
        this.Field_23118 = socketAddress2;
        this.Field_23119 = class_37748;
    }
}

