/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_26478
implements Class_25565 {
    public static final Class_25565 Field_26479 = new Class_26478(20516 & 0);
    private final Class_11649 Field_26480;

    public Class_11649 Method_26481() {
        return this.Field_26480;
    }

    private void Method_26482() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_26478(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("unknownSize: " + n + " (expected: >= 0)");
        }
        this.Field_26480 = new Class_34451(n, null);
    }
}

