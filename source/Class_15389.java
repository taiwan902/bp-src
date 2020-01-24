/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_15389
implements Callable {
    final Class_7961 Field_15390;
    final int Field_15391;

    public String Method_15392() {
        String string = "Once per " + this.Field_15391 + " ticks";
        if (this.Field_15391 == (-1 & Integer.MAX_VALUE)) {
            string = "Maximum (" + string + ")";
        }
        return string;
    }

    Class_15389(Class_7961 class_7961, int n) {
        this.Field_15390 = class_7961;
        this.Field_15391 = n;
    }

    private void Method_15393() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_15394() {
        return this.Method_15392();
    }
}

