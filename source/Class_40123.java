/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_40123
extends Class_33985 {
    private void Method_40124() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_40125() {
        return (18497 & -27615) != 0;
    }

    public int Method_40126(List list) {
        float f = 0.0f;
        for (Class_626 class_626 : list) {
            f += class_626.\u0000abstract() + class_626.Method_809();
        }
        if (list.size() > 0) {
            f /= (float)list.size();
        }
        return Class_13337.Method_13362(f);
    }

    public Class_40123(String string) {
        super(string);
    }

    public Class_43298 Method_40127() {
        return Class_43298.Field_43302;
    }
}

