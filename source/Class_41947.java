/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

@Class_17815
public abstract class Class_41947
extends Class_39999 {
    private static final Class_6113 Field_41948 = Class_10201.Method_10203(Class_41947.class);

    protected abstract void Method_41949(Class_26095 var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void Method_41950(Class_39158 class_39158) {
        Class_6274 class_6274 = class_39158.Method_39171();
        int n = 8385 & 2084;
        try {
            this.Method_41949(class_39158.Method_39175());
            class_6274.Method_6288(this);
            class_39158.Method_39166();
            n = 3877 & -16357;
        }
        catch (Throwable throwable) {
            Field_41948.Method_6127("Failed to initialize a channel. Closing: " + class_39158.Method_39175(), throwable);
        }
        finally {
            if (class_6274.Method_6291(this) != null) {
                class_6274.Method_6288(this);
            }
            if (n == 0) {
                class_39158.Method_39178();
            }
        }
    }

    private void Method_41951() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

