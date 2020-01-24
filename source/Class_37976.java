/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37976
implements Class_22092 {
    private Class_35389 Field_37977;
    private Class_13745[] Field_37978;

    public Class_37976(Class_35389 class_35389, Class_13745[] arrclass_13745) {
        this.Field_37977 = class_35389;
        this.Field_37978 = arrclass_13745;
    }

    private void Method_37979() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_18434 Method_37980() {
        return Class_18434.Field_18436;
    }

    public boolean Method_37981() {
        return this.Field_37977.Method_35551(this.Field_37978);
    }

    public String Method_37982() {
        return "" + (Object)((Object)this.Field_37977) + "()";
    }
}

