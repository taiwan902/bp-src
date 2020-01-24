/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_32312
implements Callable {
    final Class_570 Field_32313;

    private void Method_32314() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_32315() {
        return this.Method_32316();
    }

    Class_32312(Class_570 class_570) {
        this.Field_32313 = class_570;
    }

    public String Method_32316() {
        return Class_570.Method_594(this.Field_32313).size() + " total; " + Class_570.Method_594(this.Field_32313).toString();
    }
}

