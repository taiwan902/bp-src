/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30949
implements Class_1486 {
    private Class_4751 Field_30950;

    public Class_4751 Method_30951() {
        return this.Field_30950;
    }

    public Class_30949() {
    }

    private void Method_30952() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_30953(Class_14856 class_14856) {
        class_14856.Method_14899(this);
    }

    public void Method_30954(Class_29900 class_29900) {
        class_29900.Method_29996(this.Field_30950);
    }

    public void Method_30955(Class_29900 class_29900) {
        this.Field_30950 = class_29900.Method_29910();
    }

    public void Method_30956(Class_10954 class_10954) {
        this.Method_30953((Class_14856)class_10954);
    }

    public Class_30949(Class_4751 class_4751) {
        this.Field_30950 = class_4751;
    }
}

