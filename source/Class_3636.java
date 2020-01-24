/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.commons.lang3.Validate;

public class Class_3636
extends Class_3644 {
    private Object Field_3637;
    private final Object Field_3638;

    public Object Method_3639(Object object) {
        Object object2 = super.Method_3650(object);
        return object2 == null ? this.Field_3637 : object2;
    }

    public void Method_3640() {
        Validate.notNull((Object)this.Field_3638);
    }

    public Object Method_3641(int n) {
        Object object = super.Method_3653(n);
        return object == null ? this.Field_3637 : object;
    }

    public Class_3636(Object object) {
        this.Field_3638 = object;
    }

    private void Method_3642() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_3643(int n, Object object, Object object2) {
        if (this.Field_3638.equals(object)) {
            this.Field_3637 = object2;
        }
        super.Method_3649(n, object, object2);
    }
}

