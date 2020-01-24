/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43228
implements Class_21832 {
    final int Field_43229;
    final Object Field_43230;
    final Class_40426 Field_43231;
    final Class_26095 Field_43232;
    final Class_12364 Field_43233;

    private void Method_43234() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_43235(Class_27581 class_27581) {
        if (!class_27581.isSuccess()) {
            Class_40426.Method_40440((Class_27921)this.Field_43230);
            this.Field_43233.Method_12368(class_27581.cause());
        } else {
            this.Field_43233.Method_12369(this.Field_43229);
            if (this.Field_43232.Method_26104()) {
                this.Field_43231.Method_40441();
            }
        }
    }

    Class_43228(Class_40426 class_40426, Object object, Class_12364 class_12364, int n, Class_26095 class_26095) {
        this.Field_43231 = class_40426;
        this.Field_43230 = object;
        this.Field_43233 = class_12364;
        this.Field_43229 = n;
        this.Field_43232 = class_26095;
    }

    public void Method_43236(Class_21065 class_21065) {
        this.Method_43235((Class_27581)class_21065);
    }
}

