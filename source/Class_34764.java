/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34764
implements Class_1486 {
    private Class_11247 Field_34765;
    private String Field_34766;

    public void Method_34767(Class_29900 class_29900) {
        class_29900.Method_29960(this.Field_34766);
        class_29900.Method_29964(this.Field_34765);
    }

    public Class_34764(String string, Class_11247 class_11247) {
        if (string.length() > (24888 & -32726)) {
            string = string.substring(2568 & 20581, 18536 & 5294);
        }
        this.Field_34766 = string;
        this.Field_34765 = class_11247;
    }

    public void Method_34768(Class_29900 class_29900) {
        this.Field_34766 = class_29900.Method_29991(-14293 & 1836);
        this.Field_34765 = (Class_11247)class_29900.Method_30009(Class_11247.class);
    }

    private void Method_34769() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_34764() {
    }

    public void Method_34770(Class_10954 class_10954) {
        this.Method_34771((Class_10930)class_10954);
    }

    public void Method_34771(Class_10930 class_10930) {
        class_10930.Method_10952(this);
    }
}

