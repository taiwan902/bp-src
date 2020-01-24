/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_14036
implements Callable {
    final Class_31717 Field_14037;

    Class_14036(Class_31717 class_31717) {
        this.Field_14037 = class_31717;
    }

    public Object Method_14038() {
        return this.Method_14039();
    }

    public String Method_14039() {
        Object[] arrobject = new Object[-32598 & 14098];
        arrobject[18052 & 10514] = Class_31717.Method_31841(this.Field_14037);
        arrobject[-32767 & 91] = Class_31717.Method_31769(this.Field_14037);
        return String.format("%d game time, %d day time", arrobject);
    }

    private void Method_14040() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

