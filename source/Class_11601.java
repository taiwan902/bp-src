/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_11601
implements Runnable {
    final boolean Field_11602;
    final Class_17665 Field_11603;

    Class_11601(Class_17665 class_17665, boolean bl) {
        this.Field_11603 = class_17665;
        this.Field_11602 = bl;
    }

    private void Method_11604() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_11605() {
        Class_17665.Method_17732(this.Field_11603, this.Field_11602);
    }
}

