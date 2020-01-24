/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21873
implements Class_1486 {
    private int Field_21874;
    private Class_4595 Field_21875;
    private String Field_21876;
    private Class_4751 Field_21877;

    private void Method_21878() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21879(Class_29900 class_29900) {
        this.Field_21874 = class_29900.Method_30004();
        this.Field_21876 = class_29900.Method_29991(Class_13056.Field_13078);
        this.Field_21877 = class_29900.Method_29910();
        this.Field_21875 = Class_4595.Method_4628(class_29900.Method_30016());
    }

    public void Method_21880(Class_14856 class_14856) {
        class_14856.Method_14897(this);
    }

    public String Method_21881() {
        return this.Field_21876;
    }

    public void Method_21882(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_21874);
        class_29900.Method_29960(this.Field_21876);
        class_29900.Method_29996(this.Field_21877);
        class_29900.Method_29949(this.Field_21875.Method_4619());
    }

    public Class_21873() {
    }

    public void Method_21883(Class_10954 class_10954) {
        this.Method_21880((Class_14856)class_10954);
    }

    public Class_4595 Method_21884() {
        return this.Field_21875;
    }

    public int Method_21885() {
        return this.Field_21874;
    }

    public Class_4751 Method_21886() {
        return this.Field_21877;
    }

    public Class_21873(Class_30799 class_30799) {
        this.Field_21874 = class_30799.\u0000, `();
        this.Field_21877 = class_30799.\u0000, `();
        this.Field_21875 = class_30799.\u0000, `;
        this.Field_21876 = class_30799.Field_30800.Field_13068;
    }
}

