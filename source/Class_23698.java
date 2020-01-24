/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23698
implements Class_1486 {
    private Class_26801 Field_23699;
    private boolean Field_23700;

    public void Method_23701(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_23699.Method_26822());
    }

    private void Method_23702() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_23703(Class_14856 class_14856) {
        class_14856.Method_14900(this);
    }

    public Class_23698() {
    }

    public void Method_23704(Class_10954 class_10954) {
        this.Method_23703((Class_14856)class_10954);
    }

    public void Method_23705(Class_29900 class_29900) {
        this.Field_23699 = Class_26801.Method_26817(class_29900.Method_30016());
    }

    public boolean Method_23706() {
        return this.Field_23700;
    }

    public Class_26801 Method_23707() {
        return this.Field_23699;
    }

    public Class_23698(Class_26801 class_26801, boolean bl) {
        this.Field_23699 = class_26801;
        this.Field_23700 = bl;
    }
}

