/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ConcurrentMap;

public final class Class_28213
extends Class_20094 {
    private static final ConcurrentMap Field_28214 = Class_7799.Method_7828();

    private void Method_28215() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_28213 Method_28216(String string) {
        return new Class_28213(string);
    }

    @Deprecated
    public Class_28213(String string) {
        super(Field_28214, string, new Object[256 & -29163]);
    }
}

