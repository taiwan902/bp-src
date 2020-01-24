/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_11721
implements Callable {
    final int Field_11722;
    final int Field_11723;
    final int Field_11724;
    final Class_17665 Field_11725;

    Class_11721(Class_17665 class_17665, int n, int n2, int n3) {
        this.Field_11725 = class_17665;
        this.Field_11723 = n;
        this.Field_11722 = n2;
        this.Field_11724 = n3;
    }

    private void Method_11726() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_11727() {
        return Class_13220.Method_13236(this.Field_11723, this.Field_11722, this.Field_11724);
    }

    public Object Method_11728() {
        return this.Method_11727();
    }
}

