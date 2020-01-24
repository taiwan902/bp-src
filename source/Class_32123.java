/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32123
implements Runnable {
    final Class_46518 Field_32124;
    final Runnable Field_32125;

    public void Method_32126() {
        Class_46518.Method_46541(this.Field_32124).remove(this.Field_32125);
    }

    Class_32123(Class_46518 class_46518, Runnable runnable) {
        this.Field_32124 = class_46518;
        this.Field_32125 = runnable;
    }

    private void Method_32127() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

