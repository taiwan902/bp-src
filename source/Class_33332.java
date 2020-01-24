/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33332
implements Runnable {
    final Class_10502 Field_33333;
    final Class_46470 Field_33334;
    final Class_18 Field_33335;

    public void Method_33336() {
        this.Field_33335.Method_218(this.Field_33334);
    }

    private void Method_33337() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_33332(Class_10502 class_10502, Class_18 class_18, Class_46470 class_46470) {
        this.Field_33333 = class_10502;
        this.Field_33335 = class_18;
        this.Field_33334 = class_46470;
    }
}

