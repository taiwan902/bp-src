/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_27841 {
    public final String Field_27842;
    private boolean Field_27843;

    public abstract void Method_27844(Class_1699 var1);

    public Class_27841(String string) {
        this.Field_27842 = string;
    }

    public boolean Method_27845() {
        return this.Field_27843;
    }

    private void Method_27846() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public abstract void Method_27847(Class_1699 var1);

    public void Method_27848(boolean bl) {
        this.Field_27843 = bl;
    }

    public void Method_27849() {
        this.Method_27848((237 & 2049) != 0);
    }
}

