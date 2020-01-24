/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30034
extends Exception {
    private final Object[] Field_30035;

    private void Method_30036() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_30034(String string, Object ... arrobject) {
        super(string);
        this.Field_30035 = arrobject;
    }

    public Object[] Method_30037() {
        return this.Field_30035;
    }
}

