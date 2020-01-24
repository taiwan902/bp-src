/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_8813 {
    private final Class_14068 Field_8814;
    private final int Field_8815;
    private int Field_8816;
    private int Field_8817;

    public Class_8813(Class_14068 class_14068, int n, int n2) {
        this.Field_8814 = class_14068;
        this.Field_8817 = n;
        this.Field_8816 = n;
        this.Field_8815 = n2;
    }

    public int Method_8818() {
        return this.Field_8815;
    }

    private void Method_8819() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_8820() {
        return this.Field_8817;
    }

    public int Method_8821() {
        return this.Field_8816;
    }

    public void Method_8822(int n) {
        if (n < this.Field_8817) {
            this.Field_8817 = n;
        } else if (n > this.Field_8816) {
            this.Field_8816 = n;
        }
    }

    public Class_14068 Method_8823() {
        return this.Field_8814;
    }
}

