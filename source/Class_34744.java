/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_34744
implements Class_21832 {
    private void Method_34745() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_34744() {
    }

    public void Method_34746(Class_27581 class_27581) {
        if (!class_27581.isSuccess()) {
            class_27581.Method_27590().Method_26106().Method_6281(class_27581.cause());
        }
    }

    public void Method_34747(Class_21065 class_21065) {
        this.Method_34746((Class_27581)class_21065);
    }
}

