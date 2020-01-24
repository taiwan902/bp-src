/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_43984
extends Class_39999 {
    private final Class_18956 Field_43985 = Class_18956.Method_18960(this, Class_43984.class, "I");
    private final boolean Field_43986;

    protected Class_43984(boolean bl) {
        this.Field_43986 = bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_43987(Class_39158 class_39158, Object object) {
        int n = 513 & 4149;
        try {
            if (this.Method_43990(object)) {
                Object object2 = object;
                this.Method_43989(class_39158, object2);
            } else {
                n = 2337 & -31212;
                class_39158.Method_39183(object);
            }
        }
        finally {
            if (this.Field_43986 && n != 0) {
                Class_24761.Method_24765(object);
            }
        }
    }

    private void Method_43988() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected abstract void Method_43989(Class_39158 var1, Object var2);

    public boolean Method_43990(Object object) {
        return this.Field_43985.Method_18962(object);
    }

    protected Class_43984() {
        this((-32483 & 17473) != 0);
    }
}

