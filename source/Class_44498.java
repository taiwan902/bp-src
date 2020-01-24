/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_44498
extends Class_42469
implements Class_35822 {
    private static final String Field_44499 = Class_24814.Method_24868(Class_44498.class);

    public void Method_44500(Class_39158 class_39158) {
    }

    private void Method_44501() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_44502(Class_39158 class_39158) {
    }

    public void Method_44503(Class_39158 class_39158, Throwable throwable) {
        Class_24814.Field_24819.Method_6127("An exceptionCaught() event was fired, and it reached at the tail of the pipeline. It usually means the last handler in the pipeline did not handle the exception.", throwable);
    }

    public void Method_44504(Class_39158 class_39158, Object object) {
        try {
            Class_24814.Field_24819.Method_6114("Discarded inbound message {} that reached at the tail of the pipeline. Please check your pipeline configuration.", object);
        }
        finally {
            Class_24761.Method_24765(object);
        }
    }

    public void Method_44505(Class_39158 class_39158) {
    }

    public void Method_44506(Class_39158 class_39158) {
    }

    public void Method_44507(Class_39158 class_39158, Object object) {
    }

    public Class_31885 Method_44508() {
        return this;
    }

    public void Method_44509(Class_39158 class_39158) {
    }

    public void Method_44510(Class_39158 class_39158) {
    }

    Class_44498(Class_24814 class_24814) {
        super(class_24814, null, Field_44499, (16531 & 2125) != 0, (4198 & -16384) != 0);
    }

    public void Method_44511(Class_39158 class_39158) {
    }

    public void Method_44512(Class_39158 class_39158) {
    }
}

