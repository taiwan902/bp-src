/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteOrder;

public class Class_27606
extends Class_13461 {
    public final Class_22553 Field_27607;

    public byte Method_27608() {
        return this.Field_27607.Method_22555();
    }

    private void Method_27609() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_27610() {
        return this.Field_27607.Method_22572();
    }

    public short Method_27611() {
        return this.Field_27607.Method_22633();
    }

    public Class_27606(Class_22553 class_22553) {
        this.Field_27607 = class_22553.Method_22586(ByteOrder.LITTLE_ENDIAN);
    }

    public int Method_27612() {
        return this.Field_27607.Method_22640();
    }
}

