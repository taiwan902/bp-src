/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24582
implements Class_21832 {
    final Class_26095 Field_24583;
    final Class_46378 Field_24584;

    public void Method_24585(Class_21065 class_21065) {
        this.Method_24587((Class_27581)class_21065);
    }

    private void Method_24586() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_24582(Class_46378 class_46378, Class_26095 class_26095) {
        this.Field_24584 = class_46378;
        this.Field_24583 = class_26095;
    }

    public void Method_24587(Class_27581 class_27581) {
        if (!class_27581.isSuccess()) {
            Class_46378.Method_46385(this.Field_24583, class_27581.cause());
        }
    }
}

