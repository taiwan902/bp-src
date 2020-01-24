/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.URI;

public final class Class_23651
implements Class_21832 {
    final URI Field_23652;
    final Class_33149 Field_23653;

    Class_23651(URI uRI, Class_33149 class_33149) {
        this.Field_23652 = uRI;
        this.Field_23653 = class_33149;
    }

    private void Method_23654() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_23655(Class_27581 class_27581) {
        if (class_27581.isSuccess()) {
            String string = this.Field_23652.getRawPath() + (this.Field_23652.getRawQuery() == null ? "" : "?" + this.Field_23652.getRawQuery());
            Class_44024 class_44024 = new Class_44024(Class_18300.Field_18305, Class_16725.Field_16730, string);
            class_44024.headers().Method_17158("Host", this.Field_23652.getHost());
            class_27581.Method_27590().Method_26096(class_44024);
        } else {
            Class_31008.Method_31012().invalidate((Object)this.Field_23652.getHost());
            this.Field_23653.Method_33152(class_27581.cause());
        }
    }

    public void Method_23656(Class_21065 class_21065) {
        this.Method_23655((Class_27581)class_21065);
    }
}

