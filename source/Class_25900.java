/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_25900
implements Class_1486 {
    private Class_8752 Field_25901;

    private void Method_25902() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_25903(Class_29900 class_29900) {
        this.Field_25901 = (Class_8752)class_29900.Method_30009(Class_8752.class);
    }

    public Class_25900() {
    }

    public void Method_25904(Class_29900 class_29900) {
        class_29900.Method_29964(this.Field_25901);
    }

    public void Method_25905(Class_10930 class_10930) {
        class_10930.Method_10936(this);
    }

    public void Method_25906(Class_10954 class_10954) {
        this.Method_25905((Class_10930)class_10954);
    }

    public Class_25900(Class_8752 class_8752) {
        this.Field_25901 = class_8752;
    }

    public Class_8752 Method_25907() {
        return this.Field_25901;
    }
}

