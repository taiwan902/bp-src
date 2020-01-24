/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37207
implements Class_1486 {
    private Class_1782 Field_37208;
    private Class_1782 Field_37209;

    public Class_1782 Method_37210() {
        return this.Field_37209;
    }

    public void Method_37211(Class_29900 class_29900) {
        this.Field_37209 = class_29900.Method_30020();
        this.Field_37208 = class_29900.Method_30020();
    }

    public void Method_37212(Class_10954 class_10954) {
        this.Method_37216((Class_14856)class_10954);
    }

    private void Method_37213() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_37214(Class_29900 class_29900) {
        class_29900.Method_29930(this.Field_37209);
        class_29900.Method_29930(this.Field_37208);
    }

    public Class_1782 Method_37215() {
        return this.Field_37208;
    }

    public void Method_37216(Class_14856 class_14856) {
        class_14856.Method_14869(this);
    }
}

