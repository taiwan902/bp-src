/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_18181
implements Callable {
    final Class_23823 Field_18182;
    final Class_44252 Field_18183;

    public String Method_18184() {
        return String.valueOf(this.Field_18182.Method_23874());
    }

    Class_18181(Class_44252 class_44252, Class_23823 class_23823) {
        this.Field_18183 = class_44252;
        this.Field_18182 = class_23823;
    }

    private void Method_18185() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_18186() {
        return this.Method_18184();
    }
}

