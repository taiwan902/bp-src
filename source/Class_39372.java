/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_39372
implements Class_2045 {
    private final Class_36433 Field_39373;
    private Class_2801 Field_39374;
    private Class_31211 Field_39375;
    private final Class_24069 Field_39376;

    public void Method_39377(Class_279 class_279) {
        Class_11777 class_11777 = new Class_11777(class_279, this.Field_39376, this.Field_39373);
        this.Field_39374 = class_11777.Method_11832();
        this.Field_39375 = (Class_31211)this.Field_39374.Method_2802(Class_11777.Field_11781);
        this.Field_39373.Method_36441();
    }

    private void Method_39378() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_31211 Method_39379() {
        return this.Field_39375;
    }

    public Class_31211 Method_39380(Class_41302 class_41302) {
        if (class_41302 == null) {
            return this.Field_39375;
        }
        Class_31211 class_31211 = (Class_31211)this.Field_39374.Method_2802(class_41302);
        return class_31211 == null ? this.Field_39375 : class_31211;
    }

    public Class_39372(Class_24069 class_24069) {
        this.Field_39376 = class_24069;
        this.Field_39373 = new Class_36433(this);
    }

    public Class_36433 Method_39381() {
        return this.Field_39373;
    }

    public Class_24069 Method_39382() {
        return this.Field_39376;
    }
}

