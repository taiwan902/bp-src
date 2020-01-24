/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23438
extends Class_14944 {
    private final Class_11214 Field_23439;
    private final float Field_23440;
    private final float Field_23441;
    private final float Field_23442;

    public float Method_23443() {
        return this.Field_23442;
    }

    public Class_11214 Method_23444() {
        return this.Field_23439;
    }

    private void Method_23445() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public float Method_23446() {
        return this.Field_23440;
    }

    public float Method_23447() {
        return this.Field_23441;
    }

    public Class_23438(int n, String string, boolean bl, Class_11214 class_11214, float f, float f2, float f3) {
        super(n, string, bl);
        this.Field_23439 = class_11214;
        this.Field_23441 = f;
        this.Field_23442 = f2;
        this.Field_23440 = f3;
    }
}

