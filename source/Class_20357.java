/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_20357
implements Callable {
    final Class_31717 Field_20358;

    Class_20357(Class_31717 class_31717) {
        this.Field_20358 = class_31717;
    }

    public Object Method_20359() {
        return this.Method_20361();
    }

    private void Method_20360() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_20361() {
        Object[] arrobject = new Object[-30202 & 29988];
        arrobject[10517 & -31678] = Class_31717.Method_31789(this.Field_20358).Method_43789();
        arrobject[23373 & 1187] = Class_31717.Method_31789(this.Field_20358).Method_43785();
        arrobject[5387 & 16470] = Class_31717.Method_31789(this.Field_20358).Method_43786();
        arrobject[-32501 & 4103] = Class_31717.Method_31814(this.Field_20358);
        return String.format("ID %02d - %s, ver %d. Features enabled: %b", arrobject);
    }
}

