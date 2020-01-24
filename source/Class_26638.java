/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26638
implements Class_21832 {
    final Object Field_26639;
    final int Field_26640;
    final Class_12364 Field_26641;
    final Class_40426 Field_26642;

    public void Method_26643(Class_21065 class_21065) {
        this.Method_26645((Class_27581)class_21065);
    }

    private void Method_26644() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_26638(Class_40426 class_40426, Object object, Class_12364 class_12364, int n) {
        this.Field_26642 = class_40426;
        this.Field_26639 = object;
        this.Field_26641 = class_12364;
        this.Field_26640 = n;
    }

    public void Method_26645(Class_27581 class_27581) {
        if (!class_27581.isSuccess()) {
            Class_40426.Method_40440((Class_27921)this.Field_26639);
            this.Field_26641.Method_12368(class_27581.cause());
        } else {
            this.Field_26641.Method_12369(this.Field_26640);
        }
    }
}

