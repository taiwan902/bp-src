/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21351
implements Class_1486 {
    private int Field_21352;
    private Class_4751 Field_21353;

    public void Method_21354(Class_14856 class_14856) {
        class_14856.Method_14896(this);
    }

    public void Method_21355(Class_29900 class_29900) {
        this.Field_21352 = class_29900.Method_30004();
        this.Field_21353 = class_29900.Method_29910();
    }

    public void Method_21356(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_21352);
        class_29900.Method_29996(this.Field_21353);
    }

    private void Method_21357() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_21351(Class_626 class_626, Class_4751 class_4751) {
        this.Field_21352 = class_626.\u0000, `();
        this.Field_21353 = class_4751;
    }

    public Class_626 Method_21358(Class_283 class_283) {
        return (Class_626)class_283.Method_343(this.Field_21352);
    }

    public void Method_21359(Class_10954 class_10954) {
        this.Method_21354((Class_14856)class_10954);
    }

    public Class_4751 Method_21360() {
        return this.Field_21353;
    }

    public Class_21351() {
    }
}

