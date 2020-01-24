/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_40133
implements Class_21832 {
    Class_40133() {
    }

    public void Method_40134(Class_21065 class_21065) {
        this.Method_40135((Class_27581)class_21065);
    }

    public void Method_40135(Class_27581 class_27581) {
        if (!class_27581.isSuccess()) {
            class_27581.Method_27590().Method_26111();
        }
    }

    private void Method_40136() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

