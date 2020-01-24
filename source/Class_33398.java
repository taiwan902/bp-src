/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33398
implements Class_1486 {
    private Class_4751 Field_33399;

    public Class_4751 Method_33400() {
        return this.Field_33399;
    }

    public Class_33398(Class_4751 class_4751) {
        this.Field_33399 = class_4751;
    }

    public Class_33398() {
    }

    public void Method_33401(Class_29900 class_29900) {
        this.Field_33399 = class_29900.Method_29910();
    }

    public void Method_33402(Class_14856 class_14856) {
        class_14856.Method_14898(this);
    }

    public void Method_33403(Class_29900 class_29900) {
        class_29900.Method_29996(this.Field_33399);
    }

    public void Method_33404(Class_10954 class_10954) {
        this.Method_33402((Class_14856)class_10954);
    }

    private void Method_33405() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

