/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31871
extends Class_26535 {
    public int Field_31872;
    public int Field_31873;
    public Class Field_31874;

    public String Method_31875() {
        return this.Field_31874.getSimpleName() + "*(" + this.Field_31872 + "-" + this.Field_31873 + "):" + this.\u0000, `;
    }

    private void Method_31876() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_31871(Class class_, int n, int n2, int n3) {
        super(n);
        this.Field_31874 = class_;
        this.Field_31872 = n2;
        this.Field_31873 = n3;
    }
}

