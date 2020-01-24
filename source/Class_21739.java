/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21739
implements Runnable {
    final Class_41005 Field_21740;
    final Class_41005 Field_21741;

    Class_21739(Class_41005 class_41005, Class_41005 class_410052) {
        this.Field_21740 = class_41005;
        this.Field_21741 = class_410052;
    }

    private void Method_21742() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21743() {
        this.Field_21741.unsafe().Method_7320(this.Field_21740.unsafe().Method_7319());
    }
}

