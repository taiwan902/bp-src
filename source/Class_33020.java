/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33020
implements Class_1486 {
    private int Field_33021;

    public int Method_33022() {
        return this.Field_33021;
    }

    public void Method_33023(Class_29900 class_29900) {
        this.Field_33021 = class_29900.Method_30004();
    }

    public Class_33020(int n) {
        this.Field_33021 = n;
    }

    public void Method_33024(Class_14856 class_14856) {
        class_14856.Method_14868(this);
    }

    public void Method_33025(Class_10954 class_10954) {
        this.Method_33024((Class_14856)class_10954);
    }

    private void Method_33026() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33027(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_33021);
    }

    public Class_33020() {
    }
}

