/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15619
implements Runnable {
    final Class_1486 Field_15620;
    final Class_18600[] Field_15621;
    final Class_11271 Field_15622;
    final Class_44584 Field_15623;
    final Class_11271 Field_15624;

    private void Method_15625() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_15619(Class_44584 class_44584, Class_11271 class_11271, Class_11271 class_112712, Class_1486 class_1486, Class_18600[] arrclass_18600) {
        this.Field_15623 = class_44584;
        this.Field_15622 = class_11271;
        this.Field_15624 = class_112712;
        this.Field_15620 = class_1486;
        this.Field_15621 = arrclass_18600;
    }

    public void Method_15626() {
        if (this.Field_15622 != this.Field_15624) {
            this.Field_15623.Method_44607(this.Field_15622);
        }
        Class_27581 class_27581 = this.Field_15623.Field_44590.Method_26096(this.Field_15620);
        if (this.Field_15621 != null) {
            class_27581.Method_27587(this.Field_15621);
        }
        class_27581.Method_27583(Class_21832.Field_21833);
    }
}

