/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26599 {
    private int Field_26600;
    private String Field_26601;
    private Class_18480[] Field_26602;

    public Class_18480[] Method_26603() {
        return this.Field_26602;
    }

    private void Method_26604() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_26599(String string, Class_18480[] arrclass_18480, int n) {
        this.Field_26601 = string;
        this.Field_26602 = arrclass_18480;
        this.Field_26600 = n;
    }

    public int Method_26605() {
        return this.Field_26600;
    }
}

