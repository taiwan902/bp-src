/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_12364 {
    private long Field_12365;
    final Class_37748 Field_12366;
    final Object Field_12367;

    void Method_12368(Throwable throwable) {
        Class_24761.Method_24765(this.Field_12367);
        this.Field_12366.tryFailure(throwable);
    }

    Class_12364(Object object, Class_37748 class_37748) {
        this.Field_12367 = object;
        this.Field_12366 = class_37748;
    }

    void Method_12369(int n) {
        this.Field_12365 += (long)n;
        if (this.Field_12366 instanceof Class_45330) {
            ((Class_45330)this.Field_12366).tryProgress(this.Field_12365, -1L & -1L);
        }
    }

    void Method_12370() {
        if (this.Field_12366.isDone()) {
            return;
        }
        if (this.Field_12366 instanceof Class_45330) {
            ((Class_45330)this.Field_12366).tryProgress(this.Field_12365, this.Field_12365);
        }
        this.Field_12366.Method_37757();
    }

    private void Method_12371() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

