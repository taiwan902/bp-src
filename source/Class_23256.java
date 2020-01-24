/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_23256
implements Callable {
    final Class_44252 Field_23257;
    final Class_23823 Field_23258;

    Class_23256(Class_44252 class_44252, Class_23823 class_23823) {
        this.Field_23257 = class_44252;
        this.Field_23258 = class_23823;
    }

    public String Method_23259() {
        return String.valueOf(this.Field_23258.Method_23845());
    }

    private void Method_23260() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_23261() {
        return this.Method_23259();
    }
}

