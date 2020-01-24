/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_40067
implements Callable {
    final Class_23823 Field_40068;
    final Class_44252 Field_40069;

    public String Method_40070() {
        return String.valueOf(this.Field_40068.Method_23843());
    }

    private void Method_40071() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_40072() {
        return this.Method_40070();
    }

    Class_40067(Class_44252 class_44252, Class_23823 class_23823) {
        this.Field_40069 = class_44252;
        this.Field_40068 = class_23823;
    }
}

