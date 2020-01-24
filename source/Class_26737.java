/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26737
implements Runnable {
    final Class_19025 Field_26738;
    final Class_23000 Field_26739;

    private void Method_26740() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_26737(Class_19025 class_19025, Class_23000 class_23000) {
        this.Field_26738 = class_19025;
        this.Field_26739 = class_23000;
    }

    public void Method_26741() {
        Class_1061 class_1061;
        Class_570 class_570 = Class_18.Field_89.Field_72;
        if (class_570 != null && (class_1061 = class_570.Method_343(this.Field_26739.Field_23001)) != null && class_1061 instanceof Class_626) {
            Class_626 class_626 = (Class_626)class_1061;
            class_626.Field_666.Field_7225 = this.Field_26739.Field_23002.Field_22181;
            class_626.Field_678 = this.Field_26739.Field_23002;
        }
    }
}

