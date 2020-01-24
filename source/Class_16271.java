/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_16271 {
    private boolean Field_16272 = 536 & 1414;
    private Class_13000[] Field_16273 = new Class_13000[8192 & 20638];

    public void Method_16274(boolean bl) {
        this.Field_16272 = bl;
    }

    public void Method_16275(Class_13000 class_13000) {
        this.Field_16273 = (Class_13000[])Class_19426.Method_19469(this.Field_16273, class_13000);
    }

    public void Method_16276(Class_35973 class_35973, Class_1456 class_1456, float f, float f2) {
        if (this.Field_16272) {
            for (int i = 4163 & 3996; i < this.Field_16273.length; ++i) {
                Class_13000 class_13000 = this.Field_16273[i];
                class_13000.Method_13010(class_35973, class_1456, f, f2);
            }
        }
    }

    private void Method_16277() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

