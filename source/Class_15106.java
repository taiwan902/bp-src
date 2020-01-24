/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15106 {
    private final Class_1782 Field_15107;
    private final String Field_15108;
    private final int Field_15109;
    private final int Field_15110;

    public Class_1782 Method_15111() {
        return this.Field_15107;
    }

    public int Method_15112() {
        return this.Field_15109;
    }

    private void Method_15113() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_15114() {
        return this.Field_15108;
    }

    public Class_15106(int n, Class_1782 class_1782, int n2) {
        this.Field_15107 = class_1782;
        this.Field_15110 = n;
        this.Field_15109 = n2;
        this.Field_15108 = this.Field_15107.Method_1783();
    }

    public int Method_15115() {
        return this.Field_15110;
    }
}

