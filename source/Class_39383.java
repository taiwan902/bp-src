/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_39383
implements Class_1486 {
    private long Field_39384;

    public void Method_39385(Class_29900 class_29900) {
        this.Field_39384 = class_29900.Method_30001();
    }

    private void Method_39386() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_39387(Class_29900 class_29900) {
        class_29900.Method_29957(this.Field_39384);
    }

    public void Method_39388(Class_12113 class_12113) {
        class_12113.Method_12114(this);
    }

    public Class_39383() {
    }

    public Class_39383(long l) {
        this.Field_39384 = l;
    }

    public void Method_39389(Class_10954 class_10954) {
        this.Method_39388((Class_12113)class_10954);
    }
}

