/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_31023
implements Callable {
    final int Field_31024;
    final Class_17665 Field_31025;
    final int Field_31026;
    final int Field_31027;

    Class_31023(Class_17665 class_17665, int n, int n2, int n3) {
        this.Field_31025 = class_17665;
        this.Field_31026 = n;
        this.Field_31027 = n2;
        this.Field_31024 = n3;
    }

    public Object Method_31028() {
        return this.Method_31030();
    }

    private void Method_31029() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_31030() {
        return Class_13220.Method_13237(new Class_4751(this.Field_31025.Field_17666 * (29712 & -32684) + this.Field_31026, this.Field_31027, this.Field_31025.Field_17668 * (-32589 & 348) + this.Field_31024));
    }
}

