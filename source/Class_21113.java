/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 */
import com.google.common.cache.CacheLoader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21113
extends CacheLoader {
    private final Class_283 Field_21114;
    private final boolean Field_21115;

    private void Method_21116() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_7692 Method_21117(Class_4751 class_4751) {
        return new Class_7692(this.Field_21114, class_4751, this.Field_21115);
    }

    public Class_21113(Class_283 class_283, boolean bl) {
        this.Field_21114 = class_283;
        this.Field_21115 = bl;
    }

    public Object Method_21118(Object object) {
        return this.Method_21117((Class_4751)object);
    }
}

