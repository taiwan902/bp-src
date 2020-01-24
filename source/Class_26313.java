/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26313
implements Class_1486 {
    private Class_3436 Field_26314;
    private Class_4751 Field_26315;

    public void Method_26316(Class_29900 class_29900) {
        class_29900.Method_29996(this.Field_26315);
        class_29900.Method_29982(Class_3238.Field_3280.Method_3672((Class_3677)this.Field_26314));
    }

    public Class_26313() {
    }

    public Class_3436 Method_26317() {
        return this.Field_26314;
    }

    public void Method_26318(Class_10954 class_10954) {
        this.Method_26321((Class_14856)class_10954);
    }

    public Class_4751 Method_26319() {
        return this.Field_26315;
    }

    private void Method_26320() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_26321(Class_14856 class_14856) {
        class_14856.Method_14878(this);
    }

    public Class_26313(Class_283 class_283, Class_4751 class_4751) {
        this.Field_26315 = class_4751;
        this.Field_26314 = class_283.Method_375(class_4751);
    }

    public void Method_26322(Class_29900 class_29900) {
        this.Field_26315 = class_29900.Method_29910();
        this.Field_26314 = Class_3238.Field_3280.Method_3675(class_29900.Method_30004());
    }
}

