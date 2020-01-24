/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_8461 {
    public int Field_8462;
    public int Field_8463;
    public int Field_8464;
    public int Field_8465;

    public int Method_8466() {
        return this.Field_8462;
    }

    public Class_8461(int n, int n2, int n3, int n4) {
        this.Field_8463 = n;
        this.Field_8464 = n2;
        this.Field_8462 = n3;
        this.Field_8465 = n4;
    }

    public int Method_8467() {
        return this.Field_8464;
    }

    public int Method_8468() {
        return this.Field_8465;
    }

    private void Method_8469() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_8470(Class_36054 class_36054) {
        if (class_36054.Method_36057() >= this.Field_8463 && class_36054.Method_36059() >= this.Field_8464 && class_36054.Method_36057() < this.Field_8463 + this.Field_8465 && class_36054.Method_36059() < this.Field_8464 + this.Field_8462) {
            return (4245 & 9) != 0;
        }
        return (17100 & 272) != 0;
    }

    public int Method_8471() {
        return this.Field_8463;
    }
}

