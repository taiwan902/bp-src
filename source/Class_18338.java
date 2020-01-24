/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_18338
implements Callable {
    final Class_31717 Field_18339;

    public String Method_18340() {
        Object[] arrobject = new Object[8574 & -28540];
        arrobject[-32767 & 8360] = Class_31717.Method_31817(this.Field_18339);
        arrobject[-32219 & 4353] = Class_31717.Method_31821(this.Field_18339);
        arrobject[9218 & -28110] = Class_31717.Method_31794(this.Field_18339);
        arrobject[-32429 & 2563] = Class_31717.Method_31762(this.Field_18339);
        return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", arrobject);
    }

    public Object Method_18341() {
        return this.Method_18340();
    }

    Class_18338(Class_31717 class_31717) {
        this.Field_18339 = class_31717;
    }

    private void Method_18342() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

