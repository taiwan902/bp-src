/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15795 {
    private Class_18520 Field_15796;
    private int Field_15797;

    public void Method_15798(int n) {
        this.Field_15797 = n;
    }

    public void Method_15799(Class_18520 class_18520) {
        this.Field_15796 = class_18520;
    }

    public int Method_15800() {
        return this.Field_15797;
    }

    public Class_18520 Method_15801() {
        return this.Field_15796;
    }

    private void Method_15802() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

