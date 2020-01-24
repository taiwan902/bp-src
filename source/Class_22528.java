/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_22528
implements Class_1486 {
    private int Field_22529;
    private byte Field_22530;

    public void Method_22531(Class_14856 class_14856) {
        class_14856.Method_14923(this);
    }

    public Class_1061 Method_22532(Class_283 class_283) {
        return class_283.Method_343(this.Field_22529);
    }

    public Class_22528() {
    }

    public byte Method_22533() {
        return this.Field_22530;
    }

    public void Method_22534(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_22529);
        class_29900.Method_29949(this.Field_22530);
    }

    public Class_22528(Class_1061 class_1061, byte by) {
        this.Field_22529 = class_1061.Method_1311();
        this.Field_22530 = by;
    }

    public void Method_22535(Class_29900 class_29900) {
        this.Field_22529 = class_29900.Method_30004();
        this.Field_22530 = class_29900.Method_29944();
    }

    public void Method_22536(Class_10954 class_10954) {
        this.Method_22531((Class_14856)class_10954);
    }

    private void Method_22537() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

