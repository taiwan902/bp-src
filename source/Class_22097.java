/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_22097
implements Class_1486 {
    private int Field_22098;
    private float Field_22099;
    private int Field_22100;

    public void Method_22101(Class_10954 class_10954) {
        this.Method_22102((Class_14856)class_10954);
    }

    public void Method_22102(Class_14856 class_14856) {
        class_14856.Method_14877(this);
    }

    public float Method_22103() {
        return this.Field_22099;
    }

    public Class_22097() {
    }

    private void Method_22104() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_22105() {
        return this.Field_22100;
    }

    public int Method_22106() {
        return this.Field_22098;
    }

    public void Method_22107(Class_29900 class_29900) {
        class_29900.Method_29939(this.Field_22099);
        class_29900.Method_29982(this.Field_22098);
        class_29900.Method_29982(this.Field_22100);
    }

    public Class_22097(float f, int n, int n2) {
        this.Field_22099 = f;
        this.Field_22100 = n;
        this.Field_22098 = n2;
    }

    public void Method_22108(Class_29900 class_29900) {
        this.Field_22099 = class_29900.Method_29966();
        this.Field_22098 = class_29900.Method_30004();
        this.Field_22100 = class_29900.Method_30004();
    }
}

