/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_26529
implements Callable {
    final Class_44252 Field_26530;
    final Class_23823 Field_26531;

    private void Method_26532() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_26529(Class_44252 class_44252, Class_23823 class_23823) {
        this.Field_26530 = class_44252;
        this.Field_26531 = class_23823;
    }

    public String Method_26533() {
        return String.valueOf(this.Field_26531.Method_23844());
    }

    public Object Method_26534() {
        return this.Method_26533();
    }
}

