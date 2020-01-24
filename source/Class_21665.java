/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;

public abstract class Class_21665
implements Runnable {
    int Field_21666;
    private boolean Field_21667 = -19134 & 172;
    Class_30934 Field_21668;
    Class_24929 Field_21669;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void Method_21670(Class_24929 class_24929) {
        Class_30934 class_30934 = this.Field_21668;
        synchronized (class_30934) {
            if (this.Field_21667) {
                return;
            }
            this.Field_21667 = 3585 & -16185;
            this.Field_21668.Field_30939.remove(this.Field_21666);
        }
        this.Method_21673(class_24929);
    }

    private void Method_21671() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final void Method_21672() {
        this.Method_21670(this.Field_21669);
    }

    public abstract void Method_21673(Class_24929 var1);
}

