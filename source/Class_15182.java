/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15182 {
    private Class_16635 Field_15183;
    private Class_6176 Field_15184;

    private void Method_15185() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_16635 Method_15186() {
        if (this.Field_15183 == null) {
            this.Field_15183 = new Class_16635(this.Field_15184, null, 5705 & 422);
        }
        return this.Field_15183;
    }

    public void Method_15187(Class_6176 class_6176) {
        this.Field_15184 = class_6176;
        this.Field_15183 = null;
    }
}

