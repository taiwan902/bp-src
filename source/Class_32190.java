/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32190
implements Runnable {
    final Class_41410 Field_32191;

    public void Method_32192() {
        this.Field_32191.flush();
    }

    Class_32190(Class_41410 class_41410) {
        this.Field_32191 = class_41410;
    }

    private void Method_32193() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

