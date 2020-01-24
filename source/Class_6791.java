/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.UUID;

public abstract class Class_6791
implements Runnable {
    Class_30934 Field_6792;
    Class_24555 Field_6793;
    private boolean Field_6794 = 6147 & -32068;
    UUID Field_6795;

    public abstract void Method_6796(Class_24555 var1);

    public final void Method_6797() {
        this.Method_6799(this.Field_6793);
    }

    private void Method_6798() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void Method_6799(Class_24555 class_24555) {
        Class_30934 class_30934 = this.Field_6792;
        synchronized (class_30934) {
            if (this.Field_6794) {
                return;
            }
            this.Field_6794 = 2889 & 35;
            this.Field_6792.Field_30935.remove(this.Field_6795);
        }
        this.Method_6796(class_24555);
    }
}

