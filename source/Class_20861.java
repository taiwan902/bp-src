/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ConcurrentMap;

public final class Class_20861
extends Error {
    private static final ConcurrentMap Field_20862 = Class_7799.Method_7828();
    private final Class_20094 Field_20863;

    public Throwable Method_20864(Throwable throwable) {
        return this;
    }

    public static Class_20861 Method_20865(String string) {
        return new Class_20861(string);
    }

    private void Method_20866() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    @Deprecated
    public Class_20861(String string) {
        super(string);
        this.Field_20863 = new Class_20094(Field_20862, string, new Object[3168 & 24832]);
    }

    public Throwable Method_20867() {
        return this;
    }

    public String Method_20868() {
        return this.Field_20863.Method_20106();
    }

    public void Method_20869(Class_20861 class_20861) {
        if (this != class_20861) {
            throw new IllegalStateException("unexpected signal: " + class_20861);
        }
    }
}

