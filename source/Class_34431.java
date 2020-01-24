/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34431
implements Class_1486 {
    private int Field_34432;
    private int Field_34433;

    public int Method_34434() {
        return this.Field_34432;
    }

    public void Method_34435(Class_10954 class_10954) {
        this.Method_34437((Class_14856)class_10954);
    }

    public Class_34431() {
    }

    public int Method_34436() {
        return this.Field_34433;
    }

    public void Method_34437(Class_14856 class_14856) {
        class_14856.Method_14865(this);
    }

    public Class_34431(int n, int n2) {
        this.Field_34432 = n;
        this.Field_34433 = n2;
    }

    public void Method_34438(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_34432);
        class_29900.Method_29982(this.Field_34433);
    }

    public void Method_34439(Class_29900 class_29900) {
        this.Field_34432 = class_29900.Method_30004();
        this.Field_34433 = class_29900.Method_30004();
    }

    private void Method_34440() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

