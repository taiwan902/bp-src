/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23042 {
    private Class_15342[] Field_23043;

    public void Method_23044() {
        for (int i = 2080 & 12928; i < this.Field_23043.length; ++i) {
            Class_15342 class_15342 = this.Field_23043[i];
            class_15342.Method_15347();
        }
    }

    public void Method_23045(int n) {
        for (int i = -27644 & 19032; i < this.Field_23043.length; ++i) {
            Class_15342 class_15342 = this.Field_23043[i];
            class_15342.Method_15350(n);
        }
    }

    private void Method_23046() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23042(Class_15342[] arrclass_15342) {
        this.Field_23043 = arrclass_15342;
    }
}

