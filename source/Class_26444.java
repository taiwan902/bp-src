/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26444
implements Class_1486 {
    private Class_1782 Field_26445;

    public void Method_26446(Class_29900 class_29900) {
        class_29900.Method_29930(this.Field_26445);
    }

    public void Method_26447(Class_10954 class_10954) {
        this.Method_26450((Class_14856)class_10954);
    }

    public Class_26444() {
    }

    public void Method_26448(Class_29900 class_29900) {
        this.Field_26445 = class_29900.Method_30020();
    }

    private void Method_26449() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_26444(Class_1782 class_1782) {
        this.Field_26445 = class_1782;
    }

    public void Method_26450(Class_14856 class_14856) {
        class_14856.Method_14863(this);
    }

    public Class_1782 Method_26451() {
        return this.Field_26445;
    }
}

