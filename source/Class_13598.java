/*
 * Decompiled with CFR 0.145.
 */
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_13598
implements Class_6113,
Serializable {
    private final String Field_13599;

    protected Class_13598(String string) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        this.Field_13599 = string;
    }

    private void Method_13600() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_13601() {
        return this.Field_13599;
    }

    public String Method_13602() {
        return Class_22304.Method_22312(this) + (char)(-30616 & 1720) + this.Method_13601() + (char)(16553 & 4395);
    }
}

