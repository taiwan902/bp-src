/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteOrder;

public final class Class_41287
extends Class_31583 {
    private final Class_20340 Field_41288;

    public Class_22553 Method_41289(int n, int n2) {
        return new Class_41287(super.Method_31653(n, n2), this.Field_41288);
    }

    private void Method_41290() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_22553 Method_41291() {
        return new Class_41287(super.Method_31608(), this.Field_41288);
    }

    public Class_22553 Method_41292() {
        return new Class_41287(super.Method_31655(), this.Field_41288);
    }

    public Class_22553 Method_41293(ByteOrder byteOrder) {
        this.Field_41288.Method_20342();
        if (this.order() == byteOrder) {
            return this;
        }
        return new Class_41287(super.Method_31599(byteOrder), this.Field_41288);
    }

    Class_41287(Class_22553 class_22553, Class_20340 class_20340) {
        super(class_22553);
        this.Field_41288 = class_20340;
    }

    public boolean Method_41294() {
        boolean bl = super.Method_31644();
        if (bl) {
            this.Field_41288.Method_20341();
        }
        return bl;
    }
}

