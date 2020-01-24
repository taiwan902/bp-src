/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_17276
implements Callable {
    final Class_22849 Field_17277;

    public String Method_17278() {
        return Class_18.Field_89.Field_36.getClass().getCanonicalName();
    }

    private void Method_17279() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_17280() {
        return this.Method_17278();
    }

    Class_17276(Class_22849 class_22849) {
        this.Field_17277 = class_22849;
    }
}

