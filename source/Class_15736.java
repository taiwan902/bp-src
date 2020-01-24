/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class Class_15736
implements Runnable {
    final Class_38936 Field_15737;
    final SocketAddress Field_15738;
    final Class_33149 Field_15739;

    private SocketException Method_15740() {
        Object object;
        try {
            if (!(this.Field_15738 instanceof InetSocketAddress)) {
                return null;
            }
            object = ((InetSocketAddress)this.Field_15738).getAddress();
            if (!Class_38936.Method_38953(((InetAddress)object).getHostAddress()) && !Class_38936.Method_38953(((InetAddress)object).getHostName())) {
                return null;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        object = this.Field_15737.channelFactory().Method_8127();
        object.Method_26101().Method_7312();
        SocketException socketException = new SocketException("Network is unreachable");
        socketException.setStackTrace(Class_23808.Field_23809);
        return socketException;
    }

    public void Method_15741() {
        SocketException socketException = this.Method_15740();
        this.Field_15739.Method_33154(socketException);
    }

    Class_15736(Class_38936 class_38936, Class_33149 class_33149, SocketAddress socketAddress) {
        this.Field_15737 = class_38936;
        this.Field_15739 = class_33149;
        this.Field_15738 = socketAddress;
    }

    private void Method_15742() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

