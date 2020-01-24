/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21021
implements Class_1486 {
    private int Field_21022;

    public int Method_21023() {
        return this.Field_21022;
    }

    private void Method_21024() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21025(Class_10954 class_10954) {
        this.Method_21028((Class_14856)class_10954);
    }

    public void Method_21026(Class_29900 class_29900) {
        this.Field_21022 = class_29900.Method_29944();
    }

    public void Method_21027(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_21022);
    }

    public void Method_21028(Class_14856 class_14856) {
        class_14856.Method_14859(this);
    }

    public Class_21021() {
    }

    public Class_21021(int n) {
        this.Field_21022 = n;
    }
}

