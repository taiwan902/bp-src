/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.util.concurrent.ConcurrentMap;

public final class Class_17965 {
    private static final ConcurrentMap Field_17966 = Class_7799.Method_7828();

    static void Method_17967(Class_24415 class_24415) {
        Field_17966.remove(class_24415);
    }

    private void Method_17968() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_26095 Method_17969(SocketAddress socketAddress) {
        return (Class_26095)Field_17966.get(socketAddress);
    }

    static Class_24415 Method_17970(Class_26095 class_26095, Class_24415 class_24415, SocketAddress socketAddress) {
        Class_26095 class_260952;
        if (class_24415 != null) {
            throw new Class_31422("already bound");
        }
        if (!(socketAddress instanceof Class_24415)) {
            throw new Class_31422("unsupported address type: " + Class_22304.Method_22312(socketAddress));
        }
        Class_24415 class_244152 = (Class_24415)socketAddress;
        if (Class_24415.Field_24418.Method_24424(class_244152)) {
            class_244152 = new Class_24415(class_26095);
        }
        if ((class_260952 = Field_17966.putIfAbsent(class_244152, class_26095)) != null) {
            throw new Class_31422("address already in use by: " + class_260952);
        }
        return class_244152;
    }
}

