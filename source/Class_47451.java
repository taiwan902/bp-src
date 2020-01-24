/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public final class Class_47451
extends Class_46482 {
    final Class_45286 Field_47452;

    private void Method_47453() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_47451(Class_45286 class_45286) {
        this.Field_47452 = class_45286;
    }

    protected void Method_47454(Class_39158 class_39158, Object object, List list) {
        if (object instanceof Class_34657 && !Class_45286.Method_45293(this.Field_47452)) {
            Class_45286.Method_45296(this.Field_47452).offer(((Class_34657)object).Method_34659());
        }
        super.encode(class_39158, object, list);
        if (Class_45286.Method_45294(this.Field_47452) && object instanceof Class_44416) {
            Class_45286.Method_45295(this.Field_47452).incrementAndGet();
        }
    }

    Class_47451(Class_45286 class_45286, Class_34558 class_34558) {
        this(class_45286);
    }
}

