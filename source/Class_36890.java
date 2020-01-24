/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36890
implements Class_1486 {
    private float Field_36891;
    private float Field_36892;
    private int Field_36893;

    public float Method_36894() {
        return this.Field_36892;
    }

    public void Method_36895(Class_29900 class_29900) {
        this.Field_36891 = class_29900.Method_29966();
        this.Field_36893 = class_29900.Method_30004();
        this.Field_36892 = class_29900.Method_29966();
    }

    public float Method_36896() {
        return this.Field_36891;
    }

    public void Method_36897(Class_10954 class_10954) {
        this.Method_36900((Class_14856)class_10954);
    }

    private void Method_36898() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_36899(Class_29900 class_29900) {
        class_29900.Method_29939(this.Field_36891);
        class_29900.Method_29982(this.Field_36893);
        class_29900.Method_29939(this.Field_36892);
    }

    public Class_36890() {
    }

    public void Method_36900(Class_14856 class_14856) {
        class_14856.Method_14920(this);
    }

    public int Method_36901() {
        return this.Field_36893;
    }

    public Class_36890(float f, int n, float f2) {
        this.Field_36891 = f;
        this.Field_36893 = n;
        this.Field_36892 = f2;
    }
}

