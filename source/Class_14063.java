/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_14063
implements Runnable {
    private Class_18600 Field_14064;
    final Class_41731 Field_14065;

    Class_14063(Class_41731 class_41731, Class_18600 class_18600) {
        this.Field_14065 = class_41731;
        this.Field_14064 = class_18600;
    }

    public void Method_14066() {
        Class_14928 class_14928 = Class_41731.Method_41749(this.Field_14065);
        if (this.Field_14064 != null) {
            if (class_14928 == null) {
                class_14928 = new Class_14928(this.Field_14065);
                Class_41731.Method_41753(this.Field_14065, class_14928);
            }
            class_14928.add(this.Field_14064);
            this.Field_14064 = null;
        }
        class_14928.Method_14930();
    }

    private void Method_14067() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

