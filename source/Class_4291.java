/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public abstract class Class_4291 {
    private final boolean Field_4292;

    protected void Method_4293(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (this.Field_4292) {
            class_283.Method_462(class_4751, class_3436, 403 & 14343);
        } else {
            class_283.Method_462(class_4751, class_3436, -16222 & 8450);
        }
    }

    private void Method_4294() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4291(boolean bl) {
        this.Field_4292 = bl;
    }

    public Class_4291() {
        this((3844 & 16416) != 0);
    }

    public void Method_4295() {
    }

    public abstract boolean Method_4296(Class_283 var1, Random var2, Class_4751 var3);
}

