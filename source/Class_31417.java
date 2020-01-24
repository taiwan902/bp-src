/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31417
implements Class_18600 {
    final Class_39158 Field_31418;
    final Class_47372 Field_31419;

    Class_31417(Class_47372 class_47372, Class_39158 class_39158) {
        this.Field_31419 = class_47372;
        this.Field_31418 = class_39158;
    }

    public void Method_31420(Class_21065 class_21065) {
        if (!class_21065.Method_21070()) {
            Class_47372.Method_47412().Method_6116("Failed to complete handshake", class_21065.Method_21066());
            this.Field_31418.Method_39178();
        }
    }

    private void Method_31421() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

