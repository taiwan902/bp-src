/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_13997
implements Runnable {
    final Class_42469 Field_13998;
    final Class_24814 Field_13999;

    private void Method_14000() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_13997(Class_24814 class_24814, Class_42469 class_42469) {
        this.Field_13999 = class_24814;
        this.Field_13998 = class_42469;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_14001() {
        Class_24814 class_24814 = this.Field_13999;
        synchronized (class_24814) {
            this.Field_13999.Method_24846(this.Field_13998);
        }
    }
}

