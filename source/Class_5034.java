/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_5034
extends Class_2804 {
    private final Object Field_5035;

    public Class_5034(Object object) {
        this.Field_5035 = object;
    }

    private void Method_5036() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_5037(Object object) {
        Object object2 = super.Method_2809(object);
        return object2 == null ? this.Field_5035 : object2;
    }
}

