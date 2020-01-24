/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_8000
implements Callable {
    final Class_18 Field_8001;

    public String Method_8002() {
        return this.Field_8001.Field_36.getClass().getCanonicalName();
    }

    public Object Method_8003() {
        return this.Method_8002();
    }

    private void Method_8004() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_8000(Class_18 class_18) {
        this.Field_8001 = class_18;
    }
}

