/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.ConnectException;

public class Class_12190
extends ConnectException {
    public Class_12190() {
    }

    private void Method_12191() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_12190(String string) {
        super(string);
    }
}

