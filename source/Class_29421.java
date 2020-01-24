/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.Socket;

public final class Class_29421
extends Class_28329 {
    final Class_47482 Field_29422;

    private Class_29421(Class_47482 class_47482, Class_47482 class_474822, Socket socket) {
        this.Field_29422 = class_47482;
        super(class_474822, socket);
    }

    protected void Method_29423() {
        Class_47482.Method_47493(this.Field_29422, (-27296 & 648) != 0);
    }

    private void Method_29424() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_29421(Class_47482 class_47482, Class_47482 class_474822, Socket socket, Class_32113 class_32113) {
        this(class_47482, class_474822, socket);
    }
}

