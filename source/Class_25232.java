/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.Callable;

public class Class_25232
implements Callable {
    final Class_2457 Field_25233;

    public String Method_25234() {
        return Class_2457.Method_2630(this.Field_25233).Method_3092() + " / " + Class_2457.Method_2630(this.Field_25233).Method_3114() + "; " + Class_2457.Method_2630(this.Field_25233).Method_3124();
    }

    public Object Method_25235() {
        return this.Method_25234();
    }

    Class_25232(Class_2457 class_2457) {
        this.Field_25233 = class_2457;
    }

    private void Method_25236() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

