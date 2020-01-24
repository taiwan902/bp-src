/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37189
implements Class_36667 {
    private Class_35389 Field_37190;
    private Class_13745[] Field_37191;

    public float Method_37192() {
        return this.Field_37190.Method_35501(this.Field_37191);
    }

    private void Method_37193() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_37194() {
        return "" + (Object)((Object)this.Field_37190) + "()";
    }

    public Class_18434 Method_37195() {
        return Class_18434.Field_18437;
    }

    public Class_37189(Class_35389 class_35389, Class_13745[] arrclass_13745) {
        this.Field_37190 = class_35389;
        this.Field_37191 = arrclass_13745;
    }
}

