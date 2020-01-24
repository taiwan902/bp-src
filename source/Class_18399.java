/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_18399 {
    private Object Field_18400;
    boolean Field_18401;
    private static final Object Field_18402 = new Object();
    private static final Object Field_18403 = new Object();

    public boolean Method_18404() {
        int n;
        int n2 = n = this.Field_18400 == Field_18402 ? 6693 & 1409 : 16710 & 513;
        if (this.Field_18401 != n) {
            // empty if block
        }
        return n != 0;
    }

    private void Method_18405() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_18399(boolean bl) {
        this.Field_18401 = bl;
        this.Field_18400 = bl ? Field_18402 : Field_18403;
    }

    public void Method_18406(boolean bl) {
        this.Field_18401 = bl;
        this.Field_18400 = bl ? Field_18402 : Field_18403;
    }
}

