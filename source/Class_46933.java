/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_46933
extends Class_41387 {
    private final Throwable Field_46934;

    public Throwable Method_46935() {
        return this.Field_46934;
    }

    public Class_46933(Class_37082 class_37082, Throwable throwable) {
        super(class_37082);
        if (throwable == null) {
            throw new NullPointerException("cause");
        }
        this.Field_46934 = throwable;
    }

    public boolean Method_46936() {
        return (192 & -2028) != 0;
    }

    private void Method_46937() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_46938() {
        return null;
    }
}

