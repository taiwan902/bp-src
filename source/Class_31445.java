/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_31445
implements Runnable {
    private final Runnable Field_31446;

    public void Method_31447() {
        try {
            this.Field_31446.run();
        }
        finally {
            Class_34677.Method_34686();
        }
    }

    Class_31445(Runnable runnable) {
        this.Field_31446 = runnable;
    }

    private void Method_31448() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

