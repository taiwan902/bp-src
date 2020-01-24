/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33311
implements Class_1486 {
    private int Field_33312;
    private int Field_33313;

    public void Method_33314(Class_10954 class_10954) {
        this.Method_33318((Class_14856)class_10954);
    }

    public void Method_33315(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_33312);
        class_29900.Method_29949(this.Field_33313);
    }

    public int Method_33316() {
        return this.Field_33313;
    }

    public Class_33311() {
    }

    public Class_33311(int n, Class_25240 class_25240) {
        this.Field_33312 = n;
        this.Field_33313 = class_25240.Method_25253();
    }

    private void Method_33317() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33318(Class_14856 class_14856) {
        class_14856.Method_14912(this);
    }

    public int Method_33319() {
        return this.Field_33312;
    }

    public void Method_33320(Class_29900 class_29900) {
        this.Field_33312 = class_29900.Method_30004();
        this.Field_33313 = class_29900.Method_30016();
    }
}

