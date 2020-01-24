/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_6070 {
    private float Field_6071 = 0.0f;
    private Class_31961 Field_6072 = null;
    private int Field_6073 = 544 & -26344;

    private void Method_6074() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_6070(int n, float f, Class_31961 class_31961) {
        this.Field_6073 = n;
        this.Field_6071 = f;
        this.Field_6072 = class_31961;
    }

    public void Method_6075(Class_35973 class_35973, float f) {
        Class_31961 class_31961 = Class_13000.Method_13013(class_35973, this.Field_6073);
        if (class_31961 != null) {
            class_31961.Method_31996(f);
        }
        this.Field_6072.Method_31999(f * this.Field_6071);
    }
}

