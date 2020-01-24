/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27470
implements Runnable {
    final Class_24814 Field_27471;
    final Class_42469 Field_27472;

    Class_27470(Class_24814 class_24814, Class_42469 class_42469) {
        this.Field_27471 = class_24814;
        this.Field_27472 = class_42469;
    }

    private void Method_27473() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27474() {
        Class_24814.Method_24866(this.Field_27471, this.Field_27472);
    }
}

