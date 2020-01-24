/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.ServerSocket;

public final class Class_38092
extends Class_35132 {
    final Class_45493 Field_38093;

    private Class_38092(Class_45493 class_45493, Class_45493 class_454932, ServerSocket serverSocket) {
        this.Field_38093 = class_45493;
        super(class_454932, serverSocket);
    }

    Class_38092(Class_45493 class_45493, Class_45493 class_454932, ServerSocket serverSocket, Class_22997 class_22997) {
        this(class_45493, class_454932, serverSocket);
    }

    protected void Method_38094() {
        Class_45493.Method_45507(this.Field_38093, (-31418 & 18432) != 0);
    }

    private void Method_38095() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

