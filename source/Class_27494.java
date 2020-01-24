/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27494
implements Class_1486 {
    private Class_1782 Field_27495;

    public void Method_27496(Class_29900 class_29900) {
        this.Field_27495 = class_29900.Method_30020();
    }

    public void Method_27497(Class_17034 class_17034) {
        class_17034.Method_17038(this);
    }

    private void Method_27498() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27499(Class_29900 class_29900) {
        class_29900.Method_29930(this.Field_27495);
    }

    public Class_27494(Class_1782 class_1782) {
        this.Field_27495 = class_1782;
    }

    public Class_1782 Method_27500() {
        return this.Field_27495;
    }

    public Class_27494() {
    }

    public void Method_27501(Class_10954 class_10954) {
        this.Method_27497((Class_17034)class_10954);
    }
}

