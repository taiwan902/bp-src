/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.logging.Logger;

public class Class_23677
extends Class_10201 {
    private void Method_23678() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_6113 Method_23679(String string) {
        return new Class_27850(Logger.getLogger(string));
    }
}

