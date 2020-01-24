/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34421
implements Class_1486 {
    private int Field_34422;

    public void Method_34423(Class_29900 class_29900) {
        this.Field_34422 = class_29900.Method_30004();
    }

    private void Method_34424() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_34425() {
        return this.Field_34422;
    }

    public void Method_34426(Class_10954 class_10954) {
        this.Method_34428((Class_10930)class_10954);
    }

    public Class_34421() {
    }

    public void Method_34427(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_34422);
    }

    public void Method_34428(Class_10930 class_10930) {
        class_10930.Method_10953(this);
    }

    public Class_34421(int n) {
        this.Field_34422 = n;
    }
}

