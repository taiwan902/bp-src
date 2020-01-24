/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30920
implements Class_1486 {
    private String Field_30921;
    private Class_43298 Field_30922;
    private String Field_30923;
    private int Field_30924;

    public int Method_30925() {
        return this.Field_30924;
    }

    public void Method_30926(Class_29900 class_29900) {
        this.Field_30923 = class_29900.Method_29991(20 & 3088);
        this.Field_30924 = class_29900.Method_29944();
        if (this.Field_30924 == 0 || this.Field_30924 == (5123 & 210)) {
            this.Field_30921 = class_29900.Method_29991(36 & 26155);
            this.Field_30922 = Class_43298.Method_43305(class_29900.Method_29991(4116 & 17944));
        }
    }

    public void Method_30927(Class_29900 class_29900) {
        class_29900.Method_29960(this.Field_30923);
        class_29900.Method_29949(this.Field_30924);
        if (this.Field_30924 == 0 || this.Field_30924 == (4290 & -32761)) {
            class_29900.Method_29960(this.Field_30921);
            class_29900.Method_29960(this.Field_30922.Method_43304());
        }
    }

    public Class_30920(Class_7873 class_7873, int n) {
        this.Field_30923 = class_7873.Method_7881();
        this.Field_30921 = class_7873.Method_7886();
        this.Field_30922 = class_7873.Method_7883().Method_27941();
        this.Field_30924 = n;
    }

    public String Method_30928() {
        return this.Field_30923;
    }

    public Class_43298 Method_30929() {
        return this.Field_30922;
    }

    public void Method_30930(Class_10954 class_10954) {
        this.Method_30931((Class_14856)class_10954);
    }

    public void Method_30931(Class_14856 class_14856) {
        class_14856.Method_14927(this);
    }

    public Class_30920() {
    }

    public String Method_30932() {
        return this.Field_30921;
    }

    private void Method_30933() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

