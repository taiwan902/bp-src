/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14944 {
    private final int Field_14945;
    private final boolean Field_14946;
    private final String Field_14947;

    public boolean Method_14948() {
        return this.Field_14946;
    }

    public String Method_14949() {
        return this.Field_14947;
    }

    private void Method_14950() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_14944(int n, String string, boolean bl) {
        this.Field_14945 = n;
        this.Field_14947 = string;
        this.Field_14946 = bl;
    }

    public int Method_14951() {
        return this.Field_14945;
    }
}

