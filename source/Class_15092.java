/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_15092
extends Class_3238 {
    private final boolean Field_15093;

    public Class_1956 Method_15094(Class_3436 class_3436, Random random, int n) {
        return Class_1956.Method_1981(Class_9265.Field_9316);
    }

    public Class_1956 Method_15095(Class_283 class_283, Class_4751 class_4751) {
        return Class_1956.Method_1981(Class_9265.Field_9316);
    }

    public void Method_15096(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (!class_283.Field_306 && this.Field_15093 && !class_283.Method_414(class_4751)) {
            class_283.Method_462(class_4751, Class_9265.Field_9316.Method_3293(), 2070 & 5571);
        }
    }

    protected Class_23823 Method_15097(Class_3436 class_3436) {
        return new Class_23823(Class_9265.Field_9316);
    }

    public void Method_15098(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!class_283.Field_306) {
            if (this.Field_15093 && !class_283.Method_414(class_4751)) {
                class_283.Method_462(class_4751, Class_9265.Field_9316.Method_3293(), 13314 & 819);
            } else if (!this.Field_15093 && class_283.Method_414(class_4751)) {
                class_283.Method_462(class_4751, Class_9265.Field_9355.Method_3293(), 26 & -4893);
            }
        }
    }

    public Class_15092(boolean bl) {
        super(Class_3713.Field_3754);
        this.Field_15093 = bl;
        if (bl) {
            this.\u0000, `(1.0f);
        }
    }

    public void Method_15099(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!class_283.Field_306) {
            if (this.Field_15093 && !class_283.Method_414(class_4751)) {
                class_283.Method_441(class_4751, this, -25596 & 8909);
            } else if (!this.Field_15093 && class_283.Method_414(class_4751)) {
                class_283.Method_462(class_4751, Class_9265.Field_9355.Method_3293(), 18734 & -24574);
            }
        }
    }

    private void Method_15100() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

