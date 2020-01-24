/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26545
implements Runnable {
    final Runnable Field_26546;
    final Class_46518 Field_26547;

    Class_26545(Class_46518 class_46518, Runnable runnable) {
        this.Field_26547 = class_46518;
        this.Field_26546 = runnable;
    }

    public void Method_26548() {
        Class_46518.Method_46541(this.Field_26547).add(this.Field_26546);
    }

    private void Method_26549() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

