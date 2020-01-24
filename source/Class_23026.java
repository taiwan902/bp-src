/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23026
implements Class_1486 {
    private int Field_23027;

    public void Method_23028(Class_10930 class_10930) {
        class_10930.Method_10935(this);
    }

    private void Method_23029() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_23030(Class_29900 class_29900) {
        this.Field_23027 = class_29900.Method_29944();
    }

    public void Method_23031(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_23027);
    }

    public Class_23026(int n) {
        this.Field_23027 = n;
    }

    public void Method_23032(Class_10954 class_10954) {
        this.Method_23028((Class_10930)class_10954);
    }

    public Class_23026() {
    }
}

