/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_36292
extends Class_30024
implements Runnable {
    private int Field_36293;
    private Class_37748 Field_36294;
    private Object Field_36295;
    private Class_42469 Field_36296;

    private Class_36292(Class_22999 class_22999) {
        super(class_22999);
    }

    private void Method_36297() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_36298(Class_42469 class_42469, Object object, Class_37748 class_37748) {
        Class_42469.Method_42525(class_42469, object, class_37748);
    }

    Class_36292(Class_22999 class_22999, Class_15116 class_15116) {
        this(class_22999);
    }

    protected static void Method_36299(Class_36292 class_36292, Class_42469 class_42469, Object object, int n, Class_37748 class_37748) {
        class_36292.Field_36296 = class_42469;
        class_36292.Field_36295 = object;
        class_36292.Field_36294 = class_37748;
        class_36292.Field_36293 = n;
    }

    public Object Method_36300() {
        return this.Method_36302();
    }

    public final void Method_36301() {
        try {
            Class_18249 class_18249;
            if (this.Field_36293 > 0 && (class_18249 = Class_42469.Method_42540(this.Field_36296).Method_31325().Method_7321()) != null) {
                class_18249.Method_18283(this.Field_36293);
            }
            this.Method_36298(this.Field_36296, this.Field_36295, this.Field_36294);
        }
        finally {
            this.Field_36296 = null;
            this.Field_36295 = null;
            this.Field_36294 = null;
        }
    }

    public Runnable Method_36302() {
        return this;
    }
}

