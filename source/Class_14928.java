/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayDeque;

public final class Class_14928
extends ArrayDeque
implements Runnable {
    final Class_41731 Field_14929;

    Class_14928(Class_41731 class_41731) {
        this.Field_14929 = class_41731;
        super(16707 & -31734);
    }

    public void Method_14930() {
        if (Class_41731.Method_41761(this.Field_14929) == null) {
            Class_18600 class_18600;
            while ((class_18600 = (Class_18600)this.poll()) != null) {
                Class_41731.Method_41744(this.Field_14929, class_18600);
            }
        } else {
            Class_41731.Method_41768(this.Field_14929.Method_41762(), this);
        }
    }

    private void Method_14931() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

