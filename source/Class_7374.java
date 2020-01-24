/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_7374 {
    private Object Field_7375;
    private boolean Field_7376 = 20608 & 100;

    private void Method_7377() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected abstract Object Method_7378();

    public Object Method_7379() {
        if (!this.Field_7376) {
            this.Field_7376 = 2341 & 13825;
            this.Field_7375 = this.Method_7378();
        }
        return this.Field_7375;
    }
}

