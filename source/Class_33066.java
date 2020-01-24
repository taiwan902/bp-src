/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33066
implements Class_1486 {
    private Class_16437 Field_33067;
    private int Field_33068;
    private int Field_33069;

    public void Method_33070(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_33068);
        class_29900.Method_29964(this.Field_33067);
        class_29900.Method_29982(this.Field_33069);
    }

    private void Method_33071() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33072(Class_29900 class_29900) {
        this.Field_33068 = class_29900.Method_30004();
        this.Field_33067 = (Class_16437)class_29900.Method_30009(Class_16437.class);
        this.Field_33069 = class_29900.Method_30004();
    }

    public Class_16437 Method_33073() {
        return this.Field_33067;
    }

    public Class_33066() {
    }

    public int Method_33074() {
        return this.Field_33069;
    }

    public Class_33066(Class_1061 class_1061, Class_16437 class_16437) {
        this(class_1061, class_16437, 20733 & 8450);
    }

    public void Method_33075(Class_10930 class_10930) {
        class_10930.Method_10949(this);
    }

    public Class_33066(Class_1061 class_1061, Class_16437 class_16437, int n) {
        this.Field_33068 = class_1061.Method_1311();
        this.Field_33067 = class_16437;
        this.Field_33069 = n;
    }

    public void Method_33076(Class_10954 class_10954) {
        this.Method_33075((Class_10930)class_10954);
    }
}

