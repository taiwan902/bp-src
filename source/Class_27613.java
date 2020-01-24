/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_27613
implements Callable {
    final Class_1061 Field_27614;

    private void Method_27615() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_27616() {
        return this.Method_27617();
    }

    public String Method_27617() {
        return this.Field_27614.Method_1202();
    }

    Class_27613(Class_1061 class_1061) {
        this.Field_27614 = class_1061;
    }
}

