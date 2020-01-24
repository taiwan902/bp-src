/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_18690
implements Callable {
    final Class_2457 Field_18691;

    private void Method_18692() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_18690(Class_2457 class_2457) {
        this.Field_18691 = class_2457;
    }

    public String Method_18693() {
        return this.Field_18691.Field_2500.Field_2773 ? this.Field_18691.Field_2500.Method_2784() : "N/A (disabled)";
    }

    public Object Method_18694() {
        return this.Method_18693();
    }
}

