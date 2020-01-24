/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36280
implements Class_1486 {
    private int Field_36281;
    private int Field_36282;
    private String Field_36283;
    private Class_11271 Field_36284;

    public void Method_36285(Class_10954 class_10954) {
        this.Method_36290((Class_20603)class_10954);
    }

    public void Method_36286(Class_29900 class_29900) {
        this.Field_36282 = class_29900.Method_30004();
        this.Field_36283 = class_29900.Method_29991(255 & -32513);
        this.Field_36281 = class_29900.Method_29981();
        this.Field_36284 = Class_11271.Method_11300(class_29900.Method_30004());
    }

    public Class_11271 Method_36287() {
        return this.Field_36284;
    }

    private void Method_36288() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_36289() {
        return this.Field_36282;
    }

    public Class_36280() {
    }

    public void Method_36290(Class_20603 class_20603) {
        class_20603.Method_20604(this);
    }

    public void Method_36291(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_36282);
        class_29900.Method_29960(this.Field_36283);
        class_29900.Method_29922(this.Field_36281);
        class_29900.Method_29982(this.Field_36284.Method_11292());
    }

    public Class_36280(int n, String string, int n2, Class_11271 class_11271) {
        this.Field_36282 = n;
        this.Field_36283 = string;
        this.Field_36281 = n2;
        this.Field_36284 = class_11271;
    }
}

