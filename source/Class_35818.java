/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35818
implements Class_19352 {
    final Class_30282 Field_35819;

    private void Method_35820() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_35818(Class_30282 class_30282) {
        this.Field_35819 = class_30282;
    }

    public void Method_35821(Class_21065 class_21065) {
        if (Class_30282.Method_30302(this.Field_35819).incrementAndGet() == Class_30282.Method_30297(this.Field_35819).length) {
            Class_30282.Method_30289(this.Field_35819).Method_33154(null);
        }
    }
}

