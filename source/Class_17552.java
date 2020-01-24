/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_17552
implements Class_14028 {
    final Class_44252 Field_17553;

    private void Method_17554() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_17552(Class_44252 class_44252) {
        this.Field_17553 = class_44252;
    }

    public Class_41302 Method_17555(Class_23823 class_23823) {
        return Class_4104.Method_4120(class_23823.Method_23843()) ? new Class_41302("bottle_splash", "inventory") : new Class_41302("bottle_drinkable", "inventory");
    }
}

