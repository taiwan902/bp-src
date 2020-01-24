/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_29845 {
    public static final Class_29845 Field_29846 = new Class_29845();
    private final Throwable Field_29847;

    public Class_29845(Throwable throwable) {
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        this.Field_29847 = throwable;
    }

    private Class_29845() {
        this.Field_29847 = null;
    }

    private void Method_29848() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

