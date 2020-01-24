/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_7442
implements Callable {
    final Class_1061 Field_7443;

    public Object Method_7444() {
        return this.Method_7445();
    }

    Class_7442(Class_1061 class_1061) {
        this.Field_7443 = class_1061;
    }

    public String Method_7445() {
        return Class_15516.Method_15540(this.Field_7443) + " (" + this.Field_7443.getClass().getCanonicalName() + ")";
    }

    private void Method_7446() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

