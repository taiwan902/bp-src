/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_22160
implements Class_1486 {
    private int Field_22161;

    public void Method_22162(Class_29900 class_29900) {
        this.Field_22161 = class_29900.Method_30004();
    }

    public void Method_22163(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_22161);
    }

    public void Method_22164(Class_17034 class_17034) {
        class_17034.Method_17036(this);
    }

    public void Method_22165(Class_10954 class_10954) {
        this.Method_22164((Class_17034)class_10954);
    }

    private void Method_22166() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_22160(int n) {
        this.Field_22161 = n;
    }

    public int Method_22167() {
        return this.Field_22161;
    }

    public Class_22160() {
    }
}

