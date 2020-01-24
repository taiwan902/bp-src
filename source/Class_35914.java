/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35914
implements Class_1486 {
    public int Field_35915;
    public int Field_35916;
    public Class_23823 Field_35917;

    public int Method_35918() {
        return this.Field_35916;
    }

    public Class_35914(int n, int n2, Class_23823 class_23823) {
        this.Field_35915 = n;
        this.Field_35916 = n2;
        this.Field_35917 = class_23823 == null ? null : class_23823.Method_23850();
    }

    private void Method_35919() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_35920(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_35915);
        class_29900.Method_29922(this.Field_35916);
        class_29900.Method_29984(this.Field_35917);
    }

    public Class_35914() {
    }

    public void Method_35921(Class_29900 class_29900) {
        this.Field_35915 = class_29900.Method_29944();
        this.Field_35916 = class_29900.Method_30008();
        this.Field_35917 = class_29900.Method_30002();
    }

    public void Method_35922(Class_10954 class_10954) {
        this.Method_35923((Class_14856)class_10954);
    }

    public void Method_35923(Class_14856 class_14856) {
        class_14856.Method_14903(this);
    }

    public int Method_35924() {
        return this.Field_35915;
    }

    public Class_23823 Method_35925() {
        return this.Field_35917;
    }
}

