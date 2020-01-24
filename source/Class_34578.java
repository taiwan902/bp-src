/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34578
implements Class_1486 {
    private int Field_34579;
    private int Field_34580;
    private int Field_34581;

    public int Method_34582() {
        return this.Field_34581;
    }

    public void Method_34583(Class_29900 class_29900) {
        class_29900.Method_30010(this.Field_34580);
        class_29900.Method_30010(this.Field_34579);
        class_29900.Method_29949(this.Field_34581);
    }

    private void Method_34584() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_34585(Class_29900 class_29900) {
        this.Field_34580 = class_29900.Method_29914();
        this.Field_34579 = class_29900.Method_29914();
        this.Field_34581 = class_29900.Method_30016();
    }

    public Class_34578(int n, Class_1061 class_1061, Class_1061 class_10612) {
        this.Field_34581 = n;
        this.Field_34580 = class_1061.Method_1311();
        this.Field_34579 = class_10612 != null ? class_10612.Method_1311() : -1 & -1;
    }

    public void Method_34586(Class_10954 class_10954) {
        this.Method_34588((Class_14856)class_10954);
    }

    public int Method_34587() {
        return this.Field_34579;
    }

    public void Method_34588(Class_14856 class_14856) {
        class_14856.Method_14895(this);
    }

    public Class_34578() {
    }

    public int Method_34589() {
        return this.Field_34580;
    }
}

