/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23448
implements Class_1486 {
    private int Field_23449;
    private Class_23823 Field_23450;
    private int Field_23451;

    private void Method_23452() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_23453() {
        return this.Field_23449;
    }

    public Class_23448() {
    }

    public void Method_23454(Class_10954 class_10954) {
        this.Method_23457((Class_14856)class_10954);
    }

    public int Method_23455() {
        return this.Field_23451;
    }

    public Class_23823 Method_23456() {
        return this.Field_23450;
    }

    public void Method_23457(Class_14856 class_14856) {
        class_14856.Method_14915(this);
    }

    public void Method_23458(Class_29900 class_29900) {
        this.Field_23449 = class_29900.Method_30004();
        this.Field_23451 = class_29900.Method_30008();
        this.Field_23450 = class_29900.Method_30002();
    }

    public Class_23448(int n, int n2, Class_23823 class_23823) {
        this.Field_23449 = n;
        this.Field_23451 = n2;
        this.Field_23450 = class_23823 == null ? null : class_23823.Method_23850();
    }

    public void Method_23459(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_23449);
        class_29900.Method_29922(this.Field_23451);
        class_29900.Method_29984(this.Field_23450);
    }
}

