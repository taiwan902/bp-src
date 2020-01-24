/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_6816 {
    public int Field_6817;
    public Runnable Field_6818;

    private void Method_6819() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_6820() {
        return this.Field_6817;
    }

    public void Method_6821(Runnable runnable) {
        this.Field_6818 = runnable;
    }

    public void Method_6822(int n) {
        this.Field_6817 = n;
        if (this.Field_6818 != null) {
            this.Field_6818.run();
        }
    }
}

