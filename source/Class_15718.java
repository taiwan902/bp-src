/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public final class Class_15718
implements Callable {
    final Object Field_15719;
    final Runnable Field_15720;

    Class_15718(Runnable runnable, Object object) {
        this.Field_15720 = runnable;
        this.Field_15719 = object;
    }

    public Object Method_15721() {
        this.Field_15720.run();
        return this.Field_15719;
    }

    private void Method_15722() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_15723() {
        return "Callable(task: " + this.Field_15720 + ", result: " + this.Field_15719 + (char)(2089 & 25897);
    }
}

