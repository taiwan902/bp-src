/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_14832
implements Callable {
    final Class_35869 Field_14833;

    public Object Method_14834() {
        return this.Method_14835();
    }

    public String Method_14835() {
        return this.Field_14833.Method_35888();
    }

    private void Method_14836() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_14832(Class_35869 class_35869) {
        this.Field_14833 = class_35869;
    }
}

