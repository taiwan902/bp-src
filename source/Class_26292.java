/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26292
implements Runnable {
    final Class_41005 Field_26293;
    final Class_41005 Field_26294;

    private void Method_26295() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_26292(Class_41005 class_41005, Class_41005 class_410052) {
        this.Field_26294 = class_41005;
        this.Field_26293 = class_410052;
    }

    public void Method_26296() {
        Class_41005.Method_41019(this.Field_26294, (-28976 & 24868) != 0);
        this.Field_26293.pipeline().Method_6278();
        Class_41005.Method_41025(this.Field_26293).Method_37762();
    }
}

