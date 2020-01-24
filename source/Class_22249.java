/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_22249
implements Class_1486 {
    private int Field_22250;

    public void Method_22251(Class_10954 class_10954) {
        this.Method_22253((Class_14856)class_10954);
    }

    public void Method_22252(Class_29900 class_29900) {
        this.Field_22250 = class_29900.Method_30004();
    }

    public void Method_22253(Class_14856 class_14856) {
        class_14856.Method_14924(this);
    }

    private void Method_22254() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_22255(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_22250);
    }

    public int Method_22256() {
        return this.Field_22250;
    }
}

