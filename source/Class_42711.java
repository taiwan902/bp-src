/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42711
extends Class_42376 {
    private Class_13256 Field_42712;

    public void Method_42713(Class_18 class_18, int n, int n2) {
        this.Field_42712.Method_13266(n, n2);
    }

    public Class_13256 Method_42714() {
        return this.Field_42712;
    }

    public void Method_42715(int n, int n2) {
        this.Field_42712.Method_13262(n, n2);
    }

    private void Method_42716() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_42717(boolean bl) {
        return super.Method_42400(bl);
    }

    public int Method_42718(boolean bl) {
        return this.Field_42712.Method_13265(bl);
    }

    public int Method_42719() {
        return this.Field_42392;
    }

    public Class_42711(Class_13256 class_13256, int n, int n2, int n3, String string) {
        super(n, n2, n3, string);
        this.Field_42712 = class_13256;
    }

    public int Method_42720() {
        return super.Method_42395();
    }

    public boolean Method_42721(Class_18 class_18, int n, int n2) {
        if (super.Method_42404(class_18, n, n2)) {
            this.Field_42712.Method_13263(n, n2);
        }
        return super.Method_42404(class_18, n, n2);
    }
}

