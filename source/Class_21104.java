/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.net.SocketException;

public class Class_21104
implements Class_18600 {
    final Class_26095 Field_21105;
    final Class_38936 Field_21106;
    final SocketAddress Field_21107;
    final Class_37748 Field_21108;
    final SocketAddress Field_21109;
    final Class_27581 Field_21110;

    public void Method_21111(Class_21065 class_21065) {
        SocketException socketException = (SocketException)class_21065.get();
        if (socketException != null) {
            this.Field_21108.Method_37763(socketException);
        } else {
            Class_37748 class_37748 = this.Field_21105.Method_26108();
            if (this.Field_21110.isDone()) {
                Class_38936.Method_38945(this.Field_21110, this.Field_21105, this.Field_21109, this.Field_21107, class_37748);
            } else {
                this.Field_21110.Method_27583(new Class_36996(this, class_37748));
            }
            class_37748.Method_37766(new Class_24806(this));
        }
    }

    Class_21104(Class_38936 class_38936, Class_37748 class_37748, Class_26095 class_26095, Class_27581 class_27581, SocketAddress socketAddress, SocketAddress socketAddress2) {
        this.Field_21106 = class_38936;
        this.Field_21108 = class_37748;
        this.Field_21105 = class_26095;
        this.Field_21110 = class_27581;
        this.Field_21109 = socketAddress;
        this.Field_21107 = socketAddress2;
    }

    private void Method_21112() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

