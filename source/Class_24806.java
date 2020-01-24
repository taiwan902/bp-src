/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24806
implements Class_21832 {
    final Class_21104 Field_24807;

    public void Method_24808(Class_21065 class_21065) {
        this.Method_24810((Class_27581)class_21065);
    }

    private void Method_24809() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_24810(Class_27581 class_27581) {
        if (class_27581.isSuccess()) {
            this.Field_24807.Field_21108.Method_37762();
        } else {
            this.Field_24807.Field_21108.Method_37763(class_27581.cause());
        }
    }

    Class_24806(Class_21104 class_21104) {
        this.Field_24807 = class_21104;
    }
}

