/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26970
implements Class_1486 {
    private int Field_26971;

    public void Method_26972(Class_29900 class_29900) {
        class_29900.Method_29922(this.Field_26971);
    }

    public void Method_26973(Class_10930 class_10930) {
        class_10930.Method_10947(this);
    }

    public Class_26970() {
    }

    public void Method_26974(Class_29900 class_29900) {
        this.Field_26971 = class_29900.Method_30008();
    }

    public Class_26970(int n) {
        this.Field_26971 = n;
    }

    public void Method_26975(Class_10954 class_10954) {
        this.Method_26973((Class_10930)class_10954);
    }

    private void Method_26976() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_26977() {
        return this.Field_26971;
    }
}

